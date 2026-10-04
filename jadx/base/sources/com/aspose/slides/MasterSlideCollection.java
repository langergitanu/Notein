package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MasterSlideCollection extends DomObject<Presentation> implements IMasterSlideCollection {

    /* JADX INFO: renamed from: k4 */
    final List<IMasterSlide> f2704k4;

    public MasterSlideCollection(Presentation presentation) {
        super(presentation);
        this.f2704k4 = new List<>();
    }

    @Override // com.aspose.slides.IMasterSlideCollection
    public final IMasterSlide addClone(IMasterSlide iMasterSlide) {
        return m1948k4((MasterSlide) iMasterSlide, true);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2704k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IMasterSlideCollection
    public final IMasterSlide get_Item(int i) {
        return this.f2704k4.get_Item(i);
    }

    @Override // com.aspose.slides.IMasterSlideCollection
    public final IMasterSlide insertClone(int i, IMasterSlide iMasterSlide) {
        MasterSlide masterSlideM1948k4 = m1948k4((MasterSlide) iMasterSlide, true);
        int iIndexOf = this.f2704k4.indexOf(masterSlideM1948k4);
        if (i == iIndexOf) {
            return masterSlideM1948k4;
        }
        synchronized (this.f2704k4.getSyncRoot()) {
            while (iIndexOf > i) {
                try {
                    List<IMasterSlide> list = this.f2704k4;
                    list.set_Item(iIndexOf, list.get_Item(iIndexOf - 1));
                    iIndexOf--;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f2704k4.set_Item(i, masterSlideM1948k4);
        }
        return masterSlideM1948k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IMasterSlide> iterator() {
        return this.f2704k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IMasterSlide> iteratorJava() {
        return this.f2704k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IMasterSlide m1946k4() {
        MasterSlide masterSlide = new MasterSlide(this);
        this.f2704k4.addItem(masterSlide);
        return masterSlide;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.IMasterSlideCollection
    public final void remove(IMasterSlide iMasterSlide) {
        if (this.f2704k4.containsItem(iMasterSlide)) {
            synchronized (this.f2704k4.getSyncRoot()) {
                try {
                    if (iMasterSlide.hasDependingSlides()) {
                        throw new PptxEditException("Error removing master slide: this master slide is used in presentation.");
                    }
                    List.Enumerator it = new List(iMasterSlide.getLayoutSlides()).iterator();
                    while (it.hasNext()) {
                        try {
                            ((ILayoutSlide) it.next()).remove();
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
                    this.f2704k4.removeItem(iMasterSlide);
                    if (iMasterSlide.getThemeManager().getOverrideTheme() == iMasterSlide.getPresentation().getMasterTheme() && this.f2704k4.size() > 0) {
                        ((MasterSlide) iMasterSlide).m403rv().m2360k4(this.f2704k4.get_Item(0).getThemeManager().getOverrideTheme());
                    }
                    ((MasterSlide) iMasterSlide).m398k4((InterfaceC14397rj) null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.aspose.slides.IMasterSlideCollection
    public final void removeAt(int i) {
        if (i < 0 || i >= this.f2704k4.size()) {
            throw new IndexOutOfRangeException("Error removing master slide: index out of range.");
        }
        remove(this.f2704k4.get_Item(i));
    }

    @Override // com.aspose.slides.IMasterSlideCollection
    public final void removeUnused(boolean z) {
        synchronized (this.f2704k4.getSyncRoot()) {
            int i = 0;
            while (i < this.f2704k4.size()) {
                try {
                    MasterSlide masterSlide = (MasterSlide) this.f2704k4.get_Item(i);
                    if (z || !masterSlide.getPreserve()) {
                        if (!masterSlide.hasDependingSlides()) {
                            remove(this.f2704k4.get_Item(i));
                        }
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2704k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public void m1950x1() {
        this.f2704k4.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final IMasterSlide m1947k4(IMasterSlide iMasterSlide, boolean z) {
        MasterSlide masterSlide = (MasterSlide) iMasterSlide;
        long jM387h4 = masterSlide.m387h4();
        C0957en<MasterSlide> c0957en = ((Presentation) this.f2127h4).f3073du.containsKey(Long.valueOf(jM387h4)) ? ((Presentation) this.f2127h4).f3073du.get_Item(Long.valueOf(jM387h4)) : null;
        MasterSlide masterSlideM5603k4 = c0957en != null ? c0957en.m5603k4() : null;
        if (masterSlideM5603k4 != null) {
            return masterSlideM5603k4;
        }
        MasterSlide masterSlideM1948k4 = m1948k4(masterSlide, z);
        ((Presentation) this.f2127h4).f3073du.set_Item(Long.valueOf(jM387h4), new C0957en<>(MasterSlide.class, masterSlideM1948k4));
        return masterSlideM1948k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final MasterSlide m1948k4(MasterSlide masterSlide, boolean z) {
        IPresentation presentation = masterSlide.getPresentation();
        TParent tparent = this.f2127h4;
        if (presentation == tparent) {
            return (MasterSlide) sfn.m70605k4((IPresentation) tparent, masterSlide, z);
        }
        MasterSlide masterSlide2 = (MasterSlide) sfn.m70605k4((IPresentation) tparent, masterSlide, z);
        masterSlide2.m396k4(masterSlide.getPresentation().getDefaultTextStyle());
        for (int i = 0; i < masterSlide2.f2695h4.size(); i++) {
            ((LayoutSlide) masterSlide2.f2695h4.get_Item(i)).m396k4(masterSlide.getPresentation().getDefaultTextStyle());
        }
        float fM56699x1 = ((SlideSize) ((Presentation) this.f2127h4).getSlideSize()).m2755k4().m56699x1() / ((SlideSize) masterSlide.getPresentation().getSlideSize()).m2755k4().m56699x1();
        float fM56697kk = ((SlideSize) ((Presentation) this.f2127h4).getSlideSize()).m2755k4().m56697kk() / ((SlideSize) masterSlide.getPresentation().getSlideSize()).m2755k4().m56697kk();
        IGenericEnumerator<ILayoutSlide> it = masterSlide2.getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ((BaseSlide) ((ILayoutSlide) it.next())).m392k4(fM56699x1, fM56697kk);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        masterSlide2.m392k4(fM56699x1, fM56697kk);
        return masterSlide2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1949k4(IMasterSlide iMasterSlide) {
        this.f2704k4.addItem(iMasterSlide);
    }
}
