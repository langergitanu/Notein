package com.aspose.slides.internal.p497xc;

import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p151gj.C4325rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.xc.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12499to<TPixels extends IGenericList<C4325rv>> {

    /* JADX INFO: renamed from: du */
    protected int[] f41824du;

    /* JADX INFO: renamed from: dy */
    protected int[] f41825dy;

    /* JADX INFO: renamed from: h4 */
    protected int[] f41826h4;

    /* JADX INFO: renamed from: k4 */
    protected int f41827k4;

    /* JADX INFO: renamed from: kk */
    protected int f41828kk;

    /* JADX INFO: renamed from: m9 */
    protected int[] f41829m9;

    /* JADX INFO: renamed from: to */
    protected final C12495du[] f41830to;

    /* JADX INFO: renamed from: x1 */
    protected int f41831x1;

    public C12499to(int i) {
        this(i, 10);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58056k4(int i, int i2, int i3) {
        int i4 = Integer.MAX_VALUE;
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < 256; i8++) {
            C12495du c12495duClone = this.f41830to[i8].Clone();
            int i9 = c12495duClone.f41807k4 - i;
            if (i9 < 0) {
                i9 = -i9;
            }
            int i10 = c12495duClone.f41810x1 - i2;
            if (i10 < 0) {
                i10 = -i10;
            }
            int i11 = i9 + i10;
            int i12 = c12495duClone.f41808kk - i3;
            if (i12 < 0) {
                i12 = -i12;
            }
            int i13 = i11 + i12;
            if (i13 < i4) {
                i7 = i8;
                i4 = i13;
            }
            int[] iArr = this.f41826h4;
            int i14 = i13 - (iArr[i8] >> 12);
            if (i14 < i6) {
                i5 = i8;
                i6 = i14;
            }
            int[] iArr2 = this.f41829m9;
            int i15 = iArr2[i8];
            int i16 = i15 >> 10;
            iArr2[i8] = i15 - i16;
            iArr[i8] = iArr[i8] + (i16 << 10);
        }
        int[] iArr3 = this.f41829m9;
        iArr3[i7] = iArr3[i7] + 64;
        int[] iArr4 = this.f41826h4;
        iArr4[i7] = iArr4[i7] - 65536;
        return i5;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58061kk() {
        for (int i = 0; i < 256; i++) {
            C12495du c12495duClone = this.f41830to[i].Clone();
            c12495duClone.f41807k4 >>= 4;
            c12495duClone.f41810x1 >>= 4;
            c12495duClone.f41808kk >>= 4;
            c12495duClone.f41809to = i;
            c12495duClone.CloneTo(this.f41830to[i]);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58062x1() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 256) {
            C12495du c12495duClone = this.f41830to[i].Clone();
            int i4 = c12495duClone.f41810x1;
            int i5 = i + 1;
            int i6 = i;
            for (int i7 = i5; i7 < 256; i7++) {
                int i8 = this.f41830to[i7].Clone().f41810x1;
                if (i8 < i4) {
                    i6 = i7;
                    i4 = i8;
                }
            }
            C12495du c12495duClone2 = this.f41830to[i6].Clone();
            if (i != i6) {
                C12495du c12495duClone3 = c12495duClone2.Clone();
                c12495duClone.CloneTo(c12495duClone2);
                c12495duClone3.CloneTo(c12495duClone);
            }
            c12495duClone.CloneTo(this.f41830to[i]);
            c12495duClone2.CloneTo(this.f41830to[i6]);
            if (i4 != i2) {
                this.f41824du[i2] = (i3 + i) >> 1;
                while (true) {
                    i2++;
                    if (i2 >= i4) {
                        break;
                    } else {
                        this.f41824du[i2] = i;
                    }
                }
                i3 = i;
                i2 = i4;
            }
            i = i5;
        }
        this.f41824du[i2] = (i3 + 255) >> 1;
        while (true) {
            i2++;
            if (i2 >= 256) {
                return;
            } else {
                this.f41824du[i2] = 255;
            }
        }
    }

    public C12499to(int i, int i2) {
        this.f41824du = new int[256];
        this.f41826h4 = new int[256];
        this.f41829m9 = new int[256];
        this.f41825dy = new int[32];
        this.f41831x1 = i * 3;
        this.f41828kk = i2;
        this.f41830to = (C12495du[]) C22200OooO0o0.OooO00o(C12495du.class, 256);
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = (i3 << 12) / 256;
            this.f41830to[i3] = new C12495du();
            C12495du c12495du = this.f41830to[i3];
            c12495du.f41807k4 = i4;
            c12495du.f41810x1 = i4;
            c12495du.f41808kk = i4;
            this.f41829m9[i3] = 256;
            this.f41826h4[i3] = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return r3;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m58057k4(C4325rv c4325rv) {
        int i = this.f41824du[c4325rv.f11815x1 & 255];
        int i2 = i - 1;
        int i3 = 1000;
        int i4 = -1;
        while (true) {
            if (i >= 256 && i2 < 0) {
                break;
            }
            if (i < 256) {
                C12495du c12495duClone = this.f41830to[i].Clone();
                int i5 = c12495duClone.f41810x1 - (c4325rv.f11815x1 & 255);
                if (i5 >= i3) {
                    break;
                }
                if (i5 < 0) {
                    i5 = -i5;
                }
                int i6 = c12495duClone.f41807k4 - (c4325rv.f11814kk & 255);
                if (i6 < 0) {
                    i6 = -i6;
                }
                int i7 = i5 + i6;
                if (i7 < i3) {
                    int i8 = c12495duClone.f41808kk - (c4325rv.f11813k4 & 255);
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    int i9 = i7 + i8;
                    if (i9 < i3) {
                        i4 = c12495duClone.f41809to;
                        i3 = i9;
                    }
                }
                i++;
            }
            if (i2 >= 0) {
                C12495du c12495duClone2 = this.f41830to[i2].Clone();
                int i10 = (c4325rv.f11815x1 & 255) - c12495duClone2.f41810x1;
                if (i10 >= i3) {
                    return i4;
                }
                if (i10 < 0) {
                    i10 = -i10;
                }
                int i11 = c12495duClone2.f41807k4 - (c4325rv.f11814kk & 255);
                if (i11 < 0) {
                    i11 = -i11;
                }
                int i12 = i10 + i11;
                if (i12 < i3) {
                    int i13 = c12495duClone2.f41808kk - (c4325rv.f11813k4 & 255);
                    if (i13 < 0) {
                        i13 = -i13;
                    }
                    int i14 = i12 + i13;
                    if (i14 < i3) {
                        i4 = c12495duClone2.f41809to;
                        i3 = i14;
                    }
                }
                i2--;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C4325rv[] m58063x1(TPixels tpixels) {
        m58059k4(tpixels);
        m58061kk();
        m58062x1();
        return m58060k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58058k4(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 - i;
        if (i6 < -1) {
            i6 = -1;
        }
        int i7 = i + i2;
        if (i7 > 256) {
            i7 = 256;
        }
        int i8 = i2 + 1;
        int i9 = 1;
        int i10 = i2 - 1;
        while (true) {
            if (i8 >= i7 && i10 <= i6) {
                return;
            }
            int i11 = i9 + 1;
            int i12 = this.f41825dy[i9];
            if (i8 < i7) {
                C12495du c12495duClone = this.f41830to[i8].Clone();
                try {
                    int i13 = c12495duClone.f41807k4;
                    c12495duClone.f41807k4 = i13 - OooO00o.OooO00o(i13, i3, i12, 262144);
                    int i14 = c12495duClone.f41810x1;
                    c12495duClone.f41810x1 = i14 - OooO00o.OooO00o(i14, i4, i12, 262144);
                    int i15 = c12495duClone.f41808kk;
                    c12495duClone.f41808kk = i15 - OooO00o.OooO00o(i15, i5, i12, 262144);
                } catch (RuntimeException unused) {
                }
                c12495duClone.CloneTo(this.f41830to[i8]);
                i8++;
            }
            if (i10 > i6) {
                C12495du c12495duClone2 = this.f41830to[i10].Clone();
                try {
                    int i16 = c12495duClone2.f41807k4;
                    c12495duClone2.f41807k4 = i16 - OooO00o.OooO00o(i16, i3, i12, 262144);
                    int i17 = c12495duClone2.f41810x1;
                    c12495duClone2.f41810x1 = i17 - OooO00o.OooO00o(i17, i4, i12, 262144);
                    int i18 = c12495duClone2.f41808kk;
                    c12495duClone2.f41808kk = i18 - OooO00o.OooO00o(i18, i5, i12, 262144);
                } catch (RuntimeException unused2) {
                }
                c12495duClone2.CloneTo(this.f41830to[i10]);
                i10--;
            }
            i9 = i11;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58055k4(int i, int i2, int i3, int i4, C12495du[] c12495duArr) {
        C12495du c12495du = c12495duArr[0];
        int i5 = c12495du.f41807k4;
        c12495du.f41807k4 = i5 - (((i5 - i2) * i) / 1024);
        int i6 = c12495du.f41810x1;
        c12495du.f41810x1 = i6 - (((i6 - i3) * i) / 1024);
        int i7 = c12495du.f41808kk;
        c12495du.f41808kk = i7 - (((i7 - i4) * i) / 1024);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58059k4(TPixels tpixels) {
        int i;
        boolean z;
        int i2 = this.f41831x1;
        int i3 = 1509;
        if (i2 < 1509) {
            this.f41828kk = 1;
        }
        int i4 = this.f41828kk;
        this.f41827k4 = C21034OooOOOo.OooO00o(i4, 1, 3, 30);
        int i5 = i2 / (i4 * 3);
        int i6 = i5 / 100;
        for (int i7 = 0; i7 < 32; i7++) {
            this.f41825dy[i7] = (((1024 - (i7 * i7)) * 256) / 1024) * 1024;
        }
        int i8 = this.f41831x1;
        if (i8 < 1509) {
            i = 3;
        } else {
            if (i8 % 499 != 0) {
                i3 = 1497;
            } else if (i8 % 491 != 0) {
                i3 = 1473;
            } else if (i8 % 487 != 0) {
                i3 = 1461;
            }
            i = i3;
        }
        int i9 = 2048;
        int i10 = 32;
        int i11 = i6;
        int i12 = 1024;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i5) {
            C4325rv c4325rvClone = ((C4325rv) tpixels.get_Item(i14 / 3)).Clone();
            int i15 = (c4325rvClone.f11814kk & 255) << 4;
            int i16 = (c4325rvClone.f11815x1 & 255) << 4;
            int i17 = (c4325rvClone.f11813k4 & 255) << 4;
            int iM58056k4 = m58056k4(i15, i16, i17);
            C12495du[] c12495duArr = {this.f41830to[iM58056k4]};
            m58055k4(i12, i15, i16, i17, c12495duArr);
            c12495duArr[0].CloneTo(this.f41830to[iM58056k4]);
            if (i10 != 0) {
                m58058k4(i10, iM58056k4, i15, i16, i17);
            }
            i14 += i;
            if (i14 >= i2) {
                i14 -= this.f41831x1;
            }
            i13++;
            if (i11 == 0) {
                i11 = 1;
            }
            if (i13 % i11 == 0) {
                i12 -= i12 / this.f41827k4;
                i9 -= i9 / 30;
                i10 = i9 >> 6;
                z = true;
                if (i10 <= 1) {
                    i10 = 0;
                }
                for (int i18 = 0; i18 < i10; i18++) {
                    int i19 = i10 * i10;
                    this.f41825dy[i18] = (((i19 - (i18 * i18)) * 256) / i19) * i12;
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C4325rv[] m58060k4() {
        C4325rv[] c4325rvArr = (C4325rv[]) C22200OooO0o0.OooO00o(C4325rv.class, 256);
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[this.f41830to[i].f41809to] = i;
        }
        for (int i2 = 0; i2 < 256; i2++) {
            this.f41830to[iArr[i2]].m58046k4().CloneTo(c4325rvArr[i2]);
        }
        return c4325rvArr;
    }
}
