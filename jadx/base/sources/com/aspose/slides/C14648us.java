package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.TextFrameFormat;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7261ao;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7473dd;
import com.aspose.slides.internal.p332p7.C7632f3;
import com.aspose.slides.internal.p332p7.C8488p1;
import com.aspose.slides.internal.p332p7.C8515pd;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.us */
/* JADX INFO: loaded from: classes3.dex */
class C14648us {

    /* JADX INFO: renamed from: du */
    private long f49376du;

    /* JADX INFO: renamed from: h4 */
    private long f49377h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f49378k4;

    /* JADX INFO: renamed from: kk */
    private final AutoShape f49379kk;

    /* JADX INFO: renamed from: to */
    private long f49380to;

    /* JADX INFO: renamed from: x1 */
    private final C8488p1 f49381x1;

    public C14648us(C8488p1 c8488p1, SmartArt smartArt, gnb gnbVar) {
        TextFrame textFrameM276ck;
        C7632f3 c7632f3M38877x1;
        this.f49381x1 = c8488p1;
        AutoShape autoShape = new AutoShape(smartArt);
        this.f49379kk = autoShape;
        m71872k4(c8488p1.m38565c5() != null);
        if (c8488p1.m38565c5() != null) {
            textFrameM276ck = autoShape.m276ck();
            hn7.m7241k4(textFrameM276ck, c8488p1.m38565c5(), gnbVar);
        } else {
            textFrameM276ck = (TextFrame) autoShape.addTextFrame(C14113y2.f47374k4);
        }
        this.f49380to = ((ParagraphCollection) textFrameM276ck.getParagraphs()).m2180to();
        this.f49376du = ((TextFrameFormat) textFrameM276ck.getTextFrameFormat()).getVersion();
        this.f49377h4 = m71858c5();
        textFrameM276ck.m2908jd().f3536kk = new TextFrameFormat.AbstractC0653k4() { // from class: com.aspose.slides.us.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.SmartArt.DiagramPoint.OnTextFrameChanged()";
            }

            @Override // com.aspose.slides.TextFrameFormat.AbstractC0653k4
            /* JADX INFO: renamed from: k4 */
            public void mo481k4() {
                C14648us.this.m71860jd();
            }
        };
        if (c8488p1.m38567dy() == null) {
            c8488p1.m38578x1();
        }
        C13677j9.m63254k4(autoShape, c8488p1.m38567dy(), gnbVar);
        if (c8488p1.m38567dy().m35368c5() != null && autoShape.getLineFormat().getFillFormat().getFillType() == -1) {
            autoShape.getLineFormat().getFillFormat().setFillType((byte) 1);
        }
        if (c8488p1.m38569jd() == null || (c7632f3M38877x1 = C8515pd.m38877x1(c8488p1.m38569jd())) == null) {
            return;
        }
        C14918zx.m74872k4(autoShape, c7632f3M38877x1.m31571dy(), c7632f3M38877x1.m31569c5(), gnbVar);
        autoShape.setHidden(c7632f3M38877x1.m31581m9());
        autoShape.setAlternativeText(c7632f3M38877x1.m31570du());
        autoShape.setName(c7632f3M38877x1.m31582to());
    }

    /* JADX INFO: renamed from: c5 */
    private long m71858c5() {
        long version = 0;
        if (this.f49379kk.m288x1() == null) {
            return 0L;
        }
        IGenericEnumerator<IPortion> it = this.f49379kk.m288x1().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                it = it.next().getPortions().iterator();
                while (it.hasNext()) {
                    try {
                        version = ((version & 4294967295L) + (((Portion) it.next()).m2295x1().getVersion() & 4294967295L)) & 4294967295L;
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
        return version;
    }

    /* JADX INFO: renamed from: dy */
    private boolean m71859dy() {
        return (C14113y2.m67411k4(this.f49379kk.getName()) && C14113y2.m67411k4(this.f49379kk.getAlternativeText()) && this.f49379kk.getHyperlinkClick() == null && this.f49379kk.getHyperlinkMouseOver() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public void m71860jd() {
        SmartArt smartArt = (SmartArt) C7019kk.m27452k4((Object) this.f49379kk.m2576t6(), SmartArt.class);
        if (smartArt != null) {
            smartArt.m2778k4().m69205kk(false);
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m71865du() {
        return this.f49381x1.m38568h4();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m71866h4() {
        return this.f49379kk.getShapeType();
    }

    /* JADX INFO: renamed from: k4 */
    public final TextFrame m71867k4() {
        return this.f49379kk.m288x1();
    }

    /* JADX INFO: renamed from: kk */
    public final C7261ao m71873kk() {
        if (this.f49381x1.m38576m9() == null) {
            this.f49381x1.m38570k4();
        }
        return this.f49381x1.m38576m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m71875m9() {
        return ((((ParagraphCollection) this.f49379kk.m288x1().getParagraphs()).m2180to() & 4294967295L) == (this.f49380to & 4294967295L) && (((TextFrameFormat) this.f49379kk.m288x1().getTextFrameFormat()).getVersion() & 4294967295L) == (this.f49376du & 4294967295L) && (m71858c5() & 4294967295L) == (4294967295L & this.f49377h4)) ? false : true;
    }

    /* JADX INFO: renamed from: to */
    public final String m71876to() {
        return this.f49381x1.m38566du();
    }

    public String toString() {
        return m71876to();
    }

    /* JADX INFO: renamed from: x1 */
    public final ThreeDFormat m71877x1() {
        return this.f49379kk.m2545bv();
    }

    /* JADX INFO: renamed from: k4 */
    public static C8488p1 m71861k4(C14648us c14648us) {
        return c14648us.f49381x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71878x1(int i) {
        this.f49379kk.setShapeType(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71868k4(int i) {
        this.f49381x1.m38571k4(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m71874kk(SmartArtShape smartArtShape) {
        this.f49379kk.m288x1().m2910k4((ITextFrame) smartArtShape.m2820kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71879x1(SmartArtShape smartArtShape) {
        m71862k4(smartArtShape, this.f49379kk);
        ((FillFormat) this.f49379kk.getFillFormat()).m1456k4(smartArtShape.getFillFormat());
        this.f49379kk.m2582v4().m1896k4((ILineFormat) smartArtShape.m2571lr());
        this.f49379kk.m2545bv().m3007k4((IThreeDFormat) smartArtShape.m2545bv());
        this.f49379kk.m2595yd().m1387k4((IEffectFormat) smartArtShape.m2595yd());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71862k4(IShape iShape, IShape iShape2) {
        iShape2.setHidden(iShape.getHidden());
        iShape2.setAlternativeText(iShape.getAlternativeText());
        iShape2.setName(iShape.getName());
        if (iShape.getHyperlinkClick() == null || iShape.getHyperlinkClick().getActionType() != 1) {
            iShape2.setHyperlinkClick(iShape.getHyperlinkClick());
        } else {
            Hyperlink hyperlink = (Hyperlink) iShape.getHyperlinkClick();
            iShape2.setHyperlinkClick(new Hyperlink(hyperlink, hyperlink.getTargetFrame(), hyperlink.getTooltip(), hyperlink.getHistory(), hyperlink.getStopSoundOnClick(), hyperlink.getHighlightClick()));
        }
        iShape2.setHyperlinkMouseOver(iShape.getHyperlinkMouseOver());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71869k4(SmartArtShape smartArtShape) {
        m71862k4(this.f49379kk, smartArtShape);
        if (this.f49379kk.getFillFormat().getFillType() != -1) {
            ((FillFormat) smartArtShape.getFillFormat()).m1456k4(this.f49379kk.getFillFormat());
        }
        if (this.f49379kk.m2571lr().getFillFormat().getFillType() != -1) {
            smartArtShape.m2582v4().m1896k4((ILineFormat) this.f49379kk.m2571lr());
        }
        smartArtShape.m2545bv().m3007k4((IThreeDFormat) this.f49379kk.m2545bv());
        smartArtShape.m2595yd().m1387k4((IEffectFormat) this.f49379kk.m2595yd());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71880x1(String str) {
        this.f49381x1.m38574k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71870k4(u8s u8sVar) {
        this.f49381x1.m38573k4(new C8952ug());
        if (!C14113y2.m67363du(this.f49379kk.m288x1().getText(), C14113y2.f47374k4)) {
            this.f49381x1.m38576m9().m28367k4((byte) -1);
        }
        if (this.f49379kk.m288x1() != null) {
            IGenericEnumerator<IPortion> it = this.f49379kk.m288x1().getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    it = it.next().getPortions().iterator();
                    while (true) {
                        try {
                            if (!it.hasNext()) {
                                break;
                            } else if (!C14064he.m66715kk(it.next().getPortionFormat().getFontHeight())) {
                                this.f49381x1.m38576m9().m28381to((byte) 1);
                                break;
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
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        hn7.m7242k4(this.f49379kk.m288x1(), this.f49381x1.m38565c5(), u8sVar);
        this.f49381x1.m38567dy().m35378k4((C7394ca) null);
        if (this.f49379kk.getShapeType() != -1 && this.f49379kk.getShapeType() != 0) {
            C0914ds.m5240x1(this.f49379kk, this.f49381x1.m38567dy());
        }
        this.f49381x1.m38567dy().m35392x1((C7394ca) null);
        if (this.f49379kk.getFillFormat().getFillType() != -1) {
            C1169h1.m6956k4(this.f49379kk.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.us.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(C14648us.this.f49381x1.m38567dy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ShapePropertiesElementData.AddFillProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return C14648us.this.f49381x1.m38567dy().m35390x1(str);
                }
            }, u8sVar);
        }
        this.f49381x1.m38567dy().m35382k4((C8985uy) null);
        if (!this.f49379kk.getLineFormat().isFormatNotDefined()) {
            euh.m5726k4(this.f49379kk.getLineFormat(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.us.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(C14648us.this.f49381x1.m38567dy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ShapePropertiesElementData.AddLn()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8985uy invoke() {
                    return C14648us.this.f49381x1.m38567dy().m35391x1();
                }
            });
        }
        this.f49381x1.m38567dy().m35386kk((C7394ca) null);
        if (!this.f49379kk.getEffectFormat().isNoEffects()) {
            C1158gq.m6877k4(this.f49379kk.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.us.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(C14648us.this.f49381x1.m38567dy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ShapePropertiesElementData.AddEffectProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return C14648us.this.f49381x1.m38567dy().m35375k4(str);
                }
            }, u8sVar);
        }
        this.f49381x1.m38567dy().m35380k4((C8638qy) null);
        this.f49381x1.m38567dy().m35381k4((C8820sx) null);
        if (this.f49379kk.m2545bv().m3009k4(true)) {
            b6z.m4032k4(this.f49379kk.m2545bv(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.us.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(C14648us.this.f49381x1.m38567dy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ShapePropertiesElementData.AddScene3d()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8820sx invoke() {
                    return C14648us.this.f49381x1.m38567dy().m35385kk();
                }
            }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.us.6
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(C14648us.this.f49381x1.m38567dy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ShapePropertiesElementData.AddSp3d()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8638qy invoke() {
                    return C14648us.this.f49381x1.m38567dy().m35388to();
                }
            }, (AbstractC4685kk<C7317be>) null);
        }
        if (!m71859dy()) {
            this.f49381x1.m38572k4((AbstractC7414ck) null);
            return;
        }
        if (this.f49381x1.m38569jd() == null) {
            this.f49381x1.m38577to();
        }
        final C7632f3 c7632f3 = new C7632f3();
        c7632f3.m31577k4(this.f49379kk.getName());
        c7632f3.m31584x1(this.f49379kk.getAlternativeText());
        c7632f3.m31578k4(this.f49379kk.getHidden());
        C14918zx.m74871k4(this.f49379kk, new AbstractC4685kk<C7473dd>() { // from class: com.aspose.slides.us.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7632f3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualDrawingPropsElementData.AddHlinkClick()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7473dd invoke() {
                return c7632f3.m31574k4();
            }
        }, new AbstractC4685kk<C7473dd>() { // from class: com.aspose.slides.us.8
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
        C8515pd.m38870k4(this.f49381x1.m38569jd(), c7632f3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71871k4(String str) {
        this.f49381x1.m38579x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71872k4(boolean z) {
        this.f49378k4 = z;
    }
}
