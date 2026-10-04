package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSlide implements IBaseSlide, InterfaceC0973f1, InterfaceC14397rj {

    /* JADX INFO: renamed from: ck */
    private String f1070ck;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC14397rj f1073h4;

    /* JADX INFO: renamed from: ix */
    private long f1074ix;

    /* JADX INFO: renamed from: jd */
    private int f1075jd;

    /* JADX INFO: renamed from: k4 */
    SlideShowTransition f1076k4;

    /* JADX INFO: renamed from: kk */
    GroupShape f1077kk;

    /* JADX INFO: renamed from: m9 */
    private IPresentationComponent f1079m9;

    /* JADX INFO: renamed from: u4 */
    private C14168n5 f1082u4;

    /* JADX INFO: renamed from: x1 */
    ed2 f1084x1;

    /* JADX INFO: renamed from: x6 */
    private HyperlinkQueries f1085x6;

    /* JADX INFO: renamed from: to */
    static final BaseSlide[] f1068to = new BaseSlide[0];

    /* JADX INFO: renamed from: du */
    static final Shape[] f1067du = new Shape[0];

    /* JADX INFO: renamed from: dy */
    private long f1071dy = 1;

    /* JADX INFO: renamed from: c5 */
    private long f1069c5 = 1000;

    /* JADX INFO: renamed from: ne */
    private C14050ca f1080ne = new C14050ca(1219033472);

    /* JADX INFO: renamed from: rv */
    private final long f1081rv = m403rv().m2353ix();

    /* JADX INFO: renamed from: up */
    private final CustomData f1083up = new CustomData(this);

    /* JADX INFO: renamed from: yj */
    private final ControlCollection f1086yj = new ControlCollection(this);

    /* JADX INFO: renamed from: ks */
    private final AnimationTimeLine f1078ks = new AnimationTimeLine(this);

    /* JADX INFO: renamed from: fa */
    private final Background f1072fa = new Background(this);

    public BaseSlide(InterfaceC14397rj interfaceC14397rj) {
        this.f1073h4 = interfaceC14397rj;
        GroupShape groupShape = new GroupShape(this);
        this.f1077kk = groupShape;
        groupShape.m2574ss();
        this.f1084x1 = new ed2(this);
        this.f1075jd = 1;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m382c5() {
        this.f1084x1.m5437k4(this);
    }

    /* JADX INFO: renamed from: ck */
    public final long m383ck() {
        long j;
        synchronized (this) {
            j = this.f1071dy;
            this.f1071dy = 1 + j;
        }
        return j;
    }

    @Override // com.aspose.slides.IThemeable
    public final IThemeEffectiveData createThemeEffective() {
        return m402m9().createThemeEffective();
    }

    /* JADX INFO: renamed from: du */
    public final C14050ca m384du() {
        return this.f1080ne;
    }

    /* JADX INFO: renamed from: dy */
    public final List<Shape> m385dy() {
        List<Shape> list = new List<>();
        m379k4(getShapes(), list);
        return list;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final boolean equals(IBaseSlide iBaseSlide) {
        BaseSlide baseSlide = (BaseSlide) C7019kk.m27452k4((Object) iBaseSlide, BaseSlide.class);
        if (baseSlide == null) {
            return false;
        }
        return C14113y2.m67363du(m378k4(false), baseSlide.m378k4(false));
    }

    /* JADX INFO: renamed from: fa */
    public final int m386fa() {
        int i;
        synchronized (this) {
            i = this.f1075jd;
            this.f1075jd = i + 1;
        }
        return i;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final IShape findShapeByAltText(String str) {
        List.Enumerator<Shape> it = m385dy().iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                String alternativeText = next.getAlternativeText();
                if (alternativeText != null && C14113y2.m67363du(alternativeText, str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final IBackground getBackground() {
        return this.f1072fa;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final IControlCollection getControls() {
        return this.f1086yj;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final ICustomData getCustomData() {
        return this.f1083up;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final IHyperlinkQueries getHyperlinkQueries() {
        if (this.f1085x6 == null) {
            this.f1085x6 = new HyperlinkQueries(this);
        }
        return this.f1085x6;
    }

    @Override // com.aspose.slides.IBaseSlide
    public String getName() {
        return this.f1070ck;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1073h4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return m401ks().getPresentation();
    }

    @Override // com.aspose.slides.IBaseSlide
    public final IShapeCollection getShapes() {
        return this.f1077kk.getShapes();
    }

    @Override // com.aspose.slides.IBaseSlide
    public abstract boolean getShowMasterShapes();

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return this;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final long getSlideId() {
        return mo400kk().m5309to();
    }

    @Override // com.aspose.slides.IBaseSlide
    public ISlideShowTransition getSlideShowTransition() {
        return this.f1076k4;
    }

    @Override // com.aspose.slides.IBaseSlide
    public final IAnimationTimeLine getTimeline() {
        return this.f1078ks;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m387h4() {
        return this.f1081rv;
    }

    /* JADX INFO: renamed from: jd */
    public final long m388jd() {
        return this.f1071dy;
    }

    @Override // com.aspose.slides.IBaseSlide
    public void joinPortionsWithSameFormatting() {
        joinPortionsWithSameFormatting(getShapes());
    }

    /* JADX INFO: renamed from: k4 */
    public final long m389k4() {
        return this.f1074ix;
    }

    /* JADX INFO: renamed from: kk */
    public abstract AbstractC0919dx mo400kk();

    /* JADX INFO: renamed from: ks */
    public final IPresentationComponent m401ks() {
        IPresentationComponent iPresentationComponent = this.f1079m9;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f1073h4, iPresentationComponentArr);
            this.f1079m9 = iPresentationComponentArr[0];
        }
        return this.f1079m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final IThemeManager m402m9() {
        return Theme.m2995k4(this);
    }

    /* JADX INFO: renamed from: rv */
    public final Presentation m403rv() {
        return (Presentation) m401ks().getPresentation();
    }

    @Override // com.aspose.slides.IBaseSlide
    public void setName(String str) {
        this.f1070ck = str;
    }

    @Override // com.aspose.slides.IBaseSlide
    public abstract void setShowMasterShapes(boolean z);

    /* JADX INFO: renamed from: to */
    public abstract AbstractC1165gx mo404to();

    /* JADX INFO: renamed from: up */
    public final ShapeFrame m405up() {
        return new ShapeFrame(0.0f, 0.0f, ((SlideSize) getPresentation().getSlideSize()).m2755k4().m56699x1(), ((SlideSize) getPresentation().getSlideSize()).m2755k4().m56697kk(), (byte) 0, (byte) 0, 0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final Shape m406x1(long j) {
        List.Enumerator<Shape> it = m385dy().iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                if (next.getPlaceholder() != null && next.getPlaceholder().getIndex() == j) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: yj */
    public final MasterSlide m409yj() {
        Object masterSlide;
        Slide slide = (Slide) C7019kk.m27452k4((Object) this, Slide.class);
        if (slide != null) {
            masterSlide = slide.m2713v4();
        } else {
            LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) this, LayoutSlide.class);
            masterSlide = layoutSlide != null ? layoutSlide.getMasterSlide() : C7019kk.m27452k4((Object) this, MasterSlide.class);
        }
        return (MasterSlide) masterSlide;
    }

    /* JADX WARN: Finally extract failed */
    public void joinPortionsWithSameFormatting(IShapeCollection iShapeCollection) {
        IGenericEnumerator<ISmartArtNode> it;
        IGenericEnumerator<IShape> it2 = iShapeCollection.iterator();
        while (it2.hasNext()) {
            try {
                IShape next = it2.next();
                ISmartArt iSmartArt = (ISmartArt) C7019kk.m27452k4((Object) next, ISmartArt.class);
                if (iSmartArt != null) {
                    it = iSmartArt.getAllNodes().iterator();
                    while (it.hasNext()) {
                        try {
                            SmartArtNode smartArtNode = (SmartArtNode) it.next();
                            if (smartArtNode.getTextFrame() != null) {
                                smartArtNode.getTextFrame().joinPortionsWithSameFormatting();
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
                IAutoShape iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) next, IAutoShape.class);
                if (iAutoShape != null && iAutoShape.getTextFrame() != null) {
                    iAutoShape.getTextFrame().joinPortionsWithSameFormatting();
                }
                ITable iTable = (ITable) C7019kk.m27452k4((Object) next, ITable.class);
                if (iTable != null) {
                    for (int i = 0; i < iTable.getRows().size(); i++) {
                        for (int i2 = 0; i2 < iTable.getColumns().size(); i2++) {
                            iTable.get_Item(i2, i).getTextFrame().joinPortionsWithSameFormatting();
                        }
                    }
                }
                IChart iChart = (IChart) C7019kk.m27452k4((Object) next, IChart.class);
                if (iChart != null) {
                    if (iChart.getChartTitle().getTextFrameForOverriding() != null) {
                        iChart.getChartTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                    }
                    if (iChart.getAxes().getHorizontalAxis() != null && iChart.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding() != null) {
                        iChart.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                    }
                    if (iChart.getAxes().getSecondaryHorizontalAxis() != null && iChart.getAxes().getSecondaryHorizontalAxis().getTitle().getTextFrameForOverriding() != null) {
                        iChart.getAxes().getSecondaryHorizontalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                    }
                    if (iChart.getAxes().getSecondaryVerticalAxis() != null && iChart.getAxes().getSecondaryVerticalAxis().getTitle().getTextFrameForOverriding() != null) {
                        iChart.getAxes().getSecondaryVerticalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                    }
                    if (iChart.getAxes().getSeriesAxis() != null && iChart.getAxes().getSeriesAxis().getTitle().getTextFrameForOverriding() != null) {
                        iChart.getAxes().getSeriesAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                    }
                    if (iChart.getAxes().getVerticalAxis() != null && iChart.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding() != null) {
                        iChart.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                    }
                    IGenericEnumerator<IChartSeries> it3 = iChart.getChartData().getSeries().iterator();
                    while (it3.hasNext()) {
                        try {
                            IChartSeries next2 = it3.next();
                            if (next2.getTrendLines() != null) {
                                it = next2.getTrendLines().iterator();
                                while (it.hasNext()) {
                                    try {
                                        ITrendline next3 = it.next();
                                        if (next3.getTextFrameForOverriding() != null) {
                                            next3.getTextFrameForOverriding().joinPortionsWithSameFormatting();
                                        }
                                    } finally {
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                            IGenericEnumerator<IChartDataPoint> it4 = next2.getDataPoints().iterator();
                            while (it4.hasNext()) {
                                try {
                                    IChartDataPoint next4 = it4.next();
                                    if (next4.getLabel() != null && next4.getLabel().getTextFrameForOverriding() != null) {
                                        next4.getLabel().getTextFrameForOverriding().joinPortionsWithSameFormatting();
                                    }
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                        it4.dispose();
                                    }
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                it4.dispose();
                            }
                            IGenericEnumerator<IDataLabel> it5 = next2.getLabels().iterator();
                            while (it5.hasNext()) {
                                try {
                                    IDataLabel next5 = it5.next();
                                    if (next5.getTextFrameForOverriding() != null) {
                                        next5.getTextFrameForOverriding().joinPortionsWithSameFormatting();
                                    }
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                                        it5.dispose();
                                    }
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                                it5.dispose();
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
                IGroupShape iGroupShape = (IGroupShape) C7019kk.m27452k4((Object) next, IGroupShape.class);
                if (iGroupShape != null) {
                    joinPortionsWithSameFormatting(iGroupShape.getShapes());
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final ColorFormat m390k4(int i) {
        return ((fuq) createThemeEffective()).m6314x1().m74211x1(((BaseThemeManager) m402m9()).mo348kk().m63289k4(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final C14168n5 m407x1() {
        return this.f1082u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Shape m391k4(byte b) {
        List.Enumerator<Shape> it = m385dy().iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                if (next.getPlaceholder() != null && next.getPlaceholder().getType() == b) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo408x1(float f, float f2) {
        IGenericEnumerator<IShape> it = getShapes().iterator();
        while (it.hasNext()) {
            try {
                ((Shape) it.next()).mo1646k4(f, f2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m377k4(String str, boolean z) {
        String strM57973k4 = C12380dy.m57973k4(C12380dy.m57973k4(str, "(\\r\\n)|(\\n\\r)|(\\n)|(\\r)", "", 74), ">\\s+<", "><", 74);
        if (!z) {
            return strM57973k4;
        }
        String strM57973k42 = C12380dy.m57973k4(C12380dy.m57973k4(C12380dy.m57973k4(C12380dy.m57973k4(C12380dy.m57973k4(strM57973k4, " (r:)?id=\"\\{?(\\d|\\w|-)+\\}?\"", "", 74), " name=\"[^\"]*\"", "", 74), " panose=\"[^\"]*\"", "", 74), "<\\w:extLst>.*?</\\w:extLst>", "", 74), "<\\w:extLst\\s*/>", "", 74);
        Iterator<C12385to> it = C12380dy.m57980x1(strM57973k42, "<a:fld type=\"datetime[^\"]*\">.*?</a:fld>", 74).iterator();
        while (it.hasNext()) {
            try {
                C12385to next = it.next();
                strM57973k42 = C14113y2.m67401k4(strM57973k42, next.mo57995kk(), C12380dy.m57973k4(next.mo57995kk(), "\">.*?</a:fld>", "></a:fld>", 74));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return strM57973k42;
    }

    /* JADX INFO: renamed from: x1 */
    private void m381x1(C14168n5 c14168n5) {
        this.f1082u4 = c14168n5;
    }

    /* JADX INFO: renamed from: k4 */
    private String m378k4(boolean z) {
        String strM377k4 = m377k4(new fbk().m6107k4(this), !z);
        if (z) {
            strM377k4 = C14113y2.m67400k4(strM377k4, C14113y2.m67403k4("|", new String[]{C14114y9.m67459k4(getSlideId(), (InterfaceC14073kp) C11697x1.m55250kk()), getPresentation().getDocumentProperties().getTitle(), C14057f9.m66586k4(getPresentation().getDocumentProperties().getRevisionNumber(), (InterfaceC14073kp) C11697x1.m55250kk()), ((DocumentProperties) getPresentation().getDocumentProperties()).m1347x1().m67140k4("YYYYMMDDHHmmss"), ((DocumentProperties) getPresentation().getDocumentProperties()).m1342kk().m67140k4("YYYYMMDDHHmmss"), C14057f9.m66586k4(getPresentation().getSlides().size(), (InterfaceC14073kp) C11697x1.m55250kk())}));
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26643rv().mo26677to(strM377k4);
        C4772y9 c4772y9 = new C4772y9();
        try {
            return C14113y2.m67368h4(C14113y2.m67401k4(C14069jd.m66770k4(c4772y9.m19588x1(bArrMo26677to)), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, ""));
        } finally {
            c4772y9.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m392k4(float f, float f2) {
        if (m380k4(f) && m380k4(f2)) {
            mo393k4(f, f2, C14116yg.m67504x1(f, f2));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo393k4(float f, float f2, float f3) {
        if (m380k4(f) || m380k4(f2)) {
            IGenericEnumerator<IShape> it = getShapes().iterator();
            while (it.hasNext()) {
                try {
                    ((Shape) it.next()).mo282k4(f, f2, f3);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m394k4(long j) {
        this.f1074ix = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m395k4(long j, boolean z) {
        synchronized (this) {
            if (z) {
                try {
                    if ((j & 4294967295L) <= (4294967295L & this.f1071dy)) {
                        throw new Exception();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1071dy = j;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m379k4(IShapeCollection iShapeCollection, List<Shape> list) {
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                list.addItem(shape);
                GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) shape, GroupShape.class);
                if (groupShape != null) {
                    m379k4(groupShape.getShapes(), list);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m396k4(ITextStyle iTextStyle) {
        List.Enumerator<Shape> it = m385dy().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getTextFrame() != null && (!autoShape.isTextHolder() || (TextFrame.f3512du.m13012x1(Byte.valueOf(autoShape.getPlaceholder().getType())).intValue() == 0 && autoShape.m2547c6().length <= 0))) {
                    ((TextStyle) autoShape.getTextFrame().getTextFrameFormat().getTextStyle()).m2988kk((TextStyle) iTextStyle);
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
    public final void m397k4(C14168n5 c14168n5) {
        if (c14168n5 == null) {
            throw new ArgumentNullException("view");
        }
        m381x1(c14168n5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m398k4(InterfaceC14397rj interfaceC14397rj) {
        this.f1073h4 = interfaceC14397rj;
        this.f1079m9 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m380k4(float f) {
        return C14116yg.m67480k4(f - 1.0f) >= 1.0E-4f;
    }

    /* JADX INFO: renamed from: k4 */
    public Shape[] mo399k4(IPlaceholder iPlaceholder) {
        return f1067du;
    }
}
