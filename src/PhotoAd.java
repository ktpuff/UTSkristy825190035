public class PhotoAd extends Advertisement implements InterfaceAd{
    private double photo_size;
    private String img_file_type;

    public double getPhoto_size() {
        return photo_size;
    }

    public void setPhoto_size(double photo_size) {
        this.photo_size = photo_size;
    }

    public String getImg_file_type() {
        return img_file_type;
    }

    public void setImg_file_type(String img_file_type) {
        this.img_file_type = img_file_type;
    }

    @Override
    public void print() {
        System.out.println("\n-------------------------------");
        System.out.println("Adverts type : Slogan Ad" );
        System.out.println("Seller name : " +getContact_name());
        System.out.println("Product Catergory : " +getCategory());
        System.out.println("Phone Number : "+getNotlp());
        System.out.println("Judul iklan : "+getJudul_iklan());
        System.out.println("photo size : "+getPhoto_size());
        System.out.println("img file type : "+getImg_file_type());
        System.out.println("total price : Rp.300.000");
    }

    @Override
    public int price(int money) {
        int kembalian = 0;
        if (money < 300000){
            System.out.println("uang tidak cukup!");
        }
        else {
            kembalian = money - 300000;
            System.out.println("thank you for purchasing!");
        }
        return kembalian;
    }


}
