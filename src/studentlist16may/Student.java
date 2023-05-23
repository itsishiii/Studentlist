/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist16may;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String sname;
    private String sId;
//this has been edited on githubfor fecthmerge
   
    public Student(String sname, String sId) {
        this.sname = sname;
        this.sId = sId;
    }

    public String getsname() {
        return sname;
    }

    public void setsname(String sname) {
        this.sname = sname;
    }

    public String getsId() {
        return sId;
    }
//again fetching n merging
    public void setsId(String sId) {
        this.sId = sId;
    
}
}
