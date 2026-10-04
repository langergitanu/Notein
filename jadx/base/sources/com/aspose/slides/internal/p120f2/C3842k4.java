package com.aspose.slides.internal.p120f2;

import androidx.core.content.OooO0O0;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p554zo.C13628k4;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.f2.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3842k4 {

    /* JADX INFO: renamed from: c5 */
    private int f10488c5;

    /* JADX INFO: renamed from: ck */
    private long f10489ck;

    /* JADX INFO: renamed from: dy */
    private long f10490dy;

    /* JADX INFO: renamed from: jd */
    private int[] f10491jd;

    /* JADX INFO: renamed from: k4 */
    public static C3842k4 f10483k4 = new C3842k4(0);

    /* JADX INFO: renamed from: x1 */
    public static C3842k4 f10487x1 = m15380k4("255.255.255.255");

    /* JADX INFO: renamed from: kk */
    public static C3842k4 f10484kk = m15380k4("127.0.0.1");

    /* JADX INFO: renamed from: to */
    public static C3842k4 f10486to = m15380k4("255.255.255.255");

    /* JADX INFO: renamed from: du */
    public static C3842k4 f10481du = m15384kk("::");

    /* JADX INFO: renamed from: h4 */
    public static C3842k4 f10482h4 = m15384kk("::1");

    /* JADX INFO: renamed from: m9 */
    public static C3842k4 f10485m9 = m15384kk("::");

    public C3842k4(long j) {
        this.f10490dy = j;
        this.f10488c5 = 2;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m15379k4(int i, int i2, int i3, int i4) {
        return ((i ^ ((i2 >> 19) | (i2 << 13))) ^ ((i3 << 26) | (i3 >> 6))) ^ ((i4 << 7) | (i4 >> 25));
    }

    public boolean equals(Object obj) {
        C3842k4 c3842k4 = obj instanceof C3842k4 ? (C3842k4) obj : null;
        if (c3842k4 == null || m15389kk() != c3842k4.m15389kk()) {
            return false;
        }
        if (m15389kk() == 2) {
            return this.f10490dy == c3842k4.f10490dy;
        }
        int[] iArr = c3842k4.f10491jd;
        for (int i = 0; i < 8; i++) {
            if (this.f10491jd[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f10488c5 == 2) {
            return (int) this.f10490dy;
        }
        int[] iArr = this.f10491jd;
        return m15379k4(((iArr[0] & 65535) << 16) + (iArr[1] & 65535), ((iArr[2] & 65535) << 16) + (iArr[3] & 65535), ((iArr[4] & 65535) << 16) + (iArr[5] & 65535), ((iArr[6] & 65535) << 16) + (iArr[7] & 65535));
    }

    /* JADX INFO: renamed from: kk */
    public int m15389kk() {
        return this.f10488c5;
    }

    public String toString() {
        if (this.f10488c5 == 2) {
            return m15381k4(this.f10490dy);
        }
        int[] iArr = (int[]) C7019kk.m27452k4(this.f10491jd.clone(), int[].class);
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = m15387x1((short) (iArr[i] & 65535));
        }
        C3843x1 c3843x1 = new C3843x1(iArr);
        c3843x1.m15400k4(m15390x1());
        return c3843x1.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public long m15390x1() {
        if (this.f10488c5 == 23) {
            return this.f10489ck;
        }
        throw new C13628k4(10045);
    }

    public C3842k4(int[] iArr, long j) {
        this.f10491jd = iArr;
        for (int i = 0; i < 8; i++) {
            int[] iArr2 = this.f10491jd;
            iArr2[i] = m15382k4((short) (iArr2[i] & 65535));
        }
        this.f10488c5 = 23;
        this.f10489ck = j;
    }

    /* JADX INFO: renamed from: kk */
    private static C3842k4 m15384kk(String str) {
        C3843x1[] c3843x1Arr = {null};
        boolean zM15398k4 = C3843x1.m15398k4(str, c3843x1Arr);
        C3843x1 c3843x1 = c3843x1Arr[0];
        if (zM15398k4) {
            return new C3842k4(c3843x1.m15401k4(), c3843x1.m15404x1());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static C3842k4 m15386x1(String str) {
        int i;
        int i2;
        long jM67184k4;
        String strM67443x1 = str;
        int i3 = 3;
        int i4 = 1;
        int iM67429to = C14113y2.m67429to(strM67443x1, ControlChar.SPACE_CHAR);
        if (iM67429to != -1) {
            strM67443x1 = C14113y2.m67443x1(strM67443x1, 0, iM67429to);
        }
        if (strM67443x1.length() != 0 && OooO0O0.OooO00o(1, strM67443x1) != '.') {
            String[] strArrM67369h4 = C14113y2.m67369h4(strM67443x1, FilenameUtils.EXTENSION_SEPARATOR);
            if (strArrM67369h4.length > 4) {
                return null;
            }
            int i5 = 0;
            long j = 0;
            while (i5 < strArrM67369h4.length) {
                try {
                    String str2 = strArrM67369h4[i5];
                    if (i3 <= str2.length() && str2.length() <= 4 && str2.charAt(0) == '0' && (str2.charAt(i4) == 'x' || str2.charAt(i4) == 'X')) {
                        jM67184k4 = ((byte) (str2.length() == i3 ? C14062gk.m66635k4(str2.charAt(2)) : C14062gk.m66635k4(str2.charAt(i3)) | (C14062gk.m66635k4(str2.charAt(2)) << 4))) & 255;
                        i = i3;
                        i2 = i4;
                    } else {
                        if (str2.length() == 0) {
                            return null;
                        }
                        if (str2.charAt(0) == '0') {
                            i = i3;
                            int i6 = i4;
                            long jCharAt = 0;
                            while (i6 < str2.length()) {
                                if ('0' <= str2.charAt(i6)) {
                                    int i7 = i4;
                                    if (str2.charAt(i6) <= '7') {
                                        jCharAt = ((jCharAt << i) + ((long) str2.charAt(i6))) - 48;
                                        i6++;
                                        i4 = i7;
                                    }
                                }
                                return null;
                            }
                            i2 = i4;
                            jM67184k4 = jCharAt;
                        } else {
                            i = i3;
                            i2 = i4;
                            jM67184k4 = C14091t6.m67184k4(str2, 0);
                        }
                    }
                    if (i5 == strArrM67369h4.length - 1) {
                        if ((i5 != 0 && jM67184k4 >= (256 << ((3 - i5) * 8))) || jM67184k4 > 17179869182L) {
                            return null;
                        }
                        i5 = i;
                    } else if (jM67184k4 >= 256) {
                        return null;
                    }
                    int i8 = 0;
                    while (jM67184k4 > 0) {
                        j |= (jM67184k4 & 255) << ((i5 - i8) << 3);
                        i8++;
                        jM67184k4 /= 256;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } catch (Exception unused) {
                }
            }
            return new C3842k4(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public long m15388k4() {
        return this.f10490dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3842k4 m15380k4(String str) {
        C3842k4[] c3842k4Arr = {null};
        boolean zM15383k4 = m15383k4(str, c3842k4Arr);
        C3842k4 c3842k4 = c3842k4Arr[0];
        if (zM15383k4) {
            return c3842k4;
        }
        throw new FormatException("An invalid IP address was specified.");
    }

    /* JADX INFO: renamed from: kk */
    private static short m15385kk(short s) {
        return (short) (((s << 8) & 65280) | ((s >> 8) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m15381k4(long j) {
        return C14113y2.m67408k4(C14091t6.m67191x1(j & 255), ".", C14091t6.m67191x1((j >> 8) & 255), ".", C14091t6.m67191x1((j >> 16) & 255), ".", C14091t6.m67191x1((j >> 24) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static short m15382k4(short s) {
        return m15385kk(s);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m15383k4(String str, C3842k4[] c3842k4Arr) {
        if (str == null) {
            throw new ArgumentNullException("ipString");
        }
        C3842k4 c3842k4M15386x1 = m15386x1(str);
        c3842k4Arr[0] = c3842k4M15386x1;
        if (c3842k4M15386x1 != null) {
            return true;
        }
        C3842k4 c3842k4M15384kk = m15384kk(str);
        c3842k4Arr[0] = c3842k4M15384kk;
        return c3842k4M15384kk != null;
    }

    /* JADX INFO: renamed from: x1 */
    public static short m15387x1(short s) {
        return m15385kk(s);
    }
}
