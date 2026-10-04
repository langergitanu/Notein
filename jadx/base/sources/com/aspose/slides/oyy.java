package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.p559ms.System.C14047bz;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
class oyy extends DomObject<Presentation> implements IGenericEnumerable<x5o> {

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<C14047bz, Integer> f47981kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private static final Dictionary<Integer, C14047bz> f47982to = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<C14047bz, x5o> f47983k4;

    /* JADX INFO: renamed from: x1 */
    private final g5z f47984x1;

    static {
        m68909k4(1, new C14047bz(1545753674, (short) 32486, (short) 17218, (byte) -80, (byte) 72, (byte) -123, (byte) -67, (byte) -55, (byte) -3, (byte) 28, (byte) 58), "Medium Style 2 - Accent 1");
        m68909k4(2, new C14047bz(121245098, (short) 27379, (short) 17323, (byte) -123, (byte) -120, (byte) -50, (byte) -63, (byte) -48, (byte) 108, (byte) 114, (byte) -71), "Medium Style 2");
        m68909k4(3, new C14047bz(760920870, (short) 1415, (short) 19504, (byte) -119, (byte) -103, (byte) -110, (byte) -8, (byte) 31, (byte) -48, PatternStyle.Wave, (byte) 124), "No Style, No Grid");
        m68909k4(4, new C14047bz(1009777245, (short) -30796, (short) 17770, (byte) -104, (byte) 33, (byte) 29, (byte) 80, (byte) 36, (byte) 104, (byte) -49, (byte) 15), "Themed Style 1 - Accent 1");
        m68909k4(5, new C14047bz(676217466, (short) 15701, (short) 17155, (byte) -65, UnsignedBytes.MAX_POWER_OF_TWO, (byte) 100, (byte) 85, (byte) 3, (byte) 110, (byte) 29, (byte) -25), "Themed Style 1 - Accent 2");
        m68909k4(6, new C14047bz(1774683452, (short) 21357, (short) 19062, (byte) -96, (byte) -82, (byte) -35, (byte) 34, (byte) 18, (byte) 77, (byte) 85, (byte) -91), "Themed Style 1 - Accent 3");
        m68909k4(7, new C14047bz(2002635522, (short) -25672, (short) 18429, (byte) -119, (byte) 7, (byte) -123, (byte) -57, (byte) -108, (byte) -9, (byte) -109, (byte) -70), "Themed Style 1 - Accent 4");
        m68909k4(8, new C14047bz(896896951, (short) -25915, (short) 17746, (byte) -118, (byte) 83, (byte) -55, (byte) 24, (byte) 5, (byte) -27, (byte) 71, (byte) -6), "Themed Style 1 - Accent 5");
        m68909k4(9, new C14047bz(150700925, (short) -14297, (short) 20218, (byte) -96, (byte) 87, (byte) 77, (byte) 5, UnsignedBytes.MAX_POWER_OF_TWO, (byte) 126, (byte) 15, (byte) 124), "Themed Style 1 - Accent 6");
        m68909k4(10, new C14047bz(1497392986, (short) -19079, (short) 17934, (byte) -108, (byte) -47, (byte) 84, (byte) 34, PatternStyle.Weave, (byte) 99, (byte) -11, (byte) -38), "No Style, Table Grid");
        m68909k4(11, new C14047bz(3507726802L, 40299, 18729, (short) -86, (short) 45, (short) -14, (short) 59, (short) 94, (short) -24, (short) -53, (short) -25), "Themed Style 2 - Accent 1");
        m68909k4(12, new C14047bz(408960988, (short) -7382, (short) 19125, (byte) -104, (byte) -100, (byte) 8, (byte) 100, (byte) -61, (byte) -22, (byte) -46, (byte) -72), "Themed Style 2 - Accent 2");
        m68909k4(13, new C14047bz(812095992, (short) 1886, (short) 19002, (byte) -89, (byte) -10, Ascii.DEL, (byte) -68, (byte) 101, (byte) 118, (byte) -15, (byte) -92), "Themed Style 2 - Accent 3");
        m68909k4(14, new C14047bz(3798585374L, 48178, 16457, (short) -76, (short) 99, (short) 92, (short) 96, (short) -41, (short) -80, (short) -52, (short) -46), "Themed Style 2 - Accent 4");
        m68909k4(15, new C14047bz(847222715, (short) -14285, (short) 20407, (byte) -67, (byte) -27, (byte) 63, (byte) 112, (byte) 117, (byte) 3, (byte) 70, (byte) -112), "Themed Style 2 - Accent 5");
        m68909k4(16, new C14047bz(1670060117, (short) 7029, (short) 20414, (byte) -109, (byte) 12, (byte) 57, (byte) -117, (byte) -88, (byte) -62, (byte) 83, (byte) -58), "Themed Style 2 - Accent 6");
        m68909k4(17, new C14047bz(2642093765L, 16647, 20460, (short) -82, (short) -36, (short) 23, (short) 22, (short) -78, (short) 80, (short) -95, (short) -17), "Light Style 1");
        m68909k4(18, new C14047bz(994810032, (short) 24748, (short) 17090, (byte) -81, (byte) -91, (byte) -75, (byte) -116, (byte) -41, Ascii.DEL, (byte) -95, (byte) -27), "Light Style 1 - Accent 1");
        m68909k4(19, new C14047bz(239066693, (short) -20617, (short) 19292, (byte) -105, (byte) 21, (byte) 73, (byte) -43, (byte) -108, (byte) -67, (byte) -16, (byte) 94), "Light Style 1 - Accent 2");
        m68909k4(20, new C14047bz(3229869795L, 64125, 19835, (short) -91, (short) -107, (short) -17, (short) -110, (short) 37, (short) -81, (short) -22, (short) -126), "Light Style 1 - Accent 3");
        m68909k4(21, new C14047bz(3530621609L, 33552, 18277, (short) -87, (short) 53, (short) -95, (short) -111, (short) 27, (short) 0, (short) -54, (short) 85), "Light Style 1 - Accent 4");
        m68909k4(22, new C14047bz(1511069973, (short) -16842, (short) 19969, (byte) -89, (byte) -27, (byte) 4, (byte) -79, (byte) 103, PatternStyle.Divot, (byte) -83, PatternStyle.Vertical), "Light Style 2 - Accent 5");
        m68909k4(23, new C14047bz(1758605555, (short) -12416, (short) 18521, (byte) -116, (byte) -25, (byte) -92, (byte) 62, (byte) -24, (byte) 25, (byte) -109, (byte) -75), "Light Style 1 - Accent 6");
        m68909k4(24, new C14047bz(2123774420, (short) -7198, (short) 19764, (byte) -110, (byte) -124, (byte) 90, (byte) 33, (byte) -107, (byte) -77, (byte) -48, (byte) -41), "Light Style 2");
        m68909k4(25, new C14047bz(1761685197, (short) 20988, (short) 16881, (byte) -86, (byte) -115, (byte) 27, (byte) 36, (byte) -125, (byte) -51, (byte) 102, (byte) 62), "Light Style 2 - Accent 1");
        m68909k4(26, new C14047bz(1921202178, (short) -271, (short) 19577, (byte) -115, (byte) 93, (byte) 20, (byte) -49, (byte) 30, (byte) -81, (byte) -104, (byte) -39), "Light Style 2 - Accent 2");
        m68909k4(27, new C14047bz(4074660821L, 39290, 17990, (short) -93, (short) 119, (short) 71, (short) 2, (short) 103, (short) 58, (short) 114, (short) -115), "Light Style 2 - Accent 3");
        m68909k4(28, new C14047bz(4121631849L, 28379, 20468, (short) -104, (short) 63, (short) 24, (short) -67, (short) 33, (short) -98, (short) -13, (short) 34), "Medium Style 2 - Accent 3");
        m68909k4(29, new C14047bz(10574933, (short) -31465, (short) 17066, (byte) -74, (byte) 20, (byte) -23, (byte) -71, (byte) 73, (byte) 16, (byte) -29, (byte) -109), "Medium Style 2 - Accent 4");
        m68909k4(30, new C14047bz(2112980608, (short) -8108, (short) 16813, (byte) -117, (byte) -63, (byte) -47, (byte) -82, (byte) -9, (byte) 114, (byte) 68, (byte) 13), "Medium Style 2 - Accent 5");
        m68909k4(31, new C14047bz(2435615877L, 20976, 18718, (short) -105, (short) 116, (short) 57, (short) 0, (short) -81, (short) -17, (short) 15, (short) -41), "Light Style 2 - Accent 6");
        m68909k4(32, new C14047bz(388573742, (short) -3277, (short) 17403, (byte) -106, (byte) 33, (byte) 92, (byte) -69, (byte) -25, (byte) -3, (byte) -51, (byte) -53), "Light Style 2 - Accent 4");
        m68909k4(33, new C14047bz(1634574864, (short) -1189, (short) 16728, (byte) -75, (byte) -32, (byte) -2, (byte) -73, PatternStyle.Cross, (byte) -12, (byte) 25, (byte) -70), "Light Style 3");
        m68909k4(34, new C14047bz(3163156374L, 36074, 18175, (short) -122, (short) -60, (short) 76, (short) -32, (short) -25, (short) 96, (short) -104, (short) 2), "Light Style 3 - Accent 1");
        m68909k4(35, new C14047bz(568635044, (short) -29190, (short) 19081, (byte) -121, (byte) -21, (byte) 73, (byte) -61, (byte) 38, (byte) 98, (byte) -81, (byte) -32), "Medium Style 2 - Accent 2");
        m68909k4(36, new C14047bz(1570995584, (short) 25652, (short) 17616, (byte) -96, (byte) 40, (byte) 27, (byte) 34, (byte) -90, (byte) -106, (byte) 0, (byte) 111), "Light Style 3 - Accent 2");
        m68909k4(37, new C14047bz(2274996795L, 60547, 18054, (short) -77, (short) 10, (short) 81, (short) 36, (short) 19, (short) -75, (short) -26, (short) 122), "Light Style 3 - Accent 3");
        m68909k4(38, new C14047bz(3976739558L, 18170, 19033, (short) -113, (short) -80, (short) -97, (short) -105, (short) -21, (short) 16, (short) 113, (short) -97), "Light Style 3 - Accent 4");
        m68909k4(39, new C14047bz(3183400297L, 18327, 19953, (short) -96, (short) -12, (short) 106, (short) -85, (short) 60, (short) -39, (short) -126, (short) -40), "Light Style 3 - Accent 5");
        m68909k4(40, new C14047bz(3903914796L, 59960, 20229, (short) -70, (short) 13, (short) 56, (short) -81, (short) -1, (short) -57, (short) -66, (short) -45), "Light Style 3 - Accent 6");
        m68909k4(41, new C14047bz(2034074063, (short) -27406, (short) 16410, (byte) -70, (byte) 87, (byte) -110, (byte) -11, (byte) -89, (byte) -78, (byte) -48, (byte) -59), "Medium Style 1");
        m68909k4(42, new C14047bz(3003234337L, 41471, 16759, (short) -82, (short) -25, (short) 118, (short) -46, (short) 18, (short) 25, (short) 26, (short) 9), "Medium Style 1 - Accent 1");
        m68909k4(43, new C14047bz(2647325165L, 2012, 18961, (short) -115, (short) 127, (short) 87, (short) -77, (short) 92, (short) 37, (short) 104, (short) 46), "Medium Style 1 - Accent 2");
        m68909k4(44, new C14047bz(535606488, (short) -9470, (short) 19910, (byte) -96, (byte) -94, (byte) 79, PatternStyle.Divot, (byte) -70, (byte) -31, (byte) -36, (byte) -112), "Medium Style 1 - Accent 3");
        m68909k4(45, new C14047bz(504830259, (short) 17945, (short) 19985, (byte) -102, (byte) 63, (byte) -9, (byte) 96, (byte) -115, (byte) -9, (byte) 95, UnsignedBytes.MAX_POWER_OF_TWO), "Medium Style 1 - Accent 4");
        m68909k4(46, new C14047bz(4206874403L, 15209, 18063, (short) -74, (short) -97, (short) -120, (short) -10, (short) -34, (short) 106, (short) 114, (short) -14), "Medium Style 1 - Accent 5");
        m68909k4(47, new C14047bz(279033301, (short) -25703, (short) 19509, (byte) -92, (byte) 34, (byte) 41, (byte) -110, (byte) 116, (byte) -56, (byte) 118, (byte) 99), "Medium Style 1 - Accent 6");
        m68909k4(48, new C14047bz(2468964368L, 43141, 19427, (short) -93, (short) -25, (short) 109, (short) 91, (short) -18, (short) -91, (short) -113, (short) 53), "Medium Style 2 - Accent 6");
        m68909k4(49, new C14047bz(2395082293L, 41334, 16402, (short) -68, (short) 94, (short) -109, (short) 92, (short) -1, (short) -8, (short) 112, (short) -114), "Medium Style 3");
        m68909k4(50, new C14047bz(1847977545, (short) 16150, (short) 19970, (byte) -89, PatternStyle.Cross, (byte) 25, (byte) -46, (byte) -51, (byte) -65, (byte) 72, (byte) -16), "Medium Style 3 - Accent 1");
        m68909k4(51, new C14047bz(2243831356L, 56279, 18976, (short) -69, (short) 89, (short) -86, (short) -77, (short) 10, (short) -54, (short) -90, (short) 90), "Medium Style 3 - Accent 2");
        m68909k4(52, new C14047bz(3946073476L, 39675, 18814, (short) -93, (short) -109, (short) -36, (short) 51, (short) 107, (short) -95, (short) -99, (short) 46), "Medium Style 3 - Accent 3");
        m68909k4(53, new C14047bz(3952488885L, 30962, 16841, (short) -122, (short) -101, (short) -97, (short) 57, (short) 6, (short) 111, (short) -127, (short) 4), "Medium Style 3 - Accent 4");
        m68909k4(54, new C14047bz(1958848675, (short) 12394, (short) 20151, (byte) -90, (byte) -79, (byte) 79, (byte) 126, (byte) 14, (byte) -71, (byte) -59, (byte) -42), "Medium Style 3 - Accent 5");
        m68909k4(55, new C14047bz(709395234, (short) -3398, (short) 19291, (byte) -105, (byte) 72, (byte) 13, (byte) 71, (byte) 66, (byte) 113, UnsignedBytes.MAX_POWER_OF_TWO, (byte) -113), "Medium Style 3 - Accent 6");
        m68909k4(56, new C14047bz(3618389194L, 51095, 18577, (short) -66, (short) 2, (short) -39, (short) 78, (short) 67, (short) 66, (short) 91, (short) 120), "Medium Style 4");
        m68909k4(57, new C14047bz(1775180466, (short) 6518, (short) 17666, (byte) -65, PatternStyle.DiagonalCross, (byte) 63, (byte) -11, (byte) -22, (byte) 33, (byte) -120, (byte) 97), "Medium Style 4 - Accent 1");
        m68909k4(58, new C14047bz(2316335190L, 21844, 17147, (short) -80, (short) 62, (short) 57, (short) -11, (short) -37, (short) -61, (short) 112, (short) -70), "Medium Style 4 - Accent 2");
        m68909k4(59, new C14047bz(84272111, (short) 26602, (short) 17259, (byte) -105, (byte) -78, (byte) 1, (byte) 36, (byte) -64, (byte) 110, (byte) -67, (byte) 36), "Medium Style 4 - Accent 3");
        m68909k4(60, new C14047bz(3299939690L, 14350, 20344, (short) -67, (short) -11, (short) -90, (short) 6, (short) -88, (short) 8, (short) 59, (short) -7), "Medium Style 4 - Accent 4");
        m68909k4(61, new C14047bz(579046383, (short) -29774, (short) 17560, (byte) -124, (byte) -89, (byte) -59, (byte) -123, (byte) 31, (byte) 89, (byte) 61, (byte) -15), "Medium Style 4 - Accent 5");
        m68909k4(62, new C14047bz(383383150, (short) 24249, (short) 18562, (byte) -122, (byte) -5, (byte) -36, (byte) -65, PatternStyle.UpwardDiagonal, (byte) -29, (byte) -61, (byte) -28), "Medium Style 4 - Accent 6");
        m68909k4(63, new C14047bz(3892530808L, 32605, 19502, (short) -77, (short) 117, (short) -4, (short) 100, (short) -78, (short) 123, (short) -55, (short) 23), "Dark Style 1");
        m68909k4(64, new C14047bz(308170870, (short) 14352, (short) 18397, (byte) -73, (byte) -97, (byte) 103, (byte) 77, (byte) 122, (byte) -44, (byte) 12, (byte) 1), "Dark Style 1 - Accent 1");
        m68909k4(65, new C14047bz(936281331, (short) 10435, (short) 17470, (byte) -98, (byte) -106, (byte) -103, (byte) -49, (byte) -126, (byte) 81, PatternStyle.Sphere, (byte) 120), "Dark Style 1 - Accent 2");
        m68909k4(66, new C14047bz(3493087163L, 23911, 18795, (short) -114, (short) -121, (short) -27, (short) 97, (short) 7, (short) 90, (short) -43, (short) 92), "Dark Style 1 - Accent 3");
        m68909k4(67, new C14047bz(3911842292L, 19087, 17190, (short) -95, (short) -76, (short) 34, (short) -124, (short) -105, (short) 19, (short) -35, (short) -85), "Dark Style 1 - Accent 4");
        m68909k4(68, new C14047bz(2413052990L, 63881, 20420, (short) -96, (short) -56, (short) -43, (short) -94, (short) -81, (short) 31, (short) 57, (short) 11), "Dark Style 1 - Accent 5");
        m68909k4(69, new C14047bz(2942330963L, 30321, 18794, (short) -114, (short) 79, (short) -33, (short) 113, (short) -8, (short) -20, (short) -111, (short) -117), "Dark Style 1 - Accent 6");
        m68909k4(70, new C14047bz(1375908042, (short) -940, (short) 17558, (byte) -117, (byte) -54, (byte) 94, (byte) -10, (byte) 106, (byte) -127, (byte) -115, (byte) 41), "Dark Style 2");
        m68909k4(71, new C14047bz(107000840, (short) -19505, (short) 19092, (byte) -123, (byte) -4, PatternStyle.Sphere, (byte) 30, (byte) 10, (byte) 69, (byte) -12, (byte) -94), "Dark Style 2 - Accent 1/Accent 2");
        m68909k4(72, new C14047bz(2448145356L, 56018, 17820, (short) -66, (short) 46, (short) -10, (short) -34, (short) 53, (short) -49, (short) -102, (short) 40), "Dark Style 2 - Accent 3/Accent 4");
        m68909k4(73, new C14047bz(1190695081, (short) 10247, (short) 20155, (byte) -72, (byte) 29, (byte) -78, (byte) -86, (byte) 120, (byte) -20, Ascii.DEL, (byte) 57), "Dark Style 2 - Accent 5/Accent 6");
        m68909k4(74, new C14047bz(1607530577, (short) -5030, (short) 19768, (byte) -80, (byte) -83, UnsignedBytes.MAX_POWER_OF_TWO, (byte) -109, (byte) -20, (byte) 16, (byte) -13, (byte) 56), "Light Style 1 - Accent 5");
    }

