package institute.practice2;


public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    //code format shortcut(ctrl+shift+f)
    //	@Override
    //	public boolean equals(Object obj) {
    //		Student s = (Student) obj;
    //		if (this.name.equals(s.name) && this.id == id)
    //			return true;
    //		else
    //			return false;
    //	}


}