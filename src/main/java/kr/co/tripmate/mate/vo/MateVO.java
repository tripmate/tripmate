package kr.co.tripmate.mate.vo;

import java.sql.Date;

public class MateVO {

	private int mate_no;
	private String writer;
	private String title;
	private String content;
	private Date regdate;
	private Date updatedate;
	
	public int getMate_no() {
		return mate_no;
	}
	
	public void setMate_no(int mate_no) {
		this.mate_no = mate_no;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public Date getUpdatedate() {
		return updatedate;
	}
	
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@Override
	public String toString() {
		return "MateVO [title = " + title + ", content: " + content + "]";
	}
	
}
