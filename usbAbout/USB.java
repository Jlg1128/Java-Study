package usbAbout;
interface UsbType {
    void Usbon();
    void Usboff();
}
public class USB {
    public static void main(String[] args){
        Operation Computer =  new Operation();
        Mouth mouse = new Mouth();
        Keyboard keyboard = new Keyboard();
        Computer.add(mouse);
        Computer.add(keyboard);
        Computer.SystemOn();
        Computer.SystemOff();
    }
}

class Mouth implements UsbType {
    @Override
    public void Usbon() {
        System.out.println("鼠标启动了");
    }
    @Override
    public void Usboff() {
        System.out.println("鼠标关闭了");
    }

}
class Keyboard implements UsbType {
    @Override
    public void Usbon() {
        System.out.println("键盘启动了");
    }
    @Override
    public void Usboff() {
        System.out.println("键盘关闭了");
    }
}

class Operation{
    private UsbType[] usbArr = new UsbType[2];
    void  SystemOn() {
        System.out.println("系统开机，请等待");
        for(int i = 0; i < usbArr.length; i ++){
            usbArr[i].Usbon();
            }
    }
    void SystemOff() {
        System.out.println("系统关机");
        for(int i = 0; i < usbArr.length; i ++){
            usbArr[i].Usboff();
        }
    }
    public void add(UsbType usb){
//        System.out.println(usbArr.length);
        for(int i = 0; i < usbArr.length; i ++){
            if(usbArr[i] == null){
                usbArr[i] = usb;
                break;
            }
        }
    }
    public void del(USB usb){
        for(int i = 0; i < usbArr.length; i ++){
            if(usbArr[i] == usb){
                usbArr[i] = null;
            }
        }
    }
}