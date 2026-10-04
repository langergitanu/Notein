package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11724d4;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p482wr.C12250c6;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ge2 {
    /* JADX INFO: renamed from: k4 */
    public static OleObjectFrame m6511k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.ez3 ez3Var, qye qyeVar) {
        OleObjectFrame oleObjectFrameM2645to;
        com.aspose.slides.internal.p332p7.cuq cuqVar;
        if (shapeCollection == null) {
            throw new ArgumentNullException("shapes");
        }
        if (ez3Var == null) {
            throw new ArgumentNullException("oleObjectElement");
        }
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        if (wgi.m72731kk(ez3Var.m31480to())) {
            oleObjectFrameM2645to = shapeCollection.m2645to();
            oleObjectFrameM2645to.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
            oleObjectFrameM2645to.m2089x1(false);
            C14047bz.f47172k4.Clone();
            if (ez3Var.m31474k4() != null) {
                oleObjectFrameM2645to.setObjectProgId(m6513k4(new C14047bz(ez3Var.m31474k4()).Clone()));
            }
            try {
                m6516k4(C14080ne.m66934jd(ez3Var.m31480to()), oleObjectFrameM2645to, qyeVar);
            } catch (FormatException unused) {
                qyeVar.m69954k4(C14113y2.m67402k4("Embedded OLE-object binary data is not valid.", new Object[0]), 1);
            }
        } else if (wgi.m72731kk(ez3Var.m31481x1())) {
            oleObjectFrameM2645to = shapeCollection.m2645to();
            oleObjectFrameM2645to.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
            C14047bz.f47172k4.Clone();
            if (ez3Var.m31474k4() != null) {
                oleObjectFrameM2645to.setObjectProgId(m6513k4(new C14047bz(ez3Var.m31474k4()).Clone()));
            }
            if (C14113y2.m67448x1(ez3Var.m31481x1(), "./Object") || C14113y2.m67448x1(ez3Var.m31481x1(), "Object")) {
                m6515k4(ez3Var.m31481x1(), oleObjectFrameM2645to, qyeVar);
                oleObjectFrameM2645to.m2089x1(false);
            } else {
                dbk.m5033k4(ez3Var.m31481x1(), oleObjectFrameM2645to);
                oleObjectFrameM2645to.m2089x1(true);
            }
            if (ez3Var.m31477kk() == 0) {
                oleObjectFrameM2645to.f2872h4 = false;
            }
        } else {
            oleObjectFrameM2645to = null;
        }
        if (oleObjectFrameM2645to != null && (cuqVar = (com.aspose.slides.internal.p332p7.cuq) wgi.m72712k4(com.aspose.slides.internal.p332p7.cuq.class, "image", vtnVar.m43311yj())) != null) {
            m6514k4(oleObjectFrameM2645to, cuqVar, qyeVar);
        }
        return oleObjectFrameM2645to;
    }

    /* JADX INFO: renamed from: k4 */
    public static OleObjectFrame m6512k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.vcq vcqVar, qye qyeVar) {
        OleObjectFrame oleObjectFrameM2645to;
        if (shapeCollection == null) {
            throw new ArgumentNullException("shapes");
        }
        if (vcqVar == null) {
            throw new ArgumentNullException("objectElement");
        }
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        if (wgi.m72731kk(vcqVar.m42931k4())) {
            if (vcqVar.m42932x1() == 1 && C14113y2.m67359c5(vcqVar.m42931k4(), "Object")) {
                C14047bz c14047bz = new C14047bz();
                C14047bz[] c14047bzArr = {c14047bz};
                byte[] bArrM6518k4 = m6518k4(C14113y2.m67401k4(vcqVar.m42931k4(), "./", ""), shapeCollection, qyeVar, c14047bzArr);
                c14047bzArr[0].CloneTo(c14047bz);
                if (bArrM6518k4 != null) {
                    if (C14047bz.m66537x1(c14047bz, C14047bz.f47172k4)) {
                        oleObjectFrameM2645to = shapeCollection.m2645to();
                        oleObjectFrameM2645to.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
                        oleObjectFrameM2645to.setObjectProgId(m6513k4(c14047bz.Clone()));
                        oleObjectFrameM2645to.m2080k4(gbd.m6479k4(bArrM6518k4, oleObjectFrameM2645to.getObjectProgId(), c14047bz.Clone()));
                        qdi[] qdiVarArr = {null};
                        boolean zTryGetValue = gbd.m6466k4().tryGetValue(oleObjectFrameM2645to.getObjectProgId(), qdiVarArr);
                        qdi qdiVar = qdiVarArr[0];
                        if (zTryGetValue) {
                            oleObjectFrameM2645to.m2078k4(qdiVar.m69540du());
                            oleObjectFrameM2645to.m2084rv().m2069k4(qdiVar.m69541k4());
                        }
                    } else {
                        oleObjectFrameM2645to = (OleObjectFrame) shapeCollection.addOleObjectFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), new OleEmbeddedDataInfo(bArrM6518k4, "package"));
                    }
                    oleObjectFrameM2645to.m2084rv().m2070k4(bArrM6518k4);
                    oleObjectFrameM2645to.m2089x1(false);
                    com.aspose.slides.internal.p332p7.cuq cuqVar = (com.aspose.slides.internal.p332p7.cuq) wgi.m72712k4(com.aspose.slides.internal.p332p7.cuq.class, "image", vtnVar.m43311yj());
                    if (cuqVar != null) {
                        m6514k4(oleObjectFrameM2645to, cuqVar, qyeVar);
                    }
                    return oleObjectFrameM2645to;
                }
            } else {
                OleObjectFrame oleObjectFrameM2645to2 = shapeCollection.m2645to();
                oleObjectFrameM2645to2.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
                dbk.m5033k4(vcqVar.m42931k4(), oleObjectFrameM2645to2);
                oleObjectFrameM2645to2.m2089x1(true);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m6513k4(C14047bz c14047bz) {
        return C14047bz.m66535k4(C14047bz.f47172k4, c14047bz) ? C14113y2.f47374k4 : C14047bz.m66535k4(c14047bz, new C14047bz("D3E34B21-9D75-101A-8c3d-00aa001a1652")) ? "paint.picture" : C14047bz.m66535k4(c14047bz, new C14047bz("00020820-0000-0000-C000-000000000046")) ? "excel.sheet.8" : C14047bz.m66535k4(c14047bz, new C14047bz("00020821-0000-0000-C000-000000000046")) ? "excel.chart.8" : C14047bz.m66535k4(c14047bz, new C14047bz("00020830-0000-0000-C000-000000000046")) ? "excel.sheet.12" : C14047bz.m66535k4(c14047bz, new C14047bz("00020832-0000-0000-C000-000000000046")) ? "excel.sheetmacroenabled.12" : C14047bz.m66535k4(c14047bz, new C14047bz("00020833-0000-0000-C000-000000000046")) ? "excel.sheetbinarymacroenabled.12" : C14047bz.m66535k4(c14047bz, new C14047bz("00020906-0000-0000-C000-000000000046")) ? "word.document.8" : C14047bz.m66535k4(c14047bz, new C14047bz("F4754C9B-64F5-4B40-8AF4-679732AC0607")) ? "word.document.12" : C14047bz.m66535k4(c14047bz, new C14047bz("CF4F55F4-8F87-4D47-80BB-5808164BB3F8")) ? "powerpoint.show.12" : C14047bz.m66535k4(c14047bz, new C14047bz("64818D10-4F9B-11CF-86EA-00AA00B929E8")) ? "powerpoint.show.8" : C14047bz.m66535k4(c14047bz, new C14047bz("048EB43E-2059-422F-95E0-557DA96038AF")) ? "powerpoint.slide.12" : C14047bz.m66535k4(c14047bz, new C14047bz("1B261B22-AC6A-4E68-A870-AB5080E8687B")) ? "word.opendocumenttext.12" : C14047bz.m66535k4(c14047bz, new C14047bz("EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8")) ? "excel.opendocumentspreadsheet.12" : C14047bz.m66535k4(c14047bz, new C14047bz("C282417B-2662-44B8-8A94-3BFF61C50900")) ? "powerpoint.opendocumentpresentation.12" : C14047bz.m66535k4(c14047bz, new C14047bz("11943940-36DE-11CF-953E-00C0A84029E9")) ? "msphotoed.3" : "package";
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6514k4(OleObjectFrame oleObjectFrame, com.aspose.slides.internal.p332p7.cuq cuqVar, qye qyeVar) {
        IPPImage iPPImageAddImage = null;
        if (wgi.m72731kk(cuqVar.m29926x1())) {
            try {
                byte[] bArrM66934jd = C14080ne.m66934jd(cuqVar.m29926x1());
                if (bArrM66934jd != null && bArrM66934jd.length > 0) {
                    iPPImageAddImage = qyeVar.m69951k4().getImages().addImage(bArrM66934jd);
                }
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        if (iPPImageAddImage == null && wgi.m72731kk(cuqVar.m29923k4())) {
            iPPImageAddImage = qyeVar.m69949k4(C14113y2.m67401k4(cuqVar.m29923k4(), "./", "/"));
        }
        if (iPPImageAddImage != null) {
            oleObjectFrame.getSubstitutePictureFormat().getPicture().setImage(iPPImageAddImage);
            PPImage pPImage = (PPImage) iPPImageAddImage;
            if (oleObjectFrame.isObjectIcon() && pPImage.m2129jd()) {
                String str = "";
                if ("image/x-wmf".equals(pPImage.getContentType())) {
                    String[] strArr = {""};
                    C3099wl.m13192k4(pPImage.getBinaryData(), strArr);
                    str = strArr[0];
                } else if ("image/x-emf".equals(pPImage.getContentType())) {
                    String[] strArr2 = {""};
                    C3099wl.m13200x1(pPImage.getBinaryData(), strArr2);
                    str = strArr2[0];
                }
                oleObjectFrame.f2871du = str;
                oleObjectFrame.f2881to = pPImage.m2128h4();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r4 = r4.m55426to();
        r9.m2088x1(com.aspose.slides.p559ms.System.C14113y2.m67408k4("/ppt/embeddings", "/oleObject", com.aspose.slides.p559ms.System.C14113y2.m67401k4(r8, "/Object ", ""), ".bin"));
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m6515k4(String str, OleObjectFrame oleObjectFrame, qye qyeVar) {
        byte[] bArrM55426to;
        String strM67408k4 = C14113y2.m67408k4("/", C14113y2.m67401k4(str, "./", ""));
        try {
            List.Enumerator<C11839vw> it = qyeVar.m69947h4().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        bArrM55426to = null;
                        break;
                    } else {
                        C11839vw next = it.next();
                        if (C14113y2.m67363du(next.m55427x1(), strM67408k4)) {
                            break;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (bArrM55426to == null) {
                qyeVar.m69954k4(C14113y2.m67402k4("Embedded OLE-object data not found: {0}", strM67408k4), 1);
            } else {
                m6516k4(bArrM55426to, oleObjectFrame, qyeVar);
            }
        } catch (C12250c6 unused) {
            qyeVar.m69954k4(C14113y2.m67402k4("Embedded OLE-object is corrupted: {0}", strM67408k4), 1);
            oleObjectFrame.mo268du().m71910k4(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6516k4(byte[] bArr, OleObjectFrame oleObjectFrame, qye qyeVar) {
        oleObjectFrame.m2080k4(bArr);
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            if (!dbk.m5034k4(c3152yj, oleObjectFrame, qyeVar)) {
                qdi[] qdiVarArr = {null};
                boolean zTryGetValue = gbd.m6466k4().tryGetValue(C14113y2.m67361du(oleObjectFrame.getObjectProgId()), qdiVarArr);
                qdi qdiVar = qdiVarArr[0];
                if (zTryGetValue) {
                    oleObjectFrame.m2078k4(qdiVar.m69540du());
                    oleObjectFrame.m2084rv().m2069k4(qdiVar.m69541k4());
                }
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6517k4(C11839vw c11839vw, C14047bz[] c14047bzArr) {
        try {
            AbstractC3150x6 abstractC3150x6M55425m9 = c11839vw.m55425m9();
            try {
                XmlDocument xmlDocument = new XmlDocument();
                xmlDocument.setXmlResolver(null);
                xmlDocument.load(abstractC3150x6M55425m9);
                if (xmlDocument.getElementsByTagName("office:text").mo23932k4() > 0) {
                    c14047bzArr[0] = new C14047bz("1B261B22-AC6A-4E68-A870-AB5080E8687B");
                } else if (xmlDocument.getElementsByTagName("office:spreadsheet").mo23932k4() > 0) {
                    c14047bzArr[0] = new C14047bz("EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8");
                } else if (xmlDocument.getElementsByTagName("office:presentation").mo23932k4() > 0) {
                    c14047bzArr[0] = new C14047bz("C282417B-2662-44B8-8A94-3BFF61C50900");
                } else {
                    C14047bz.f47172k4.CloneTo(c14047bzArr[0]);
                }
                boolean zHasChildNodes = xmlDocument.getDocumentElement().hasChildNodes();
                if (abstractC3150x6M55425m9 == null) {
                    return zHasChildNodes;
                }
                abstractC3150x6M55425m9.dispose();
                return zHasChildNodes;
            } catch (Throwable th) {
                if (abstractC3150x6M55425m9 != null) {
                    abstractC3150x6M55425m9.dispose();
                }
                throw th;
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            C14047bz.f47172k4.CloneTo(c14047bzArr[0]);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m6518k4(String str, ShapeCollection shapeCollection, qye qyeVar, C14047bz[] c14047bzArr) {
        C14047bz.f47172k4.CloneTo(c14047bzArr[0]);
        C11724d4 c11724d4 = new C11724d4();
        List list = new List();
        List.Enumerator<C11839vw> it = qyeVar.m69947h4().iterator();
        boolean zM6517k4 = false;
        while (it.hasNext()) {
            try {
                C11839vw next = it.next();
                if (C14113y2.m67448x1(next.m55424kk(), str)) {
                    if (C14113y2.m67424kk(next.m55427x1(), "content.xml")) {
                        zM6517k4 = m6517k4(next, c14047bzArr);
                    }
                    if (!zM6517k4) {
                        return null;
                    }
                    String strM67396k4 = C14113y2.m67396k4(next.m55427x1(), C14113y2.m67364dy(next.m55427x1(), str), str.length());
                    c11724d4.m55320k4(strM67396k4, next.m55429fa(), next.m55426to());
                    com.aspose.slides.internal.p332p7.w6f w6fVar = new com.aspose.slides.internal.p332p7.w6f();
                    w6fVar.m43520k4(strM67396k4);
                    w6fVar.m43524x1(next.m55429fa());
                    list.addItem(w6fVar);
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
        new bvr(c11724d4.m55319k4("/META-INF/manifest.xml", "text/xml"), (OdpSerializationContext) null, list).m4325k4((Presentation) shapeCollection.getParentGroup().getPresentation(), false);
        C12275wy c12275wy = new C12275wy();
        try {
            c11724d4.m55325k4(c12275wy);
            C3152yj c3152yj = new C3152yj();
            try {
                c12275wy.m57507x1(c3152yj);
                c3152yj.setPosition(0L);
                return c3152yj.toArray();
            } finally {
                c3152yj.dispose();
            }
        } finally {
            c12275wy.dispose();
        }
    }
}
