package com.aspose.slides.internal.p474wg;

import androidx.core.content.OooO0O0;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p289n2.C6696ne;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.ts */
/* JADX INFO: loaded from: classes5.dex */
public class C11972ts {

    /* JADX INFO: renamed from: c5 */
    private int f40363c5;

    /* JADX INFO: renamed from: ck */
    private long f40364ck;

    /* JADX INFO: renamed from: dy */
    private long f40365dy;

    /* JADX INFO: renamed from: jd */
    private int[] f40366jd;

    /* JADX INFO: renamed from: k4 */
    public static final C11972ts f40358k4 = new C11972ts(C7019kk.m27438h4((Object) 0, 9));

    /* JADX INFO: renamed from: x1 */
    public static final C11972ts f40362x1 = m56130k4("255.255.255.255");

    /* JADX INFO: renamed from: kk */
    public static final C11972ts f40359kk = m56130k4("127.0.0.1");

    /* JADX INFO: renamed from: to */
    public static final C11972ts f40361to = m56130k4("255.255.255.255");

    /* JADX INFO: renamed from: du */
    public static final C11972ts f40356du = m56136kk("::");

    /* JADX INFO: renamed from: h4 */
    public static final C11972ts f40357h4 = m56136kk("::1");

    /* JADX INFO: renamed from: m9 */
    public static final C11972ts f40360m9 = m56136kk("::");

