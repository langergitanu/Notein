package com.aspose.slides.internal.p120f2;

import androidx.core.content.OooO0O0;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.f2.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3843x1 {

    /* JADX INFO: renamed from: k4 */
    public static C3843x1 f10492k4 = m15395k4("::1");

    /* JADX INFO: renamed from: x1 */
    public static C3843x1 f10493x1 = m15395k4("::");

    /* JADX INFO: renamed from: du */
    private long f10494du;

    /* JADX INFO: renamed from: kk */
    private int[] f10495kk;

    /* JADX INFO: renamed from: to */
    private int f10496to;

    public C3843x1(int[] iArr) {
        this.f10494du = 0L;
        if (iArr == null) {
            throw new ArgumentNullException("addr");
        }
        if (iArr.length != 8) {
            throw new ArgumentException("addr");
        }
        this.f10495kk = iArr;
    }

    /* JADX INFO: renamed from: du */
    private int m15391du() {
        return ((m15392k4(this.f10495kk[7]) & 65535) << 16) + (65535 & m15392k4(this.f10495kk[6]));
    }

    /* JADX INFO: renamed from: k4 */
    private static int m15392k4(int i) {
        int i2 = i & 65535;
        return ((i2 >> 8) & 255) + ((i2 << 8) & 65280);
    }

    public boolean equals(Object obj) {
        C3843x1 c3843x1 = obj instanceof C3843x1 ? (C3843x1) obj : null;
        if (c3843x1 != null) {
            for (int i = 0; i < 8; i++) {
                if (this.f10495kk[i] != c3843x1.f10495kk[i]) {
                    return false;
                }
            }
            return true;
        }
        C3842k4 c3842k4 = obj instanceof C3842k4 ? (C3842k4) obj : null;
        if (c3842k4 != null) {
            for (int i2 = 0; i2 < 5; i2++) {
                if ((this.f10495kk[i2] & 65535) != 0) {
                    return false;
                }
            }
            int i3 = this.f10495kk[5];
            if ((i3 & 65535) != 0 && (i3 & 65535) != 65535) {
                return false;
            }
            long jM15388k4 = c3842k4.m15388k4();
            int[] iArr = this.f10495kk;
            if (iArr[6] == (((int) (jM15388k4 & 255)) << 8) + ((int) ((jM15388k4 >> 8) & 255)) && iArr[7] == (((int) ((jM15388k4 >> 16) & 255)) << 8) + ((int) ((jM15388k4 >> 24) & 255))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f10495kk;
        return m15393k4(((iArr[0] & 65535) << 16) + (iArr[1] & 65535), ((iArr[2] & 65535) << 16) + (iArr[3] & 65535), ((iArr[4] & 65535) << 16) + (iArr[5] & 65535), ((iArr[6] & 65535) << 16) + (iArr[7] & 65535));
    }

    /* JADX INFO: renamed from: kk */
    public boolean m15402kk() {
        for (int i = 0; i < 6; i++) {
            if ((this.f10495kk[i] & 65535) != 0) {
                return false;
            }
        }
        return m15391du() > 1;
    }

    /* JADX INFO: renamed from: to */
    public boolean m15403to() {
        for (int i = 0; i < 5; i++) {
            if ((this.f10495kk[i] & 65535) != 0) {
                return false;
            }
        }
        return (this.f10495kk[5] & 65535) == 65535;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m15402kk() || m15403to()) {
            c6765kp.m26792k4("::");
            if (m15403to()) {
                c6765kp.m26792k4("ffff:");
            }
            c6765kp.m26792k4(new C3842k4(m15391du()).toString());
            return c6765kp.toString();
        }
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            if ((this.f10495kk[i5] & 65535) != 0) {
                if (i3 <= i4 || i3 <= 1) {
                    i3 = i4;
                } else {
                    i2 = i5 - i3;
                }
                i4 = i3;
                i3 = 0;
            } else {
                i3++;
            }
        }
        if (i3 <= i4 || i3 <= 1) {
            i3 = i4;
        } else {
            i2 = 8 - i3;
        }
        if (i2 == 0) {
            c6765kp.m26792k4(C18241k5.f55433h);
        }
        while (i < 8) {
            if (i == i2) {
                c6765kp.m26792k4(C18241k5.f55433h);
                i += i3 - 1;
            } else {
                c6765kp.m26796k4("{0:x}", Integer.valueOf(this.f10495kk[i]));
                if (i < 7) {
                    c6765kp.m26780k4(':');
                }
            }
            i++;
        }
        if (this.f10494du != 0) {
            c6765kp.m26780k4('%').m26789k4(this.f10494du);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public long m15404x1() {
        return this.f10494du;
    }

    public C3843x1(int[] iArr, int i) {
        this(iArr);
        if (i < 0 || i > 128) {
            throw new ArgumentException("prefixLength");
        }
        this.f10496to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m15393k4(int i, int i2, int i3, int i4) {
        return ((i ^ ((i2 >> 19) | (i2 << 13))) ^ ((i3 << 26) | (i3 >> 6))) ^ ((i4 << 7) | (i4 >> 25));
    }

    public C3843x1(int[] iArr, int i, int i2) {
        this(iArr, i);
        this.f10494du = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m15394k4(int[] iArr, String str) {
        int i;
        if (str.length() == 0) {
            return 0;
        }
        if (C14113y2.m67367h4(str, "::", (short) 4) != -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != ':') {
                if ('0' <= cCharAt && cCharAt <= '9') {
                    i = cCharAt - '0';
                } else if ('a' <= cCharAt && cCharAt <= 'f') {
                    i = cCharAt - 'W';
                } else {
                    if ('A' > cCharAt || cCharAt > 'F') {
                        return -1;
                    }
                    i = cCharAt - '7';
                }
                i3 = (i3 << 4) + i;
                if (i3 > 65535) {
                    return -1;
                }
            } else {
                if (i4 == str.length() - 1 || i2 == 8) {
                    return -1;
                }
                iArr[i2] = i3;
                i3 = 0;
                i2++;
            }
        }
        if (i2 == 8) {
            return -1;
        }
        int i5 = i2 + 1;
        iArr[i2] = i3;
        return i5;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3843x1 m15395k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("ipString");
        }
        C3843x1[] c3843x1Arr = {null};
        boolean zM15398k4 = m15398k4(str, c3843x1Arr);
        C3843x1 c3843x1 = c3843x1Arr[0];
        if (zM15398k4) {
            return c3843x1;
        }
        throw new FormatException("Not a valid IPv6 address");
    }

    /* JADX INFO: renamed from: k4 */
    public String m15399k4(boolean z) {
        if (!z) {
            return toString();
        }
        C6765kp c6765kp = new C6765kp();
        int i = 0;
        while (true) {
            int[] iArr = this.f10495kk;
            if (i >= iArr.length - 1) {
                c6765kp.m26796k4("{0:X4}", Integer.valueOf(iArr[iArr.length - 1]));
                return c6765kp.toString();
            }
            c6765kp.m26796k4("{0:X4}:", Integer.valueOf(iArr[i]));
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m15400k4(long j) {
        this.f10494du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m15396k4(C3843x1 c3843x1) {
        int[] iArr = c3843x1.f10495kk;
        if ((iArr[7] & 65535) != 1) {
            return false;
        }
        int i = (iArr[6] & 65535) >> 8;
        if (i != 127 && i != 0) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ((c3843x1.f10495kk[i2] & 65535) != 0) {
                return false;
            }
        }
        int i3 = c3843x1.f10495kk[5];
        return (i3 & 65535) == 0 || (i3 & 65535) == 65535;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m15397k4(String str, int[] iArr) {
        try {
            iArr[0] = C14057f9.m66584k4(str, 7, C11697x1.m55250kk());
            return true;
        } catch (Exception unused) {
            iArr[0] = -1;
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m15398k4(String str, C3843x1[] c3843x1Arr) {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String strM67443x1 = str;
        c3843x1Arr[0] = null;
        if (strM67443x1 == null) {
            return false;
        }
        if (strM67443x1.length() > 2 && strM67443x1.charAt(0) == '[' && OooO0O0.OooO00o(1, strM67443x1) == ']') {
            strM67443x1 = OooO0OO.OooO00o(2, 1, strM67443x1, strM67443x1);
        }
        if (strM67443x1.length() < 2) {
            return false;
        }
        int iM67418kk = C14113y2.m67418kk(strM67443x1, IOUtils.DIR_SEPARATOR_UNIX);
        if (iM67418kk != -1) {
            int[] iArr = {0};
            boolean zM15397k4 = m15397k4(C14113y2.m67422kk(strM67443x1, iM67418kk + 1), iArr);
            i2 = iArr[0];
            if (!zM15397k4) {
                i2 = -1;
            }
            if (i2 < 0 || i2 > 128) {
                return false;
            }
            strM67443x1 = C14113y2.m67443x1(strM67443x1, 0, iM67418kk);
            i = 0;
        } else {
            int iM67418kk2 = C14113y2.m67418kk(strM67443x1, '%');
            if (iM67418kk2 != -1) {
                int[] iArr2 = {0};
                boolean zM15397k42 = m15397k4(C14113y2.m67422kk(strM67443x1, iM67418kk2 + 1), iArr2);
                int i5 = iArr2[0];
                if (!zM15397k42) {
                    i5 = 0;
                }
                strM67443x1 = C14113y2.m67443x1(strM67443x1, 0, iM67418kk2);
                i = i5;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
        }
        int[] iArr3 = new int[8];
        int iM67418kk3 = C14113y2.m67418kk(strM67443x1, ':');
        if (iM67418kk3 == -1) {
            return false;
        }
        if (iM67418kk3 < strM67443x1.length() - 1) {
            int i6 = iM67418kk3 + 1;
            String strM67422kk = C14113y2.m67422kk(strM67443x1, i6);
            if (C14113y2.m67429to(strM67422kk, FilenameUtils.EXTENSION_SEPARATOR) != -1) {
                C3842k4[] c3842k4Arr = {null};
                boolean zM15383k4 = C3842k4.m15383k4(strM67422kk, c3842k4Arr);
                C3842k4 c3842k4 = c3842k4Arr[0];
                if (!zM15383k4) {
                    return false;
                }
                long jM15388k4 = c3842k4.m15388k4();
                z = true;
                i3 = i;
                iArr3[6] = (((int) (jM15388k4 & 255)) << 8) + ((int) ((jM15388k4 >> 8) & 255));
                iArr3[7] = (((int) ((jM15388k4 >> 16) & 255)) << 8) + ((int) ((jM15388k4 >> 24) & 255));
                strM67443x1 = (iM67418kk3 <= 0 || strM67443x1.charAt(iM67418kk3 + (-1)) != ':') ? C14113y2.m67443x1(strM67443x1, 0, iM67418kk3) : C14113y2.m67443x1(strM67443x1, 0, i6);
                z2 = true;
                i4 = 2;
            } else {
                z = true;
                i3 = i;
                z2 = false;
                i4 = 0;
            }
        }
        int iM67367h4 = C14113y2.m67367h4(strM67443x1, "::", (short) 4);
        if (iM67367h4 != -1) {
            int iM15394k4 = m15394k4(iArr3, C14113y2.m67422kk(strM67443x1, iM67367h4 + 2));
            if (iM15394k4 == -1 || iM15394k4 + i4 > 8) {
                return false;
            }
            int i7 = (8 - i4) - iM15394k4;
            for (int i8 = iM15394k4; i8 > 0; i8--) {
                int i9 = i8 - 1;
                iArr3[(i8 + i7) - 1] = iArr3[i9];
                iArr3[i9] = 0;
            }
            int iM15394k42 = m15394k4(iArr3, C14113y2.m67443x1(strM67443x1, 0, iM67367h4));
            if (iM15394k42 == -1 || iM15394k42 + iM15394k4 + i4 > 7) {
                return false;
            }
        } else if (m15394k4(iArr3, strM67443x1) != 8 - i4) {
            return false;
        }
        boolean z3 = false;
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = iArr3[i10];
            if ((i11 & 65535) != 0 || (i10 == 5 && (i11 & 65535) != 65535)) {
                z3 = z;
            }
        }
        if (z2 && !z3) {
            for (int i12 = 0; i12 < 5; i12++) {
                if ((iArr3[i12] & 65535) != 0) {
                    return false;
                }
            }
            int i13 = iArr3[5];
            if ((i13 & 65535) != 0 && (i13 & 65535) != 65535) {
                return false;
            }
        }
        c3843x1Arr[0] = new C3843x1(iArr3, i2, i3);
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public int[] m15401k4() {
        return this.f10495kk;
    }
}
