package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.oi */
/* JADX INFO: loaded from: classes3.dex */
class C14238oi extends AbstractC0753ak {
    static {
        C7019kk.m27454k4(tbp.class, (InterfaceC7014c5) new InterfaceC7014c5<tbp>() { // from class: com.aspose.slides.oi.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public tbp mo838x1() {
                return new tbp();
            }
        });
    }

    /* JADX INFO: renamed from: dy */
    private C14630ue m68570dy() {
        return (C14630ue) m3643k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static double m68571k4(IGenericEnumerable<jof> iGenericEnumerable, IGenericEnumerable<jof> iGenericEnumerable2) {
        IGenericEnumerator<jof> it = iGenericEnumerable2.iterator();
        double dM67502x1 = -1.7976931348623157E308d;
        boolean z = false;
        while (it.hasNext()) {
            try {
                jof next = it.next();
                it = iGenericEnumerable.iterator();
                while (it.hasNext()) {
                    try {
                        jof next2 = it.next();
                        if (next.m63460k4() < next2.m63460k4() || next.m63460k4() > next2.m63464kk()) {
                            if (next.m63464kk() < next2.m63460k4() || next.m63464kk() > next2.m63464kk()) {
                            }
                        }
                        dM67502x1 = C14116yg.m67502x1(dM67502x1, next2.m63470to() - next.m63473x1());
                        z = true;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (z) {
            return dM67502x1;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x1 */
    private static double m68575x1(IGenericEnumerable<jof> iGenericEnumerable, IGenericEnumerable<jof> iGenericEnumerable2) {
        IGenericEnumerator<jof> it = iGenericEnumerable2.iterator();
        double dM67502x1 = -1.7976931348623157E308d;
        boolean z = false;
        while (it.hasNext()) {
            try {
                jof next = it.next();
                it = iGenericEnumerable.iterator();
                while (it.hasNext()) {
                    try {
                        jof next2 = it.next();
                        if (next.m63473x1() < next2.m63473x1() || next.m63473x1() > next2.m63470to()) {
                            if (next.m63470to() < next2.m63473x1() || next.m63470to() > next2.m63470to()) {
                            }
                        }
                        dM67502x1 = C14116yg.m67502x1(dM67502x1, next2.m63464kk() - next.m63460k4());
                        z = true;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (z) {
            return dM67502x1;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    private tbp m68572k4(IGenericList<bay> iGenericList, double d, double d2) {
        double d3;
        List list;
        IGenericList<bay> iGenericList2 = iGenericList;
        int size = iGenericList2.size();
        double d4 = 2.0d;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) iGenericList2.size()) / 2.0d)), 14);
        List list2 = new List(iM27462to);
        List list3 = new List(iM27462to);
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        for (int i = 0; i < size; i++) {
            bay bayVar = iGenericList2.get_Item(i);
            double dM74262m9 = bayVar.m4074dy().m74262m9();
            double dM74228ck = bayVar.m4074dy().m74228ck();
            if (i % 2 == 0) {
                if (d5 < dM74262m9) {
                    d5 = dM74262m9;
                }
                if (d6 < dM74228ck) {
                    d6 = dM74228ck;
                }
                list2.addItem(bayVar);
            } else {
                if (d7 < dM74262m9) {
                    d7 = dM74262m9;
                }
                if (d8 < dM74228ck) {
                    d8 = dM74228ck;
                }
                list3.addItem(bayVar);
            }
        }
        tbp[] tbpVarArr = (tbp[]) C22200OooO0o0.OooO00o(tbp.class, size);
        int i2 = 0;
        double d9 = 0.0d;
        double d10 = 0.0d;
        while (true) {
            d3 = d4;
            int i3 = 2;
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            int i5 = 0;
            double dM74262m92 = 0.0d;
            double dM74228ck2 = 0.0d;
            for (int i6 = i2; i5 < 2 && i6 < size; i6++) {
                z2c z2cVarM4074dy = iGenericList2.get_Item(i6).m4074dy();
                if (dM74262m92 < z2cVarM4074dy.m74262m9()) {
                    dM74262m92 = z2cVarM4074dy.m74262m9();
                }
                if (dM74228ck2 < z2cVarM4074dy.m74228ck()) {
                    dM74228ck2 = z2cVarM4074dy.m74228ck();
                }
                i5++;
            }
            double d11 = d9;
            double d12 = d10;
            int i7 = 0;
            while (i7 < i3 && i2 < size) {
                iGenericList2.get_Item(i2).m4074dy();
                double d13 = i7 == 0 ? d5 : d7;
                double d14 = i7 == 0 ? d6 : d8;
                int iM71674kk = m68570dy().m71674kk();
                if (iM71674kk == i4) {
                    list = list2;
                    double d15 = d12 - d14;
                    tbpVarArr[i2] = new tbp(d11, d15);
                    d12 = d15 - d2;
                } else if (iM71674kk == i3) {
                    list = list2;
                    tbpVarArr[i2] = new tbp(d11, d12);
                    d11 = d13 + d2 + d11;
                } else if (iM71674kk == 3) {
                    list = list2;
                    double d16 = d11 - d13;
                    tbpVarArr[i2] = new tbp(d16, d12);
                    d11 = d16 - d2;
                } else if (iM71674kk != 4) {
                    list = list2;
                } else {
                    list = list2;
                    double d17 = d12;
                    tbpVarArr[i2] = new tbp(d11, d17);
                    d12 = d14 + d2 + d17;
                }
                i2++;
                i7++;
                list2 = list;
                i3 = 2;
                i4 = 1;
            }
            List list4 = list2;
            double d18 = d12;
            int iM71672du = m68570dy().m71672du();
            if (iM71672du != 1) {
                if (iM71672du == 2) {
                    d9 = d + dM74262m92 + d11;
                } else if (iM71672du == 3) {
                    d9 = d11 - (d + dM74262m92);
                } else if (iM71672du != 4) {
                    d10 = d18;
                    d9 = d11;
                    list2 = list4;
                    d4 = d3;
                } else {
                    d10 = d + dM74228ck2 + d18;
                }
                d10 = 0.0d;
                list2 = list4;
                d4 = d3;
            } else {
                d10 = d18 - (d + dM74228ck2);
            }
            d9 = 0.0d;
            list2 = list4;
            d4 = d3;
        }
        List list5 = list2;
        jof jofVarClone = C1150gl.m6750k4(tbpVarArr).Clone();
        int i8 = 0;
        while (i8 < size) {
            tbp tbpVarClone = tbpVarArr[i8].Clone();
            iGenericList2.get_Item(i8).m4074dy().m74246k4(tbpVarClone.f49090k4 - jofVarClone.m63460k4(), tbpVarClone.f49091x1 - jofVarClone.m63473x1());
            i8++;
            jofVarClone = jofVarClone;
            list3 = list3;
        }
        m68574k4(list5, m68570dy().m71672du(), m68570dy().m71675to(), d5, d6);
        double d19 = d5;
        double d20 = d6;
        double d21 = d7;
        double d22 = d8;
        m68574k4(list3, m68570dy().m71672du(), m68570dy().m71675to(), d21, d22);
        List list6 = new List();
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= size) {
                break;
            }
            bay bayVar2 = iGenericList2.get_Item(i9);
            bay bayVar3 = iGenericList2.get_Item(i10);
            list6.clear();
            list6.addItem(bayVar2);
            list6.addItem(bayVar3);
            m68574k4(list6, m68570dy().m71674kk(), m68570dy().m71673h4(), C14116yg.m67502x1(bayVar2.m4074dy().m74262m9(), bayVar3.m4074dy().m74262m9()), C14116yg.m67502x1(bayVar2.m4074dy().m74228ck(), bayVar3.m4074dy().m74228ck()));
            i9 += 2;
            iGenericList2 = iGenericList;
            size = size;
        }
        int iM71674kk2 = m68570dy().m71674kk();
        return iM71674kk2 != 1 ? iM71674kk2 != 2 ? iM71674kk2 != 3 ? iM71674kk2 != 4 ? tbp.f49088kk : new tbp(0.0d, (d2 / d3) + d20) : new tbp((d2 / d3) + d21, 0.0d) : new tbp((d2 / d3) + d19, 0.0d) : new tbp(0.0d, (d2 / d3) + d22);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68576x1(IGenericList<bay> iGenericList, double d) {
        List list = new List();
        int iM71674kk = m68570dy().m71674kk();
        boolean z = iM71674kk == 4 || iM71674kk == 1;
        boolean z2 = iM71674kk == 1 || iM71674kk == 3;
        int i = z2 ? -1 : 1;
        int size = z2 ? iGenericList.size() - 1 : 0;
        double dM68575x1 = 0.0d;
        double dM68571k4 = 0.0d;
        while (true) {
            if (z2) {
                if (size < 0) {
                    return;
                }
            } else if (size >= iGenericList.size()) {
                return;
            }
            bay bayVar = iGenericList.get_Item(size);
            bayVar.m4074dy().m74246k4(dM68575x1, dM68571k4);
            int i2 = size + i;
            if (z2) {
                if (i2 >= 0) {
                    list.addRange(AbstractC14092to.m67204k4((Object[]) bayVar.m4074dy().m74271ts()));
                    jof[] jofVarArrM74271ts = iGenericList.get_Item(size + i).m4074dy().m74271ts();
                    if (z) {
                        dM68571k4 = m68571k4(list, AbstractC14092to.m67204k4((Object[]) jofVarArrM74271ts)) + d;
                    } else {
                        dM68575x1 = m68575x1(list, AbstractC14092to.m67204k4((Object[]) jofVarArrM74271ts)) + d;
                    }
                }
            } else if (i2 < iGenericList.size()) {
            }
            size += i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68573k4(IGenericList<bay> iGenericList, double d) {
        int iM71674kk = m68570dy().m71674kk();
        boolean z = iM71674kk == 1 || iM71674kk == 3;
        int size = z ? iGenericList.size() - 1 : 0;
        double dM74262m9 = 0.0d;
        double dM74228ck = 0.0d;
        while (true) {
            if (z) {
                if (size < 0) {
                    return;
                }
            } else if (size >= iGenericList.size()) {
                return;
            }
            z2c z2cVarM4074dy = iGenericList.get_Item(size).m4074dy();
            if (iM71674kk == 1) {
                z2cVarM4074dy.m74246k4(dM74262m9, dM74228ck);
                dM74228ck = z2cVarM4074dy.m74228ck() + d + dM74228ck;
            } else if (iM71674kk == 2 || iM71674kk == 3) {
                z2cVarM4074dy.m74246k4(dM74262m9, dM74228ck);
                dM74262m9 = z2cVarM4074dy.m74262m9() + d + dM74262m9;
            } else if (iM71674kk == 4) {
            }
            size += z ? -1 : 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68574k4(IGenericList<bay> iGenericList, int i, int i2, double d, double d2) {
        IGenericEnumerator<bay> it;
        boolean zM27456k4;
        boolean z = i == 4 || i == 1;
        boolean z2 = i == 2 || i == 3;
        if (z && i2 == 4) {
            it = iGenericList.iterator();
            while (it.hasNext()) {
                try {
                    bay next = it.next();
                    next.m4074dy().m74246k4(d - next.m4074dy().m74262m9(), 0.0d);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        if (z2 && i2 == 2) {
            it = iGenericList.iterator();
            while (it.hasNext()) {
                try {
                    bay next2 = it.next();
                    next2.m4074dy().m74246k4(0.0d, d2 - next2.m4074dy().m74228ck());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public void mo3644k4(bay bayVar, double d) {
        bayVar.m4086k4(d, 30, 29, 28, 4);
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3645k4(int i) {
        return i == 29 || i == 30;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3646k4(bay bayVar) {
        if (m68570dy().m71674kk() != 0) {
            List<bay> listM4068bv = bayVar.m4068bv();
            if (listM4068bv.size() > 0) {
                double dM4072du = bayVar.m4072du(29);
                boolean z = m68570dy().m71674kk() == 4 || m68570dy().m71674kk() == 1;
                boolean z2 = m68570dy().m71672du() == 4 || m68570dy().m71672du() == 1;
                if (m68570dy().m71672du() == 0 || z == z2) {
                    int iM4080k4 = bayVar.m4080k4(m3641h4());
                    boolean z3 = iM4080k4 == 3 || iM4080k4 == 4;
                    tbp tbpVarClone = bayVar.m4074dy().m74258kk(true).Clone();
                    m68574k4(listM4068bv, m68570dy().m71674kk(), m68570dy().m71675to(), tbpVarClone.f49090k4, tbpVarClone.f49091x1);
                    if (z3) {
                        m68576x1(listM4068bv, dM4072du);
                    } else {
                        m68573k4(listM4068bv, dM4072du);
                    }
                } else {
                    tbp tbpVarClone2 = m68572k4(listM4068bv, dM4072du, bayVar.m4072du(28)).Clone();
                    bayVar.m4074dy().m74248k4(4, tbpVarClone2.f49090k4);
                    bayVar.m4074dy().m74248k4(5, tbpVarClone2.f49091x1);
                }
                bayVar.m4074dy().m74237g8();
                AbstractC0753ak.m3638x1(bayVar, m68570dy().m5210k4(), m68570dy().m5212x1());
            }
        }
        return true;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3647k4(bay bayVar, tbp tbpVar) {
        double dM67491kk = C14116yg.m67491kk(tbpVar.f49090k4 / bayVar.m4074dy().m74233dy(), tbpVar.f49091x1 / bayVar.m4074dy().m74236fa());
        if (!AbstractC0753ak.m3633k4(dM67491kk)) {
            return false;
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4086k4(dM67491kk, 61, 15);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        bayVar.m4086k4(dM67491kk, 30, 29, 28, 4);
        return true;
    }
}
