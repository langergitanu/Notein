package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class lma extends AbstractC0753ak {
    /* JADX INFO: renamed from: c5 */
    private void m64463c5(bay bayVar) {
        int iM73479kk = m64467dy().m73479kk();
        boolean z = iM73479kk == 1 || iM73479kk == 3;
        int size = bayVar.m4110x1().size();
        int i = z ? size - 1 : 0;
        double dM64470x1 = 0.0d;
        double dM64469k4 = 0.0d;
        while (true) {
            if (z) {
                if (i < 0) {
                    return;
                }
            } else if (i >= size) {
                return;
            }
            bay bayVar2 = bayVar.m4110x1().get_Item(i);
            if (m64464c5()) {
                dM64469k4 += m64469k4(bayVar2, dM64469k4, bayVar.m4074dy().m74262m9(), m64467dy().m73480to());
            } else {
                dM64470x1 += m64470x1(bayVar2, dM64470x1, bayVar.m4074dy().m74228ck(), m64467dy().m73477du());
                dM64469k4 = dM64469k4;
            }
            i += z ? -1 : 1;
        }
    }

    /* JADX INFO: renamed from: ck */
    private static tbp m64465ck(bay bayVar) {
        double d;
        double d2;
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        double dM67502x1 = -1.7976931348623157E308d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double dM67491kk = Double.MAX_VALUE;
        double dM67502x12 = -1.7976931348623157E308d;
        double dM67491kk2 = Double.MAX_VALUE;
        while (it.hasNext()) {
            try {
                bay next = it.next();
                double dM74262m9 = next.m4074dy().m74262m9();
                double dM74228ck = next.m4074dy().m74228ck();
                if (dM74228ck > 0.0d) {
                    dM67491kk = C14116yg.m67491kk(dM67491kk, d3);
                    d = d3;
                    dM67502x12 = C14116yg.m67502x1(dM67502x12, d + dM74228ck);
                } else {
                    d = d3;
                }
                double d5 = d + dM74228ck;
                if (dM74262m9 > 0.0d) {
                    dM67491kk2 = C14116yg.m67491kk(dM67491kk2, d4);
                    d2 = d5;
                    dM67502x1 = C14116yg.m67502x1(dM67502x1, d4 + dM74262m9);
                } else {
                    d2 = d5;
                }
                d4 += dM74262m9;
                d3 = d2;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return new tbp((dM67491kk2 == Double.MAX_VALUE || dM67502x1 == -1.7976931348623157E308d) ? 0.0d : C14116yg.m67475k4(dM67502x1 - dM67491kk2), (dM67491kk == Double.MAX_VALUE || dM67502x12 == -1.7976931348623157E308d) ? 0.0d : C14116yg.m67475k4(dM67502x12 - dM67491kk));
    }

    /* JADX INFO: renamed from: dy */
    private tbp m64466dy(bay bayVar) {
        double dM4072du = bayVar.m4072du(61);
        double dM4072du2 = bayVar.m4072du(15);
        if (dM4072du == 0.0d) {
            dM4072du = Double.POSITIVE_INFINITY;
        }
        if (dM4072du2 == 0.0d) {
            dM4072du2 = Double.POSITIVE_INFINITY;
        }
        double dM4098m9 = bayVar.m4098m9(61);
        double dM4098m92 = bayVar.m4098m9(15);
        if (!C14044b3.m66437kk(dM4098m9) && dM4098m9 > dM4072du) {
            dM4072du = dM4098m9;
        }
        if (!C14044b3.m66437kk(dM4098m92) && dM4098m92 > dM4072du2) {
            dM4072du2 = dM4098m92;
        }
        return new tbp(dM4072du, dM4072du2);
    }

    /* JADX INFO: renamed from: jd */
    private void m64468jd(bay bayVar) {
        fwr[] fwrVarArr;
        int i;
        List<bay> listM4110x1;
        if (bayVar.m4106uz() != null) {
            int i2 = m64464c5() ? 15 : 61;
            fwr[] fwrVarArrM70408to = bayVar.m4106uz().m70408to();
            int length = fwrVarArrM70408to.length;
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                fwr fwrVar = fwrVarArrM70408to[i4];
                if (fwrVar.m6348kk() != 1 && i2 == fwrVar.m6344du()) {
                    tbp tbpVarClone = m64466dy(bayVar).Clone();
                    List<bay> listM6347k4 = fwrVar.m6347k4(bayVar);
                    if (listM6347k4.size() > 0) {
                        int iM5148x6 = listM6347k4.get_Item(i3).m5148x6() - 1;
                        int iM5148x62 = ((bay) OooO0O0.OooO00o(listM6347k4, 1)).m5148x6();
                        listM6347k4.clear();
                        double dM74262m9 = 0.0d;
                        int i5 = i3;
                        double dM74262m92 = 0.0d;
                        double dM74228ck = 0.0d;
                        while (true) {
                            listM4110x1 = bayVar.m4110x1();
                            if (i5 >= iM5148x6) {
                                break;
                            }
                            bay bayVar2 = listM4110x1.get_Item(i5);
                            dM74262m92 += bayVar2.m4074dy().m74262m9();
                            dM74228ck += bayVar2.m4074dy().m74228ck();
                            i5++;
                        }
                        if (iM5148x62 < listM4110x1.size()) {
                            bay bayVar3 = bayVar.m4110x1().get_Item(iM5148x62);
                            dM74262m92 += bayVar3.m4074dy().m74262m9();
                            dM74228ck += bayVar3.m4074dy().m74228ck();
                        }
                        double dM74228ck2 = 0.0d;
                        while (iM5148x6 < iM5148x62) {
                            bay bayVar4 = bayVar.m4110x1().get_Item(iM5148x6);
                            listM6347k4.addItem(bayVar4);
                            dM74262m9 += bayVar4.m4074dy().m74262m9();
                            dM74228ck2 += bayVar4.m4074dy().m74228ck();
                            iM5148x6++;
                        }
                        List.Enumerator<bay> it = listM6347k4.iterator();
                        while (it.hasNext()) {
                            try {
                                bay next = it.next();
                                fwr[] fwrVarArr2 = fwrVarArrM70408to;
                                int i6 = length;
                                double d = m64464c5() ? (tbpVarClone.f49091x1 - dM74228ck) / dM74228ck2 : (tbpVarClone.f49090k4 - dM74262m92) / dM74262m9;
                                if (AbstractC0753ak.m3633k4(d)) {
                                    next.m4085k4(d, i2);
                                    next.m4105um();
                                    next.m4065ak();
                                }
                                fwrVarArrM70408to = fwrVarArr2;
                                length = i6;
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                        fwrVarArr = fwrVarArrM70408to;
                        i = length;
                    }
                    i4++;
                    fwrVarArrM70408to = fwrVarArr;
                    length = i;
                    i3 = 0;
                }
                fwrVarArr = fwrVarArrM70408to;
                i = length;
                i4++;
                fwrVarArrM70408to = fwrVarArr;
                length = i;
                i3 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private double m64469k4(bay bayVar, double d, double d2, int i) {
        bayVar.m4074dy().m74252k4(new tbp(i == 2 ? (d2 - bayVar.m4074dy().m74262m9()) / 2.0d : i == 3 ? d2 - bayVar.m4074dy().m74262m9() : 0.0d, d));
        return bayVar.m4074dy().m74228ck();
    }

    /* JADX INFO: renamed from: x1 */
    private double m64470x1(bay bayVar, double d, double d2, int i) {
        bayVar.m4074dy().m74252k4(new tbp(d, i == 2 ? (d2 - bayVar.m4074dy().m74228ck()) / 2.0d : i == 3 ? d2 - bayVar.m4074dy().m74228ck() : 0.0d));
        return bayVar.m4074dy().m74262m9();
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: kk */
    public tbp mo3648kk(bay bayVar) {
        double d;
        double d2;
        bay bayVarM4082k4 = bayVar.m4082k4();
        bay bayVar2 = null;
        if (bayVarM4082k4 != null) {
            int iM5148x6 = bayVar.m5148x6();
            for (int i = iM5148x6; i < bayVarM4082k4.m4110x1().size(); i++) {
                bay bayVar3 = bayVarM4082k4.m4110x1().get_Item(i);
                if (bayVar3.m4074dy().m74233dy() != 0.0d || bayVar3.m4074dy().m74236fa() != 0.0d) {
                    bayVar2 = bayVar3;
                    break;
                }
            }
            if (bayVar2 == null) {
                for (int i2 = iM5148x6 - 2; i2 >= 0; i2--) {
                    bay bayVar4 = bayVarM4082k4.m4110x1().get_Item(i2);
                    if (bayVar4.m4074dy().m74233dy() != 0.0d || bayVar4.m4074dy().m74236fa() != 0.0d) {
                        bayVar2 = bayVar4;
                        break;
                    }
                }
            }
        }
        if (bayVar2 == null) {
            bayVar2 = bayVar;
        }
        double dM67475k4 = C14116yg.m67475k4(bayVar2.m4074dy().m74233dy());
        double dM67475k42 = C14116yg.m67475k4(bayVar2.m4074dy().m74236fa());
        tbp tbpVarClone = bayVar.m4100qq().Clone();
        double dM74233dy = bayVar.m4074dy().m74233dy();
        double dM74236fa = bayVar.m4074dy().m74236fa();
        tbp tbpVarClone2 = bayVar.m4108wl().Clone();
        if (m64464c5()) {
            d = (tbpVarClone2.f49090k4 + tbpVarClone.f49090k4) * dM74233dy;
            d2 = (tbpVarClone.f49091x1 * dM67475k42) + (tbpVarClone2.f49091x1 * dM74236fa);
        } else {
            d = (tbpVarClone.f49090k4 * dM67475k4) + (tbpVarClone2.f49090k4 * dM74233dy);
            d2 = dM74236fa * (tbpVarClone2.f49091x1 + tbpVarClone.f49091x1);
        }
        return new tbp(d, d2);
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m64464c5() {
        return m64467dy().m73479kk() == 1 || m64467dy().m73479kk() == 4;
    }

    /* JADX INFO: renamed from: dy */
    private xld m64467dy() {
        return (xld) m3643k4();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m64471x1(bay bayVar, tbp tbpVar) {
        if (C7019kk.m27469x1(bayVar.m4077jd(), C14345qg.class)) {
            bayVar.m4103to(61, tbpVar.f49090k4);
            bayVar.m4103to(15, tbpVar.f49091x1);
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                m64471x1(it.next(), tbpVar.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3646k4(bay bayVar) {
        tbp tbpVar;
        z2c z2cVarM4074dy;
        double dM67491kk;
        boolean z;
        double d;
        boolean z2;
        List list;
        int i;
        ?? r25;
        m64468jd(bayVar);
        tbp tbpVarClone = m64465ck(bayVar).Clone();
        tbp tbpVarClone2 = bayVar.m4074dy().m74258kk(true).Clone();
        tbp tbpVarClone3 = bayVar.m4074dy().m74258kk(false).Clone();
        new tbp();
        if (m64464c5()) {
            tbpVar = new tbp(tbpVarClone2.f49090k4, tbpVarClone.f49091x1);
            bayVar.m4074dy().m74232du(C14116yg.m67491kk(tbpVarClone3.f49090k4, tbpVar.f49090k4));
            z2cVarM4074dy = bayVar.m4074dy();
            dM67491kk = tbpVar.f49091x1;
        } else {
            tbpVar = new tbp(tbpVarClone.f49090k4, tbpVarClone2.f49091x1);
            bayVar.m4074dy().m74232du(tbpVar.f49090k4);
            z2cVarM4074dy = bayVar.m4074dy();
            dM67491kk = C14116yg.m67491kk(tbpVarClone3.f49091x1, tbpVar.f49091x1);
        }
        z2cVarM4074dy.m74234dy(dM67491kk);
        bayVar.m4074dy().m74259kk(tbpVar.f49090k4);
        bayVar.m4074dy().m74239h4(tbpVar.f49091x1);
        tbp tbpVarClone4 = m64466dy(bayVar).Clone();
        double d2 = tbpVar.f49090k4;
        double d3 = 0.0d;
        double d4 = d2 == 0.0d ? 1.0d : tbpVarClone4.f49090k4 / d2;
        double d5 = tbpVar.f49091x1;
        double d6 = d5 != 0.0d ? tbpVarClone4.f49091x1 / d5 : 1.0d;
        boolean z3 = m64467dy().m73478h4() == 1;
        double dM67491kk2 = z3 ? C14116yg.m67491kk(d4, d6) : m64464c5() ? d6 : d4;
        AbstractC0753ak.m3638x1(bayVar, m64467dy().m5210k4(), m64467dy().m5212x1());
        m64463c5(bayVar);
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        boolean z4 = false;
        tbp tbpVar2 = tbpVar;
        double d7 = 0.0d;
        while (it.hasNext()) {
            try {
                z2c z2cVarM4074dy2 = it.next().m4074dy();
                if (z2cVarM4074dy2.m74233dy() > 0.0d || z2cVarM4074dy2.m74236fa() > 0.0d) {
                    double dM74269to = z2cVarM4074dy2.m74269to();
                    double dM74231du = z2cVarM4074dy2.m74231du();
                    if (dM74269to < d3) {
                        d3 = dM74269to;
                    }
                    if (dM74231du < d7) {
                        d7 = dM74231du;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (d3 == 0.0d && d7 == 0.0d) {
            z = false;
            d = d6;
        } else {
            List.Enumerator<bay> it2 = bayVar.m4110x1().iterator();
            while (it2.hasNext()) {
                try {
                    boolean z5 = z4;
                    double d8 = d6;
                    double d9 = d3;
                    it2.next().m4074dy().m74246k4(-d3, -d7);
                    z4 = z5;
                    d6 = d8;
                    d3 = d9;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            z = z4;
            d = d6;
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        List list2 = new List();
        double dM67491kk3 = Double.MAX_VALUE;
        if (bayVar.m4106uz() != null) {
            fwr[] fwrVarArrM70408to = bayVar.m4106uz().m70408to();
            int length = fwrVarArrM70408to.length;
            boolean z6 = z;
            z2 = z6;
            z3 = z3;
            ?? r11 = z6;
            while (r11 < length) {
                fwr fwrVar = fwrVarArrM70408to[r11 == true ? 1 : 0];
                boolean z7 = z3;
                List.Enumerator<bay> it3 = fwrVar.m6350x1(bayVar).iterator();
                ?? r112 = r11;
                boolean z8 = z2;
                while (it3.hasNext()) {
                    try {
                        fwr[] fwrVarArr = fwrVarArrM70408to;
                        bay next = it3.next();
                        if (list2.containsItem(next)) {
                            list = list2;
                            i = length;
                            r25 = r112;
                        } else {
                            list2.addItem(next);
                            list = list2;
                            i = length;
                            r25 = r112;
                            dM67491kk3 = C14116yg.m67491kk(dM67491kk3, next.m4072du(fwrVar.m6344du()));
                        }
                        boolean z9 = (z8 ? 1 : 0) | ((next.m4074dy().m74222b3() && next.m4074dy().m74272u4()) ? true : z);
                        list2 = list;
                        fwrVarArrM70408to = fwrVarArr;
                        length = i;
                        r112 = r25;
                        z8 = z9;
                    } finally {
                    }
                }
                List list3 = list2;
                fwr[] fwrVarArr2 = fwrVarArrM70408to;
                int i2 = length;
                ?? r252 = r112;
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                list2 = list3;
                z3 = z7;
                fwrVarArrM70408to = fwrVarArr2;
                length = i2;
                r11 = (r252 == true ? 1 : 0) + 1;
                z2 = z8;
            }
        } else {
            z2 = z;
        }
        boolean z10 = z3;
        List list4 = list2;
        if (z2 && (AbstractC0753ak.m3633k4(d4 + 0.01d) || AbstractC0753ak.m3633k4(d + 0.01d))) {
            List.Enumerator it4 = list4.iterator();
            while (it4.hasNext()) {
                try {
                    bay bayVar2 = (bay) it4.next();
                    dM67491kk3 = C14116yg.m67491kk(tbpVarClone4.f49091x1 * dM67491kk2, dM67491kk3);
                    cpm.m4731x1(bayVar2, dM67491kk3);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                it4.dispose();
            }
            return z;
        }
        if (!AbstractC0753ak.m3633k4(0.01d + dM67491kk2)) {
            if (bayVar.m4082k4() != null) {
                bayVar.m4095kk(61, tbpVar2.f49090k4);
                bayVar.m4095kk(15, tbpVar2.f49091x1);
            }
            return true;
        }
        List.Enumerator<bay> it5 = bayVar.m4110x1().iterator();
        while (it5.hasNext()) {
            try {
                bay next2 = it5.next();
                if (m64464c5()) {
                    if (z10) {
                        next2.m4085k4(dM67491kk2, 61);
                    }
                    next2.m4085k4(dM67491kk2, 15);
                } else {
                    if (z10) {
                        next2.m4085k4(dM67491kk2, 15);
                    }
                    next2.m4085k4(dM67491kk2, 61);
                }
                next2.m4077jd().mo3644k4(next2, dM67491kk2);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
            it5.dispose();
        }
        bayVar.m4105um();
        return z;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3647k4(bay bayVar, tbp tbpVar) {
        double dM74262m9 = tbpVar.f49090k4 / bayVar.m4074dy().m74262m9();
        double dM74228ck = tbpVar.f49091x1 / bayVar.m4074dy().m74228ck();
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (C7019kk.m27469x1(next.m4077jd(), C1131g4.class)) {
                    double dM74241jd = next.m4074dy().m74241jd() != 0.0d ? tbpVar.f49090k4 / next.m4074dy().m74241jd() : 1.0d;
                    double dM74290yj = next.m4074dy().m74290yj() != 0.0d ? tbpVar.f49091x1 / next.m4074dy().m74290yj() : 1.0d;
                    if (AbstractC0753ak.m3633k4(dM74241jd)) {
                        next.m4085k4(dM74241jd, 61);
                    }
                    if (AbstractC0753ak.m3633k4(dM74290yj)) {
                        next.m4085k4(dM74290yj, 15);
                    }
                } else {
                    if (AbstractC0753ak.m3633k4(dM74262m9)) {
                        next.m4085k4(dM74262m9, 61);
                    }
                    if (AbstractC0753ak.m3633k4(dM74228ck)) {
                        next.m4085k4(dM74228ck, 15);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m64471x1(bayVar, tbpVar.Clone());
        return AbstractC0753ak.m3633k4(dM74262m9) || AbstractC0753ak.m3633k4(dM74228ck);
    }
}
