package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8042jw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jme {
    /* JADX INFO: renamed from: k4 */
    public static void m63439k4(IPresentation iPresentation, C8042jw c8042jw, gnb gnbVar) {
        com.aspose.slides.internal.p332p7.h2b h2bVarM30002x1;
        Slide slide;
        if (c8042jw.m35038xk() == null || (h2bVarM30002x1 = com.aspose.slides.internal.p332p7.d0s.m30002x1(c8042jw.m35038xk(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}")) == null || C14113y2.m67411k4(h2bVarM30002x1.m37126x1().getDocumentElement().getInnerXml())) {
            return;
        }
        C3144um c3144um = new C3144um(h2bVarM30002x1.m37126x1().getDocumentElement().getInnerXml());
        try {
            C13938ms c13938ms = new C13938ms(c3144um);
            try {
                c13938ms.m65615k4((AbstractC13943n5) null);
                while (!c13938ms.mo65015ar() && c13938ms.mo65028jd() != 1) {
                    c13938ms.mo65026h4();
                }
                com.aspose.slides.internal.p332p7.x5q x5qVar = !c13938ms.mo65015ar() ? new com.aspose.slides.internal.p332p7.x5q(c13938ms) : null;
                c13938ms.dispose();
                if (x5qVar == null) {
                    throw new NullReferenceException("Section couldn't be empty.");
                }
                for (int i = 0; i < x5qVar.m44218x1().length; i++) {
                    com.aspose.slides.internal.p332p7.bzf bzfVar = x5qVar.m44218x1()[i];
                    if (bzfVar.m29335kk().m39334x1().length > 0) {
                        long jM30813k4 = bzfVar.m29335kk().m39334x1()[0].m30813k4();
                        IGenericEnumerator<ISlide> it = iPresentation.getSlides().iterator();
                        while (true) {
                            try {
                                if (it.hasNext()) {
                                    slide = (Slide) it.next();
                                    if (slide.m2708ne().m5309to() == jM30813k4) {
                                        break;
                                    }
                                } else {
                                    slide = null;
                                    break;
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                    } else {
                        slide = null;
                    }
                    ((SectionCollection) iPresentation.getSections()).m2521k4(bzfVar.m29332k4(), slide, bzfVar.m29336x1().Clone());
                }
            } catch (Throwable th) {
                c13938ms.dispose();
                throw th;
            }
        } finally {
            c3144um.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63441x1(Presentation presentation) {
        com.aspose.slides.internal.p332p7.h2b h2bVarM30002x1;
        if (presentation.m2351fa().m68360h4() == null || (h2bVarM30002x1 = com.aspose.slides.internal.p332p7.d0s.m30002x1(presentation.m2351fa().m68360h4(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}")) == null) {
            return;
        }
        h2bVarM30002x1.mo28310k4("");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63440k4(Presentation presentation) {
        if (presentation.getSections().size() == 0) {
            m63441x1(presentation);
            return;
        }
        if (presentation.m2351fa().m68360h4() == null) {
            presentation.m2351fa().m68370k4(new com.aspose.slides.internal.p332p7.ltr());
        }
        com.aspose.slides.internal.p332p7.d0s.m30001kk(presentation.m2351fa().m68360h4(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}");
        com.aspose.slides.internal.p332p7.h2b h2bVarM30002x1 = com.aspose.slides.internal.p332p7.d0s.m30002x1(presentation.m2351fa().m68360h4(), "{521415D9-36F7-43E2-AB2F-B90AF26B5E84}");
        com.aspose.slides.internal.p332p7.x5q x5qVar = new com.aspose.slides.internal.p332p7.x5q();
        IGenericEnumerator<ISlide> it = presentation.getSections().iterator();
        while (it.hasNext()) {
            try {
                Section section = (Section) it.next();
                com.aspose.slides.internal.p332p7.bzf bzfVarM44217k4 = x5qVar.m44217k4();
                bzfVarM44217k4.m29333k4(section.m2517k4().Clone());
                bzfVarM44217k4.m29334k4(section.getName());
                it = section.getSlidesListOfSection().iterator();
                while (it.hasNext()) {
                    try {
                        bzfVarM44217k4.m29335kk().m39333k4().m30814k4(((Slide) it.next()).mo400kk().m5309to());
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
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        C6765kp c6765kp = new C6765kp();
        C3125bv c3125bv = new C3125bv(c6765kp);
        try {
            C3059ii c3059ii = new C3059ii(c3125bv);
            try {
                x5qVar.mo6846k4("p14", c3059ii, "sectionLst");
                c3059ii.dispose();
                c3125bv.mo13308kk();
                c3125bv.dispose();
                h2bVarM30002x1.m37126x1().getDocumentElement().setInnerXml(c6765kp.toString());
            } catch (Throwable th2) {
                c3059ii.dispose();
                throw th2;
            }
        } catch (Throwable th3) {
            c3125bv.dispose();
            throw th3;
        }
    }
}