    public C11972ts(long j) {
        this.f40365dy = j;
        this.f40363c5 = 2;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m56129k4(int i, int i2, int i3, int i4) {
        return ((i ^ ((i2 >> 19) | (i2 << 13))) ^ ((i3 << 26) | (i3 >> 6))) ^ ((i4 << 7) | (i4 >> 25));
    }

    /* JADX INFO: renamed from: du */
    public int m56141du() {
        return this.f40363c5;
    }

    public boolean equals(Object obj) {
        C11972ts c11972ts = (C11972ts) C7019kk.m27452k4(obj, C11972ts.class);
        if (c11972ts == null || m56141du() != c11972ts.m56141du()) {
            return false;
        }
        if (m56141du() == 2) {
            return this.f40365dy == c11972ts.f40365dy;
        }
        int[] iArr = c11972ts.f40366jd;
        for (int i = 0; i < 8; i++) {
            if (C7019kk.m27457kk(Integer.valueOf(this.f40366jd[i]), 8) != C7019kk.m27457kk(Integer.valueOf(iArr[i]), 8)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f40363c5 == 2) {
            return C7019kk.m27462to(Long.valueOf(this.f40365dy), 11);
        }
        return m56129k4(C7019kk.m27462to(Integer.valueOf(this.f40366jd[1]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40366jd[0]), 8) << 16), C7019kk.m27462to(Integer.valueOf(this.f40366jd[3]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40366jd[2]), 8) << 16), C7019kk.m27462to(Integer.valueOf(this.f40366jd[5]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40366jd[4]), 8) << 16), C7019kk.m27462to(Integer.valueOf(this.f40366jd[7]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40366jd[6]), 8) << 16));
    }

    /* JADX INFO: renamed from: kk */
    public long m56143kk() {
        if (this.f40363c5 == 23) {
            return this.f40364ck;
        }
        throw new C6696ne(10045);
    }

    /* JADX INFO: renamed from: to */
    public byte[] m56144to() {
        return this.f40363c5 == 23 ? m56135k4(this.f40366jd) : new byte[]{C7019kk.m27442k4(Long.valueOf(this.f40365dy & C7019kk.m27438h4((Object) 255, 9)), 11), C7019kk.m27442k4(Long.valueOf((this.f40365dy >> 8) & C7019kk.m27438h4((Object) 255, 9)), 11), C7019kk.m27442k4(Long.valueOf((this.f40365dy >> 16) & C7019kk.m27438h4((Object) 255, 9)), 11), C7019kk.m27442k4(Long.valueOf(this.f40365dy >> 24), 11)};
    }

    public String toString() {
        if (this.f40363c5 == 2) {
            return m56131k4(this.f40365dy);
        }
        int[] iArr = (int[]) C7019kk.m27452k4(AbstractC14092to.m67208k4((Object) this.f40366jd).deepClone(), int[].class);
        for (int i = 0; i < AbstractC14092to.m67208k4((Object) iArr).m67265du(); i++) {
            iArr[i] = C7019kk.m27457kk(Short.valueOf(m56139x1(C7019kk.m27468x1(Integer.valueOf(iArr[i]), 8))), 7);
        }
        C11961qm c11961qm = new C11961qm(iArr);
        c11961qm.m56092k4(m56143kk());
        return c11961qm.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public long m56145x1() {
        return this.f40365dy;
    }

    public C11972ts(int[] iArr, long j) {
        this.f40366jd = iArr;
        for (int i = 0; i < 8; i++) {
            int[] iArr2 = this.f40366jd;
            iArr2[i] = C7019kk.m27457kk(Short.valueOf(m56132k4(C7019kk.m27468x1(Integer.valueOf(iArr2[i]), 8))), 7);
        }
        this.f40363c5 = 23;
        this.f40364ck = j;
    }

    /* JADX INFO: renamed from: kk */
    private static C11972ts m56136kk(String str) {
        C11961qm[] c11961qmArr = {null};
        boolean zM56091k4 = C11961qm.m56091k4(str, c11961qmArr);
        C11961qm c11961qm = c11961qmArr[0];
        if (zM56091k4) {
            return new C11972ts(c11961qm.m56093k4(), c11961qm.m56096x1());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0196 A[Catch: RuntimeException -> 0x01b2, LOOP:2: B:86:0x0190->B:88:0x0196, LOOP_END, TryCatch #0 {RuntimeException -> 0x01b2, blocks: (B:49:0x0101, B:52:0x0108, B:71:0x015a, B:74:0x0169, B:88:0x0196, B:90:0x01b5, B:65:0x014a, B:91:0x01bb), top: B:95:0x0101 }] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.aspose.slides.internal.wg.ts, com.aspose.slides.ms.System.kp] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C11972ts m56138x1(String str) {
        C11972ts c11972ts;
        int i;
        String strM67443x1 = str;
        int i2 = 3;
        int iM67429to = C14113y2.m67429to(strM67443x1, ControlChar.SPACE_CHAR);
        C11972ts c11972ts2 = null;
        if (iM67429to != -1) {
            String[] strArrM67369h4 = C14113y2.m67369h4(C14113y2.m67422kk(strM67443x1, iM67429to + 1), FilenameUtils.EXTENSION_SEPARATOR);
            if (AbstractC14092to.m67208k4((Object) strArrM67369h4).m67265du() > 0) {
                String str2 = strArrM67369h4[AbstractC14092to.m67208k4((Object) strArrM67369h4).m67265du() - 1];
                if (str2.length() == 0) {
                    return null;
                }
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    if (!C14062gk.m66654kk(str2.charAt(i3))) {
                        return null;
                    }
                }
            }
            strM67443x1 = C14113y2.m67443x1(strM67443x1, 0, iM67429to);
        }
        if (strM67443x1.length() == 0 || OooO0O0.OooO00o(1, strM67443x1) == '.') {
            return null;
        }
        String[] strArrM67369h42 = C14113y2.m67369h4(strM67443x1, FilenameUtils.EXTENSION_SEPARATOR);
        if (AbstractC14092to.m67208k4((Object) strArrM67369h42).m67265du() > 4) {
            return null;
        }
        try {
            long jM27438h4 = C7019kk.m27438h4((Object) 0, 9);
            long jM27438h42 = C7019kk.m27438h4((Object) 0, 9);
            int i4 = 0;
            while (i4 < AbstractC14092to.m67208k4((Object) strArrM67369h42).m67265du()) {
                String str3 = strArrM67369h42[i4];
                try {
                    if (i2 > str3.length() || str3.length() > 4 || str3.charAt(0) != '0') {
                        c11972ts = c11972ts2;
                    } else {
                        c11972ts = c11972ts2;
                        if (str3.charAt(1) != 'x') {
                            try {
                                if (str3.charAt(1) == 'X') {
                                }
                                i = i2;
                                if (i4 != AbstractC14092to.m67208k4((Object) strArrM67369h42).m67265du() - 1) {
                                    if ((i4 != 0 && jM27438h42 >= (256 << ((3 - i4) * 8))) || jM27438h42 > 17179869182L) {
                                        return null;
                                    }
                                    i4 = i;
                                } else if (jM27438h42 >= 256) {
                                    return null;
                                }
                                int i5 = 0;
                                while (jM27438h42 > 0) {
                                    jM27438h4 |= (C7019kk.m27438h4((Object) 255, 9) & jM27438h42) << ((i4 - i5) << 3);
                                    i5++;
                                    jM27438h42 /= C7019kk.m27438h4((Object) 256, 9);
                                }
                                i4++;
                                i2 = i;
                                c11972ts2 = null;
                            } catch (RuntimeException unused) {
                                return c11972ts;
                            }
                        }
                        jM27438h42 = C7019kk.m27438h4(str3.length() == i2 ? Byte.valueOf(C7019kk.m27442k4(Integer.valueOf(C14062gk.m66635k4(str3.charAt(2))), 9)) : Byte.valueOf(C7019kk.m27442k4(Integer.valueOf((C14062gk.m66635k4(str3.charAt(2)) << 4) | C14062gk.m66635k4(str3.charAt(i2))), 9)), 6);
                        i = i2;
                        if (i4 != AbstractC14092to.m67208k4((Object) strArrM67369h42).m67265du() - 1) {
                        }
                        int i52 = 0;
                        while (jM27438h42 > 0) {
                        }
                        i4++;
                        i2 = i;
                        c11972ts2 = null;
                    }
                    if (str3.length() == 0) {
                        return c11972ts;
                    }
                    if (str3.charAt(0) == '0') {
                        jM27438h42 = C7019kk.m27438h4((Object) 0, 9);
                        int i6 = 1;
                        while (i6 < str3.length()) {
                            if ('0' <= str3.charAt(i6)) {
                                int i7 = i2;
                                if (str3.charAt(i6) <= '7') {
                                    jM27438h42 = ((jM27438h42 << i7) + C7019kk.m27438h4(Character.valueOf(str3.charAt(i6)), 4)) - C7019kk.m27438h4((Object) '0', 4);
                                    i6++;
                                    i2 = i7;
                                }
                            }
                            return c11972ts;
                        }
                        i = i2;
                        if (i4 != AbstractC14092to.m67208k4((Object) strArrM67369h42).m67265du() - 1) {
                        }
                        int i522 = 0;
                        while (jM27438h42 > 0) {
                        }
                        i4++;
                        i2 = i;
                        c11972ts2 = null;
                    } else {
                        i = i2;
                        long[] jArr = {jM27438h42};
                        ?? r7 = c11972ts;
                        boolean zM67189k4 = C14091t6.m67189k4(str3, 0, r7, jArr);
                        long j = jArr[0];
                        if (!zM67189k4) {
                            return r7;
                        }
                        jM27438h42 = j;
                        if (i4 != AbstractC14092to.m67208k4((Object) strArrM67369h42).m67265du() - 1) {
                        }
                        int i5222 = 0;
                        while (jM27438h42 > 0) {
                        }
                        i4++;
                        i2 = i;
                        c11972ts2 = null;
                    }
                } catch (RuntimeException unused2) {
                    return null;
                }
            }
            return new C11972ts(jM27438h4);
        } catch (RuntimeException unused3) {
            return c11972ts2;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public long m56142k4() {
        if (this.f40363c5 == 2) {
            return this.f40365dy;
        }
        throw new Exception("The attempted operation is not supported for the type of object referenced");
    }

    /* JADX INFO: renamed from: k4 */
    public static C11972ts m56130k4(String str) {
        C11972ts[] c11972tsArr = {null};
        boolean zM56134k4 = m56134k4(str, c11972tsArr);
        C11972ts c11972ts = c11972tsArr[0];
        if (zM56134k4) {
            return c11972ts;
        }
        throw new FormatException("An invalid IP address was specified.");
    }

    /* JADX INFO: renamed from: kk */
    private static short m56137kk(short s) {
        return (short) (((s << 8) & 65280) | ((s >> 8) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m56131k4(long j) {
        return C14113y2.m67408k4(C14091t6.m67191x1(C7019kk.m27438h4((Object) 255, 9) & j), ".", C14091t6.m67191x1((j >> 8) & C7019kk.m27438h4((Object) 255, 9)), ".", C14091t6.m67191x1((j >> 16) & C7019kk.m27438h4((Object) 255, 9)), ".", C14091t6.m67191x1((j >> 24) & C7019kk.m27438h4((Object) 255, 9)));
    }

    /* JADX INFO: renamed from: k4 */
    public static short m56132k4(short s) {
        return m56137kk(s);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56133k4(C11972ts c11972ts) {
        if (c11972ts.f40363c5 == 2) {
            return (c11972ts.f40365dy & C7019kk.m27438h4((Object) 255, 9)) == 127;
        }
        for (int i = 0; i < 6; i++) {
            if (C7019kk.m27457kk(Integer.valueOf(c11972ts.f40366jd[i]), 8) != 0) {
                return false;
            }
        }
        return m56139x1(C7019kk.m27468x1(Integer.valueOf(c11972ts.f40366jd[7]), 8)) == 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static short m56139x1(short s) {
        return m56137kk(s);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56134k4(String str, C11972ts[] c11972tsArr) {
        if (str == null) {
            throw new ArgumentNullException("ipString");
        }
        C11972ts c11972tsM56138x1 = m56138x1(str);
        c11972tsArr[0] = c11972tsM56138x1;
        if (c11972tsM56138x1 != null) {
            return true;
        }
        C11972ts c11972tsM56136kk = m56136kk(str);
        c11972tsArr[0] = c11972tsM56136kk;
        return c11972tsM56136kk != null;
    }

    /* JADX INFO: renamed from: x1 */
    private short[] m56140x1(int[] iArr) {
        int length = iArr.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) iArr[i];
        }
        return sArr;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m56135k4(int[] iArr) {
        int length = iArr.length * 2;
        byte[] bArr = new byte[length];
        C14058fa.m66600k4(m56140x1(iArr), 0, bArr, 0, length);
        return bArr;
    }
}
