/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lodar
 */
public class Database {
    private int Uid;
    private String Uname;
    private String Uemail;
    private String Uphone;
    private String Upassword;
    private String UsecurityQuestion;
    private String Uanswer;
    private String Ustatus;

    private int Pid;
    private String Pname;
    private String Pcategory;
    private String Pprice;

    private int Cid;
    private String Cname;

    private int Bid;
    private String Bname;
    private String Bemail;
    private String Bphone;
    private String Bdate;
    private String Btotal;
    private String Bpaymet;
    private String BcreatedBy;

    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getUemail() {
        return Uemail;
    }

    public void setUemail(String Uemail) {
        this.Uemail = Uemail;
    }

    public String getUphone() {
        return Uphone;
    }

    public void setUphone(String Uphone) {
        this.Uphone = Uphone;
    }

    public String getUpassword() {
        return Upassword;
    }

    public void setUpassword(String Upassword) {
        this.Upassword = Upassword;
    }

    public String getUsecurityQuestion() {
        return UsecurityQuestion;
    }

    public void setUsecurityQuestion(String UsecurityQuestion) {
        this.UsecurityQuestion = UsecurityQuestion;
    }

    public String getUanswer() {
        return Uanswer;
    }

    public void setUanswer(String Uanswer) {
        this.Uanswer = Uanswer;
    }

    public String getUstatus() {
        return Ustatus;
    }

    public void setUstatus(String Ustatus) {
        this.Ustatus = Ustatus;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getPcategory() {
        return Pcategory;
    }

    public void setPcategory(String Pcategory) {
        this.Pcategory = Pcategory;
    }

    public String getPprice() {
        return Pprice;
    }

    public void setPprice(String Pprice) {
        this.Pprice = Pprice;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int Cid) {
        this.Cid = Cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public int getBid() {
        return Bid;
    }

    public void setBid(int Bid) {
        this.Bid = Bid;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String Bname) {
        this.Bname = Bname;
    }

    public String getBemail() {
        return Bemail;
    }

    public void setBemail(String Bemail) {
        this.Bemail = Bemail;
    }

    public String getBphone() {
        return Bphone;
    }

    public void setBphone(String Bphone) {
        this.Bphone = Bphone;
    }

    public String getBdate() {
        return Bdate;
    }

    public void setBdate(String Bdate) {
        this.Bdate = Bdate;
    }

    public String getBtotal() {
        return Btotal;
    }

    public void setBtotal(String Btotal) {
        this.Btotal = Btotal;
    }

    public String getBpaymet() {
        return Bpaymet;
    }

    public void setBpaymet(String Bpaymet) {
        this.Bpaymet = Bpaymet;
    }

    public String getBcreatedBy() {
        return BcreatedBy;
    }

    public void setBcreatedBy(String BcreatedBy) {
        this.BcreatedBy = BcreatedBy;
    }

    public void save() {
        System.out.println("Success!");
    }

    public void update() {
        System.out.println("Success!");
    }

}