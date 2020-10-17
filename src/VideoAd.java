public class VideoAd extends Advertisement implements InterfaceAd{
    private double video_size;
    private String video_type_file;

    public double getVideo_size() {
        return video_size;
    }

    public void setVideo_size(double video_size) {
        this.video_size = video_size;
    }

    public String getVideo_type_file() {
        return video_type_file;
    }

    public void setVideo_type_file(String video_type_file) {
        this.video_type_file = video_type_file;
    }

    @Override
    public void print() {
        System.out.println("\n-------------------------------");
        System.out.println("Adverts type : Video Ad" );
        System.out.println("Seller name : " +getContact_name());
        System.out.println("Product Catergory : " +getCategory());
        System.out.println("Phone Number : "+getNotlp());
        System.out.println("Judul iklan : "+getJudul_iklan());
        System.out.println("Video Size : "+getVideo_size());
        System.out.println("video file type : "+getVideo_type_file());
        System.out.println("total price : Rp. 450.000");
    }

    @Override
    public int price(int money) {
        int kembalian = 0;
        if (money < 450000){
            System.out.println("uang tidak cukup!");
        }
        else {
            kembalian = money - 450000;
            System.out.println("thank you for purchasing!");
        }
        return kembalian;
    }

}
