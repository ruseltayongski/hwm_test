package com.example.hwm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "laboratory")
public class Laboratory {
    private String _id;
	private int systole;
	private int diastole;
	private String rb_sugar;
	private Object[] other_test;
    private String created_at;
    private String updated_at;

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(String created_at) {
		this.created_at = created_at;
	}

    public String getUpdatedAt() {
		return updated_at;
	}

	public void setUpdatedAt(String updated_at) {
		this.updated_at = updated_at;
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

	public Laboratory(String _id, String created_at, String updated_at,int systole, int diastole, String rb_sugar, Object[] other_test) {
		this._id = _id;
		this.created_at = created_at;
        this.updated_at = updated_at;
		this.systole = systole;
		this.diastole = diastole;
		this.rb_sugar = rb_sugar;
		this.other_test = other_test;
	}

	public Laboratory() {
		super();
	}
}