    public oyy(Presentation presentation) {
        super(presentation);
        this.f47983k4 = new Dictionary<>();
        this.f47984x1 = new g5z();
        m68910k4().m6438k4(new C14047bz("5C22544A-7EE6-4342-B048-85BDC9FD1C3A"));
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<x5o> iterator() {
        return m68910k4().m6437k4().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final g5z m68910k4() {
        return this.f47984x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m68915x1(C14047bz c14047bz) {
        Integer[] numArr = {0};
        boolean zTryGetValue = f47981kk.tryGetValue(c14047bz.Clone(), numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            return iIntValue;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m68911k4(int i) {
        C14047bz c14047bz = new C14047bz();
        C14047bz[] c14047bzArr = {c14047bz};
        boolean zTryGetValue = f47982to.tryGetValue(Integer.valueOf(i), c14047bzArr);
        c14047bzArr[0].CloneTo(c14047bz);
        return zTryGetValue ? c14047bz : C14047bz.f47172k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final x5o m68912k4(C14047bz c14047bz) {
        x5o x5oVar = this.f47983k4.containsKey(c14047bz.Clone()) ? this.f47983k4.get_Item(c14047bz.Clone()) : null;
        if (x5oVar != null) {
            return x5oVar;
        }
        int iM68915x1 = m68915x1(c14047bz.Clone());
        if (iM68915x1 == -1) {
            return null;
        }
        return ypt.m74013k4(this, iM68915x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final x5o m68913k4(C14047bz c14047bz, String str) {
        x5o x5oVar = new x5o(this, c14047bz.Clone(), str);
        m68914k4(x5oVar);
        return x5oVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68909k4(int i, C14047bz c14047bz, String str) {
        f47981kk.addItem(c14047bz.Clone(), Integer.valueOf(i));
        f47982to.addItem(Integer.valueOf(i), c14047bz.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68914k4(x5o x5oVar) {
        this.f47983k4.addItem(x5oVar.m73127k4().m74873k4().Clone(), x5oVar);
        m68910k4().m6437k4().addItem(x5oVar);
    }
}
