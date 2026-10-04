package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.b6z;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7416cl;
import com.aspose.slides.internal.p332p7.C7473dd;
import com.aspose.slides.internal.p332p7.C7632f3;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8130kt;
import com.aspose.slides.internal.p332p7.C8256md;
import com.aspose.slides.internal.p332p7.C8290mt;
import com.aspose.slides.internal.p332p7.C8397nz;
import com.aspose.slides.internal.p332p7.C8403o4;
import com.aspose.slides.internal.p332p7.C8490p3;
import com.aspose.slides.internal.p332p7.C8515pd;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9030ve;
import com.aspose.slides.internal.p332p7.C9112wh;
import com.aspose.slides.internal.p332p7.C9220xo;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class axn {
    /* JADX INFO: renamed from: k4 */
    private static C8397nz m3759k4(AbstractC3150x6 abstractC3150x6) {
        AbstractC13912i5 abstractC13912i5M65463k4 = AbstractC13912i5.m65463k4(abstractC3150x6);
        try {
            if (!abstractC13912i5M65463k4.mo65026h4() || !"extLst".equals(abstractC13912i5M65463k4.mo65023fa())) {
                abstractC13912i5M65463k4.dispose();
                throw new ArgumentException();
            }
            C8397nz c8397nz = new C8397nz(abstractC13912i5M65463k4);
            abstractC13912i5M65463k4.dispose();
            return c8397nz;
        } catch (Throwable th) {
            if (abstractC13912i5M65463k4 != null) {
                abstractC13912i5M65463k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC7414ck m3773x1(C8290mt[] c8290mtArr) {
        C3152yj c3152yj = new C3152yj();
        try {
            C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
            try {
                c13991ub.m65804kk("extLst", "a");
                for (C8290mt c8290mt : c8290mtArr) {
                    if (c8290mt != null) {
                        c13991ub.mo21895dy(c8290mt.mo28309k4());
                    }
                }
                c13991ub.mo21898jd();
                c13991ub.mo21896h4();
                c3152yj.seek(0L, 0);
                C8397nz c8397nzM3759k4 = m3759k4(c3152yj);
                c13991ub.dispose();
                return c8397nzM3759k4;
            } catch (Throwable th) {
                c13991ub.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3760k4(IShape iShape, AbstractC7414ck abstractC7414ck, gnb gnbVar) {
        ((Shape) iShape).mo272to().m69042m9(abstractC7414ck);
        if (gnbVar.m6792ne() && abstractC7414ck != null && C7019kk.m27469x1(iShape, AutoShape.class)) {
            C7394ca c7394caM38874kk = C8515pd.m38874kk(abstractC7414ck);
            if (c7394caM38874kk != null) {
                AutoShape autoShape = (AutoShape) iShape;
                autoShape.mo268du().m4907k4(new FillFormat(null));
                C1169h1.m6958k4(autoShape.mo268du().m4903dy(), c7394caM38874kk, gnbVar);
            }
            C7394ca c7394caM38876to = C8515pd.m38876to(abstractC7414ck);
            if (c7394caM38876to != null) {
                AutoShape autoShape2 = (AutoShape) iShape;
                autoShape2.mo268du().m4906k4(new EffectFormat(null));
                C1158gq.m6878k4(autoShape2.mo268du().m4901c5(), c7394caM38876to, gnbVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3761k4(IShape iShape, AbstractC7414ck abstractC7414ck, C8087kh c8087kh, u8s u8sVar) {
        C3125bv c3125bv;
        C3059ii c3059ii;
        if (abstractC7414ck != null && C7019kk.m27469x1(iShape, AutoShape.class)) {
            AutoShape autoShape = (AutoShape) iShape;
            if (autoShape.mo268du().m4903dy() != null) {
                IFillFormat iFillFormatM4903dy = autoShape.mo268du().m4903dy();
                C13981tl c13981tl = (C13981tl) fyw.m6352k4((AbstractC13901ga) C8515pd.m38878x1(abstractC7414ck, "{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}").m37126x1().getDocumentElement(), "hiddenFill", "http://schemas.microsoft.com/office/drawing/2010/main");
                C6765kp c6765kp = new C6765kp();
                c3125bv = new C3125bv(c6765kp);
                try {
                    c3059ii = new C3059ii(c3125bv, u8sVar.mo4812qm().m55348m9());
                    try {
                        byte fillType = iFillFormatM4903dy.getFillType();
                        if (fillType == 1) {
                            final C8256md c8256md = new C8256md();
                            C1246ib.m7609k4(iFillFormatM4903dy.getSolidFillColor(), new C7394ca.k4() { // from class: com.aspose.slides.axn.13
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c8256md) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_SolidColorFillPropertiesElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str) {
                                    return c8256md.m36800k4(str);
                                }
                            });
                            c8256md.mo6846k4("a", c3059ii, "solidFill");
                        } else if (fillType == 2) {
                            C8403o4 c8403o4 = new C8403o4();
                            c8403o4.m37986k4(iFillFormatM4903dy.getRotateWithShape());
                            C14199ns.m68196x1(iFillFormatM4903dy.getGradientFormat(), c8403o4);
                            c8403o4.mo6846k4("a", c3059ii, "gradFill");
                        } else if (fillType == 3) {
                            C7416cl c7416cl = new C7416cl();
                            hhj.m7151x1(iFillFormatM4903dy.getPatternFormat(), c7416cl);
                            c7416cl.mo6846k4("a", c3059ii, "pattFill");
                        } else if (fillType == 4) {
                            C9220xo c9220xo = new C9220xo();
                            c9220xo.m44551k4(iFillFormatM4903dy.getRotateWithShape());
                            xps.m73533k4((PictureFillFormat) iFillFormatM4903dy.getPictureFillFormat(), c9220xo, u8sVar);
                            c9220xo.mo6846k4("a", c3059ii, "blipFill");
                        } else if (fillType != 5) {
                            new C8130kt().mo6846k4("a", c3059ii, "noFill");
                        } else {
                            new C9112wh().mo6846k4("a", c3059ii, "grpFill");
                        }
                        c3059ii.dispose();
                        c3125bv.mo13308kk();
                        c3125bv.dispose();
                        c13981tl.setInnerXml(c6765kp.toString());
                    } catch (Throwable th) {
                        throw th;
                    }
                } finally {
                }
            }
            if (autoShape.mo268du().m4901c5() != null) {
                IEffectFormat iEffectFormatM4901c5 = autoShape.mo268du().m4901c5();
                C13981tl c13981tl2 = (C13981tl) fyw.m6352k4((AbstractC13901ga) C8515pd.m38878x1(abstractC7414ck, "{AF507438-7753-43E0-B8FC-AC1667EBCBE1}").m37126x1().getDocumentElement(), "hiddenEffects", "http://schemas.microsoft.com/office/drawing/2010/main");
                C6765kp c6765kp2 = new C6765kp();
                c3125bv = new C3125bv(c6765kp2);
                try {
                    c3059ii = new C3059ii(c3125bv, u8sVar.mo4812qm().m55348m9());
                    try {
                        C8490p3 c8490p3 = new C8490p3();
                        C1158gq.m6879k4(iEffectFormatM4901c5, c8490p3, u8sVar);
                        c8490p3.mo6846k4("a", c3059ii, "effectLst");
                        c3059ii.dispose();
                        c3125bv.mo13308kk();
                        c3125bv.dispose();
                        c13981tl2.setInnerXml(c6765kp2.toString());
                    } finally {
                        c3059ii.dispose();
                    }
                } finally {
                }
            }
        }
        c8087kh.m35379k4(abstractC7414ck);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3762k4(IShape iShape, C7632f3 c7632f3, bjs bjsVar) {
        if (c7632f3 == null) {
            return;
        }
        C14918zx.m74872k4(iShape, c7632f3.m31571dy(), c7632f3.m31569c5(), bjsVar.m4229k4());
        iShape.setHidden(c7632f3.m31581m9());
        iShape.setAlternativeText(c7632f3.m31570du());
        iShape.setAlternativeTextTitle(c7632f3.m31572h4());
        iShape.setName(c7632f3.m31582to());
        iShape.setDecorative(m3770k4(c7632f3));
        Shape shape = (Shape) iShape;
        pga pgaVarMo272to = shape.mo272to();
        int iM6775du = bjsVar.m4229k4().m6775du();
        if (iM6775du == 0 || iM6775du == 1) {
            shape.m2577to(!bjsVar.m4234k4(C13850af.m65147x1(c7632f3.m31579kk()), iShape) ? c7632f3.m31579kk() : 0L);
        } else if (iM6775du != 2) {
            if (iM6775du != 3) {
                throw new ArgumentOutOfRangeException();
            }
            shape.m2577to(!bjsVar.m4234k4(C13850af.m65147x1(c7632f3.m31579kk()), iShape) ? c7632f3.m31579kk() : 0L);
        }
        bjsVar.m4229k4().m6774ck().addItem(iShape);
        pgaVarMo272to.m69037du(c7632f3.m31573jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3763k4(IShape iShape, final C7632f3 c7632f3, u8s u8sVar) {
        C14918zx.m74871k4(iShape, new AbstractC4685kk<C7473dd>() { // from class: com.aspose.slides.axn.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7632f3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualDrawingPropsElementData.AddHlinkClick()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7473dd invoke() {
                return c7632f3.m31574k4();
            }
        }, new AbstractC4685kk<C7473dd>() { // from class: com.aspose.slides.axn.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7632f3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualDrawingPropsElementData.AddHlinkHover()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7473dd invoke() {
                return c7632f3.m31583x1();
            }
        }, u8sVar);
        c7632f3.m31578k4(iShape.getHidden());
        c7632f3.m31584x1(iShape.getAlternativeText());
        c7632f3.m31580kk(iShape.getAlternativeTextTitle());
        c7632f3.m31577k4(iShape.getName());
        pga pgaVarMo272to = ((Shape) iShape).mo272to();
        c7632f3.m31575k4(pgaVarMo272to.m69039ix());
        c7632f3.m31576k4(pgaVarMo272to.m69045u4());
        m3769k4(c7632f3, iShape.isDecorative());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3764k4(IShape iShape, com.aspose.slides.internal.p332p7.gt8 gt8Var, bjs bjsVar) {
        if (gt8Var == null) {
            return;
        }
        exz.m5773k4(iShape, gt8Var.m32911h4(), bjsVar);
        pga pgaVarMo272to = ((Shape) iShape).mo272to();
        C14537t9.m71034k4(iShape.getCustomData(), gt8Var.m32910dy(), bjsVar.m4229k4());
        if (iShape.getCustomData().getTags().contains("AS_UNIQUEID")) {
            ((Shape) iShape).m2578to(iShape.getCustomData().getTags().get_Item("AS_UNIQUEID"));
            iShape.getCustomData().getTags().remove("AS_UNIQUEID");
        }
        pgaVarMo272to.m69041kk(gt8Var.m32919to());
        pgaVarMo272to.m69044to(gt8Var.m32909du());
        pgaVarMo272to.m69038h4(gt8Var.m32908c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3765k4(IShape iShape, final com.aspose.slides.internal.p332p7.gt8 gt8Var, u8s u8sVar) {
        if (gt8Var == null) {
            return;
        }
        exz.m5772k4(iShape, new AbstractC4685kk<com.aspose.slides.internal.p332p7.vy9>() { // from class: com.aspose.slides.axn.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(gt8Var) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_ApplicationNonVisualDrawingPropsElementData.AddPh()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.vy9 invoke() {
                return gt8Var.m32913k4();
            }
        });
        pga pgaVarMo272to = ((Shape) iShape).mo272to();
        if (((Presentation) iShape.getPresentation()).m2384kk()) {
            iShape.getCustomData().getTags().add("AS_UNIQUEID", C14114y9.m67459k4(iShape.getUniqueId(), (InterfaceC14073kp) C11697x1.m55250kk()));
        }
        C14537t9.m71033k4(iShape.getCustomData(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.fbr>() { // from class: com.aspose.slides.axn.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(gt8Var) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_ApplicationNonVisualDrawingPropsElementData.AddCustDataLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.fbr invoke() {
                return gt8Var.m32920x1();
            }
        }, u8sVar);
        if (((Presentation) iShape.getPresentation()).m2384kk()) {
            iShape.getCustomData().getTags().remove("AS_UNIQUEID");
        }
        gt8Var.m32916k4(pgaVarMo272to.m69043qq());
        gt8Var.m32921x1(pgaVarMo272to.m69036ar());
        gt8Var.m32915k4(pgaVarMo272to.m69046uz());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3766k4(final IShape iShape, C8087kh c8087kh, gnb gnbVar) {
        if (c8087kh == null) {
            return;
        }
        C1169h1.m6958k4(iShape.getFillFormat(), c8087kh.m35371dy(), gnbVar);
        if (c8087kh.m35368c5() != null) {
            Shape shape = (Shape) iShape;
            LineFormat lineFormat = new LineFormat(shape);
            euh.m5728k4(lineFormat, c8087kh.m35368c5());
            ILineFormat[] iLineFormatArr = {lineFormat};
            gnbVar.m6801yj().m2346bv().mo4046k4().mo4418k4(iLineFormatArr);
            shape.m2557k4((LineFormat) iLineFormatArr[0]);
            shape.m2544b3();
        }
        C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.axn.1
            @Override // com.aspose.slides.C1158gq.k4
            /* JADX INFO: renamed from: k4 */
            public IEffectFormat mo3774k4() {
                return iShape.getEffectFormat();
            }
        }, c8087kh.m35374jd(), gnbVar);
        b6z.m4034k4(new b6z.AbstractC0806k4() { // from class: com.aspose.slides.axn.6
            @Override // com.aspose.slides.b6z.AbstractC0806k4
            /* JADX INFO: renamed from: k4 */
            public IThreeDFormat mo3782k4() {
                return iShape.getThreeDFormat();
            }
        }, c8087kh.m35369ck(), c8087kh.m35372fa(), (C7317be) null);
        iShape.setBlackWhiteMode(c8087kh.m35370du());
        if (c8087kh.m35373h4() != null) {
            tbp tbpVar = new tbp();
            tbp tbpVar2 = new tbp();
            C1258im c1258im = new C1258im();
            tbp[] tbpVarArr = {tbpVar};
            tbp[] tbpVarArr2 = {tbpVar2};
            C1258im[] c1258imArr = {c1258im};
            ai9.m3628k4(c8087kh.m35373h4(), tbpVarArr, tbpVarArr2, c1258imArr);
            tbpVarArr[0].CloneTo(tbpVar);
            tbpVarArr2[0].CloneTo(tbpVar2);
            c1258imArr[0].CloneTo(c1258im);
            Shape shape2 = (Shape) iShape;
            nd1 nd1VarMo1214P_ = shape2.mo1214P_();
            nd1VarMo1214P_.m67987k4(tbpVar.Clone());
            shape2.mo1650kk(tbpVar2.Clone());
            nd1VarMo1214P_.m67986k4(c1258im.Clone());
        }
        m3760k4(iShape, c8087kh.m35389up(), gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3767k4(IShape iShape, final C8087kh c8087kh, u8s u8sVar) {
        C1169h1.m6956k4(iShape.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.axn.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh2 = c8087kh;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8087kh.m35390x1(str);
            }
        }, u8sVar);
        euh.m5726k4(iShape.getLineFormat(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.axn.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh2 = c8087kh;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8087kh.m35391x1();
            }
        });
        C1158gq.m6877k4(iShape.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.axn.9
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh2 = c8087kh;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8087kh.m35375k4(str);
            }
        }, u8sVar);
        b6z.m4032k4(iShape.getThreeDFormat(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.axn.10
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh2 = c8087kh;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8820sx invoke() {
                return c8087kh.m35385kk();
            }
        }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.axn.11
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh2 = c8087kh;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8638qy invoke() {
                return c8087kh.m35388to();
            }
        }, (AbstractC4685kk<C7317be>) null);
        c8087kh.m35377k4(iShape.getBlackWhiteMode());
        Shape shape = (Shape) iShape;
        ai9.m3625k4(shape, new AbstractC4685kk<C9030ve>() { // from class: com.aspose.slides.axn.12
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh2 = c8087kh;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9030ve invoke() {
                return c8087kh.m35376k4();
            }
        }, u8sVar.m71531dy());
        m3761k4(iShape, shape.mo272to().m69047wl(), c8087kh, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3768k4(Shape shape) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3769k4(C7632f3 c7632f3, boolean z) {
        AbstractC7414ck abstractC7414ckM3773x1;
        if (z) {
            if (c7632f3.m31573jd() == null || !(c7632f3.m31573jd() == null || c7632f3.m31573jd().mo29643k4() == null || c7632f3.m31573jd().mo29643k4().length != 0)) {
                C3152yj c3152yj = new C3152yj();
                try {
                    C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                    try {
                        c13991ub.m65804kk("extLst", "a");
                        c13991ub.mo12953k4("a", "ext", "http://schemas.openxmlformats.org/drawingml/2006/main");
                        c13991ub.m65806to("uri", "{C183D7F6-B498-43B3-948B-1728B52AA6E4}");
                        c13991ub.mo12953k4("adec", "decorative", "http://schemas.microsoft.com/office/drawing/2017/decorative");
                        c13991ub.m65806to("val", "1");
                        c13991ub.mo21898jd();
                        c13991ub.mo21898jd();
                        c13991ub.mo21898jd();
                        c13991ub.mo21896h4();
                        c3152yj.seek(0L, 0);
                        c7632f3.m31576k4(m3759k4(c3152yj));
                        return;
                    } finally {
                        c13991ub.dispose();
                    }
                } finally {
                    c3152yj.dispose();
                }
            }
            abstractC7414ckM3773x1 = m3773x1(m3772k4(c7632f3.m31573jd().mo29643k4(), "1"));
        } else if (c7632f3.m31573jd() == null || c7632f3.m31573jd().mo29643k4() == null || c7632f3.m31573jd().mo29643k4().length <= 0) {
            return;
        } else {
            abstractC7414ckM3773x1 = m3773x1(m3771k4(c7632f3.m31573jd().mo29643k4()));
        }
        c7632f3.m31576k4(abstractC7414ckM3773x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3770k4(C7632f3 c7632f3) {
        XmlDocument xmlDocumentM29999k4;
        C13981tl documentElement;
        C13981tl c13981tl;
        C8397nz c8397nz = (C8397nz) C7019kk.m27452k4((Object) c7632f3.m31573jd(), C8397nz.class);
        if (c8397nz == null || c8397nz.mo29643k4().length <= 0 || (xmlDocumentM29999k4 = com.aspose.slides.internal.p332p7.d0s.m29999k4(c8397nz, "{C183D7F6-B498-43B3-948B-1728B52AA6E4}")) == null || (documentElement = xmlDocumentM29999k4.getDocumentElement()) == null || (c13981tl = (C13981tl) fyw.m6354k4(documentElement, "decorative", "http://schemas.microsoft.com/office/drawing/2017/decorative")) == null || !c13981tl.m65913to("val")) {
            return false;
        }
        return "1".equals(c13981tl.m65906k4("val"));
    }

    /* JADX INFO: renamed from: k4 */
    private static C8290mt[] m3771k4(C8290mt[] c8290mtArr) {
        C8290mt[] c8290mtArr2 = new C8290mt[c8290mtArr.length];
        for (int i = 0; i < c8290mtArr.length; i++) {
            C8290mt c8290mt = c8290mtArr[i];
            if (c8290mt != null && !"{C183D7F6-B498-43B3-948B-1728B52AA6E4}".equals(c8290mt.m37126x1().getDocumentElement().m65906k4("uri"))) {
                c8290mtArr2[i] = c8290mt;
            }
        }
        return c8290mtArr2;
    }

    /* JADX INFO: renamed from: k4 */
    private static C8290mt[] m3772k4(C8290mt[] c8290mtArr, String str) {
        C8290mt[] c8290mtArr2 = new C8290mt[c8290mtArr.length];
        for (int i = 0; i < c8290mtArr.length; i++) {
            C8290mt c8290mt = c8290mtArr[i];
            if (c8290mt != null && "{C183D7F6-B498-43B3-948B-1728B52AA6E4}".equals(c8290mt.m37126x1().getDocumentElement().m65906k4("uri"))) {
                IEnumerator it = c8290mt.m37126x1().getDocumentElement().getChildNodes().iterator();
                while (it.hasNext()) {
                    try {
                        T next = it.next();
                        if (C7019kk.m27469x1(next, C13981tl.class)) {
                            ((C13981tl) C7019kk.m27452k4((Object) next, C13981tl.class)).m65910kk("val", str);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                }
            }
            c8290mtArr2[i] = c8290mt;
        }
        return c8290mtArr2;
    }
}
