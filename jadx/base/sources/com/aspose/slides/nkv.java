package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7669fj;
import com.aspose.slides.internal.p332p7.C8515pd;
import com.aspose.slides.internal.p332p7.C8618qp;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11718c6;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11727dq;
import com.aspose.slides.internal.p464vq.C11733e0;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11820ts;
import com.aspose.slides.internal.p464vq.C11853xk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;

/* JADX INFO: loaded from: classes3.dex */
class nkv {
    /* JADX INFO: renamed from: k4 */
    public static SmartArt m68069k4(IShapeCollection iShapeCollection, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        C11791os c11791osM55296x1;
        if (pijVar == null) {
            return null;
        }
        final SmartArt[] smartArtArr = {((ShapeCollection) iShapeCollection).m2640kk()};
        jrf jrfVarMo272to = smartArtArr[0].mo272to();
        C14297pp.m69181k4(smartArtArr[0], pijVar, bjsVar);
        gnb gnbVarM4229k4 = bjsVar.m4229k4();
        C7669fj c7669fjM43902ks = pijVar.mo31678kk().m33836k4().m43902ks();
        new wzx(gnbVarM4229k4.m55338u4().m55303k4(c7669fjM43902ks.m31792to()).m55296x1(), gnbVarM4229k4).m72991k4(jrfVarMo272to);
        C11791os c11791osM55296x12 = gnbVarM4229k4.m55338u4().m55303k4(c7669fjM43902ks.m31788k4()).m55296x1();
        new zw1(c11791osM55296x12, gnbVarM4229k4).m74862k4(jrfVarMo272to);
        C11723d3 c11723d3M55377up = c11791osM55296x12.m55377up();
        new oed(gnbVarM4229k4.m55338u4().m55303k4(c7669fjM43902ks.m31794x1()).m55296x1(), gnbVarM4229k4).m68476k4(jrfVarMo272to);
        new fbr(gnbVarM4229k4.m55338u4().m55303k4(c7669fjM43902ks.m31790kk()).m55296x1(), gnbVarM4229k4).m6111k4(jrfVarMo272to);
        C8618qp c8618qpM38869k4 = C8515pd.m38869k4(jrfVarMo272to.m63514x1().m41859c5());
        C13981tl c13981tl = c8618qpM38869k4 != null ? (C13981tl) fyw.m6354k4(c8618qpM38869k4.m37126x1().getDocumentElement(), "dataModelExt", "http://schemas.microsoft.com/office/drawing/2008/diagram") : null;
        if (c13981tl != null) {
            C11709bg c11709bgM55303k4 = gnbVarM4229k4.m55338u4().m55303k4(c13981tl.m65906k4("relId"));
            if (c11709bgM55303k4 != null && (c11791osM55296x1 = c11709bgM55303k4.m55296x1()) != null && C7019kk.m27469x1(c11791osM55296x1.m55372fa(), C11718c6.class)) {
                new zkb(c11791osM55296x1, gnbVarM4229k4).m74560k4(jrfVarMo272to, bjsVar);
            }
            ((GroupShape) jrfVarMo272to.m63512m9()).mo272to().m68900k4(smartArtArr[0]);
        }
        C11723d3 c11723d3M55338u4 = gnbVarM4229k4.m55338u4();
        gnbVarM4229k4.m55337k4(c11723d3M55377up);
        if (jrfVarMo272to.m63514x1().m41866m9() != null) {
            if (jrfVarMo272to.m63514x1().m41866m9().m37041k4() != null) {
                C1169h1.m6958k4(smartArtArr[0].getFillFormat(), jrfVarMo272to.m63514x1().m41866m9().m37041k4(), gnbVarM4229k4);
            }
            if (jrfVarMo272to.m63514x1().m41866m9().m37043x1() != null) {
                C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.nkv.1
                    @Override // com.aspose.slides.C1158gq.k4
                    /* JADX INFO: renamed from: k4 */
                    public IEffectFormat mo3774k4() {
                        return smartArtArr[0].m2595yd();
                    }
                }, jrfVarMo272to.m63514x1().m41866m9().m37043x1(), gnbVarM4229k4);
            }
        }
        if (jrfVarMo272to.m63514x1().m41861dy() != null && jrfVarMo272to.m63514x1().m41861dy().m29912x1() != null) {
            euh.m5728k4(smartArtArr[0].m2582v4(), jrfVarMo272to.m63514x1().m41861dy().m29912x1());
        }
        smartArtArr[0].m2780k4(gnbVarM4229k4);
        gnbVarM4229k4.m55337k4(c11723d3M55338u4);
        return smartArtArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68070k4(SmartArt smartArt, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        String strM67408k4;
        String strM67408k42;
        String strM67408k43;
        String strM67408k44;
        String strM67408k45;
        C11709bg c11709bgM55311x1;
        jrf jrfVarMo272to = smartArt.mo272to();
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        new gnb(smartArt.getPresentation(), InterruptionToken.getNone()).m55337k4(jrfVarMo272to.m63511kk());
        C14297pp.m69182k4(smartArt, pijVar, u8sVarM70580k4);
        String str = sdpVar.m70580k4().m71531dy() ? "drs" : "ppt";
        while (true) {
            int iM71554qq = u8sVarM70580k4.m71554qq();
            strM67408k4 = C14113y2.m67408k4("/", str, "/diagrams/drawing", C14057f9.m66591x1(iM71554qq), ".xml");
            strM67408k42 = C14113y2.m67408k4("/", str, "/diagrams/data", C14057f9.m66591x1(iM71554qq), ".xml");
            strM67408k43 = C14113y2.m67408k4("/", str, "/diagrams/layout", C14057f9.m66591x1(iM71554qq), ".xml");
            strM67408k44 = C14113y2.m67408k4("/", str, "/diagrams/quickStyle", C14057f9.m66591x1(iM71554qq), ".xml");
            strM67408k45 = C14113y2.m67408k4("/", str, "/diagrams/colors", C14057f9.m66591x1(iM71554qq), ".xml");
            if (u8sVarM70580k4.mo4812qm().m55392h4(strM67408k4) == null && u8sVarM70580k4.mo4812qm().m55392h4(strM67408k42) == null && u8sVarM70580k4.mo4812qm().m55392h4(strM67408k43) == null && u8sVarM70580k4.mo4812qm().m55392h4(strM67408k44) == null && u8sVarM70580k4.mo4812qm().m55392h4(strM67408k45) == null) {
                break;
            }
        }
        if (jrfVarMo272to.m63501h4() != null) {
            C11791os c11791osM55394k4 = u8sVarM70580k4.mo4812qm().m55394k4(strM67408k4, (AbstractC11760jd.k4) null, new C11718c6());
            new zkb(c11791osM55394k4, u8sVarM70580k4).m74561k4(jrfVarMo272to, sdpVar);
            c11709bgM55311x1 = u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k4);
        } else {
            c11709bgM55311x1 = null;
        }
        C7669fj c7669fjM43906to = pijVar.mo31678kk().m33836k4().m43906to();
        C11791os c11791osM55394k42 = u8sVarM70580k4.mo4812qm().m55394k4(strM67408k42, (AbstractC11760jd.k4) null, new C11853xk());
        C11723d3 c11723d3M55433g8 = u8sVarM70580k4.m55433g8();
        u8sVarM70580k4.m55434k4(c11791osM55394k42.m55377up());
        smartArt.m2781k4(u8sVarM70580k4);
        u8sVarM70580k4.m55434k4(c11723d3M55433g8);
        new zw1(c11791osM55394k42, u8sVarM70580k4).m74863k4(jrfVarMo272to, c11709bgM55311x1);
        c7669fjM43906to.m31789k4(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k42).m55289du());
        C11791os c11791osM55394k43 = u8sVarM70580k4.mo4812qm().m55394k4(strM67408k43, (AbstractC11760jd.k4) null, new C11820ts());
        new oed(c11791osM55394k43, u8sVarM70580k4).m68477x1(jrfVarMo272to);
        c7669fjM43906to.m31795x1(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k43).m55289du());
        C11791os c11791osM55394k44 = u8sVarM70580k4.mo4812qm().m55394k4(strM67408k44, (AbstractC11760jd.k4) null, new C11733e0());
        new fbr(c11791osM55394k44, u8sVarM70580k4).m6112x1(jrfVarMo272to);
        c7669fjM43906to.m31791kk(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k44).m55289du());
        C11791os c11791osM55394k45 = u8sVarM70580k4.mo4812qm().m55394k4(strM67408k45, (AbstractC11760jd.k4) null, new C11727dq());
        new wzx(c11791osM55394k45, u8sVarM70580k4).m72992x1(jrfVarMo272to);
        c7669fjM43906to.m31793to(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k45).m55289du());
    }
}
