package Adapter;

public class Test {
    public static void main(String[] args) {
        AudioPlayerImpl audioPlayer = new AudioPlayerImpl();

        audioPlayer.play("mp3", "bailamos.mp3");
        audioPlayer.play("mp4", "alone.mp4");
//     Lợi ích của Adapter Pattern là gì?
//        Việc sử dụng Adapter Pattern đem lại các lợi ích sau:
//
//        Cho phép nhiều đối tượng có interface giao tiếp khác nhau có thể tương tác và giao tiếp với nhau.
//        Tăng khả năng sử dụng lại thư viện với interface không thay đổi do không có mã nguồn.
//        Bên cạnh những lợi ích trên, nó cũng nó một số khuyết điểm nhỏ sau:
//
//        Tất cả các yêu cầu được chuyển tiếp, do đó làm tăng thêm một ít chi phí.
//        Đôi khi có quá nhiều Adapter được thiết kế trong một chuỗi Adapter (chain) trước khi đến được yêu cầu thực sự.
//      Sử dụng Adapter Pattern khi nào?
//        Adapter Pattern giúp nhiều lớp có thể làm việc với nhau dễ dàng mà bình thường không thể. Một trường hợp thường gặp phải và có thể áp dụng Adapter Pattern là khi không thể kế thừa lớp A, nhưng muốn một lớp B có những xử lý tương tự như lớp A. Khi đó chúng ta có thể cài đặt B theo Object Adapter, các xử lý của B sẽ gọi những xử lý của A khi cần.
//        Khi muốn sử dụng một lớp đã tồn tại trước đó nhưng interface sử dụng không phù hợp như mong muốn.
//        Khi muốn tạo ra những lớp có khả năng sử dụng lại, chúng phối hợp với các lớp không liên quan hay những lớp không thể đoán trước được và những lớp này không có những interface tương thích.
//        Cần phải có sự chuyển đổi interface từ nhiều nguồn khác nhau.
//        Khi cần đảm bảo nguyên tắc Open/ Close trong một ứng dụng.
    }
}
