package com.aspose.slides.internal.p106ef;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4106up;
import com.aspose.slides.internal.p135fp.C4111x6;
import com.aspose.slides.internal.p225ke.C5663h4;
import com.aspose.slides.internal.p225ke.C5667to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3676h4 extends AbstractC3680to {

    /* JADX INFO: renamed from: c5 */
    private C4090du f10195c5;

    /* JADX INFO: renamed from: dy */
    private int f10196dy;

    /* JADX INFO: renamed from: jd */
    private int f10197jd;

    /* JADX INFO: renamed from: m9 */
    private final C4090du[] f10198m9;

    public C3676h4(C4106up c4106up) {
        super(c4106up);
        this.f10198m9 = new C4090du[C5667to.f15656to];
        m14884k4(C5667to.f15657x1);
    }

    /* JADX INFO: renamed from: du */
    private boolean m14883du(C4111x6 c4111x6) {
        if (this.f10222kk.m16424up() != 0 && this.f10223to == 0) {
            mo14890to();
        }
        if (!this.f10220h4) {
            for (int i = 0; i < this.f10222kk.m16408h4().m16440h4(); i++) {
                int i2 = this.f10222kk.m16408h4().m16445kk()[i];
                int[] iArr = {0};
                C3677k4[] c3677k4Arr = {this.f10219du};
                boolean zM14914k4 = m14914k4(this.f10198m9[this.f10222kk.m16422to().m16362x1()[i2].m16332x1() & 255], iArr, c3677k4Arr);
                int iM14908k4 = iArr[0];
                c3677k4Arr[0].CloneTo(this.f10219du);
                if (!zM14914k4) {
                    return false;
                }
                if (iM14908k4 != 0) {
                    c3677k4Arr[0] = this.f10219du;
                    boolean zM14913k4 = m14913k4(iM14908k4, c3677k4Arr);
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    if (!zM14913k4) {
                        return false;
                    }
                    c3677k4Arr[0] = this.f10219du;
                    int iM14911x1 = AbstractC3680to.m14911x1(iM14908k4, c3677k4Arr);
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    iM14908k4 = AbstractC3680to.m14908k4(iM14911x1, iM14908k4);
                }
                int[] iArr2 = this.f10224x1;
                int i3 = iM14908k4 + iArr2[i2];
                iArr2[i2] = i3;
                c4111x6.m16451k4()[i].m16394k4()[0] = (short) (i3 << this.f10222kk.m16408h4().m16448x1());
            }
        }
        this.f10223to--;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private int m14886x1(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3680to
    /* JADX INFO: renamed from: k4 */
    public void mo14887k4() {
        m14885k4(this.f10222kk.m16408h4().f11269x1);
        if (this.f10222kk.m16424up() > 0) {
            this.f10223to = this.f10222kk.m16424up();
        }
        int i = (this.f10222kk.m16408h4().f11268to & 255) == 0 ? 1 : 0;
        for (int i2 = 0; i2 < this.f10222kk.m16408h4().f11269x1.length; i2++) {
            int i3 = this.f10222kk.m16408h4().f11269x1[i2];
            for (int i4 = this.f10222kk.m16408h4().f11268to & 255; i4 <= (this.f10222kk.m16408h4().f11266kk & 255); i4++) {
                this.f10222kk.m16403c5()[i3][i4] = this.f10222kk.m16408h4().m16448x1();
            }
            this.f10224x1[i3] = 0;
        }
        this.f10197jd = this.f10222kk.m16408h4().m16441k4() == 0 ? i ^ 1 : i != 0 ? 2 : 3;
        for (int i5 = 0; i5 < this.f10222kk.m16408h4().m16440h4(); i5++) {
            C4095jd c4095jd = this.f10222kk.m16422to().m16362x1()[this.f10222kk.m16408h4().m16445kk()[i5]];
            C4106up c4106up = this.f10222kk;
            if (i == 0) {
                this.f10195c5 = c4106up.m16410k4().get_Item(Integer.valueOf((c4095jd.m16321k4() & 255) | 16));
            } else if (c4106up.m16408h4().m16441k4() == 0) {
                this.f10198m9[c4095jd.m16332x1() & 255] = this.f10222kk.m16410k4().get_Item(Integer.valueOf(c4095jd.m16332x1() & 255));
            }
        }
        this.f10196dy = 0;
        this.f10219du = new C3677k4();
        this.f10223to = this.f10222kk.m16424up();
        this.f10221k4.m16307x1();
    }

    /* JADX INFO: renamed from: kk */
    public boolean m14889kk(C4111x6 c4111x6) {
        int iM16448x1 = 1 << this.f10222kk.m16408h4().m16448x1();
        int iM16448x12 = (-1) << this.f10222kk.m16408h4().m16448x1();
        if (this.f10222kk.m16424up() != 0 && this.f10223to == 0) {
            mo14890to();
        }
        if (!this.f10220h4) {
            int i = this.f10222kk.m16408h4().f11268to & 255;
            if (this.f10196dy == 0) {
                while (true) {
                    if (i > (this.f10222kk.m16408h4().f11266kk & 255)) {
                        break;
                    }
                    int[] iArr = {0};
                    C3677k4[] c3677k4Arr = {this.f10219du};
                    boolean zM14914k4 = m14914k4(this.f10195c5, iArr, c3677k4Arr);
                    int i2 = iArr[0];
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    if (!zM14914k4) {
                        return false;
                    }
                    int i3 = i2 >> 4;
                    int i4 = i2 & 15;
                    if (i4 != 0) {
                        c3677k4Arr[0] = this.f10219du;
                        boolean zM14913k4 = m14913k4(1, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        if (!zM14913k4) {
                            return false;
                        }
                        c3677k4Arr[0] = this.f10219du;
                        int iM14911x1 = AbstractC3680to.m14911x1(1, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        i4 = iM14911x1 != 0 ? iM16448x1 : iM16448x12;
                    } else if (i3 != 15) {
                        this.f10196dy = 1 << i3;
                        if (i3 != 0) {
                            c3677k4Arr[0] = this.f10219du;
                            boolean zM14913k42 = m14913k4(i3, c3677k4Arr);
                            c3677k4Arr[0].CloneTo(this.f10219du);
                            if (!zM14913k42) {
                                return false;
                            }
                            c3677k4Arr[0] = this.f10219du;
                            int iM14911x12 = AbstractC3680to.m14911x1(i3, c3677k4Arr);
                            c3677k4Arr[0].CloneTo(this.f10219du);
                            this.f10196dy += iM14911x12;
                        }
                    }
                    do {
                        int i5 = C5663h4.f15647k4[i];
                        short s = c4111x6.m16451k4()[0].m16394k4()[i5];
                        if (s == 0) {
                            i3--;
                            if (i3 >= 0) {
                                break;
                                break;
                            }
                            break;
                        }
                        c3677k4Arr[0] = this.f10219du;
                        boolean zM14913k43 = m14913k4(1, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        if (!zM14913k43) {
                            return false;
                        }
                        c3677k4Arr[0] = this.f10219du;
                        int iM14911x13 = AbstractC3680to.m14911x1(1, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        if (iM14911x13 != 0 && (s & iM16448x1) == 0) {
                            if (s >= 0) {
                                short[] sArrM16394k4 = c4111x6.m16451k4()[0].m16394k4();
                                sArrM16394k4[i5] = (short) (sArrM16394k4[i5] + ((short) iM16448x1));
                            } else {
                                short[] sArrM16394k42 = c4111x6.m16451k4()[0].m16394k4();
                                sArrM16394k42[i5] = (short) (sArrM16394k42[i5] + ((short) iM16448x12));
                            }
                        }
                        i++;
                    } while (i <= (this.f10222kk.m16408h4().f11266kk & 255));
                    if (i4 != 0) {
                        c4111x6.m16451k4()[0].m16392k4(C5663h4.f15647k4[i], (short) i4);
                    }
                    i++;
                }
            }
            if (this.f10196dy > 0) {
                while (i <= (this.f10222kk.m16408h4().f11266kk & 255)) {
                    int i6 = C5663h4.f15647k4[i];
                    short s2 = c4111x6.m16451k4()[0].m16394k4()[i6];
                    if (s2 != 0) {
                        C3677k4[] c3677k4Arr2 = {this.f10219du};
                        boolean zM14913k44 = m14913k4(1, c3677k4Arr2);
                        c3677k4Arr2[0].CloneTo(this.f10219du);
                        if (!zM14913k44) {
                            return false;
                        }
                        c3677k4Arr2[0] = this.f10219du;
                        int iM14911x14 = AbstractC3680to.m14911x1(1, c3677k4Arr2);
                        c3677k4Arr2[0].CloneTo(this.f10219du);
                        if (iM14911x14 != 0 && (s2 & iM16448x1) == 0) {
                            if (s2 >= 0) {
                                short[] sArrM16394k43 = c4111x6.m16451k4()[0].m16394k4();
                                sArrM16394k43[i6] = (short) (sArrM16394k43[i6] + ((short) iM16448x1));
                            } else {
                                short[] sArrM16394k44 = c4111x6.m16451k4()[0].m16394k4();
                                sArrM16394k44[i6] = (short) (sArrM16394k44[i6] + ((short) iM16448x12));
                            }
                        }
                    }
                    i++;
                }
                this.f10196dy--;
            }
        }
        this.f10223to--;
        return true;
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3680to
    /* JADX INFO: renamed from: to */
    public void mo14890to() {
        super.mo14890to();
        this.f10196dy = 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m14884k4(int i) {
        int[][] iArr = new int[i][];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = new int[C5667to.f15654k4];
            for (int i3 = 0; i3 < C5667to.f15654k4; i3++) {
                iArr[i2][i3] = -1;
            }
        }
        this.f10222kk.m16418k4(iArr);
    }

    /* JADX INFO: renamed from: to */
    public boolean m14891to(C4111x6 c4111x6) {
        if (this.f10222kk.m16424up() != 0 && this.f10223to == 0) {
            mo14890to();
        }
        for (int i = 0; i < this.f10222kk.m16408h4().m16440h4(); i++) {
            C3677k4[] c3677k4Arr = {this.f10219du};
            boolean zM14913k4 = m14913k4(1, c3677k4Arr);
            c3677k4Arr[0].CloneTo(this.f10219du);
            if (!zM14913k4) {
                return false;
            }
            c3677k4Arr[0] = this.f10219du;
            int iM14911x1 = AbstractC3680to.m14911x1(1, c3677k4Arr);
            c3677k4Arr[0].CloneTo(this.f10219du);
            if (iM14911x1 != 0) {
                short[] sArrM16394k4 = c4111x6.m16451k4()[i].m16394k4();
                sArrM16394k4[0] = (short) (((short) (1 << this.f10222kk.m16408h4().m16448x1())) | sArrM16394k4[0]);
            }
        }
        this.f10223to--;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m14892x1(C4111x6 c4111x6) {
        int i;
        if (this.f10222kk.m16424up() != 0 && this.f10223to == 0) {
            mo14890to();
        }
        if (!this.f10220h4) {
            int i2 = this.f10196dy;
            if (i2 <= 0) {
                int i3 = this.f10222kk.m16408h4().f11268to & 255;
                while (true) {
                    if (i3 > (this.f10222kk.m16408h4().f11266kk & 255)) {
                        break;
                    }
                    int[] iArr = {0};
                    C3677k4[] c3677k4Arr = {this.f10219du};
                    boolean zM14914k4 = m14914k4(this.f10195c5, iArr, c3677k4Arr);
                    int i4 = iArr[0];
                    c3677k4Arr[0].CloneTo(this.f10219du);
                    if (!zM14914k4) {
                        return false;
                    }
                    int i5 = i4 >> 4;
                    int i6 = i4 & 15;
                    if (i6 != 0) {
                        i = i3 + i5;
                        c3677k4Arr[0] = this.f10219du;
                        boolean zM14913k4 = m14913k4(i6, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        if (!zM14913k4) {
                            return false;
                        }
                        c3677k4Arr[0] = this.f10219du;
                        int iM14911x1 = AbstractC3680to.m14911x1(i6, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        c4111x6.m16451k4()[0].m16394k4()[C5663h4.f15647k4[i]] = (short) (AbstractC3680to.m14908k4(iM14911x1, i6) << this.f10222kk.m16408h4().m16448x1());
                    } else if (i5 == 15) {
                        i = i3 + 15;
                    } else if (i5 != 0) {
                        this.f10196dy = 1 << i5;
                        c3677k4Arr[0] = this.f10219du;
                        boolean zM14913k42 = m14913k4(i5, c3677k4Arr);
                        c3677k4Arr[0].CloneTo(this.f10219du);
                        if (!zM14913k42) {
                            return false;
                        }
                        C3677k4[] c3677k4Arr2 = {this.f10219du};
                        int iM14911x12 = AbstractC3680to.m14911x1(i5, c3677k4Arr2);
                        c3677k4Arr2[0].CloneTo(this.f10219du);
                        this.f10196dy = (this.f10196dy + iM14911x12) - 1;
                    }
                    i3 = i + 1;
                }
            } else {
                this.f10196dy = i2 - 1;
            }
        }
        this.f10223to--;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m14885k4(int[] iArr) {
        int iM14886x1 = m14886x1(iArr) + 1;
        if (this.f10222kk.m16403c5().length < iM14886x1) {
            m14884k4(iM14886x1);
        }
        if (this.f10224x1.length < iM14886x1) {
            this.f10224x1 = new int[iM14886x1];
        }
    }

    @Override // com.aspose.slides.internal.p106ef.AbstractC3680to
    /* JADX INFO: renamed from: k4 */
    public boolean mo14888k4(C4111x6 c4111x6) {
        int i = this.f10197jd;
        if (i == 0) {
            return m14883du(c4111x6);
        }
        if (i == 1) {
            return m14892x1(c4111x6);
        }
        if (i == 2) {
            return m14891to(c4111x6);
        }
        if (i == 3) {
            return m14889kk(c4111x6);
        }
        throw new ArgumentOutOfRangeException();
    }
}
