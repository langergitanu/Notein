package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class SectionCollection extends DomObject<Presentation> implements ISectionCollection {

    /* JADX INFO: renamed from: k4 */
    final List<ISection> f3285k4;

    public SectionCollection(Presentation presentation) {
        super(presentation);
        this.f3285k4 = new List<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISectionCollection
    public final ISection addEmptySection(String str, int i) {
        if (i < 0 || (i > 0 && i >= size())) {
            throw new PptxEditException("Index must lay within [0..Count-1] range.");
        }
        if (this.f3285k4.size() == 0) {
            this.f3285k4.addItem(new Section("Default Section", this, ((Presentation) this.f2127h4).getSlides().get_Item(0)));
        }
        Section section = new Section(str, this, null);
        this.f3285k4.insertItem(i, section);
        return section;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISectionCollection
    public final ISection addSection(String str, ISlide iSlide) {
        if (iSlide == null) {
            throw new ArgumentNullException("startedFromSlide");
        }
        int iIndexOf = ((Presentation) this.f2127h4).getSlides().indexOf(iSlide);
        int i = 0;
        if (this.f3285k4.size() == 0 && iIndexOf > 0) {
            this.f3285k4.addItem(new Section("Default Section", this, ((Presentation) this.f2127h4).getSlides().get_Item(0)));
        }
        int size = this.f3285k4.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (this.f3285k4.get_Item(size).getStartedFromSlide() != null) {
                if (this.f3285k4.get_Item(size).getStartedFromSlide() == iSlide) {
                    throw new PptxEditException("Section with the same first slide already exists.");
                }
                if (((Presentation) this.f2127h4).getSlides().indexOf(this.f3285k4.get_Item(size).getStartedFromSlide()) < iIndexOf) {
                    i = size + 1;
                    break;
                }
            }
            size--;
        }
        Section section = new Section(str, this, iSlide);
        this.f3285k4.insertItem(i, section);
        return section;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISectionCollection
    public final ISection appendEmptySection(String str) {
        if (this.f3285k4.size() == 0) {
            this.f3285k4.addItem(new Section("Default Section", this, ((Presentation) this.f2127h4).getSlides().get_Item(0)));
        }
        Section section = new Section(str, this, null);
        this.f3285k4.addItem(section);
        return section;
    }

    @Override // com.aspose.slides.ISectionCollection
    public final void clear() {
        this.f3285k4.clear();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3285k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ISectionCollection
    public final ISection get_Item(int i) {
        return this.f3285k4.get_Item(i);
    }

    @Override // com.aspose.slides.ISectionCollection
    public final int indexOf(ISection iSection) {
        return this.f3285k4.indexOf(iSection);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISection> iterator() {
        return this.f3285k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ISection> iteratorJava() {
        return this.f3285k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final ISection m2520k4(ISlide iSlide) {
        List.Enumerator<ISection> it = this.f3285k4.iterator();
        while (it.hasNext()) {
            try {
                ISection next = it.next();
                if (((SectionSlideCollection) next.getSlidesListOfSection()).m2523k4(iSlide)) {
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

    @Override // com.aspose.slides.ISectionCollection
    public final void removeSection(ISection iSection) {
        int iIndexOf = this.f3285k4.indexOf(iSection);
        if (iIndexOf == 0 && this.f3285k4.size() > 1) {
            throw new PptxEditException("First section cannot be removed if sections count in the collection more than 1.");
        }
        if (iIndexOf > 0) {
            int i = iIndexOf - 1;
            if (this.f3285k4.get_Item(i).getStartedFromSlide() == null) {
                ((Section) this.f3285k4.get_Item(i)).m2518k4(iSection.getStartedFromSlide());
            }
        }
        this.f3285k4.removeItem(iSection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISectionCollection
    public final void removeSectionWithSlides(ISection iSection) {
        IGenericEnumerator<ISlide> it = iSection.getSlidesListOfSection().iterator();
        while (it.hasNext()) {
            try {
                ((Presentation) this.f2127h4).getSlides().remove(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f3285k4.removeItem(iSection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[LOOP:2: B:25:0x0077->B:26:0x0079, LOOP_END] */
    @Override // com.aspose.slides.ISectionCollection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reorderSectionWithSlides(ISection iSection, int i) {
        int iIndexOf;
        if (i < 0 || i >= size()) {
            throw new PptxEditException("Index must lay within [0..Count-1] range.");
        }
        int iIndexOf2 = this.f3285k4.indexOf(iSection);
        if (iIndexOf2 < 0) {
            throw new PptxEditException("Trying to move removed section.");
        }
        if (iIndexOf2 == i) {
            return;
        }
        int i2 = 0;
        if (i >= iIndexOf2) {
            int size = i == this.f3285k4.size() + (-1) ? ((Presentation) this.f2127h4).getSlides().size() - 1 : 0;
            for (int i3 = i + 1; i3 < this.f3285k4.size(); i3++) {
                if (this.f3285k4.get_Item(i3).getStartedFromSlide() != null) {
                    size = ((Presentation) this.f2127h4).getSlides().indexOf(this.f3285k4.get_Item(i3).getStartedFromSlide());
                }
            }
            if (iSection.getStartedFromSlide() != null) {
                ISectionSlideCollection slidesListOfSection = iSection.getSlidesListOfSection();
                while (i2 < slidesListOfSection.size()) {
                    ((SlideCollection) ((Presentation) this.f2127h4).getSlides()).m2740x1(size, slidesListOfSection.get_Item(i2));
                    i2++;
                }
            }
            while (iIndexOf2 < i) {
                List<ISection> list = this.f3285k4;
                int i4 = iIndexOf2 + 1;
                list.set_Item(iIndexOf2, list.get_Item(i4));
                iIndexOf2 = i4;
            }
        } else if (i > 0) {
            for (int i5 = i - 1; i5 >= 0; i5--) {
                if (this.f3285k4.get_Item(i5).getStartedFromSlide() != null) {
                    iIndexOf = ((Presentation) this.f2127h4).getSlides().indexOf(this.f3285k4.get_Item(i5).getSlidesListOfSection().get_Item(r2.size() - 1));
                    break;
                }
            }
            iIndexOf = 0;
            if (iSection.getStartedFromSlide() != null) {
                ISectionSlideCollection slidesListOfSection2 = iSection.getSlidesListOfSection();
                while (i2 < slidesListOfSection2.size()) {
                    ((SlideCollection) ((Presentation) this.f2127h4).getSlides()).m2740x1(iIndexOf + i2, slidesListOfSection2.get_Item(i2));
                    i2++;
                }
            }
            while (iIndexOf2 > i) {
                List<ISection> list2 = this.f3285k4;
                list2.set_Item(iIndexOf2, list2.get_Item(iIndexOf2 - 1));
                iIndexOf2--;
            }
        } else {
            iIndexOf = 0;
            if (iSection.getStartedFromSlide() != null) {
            }
            while (iIndexOf2 > i) {
            }
        }
        this.f3285k4.set_Item(i, iSection);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3285k4.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r6 = r2.getSlidesListOfSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6.size() != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r6 = r6.get_Item(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r2.m2518k4(r6);
     */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2522x1(ISlide iSlide) {
        if (this.f3285k4.size() == 0) {
            return;
        }
        List.Enumerator<ISection> it = this.f3285k4.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                Section section = (Section) it.next();
                if (section.getStartedFromSlide() == iSlide) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final ISection m2521k4(String str, ISlide iSlide, C14047bz c14047bz) {
        Section section = new Section(str, this, iSlide);
        section.m2519k4(c14047bz.Clone());
        this.f3285k4.addItem(section);
        return section;
    }
}
