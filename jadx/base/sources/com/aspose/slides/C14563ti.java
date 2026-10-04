package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ti */
/* JADX INFO: loaded from: classes3.dex */
class C14563ti {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49143k4 = new C7017h4("ABS", "AND", "AVERAGE", "CEILING", "CELL", "CHOOSE", "COUNTA", "DATE", "DAYS", "FIND", "FINDB", "FORMULATEXT", "IF", "INDIRECT", "INDEX", "LEFT", "LEN", "LOOKUP", "MATCH", "RIGHT", "MAX", "SUBSTITUTE", "STDEV", "SUM", "SUMIFS", "VLOOKUP", "OR", "ROUND", "CONCAT", "CONCATENATE", "NUMBERVALUE", "address", "col", "row");

    /* JADX INFO: renamed from: ak */
    private static mtk m71171ak(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46255dq, iGenericList, c1095fc);
        String strM67727to = iGenericList.get_Item(0).m67727to(c1095fc);
        String strM55062ne = C11697x1.m55252to().m55263fa().m55062ne();
        String strM55050ix = C11697x1.m55252to().m55263fa().m55050ix();
        String strM67727to2 = iGenericList.size() > 1 ? iGenericList.get_Item(1).m67727to(c1095fc) : strM55062ne;
        if (iGenericList.size() > 2) {
            strM55050ix = iGenericList.get_Item(2).m67727to(c1095fc);
        }
        String strM67443x1 = C14113y2.m67443x1(strM67727to2, 0, 1);
        String strM67443x12 = C14113y2.m67443x1(strM55050ix, 0, 1);
        if (strM67727to.length() == 0) {
            return new mtk(0.0d);
        }
        String strM67440x1 = C14113y2.m67440x1(strM67727to);
        int iM67364dy = C14113y2.m67364dy(strM67440x1, strM67443x1);
        int iM67430to = C14113y2.m67430to(strM67440x1, strM67443x1);
        int iM67364dy2 = C14113y2.m67364dy(strM67440x1, strM67443x12);
        int iM67430to2 = C14113y2.m67430to(strM67440x1, strM67443x12);
        if (iM67364dy >= 0 && iM67364dy != iM67430to) {
            throw new mdp("#VALUE!");
        }
        if (iM67364dy >= 0 && iM67364dy2 >= 0 && iM67364dy <= iM67430to2) {
            throw new mdp("#VALUE!");
        }
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(strM67440x1, strM67443x12, ""), strM67443x1, strM55062ne);
        if (strM67401k4.charAt(0) == strM67443x1.charAt(0)) {
            strM67401k4 = C14113y2.m67408k4("0", strM67401k4);
        }
        double d = 1.0d;
        while (C14113y2.m67424kk(strM67401k4, "%")) {
            d *= 0.01d;
            strM67401k4 = OooO0OO.OooO00o(1, 0, strM67401k4, strM67401k4);
        }
        double[] dArr = {0.0d};
        boolean zM66436k4 = C14044b3.m66436k4(strM67401k4, dArr);
        double d2 = dArr[0];
        if (zM66436k4) {
            return new mtk(d2 * d);
        }
        throw new mdp("#VALUE!");
    }

    /* JADX INFO: renamed from: ar */
    private static mtk m71172ar(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46252bv, iGenericList, c1095fc);
        String strM71205x1 = m71205x1(iGenericList.get_Item(0).Clone(), c1095fc);
        String strM71205x12 = m71205x1(iGenericList.get_Item(1).Clone(), c1095fc);
        String strM71205x13 = m71205x1(iGenericList.get_Item(2).Clone(), c1095fc);
        if (iGenericList.size() <= 3) {
            return new mtk(C14113y2.m67401k4(strM71205x1, strM71205x12, strM71205x13));
        }
        if (iGenericList.get_Item(3).m67728x1() != 1) {
            throw new mdp("#VALUE!");
        }
        double dM67725kk = iGenericList.get_Item(3).m67725kk(c1095fc);
        int i = 0;
        for (int i2 = 0; i2 < strM71205x1.length() - strM71205x12.length(); i2++) {
            if (C14113y2.m67363du(C14113y2.m67443x1(strM71205x1, i2, strM71205x12.length()), strM71205x12)) {
                i++;
                if (i == dM67725kk) {
                    return new mtk(C14113y2.m67408k4(C14113y2.m67443x1(strM71205x1, 0, i2), strM71205x13, C14113y2.m67422kk(strM71205x1, strM71205x12.length() + i2)));
                }
            }
        }
        return new mtk(strM71205x1);
    }

    /* JADX INFO: renamed from: b3 */
    private static mtk m71173b3(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46275wy, iGenericList, c1095fc);
        double dM67725kk = iGenericList.get_Item(0).m67725kk(c1095fc);
        int iM67729x1 = iGenericList.get_Item(1).m67729x1(c1095fc);
        if (iM67729x1 >= 0) {
            return new mtk(C14116yg.m67478k4(dM67725kk, iM67729x1, (short) 1));
        }
        double dM67482k4 = C14116yg.m67482k4(iM67729x1);
        return new mtk(C14116yg.m67469du(10.0d, dM67482k4) * C14116yg.m67478k4(dM67725kk / C14116yg.m67469du(10.0d, dM67482k4), 0, (short) 1));
    }

    /* JADX INFO: renamed from: bv */
    private static mtk m71174bv(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46273v4, iGenericList, c1095fc);
        IGenericEnumerator<mtk> it = iGenericList.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            try {
                InterfaceC13755l1 interfaceC13755l1M67721du = it.next().m67721du(c1095fc);
                while (interfaceC13755l1M67721du.hasNext()) {
                    dDoubleValue += interfaceC13755l1M67721du.next().doubleValue();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new mtk(dDoubleValue);
    }

    /* JADX INFO: renamed from: c5 */
    private static mtk m71175c5(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        int length;
        m71188k4(C13844mo.f46258fa, iGenericList, c1095fc);
        String strM67727to = iGenericList.get_Item(0).m67727to(c1095fc);
        String strM67727to2 = iGenericList.get_Item(1).m67727to(c1095fc);
        int iM67729x1 = (iGenericList.size() < 3 ? new mtk(1.0d) : iGenericList.get_Item(2)).Clone().m67729x1(c1095fc);
        if (C14113y2.m67363du(strM67727to2, C14113y2.f47374k4)) {
            length = 1;
        } else {
            length = strM67727to2.length();
            if (C14113y2.m67363du(strM67727to, C14113y2.f47374k4)) {
                length++;
            }
        }
        if (iM67729x1 < 1 || iM67729x1 > length) {
            throw new mdp("#VALUE!");
        }
        if (C14113y2.m67363du(strM67727to, C14113y2.f47374k4)) {
            return new mtk(iM67729x1);
        }
        if (C14113y2.m67363du(strM67727to2, C14113y2.f47374k4)) {
            throw new mdp("#VALUE!");
        }
        int iM67378k4 = C14113y2.m67378k4(strM67727to2, strM67727to, iM67729x1 - 1);
        if (iM67378k4 != -1) {
            return new mtk(((double) iM67378k4) + 1.0d);
        }
        throw new mdp("#VALUE!");
    }

    /* JADX INFO: renamed from: ck */
    private static mtk m71176ck(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46278yj, iGenericList, c1095fc);
        mtk mtkVarClone = iGenericList.get_Item(0).Clone();
        if (mtkVarClone.m67728x1() != 3 || !C7019kk.m27469x1(mtkVarClone.m67722k4(), C0909dp.class)) {
            throw new mdp("#VALUE!");
        }
        return new mtk(((wdt) c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(((C0909dp) mtkVarClone.m67722k4()).mo3720k4()).mo5428x1(((C0909dp) mtkVarClone.m67722k4()).m5204x1().m4031x1(), ((C0909dp) mtkVarClone.m67722k4()).m5202kk().m5607x1())).mo3437k4(0));
    }

    /* JADX INFO: renamed from: du */
    private static mtk m71177du(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46253c5, iGenericList, c1095fc);
        int iM67729x1 = iGenericList.get_Item(0).m67729x1(c1095fc);
        if (iM67729x1 < 1 || iM67729x1 > iGenericList.size() - 1) {
            throw new mdp("#VALUE!");
        }
        return iGenericList.get_Item(iM67729x1);
    }

    /* JADX INFO: renamed from: dy */
    private static mtk m71178dy(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46254ck, iGenericList, c1095fc);
        return new mtk(((double) iGenericList.get_Item(0).m67729x1(c1095fc)) - ((double) iGenericList.get_Item(1).m67729x1(c1095fc)));
    }

    /* JADX INFO: renamed from: fa */
    private static mtk m71179fa(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46262ks, iGenericList, c1095fc);
        return iGenericList.get_Item(0).m67724k4(c1095fc) ? (iGenericList.get_Item(1).m67722k4() == null ? new mtk(0.0d) : iGenericList.get_Item(1)).Clone() : iGenericList.size() < 3 ? new mtk(false) : iGenericList.get_Item(2).m67722k4() == null ? new mtk(0.0d) : iGenericList.get_Item(2);
    }

    /* JADX INFO: renamed from: h4 */
    private static mtk m71180h4(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46257dy, iGenericList, c1095fc);
        IGenericList<InterfaceC1124fx> list = new List<>();
        IGenericEnumerator<mtk> it = iGenericList.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                mtk next = it.next();
                if (next.m67728x1() != 3) {
                    throw new mdp("#VALUE!");
                }
                if (C7019kk.m27469x1(next.m67722k4(), C0958eo.class)) {
                    C0958eo c0958eo = (C0958eo) next.m67722k4();
                    list = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(c0958eo.mo3720k4()).mo5424k4(1, c0958eo.m5607x1(), 1000, c0958eo.m5607x1());
                } else if (C7019kk.m27469x1(next.m67722k4(), b6d.class)) {
                    b6d b6dVar = (b6d) next.m67722k4();
                    list = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(b6dVar.mo3720k4()).mo5424k4(b6dVar.m4031x1(), 1, b6dVar.m4031x1(), 1000);
                } else if (C7019kk.m27469x1(next.m67722k4(), xdd.class)) {
                    xdd xddVar = (xdd) next.m67722k4();
                    list = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(xddVar.mo3720k4()).mo5424k4(((C0909dp) xddVar.m73330x1()).m5204x1().m4031x1(), ((C0909dp) xddVar.m73330x1()).m5202kk().m5607x1(), ((C0909dp) xddVar.m73329kk()).m5204x1().m4031x1(), ((C0909dp) xddVar.m73329kk()).m5202kk().m5607x1());
                } else {
                    if (!C7019kk.m27469x1(next.m67722k4(), C0909dp.class)) {
                        throw new mdp("#VALUE!");
                    }
                    wdt wdtVar = (wdt) c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(((C0909dp) next.m67722k4()).mo3720k4()).mo5428x1(((C0909dp) next.m67722k4()).m5204x1().m4031x1(), ((C0909dp) next.m67722k4()).m5202kk().m5607x1());
                    if (wdtVar.m72689ks().mo3449to() != null || wdtVar.m72689ks().m3455x6() != null) {
                        i++;
                    }
                }
                IGenericEnumerator<InterfaceC1124fx> it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        wdt wdtVar2 = (wdt) it2.next();
                        if (wdtVar2.m72689ks().mo3449to() != null || wdtVar2.m72689ks().m3455x6() != null) {
                            i++;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                list = null;
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
        return new mtk(i);
    }

    /* JADX INFO: renamed from: ix */
    private static mtk m71181ix(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46269u4, iGenericList, c1095fc);
        mtk mtkVarClone = iGenericList.get_Item(0).m67730x1(c1095fc.m6116k4()).Clone();
        mtk mtkVarClone2 = iGenericList.get_Item(1).Clone();
        mtk mtkVarClone3 = (iGenericList.size() < 3 ? mtkVarClone2 : iGenericList.get_Item(2)).Clone();
        if (mtkVarClone2.m67728x1() != 3) {
            throw new CellUnsupportedDataException("The LOOKUP function supports the vector form only.");
        }
        InterfaceC14885zh interfaceC14885zhMo5427k4 = c1095fc.m6116k4().mo3436k4().mo5427k4((InterfaceC0761as) mtkVarClone2.m67722k4());
        if (interfaceC14885zhMo5427k4 == null) {
            throw new mdp("#VALUE!");
        }
        if (!interfaceC14885zhMo5427k4.mo7376to() && !interfaceC14885zhMo5427k4.mo7366du()) {
            throw new CellUnsupportedDataException("The LOOKUP function does not support two-dimensional cell ranges.");
        }
        int iM71184k4 = m71184k4(mtkVarClone.Clone(), interfaceC14885zhMo5427k4, true, c1095fc);
        if (iM71184k4 == -1) {
            throw new mdp("#N/A");
        }
        if (mtkVarClone3.m67728x1() != 3) {
            throw new CellUnsupportedDataException("The LOOKUP function supports the vector form only.");
        }
        InterfaceC14885zh interfaceC14885zhMo5427k42 = c1095fc.m6116k4().mo3436k4().mo5427k4((InterfaceC0761as) mtkVarClone3.m67722k4());
        if (interfaceC14885zhMo5427k42 == null) {
            throw new mdp("#VALUE!");
        }
        if (!interfaceC14885zhMo5427k42.mo7376to() && !interfaceC14885zhMo5427k42.mo7366du()) {
            throw new mdp("#N/A");
        }
        int iMo7377x1 = interfaceC14885zhMo5427k42.mo7377x1();
        int iMo7373kk = interfaceC14885zhMo5427k42.mo7373kk();
        if (interfaceC14885zhMo5427k42.mo7376to()) {
            iMo7373kk += iM71184k4;
        } else {
            iMo7377x1 += iM71184k4;
        }
        InterfaceC1124fx interfaceC1124fxMo5426k4 = interfaceC14885zhMo5427k42.mo7372k4().mo5426k4(iMo7377x1, iMo7373kk);
        if (interfaceC1124fxMo5426k4 != null) {
            return mtk.m67718k4(interfaceC1124fxMo5426k4);
        }
        throw new mdp("#N/A");
    }

    /* JADX INFO: renamed from: jd */
    private static mtk m71182jd(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        int i;
        m71188k4(C13844mo.f46271up, iGenericList, c1095fc);
        String strM67727to = iGenericList.get_Item(0).m67727to(c1095fc);
        String strM67727to2 = iGenericList.get_Item(1).m67727to(c1095fc);
        int iM67729x1 = (iGenericList.size() < 3 ? new mtk(1.0d) : iGenericList.get_Item(2)).Clone().m67729x1(c1095fc);
        AbstractC6747ar abstractC6747arM26644to = AbstractC6747ar.m26644to(c1095fc.m6116k4().mo3436k4().mo5425k4().mo5387x1().mo4952x1().m55260ck().m55235k4());
        char[] cArrM67365dy = C14113y2.m67365dy(strM67727to2);
        if (C14113y2.m67363du(strM67727to2, C14113y2.f47374k4)) {
            i = 1;
        } else {
            int iMo26663k4 = abstractC6747arM26644to.mo26663k4(cArrM67365dy, 0, cArrM67365dy.length - 1);
            i = iMo26663k4 + 1;
            if (C14113y2.m67363du(strM67727to, C14113y2.f47374k4)) {
                i = iMo26663k4 + 2;
            }
        }
        if (iM67729x1 < 1 || iM67729x1 > i) {
            throw new mdp("#VALUE!");
        }
        if (C14113y2.m67363du(strM67727to, C14113y2.f47374k4)) {
            return new mtk(iM67729x1);
        }
        if (C14113y2.m67363du(strM67727to2, C14113y2.f47374k4)) {
            throw new mdp("#VALUE!");
        }
        int i2 = 0;
        int iMo26663k42 = 1;
        while (iMo26663k42 < iM67729x1) {
            iMo26663k42 += abstractC6747arM26644to.mo26663k4(cArrM67365dy, i2, 1);
            i2++;
        }
        if (C14113y2.m67378k4(strM67727to2, strM67727to, i2) != -1) {
            return new mtk(abstractC6747arM26644to.mo26658k4(C14113y2.m67443x1(strM67727to2, 0, r9)) + 1);
        }
        throw new mdp("#VALUE!");
    }

    /* JADX INFO: renamed from: k4 */
    private static int m71183k4(mtk mtkVar, InterfaceC14885zh interfaceC14885zh, C1095fc c1095fc) {
        InterfaceC1124fx next;
        int iMo3452x1;
        int iMo7377x1;
        C6005k4.m24261k4(interfaceC14885zh.mo7376to() || interfaceC14885zh.mo7366du());
        C6005k4.m24261k4(c1095fc != null);
        mj1 mj1Var = new mj1(c1095fc);
        IGenericEnumerator<InterfaceC1124fx> it = interfaceC14885zh.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                mtk mtkVar2 = new mtk();
                try {
                    mtk.m67718k4(next).CloneTo(mtkVar2);
                    if (mtkVar2.m67728x1() == mtkVar.m67728x1()) {
                        mtk mtkVarClone = mj1Var.m64913k4(mtkVar2.Clone(), mtkVar.Clone()).Clone();
                        if (mtkVarClone.m67728x1() != 1) {
                            throw new InvalidOperationException(C14113y2.m67402k4("An unknown type of comparison operation result for operands: '{0}', '{1}'.", mtkVar2.m67722k4().toString(), mtkVar.m67722k4().toString()));
                        }
                        if (C7019kk.m27462to(C7019kk.m27464to(mtkVarClone.m67722k4(), Double.TYPE), 14) == 0) {
                        }
                    }
                } catch (mdp unused) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (next == null) {
            return -1;
        }
        if (interfaceC14885zh.mo7376to()) {
            iMo3452x1 = next.mo3443kk();
            iMo7377x1 = interfaceC14885zh.mo7373kk();
        } else {
            iMo3452x1 = next.mo3452x1();
            iMo7377x1 = interfaceC14885zh.mo7377x1();
        }
        return iMo3452x1 - iMo7377x1;
    }

    /* JADX INFO: renamed from: kk */
    private static mtk m71189kk(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46259h4, iGenericList, c1095fc);
        double dM67725kk = iGenericList.get_Item(0).m67725kk(c1095fc);
        double dM67725kk2 = iGenericList.get_Item(1).m67725kk(c1095fc);
        if (dM67725kk <= 0.0d || dM67725kk2 >= 0.0d) {
            return dM67725kk2 == 0.0d ? new mtk(0.0d) : new mtk(C14116yg.m67501x1(dM67725kk / dM67725kk2) * dM67725kk2);
        }
        throw new mdp("#NUM!");
    }

    /* JADX INFO: renamed from: ks */
    private static mtk m71190ks(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        if (iGenericList == null || iGenericList.size() == 0) {
            return new mtk(false);
        }
        for (int i = 0; i < iGenericList.size(); i++) {
            if (!iGenericList.get_Item(i).m67724k4(c1095fc)) {
                return new mtk(false);
            }
        }
        return new mtk(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.aspose.slides.y7] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX INFO: renamed from: lr */
    private static double m71191lr(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        C0958eo c0958eo;
        int iM4031x1;
        int iM4031x12;
        double dDoubleValue;
        C0958eo c0958eo2;
        int iM4031x13;
        ?? r11;
        ?? r7 = 1;
        if (C7019kk.m27469x1(iGenericList.get_Item(0).m67722k4(), C0958eo.class)) {
            c0958eo = (C0958eo) iGenericList.get_Item(0).m67722k4();
            iM4031x1 = 1;
            iM4031x12 = 1000;
        } else {
            if (!C7019kk.m27469x1(iGenericList.get_Item(0).m67722k4(), xdd.class)) {
                throw new mdp("#VALUE!");
            }
            c0958eo = new C0958eo(((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73330x1()).m5202kk().m5607x1(), true, ((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73330x1()).m5202kk().mo3720k4());
            iM4031x1 = ((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73330x1()).m5204x1().m4031x1();
            iM4031x12 = ((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73329kk()).m5204x1().m4031x1();
        }
        IGenericList<InterfaceC1124fx> iGenericListMo5424k4 = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(c0958eo.mo3720k4()).mo5424k4(iM4031x1, c0958eo.m5607x1(), iM4031x12, c0958eo.m5607x1());
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<InterfaceC1124fx> it = iGenericListMo5424k4.iterator();
        while (true) {
            try {
                dDoubleValue = 0.0d;
                if (!it.hasNext()) {
                    break;
                }
                wdt wdtVar = (wdt) it.next();
                double[] dArr = {0.0d};
                boolean zM66435k4 = C14044b3.m66435k4(wdtVar.mo3446m9().replace(",", "."), 239, C11697x1.m55250kk(), dArr);
                double d = dArr[0];
                if (zM66435k4) {
                    dictionary.addItem(Integer.valueOf(wdtVar.mo3452x1()), Double.valueOf(d));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int i = 1;
        while (i < iGenericList.size() - r7) {
            if (C7019kk.m27469x1(iGenericList.get_Item(i).m67722k4(), C0958eo.class)) {
                c0958eo2 = (C0958eo) iGenericList.get_Item(i).m67722k4();
                r11 = r7;
                iM4031x13 = 1000;
            } else {
                if (!C7019kk.m27469x1(iGenericList.get_Item(i).m67722k4(), xdd.class)) {
                    throw new mdp("#VALUE!");
                }
                c0958eo2 = new C0958eo(((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73330x1()).m5202kk().m5607x1(), r7, ((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73330x1()).m5202kk().mo3720k4());
                int iM4031x14 = ((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73330x1()).m5204x1().m4031x1();
                iM4031x13 = ((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73329kk()).m5204x1().m4031x1();
                r11 = iM4031x14;
            }
            ?? r16 = r7;
            IGenericList<InterfaceC1124fx> iGenericListMo5424k42 = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(c0958eo.mo3720k4()).mo5424k4(r11, c0958eo2.m5607x1(), iM4031x13, c0958eo2.m5607x1());
            String strM71205x1 = m71205x1(iGenericList.get_Item(i + 1).Clone(), c1095fc);
            IGenericEnumerator<InterfaceC1124fx> it2 = iGenericListMo5424k42.iterator();
            while (it2.hasNext()) {
                try {
                    wdt wdtVar2 = (wdt) it2.next();
                    if (!C14113y2.m67363du(wdtVar2.mo3446m9(), strM71205x1)) {
                        dictionary.removeItemByKey(Integer.valueOf(wdtVar2.mo3452x1()));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            i += 2;
            r7 = r16 == true ? 1 : 0;
        }
        Dictionary.Enumerator it3 = dictionary.iterator();
        while (it3.hasNext()) {
            try {
                dDoubleValue += ((Double) it3.next().getValue()).doubleValue();
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        return C14116yg.m67497to(dDoubleValue);
    }

    /* JADX INFO: renamed from: m9 */
    private static mtk m71192m9(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46261jd, iGenericList, c1095fc);
        int iM67729x1 = iGenericList.get_Item(0).m67729x1(c1095fc);
        int iM67729x12 = iGenericList.get_Item(1).m67729x1(c1095fc);
        int iM67729x13 = iGenericList.get_Item(2).m67729x1(c1095fc);
        if (iM67729x1 < 0) {
            throw new mdp("#NUM!");
        }
        if (iM67729x1 < 1900) {
            iM67729x1 += 1900;
        }
        if (iM67729x12 <= 0) {
            throw new mdp("#NUM!");
        }
        if (iM67729x13 < 0) {
            throw new mdp("#NUM!");
        }
        int i = (iM67729x12 - 1) / 12;
        C14093tq c14093tq = new C14093tq(t5p.m70969k4(iM67729x1 + i, iM67729x12 - (i * 12), 1, c1095fc.m6116k4().mo3436k4().mo5425k4().mo5387x1().mo4951k4()));
        if (c14093tq.m67302x1()) {
            return new mtk((((Double) c14093tq.m67297k4()).doubleValue() + ((double) iM67729x13)) - 1.0d);
        }
        throw new mdp("#VALUE!");
    }

    /* JADX INFO: renamed from: ne */
    private static mtk m71193ne(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46268to, iGenericList, c1095fc);
        return new mtk(m71205x1(iGenericList.get_Item(0).Clone(), c1095fc).length());
    }

    /* JADX INFO: renamed from: qq */
    private static mtk m71194qq(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46250ar, iGenericList, c1095fc);
        IGenericEnumerator<mtk> it = iGenericList.iterator();
        double dDoubleValue = -1.7976931348623157E308d;
        while (it.hasNext()) {
            try {
                InterfaceC13755l1 interfaceC13755l1M67721du = it.next().m67721du(c1095fc);
                while (interfaceC13755l1M67721du.hasNext()) {
                    if (interfaceC13755l1M67721du.next().doubleValue() > dDoubleValue) {
                        dDoubleValue = interfaceC13755l1M67721du.next().doubleValue();
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (dDoubleValue == -1.7976931348623157E308d) {
            dDoubleValue = 0.0d;
        }
        return new mtk(dDoubleValue);
    }

    /* JADX INFO: renamed from: rv */
    private static mtk m71195rv(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        int iM67729x1;
        m71188k4(C13844mo.f46276x6, iGenericList, c1095fc);
        mtk mtkVarClone = iGenericList.get_Item(0).Clone();
        int iM67729x12 = iGenericList.get_Item(1).m67729x1(c1095fc);
        C14093tq c14093tq = new C14093tq();
        if (iGenericList.size() > 2) {
            c14093tq = new C14093tq(iGenericList.get_Item(2).Clone());
        }
        C14093tq c14093tq2 = new C14093tq();
        if (iGenericList.size() > 3) {
            c14093tq2 = new C14093tq(iGenericList.get_Item(3).Clone());
        }
        if (mtkVarClone.m67728x1() != 3) {
            throw new CellUnsupportedDataException("The INDEX function supports the reference form only.");
        }
        InterfaceC14885zh interfaceC14885zhMo5427k4 = c1095fc.m6116k4().mo3436k4().mo5427k4((InterfaceC0761as) mtkVarClone.m67722k4());
        if (interfaceC14885zhMo5427k4 == null) {
            throw new mdp("#VALUE!");
        }
        if (iM67729x12 < 0) {
            throw new mdp("#VALUE!");
        }
        if (!interfaceC14885zhMo5427k4.mo7376to() || c14093tq.m67302x1()) {
            if (iM67729x12 > interfaceC14885zhMo5427k4.mo7368h4()) {
                throw new mdp("#REF!");
            }
        } else if (iM67729x12 > interfaceC14885zhMo5427k4.mo7375m9()) {
            throw new mdp("#REF!");
        }
        if (c14093tq.m67302x1()) {
            iM67729x1 = ((mtk) c14093tq.m67297k4()).m67729x1(c1095fc);
            if (iM67729x1 < 0) {
                throw new mdp("#VALUE!");
            }
            if (iM67729x1 > interfaceC14885zhMo5427k4.mo7375m9()) {
                throw new mdp("#REF!");
            }
        } else {
            iM67729x1 = -1;
        }
        if (c14093tq2.m67302x1()) {
            if (((mtk) c14093tq2.m67297k4()).m67729x1(c1095fc) < 0) {
                throw new mdp("#VALUE!");
            }
            throw new CellUnsupportedDataException("The INDEX function does not support reference areas.");
        }
        boolean zM67302x1 = c14093tq.m67302x1();
        if (iM67729x12 == 0) {
            if (zM67302x1) {
                if (iM67729x1 != 0) {
                    return new mtk(interfaceC14885zhMo5427k4.mo7374kk(iM67729x1).mo7364c5());
                }
            } else if (!interfaceC14885zhMo5427k4.mo7376to() && !interfaceC14885zhMo5427k4.mo7366du()) {
                throw new mdp("#REF!");
            }
            return mtkVarClone;
        }
        if (zM67302x1) {
            return iM67729x1 == 0 ? new mtk(interfaceC14885zhMo5427k4.mo7378x1(iM67729x12).mo7364c5()) : new mtk(interfaceC14885zhMo5427k4.mo7371k4(iM67729x12, iM67729x1).mo3428c5());
        }
        if (interfaceC14885zhMo5427k4.mo7376to()) {
            return new mtk(interfaceC14885zhMo5427k4.mo7371k4(1, iM67729x12).mo3428c5());
        }
        if (interfaceC14885zhMo5427k4.mo7366du()) {
            return new mtk(interfaceC14885zhMo5427k4.mo7371k4(iM67729x12, 1).mo3428c5());
        }
        throw new mdp("#REF!");
    }

    /* JADX INFO: renamed from: to */
    private static mtk m71196to(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46264m9, iGenericList, c1095fc);
        if (iGenericList.get_Item(1).m67728x1() != 3) {
            throw new mdp("#VALUE!");
        }
        String string = iGenericList.get_Item(0).m67722k4().toString();
        C0909dp c0909dp = (C0909dp) iGenericList.get_Item(1).m67722k4();
        switch (f49143k4.m27428k4(string)) {
            case 31:
                String strM67402k4 = C14113y2.m67402k4("${0}${1}", C13712k4.m63643k4(c0909dp.m5202kk().m5607x1()), Integer.valueOf(c0909dp.m5204x1().m4031x1()));
                if (!C14113y2.m67363du(c1095fc.m6116k4().mo3436k4().mo5429x1(), c0909dp.mo3720k4())) {
                    String strM7625to = ((idr) c1095fc.m6116k4().mo3436k4().mo5425k4()).m7625to();
                    boolean zM67411k4 = C14113y2.m67411k4(strM7625to);
                    String strMo3720k4 = c0909dp.mo3720k4();
                    strM67402k4 = !zM67411k4 ? C14113y2.m67402k4("'[{0}]{1}'!{2}", strM7625to, strMo3720k4, strM67402k4) : C14113y2.m67402k4("'{0}'!{1}", strMo3720k4, strM67402k4);
                }
                return new mtk(strM67402k4);
            case 32:
                return new mtk(C14057f9.m66591x1(c0909dp.m5202kk().m5607x1()));
            case 33:
                return new mtk(C14057f9.m66591x1(c0909dp.m5204x1().m4031x1()));
            default:
                throw new mdp("#VALUE!");
        }
    }

    /* JADX INFO: renamed from: u4 */
    private static mtk m71197u4(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46272uz, iGenericList, c1095fc);
        mtk mtkVarClone = iGenericList.get_Item(0).m67730x1(c1095fc.m6116k4()).Clone();
        mtk mtkVarClone2 = iGenericList.get_Item(1).Clone();
        int iM67729x1 = iGenericList.get_Item(2).m67729x1(c1095fc);
        boolean zM67724k4 = (iGenericList.size() < 4 ? new mtk(true) : iGenericList.get_Item(3)).Clone().m67724k4(c1095fc);
        if (mtkVarClone2.m67728x1() != 3) {
            throw new CellUnsupportedDataException("The VLOOKUP function requires a cell range reference as the second argument.");
        }
        InterfaceC14885zh interfaceC14885zhMo5427k4 = c1095fc.m6116k4().mo3436k4().mo5427k4((InterfaceC0761as) mtkVarClone2.m67722k4());
        if (interfaceC14885zhMo5427k4 == null) {
            throw new mdp("#VALUE!");
        }
        if (iM67729x1 < 1) {
            throw new mdp("#VALUE!");
        }
        if (iM67729x1 > interfaceC14885zhMo5427k4.mo7375m9()) {
            throw new mdp("#REF!");
        }
        int iM71184k4 = zM67724k4 ? m71184k4(mtkVarClone.Clone(), interfaceC14885zhMo5427k4.mo7374kk(1), true, c1095fc) : m71183k4(mtkVarClone.Clone(), interfaceC14885zhMo5427k4.mo7374kk(1), c1095fc);
        if (iM71184k4 != -1) {
            return mtk.m67718k4(interfaceC14885zhMo5427k4.mo7372k4().mo5426k4(interfaceC14885zhMo5427k4.mo7377x1() + iM71184k4, (interfaceC14885zhMo5427k4.mo7373kk() + iM67729x1) - 1));
        }
        throw new mdp("#N/A");
    }

    /* JADX INFO: renamed from: um */
    private static mtk m71198um(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        Object objM27464to;
        m71188k4(C13844mo.f46270um, iGenericList, c1095fc);
        List list = new List();
        IGenericEnumerator<InterfaceC1124fx> it = iGenericList.iterator();
        while (true) {
            try {
                boolean zHasNext = it.hasNext();
                Class cls = Double.TYPE;
                if (!zHasNext) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    List.Enumerator it2 = list.iterator();
                    double d = 0.0d;
                    double dDoubleValue = 0.0d;
                    while (it2.hasNext()) {
                        try {
                            dDoubleValue += ((Double) C7019kk.m27464to(it2.next(), cls)).doubleValue();
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    double size = dDoubleValue / ((double) list.size());
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            double dDoubleValue2 = ((Double) C7019kk.m27464to(it2.next(), cls)).doubleValue() - size;
                            d += dDoubleValue2 * dDoubleValue2;
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    return new mtk(d / ((double) (list.size() - 1)));
                }
                mtk next = it.next();
                if (next.m67728x1() == 3) {
                    if (C7019kk.m27469x1(next.m67722k4(), C0909dp.class)) {
                        wdt wdtVar = (wdt) c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(((C0909dp) next.m67722k4()).mo3720k4()).mo5428x1(((C0909dp) next.m67722k4()).m5204x1().m4031x1(), ((C0909dp) next.m67722k4()).m5202kk().m5607x1());
                        if (wdtVar.m72689ks().mo3431dy() != 1) {
                            throw new mdp("#VALUE!");
                        }
                        objM27464to = C7019kk.m27464to(wdtVar.m72689ks().mo3449to(), (Class<Object>) cls);
                        list.addItem(objM27464to);
                    } else {
                        it = m71185k4(next.Clone(), c1095fc).iterator();
                        while (it.hasNext()) {
                            try {
                                wdt wdtVar2 = (wdt) it.next();
                                if (wdtVar2.m72689ks().mo3431dy() != 1) {
                                    throw new mdp("#VALUE!");
                                }
                                list.addItem(C7019kk.m27464to(wdtVar2.m72689ks().mo3449to(), cls));
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
                } else if (next.m67728x1() == 1) {
                    objM27464to = C7019kk.m27464to(next.m67722k4(), (Class<Object>) cls);
                    list.addItem(objM27464to);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: up */
    private static mtk m71199up(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46267rv, iGenericList, c1095fc);
        String strM71205x1 = m71205x1(iGenericList.get_Item(0).Clone(), c1095fc);
        if (iGenericList.size() > 1) {
            boolean[] zArr = {false};
            boolean zM66556k4 = C14051ck.m66556k4(m71205x1(iGenericList.get_Item(1).Clone(), c1095fc), zArr);
            boolean z = zArr[0];
            if (!zM66556k4) {
                throw new mdp("#VALUE!");
            }
            if (!z) {
                return new mtk(dj6.m5113k4(strM71205x1, c1095fc.m6116k4().mo3436k4().mo5429x1()));
            }
        }
        return C14113y2.m67359c5(strM71205x1, C18241k5.f55433h) ? new mtk(C13712k4.m63642k4(strM71205x1, c1095fc.m6116k4())) : C14113y2.m67359c5(strM71205x1, "!") ? new mtk(C13712k4.m63639k4(strM71205x1, c1095fc.m6116k4().mo3443kk(), c1095fc.m6116k4().mo3452x1())) : new mtk(C13712k4.m63640k4(strM71205x1, c1095fc.m6116k4().mo3443kk(), c1095fc.m6116k4().mo3452x1(), c1095fc.m6116k4().mo3436k4().mo5429x1()));
    }

    /* JADX INFO: renamed from: uz */
    private static mtk m71200uz(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46274wl, iGenericList, c1095fc);
        mtk mtkVarClone = iGenericList.get_Item(0).m67730x1(c1095fc.m6116k4()).Clone();
        mtk mtkVarClone2 = iGenericList.get_Item(1).Clone();
        double dM67725kk = (iGenericList.size() < 3 ? new mtk(1.0d) : iGenericList.get_Item(2)).Clone().m67725kk(c1095fc);
        if (mtkVarClone2.m67728x1() != 3) {
            throw new CellUnsupportedDataException("The MATCH function supports the vector form only.");
        }
        InterfaceC14885zh interfaceC14885zhMo5427k4 = c1095fc.m6116k4().mo3436k4().mo5427k4((InterfaceC0761as) mtkVarClone2.m67722k4());
        if (interfaceC14885zhMo5427k4 == null) {
            throw new mdp("#VALUE!");
        }
        if (!interfaceC14885zhMo5427k4.mo7376to() && !interfaceC14885zhMo5427k4.mo7366du()) {
            throw new mdp("#N/A");
        }
        int iM71184k4 = dM67725kk < 0.0d ? m71184k4(mtkVarClone.Clone(), interfaceC14885zhMo5427k4, false, c1095fc) : dM67725kk > 0.0d ? m71184k4(mtkVarClone.Clone(), interfaceC14885zhMo5427k4, true, c1095fc) : m71183k4(mtkVarClone.Clone(), interfaceC14885zhMo5427k4, c1095fc);
        if (iM71184k4 != -1) {
            return new mtk(((double) iM71184k4) + 1.0d);
        }
        throw new mdp("#N/A");
    }

    /* JADX INFO: renamed from: v4 */
    private static mtk m71201v4(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46263lr, iGenericList, c1095fc);
        mtk mtkVarClone = iGenericList.get_Item(0).Clone();
        if (C7019kk.m27469x1(mtkVarClone.m67722k4(), C0958eo.class) || (C7019kk.m27469x1(mtkVarClone.m67722k4(), xdd.class) && ((C0909dp) ((xdd) mtkVarClone.m67722k4()).m73330x1()).m5202kk().m5607x1() == ((C0909dp) ((xdd) mtkVarClone.m67722k4()).m73329kk()).m5202kk().m5607x1())) {
            return new mtk(m71191lr(iGenericList, c1095fc));
        }
        if (C7019kk.m27469x1(mtkVarClone.m67722k4(), b6d.class) || (C7019kk.m27469x1(mtkVarClone.m67722k4(), xdd.class) && ((C0909dp) ((xdd) mtkVarClone.m67722k4()).m73330x1()).m5204x1().m4031x1() == ((C0909dp) ((xdd) mtkVarClone.m67722k4()).m73329kk()).m5204x1().m4031x1())) {
            return new mtk(m71207yd(iGenericList, c1095fc));
        }
        throw new mdp("#VALUE!");
    }

    /* JADX INFO: renamed from: wl */
    private static mtk m71202wl(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46266qq, iGenericList, c1095fc);
        String strM71205x1 = m71205x1(iGenericList.get_Item(0).Clone(), c1095fc);
        if (iGenericList.size() == 1) {
            return new mtk(C14117yj.m67537ne(strM71205x1.charAt(strM71205x1.length() - 1)));
        }
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(m71205x1(iGenericList.get_Item(1).Clone(), c1095fc), iArr);
        int i = iArr[0];
        if (!zM66590k4) {
            throw new mdp("#VALUE!");
        }
        if (i >= 0) {
            return strM71205x1.length() <= i ? new mtk(strM71205x1) : new mtk(C14113y2.m67422kk(strM71205x1, strM71205x1.length() - i));
        }
        throw new mdp("#VALUE!");
    }

    /* JADX INFO: renamed from: wy */
    private static mtk m71203wy(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46249ak, iGenericList, c1095fc);
        String strM67400k4 = C14113y2.f47374k4;
        IGenericEnumerator<mtk> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, it.next().m67727to(c1095fc));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new mtk(strM67400k4);
    }

    /* JADX INFO: renamed from: x1 */
    private static mtk m71204x1(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46256du, iGenericList, c1095fc);
        IGenericEnumerator<mtk> it = iGenericList.iterator();
        double dDoubleValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            try {
                InterfaceC13755l1 interfaceC13755l1M67721du = it.next().m67721du(c1095fc);
                while (interfaceC13755l1M67721du.hasNext()) {
                    dDoubleValue += interfaceC13755l1M67721du.next().doubleValue();
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (i != 0) {
            return new mtk(dDoubleValue / ((double) i));
        }
        throw new mdp("#DIV/0!");
    }

    /* JADX INFO: renamed from: x6 */
    private static mtk m71206x6(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46265ne, iGenericList, c1095fc);
        String strM71205x1 = m71205x1(iGenericList.get_Item(0).Clone(), c1095fc);
        if (iGenericList.size() == 1) {
            return new mtk(C14117yj.m67537ne(strM71205x1.charAt(0)));
        }
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(m71205x1(iGenericList.get_Item(1).Clone(), c1095fc), iArr);
        int i = iArr[0];
        if (!zM66590k4) {
            throw new mdp("#VALUE!");
        }
        if (i >= 0) {
            return strM71205x1.length() <= i ? new mtk(strM71205x1) : new mtk(C14113y2.m67443x1(strM71205x1, 0, i));
        }
        throw new mdp("#VALUE!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.aspose.slides.y7] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX INFO: renamed from: yd */
    private static double m71207yd(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        b6d b6dVar;
        int iM5607x1;
        int iM5607x12;
        double dDoubleValue;
        b6d b6dVar2;
        int iM5607x13;
        ?? r11;
        ?? r7 = 1;
        if (C7019kk.m27469x1(iGenericList.get_Item(0).m67722k4(), b6d.class)) {
            b6dVar = (b6d) iGenericList.get_Item(0).m67722k4();
            iM5607x1 = 1;
            iM5607x12 = 1000;
        } else {
            if (!C7019kk.m27469x1(iGenericList.get_Item(0).m67722k4(), xdd.class)) {
                throw new mdp("#VALUE!");
            }
            b6dVar = new b6d(((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73330x1()).m5204x1().m4031x1(), true, ((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73330x1()).m5204x1().mo3720k4());
            iM5607x1 = ((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73330x1()).m5202kk().m5607x1();
            iM5607x12 = ((C0909dp) ((xdd) iGenericList.get_Item(0).m67722k4()).m73329kk()).m5202kk().m5607x1();
        }
        IGenericList<InterfaceC1124fx> iGenericListMo5424k4 = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(b6dVar.mo3720k4()).mo5424k4(b6dVar.m4031x1(), iM5607x1, b6dVar.m4031x1(), iM5607x12);
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<InterfaceC1124fx> it = iGenericListMo5424k4.iterator();
        while (true) {
            try {
                dDoubleValue = 0.0d;
                if (!it.hasNext()) {
                    break;
                }
                wdt wdtVar = (wdt) it.next();
                double[] dArr = {0.0d};
                boolean zM66436k4 = C14044b3.m66436k4(wdtVar.mo3446m9(), dArr);
                double d = dArr[0];
                if (zM66436k4) {
                    dictionary.addItem(Integer.valueOf(wdtVar.mo3443kk()), Double.valueOf(d));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int i = 1;
        while (i < iGenericList.size() - r7) {
            if (C7019kk.m27469x1(iGenericList.get_Item(i).m67722k4(), b6d.class)) {
                b6dVar2 = (b6d) iGenericList.get_Item(i).m67722k4();
                r11 = r7;
                iM5607x13 = 1000;
            } else {
                if (!C7019kk.m27469x1(iGenericList.get_Item(i).m67722k4(), xdd.class)) {
                    throw new mdp("#VALUE!");
                }
                b6dVar2 = new b6d(((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73330x1()).m5204x1().m4031x1(), r7, ((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73330x1()).m5204x1().mo3720k4());
                int iM5607x14 = ((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73330x1()).m5202kk().m5607x1();
                iM5607x13 = ((C0909dp) ((xdd) iGenericList.get_Item(i).m67722k4()).m73329kk()).m5202kk().m5607x1();
                r11 = iM5607x14;
            }
            ?? r16 = r7;
            IGenericList<InterfaceC1124fx> iGenericListMo5424k42 = c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(b6dVar.mo3720k4()).mo5424k4(b6dVar2.m4031x1(), r11, b6dVar2.m4031x1(), iM5607x13);
            String strM71205x1 = m71205x1(iGenericList.get_Item(i + 1).Clone(), c1095fc);
            IGenericEnumerator<InterfaceC1124fx> it2 = iGenericListMo5424k42.iterator();
            while (it2.hasNext()) {
                try {
                    wdt wdtVar2 = (wdt) it2.next();
                    if (!C14113y2.m67363du(wdtVar2.mo3446m9(), strM71205x1)) {
                        dictionary.removeItemByKey(Integer.valueOf(wdtVar2.mo3443kk()));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            i += 2;
            r7 = r16 == true ? 1 : 0;
        }
        Dictionary.Enumerator it3 = dictionary.iterator();
        while (it3.hasNext()) {
            try {
                dDoubleValue += ((Double) it3.next().getValue()).doubleValue();
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        return C14116yg.m67497to(dDoubleValue);
    }

    /* JADX INFO: renamed from: yj */
    private static mtk m71208yj(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        if (iGenericList == null || iGenericList.size() == 0) {
            return new mtk(false);
        }
        for (int i = 0; i < iGenericList.size(); i++) {
            if (iGenericList.get_Item(i).m67724k4(c1095fc)) {
                return new mtk(true);
            }
        }
        return new mtk(false);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m71184k4(mtk mtkVar, InterfaceC14885zh interfaceC14885zh, boolean z, C1095fc c1095fc) {
        int iMo3452x1;
        int iMo7377x1;
        C6005k4.m24261k4(interfaceC14885zh.mo7376to() || interfaceC14885zh.mo7366du());
        C6005k4.m24261k4(c1095fc != null);
        mj1 mj1Var = new mj1(c1095fc);
        IGenericEnumerator<InterfaceC1124fx> it = interfaceC14885zh.iterator();
        InterfaceC1124fx interfaceC1124fx = null;
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            try {
                InterfaceC1124fx next = it.next();
                mtk mtkVar2 = new mtk();
                try {
                    mtk.m67718k4(next).CloneTo(mtkVar2);
                    if (mtkVar2.m67728x1() == mtkVar.m67728x1()) {
                        mtk mtkVarClone = mj1Var.m64913k4(mtkVar2.Clone(), mtkVar.Clone()).Clone();
                        if (mtkVarClone.m67728x1() != 1) {
                            throw new InvalidOperationException(C14113y2.m67402k4("An unknown type of comparison operation result for operands: '{0}', '{1}'.", mtkVar2.m67722k4().toString(), mtkVar.m67722k4().toString()));
                        }
                        int iM27462to = C7019kk.m27462to(C7019kk.m27464to(mtkVarClone.m67722k4(), Double.TYPE), 14);
                        if (!z) {
                            if (iM27462to < 0) {
                                break;
                            }
                            if (interfaceC1124fx != null && i == 0) {
                                break;
                            }
                            interfaceC1124fx = next;
                            i = iM27462to;
                        } else {
                            if (iM27462to > 0) {
                            }
                            interfaceC1124fx = next;
                            i = iM27462to;
                        }
                    }
                } catch (mdp unused) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (interfaceC1124fx == null) {
            return -1;
        }
        if (interfaceC14885zh.mo7376to()) {
            iMo3452x1 = interfaceC1124fx.mo3443kk();
            iMo7377x1 = interfaceC14885zh.mo7373kk();
        } else {
            iMo3452x1 = interfaceC1124fx.mo3452x1();
            iMo7377x1 = interfaceC14885zh.mo7377x1();
        }
        return iMo3452x1 - iMo7377x1;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m71205x1(mtk mtkVar, C1095fc c1095fc) {
        int iM67728x1 = mtkVar.m67728x1();
        return iM67728x1 != 0 ? iM67728x1 != 1 ? iM67728x1 != 3 ? mtkVar.m67722k4().toString() : mtkVar.m67730x1(c1095fc.m6116k4()).m67722k4().toString() : C14044b3.m66425h4(mtkVar.m67725kk(c1095fc)) : C14051ck.m66557x1(mtkVar.m67724k4(c1095fc));
    }

    /* JADX INFO: renamed from: k4 */
    private static IGenericEnumerable<InterfaceC1124fx> m71185k4(mtk mtkVar, C1095fc c1095fc) {
        if (C7019kk.m27469x1(mtkVar.m67722k4(), C0958eo.class)) {
            C0958eo c0958eo = (C0958eo) mtkVar.m67722k4();
            return c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(c0958eo.mo3720k4()).mo5424k4(1, c0958eo.m5607x1(), 1000, c0958eo.m5607x1());
        }
        if (C7019kk.m27469x1(mtkVar.m67722k4(), b6d.class)) {
            b6d b6dVar = (b6d) mtkVar.m67722k4();
            return c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(b6dVar.mo3720k4()).mo5424k4(b6dVar.m4031x1(), 1, b6dVar.m4031x1(), 1000);
        }
        if (!C7019kk.m27469x1(mtkVar.m67722k4(), xdd.class)) {
            throw new mdp("#VALUE!");
        }
        xdd xddVar = (xdd) mtkVar.m67722k4();
        return c1095fc.m6116k4().mo3436k4().mo5425k4().mo5384k4(xddVar.mo3720k4()).mo5424k4(((C0909dp) xddVar.m73330x1()).m5204x1().m4031x1(), ((C0909dp) xddVar.m73330x1()).m5202kk().m5607x1(), ((C0909dp) xddVar.m73329kk()).m5204x1().m4031x1(), ((C0909dp) xddVar.m73329kk()).m5202kk().m5607x1());
    }

    /* JADX INFO: renamed from: k4 */
    private static mtk m71186k4(IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        m71188k4(C13844mo.f46268to, iGenericList, c1095fc);
        return new mtk(C14116yg.m67475k4(iGenericList.get_Item(0).m67725kk(c1095fc)));
    }

    /* JADX INFO: renamed from: k4 */
    public static mtk m71187k4(String str, IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        switch (f49143k4.m27428k4(str)) {
            case 0:
                return m71186k4(iGenericList, c1095fc);
            case 1:
                return m71190ks(iGenericList, c1095fc);
            case 2:
                return m71204x1(iGenericList, c1095fc);
            case 3:
                return m71189kk(iGenericList, c1095fc);
            case 4:
                return m71196to(iGenericList, c1095fc);
            case 5:
                return m71177du(iGenericList, c1095fc);
            case 6:
                return m71180h4(iGenericList, c1095fc);
            case 7:
                return m71192m9(iGenericList, c1095fc);
            case 8:
                return m71178dy(iGenericList, c1095fc);
            case 9:
                return m71175c5(iGenericList, c1095fc);
            case 10:
                return m71182jd(iGenericList, c1095fc);
            case 11:
                return m71176ck(iGenericList, c1095fc);
            case 12:
                return m71179fa(iGenericList, c1095fc);
            case 13:
                return m71199up(iGenericList, c1095fc);
            case 14:
                return m71195rv(iGenericList, c1095fc);
            case 15:
                return m71206x6(iGenericList, c1095fc);
            case 16:
                return m71193ne(iGenericList, c1095fc);
            case 17:
                return m71181ix(iGenericList, c1095fc);
            case 18:
                return m71200uz(iGenericList, c1095fc);
            case 19:
                return m71202wl(iGenericList, c1095fc);
            case 20:
                return m71194qq(iGenericList, c1095fc);
            case 21:
                return m71172ar(iGenericList, c1095fc);
            case 22:
                return m71198um(iGenericList, c1095fc);
            case 23:
                return m71174bv(iGenericList, c1095fc);
            case 24:
                return m71201v4(iGenericList, c1095fc);
            case 25:
                return m71197u4(iGenericList, c1095fc);
            case 26:
                return m71208yj(iGenericList, c1095fc);
            case 27:
                return m71173b3(iGenericList, c1095fc);
            case 28:
                return m71203wy(iGenericList, c1095fc);
            case 29:
                return m71203wy(iGenericList, c1095fc);
            case 30:
                return m71171ak(iGenericList, c1095fc);
            default:
                throw new CellUnsupportedDataException(C14113y2.m67408k4("Function ", str, " is not supported"));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71188k4(C13844mo c13844mo, IGenericList<mtk> iGenericList, C1095fc c1095fc) {
        String strM67402k4;
        int size = iGenericList.size();
        int i = c13844mo.f46281x1;
        if (i > size || size > c13844mo.f46280kk) {
            int i2 = c13844mo.f46280kk;
            if (i == i2) {
                strM67402k4 = C14113y2.m67402k4("The {0} function must have {1} argument(s).", c13844mo.f46279k4, Integer.valueOf(i));
            } else if (i + 1 == i2) {
                strM67402k4 = C14113y2.m67402k4("The {0} function must have {1} argument(s).", c13844mo.f46279k4, Integer.valueOf(i), " or ", Integer.valueOf(c13844mo.f46280kk));
            } else if (i + 2 != i2) {
                String str = c13844mo.f46279k4;
                strM67402k4 = size < i ? C14113y2.m67402k4("The {0} function must have at least {1} argument(s).", str, Integer.valueOf(i)) : C14113y2.m67402k4("The {0} function must have {1} argument(s).", str, Integer.valueOf(i));
            } else {
                strM67402k4 = C14113y2.m67402k4("The {0} function must have {1} argument(s).", c13844mo.f46279k4, C14113y2.m67402k4("{0},{1} or {2}", Integer.valueOf(i), Integer.valueOf(c13844mo.f46281x1 + 1), Integer.valueOf(c13844mo.f46280kk)));
            }
            throw new CellInvalidFormulaException(strM67402k4, c1095fc.m6116k4().mo3438k4(0, true));
        }
    }
}
