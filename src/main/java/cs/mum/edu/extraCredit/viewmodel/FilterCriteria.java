package cs.mum.edu.extraCredit.viewmodel;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class FilterCriteria {

	@NotNull(message = "Select a filter option")
	private String id;
	private String filter;
	
	@NotBlank(message = "Select a search term")
	private String text;
	
	public FilterCriteria(String id, String filter, String text) {
		this.id = id;
		this.filter = filter;
		this.text = text;
	}
	
	public FilterCriteria(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
