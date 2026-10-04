package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11691kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class PresentationHeaderFooterManager extends BaseHeaderFooterManager implements IPresentationHeaderFooterManager {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f3142du = new C7017h4("datetime1", "datetime2", "datetime3", "datetime4", "datetime5", "datetime6", "datetime7", "datetime8", "datetime9", "datetime10", "datetime11", "datetime12", "datetime13");

    /* JADX INFO: renamed from: k4 */
    private final Presentation f3143k4;

    /* JADX INFO: renamed from: kk */
    private boolean f3144kk;

    /* JADX INFO: renamed from: to */
    private boolean f3145to;

    /* JADX INFO: renamed from: x1 */
    private boolean f3146x1;

    public PresentationHeaderFooterManager(Presentation presentation) {
        super(presentation);
        this.f3143k4 = presentation;
    }

    /* JADX INFO: renamed from: du */
    private void m2414du() {
        IGenericEnumerator<ILayoutSlide> it = this.f3143k4.getMasters().iterator();
        while (it.hasNext()) {
            try {
                m2421k4(((MasterSlide) it.next()).m1944x6().m72984dy());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f3143k4.getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ((LayoutSlide) it.next()).m1849x6().m71155ck().m70458h4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2415k4(String str, String str2) {
        C11697x1 c11697x1M55244k4;
        boolean z;
        int iM67434x1;
        if (str2 == null) {
            c11697x1M55244k4 = C11697x1.m55244k4("en-us");
        } else {
            try {
                c11697x1M55244k4 = C11697x1.m55244k4(str2);
            } catch (ArgumentException unused) {
                c11697x1M55244k4 = C11697x1.m55244k4("en-us");
            }
        }
        C11691kk c11691kkM55261du = c11697x1M55244k4.m55261du();
        String strM55193ne = c11691kkM55261du.m55193ne();
        switch (f3142du.m27428k4(str)) {
            case 0:
                if ("ja-jp".equals(C14113y2.m67368h4(c11697x1M55244k4.toString()))) {
                    strM55193ne = "yyyy/M/d";
                }
                break;
            case 1:
                strM55193ne = c11691kkM55261du.m55212x6();
                break;
            case 2:
                strM55193ne = "dd MMMM yyyy";
                break;
            case 3:
                boolean z2 = true;
                if (c11691kkM55261du.m55212x6().charAt(0) != '\'' || (iM67434x1 = C14113y2.m67434x1(c11691kkM55261du.m55212x6(), '\'', 1)) <= 0) {
                    z = false;
                } else {
                    strM55193ne = C14113y2.m67422kk(c11691kkM55261du.m55212x6(), iM67434x1 + 1);
                    z = true;
                }
                if (z) {
                    z2 = z;
                    if (!z2) {
                    }
                } else {
                    for (int i = 0; i < c11691kkM55261du.m55212x6().length(); i++) {
                        if (c11691kkM55261du.m55212x6().charAt(i) == ' ') {
                            strM55193ne = c11691kkM55261du.m55212x6();
                            if (!z2) {
                                strM55193ne = "MMMM dd, yyyy";
                            }
                        }
                        break;
                    }
                    z2 = z;
                    if (!z2) {
                    }
                }
                break;
            case 4:
                strM55193ne = "dd'-'MMM'-'yy";
                break;
            case 5:
                strM55193ne = "MMMM yy";
                break;
            case 6:
                strM55193ne = "MMM'-'yy";
                break;
            case 7:
                strM55193ne = (c11697x1M55244k4.m55262dy() != 2052 && c11697x1M55244k4.m55262dy() != 4100) ? C14113y2.m67402k4("{0} {1}", c11691kkM55261du.m55193ne(), c11691kkM55261du.m55173ix()) : C14113y2.m67402k4("{0}{1}", c11691kkM55261du.m55212x6(), "h时m分");
                break;
            case 8:
                strM55193ne = (c11697x1M55244k4.m55262dy() != 2052 && c11697x1M55244k4.m55262dy() != 4100) ? C14113y2.m67402k4("{0} {1}", c11691kkM55261du.m55193ne(), c11691kkM55261du.m55200u4()) : C14113y2.m67402k4("{0}{1}{2}", c11691kkM55261du.m55212x6(), "dddd", "h时m分s秒");
                break;
            case 9:
                strM55193ne = "HH:mm";
                break;
            case 10:
                strM55193ne = "HH:mm:ss";
                break;
            case 11:
                strM55193ne = (c11697x1M55244k4.m55262dy() != 2052 && c11697x1M55244k4.m55262dy() != 4100) ? "h:mm tt" : C14113y2.m67402k4("{0}{1}", "tt", "h时m分");
                break;
            case 12:
                strM55193ne = (c11697x1M55244k4.m55262dy() != 2052 && c11697x1M55244k4.m55262dy() != 4100) ? "h:mm:ss tt" : C14113y2.m67402k4("{0}{1}", "tt", "h时m分s秒");
                break;
        }
        return C14084qq.m67081jd().mo66517k4(strM55193ne, c11697x1M55244k4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m2429kk() {
        Presentation presentation = this.f3143k4;
        if (presentation == null) {
            return;
        }
        ISlideCollection slides = presentation.getSlides();
        for (int i = 0; i < slides.size(); i++) {
            m2418k4(slides.get_Item(i));
        }
        for (int i2 = 0; i2 < this.f3143k4.getSlides().size(); i2++) {
            try {
                BaseSlide baseSlide = (BaseSlide) this.f3143k4.getSlides().get_Item(i2).getNotesSlideManager().getNotesSlide();
                if (baseSlide != null) {
                    m2418k4((IBaseSlide) baseSlide);
                }
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                return;
            }
        }
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllDateTimesText(String str) {
        m2422kk((byte) 4, str, true);
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllDateTimesVisibility(boolean z) {
        m2417k4((byte) 4, z);
        this.f3145to = z;
        m2414du();
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllFootersText(String str) {
        m2422kk((byte) 6, str, false);
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllFootersVisibility(boolean z) {
        m2417k4((byte) 6, z);
        this.f3146x1 = z;
        m2414du();
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllHeadersText(String str) {
        m2422kk((byte) 7, str, false);
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllHeadersVisibility(boolean z) {
        m2417k4((byte) 7, z);
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setAllSlideNumbersVisibility(boolean z) {
        m2417k4((byte) 5, z);
        this.f3144kk = z;
        m2414du();
    }

    @Override // com.aspose.slides.IPresentationHeaderFooterManager
    public final void setVisibilityOnAllTitleSlides(boolean z) {
        IGenericEnumerator<IMasterSlide> it = this.f3143k4.getMasters().iterator();
        while (it.hasNext()) {
            try {
                IMasterSlide next = it.next();
                if (next.getLayoutSlides().size() > 0) {
                    ILayoutSlide iLayoutSlide = next.getLayoutSlides().get_Item(0);
                    if (z && iLayoutSlide.getMasterSlide() != null) {
                        next.getHeaderFooterManager().setFooterVisibility(true);
                        next.getHeaderFooterManager().setDateTimeVisibility(true);
                        next.getHeaderFooterManager().setSlideNumberVisibility(true);
                    }
                    iLayoutSlide.getHeaderFooterManager().setFooterAndChildFootersVisibility(z);
                    iLayoutSlide.getHeaderFooterManager().setDateTimeAndChildDateTimesVisibility(z);
                    iLayoutSlide.getHeaderFooterManager().setSlideNumberAndChildSlideNumbersVisibility(z);
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

    /* JADX INFO: renamed from: to */
    public final long m2430to() {
        Presentation presentation = this.f3143k4;
        if (presentation == null || presentation.getLayoutSlides().size() <= 0) {
            return 0L;
        }
        return ((LayoutSlide) this.f3143k4.getLayoutSlides().get_Item(0)).m1849x6().m5309to();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2431x1() {
        m2426k4(0);
    }

    /* JADX INFO: renamed from: kk */
    private void m2422kk(byte b, String str, boolean z) {
        if (b != 7) {
            IGenericEnumerator<IMasterSlide> it = this.f3143k4.getMasters().iterator();
            while (it.hasNext()) {
                try {
                    ((MasterSlideHeaderFooterManager) it.next().getHeaderFooterManager()).m1954x1(b, str, z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        IMasterNotesSlide masterNotesSlide = this.f3143k4.getMasterNotesSlideManager().getMasterNotesSlide();
        if (masterNotesSlide != null) {
            ((MasterNotesSlideHeaderFooterManager) masterNotesSlide.getHeaderFooterManager()).m1935x1(b, str, z);
        }
        IMasterHandoutSlide masterHandoutSlide = this.f3143k4.getMasterHandoutSlideManager().getMasterHandoutSlide();
        if (masterHandoutSlide != null) {
            ((MasterHandoutSlideHeaderFooterManager) masterHandoutSlide.getHeaderFooterManager()).m413k4(b, str, z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2423k4() {
        C14437s8 c14437s8M72984dy;
        IMasterSlideCollection masters = this.f3143k4.getMasters();
        if (masters == null || masters.size() <= 0 || (c14437s8M72984dy = ((MasterSlide) masters.get_Item(0)).m1944x6().m72984dy()) == null) {
            return;
        }
        this.f3146x1 = c14437s8M72984dy.m70467x1();
        this.f3145to = c14437s8M72984dy.m70461k4();
        this.f3144kk = c14437s8M72984dy.m70465to();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2432x1(byte b, String str, boolean z) {
        m2416k4(b, str, (BaseSlide) this.f3143k4.getMasterNotesSlideManager().getMasterNotesSlide(), z);
        IGenericEnumerator<ISlide> it = this.f3143k4.getSlides().iterator();
        while (it.hasNext()) {
            try {
                ISlide next = it.next();
                if (next.getNotesSlideManager().getNotesSlide() != null) {
                    m2416k4(b, str, (BaseSlide) next.getNotesSlideManager().getNotesSlide(), z);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2416k4(byte b, String str, BaseSlide baseSlide, boolean z) {
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) baseSlide.m391k4(b), AutoShape.class);
        if (autoShape != null) {
            if (b != 6 || autoShape.getTextFrame() == null || autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().getCount() <= 0 || autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getField() == null || !FieldType.op_Inequality((FieldType) autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getField().getType(), FieldType.getFooter())) {
                if (autoShape.getTextFrame() == null) {
                    autoShape.addTextFrame("");
                }
                IGenericEnumerator<IParagraph> it = autoShape.getTextFrame().getParagraphs().iterator();
                Portion portion = null;
                FieldType fieldType = null;
                do {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                        while (true) {
                            try {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                IPortion next = it2.next();
                                if (next.getField() != null) {
                                    Portion portion2 = (Portion) next;
                                    fieldType = (FieldType) portion2.getField().getType();
                                    portion = portion2;
                                    break;
                                }
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
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } while (portion == null);
                if (portion == null) {
                    return;
                }
                if (z) {
                    portion.removeField();
                }
                if (!C14113y2.m67411k4(str)) {
                    portion.setText(C3085sv.m13107x1(str));
                } else if (z && FieldType.op_Equality(fieldType, FieldType.getFooter()) && portion.m2282fa() != null) {
                    portion.m2282fa().getPortions().remove(portion);
                } else {
                    portion.setText(C14113y2.f47374k4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2424k4(byte b, String str, boolean z) {
        IGenericEnumerator<ISlide> it = this.f3143k4.getMasters().iterator();
        while (it.hasNext()) {
            try {
                m2416k4(b, str, (BaseSlide) ((IMasterSlide) it.next()), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ILayoutSlide> it2 = this.f3143k4.getLayoutSlides().iterator();
        while (it2.hasNext()) {
            try {
                m2416k4(b, str, (BaseSlide) ((ILayoutSlide) it2.next()), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = this.f3143k4.getSlides().iterator();
        while (it.hasNext()) {
            try {
                m2416k4(b, str, (BaseSlide) ((ISlide) it.next()), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m2417k4(byte b, boolean z) {
        if (b != 7) {
            IGenericEnumerator<IMasterSlide> it = this.f3143k4.getMasters().iterator();
            while (it.hasNext()) {
                try {
                    ((MasterSlideHeaderFooterManager) it.next().getHeaderFooterManager()).m1955x1(b, z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        IMasterNotesSlide masterNotesSlide = this.f3143k4.getMasterNotesSlideManager().getMasterNotesSlide();
        if (masterNotesSlide != null) {
            ((MasterNotesSlideHeaderFooterManager) masterNotesSlide.getHeaderFooterManager()).m1936x1(b, z);
        }
        IMasterHandoutSlide masterHandoutSlide = this.f3143k4.getMasterHandoutSlideManager().getMasterHandoutSlide();
        if (masterHandoutSlide != null) {
            ((MasterHandoutSlideHeaderFooterManager) masterHandoutSlide.getHeaderFooterManager()).m414k4(b, z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2425k4(byte b, boolean z, boolean z2) {
        for (int i = 0; i < this.f3143k4.getSlides().size(); i++) {
            Slide slide = (Slide) this.f3143k4.getSlides().get_Item(i);
            BaseSlide baseSlide = slide;
            if (!z) {
                m2427k4(baseSlide, b, z2);
            } else if (slide.getNotesSlideManager().getNotesSlide() != null) {
                baseSlide = (BaseSlide) slide.getNotesSlideManager().getNotesSlide();
                m2427k4(baseSlide, b, z2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2426k4(int i) {
        Presentation presentation = this.f3143k4;
        if (presentation == null) {
            return;
        }
        int firstSlideNumber = presentation.getFirstSlideNumber();
        ISlideCollection slides = this.f3143k4.getSlides();
        if (i >= slides.size()) {
            return;
        }
        for (int i2 = i; i2 < slides.size(); i2++) {
            m2419k4(slides.get_Item(i2), i2 + firstSlideNumber);
        }
        while (i < slides.size()) {
            try {
                BaseSlide baseSlide = (BaseSlide) slides.get_Item(i).getNotesSlideManager().getNotesSlide();
                if (baseSlide != null) {
                    m2419k4(baseSlide, i + firstSlideNumber);
                }
                i++;
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2427k4(BaseSlide baseSlide, byte b, boolean z) {
        IGenericEnumerator<IShape> it;
        if (C7019kk.m27469x1(baseSlide, Slide.class)) {
            it = ((Slide) baseSlide).m2687bv().getShapes().iterator();
            while (it.hasNext()) {
                try {
                    Shape shape = (Shape) it.next();
                    if (shape.getPlaceholder() != null && b == shape.getPlaceholder().getType()) {
                        if (z) {
                            BaseHeaderFooterManager.m344k4(baseSlide, ((Slide) baseSlide).m2687bv(), b);
                        } else {
                            BaseHeaderFooterManager.m343k4(baseSlide, b);
                        }
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (C7019kk.m27469x1(baseSlide, NotesSlide.class)) {
            it = ((NotesSlide) baseSlide).getPresentation().getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();
            while (it.hasNext()) {
                try {
                    Shape shape2 = (Shape) it.next();
                    if (shape2.getPlaceholder() != null && b == shape2.getPlaceholder().getType()) {
                        if (z) {
                            BaseHeaderFooterManager.m344k4(baseSlide, (BaseSlide) ((NotesSlide) baseSlide).getPresentation().getMasterNotesSlideManager().getMasterNotesSlide(), b);
                        } else {
                            BaseHeaderFooterManager.m343k4(baseSlide, b);
                        }
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m2418k4(IBaseSlide iBaseSlide) {
        IGenericEnumerator<IParagraph> it = iBaseSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4(it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getTextFrame() != null) {
                    it = autoShape.getTextFrame().getParagraphs().iterator();
                    while (it.hasNext()) {
                        try {
                            IGenericEnumerator<IPortion> it2 = ((Paragraph) it.next()).getPortions().iterator();
                            while (it2.hasNext()) {
                                try {
                                    Portion portion = (Portion) it2.next();
                                    if (portion.m2291kk() && C14113y2.m67448x1(portion.getField().getType().getInternalString(), "datetime")) {
                                        m2420k4(portion);
                                    }
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
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m2419k4(IBaseSlide iBaseSlide, int i) {
        IGenericEnumerator<IShape> it = iBaseSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4(it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getPlaceholder() != null && autoShape.getPlaceholder().getType() == 5) {
                    IGenericEnumerator<IPortion> it2 = autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().iterator();
                    while (it2.hasNext()) {
                        try {
                            Portion portion = (Portion) it2.next();
                            if (portion.m2291kk() && FieldType.op_Equality((FieldType) portion.getField().getType(), FieldType.getSlideNumber())) {
                                portion.setText(C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()));
                            }
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

    /* JADX INFO: renamed from: k4 */
    private static void m2420k4(Portion portion) {
        if (portion == null || portion.getField() == null || !FieldType.m1448k4().containsItem((FieldType) portion.getField().getType())) {
            return;
        }
        portion.setText(m2415k4(portion.getField().getType().getInternalString(), (String) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:39:0x0085, B:41:0x008b, B:43:0x0097, B:45:0x00a1, B:50:0x00b9, B:52:0x00c3, B:54:0x00cf), top: B:111:0x0085, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:14:0x0042, B:16:0x0048, B:18:0x0054, B:20:0x005f, B:38:0x007d, B:57:0x00dd, B:59:0x00e3, B:61:0x00e8, B:62:0x00ed, B:64:0x00f3, B:65:0x00f6, B:28:0x006c, B:34:0x0076, B:39:0x0085, B:41:0x008b, B:43:0x0097, B:45:0x00a1, B:50:0x00b9, B:52:0x00c3, B:54:0x00cf), top: B:109:0x0042, inners: #2 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2428k4(Slide slide, BaseSlide baseSlide) {
        IGenericEnumerator<IShape> it;
        boolean z;
        if (slide == null || baseSlide == null) {
            return;
        }
        boolean z2 = (slide.getLayoutSlide().getSlideId() & 4294967295L) != (m2430to() & 4294967295L) || this.f3143k4.m2351fa().m68358dy();
        List list = new List();
        IGenericEnumerator<IShape> it2 = baseSlide.getShapes().iterator();
        while (it2.hasNext()) {
            try {
                Shape shape = (Shape) it2.next();
                if (shape.getPlaceholder() != null) {
                    byte type = shape.getPlaceholder().getType();
                    if (type == 6) {
                        if (this.f3146x1 && z2) {
                            it = slide.getShapes().iterator();
                            while (it.hasNext()) {
                                try {
                                    Shape shape2 = (Shape) it.next();
                                    if (shape2.getPlaceholder() != null) {
                                        if (shape2.getPlaceholder().getType() != type || shape2.getPlaceholder().getIndex() != shape.getPlaceholder().getIndex()) {
                                            if (shape2.getPlaceholder().getType() == type && shape2.getPlaceholder().getIndex() == 4294967295L) {
                                                slide.f1084x1.m5438k4(shape2);
                                                shape2.addPlaceholder(shape.getPlaceholder());
                                            }
                                        }
                                        z = true;
                                        break;
                                    }
                                } catch (Throwable th) {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                    throw th;
                                }
                            }
                            z = false;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            if (!z) {
                                list.addItem(shape);
                            }
                        }
                    } else if (type == 5) {
                        if (this.f3144kk && z2) {
                            it = slide.getShapes().iterator();
                            while (it.hasNext()) {
                            }
                            z = false;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            }
                            if (!z) {
                            }
                        }
                    } else if (type != 4 || (this.f3145to && z2)) {
                        it = slide.getShapes().iterator();
                        while (it.hasNext()) {
                        }
                        z = false;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        }
                        if (!z) {
                        }
                    }
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
        List.Enumerator it3 = list.iterator();
        while (it3.hasNext()) {
            try {
                Shape shape3 = (Shape) it3.next();
                IGenericEnumerator<IShape> it4 = slide.getShapes().iterator();
                while (true) {
                    try {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Shape shape4 = (Shape) it4.next();
                        if (shape4.getPlaceholder() != null && shape4.getPlaceholder().getIndex() == 4294967295L) {
                            slide.f1084x1.m5438k4(shape4);
                            shape4.addPlaceholder(shape3.getPlaceholder());
                            break;
                        }
                    } catch (Throwable th3) {
                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                            it4.dispose();
                        }
                        throw th3;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
                BaseHeaderFooterManager.m345k4(slide, shape3);
            } catch (Throwable th4) {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                throw th4;
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        BaseHeaderFooterManager.m342k4(slide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2421k4(C14437s8 c14437s8) {
        if (c14437s8 == null) {
            return;
        }
        c14437s8.m70466x1(this.f3146x1);
        c14437s8.m70460k4(this.f3145to);
        c14437s8.m70464to(this.f3144kk);
    }
}
