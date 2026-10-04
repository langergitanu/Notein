package com.aspose.slides;

import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.nimbusds.jose.shaded.json.parser.JSONParser;

/* JADX INFO: renamed from: com.aspose.slides.ot */
/* JADX INFO: loaded from: classes3.dex */
class C14251ot {

    /* JADX INFO: renamed from: up */
    private static final Dictionary<String, Dictionary<Integer, Integer>> f47915up = m68806c5();

    /* JADX INFO: renamed from: c5 */
    private final boolean f47916c5;

    /* JADX INFO: renamed from: ck */
    private final boolean f47917ck;

    /* JADX INFO: renamed from: du */
    private final float f47918du;

    /* JADX INFO: renamed from: dy */
    private final int f47919dy;

    /* JADX INFO: renamed from: fa */
    private Dictionary<Integer, Integer> f47920fa;

    /* JADX INFO: renamed from: h4 */
    private byte f47921h4;

    /* JADX INFO: renamed from: jd */
    private float f47922jd;

    /* JADX INFO: renamed from: k4 */
    public final String f47923k4;

    /* JADX INFO: renamed from: kk */
    private final C5659x1 f47924kk;

    /* JADX INFO: renamed from: m9 */
    private final int f47925m9;

    /* JADX INFO: renamed from: to */
    private final boolean f47926to;

    /* JADX INFO: renamed from: x1 */
    private final C12013m9 f47927x1;

    /* JADX WARN: Type inference failed for: r3v11, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r3v12, types: [float, java.lang.String] */
    public C14251ot(String str, byte b, int i, float f, int i2, boolean z, boolean z2, C5659x1 c5659x1, C12013m9 c12013m9, boolean z3) {
        this.f47922jd = Float.NaN;
        this.f47918du = f;
        this.f47921h4 = b;
        this.f47919dy = i2;
        this.f47923k4 = str;
        this.f47925m9 = i;
        this.f47916c5 = z;
        this.f47926to = z2;
        this.f47924kk = c5659x1;
        this.f47917ck = z3;
        if (z2) {
            float fM67477k4 = (float) C14116yg.m67477k4(c5659x1.m23115h4(), 1);
            this.f47922jd = fM67477k4;
            if (fM67477k4 == 0.0f) {
                float fM48189ix = c5659x1.m23120k4().m48189ix() * 1000;
                this.f47922jd = MD5.getMessageDigest(r3.m48231u4() * 1000);
            }
        }
        this.f47927x1 = c12013m9;
        Dictionary<Integer, Integer>[] dictionaryArr = {this.f47920fa};
        f47915up.tryGetValue(str, dictionaryArr);
        this.f47920fa = dictionaryArr[0];
    }

    /* JADX INFO: renamed from: c5 */
    private static Dictionary<String, Dictionary<Integer, Integer>> m68806c5() {
        Dictionary<String, Dictionary<Integer, Integer>> dictionary = new Dictionary<>();
        int[][] iArr = {new int[]{97, 945}, new int[]{98, 946}, new int[]{99, 967}, new int[]{100, 948}, new int[]{101, 949}, new int[]{102, 966}, new int[]{103, 947}, new int[]{104, 951}, new int[]{105, 953}, new int[]{106, 981}, new int[]{107, 954}, new int[]{108, 955}, new int[]{109, 956}, new int[]{110, 957}, new int[]{111, 959}, new int[]{112, JSONParser.MODE_JSON_SIMPLE}, new int[]{113, 952}, new int[]{114, 961}, new int[]{115, 963}, new int[]{116, 964}, new int[]{117, 965}, new int[]{118, 982}, new int[]{119, 969}, new int[]{120, 958}, new int[]{121, 968}, new int[]{122, 950}, new int[]{65, 913}, new int[]{66, 914}, new int[]{67, 935}, new int[]{68, 916}, new int[]{69, 917}, new int[]{70, 934}, new int[]{71, 915}, new int[]{72, 919}, new int[]{73, 921}, new int[]{74, 977}, new int[]{75, 922}, new int[]{76, 923}, new int[]{77, 924}, new int[]{78, 925}, new int[]{79, 927}, new int[]{80, 928}, new int[]{81, 920}, new int[]{82, 929}, new int[]{83, 931}, new int[]{84, 932}, new int[]{85, 933}, new int[]{86, 962}, new int[]{87, 937}, new int[]{88, 926}, new int[]{89, 936}, new int[]{90, 918}};
        Dictionary<Integer, Integer> dictionary2 = new Dictionary<>();
        for (int i = 0; i < AbstractC14092to.m67209k4(iArr, 2).m67266du(0); i++) {
            dictionary2.set_Item(Integer.valueOf(iArr[i][0]), Integer.valueOf(iArr[i][1]));
            dictionary2.set_Item(Integer.valueOf(iArr[i][1]), Integer.valueOf(iArr[i][0]));
        }
        dictionary.set_Item("Symbol", dictionary2);
        return dictionary;
    }

