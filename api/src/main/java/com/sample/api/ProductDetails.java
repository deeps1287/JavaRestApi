package com.sample.api;

public class ProductDetails {

    private int Syokcd;
    private String Syoknm;
    private int JFcode;
    private String Ebunnm;
    private String Srchnm;
    private String Syokkn;

    ProductDetails(int Syokcd, String Syoknm, int JFcode, String Ebunnm,
    		String Srchnm, String Syokkn){
    	
    	this.Syokcd = Syokcd;
    	this.Syoknm = Syoknm;
    	this.JFcode = JFcode; 
    	this.Ebunnm = Ebunnm;
    	this.Srchnm = Srchnm;
    	this.Syokkn = Syokkn;
   }

    //1. FOR 商品コード
    public int getSyokcd() {
        return Syokcd;
    }
    public void setSyokcd(int Syokcd) {
        this.Syokcd = Syokcd;
    }

    //2. FOR 商品名称
    public String getSyoknm() {
        return Syoknm;
    }
    public void setSyoknm(String Syoknm) {
        this.Syoknm = Syoknm;
    }
    
    //3. FOR 統一品名コード
    public int getJFcode() {
        return JFcode;
    }
    public void setJFcode(int JFcode) {
        this.JFcode = JFcode;
    }
    
    //4. FOR 営業分類名称
    public String getEbunnm() {
        return Ebunnm;
    }
    public void setEbunnm(String Ebunnm) {
        this.Ebunnm = Ebunnm;
    }
    
    //5. FOR 検索用名称
    public String getSrchnm() {
        return Srchnm;
    }
    public void setSrchnm(String Srchnm) {
        this.Srchnm = Srchnm;
    }
    
    //6. FOR 商品名称＿カナ
    public String getSyokkn() {
        return Syokkn;
    }
    public void setSyokkn(String Syokkn) {
        this.Syokkn = Syokkn;
    }
}
