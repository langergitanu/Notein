package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8099kk;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11847x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.n1 */
/* JADX INFO: loaded from: classes3.dex */
class C14163n1 {
    /* JADX INFO: renamed from: k4 */
    public static void m67850k4(IControl iControl, C8099kk c8099kk, bjs bjsVar) {
        com.aspose.slides.internal.p332p7.prv prvVarM35463kk = (!C3083s7.f9152k4.m12773k4("urn:schemas-microsoft-com:vml") || c8099kk.m35464to() == null) ? c8099kk.m35463kk() : c8099kk.m35464to();
        C14739wi c14739wiM1246k4 = ((Control) iControl).m1246k4();
        gnb gnbVarM4229k4 = bjsVar.m4229k4();
        String strM39090x1 = prvVarM35463kk.m39090x1();
        if (!C14113y2.m67411k4(strM39090x1)) {
            bjsVar.m4234k4(strM39090x1, iControl);
        }
        iControl.setName(prvVarM35463kk.m39086kk());
        c14739wiM1246k4.m72760k4(prvVarM35463kk.m39089to());
        String strM39080du = prvVarM35463kk.m39080du();
        if (!C14113y2.m67411k4(strM39080du)) {
            C11791os c11791osM55296x1 = gnbVarM4229k4.m55338u4().m55303k4(strM39080du).m55296x1();
            try {
                new C14641um(c11791osM55296x1, gnbVarM4229k4).m71733k4(iControl);
            } catch (XmlException e) {
                bjsVar.m4229k4().m6785k4(C14113y2.m67408k4(c11791osM55296x1.m55427x1(), " is not valid ActiveX control: ", e.getMessage()), 1);
            }
        }
        if (prvVarM35463kk.m39081dy() != null && prvVarM35463kk.m39081dy().m30643x1() != null) {
            com.aspose.slides.internal.p332p7.ks0 ks0VarM30643x1 = prvVarM35463kk.m39081dy().m30643x1();
            xps.m73532k4((PictureFillFormat) iControl.getSubstitutePictureFormat(), ks0VarM30643x1.mo35659x1(), gnbVarM4229k4);
            C8087kh c8087khMo35657kk = ks0VarM30643x1.mo35657kk();
            if (c8087khMo35657kk != null) {
                tbp tbpVar = tbp.f49088kk;
                tbp tbpVarClone = tbpVar.Clone();
                tbp tbpVarClone2 = tbpVar.Clone();
                C1258im c1258imClone = C1258im.f5731k4.Clone();
                if (c8087khMo35657kk.m35373h4() != null) {
                    tbp[] tbpVarArr = {tbpVarClone};
                    tbp[] tbpVarArr2 = {tbpVarClone2};
                    C1258im[] c1258imArr = {c1258imClone};
                    ai9.m3628k4(c8087khMo35657kk.m35373h4(), tbpVarArr, tbpVarArr2, c1258imArr);
                    tbpVarArr[0].CloneTo(tbpVarClone);
                    tbpVarArr2[0].CloneTo(tbpVarClone2);
                    c1258imArr[0].CloneTo(c1258imClone);
                }
                iControl.setFrame(new ShapeFrame((float) tbpVarClone.f49090k4, (float) tbpVarClone.f49091x1, (float) tbpVarClone2.f49090k4, (float) tbpVarClone2.f49091x1, c1258imClone.f5733to ? (byte) 1 : (byte) 0, c1258imClone.f5732kk ? (byte) 1 : (byte) 0, c1258imClone.f5734x1));
            }
        }
        c14739wiM1246k4.m72765x1(prvVarM35463kk.m39088m9());
        c14739wiM1246k4.m72757k4(prvVarM35463kk.m39082h4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67851k4(IControl iControl, C8099kk c8099kk, sdp sdpVar) {
        C11709bg c11709bgM55311x1;
        Control control = (Control) iControl;
        C14739wi c14739wiM1246k4 = control.m1246k4();
        final u8s u8sVarM70580k4 = sdpVar.m70580k4();
        if (control.getActiveXControlBinary() != null || ((iControl.getProperties() != null && iControl.getProperties().getCount() > 0) || C14047bz.m66537x1(((Control) iControl).m1252kk(), C14047bz.f47172k4))) {
            C11791os c11791osM55394k4 = u8sVarM70580k4.mo4812qm().m55394k4("/ppt/activeX/activeX{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.n1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVarM70580k4, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextActiveXFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVarM70580k4.m71563wl();
                }
            }, new C11847x1());
            new C14641um(c11791osM55394k4, u8sVarM70580k4).m71734x1(iControl);
            c11709bgM55311x1 = u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k4);
        } else {
            c11709bgM55311x1 = null;
        }
        if (m67852k4()) {
            com.aspose.slides.internal.p332p7.prv prvVarM35465x1 = c8099kk.m35465x1();
            prvVarM35465x1.m39092x1(iControl.getName());
            prvVarM35465x1.m39091x1(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(c14739wiM1246k4.m72762kk() * 12700.0d)), 14));
            prvVarM35465x1.m39084k4(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(c14739wiM1246k4.m72764x1() * 12700.0d)), 14));
            if (c11709bgM55311x1 == null) {
                throw new NullReferenceException("ActiveX couldn't be empty.");
            }
            prvVarM35465x1.m39087kk(c11709bgM55311x1.m55289du());
            prvVarM35465x1.m39085k4(C14057f9.m66587k4(sdpVar.m70579k4(iControl), "D4"));
        }
        com.aspose.slides.internal.p332p7.prv prvVarM35462k4 = c8099kk.m35462k4();
        prvVarM35462k4.m39092x1(iControl.getName());
        prvVarM35462k4.m39091x1(c14739wiM1246k4.m72762kk());
        prvVarM35462k4.m39084k4(c14739wiM1246k4.m72764x1());
        prvVarM35462k4.m39087kk(c11709bgM55311x1.m55289du());
        com.aspose.slides.internal.p332p7.ks0 ks0VarM30642k4 = prvVarM35462k4.m39083k4().m30642k4();
        ks0VarM30642k4.mo35656k4().mo42132k4().m31575k4(0L);
        ks0VarM30642k4.mo35656k4().mo42132k4().m31577k4(iControl.getName());
        ks0VarM30642k4.mo35656k4().mo42133x1().m34391k4().m33360c5(true);
        ks0VarM30642k4.mo35656k4().mo42133x1().m34394kk().m33371jd(true);
        xps.m73533k4((PictureFillFormat) iControl.getSubstitutePictureFormat(), ks0VarM30642k4.mo35659x1(), u8sVarM70580k4);
        C8087kh c8087khMo35657kk = ks0VarM30642k4.mo35657kk();
        ai9.m3624k4(iControl.getFrame(), c8087khMo35657kk.m35376k4());
        ((C9365zg) c8087khMo35657kk.m35384kk("prstGeom").m29542x1()).m45599k4(5);
        c8087khMo35657kk.m35390x1("noFill");
        c8087khMo35657kk.m35391x1();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m67852k4() {
        return true;
    }
}
