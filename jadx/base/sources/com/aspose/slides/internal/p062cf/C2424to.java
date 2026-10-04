package com.aspose.slides.internal.p062cf;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p347px.AbstractC9576ak;
import com.aspose.slides.internal.p347px.C9578b3;
import com.aspose.slides.internal.p347px.C9601uz;
import com.aspose.slides.internal.p347px.C9603wl;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p347px.C9605x1;
import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.cf.to */
/* JADX INFO: loaded from: classes3.dex */
public class C2424to extends C2421h4 {

    /* JADX INFO: renamed from: c5 */
    private int[] f8392c5;

    /* JADX INFO: renamed from: ck */
    private SortedList<Integer, Integer> f8393ck;

    /* JADX INFO: renamed from: du */
    private int[] f8394du;

    /* JADX INFO: renamed from: dy */
    private int[] f8395dy;

    /* JADX INFO: renamed from: h4 */
    private int[] f8396h4;

    /* JADX INFO: renamed from: jd */
    private int f8397jd;

    /* JADX INFO: renamed from: k4 */
    public int f8398k4;

    /* JADX INFO: renamed from: kk */
    public int f8399kk;

    /* JADX INFO: renamed from: m9 */
    private int[] f8400m9;

    /* JADX INFO: renamed from: to */
    private int f8401to;

    /* JADX INFO: renamed from: x1 */
    public int f8402x1;

    public C2424to(int i, int i2, AbstractC9576ak abstractC9576ak) {
        super(i, i2, abstractC9576ak);
        this.f8393ck = new SortedList<>();
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public int mo11841k4(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = this.f8401to;
            if (i3 >= i4) {
                break;
            }
            int i5 = this.f8394du[i3];
            if (i <= i5 && (i2 = this.f8396h4[i3]) <= i) {
                int i6 = this.f8392c5[i3];
                if (i6 <= 0) {
                    return (this.f8400m9[i3] + i) % 65536;
                }
                int i7 = ((i - i2) + (i6 / 2)) - (i4 - i3);
                int[] iArr = this.f8395dy;
                if (i7 < iArr.length) {
                    return iArr[i7];
                }
            } else if (i <= i5) {
                break;
            }
            i3++;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public C9604wy mo11842k4(C9603wl c9603wl) {
        C9604wy c9604wy = new C9604wy(((C9605x1) m11844k4()).m46916kk());
        for (int i = 0; i < this.f8401to; i++) {
            int i2 = this.f8396h4[i];
            while (i2 <= this.f8394du[i]) {
                int iMo11841k4 = i2 < 65535 ? mo11841k4((char) i2) : 0;
                C9601uz c9601uzClone = c9603wl.m46903k4(iMo11841k4).Clone();
                C9578b3 c9578b3 = new C9578b3((char) i2, iMo11841k4, 65535 & c9601uzClone.f34734k4, c9601uzClone.f34735x1);
                c9604wy.m46908k4(c9578b3);
                if (c9578b3.m46757x1() == 0) {
                    c9604wy.m46911x1(c9578b3);
                }
                i2++;
            }
        }
        return c9604wy;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public void mo11843k4(C11296k4 c11296k4) {
        int iM54274du = c11296k4.m54274du();
        this.f8397jd = c11296k4.m54274du() & 65535;
        this.f8401to = ((c11296k4.m54274du() & 65535) / 2) & 65535;
        this.f8398k4 = c11296k4.m54274du() & 65535;
        this.f8402x1 = c11296k4.m54274du() & 65535;
        this.f8399kk = c11296k4.m54274du() & 65535;
        this.f8394du = new int[this.f8401to];
        int i = 0;
        while (true) {
            int[] iArr = this.f8394du;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = c11296k4.m54274du() & 65535;
            i++;
        }
        c11296k4.m54274du();
        int i2 = this.f8401to;
        this.f8396h4 = new int[i2];
        this.f8400m9 = new int[i2];
        this.f8392c5 = new int[i2];
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f8396h4;
            if (i3 >= iArr2.length) {
                break;
            }
            iArr2[i3] = c11296k4.m54274du() & 65535;
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr3 = this.f8400m9;
            if (i4 >= iArr3.length) {
                break;
            }
            iArr3[i4] = c11296k4.m54274du() & 65535;
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.f8392c5;
            if (i5 >= iArr4.length) {
                break;
            }
            iArr4[i5] = c11296k4.m54274du() & 65535;
            i5++;
        }
        int i6 = ((iM54274du & 65535) - ((this.f8401to * 8) + 16)) / 2;
        this.f8395dy = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            this.f8395dy[i7] = c11296k4.m54274du() & 65535;
        }
        super.mo11843k4(c11296k4);
    }
}
