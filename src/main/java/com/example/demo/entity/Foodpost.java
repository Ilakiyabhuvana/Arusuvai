package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="foodpost", schema="arusuvai")
public class Foodpost {
		@Id
		private int id;
		private String foodname;
  private String content;
	    @Lob
    private byte[] foodimage;
		public byte[] getFoodimage() {
			return foodimage;
		}
		public void setFoodimage(byte[] foodimage) {
			this.foodimage = foodimage;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFoodname() {
			return foodname;
		}
		public void setFoodname(String foodname) {
			this.foodname = foodname;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}

}
