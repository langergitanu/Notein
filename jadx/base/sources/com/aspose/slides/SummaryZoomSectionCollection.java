package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryZoomSectionCollection extends DomObject<SummaryZoomFrame> implements ISummaryZoomSectionCollection {

    /* JADX INFO: renamed from: k4 */
    final List<ISummaryZoomSection> f3475k4;

    public SummaryZoomSectionCollection(SummaryZoomFrame summaryZoomFrame) {
        super(summaryZoomFrame);
        this.f3475k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    private void m2851x1(ISummaryZoomSection iSummaryZoomSection) {
        this.f3475k4.removeItem(iSummaryZoomSection);
        m2850k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISummaryZoomSectionCollection
    public final ISummaryZoomSection addSummaryZoomSection(ISection iSection) {
        if (iSection == null || iSection.getStartedFromSlide() == null || iSection.getStartedFromSlide().getPresentation() != ((SummaryZoomFrame) this.f2127h4).getPresentation()) {
            throw new ArgumentException("Referenced slide of section does not belong to the current presentation.");
        }
        ISummaryZoomSection summarySection = getSummarySection(iSection);
        if (summarySection != null) {
            return summarySection;
        }
        SummaryZoomSection summaryZoomSection = new SummaryZoomSection((InterfaceC14397rj) this.f2127h4);
        summaryZoomSection.setTargetSection(iSection);
        int iIndexOf = ((SummaryZoomFrame) this.f2127h4).getPresentation().getSections().indexOf(iSection);
        int i = 0;
        while (true) {
            if (i >= size()) {
                break;
            }
            if (((SummaryZoomFrame) this.f2127h4).getPresentation().getSections().indexOf(get_Item(i).getTargetSection()) > iIndexOf) {
                iIndexOf = i + 1;
                break;
            }
            i++;
        }
        this.f3475k4.insertItem(iIndexOf - 1, summaryZoomSection);
        m2850k4();
        return summaryZoomSection;
    }

    @Override // com.aspose.slides.ISummaryZoomSectionCollection
    public final void clear() {
        this.f3475k4.clear();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3475k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.ISummaryZoomSectionCollection
    public final ISummaryZoomSection getSummarySection(ISection iSection) {
        List.Enumerator<ISummaryZoomSection> it = this.f3475k4.iterator();
        while (it.hasNext()) {
            try {
                ISummaryZoomSection next = it.next();
                if (C14047bz.m66535k4(((Section) next.getTargetSection()).m2517k4(), ((Section) iSection).m2517k4())) {
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

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ISummaryZoomSectionCollection
    public final ISummaryZoomSection get_Item(int i) {
        return this.f3475k4.get_Item(i);
    }

    @Override // com.aspose.slides.ISummaryZoomSectionCollection
    public final int indexOf(ISummaryZoomSection iSummaryZoomSection) {
        return this.f3475k4.indexOf(iSummaryZoomSection);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISummaryZoomSection> iterator() {
        return this.f3475k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ISummaryZoomSection> iteratorJava() {
        return this.f3475k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final ISummaryZoomSection m2852k4(ISummaryZoomSection iSummaryZoomSection) {
        this.f3475k4.addItem(iSummaryZoomSection);
        return iSummaryZoomSection;
    }

    @Override // com.aspose.slides.ISummaryZoomSectionCollection
    public final void removeSummaryZoomSection(ISection iSection) {
        ISummaryZoomSection summarySection;
        if (iSection == null || (summarySection = getSummarySection(iSection)) == null) {
            return;
        }
        m2851x1(summarySection);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3475k4.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m2850k4() {
        float f;
        float f2;
        float height = ((SummaryZoomFrame) this.f2127h4).getHeight();
        float width = ((SummaryZoomFrame) this.f2127h4).getWidth();
        float f3 = height * width;
        float fM56697kk = ((SlideSize) ((SummaryZoomFrame) this.f2127h4).getPresentation().getSlideSize()).m2755k4().m56697kk();
        float fM56699x1 = ((SlideSize) ((SummaryZoomFrame) this.f2127h4).getPresentation().getSlideSize()).m2755k4().m56699x1();
        int size = size();
        int iM27462to = 1;
        int i = 1;
        while (true) {
            f = iM27462to * fM56699x1;
            if (f <= width) {
                f2 = i * fM56697kk;
                if (f2 <= height) {
                    break;
                }
            }
            while (true) {
                fM56697kk *= 0.9f;
                fM56699x1 *= 0.9f;
                if (fM56697kk * fM56699x1 * size <= f3 && fM56699x1 <= width && fM56697kk <= height) {
                    break;
                }
            }
            iM27462to = C7019kk.m27462to(Float.valueOf(width / fM56699x1), 13);
            i = size % iM27462to > 0 ? (size / iM27462to) + 1 : size / iM27462to;
        }
        float f4 = (width - f) / 2.0f;
        float f5 = (height - f2) / 2.0f;
        for (int i2 = 0; i2 < size(); i2++) {
            float f6 = fM56699x1 * 0.05f;
            get_Item(i2).setX((f6 / 2.0f) + ((i2 % iM27462to) * fM56699x1) + f4);
            get_Item(i2).setX(get_Item(i2).getX() - ((((SummaryZoomSection) get_Item(i2)).m2845kk() * get_Item(i2).getX()) / 100.0f));
            float f7 = 0.05f * fM56697kk;
            get_Item(i2).setY((f7 / 2.0f) + ((i2 / iM27462to) * fM56697kk) + f5);
            get_Item(i2).setY(((((SummaryZoomSection) get_Item(i2)).m2847to() * get_Item(i2).getY()) / 100.0f) + get_Item(i2).getY());
            get_Item(i2).setWidth((((SummaryZoomSection) get_Item(i2)).m2842ck() * (fM56699x1 - f6)) / 100.0f);
            get_Item(i2).setHeight((((SummaryZoomSection) get_Item(i2)).m2849up() * (fM56697kk - f7)) / 100.0f);
        }
    }
}
