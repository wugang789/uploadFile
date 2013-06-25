package com.cn.uploadfileAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class uploadFileAction extends ActionSupport{
/**
	 * 
	 */
	private static final long serialVersionUID = 6106742874051068886L;
/**
 * 上传文件list集合
 */
	private List<File> upload; 
 /**
  * 上传文件名
  */
	private List<String> uploadFileName;
	/**
	 * 上传文件类型
	 */
	private List<String> uploadFileType;
	
	
	public List<File> getUpload() {
		return upload;
	}


	public void setUpload(List<File> upload) {
		this.upload = upload;
	}


	public List<String> getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}


	public List<String> getUploadFileType() {
		return uploadFileType;
	}


	public void setUploadFileType(List<String> uploadFileType) {
		this.uploadFileType = uploadFileType;
	}


	public String uploadFile(){
		InputStream is = null;
		OutputStream os = null;
		if(upload!=null){
			for(int i=0;i<upload.size();i++){
				
				try {
					is = new FileInputStream(upload.get(i));
					os=new FileOutputStream("D:\\uploads\\"+uploadFileName.get(i));
					byte[] by=new byte[8024];
					int num=0;
					while(((num=is.read(by))>0)){
						os.write(by, 0, num);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						is.close();
						os.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
						
				}
				
				}
			
			
		}
		return SUCCESS;
		
	}
	
	
	
	
}
