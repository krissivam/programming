package JavaSe.IZ0808.Part1;
class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends PenDrive {
    String type;
    OTG(int capacity, String type) {
    	super(capacity);
    	this.type=type;
    }
}
public class Soal019 {
	public static void main(String[] args) {
        OTG obj = new OTG(64, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