    /* JADX INFO: renamed from: du */
    public final float m68808du() {
        return this.f47922jd;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m68809dy() {
        return this.f47921h4;
    }

    public boolean equals(Object obj) {
        return m68815k4((C14251ot) C7019kk.m27452k4(obj, C14251ot.class));
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m68810h4() {
        return this.f47917ck;
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m68811k4() {
        return this.f47927x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m68816kk() {
        return this.f47926to ? this.f47927x1.m56642jd() : this.f47919dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m68817m9() {
        return this.f47918du;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m68818to() {
        return this.f47926to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C5659x1 m68819x1() {
        return this.f47924kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m68812k4(String str) {
        if (this.f47920fa == null) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        C9777kp c9777kpM48221m9 = m68819x1().m23120k4().m48221m9();
        for (int i = 0; i < str.length(); i++) {
            int iCodePointAt = str.codePointAt(i);
            Integer[] numArr = {0};
            boolean z = c9777kpM48221m9.m48102k4(iCodePointAt) == null && this.f47920fa.tryGetValue(Integer.valueOf(iCodePointAt), numArr) && c9777kpM48221m9.m48102k4(numArr[0].intValue()) != null;
            int iIntValue = numArr[0].intValue();
            if (z) {
                iCodePointAt = iIntValue;
            }
            c6765kp.m26780k4(C14080ne.m67037x1(Integer.valueOf(iCodePointAt)));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68813k4(char c) {
        if (this.f47924kk.m23120k4().m48174bv()) {
            byte[] bArrM68520k4 = C14236og.m68520k4(c, this.f47921h4);
            C9777kp c9777kpM48221m9 = this.f47924kk.m23120k4().m48221m9();
            for (byte b : bArrM68520k4) {
                int i = b & 255;
                if (i <= 255) {
                    C9797wp c9797wpM48102k4 = c9777kpM48221m9.m48102k4((char) (61440 + i));
                    if (c9797wpM48102k4 == null) {
                        c9797wpM48102k4 = c9777kpM48221m9.m48102k4((char) (61696 + i));
                    }
                    if (c9797wpM48102k4 == null) {
                        c9797wpM48102k4 = c9777kpM48221m9.m48102k4((char) (i + 61952));
                    }
                    if (c9797wpM48102k4 != null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68814k4(int i) {
        C9777kp c9777kpM48221m9 = m68819x1().m23120k4().m48221m9();
        if (c9777kpM48221m9.m48102k4(i) != null) {
            return true;
        }
        Integer[] numArr = {0};
        Dictionary<Integer, Integer> dictionary = this.f47920fa;
        return ((dictionary == null || !dictionary.tryGetValue(Integer.valueOf(i), numArr)) || c9777kpM48221m9.m48102k4(numArr[0].intValue()) == null) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68815k4(C14251ot c14251ot) {
        return m68807k4(c14251ot, this.f47923k4, this.f47921h4, this.f47925m9, this.f47919dy, this.f47918du, this.f47916c5);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m68807k4(C14251ot c14251ot, String str, byte b, int i, int i2, float f, boolean z) {
        return c14251ot != null && C14113y2.m67363du(c14251ot.f47923k4, str) && c14251ot.f47921h4 == b && c14251ot.f47925m9 == i && c14251ot.f47919dy == i2 && c14251ot.f47916c5 == z && C3085sv.m13089k4(c14251ot.f47918du, f);
    }
}
