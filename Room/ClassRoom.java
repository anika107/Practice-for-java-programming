
public class ClassRoom extends Room{
    private String department;
    private boolean isProjectAvailable;

    public ClassRoom(String department, boolean isProjectAvailable, String roomNo) {
        super(roomNo);
        this.department = department;
        this.isProjectAvailable = isProjectAvailable;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isIsProjectAvailable() {
        return isProjectAvailable;
    }

    public void setIsProjectAvailable(boolean isProjectAvailable) {
        this.isProjectAvailable = isProjectAvailable;
    }
    
    public void toggleProjectAvailability(){
        if(isProjectAvailable == true){
            isProjectAvailable = false;
        }
        else{
            isProjectAvailable = true;
        }
    }
}
