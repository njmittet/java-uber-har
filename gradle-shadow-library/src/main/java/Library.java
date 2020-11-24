import org.apache.commons.math3.util.ArithmeticUtils;

import com.google.common.math.IntMath;

public class Library {

    public int powWithGuava(int a, int b) {
        return IntMath.pow(a, b);
    }

    public int powWithCommonsMath(int a, int b) {
        return ArithmeticUtils.pow(a, b);
    }
}
