package com.aspose.slides.internal.p116ev;

import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ev.dy */
/* JADX INFO: loaded from: classes.dex */
public class C3798dy extends AbstractC3803to {

    /* JADX INFO: renamed from: c5 */
    private int f10335c5;

    /* JADX INFO: renamed from: ck */
    private int f10336ck;

    /* JADX INFO: renamed from: du */
    private int f10337du;

    /* JADX INFO: renamed from: dy */
    private int f10338dy;

    /* JADX INFO: renamed from: fa */
    private int f10339fa;

    /* JADX INFO: renamed from: h4 */
    private int f10340h4;

    /* JADX INFO: renamed from: jd */
    private int f10341jd;

    /* JADX INFO: renamed from: ks */
    private boolean[] f10342ks;

    /* JADX INFO: renamed from: m9 */
    private int f10343m9;

    /* JADX INFO: renamed from: rv */
    private int[] f10344rv;

    /* JADX INFO: renamed from: to */
    private int f10345to;

    /* JADX INFO: renamed from: up */
    private int[] f10346up;

    /* JADX INFO: renamed from: yj */
    private int[] f10347yj;

    public C3798dy(C13641m9 c13641m9, int i, int i2) {
        super(c13641m9, i, i2, 0);
    }

    /* JADX INFO: renamed from: to */
    private int m15173to(int i) {
        return this.f18176k4.m63005kk(this.f10343m9 + i);
    }

    @Override // com.aspose.slides.internal.p116ev.AbstractC3803to
    /* JADX INFO: renamed from: du */
    public int mo15174du() {
        mo15178kk();
        return this.f10345to;
    }

    @Override // com.aspose.slides.internal.p116ev.AbstractC3803to
    /* JADX INFO: renamed from: h4 */
    public C13641m9 mo15175h4() {
        mo15178kk();
        return (C13641m9) this.f18176k4.mo62967kk(this.f10340h4, mo15174du());
    }

    /* JADX INFO: renamed from: k4 */
    public final int m15176k4(int i, int i2) {
        mo15178kk();
        return this.f10346up[this.f10344rv[i] + i2];
    }

    /* JADX INFO: renamed from: kk */
    public final int m15177kk(int i) {
        mo15178kk();
        if (i >= m15211m9()) {
            return 0;
        }
        int[] iArr = this.f10344rv;
        return iArr[i + 1] - iArr[i];
    }

    /* JADX INFO: renamed from: x1 */
    public final int m15180x1(int i) {
        return this.f18176k4.m62997du((i * 2) + 10);
    }

    /* JADX INFO: renamed from: k4 */
    private void m15172k4(boolean z) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iM15173to = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f10337du; i5++) {
            if (iM15173to == 0) {
                int i6 = i + 1;
                int iM15173to2 = m15173to(i);
                if ((iM15173to2 & 8) == 8) {
                    i += 2;
                    iM15173to = m15173to(i6);
                } else {
                    i = i6;
                }
                i4 = iM15173to2;
            } else {
                iM15173to--;
            }
            if (z) {
                this.f10342ks[i5] = (i4 & 1) == 1;
            }
            if ((i4 & 2) == 2) {
                if (z) {
                    this.f10346up[i5] = this.f18176k4.m63005kk(this.f10338dy + i2);
                    int[] iArr = this.f10346up;
                    iArr[i5] = iArr[i5] * ((i4 & 16) == 16 ? 1 : -1);
                }
                i2++;
            } else if ((i4 & 16) != 16) {
                if (z) {
                    this.f10346up[i5] = this.f18176k4.m62999h4(this.f10338dy + i2);
                }
                i2 += 2;
            }
            if (z && i5 > 0) {
                int[] iArr2 = this.f10346up;
                iArr2[i5] = iArr2[i5] + iArr2[i5 - 1];
            }
            if ((i4 & 4) == 4) {
                if (z) {
                    this.f10347yj[i5] = this.f18176k4.m63005kk(this.f10335c5 + i3);
                    int[] iArr3 = this.f10347yj;
                    iArr3[i5] = iArr3[i5] * ((i4 & 32) != 32 ? -1 : 1);
                }
                i3++;
            } else if ((i4 & 32) != 32) {
                if (z) {
                    this.f10347yj[i5] = this.f18176k4.m62999h4(this.f10335c5 + i3);
                }
                i3 += 2;
            }
            if (z && i5 > 0) {
                int[] iArr4 = this.f10347yj;
                iArr4[i5] = iArr4[i5] + iArr4[i5 - 1];
            }
        }
        this.f10341jd = i;
        this.f10336ck = i2;
        this.f10339fa = i3;
    }

    @Override // com.aspose.slides.internal.p116ev.AbstractC3803to
    /* JADX INFO: renamed from: kk */
    public void mo15178kk() {
        if (((AbstractC3803to) this).f10362x1 || ((AbstractC3803to) this).f10362x1) {
            return;
        }
        int i = 0;
        if (m26239k4().m63014k4() == 0) {
            this.f10345to = 0;
            this.f10337du = 0;
            this.f10340h4 = 0;
            this.f10343m9 = 0;
            this.f10338dy = 0;
            this.f10335c5 = 0;
            return;
        }
        this.f10345to = this.f18176k4.m62997du((m15211m9() * 2) + 10);
        int iM15211m9 = ((m15211m9() + 1) * 2) + 10;
        this.f10340h4 = iM15211m9;
        this.f10343m9 = iM15211m9 + this.f10345to;
        int iM15180x1 = m15180x1(m15211m9() - 1) + 1;
        this.f10337du = iM15180x1;
        this.f10346up = new int[iM15180x1];
        this.f10347yj = new int[iM15180x1];
        this.f10342ks = new boolean[iM15180x1];
        m15172k4(false);
        int i2 = this.f10343m9 + this.f10341jd;
        this.f10338dy = i2;
        this.f10335c5 = i2 + this.f10336ck;
        int[] iArr = new int[m15211m9() + 1];
        this.f10344rv = iArr;
        iArr[0] = 0;
        while (true) {
            int[] iArr2 = this.f10344rv;
            if (i >= iArr2.length - 1) {
                m15172k4(true);
                m26220k4(m26240x1() - ((((((m15211m9() * 2) + 12) + this.f10345to) + this.f10341jd) + this.f10336ck) + this.f10339fa));
                ((AbstractC3803to) this).f10362x1 = true;
                return;
            }
            int i3 = i + 1;
            iArr2[i3] = m15180x1(i) + 1;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m15181x1(int i, int i2) {
        mo15178kk();
        return this.f10347yj[this.f10344rv[i] + i2];
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m15179kk(int i, int i2) {
        mo15178kk();
        return this.f10342ks[this.f10344rv[i] + i2];
    }
}
