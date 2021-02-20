package mybatis.entity;

public class SysUserInfo{
    private int ID;
    private String Name;
    private boolean Sex;

    public SysUserInfo(){}
    public SysUserInfo(int id, String name, boolean sex){
        this.ID = id;
        this.Name = name;
        this.Sex = sex;
    }

    public int getID(){
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }

    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }

    public boolean getSex(){
        return Sex;
    }
    public void setSex(boolean sex){
        this.Sex = sex;
    }

    @Override
    public String toString(){
        return "SysUserInfo [ID=" + this.ID + ", Name = " + this.Name + " , Sex = " + this.Sex + "]";
    }


}