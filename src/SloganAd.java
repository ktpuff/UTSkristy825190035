public class SloganAd extends Advertisement implements InterfaceAd {

    @Override
    public void print() {
        System.out.println("\n-------------------------------");
        System.out.println("Adverts type : Slogan Ad");
        System.out.println("Seller name : " + getContact_name());
        System.out.println("Product Catergory : " + getCategory());
        System.out.println("Phone Number : " + getNotlp());
        System.out.println("Judul iklan : " + getJudul_iklan());
        System.out.println("Total Price : Rp.150.000");
    }

    @Override
    public int price(int money) {
        int kembalian = 0;
        if (money < 150000){
            System.out.println("uang tidak cukup!");
        }
        else {
            kembalian = money - 150000;
            System.out.println("thank you for purchasing!");
        }
        return kembalian;
    }
}


