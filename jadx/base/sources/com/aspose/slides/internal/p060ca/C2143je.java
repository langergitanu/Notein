package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.TableStyleOptions;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.je */
/* JADX INFO: loaded from: classes3.dex */
public class C2143je {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.je$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: c5 */
        public static final k4 f7416c5;

        /* JADX INFO: renamed from: ck */
        public static final k4 f7417ck;

        /* JADX INFO: renamed from: du */
        public static final k4 f7418du;

        /* JADX INFO: renamed from: dy */
        public static final k4 f7419dy;

        /* JADX INFO: renamed from: fa */
        public static final k4[] f7420fa;

        /* JADX INFO: renamed from: h4 */
        public static final k4 f7421h4;

        /* JADX INFO: renamed from: jd */
        public static final k4 f7422jd;

        /* JADX INFO: renamed from: m9 */
        public static final k4 f7423m9;

        /* JADX INFO: renamed from: to */
        public static final k4 f7424to = new k4(-1, -1, (byte) 123);

        /* JADX INFO: renamed from: k4 */
        public final int f7425k4;

        /* JADX INFO: renamed from: kk */
        public final byte f7426kk;

        /* JADX INFO: renamed from: x1 */
        public final int f7427x1;

        static {
            k4 k4Var = new k4(0, 127, (byte) 0);
            f7418du = k4Var;
            k4 k4Var2 = new k4(128, 255, (byte) 1);
            f7421h4 = k4Var2;
            k4 k4Var3 = new k4(256, 383, (byte) 2);
            f7423m9 = k4Var3;
            k4 k4Var4 = new k4(384, 591, (byte) 3);
            f7419dy = k4Var4;
            k4 k4Var5 = new k4(2304, 2431, (byte) 15);
            f7416c5 = k4Var5;
            k4 k4Var6 = new k4(TableStyleOptions.DEFAULT_2003, 1791, (byte) 13);
            f7422jd = k4Var6;
            k4 k4Var7 = new k4(3072, 3199, (byte) 21);
            f7417ck = k4Var7;
            f7420fa = new k4[]{k4Var, k4Var2, k4Var3, k4Var4, k4Var6, k4Var5, k4Var7};
        }

