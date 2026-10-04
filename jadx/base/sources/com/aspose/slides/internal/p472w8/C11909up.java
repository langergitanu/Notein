package com.aspose.slides.internal.p472w8;

import Oooo00o.OooO0OO;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p282mu.C6544x1;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p499xh.C12527kk;
import com.aspose.slides.internal.p499xh.C12528x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.up */
/* JADX INFO: loaded from: classes4.dex */
public final class C11909up extends AbstractC12024x1 {

    /* JADX INFO: renamed from: c5 */
    private boolean f40105c5;

    /* JADX INFO: renamed from: ck */
    private C12025x6 f40106ck;

    /* JADX INFO: renamed from: du */
    private int f40107du;

    /* JADX INFO: renamed from: dy */
    private boolean f40108dy;

    /* JADX INFO: renamed from: fa */
    private C12025x6 f40109fa;

    /* JADX INFO: renamed from: h4 */
    private C12007ix f40110h4;

    /* JADX INFO: renamed from: jd */
    private double f40111jd;

    /* JADX INFO: renamed from: kk */
    private boolean f40112kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f40113m9;

    /* JADX INFO: renamed from: to */
    private C11902kk f40114to;

    /* JADX INFO: renamed from: up */
    private C12003du f40115up;

    /* JADX INFO: renamed from: x1 */
    private C11911x1 f40116x1;

    /* JADX INFO: renamed from: yj */
    private C12003du f40117yj;

    private C11909up(C6544x1 c6544x1, C6544x1 c6544x12, C12003du c12003du, C12003du c12003du2) {
        C12025x6 c12025x6M26372kk;
        C12025x6 c12025x6M26372kk2;
        C12003du c12003duClone;
        C12003du c12003duClone2;
        int i;
        C11909up c11909up;
        this.f40112kk = false;
        this.f40110h4 = new C12007ix();
        this.f40113m9 = false;
        this.f40108dy = false;
        this.f40105c5 = false;
        this.f40111jd = 45.0d;
        this.f40106ck = new C12025x6(0.0f, 0.0f);
        this.f40109fa = new C12025x6(0.0f, 0.0f);
        this.f40115up = new C12003du();
        this.f40117yj = new C12003du();
        C12016rv c12016rvM26366du = C6544x1.m26366du(c6544x1);
        C12016rv c12016rvM26366du2 = C6544x1.m26366du(c6544x12);
        C12016rv c12016rvM26373to = C6544x1.m26373to(c6544x1);
        C12016rv c12016rvM26373to2 = C6544x1.m26373to(c6544x12);
        C12025x6 c12025x6M26372kk3 = C6544x1.m26372kk(c6544x1);
        C12025x6 c12025x6M26372kk4 = C6544x1.m26372kk(c6544x12);
        if (c12016rvM26366du.equals(c12016rvM26366du2)) {
            c12025x6M26372kk = c12025x6M26372kk3;
            c12025x6M26372kk2 = c12025x6M26372kk4;
            if (c12016rvM26373to.equals(c12016rvM26373to2)) {
                c12025x6M26372kk = C6544x1.m26372kk(c6544x1);
                c12025x6M26372kk2 = C6544x1.m26372kk(c6544x12);
            }
            c12003duClone = c12003du.Clone();
            c12003duClone2 = c12003du2.Clone();
            i = 0;
            c11909up = this;
        } else {
            c12003duClone = c12003du.Clone();
            c12003duClone2 = c12003du2.Clone();
            c12025x6M26372kk = c12025x6M26372kk3;
            i = 0;
            c11909up = this;
            c12025x6M26372kk2 = c12025x6M26372kk4;
        }
        c11909up.m55711k4(c12025x6M26372kk, c12025x6M26372kk2, c12003duClone, c12003duClone2, i);
    }

    /* JADX INFO: renamed from: ix */
    private void m55705ix() {
        this.f40107du = 0;
        m55730kk(new C11913yj());
        this.f40110h4 = new C12007ix();
        this.f40112kk = false;
        this.f40111jd = 45.0d;
        this.f40113m9 = false;
        this.f40114to = new C11902kk(0);
        m55715uz();
    }

    /* JADX INFO: renamed from: k4 */
    private float m55706k4(float f, float f2, float f3) {
        float fSqrt = (float) (2.0d / Math.sqrt(3.141592653589793d));
        double dSqrt = (float) (((double) ((f - f3) / f2)) / Math.sqrt(2.0d));
        return fSqrt * ((float) (((Math.pow(dSqrt, 9.0d) / 216.0d) + (((Math.pow(dSqrt, 5.0d) / 10.0d) + (dSqrt - (Math.pow(dSqrt, 3.0d) / 3.0d))) - (Math.pow(dSqrt, 7.0d) / 42.0d))) - (Math.pow(dSqrt, 11.0d) / 1420.0d)));
    }

