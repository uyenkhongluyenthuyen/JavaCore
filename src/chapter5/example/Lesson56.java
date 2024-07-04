package chapter5.example;

public class Lesson56 {
    public static void main(String[] args) {
        // ta có thể gọi phương thức add với số lượng các đối số tùy ý
        // yêu cầu các đối số đó cùng kiểu là ok
        System.out.println(STR."Tổng 1 số: \{add(255)}");
        System.out.println(STR."Tổng 2 số: \{add(255, 354)}");
        System.out.println(STR."Tổng 3 số: \{add(255, 354, 788)}");
        System.out.println(STR."Tổng 4 số: \{add(255, 354, 788, 725)}");

        //vd2:
        var line1 = createLine(" ","Hi", "there!");
        var line2 = createLine("-","Today", "is", "a", "good", "day", "to", "fight");
        var line3 = createLine("_","This", "is", "Java", "5", "feature");
        System.out.println(STR."Dòng 1: \"\{line1}\"");
        System.out.println(STR."Dòng 2: \"\{line2}\"");
        System.out.println(STR."Dòng 3: \"\{line3}\"");
    }

    /**
     * Phương thức tính tổng các số nguyên
     *
     * @param numbers tham số biến thiên chứa các phần tử cần tính tổng
     * @return tổng tính được
     */
    public static int add(int... numbers) {
        var sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Phương thức nối các từ lại với nhau thành câu hoàn chỉnh.
     *
     * @param words chứa các từ cần nối
     * @return câu hoàn chỉnh sau khi nối
     */
    public static String createLine(String delimiter, String... words) {
        var line = new StringBuilder();
        for (var word : words) {
            if (!word.isBlank()) {
                line.append(word).append(delimiter);
            }
        }
        if (!line.isEmpty()) {
            line.deleteCharAt(line.lastIndexOf(delimiter));
        }
        return line.toString();
    }

}
/**
 * Tổng 1 số: 255
 * Tổng 2 số: 609
 * Tổng 3 số: 1397
 * Tổng 4 số: 2122
 */

/**
 * Dòng 1: "Hi there!"
 * Dòng 2: "Today is a good day to fight"
 * Dòng 3: "This is Java 5 feature"
 */
