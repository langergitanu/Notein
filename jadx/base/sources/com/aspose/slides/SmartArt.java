package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7261ao;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8281mq;
import com.aspose.slides.internal.p332p7.C8680ri;
import com.aspose.slides.internal.p332p7.C8889ts;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9276yd;
import com.aspose.slides.internal.p332p7.C9352z9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class SmartArt extends GraphicalObject implements ISmartArt {

    /* JADX INFO: renamed from: du */
    private long f3425du;

    /* JADX INFO: renamed from: k4 */
    private SmartArtNode f3426k4;

    /* JADX INFO: renamed from: kk */
    private C14664v5 f3427kk;

    /* JADX INFO: renamed from: to */
    private C1101fi f3428to;

    /* JADX INFO: renamed from: x1 */
    private a7l f3429x1;

    public SmartArt(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new jrf());
        m2776wl();
        m2560k4(new prv(this));
    }

    /* JADX INFO: renamed from: ar */
    private C7261ao m2771ar() {
        return mo272to().m63500dy().m38576m9();
    }

    /* JADX INFO: renamed from: qq */
    private void m2774qq() {
        IGenericEnumerator<ISmartArtNode> it = ((SmartArtNodeCollection) getAllNodes()).iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<ISmartArtShape> it2 = ((SmartArtNode) it.next()).getShapes().iterator();
                while (it2.hasNext()) {
                    try {
                        ((SmartArtShape) it2.next()).m2815k4();
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: wl */
    private void m2776wl() {
        mo272to().m63503k4(new GroupShape(this));
        this.f3300c5 = new LineFormat(this);
    }

    /* JADX INFO: renamed from: ck */
    public final void m2777ck() {
        m2786x1(new gnb(getPresentation(), InterruptionToken.getNone()));
    }

    @Override // com.aspose.slides.ISmartArt
    public final ISmartArtNodeCollection getAllNodes() {
        SmartArtNodeCollection smartArtNodeCollection = new SmartArtNodeCollection(this.f3426k4);
        smartArtNodeCollection.m2811k4();
        return smartArtNodeCollection;
    }

    @Override // com.aspose.slides.ISmartArt
    public final int getColorStyle() {
        return wz8.m72980k4(m2771ar().m28348c5());
    }

    @Override // com.aspose.slides.ISmartArt
    public final int getLayout() {
        return lpe.m64501k4(m2771ar().m28375m9());
    }

    @Override // com.aspose.slides.ISmartArt
    public final ISmartArtNodeCollection getNodes() {
        return this.f3426k4.getChildNodes();
    }

    @Override // com.aspose.slides.ISmartArt
    public final int getQuickStyle() {
        return lwx.m64609k4(m2771ar().m28356dy());
    }

    @Override // com.aspose.slides.ISmartArt
    public final boolean isReversed() {
        return this.f3426k4.m2795h4();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        super.mo280jd();
        m2559k4(((Slide) m2583vj()).m2687bv().m406x1(getPlaceholder().getIndex()).m2593xk());
        m2778k4().m69203k4(m2580ts());
    }

    /* JADX INFO: renamed from: k4 */
    public final prv m2778k4() {
        return (prv) m2546bz();
    }

    /* JADX INFO: renamed from: kk */
    public final String m2782kk() {
        String strM28375m9 = m2771ar().m28375m9();
        return strM28375m9 == null ? C14113y2.f47374k4 : strM28375m9;
    }

    /* JADX INFO: renamed from: rv */
    public final void m2783rv() {
        this.f3425du = mo275c5();
    }

    @Override // com.aspose.slides.ISmartArt
    public final void setColorStyle(int i) {
        if (getColorStyle() != i) {
            wum.m72929to(this, i);
            C9276yd c9276ydM63502k4 = mo272to().m63502k4();
            m2771ar().m28358dy(c9276ydM63502k4.m44942k4());
            m2771ar().m28350c5(c9276ydM63502k4.m44944x1().m44857k4()[0].m37342k4());
            m2777ck();
        }
    }

    @Override // com.aspose.slides.ISmartArt
    public final void setLayout(int i) {
        if (i == 134) {
            throw new ArgumentException("Layout template for SmartArtLayoutType.Custom does not exist.");
        }
        if (getLayout() != i) {
            wum.m72930x1(this, i);
            C8680ri c8680riM63513to = mo272to().m63513to();
            m2771ar().m28383to(c8680riM63513to.m40026k4());
            m2771ar().m28355du(c8680riM63513to.m40028x1().m41768k4()[0].m34520k4());
            m2777ck();
        }
    }

    @Override // com.aspose.slides.ISmartArt
    public final void setQuickStyle(int i) {
        if (getQuickStyle() != i) {
            wum.m72928kk(this, i);
            C9352z9 c9352z9M63499du = mo272to().m63499du();
            m2771ar().m28362h4(c9352z9M63499du.m45519k4());
            m2771ar().m28377m9(c9352z9M63499du.m45522x1().m43647k4()[0].m39810k4());
            m2777ck();
        }
    }

    @Override // com.aspose.slides.ISmartArt
    public final void setReversed(boolean z) {
        if (isReversed() != z) {
            this.f3426k4.m2800k4(z);
            m2777ck();
        }
    }

    @Override // com.aspose.slides.GraphicalObject
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final jrf mo272to() {
        return (jrf) super.mo272to();
    }

    /* JADX INFO: renamed from: up */
    public final a7l m2785up() {
        return this.f3429x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2786x1(gnb gnbVar) {
        mo272to().m63512m9().getShapes().clear();
        m2774qq();
        m2775to(gnbVar);
        m2778k4().m69205kk(false);
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m2787yj() {
        TextFrame textFrameM288x1;
        if (mo272to().m63501h4() == null || mo272to().m63512m9().getShapes().size() == 0 || (mo275c5() & 4294967295L) != (4294967295L & this.f3425du)) {
            return false;
        }
        IShapeCollection shapes = mo272to().m63512m9().getShapes();
        IGenericEnumerator<IShape> it = shapes.iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) it.next(), AutoShape.class);
                bay bayVarM3349k4 = this.f3429x1.m3349k4(autoShape.mo268du().m4904h4());
                if (bayVarM3349k4 != null && (textFrameM288x1 = autoShape.m288x1()) != null) {
                    if (!C14064he.m66715kk(textFrameM288x1.m2908jd().getRotationAngle())) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return false;
                    }
                    String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(textFrameM288x1.m2901c5(), "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "");
                    String strM67400k4 = C14113y2.f47374k4;
                    List.Enumerator<C14244on> it2 = bayVarM3349k4.m4076h4().iterator();
                    while (it2.hasNext()) {
                        try {
                            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67401k4(C14113y2.m67401k4(it2.next().m68729kk(), "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, ""));
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    if (!C14113y2.m67363du(strM67400k4, strM67401k4)) {
                        return false;
                    }
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
        it = shapes.iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape2 = (AutoShape) C7019kk.m27452k4((Object) it.next(), AutoShape.class);
                bay bayVarM3349k42 = this.f3429x1.m3349k4(autoShape2.mo268du().m4904h4());
                if (bayVarM3349k42 != null) {
                    bayVarM3349k42.m4074dy().m74249k4(autoShape2);
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
        this.f3429x1.m3348h4();
        IGenericEnumerator<IParagraph> it3 = getAllNodes().iterator();
        do {
            try {
                if (!it3.hasNext()) {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                    this.f3429x1.m3355m9();
                    it3 = shapes.iterator();
                    while (it3.hasNext()) {
                        try {
                            AutoShape autoShape3 = (AutoShape) C7019kk.m27452k4((Object) it3.next(), AutoShape.class);
                            bay bayVarM3349k43 = this.f3429x1.m3349k4(autoShape3.mo268du().m4904h4());
                            if (bayVarM3349k43 != null) {
                                bayVarM3349k43.m4074dy().m74249k4(autoShape3);
                                if (autoShape3.getTextFrame() != null) {
                                    it3 = autoShape3.getTextFrame().getParagraphs().iterator();
                                    while (it3.hasNext()) {
                                        try {
                                            IGenericEnumerator<IPortion> it4 = ((Paragraph) it3.next()).getPortions().iterator();
                                            while (it4.hasNext()) {
                                                try {
                                                    Portion portion = (Portion) it4.next();
                                                    if (portion.getPortionFormat().getFontHeight() < portion.getPortionFormat().getKerningMinimalSize()) {
                                                        portion.getPortionFormat().setFontHeight(portion.getPortionFormat().getFontHeight() + 0.1f);
                                                    }
                                                } catch (Throwable th2) {
                                                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                                        it4.dispose();
                                                    }
                                                    throw th2;
                                                }
                                            }
                                            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                                it4.dispose();
                                            }
                                        } finally {
                                        }
                                    }
                                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                        it3.dispose();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        return true;
                    }
                    it3.dispose();
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        } while (!((SmartArtNode) it3.next()).m2796k4().m71875m9());
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        return false;
    }

    public SmartArt(InterfaceC14397rj interfaceC14397rj, IPresentation iPresentation, int i) {
        super(interfaceC14397rj, new jrf());
        m2776wl();
        wum.m72927k4(this, i);
        wum.m72930x1(this, i);
        wum.m72928kk(this, 0);
        wum.m72929to(this, 9);
        gnb gnbVar = new gnb(iPresentation, InterruptionToken.getNone());
        m2773kk(gnbVar);
        m2775to(gnbVar);
        m2560k4(new prv(this));
    }

    /* JADX INFO: renamed from: kk */
    private void m2773kk(gnb gnbVar) {
        C8889ts c8889tsM63514x1 = mo272to().m63514x1();
        this.f3428to = new C1101fi(c8889tsM63514x1.m41860du(), this, gnbVar);
        this.f3427kk = new C14664v5(c8889tsM63514x1.m41862h4());
        SmartArtNode smartArtNode = new SmartArtNode(null, this);
        this.f3426k4 = smartArtNode;
        smartArtNode.m2799k4(this.f3428to.m6183k4((String) null, 3));
        m2545bv().m3007k4((IThreeDFormat) this.f3426k4.m2796k4().m71877x1());
        mo272to().m63505k4(C14648us.m71861k4(this.f3426k4.m2796k4()));
        SmartArtNode smartArtNode2 = this.f3426k4;
        m2772k4(smartArtNode2, smartArtNode2.m2796k4());
    }

    /* JADX INFO: renamed from: to */
    private void m2775to(gnb gnbVar) {
        C8889ts c8889ts = new C8889ts();
        c8889ts.m41863k4();
        C1101fi c1101fi = new C1101fi(c8889ts.m41860du(), this, gnbVar);
        C14664v5 c14664v5 = new C14664v5(c8889ts.m41862h4());
        C14244on c14244on = new C14244on((C14244on) null, this.f3426k4);
        c14244on.m5143k4(c1101fi);
        c14244on.mo4093k4(c14664v5);
        a7l a7lVar = new a7l(this, mo272to().m63513to().m40027kk(), c14244on);
        this.f3429x1 = a7lVar;
        a7lVar.m3352k4(c1101fi);
        this.f3429x1.m3353k4(c14664v5);
        this.f3429x1.m3351k4(this.f3426k4);
        mo272to().m63507k4(c8889ts);
        this.f3427kk = c14664v5;
        this.f3428to = c1101fi;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14648us m2779k4(String str, String str2) {
        return this.f3428to.m6184k4(str, str2);
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo282k4(float f, float f2, float f3) {
        super.mo282k4(f, f2, f3);
        m2777ck();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m2772k4(SmartArtNode smartArtNode, C14648us c14648us) {
        List list = new List();
        IGenericEnumerator<C14808xn> it = this.f3427kk.iterator();
        while (it.hasNext()) {
            try {
                C14808xn next = it.next();
                if (C14113y2.m67363du(next.m73511kk(), c14648us.m71876to()) && next.m73506k4() == 1) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.sort();
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                C14808xn c14808xn = (C14808xn) it2.next();
                C14648us c14648usM6183k4 = this.f3428to.m6183k4(c14808xn.m73513x1(), 1);
                if (c14648usM6183k4 == null) {
                    c14648usM6183k4 = this.f3428to.m6183k4(c14808xn.m73513x1(), 2);
                }
                m2772k4(((SmartArtNodeCollection) smartArtNode.getChildNodes()).m2810k4(c14648usM6183k4, this.f3428to.m6183k4(c14808xn.m73504du(), 5), this.f3428to.m6183k4(c14808xn.m73505h4(), 6)), c14648usM6183k4);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2780k4(gnb gnbVar) {
        m2773kk(gnbVar);
        m2775to(gnbVar);
        m2787yj();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2781k4(u8s u8sVar) {
        if (mo272to().m63514x1().m41866m9() == null) {
            mo272to().m63514x1().m41868x1();
        }
        final C8281mq c8281mqM41866m9 = mo272to().m63514x1().m41866m9();
        if (c8281mqM41866m9.m37041k4() == null) {
            C1169h1.m6956k4(this.f3303dy, new C7394ca.k4() { // from class: com.aspose.slides.SmartArt.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8281mqM41866m9) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BackgroundFormattingElementData.AddFillProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8281mqM41866m9.m37044x1(str);
                }
            }, u8sVar);
        }
        if (c8281mqM41866m9.m37043x1() == null) {
            C1158gq.m6877k4(m2595yd(), new C7394ca.k4() { // from class: com.aspose.slides.SmartArt.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8281mqM41866m9) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BackgroundFormattingElementData.AddEffectProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8281mqM41866m9.m37042k4(str);
                }
            }, u8sVar);
        }
        if (mo272to().m63514x1().m41861dy() == null) {
            mo272to().m63514x1().m41865kk();
        }
        if (mo272to().m63514x1().m41861dy().m29912x1() == null) {
            euh.m5726k4(m2571lr(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.SmartArt.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(SmartArt.this.mo272to().m63514x1().m41861dy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_WholeE2oFormattingElementData.AddLn()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8985uy invoke() {
                    return SmartArt.this.mo272to().m63514x1().m41861dy().m29911k4();
                }
            });
        }
        this.f3426k4.m2796k4().m71877x1().m3007k4((IThreeDFormat) m2545bv());
        m2774qq();
        IGenericEnumerator<C14648us> it = this.f3428to.iterator();
        while (it.hasNext()) {
            try {
                it.next().m71870k4(u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