    /* JADX INFO: renamed from: kk */
    private C11902kk m55712kk(C11902kk c11902kk) {
        float f;
        int i;
        C12003du[] c12003duArrM55668k4 = c11902kk.m55668k4();
        float[] fArrM55669x1 = c11902kk.m55669x1();
        C12003du[] c12003duArr = new C12003du[c12003duArrM55668k4.length];
        float[] fArr = new float[fArrM55669x1.length];
        int i2 = 0;
        c12003duArr[0] = c12003duArrM55668k4[0];
        fArr[0] = fArrM55669x1[0];
        float f2 = fArrM55669x1[0];
        int i3 = 1;
        int i4 = 1;
        while (true) {
            if (i3 >= c12003duArrM55668k4.length) {
                break;
            }
            float f3 = fArrM55669x1[i3];
            if (f3 > 1.0f) {
                c12003duArr[i4] = c12003duArrM55668k4[i3];
                fArr[i4] = f3;
                i4++;
                break;
            }
            if (f3 > f2) {
                f2 = f3;
            }
            if (f3 >= f2 || (i = i3 + 1) >= c12003duArrM55668k4.length || fArrM55669x1[i] >= f2) {
                c12003duArr[i4] = c12003duArrM55668k4[i3];
                fArr[i4] = f3;
                i4++;
            }
            i3++;
        }
        C12003du[] c12003duArr2 = new C12003du[i4];
        float[] fArr2 = new float[i4];
        int i5 = 0;
        while (true) {
            if (i2 >= i4) {
                break;
            }
            if (i2 == 0) {
                fArr2[i5] = fArr[i2];
                c12003duArr2[i5] = c12003duArr[i2];
            } else {
                float f4 = fArr[i2];
                int i6 = i2 - 1;
                if (f4 < fArr[i6]) {
                    int i7 = i4 - 1;
                    int i8 = i2;
                    while (true) {
                        if (i8 >= i4) {
                            f = 1.0f;
                            break;
                        }
                        f = fArr[i8];
                        if (f > fArr[i6]) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                    float f5 = fArr[i6];
                    float f6 = fArr[i2];
                    float f7 = (f5 - f6) / (f - f6);
                    int iM56501c5 = (c12003duArr[i7].m56501c5() & 255) - (c12003duArr[i2].m56501c5() & 255);
                    int iM56507jd = (c12003duArr[i7].m56507jd() & 255) - (c12003duArr[i2].m56507jd() & 255);
                    int iM56502ck = (c12003duArr[i7].m56502ck() & 255) - (c12003duArr[i2].m56502ck() & 255);
                    int iM56505fa = (c12003duArr[i7].m56505fa() & 255) - (c12003duArr[i2].m56505fa() & 255);
                    fArr2[i5] = fArr[i6];
                    c12003duArr2[i5] = C12003du.m56398k4((c12003duArr[i2].m56501c5() & 255) + ((int) (iM56501c5 * f7)), (c12003duArr[i2].m56507jd() & 255) + ((int) (iM56507jd * f7)), (c12003duArr[i2].m56502ck() & 255) + ((int) (iM56502ck * f7)), (c12003duArr[i2].m56505fa() & 255) + ((int) (iM56505fa * f7)));
                } else {
                    if (f4 > 1.0f) {
                        fArr2[i5] = 1.0f;
                        C12003du c12003duClone = c12003duArr[i6].Clone();
                        C12003du c12003duClone2 = c12003duArr[i2].Clone();
                        float f8 = fArr[i6];
                        float f9 = fArr[i2];
                        int iM56501c52 = (c12003duClone2.m56501c5() & 255) - (c12003duClone.m56501c5() & 255);
                        int iM56507jd2 = (c12003duClone2.m56507jd() & 255) - (c12003duClone.m56507jd() & 255);
                        int iM56502ck2 = (c12003duClone2.m56502ck() & 255) - (c12003duClone.m56502ck() & 255);
                        int iM56505fa2 = (c12003duClone2.m56505fa() & 255) - (c12003duClone.m56505fa() & 255);
                        fArr2[i5] = 1.0f;
                        float f10 = (1.0f - f8) / (f9 - f8);
                        c12003duArr2[i5] = C12003du.m56398k4((c12003duClone.m56501c5() & 255) + ((int) (iM56501c52 * f10)), (c12003duClone.m56507jd() & 255) + ((int) (iM56507jd2 * f10)), (c12003duClone.m56502ck() & 255) + ((int) (iM56502ck2 * f10)), (c12003duClone.m56505fa() & 255) + ((int) (iM56505fa2 * f10)));
                        i5++;
                        break;
                    }
                    fArr2[i5] = f4;
                    c12003duArr2[i5] = c12003duArr[i2];
                }
            }
            i5++;
            i2++;
        }
        C11902kk c11902kk2 = new C11902kk(i5);
        C12003du[] c12003duArr3 = new C12003du[i5];
        float[] fArr3 = new float[i5];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) c12003duArr2), AbstractC14092to.m67208k4((Object) c12003duArr3), i5);
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4(fArr2), AbstractC14092to.m67208k4(fArr3), i5);
        c11902kk2.m55667k4(c12003duArr3);
        c11902kk2.m55666k4(fArr3);
        return c11902kk2;
    }

    /* JADX INFO: renamed from: ne */
    private C11902kk m55713ne() {
        float f;
        C12003du c12003du;
        int i;
        float[] fArr;
        C12003du c12003duM56398k4;
        C12003du c12003duM56398k42;
        C11911x1 c11911x1M55723h4 = m55723h4();
        C12003du c12003du2 = m55718c5()[0];
        int i2 = 1;
        C12003du c12003du3 = m55718c5()[1];
        float[] fArrM55744kk = c11911x1M55723h4.m55744kk();
        float[] fArrM55747x1 = c11911x1M55723h4.m55747x1();
        C11902kk c11902kk = new C11902kk();
        List list = new List();
        List list2 = new List();
        int iM56501c5 = (c12003du3.m56501c5() & 255) - (c12003du2.m56501c5() & 255);
        int iM56507jd = (c12003du3.m56507jd() & 255) - (c12003du2.m56507jd() & 255);
        int iM56502ck = (c12003du3.m56502ck() & 255) - (c12003du2.m56502ck() & 255);
        int iM56505fa = (c12003du3.m56505fa() & 255) - (c12003du2.m56505fa() & 255);
        int i3 = 1;
        while (true) {
            f = 1.0f;
            if (i3 >= fArrM55747x1.length - 1) {
                break;
            }
            float f2 = fArrM55747x1[i3];
            if (f2 == 1.0f) {
                fArrM55747x1[i3] = f2 - 1.0E-5f;
            }
            i3++;
        }
        while (i2 < fArrM55747x1.length) {
            int i4 = i2 - 1;
            float f3 = fArrM55744kk[i4];
            float f4 = fArrM55744kk[i2];
            float f5 = fArrM55747x1[i4];
            float f6 = f;
            float f7 = fArrM55747x1[i2];
            if (f5 < 0.0f || f7 < 0.0f) {
                throw new NotImplementedException("Support for factors < 0 is not implemented now");
            }
            int i5 = (int) f5;
            float[] fArr2 = fArrM55747x1;
            float f8 = f5 - i5;
            int i6 = (int) f7;
            C12003du c12003du4 = c12003du2;
            float f9 = f7 - i6;
            if (f8 > 0.0f) {
                list2.add(Float.valueOf(f3));
                c12003du = c12003du3;
                i = i2;
                fArr = fArrM55744kk;
                c12003duM56398k4 = C12003du.m56398k4((c12003du4.m56501c5() & 255) + ((int) (iM56501c5 * f8)), (c12003du4.m56507jd() & 255) + ((int) (iM56507jd * f8)), (c12003du4.m56502ck() & 255) + ((int) (iM56502ck * f8)), (c12003du4.m56505fa() & 255) + ((int) (iM56505fa * f8)));
            } else {
                c12003du = c12003du3;
                i = i2;
                fArr = fArrM55744kk;
                list2.add(Float.valueOf(f3));
                c12003duM56398k4 = f5 < f7 ? c12003du4 : c12003du;
            }
            list.add(c12003duM56398k4);
            float f10 = f7 - f5;
            float f11 = f4 - f3;
            if (C14116yg.m67480k4(f10) >= f6) {
                float fAbs = f11 / Math.abs(f10);
                if (f8 > 0.0f) {
                    f3 -= f10 > 0.0f ? fAbs * f8 : (f6 - f8) * fAbs;
                }
                for (int i7 = 0; i7 < ((int) Math.abs(f10)); i7++) {
                    f3 += fAbs;
                    list2.add(Float.valueOf(f3));
                    list.add(f10 > 0.0f ? c12003du : c12003du4);
                    list2.add(Float.valueOf(f3));
                    list.add(f10 > 0.0f ? c12003du4 : c12003du);
                }
            } else if (f5 != 0.0f && f5 != f6 && i5 != i6) {
                float fAbs2 = f11 / Math.abs(f10);
                if (f8 > 0.0f) {
                    f3 -= f10 > 0.0f ? fAbs2 * f8 : (f6 - f8) * fAbs2;
                }
                float f12 = f3 + fAbs2;
                list2.add(Float.valueOf(f12));
                list.add(f10 > 0.0f ? c12003du : c12003du4);
                list2.add(Float.valueOf(f12));
                list.add(f10 > 0.0f ? c12003du4 : c12003du);
            }
            if (f9 > 0.0f) {
                list2.add(Float.valueOf(f4));
                c12003duM56398k42 = C12003du.m56398k4((c12003du4.m56501c5() & 255) + ((int) (iM56501c5 * f9)), (c12003du4.m56507jd() & 255) + ((int) (iM56507jd * f9)), (c12003du4.m56502ck() & 255) + ((int) (iM56502ck * f9)), (c12003du4.m56505fa() & 255) + ((int) (iM56505fa * f9)));
            } else {
                list2.add(Float.valueOf(f4));
                c12003duM56398k42 = f5 < f7 ? c12003du : c12003du4;
            }
            list.add(c12003duM56398k42);
            i2 = i + 1;
            f = f6;
            fArrM55747x1 = fArr2;
            c12003du2 = c12003du4;
            c12003du3 = c12003du;
            fArrM55744kk = fArr;
        }
        float[] fArr3 = new float[list2.size()];
        for (int i8 = 0; i8 < list2.size(); i8++) {
            fArr3[i8] = ((Float) list2.get_Item(i8)).floatValue();
        }
        c11902kk.m55666k4(fArr3);
        c11902kk.m55667k4((C12003du[]) list.toArray(new C12003du[0]));
        return c11902kk;
    }

    /* JADX INFO: renamed from: u4 */
    private void m55714u4() {
        C12025x6[] c12025x6Arr = {new C12025x6(0.0f, 0.0f), new C12025x6(0.0f, 0.0f), new C12025x6(0.0f, 0.0f)};
        C12007ix c12007ix = new C12007ix(m55724jd().m56557jd(), m55724jd().m56551ck(), m55724jd().m56550c5(), m55724jd().m56575x1());
        double radians = (float) Math.toRadians(this.f40111jd);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double dAbs = Math.abs(dCos);
        double dAbs2 = Math.abs(dSin);
        float fOooO00o = C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd());
        float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck());
        float fM56575x1 = ((float) ((((double) c12007ix.m56575x1()) * dAbs2) + (((double) c12007ix.m56550c5()) * dAbs))) / c12007ix.m56550c5();
        float fM56575x12 = ((float) ((dAbs * ((double) c12007ix.m56575x1())) + (dAbs2 * ((double) c12007ix.m56550c5())))) / c12007ix.m56575x1();
        C11913yj c11913yjM55719ck = m55719ck();
        c11913yjM55719ck.m55777kk(fOooO00o, fOooO0O0);
        c11913yjM55719ck.m55762k4((float) this.f40111jd);
        c11913yjM55719ck.m55763k4(fM56575x1, fM56575x12);
        c11913yjM55719ck.m55777kk(-fOooO00o, -fOooO0O0);
        m55730kk(c11913yjM55719ck);
        if (!this.f40113m9 || C6541k4.m26348k4(dCos) || C6541k4.m26348k4(dSin)) {
            return;
        }
        float fM56550c5 = c12007ix.m56550c5() + c12007ix.m56557jd();
        float fM56575x13 = c12007ix.m56575x1() + c12007ix.m56551ck();
        c12025x6Arr[0].m56892k4(c12007ix.m56557jd(), c12007ix.m56551ck());
        c12025x6Arr[1].m56892k4(fM56550c5, c12007ix.m56551ck());
        c12025x6Arr[2].m56892k4(c12007ix.m56557jd(), fM56575x13);
        C6541k4.m26347k4(c11913yjM55719ck, c12025x6Arr);
        if (dSin > 0.0d && dCos > 0.0d) {
            float fTan = (float) ((-1.0d) / (Math.tan(radians) * ((double) (c12007ix.m56550c5() / c12007ix.m56575x1()))));
            C12025x6 c12025x6 = c12025x6Arr[0];
            c12025x6.m56892k4(c12025x6.m56897x1(), c12007ix.m56551ck() + ((c12025x6Arr[0].m56897x1() - c12007ix.m56557jd()) * fTan));
            C12025x6 c12025x62 = c12025x6Arr[1];
            c12025x62.m56892k4(((c12025x62.m56895kk() - fM56575x13) / fTan) + fM56550c5, c12025x6Arr[1].m56895kk());
            C12025x6 c12025x63 = c12025x6Arr[2];
            c12025x63.m56892k4(c12007ix.m56557jd() + ((c12025x63.m56895kk() - c12007ix.m56551ck()) / fTan), c12025x6Arr[2].m56895kk());
        } else if (dSin > 0.0d && dCos < 0.0d) {
            float fTan2 = (float) ((-1.0d) / (Math.tan(radians - 1.5707963267948966d) * ((double) (c12007ix.m56550c5() / c12007ix.m56575x1()))));
            C12025x6 c12025x64 = c12025x6Arr[0];
            c12025x64.m56892k4(((c12025x64.m56895kk() - fM56575x13) / fTan2) + fM56550c5, c12025x6Arr[0].m56895kk());
            C12025x6 c12025x65 = c12025x6Arr[1];
            c12025x65.m56892k4(c12025x65.m56897x1(), ((c12025x6Arr[1].m56897x1() - fM56550c5) * fTan2) + fM56575x13);
            C12025x6 c12025x66 = c12025x6Arr[2];
            c12025x66.m56892k4(c12025x66.m56897x1(), c12007ix.m56551ck() + ((c12025x6Arr[2].m56897x1() - c12007ix.m56557jd()) * fTan2));
        } else if (dSin >= 0.0d || dCos >= 0.0d) {
            float fTan3 = (float) ((-1.0d) / (Math.tan(radians - 4.71238898038469d) * ((double) (c12007ix.m56550c5() / c12007ix.m56575x1()))));
            C12025x6 c12025x67 = c12025x6Arr[0];
            c12025x67.m56892k4(c12007ix.m56557jd() + ((c12025x67.m56895kk() - c12007ix.m56551ck()) / fTan3), c12025x6Arr[0].m56895kk());
            C12025x6 c12025x68 = c12025x6Arr[1];
            c12025x68.m56892k4(c12025x68.m56897x1(), c12007ix.m56551ck() + ((c12025x6Arr[1].m56897x1() - c12007ix.m56557jd()) * fTan3));
            C12025x6 c12025x69 = c12025x6Arr[2];
            c12025x69.m56892k4(c12025x69.m56897x1(), ((c12025x6Arr[2].m56897x1() - fM56550c5) * fTan3) + fM56575x13);
        } else {
            float fTan4 = (float) ((-1.0d) / (Math.tan(radians) * ((double) (c12007ix.m56550c5() / c12007ix.m56575x1()))));
            C12025x6 c12025x610 = c12025x6Arr[0];
            c12025x610.m56892k4(c12025x610.m56897x1(), ((c12025x6Arr[0].m56897x1() - fM56550c5) * fTan4) + fM56575x13);
            C12025x6 c12025x611 = c12025x6Arr[1];
            c12025x611.m56892k4(c12007ix.m56557jd() + ((c12025x611.m56895kk() - c12007ix.m56551ck()) / fTan4), c12025x6Arr[1].m56895kk());
            C12025x6 c12025x612 = c12025x6Arr[2];
            c12025x612.m56892k4(((c12025x612.m56895kk() - fM56575x13) / fTan4) + fM56550c5, c12025x6Arr[2].m56895kk());
        }
        m55730kk(new C11913yj(new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1()), new C12025x6[]{new C12025x6(c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk()), new C12025x6(c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk()), new C12025x6(c12025x6Arr[2].m56897x1(), c12025x6Arr[2].m56895kk())}));
    }

    /* JADX INFO: renamed from: uz */
    private void m55715uz() {
        C11911x1 c11911x1 = new C11911x1(1);
        this.f40116x1 = c11911x1;
        c11911x1.m55743kk(new float[]{1.0f});
        this.f40116x1.m55745to(new float[]{1.0f});
    }

    /* JADX INFO: renamed from: x1 */
    private double m55716x1(int i) {
        if (i == 1) {
            return 90.0d;
        }
        if (i != 2) {
            return i != 3 ? 0.0d : 135.0d;
        }
        return 45.0d;
    }

    /* JADX INFO: renamed from: c5 */
    public C12003du[] m55718c5() {
        C12003du[] c12003duArr = {new C12003du(), new C12003du()};
        this.f40115up.CloneTo(c12003duArr[0]);
        this.f40117yj.CloneTo(c12003duArr[1]);
        return c12003duArr;
    }

    /* JADX INFO: renamed from: ck */
    public C11913yj m55719ck() {
        return m56867du();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12024x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11909up c11909up = (C11909up) m56874kk();
        if (this.f40114to != null) {
            c11909up.f40114to = new C11902kk();
            if (this.f40114to.m55668k4() != null) {
                c11909up.f40114to.m55667k4((C12003du[]) this.f40114to.m55668k4().clone());
            }
            if (this.f40114to.m55669x1() != null) {
                c11909up.f40114to.m55666k4((float[]) this.f40114to.m55669x1().clone());
            }
        }
        if (this.f40116x1 != null) {
            c11909up.f40116x1 = new C11911x1();
            if (this.f40116x1.m55747x1() != null) {
                c11909up.f40116x1.m55743kk((float[]) this.f40116x1.m55747x1().clone());
            }
            if (this.f40116x1.m55744kk() != null) {
                c11909up.f40116x1.m55745to((float[]) this.f40116x1.m55744kk().clone());
            }
        }
        c11909up.m55728k4((C12003du[]) m55718c5().clone());
        c11909up.f40111jd = this.f40111jd;
        c11909up.f40113m9 = this.f40113m9;
        c11909up.f40110h4 = this.f40110h4.Clone();
        c11909up.f40108dy = this.f40108dy;
        c11909up.f40112kk = this.f40112kk;
        c11909up.f40107du = this.f40107du;
        c11909up.f40106ck = this.f40106ck.Clone();
        c11909up.f40109fa = this.f40109fa.Clone();
        return c11909up;
    }

    /* JADX INFO: renamed from: du */
    public C12012lr m55720du(C11913yj c11913yj) {
        return new C12528x1(this).m58314k4(c11913yj);
    }

    /* JADX INFO: renamed from: dy */
    public C11902kk m55721dy() {
        if (this.f40108dy) {
            return this.f40114to;
        }
        throw new ArgumentException("Property must be set to a valid ColorBlend object to use interpolation colors. ColorBlend objects must be constructed with the same number of positions and color values. Positions must be between 0.0 and 1.0, 1.0 indicating the last element in the array.");
    }

    /* JADX INFO: renamed from: fa */
    public int m55722fa() {
        return this.f40107du;
    }

    /* JADX INFO: renamed from: h4 */
    public C11911x1 m55723h4() {
        if (this.f40116x1 == null) {
            return null;
        }
        C11911x1 c11911x1 = new C11911x1();
        c11911x1.m55743kk((float[]) this.f40116x1.m55747x1().clone());
        c11911x1.m55745to((float[]) this.f40116x1.m55744kk().clone());
        return c11911x1;
    }

    /* JADX INFO: renamed from: jd */
    public C12007ix m55724jd() {
        return this.f40110h4;
    }

    /* JADX INFO: renamed from: ks */
    public C12025x6 m55731ks() {
        return this.f40106ck.Clone();
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m55732m9() {
        return this.f40112kk;
    }

    /* JADX INFO: renamed from: rv */
    public C12025x6 m55733rv() {
        return this.f40109fa.Clone();
    }

    /* JADX INFO: renamed from: to */
    public void m55734to(float f, float f2) {
        m56868k4(f, f2);
    }

    /* JADX INFO: renamed from: up */
    public boolean m55736up() {
        return this.f40108dy;
    }

    /* JADX INFO: renamed from: x6 */
    public C12527kk m55739x6() {
        return new C12528x1(this).m58315k4();
    }

    /* JADX INFO: renamed from: yj */
    public boolean m55740yj() {
        return this.f40105c5;
    }

    public C11909up(C12007ix c12007ix, C12003du c12003du, C12003du c12003du2, float f) {
        this(c12007ix, c12003du.Clone(), c12003du2.Clone(), f, false);
    }

    /* JADX INFO: renamed from: du */
    private boolean m55704du(float f, float f2) {
        float f3 = f;
        int i = (f3 == 0.0f || f3 == 1.0f) ? 256 : FrameMetricsAggregator.EVERY_DURATION;
        if (m55723h4().m55744kk().length != i) {
            float[] fArr = new float[i];
            float[] fArr2 = new float[i];
            if (m55723h4().m55744kk().length != 0) {
                this.f40116x1.m55743kk(null);
                this.f40116x1.m55745to(null);
            }
            this.f40116x1.m55743kk(fArr);
            this.f40116x1.m55745to(fArr2);
        }
        if (this.f40114to.m55668k4().length != 0) {
            this.f40114to.m55667k4((C12003du[]) null);
            this.f40114to.m55666k4((float[]) null);
            this.f40108dy = false;
        }
        if (f3 == 0.0f) {
            float fM55706k4 = (1.0f - m55706k4(1.0f, 0.5f, 0.5f)) * 0.5f;
            float fM55706k42 = ((1.0f - m55706k4(f3, 0.5f, 0.5f)) * 0.5f) - fM55706k4;
            this.f40116x1.m55744kk()[0] = f3;
            this.f40116x1.m55747x1()[0] = f2;
            float f4 = 0.003921569f;
            int i2 = 1;
            while (i2 < 255) {
                this.f40116x1.m55744kk()[i2] = f4;
                this.f40116x1.m55747x1()[i2] = (((1.0f - m55706k4(f4, 0.5f, 0.5f)) * 0.5f) - fM55706k4) * (f2 / fM55706k42);
                i2++;
                f4 += 0.003921569f;
            }
            int i3 = i - 1;
            this.f40116x1.m55744kk()[i3] = 1.0f;
            this.f40116x1.m55747x1()[i3] = 0.0f;
        } else if (f3 == 1.0f) {
            float fM55706k43 = (m55706k4(0.0f, 0.5f, 0.5f) + 1.0f) * 0.5f;
            float fM55706k44 = ((m55706k4(f3, 0.5f, 0.5f) + 1.0f) * 0.5f) - fM55706k43;
            this.f40116x1.m55744kk()[0] = 0.0f;
            this.f40116x1.m55747x1()[0] = 0.0f;
            float f5 = 0.003921569f;
            int i4 = 1;
            while (i4 < 255) {
                this.f40116x1.m55744kk()[i4] = f5;
                this.f40116x1.m55747x1()[i4] = (((m55706k4(f5, 0.5f, 0.5f) + 1.0f) * 0.5f) - fM55706k43) * (f2 / fM55706k44);
                i4++;
                f5 += 0.003921569f;
            }
            int i5 = i - 1;
            this.f40116x1.m55744kk()[i5] = f3;
            this.f40116x1.m55747x1()[i5] = f2;
        } else {
            float f6 = f3 / 4.0f;
            float f7 = f3 / 2.0f;
            float f8 = f3 / 255.0f;
            this.f40116x1.m55744kk()[0] = 0.0f;
            this.f40116x1.m55747x1()[0] = 0.0f;
            float fM55706k45 = (m55706k4(0.0f, f6, f7) + 1.0f) * 0.5f;
            float fM55706k46 = ((m55706k4(f3, f6, f7) + 1.0f) * 0.5f) - fM55706k45;
            int i6 = 1;
            float f9 = f8;
            for (int i7 = 255; i6 < i7; i7 = 255) {
                this.f40116x1.m55744kk()[i6] = f9;
                this.f40116x1.m55747x1()[i6] = (((m55706k4(f9, f6, f7) + 1.0f) * 0.5f) - fM55706k45) * (f2 / fM55706k46);
                i6++;
                f9 += f8;
            }
            this.f40116x1.m55744kk()[i6] = f3;
            this.f40116x1.m55747x1()[i6] = f2;
            float f10 = 1.0f - f3;
            float f11 = f10 / 4.0f;
            float f12 = (f3 + 1.0f) / 2.0f;
            float f13 = f10 / 255.0f;
            float fM55706k47 = (1.0f - m55706k4(1.0f, f11, f12)) * 0.5f;
            float fM55706k48 = ((1.0f - m55706k4(f3, f11, f12)) * 0.5f) - fM55706k47;
            int i8 = i6 + 1;
            while (true) {
                f3 += f13;
                if (i8 >= 510) {
                    break;
                }
                this.f40116x1.m55744kk()[i8] = f3;
                this.f40116x1.m55747x1()[i8] = (((1.0f - m55706k4(f3, f11, f12)) * 0.5f) - fM55706k47) * (f2 / fM55706k48);
                i8++;
            }
            int i9 = i - 1;
            this.f40116x1.m55744kk()[i9] = 1.0f;
            this.f40116x1.m55747x1()[i9] = 0.0f;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11909up m55707k4(C12007ix c12007ix, C12003du c12003du, C12003du c12003du2, int i) {
        return new C11909up(c12007ix, c12003du, c12003du2, i);
    }

    /* JADX INFO: renamed from: x1 */
    private void m55717x1(C11902kk c11902kk) {
        if (c11902kk == null) {
            throw new ArgumentException("ColorBlend value can not be null");
        }
        if (c11902kk.m55668k4().length < 2) {
            throw new ArgumentException("ColorBlend's colors array length can not be less than 2");
        }
        if (c11902kk.m55668k4().length != c11902kk.m55669x1().length) {
            throw new ArgumentException("ColorBlend's positions and colors arrays must have the same length");
        }
        if (C14116yg.m67477k4(C14116yg.m67480k4(c11902kk.m55669x1()[0] - 0.0f), 7) > 1.0000000116860974E-7d) {
            throw new ArgumentException(OooO0OO.OooO0OO(new StringBuilder("The ColorBlend's first position value must be equal to 0.0 (but have "), c11902kk.m55669x1()[0], ")"));
        }
        if (C14116yg.m67477k4(C14116yg.m67480k4(c11902kk.m55669x1()[c11902kk.m55669x1().length - 1] - 1.0f), 7) > 1.0000000116860974E-7d) {
            throw new ArgumentException("The ColorBlend's last position value must be equal to 1.0");
        }
        this.f40114to = m55712kk(c11902kk);
        this.f40108dy = true;
    }

    /* JADX INFO: renamed from: kk */
    public void m55729kk(float f, float f2) {
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            throw new ArgumentException("Parameter is invalid");
        }
        m55704du(f, f2);
        this.f40105c5 = true;
    }

    /* JADX INFO: renamed from: to */
    public void m55735to(C11913yj c11913yj) {
        m56872k4(c11913yj, 1);
    }

    public C11909up(C12007ix c12007ix, C12003du c12003du, C12003du c12003du2, float f, boolean z) {
        this.f40112kk = false;
        this.f40110h4 = new C12007ix();
        this.f40113m9 = false;
        this.f40108dy = false;
        this.f40105c5 = false;
        this.f40111jd = 45.0d;
        this.f40106ck = new C12025x6(0.0f, 0.0f);
        this.f40109fa = new C12025x6(0.0f, 0.0f);
        this.f40115up = new C12003du();
        this.f40117yj = new C12003du();
        m55709k4(c12007ix);
        m55710k4(c12007ix, c12003du, c12003du2, f, z, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11909up m55708k4(C12014ne c12014ne, C12003du c12003du, C12003du c12003du2, int i) {
        return new C11909up(c12014ne, c12003du, c12003du2, i);
    }

    /* JADX INFO: renamed from: kk */
    public void m55730kk(C11913yj c11913yj) {
        m56871k4(c11913yj);
    }

    private C11909up(C12007ix c12007ix, C12003du c12003du, C12003du c12003du2, int i) {
        this.f40112kk = false;
        this.f40110h4 = new C12007ix();
        this.f40113m9 = false;
        this.f40108dy = false;
        this.f40105c5 = false;
        this.f40111jd = 45.0d;
        this.f40106ck = new C12025x6(0.0f, 0.0f);
        this.f40109fa = new C12025x6(0.0f, 0.0f);
        this.f40115up = new C12003du();
        this.f40117yj = new C12003du();
        if (i < 0 || i > 3) {
            throw new InvalidEnumArgumentException("linearGradientMode");
        }
        m55709k4(c12007ix);
        m55710k4(c12007ix.Clone(), c12003du.Clone(), c12003du2.Clone(), m55716x1(i), false, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55725k4(int i) {
        if (i == 4) {
            throw new ArgumentException("Argument 'value' is invalid");
        }
        if (i < 0 || i > 4) {
            throw new InvalidEnumArgumentException("value");
        }
        this.f40107du = i;
    }

    private C11909up(C12014ne c12014ne, C12003du c12003du, C12003du c12003du2, int i) {
        this.f40112kk = false;
        this.f40110h4 = new C12007ix();
        this.f40113m9 = false;
        this.f40108dy = false;
        this.f40105c5 = false;
        this.f40111jd = 45.0d;
        this.f40106ck = new C12025x6(0.0f, 0.0f);
        this.f40109fa = new C12025x6(0.0f, 0.0f);
        this.f40115up = new C12003du();
        this.f40117yj = new C12003du();
        if (i < 0 || i > 3) {
            throw new InvalidEnumArgumentException("linearGradientMode");
        }
        m55709k4(C12007ix.m56544k4(c12014ne));
        C12007ix c12007ixM56544k4 = C12007ix.m56544k4(c12014ne);
        this.f40110h4 = c12007ixM56544k4;
        m55710k4(c12007ixM56544k4, c12003du.Clone(), c12003du2.Clone(), m55716x1(i), false, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55726k4(C11902kk c11902kk) {
        m55717x1(c11902kk);
        this.f40116x1 = null;
    }

    public C11909up(C12025x6 c12025x6, C12025x6 c12025x62, C12003du c12003du, C12003du c12003du2) {
        this(C6544x1.m26368k4(c12025x6), C6544x1.m26368k4(c12025x62), c12003du.Clone(), c12003du2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55727k4(C11911x1 c11911x1) {
        if (c11911x1 == null) {
            throw new NullReferenceException("Value of 'value' cannot be null");
        }
        if (c11911x1.m55744kk().length != c11911x1.m55747x1().length) {
            throw new ArgumentOutOfRangeException("Requested diapason exceeds array size");
        }
        if (c11911x1.m55744kk().length > 1 && (C14116yg.m67477k4(C14116yg.m67480k4(c11911x1.m55744kk()[0] - 0.0f), 7) > 1.0000000116860974E-7d || C14116yg.m67477k4(C14116yg.m67480k4(c11911x1.m55744kk()[c11911x1.m55744kk().length - 1] - 1.0f), 7) > 1.0000000116860974E-7d)) {
            throw new ArgumentException("Parameter's value is invalid");
        }
        C11911x1 c11911x12 = new C11911x1();
        c11911x12.m55743kk((float[]) c11911x1.m55747x1().clone());
        c11911x12.m55745to((float[]) c11911x1.m55744kk().clone());
        this.f40116x1 = c11911x12;
        if (c11911x12.m55744kk().length > 1) {
            this.f40105c5 = true;
            m55717x1(m55713ne());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55709k4(C12007ix c12007ix) {
        if (c12007ix.m56550c5() == 0.0d || c12007ix.m56575x1() == 0.0d) {
            throw new ArgumentException("rectangle cannot have width or height equal to 0");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m55737x1(C11913yj c11913yj, int i) {
        m56872k4(c11913yj, i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55710k4(C12007ix c12007ix, C12003du c12003du, C12003du c12003du2, double d, boolean z, int i) {
        m55705ix();
        this.f40107du = i;
        this.f40115up = C12003du.m56396k4(c12003du.m56506h4());
        this.f40117yj = C12003du.m56396k4(c12003du2.m56506h4());
        this.f40111jd = !Double.isNaN(d) ? d % 360.0d : 0.0d;
        this.f40113m9 = z;
        this.f40106ck.m56891k4(c12007ix.m56557jd());
        this.f40106ck.m56898x1(c12007ix.m56551ck());
        this.f40109fa.m56891k4(c12007ix.m56550c5() + c12007ix.m56557jd());
        this.f40109fa.m56898x1(c12007ix.m56551ck());
        this.f40110h4 = c12007ix.Clone();
        m55714u4();
    }

    /* JADX INFO: renamed from: x1 */
    public void m55738x1(boolean z) {
        this.f40112kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55711k4(C12025x6 c12025x6, C12025x6 c12025x62, C12003du c12003du, C12003du c12003du2, int i) {
        boolean z;
        if (c12025x6 == null || c12025x62 == null) {
            throw new ArgumentException("Argument of 'point1' or 'point2' is invalid");
        }
        m55705ix();
        this.f40107du = i;
        this.f40115up = C12003du.m56396k4(c12003du.m56506h4());
        this.f40117yj = C12003du.m56396k4(c12003du2.m56506h4());
        boolean z2 = false;
        this.f40113m9 = false;
        this.f40110h4.m56576x1(c12025x62.m56897x1() - c12025x6.m56897x1());
        this.f40110h4.m56560k4(c12025x62.m56895kk() - c12025x6.m56895kk());
        C12007ix c12007ix = this.f40110h4;
        c12007ix.m56566kk(c12007ix.m56550c5() < 0.0f ? c12025x62.m56897x1() : c12025x6.m56897x1());
        C12007ix c12007ix2 = this.f40110h4;
        c12007ix2.m56572to(c12007ix2.m56575x1() < 0.0f ? c12025x62.m56895kk() : c12025x6.m56895kk());
        if (this.f40110h4.m56550c5() < 0.0f) {
            C12007ix c12007ix3 = this.f40110h4;
            c12007ix3.m56576x1(-c12007ix3.m56550c5());
            z = true;
        } else {
            z = false;
        }
        if (this.f40110h4.m56575x1() < 0.0f) {
            C12007ix c12007ix4 = this.f40110h4;
            c12007ix4.m56560k4(-c12007ix4.m56575x1());
            z2 = true;
        }
        if (this.f40110h4.m56575x1() >= -9.999999747378752E-6d && this.f40110h4.m56575x1() <= 9.999999747378752E-6d) {
            C12007ix c12007ix5 = this.f40110h4;
            c12007ix5.m56560k4(c12007ix5.m56550c5());
            C12007ix c12007ix6 = this.f40110h4;
            c12007ix6.m56572to(c12007ix6.m56551ck() - (this.f40110h4.m56575x1() / 2.0f));
            this.f40111jd = z ? 180.0d : 0.0d;
        } else if (this.f40110h4.m56550c5() < -9.999999747378752E-6d || this.f40110h4.m56550c5() > 9.999999747378752E-6d) {
            double degrees = Math.toDegrees(Math.atan(this.f40110h4.m56575x1() / this.f40110h4.m56550c5()));
            if (z) {
                degrees = 180.0d - degrees;
            }
            if (z2) {
                degrees = 360.0d - degrees;
            }
            this.f40111jd = degrees;
        } else {
            C12007ix c12007ix7 = this.f40110h4;
            c12007ix7.m56576x1(c12007ix7.m56575x1());
            C12007ix c12007ix8 = this.f40110h4;
            c12007ix8.m56566kk(c12007ix8.m56557jd() - (this.f40110h4.m56550c5() / 2.0f));
            this.f40111jd = z2 ? 270.0d : 90.0d;
        }
        this.f40106ck.m56891k4(this.f40110h4.m56557jd());
        this.f40106ck.m56898x1(this.f40110h4.m56551ck());
        this.f40109fa.m56891k4(this.f40110h4.m56550c5() + this.f40110h4.m56557jd());
        this.f40109fa.m56898x1(this.f40110h4.m56551ck());
        m55714u4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m55728k4(C12003du[] c12003duArr) {
        if (c12003duArr == null) {
            throw new ArgumentNullException("colors");
        }
        this.f40115up = C12003du.m56396k4(c12003duArr[0].m56506h4());
        this.f40117yj = C12003du.m56396k4(c12003duArr[1].m56506h4());
    }
}
