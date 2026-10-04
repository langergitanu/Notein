package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import androidx.transition.C22101OooOOOo;
import com.aspose.words.internal.zzD4;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ15 {
    private static com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD4> zzY2g;
    private static com.aspose.words.internal.zzD3<int[]> zzY2h;
    private static com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD4> zzY2f = new com.aspose.words.internal.zzD3<>();
    private static Object zzY2e = new Object();
    private static char[] zzY2d = {'+', '-', 8210, 8213, IOUtils.DIR_SEPARATOR_UNIX};
    private static char[] zzY2c = {'<', '=', '>', 8224, 8225, 9651, 8758, 8729};
    private static char[] zzY2b = {'*', '<', '=', '>', 177, 215, 247, 8224, 8225, 9651};
    private static char[] zzY2a = {8712, 8713, 8715, 8723, 8724, 8725, 8726, 8727, 8728, 8729, 8733, 8741, 8743, 8744, 8745, 8746, 8756, 8757, 8758, 8760, 8764, 8765, 8768, 8771, 8772, 8775, 8776, 8777, 8778, 8781, 8782, 8783, 8784, 8785, 8786, 8787, 8790, 8791, 8796, 8797, 8800, 8801, 8802, 8804, 8805, 8806, 8807, 8810, 8811, 8812, 8814, 8815, 8816, 8817, 8818, 8819, 8822, 8823, 8826, 8827, 8828, 8828, 8829, 8829, 8830, 8831, 8834, 8835, 8838, 8838, 8839, 8839, 8846, 8847, 8848, 8849, 8850, 8851, 8852, 8853, 8854, 8855, 8856, 8857, 8858, 8859, 8861, 8862, 8863, 8864, 8865, 8866, 8867, 8869, 8872, 8873, 8874, 8882, 8883, 8884, 8885, 8890, 8900, 8901, 8902, 8903, 8904, 8904, 8905, 8906, 8907, 8908, 8909, 8910, 8911, 8912, 8913, 8914, 8915, 8916, 8918, 8919, 8920, 8921, 8922, 8923, 8924, 8925, 8926, 8927};
    static char[] zzY29 = {'(', ')', ',', FilenameUtils.EXTENSION_SEPARATOR, ':', ';', '?', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '{', '}'};
    static com.aspose.words.internal.zzZNR zzY28 = new com.aspose.words.internal.zzZNR(",  ");

    static {
        com.aspose.words.internal.zzD3<int[]> zzd3 = new com.aspose.words.internal.zzD3<>();
        zzY2h = zzd3;
        zzd3.set(zzWI(0, 0), new int[]{0, 0, 0, 0, 0});
        zzY2h.set(zzWI(0, 3), new int[]{120049, 120055, 0, 0, 120744});
        zzY2h.set(zzWI(0, 2), new int[]{119997, 120003, 0, 0, 0});
        zzY2h.set(zzWI(0, 5), new int[]{120361, 120367, 0, 0, 120774});
        zzY2h.set(zzWI(0, 4), new int[]{120153, 120159, 0, 0, 120754});
        zzY2h.set(zzWI(0, 1), new int[]{119893, 119899, 0, 0, 0});
        zzY2h.set(zzWI(2, 0), new int[]{119789, 119795, 119627, 119633, 0});
        zzY2h.set(zzWI(2, 3), new int[]{120049, 120055, 0, 0, 120744});
        zzY2h.set(zzWI(2, 2), new int[]{119997, 120003, 0, 0, 0});
        zzY2h.set(zzWI(2, 5), new int[]{120361, 120367, 0, 0, 120774});
        zzY2h.set(zzWI(2, 4), new int[]{120257, 120263, 0, 0, 120754});
        zzY2h.set(zzWI(2, 1), new int[]{119893, 119899, 0, 0, 0});
        zzY2h.set(zzWI(1, 0), new int[]{119737, 119743, 119569, 119575, 120734});
        zzY2h.set(zzWI(1, 3), new int[]{120049, 120055, 0, 0, 120744});
        zzY2h.set(zzWI(1, 2), new int[]{120101, 120107, 0, 0, 0});
        zzY2h.set(zzWI(1, 5), new int[]{120361, 120367, 0, 0, 120774});
        zzY2h.set(zzWI(1, 4), new int[]{120205, 120211, 119743, 119749, 120764});
        zzY2h.set(zzWI(1, 1), new int[]{119945, 119951, 0, 0, 0});
        zzY2h.set(zzWI(3, 0), new int[]{119841, 119847, 119685, 119691, 120734});
        zzY2h.set(zzWI(3, 3), new int[]{120049, 120055, 0, 0, 120744});
        zzY2h.set(zzWI(3, 2), new int[]{120101, 120107, 0, 0, 0});
        zzY2h.set(zzWI(3, 5), new int[]{120361, 120367, 0, 0, 120774});
        zzY2h.set(zzWI(3, 4), new int[]{120309, 120315, 119801, 119807, 120764});
        zzY2h.set(zzWI(3, 1), new int[]{119945, 119951, 0, 0, 0});
        com.aspose.words.internal.zzD3<com.aspose.words.internal.zzD4> zzd32 = new com.aspose.words.internal.zzD3<>();
        zzY2g = zzd32;
        zzd32.set(zzWI(0, 3), zzYGX());
        zzY2g.set(zzWI(0, 2), zzYGW());
        zzY2g.set(zzWI(0, 1), zzYGV());
        zzY2g.set(zzWI(2, 0), zzYGU());
        zzY2g.set(zzWI(2, 3), zzYGT());
        zzY2g.set(zzWI(2, 2), zzYGS());
        zzY2g.set(zzWI(2, 1), zzYGR());
        zzY2g.set(zzWI(1, 0), zzYGQ());
        zzY2g.set(zzWI(1, 3), zzYGP());
        zzY2g.set(zzWI(1, 4), zzYGO());
        zzY2g.set(zzWI(3, 3), zzYGN());
        zzY2g.set(zzWI(3, 0), zzYGM());
        zzY2g.set(zzWI(3, 4), zzYGL());
    }

    private static com.aspose.words.internal.zzD4 zzU(com.aspose.words.internal.zzD4 zzd4) {
        for (int i = 0; i < zzd4.getCount(); i++) {
            zzd4.set(i, zzd4.get(i) > 4000 ? zzd4.get(i) + 1 : zzd4.get(i) + 4);
        }
        return zzd4;
    }

    public static String zzV(char c, int i, int i2) {
        int i3 = zzWH(i, i2).get(c);
        return com.aspose.words.internal.zzD4.zzWm(i3) ? com.aspose.words.internal.zzZKN.zzS(c, 1) : com.aspose.words.internal.zzZVS.zzS7(i3);
    }

    public static float zzW(zzZ13 zzz13) throws Exception {
        return zzz13.zzZr().zzY7(32);
    }

    private static com.aspose.words.internal.zzD4 zzWH(int i, int i2) {
        com.aspose.words.internal.zzD4 zzd4;
        int iZzWI = zzWI(i, i2);
        com.aspose.words.internal.zzD4 zzd42 = zzY2f.get(iZzWI);
        if (zzd42 != null) {
            return zzd42;
        }
        synchronized (zzY2e) {
            try {
                zzd4 = zzY2f.get(iZzWI);
                if (zzd4 == null) {
                    zzd4 = new com.aspose.words.internal.zzD4();
                    zzZ(zzd4, zzY2h.get(iZzWI));
                    zzZ(zzY2g.get(iZzWI), zzd4);
                    zzZ(zzuP(i), zzd4);
                    zzZ(zzYGK(), zzd4);
                    zzY2f.set(iZzWI, zzd4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzd4;
    }

    private static int zzWI(int i, int i2) {
        return i | (i2 << 8);
    }

    public static boolean zzX(zzZ13 zzz13) throws Exception {
        if (zzz13.zzQw().size() == 0 || zzz13.zzQw().get(0).zzQw().size() == 0) {
            return false;
        }
        zzZ13 zzz132 = zzz13.zzQw().get(0).zzQw().get(0);
        if (zzz132.zzYG8().getMathObjectType() == 6 && zzz132.zzZj().getHeight() < zzz132.zzZr().getLineSpacingPoints()) {
            return true;
        }
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz132, zzYZP.class);
        if (zzyzp == null || zzyzp.getText().length() <= 0) {
            return false;
        }
        return zzX(zzY29, zzyzp.getText().charAt(0));
    }

    private static com.aspose.words.internal.zzD4 zzYGF() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(0, 4668, 1, 3419);
        zzd4OooO0O0.set(2, 4676);
        zzd4OooO0O0.set(3, 3420);
        zzd4OooO0O0.set(4, 4682);
        zzd4OooO0O0.set(5, 3421);
        zzd4OooO0O0.set(6, 4688);
        zzd4OooO0O0.set(7, 3422);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGG() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(0, 4670, 1, 3427);
        zzd4OooO0O0.set(2, 4674);
        zzd4OooO0O0.set(3, 3428);
        zzd4OooO0O0.set(4, 4680);
        zzd4OooO0O0.set(5, 3429);
        zzd4OooO0O0.set(6, 4686);
        zzd4OooO0O0.set(7, 3430);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGH() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(0, 4666, 1, 3435);
        zzd4OooO0O0.set(2, 4672);
        zzd4OooO0O0.set(3, 3436);
        zzd4OooO0O0.set(4, 4678);
        zzd4OooO0O0.set(5, 3437);
        zzd4OooO0O0.set(6, 4684);
        zzd4OooO0O0.set(7, 3438);
        return zzd4OooO0O0;
    }

    public static com.aspose.words.internal.zzD4 zzYGI() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(0, 958, 1, 3493);
        zzd4OooO0O0.set(2, 3495);
        zzd4OooO0O0.set(3, 3496);
        zzd4OooO0O0.set(4, 3497);
        zzd4OooO0O0.set(5, 3498);
        return zzd4OooO0O0;
    }

    public static com.aspose.words.internal.zzD4 zzYGJ() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(518, 2879, 536, 2993);
        zzd4OooO0O0.set(3397, 2878);
        zzd4OooO0O0.set(3398, 2879);
        zzd4OooO0O0.set(3404, 2880);
        zzd4OooO0O0.set(3407, 2996);
        zzd4OooO0O0.set(3408, 2997);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGK() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(45, 8213, 42, 8727);
        zzd4OooO0O0.set(8289, 32);
        zzd4OooO0O0.set(39, 8242);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGL() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(977, 120773, 981, 120775);
        zzd4OooO0O0.set(982, 120777);
        zzd4OooO0O0.set(1008, 120774);
        zzd4OooO0O0.set(1009, 120776);
        zzd4OooO0O0.set(PointerIconCompat.TYPE_ALL_SCROLL, 120772);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGM() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(977, 120657, 981, 120659);
        zzd4OooO0O0.set(982, 120661);
        zzd4OooO0O0.set(1008, 120658);
        zzd4OooO0O0.set(1009, 120660);
        zzd4OooO0O0.set(PointerIconCompat.TYPE_ALL_SCROLL, 120656);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGN() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(67, 8450, 72, 8461);
        zzd4OooO0O0.set(78, 8469);
        zzd4OooO0O0.set(80, 8473);
        zzd4OooO0O0.set(81, 8474);
        zzd4OooO0O0.set(82, 8477);
        zzd4OooO0O0.set(90, 8484);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGO() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(977, 120715, 981, 120717);
        zzd4OooO0O0.set(982, 120719);
        zzd4OooO0O0.set(1008, 120716);
        zzd4OooO0O0.set(1009, 120718);
        zzd4OooO0O0.set(PointerIconCompat.TYPE_ALL_SCROLL, 120714);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGP() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(67, 8450, 72, 8461);
        zzd4OooO0O0.set(78, 8469);
        zzd4OooO0O0.set(80, 8473);
        zzd4OooO0O0.set(81, 8474);
        zzd4OooO0O0.set(82, 8477);
        zzd4OooO0O0.set(90, 8484);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGQ() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(977, 120541, 981, 120543);
        zzd4OooO0O0.set(982, 120545);
        zzd4OooO0O0.set(1008, 120542);
        zzd4OooO0O0.set(1009, 120544);
        zzd4OooO0O0.set(PointerIconCompat.TYPE_ALL_SCROLL, 120540);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGR() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(101, 8495, 103, 8458);
        zzd4OooO0O0.set(111, 8500);
        zzd4OooO0O0.set(66, 8492);
        zzd4OooO0O0.set(69, 8496);
        zzd4OooO0O0.set(70, 8497);
        zzd4OooO0O0.set(72, 8459);
        zzd4OooO0O0.set(73, 8464);
        zzd4OooO0O0.set(76, 8466);
        zzd4OooO0O0.set(77, 8499);
        zzd4OooO0O0.set(82, 8475);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGS() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(67, 8493, 72, 8460);
        zzd4OooO0O0.set(73, 8465);
        zzd4OooO0O0.set(82, 8476);
        zzd4OooO0O0.set(90, 8488);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGT() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(67, 8450, 72, 8461);
        zzd4OooO0O0.set(78, 8469);
        zzd4OooO0O0.set(80, 8473);
        zzd4OooO0O0.set(81, 8474);
        zzd4OooO0O0.set(82, 8477);
        zzd4OooO0O0.set(90, 8484);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGU() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(104, 8462, 977, 120599);
        zzd4OooO0O0.set(981, 120601);
        zzd4OooO0O0.set(982, 120603);
        zzd4OooO0O0.set(1008, 120600);
        zzd4OooO0O0.set(1009, 120602);
        zzd4OooO0O0.set(PointerIconCompat.TYPE_ALL_SCROLL, 120598);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGV() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(101, 8495, 103, 8458);
        zzd4OooO0O0.set(111, 8500);
        zzd4OooO0O0.set(66, 8492);
        zzd4OooO0O0.set(69, 8496);
        zzd4OooO0O0.set(70, 8497);
        zzd4OooO0O0.set(72, 8459);
        zzd4OooO0O0.set(73, 8464);
        zzd4OooO0O0.set(76, 8466);
        zzd4OooO0O0.set(77, 8499);
        zzd4OooO0O0.set(82, 8475);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGW() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(67, 8493, 72, 8460);
        zzd4OooO0O0.set(73, 8465);
        zzd4OooO0O0.set(82, 8476);
        zzd4OooO0O0.set(90, 8488);
        return zzd4OooO0O0;
    }

    private static com.aspose.words.internal.zzD4 zzYGX() {
        com.aspose.words.internal.zzD4 zzd4OooO0O0 = C22101OooOOOo.OooO0O0(67, 8450, 72, 8461);
        zzd4OooO0O0.set(78, 8469);
        zzd4OooO0O0.set(80, 8473);
        zzd4OooO0O0.set(81, 8474);
        zzd4OooO0O0.set(82, 8477);
        zzd4OooO0O0.set(90, 8484);
        return zzd4OooO0O0;
    }

    public static boolean zzYp(char c) {
        if (c == 9432) {
            return true;
        }
        if (c < 12296 || c > 12307) {
            return c >= 12310 && c <= 12315;
        }
        return true;
    }

    public static com.aspose.words.internal.zzD4 zzYq(char c) {
        return c != '(' ? c != ')' ? c != '[' ? c != ']' ? c != '{' ? zzU(zzYGF()) : zzYGF() : zzU(zzYGG()) : zzYGG() : zzU(zzYGH()) : zzYGH();
    }

    public static boolean zzYr(char c) {
        return zzX(zzY29, c);
    }

    public static boolean zzYs(char c) {
        return c == 8242;
    }

    public static boolean zzYt(char c) {
        return zzX(zzY2c, c);
    }

    public static boolean zzYu(char c) {
        return zzX(zzY2d, c);
    }

    public static boolean zzYv(char c) {
        if (zzX(zzY2d, c) || zzX(zzY2b, c)) {
            return true;
        }
        char[] cArr = zzY2a;
        if (c < cArr[0] || c > cArr[cArr.length - 1]) {
            return false;
        }
        return zzX(cArr, c);
    }

    private static void zzZ(com.aspose.words.internal.zzD4 zzd4, int[] iArr) {
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            zzd4.set(c, iArr[0] + c);
        }
        for (char c2 = 'A'; c2 <= 'Z'; c2 = (char) (c2 + 1)) {
            zzd4.set(c2, iArr[1] + c2);
        }
        for (char c3 = 945; c3 <= 969; c3 = (char) (c3 + 1)) {
            zzd4.set(c3, iArr[2] + c3);
        }
        for (char c4 = 913; c4 <= 937; c4 = (char) (c4 + 1)) {
            zzd4.set(c4, iArr[3] + c4);
        }
        for (char c5 = '0'; c5 <= '9'; c5 = (char) (c5 + 1)) {
            zzd4.set(c5, iArr[4] + c5);
        }
    }

    private static int zzuN(int i) {
        if (i == 1) {
            return 119743;
        }
        if (i != 2) {
            return i != 3 ? 0 : 119847;
        }
        return 119795;
    }

    private static int zzuO(int i) {
        if (i == 1) {
            return 119737;
        }
        if (i != 2) {
            return i != 3 ? 0 : 119841;
        }
        return 119789;
    }

    private static com.aspose.words.internal.zzD4 zzuP(int i) {
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        int iZzuO = zzuO(i);
        zzd4.set(8518, iZzuO + 100);
        zzd4.set(8519, iZzuO + 101);
        zzd4.set(8520, iZzuO + 105);
        zzd4.set(8521, iZzuO + 106);
        zzd4.set(8517, zzuN(i) + 68);
        return zzd4;
    }

    private static void zzZ(com.aspose.words.internal.zzD4 zzd4, com.aspose.words.internal.zzD4 zzd42) {
        if (zzd4 == null) {
            return;
        }
        zzD4.zzZ zzzZzCP = zzd4.zzCP();
        while (zzzZzCP.moveNext()) {
            zzd42.set(zzzZzCP.zzCM(), zzzZzCP.zzCL());
        }
    }

    public static boolean zzX(char[] cArr, char c) {
        return com.aspose.words.internal.zzZ1.zzZ(cArr, cArr.length, c) >= 0;
    }
}
