package com.aspose.slides.internal.p106ef;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4103to;
import com.aspose.slides.internal.p135fp.C4109wl;
import com.aspose.slides.internal.p135fp.C4112yj;
import com.aspose.slides.internal.p225ke.C5663h4;
import com.aspose.slides.internal.p225ke.C5667to;
import com.aspose.slides.internal.p385rr.C10052k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3678kk extends AbstractC3675du {

    /* JADX INFO: renamed from: du */
    private final long[][] f10202du;

    /* JADX INFO: renamed from: dy */
    private int f10203dy;

    /* JADX INFO: renamed from: h4 */
    private final C4090du[] f10204h4;

    /* JADX INFO: renamed from: kk */
    private final long[][] f10205kk;

    /* JADX INFO: renamed from: m9 */
    private int f10206m9;

    /* JADX INFO: renamed from: to */
    private final C4090du[] f10207to;

    /* JADX INFO: renamed from: x1 */
    private final int[] f10208x1;

    public C3678kk(C4112yj c4112yj) {
        super(c4112yj);
        this.f10208x1 = new int[C5667to.f15657x1];
        int i = C5667to.f15656to;
        this.f10205kk = new long[i][];
        this.f10207to = new C4090du[i];
        this.f10202du = new long[i][];
        this.f10204h4 = new C4090du[i];
    }

    /* JADX INFO: renamed from: k4 */
    private void m14896k4(int i) {
        m14874du().m16466m9().m16398x1();
        m14874du().m16466m9().m16396k4((byte) (i + 208));
        int[] iArr = this.f10208x1;
        C10052k4.m49681k4(iArr, 0, iArr.length);
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: kk */
    public void mo14879kk() {
        for (int i = 0; i < m14874du().m16457k4(); i++) {
            C4095jd c4095jd = m14874du().m16453du().m16362x1()[m14874du().m16469x1().m16445kk()[i]];
            for (C4090du c4090du : m14874du().m16464kk().getValues()) {
                if ((c4090du.m16278jd() & 255) == 1) {
                    if ((c4090du.m16284x1() & 255) == (c4095jd.m16321k4() & 255)) {
                        this.f10207to[c4095jd.m16321k4() & 255] = c4090du;
                    }
                } else if ((c4090du.m16284x1() & 255) == (c4095jd.m16332x1() & 255)) {
                    this.f10204h4[c4095jd.m16332x1() & 255] = c4090du;
                }
            }
        }
        int[] iArr = this.f10208x1;
        C10052k4.m49681k4(iArr, 0, iArr.length);
        if (m14874du().m16454dy() > 0) {
            this.f10203dy = m14874du().m16454dy();
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: to */
    public void mo14880to() {
        C4109wl c4109wlM16469x1 = m14874du().m16469x1();
        for (int i = 0; i < c4109wlM16469x1.f11269x1.length; i++) {
            if (this.f10202du[m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i]].m16332x1() & 255] == null) {
                this.f10202du[m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i]].m16332x1() & 255] = new long[257];
            }
            if (this.f10205kk[m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i]].m16321k4() & 255] == null) {
                this.f10205kk[m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i]].m16321k4() & 255] = new long[257];
            }
            this.f10208x1[c4109wlM16469x1.f11269x1[i]] = 0;
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: x1 */
    public void mo14881x1() {
        m14874du().m16466m9().m16398x1();
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: k4 */
    public void mo14877k4(C4103to[] c4103toArr) {
        if (m14874du().m16454dy() != 0 && this.f10203dy == 0) {
            m14896k4(this.f10206m9);
        }
        for (int i = 0; i < m14874du().m16457k4(); i++) {
            C4095jd c4095jd = m14874du().m16453du().m16362x1()[m14874du().m16469x1().m16445kk()[i]];
            m14897k4(c4103toArr[i].m16394k4(), this.f10208x1[c4095jd.m16317h4() & 255], this.f10204h4[c4095jd.m16332x1() & 255], this.f10207to[c4095jd.m16321k4() & 255]);
            this.f10208x1[c4095jd.m16317h4() & 255] = c4103toArr[i].m16394k4()[0];
        }
        if (m14874du().m16454dy() == 0 || this.f10203dy != 0) {
            return;
        }
        this.f10203dy = m14874du().m16454dy();
        this.f10206m9 = (this.f10206m9 + 1) & 7;
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: x1 */
    public void mo14882x1(C4103to[] c4103toArr) {
        for (int i = 0; i < c4103toArr.length; i++) {
            int i2 = m14874du().m16469x1().m16445kk()[i];
            m14898k4(c4103toArr[i].m16394k4(), this.f10208x1[i2], this.f10202du[m14874du().m16453du().m16362x1()[i2].m16332x1() & 255], this.f10205kk[m14874du().m16453du().m16362x1()[i2].m16321k4() & 255]);
            this.f10208x1[i2] = c4103toArr[i].m16394k4()[0];
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m14897k4(short[] sArr, int i, C4090du c4090du, C4090du c4090du2) {
        int i2;
        int i3;
        int i4;
        int i5 = sArr[0] - i;
        if (i5 < 0) {
            int i6 = -i5;
            int i7 = i5 - 1;
            i5 = i6;
            i2 = i7;
        } else {
            i2 = i5;
        }
        int i8 = 0;
        while (i5 != 0) {
            i8++;
            i5 >>= 1;
        }
        if (i8 > AbstractC3675du.f10193k4 + 1) {
            throw new Exception("Bad DCT coef");
        }
        m14874du().m16466m9().m16397k4(c4090du.m16281kk()[i8], c4090du.m16283to()[i8]);
        if (i8 != 0) {
            m14874du().m16466m9().m16397k4(i2, i8);
        }
        int i9 = 0;
        for (int i10 = 1; i10 < C5667to.f15654k4; i10++) {
            short s = sArr[C5663h4.f15647k4[i10]];
            if (s == 0) {
                i9++;
            } else {
                while (i9 > 15) {
                    m14874du().m16466m9().m16397k4(c4090du2.m16281kk()[240], c4090du2.m16283to()[240]);
                    i9 -= 16;
                }
                if (s < 0) {
                    i3 = s - 1;
                    i4 = -s;
                } else {
                    i3 = s;
                    i4 = s;
                }
                int i11 = 1;
                int i12 = i4;
                while (true) {
                    int i13 = i12 >> 1;
                    if (i13 == 0) {
                        break;
                    }
                    i11++;
                    i12 = i13;
                }
                if (i11 > AbstractC3675du.f10193k4) {
                    throw new Exception("Bad dct coef");
                }
                int i14 = (i9 << 4) + i11;
                m14874du().m16466m9().m16397k4(c4090du2.m16281kk()[i14], c4090du2.m16283to()[i14]);
                m14874du().m16466m9().m16397k4(i3, i11);
                i9 = 0;
            }
        }
        if (i9 > 0) {
            m14874du().m16466m9().m16397k4(c4090du2.m16281kk()[0], c4090du2.m16283to()[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX INFO: renamed from: k4 */
    public void m14898k4(short[] sArr, int i, long[] jArr, long[] jArr2) {
        int i2 = sArr[0] - i;
        if (i2 < 0) {
            i2 = -i2;
        }
        int i3 = 0;
        while (i2 != 0) {
            i3++;
            i2 >>= 1;
        }
        jArr[i3] = jArr[i3] + 1;
        int i4 = 0;
        for (int i5 = 1; i5 < C5667to.f15654k4; i5++) {
            short s = sArr[C5663h4.f15647k4[i5]];
            if (s == 0) {
                i4++;
            } else {
                while (i4 > 15) {
                    jArr2[240] = jArr2[240] + 1;
                    i4 -= 16;
                }
                if (s < 0) {
                    s = -s;
                }
                int i6 = 1;
                int i7 = s;
                while (true) {
                    int i8 = i7 >> 1;
                    if (i8 == 0) {
                        break;
                    }
                    i6++;
                    i7 = i8;
                }
                int i9 = (i4 << 4) + i6;
                jArr2[i9] = jArr2[i9] + 1;
                i4 = 0;
            }
        }
        if (i4 > 0) {
            jArr2[0] = jArr2[0] + 1;
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: k4 */
    public C4090du[] mo14878k4() {
        List list = new List();
        int i = C5667to.f15656to;
        boolean[] zArr = new boolean[i];
        boolean[] zArr2 = new boolean[i];
        C4109wl c4109wlM16469x1 = m14874du().m16469x1();
        for (int i2 = 0; i2 < c4109wlM16469x1.f11269x1.length; i2++) {
            byte bM16332x1 = m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i2]].m16332x1();
            byte bM16321k4 = m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i2]].m16321k4();
            int i3 = bM16332x1 & 255;
            if (!zArr[i3]) {
                C4090du c4090duM14875k4 = m14875k4(this.f10202du[i3]);
                c4090duM14875k4.m16285x1((byte) 0);
                c4090duM14875k4.m16279k4(bM16332x1);
                list.addItem(c4090duM14875k4);
                zArr[i3] = true;
            }
            int i4 = bM16321k4 & 255;
            if (!zArr2[i4]) {
                C4090du c4090duM14875k42 = m14875k4(this.f10205kk[i4]);
                c4090duM14875k42.m16279k4(bM16321k4);
                c4090duM14875k42.m16285x1((byte) 1);
                list.addItem(c4090duM14875k42);
                zArr2[i4] = true;
            }
        }
        return (C4090du[]) list.toArray(new C4090du[0]);
    }
}
