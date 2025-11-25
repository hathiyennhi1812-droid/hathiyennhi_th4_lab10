package com.example.hathiyennhi_1150070031_lab3;

import java.util.ArrayList;
import java.util.List;

public class StoryData {


    public static final String[] TOPICS = {
            "Học đường"
    };


    private static final Story[] ALL_STORIES = new Story[]{

            new Story("Học đường", "1. Đi học muộn",
                    "Cô giáo hỏi:\n" +
                            "– Hôm nay sao em lại đi học muộn?\n" +
                            "Học sinh đáp:\n" +
                            "– Dạ, trên đường đi học em thấy tấm bảng ghi: \"TRƯỜNG HỌC LÀ NGÔI NHÀ THỨ HAI\".\n" +
                            "Nên em quay về… thay quần áo, xếp cặp giống như ở nhà rồi mới đến ạ.\n" +
                            "Cả lớp cười ầm, cô giáo chỉ biết lắc đầu."),

            new Story("Học đường", "2. Bài kiểm tra 15 phút",
                    "Trong giờ kiểm tra, thầy nghiêm giọng:\n" +
                            "– Trong 15 phút tới, ai nói chuyện là 0 điểm!\n" +
                            "Một lúc sau, thầy nghe tiếng thì thầm:\n" +
                            "– Này, cho tao mượn cục tẩy!\n" +
                            "Thầy quát:\n" +
                            "– Em kia, đứng lên! Ai vừa nói?\n" +
                            "Cả lớp im lặng một hồi, rồi có tiếng trả lời nhỏ:\n" +
                            "– Thưa thầy, đó là câu hỏi… trắc nghiệm hay tự luận ạ?"),

            new Story("Học đường", "3. Lý do nghỉ học",
                    "Cô giáo hỏi Tý:\n" +
                            "– Hôm qua sao em nghỉ học không phép?\n" +
                            "Tý đáp:\n" +
                            "– Dạ tại mẹ bảo hôm qua là \"ngày của thầy cô\".\n" +
                            "Em nghĩ là… để thầy cô được nghỉ ngơi một ngày, không bị tụi em làm phiền ạ!"),

            new Story("Học đường", "4. Máy tính thông minh",
                    "Thầy môn Tin hỏi:\n" +
                            "– Máy tính giúp chúng ta làm gì?\n" +
                            "Một bạn trả lời:\n" +
                            "– Dạ, giúp tính toán nhanh hơn ạ.\n" +
                            "Tèo giơ tay:\n" +
                            "– Thưa thầy, còn giúp tụi em kiểm tra xem…\n" +
                            "đáp án trên mạng có giống đáp án trong đề không ạ."),

            new Story("Học đường", "5. Bảng cửu chương",
                    "Cô giáo kiểm tra bài:\n" +
                            "– Em đọc cho cô nghe bảng cửu chương 9!\n" +
                            "Nam ấp úng rồi nói:\n" +
                            "– Thưa cô, hôm nay em… không mang theo bảng cửu chương ạ.\n" +
                            "Cô ngạc nhiên:\n" +
                            "– Bảng cửu chương là cái gì mà mang theo?\n" +
                            "Nam hồn nhiên:\n" +
                            "– Dạ trong điện thoại, nhưng cô bắt để trong cặp rồi!"),

            new Story("Học đường", "6. Kiểm tra miệng",
                    "Cô giáo gọi Lan lên bảng:\n" +
                            "– Em hãy kể tên ba nhà bác học nổi tiếng!\n" +
                            "Lan suy nghĩ một lúc:\n" +
                            "– Dạ… Einstein, Newton… và nhà bác học Google ạ.\n" +
                            "Cả lớp cười ồ, cô giáo thở dài: \"Thời đại 4.0 thật rồi…\""),

            new Story("Học đường", "7. Bài tập về nhà",
                    "Mẹ hỏi con:\n" +
                            "– Bài tập về nhà hôm nay nhiều không con?\n" +
                            "Cậu bé trả lời:\n" +
                            "– Không nhiều lắm mẹ ạ. Cô chỉ bảo: về nhà làm hết bài trong sách.\n" +
                            "Con thấy sách dày quá nên… con quyết định không mang về cho đỡ nặng cặp!"),

            new Story("Học đường", "8. Học nhóm",
                    "Thầy hỏi:\n" +
                            "– Các em có hay học nhóm không?\n" +
                            "Tí đáp:\n" +
                            "– Dạ có ạ, nhất là mỗi khi kiểm tra.\n" +
                            "Thầy hỏi tiếp:\n" +
                            "– Học nhóm kiểu gì?\n" +
                            "Tí thật thà:\n" +
                            "– Dạ, tụi em cùng… nhìn vào một bài cho đỡ lạc đề ạ!"),

            new Story("Học đường", "9. Lý do điểm thấp",
                    "Ba xem sổ liên lạc xong hỏi con:\n" +
                            "– Sao môn nào con cũng dưới trung bình?\n" +
                            "Con đáp:\n" +
                            "– Thầy cô nói \"Học sinh là tương lai của đất nước\".\n" +
                            "Mà tương lai thì còn xa, nên… bây giờ con học từ từ thôi ba ạ!"),

            new Story("Học đường", "10. Thầy cô dễ tính",
                    "Hai học sinh nói chuyện:\n" +
                            "– Môn nào ở trường mày thấy khó nhất?\n" +
                            "– Toán với Lý, vì thầy cô toàn bắt tính đúng.\n" +
                            "– Thế môn nào dễ nhất?\n" +
                            "– Môn Thể dục.\n" +
                            "– Sao dễ?\n" +
                            "– Vì thầy bảo: \"Các em chỉ cần chạy hết sức mình,\n" +
                            "kết quả thế nào… thầy cũng chấp nhận!\"")
    };


    public static List<Story> getStoriesByTopic(String topic) {
        List<Story> result = new ArrayList<>();
        for (Story s : ALL_STORIES) {
            if (s.topic.equals(topic)) {
                result.add(s);
            }
        }
        return result;
    }
}
