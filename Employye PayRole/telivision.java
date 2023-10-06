public interface telivision {
    abstract void powerOn();

    abstract void powerOff();

}

class Sumsung implements telivision {
    public void powerOn() {
        System.out.println("Power on");
    }

    public void powerOff() {
        System.out.println("Power off");
    }
}
