package com.aspose.slides.internal.p106ef;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4103to;
import com.aspose.slides.internal.p135fp.C4109wl;
import com.aspose.slides.internal.p135fp.C4112yj;
import com.aspose.slides.internal.p225ke.C5663h4;
import com.aspose.slides.internal.p225ke.C5667to;
import com.aspose.slides.internal.p385rr.C10052k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3679m9 extends AbstractC3675du {

    /* JADX INFO: renamed from: c5 */
    private int[] f10209c5;

    /* JADX INFO: renamed from: du */
    private int[] f10210du;

    /* JADX INFO: renamed from: dy */
    private boolean f10211dy;

    /* JADX INFO: renamed from: h4 */
    private byte f10212h4;

    /* JADX INFO: renamed from: kk */
    private int f10213kk;

    /* JADX INFO: renamed from: m9 */
    private int f10214m9;

    /* JADX INFO: renamed from: to */
    private int f10215to;

    /* JADX INFO: renamed from: x1 */
    private final long[][] f10216x1;

    public C3679m9(C4112yj c4112yj) {
        super(c4112yj);
        this.f10216x1 = new long[4][];
        this.f10209c5 = new int[C5667to.f15655kk + 1];
    }

    /* JADX INFO: renamed from: h4 */
    private void m14899h4() {
        if (this.f10211dy) {
            return;
        }
        m14874du().m16466m9().m16398x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m14900k4(int i, int i2) {
        if (this.f10211dy) {
            return;
        }
        m14874du().m16466m9().m16397k4(i, i2);
    }

    /* JADX INFO: renamed from: m9 */
    private void m14902m9() {
        int i = this.f10215to;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                i >>= 1;
                if (i == 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 > 14) {
                throw new Exception("Huff missing code");
            }
            m14901k4(false, this.f10212h4, i2 << 4);
            if (i2 != 0) {
                m14900k4(this.f10215to, i2);
            }
            this.f10215to = 0;
            m14903x1(0, this.f10213kk);
            this.f10213kk = 0;
        }
    }

    /* JADX INFO: renamed from: du */
    public void m14904du(C4103to[] c4103toArr) {
        int[] iArr = new int[C5667to.f15654k4];
        C4109wl c4109wlM16469x1 = m14874du().m16469x1();
        int i = 0;
        for (int i2 = c4109wlM16469x1.f11268to & 255; i2 <= (c4109wlM16469x1.f11266kk & 255); i2++) {
            int iM16391k4 = c4103toArr[0].m16391k4(C5663h4.f15647k4[i2]);
            if (iM16391k4 < 0) {
                iM16391k4 = -iM16391k4;
            }
            int iM16448x1 = iM16391k4 >> c4109wlM16469x1.m16448x1();
            iArr[i2] = iM16448x1;
            if (iM16448x1 == 1) {
                i = i2;
            }
        }
        int i3 = this.f10213kk;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = c4109wlM16469x1.f11268to & 255; i6 <= (c4109wlM16469x1.f11266kk & 255); i6++) {
            int i7 = iArr[i6];
            if (i7 == 0) {
                i4++;
            } else {
                while (i4 > 15 && i6 <= i) {
                    m14902m9();
                    m14901k4(false, this.f10212h4, 240);
                    i4 -= 16;
                    m14903x1(i3, i5);
                    i3 = 0;
                    i5 = 0;
                }
                if (i7 > 1) {
                    this.f10210du[i3 + i5] = (char) (i7 & 1);
                    i5++;
                } else {
                    m14902m9();
                    m14901k4(false, this.f10212h4, (i4 << 4) + 1);
                    m14900k4(c4103toArr[0].m16394k4()[C5663h4.f15647k4[i6]] < 0 ? 0 : 1, 1);
                    m14903x1(i3, i5);
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                }
            }
        }
        if (i4 > 0 || i5 > 0) {
            int i8 = this.f10215to + 1;
            this.f10215to = i8;
            int i9 = this.f10213kk + i5;
            this.f10213kk = i9;
            if (i8 == 32767 || i9 > 1001 - C5667to.f15654k4) {
                m14902m9();
            }
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: kk */
    public void mo14879kk() {
        this.f10209c5 = new int[m14874du().m16457k4()];
        int i = (m14874du().m16469x1().f11268to & 255) == 0 ? 1 : 0;
        C4109wl c4109wlM16469x1 = m14874du().m16469x1();
        int i2 = 0;
        while (true) {
            int[] iArr = c4109wlM16469x1.f11269x1;
            if (i2 >= iArr.length) {
                break;
            }
            C4095jd c4095jd = m14874du().m16453du().m16362x1()[iArr[i2]];
            byte bM16332x1 = i != 0 ? c4095jd.m16332x1() : c4095jd.m16321k4();
            if (i == 0) {
                this.f10212h4 = bM16332x1;
                if (this.f10210du == null) {
                    this.f10210du = new int[1000];
                }
            }
            long[][] jArr = this.f10216x1;
            int i3 = bM16332x1 & 255;
            if (jArr[i3] == null) {
                jArr[i3] = new long[257];
            }
            C10052k4.m49683k4(jArr[i3], 0, 257);
            i2++;
        }
        if (c4109wlM16469x1.m16441k4() == 0) {
            this.f10214m9 = i ^ 1;
        } else {
            this.f10214m9 = i != 0 ? 2 : 3;
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: to */
    public void mo14880to() {
        this.f10211dy = true;
        int i = (m14874du().m16469x1().f11268to & 255) == 0 ? 1 : 0;
        C4109wl c4109wlM16469x1 = m14874du().m16469x1();
        int i2 = 0;
        while (true) {
            int[] iArr = c4109wlM16469x1.f11269x1;
            if (i2 >= iArr.length) {
                break;
            }
            C4095jd c4095jd = m14874du().m16453du().m16362x1()[iArr[i2]];
            byte bM16332x1 = i != 0 ? c4095jd.m16332x1() : c4095jd.m16321k4();
            this.f10212h4 = bM16332x1;
            long[][] jArr = this.f10216x1;
            int i3 = bM16332x1 & 255;
            if (jArr[i3] == null) {
                jArr[i3] = new long[257];
            }
            long[] jArr2 = jArr[i3];
            C10052k4.m49683k4(jArr2, 0, jArr2.length);
            i2++;
        }
        if (c4109wlM16469x1.m16441k4() == 0) {
            this.f10214m9 = 1 ^ i;
            return;
        }
        this.f10214m9 = i != 0 ? 2 : 3;
        if (i == 0) {
            this.f10210du = new int[1000];
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: x1 */
    public void mo14881x1() {
        m14902m9();
        m14899h4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m14901k4(boolean z, byte b, int i) {
        if (this.f10211dy) {
            long[] jArr = this.f10216x1[b & 255];
            jArr[i] = jArr[i] + 1;
        } else {
            if (!z) {
                b = (byte) ((b & 255) + 16);
            }
            m14900k4(m14874du().m16464kk().get_Item(Byte.valueOf(b)).m16281kk()[i], m14874du().m16464kk().get_Item(Byte.valueOf(b)).m16283to()[i]);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m14903x1(int i, int i2) {
        if (this.f10211dy) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m14900k4(this.f10210du[i + i3], 1);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m14905h4(C4103to[] c4103toArr) {
        for (int i = 0; i < m14874du().m16457k4(); i++) {
            m14900k4(c4103toArr[i].m16394k4()[0] >> m14874du().m16469x1().m16448x1(), 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m14906kk(C4103to[] c4103toArr) {
        int iM16448x1;
        int i;
        int i2 = 0;
        for (int i3 = m14874du().m16469x1().f11268to & 255; i3 <= (m14874du().m16469x1().f11266kk & 255); i3++) {
            short s = c4103toArr[0].m16394k4()[C5663h4.f15647k4[i3]];
            if (s != 0) {
                if (s < 0) {
                    iM16448x1 = (-s) >> m14874du().m16469x1().m16448x1();
                    i = ~iM16448x1;
                } else {
                    iM16448x1 = s >> m14874du().m16469x1().m16448x1();
                    i = iM16448x1;
                }
                if (iM16448x1 == 0) {
                    i2++;
                } else {
                    if (this.f10215to > 0) {
                        m14902m9();
                    }
                    while (i2 > 15) {
                        m14901k4(false, this.f10212h4, 240);
                        i2 -= 16;
                    }
                    int i4 = 1;
                    while (true) {
                        iM16448x1 >>= 1;
                        if (iM16448x1 == 0) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 > AbstractC3675du.f10193k4) {
                        throw new Exception("Bad dct coef");
                    }
                    m14901k4(false, this.f10212h4, (i2 << 4) + i4);
                    m14900k4(i, i4);
                    i2 = 0;
                }
            }
        }
        if (i2 > 0) {
            int i5 = this.f10215to + 1;
            this.f10215to = i5;
            if (i5 == 32767) {
                m14902m9();
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public void m14907to(C4103to[] c4103toArr) {
        int i;
        for (int i2 = 0; i2 < m14874du().m16457k4(); i2++) {
            int iM16448x1 = c4103toArr[i2].m16394k4()[0] >> m14874du().m16469x1().m16448x1();
            int i3 = iM16448x1 - this.f10209c5[m14874du().m16469x1().m16445kk()[i2]];
            this.f10209c5[m14874du().m16469x1().m16445kk()[i2]] = iM16448x1;
            if (i3 < 0) {
                int i4 = -i3;
                int i5 = i3 - 1;
                i3 = i4;
                i = i5;
            } else {
                i = i3;
            }
            int i6 = 0;
            while (i3 != 0) {
                i6++;
                i3 >>= 1;
            }
            if (i6 > AbstractC3675du.f10193k4 + 1) {
                throw new Exception("Bad dct coef");
            }
            m14901k4(true, m14874du().m16453du().m16362x1()[m14874du().m16469x1().m16445kk()[i2]].m16332x1(), i6);
            if (i6 != 0) {
                m14900k4(i, i6);
            }
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: k4 */
    public void mo14877k4(C4103to[] c4103toArr) {
        int i = this.f10214m9;
        if (i == 0) {
            m14907to(c4103toArr);
            return;
        }
        if (i == 1) {
            m14906kk(c4103toArr);
        } else if (i == 2) {
            m14905h4(c4103toArr);
        } else {
            if (i != 3) {
                throw new ArgumentOutOfRangeException();
            }
            m14904du(c4103toArr);
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: x1 */
    public void mo14882x1(C4103to[] c4103toArr) {
        this.f10211dy = true;
        mo14877k4(c4103toArr);
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3675du
    /* JADX INFO: renamed from: k4 */
    public C4090du[] mo14878k4() {
        C4090du c4090duM14875k4;
        List list = new List();
        m14902m9();
        boolean[] zArr = new boolean[C5667to.f15656to];
        C4109wl c4109wlM16469x1 = m14874du().m16469x1();
        boolean z = (c4109wlM16469x1.f11268to & 255) == 0;
        for (int i = 0; i < c4109wlM16469x1.f11269x1.length; i++) {
            C4095jd c4095jd = m14874du().m16453du().m16362x1()[c4109wlM16469x1.f11269x1[i]];
            byte bM16321k4 = c4095jd.m16321k4();
            if (!zArr[bM16321k4 & 255]) {
                if (!z) {
                    c4090duM14875k4 = m14875k4(this.f10216x1[bM16321k4]);
                    c4090duM14875k4.m16285x1((byte) 1);
                } else if (c4109wlM16469x1.m16441k4() == 0) {
                    bM16321k4 = c4095jd.m16332x1();
                    int i2 = bM16321k4 & 255;
                    if (!zArr[i2]) {
                        c4090duM14875k4 = m14875k4(this.f10216x1[i2]);
                        c4090duM14875k4.m16285x1((byte) 0);
                    }
                }
                c4090duM14875k4.m16279k4(bM16321k4);
                list.addItem(c4090duM14875k4);
                zArr[bM16321k4 & 255] = true;
            }
        }
        this.f10211dy = false;
        return (C4090du[]) list.toArray(new C4090du[0]);
    }
}
