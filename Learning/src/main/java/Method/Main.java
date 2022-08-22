package Learning.src.main.java.Method;
//Method = 1 chức năng nào đó (Phương thức) - A.K.A - [Function trong C/C+, PHP]
//    * Chức năng
//        - Quản ký phân tán
//        - Tối ưu code (dễ debug)
//        - Tái sử dụng code
//    * Cách đặt tên cho method: giống cách đặt tên biến
//    * Định nghĩa:
//        'access modifier' static 'kiểu dữ liệu' 'tên method'( 'danh sách tham số -['kiểu dữ liệu' 'tên tham số']' - [Cho biết cần truyền vào method những đối số nào, có tiểu dữ liệu nào])
//            {
//            code block,
//            return 'giá trị kiểu dữ liệu vs method';
//            }
//
//    * Muốn dùng method => phải gọi tham số
//        => 'tên method'('danh sách đối số')
//        => danh sách đối số != danh sách tham số
//        => Quy tắc của danh sách đối số:
//            => Danh sách tham số có "n" tham số  => Danh sách đối số cx có "n" đối số
//            => Từng đối số có kiểu dữ liệu vs tham số tương ứng
//    * Cách để tách ra các method
//        1. Viết hết vào main - [spa gét ti]
//        2. Xác định có bao nhiêu chưc năng
//        3. Tách từng chức năng ra từng method