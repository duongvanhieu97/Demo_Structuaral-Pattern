package Proxy;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng ProxyBankAccountManager với username và password
        ProxyBankAccountManager proxy = new ProxyBankAccountManager("user123", "password123");

        // Hiển thị thông tin tài khoản ngân hàng
        proxy.displayAccountInfo("1234567890");

        // Thử hiển thị thông tin tài khoản ngân hàng với username và password khác
        ProxyBankAccountManager invalidProxy = new ProxyBankAccountManager("invalid", "password");
        invalidProxy.displayAccountInfo("1234567890");
//       Lợi ích của Proxy Pattern là gì?
//        Cãi thiện Performance thông qua lazy loading, chỉ tải các tài nguyên khi chúng được yêu cầu.
//        Nó cung cấp sự bảo vệ cho đối tượng thực từ thế giới bên ngoài.
//        Giảm chi phí khi có nhiều truy cập vào đối tượng có chi phí khởi tạo ban đầu lớn.
//        Dễ nâng cấp, bảo trì.
//        Sử dụng Proxy Pattern khi nào?
//       Khi muốn bảo vệ quyền truy xuất vào các phương thức của object thực.
//        Khi cần một số thao tác bổ sung trước khi thực hiện phương thức của object thực.
//          Khi tạo đối tượng ban đầu là theo yêu cầu hoặc hệ thống yêu cầu sự chậm trễ khi tải một số tài nguyên nhất định (lazy loading).
//          Khi có nhiều truy cập vào đối tượng có chi phí khởi tạo ban đầu lớn.
//          Khi đối tượng gốc tồn tại trong môi trường từ xa (remote).
//          Khi đối tượng gốc nằm trong một hệ thống cũ hoặc thư viện của bên thứ ba.
//          Khi muốn theo dõi trạng thái và vòng đời đối tượng
    }

}
