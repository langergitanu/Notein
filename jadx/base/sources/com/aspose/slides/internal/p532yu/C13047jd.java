package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.jd */
/* JADX INFO: loaded from: classes5.dex */
public final class C13047jd {

    /* JADX INFO: renamed from: k4 */
    private int f43883k4;

    /* JADX INFO: renamed from: x1 */
    private long[] f43884x1;

    private C13047jd() {
    }

    /* JADX INFO: renamed from: du */
    private int m60995du(int i) {
        return i >> 5;
    }

    /* JADX INFO: renamed from: h4 */
    private void m60996h4(int i) {
        long[] jArr = this.f43884x1;
        if (i > jArr.length) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            long[] jArr2 = new long[i];
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4(jArr), AbstractC14092to.m67208k4(jArr2), this.f43884x1.length);
            this.f43884x1 = jArr2;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C13047jd c13047jd = (C13047jd) obj;
        int length = this.f43884x1.length;
        int length2 = c13047jd.f43884x1.length;
        int i = length > length2 ? length2 : length;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                if (length <= i) {
                    while (true) {
                        int i4 = length2 - 1;
                        if (length2 <= i) {
                            break;
                        }
                        if ((c13047jd.f43884x1[i4] & 4294967295L) != 0) {
                            return false;
                        }
                        length2 = i4;
                    }
                } else {
                    while (true) {
                        int i5 = length - 1;
                        if (length <= i) {
                            break;
                        }
                        if ((this.f43884x1[i5] & 4294967295L) != 0) {
                            return false;
                        }
                        length = i5;
                    }
                }
                return true;
            }
            if ((this.f43884x1[i3] & 4294967295L) != (4294967295L & c13047jd.f43884x1[i3])) {
                return false;
            }
            i2 = i3;
        }
    }

    public int hashCode() {
        int length = this.f43884x1.length;
        int i = 1234;
        while (true) {
            int i2 = length - 1;
            if (i2 < 0) {
                return (i >> 32) ^ i;
            }
            i ^= ((int) this.f43884x1[i2]) * length;
            length = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m60997k4() {
        return this.f43883k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13047jd m61000kk() {
        C13047jd c13047jd = new C13047jd();
        c13047jd.f43883k4 = this.f43883k4;
        c13047jd.f43884x1 = (long[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(this.f43884x1).deepClone(), long[].class);
        return c13047jd;
    }

    /* JADX INFO: renamed from: to */
    public final int m61003to(int i) {
        int i2 = i + 1;
        if (i2 == this.f43883k4) {
            return -1;
        }
        int iM60995du = m60995du(i2);
        int i3 = i2 & 31;
        long j = ((this.f43884x1[iM60995du] & 4294967295L) >> i3) & 4294967295L;
        while ((j & 4294967295L) == 0) {
            iM60995du++;
            long[] jArr = this.f43884x1;
            if (iM60995du == jArr.length) {
                return -1;
            }
            j = jArr[iM60995du];
            i3 = 0;
        }
        while ((1 & j) == 0) {
            j = ((j & 4294967295L) >> 1) & 4294967295L;
            i3++;
        }
        return (iM60995du << 5) + i3;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61005x1() {
        int length = this.f43884x1.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return;
            }
            this.f43884x1[i] = 0;
            length = i;
        }
    }

    public C13047jd(int i) {
        this.f43883k4 = i;
        this.f43884x1 = new long[m60995du(i + 31)];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60998k4(C13047jd c13047jd) {
        if (this == c13047jd) {
            return;
        }
        int length = this.f43884x1.length;
        int length2 = c13047jd.f43884x1.length;
        if (length <= length2) {
            length2 = length;
        }
        int i = length2;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.f43884x1;
            jArr[i2] = jArr[i2] & c13047jd.f43884x1[i2] & 4294967295L;
            i = i2;
        }
        while (length2 < length) {
            this.f43884x1[length2] = 0;
            length2++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61001kk(int i) {
        if (i < this.f43883k4) {
            if ((this.f43884x1[m60995du(i)] & 4294967295L & ((long) (1 << (i & 31))) & 4294967295L) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m61004to() {
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = this.f43884x1;
            if (i >= jArr.length) {
                break;
            }
            j = (j | jArr[i]) & 4294967295L;
            i++;
        }
        return (j & 4294967295L) == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61006x1(int i) {
        int iM60995du = m60995du(i);
        m60996h4(iM60995du + 1);
        long[] jArr = this.f43884x1;
        jArr[iM60995du] = (jArr[iM60995du] | (1 << (i & 31))) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m60999k4(int i) {
        return m61001kk(i);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61002kk(C13047jd c13047jd) {
        int iM67507x1 = C14116yg.m67507x1(this.f43884x1.length, c13047jd.f43884x1.length);
        do {
            iM67507x1--;
            if (iM67507x1 < 0) {
                return false;
            }
        } while ((this.f43884x1[iM67507x1] & c13047jd.f43884x1[iM67507x1] & 4294967295L) == 0);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61007x1(C13047jd c13047jd) {
        if (this == c13047jd) {
            return;
        }
        int length = c13047jd.f43884x1.length;
        m60996h4(length);
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return;
            }
            long[] jArr = this.f43884x1;
            jArr[i] = (jArr[i] | c13047jd.f43884x1[i]) & 4294967295L;
            length = i;
        }
    }
}
