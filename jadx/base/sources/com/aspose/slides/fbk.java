package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8594qb;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11817tl;
import com.aspose.slides.internal.p464vq.C11702ak;
import com.aspose.slides.internal.p464vq.C11707b3;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11717c5;
import com.aspose.slides.internal.p464vq.C11720cj;
import com.aspose.slides.internal.p464vq.C11725dc;
import com.aspose.slides.internal.p464vq.C11728dt;
import com.aspose.slides.internal.p464vq.C11730dw;
import com.aspose.slides.internal.p464vq.C11735ei;
import com.aspose.slides.internal.p464vq.C11744g8;
import com.aspose.slides.internal.p464vq.C11746ga;
import com.aspose.slides.internal.p464vq.C11752he;
import com.aspose.slides.internal.p464vq.C11756ii;
import com.aspose.slides.internal.p464vq.C11771li;
import com.aspose.slides.internal.p464vq.C11774ly;
import com.aspose.slides.internal.p464vq.C11776m4;
import com.aspose.slides.internal.p464vq.C11780n0;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11789o3;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11794q3;
import com.aspose.slides.internal.p464vq.C11797qm;
import com.aspose.slides.internal.p464vq.C11799qq;
import com.aspose.slides.internal.p464vq.C11809s9;
import com.aspose.slides.internal.p464vq.C11811so;
import com.aspose.slides.internal.p464vq.C11823tw;
import com.aspose.slides.internal.p464vq.C11831uw;
import com.aspose.slides.internal.p464vq.C11835v6;
import com.aspose.slides.internal.p464vq.C11844wy;
import com.aspose.slides.internal.p464vq.C11857y6;
import com.aspose.slides.internal.p464vq.C11859yd;
import com.aspose.slides.internal.p464vq.C11866z7;
import com.aspose.slides.internal.p464vq.C11869ze;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class fbk {

    /* JADX INFO: renamed from: k4 */
    private u8s f5010k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f5011x1 = false;

    /* JADX WARN: Type inference failed for: r0v12, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r5v3, types: [double, int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [double, int] */
    /* JADX INFO: renamed from: du */
    private void m6082du(C11785nh c11785nh, IPresentation iPresentation) {
        C12009k4 c12009k4;
        C12015qq c12015qqClone = ((SlideSize) iPresentation.getSlideSize()).m2755k4().Clone();
        C12023wl c12023wlClone = (c12015qqClone.m56699x1() > c12015qqClone.m56697kk() ? new C12023wl(256, StringBuffer.append((int) ((c12015qqClone.m56697kk() * 256.0f) / c12015qqClone.m56699x1()))) : new C12023wl(StringBuffer.append((int) ((c12015qqClone.m56699x1() * 256.0f) / c12015qqClone.m56697kk())), 256)).Clone();
        if (iPresentation.getSlides().size() > 0) {
            c12009k4 = ((Slide) iPresentation.getSlides().get_Item(0)).m2693k4(c12023wlClone.Clone());
        } else {
            c12009k4 = new C12009k4(c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
            c12009k4.m56332k4(96.0f, 96.0f);
            AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4).mo17526k4(C12010kk.m56612to(), 0, 0, c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        }
        C3152yj c3152yj = new C3152yj();
        try {
            c12009k4.m56333k4(c3152yj, C3977ck.m15678dy());
            c12009k4.dispose();
            c11785nh.m55390dy().m55311x1(c11785nh.m55395k4("/docProps/thumbnail.jpeg", null, new C11735ei(), c3152yj.toArray()));
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m6083dy(C11785nh c11785nh, IPresentation iPresentation) {
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/tableStyles.xml", (AbstractC11760jd.k4) null, new C11866z7());
        new w0x(c11791osM55394k4, this.f5010k4).m72620x1(((Presentation) iPresentation).m2351fa().m68389u4());
        c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: h4 */
    private void m6084h4(C11785nh c11785nh, IPresentation iPresentation) {
        if (((CommentAuthorCollection) iPresentation.getCommentAuthors()).m1177k4() > 0) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/commentAuthors.xml", (AbstractC11760jd.k4) null, new C11799qq());
            new C13645ip(c11791osM55394k4, this.f5010k4).m63023x1(iPresentation);
            c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C11785nh m6085k4(Presentation presentation, int i, IPptxOptions iPptxOptions, InterruptionToken interruptionToken) {
        C11785nh c11785nh = new C11785nh();
        if (iPptxOptions != null) {
            c11785nh.m55343k4(iPptxOptions.getConformance());
        }
        this.f5010k4 = new u8s(c11785nh, presentation, null, iPptxOptions, interruptionToken);
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/presentation.xml", (AbstractC11760jd.k4) null, m6090k4(i));
        c11785nh.m55390dy().m55311x1(c11791osM55394k4);
        m6092k4(presentation, c11791osM55394k4);
        m6099kk(c11785nh, presentation, this.f5010k4);
        m6094k4(c11785nh, (IPresentation) presentation);
        m6105x1(c11785nh, presentation);
        m6082du(c11785nh, presentation);
        m6084h4(c11785nh, presentation);
        m6101m9(c11785nh, presentation);
        IGenericEnumerator<ISlide> it = presentation.getSlides().iterator();
        while (it.hasNext()) {
            try {
                this.f5010k4.m71565x1().addItem(it.next(), C14113y2.m67408k4("/ppt/slides/slide", C14057f9.m66591x1(this.f5010k4.m71521ak()), ".xml"));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<IMasterSlide> it2 = presentation.getMasters().iterator();
        while (it2.hasNext()) {
            try {
                m6087k4(c11785nh, it2.next(), true, this.f5010k4);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        m6088k4(c11785nh, presentation, this.f5010k4);
        m6103to(c11785nh, presentation, this.f5010k4);
        it = presentation.getSlides().iterator();
        while (it.hasNext()) {
            try {
                m6089k4(c11785nh, it.next(), this.f5010k4);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        new nps(c11791osM55394k4, this.f5010k4).m68166x1(presentation);
        m6097k4(c11785nh, presentation);
        m6102to(c11785nh, presentation);
        m6098kk(c11785nh, presentation);
        m6095k4(c11785nh, presentation, i);
        m6093k4(c11785nh, presentation.getMasterTheme(), this.f5010k4);
        c11785nh.m55354ar().m55377up().m55311x1(this.f5010k4.m71556to().get_Item(presentation.getMasterTheme()));
        m6083dy(c11785nh, presentation);
        return c11785nh;
    }

    /* JADX INFO: renamed from: kk */
    private void m6098kk(C11785nh c11785nh, IPresentation iPresentation) {
        if (iPresentation.getDocumentProperties().getCountOfCustomProperties() > 0) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/docProps/custom.xml", (AbstractC11760jd.k4) null, new C11707b3());
            c11785nh.m55390dy().m55311x1(c11791osM55394k4);
            new C13708k0(c11791osM55394k4, this.f5010k4).m63592x1(iPresentation.getDocumentProperties());
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m6101m9(C11785nh c11785nh, IPresentation iPresentation) {
        if (((CommentAuthorCollection) iPresentation.getCommentAuthors()).m1181x1() > 0) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/authors.xml", (AbstractC11760jd.k4) null, new C11717c5());
            new C14853yn(c11791osM55394k4, this.f5010k4).m73946x1(iPresentation);
            c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6102to(C11785nh c11785nh, IPresentation iPresentation) {
        C11791os c11791osM55395k4;
        int i;
        o8s o8sVarM2351fa = ((Presentation) iPresentation).m2351fa();
        if (o8sVarM2351fa.m68386rv() == null) {
            o8sVarM2351fa.m68373k4(new n3i());
            o8sVarM2351fa.m68386rv().m67864k4(new C8594qb());
        }
        C8594qb c8594qbM67862k4 = o8sVarM2351fa.m68386rv().m67862k4();
        IViewProperties viewProperties = iPresentation.getViewProperties();
        if (viewProperties.getLastView() != 0) {
            switch (viewProperties.getLastView()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                default:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
            }
            c8594qbM67862k4.m39445k4(i);
        }
        if (viewProperties.getShowComments() == 1) {
            c8594qbM67862k4.m39446k4(true);
        } else if (viewProperties.getShowComments() == 0) {
            c8594qbM67862k4.m39446k4(false);
        }
        if (c8594qbM67862k4.m39443h4() == null) {
            c8594qbM67862k4.m39444k4();
        }
        if (c8594qbM67862k4.m39448m9() == null) {
            c8594qbM67862k4.m39450x1();
        }
        if (c8594qbM67862k4.m39440c5() == null) {
            c8594qbM67862k4.m39447kk();
        }
        tve.m71338x1(((ViewProperties) viewProperties).getNormalViewProperties(), c8594qbM67862k4.m39443h4());
        C0844c7.m4499x1(viewProperties.getSlideViewProperties(), c8594qbM67862k4.m39448m9().m31931k4().m44137k4());
        C0844c7.m4499x1(viewProperties.getNotesViewProperties(), c8594qbM67862k4.m39440c5().m32279k4().m44137k4());
        if (o8sVarM2351fa.m68386rv() == null) {
            c11791osM55395k4 = c11785nh.m55395k4("/ppt/viewProps.xml", null, new C11809s9(), AbstractC6747ar.m26635ix().mo26677to("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n<p:viewPr xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\" xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\" xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\"><p:normalViewPr><p:restoredLeft sz=\"15620\"/><p:restoredTop sz=\"94660\"/></p:normalViewPr><p:slideViewPr><p:cSldViewPr><p:cViewPr varScale=\"1\"><p:scale><a:sx n=\"101\" d=\"100\"/><a:sy n=\"101\" d=\"100\"/></p:scale><p:origin x=\"-558\" y=\"-90\"/></p:cViewPr><p:guideLst><p:guide orient=\"horz\" pos=\"2160\"/><p:guide pos=\"2880\"/></p:guideLst></p:cSldViewPr></p:slideViewPr><p:notesTextViewPr><p:cViewPr><p:scale><a:sx n=\"1\" d=\"1\"/><a:sy n=\"1\" d=\"1\"/></p:scale><p:origin x=\"0\" y=\"0\"/></p:cViewPr></p:notesTextViewPr><p:gridSpacing cx=\"73736200\" cy=\"73736200\"/></p:viewPr>"));
        } else {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/viewProps.xml", (AbstractC11760jd.k4) null, new C11809s9());
            new yeb(c11791osM55394k4, this.f5010k4).m73861x1(iPresentation);
            c11791osM55395k4 = c11791osM55394k4;
        }
        c11785nh.m55354ar().m55377up().m55311x1(c11791osM55395k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static C11791os m6104x1(C11785nh c11785nh, IPresentation iPresentation, final u8s u8sVar) {
        IGenericEnumerator<IDigitalSignature> it = iPresentation.getDigitalSignatures().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                DigitalSignature digitalSignature = (DigitalSignature) it.next();
                if (digitalSignature.getCertificate() != null && digitalSignature.m1326k4().m15327x6() != null) {
                    z = true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (z) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/_xmlsignatures/origin.sigs", (AbstractC11760jd.k4) null, new C11797qm());
            c11791osM55394k4.m55423k4(new byte[0]);
            c11791osM55394k4.m55376ks();
            it = iPresentation.getDigitalSignatures().iterator();
            while (it.hasNext()) {
                try {
                    DigitalSignature digitalSignature2 = (DigitalSignature) it.next();
                    if (digitalSignature2.getCertificate() != null && digitalSignature2.m1326k4().m15327x6() != null) {
                        C11791os c11791osM55394k42 = c11785nh.m55394k4("/_xmlsignatures/sig{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.6
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextDigitalSignatureFileNumber()");
                            }

                            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                            /* JADX INFO: renamed from: k4 */
                            public int mo5039k4() {
                                return u8sVar.m71532e0();
                            }
                        }, new C11744g8());
                        new C0972f0(c11791osM55394k42, u8sVar).m5801x1(digitalSignature2);
                        c11791osM55394k4.m55377up().m55311x1(c11791osM55394k42);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            c11785nh.m55390dy().m55311x1(c11791osM55394k4);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11791os m6086k4(C11785nh c11785nh, ILayoutSlide iLayoutSlide, C11791os c11791os, final u8s u8sVar) {
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/slideLayouts/slideLayout{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextLayoutFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVar.m71562v4();
            }
        }, new C11857y6());
        new q7e(c11791osM55394k4, u8sVar, iLayoutSlide).m69457k4(iLayoutSlide);
        u8sVar.m71565x1().addItem(iLayoutSlide, c11791osM55394k4.m55427x1());
        if (c11791os != null) {
            c11791osM55394k4.m55377up().m55311x1(c11791os);
            c11791os.m55377up().m55311x1(c11791osM55394k4);
        }
        C14576tt.m71304k4(iLayoutSlide.getThemeManager(), c11791osM55394k4.m55377up(), u8sVar);
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m6099kk(C11785nh c11785nh, IPresentation iPresentation, final u8s u8sVar) {
        IGenericEnumerator<ICustomXmlPart> it = ((Presentation) iPresentation).m2387ne().iterator();
        while (it.hasNext()) {
            try {
                CustomXmlPart customXmlPart = (CustomXmlPart) it.next();
                C11791os c11791osM55395k4 = c11785nh.m55395k4("/customXml/item{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextCustomXmlFileNumber()");
                    }

                    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                    /* JADX INFO: renamed from: k4 */
                    public int mo5039k4() {
                        return u8sVar.m71527c6();
                    }
                }, new C11844wy(), customXmlPart.getXmlData());
                C11791os c11791osM55394k4 = c11785nh.m55394k4("/customXml/itemProps{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextCustomXmlPropsFileNumber()");
                    }

                    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                    /* JADX INFO: renamed from: k4 */
                    public int mo5039k4() {
                        return u8sVar.m71557ts();
                    }
                }, new C11702ak());
                new C14783xe(c11791osM55394k4, u8sVar).m73341x1(customXmlPart);
                c11791osM55395k4.m55377up().m55311x1(c11791osM55394k4);
                u8sVar.m71534h4().addItem(customXmlPart, c11785nh.m55354ar().m55377up().m55311x1(c11791osM55395k4));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static void m6103to(C11785nh c11785nh, IPresentation iPresentation, u8s u8sVar) {
        IMasterHandoutSlide masterHandoutSlide = iPresentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
        if (masterHandoutSlide != null) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/handoutMasters/handoutMaster1.xml", (AbstractC11760jd.k4) null, new C11776m4());
            new C0863cp(c11791osM55394k4, u8sVar, masterHandoutSlide).m4712x1(masterHandoutSlide);
            c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
            IMasterTheme iMasterThemeM1963k4 = ((MasterThemeManager) masterHandoutSlide.getThemeManager()).m1963k4();
            m6093k4(c11785nh, iMasterThemeM1963k4, u8sVar);
            c11791osM55394k4.m55377up().m55311x1(u8sVar.m71556to().get_Item(iMasterThemeM1963k4));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6110x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, int i, IPptxOptions iPptxOptions, InterruptionToken interruptionToken) {
        if (this.f5011x1) {
            throw new Exception("PptxSerializator instance can call WritePresentationToZipFile() method only once.");
        }
        this.f5011x1 = true;
        C11785nh c11785nhM6085k4 = m6085k4(presentation, i, iPptxOptions, interruptionToken);
        try {
            c11785nhM6085k4.m55396k4(abstractC3150x6);
            c11785nhM6085k4.dispose();
        } catch (Throwable th) {
            if (c11785nhM6085k4 != null) {
                c11785nhM6085k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11791os m6087k4(C11785nh c11785nh, IMasterSlide iMasterSlide, boolean z, final u8s u8sVar) {
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/slideMasters/slideMaster{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextMasterSlideFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVar.m71523b3();
            }
        }, new C11728dt());
        y4k y4kVar = new y4k(c11791osM55394k4, u8sVar, iMasterSlide);
        int iM71552m9 = u8sVar.m71552m9();
        if (iM71552m9 == 0) {
            c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
        } else if (iM71552m9 != 1 && iM71552m9 != 2) {
            throw new Exception();
        }
        u8sVar.m71565x1().addItem(iMasterSlide, c11791osM55394k4.m55427x1());
        if (z) {
            IGenericEnumerator<ILayoutSlide> it = iMasterSlide.getLayoutSlides().iterator();
            while (it.hasNext()) {
                try {
                    m6086k4(c11785nh, it.next(), c11791osM55394k4, u8sVar);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        y4kVar.m73739k4(iMasterSlide, z);
        IMasterTheme iMasterThemeM1963k4 = ((MasterThemeManager) iMasterSlide.getThemeManager()).m1963k4();
        m6093k4(c11785nh, iMasterThemeM1963k4, u8sVar);
        c11791osM55394k4.m55377up().m55311x1(u8sVar.m71556to().get_Item(iMasterThemeM1963k4));
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: kk */
    private static void m6100kk(C11785nh c11785nh, ISlide iSlide, C11791os c11791os, final u8s u8sVar) {
        IComment[] iCommentArrM2720x1 = ((Slide) iSlide).m2720x1((ICommentAuthor) null);
        if (iCommentArrM2720x1.length > 0) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/comments/moderncomment{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.9
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextModernCommentFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71571xk();
                }
            }, new C11780n0());
            new dfx(c11791osM55394k4, u8sVar).m5092k4(iCommentArrM2720x1);
            c11791os.m55377up().m55311x1(c11791osM55394k4);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m6105x1(C11785nh c11785nh, IPresentation iPresentation) {
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/docProps/app.xml", (AbstractC11760jd.k4) null, new C11752he());
        new C14668v9(c11791osM55394k4, this.f5010k4).m72098k4(iPresentation.getDocumentProperties(), iPresentation);
        c11785nh.m55390dy().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11791os m6088k4(C11785nh c11785nh, IPresentation iPresentation, u8s u8sVar) {
        IMasterNotesSlide masterNotesSlide = iPresentation.getMasterNotesSlideManager().getMasterNotesSlide();
        C11791os c11791osM55394k4 = null;
        if (masterNotesSlide != null) {
            c11791osM55394k4 = c11785nh.m55394k4("/ppt/notesMasters/notesMaster1.xml", (AbstractC11760jd.k4) null, new C11756ii());
            new voi(c11791osM55394k4, u8sVar, masterNotesSlide).m72398x1(masterNotesSlide);
            int iM71552m9 = u8sVar.m71552m9();
            if (iM71552m9 == 0) {
                c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
            } else if (iM71552m9 != 1 && iM71552m9 != 2) {
                throw new Exception();
            }
            IMasterTheme iMasterThemeM1963k4 = ((MasterThemeManager) masterNotesSlide.getThemeManager()).m1963k4();
            m6093k4(c11785nh, iMasterThemeM1963k4, u8sVar);
            c11791osM55394k4.m55377up().m55311x1(u8sVar.m71556to().get_Item(iMasterThemeM1963k4));
        }
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m6106x1(C11785nh c11785nh, ISlide iSlide, C11791os c11791os, final u8s u8sVar) {
        IComment[] iCommentArrM2705k4 = ((Slide) iSlide).m2705k4((ICommentAuthor) null);
        if (iCommentArrM2705k4.length > 0) {
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/comments/comment{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.8
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextCommentFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71529dq();
                }
            }, new C11823tw());
            new C14161mz(c11791osM55394k4, u8sVar).m67842k4(iCommentArrM2705k4);
            c11791os.m55377up().m55311x1(c11791osM55394k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11791os m6089k4(C11785nh c11785nh, ISlide iSlide, u8s u8sVar) {
        C11791os c11791osM55394k4 = c11785nh.m55394k4(u8sVar.m71565x1().get_Item(iSlide), (AbstractC11760jd.k4) null, new C11789o3());
        xgx xgxVar = new xgx(c11791osM55394k4, u8sVar, iSlide);
        int iM71552m9 = u8sVar.m71552m9();
        if (iM71552m9 == 0) {
            c11791osM55394k4.m55377up().m55311x1(u8sVar.m71548kk().get_Item(iSlide.getLayoutSlide()));
            c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
            C14576tt.m71304k4(iSlide.getThemeManager(), c11791osM55394k4.m55377up(), u8sVar);
        } else if (iM71552m9 != 1 && iM71552m9 != 2) {
            throw new Exception();
        }
        m6096k4(c11785nh, iSlide, c11791osM55394k4, u8sVar);
        int iM71552m92 = u8sVar.m71552m9();
        if (iM71552m92 == 0 || iM71552m92 == 1) {
            m6106x1(c11785nh, iSlide, c11791osM55394k4, u8sVar);
            m6100kk(c11785nh, iSlide, c11791osM55394k4, u8sVar);
        } else if (iM71552m92 != 2) {
            throw new Exception();
        }
        xgxVar.m73357k4(iSlide);
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC11817tl m6090k4(int i) {
        switch (i) {
            case 0:
            case 6:
                return new C11774ly();
            case 1:
                return new C11730dw();
            case 2:
                return new C11720cj();
            case 3:
                return new C11746ga();
            case 4:
                return new C11811so();
            case 5:
                return new C11771li();
            default:
                throw new Exception();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m6107k4(BaseSlide baseSlide) {
        return m6108k4(baseSlide, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m6108k4(BaseSlide baseSlide, boolean z) {
        C11791os c11791osM55394k4;
        C11785nh c11785nh = new C11785nh();
        this.f5010k4 = new u8s(c11785nh, baseSlide.getPresentation(), null, new PptxOptions(), InterruptionToken.getNone());
        IGenericEnumerator<ISlide> it = baseSlide.getPresentation().getSlides().iterator();
        while (it.hasNext()) {
            try {
                this.f5010k4.m71565x1().addItem((Slide) it.next(), C14113y2.m67408k4("/ppt/slides/slide", C14057f9.m66591x1(this.f5010k4.m71521ak()), ".xml"));
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (!C7019kk.m27469x1(baseSlide, Slide.class)) {
            this.f5010k4.m71565x1().addItem(baseSlide, "");
        }
        if (C7019kk.m27469x1(baseSlide, Slide.class)) {
            c11791osM55394k4 = c11785nh.m55394k4(this.f5010k4.m71565x1().get_Item(baseSlide), (AbstractC11760jd.k4) null, new C11789o3());
            new xgx(c11791osM55394k4, this.f5010k4, baseSlide).m73357k4((ISlide) C7019kk.m27452k4((Object) baseSlide, Slide.class));
        } else if (C7019kk.m27469x1(baseSlide, LayoutSlide.class)) {
            c11791osM55394k4 = c11785nh.m55394k4(this.f5010k4.m71565x1().get_Item(baseSlide), (AbstractC11760jd.k4) null, new C11857y6());
            new q7e(c11791osM55394k4, this.f5010k4, baseSlide).m69457k4((ILayoutSlide) C7019kk.m27452k4((Object) baseSlide, LayoutSlide.class));
        } else if (C7019kk.m27469x1(baseSlide, MasterSlide.class)) {
            c11791osM55394k4 = c11785nh.m55394k4(this.f5010k4.m71565x1().get_Item(baseSlide), (AbstractC11760jd.k4) null, new C11728dt());
            new y4k(c11791osM55394k4, this.f5010k4, baseSlide).m73739k4((IMasterSlide) C7019kk.m27452k4((Object) baseSlide, MasterSlide.class), false);
        } else if (C7019kk.m27469x1(baseSlide, NotesSlide.class)) {
            c11791osM55394k4 = c11785nh.m55394k4(this.f5010k4.m71565x1().get_Item(baseSlide), (AbstractC11760jd.k4) null, new C11725dc());
            new qfp(c11791osM55394k4, this.f5010k4, baseSlide).m69562x1((INotesSlide) C7019kk.m27452k4((Object) baseSlide, NotesSlide.class));
        } else if (C7019kk.m27469x1(baseSlide, MasterNotesSlide.class)) {
            c11791osM55394k4 = c11785nh.m55394k4(this.f5010k4.m71565x1().get_Item(baseSlide), (AbstractC11760jd.k4) null, new C11756ii());
            new voi(c11791osM55394k4, this.f5010k4, baseSlide).m72398x1((IMasterNotesSlide) C7019kk.m27452k4((Object) baseSlide, MasterNotesSlide.class));
        } else {
            if (!C7019kk.m27469x1(baseSlide, MasterHandoutSlide.class)) {
                throw new NotImplementedException();
            }
            c11791osM55394k4 = c11785nh.m55394k4(this.f5010k4.m71565x1().get_Item(baseSlide), (AbstractC11760jd.k4) null, new C11776m4());
            new C0863cp(c11791osM55394k4, this.f5010k4, baseSlide).m4712x1((IMasterHandoutSlide) C7019kk.m27452k4((Object) baseSlide, MasterHandoutSlide.class));
        }
        String strM67400k4 = C14113y2.f47374k4;
        if (z) {
            IGenericEnumerator<C11709bg> it2 = c11791osM55394k4.m55377up().iterator();
            while (it2.hasNext()) {
                try {
                    C11709bg next = it2.next();
                    if (next.m55292k4() == null || !C14113y2.m67359c5(next.m55292k4(), "slide")) {
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, next.m55296x1() != null ? C14113y2.m67408k4("; ", C14091t6.m67191x1(next.m55296x1().m55419k4())) : C14113y2.m67408k4("; ", next.m55292k4()));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        return C14113y2.m67408k4(c11791osM55394k4.m55415du(), strM67400k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6091k4(IOverrideTheme iOverrideTheme, final u8s u8sVar) {
        if (iOverrideTheme == null || u8sVar.m71556to().containsKey(iOverrideTheme)) {
            return;
        }
        C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4("/ppt/theme/themeOverride{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextThemeOverrideFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVar.m71572yd();
            }
        }, new C11869ze());
        new k1j(c11791osM55394k4, u8sVar).m63593k4(iOverrideTheme);
        u8sVar.m71556to().addItem(iOverrideTheme, c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6092k4(IPresentation iPresentation, C11791os c11791os) {
        o8s o8sVarM2351fa = ((Presentation) iPresentation).m2351fa();
        ykd.m73921k4(c11791os, o8sVarM2351fa.m68384ne(), o8sVarM2351fa.m68362ix());
        IGenericEnumerator<ipw> it = o8sVarM2351fa.m68384ne().iterator();
        while (it.hasNext()) {
            try {
                ykd.m73922k4(this.f5010k4.mo4812qm(), it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6109k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int i, IPptxOptions iPptxOptions, InterruptionToken interruptionToken) {
        if (this.f5011x1) {
            throw new Exception("PptxSerializator instance can call WritePresentationToZipFile() method only once.");
        }
        this.f5011x1 = true;
        C12275wy c12275wy = new C12275wy();
        try {
            C11785nh c11785nhM6085k4 = m6085k4(presentation, i, iPptxOptions, interruptionToken);
            try {
                m6104x1(c11785nhM6085k4, presentation, this.f5010k4);
                if (abstractC3150x6.canSeek()) {
                    c12275wy.m57506x1(1);
                }
                if (iPptxOptions != null) {
                    int zip64Mode = iPptxOptions.getZip64Mode();
                    if (zip64Mode == 0) {
                        int length = c11785nhM6085k4.m55388c5().length;
                        if (length > 65534) {
                            throw new PptxException(C14113y2.m67408k4("Can't save the Presentation with ", C14057f9.m66591x1(length), " parts to ZIP32. ", "Consider setting the IPptxOptions.Zip64Mode property."));
                        }
                        c12275wy.m57506x1(0);
                    } else if (zip64Mode == 1) {
                        c12275wy.m57506x1(1);
                    } else if (zip64Mode == 2) {
                        c12275wy.m57506x1(2);
                    }
                } else if (abstractC3150x6.canSeek()) {
                    c12275wy.m57506x1(1);
                } else if (c11785nhM6085k4.m55388c5().length > 65534) {
                    c12275wy.m57506x1(2);
                }
                c11785nhM6085k4.m55399k4(c12275wy);
                c12275wy.m57507x1(abstractC3150x6);
                c11785nhM6085k4.dispose();
            } catch (Throwable th) {
                if (c11785nhM6085k4 != null) {
                    c11785nhM6085k4.dispose();
                }
                throw th;
            }
        } finally {
            c12275wy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6093k4(C11785nh c11785nh, IMasterTheme iMasterTheme, final u8s u8sVar) {
        if (iMasterTheme == null || u8sVar.m71556to().containsKey(iMasterTheme)) {
            return;
        }
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/theme/theme{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.10
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextThemeFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVar.m71551lr();
            }
        }, new C11831uw());
        new np9(c11791osM55394k4, u8sVar).m68153k4(iMasterTheme);
        u8sVar.m71556to().addItem(iMasterTheme, c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6094k4(C11785nh c11785nh, IPresentation iPresentation) {
        ((DocumentProperties) iPresentation.getDocumentProperties()).m1346to(C14084qq.m67074c5().Clone());
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/docProps/core.xml", (AbstractC11760jd.k4) null, new C11859yd());
        new C14565tk(c11791osM55394k4, this.f5010k4).m71240x1(iPresentation.getDocumentProperties());
        c11785nh.m55390dy().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6095k4(C11785nh c11785nh, IPresentation iPresentation, int i) {
        boolean z = true;
        if (i != 1 && i != 3 && i != 5) {
            z = false;
        }
        if (iPresentation.getVbaProject() == null || !z) {
            return;
        }
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/vbaProject.bin", (AbstractC11760jd.k4) null, new C11835v6());
        new x7y().m73177k4(c11791osM55394k4, iPresentation);
        c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6096k4(C11785nh c11785nh, ISlide iSlide, C11791os c11791os, final u8s u8sVar) {
        if (iSlide.getNotesSlideManager().getNotesSlide() != null) {
            INotesSlide notesSlide = iSlide.getNotesSlideManager().getNotesSlide();
            C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/notesSlides/notesSlide{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.fbk.7
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextNotesFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71564wy();
                }
            }, new C11725dc());
            qfp qfpVar = new qfp(c11791osM55394k4, u8sVar, notesSlide);
            c11791osM55394k4.m55377up().m55311x1(c11791os);
            c11791os.m55377up().m55311x1(c11791osM55394k4);
            int iM71552m9 = u8sVar.m71552m9();
            if (iM71552m9 == 0) {
                if (notesSlide.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide() != null) {
                    c11791osM55394k4.m55377up().m55311x1(c11785nh.m55369x6()[0]);
                }
                C14576tt.m71304k4(notesSlide.getThemeManager(), c11791osM55394k4.m55377up(), u8sVar);
            } else if (iM71552m9 != 1 && iM71552m9 != 2) {
                throw new Exception();
            }
            qfpVar.m69562x1(notesSlide);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6097k4(C11785nh c11785nh, Presentation presentation) {
        C11791os c11791osM55394k4 = c11785nh.m55394k4("/ppt/presProps.xml", (AbstractC11760jd.k4) null, new C11794q3());
        new ot7(c11791osM55394k4, this.f5010k4).m68824x1(presentation);
        c11785nh.m55354ar().m55377up().m55311x1(c11791osM55394k4);
    }
}
