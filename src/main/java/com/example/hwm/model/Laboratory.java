package com.example.hwm.model;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lab")
public class Laboratory {
    private String _id;
	private String userId;
	private int systole;
	private int diastole;
	private String rb_sugar;
	private Object[] other_test;
    private String laboratory_created;
    private String laboratory_updated;

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLaboratoryCreated() {
		return laboratory_created;
	}

	public void setLaboratoryCreated(String laboratory_created) {
		this.laboratory_created = laboratory_created;
	}

    public String getLaboratoryUpdated() {
		return laboratory_updated;
	}

	public void setUpdatedAt(String laboratory_updated) {
		this.laboratory_updated = laboratory_updated;
	}

	public int getSystole() {
        return  systole;
    }

	public void setSystole(int systole) {
        this.systole = systole;
    }

	public int getDiastole() {
        return  diastole;
    }

	public void setDiastole (int diastole) { 
        this.diastole = diastole;
    }

	public String getRb_sugar() {
		return rb_sugar;
	}

	public  void  setRb_sugar(String rb_sugar) { 
        this.rb_sugar = rb_sugar;
    }
    
	public Object[] getOther_test() {
        return other_test;
    }
	public void setOther_test(Object[] other_test) {
        this.other_test = other_test;
    }

	public Laboratory(String _id, String userId, String laboratory_created, String laboratory_updated,int systole, int diastole, String rb_sugar, Object[] other_test) {
		this._id = _id;
		this.userId = userId;
		this.laboratory_created = laboratory_created;
        this.laboratory_updated = laboratory_updated;
		this.systole = systole;
		this.diastole = diastole;
		this.rb_sugar = rb_sugar;
		this.other_test = other_test;
	}

	public Laboratory() {
		super();
	}
}