        public k4(int i, int i2, byte b) {
            this.f7425k4 = i;
            this.f7427x1 = i2;
            this.f7426kk = b;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m10839k4(char c) {
            return c >= this.f7425k4 && c <= this.f7427x1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m10820k4(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, i3) - 1.0d), 14);
        if (i4 > 16) {
            throw new ArgumentException(C14113y2.m67402k4("incorrect arguments Offset={0}, Length = {1} in bit extraction", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i & 65535;
        if (i4 < 16) {
            i5 = (byte) (i5 >> (16 - i4));
        }
        byte b = (byte) (i5 & iM27462to);
        return (C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, (double) (i3 + (-1)))), 14) & b) == 0 ? b : (byte) (-((byte) (((byte) ((~b) + 1)) & iM27462to)));
    }

    /* JADX INFO: renamed from: kk */
    private static byte m10835kk(C2132iq c2132iq, int i, String str) {
        byte bByteValue;
        if (c2132iq.m10758x1().m10581x6() == null) {
            return (byte) 123;
        }
        List list = new List();
        int i2 = 0;
        while (i2 < 123) {
            int i3 = i2 < 32 ? 0 : i2 < 64 ? 1 : i2 < 96 ? 2 : 3;
            if (m10829k4(c2132iq.m10758x1().m10581x6().m10631rv()[i3], (i2 - (i3 * 32)) & 65535)) {
                list.addItem(Byte.valueOf((byte) i2));
            }
            i2++;
        }
        if (list.size() != 0) {
            List.Enumerator it = list.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        bByteValue = 123;
                        break;
                    }
                    bByteValue = ((Byte) C7019kk.m27464to(it.next(), Byte.TYPE)).byteValue();
                    if (m10833k4(str, bByteValue)) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            bByteValue = 123;
        }
        return bByteValue != 123 ? bByteValue : m10821k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m10836x1(char c) {
        return k4.f7418du.m10839k4(c);
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m10821k4(String str) {
        if (str.length() == 0) {
            return (byte) 123;
        }
        k4 k4VarM10823k4 = m10823k4(str.charAt(0));
        if (m10834k4(str, k4VarM10823k4)) {
            return k4VarM10823k4.f7426kk;
        }
        return (byte) 123;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m10837x1(C2132iq c2132iq, int i, String str) {
        C2092fz c2092fzM10758x1 = c2132iq.m10758x1();
        return (i == 1 ? c2092fzM10758x1.m10551ix() : c2092fzM10758x1.m10575ne()).m10955k4().m11696k4(str) != null;
    }

    /* JADX INFO: renamed from: k4 */
    private static k4 m10822k4(byte b) {
        return b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 13 ? b != 15 ? k4.f7424to : k4.f7416c5 : k4.f7422jd : k4.f7419dy : k4.f7423m9 : k4.f7421h4 : k4.f7418du;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m10838x1(C2379xz c2379xz, int i, int[] iArr, boolean z) {
        if (z) {
            if (i + iArr.length > c2379xz.m11721x1() - 1) {
                return false;
            }
        } else if (i - iArr.length < 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static k4 m10823k4(char c) {
        for (k4 k4Var : k4.f7420fa) {
            if (k4Var.m10839k4(c)) {
                return k4Var;
            }
        }
        return k4.f7424to;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m10824k4(C2132iq c2132iq, int i, String str) {
        byte bM10835kk = m10835kk(c2132iq, i, str);
        return bM10835kk == 123 ? m10825k4(c2132iq, i, new String[]{"DFLT"}) : (bM10835kk == 0 || bM10835kk == 1 || bM10835kk == 2 || bM10835kk == 3) ? m10825k4(c2132iq, i, new String[]{"latn"}) : bM10835kk != 13 ? bM10835kk != 15 ? bM10835kk != 21 ? m10825k4(c2132iq, i, new String[]{"DFLT"}) : m10825k4(c2132iq, i, new String[]{"telu", "tel2"}) : m10825k4(c2132iq, i, new String[]{"deva", "dev2"}) : m10825k4(c2132iq, i, new String[]{"arab"});
    }

    /* JADX INFO: renamed from: k4 */
    private static String m10825k4(C2132iq c2132iq, int i, String[] strArr) {
        for (String str : strArr) {
            if (m10837x1(c2132iq, i, str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m10826k4(C2231og c2231og, C2379xz c2379xz, int[] iArr, int[] iArr2) {
        iArr[0] = c2231og.m11192kk();
        iArr2[0] = c2231og.m11193to();
        if (c2231og.m11194x1() != 3) {
            return;
        }
        if ((c2379xz.m11719to() & 65535) != 0) {
            iArr[0] = c2231og.m11191du().m10506k4(c2379xz.m11719to() & 65535) + iArr[0];
        }
        if ((c2379xz.m11708du() & 65535) != 0) {
            iArr2[0] = c2231og.m11191du().m10506k4(c2379xz.m11708du() & 65535) + iArr2[0];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m10827k4(C2261qj c2261qj, C2328uu c2328uu, C2379xz c2379xz) {
        if ((c2261qj.m11287jd() & 1) != 0) {
            c2328uu.m11539to(c2328uu.m11533k4() + (c2261qj.m11291x1() & 65535));
        }
        if ((c2261qj.m11287jd() & 2) != 0) {
            c2328uu.m11531du(c2328uu.m11540x1() + (c2261qj.m11288kk() & 65535));
        }
        if ((c2261qj.m11287jd() & 4) != 0) {
            c2328uu.m11532h4(c2328uu.m11535kk() + (c2261qj.m11290to() & 65535));
        }
        if ((c2261qj.m11287jd() & 8) != 0) {
            c2328uu.m11537m9(c2328uu.m11538to() + (c2261qj.m11284du() & 65535));
        }
        if ((c2261qj.m11287jd() & 16) != 0 && (c2379xz.m11719to() & 65535) != 0) {
            c2328uu.m11539to(c2261qj.m11286h4().m10506k4(c2379xz.m11719to() & 65535) + c2328uu.m11533k4());
        }
        if ((c2261qj.m11287jd() & 32) != 0 && (c2379xz.m11708du() & 65535) != 0) {
            c2328uu.m11531du(c2261qj.m11289m9().m10506k4(c2379xz.m11708du() & 65535) + c2328uu.m11540x1());
        }
        if ((c2261qj.m11287jd() & 64) != 0 && (c2379xz.m11719to() & 65535) != 0) {
            c2328uu.m11532h4(c2261qj.m11285dy().m10506k4(c2379xz.m11719to() & 65535) + c2328uu.m11535kk());
        }
        if ((c2261qj.m11287jd() & 128) == 0 || (c2379xz.m11708du() & 65535) == 0) {
            return;
        }
        c2328uu.m11537m9(c2261qj.m11283c5().m10506k4(c2379xz.m11708du() & 65535) + c2328uu.m11538to());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10828k4(char c, k4 k4Var) {
        return k4Var.m10839k4(c) || m10836x1(c);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m10829k4(long j, int i) {
        int i2 = i & 65535;
        return i2 <= 31 && (((j & 4294967295L) & ((long) C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, (double) i2)), 14))) & 4294967295L) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m10830k4(AbstractC2220nx abstractC2220nx, C2240p6 c2240p6, AbstractC2320ug abstractC2320ug) {
        if (C2240p6.m11230k4(c2240p6.m11231k4().m10521x1(abstractC2220nx)) != 3) {
            return false;
        }
        if (abstractC2320ug.m11486x1().m11342k4()) {
            return true;
        }
        if (abstractC2320ug.m11486x1().m11344x1()) {
            if ((abstractC2320ug.m11484kk() & 65535) <= c2240p6.m11232kk().m11813x1().length - 1) {
                return c2240p6.m11232kk().m11813x1()[abstractC2320ug.m11484kk() & 65535].m11551x1(abstractC2220nx);
            }
            throw new C2243pd(C14113y2.m67402k4(C14113y2.m67408k4("Incorrect value of MarkFilteringSet field = {0} ", "for lookup type = {1}, when UseMarkFilteringSet bit is true"), Integer.valueOf(abstractC2320ug.m11484kk()), Integer.valueOf(abstractC2320ug.m11482k4())));
        }
        if ((abstractC2320ug.m11486x1().m11343kk() & 255) == 0) {
            return false;
        }
        if (c2240p6.m11233x1() != null) {
            return c2240p6.m11233x1().m10521x1(abstractC2220nx) != (abstractC2320ug.m11486x1().m11343kk() & 255);
        }
        throw new C2243pd(C14113y2.m67402k4(C14113y2.m67408k4("MarkAttachmentType field = {0} in lookup with type = {1}", " is not zero but Mark Attachment Class Definition table is absent", " in GDEF table"), Byte.valueOf(abstractC2320ug.m11486x1().m11343kk()), Integer.valueOf(abstractC2320ug.m11482k4())));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m10831k4(C2379xz c2379xz, int i, int[] iArr, C2083fb c2083fb, boolean z) {
        m10838x1(c2379xz, i, iArr, z);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if ((iArr[i2] & 65535) != c2083fb.m10521x1(c2379xz.m11711k4().get_Item(z ? i + 1 + i2 : (i - 1) - i2).m10719k4())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m10832k4(C2379xz c2379xz, int i, int[] iArr, boolean z) {
        if (!m10838x1(c2379xz, i, iArr, z)) {
            return false;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (AbstractC2220nx.m11180k4(c2379xz.m11711k4().get_Item(z ? i + 1 + i2 : (i - 1) - i2).m10719k4(), new C2334v6(iArr[i2] & 65535))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10833k4(String str, byte b) {
        if (str.length() == 0) {
            return false;
        }
        k4 k4VarM10822k4 = m10822k4(b);
        if (m10828k4(str.charAt(0), k4VarM10822k4)) {
            return m10834k4(str, k4VarM10822k4);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10834k4(String str, k4 k4Var) {
        for (int i = 1; i < str.length(); i++) {
            if (!m10828k4(str.charAt(i), k4Var)) {
                return false;
            }
        }
        return true;
    }
}
