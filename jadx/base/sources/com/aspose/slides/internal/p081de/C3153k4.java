package com.aspose.slides.internal.p081de;

import androidx.core.graphics.OooO00o;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.o000oOoO;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.de.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3153k4 {
    /* JADX INFO: renamed from: k4 */
    private static double m13467k4(double d, double d2, double d3, double d4) {
        double dM67498to = C14116yg.m67498to(d2, d);
        double dM67498to2 = C14116yg.m67498to(d4, d3);
        return dM67498to2 >= dM67498to ? dM67498to2 - dM67498to : 6.283185307179586d - (dM67498to - dM67498to2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0040. Please report as an issue. */
    /* JADX INFO: renamed from: k4 */
    public static C11896dy m13468k4(List<C3785dy> list) {
        float f;
        C14093tq c14093tq;
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        float f3;
        boolean z5;
        C11896dy c11896dy = new C11896dy();
        if (list != null && list.size() != 0) {
            float f4 = 0.0f;
            C12025x6 c12025x6 = new C12025x6(0.0f, 0.0f);
            C12025x6 c12025x62 = new C12025x6(0.0f, 0.0f);
            C14093tq c14093tq2 = new C14093tq();
            C14093tq c14093tq3 = new C14093tq();
            List.Enumerator<C3785dy> it = list.iterator();
            C14093tq c14093tq4 = c14093tq2;
            C14093tq c14093tq5 = c14093tq3;
            while (it.hasNext()) {
                try {
                    C3785dy next = it.next();
                    new List();
                    switch (next.f10313k4) {
                        case 0:
                        case 1:
                            f = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            C12025x6 c12025x6Clone = m13470k4(c12025x62.Clone(), next, next.m15120k4()).Clone();
                            c12025x6Clone.CloneTo(c12025x62);
                            c12025x6Clone.CloneTo(c12025x6);
                            c11896dy.m55585yj();
                            z4 = z;
                            break;
                        case 2:
                            f = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            c12025x6.CloneTo(c12025x62);
                            c11896dy.m55567m9();
                            z4 = z;
                            break;
                        case 3:
                        case 4:
                            f = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            for (int i = 0; i < next.f10315x1.size(); i += 2) {
                                C12025x6 c12025x6Clone2 = c12025x62.Clone();
                                m13469k4(c12025x6Clone2.Clone(), next.f10315x1.get_Item(i).floatValue(), next.f10315x1.get_Item(i + 1).floatValue(), next.m15120k4()).CloneTo(c12025x62);
                                c11896dy.m55547k4(c12025x6Clone2.Clone(), c12025x62.Clone());
                            }
                            z4 = z;
                            break;
                        case 5:
                            f = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            for (int i2 = 0; i2 < next.f10315x1.size(); i2++) {
                                C12025x6 c12025x6Clone3 = c12025x62.Clone();
                                m13469k4(c12025x6Clone3.Clone(), next.f10315x1.get_Item(i2).floatValue(), c12025x62.m56895kk(), true).CloneTo(c12025x62);
                                c11896dy.m55547k4(c12025x6Clone3.Clone(), c12025x62.Clone());
                            }
                            z4 = z;
                            break;
                        case 6:
                            c14093tq = c14093tq4;
                            z = false;
                            for (int i3 = 0; i3 < next.f10315x1.size(); i3++) {
                                C12025x6 c12025x6Clone4 = c12025x62.Clone();
                                m13469k4(c12025x6Clone4.Clone(), next.f10315x1.get_Item(i3).floatValue(), 0.0f, false).CloneTo(c12025x62);
                                c11896dy.m55547k4(c12025x6Clone4.Clone(), c12025x62.Clone());
                            }
                            f = 0.0f;
                            z4 = z;
                            break;
                        case 7:
                            c14093tq = c14093tq4;
                            z = false;
                            for (int i4 = 0; i4 < next.f10315x1.size(); i4++) {
                                C12025x6 c12025x6Clone5 = c12025x62.Clone();
                                m13469k4(c12025x6Clone5.Clone(), c12025x62.m56897x1(), next.f10315x1.get_Item(i4).floatValue(), true).CloneTo(c12025x62);
                                c11896dy.m55547k4(c12025x6Clone5.Clone(), c12025x62.Clone());
                            }
                            f = 0.0f;
                            z4 = z;
                            break;
                        case 8:
                            float f5 = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            int i5 = 0;
                            while (i5 < next.f10315x1.size()) {
                                C12025x6 c12025x6Clone6 = c12025x62.Clone();
                                m13469k4(c12025x6Clone6.Clone(), f5, next.f10315x1.get_Item(i5).floatValue(), false).CloneTo(c12025x62);
                                c11896dy.m55547k4(c12025x6Clone6.Clone(), c12025x62.Clone());
                                i5++;
                                f5 = 0.0f;
                            }
                            f = 0.0f;
                            z4 = z;
                            break;
                        case 9:
                        case 10:
                            f2 = f4;
                            c14093tq = c14093tq4;
                            z2 = false;
                            z3 = false;
                            int i6 = 0;
                            while (i6 < next.f10315x1.size()) {
                                C12025x6 c12025x6Clone7 = c12025x62.Clone();
                                C12025x6 c12025x6Clone8 = m13469k4(c12025x6Clone7.Clone(), next.f10315x1.get_Item(i6).floatValue(), next.f10315x1.get_Item(i6 + 1).floatValue(), next.m15120k4()).Clone();
                                C12025x6 c12025x6Clone9 = m13469k4(c12025x6Clone7.Clone(), next.f10315x1.get_Item(i6 + 2).floatValue(), next.f10315x1.get_Item(i6 + 3).floatValue(), next.m15120k4()).Clone();
                                C12025x6 c12025x6Clone10 = m13469k4(c12025x6Clone7.Clone(), next.f10315x1.get_Item(i6 + 4).floatValue(), next.f10315x1.get_Item(i6 + 5).floatValue(), next.m15120k4()).Clone();
                                c11896dy.m55548k4(c12025x6Clone7.Clone(), c12025x6Clone8.Clone(), c12025x6Clone9.Clone(), c12025x6Clone10.Clone());
                                c12025x6Clone10.CloneTo(c12025x62);
                                i6 += 6;
                                c14093tq = new C14093tq(c12025x6Clone9.Clone());
                                z3 = true;
                            }
                            z4 = z2;
                            f = f2;
                            z = z3;
                            break;
                        case 11:
                        case 12:
                            f2 = f4;
                            c14093tq = c14093tq4;
                            z2 = false;
                            z3 = false;
                            int i7 = 0;
                            while (i7 < next.f10315x1.size()) {
                                C12025x6 c12025x6Clone11 = c12025x62.Clone();
                                C12025x6 c12025x6Clone12 = (c14093tq.m67302x1() ? m13471k4(((C12025x6) c14093tq.m67297k4()).Clone(), c12025x6Clone11.Clone()) : c12025x6Clone11).Clone();
                                C12025x6 c12025x6Clone13 = m13469k4(c12025x6Clone11.Clone(), next.f10315x1.get_Item(i7).floatValue(), next.f10315x1.get_Item(i7 + 1).floatValue(), next.m15120k4()).Clone();
                                C12025x6 c12025x6Clone14 = m13469k4(c12025x6Clone11.Clone(), next.f10315x1.get_Item(i7 + 2).floatValue(), next.f10315x1.get_Item(i7 + 3).floatValue(), next.m15120k4()).Clone();
                                c11896dy.m55548k4(c12025x6Clone11.Clone(), c12025x6Clone12.Clone(), c12025x6Clone13.Clone(), c12025x6Clone14.Clone());
                                c12025x6Clone14.CloneTo(c12025x62);
                                i7 += 4;
                                c14093tq = new C14093tq(c12025x6Clone13.Clone());
                                z3 = true;
                            }
                            z4 = z2;
                            f = f2;
                            z = z3;
                            break;
                        case 13:
                        case 14:
                            f3 = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            z5 = false;
                            int i8 = 0;
                            while (i8 < next.f10315x1.size()) {
                                C12025x6 c12025x6Clone15 = c12025x62.Clone();
                                C12025x6 c12025x6Clone16 = m13469k4(c12025x6Clone15.Clone(), next.f10315x1.get_Item(i8).floatValue(), next.f10315x1.get_Item(i8 + 1).floatValue(), next.m15120k4()).Clone();
                                C12025x6 c12025x6Clone17 = m13469k4(c12025x6Clone15.Clone(), next.f10315x1.get_Item(i8 + 2).floatValue(), next.f10315x1.get_Item(i8 + 3).floatValue(), next.m15120k4()).Clone();
                                m13473k4(c11896dy, c12025x6Clone15.Clone(), c12025x6Clone16.Clone(), c12025x6Clone17.Clone());
                                c12025x6Clone17.CloneTo(c12025x62);
                                c14093tq5 = new C14093tq(c12025x6Clone16.Clone());
                                i8 += 4;
                                z5 = true;
                            }
                            z4 = z5;
                            f = f3;
                            break;
                        case 15:
                        case 16:
                            f3 = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            z5 = false;
                            int i9 = 0;
                            while (i9 < next.f10315x1.size()) {
                                C12025x6 c12025x6Clone18 = c12025x62.Clone();
                                C12025x6 c12025x6Clone19 = (c14093tq5.m67302x1() ? m13471k4(((C12025x6) c14093tq5.m67297k4()).Clone(), c12025x6Clone18.Clone()) : c12025x6Clone18).Clone();
                                C12025x6 c12025x6Clone20 = m13469k4(c12025x6Clone18.Clone(), next.f10315x1.get_Item(i9).floatValue(), next.f10315x1.get_Item(i9 + 1).floatValue(), next.m15120k4()).Clone();
                                m13473k4(c11896dy, c12025x6Clone18.Clone(), c12025x6Clone19.Clone(), c12025x6Clone20.Clone());
                                c12025x6Clone20.CloneTo(c12025x62);
                                c14093tq5 = new C14093tq(c12025x6Clone19.Clone());
                                i9 += 2;
                                z5 = true;
                            }
                            z4 = z5;
                            f = f3;
                            break;
                        case 17:
                        case 18:
                            int i10 = 0;
                            while (i10 < next.f10315x1.size()) {
                                C12025x6 c12025x6Clone21 = c12025x62.Clone();
                                float fFloatValue = next.f10315x1.get_Item(i10).floatValue();
                                float fFloatValue2 = next.f10315x1.get_Item(i10 + 1).floatValue();
                                float fFloatValue3 = next.f10315x1.get_Item(i10 + 2).floatValue();
                                float fFloatValue4 = next.f10315x1.get_Item(i10 + 3).floatValue();
                                float f6 = f4;
                                float fFloatValue5 = next.f10315x1.get_Item(i10 + 4).floatValue();
                                C11896dy c11896dy2 = c11896dy;
                                int i11 = i10;
                                C12025x6 c12025x6Clone22 = m13469k4(c12025x6Clone21.Clone(), next.f10315x1.get_Item(i11 + 5).floatValue(), next.f10315x1.get_Item(i11 + 6).floatValue(), next.m15120k4()).Clone();
                                C14093tq c14093tq6 = c14093tq4;
                                c11896dy = c11896dy2;
                                m13472k4(c11896dy, c12025x6Clone21.Clone(), c12025x6Clone22.Clone(), fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4 > f6, fFloatValue5 > f6);
                                c12025x6Clone22.CloneTo(c12025x62);
                                i10 = i11 + 7;
                                f4 = f6;
                                c14093tq4 = c14093tq6;
                            }
                            c14093tq = c14093tq4;
                            z = false;
                            f = f4;
                            z4 = z;
                            break;
                        default:
                            f = f4;
                            c14093tq = c14093tq4;
                            z = false;
                            z4 = z;
                            break;
                    }
                    if (!z4) {
                        c14093tq5 = new C14093tq();
                    }
                    c14093tq4 = !z ? new C14093tq() : c14093tq;
                    f4 = f;
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
                return c11896dy;
            }
        }
        return c11896dy;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m13469k4(C12025x6 c12025x6, float f, float f2, boolean z) {
        return z ? new C12025x6(f, f2) : new C12025x6(c12025x6.m56897x1() + f, c12025x6.m56895kk() + f2);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m13470k4(C12025x6 c12025x6, C3785dy c3785dy, boolean z) {
        return m13469k4(c12025x6.Clone(), c3785dy.f10315x1.get_Item(0).floatValue(), c3785dy.f10315x1.get_Item(1).floatValue(), z);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m13471k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        float fM67480k4 = C14116yg.m67480k4(c12025x62.m56897x1() - c12025x6.m56897x1());
        float fM67480k42 = C14116yg.m67480k4(c12025x62.m56895kk() - c12025x6.m56895kk());
        return new C12025x6(c12025x62.m56897x1() >= c12025x6.m56897x1() ? c12025x62.m56897x1() + fM67480k4 : c12025x62.m56897x1() - fM67480k4, c12025x62.m56895kk() >= c12025x6.m56895kk() ? c12025x62.m56895kk() + fM67480k42 : c12025x62.m56895kk() - fM67480k42);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m13472k4(C11896dy c11896dy, C12025x6 c12025x6, C12025x6 c12025x62, float f, float f2, float f3, boolean z, boolean z2) {
        double dM67496rv;
        float f4;
        float f5;
        if (C12025x6.m56883k4(c12025x6, c12025x62)) {
            return;
        }
        double d = ((double) f3) * 0.017453292519943295d;
        double dM67495m9 = C14116yg.m67495m9(d);
        double dM67470dy = C14116yg.m67470dy(d);
        double dM56895kk = ((((double) (c12025x6.m56895kk() - c12025x62.m56895kk())) * dM67495m9) / 2.0d) + ((((double) (c12025x6.m56897x1() - c12025x62.m56897x1())) * dM67470dy) / 2.0d);
        double d2 = -dM67495m9;
        double dM56895kk2 = ((((double) (c12025x6.m56895kk() - c12025x62.m56895kk())) * dM67470dy) / 2.0d) + ((((double) (c12025x6.m56897x1() - c12025x62.m56897x1())) * d2) / 2.0d);
        float f6 = f * f;
        double d3 = f6 * f2 * f2;
        double d4 = ((double) f6) * dM56895kk2 * dM56895kk2;
        double d5 = ((double) (f2 * f2)) * dM56895kk * dM56895kk;
        double d6 = (d3 - d4) - d5;
        double d7 = 1.0d;
        if (d6 < 0.0d) {
            float fM67496rv = (float) C14116yg.m67496rv(1.0d - (d6 / d3));
            f4 = f * fM67496rv;
            f5 = fM67496rv * f2;
            dM67496rv = 0.0d;
        } else {
            if ((z && z2) || (!z && !z2)) {
                d7 = -1.0d;
            }
            dM67496rv = C14116yg.m67496rv(d6 / (d4 + d5)) * d7;
            f4 = f;
            f5 = f2;
        }
        double d8 = f4;
        double d9 = f5;
        double d10 = ((dM67496rv * d8) * dM56895kk2) / d9;
        double d11 = (((-dM67496rv) * d9) * dM56895kk) / d8;
        double dM56897x1 = (((double) (c12025x62.m56897x1() + c12025x6.m56897x1())) / 2.0d) + ((dM67470dy * d10) - (dM67495m9 * d11));
        double dM56895kk3 = (((double) (c12025x62.m56895kk() + c12025x6.m56895kk())) / 2.0d) + (dM67470dy * d11) + (dM67495m9 * d10);
        double d12 = (dM56895kk - d10) / d8;
        double d13 = (dM56895kk2 - d11) / d9;
        double dM13467k4 = m13467k4(1.0d, 0.0d, d12, d13);
        double dM13467k42 = m13467k4(d12, d13, ((-dM56895kk) - d10) / d8, ((-dM56895kk2) - d11) / d9);
        if (!z2 && dM13467k42 > 0.0d) {
            dM13467k42 -= 6.283185307179586d;
        } else if (z2 && dM13467k42 < 0.0d) {
            dM13467k42 += 6.283185307179586d;
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(C14116yg.m67475k4(dM13467k42 / 1.5707963267948966d))), 14);
        double d14 = dM13467k42 / ((double) iM27462to);
        double d15 = d14 / 4.0d;
        double dM67495m92 = (C14116yg.m67495m9(d15) * (C14116yg.m67495m9(d15) * 2.6666666666666665d)) / C14116yg.m67495m9(d14 / 2.0d);
        double dM56897x12 = c12025x6.m56897x1();
        int i = 0;
        double dM56895kk4 = c12025x6.m56895kk();
        double d16 = dM56897x12;
        double d17 = dM13467k4;
        while (i < iM27462to) {
            double dM67470dy2 = C14116yg.m67470dy(d17);
            double dM67495m93 = C14116yg.m67495m9(d17);
            double d18 = d17 + d14;
            double dM67470dy3 = C14116yg.m67470dy(d18);
            double dM67495m94 = C14116yg.m67495m9(d18);
            double d19 = dM67470dy * d8;
            double d20 = dM67495m9 * d9;
            double d21 = d2;
            double d22 = ((d19 * dM67470dy3) - (d20 * dM67495m94)) + dM56897x1;
            double d23 = dM67495m9 * d8;
            double d24 = dM67470dy * d9;
            double d25 = d9;
            double dOooO00o = o000oOoO.OooO00o(d24, dM67495m94, d23 * dM67470dy3, dM56895kk3);
            double d26 = d14;
            float f7 = (float) d22;
            float f8 = (float) dOooO00o;
            c11896dy.m55536k4((float) d16, (float) dM56895kk4, (float) (d16 + (((((-dM67470dy) * d8) * dM67495m93) - (d20 * dM67470dy2)) * dM67495m92)), (float) (dM56895kk4 + OooO00o.OooO00o(d24, dM67470dy2, d21 * d8 * dM67495m93, dM67495m92)), (float) (d22 + OooO00o.OooO00o(d20, dM67470dy3, d19 * dM67495m94, dM67495m92)), (float) (dOooO00o + (((d23 * dM67495m94) - (d24 * dM67470dy3)) * dM67495m92)), f7, f8);
            d16 = f7;
            dM56895kk4 = f8;
            i++;
            d9 = d25;
            dM67470dy = dM67470dy;
            d14 = d26;
            d17 = d18;
            d2 = d21;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m13473k4(C11896dy c11896dy, C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        c11896dy.m55548k4(c12025x6.Clone(), new C12025x6((((c12025x62.m56897x1() - c12025x6.m56897x1()) * 2.0f) / 3.0f) + c12025x6.m56897x1(), (((c12025x62.m56895kk() - c12025x6.m56895kk()) * 2.0f) / 3.0f) + c12025x6.m56895kk()).Clone(), new C12025x6(((c12025x63.m56897x1() - c12025x62.m56897x1()) / 3.0f) + c12025x62.m56897x1(), ((c12025x63.m56895kk() - c12025x62.m56895kk()) / 3.0f) + c12025x62.m56895kk()).Clone(), c12025x63.Clone());
    }
}
