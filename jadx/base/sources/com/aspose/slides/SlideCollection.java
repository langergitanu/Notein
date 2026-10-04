package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p333p8.C9433x1;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class SlideCollection extends DomObject<Presentation> implements ISlideCollection {

    /* JADX INFO: renamed from: x1 */
    static final Slide[] f3396x1 = new Slide[0];

    /* JADX INFO: renamed from: k4 */
    final List<ISlide> f3397k4;

    public SlideCollection(Presentation presentation) {
        super(presentation);
        this.f3397k4 = new List<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISlideCollection
    public final ISlide addClone(ISlide iSlide) {
        ISlide iSlideAddClone;
        Slide slide = (Slide) iSlide;
        synchronized (((Presentation) this.f2127h4)) {
            try {
                IPresentation presentation = slide.getPresentation();
                TParent tparent = this.f2127h4;
                if (presentation == tparent) {
                    iSlideAddClone = (Slide) sfn.m70607k4((IPresentation) tparent, slide.getLayoutSlide(), slide);
                } else {
                    C12015qq c12015qqClone = ((SlideSize) ((Presentation) tparent).getSlideSize()).m2755k4().Clone();
                    C12015qq c12015qqClone2 = ((SlideSize) slide.getPresentation().getSlideSize()).m2755k4().Clone();
                    if (c12015qqClone.m56699x1() != c12015qqClone2.m56699x1() || c12015qqClone.m56697kk() != c12015qqClone2.m56697kk()) {
                        ((Presentation) this.f2127h4).m2349du().m1921k4("The slide-size of source and of target presentation is different!", 99);
                    }
                    iSlideAddClone = addClone(slide, ((MasterSlideCollection) ((Presentation) this.f2127h4).getMasters()).m1947k4(slide.m2687bv().getMasterSlide(), true), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iSlideAddClone;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide addEmptySlide(ILayoutSlide iLayoutSlide) {
        Slide slideM2724k4 = m2724k4(iLayoutSlide);
        m2733k4(slideM2724k4);
        return slideM2724k4;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromHtml(InputStream inputStream) {
        return m2741x1(AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromPdf(InputStream inputStream) {
        return m2736k4(AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3397k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide get_Item(int i) {
        return this.f3397k4.get_Item(i);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final int indexOf(ISlide iSlide) {
        return this.f3397k4.indexOf(iSlide);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide insertClone(int i, ISlide iSlide) {
        ISlide iSlideAddClone = addClone(iSlide);
        reorder(i, iSlideAddClone);
        return iSlideAddClone;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide insertEmptySlide(int i, ILayoutSlide iLayoutSlide) {
        Slide slideM2724k4 = m2724k4(iLayoutSlide);
        m2731k4(i, slideM2724k4);
        return slideM2724k4;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] insertFromHtml(int i, InputStream inputStream) {
        return m2734k4(i, AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISlide> iterator() {
        return this.f3397k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ISlide> iteratorJava() {
        return this.f3397k4.iteratorJava();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Slide m2729k4() {
        return ((Presentation) this.f2127h4).m2391u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISlideCollection
    public final void remove(ISlide iSlide) {
        if (this.f3397k4.containsItem(iSlide)) {
            List.Enumerator<ISlide> it = this.f3397k4.iterator();
            while (it.hasNext()) {
                try {
                    ISlide next = it.next();
                    int i = 0;
                    while (i < next.getShapes().size()) {
                        if (C7019kk.m27469x1(next.getShapes().get_Item(i), GroupShape.class)) {
                            m2725k4((GroupShape) next.getShapes().get_Item(i), next, iSlide);
                        }
                        if (m2727k4(next.getShapes().get_Item(i), next, iSlide)) {
                            i--;
                        }
                        i++;
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
            ((SectionCollection) ((Presentation) this.f2127h4).getSections()).m2522x1(iSlide);
            int iIndexOf = this.f3397k4.indexOf(iSlide);
            synchronized (this.f3397k4.getSyncRoot()) {
                this.f3397k4.removeItem(iSlide);
                m2730k4(iIndexOf);
                ((Slide) iSlide).m398k4((InterfaceC14397rj) null);
            }
            m2726k4(iSlide, iIndexOf);
        }
    }

    @Override // com.aspose.slides.ISlideCollection
    public final void removeAt(int i) {
        if (i < 0 || i > this.f3397k4.size() - 1) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        remove(this.f3397k4.get_Item(i));
    }

    @Override // com.aspose.slides.ISlideCollection
    public final void reorder(int i, ISlide iSlide) {
        if (i < 0 || i >= size()) {
            throw new PptxEditException("Index must lay within [0..Count-1] range.");
        }
        if (iSlide.getPresentation() != this.f2127h4) {
            throw new PptxEditException("Trying to move slide from other presentation.");
        }
        int iIndexOf = this.f3397k4.indexOf(iSlide);
        if (iIndexOf < 0) {
            throw new PptxEditException("Trying to move removed slide.");
        }
        if (i == iIndexOf) {
            return;
        }
        ((SectionCollection) iSlide.getPresentation().getSections()).m2522x1(iSlide);
        if (i == 0 && iSlide.getPresentation().getSections().size() > 0) {
            ((Section) iSlide.getPresentation().getSections().get_Item(0)).m2518k4(iSlide);
        }
        m2740x1(i, iSlide);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3397k4.size();
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] toArray() {
        return this.f3397k4.toArray(new ISlide[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2739x1() {
        this.f3397k4.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private Slide m2724k4(ILayoutSlide iLayoutSlide) {
        if (iLayoutSlide == null) {
            throw new ArgumentNullException("layout");
        }
        IPresentation presentation = iLayoutSlide.getPresentation();
        TParent tparent = this.f2127h4;
        if (presentation != tparent) {
            throw new PptxEditException("Layout from other presentation specified.");
        }
        Slide slideM2391u4 = ((Presentation) tparent).m2391u4();
        slideM2391u4.setLayoutSlide(iLayoutSlide);
        return slideM2391u4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISlideCollection
    public final ISlide addClone(ISlide iSlide, ILayoutSlide iLayoutSlide) {
        if (iLayoutSlide.getPresentation() != this.f2127h4) {
            throw new PptxEditException("Layout must belong to the target presentation.");
        }
        IPresentation presentation = iSlide.getPresentation();
        TParent tparent = this.f2127h4;
        if (presentation == tparent) {
            return (Slide) sfn.m70607k4((IPresentation) tparent, iLayoutSlide, iSlide);
        }
        Slide slide = (Slide) sfn.m70607k4((IPresentation) tparent, iLayoutSlide, iSlide);
        slide.m396k4(iSlide.getPresentation().getDefaultTextStyle());
        m2732k4(slide.getShapes());
        slide.m392k4(((SlideSize) ((Presentation) this.f2127h4).getSlideSize()).m2755k4().m56699x1() / ((SlideSize) iSlide.getPresentation().getSlideSize()).m2755k4().m56699x1(), ((SlideSize) ((Presentation) this.f2127h4).getSlideSize()).m2755k4().m56697kk() / ((SlideSize) iSlide.getPresentation().getSlideSize()).m2755k4().m56697kk());
        return slide;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromHtml(InputStream inputStream, IExternalResourceResolver iExternalResourceResolver, String str) {
        return m2737k4(AbstractC3150x6.fromJava(inputStream), iExternalResourceResolver, str);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromPdf(InputStream inputStream, PdfImportOptions pdfImportOptions) {
        return m2738k4(AbstractC3150x6.fromJava(inputStream), pdfImportOptions);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide insertClone(int i, ISlide iSlide, ILayoutSlide iLayoutSlide) {
        ISlide iSlideAddClone = addClone(iSlide, iLayoutSlide);
        reorder(i, iSlideAddClone);
        return iSlideAddClone;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] insertFromHtml(int i, InputStream inputStream, IExternalResourceResolver iExternalResourceResolver, String str) {
        return m2735k4(i, AbstractC3150x6.fromJava(inputStream), iExternalResourceResolver, str);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final void reorder(int i, ISlide... iSlideArr) {
        int i2;
        if (i < 0 || i > size() - iSlideArr.length) {
            throw new PptxEditException("Index must lay within [0..Count - slides.Length] range.");
        }
        if (iSlideArr.length == 0) {
            return;
        }
        Dictionary dictionary = new Dictionary(iSlideArr.length);
        for (int i3 = 0; i3 < iSlideArr.length; i3++) {
            if (iSlideArr[i3].getPresentation() != this.f2127h4) {
                throw new PptxEditException("Trying to move slide from other presentation.");
            }
            if (dictionary.containsKey(iSlideArr[i3])) {
                throw new PptxEditException(C14113y2.m67408k4("Trying to move the same slide twice. Slide number: ", C14057f9.m66591x1(iSlideArr[i3].getSlideNumber())));
            }
            ISlide iSlide = iSlideArr[i3];
            dictionary.set_Item(iSlide, iSlide);
        }
        int size = this.f3397k4.size();
        int length = iSlideArr.length;
        int[] iArr = new int[length];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (dictionary.containsKey(this.f3397k4.get_Item(i5))) {
                iArr[i4] = i5;
                i4++;
            }
        }
        if (i4 < iSlideArr.length) {
            throw new PptxEditException("Trying to move removed slide.");
        }
        synchronized (this.f3397k4.getSyncRoot()) {
            int i6 = 0;
            while (true) {
                i2 = length - 1;
                if (i6 >= i2) {
                    break;
                }
                try {
                    int i7 = i6 + 1;
                    int i8 = (iArr[i7] - i6) - 2;
                    if (i8 >= i) {
                        i8 = i - 1;
                    }
                    for (int i9 = iArr[i6] - i6; i9 <= i8; i9++) {
                        this.f3397k4.set_Item(i9, iSlideArr[i9 + i6 + 1]);
                    }
                    if (i8 == i - 1) {
                        break;
                    } else {
                        i6 = i7;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int length2 = iSlideArr.length + i;
            int i10 = length2 - 1;
            int i11 = 0;
            int i12 = i2;
            while (i11 < i2) {
                int i13 = iArr[i12 - 1] + i11 + 2;
                if (i13 <= i10) {
                    i13 = length2;
                }
                for (int i14 = iArr[i12] + i11; i14 >= i13; i14--) {
                    this.f3397k4.set_Item(i14, iSlideArr[(i14 - i11) - 1]);
                }
                if (i13 == length2) {
                    break;
                }
                i11++;
                i12--;
            }
            for (int i15 = 0; i15 < iSlideArr.length; i15++) {
                this.f3397k4.set_Item(i + i15, iSlideArr[i15]);
            }
        }
        m2730k4(i);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] toArray(int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > size()) {
            throw new ArgumentOutOfRangeException("startIndex", "Wrong index or slides count.");
        }
        Slide[] slideArr = new Slide[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            slideArr[i3] = (Slide) this.f3397k4.get_Item(i3 + i);
        }
        return slideArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2740x1(int i, ISlide iSlide) {
        int iIndexOf = this.f3397k4.indexOf(iSlide);
        if (i == iIndexOf) {
            return;
        }
        synchronized (this.f3397k4.getSyncRoot()) {
            try {
                if (i < iIndexOf) {
                    while (iIndexOf > i) {
                        List<ISlide> list = this.f3397k4;
                        list.set_Item(iIndexOf, list.get_Item(iIndexOf - 1));
                        iIndexOf--;
                    }
                } else {
                    while (iIndexOf < i) {
                        List<ISlide> list2 = this.f3397k4;
                        int i2 = iIndexOf + 1;
                        list2.set_Item(iIndexOf, list2.get_Item(i2));
                        iIndexOf = i2;
                    }
                }
                this.f3397k4.set_Item(i, iSlide);
            } catch (Throwable th) {
                throw th;
            }
        }
        m2730k4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // com.aspose.slides.ISlideCollection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ISlide addClone(ISlide iSlide, IMasterSlide iMasterSlide, boolean z) {
        ILayoutSlide iLayoutSlide;
        ILayoutSlide iLayoutSlide2;
        Slide slide = (Slide) iSlide;
        MasterSlide masterSlide = (MasterSlide) iMasterSlide;
        if (masterSlide.getPresentation() != this.f2127h4) {
            throw new PptxEditException("Master must belong to target presentation.");
        }
        MasterSlide masterSlide2 = (MasterSlide) slide.m2687bv().getMasterSlide();
        int i = 0;
        while (i < masterSlide2.f2695h4.size() && slide.m2687bv() != masterSlide2.f2695h4.get_Item(i)) {
            i++;
        }
        if (i >= masterSlide2.f2695h4.size() || i >= masterSlide.f2695h4.size() || masterSlide.f2695h4.get_Item(i).getLayoutType() != slide.m2687bv().getLayoutType()) {
            for (int i2 = 0; i2 < masterSlide.f2695h4.size(); i2++) {
                if (slide.m2687bv().getLayoutType() == masterSlide.f2695h4.get_Item(i2).getLayoutType() || C14113y2.m67363du(slide.m2687bv().getName(), masterSlide.f2695h4.get_Item(i2).getName())) {
                    iLayoutSlide2 = masterSlide.f2695h4.get_Item(i2);
                }
            }
            iLayoutSlide = null;
            if (iLayoutSlide == null) {
                if (!z) {
                    throw new PptxEditException(C14113y2.m67402k4("Layout slide with \"{0}\" layout type or name \"{1}\" not found for specified Master slide. ", C14042ak.m66410k4(SlideLayoutType.class, slide.m2687bv().getLayoutType()), slide.m2687bv().getName()));
                }
                iLayoutSlide = (LayoutSlide) ((Presentation) this.f2127h4).getLayoutSlides().addClone(slide.m2687bv(), masterSlide);
            }
            return addClone(slide, iLayoutSlide);
        }
        iLayoutSlide2 = masterSlide.f2695h4.get_Item(i);
        iLayoutSlide = (LayoutSlide) iLayoutSlide2;
        if (iLayoutSlide == null) {
        }
        return addClone(slide, iLayoutSlide);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromHtml(String str) {
        return m2728k4(size(), str, (IExternalResourceResolver) null, "");
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromPdf(String str) {
        C3130fa c3130fa = new C3130fa(str, 3, 1, 1);
        try {
            return m2736k4(c3130fa);
        } finally {
            c3130fa.dispose();
        }
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide insertClone(int i, ISlide iSlide, IMasterSlide iMasterSlide, boolean z) {
        ISlide iSlideAddClone = addClone(iSlide, iMasterSlide, z);
        reorder(i, iSlideAddClone);
        return iSlideAddClone;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] insertFromHtml(int i, String str) {
        return m2728k4(i, str, (IExternalResourceResolver) null, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m2730k4(int i) {
        TParent tparent = this.f2127h4;
        if (tparent == 0 || ((Presentation) tparent).m2348ck()) {
            return;
        }
        ((PresentationHeaderFooterManager) ((Presentation) this.f2127h4).getHeaderFooterManager()).m2426k4(i);
    }

    /* JADX INFO: renamed from: x1 */
    public ISlide[] m2741x1(AbstractC3150x6 abstractC3150x6) {
        return m2728k4(size(), new C3148wl(abstractC3150x6).mo13427dy(), (IExternalResourceResolver) null, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISlideCollection
    public final ISlide addClone(ISlide iSlide, ISection iSection) {
        ISection iSection2;
        ISlide iSlideInsertClone;
        if (iSlide == null) {
            throw new ArgumentNullException("sourceSlide");
        }
        if (iSection == null) {
            throw new ArgumentNullException("section");
        }
        int iIndexOf = ((Presentation) this.f2127h4).getSections().indexOf(iSection);
        if (iIndexOf == -1) {
            throw new PptxEditException("The presentation doesn't contain the specified section.");
        }
        boolean z = iSection.getStartedFromSlide() == null;
        if (iIndexOf == ((Presentation) this.f2127h4).getSections().size() - 1) {
            iSlideInsertClone = addClone(iSlide);
            if (z) {
            }
            return iSlideInsertClone;
        }
        int i = iIndexOf + 1;
        while (true) {
            if (i >= ((Presentation) this.f2127h4).getSections().size()) {
                iSection2 = null;
                break;
            }
            if (((Presentation) this.f2127h4).getSections().get_Item(i).getStartedFromSlide() != null) {
                iSection2 = ((Presentation) this.f2127h4).getSections().get_Item(i);
                break;
            }
            i++;
        }
        if (iSection2 == null) {
            iSlideInsertClone = addClone(iSlide);
            if (!z) {
                return iSlideInsertClone;
            }
        } else {
            iSlideInsertClone = insertClone(this.f3397k4.indexOf(iSection2.getStartedFromSlide()), iSlide);
            if (!z) {
                return iSlideInsertClone;
            }
        }
        ((Section) iSection).m2518k4(iSlideInsertClone);
        return iSlideInsertClone;
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromHtml(String str, IExternalResourceResolver iExternalResourceResolver, String str2) {
        return m2728k4(size(), str, iExternalResourceResolver, str2);
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] addFromPdf(String str, PdfImportOptions pdfImportOptions) {
        C3130fa c3130fa = new C3130fa(str, 3, 1, 1);
        try {
            return m2738k4(c3130fa, pdfImportOptions);
        } finally {
            c3130fa.dispose();
        }
    }

    @Override // com.aspose.slides.ISlideCollection
    public final ISlide[] insertFromHtml(int i, String str, IExternalResourceResolver iExternalResourceResolver, String str2) {
        return m2728k4(i, str, iExternalResourceResolver, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2731k4(int i, ISlide iSlide) {
        this.f3397k4.insertItem(i, iSlide);
        m2730k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2725k4(GroupShape groupShape, ISlide iSlide, ISlide iSlide2) {
        int i = 0;
        while (i < groupShape.getShapes().size()) {
            if (C7019kk.m27469x1(groupShape.getShapes().get_Item(i), GroupShape.class)) {
                m2725k4((GroupShape) groupShape.getShapes().get_Item(i), iSlide, iSlide2);
            }
            if (m2727k4(groupShape.getShapes().get_Item(i), iSlide, iSlide2)) {
                i--;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2732k4(IShapeCollection iShapeCollection) {
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (C7019kk.m27469x1(next, IAutoShape.class)) {
                    ((AutoShape) next).mo277dy();
                }
                if (C7019kk.m27469x1(next, IGroupShape.class)) {
                    m2732k4(((IGroupShape) next).getShapes());
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
    public final void m2733k4(ISlide iSlide) {
        this.f3397k4.addItem(iSlide);
        m2730k4(this.f3397k4.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m2726k4(ISlide iSlide, int i) {
        List list = (List) ((Presentation) this.f2127h4).getHyperlinkQueries().getAnyHyperlinks();
        IGenericEnumerator<IMasterSlide> it = ((Presentation) this.f2127h4).getMasters().iterator();
        while (it.hasNext()) {
            try {
                IMasterSlide next = it.next();
                list.addRange(next.getHyperlinkQueries().getAnyHyperlinks());
                IGenericEnumerator<ILayoutSlide> it2 = next.getLayoutSlides().iterator();
                while (it2.hasNext()) {
                    try {
                        list.addRange(it2.next().getHyperlinkQueries().getAnyHyperlinks());
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
        IGenericEnumerator<ISlide> it3 = ((Presentation) this.f2127h4).getSlides().iterator();
        while (it3.hasNext()) {
            try {
                ISlide next2 = it3.next();
                if (next2.getNotesSlideManager().getNotesSlide() != null) {
                    list.addRange(next2.getNotesSlideManager().getNotesSlide().getHyperlinkQueries().getAnyHyperlinks());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        List.Enumerator it4 = list.iterator();
        while (it4.hasNext()) {
            try {
                IHyperlinkContainer iHyperlinkContainer = (IHyperlinkContainer) it4.next();
                Hyperlink hyperlink = (Hyperlink) iHyperlinkContainer.getHyperlinkClick();
                if (hyperlink != null && hyperlink.getActionType() == 8 && hyperlink.getTargetSlide() == iSlide) {
                    if (i < ((Presentation) this.f2127h4).getSlides().size()) {
                        hyperlink.m1699to().m4794k4(get_Item(i));
                    } else {
                        iHyperlinkContainer.getHyperlinkManager().removeHyperlinkClick();
                    }
                }
                Hyperlink hyperlink2 = (Hyperlink) iHyperlinkContainer.getHyperlinkMouseOver();
                if (hyperlink2 != null && hyperlink2.getActionType() == 8 && hyperlink2.getTargetSlide() == iSlide) {
                    if (i < ((Presentation) this.f2127h4).getSlides().size()) {
                        hyperlink2.m1699to().m4794k4(get_Item(i));
                    } else {
                        iHyperlinkContainer.getHyperlinkManager().removeHyperlinkMouseOver();
                    }
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        if (((com.aspose.slides.ZoomFrame) r9).m3129wl() == ((com.aspose.slides.Slide) r11).getSlideId()) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m2727k4(IShape iShape, ISlide iSlide, ISlide iSlide2) {
        if (!C7019kk.m27469x1(iShape, SummaryZoomFrame.class)) {
            if (!C7019kk.m27469x1(iShape, SectionZoomFrame.class)) {
                if (C7019kk.m27469x1(iShape, ZoomFrame.class)) {
                }
                return false;
            }
            ISection iSectionM2520k4 = ((SectionCollection) ((Presentation) this.f2127h4).getSections()).m2520k4(iSlide2);
            if (iSectionM2520k4 != null) {
                SectionZoomFrame sectionZoomFrame = (SectionZoomFrame) iShape;
                Section section = (Section) iSectionM2520k4;
                if (C14047bz.m66535k4(sectionZoomFrame.m2525k4(), section.m2517k4())) {
                    ISectionSlideCollection slidesListOfSection = iSectionM2520k4.getSlidesListOfSection();
                    if (iSectionM2520k4.getStartedFromSlide() == iSlide2) {
                        if (slidesListOfSection.size() != 1) {
                            section.m2518k4(this.f3397k4.get_Item(indexOf(iSlide2) + 1));
                            sectionZoomFrame.setTargetSlide(iSectionM2520k4.getStartedFromSlide());
                        }
                        iSlide.getShapes().remove(iShape);
                        return true;
                    }
                }
            }
            return false;
        }
        ISection iSectionM2520k42 = ((SectionCollection) ((Presentation) this.f2127h4).getSections()).m2520k4(iSlide2);
        if (iSectionM2520k42 != null) {
            ISummaryZoomSectionCollection summaryZoomCollection = ((SummaryZoomFrame) iShape).getSummaryZoomCollection();
            for (int i = 0; i < summaryZoomCollection.size(); i++) {
                Section section2 = (Section) iSectionM2520k42;
                if (C14047bz.m66535k4(((Section) summaryZoomCollection.get_Item(i).getTargetSection()).m2517k4(), section2.m2517k4())) {
                    ISectionSlideCollection slidesListOfSection2 = iSectionM2520k42.getSlidesListOfSection();
                    if (iSectionM2520k42.getStartedFromSlide() != iSlide2) {
                        continue;
                    } else if (slidesListOfSection2.size() == 1) {
                        summaryZoomCollection.removeSummaryZoomSection(iSectionM2520k42);
                        if (summaryZoomCollection.size() == 0) {
                            iSlide.getShapes().remove(iShape);
                            return true;
                        }
                    } else {
                        section2.m2518k4(this.f3397k4.get_Item(indexOf(iSlide2) + 1));
                        summaryZoomCollection.get_Item(i).setTargetSection(iSectionM2520k42);
                        ((SummaryZoomSection) summaryZoomCollection.get_Item(i)).setTargetSlide(section2.getStartedFromSlide());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public ISlide[] m2734k4(int i, AbstractC3150x6 abstractC3150x6) {
        return m2728k4(i, new C3148wl(abstractC3150x6).mo13427dy(), (IExternalResourceResolver) null, "");
    }

    /* JADX INFO: renamed from: k4 */
    public ISlide[] m2735k4(int i, AbstractC3150x6 abstractC3150x6, IExternalResourceResolver iExternalResourceResolver, String str) {
        return m2728k4(i, new C3148wl(abstractC3150x6).mo13427dy(), iExternalResourceResolver, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private ISlide[] m2728k4(int i, String str, IExternalResourceResolver iExternalResourceResolver, String str2) {
        if (i < 0 || i > size()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        try {
            return C0961er.m5619k4((Presentation) this.f2127h4, i, new C13845mp(iExternalResourceResolver), str, str2);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public ISlide[] m2736k4(AbstractC3150x6 abstractC3150x6) {
        C9433x1 c9433x1M46195k4 = C9433x1.m46195k4(abstractC3150x6);
        try {
            return nri.m68180k4((IPresentation) this.f2127h4, c9433x1M46195k4);
        } finally {
            if (c9433x1M46195k4 != null) {
                c9433x1M46195k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public ISlide[] m2737k4(AbstractC3150x6 abstractC3150x6, IExternalResourceResolver iExternalResourceResolver, String str) {
        return m2728k4(size(), new C3148wl(abstractC3150x6).mo13427dy(), iExternalResourceResolver, str);
    }

    /* JADX INFO: renamed from: k4 */
    public ISlide[] m2738k4(AbstractC3150x6 abstractC3150x6, PdfImportOptions pdfImportOptions) {
        C9433x1 c9433x1M46195k4 = C9433x1.m46195k4(abstractC3150x6);
        try {
            return nri.m68181k4((IPresentation) this.f2127h4, c9433x1M46195k4, pdfImportOptions);
        } finally {
            if (c9433x1M46195k4 != null) {
                c9433x1M46195k4.dispose();
            }
        }
    }
}
