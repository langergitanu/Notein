package com.aspose.slides.internal.p077d8;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.sv */
/* JADX INFO: loaded from: classes3.dex */
public class C3085sv {

    /* JADX INFO: renamed from: k4 */
    private static final boolean f9155k4 = m13109x1();

    /* JADX INFO: renamed from: x1 */
    private static final boolean[] f9157x1 = m13100k4(128, 32, 35, 37, 38, 91, 93, 94, 96, 123, 125, 127);

    /* JADX INFO: renamed from: kk */
    private static final char[] f9156kk = {IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS};

    /* JADX INFO: renamed from: du */
    public static String m13066du(String str) {
        return C14113y2.m67401k4(str, " ", C18115b5.CONNECTOR);
    }

    /* JADX INFO: renamed from: h4 */
    public static long[] m13068h4(List<Long> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = list.get_Item(i).longValue();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m13069k4(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    /* JADX INFO: renamed from: kk */
    public static long m13101kk(long j) {
        long j2 = j & 4294967295L;
        long j3 = j2 - ((j2 >> 1) & 1431655765);
        long j4 = ((j3 & 858993459) + (((j3 & 4294967295L) >> 2) & 858993459)) & 4294967295L;
        return (((((j4 + ((j4 >> 4) & 4294967295L)) & 252645135) * 16843009) & 4294967295L) >> 24) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    public static String m13104to(String str) {
        return C14113y2.m67362du(C3141rv.m13406kk(str), f9156kk);
    }

    /* JADX INFO: renamed from: x1 */
    public static C14084qq m13106x1(long j) {
        return C14084qq.m67120x1(((j >> 32) & 4294967295L) | ((j & 4294967295L) << 32));
    }

    /* JADX INFO: renamed from: du */
    public static float[] m13067du(List<Float> list) {
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = list.get_Item(i).floatValue();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m13070k4(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m13102kk(String str) {
        if (C14113y2.m67411k4(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (C14117yj.m67531kk(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public static double[] m13105to(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get_Item(i).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m13107x1(String str) {
        if (C14113y2.m67411k4(str)) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!C14117yj.m67531kk(cCharAt)) {
                c6765kp.m26780k4(cCharAt);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13071k4(int i) {
        return i >= 0 ? i : i + 65536;
    }

    /* JADX INFO: renamed from: kk */
    public static int[] m13103kk(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get_Item(i).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> void m13108x1(T[] tArr, T[] tArr2) {
        T t = tArr[0];
        tArr[0] = tArr2[0];
        tArr2[0] = t;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13072k4(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m13109x1() {
        try {
            String property = System.getProperty("java.version");
            String property2 = System.getProperty("java.vm.name");
            if (C12567ne.f42086x1 && property.startsWith("1.8.")) {
                if (property2.startsWith("Open")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            m13082k4(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13073k4(short s) {
        return s >= 0 ? s : s + 65536;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m13110x1(List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get_Item(i).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> int m13074k4(T[] tArr, AbstractC14041ai<T> abstractC14041ai) {
        if (tArr != null && tArr.length != 0) {
            for (int i = 0; i < tArr.length; i++) {
                if (abstractC14041ai.invoke(tArr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m13075k4(C12003du c12003du) {
        return ((((long) (((c12003du.m56505fa() & 255) << 16) | ((c12003du.m56502ck() & 255) << 8))) & 4294967295L) | ((long) (c12003du.m56507jd() & 255))) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m13076k4(C14084qq c14084qq) {
        long jM67157x6 = c14084qq.m67157x6();
        return ((jM67157x6 >> 32) & 4294967295L) | ((jM67157x6 & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m13077k4(int i, long j) {
        long j2 = 4294967295L & j;
        return C12003du.m56398k4(i, (int) (j & 255), (int) ((j2 >> 8) & 255), (int) ((j2 >> 16) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m13078k4(long j) {
        long j2 = 4294967295L & j;
        return C12003du.m56397k4((int) (j & 255), (int) ((j2 >> 8) & 255), (int) ((j2 >> 16) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13079k4(C3134k4 c3134k4) {
        C6765kp c6765kp = new C6765kp();
        while (true) {
            int iM13387yj = c3134k4.m13387yj() & 255;
            if (iM13387yj == 0) {
                return c6765kp.toString();
            }
            c6765kp.m26780k4((char) iM13387yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13080k4(String str) {
        try {
            C14062gk c14062gk = new C14062gk(str);
            if (!c14062gk.m66679dy()) {
                return c14062gk.m66697x1();
            }
            C6765kp c6765kp = new C6765kp("file:///");
            String strM66677ck = c14062gk.m66677ck();
            for (int i = 0; i < strM66677ck.length(); i++) {
                char cCharAt = strM66677ck.charAt(i);
                long j = cCharAt;
                if ((4294967295L & j) >= 128 || !f9157x1[(int) j]) {
                    c6765kp.m26780k4(cCharAt);
                } else {
                    c6765kp.m26792k4(C14113y2.m67402k4("%{0:x2}", Long.valueOf(j)));
                }
            }
            String string = c6765kp.toString();
            return (C12567ne.f42086x1 && string.contains("////")) ? string.replace("////", "///") : string;
        } catch (RuntimeException e) {
            m13082k4(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13081k4(C3149x1 c3149x1, String str) {
        for (int i = 0; i < str.length(); i++) {
            c3149x1.m13444k4(str.charAt(i));
        }
        c3149x1.m13443k4((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13082k4(Throwable th) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13083k4(boolean z, String str) {
        if (!z) {
            throw new ApplicationException(C14113y2.m67408k4("Debug assertion failed.\n", str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13084k4(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = b;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13085k4(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = j;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13086k4(C12003du[] c12003duArr, C12003du[] c12003duArr2) {
        C12003du c12003duClone = c12003duArr[0].Clone();
        c12003duArr[0] = c12003duArr2[0].Clone();
        c12003duArr2[0] = c12003duClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13087k4() {
        return !f9155k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13088k4(double d, double d2) {
        boolean zM66437kk = C14044b3.m66437kk(d);
        if (zM66437kk == C14044b3.m66437kk(d2)) {
            if (zM66437kk) {
                return true;
            }
            boolean zM66439x1 = C14044b3.m66439x1(d);
            if (zM66439x1 == C14044b3.m66439x1(d2)) {
                if (zM66439x1) {
                    return ((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)) < 0) == ((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1)) < 0);
                }
                if (d == d2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13089k4(float f, float f2) {
        boolean zM66715kk = C14064he.m66715kk(f);
        if (zM66715kk == C14064he.m66715kk(f2)) {
            if (zM66715kk) {
                return true;
            }
            boolean zM66717x1 = C14064he.m66717x1(f);
            if (zM66717x1 == C14064he.m66717x1(f2)) {
                if (zM66717x1) {
                    return ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0) == ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) < 0);
                }
                if (f == f2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13090k4(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13091k4(float[] fArr, float[] fArr2) {
        if (fArr == null && fArr2 == null) {
            return true;
        }
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
            return false;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (!m13089k4(fArr[i], fArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> boolean m13092k4(T[] tArr, T[] tArr2) {
        if (tArr == null && tArr2 == null) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (!m13090k4(tArr[i], tArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static char[] m13093k4(List<Character> list) {
        int size = list.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = list.get_Item(i).charValue();
        }
        return cArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m13094k4(AbstractC14092to abstractC14092to) {
        int size = abstractC14092to.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Long) abstractC14092to.get_Item(i)).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static Bitmap[] m13095k4(C12009k4[] c12009k4Arr) {
        Bitmap[] bitmapArr = new Bitmap[c12009k4Arr.length];
        int i = 0;
        while (i < c12009k4Arr.length) {
            try {
                bitmapArr[i] = (Bitmap) C12009k4.m56588k4(c12009k4Arr[i]);
                i++;
            } finally {
                C12009k4 c12009k4 = c12009k4Arr[i];
                if (c12009k4 != null) {
                    c12009k4.dispose();
                }
            }
        }
        return bitmapArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static PointF[] m13096k4(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            return new PointF[0];
        }
        PointF[] pointFArr = new PointF[c12025x6Arr.length];
        for (int i = 0; i < c12025x6Arr.length; i++) {
            pointFArr[i] = (PointF) C12025x6.m56887x1(c12025x6Arr[i]);
        }
        return pointFArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m13097k4(PointF[] pointFArr) {
        if (pointFArr == null) {
            return new C12025x6[0];
        }
        C12025x6[] c12025x6Arr = new C12025x6[pointFArr.length];
        for (int i = 0; i < pointFArr.length; i++) {
            c12025x6Arr[i] = C12025x6.m56882k4(pointFArr[i]);
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C14093tq<T>[] m13098k4(Class<T> cls, int i) {
        C14093tq<T>[] c14093tqArr = new C14093tq[i];
        for (int i2 = 0; i2 < i; i2++) {
            c14093tqArr[i2] = new C14093tq<>();
        }
        return c14093tqArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static Byte[] m13099k4(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean[] m13100k4(int i, int... iArr) {
        boolean[] zArr = new boolean[i];
        for (int i2 : iArr) {
            zArr[i2] = true;
        }
        return zArr;
    }
}
