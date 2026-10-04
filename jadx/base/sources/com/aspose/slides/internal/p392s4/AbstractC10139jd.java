package com.aspose.slides.internal.p392s4;

import com.aspose.slides.internal.p550zi.C13621xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.jd */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10139jd extends AbstractC10133c5 {

    /* JADX INFO: renamed from: du */
    private C10148yj[] f36459du;

    /* JADX INFO: renamed from: h4 */
    private int f36460h4;

    /* JADX INFO: renamed from: k4 */
    private int f36461k4;

    /* JADX INFO: renamed from: kk */
    private int f36462kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f36463m9;

    /* JADX INFO: renamed from: to */
    private int f36464to;

    /* JADX INFO: renamed from: x1 */
    private int f36465x1;

    public AbstractC10139jd(int i, int i2) {
        super(i, i2);
        this.f36463m9 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private byte m49886k4(int i, byte[] bArr, int[] iArr, int i2) {
        C10148yj c10148yjClone = this.f36459du[i].Clone();
        int i3 = iArr[0];
        int i4 = c10148yjClone.f36521to;
        int i5 = i3 + i4;
        int i6 = i4 + 1;
        if (i5 >= i2) {
            int i7 = (i5 - i2) + 1;
            this.f36461k4 = i7;
            i6 -= i7;
            this.f36465x1 = i;
            while (i5 >= i2) {
                i5--;
                i -= c10148yjClone.f36520kk;
                if (i < 0) {
                    break;
                }
                this.f36459du[i].CloneTo(c10148yjClone);
            }
        } else {
            this.f36461k4 = 0;
            int i8 = i5 - 1;
            bArr[i5] = c10148yjClone.f36522x1;
            i -= c10148yjClone.f36520kk;
            i5 = i8;
        }
        while (i >= 0) {
            this.f36459du[i].CloneTo(c10148yjClone);
            int i9 = i5 - 1;
            bArr[i5] = c10148yjClone.f36522x1;
            i -= c10148yjClone.f36520kk;
            i5 = i9;
        }
        int i10 = iArr[0];
        byte b = c10148yjClone.f36519k4;
        bArr[i10] = b;
        iArr[0] = i10 + i6;
        return b;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: c5 */
    public /* bridge */ /* synthetic */ int mo49781c5() {
        return super.mo49781c5();
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: dy */
    public /* bridge */ /* synthetic */ int mo49784dy() {
        return super.mo49784dy();
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: h4 */
    public /* bridge */ /* synthetic */ int mo49786h4() {
        return super.mo49786h4();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C13621xk mo49831k4();

    /* JADX INFO: renamed from: ks */
    public void m49891ks() {
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: m9 */
    public /* bridge */ /* synthetic */ int mo49788m9() {
        return super.mo49788m9();
    }

    /* JADX INFO: renamed from: x1 */
    public C13621xk mo49892x1() {
        return mo49831k4().Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public C13621xk m49890k4(byte[] bArr, int i) {
        String str;
        int i2;
        boolean z;
        int i3;
        String str2 = null;
        boolean z2 = false;
        if (this.f36463m9) {
            C13621xk c13621xkClone = mo49892x1().Clone();
            if (c13621xkClone.f45228k4) {
                int i4 = c13621xkClone.f45230x1;
                if (i4 == mo49788m9()) {
                    m49791up();
                    this.f36459du = m49889k4(4096 - mo49784dy());
                    this.f36462kk = 0;
                    this.f36464to = -1;
                    this.f36460h4 = 1 << mo49781c5();
                    z = true;
                } else if (i4 == mo49786h4()) {
                    z = true;
                    i = 0;
                } else {
                    str2 = "Failed to decode. The first compression code should be <CC>. Table is not ready.";
                }
                this.f36463m9 = false;
                str = str2;
                i2 = 0;
            } else {
                str2 = c13621xkClone.f45229kk;
            }
            z = false;
            this.f36463m9 = false;
            str = str2;
            i2 = 0;
        } else {
            int[] iArr = {0};
            m49888k4(bArr, iArr, i);
            str = null;
            i2 = iArr[0];
            z = true;
        }
        if (z) {
            while (i2 < i) {
                if (this.f36462kk >= m49782ck()) {
                    m49792yj();
                }
                C13621xk c13621xkClone2 = mo49831k4().Clone();
                if (!c13621xkClone2.f45228k4) {
                    str = c13621xkClone2.f45229kk;
                    break;
                }
                int i5 = c13621xkClone2.f45230x1;
                if (i5 == mo49788m9()) {
                    m49791up();
                    this.f36464to = -1;
                    this.f36462kk = 0;
                } else {
                    if (i5 == mo49786h4()) {
                        break;
                    }
                    if (i5 < mo49788m9()) {
                        byte b = (byte) i5;
                        int i6 = i2 + 1;
                        bArr[i2] = b;
                        int[] iArr2 = {this.f36462kk};
                        m49887k4(b, this.f36459du, iArr2, this.f36464to, this.f36460h4);
                        this.f36462kk = iArr2[0];
                        this.f36464to = i5;
                        i2 = i6;
                    } else {
                        int iMo49784dy = i5 - mo49784dy();
                        int i7 = this.f36462kk;
                        if (iMo49784dy < i7) {
                            int[] iArr3 = {i2};
                            byte bM49886k4 = m49886k4(iMo49784dy, bArr, iArr3, i);
                            i2 = iArr3[0];
                            int[] iArr4 = {this.f36462kk};
                            m49887k4(bM49886k4, this.f36459du, iArr4, this.f36464to, this.f36460h4);
                            this.f36462kk = iArr4[0];
                        } else {
                            int i8 = this.f36464to;
                            int i9 = this.f36460h4;
                            if (i8 < i9) {
                                if (i8 < 0) {
                                    str = "The first compressed code is incorrect. String table is not created yet.";
                                    break;
                                }
                                int[] iArr5 = {i7};
                                m49887k4((byte) i8, this.f36459du, iArr5, i8, i9);
                                i3 = iArr5[0];
                            } else {
                                C10148yj c10148yjClone = this.f36459du[i8 - i9].Clone();
                                int[] iArr6 = {this.f36462kk};
                                m49887k4(c10148yjClone.f36519k4, this.f36459du, iArr6, this.f36464to, this.f36460h4);
                                i3 = iArr6[0];
                            }
                            this.f36462kk = i3;
                            int[] iArr7 = {i2};
                            m49886k4(this.f36462kk - 1, bArr, iArr7, i);
                            i2 = iArr7[0];
                            iMo49784dy = i7;
                        }
                        this.f36464to = this.f36460h4 + iMo49784dy;
                    }
                }
            }
            z2 = z;
        } else {
            z2 = z;
        }
        C13621xk c13621xk = new C13621xk();
        c13621xk.f45228k4 = z2;
        c13621xk.f45230x1 = i2;
        c13621xk.f45229kk = str;
        return c13621xk;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m49887k4(byte b, C10148yj[] c10148yjArr, int[] iArr, int i, int i2) {
        if (iArr[0] < c10148yjArr.length) {
            if (i >= i2) {
                int i3 = i - i2;
                C10148yj c10148yjClone = c10148yjArr[i3].Clone();
                C10148yj c10148yj = new C10148yj();
                c10148yj.f36522x1 = b;
                c10148yj.f36521to = c10148yjClone.f36521to + 1;
                int i4 = iArr[0];
                c10148yj.f36520kk = i4 - i3;
                c10148yj.f36519k4 = c10148yjClone.f36519k4;
                iArr[0] = i4 + 1;
                c10148yj.CloneTo(c10148yjArr[i4]);
                return;
            }
            if (i >= 0) {
                C10148yj c10148yj2 = new C10148yj();
                c10148yj2.f36522x1 = b;
                int i5 = iArr[0];
                c10148yj2.f36520kk = i5 + i + 1;
                c10148yj2.f36521to = 1;
                c10148yj2.f36519k4 = (byte) i;
                iArr[0] = i5 + 1;
                c10148yj2.CloneTo(c10148yjArr[i5]);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49888k4(byte[] bArr, int[] iArr, int i) {
        if (this.f36461k4 > 0) {
            C10148yj c10148yjClone = this.f36459du[this.f36465x1].Clone();
            int i2 = this.f36465x1;
            int i3 = 0;
            while (true) {
                int i4 = this.f36461k4;
                if (i4 <= i) {
                    break;
                }
                this.f36461k4 = i4 - 1;
                i2 -= c10148yjClone.f36520kk;
                i3++;
                if (i2 < 0) {
                    break;
                } else {
                    this.f36459du[i2].CloneTo(c10148yjClone);
                }
            }
            iArr[0] = this.f36461k4 - 1;
            while (true) {
                int i5 = iArr[0];
                if (i5 < 0) {
                    break;
                }
                iArr[0] = i5 - 1;
                bArr[i5] = c10148yjClone.f36522x1;
                i2 -= c10148yjClone.f36520kk;
                if (i2 < 0) {
                    break;
                } else {
                    this.f36459du[i2].CloneTo(c10148yjClone);
                }
            }
            iArr[0] = this.f36461k4;
            this.f36461k4 = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C10148yj[] m49889k4(int i) {
        C10148yj[] c10148yjArr = new C10148yj[i];
        for (int i2 = 0; i2 < i; i2++) {
            c10148yjArr[i2] = new C10148yj();
        }
        return c10148yjArr;
    }
}
