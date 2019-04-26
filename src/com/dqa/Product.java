package com.dqa;  

import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "user") 

public class Product implements Serializable {  
   private static final long serialVersionUID = 1L; 
   private int id; 
   private String name; 
   private String price;  
   public Product(){} 
    
   public Product(int id, String name, String price){  
      this.id = id; 
      this.name = name; 
      this.price = price; 
   }  
   public int getId() { 
      return id; 
   }  
   @XmlElement 
   public void setId(int id) { 
      this.id = id; 
   } 
   public String getName() { 
      return name; 
   } 
   @XmlElement
   public void setName(String name) { 
      this.name = name; 
   } 
   public String getPrice() { 
      return price; 
   } 
   @XmlElement 
   public void setPrice(String price) { 
      this.price = price; 
   }   
   
   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof Product)){
         return false;
      }else {
         Product user = (Product)object;
         if(id == user.getId()
            && name.equals(user.getName())
            && price.equals(user.getPrice())
         ){
            return true;
         }			
      }
      return false;
   }	
} 