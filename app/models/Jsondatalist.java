package models;

import java.io.Serializable;
import java.util.List;

public class Jsondatalist implements Serializable{
	
	private List<DataJson> jsonlist;

	public List<DataJson> getJsonlist() {
		return jsonlist;
	}

	public void setJsonlist(List<DataJson> jsonlist) {
		this.jsonlist = jsonlist;
	}
	

}
