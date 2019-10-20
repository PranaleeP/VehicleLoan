package com.lti.vehicleloan.beans;

import org.springframework.web.multipart.MultipartFile;

public class DocumentsUpload {

	private MultipartFile pic;

	public DocumentsUpload() {
		super();
	}

	public DocumentsUpload(MultipartFile pic) {
		super();
		this.pic = pic;
	}

	public MultipartFile getPic() {
		return pic;
	}

	public void setPic(MultipartFile pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "DocumentsUpload [pic=" + pic + "]";
	}
	
	
	
}
