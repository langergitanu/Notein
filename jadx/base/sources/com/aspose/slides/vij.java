package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p407st.C10357al;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10592pm;
import com.aspose.slides.internal.p407st.C10693wk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class vij {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49549k4 = new C7017h4("par", "seq", "anim", "animClr", "animEffect", "animMotion", "animRot", "animScale", "set", "cmd", "audio", "video");

    /* JADX INFO: renamed from: com.aspose.slides.vij$k4 */
    public static abstract class AbstractC14689k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void m72306k4(C10592pm c10592pm);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m72291k4(C10693wk c10693wk, a3u a3uVar) {
        if (c10693wk == null) {
            a3uVar.m3185k4("TimeNodeAtom is not exists.", 0);
            return 0;
        }
        if (c10693wk.m51895dy() || c10693wk.m51900kk() == 4) {
            return c10693wk.m51900kk();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72292k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10357al c10357al, m4c m4cVar) {
        if (c10357al.m50704du() != null) {
            rr4.m70325k4((com.aspose.slides.internal.p332p7.nbb) rqzVar.m40178k4("animClr").m29542x1(), c10357al, m4cVar);
        }
        if (c10357al.m50706h4() != null) {
            x4y.m73100k4((com.aspose.slides.internal.p332p7.oeg) rqzVar.m40178k4("set").m29542x1(), c10357al, m4cVar);
        }
        if (c10357al.m50708m9() != null) {
            q6e.m69436k4((com.aspose.slides.internal.p332p7.zv9) rqzVar.m40178k4("cmd").m29542x1(), c10357al, m4cVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72293k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10409du c10409du, gi8 gi8Var, AbstractC14689k4 abstractC14689k4, boolean z) {
        com.aspose.slides.internal.p332p7.rqz rqzVarM36322wy;
        com.aspose.slides.internal.p332p7.lmh lmhVarM37765h4;
        if (rqzVar == null) {
            return;
        }
        List.Enumerator<C7394ca> it = rqzVar.m40177k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                C10409du c10357al = z ? new C10357al() : new C10562nk();
                c10409du.m50513yj().addItem(c10357al);
                switch (f49549k4.m27428k4(next.m29539k4())) {
                    case 0:
                        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) next.m29542x1();
                        ubb.m71607k4(rx0Var.m40596k4(), c10357al, 0);
                        ubb.m71606k4(rx0Var.m40596k4(), c10357al);
                        if (abstractC14689k4 != null) {
                            abstractC14689k4.m72306k4(c10357al.m50709to());
                        }
                        ubb.m71631x1(rx0Var.m40596k4(), c10357al);
                        g3j.m6410k4(rx0Var.m40596k4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(rx0Var.m40596k4().m36307lr(), c10357al, 2, gi8Var);
                        ubb.m71620kk(rx0Var.m40596k4(), c10357al);
                        if (rx0Var.m40596k4().m36277ak() != null) {
                            m72293k4(rx0Var.m40596k4().m36277ak(), c10357al, gi8Var, null, true);
                        }
                        if (C7019kk.m27469x1(c10357al, C10562nk.class)) {
                            rqzVarM36322wy = rx0Var.m40596k4().m36322wy();
                            m72294k4(rqzVarM36322wy, (C10562nk) c10357al, gi8Var);
                        }
                        break;
                    case 1:
                        com.aspose.slides.internal.p332p7.rvh rvhVar = (com.aspose.slides.internal.p332p7.rvh) next.m29542x1();
                        ubb.m71607k4(rvhVar.m40577h4(), c10357al, 1);
                        c10357al.m50710x1().m51901kk(true);
                        ubb.m71606k4(rvhVar.m40577h4(), c10357al);
                        ubb.m71613k4(rvhVar, c10357al);
                        g3j.m6410k4(rvhVar.m40576dy(), c10357al, 3, gi8Var);
                        g3j.m6410k4(rvhVar.m40581m9(), c10357al, 4, gi8Var);
                        g3j.m6410k4(rvhVar.m40577h4().m36320v4(), c10357al, 1, gi8Var);
                        c7w.m4510k4(rvhVar.m40577h4().m36329yd(), c10357al, 5, gi8Var);
                        ubb.m71620kk(rvhVar.m40577h4(), c10357al);
                        if (C7019kk.m27469x1(c10357al, C10562nk.class)) {
                            rqzVarM36322wy = rvhVar.m40577h4().m36322wy();
                            m72294k4(rqzVarM36322wy, (C10562nk) c10357al, gi8Var);
                        }
                        break;
                    case 2:
                        com.aspose.slides.internal.p332p7.it6 it6Var = (com.aspose.slides.internal.p332p7.it6) next.m29542x1();
                        ubb.m71607k4(it6Var.m34447m9().m37765h4(), c10357al, 3);
                        ubb.m71606k4(it6Var.m34447m9().m37765h4(), c10357al);
                        blo.m4249k4(it6Var, c10357al, gi8Var);
                        g3j.m6410k4(it6Var.m34447m9().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(it6Var.m34447m9().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = it6Var.m34447m9().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 3:
                        com.aspose.slides.internal.p332p7.nbb nbbVar = (com.aspose.slides.internal.p332p7.nbb) next.m29542x1();
                        ubb.m71607k4(nbbVar.m37354h4().m37765h4(), c10357al, 3);
                        ubb.m71606k4(nbbVar.m37354h4().m37765h4(), c10357al);
                        rr4.m70326k4(nbbVar, c10357al, gi8Var);
                        g3j.m6410k4(nbbVar.m37354h4().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(nbbVar.m37354h4().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = nbbVar.m37354h4().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 4:
                        com.aspose.slides.internal.p332p7.i4y i4yVar = (com.aspose.slides.internal.p332p7.i4y) next.m29542x1();
                        ubb.m71607k4(i4yVar.m33856to().m37765h4(), c10357al, 3);
                        ubb.m71606k4(i4yVar.m33856to().m37765h4(), c10357al);
                        sgr.m70619k4(i4yVar, c10357al, gi8Var);
                        g3j.m6410k4(i4yVar.m33856to().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(i4yVar.m33856to().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = i4yVar.m33856to().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 5:
                        com.aspose.slides.internal.p332p7.glt gltVar = (com.aspose.slides.internal.p332p7.glt) next.m29542x1();
                        ubb.m71607k4(gltVar.m32641jd().m37765h4(), c10357al, 3);
                        ubb.m71606k4(gltVar.m32641jd().m37765h4(), c10357al);
                        wkx.m72778k4(gltVar, c10357al, gi8Var);
                        g3j.m6410k4(gltVar.m32641jd().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(gltVar.m32641jd().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = gltVar.m32641jd().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 6:
                        com.aspose.slides.internal.p332p7.u4g u4gVar = (com.aspose.slides.internal.p332p7.u4g) next.m29542x1();
                        ubb.m71607k4(u4gVar.m42101to().m37765h4(), c10357al, 3);
                        ubb.m71606k4(u4gVar.m42101to().m37765h4(), c10357al);
                        bw1.m4339k4(u4gVar, c10357al, gi8Var);
                        g3j.m6410k4(u4gVar.m42101to().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(u4gVar.m42101to().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = u4gVar.m42101to().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 7:
                        com.aspose.slides.internal.p332p7.s0t s0tVar = (com.aspose.slides.internal.p332p7.s0t) next.m29542x1();
                        ubb.m71607k4(s0tVar.m40701du().m37765h4(), c10357al, 3);
                        ubb.m71606k4(s0tVar.m40701du().m37765h4(), c10357al);
                        u8b.m71518k4(s0tVar, c10357al, gi8Var);
                        g3j.m6410k4(s0tVar.m40701du().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(s0tVar.m40701du().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = s0tVar.m40701du().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 8:
                        com.aspose.slides.internal.p332p7.oeg oegVar = (com.aspose.slides.internal.p332p7.oeg) next.m29542x1();
                        ubb.m71607k4(oegVar.m38216x1().m37765h4(), c10357al, 3);
                        ubb.m71606k4(oegVar.m38216x1().m37765h4(), c10357al);
                        x4y.m73101k4(oegVar, c10357al, gi8Var);
                        g3j.m6410k4(oegVar.m38216x1().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(oegVar.m38216x1().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = oegVar.m38216x1().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 9:
                        com.aspose.slides.internal.p332p7.zv9 zv9Var = (com.aspose.slides.internal.p332p7.zv9) next.m29542x1();
                        ubb.m71607k4(zv9Var.m45969kk().m37765h4(), c10357al, 3);
                        ubb.m71606k4(zv9Var.m45969kk().m37765h4(), c10357al);
                        q6e.m69437k4(zv9Var, c10357al, gi8Var);
                        g3j.m6410k4(zv9Var.m45969kk().m37765h4().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(zv9Var.m45969kk().m37765h4().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = zv9Var.m45969kk().m37765h4();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 10:
                        com.aspose.slides.internal.p332p7.c6b c6bVar = (com.aspose.slides.internal.p332p7.c6b) next.m29542x1();
                        ubb.m71607k4(c6bVar.m29443x1().m42700du(), c10357al, 4);
                        ubb.m71606k4(c6bVar.m29443x1().m42700du(), c10357al);
                        pk1.m69124k4(c6bVar.m29443x1(), c10357al.m50709to());
                        fut.m6319k4(c6bVar.m29443x1().m42701h4(), c10357al, gi8Var);
                        g3j.m6410k4(c6bVar.m29443x1().m42700du().m36320v4(), c10357al, 1, gi8Var);
                        g3j.m6410k4(c6bVar.m29443x1().m42700du().m36307lr(), c10357al, 2, gi8Var);
                        lmhVarM37765h4 = c6bVar.m29443x1().m42700du();
                        ubb.m71620kk(lmhVarM37765h4, c10357al);
                        break;
                    case 11:
                        C10693wk c10693wk = new C10693wk();
                        c10693wk.m51897k4(4);
                        c10357al.m50513yj().addItem(c10693wk);
                        break;
                    default:
                        throw new InvalidOperationException();
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
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72294k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10562nk c10562nk, gi8 gi8Var) {
        m72293k4(rqzVar, c10562nk, gi8Var, null, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72295k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk.m51373ks() != null) {
            blo.m4250k4((com.aspose.slides.internal.p332p7.it6) rqzVar.m40178k4("anim").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m50704du() != null) {
            rr4.m70327k4((com.aspose.slides.internal.p332p7.nbb) rqzVar.m40178k4("animClr").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m51376rv() != null) {
            sgr.m70621k4((com.aspose.slides.internal.p332p7.i4y) rqzVar.m40178k4("animEffect").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m51380x6() != null) {
            wkx.m72779k4((com.aspose.slides.internal.p332p7.glt) rqzVar.m40178k4("animMotion").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m51374ne() != null) {
            bw1.m4340k4((com.aspose.slides.internal.p332p7.u4g) rqzVar.m40178k4("animRot").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m51372ix() != null) {
            u8b.m71520k4((com.aspose.slides.internal.p332p7.s0t) rqzVar.m40178k4("animScale").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m50706h4() != null) {
            x4y.m73104k4((com.aspose.slides.internal.p332p7.oeg) rqzVar.m40178k4("set").m29542x1(), c10562nk, m4cVar);
        }
        if (c10562nk.m50708m9() != null) {
            q6e.m69438k4((com.aspose.slides.internal.p332p7.zv9) rqzVar.m40178k4("cmd").m29542x1(), c10562nk, m4cVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72296k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10357al[] c10357alArr, m4c m4cVar) {
        com.aspose.slides.internal.p332p7.lmh lmhVarM40596k4;
        AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2> abstractC4685kk;
        AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2> abstractC4685kk2;
        if (c10357alArr == null || c10357alArr.length == 0) {
            return;
        }
        for (C10357al c10357al : c10357alArr) {
            int iM72291k4 = m72291k4(c10357al.m50710x1(), m4cVar.m64712du());
            if (iM72291k4 == 0) {
                final com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) rqzVar.m40178k4("par").m29542x1();
                lmhVarM40596k4 = rx0Var.m40596k4();
                abstractC4685kk = new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rx0Var.m40596k4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rx0Var.m40596k4().m36293k4();
                    }
                };
                abstractC4685kk2 = new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rx0Var.m40596k4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rx0Var.m40596k4().m36323x1();
                    }
                };
            } else if (iM72291k4 != 1) {
                if (iM72291k4 == 3) {
                    m72292k4(rqzVar, c10357al, m4cVar);
                } else {
                    if (iM72291k4 != 4) {
                        throw new InvalidOperationException();
                    }
                    pk1.m69122k4(rqzVar, c10357al, m4cVar);
                }
            } else {
                final com.aspose.slides.internal.p332p7.rvh rvhVar = (com.aspose.slides.internal.p332p7.rvh) rqzVar.m40178k4("seq").m29542x1();
                lmhVarM40596k4 = rvhVar.m40577h4();
                abstractC4685kk = new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.7
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rvhVar.m40577h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rvhVar.m40577h4().m36293k4();
                    }
                };
                abstractC4685kk2 = new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.8
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rvhVar.m40577h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rvhVar.m40577h4().m36323x1();
                    }
                };
            }
            ubb.m71605k4(lmhVarM40596k4, abstractC4685kk, abstractC4685kk2, c10357al, m4cVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72297k4(com.aspose.slides.internal.p332p7.rqz rqzVar, C10562nk[] c10562nkArr, boolean z, m4c m4cVar) {
        if (c10562nkArr == null) {
            return;
        }
        for (C10562nk c10562nk : c10562nkArr) {
            int iM72291k4 = m72291k4(c10562nk.m50710x1(), m4cVar.m64712du());
            if (iM72291k4 == 0) {
                final com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) rqzVar.m40178k4("par").m29542x1();
                rx0Var.m40596k4().m36296k4(m4cVar.m64724kk());
                ubb.m71605k4(rx0Var.m40596k4(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rx0Var.m40596k4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rx0Var.m40596k4().m36293k4();
                    }
                }, new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rx0Var.m40596k4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rx0Var.m40596k4().m36323x1();
                    }
                }, c10562nk, m4cVar);
                if (z && rqzVar.m40177k4().size() == 1 && rx0Var.m40596k4().m36317um() != 8) {
                    rx0Var.m40596k4().m36309m9((byte) 8);
                }
            } else if (iM72291k4 == 1) {
                final com.aspose.slides.internal.p332p7.rvh rvhVar = (com.aspose.slides.internal.p332p7.rvh) rqzVar.m40178k4("seq").m29542x1();
                rvhVar.m40577h4().m36296k4(m4cVar.m64724kk());
                ubb.m71605k4(rvhVar.m40577h4(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rvhVar.m40577h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddStCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rvhVar.m40577h4().m36293k4();
                    }
                }, new AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2>() { // from class: com.aspose.slides.vij.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rvhVar.m40577h4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLCommonTimeNodeDataElementData.AddEndCondLst()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public com.aspose.slides.internal.p332p7.ei2 invoke() {
                        return rvhVar.m40577h4().m36323x1();
                    }
                }, c10562nk, m4cVar);
            } else if (iM72291k4 == 3) {
                m72295k4(rqzVar, c10562nk, m4cVar);
            } else {
                if (iM72291k4 != 4) {
                    throw new InvalidOperationException();
                }
                pk1.m69122k4(rqzVar, c10562nk, m4cVar);
            }
        }
    }
}
