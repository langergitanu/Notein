package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.wm */
/* JADX INFO: loaded from: classes3.dex */
class C14743wm extends AbstractC7020m9<C14743wm> {
    /* JADX INFO: renamed from: k4 */
    private static double m72785k4(double d) {
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        if (!z) {
            return -kc0.m63762x1(dM67475k4);
        }
        double dM63762x1 = kc0.m63762x1(dM67475k4);
        return dM63762x1 != dM67475k4 ? dM63762x1 + 1.0d : dM63762x1;
    }

    /* JADX INFO: renamed from: kk */
    private static void m72813kk(int i, boolean z, C14787xi c14787xi, float f, float f2, C12023wl c12023wl) {
        boolean zM73377c5 = c14787xi.m73377c5();
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14);
        if (!zM73377c5 || z) {
            return;
        }
        int iM63753k4 = kc0.m63753k4(C0841c4.m4456k4(c14787xi.m73417u4(), iM27462to, iM27462to2, false));
        if (iM63753k4 == 0) {
            iM63753k4 = 1;
        }
        while ((0.0f + f) * iM63753k4 > f2) {
            if (c14787xi.m73386h4() == 0) {
                c14787xi.m73394k4(45);
                f = (float) (((double) c12023wl.m56862kk()) / C14116yg.m67495m9((((double) C14116yg.m67482k4(c14787xi.m73386h4())) * 3.141592653589793d) / 180.0d));
            } else if (c14787xi.m73386h4() == 45) {
                c14787xi.m73394k4(90);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static double m72816x1(double d) {
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        if (z) {
            return kc0.m63762x1(dM67475k4);
        }
        double dM63762x1 = kc0.m63762x1(dM67475k4);
        if (dM63762x1 != dM67475k4) {
            dM63762x1 += 1.0d;
        }
        return -dM63762x1;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C14743wm) {
            return m72825x1((C14743wm) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m72786k4(int i, int i2, boolean z, C14787xi c14787xi) {
        if (c14787xi.m73384dy() == null) {
            return 0.0f;
        }
        boolean zIsPlotOrderReversed = z ? !c14787xi.m73384dy().isPlotOrderReversed() : c14787xi.m73384dy().isPlotOrderReversed();
        double dM73412rv = c14787xi.m73412rv();
        double dM73432yj = c14787xi.m73432yj();
        double dM73405ks = c14787xi.m73405ks();
        if (c14787xi.m73384dy().getCrossType() == 1) {
            dM73412rv = dM73432yj;
        }
        if (dM73412rv > dM73432yj) {
            dM73412rv = dM73432yj;
        }
        if (dM73412rv < dM73405ks) {
            dM73412rv = dM73405ks;
        }
        c14787xi.m73392k4(c14787xi.m73384dy().isLogarithmic() ? (float) c14787xi.m73424x1(dM73412rv) : (float) dM73412rv);
        if (zIsPlotOrderReversed) {
            return (float) ((((dM73412rv - dM73405ks) / (dM73432yj - dM73405ks)) * ((double) i2)) + ((double) i));
        }
        return (float) ((((dM73432yj - dM73412rv) / (dM73432yj - dM73405ks)) * ((double) i2)) + ((double) i));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m72814kk(List<C13847mr> list, double[] dArr, double[] dArr2, C14787xi c14787xi) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        IDoubleChartValue yMinus;
        double dM1356x1;
        IDoubleChartValue yPlus;
        double dM1356x12;
        double dM67476k4;
        double dM67476k42;
        double d;
        int i6 = 0;
        double d2 = 2.147483647E9d;
        dArr[0] = 2.147483647E9d;
        double d3 = -2.147483648E9d;
        dArr2[0] = -2.147483648E9d;
        int i7 = 1;
        int i8 = 2;
        boolean z = c14787xi.m73419up() == 2 || c14787xi.m73419up() == 3;
        int i9 = 0;
        while (i9 < list.size()) {
            C13847mr c13847mr = list.get_Item(i9);
            C13847mr c13847mr2 = c14787xi.m73423wy().m69865up().get_Item(i9);
            List<C0886d8> listM64944dy = c13847mr.m64944dy();
            ChartSeries chartSeriesM64945h4 = c13847mr2.m64945h4();
            IErrorBarsFormat errorBarsYFormat = z ? chartSeriesM64945h4.getErrorBarsYFormat() : chartSeriesM64945h4.getErrorBarsXFormat();
            if (listM64944dy.size() == i7 && listM64944dy.get_Item(i6).m4983dy()) {
                i = i6;
                i2 = i8;
            } else {
                int i10 = i6;
                i = i10;
                double d4 = d2;
                double d5 = d3;
                int i11 = i7;
                while (i10 < listM64944dy.size()) {
                    if (listM64944dy.get_Item(i10) == null) {
                        i3 = i8;
                    } else {
                        double dM5015x1 = listM64944dy.get_Item(i10).m5015x1();
                        if (!C14044b3.m66437kk(dM5015x1)) {
                            if (i11 != 0) {
                                d4 = dM5015x1;
                                d5 = d4;
                                i4 = i;
                            } else {
                                i4 = i11;
                            }
                            if (dM5015x1 < d4) {
                                d4 = dM5015x1;
                            }
                            if (dM5015x1 > d5) {
                                d5 = dM5015x1;
                            }
                            if (errorBarsYFormat == null || !errorBarsYFormat.isVisible() || z) {
                                i5 = i4;
                                i3 = i8;
                            } else {
                                int valueType = errorBarsYFormat.getValueType();
                                if (valueType != 0) {
                                    dM1356x1 = valueType != i7 ? valueType != i8 ? 0.0d : (((double) errorBarsYFormat.getValue()) * dM5015x1) / 100.0d : errorBarsYFormat.getValue();
                                } else {
                                    if (z) {
                                        try {
                                            if (c13847mr2.m64944dy().size() > i10) {
                                                yMinus = c13847mr2.m64944dy().get_Item(i10).m4988jd().getErrorBarsCustomValues().getYMinus();
                                                dM1356x1 = DoubleChartValue.m1356x1(yMinus);
                                            }
                                        } catch (RuntimeException e) {
                                            C3085sv.m13082k4(e);
                                        }
                                        dM1356x1 = 0.0d;
                                    } else {
                                        if (c13847mr2.m64944dy().size() > i10) {
                                            yMinus = c13847mr2.m64944dy().get_Item(i10).m4988jd().getErrorBarsCustomValues().getXMinus();
                                            dM1356x1 = DoubleChartValue.m1356x1(yMinus);
                                        }
                                        dM1356x1 = 0.0d;
                                    }
                                    if (z) {
                                        try {
                                            if (c13847mr2.m64944dy().size() > i10) {
                                                yPlus = c13847mr2.m64944dy().get_Item(i10).m4988jd().getErrorBarsCustomValues().getYPlus();
                                                dM1356x12 = DoubleChartValue.m1356x1(yPlus);
                                            }
                                            dM1356x12 = 0.0d;
                                        } catch (RuntimeException e2) {
                                            C3085sv.m13082k4(e2);
                                            dM1356x12 = dM1356x1;
                                        }
                                    } else {
                                        if (c13847mr2.m64944dy().size() > i10) {
                                            yPlus = c13847mr2.m64944dy().get_Item(i10).m4988jd().getErrorBarsCustomValues().getXPlus();
                                            dM1356x12 = DoubleChartValue.m1356x1(yPlus);
                                        }
                                        dM1356x12 = 0.0d;
                                    }
                                    double dM67469du = !c14787xi.m73384dy().isLogarithmic() ? C14116yg.m67469du(c14787xi.m73384dy().getLogBase(), dM5015x1) : dM5015x1;
                                    i5 = i4;
                                    dM67476k4 = dM67469du - dM1356x1;
                                    dM67476k42 = dM67469du + dM1356x12;
                                    if (c14787xi.m73384dy().isLogarithmic()) {
                                        d = dM5015x1;
                                    } else {
                                        d = dM5015x1;
                                        dM67476k4 = C14116yg.m67476k4(dM67476k4, c14787xi.m73384dy().getLogBase());
                                        dM67476k42 = C14116yg.m67476k4(dM67476k42, c14787xi.m73384dy().getLogBase());
                                    }
                                    if (dM1356x12 > 0.0d && dM67476k42 >= d5 && (errorBarsYFormat.getType() == 0 || errorBarsYFormat.getType() == 2)) {
                                        d5 = dM67476k42;
                                    }
                                    if (dM1356x12 < 0.0d || dM67476k42 > d4) {
                                        i3 = 2;
                                    } else {
                                        if (errorBarsYFormat.getType() != 0) {
                                            i3 = 2;
                                            if (errorBarsYFormat.getType() == 2) {
                                            }
                                        } else {
                                            i3 = 2;
                                        }
                                        d4 = dM67476k42;
                                    }
                                    if (dM1356x1 > 0.0d && dM67476k4 <= d4 && (errorBarsYFormat.getType() == 0 || errorBarsYFormat.getType() == 1)) {
                                        d4 = dM67476k4;
                                    }
                                    if (dM1356x1 >= 0.0d) {
                                        double d6 = (-dM1356x1) + d;
                                        if (d6 >= d5) {
                                            if (errorBarsYFormat.getType() != 0) {
                                                i7 = 1;
                                                if (errorBarsYFormat.getType() == 1) {
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            d5 = d6;
                                        } else {
                                            i7 = 1;
                                        }
                                    }
                                }
                                dM1356x12 = dM1356x1;
                                if (!c14787xi.m73384dy().isLogarithmic()) {
                                }
                                i5 = i4;
                                dM67476k4 = dM67469du - dM1356x1;
                                dM67476k42 = dM67469du + dM1356x12;
                                if (c14787xi.m73384dy().isLogarithmic()) {
                                }
                                if (dM1356x12 > 0.0d) {
                                    d5 = dM67476k42;
                                }
                                if (dM1356x12 < 0.0d) {
                                    i3 = 2;
                                    if (dM1356x1 > 0.0d) {
                                        d4 = dM67476k4;
                                    }
                                    if (dM1356x1 >= 0.0d) {
                                    }
                                }
                            }
                            i11 = i5;
                        }
                    }
                    i10++;
                    i8 = i3;
                }
                i2 = i8;
                if (i11 != 0) {
                    d4 = 0.0d;
                    d5 = 0.0d;
                }
                double d7 = 0.0d;
                double d8 = 0.0d;
                for (int i12 = i; i12 < c13847mr2.m64943du().size(); i12++) {
                    z3t z3tVar = c13847mr2.m64943du().get_Item(i12);
                    double forward = C14044b3.m66437kk(z3tVar.m74307kk().getForward()) ? 0.0d : z3tVar.m74307kk().getForward();
                    double backward = C14044b3.m66437kk(z3tVar.m74307kk().getBackward()) ? 0.0d : z3tVar.m74307kk().getBackward();
                    if (z3tVar.m74307kk().getFormat().getLine().getFillFormat().getFillType() == 0) {
                        if (forward > d8) {
                            d8 = forward;
                        }
                        if (backward > d7) {
                            d7 = backward;
                        }
                    }
                }
                double d9 = d4 - d7;
                double d10 = d5 + d8;
                if (d9 < dArr[i]) {
                    dArr[i] = d9;
                }
                if (d10 > dArr2[i]) {
                    dArr2[i] = d10;
                }
            }
            i9++;
            i8 = i2;
            i6 = i;
            d2 = 2.147483647E9d;
            d3 = -2.147483648E9d;
        }
        int i13 = i6;
        if (!c14787xi.m73384dy().isAutomaticMinValue()) {
            dArr[i13] = c14787xi.m73405ks();
        }
        if (c14787xi.m73384dy().isAutomaticMaxValue()) {
            return;
        }
        dArr2[i13] = c14787xi.m73432yj();
    }

    /* JADX INFO: renamed from: x1 */
    private static int m72817x1(boolean z, C13847mr c13847mr, C12014ne c12014ne, C14787xi c14787xi) {
        int iM56862kk;
        int iM56862kk2;
        if (c14787xi.m73384dy().getTickLabelPosition() == 3) {
            return 0;
        }
        String strM5008to = c13847mr.m64944dy().get_Item(0).m5008to();
        int i = 0;
        int i2 = 0;
        while (i < c14787xi.f50098m9.size()) {
            double dM73424x1 = c14787xi.m73424x1(((Double) C7019kk.m27464to(c14787xi.f50098m9.get_Item(i), Double.TYPE)).doubleValue());
            if (ChartTypeCharacterizer.m761jd(c13847mr.m64945h4().getType())) {
                dM73424x1 /= 100.0d;
                strM5008to = "0%";
            }
            boolean zM73385fa = c14787xi.m73385fa();
            Double dValueOf = Double.valueOf(dM73424x1);
            C12023wl c12023wlClone = C0840c3.m4451x1(zM73385fa ? C13729ki.m63880k4((Object) dValueOf, strM5008to, false) : C0841c4.m4468k4(dValueOf, c14787xi), c14787xi.m73386h4(), c14787xi.m73400kk(), new C12023wl(c12014ne.m56663c5(), c12014ne.m56683x1()).Clone(), 1, 1).Clone();
            if (z) {
                if (i == 0 || i == c14787xi.f50098m9.size() - 1) {
                    iM56862kk = c12023wlClone.m56865x1();
                    iM56862kk2 = iM56862kk / 2;
                } else {
                    iM56862kk2 = c12023wlClone.m56865x1();
                }
            } else if (i == 0 || i == c14787xi.f50098m9.size() - 1) {
                iM56862kk = c12023wlClone.m56862kk();
                iM56862kk2 = iM56862kk / 2;
            } else {
                iM56862kk2 = c12023wlClone.m56862kk();
            }
            int i3 = iM56862kk2 + i2;
            i2 = (i == 0 || i == c14787xi.f50098m9.size() + (-1)) ? i3 - 1 : i3 - 2;
            i++;
        }
        return C22201OooO0oO.OooO00o(i2, 0.5d, 14);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m72787k4(boolean z, C13847mr c13847mr, C12014ne c12014ne, C14787xi c14787xi) {
        return m72788k4(z, c13847mr, c12014ne.Clone(), c14787xi, c14787xi.m73400kk());
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m72815kk(List<C1210hn> list) {
        for (int i = 0; i < list.size(); i++) {
            if (C7019kk.m27469x1(list.get_Item(i).m7238x1(), String.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m72788k4(boolean z, C13847mr c13847mr, C12014ne c12014ne, C14787xi c14787xi, C12013m9 c12013m9) {
        if (c14787xi.m73384dy() == null || c14787xi.m73384dy().getTickLabelPosition() == 3) {
            return 0.0f;
        }
        int type = c13847mr.m64945h4().getType();
        String str = "";
        String str2 = "";
        for (int i = 0; i < c14787xi.f50098m9.size(); i++) {
            double dDoubleValue = ((Double) C7019kk.m27464to(c14787xi.f50098m9.get_Item(i), Double.TYPE)).doubleValue();
            if (type == 32 || type == 2) {
                dDoubleValue /= 100.0d;
                str = "0%";
            }
            boolean zM73385fa = c14787xi.m73385fa();
            Double dValueOf = Double.valueOf(dDoubleValue);
            String strM63880k4 = zM73385fa ? C13729ki.m63880k4((Object) dValueOf, str, false) : C0841c4.m4468k4(dValueOf, c14787xi);
            if (strM63880k4.length() > str2.length()) {
                str2 = strM63880k4;
            }
        }
        C12023wl c12023wl = new C12023wl(c12014ne.m56663c5(), c12014ne.m56683x1());
        C12015qq c12015qq = new C12015qq();
        int iM73386h4 = c14787xi.m73386h4();
        if (c12013m9 == null) {
            c12013m9 = c14787xi.m73400kk();
        }
        C0840c3.m4448x1(str2, iM73386h4, c12013m9, C12023wl.m56853k4(c12023wl).Clone(), 1, 1).CloneTo(c12015qq);
        return (z ? c12015qq.m56699x1() : c12015qq.m56697kk()) * (c14787xi.f50098m9.size() - 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m72789k4(List<C13847mr> list) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < list.size(); i++) {
            List<C0886d8> listM64944dy = list.get_Item(i).m64944dy();
            for (int i2 = 0; i2 < listM64944dy.size(); i2++) {
                if (listM64944dy.get_Item(i2) != null) {
                    double dM4989k4 = listM64944dy.get_Item(i2).m4989k4();
                    if (dM4989k4 > 0.0d) {
                        z = true;
                    } else if (dM4989k4 < 0.0d) {
                        z2 = true;
                    }
                }
            }
        }
        if (!z || z2) {
            return (z || !z2) ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private static List<List<C13847mr>> m72818x1(List<C13847mr> list) {
        C13847mr c13847mr = list.get_Item(0);
        List<List<C13847mr>> list2 = new List<>();
        List<C13847mr> list3 = new List<>();
        List<C13847mr> list4 = new List<>();
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                C13847mr next = it.next();
                if (next.m64956k4(new int[]{c13847mr.m64945h4().getType()})) {
                    list4.addItem(next);
                } else {
                    list3.addItem(next);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (list4.size() > 0) {
            list2.addItem(list4);
        }
        List<C13847mr> list5 = new List<>();
        if (list3.size() > 0) {
            C13847mr c13847mr2 = list3.get_Item(0);
            List list6 = new List(list3);
            list3.clear();
            it = list6.iterator();
            while (it.hasNext()) {
                try {
                    C13847mr c13847mr3 = (C13847mr) it.next();
                    if (c13847mr3.m64956k4(new int[]{c13847mr2.m64945h4().getType()})) {
                        list5.addItem(c13847mr3);
                    } else {
                        list3.addItem(c13847mr3);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (list5.size() > 0) {
            list2.addItem(list5);
        }
        if (list3.size() > 0) {
            list2.addItem(list3);
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m72790k4(Object obj, boolean z) {
        if (obj != null) {
            if (!C7019kk.m27469x1(obj, String.class)) {
                if (C7019kk.m27469x1(obj, Double.class) || C7019kk.m27469x1(obj, Integer.class) || C7019kk.m27469x1(obj, Boolean.class)) {
                    return C14080ne.m66998m9(obj);
                }
                if (C7019kk.m27469x1(obj, C14084qq.class)) {
                    return C0841c4.m4460k4(((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).Clone().Clone(), false);
                }
                try {
                    return C14080ne.m66876du(obj);
                } catch (RuntimeException e) {
                    C3085sv.m13082k4(e);
                    return -10000;
                }
            }
            String string = obj.toString();
            if (!"".equals(string) && C14044b3.m66435k4(string, 7, C11697x1.m55252to(), new double[]{0.0d})) {
                return C14057f9.m66582k4(string);
            }
        }
        return -10000;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m72819x1(double d, double d2, List<Object> list, int i, C12014ne c12014ne, boolean z, C13847mr c13847mr, C14787xi c14787xi) {
        double d3;
        int iM56663c5;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        double d4 = 1.0d;
        if (d == d2 && d == 0.0d) {
            d3 = 10.0d;
            c14787xi.m73381du(10.0d);
            c14787xi.m73414to(1.0d);
        } else {
            d3 = d;
        }
        if (ChartTypeCharacterizer.m761jd(c13847mr.m64945h4().getType())) {
            if (d3 == 100.0d && c14787xi.m73384dy().isAutomaticMaxValue()) {
                c14787xi.m73381du(100.0d);
            }
            if (d2 >= 1.0d && c14787xi.m73384dy().isAutomaticMinValue()) {
                c14787xi.m73414to(1.0d);
            }
        }
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        double[] dArr3 = {0.0d};
        int[] iArr = {1};
        m72811k4(dArr, dArr2, new double[]{d2}, new double[]{d3}, dArr3, iArr, z, c14787xi);
        double d5 = dArr[0];
        double d6 = dArr2[0];
        double d7 = dArr3[0];
        int i2 = iArr[0];
        double d8 = d7;
        m72798k4(i2, d8, d6, d5, list, c14787xi);
        int iM72817x1 = m72817x1(z, c13847mr, c12014ne.Clone(), c14787xi);
        if (ChartTypeCharacterizer.is3DChart(c14365qyM73423wy.m69834fa().getType())) {
            C13743kq c13743kqM69833e0 = c14365qyM73423wy.m69833e0();
            iM56663c5 = C7019kk.m27462to(Float.valueOf(z ? c13743kqM69833e0.m64121to() : c13743kqM69833e0.m64100du()), 13);
        } else {
            iM56663c5 = z ? c12014ne.m56663c5() : c12014ne.m56683x1();
        }
        while (c14787xi.m73422wl()) {
            double d9 = d4;
            if (list.size() <= 3 || iM72817x1 <= iM56663c5 || iM56663c5 == 0) {
                break;
            }
            d8 += d9;
            m72798k4(i2, d8, d6, d5, list, c14787xi);
            iM72817x1 = m72817x1(z, c13847mr, c12014ne.Clone(), c14787xi);
            d4 = d9;
        }
        if (list.size() >= 2) {
            boolean zIsAutomaticMaxValue = c14787xi.m73384dy().isAutomaticMaxValue();
            Class cls = Double.TYPE;
            if (zIsAutomaticMaxValue) {
                c14787xi.m73381du(c14787xi.m73424x1(((Double) C7019kk.m27464to(list.get_Item(0), cls)).doubleValue()));
            }
            if (c14787xi.m73384dy().isAutomaticMinValue()) {
                c14787xi.m73414to(c14787xi.m73424x1(((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue()));
            }
            if (c14787xi.m73422wl()) {
                c14787xi.m73409m9(c14787xi.m73424x1(d8));
            }
            if (c14787xi.m73411qq()) {
                c14787xi.m73387h4(c14787xi.m73418um());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static List<Integer> m72791k4(List<C1210hn> list, boolean z) {
        List<Integer> list2 = new List<>();
        for (int i = 0; i < list.size(); i++) {
            list2.addItem(Integer.valueOf(m72790k4(list.get_Item(i).m7238x1(), false)));
        }
        return list2;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72820x1(int i, boolean z, C14787xi c14787xi, float f, float f2, C12023wl c12023wl) {
        boolean zM73377c5 = c14787xi.m73377c5();
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14);
        c14787xi.m73387h4(C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) == 0 ? 1.0d : C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14));
        c14787xi.m73382du(c14787xi.m73417u4());
        if (!zM73377c5 || z) {
            return;
        }
        int iM63753k4 = kc0.m63753k4((float) (((double) C0841c4.m4456k4(c14787xi.m73417u4(), iM27462to, iM27462to2, false)) / c14787xi.m73418um()));
        if (c14787xi.m73375b3() || c14787xi.m73423wy().m69834fa().hasDataTable()) {
            iM63753k4++;
        } else if (iM63753k4 == 0) {
            iM63753k4 = 1;
        }
        while ((0.0f + f) * iM63753k4 > f2) {
            if (c14787xi.m73386h4() == 0) {
                c14787xi.m73394k4(45);
                f = (float) (((double) c12023wl.m56862kk()) / C14116yg.m67495m9((((double) C14116yg.m67482k4(c14787xi.m73386h4())) * 3.141592653589793d) / 180.0d));
            } else if (c14787xi.m73386h4() == 45) {
                c14787xi.m73394k4(90);
                return;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14743wm Clone() {
        C14743wm c14743wm = new C14743wm();
        CloneTo(c14743wm);
        return c14743wm;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72792k4(double d, double d2, List<Object> list, int i, C12014ne c12014ne, boolean z, C13847mr c13847mr, C14787xi c14787xi) {
        m72793k4(d, d2, list, i, c12014ne.Clone(), z, c13847mr, c14787xi, (C12013m9) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72793k4(double d, double d2, List<Object> list, int i, C12014ne c12014ne, boolean z, C13847mr c13847mr, C14787xi c14787xi, C12013m9 c12013m9) {
        double dM73389ix;
        double d3;
        double dM73410ne;
        double d4;
        C14787xi c14787xi2;
        boolean z2;
        double d5;
        double d6;
        int i2;
        double d7;
        List<Object> list2;
        double d8;
        int i3;
        float fM72788k4;
        double d9;
        int iM56683x1;
        List<Object> list3;
        double d10;
        Float fValueOf;
        double d11;
        double dM64104fa;
        double d12;
        if (c14787xi.m73384dy() == null) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (c14787xi.m73384dy().isLogarithmic()) {
            m72819x1(d, d2, list, i, c12014ne.Clone(), z, c13847mr, c14787xi);
            return;
        }
        if (d == d2 && d == 0.0d) {
            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                c14787xi.m73381du(0.0d);
                c14787xi.m73414to(-1.0d);
                dM73410ne = d2;
                dM73389ix = 0.0d;
                d3 = 0.0d;
            } else {
                c14787xi.m73381du(1.0d);
                c14787xi.m73414to(0.0d);
                dM73410ne = d2;
                d3 = 1.0d;
                dM73389ix = d3;
            }
        } else if (d > d2) {
            dM73389ix = d;
            d3 = dM73389ix;
            dM73410ne = d2;
        } else if (c14787xi.m73384dy().isAutomaticMaxValue() || !c14787xi.m73384dy().isAutomaticMinValue()) {
            if (c14787xi.m73384dy().isAutomaticMaxValue() && !c14787xi.m73384dy().isAutomaticMinValue()) {
                c14787xi.m73381du(d2 + 1.0d);
                dM73389ix = c14787xi.m73389ix();
                d3 = d;
            }
            dM73410ne = d2;
        } else {
            c14787xi.m73414to(d - 1.0d);
            d3 = d;
            dM73410ne = c14787xi.m73410ne();
            dM73389ix = d3;
        }
        boolean zIsAutomaticMaxValue = c14787xi.m73384dy().isAutomaticMaxValue();
        boolean zIsAutomaticMinValue = c14787xi.m73384dy().isAutomaticMinValue();
        int type = i;
        if (type == 73) {
            type = c14365qyM73423wy.m69834fa().getChartData().getSeries().get_Item(0).getType();
        }
        boolean zM761jd = ChartTypeCharacterizer.m761jd(type);
        if (zM761jd) {
            if (dM73389ix == 100.0d && c14787xi.m73384dy().isAutomaticMaxValue()) {
                c14787xi.m73381du(100.0d);
            }
            d4 = 0.0d;
            if (dM73410ne == -100.0d && c14787xi.m73384dy().isAutomaticMinValue()) {
                c14787xi.m73414to(-100.0d);
            }
            c14787xi.m73409m9(c14787xi.m73418um() * 100.0d);
        } else {
            d4 = 0.0d;
        }
        double d13 = dM73389ix;
        double[] dArr = {d4};
        double[] dArr2 = {d4};
        double[] dArr3 = {d4};
        int[] iArr = {1};
        m72810k4(dArr, dArr2, new double[]{dM73410ne}, new double[]{d13}, dArr3, iArr, z, d3, d2, zIsAutomaticMaxValue, zIsAutomaticMinValue, c14787xi);
        double d14 = d3;
        double d15 = dArr[0];
        double d16 = dArr2[0];
        double dM73374ar = dArr3[0];
        int i4 = iArr[0];
        if (!c14787xi.m73411qq()) {
            if (!c14787xi.m73422wl() && c14787xi.m73418um() < c14787xi.m73374ar()) {
                throw new ArgumentException(C14113y2.m67408k4("The numbers you specified can't be used because the interval for the minor unit", "tick marks must be less than or equal to the interval for the major unit tick marks!"));
            }
            if (dM73374ar < c14787xi.m73374ar()) {
                dM73374ar = c14787xi.m73374ar();
            }
        }
        if (!ChartTypeCharacterizer.isBar3DChart(c14365qyM73423wy.m69834fa().getType()) || ChartTypeCharacterizer.isChartTypeColumn(c14365qyM73423wy.m69834fa().getType())) {
            c14787xi2 = c14787xi;
            z2 = zM761jd;
            d5 = d15;
            d6 = d16;
            i2 = i4;
            d7 = d2;
            list2 = list;
            d8 = dM73374ar;
        } else if (zM761jd) {
            if (c14365qyM73423wy.m69833e0().m64104fa() < 1.3d) {
                d12 = dM73374ar / 2.0d;
            } else {
                if (c14365qyM73423wy.m69833e0().m64104fa() > 2.4d) {
                    d12 = dM73374ar * 2.5d;
                }
                c14787xi2 = c14787xi;
                z2 = zM761jd;
                d5 = d15;
                d6 = d16;
                i2 = i4;
                d7 = d2;
                list2 = list;
                d8 = dM73374ar;
            }
            d7 = d2;
            c14787xi2 = c14787xi;
            z2 = zM761jd;
            list2 = list;
            d5 = d15;
            i2 = i4;
            d6 = d16;
            d8 = d12;
        } else {
            c14787xi2 = c14787xi;
            z2 = zM761jd;
            double d17 = dM73374ar;
            d5 = d15;
            d6 = d16;
            m72797k4(i4, d17, d6, d5, list, d14, d2, zIsAutomaticMaxValue, zIsAutomaticMinValue, z2, c14787xi2);
            if ((m72788k4(z, c13847mr, c12014ne.Clone(), c14787xi2, c12013m9) * 3.0f) / c14365qyM73423wy.m69833e0().m64121to() > 0.5f) {
                d11 = d17;
                if (c14365qyM73423wy.m69833e0().m64104fa() > 1.4d) {
                    dM64104fa = ((double) c14365qyM73423wy.m69833e0().m64104fa()) * d11;
                }
                c14787xi2.f50098m9.clear();
                list.clear();
                d7 = d2;
                list2 = list;
                d8 = dM64104fa;
                i2 = i4;
            } else {
                d11 = d17;
            }
            dM64104fa = d11;
            c14787xi2.f50098m9.clear();
            list.clear();
            d7 = d2;
            list2 = list;
            d8 = dM64104fa;
            i2 = i4;
        }
        m72797k4(i2, d8, d6, d5, list2, d14, d7, zIsAutomaticMaxValue, zIsAutomaticMinValue, z2, c14787xi2);
        double d18 = d8;
        float fM72788k42 = m72788k4(z, c13847mr, c12014ne.Clone(), c14787xi2, c12013m9);
        Chart chartM69834fa = c14787xi2.m73423wy().m69834fa();
        boolean z3 = C14064he.m66715kk(chartM69834fa.getPlotArea().getWidth()) && C14064he.m66715kk(chartM69834fa.getPlotArea().getHeight()) && C14064he.m66715kk(chartM69834fa.getPlotArea().getX()) && C14064he.m66715kk(chartM69834fa.getPlotArea().getY());
        if (ChartTypeCharacterizer.is3DChart(c14365qyM73423wy.m69834fa().getType())) {
            if (z) {
                i3 = i2;
                fValueOf = Float.valueOf(c14365qyM73423wy.m69833e0().m64121to());
            } else {
                i3 = i2;
                fValueOf = Float.valueOf(c14365qyM73423wy.m69833e0().m64100du());
            }
            iM56683x1 = C7019kk.m27462to(fValueOf, 13);
            fM72788k4 = fM72788k42;
            d9 = d6;
        } else {
            i3 = i2;
            if (!z) {
                fM72788k4 = fM72788k42;
                d9 = d6;
                iM56683x1 = c12014ne.m56683x1();
            } else if (ChartTypeCharacterizer.isChartTypeBar(c14365qyM73423wy.m69834fa().getType()) && z3) {
                fM72788k4 = fM72788k42;
                d9 = d6;
                iM56683x1 = com.aspose.slides.Collections.Generic.OooO00o.OooO00o(c12014ne.m56663c5(), 0.45d, 14);
            } else {
                fM72788k4 = fM72788k42;
                d9 = d6;
                iM56683x1 = c12014ne.m56663c5();
            }
        }
        if (!ChartTypeCharacterizer.isChartTypeBar(c14365qyM73423wy.m69834fa().getType()) || ChartTypeCharacterizer.is3DChart(c14365qyM73423wy.m69834fa().getType())) {
            int i5 = iM56683x1;
            double d19 = d9;
            boolean z4 = z;
            float f = i5;
            float size = f / (c14787xi2.f50098m9.size() - 1);
            int i6 = 1;
            float fM72788k43 = m72788k4(z4, c13847mr, c12014ne.Clone(), c14787xi2, c12013m9) / (c14787xi2.f50098m9.size() - 1);
            while (true) {
                float f2 = fM72788k4;
                if (!c14787xi2.m73422wl()) {
                    break;
                }
                float f3 = f;
                if (list.size() <= 2) {
                    break;
                }
                if (f2 <= f3 || i5 == 0) {
                    if (z3 || !z4) {
                        break;
                    }
                    d10 = d19;
                    if (((double) fM72788k43) * 3.937d < size) {
                        break;
                    }
                } else {
                    d10 = d19;
                }
                int i7 = i6;
                double[] dArr4 = new double[i7];
                dArr4[0] = d18;
                double[] dArr5 = new double[i7];
                dArr5[0] = d4;
                m72796k4(dArr4[0], dArr4, dArr5, c14787xi2);
                double d20 = dArr4[0] * 10.0d;
                i6 = i7;
                d19 = d10;
                m72797k4(i3, d20, d19, d5, list, d14, d2, zIsAutomaticMaxValue, zIsAutomaticMinValue, z2, c14787xi2);
                d18 = d20;
                fM72788k4 = m72788k4(z, c13847mr, c12014ne.Clone(), c14787xi2, c12013m9);
                fM72788k43 = m72788k4(z, c13847mr, c12014ne.Clone(), c14787xi2, c12013m9) / (c14787xi2.f50098m9.size() - 1);
                size = f3 / (c14787xi2.f50098m9.size() - 1);
                z4 = z;
                f = f3;
            }
            list3 = list;
        } else {
            float fM72788k44 = fM72788k4;
            for (int i8 = 2; c14787xi2.m73422wl() && list.size() > i8 && fM72788k44 > iM56683x1 && iM56683x1 != 0; i8 = 2) {
                double[] dArr6 = {d18};
                m72796k4(dArr6[0], dArr6, new double[]{d4}, c14787xi2);
                double d21 = dArr6[0] * 10.0d;
                m72797k4(i3, d21, d9, d5, list, d14, d2, zIsAutomaticMaxValue, zIsAutomaticMinValue, z2, c14787xi2);
                d18 = d21;
                fM72788k44 = m72788k4(z, c13847mr, c12014ne.Clone(), c14787xi2, c12013m9);
                iM56683x1 = iM56683x1;
            }
            list3 = list;
        }
        double d22 = d18;
        if (list3.size() >= 2) {
            Object obj = list3.get_Item(0);
            Class cls = Double.TYPE;
            c14787xi2.m73381du(((Double) C7019kk.m27464to(obj, cls)).doubleValue());
            c14787xi2.m73414to(((Double) C7019kk.m27464to(list3.get_Item(list3.size() - 1), cls)).doubleValue());
            if (c14787xi2.m73422wl()) {
                c14787xi2.m73409m9(d22);
            }
            if (c14787xi2.m73411qq()) {
                c14787xi2.m73387h4(c14787xi2.m73418um() / 5.0d);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m72821x1(C14365qy c14365qy, C12014ne[] c12014neArr) {
        if (c14365qy.m69834fa().hasTitle()) {
            C12023wl c12023wlClone = c14365qy.m69828ck().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.83f, c12014neArr[0].m56683x1() * 0.5f).Clone()).Clone();
            c14365qy.m69828ck().f47882k4.f5456k4 = new C12014ne(((C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) - c12023wlClone.m56865x1()) / 2) + C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13), C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13) + 8, c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
            if (c14365qy.m69834fa().getChartTitle().getOverlay()) {
                return;
            }
            C12014ne c12014ne = c12014neArr[0];
            c12014ne.m56682to(c12023wlClone.m56862kk() + 6 + c12014ne.m56664ck());
            C12014ne c12014ne2 = c12014neArr[0];
            c12014ne2.m56671k4(c12014ne2.m56683x1() - (c12023wlClone.m56862kk() + 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72794k4(double d, double d2, double[] dArr, int i, double d3, double d4, boolean z, boolean z2, C14787xi c14787xi) {
        double dM67477k4;
        double dM67477k42;
        double dM67477k43;
        double dM67477k44;
        int iM63760to = kc0.m63760to(dArr[0]);
        if (i == 1) {
            if (c14787xi.m73384dy().isAutomaticMinValue()) {
                double dM67477k45 = d;
                double dM63750k4 = d2;
                while (true) {
                    if (dM63750k4 < d && d - dM63750k4 >= dArr[0]) {
                        break;
                    }
                    dM67477k45 = C14116yg.m67477k4(dM63750k4, iM63760to);
                    dM63750k4 = kc0.m63750k4(dM67477k45, dArr[0]);
                }
                double dM63750k42 = kc0.m63750k4(d4, dM67477k45);
                double d5 = dArr[0];
                dM67477k44 = ((dM63750k42 <= d5 || dM67477k45 == 0.0d) && (d4 - d2) / (dM67477k45 - d2) > 0.9523809523809523d && dM67477k45 != 0.0d) ? C14116yg.m67477k4(dM67477k45 - d5, iM63760to) : dM67477k45;
            } else {
                dM67477k44 = c14787xi.m73410ne();
            }
            dM67477k4 = dM67477k44;
            dM67477k43 = d2;
        } else if (i == 2) {
            if (c14787xi.m73384dy().isAutomaticMaxValue()) {
                double dM63761x1 = d;
                double dM67477k46 = d2;
                while (true) {
                    if (dM63761x1 > d2 && dM63761x1 >= d2 + dArr[0]) {
                        break;
                    }
                    dM67477k46 = C14116yg.m67477k4(dM63761x1, iM63760to);
                    dM63761x1 = kc0.m63761x1(dM67477k46, dArr[0]);
                }
                dM67477k43 = ((kc0.m63750k4(dM67477k46, d3) <= dArr[0] || dM67477k46 == 0.0d) && !ChartTypeCharacterizer.is3DChart(c14787xi.m73423wy().m69834fa().getType()) && (d3 - d) / (dM67477k46 - d) > 0.9523809523809523d && dM67477k46 != 0.0d) ? C14116yg.m67477k4(dM67477k46 + dArr[0], iM63760to) : dM67477k46;
            } else {
                dM67477k43 = c14787xi.m73389ix();
            }
            dM67477k4 = d;
        } else {
            if (c14787xi.m73384dy().isAutomaticMinValue()) {
                dM67477k4 = d;
                double dM63750k43 = 0.0d;
                while (true) {
                    if (dM63750k43 < d && d - dM63750k43 >= dArr[0]) {
                        break;
                    }
                    dM67477k4 = C14116yg.m67477k4(dM63750k43, iM63760to);
                    dM63750k43 = kc0.m63750k4(dM67477k4, dArr[0]);
                }
                double dM63750k44 = kc0.m63750k4(d4, dM67477k4);
                double d6 = dArr[0];
                if ((dM63750k44 <= d6 || dM67477k4 == 0.0d) && (d4 - d2) / (dM67477k4 - d2) > 0.9523809523809523d && dM67477k4 != 0.0d) {
                    dM67477k42 = C14116yg.m67477k4(dM67477k4 - d6, iM63760to);
                }
                if (c14787xi.m73384dy().isAutomaticMaxValue()) {
                    dM67477k43 = c14787xi.m73410ne();
                } else {
                    double dM67477k47 = d2;
                    double dM63761x12 = 0.0d;
                    while (true) {
                        if (dM63761x12 > d2 && dM63761x12 >= d2 + dArr[0]) {
                            break;
                        }
                        dM67477k47 = C14116yg.m67477k4(dM63761x12, iM63760to);
                        dM63761x12 = kc0.m63761x1(dM67477k47, dArr[0]);
                    }
                    double dM63750k45 = kc0.m63750k4(dM67477k47, d3);
                    double d7 = dArr[0];
                    dM67477k43 = ((dM63750k45 <= d7 || dM67477k47 == 0.0d) && (d3 - d) / (dM67477k47 - d) > 0.9523809523809523d && dM67477k47 != 0.0d) ? C14116yg.m67477k4(dM67477k47 + d7, iM63760to) : dM67477k47;
                }
            } else {
                dM67477k42 = c14787xi.m73410ne();
            }
            dM67477k4 = dM67477k42;
            if (c14787xi.m73384dy().isAutomaticMaxValue()) {
            }
        }
        double d8 = dArr[0];
        double d9 = dM67477k43 - dM67477k4;
        if (d9 / d8 > (ChartTypeCharacterizer.isChartTypeBubble(c14787xi.m73423wy().m69834fa().getType()) ? 10 : 11)) {
            m72807k4(dArr);
            return;
        }
        m72822x1(dArr);
        if (d9 > dArr[0] * 10.0d) {
            dArr[0] = d8;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72822x1(double[] dArr) {
        int iM66582k4;
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        double d = dArr[0];
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        dArr[0] = dM67475k4;
        if (dM67475k4 > 1.0d) {
            iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(C14044b3.m66425h4(dM67475k4).charAt(0)));
        } else {
            if (dM67475k4 == 0.0d) {
                dArr[0] = 0.0d;
                return;
            }
            iM66582k4 = 1;
        }
        double d2 = dArr[0];
        if (d2 < 1.0d) {
            String strM66425h4 = C14044b3.m66425h4(d2);
            int i = 0;
            while (true) {
                if (i < strM66425h4.length()) {
                    if (strM66425h4.charAt(i) != '0' && strM66425h4.charAt(i) != cM67042x1) {
                        iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(strM66425h4.charAt(i)));
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (iM66582k4 == 1 || iM66582k4 == 2) {
            dArr[0] = dArr[0] / 2.0d;
        } else {
            dArr[0] = (dArr[0] * 2.0d) / 5.0d;
        }
        if (z) {
            return;
        }
        dArr[0] = -dArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72795k4(double d, double[] dArr, double[] dArr2) {
        String strM67408k4;
        int iM66582k4;
        double d2;
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        double dM67475k4 = C14116yg.m67475k4(d);
        String strM66425h4 = C14044b3.m66425h4(dM67475k4);
        if (C14113y2.m67364dy(strM66425h4, "E") > 0) {
            String[] strArrM67414k4 = C14113y2.m67414k4(strM66425h4, 'E');
            String str = strArrM67414k4[0];
            strM67408k4 = C14113y2.m67408k4("E", strArrM67414k4[1]);
            strM66425h4 = str;
        } else {
            strM67408k4 = "";
        }
        int iM66582k42 = C14057f9.m66582k4(C14117yj.m67537ne(strM66425h4.charAt(0)));
        if (strM66425h4.length() > 1) {
            iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(strM66425h4.charAt(1) != cM67042x1 ? strM66425h4.charAt(1) : strM66425h4.charAt(2)));
        } else {
            iM66582k4 = 0;
        }
        int i = 5;
        if (iM66582k42 == 1) {
            double dM67469du = 19047.0d;
            if (strM66425h4.length() <= 5) {
                d2 = 5.0d;
            } else {
                d2 = 5.0d;
                dM67469du = 19047.0d * C14116yg.m67469du(10.0d, ((double) strM66425h4.length()) - 5.0d);
            }
            if (dM67475k4 > dM67469du) {
                if (iM66582k4 % 5 > 0) {
                    iM66582k42++;
                    i = 0;
                }
                dArr[0] = d2;
            } else {
                i = ((iM66582k4 / 2) + 1) * 2;
                dArr[0] = 2.0d;
            }
        } else if (iM66582k42 < 5) {
            if (iM66582k4 % 5 > 0) {
                iM66582k42++;
                i = 0;
            }
            dArr[0] = 5.0d;
        } else {
            iM66582k42++;
            dArr[0] = 10.0d;
            i = 0;
        }
        int length = strM66425h4.length();
        int iM67434x1 = C14113y2.m67434x1(strM66425h4, cM67042x1, 0);
        if (iM67434x1 > 0) {
            length = iM67434x1;
        }
        if ("".equals(strM67408k4)) {
            double d3 = ((double) length) - 2.0d;
            dArr[0] = C14116yg.m67469du(10.0d, d3) * dArr[0];
            dArr2[0] = C14116yg.m67469du(10.0d, d3) * ((double) ((iM66582k42 * 10) + i));
        } else {
            double d4 = ((double) length) - 2.0d;
            dArr[0] = C14116yg.m67469du(10.0d, d4) * dArr[0];
            dArr2[0] = C14116yg.m67469du(10.0d, d4) * ((double) ((iM66582k42 * 10) + i));
            dArr[0] = C14080ne.m66988m9(C14113y2.m67408k4(C14044b3.m66425h4(dArr[0]), strM67408k4));
            dArr2[0] = C14080ne.m66988m9(C14113y2.m67408k4(C14044b3.m66425h4(dArr2[0]), strM67408k4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m72823x1(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int[] iArr, boolean z, double d, double d2, boolean z2, boolean z3, C14787xi c14787xi) {
        boolean zIsAutomaticMinValue = c14787xi.m73384dy().isAutomaticMinValue();
        boolean zIsAutomaticMaxValue = c14787xi.m73384dy().isAutomaticMaxValue();
        double[] dArr6 = {0.0d};
        double[] dArr7 = {0.0d};
        m72796k4(dArr3[0], dArr6, dArr7, c14787xi);
        double d3 = dArr6[0];
        double d4 = dArr7[0];
        double[] dArr8 = {0.0d};
        double[] dArr9 = {0.0d};
        m72796k4(dArr4[0], dArr8, dArr9, c14787xi);
        double d5 = dArr8[0];
        double d6 = dArr9[0];
        double d7 = dArr3[0];
        if (d7 < d4) {
            d4 = d7;
        }
        dArr2[0] = d4;
        if (ChartTypeCharacterizer.is3DChart(c14787xi.m73423wy().m69834fa().getType())) {
            d6 = dArr4[0];
        }
        double d8 = dArr4[0];
        if (d8 > d6) {
            d6 = d8;
        }
        dArr[0] = d6;
        if (C14116yg.m67475k4(d5) > C14116yg.m67475k4(d3)) {
            dArr5[0] = C14116yg.m67475k4(d5);
        } else {
            dArr5[0] = C14116yg.m67475k4(d3);
        }
        double d9 = dArr4[0];
        double d10 = dArr3[0];
        if (d9 != d10 && d9 > 0.0d && d10 > 0.0d) {
            double dM63750k4 = kc0.m63750k4(d9, d10);
            double[] dArr10 = {0.0d};
            double[] dArr11 = {0.0d};
            m72796k4(dM63750k4, dArr10, dArr11, c14787xi);
            double d11 = dArr10[0];
            double d12 = dArr11[0];
            double d13 = dArr3[0];
            if (d13 / dM63750k4 >= 5.0d) {
                dArr[0] = d13 + d12;
                dArr5[0] = C14116yg.m67475k4(d11);
                if (kc0.m63750k4(dArr4[0], dArr3[0]) / dArr5[0] >= 8.0d) {
                    m72807k4(dArr5);
                }
                double dM67477k4 = C14116yg.m67477k4(C14116yg.m67490kk(C14116yg.m67477k4((dArr3[0] * 3.0d) - dArr4[0], 10) / (dArr5[0] * 2.0d)) * dArr5[0], kc0.m63760to(dArr5[0]));
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    c14787xi.m73414to(dM67477k4);
                    dArr2[0] = dM67477k4;
                    zIsAutomaticMinValue = false;
                }
            } else {
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    c14787xi.m73414to(0.0d);
                    zIsAutomaticMinValue = false;
                }
                dArr2[0] = 0.0d;
            }
        } else if (d9 != d10 && d9 < 0.0d && d10 < 0.0d) {
            double d14 = d10 - d9;
            double[] dArr12 = {0.0d};
            double[] dArr13 = {0.0d};
            m72796k4(d14, dArr12, dArr13, c14787xi);
            double d15 = dArr12[0];
            double d16 = dArr13[0];
            if (dArr3[0] / d14 >= 5.0d) {
                dArr[0] = dArr4[0] - (d16 / 2.0d);
                dArr2[0] = dArr4[0] + d16;
                double dM67475k4 = C14116yg.m67475k4(d15);
                dArr5[0] = dM67475k4;
                if ((dArr4[0] - dArr3[0]) / dM67475k4 >= 8.0d) {
                    m72807k4(dArr5);
                }
                int iM63760to = kc0.m63760to(dArr5[0]);
                double dM67477k42 = 0.0d;
                while (dM67477k42 - (dArr5[0] * 3.0d) > dArr4[0]) {
                    dM67477k42 = C14116yg.m67477k4(dM67477k42, iM63760to) - dArr5[0];
                }
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    c14787xi.m73381du(dM67477k42);
                    dArr[0] = dM67477k42;
                }
            } else {
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    c14787xi.m73381du(0.0d);
                    zIsAutomaticMaxValue = false;
                }
                dArr[0] = 0.0d;
            }
        } else if (d9 != d10 && d9 > 0.0d && d10 < 0.0d) {
            double[] dArr14 = {0.0d};
            m72796k4(d9 - d10, dArr14, new double[]{0.0d}, c14787xi);
            double dM67475k42 = C14116yg.m67475k4(dArr14[0]);
            dArr5[0] = dM67475k42;
            if ((dArr4[0] - dArr3[0]) / dM67475k42 > 9.0d) {
                m72807k4(dArr5);
            }
        }
        if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
            iArr[0] = 3;
            double d17 = dArr3[0];
            if (d17 != 0.0d) {
                double d18 = dArr4[0];
                if (d18 == d17 && d18 > 0.0d) {
                    c14787xi.m73414to(0.0d);
                    iArr[0] = 2;
                    dArr2[0] = 0.0d;
                }
                double d19 = dArr4[0];
                if (d19 == 0.0d || (d19 == dArr3[0] && d19 < 0.0d)) {
                    c14787xi.m73381du(0.0d);
                    iArr[0] = 1;
                    dArr[0] = 0.0d;
                }
            }
        } else if (zIsAutomaticMinValue && !zIsAutomaticMaxValue) {
            iArr[0] = 1;
            if (ChartTypeCharacterizer.is3DChart(c14787xi.m73423wy().m69834fa().getType())) {
                double d20 = dArr[0];
                double d21 = dArr4[0];
                if (d20 - d21 >= dArr5[0]) {
                    dArr[0] = d21;
                }
            } else {
                dArr[0] = c14787xi.m73389ix();
            }
            dArr4[0] = c14787xi.m73389ix();
        } else if (zIsAutomaticMinValue || !zIsAutomaticMaxValue) {
            iArr[0] = 2;
            dArr2[0] = c14787xi.m73410ne();
            dArr[0] = c14787xi.m73389ix();
            dArr3[0] = c14787xi.m73410ne();
            double dM73389ix = c14787xi.m73389ix();
            dArr4[0] = dM73389ix;
            double[] dArr15 = {0.0d};
            m72796k4(kc0.m63750k4(dM73389ix, dArr3[0]), dArr15, new double[]{0.0d}, c14787xi);
            dArr5[0] = dArr15[0];
        } else {
            iArr[0] = 2;
            dArr2[0] = c14787xi.m73410ne();
            dArr3[0] = c14787xi.m73410ne();
        }
        if (!z || ChartTypeCharacterizer.isChartTypeBubble(c14787xi.m73423wy().m69834fa().getType())) {
            m72794k4(dArr2[0], dArr[0], dArr5, iArr[0], d, d2, z2, z3, c14787xi);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72796k4(double d, double[] dArr, double[] dArr2, C14787xi c14787xi) {
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        dArr[0] = 0.0d;
        dArr2[0] = 0.0d;
        if (dM67475k4 > 1.0d) {
            m72795k4(dM67475k4, dArr, dArr2);
        } else {
            if (dM67475k4 == 0.0d) {
                return;
            }
            double dM63760to = kc0.m63760to(dM67475k4);
            m72795k4(C14116yg.m67469du(10.0d, dM63760to) * dM67475k4, dArr, dArr2);
            dArr[0] = dArr[0] / C14116yg.m67469du(10.0d, dM63760to);
            dArr2[0] = dArr2[0] / C14116yg.m67469du(10.0d, dM63760to);
        }
        if (z) {
            return;
        }
        dArr[0] = -dArr[0];
        dArr2[0] = -dArr2[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035d  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m72824x1(List<C13847mr> list, double[] dArr, double[] dArr2, C14787xi c14787xi) {
        int i;
        double d;
        boolean z;
        boolean z2;
        int i2;
        double d2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        double d3 = 0.0d;
        dArr[0] = 0.0d;
        dArr2[0] = 0.0d;
        C13847mr c13847mr = list.get_Item(0);
        boolean z4 = !ChartTypeCharacterizer.isChartTypeBar(c14787xi.m73423wy().m69834fa().getType()) && (c14787xi.m73419up() == 2 || c14787xi.m73419up() == 3);
        if (ChartTypeCharacterizer.m758dy(c13847mr.m64945h4().getType())) {
            if (ChartTypeCharacterizer.m755c5(c13847mr.m64945h4().getType())) {
                int iM69819to = C14365qy.m69819to(list);
                z = false;
                boolean z5 = true;
                for (int i10 = 0; i10 < iM69819to; i10++) {
                    double dM4989k4 = 0.0d;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        C13847mr c13847mr2 = list.get_Item(i11);
                        if (!ChartTypeCharacterizer.m758dy(c13847mr2.m64945h4().getType())) {
                            break;
                        }
                        C0886d8 c0886d8 = c13847mr2.m64944dy().get_Item(i10);
                        if (c0886d8 != null && !c0886d8.m4983dy()) {
                            dM4989k4 += c0886d8.m4989k4();
                            if (z5) {
                                dArr[0] = dM4989k4;
                                dArr2[0] = dM4989k4;
                                z5 = false;
                                z = true;
                            } else {
                                if (dM4989k4 < dArr[0]) {
                                    dArr[0] = dM4989k4;
                                }
                                if (dM4989k4 > dArr2[0]) {
                                    dArr2[0] = dM4989k4;
                                }
                            }
                        }
                    }
                }
            } else {
                int iM72789k4 = m72789k4(list);
                int iM69819to2 = C14365qy.m69819to(list);
                z = false;
                int i12 = 0;
                int i13 = 1;
                while (i12 < iM69819to2) {
                    int i14 = i9;
                    int i15 = i14;
                    int i16 = i15;
                    double d4 = d3;
                    double d5 = d4;
                    int i17 = 1;
                    while (i14 < list.size()) {
                        C13847mr c13847mr3 = list.get_Item(i14);
                        if (!ChartTypeCharacterizer.m758dy(c13847mr3.m64945h4().getType())) {
                            break;
                        }
                        double d6 = d3;
                        C0886d8 c0886d82 = c13847mr3.m64944dy().get_Item(i12);
                        if (c0886d82 == null || c0886d82.m4983dy()) {
                            i4 = i12;
                            i5 = i14;
                        } else {
                            ChartSeries chartSeriesM64945h4 = c13847mr3.m64945h4();
                            IErrorBarsFormat errorBarsYFormat = z4 ? chartSeriesM64945h4.getErrorBarsYFormat() : chartSeriesM64945h4.getErrorBarsXFormat();
                            double dM4989k42 = c0886d82.m4989k4();
                            if (i13 != 0) {
                                if (iM72789k4 == 1) {
                                    dArr[i16] = dM4989k42;
                                } else if (iM72789k4 == 2) {
                                    dArr2[i16] = dM4989k42;
                                }
                                z3 = true;
                                i7 = i16;
                                i6 = i7;
                            } else if (i17 != 0) {
                                if (iM72789k4 == 1 && dM4989k42 < dArr[i16]) {
                                    dArr[i16] = dM4989k42;
                                } else if (iM72789k4 == 2 && dM4989k42 > dArr2[i16]) {
                                    dArr2[i16] = dM4989k42;
                                }
                                z3 = z;
                                i7 = i13;
                                i6 = i16;
                            } else {
                                z3 = z;
                                i6 = i17;
                                i7 = i13;
                            }
                            if (dM4989k42 < d6) {
                                d4 += dM4989k42;
                                i8 = 1;
                            } else {
                                i8 = i15;
                            }
                            double d7 = d4;
                            if (dM4989k42 > d6) {
                                d5 += dM4989k42;
                                i16 = 1;
                            }
                            int i18 = i12;
                            i5 = i14;
                            m72808k4(dArr, dArr2, errorBarsYFormat, z4, dM4989k42, c13847mr3, i18);
                            i4 = i18;
                            z = z3;
                            i13 = i7;
                            i17 = i6;
                            d4 = d7;
                            i15 = i8;
                        }
                        i14 = i5 + 1;
                        i12 = i4;
                        d3 = d6;
                    }
                    double d8 = d3;
                    int i19 = i12;
                    if (i15 != 0 && d4 < dArr[i16]) {
                        dArr[i16] = d4;
                    }
                    if (i16 != 0 && d5 > dArr2[i16]) {
                        dArr2[i16] = d5;
                    }
                    i12 = i19 + 1;
                    i9 = i16;
                    d3 = d8;
                }
            }
            i = i9;
            d = d3;
        } else {
            i = 0;
            d = 0.0d;
            if (ChartTypeCharacterizer.m761jd(c13847mr.m64945h4().getType())) {
                if (ChartTypeCharacterizer.m760h4(c13847mr.m64945h4().getType())) {
                    int iM69819to3 = C14365qy.m69819to(list);
                    for (int i20 = 0; i20 < iM69819to3; i20++) {
                        double dM67475k4 = 0.0d;
                        double d9 = 0.0d;
                        double d10 = 0.0d;
                        double d11 = 0.0d;
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            C13847mr c13847mr4 = list.get_Item(i21);
                            if (!ChartTypeCharacterizer.m761jd(c13847mr4.m64945h4().getType())) {
                                break;
                            }
                            C0886d8 c0886d83 = c13847mr4.m64944dy().get_Item(i20);
                            if (c0886d83 != null) {
                                double dM4989k43 = c0886d83.m4989k4();
                                d11 += dM4989k43;
                                dM67475k4 += C14116yg.m67475k4(dM4989k43);
                                if (d11 < d9) {
                                    d9 = d11;
                                }
                                if (d11 > d10) {
                                    d10 = d11;
                                }
                            }
                        }
                        if (dM67475k4 != 0.0d) {
                            double dOooO00o = C22208OooOo0.OooO00o(d9 * 100.0d, dM67475k4, 14);
                            if (dOooO00o < dArr[0]) {
                                dArr[0] = dOooO00o;
                            }
                            double dOooO00o2 = C22208OooOo0.OooO00o(d10 * 100.0d, dM67475k4, 14);
                            if (dOooO00o2 > dArr2[0]) {
                                dArr2[0] = dOooO00o2;
                            }
                        }
                    }
                } else {
                    int iM69819to4 = C14365qy.m69819to(list);
                    for (int i22 = 0; i22 < iM69819to4; i22++) {
                        double d12 = 0.0d;
                        double dM67475k42 = 0.0d;
                        double d13 = 0.0d;
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            C13847mr c13847mr5 = list.get_Item(i23);
                            if (!ChartTypeCharacterizer.m761jd(c13847mr5.m64945h4().getType())) {
                                break;
                            }
                            C0886d8 c0886d84 = c13847mr5.m64944dy().get_Item(i22);
                            if (c0886d84 != null) {
                                double dM4989k44 = c0886d84.m4989k4();
                                dM67475k42 = C14116yg.m67475k4(dM4989k44) + dM67475k42;
                                if (dM4989k44 < 0.0d) {
                                    d12 += dM4989k44;
                                }
                                if (dM4989k44 > 0.0d) {
                                    d13 += dM4989k44;
                                }
                            }
                        }
                        if (dM67475k42 != 0.0d) {
                            double d14 = (d12 * 100.0d) / dM67475k42;
                            if (C7019kk.m27462to(Double.valueOf(d14), 14) < dArr[0]) {
                                dArr[0] = C7019kk.m27462to(Double.valueOf(d14), 14);
                            }
                            double d15 = (d13 * 100.0d) / dM67475k42;
                            if (C7019kk.m27462to(Double.valueOf(d15), 14) > dArr2[0]) {
                                dArr2[0] = C7019kk.m27462to(Double.valueOf(d15), 14);
                            }
                        }
                    }
                }
                z2 = true;
                for (i2 = i; i2 < list.size(); i2++) {
                    List<C0886d8> listM64944dy = list.get_Item(i2).m64944dy();
                    C13847mr c13847mr6 = list.get_Item(i2);
                    ChartSeries chartSeriesM64945h42 = c13847mr6.m64945h4();
                    IErrorBarsFormat errorBarsYFormat2 = z4 ? chartSeriesM64945h42.getErrorBarsYFormat() : chartSeriesM64945h42.getErrorBarsXFormat();
                    if (errorBarsYFormat2 != null && errorBarsYFormat2.isVisible()) {
                        int i24 = i;
                        double d16 = d;
                        double d17 = d16;
                        while (i24 < listM64944dy.size()) {
                            double dM4989k45 = listM64944dy.get_Item(i24) == null ? d : listM64944dy.get_Item(i24).m4989k4();
                            if (i24 == 0) {
                                d16 = dM4989k45;
                                d2 = d16;
                            } else {
                                if (d16 < dM4989k45) {
                                    d16 = dM4989k45;
                                }
                                d2 = d17 > dM4989k45 ? dM4989k45 : d17;
                            }
                            if (errorBarsYFormat2.getValueType() != 4) {
                                i3 = i24;
                                m72808k4(dArr, dArr2, errorBarsYFormat2, z4, dM4989k45, c13847mr6, i3);
                            } else {
                                i3 = i24;
                            }
                            i24 = i3 + 1;
                            d17 = d2;
                        }
                        if (errorBarsYFormat2.getValueType() == 4) {
                            double d18 = (d16 - d17) / 4.0d;
                            c13847mr6.m64947k4(d18);
                            if (!ChartTypeCharacterizer.isChartTypeLine(c13847mr.m64945h4().getType())) {
                                double d19 = dArr2[i];
                                if (d19 + d18 > d19 && (errorBarsYFormat2.getType() == 0 || errorBarsYFormat2.getType() == 2)) {
                                    dArr2[i] = dArr2[i] + d18;
                                }
                                double d20 = dArr[i];
                                if (d20 - d18 < d20) {
                                    if (errorBarsYFormat2.getType() == 0 || errorBarsYFormat2.getType() == 1) {
                                        dArr[i] = dArr[i] - d18;
                                    }
                                }
                            }
                        }
                    }
                }
                return z2;
            }
            z = false;
            boolean z6 = true;
            for (int i25 = 0; i25 < list.size(); i25++) {
                List<C0886d8> listM64944dy2 = list.get_Item(i25).m64944dy();
                for (int i26 = 0; i26 < listM64944dy2.size(); i26++) {
                    if (listM64944dy2.get_Item(i26) == null || !listM64944dy2.get_Item(i26).m4983dy()) {
                        double dM4989k46 = listM64944dy2.get_Item(i26) == null ? 0.0d : listM64944dy2.get_Item(i26).m4989k4();
                        if (z6) {
                            dArr[0] = dM4989k46;
                            dArr2[0] = dM4989k46;
                            z6 = false;
                            z = true;
                        } else {
                            if (dM4989k46 < dArr[0]) {
                                dArr[0] = dM4989k46;
                            }
                            if (dM4989k46 > dArr2[0]) {
                                dArr2[0] = dM4989k46;
                            }
                        }
                    }
                }
            }
        }
        z2 = z;
        while (i2 < list.size()) {
        }
        return z2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72797k4(int i, double d, double d2, double d3, List<Object> list, double d4, double d5, boolean z, boolean z2, boolean z3, C14787xi c14787xi) {
        list.clear();
        Class cls = Double.TYPE;
        if (i == 1) {
            C14046bv c14046bvClone = C7019kk.m27440jd(Double.valueOf(d3), 14).Clone();
            int iM63760to = kc0.m63760to(d);
            while (true) {
                if (!C14046bv.m66460jd(c14046bvClone, C7019kk.m27440jd(Double.valueOf(d2), 14)) && !C14046bv.m66448ck(C14046bv.m66490to(C7019kk.m27440jd(Double.valueOf(d2), 14), c14046bvClone), C7019kk.m27440jd(Double.valueOf(d), 14))) {
                    break;
                }
                double dM67477k4 = C14116yg.m67477k4(C7019kk.m27433c5(c14046bvClone, 15), iM63760to);
                if (!c14787xi.m73384dy().isAutomaticMinValue() && dM67477k4 < c14787xi.m73410ne()) {
                    dM67477k4 = c14787xi.m73410ne();
                }
                list.addItem(Double.valueOf(dM67477k4));
                C14046bv.m66490to(c14046bvClone, C7019kk.m27440jd(Double.valueOf(d), 14)).CloneTo(c14046bvClone);
            }
            if (z2) {
                double dDoubleValue = list.size() > 0 ? ((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue() : 2.147483647E9d;
                if (d5 - dDoubleValue <= d || dDoubleValue == 0.0d) {
                    if ((d5 - d3) / (dDoubleValue - d3) > 0.9523809523809523d && dDoubleValue != 0.0d) {
                        C7019kk.m27440jd(Double.valueOf(C14116yg.m67477k4(dDoubleValue - d, iM63760to)), 14).CloneTo(c14046bvClone);
                        list.addItem(c14046bvClone.Clone());
                    }
                } else if ((d5 - d3) / ((dDoubleValue + d) - d3) <= 0.9523809523809523d) {
                    list.removeAt(list.size() - 1);
                }
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set_Item(i2, Double.valueOf(C14080ne.m66903fa(list.get_Item(i2))));
            }
        } else if (i == 2) {
            int iM63760to2 = kc0.m63760to(d);
            double d6 = d2;
            while (true) {
                if (d6 > d3 && d6 >= d3 + d) {
                    break;
                }
                double dM67477k42 = C14116yg.m67477k4(d6, iM63760to2);
                list.addItem((c14787xi.m73384dy().isAutomaticMaxValue() || dM67477k42 <= c14787xi.m73389ix()) ? Double.valueOf(dM67477k42) : Double.valueOf(c14787xi.m73389ix()));
                d6 = dM67477k42 + d;
            }
            if (z) {
                double dDoubleValue2 = list.size() > 0 ? ((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue() : -2.147483648E9d;
                if (kc0.m63750k4(dDoubleValue2, d4) <= d || dDoubleValue2 == 0.0d) {
                    if ((d4 - d2) / (dDoubleValue2 - d2) > 0.9523809523809523d && dDoubleValue2 != 0.0d) {
                        list.addItem(Double.valueOf(C14116yg.m67477k4(dDoubleValue2 + d, iM63760to2)));
                    }
                } else if ((d4 - d2) / ((dDoubleValue2 - d) - d2) <= 0.9523809523809523d) {
                    list.removeAt(list.size() - 1);
                }
            }
            list.reverse();
        } else {
            int iM63760to3 = kc0.m63760to(d);
            double d7 = 0.0d;
            while (true) {
                if (d7 > d3 && kc0.m63750k4(d7, d3) >= d) {
                    break;
                }
                double dM67477k43 = C14116yg.m67477k4(d7, iM63760to3);
                list.addItem((c14787xi.m73384dy().isAutomaticMaxValue() || dM67477k43 <= c14787xi.m73389ix()) ? Double.valueOf(dM67477k43) : Double.valueOf(c14787xi.m73389ix()));
                d7 = dM67477k43 + d;
            }
            if (z) {
                double dDoubleValue3 = list.size() > 0 ? ((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue() : -2.147483648E9d;
                if (dDoubleValue3 - d4 > d) {
                    if ((d4 - d5) / ((dDoubleValue3 - d) - d5) <= 0.9523809523809523d) {
                        list.removeAt(list.size() - 1);
                    }
                } else if ((d4 - d5) / (dDoubleValue3 - d5) > 0.9523809523809523d) {
                    list.addItem(Double.valueOf(C14116yg.m67477k4(dDoubleValue3 + d, iM63760to3)));
                }
            }
            list.reverse();
            double d8 = 0.0d - d;
            while (true) {
                if (d8 < d2 && kc0.m63750k4(d2, d8) >= d) {
                    break;
                }
                double dM67477k44 = C14116yg.m67477k4(d8, iM63760to3);
                list.addItem((c14787xi.m73384dy().isAutomaticMinValue() || dM67477k44 >= c14787xi.m73410ne()) ? Double.valueOf(dM67477k44) : Double.valueOf(c14787xi.m73410ne()));
                d8 = dM67477k44 - d;
            }
            if (z2) {
                double dDoubleValue4 = list.size() > 0 ? ((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue() : 2.147483647E9d;
                if (d5 - dDoubleValue4 > d) {
                    if ((d5 - d4) / ((dDoubleValue4 + d) - d4) <= 0.9523809523809523d) {
                        list.removeAt(list.size() - 1);
                    }
                } else if ((d5 - d4) / (dDoubleValue4 - d4) > 0.9523809523809523d) {
                    list.addItem(Double.valueOf(C14116yg.m67477k4(dDoubleValue4 - d, iM63760to3)));
                }
            }
        }
        if (list.size() >= 2) {
            if ((z3 || ChartTypeCharacterizer.m763k4(c14787xi.m73423wy().m69834fa())) && ((Double) C7019kk.m27464to(list.get_Item(0), cls)).doubleValue() >= d4 + d && ((Double) C7019kk.m27464to(list.get_Item(0), cls)).doubleValue() != 0.0d && z && list.size() >= 3) {
                list.removeAt(0);
            }
            if ((z3 || ChartTypeCharacterizer.m763k4(c14787xi.m73423wy().m69834fa())) && ((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue() <= kc0.m63750k4(d5, d) && ((Double) C7019kk.m27464to(list.get_Item(list.size() - 1), cls)).doubleValue() != 0.0d && z2 && list.size() >= 3) {
                list.removeAt(list.size() - 1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72798k4(int i, double d, double d2, double d3, List<Object> list, C14787xi c14787xi) {
        list.clear();
        if (i == 1) {
            while (true) {
                if (d3 < d2 && kc0.m63750k4(d2, d3) >= d) {
                    return;
                }
                list.addItem((c14787xi.m73384dy().isAutomaticMinValue() || d3 >= c14787xi.m73405ks()) ? Double.valueOf(d3) : Double.valueOf(c14787xi.m73405ks()));
                d3 -= d;
            }
        } else if (i == 2) {
            while (true) {
                if (d2 > d3 && d2 >= d3 + d) {
                    list.reverse();
                    return;
                } else {
                    list.addItem((c14787xi.m73384dy().isAutomaticMaxValue() || d2 <= c14787xi.m73432yj()) ? Double.valueOf(d2) : Double.valueOf(c14787xi.m73432yj()));
                    d2 += d;
                }
            }
        } else {
            double d4 = 0.0d;
            double d5 = 0.0d;
            while (true) {
                if (d5 > d3 && kc0.m63750k4(d5, d3) >= d) {
                    break;
                }
                list.addItem((c14787xi.m73384dy().isAutomaticMaxValue() || d5 <= c14787xi.m73432yj()) ? Double.valueOf(d5) : Double.valueOf(c14787xi.m73432yj()));
                d5 += d;
            }
            list.reverse();
            while (true) {
                d4 -= d;
                if (d4 < d2 && kc0.m63750k4(d2, d4) >= d) {
                    return;
                } else {
                    list.addItem((c14787xi.m73384dy().isAutomaticMinValue() || d4 >= c14787xi.m73405ks()) ? Double.valueOf(d4) : Double.valueOf(c14787xi.m73405ks()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72799k4(int i, boolean z, C14787xi c14787xi, float f, float f2, C12023wl c12023wl) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14);
        boolean zM73377c5 = c14787xi.m73377c5();
        int iM63753k4 = kc0.m63753k4((float) (((double) C0841c4.m4456k4(c14787xi.m73420uz(), iM27462to, iM27462to2, false)) / c14787xi.m73374ar()));
        if (c14787xi.m73375b3() || c14787xi.m73423wy().m69834fa().hasDataTable()) {
            iM63753k4++;
        } else if (iM63753k4 == 0) {
            iM63753k4 = 1;
        }
        while ((f + 0.0f) * iM63753k4 >= f2) {
            if (zM73377c5 && !z) {
                if (c14787xi.m73386h4() == 0) {
                    c14787xi.m73394k4(45);
                    f = (float) (((double) c12023wl.m56862kk()) / C14116yg.m67495m9((((double) C14116yg.m67482k4(c14787xi.m73386h4())) * 3.141592653589793d) / 180.0d));
                } else if (c14787xi.m73386h4() == 45) {
                    c14787xi.m73394k4(90);
                    f = c12023wl.m56862kk();
                }
            }
            if (zM73377c5 && !z && c14787xi.m73386h4() > 0) {
                f *= 2.0f;
            }
            int iM27462to3 = C7019kk.m27462to(Float.valueOf(f2 / (f + 0.0f)), 13);
            int i2 = iM63753k4 % iM27462to3;
            int i3 = iM63753k4 / iM27462to3;
            if (i2 != 0) {
                i3++;
            }
            if (c14787xi.m73384dy().getBaseUnitScale() != 1) {
                if (c14787xi.m73384dy().getBaseUnitScale() != 2) {
                    double dM73374ar = i3;
                    if (c14787xi.m73374ar() > dM73374ar) {
                        dM73374ar = c14787xi.m73374ar();
                    }
                    c14787xi.m73409m9(dM73374ar);
                    c14787xi.m73415to(3);
                    return;
                }
                if (i3 < 12) {
                    if (c14787xi.m73420uz() != 2) {
                        c14787xi.m73409m9(c14787xi.m73374ar());
                        c14787xi.m73415to(3);
                        return;
                    }
                    double d = i3;
                    if (c14787xi.m73374ar() <= d) {
                        c14787xi.m73409m9(d);
                        c14787xi.m73415to(2);
                        return;
                    } else {
                        c14787xi.m73409m9(c14787xi.m73374ar());
                        c14787xi.m73415to(2);
                        return;
                    }
                }
                int i4 = i3 % 12;
                int i5 = i3 / 12;
                if (i4 != 0) {
                    i5++;
                }
                if (c14787xi.m73420uz() == 2) {
                    c14787xi.m73409m9(i5);
                    c14787xi.m73415to(3);
                    return;
                }
                double d2 = i5;
                if (c14787xi.m73374ar() <= d2) {
                    c14787xi.m73409m9(d2);
                    c14787xi.m73415to(3);
                    return;
                } else {
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    c14787xi.m73415to(3);
                    return;
                }
            }
            if (i3 <= 2) {
                if (c14787xi.m73420uz() > c14787xi.m73384dy().getBaseUnitScale()) {
                    c14787xi.m73415to(c14787xi.m73420uz());
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
                c14787xi.m73409m9(i3);
                if (c14787xi.m73418um() < c14787xi.m73374ar()) {
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                return;
            }
            if (i3 > 2 && i3 <= 7) {
                if (c14787xi.m73420uz() > c14787xi.m73384dy().getBaseUnitScale()) {
                    c14787xi.m73415to(c14787xi.m73420uz());
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
                c14787xi.m73409m9(7.0d);
                if (c14787xi.m73418um() < c14787xi.m73374ar()) {
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                return;
            }
            if (i3 > 7 && i3 <= 14) {
                if (c14787xi.m73420uz() > c14787xi.m73384dy().getBaseUnitScale()) {
                    c14787xi.m73415to(c14787xi.m73420uz());
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
                c14787xi.m73409m9(14.0d);
                if (c14787xi.m73418um() < c14787xi.m73374ar()) {
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                return;
            }
            if (i3 > 14 && i3 <= 30) {
                if (c14787xi.m73420uz() == 3) {
                    c14787xi.m73415to(c14787xi.m73420uz());
                    c14787xi.m73409m9(c14787xi.m73374ar());
                    return;
                }
                c14787xi.m73415to(2);
                c14787xi.m73409m9(1.0d);
                if (c14787xi.m73418um() >= c14787xi.m73374ar() || c14787xi.m73420uz() != 2) {
                    return;
                }
                c14787xi.m73409m9(c14787xi.m73374ar());
                return;
            }
            if (i3 <= 30 || i3 > 360) {
                int i6 = i3 % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                int i7 = i3 / StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                if (i6 != 0) {
                    i7++;
                }
                c14787xi.m73409m9(i7);
                c14787xi.m73415to(3);
                if (c14787xi.m73418um() >= c14787xi.m73374ar() || c14787xi.m73420uz() != 3) {
                    return;
                }
                c14787xi.m73409m9(c14787xi.m73374ar());
                return;
            }
            if (c14787xi.m73420uz() == 3) {
                c14787xi.m73415to(c14787xi.m73420uz());
                c14787xi.m73409m9(c14787xi.m73374ar());
                return;
            }
            c14787xi.m73415to(2);
            int i8 = i3 % 30;
            int i9 = i3 / 30;
            if (i8 != 0) {
                i9++;
            }
            c14787xi.m73409m9(i9);
            if (c14787xi.m73418um() >= c14787xi.m73374ar() || c14787xi.m73420uz() != 2) {
                return;
            }
            c14787xi.m73409m9(c14787xi.m73374ar());
            return;
        }
        c14787xi.m73415to(c14787xi.m73420uz());
        c14787xi.m73409m9(c14787xi.m73374ar());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72800k4(List<Object> list, C12014ne c12014ne, int i, List<C13847mr> list2, boolean z, C14787xi c14787xi) {
        C14787xi c14787xi2 = c14787xi;
        list.clear();
        C14365qy c14365qyM73423wy = c14787xi2.m73423wy();
        int iM69819to = C14365qy.m69819to(list2);
        double d = 1.0d;
        int i2 = 1;
        int i3 = 0;
        if (ChartTypeCharacterizer.isChartTypeScatter(i) || ChartTypeCharacterizer.isChartTypeBubble(i)) {
            double[] dArr = new double[1];
            dArr[0] = 0.0d;
            double[] dArr2 = new double[1];
            dArr2[0] = 0.0d;
            m72814kk(list2, dArr, dArr2, c14787xi2);
            double d2 = dArr[0];
            double d3 = dArr2[0];
            if (ChartTypeCharacterizer.isChartTypeBubble(i) && d2 == 0.0d && d3 == 0.0d) {
                c14787xi2.m73409m9(1.0d);
            }
            int i4 = 0;
            while (i4 < list2.size()) {
                C13847mr c13847mr = list2.get_Item(i4);
                double d4 = d;
                List list3 = new List();
                list3.addItem(c13847mr);
                double[] dArr3 = new double[i2];
                dArr3[i3] = 0.0d;
                int i5 = i3;
                double[] dArr4 = new double[i2];
                dArr4[i5] = 0.0d;
                m72814kk(list3, dArr3, dArr4, c14787xi2);
                double d5 = dArr3[i5];
                double d6 = dArr4[i5];
                if (d5 == 0.0d && d6 == 0.0d) {
                    List<C0886d8> listM64944dy = c13847mr.m64944dy();
                    int i6 = i5;
                    while (i6 < listM64944dy.size()) {
                        int i7 = i2;
                        listM64944dy.get_Item(i6).m5016x1(((double) i6) + d4);
                        i6 += i7;
                        i2 = i7;
                    }
                }
                int i8 = i2;
                i4 += i8;
                c14787xi2 = c14787xi;
                i2 = i8;
                d = d4;
                i3 = i5;
            }
            int i9 = i3;
            dArr[i9] = d2;
            dArr2[i9] = d3;
            m72814kk(list2, dArr, dArr2, c14787xi);
            m72792k4(dArr2[i9], dArr[i9], list, i, c12014ne.Clone(), true, list2.get_Item(i9), c14787xi);
            return;
        }
        m72805k4(c14787xi2);
        if (c14787xi2.m73384dy() != null && c14787xi2.m73384dy().getCategoryAxisType() == 1) {
            m72802k4(c12014ne.Clone(), i, list2, z, c14787xi2);
            return;
        }
        List<C1210hn> listM69871x1 = c14787xi2.m73419up() == 0 ? c14365qyM73423wy.m69871x1() : c14365qyM73423wy.m69848kk();
        if (listM69871x1.size() > 0) {
            boolean zM72815kk = m72815kk(listM69871x1);
            for (int i10 = 0; i10 < listM69871x1.size() && i10 < iM69819to; i10++) {
                C1210hn c1210hn = listM69871x1.get_Item(i10);
                list.addItem((c1210hn.m7235kk() && zM72815kk) ? C14337qc.m69515k4(kc0.m63754k4(C14080ne.m66903fa(c1210hn.m7238x1()), false).Clone().Clone(), c1210hn.m7228h4(), c1210hn.m7227du()) : c1210hn.m7238x1());
            }
            for (int i11 = 0; i11 < list2.size(); i11++) {
                C13847mr c13847mr2 = list2.get_Item(i11);
                if (!ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr2.m64945h4().getType())) {
                    for (int i12 = 0; i12 < c13847mr2.m64944dy().size(); i12++) {
                        c13847mr2.m64944dy().get_Item(i12).m5016x1(((double) i12) + 1.0d);
                    }
                }
            }
        } else if (i == 26) {
            for (int i13 = 1; i13 <= list2.get_Item(0).m64944dy().size(); i13++) {
                list.addItem(Integer.valueOf(i13));
                listM69871x1.addItem(new C1210hn(null, Integer.valueOf(i13)));
            }
        } else {
            for (int i14 = 1; i14 <= iM69819to; i14++) {
                list.addItem(Integer.valueOf(i14));
                listM69871x1.addItem(new C1210hn(null, Integer.valueOf(i14)));
            }
            for (int i15 = 0; i15 < list2.size(); i15++) {
                C13847mr c13847mr3 = list2.get_Item(i15);
                for (int i16 = 0; i16 < c13847mr3.m64944dy().size(); i16++) {
                    c13847mr3.m64944dy().get_Item(i16).m5016x1(((double) i16) + 1.0d);
                }
            }
        }
        if (c14787xi2.m73375b3() || c14787xi2.m73423wy().m69834fa().hasDataTable()) {
            c14787xi2.m73414to(0.5d);
            c14787xi2.m73381du(((double) iM69819to) + 0.5d);
        } else {
            c14787xi2.m73414to(1.0d);
            c14787xi2.m73381du(iM69819to);
        }
        c14787xi2.m73409m9(1.0d);
        c14787xi2.m73387h4(c14787xi2.m73418um() / 2.0d);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72801k4(List<C13847mr> list, double[] dArr, double[] dArr2, C14787xi c14787xi) {
        List<List<C13847mr>> listM72818x1 = m72818x1(list);
        dArr[0] = 0.0d;
        dArr2[0] = 0.0d;
        if (c14787xi.m73384dy() == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < listM72818x1.size(); i2++) {
            double[] dArr3 = {0.0d};
            double[] dArr4 = {0.0d};
            boolean zM72824x1 = m72824x1(listM72818x1.get_Item(i2), dArr3, dArr4, c14787xi);
            double d = dArr3[0];
            double d2 = dArr4[0];
            if (i2 == i && !zM72824x1) {
                i++;
            } else if (i2 == i) {
                dArr[0] = d;
                dArr2[0] = d2;
            } else {
                if (d < dArr[0]) {
                    dArr[0] = d;
                }
                if (d2 > dArr2[0]) {
                    dArr2[0] = d2;
                }
            }
        }
        if (i != listM72818x1.size() || c14787xi.m73384dy().isAutomaticMinValue() == c14787xi.m73384dy().isAutomaticMaxValue()) {
            if (!c14787xi.m73384dy().isAutomaticMinValue()) {
                dArr[0] = c14787xi.m73405ks();
            }
            if (c14787xi.m73384dy().isAutomaticMaxValue()) {
                return;
            }
            dArr2[0] = c14787xi.m73432yj();
            return;
        }
        dArr[0] = 0.0d;
        dArr2[0] = 1.0d;
        if (!c14787xi.m73384dy().isAutomaticMinValue()) {
            c14787xi.m73414to(0.0d);
        }
        if (c14787xi.m73384dy().isAutomaticMaxValue()) {
            return;
        }
        c14787xi.m73381du(1.0d);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72802k4(C12014ne c12014ne, int i, List<C13847mr> list, boolean z, C14787xi c14787xi) {
        List<Object> list2 = c14787xi.f50098m9;
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        List<C1210hn> listM69871x1 = c14787xi.m73419up() == 0 ? c14365qyM73423wy.m69871x1() : c14365qyM73423wy.m69848kk();
        int iM69819to = C14365qy.m69819to(list);
        boolean z2 = listM69871x1.size() == 0;
        List list3 = new List();
        if (listM69871x1.size() > 0) {
            while (listM69871x1.size() > iM69819to) {
                listM69871x1.removeAt(listM69871x1.size() - 1);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= listM69871x1.size()) {
                    break;
                }
                C1210hn c1210hn = listM69871x1.get_Item(i2);
                if (c1210hn.m7238x1() == null || !C14113y2.m67363du(c1210hn.m7238x1().toString(), "#N/A")) {
                    int iM72790k4 = m72790k4(c1210hn.m7238x1(), false);
                    if (iM72790k4 < 0) {
                        if (!c1210hn.m7237to()) {
                            list3.clear();
                            listM69871x1.clear();
                            z2 = true;
                            break;
                        }
                    } else {
                        list3.addItem(Integer.valueOf(iM72790k4));
                    }
                } else {
                    listM69871x1.removeAt(i2);
                    i2--;
                }
                i2++;
            }
        }
        if (z2) {
            String str = (c14787xi.m73384dy().getBaseUnitScale() == 1 || c14787xi.m73384dy().getBaseUnitScale() == 0) ? "M/d/yyyy" : c14787xi.m73384dy().getBaseUnitScale() == 2 ? "MMM-yy" : "yyyy";
            for (int i3 = 1; i3 <= iM69819to; i3++) {
                C1210hn c1210hn2 = new C1210hn(null, Integer.valueOf(i3));
                c1210hn2.m7239x1(false);
                c1210hn2.m7233k4(str);
                listM69871x1.addItem(c1210hn2);
                list3.addItem(Integer.valueOf(i3));
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            C13847mr c13847mr = list.get_Item(i4);
            int iM67507x1 = C14116yg.m67507x1(listM69871x1.size(), c13847mr.m64944dy().size());
            for (int i5 = 0; i5 < iM67507x1; i5++) {
                C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i5);
                if (c0886d8 != null) {
                    c0886d8.m5016x1(m72790k4(listM69871x1.get_Item(i5).m7238x1(), false));
                }
            }
        }
        new List(list3).sort();
        if (c14787xi.m73384dy().isAutomaticMaxValue()) {
            c14787xi.m73381du(C0841c4.m4457k4(c14787xi.m73384dy().getBaseUnitScale(), ((Integer) OooO0O0.OooO00o(r2, 1)).intValue(), false));
        }
        if (c14787xi.m73384dy().isAutomaticMinValue()) {
            c14787xi.m73414to(C0841c4.m4457k4(c14787xi.m73384dy().getBaseUnitScale(), ((Integer) r2.get_Item(0)).intValue(), false));
        }
        m72803k4(c12014ne.Clone(), z, z2, c14787xi);
        if (c14787xi.m73384dy().isAutomaticMajorUnit() && c14787xi.m73384dy().isAutomaticMinorUnit() && c14787xi.m73384dy().getBaseUnitScale() != 1) {
            c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
            c14787xi.m73382du(1);
            c14787xi.m73409m9(1.0d);
            c14787xi.m73387h4(1.0d);
            c14787xi.m73404kk(true);
            c14787xi.m73416to(true);
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xi.m73410ne()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xi.m73389ix()), 14);
        list2.clear();
        do {
            list2.addItem(Integer.valueOf(iM27462to));
            iM27462to = C0841c4.m4487x1(c14787xi.m73384dy().getBaseUnitScale(), c14787xi.m73417u4(), C7019kk.m27462to(Double.valueOf(c14787xi.m73418um()), 14), iM27462to, false);
        } while (iM27462to2 - iM27462to >= 0);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m72825x1(C14743wm c14743wm) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[PHI: r14
      0x00fe: PHI (r14v10 double) = (r14v7 double), (r14v8 double), (r14v7 double), (r14v12 double) binds: [B:47:0x011c, B:51:0x0127, B:43:0x0108, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m72803k4(C12014ne c12014ne, boolean z, boolean z2, C14787xi c14787xi) {
        int iM56862kk;
        float fM56862kk;
        float fM56862kk2;
        float fM56683x1;
        double d;
        int iM73407m9;
        String strM4468k4 = C0841c4.m4468k4(Double.valueOf(c14787xi.m73389ix()), c14787xi);
        C12015qq c12015qq = new C12015qq(c12014ne.m56663c5(), c12014ne.m56683x1());
        boolean zM73377c5 = c14787xi.m73377c5();
        C12023wl c12023wlClone = C0840c3.m4446kk(strM4468k4, 0, c14787xi.m73400kk(), c12015qq.Clone(), 1, 1).Clone();
        C12023wl c12023wlClone2 = C0840c3.m4442k4("0", c14787xi.m73400kk()).Clone();
        double d2 = 180.0d;
        if (z) {
            fM56683x1 = c12014ne.m56683x1();
            fM56862kk2 = c12023wlClone.m56862kk();
        } else {
            float fM56663c5 = c12014ne.m56663c5();
            if (zM73377c5) {
                fM56862kk = c12023wlClone2.m56865x1() + c12023wlClone.m56865x1();
            } else {
                if (c14787xi.m73386h4() == 0) {
                    iM56862kk = c12023wlClone.m56865x1();
                } else if (c14787xi.m73386h4() == 90 || c14787xi.m73386h4() == -90) {
                    iM56862kk = c12023wlClone.m56862kk();
                } else {
                    fM56862kk = (float) (((double) c12023wlClone.m56862kk()) / C14116yg.m67495m9((((double) C14116yg.m67482k4(c14787xi.m73386h4())) * 3.141592653589793d) / 180.0d));
                }
                fM56862kk = iM56862kk;
            }
            fM56862kk2 = fM56862kk;
            fM56683x1 = fM56663c5;
        }
        int baseUnitScale = c14787xi.m73384dy().getBaseUnitScale();
        int iM73373ak = c14787xi.m73373ak();
        if (!c14787xi.m73422wl() || !c14787xi.m73411qq()) {
            if (c14787xi.m73422wl() && !c14787xi.m73411qq()) {
                m72799k4(iM73373ak, z2, c14787xi, fM56862kk2, fM56683x1, c12023wlClone.Clone());
                return;
            }
            float f = fM56683x1;
            float f2 = fM56862kk2;
            if (c14787xi.m73422wl() || !c14787xi.m73411qq()) {
                m72813kk(iM73373ak, z2, c14787xi, f2, f, c12023wlClone.Clone());
                return;
            } else {
                m72820x1(iM73373ak, z2, c14787xi, f2, f, c12023wlClone.Clone());
                return;
            }
        }
        if (!zM73377c5 || z2) {
            m72806k4(c14787xi, iM73373ak, fM56862kk2, fM56683x1);
            return;
        }
        c14787xi.m73415to(1);
        c14787xi.m73382du(1);
        c14787xi.m73409m9(1.0d);
        c14787xi.m73387h4(1.0d);
        while ((0.0f + fM56862kk2) * iM73373ak > fM56683x1) {
            int iM73386h4 = c14787xi.m73386h4();
            if (iM73386h4 == 0) {
                d = d2;
                c14787xi.m73394k4(45);
                fM56862kk2 = (float) (((double) c12023wlClone.m56862kk()) / C14116yg.m67495m9((((double) C14116yg.m67482k4(c14787xi.m73386h4())) * 3.141592653589793d) / d));
            } else if (iM73386h4 == 45) {
                d = d2;
                c14787xi.m73394k4(90);
                fM56862kk2 = c12023wlClone.m56862kk() * 2.0f;
            } else if (iM73386h4 != 90) {
                d = d2;
            } else {
                double dM73418um = 2.0d;
                if (baseUnitScale != 1) {
                    if (baseUnitScale != 2) {
                        if (baseUnitScale == 3) {
                            dM73418um = c14787xi.m73418um() + 1.0d;
                            c14787xi.m73409m9(dM73418um);
                        }
                        c14787xi.m73394k4(0);
                        float fM56865x1 = c12023wlClone.m56865x1();
                        iM73407m9 = c14787xi.m73407m9(baseUnitScale);
                        if (iM73407m9 == 0) {
                            iM73407m9 = 1;
                        }
                        d = d2;
                        int iOooO00o = C22208OooOo0.OooO00o(iM73407m9, c14787xi.m73418um(), 14);
                        fM56862kk2 = fM56865x1;
                        iM73373ak = iOooO00o;
                    } else {
                        if (c14787xi.m73418um() == 1.0d) {
                            c14787xi.m73409m9(dM73418um);
                        } else {
                            c14787xi.m73409m9(1.0d);
                            c14787xi.m73415to(3);
                            c14787xi.m73382du(3);
                            baseUnitScale = 3;
                        }
                        c14787xi.m73394k4(0);
                        float fM56865x12 = c12023wlClone.m56865x1();
                        iM73407m9 = c14787xi.m73407m9(baseUnitScale);
                        if (iM73407m9 == 0) {
                        }
                        d = d2;
                        int iOooO00o2 = C22208OooOo0.OooO00o(iM73407m9, c14787xi.m73418um(), 14);
                        fM56862kk2 = fM56865x12;
                        iM73373ak = iOooO00o2;
                    }
                } else if (c14787xi.m73418um() != 1.0d) {
                    if (c14787xi.m73418um() == 2.0d) {
                        dM73418um = 7.0d;
                        c14787xi.m73409m9(dM73418um);
                        c14787xi.m73394k4(0);
                        float fM56865x122 = c12023wlClone.m56865x1();
                        iM73407m9 = c14787xi.m73407m9(baseUnitScale);
                        if (iM73407m9 == 0) {
                        }
                        d = d2;
                        int iOooO00o22 = C22208OooOo0.OooO00o(iM73407m9, c14787xi.m73418um(), 14);
                        fM56862kk2 = fM56865x122;
                        iM73373ak = iOooO00o22;
                    } else {
                        c14787xi.m73409m9(1.0d);
                        c14787xi.m73415to(2);
                        c14787xi.m73382du(2);
                        baseUnitScale = 2;
                        c14787xi.m73394k4(0);
                        float fM56865x1222 = c12023wlClone.m56865x1();
                        iM73407m9 = c14787xi.m73407m9(baseUnitScale);
                        if (iM73407m9 == 0) {
                        }
                        d = d2;
                        int iOooO00o222 = C22208OooOo0.OooO00o(iM73407m9, c14787xi.m73418um(), 14);
                        fM56862kk2 = fM56865x1222;
                        iM73373ak = iOooO00o222;
                    }
                }
            }
            d2 = d;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72804k4(C14365qy c14365qy, C12014ne[] c12014neArr) {
        int iM27462to = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13);
        IChartPlotArea plotArea = c14365qy.m69834fa().getPlotArea();
        float f = iM27462to;
        c12014neArr[0].m56676kk(C7019kk.m27462to(Float.valueOf(plotArea.getX() * f), 13) + C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13));
        float f2 = iM27462to2;
        c12014neArr[0].m56682to(C7019kk.m27462to(Float.valueOf(plotArea.getY() * f2), 13) + C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13));
        c12014neArr[0].m56684x1(C7019kk.m27462to(Float.valueOf(plotArea.getWidth() * f), 13));
        c12014neArr[0].m56671k4(C7019kk.m27462to(Float.valueOf(plotArea.getHeight() * f2), 13));
        if (c12014neArr[0].m56664ck() < c14365qy.m69823b3()) {
            C12014ne c12014ne = c12014neArr[0];
            c12014ne.m56671k4(c12014ne.m56683x1() + ((int) (c14365qy.m69823b3() - c12014neArr[0].m56664ck())));
            c12014neArr[0].m56682to(C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13));
        }
        if (c12014neArr[0].m56669jd() < c14365qy.m69878yd()) {
            C12014ne c12014ne2 = c12014neArr[0];
            c12014ne2.m56684x1(c12014ne2.m56663c5() + ((int) (c14365qy.m69878yd() - c12014neArr[0].m56669jd())));
            c12014neArr[0].m56676kk(C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13));
        }
        if (c12014neArr[0].m56669jd() + c12014neArr[0].m56663c5() > c14365qy.m69878yd() + f) {
            c12014neArr[0].m56676kk((C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13) + iM27462to) - c12014neArr[0].m56663c5());
            c14365qy.m69874x1(true);
        }
        if (c12014neArr[0].m56664ck() + c12014neArr[0].m56683x1() > c14365qy.m69823b3() + f2) {
            c12014neArr[0].m56682to((C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13) + iM27462to2) - c12014neArr[0].m56683x1());
            c14365qy.m69874x1(true);
        }
        if (c12014neArr[0].m56668h4() > c14365qy.m69878yd() + c14365qy.m69867v4()) {
            c12014neArr[0].m56684x1((C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) + C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13)) - c12014neArr[0].m56669jd());
        }
        if (c12014neArr[0].m56670k4() > c14365qy.m69823b3() + c14365qy.m69852lr()) {
            c12014neArr[0].m56671k4((C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) + C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13)) - c12014neArr[0].m56664ck());
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14743wm c14743wm) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72805k4(C14787xi c14787xi) {
        if (c14787xi.m73384dy() == null || c14787xi.m73384dy().getCategoryAxisType() == 1) {
            return;
        }
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        List<C1210hn> listM69871x1 = c14787xi.m73419up() == 0 ? c14365qyM73423wy.m69871x1() : c14365qyM73423wy.m69848kk();
        if (listM69871x1.size() > 0) {
            boolean z = false;
            C1210hn c1210hn = listM69871x1.get_Item(0);
            if (c1210hn.m7235kk() && m72812k4(c1210hn.m7228h4())) {
                int i = 0;
                while (true) {
                    if (i >= listM69871x1.size()) {
                        z = true;
                        break;
                    }
                    C1210hn c1210hn2 = listM69871x1.get_Item(i);
                    if (!c1210hn2.m7237to()) {
                        boolean z2 = c1210hn2.m7238x1() == null;
                        if (c1210hn2.m7238x1().equals("")) {
                            z2 = true;
                        }
                        if (z2) {
                            break;
                        }
                        if (!(C7019kk.m27469x1(c1210hn2.m7238x1(), Double.class) || C7019kk.m27469x1(c1210hn2.m7238x1(), Integer.class) || C7019kk.m27469x1(c1210hn2.m7238x1(), Boolean.class) || C7019kk.m27469x1(c1210hn2.m7238x1(), C14084qq.class))) {
                            break;
                        }
                    }
                    i++;
                }
                if (z) {
                    c14787xi.m73384dy().setCategoryAxisType(1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72806k4(C14787xi c14787xi, int i, float f, float f2) {
        float f3 = f + 0.0f;
        if (i * f3 < f2) {
            c14787xi.m73409m9(1.0d);
            c14787xi.m73387h4(1.0d);
            c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
            c14787xi.m73382du(c14787xi.m73384dy().getBaseUnitScale());
            return;
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf(f2 / f3), 13);
        int i2 = i % iM27462to;
        int i3 = i / iM27462to;
        if (i2 != 0) {
            i3++;
        }
        if (c14787xi.m73384dy().getBaseUnitScale() != 1) {
            if (c14787xi.m73384dy().getBaseUnitScale() != 2) {
                c14787xi.m73409m9(i3);
                c14787xi.m73387h4(C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) : 1.0d);
                c14787xi.m73415to(3);
                c14787xi.m73382du(3);
                return;
            }
            if (i3 < 12) {
                c14787xi.m73409m9(i3);
                c14787xi.m73387h4(C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) : 1.0d);
                c14787xi.m73415to(2);
                c14787xi.m73382du(2);
                return;
            }
            int i4 = i3 % 12;
            int i5 = i3 / 12;
            if (i4 != 0) {
                i5++;
            }
            c14787xi.m73409m9(i5);
            c14787xi.m73387h4(C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) : 1.0d);
            c14787xi.m73415to(3);
            c14787xi.m73382du(3);
            return;
        }
        if (i3 <= 2) {
            c14787xi.m73409m9(i3);
            c14787xi.m73387h4(1.0d);
            c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
            c14787xi.m73382du(c14787xi.m73384dy().getBaseUnitScale());
            return;
        }
        if (i3 > 2 && i3 <= 7) {
            c14787xi.m73409m9(7.0d);
            c14787xi.m73387h4(1.0d);
            c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
            c14787xi.m73382du(c14787xi.m73384dy().getBaseUnitScale());
            return;
        }
        if (i3 > 7 && i3 <= 14) {
            c14787xi.m73409m9(14.0d);
            c14787xi.m73387h4(7.0d);
            c14787xi.m73415to(c14787xi.m73384dy().getBaseUnitScale());
            c14787xi.m73382du(c14787xi.m73384dy().getBaseUnitScale());
            return;
        }
        if (i3 > 14 && i3 <= 30) {
            c14787xi.m73409m9(1.0d);
            c14787xi.m73387h4(1.0d);
            c14787xi.m73415to(2);
            c14787xi.m73382du(2);
            return;
        }
        if (i3 > 30 && i3 <= 360) {
            int i6 = i3 % 30;
            int i7 = i3 / 30;
            if (i6 != 0) {
                i7++;
            }
            c14787xi.m73409m9(i7);
            c14787xi.m73387h4(C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) : 1.0d);
            c14787xi.m73415to(2);
            c14787xi.m73382du(2);
            return;
        }
        int i8 = i3 % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        int i9 = i3 / StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        if (i8 != 0) {
            i9++;
        }
        c14787xi.m73409m9(i9);
        c14787xi.m73387h4(C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(c14787xi.m73418um(), 2.0d, 14) : 1.0d);
        c14787xi.m73415to(3);
        c14787xi.m73382du(3);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72807k4(double[] dArr) {
        int iM66582k4;
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        double d = dArr[0];
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        dArr[0] = dM67475k4;
        if (dM67475k4 > 1.0d) {
            iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(C14044b3.m66425h4(dM67475k4).charAt(0)));
        } else {
            if (dM67475k4 == 0.0d) {
                dArr[0] = 0.0d;
                return;
            }
            iM66582k4 = 1;
        }
        double d2 = dArr[0];
        if (d2 < 1.0d) {
            String strM66425h4 = C14044b3.m66425h4(d2);
            int i = 0;
            while (true) {
                if (i < strM66425h4.length()) {
                    if (strM66425h4.charAt(i) != '0' && strM66425h4.charAt(i) != cM67042x1) {
                        iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(strM66425h4.charAt(i)));
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (iM66582k4 == 1 || iM66582k4 == 5) {
            dArr[0] = dArr[0] * 2.0d;
        } else {
            dArr[0] = (dArr[0] * 5.0d) / 2.0d;
        }
        if (z) {
            return;
        }
        dArr[0] = -dArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72808k4(double[] dArr, double[] dArr2, IErrorBarsFormat iErrorBarsFormat, boolean z, double d, C13847mr c13847mr, int i) {
        double dM1356x1;
        double dM1356x12;
        IDoubleChartValue xPlus;
        IDoubleChartValue xMinus;
        if (iErrorBarsFormat == null || !iErrorBarsFormat.isVisible()) {
            return;
        }
        int valueType = iErrorBarsFormat.getValueType();
        if (valueType != 0) {
            dM1356x12 = valueType != 1 ? valueType != 2 ? 0.0d : (((double) iErrorBarsFormat.getValue()) * d) / 100.0d : iErrorBarsFormat.getValue();
            dM1356x1 = dM1356x12;
        } else {
            try {
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
            if (z) {
                if (c13847mr.m64944dy().size() > i) {
                    xMinus = c13847mr.m64944dy().get_Item(i).m4988jd().getErrorBarsCustomValues().getYMinus();
                    dM1356x1 = DoubleChartValue.m1356x1(xMinus);
                }
                dM1356x1 = 0.0d;
            } else {
                if (c13847mr.m64944dy().size() > i) {
                    xMinus = c13847mr.m64944dy().get_Item(i).m4988jd().getErrorBarsCustomValues().getXMinus();
                    dM1356x1 = DoubleChartValue.m1356x1(xMinus);
                }
                dM1356x1 = 0.0d;
            }
            try {
                if (z) {
                    if (c13847mr.m64944dy().size() > i) {
                        xPlus = c13847mr.m64944dy().get_Item(i).m4988jd().getErrorBarsCustomValues().getYPlus();
                        dM1356x12 = DoubleChartValue.m1356x1(xPlus);
                    }
                    dM1356x12 = 0.0d;
                } else {
                    if (c13847mr.m64944dy().size() > i) {
                        xPlus = c13847mr.m64944dy().get_Item(i).m4988jd().getErrorBarsCustomValues().getXPlus();
                        dM1356x12 = DoubleChartValue.m1356x1(xPlus);
                    }
                    dM1356x12 = 0.0d;
                }
            } catch (RuntimeException e2) {
                C3085sv.m13082k4(e2);
                dM1356x12 = dM1356x1;
            }
        }
        if (dM1356x12 > 0.0d) {
            double d2 = dM1356x12 + d;
            if (d2 >= dArr2[0] && (iErrorBarsFormat.getType() == 0 || iErrorBarsFormat.getType() == 2)) {
                dArr2[0] = d2;
            }
        }
        if (dM1356x12 < 0.0d) {
            double d3 = d + dM1356x12;
            if (d3 <= dArr[0] && (iErrorBarsFormat.getType() == 0 || iErrorBarsFormat.getType() == 2)) {
                dArr[0] = d3;
            }
        }
        if (dM1356x1 > 0.0d) {
            double d4 = d - dM1356x1;
            if (d4 <= dArr[0] && (iErrorBarsFormat.getType() == 0 || iErrorBarsFormat.getType() == 1)) {
                dArr[0] = d4;
            }
        }
        if (dM1356x1 < 0.0d) {
            double d5 = (-dM1356x1) + d;
            if (d5 >= dArr2[0]) {
                if (iErrorBarsFormat.getType() == 0 || iErrorBarsFormat.getType() == 1) {
                    dArr2[0] = d5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72809k4(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int[] iArr, C14787xi c14787xi) {
        boolean zIsAutomaticMinValue = c14787xi.m73384dy().isAutomaticMinValue();
        boolean zIsAutomaticMaxValue = c14787xi.m73384dy().isAutomaticMaxValue();
        dArr5[0] = c14787xi.m73418um();
        dArr2[0] = dArr3[0];
        dArr[0] = dArr4[0];
        double d = dArr4[0];
        double d2 = dArr3[0];
        if (d != d2 && d > 0.0d && d2 > 0.0d) {
            double d3 = d - d2;
            double[] dArr6 = {0.0d};
            double[] dArr7 = {0.0d};
            m72796k4(d3, dArr6, dArr7, c14787xi);
            double d4 = dArr6[0];
            double d5 = dArr7[0];
            double d6 = dArr3[0];
            if (d6 / d3 >= 5.0d) {
                dArr2[0] = d6;
                dArr[0] = dArr3[0] + d5;
                double dM67475k4 = C14116yg.m67475k4(d4);
                int iM63760to = kc0.m63760to(dM67475k4);
                double dM67477k4 = 0.0d;
                while (dM67477k4 < dArr2[0]) {
                    dM67477k4 = C14116yg.m67477k4(dM67477k4, iM63760to) + dM67475k4;
                }
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    int iM63760to2 = kc0.m63760to(dArr5[0]);
                    double dM67477k42 = 0.0d;
                    while (dM67477k42 <= dM67477k4) {
                        dM67477k42 = C14116yg.m67477k4(dM67477k42, iM63760to2) + dArr5[0];
                    }
                    c14787xi.m73414to(dM67477k4 - dArr5[0]);
                    dArr3[0] = c14787xi.m73410ne();
                    dArr2[0] = c14787xi.m73410ne();
                    zIsAutomaticMinValue = false;
                }
            } else {
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    c14787xi.m73414to(0.0d);
                    dArr3[0] = c14787xi.m73410ne();
                    zIsAutomaticMinValue = false;
                }
                dArr2[0] = 0.0d;
            }
        } else if (d != d2 && d < 0.0d && d2 < 0.0d) {
            double d7 = d2 - d;
            double[] dArr8 = {0.0d};
            double[] dArr9 = {0.0d};
            m72796k4(d7, dArr8, dArr9, c14787xi);
            double d8 = dArr8[0];
            double d9 = dArr9[0];
            if (dArr3[0] / d7 >= 5.0d) {
                dArr[0] = dArr4[0] - (d9 / 2.0d);
                dArr2[0] = dArr4[0] + d9;
                double dM67475k42 = C14116yg.m67475k4(d8);
                int iM63760to3 = kc0.m63760to(dM67475k42);
                double dM67477k43 = 0.0d;
                while (dM67477k43 > dArr[0]) {
                    dM67477k43 = C14116yg.m67477k4(dM67477k43, iM63760to3) - dM67475k42;
                }
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    int iM63760to4 = kc0.m63760to(dArr5[0]);
                    double dM67477k44 = 0.0d;
                    while (dM67477k44 >= dM67477k43) {
                        dM67477k44 = C14116yg.m67477k4(dM67477k44, iM63760to4) - dArr5[0];
                    }
                    c14787xi.m73381du(dM67477k44 + dArr5[0]);
                    dArr4[0] = c14787xi.m73389ix();
                    dArr[0] = c14787xi.m73389ix();
                    zIsAutomaticMaxValue = false;
                }
            } else {
                if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
                    c14787xi.m73381du(0.0d);
                    dArr4[0] = c14787xi.m73389ix();
                    zIsAutomaticMaxValue = false;
                }
                dArr[0] = 0.0d;
            }
        }
        if (zIsAutomaticMinValue && zIsAutomaticMaxValue) {
            iArr[0] = 3;
            if (dArr3[0] == 0.0d) {
                c14787xi.m73414to(0.0d);
                iArr[0] = 2;
                dArr2[0] = 0.0d;
            }
            if (dArr4[0] == 0.0d) {
                c14787xi.m73381du(0.0d);
                iArr[0] = 1;
                dArr[0] = 0.0d;
                return;
            }
            return;
        }
        if (zIsAutomaticMinValue && !zIsAutomaticMaxValue) {
            iArr[0] = 1;
            dArr[0] = c14787xi.m73389ix();
            dArr4[0] = c14787xi.m73389ix();
        } else {
            if (zIsAutomaticMinValue || !zIsAutomaticMaxValue) {
                iArr[0] = 2;
                dArr2[0] = c14787xi.m73410ne();
                dArr[0] = c14787xi.m73389ix();
                dArr3[0] = c14787xi.m73410ne();
                dArr4[0] = c14787xi.m73389ix();
                return;
            }
            iArr[0] = 2;
            dArr2[0] = c14787xi.m73410ne();
            dArr3[0] = c14787xi.m73410ne();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72810k4(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int[] iArr, boolean z, double d, double d2, boolean z2, boolean z3, C14787xi c14787xi) {
        if (c14787xi.m73422wl()) {
            m72823x1(dArr, dArr2, dArr3, dArr4, dArr5, iArr, z, d, d2, z2, z3, c14787xi);
        } else {
            m72809k4(dArr, dArr2, dArr3, dArr4, dArr5, iArr, c14787xi);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72811k4(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int[] iArr, boolean z, C14787xi c14787xi) {
        dArr5[0] = 1.0d;
        if (c14787xi.m73422wl() || c14787xi.m73391k4(c14787xi.m73418um()) == 0.0d) {
            double dM72816x1 = m72816x1(dArr3[0]);
            double dM72785k4 = m72785k4(dArr4[0]);
            dArr2[0] = dM72816x1;
            dArr[0] = dM72785k4;
            if (c14787xi.m73384dy().isAutomaticMaxValue() && c14787xi.m73384dy().isAutomaticMinValue()) {
                if (dM72816x1 < 0.0d || dM72785k4 < 0.0d) {
                    c14787xi.m73414to(c14787xi.m73424x1(dM72816x1));
                    iArr[0] = 2;
                    dArr2[0] = dM72816x1;
                    return;
                } else {
                    c14787xi.m73414to(c14787xi.m73424x1(0.0d));
                    iArr[0] = 2;
                    dArr2[0] = 0.0d;
                    return;
                }
            }
            if (c14787xi.m73384dy().isAutomaticMaxValue() || !c14787xi.m73384dy().isAutomaticMinValue()) {
                if (!c14787xi.m73384dy().isAutomaticMaxValue() || c14787xi.m73384dy().isAutomaticMinValue()) {
                    iArr[0] = 2;
                    dArr2[0] = c14787xi.m73391k4(c14787xi.m73410ne());
                    dArr[0] = c14787xi.m73391k4(c14787xi.m73389ix());
                    dArr3[0] = c14787xi.m73391k4(c14787xi.m73410ne());
                    dArr4[0] = c14787xi.m73391k4(c14787xi.m73389ix());
                    return;
                }
                iArr[0] = 2;
                double dM73391k4 = c14787xi.m73391k4(c14787xi.m73410ne());
                dArr2[0] = dM73391k4;
                dArr3[0] = dM73391k4;
                return;
            }
            iArr[0] = 1;
            double dM73391k42 = c14787xi.m73391k4(c14787xi.m73389ix());
            dArr[0] = dM73391k42;
            dArr4[0] = dM73391k42;
            return;
        }
        dArr5[0] = c14787xi.m73391k4(c14787xi.m73418um());
        double dM27462to = C7019kk.m27462to(Double.valueOf(dArr3[0]), 14);
        double dM27462to2 = ((double) C7019kk.m27462to(Double.valueOf(dArr4[0]), 14)) + dArr5[0];
        dArr2[0] = dM27462to;
        dArr[0] = dM27462to2;
        if (c14787xi.m73384dy().isAutomaticMaxValue() && c14787xi.m73384dy().isAutomaticMinValue()) {
            if (dM27462to < 0.0d || dM27462to2 < 0.0d) {
                c14787xi.m73414to(c14787xi.m73424x1(dM27462to));
                iArr[0] = 2;
                dArr2[0] = dM27462to;
                return;
            } else {
                c14787xi.m73414to(c14787xi.m73424x1(0.0d));
                iArr[0] = 2;
                dArr2[0] = 0.0d;
                return;
            }
        }
        if (c14787xi.m73384dy().isAutomaticMaxValue() || !c14787xi.m73384dy().isAutomaticMinValue()) {
            if (!c14787xi.m73384dy().isAutomaticMaxValue() || c14787xi.m73384dy().isAutomaticMinValue()) {
                iArr[0] = 2;
                dArr2[0] = c14787xi.m73391k4(c14787xi.m73410ne());
                dArr[0] = c14787xi.m73391k4(c14787xi.m73389ix());
                dArr3[0] = c14787xi.m73391k4(c14787xi.m73410ne());
                dArr4[0] = c14787xi.m73391k4(c14787xi.m73389ix());
                return;
            }
            iArr[0] = 2;
            double dM73391k43 = c14787xi.m73391k4(c14787xi.m73410ne());
            dArr2[0] = dM73391k43;
            dArr3[0] = dM73391k43;
            return;
        }
        iArr[0] = 1;
        double dM73391k44 = c14787xi.m73391k4(c14787xi.m73389ix());
        dArr[0] = dM73391k44;
        dArr4[0] = dM73391k44;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m72812k4(String str) {
        if (str == null) {
            return false;
        }
        String strM67368h4 = C14113y2.m67368h4(str);
        if (C14113y2.m67364dy(strM67368h4, "y") == -1 && C14113y2.m67364dy(strM67368h4, "d") == -1) {
            return C14113y2.m67364dy(strM67368h4, "m") != -1 && C14113y2.m67364dy(strM67368h4, C18773h.f57233c) == -1 && C14113y2.m67364dy(strM67368h4, "s") == -1;
        }
        return true;
    }
}
