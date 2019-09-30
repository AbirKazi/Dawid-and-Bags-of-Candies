package sharesamenumberofcandiesv2;
import java.util.HashMap;

public class ShareSameNumberOfCandiesV2 {

    public static void main(String[] args) {
        HashMap<String, Integer> values = new HashMap<String, Integer>();
        values.put("a", 30);
        values.put("b", 74);
        values.put("c", 41);
        values.put("d", 63);
        if ((values.get("a") + values.get("b") == values.get("c") + values.get("d")) || (values.get("a") + values.get("d") == values.get("b") + values.get("c")) || (values.get("a") + values.get("c") == values.get("b") + values.get("d")) || (values.get("b") + values.get("c") == values.get("a") + values.get("d"))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
