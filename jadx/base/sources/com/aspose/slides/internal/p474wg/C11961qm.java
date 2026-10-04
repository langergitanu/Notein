package com.aspose.slides.internal.p474wg;

import androidx.core.content.OooO0O0;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.qm */
/* JADX INFO: loaded from: classes5.dex */
class C11961qm {

    /* JADX INFO: renamed from: k4 */
    public static final C11961qm f40335k4 = m56089k4("::1");

    /* JADX INFO: renamed from: x1 */
    public static final C11961qm f40336x1 = m56089k4("::");

    /* JADX INFO: renamed from: du */
    private long f40337du;

    /* JADX INFO: renamed from: kk */
    private int[] f40338kk;

    /* JADX INFO: renamed from: to */
    private int f40339to;

    public C11961qm(int[] iArr) {
        this.f40337du = C7019kk.m27438h4((Object) 0, 9);
        if (iArr == null) {
            throw new ArgumentNullException("addr");
        }
        if (AbstractC14092to.m67208k4((Object) iArr).m67265du() != 8) {
            throw new ArgumentException("addr");
        }
        this.f40338kk = iArr;
    }

    /* JADX INFO: renamed from: du */
    private long m56085du() {
        return C7019kk.m27435du(Integer.valueOf((m56086k4(this.f40338kk[7]) << 16) + m56086k4(this.f40338kk[6])), 9);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m56086k4(int i) {
        return C7019kk.m27457kk(Integer.valueOf(((i >> 8) & 255) + ((i << 8) & 65280)), 9);
    }

    public boolean equals(Object obj) {
        C11961qm c11961qm = (C11961qm) C7019kk.m27452k4(obj, C11961qm.class);
        if (c11961qm != null) {
            for (int i = 0; i < 8; i++) {
                if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[i]), 8) != C7019kk.m27457kk(Integer.valueOf(c11961qm.f40338kk[i]), 8)) {
                    return false;
                }
            }
            return true;
        }
        C11972ts c11972ts = (C11972ts) C7019kk.m27452k4(obj, C11972ts.class);
        if (c11972ts != null) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[i2]), 8) != 0) {
                    return false;
                }
            }
            if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[5]), 8) != 0 && C7019kk.m27457kk(Integer.valueOf(this.f40338kk[5]), 8) != 65535) {
                return false;
            }
            long jM56145x1 = c11972ts.m56145x1();
            if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[6]), 8) == C7019kk.m27457kk(Integer.valueOf(C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Long.valueOf((jM56145x1 >> 8) & C7019kk.m27438h4((Object) 255, 9)), 11) + (C7019kk.m27462to(Long.valueOf(C7019kk.m27438h4((Object) 255, 9) & jM56145x1), 11) << 8)), 9)), 8)) {
                if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[7]), 8) == C7019kk.m27457kk(Integer.valueOf(C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Long.valueOf((jM56145x1 >> 24) & C7019kk.m27438h4((Object) 255, 9)), 11) + (C7019kk.m27462to(Long.valueOf((jM56145x1 >> 16) & C7019kk.m27438h4((Object) 255, 9)), 11) << 8)), 9)), 8)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return m56087k4(C7019kk.m27462to(Integer.valueOf(this.f40338kk[1]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40338kk[0]), 8) << 16), C7019kk.m27462to(Integer.valueOf(this.f40338kk[3]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40338kk[2]), 8) << 16), C7019kk.m27462to(Integer.valueOf(this.f40338kk[5]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40338kk[4]), 8) << 16), C7019kk.m27462to(Integer.valueOf(this.f40338kk[7]), 8) + (C7019kk.m27462to(Integer.valueOf(this.f40338kk[6]), 8) << 16));
    }

    /* JADX INFO: renamed from: kk */
    public boolean m56094kk() {
        for (int i = 0; i < 6; i++) {
            if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[i]), 8) != 0) {
                return false;
            }
        }
        return C7019kk.m27457kk(Integer.valueOf(this.f40338kk[6]), 8) != 0 && C7019kk.m27435du(Long.valueOf(m56085du()), 10) > 1;
    }

    /* JADX INFO: renamed from: to */
    public boolean m56095to() {
        for (int i = 0; i < 5; i++) {
            if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[i]), 8) != 0) {
                return false;
            }
        }
        return C7019kk.m27457kk(Integer.valueOf(this.f40338kk[6]), 8) != 0 && C7019kk.m27457kk(Integer.valueOf(this.f40338kk[5]), 8) == 65535;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m56094kk() || m56095to()) {
            c6765kp.m26792k4("::");
            if (m56095to()) {
                c6765kp.m26792k4("ffff:");
            }
            c6765kp.m26792k4(new C11972ts(m56085du()).toString());
            return c6765kp.toString();
        }
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            if (C7019kk.m27457kk(Integer.valueOf(this.f40338kk[i5]), 8) != 0) {
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
                c6765kp.m26796k4("{0:x}", C7019kk.m27466x1(this.f40338kk[i]));
                if (i < 7) {
                    c6765kp.m26780k4(':');
                }
            }
            i++;
        }
        if (this.f40337du != 0) {
            c6765kp.m26780k4('%').m26789k4(this.f40337du);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public long m56096x1() {
        return this.f40337du;
    }

    public C11961qm(int[] iArr, int i) {
        this(iArr);
        if (i < 0 || i > 128) {
            throw new ArgumentException("prefixLength");
        }
        this.f40339to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m56087k4(int i, int i2, int i3, int i4) {
        return ((i ^ ((i2 >> 19) | (i2 << 13))) ^ ((i3 << 26) | (i3 >> 6))) ^ ((i4 << 7) | (i4 >> 25));
    }

    public C11961qm(int[] iArr, int i, int i2) {
        this(iArr, i);
        this.f40337du = C7019kk.m27438h4(Integer.valueOf(i2), 9);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m56088k4(int[] iArr, String str) {
        int iM27462to;
        if (str.length() == 0) {
            return 0;
        }
        if (C14113y2.m67367h4(str, "::", (short) 4) != -1) {
            return -1;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != ':') {
                i3++;
                if (i3 > 4) {
                    return -1;
                }
                if ('0' > cCharAt || cCharAt > '9') {
                    char c = 'a';
                    if ('a' > cCharAt || cCharAt > 'f') {
                        c = 'A';
                        if ('A' > cCharAt || cCharAt > 'F') {
                            return -1;
                        }
                    }
                    iM27462to = (C7019kk.m27462to(Character.valueOf(cCharAt), 4) - C7019kk.m27462to(Character.valueOf(c), 4)) + 10;
                } else {
                    iM27462to = C7019kk.m27462to(Character.valueOf(cCharAt), 4) - C7019kk.m27462to((Object) '0', 4);
                }
                i2 = (i2 << 4) + iM27462to;
                if (i2 > C7019kk.m27457kk((Object) 65535, 8)) {
                    return -1;
                }
            } else {
                if (i4 == 0 || i4 == str.length() - 1 || i == 8) {
                    return -1;
                }
                iArr[i] = C7019kk.m27457kk(Integer.valueOf(i2), 9);
                i2 = 0;
                i++;
                i3 = 0;
            }
        }
        if (i == 8) {
            return -1;
        }
        int i5 = i + 1;
        iArr[i] = C7019kk.m27457kk(Integer.valueOf(i2), 9);
        return i5;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11961qm m56089k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("ipString");
        }
        C11961qm[] c11961qmArr = {null};
        boolean zM56091k4 = m56091k4(str, c11961qmArr);
        C11961qm c11961qm = c11961qmArr[0];
        if (zM56091k4) {
            return c11961qm;
        }
        throw new FormatException("Not a valid IPv6 address");
    }

    /* JADX INFO: renamed from: k4 */
    public void m56092k4(long j) {
        this.f40337du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56090k4(String str, int[] iArr) {
        return C14057f9.m66589k4(str, 7, C11697x1.m55250kk(), iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m56091k4(String str, C11961qm[] c11961qmArr) {
        int i;
        int i2;
        boolean z;
        int i3;
        String strM67443x1 = str;
        c11961qmArr[0] = null;
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
            boolean zM56090k4 = m56090k4(C14113y2.m67422kk(strM67443x1, iM67418kk + 1), iArr);
            i2 = iArr[0];
            if (!zM56090k4) {
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
                boolean zM56090k42 = m56090k4(C14113y2.m67422kk(strM67443x1, iM67418kk2 + 1), iArr2);
                int i4 = iArr2[0];
                if (!zM56090k42) {
                    i4 = 0;
                }
                strM67443x1 = C14113y2.m67443x1(strM67443x1, 0, iM67418kk2);
                i = i4;
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
            int i5 = iM67418kk3 + 1;
            String strM67422kk = C14113y2.m67422kk(strM67443x1, i5);
            if (C14113y2.m67429to(strM67422kk, FilenameUtils.EXTENSION_SEPARATOR) != -1) {
                C11972ts[] c11972tsArr = {null};
                boolean zM56134k4 = C11972ts.m56134k4(strM67422kk, c11972tsArr);
                C11972ts c11972ts = c11972tsArr[0];
                if (!zM56134k4) {
                    return false;
                }
                long jM56145x1 = c11972ts.m56145x1();
                z = true;
                iArr3[6] = C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Long.valueOf((jM56145x1 >> 8) & C7019kk.m27438h4((Object) 255, 9)), 11) + (C7019kk.m27462to(Long.valueOf(jM56145x1 & C7019kk.m27438h4((Object) 255, 9)), 11) << 8)), 9);
                iArr3[7] = C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Long.valueOf((jM56145x1 >> 24) & C7019kk.m27438h4((Object) 255, 9)), 11) + (C7019kk.m27462to(Long.valueOf((jM56145x1 >> 16) & C7019kk.m27438h4((Object) 255, 9)), 11) << 8)), 9);
                strM67443x1 = (iM67418kk3 <= 0 || strM67443x1.charAt(iM67418kk3 + (-1)) != ':') ? C14113y2.m67443x1(strM67443x1, 0, iM67418kk3) : C14113y2.m67443x1(strM67443x1, 0, i5);
                i3 = 2;
            } else {
                z = true;
                i3 = 0;
            }
        }
        int iM67367h4 = C14113y2.m67367h4(strM67443x1, "::", (short) 4);
        if (iM67367h4 != -1) {
            int iM56088k4 = m56088k4(iArr3, C14113y2.m67422kk(strM67443x1, iM67367h4 + 2));
            if (iM56088k4 == -1 || iM56088k4 + i3 > 8) {
                return false;
            }
            int i6 = (8 - i3) - iM56088k4;
            for (int i7 = iM56088k4; i7 > 0; i7--) {
                int i8 = i7 - 1;
                iArr3[(i7 + i6) - 1] = iArr3[i8];
                iArr3[i8] = C7019kk.m27457kk((Object) 0, 9);
            }
            int iM56088k42 = m56088k4(iArr3, C14113y2.m67443x1(strM67443x1, 0, iM67367h4));
            if (iM56088k42 == -1 || iM56088k42 + iM56088k4 + i3 > 7) {
                return false;
            }
        } else if (m56088k4(iArr3, strM67443x1) != 8 - i3) {
            return false;
        }
        c11961qmArr[0] = new C11961qm(iArr3, i2, i);
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public int[] m56093k4() {
        return this.f40338kk;
    }
}
