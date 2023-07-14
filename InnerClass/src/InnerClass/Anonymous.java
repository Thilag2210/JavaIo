package InnerClass;
class dhoni{
	void csk() {
		System.out.println("Five times champions:");
	}
}
public class Anonymous {

	public static void main(String[] args) {
		dhoni d=new dhoni() {
			void csk() {
				System.out.println("I am Raina Fan");
			}
		};
		d.csk();

	}

}
