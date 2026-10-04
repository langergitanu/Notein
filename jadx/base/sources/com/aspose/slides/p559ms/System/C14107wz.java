package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.wz */
/* JADX INFO: loaded from: classes5.dex */
public final class C14107wz implements InterfaceC14059g8, Comparable<C14107wz> {

    /* JADX INFO: renamed from: k4 */
    private int f47355k4;

    /* JADX INFO: renamed from: kk */
    private int f47356kk;

    /* JADX INFO: renamed from: to */
    private int f47357to;

    /* JADX INFO: renamed from: x1 */
    private int f47358x1;

    public C14107wz() {
        this.f47355k4 = -1;
        this.f47357to = -1;
        this.f47358x1 = 0;
        this.f47356kk = 0;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67338kk(C14107wz c14107wz, C14107wz c14107wz2) {
        if (c14107wz != null) {
            return c14107wz.compareTo(c14107wz2) < 0;
        }
        throw new ArgumentNullException("v1");
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C14107wz c14107wz = new C14107wz();
        c14107wz.f47358x1 = this.f47358x1;
        c14107wz.f47356kk = this.f47356kk;
        c14107wz.f47355k4 = this.f47355k4;
        c14107wz.f47357to = this.f47357to;
        return c14107wz;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14107wz.class == obj.getClass()) {
            C14107wz c14107wz = (C14107wz) obj;
            if (this.f47358x1 == c14107wz.f47358x1 && this.f47356kk == c14107wz.f47356kk && this.f47355k4 == c14107wz.f47355k4 && this.f47357to == c14107wz.f47357to) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47358x1 & 15) << 28) | ((this.f47356kk & 255) << 20) | ((this.f47355k4 & 255) << 12) | (this.f47357to & 4095);
    }

    /* JADX INFO: renamed from: k4 */
    public int m67340k4() {
        return this.f47358x1;
    }

    public String toString() {
        return m67342k4(this.f47355k4 == -1 ? 2 : this.f47357to == -1 ? 3 : 4);
    }

    /* JADX INFO: renamed from: x1 */
    public int m67343x1() {
        return this.f47356kk;
    }

    public C14107wz(int i, int i2) {
        this.f47355k4 = -1;
        this.f47357to = -1;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("major");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("minor");
        }
        this.f47358x1 = i;
        this.f47356kk = i2;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67339x1(C14107wz c14107wz, C14107wz c14107wz2) {
        return !m67337k4(c14107wz, c14107wz2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14107wz c14107wz) {
        if (c14107wz == null) {
            return 1;
        }
        int i = this.f47358x1;
        int i2 = c14107wz.f47358x1;
        if (i != i2) {
            return i > i2 ? 1 : -1;
        }
        int i3 = this.f47356kk;
        int i4 = c14107wz.f47356kk;
        if (i3 != i4) {
            return i3 > i4 ? 1 : -1;
        }
        int i5 = this.f47355k4;
        int i6 = c14107wz.f47355k4;
        if (i5 != i6) {
            return i5 > i6 ? 1 : -1;
        }
        int i7 = this.f47357to;
        int i8 = c14107wz.f47357to;
        if (i7 == i8) {
            return 0;
        }
        return i7 > i8 ? 1 : -1;
    }

    public C14107wz(int i, int i2, int i3) {
        this.f47355k4 = -1;
        this.f47357to = -1;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("major");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("minor");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("build");
        }
        this.f47358x1 = i;
        this.f47356kk = i2;
        this.f47355k4 = i3;
    }

    /* JADX INFO: renamed from: k4 */
    public String m67342k4(int i) {
        if (i == 0) {
            return C14113y2.f47374k4;
        }
        if (i == 1) {
            return Integer.toString(this.f47358x1);
        }
        if (i == 2) {
            return this.f47358x1 + "." + this.f47356kk;
        }
        if (this.f47355k4 == -1) {
            throw new ArgumentException();
        }
        if (i == 3) {
            return C14113y2.m67407k4(Integer.valueOf(this.f47358x1), ".", Integer.valueOf(this.f47356kk), ".", Integer.valueOf(this.f47355k4));
        }
        if (this.f47357to == -1) {
            throw new ArgumentException();
        }
        if (i == 4) {
            return C14113y2.m67407k4(Integer.valueOf(this.f47358x1), ".", Integer.valueOf(this.f47356kk), ".", Integer.valueOf(this.f47355k4), ".", Integer.valueOf(this.f47357to));
        }
        throw new ArgumentException();
    }

    public C14107wz(int i, int i2, int i3, int i4) {
        this.f47355k4 = -1;
        this.f47357to = -1;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("major");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("minor");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("build");
        }
        if (i4 < 0) {
            throw new ArgumentOutOfRangeException("revision");
        }
        this.f47358x1 = i;
        this.f47356kk = i2;
        this.f47355k4 = i3;
        this.f47357to = i4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67337k4(C14107wz c14107wz, C14107wz c14107wz2) {
        return C14067j2.m66729x1(c14107wz, null) ? C14067j2.m66729x1(c14107wz2, null) : c14107wz.equals(c14107wz2);
    }
}
