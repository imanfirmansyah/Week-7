


public class imanfirmansyah extends Mahasiswa {

    @Override
    protected void kuliah() {
        System.out.println("Kuliah jangan bolos - bolos");
    }

    @Override
    protected void lulus() {
        System.out.println("lulus kuliah harus mendapat ilmu yg bermanfaat dan IPK memuaskan");
    }

    @Override
    protected void tidakLulus() {
        System.out.println("Tidak lulus kalo masi bolos - bolos kuliah");}

    @Override
    protected void dataDiri() {
        System.out.println("Nama saya : "+ nama);
        System.out.println("Nim saya  : "+ nim);
    }
    
}