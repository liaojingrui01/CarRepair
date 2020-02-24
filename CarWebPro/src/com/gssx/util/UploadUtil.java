package com.gssx.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadUtil {
	private static final long serialVersionUID = 1L;
	// �ϴ��ļ��洢Ŀ¼
	private static final String UPLOAD_DIRECTORY = "uploadFile";

	//�ϴ����� �ƶ��ϴ��ļ� ��С�������С
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 200; // 200MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 1000; // 1000MB
	/**
	 * �ϴ����ݱ����ļ�
	 */
	public static HashMap upload(HttpServletRequest request) throws ServletException, IOException {
		// �����ϴ�����
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// �����ڴ��ٽ�ֵ - �����󽫲�����ʱ�ļ����洢����ʱĿ¼��
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		// ������ʱ�洢Ŀ¼
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		ServletFileUpload upload = new ServletFileUpload(factory);
		// ��������ļ��ϴ�ֵ
		upload.setFileSizeMax(MAX_FILE_SIZE);
		// �����������ֵ (�����ļ��ͱ�����)
		upload.setSizeMax(MAX_REQUEST_SIZE);
		// ���Ĵ���
		upload.setHeaderEncoding("UTF-8");
		// ���ö�ý���ļ�����
		HashMap<String, String> map = new HashMap<String, String>();
		// ������ʱ·�����洢�ϴ����ļ�
		// ���·����Ե�ǰӦ�õ�Ŀ¼
		String uploadPath = request.getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
		// ���Ŀ¼�������򴴽�
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		try {
			// ���������������ȡ�ļ�����
			List items = upload.parseRequest(request);
			Iterator iter = items.iterator();// ���������ύ����������
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				if (item.isFormField()) { // ����Ǳ��� �����Ƿ��ļ��ϴ�Ԫ��
					String value = item.getString("UTF-8"); // ��ȡvalue���Ե�ֵ��������Ҫָ��UTF-8��ʽ���������������������
					String name = item.getFieldName();
					map.put(name, value);
				} else {
					//��ȡ�ϴ��ļ� name ����
					String type = item.getFieldName();
					String fileName = new File(item.getName()).getName();
					//ָ�����ֵ��ļ�λ��
					String filePath = uploadPath +"/"+ fileName;
					File storeFile = new File(filePath);
					//�ڿ���̨����ļ����ϴ�·��
					System.out.println("�ļ���� �ľ���·��:"+filePath);
					//map.put(type, filePath);
					//�����ļ�����
					map.put(type, fileName);
					//�����ļ���Ӳ��(������)
					item.write(storeFile);
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//���� �ϴ��� �ļ������ƣ��ͱ�����
		return map;
	}
}