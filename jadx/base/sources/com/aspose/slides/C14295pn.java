package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pn */
/* JADX INFO: loaded from: classes3.dex */
final class C14295pn extends AbstractC1137ga<EffectStyleCollection, C14295pn> implements IEffectStyleCollectionEffectiveData {

    /* JADX INFO: renamed from: k4 */
    private final List<IEffectStyleEffectiveData> f48099k4 = new List<>();

    public C14295pn() {
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f48099k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IEffectStyleCollectionEffectiveData
    public final IEffectStyleEffectiveData get_Item(int i) {
        return this.f48099k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IEffectStyleEffectiveData> iterator() {
        return this.f48099k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IEffectStyleEffectiveData> iteratorJava() {
        return this.f48099k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69157k4(EffectStyleCollection effectStyleCollection) {
        if (this.f48099k4.size() > effectStyleCollection.size()) {
            this.f48099k4.removeRange(effectStyleCollection.size(), this.f48099k4.size() - effectStyleCollection.size());
        }
        for (int i = 0; i < effectStyleCollection.size(); i++) {
            if (i == this.f48099k4.size()) {
                this.f48099k4.addItem(new C13697jp());
            } else {
                ((C13697jp) this.f48099k4.get_Item(i)).m63479k4();
            }
            C13697jp c13697jp = (C13697jp) this.f48099k4.get_Item(i);
            ((fpw) c13697jp.getThreeDFormat()).f5088kk = 0;
            ((fpw) c13697jp.getThreeDFormat()).f5083du = 0;
            c13697jp.m63480k4((EffectStyle) effectStyleCollection.get_Item(i));
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f48099k4.size();
    }

    public C14295pn(EffectStyleCollection effectStyleCollection) {
        if (effectStyleCollection == null || effectStyleCollection.size() <= 0) {
            return;
        }
        for (int i = 0; i < effectStyleCollection.size(); i++) {
            C13697jp c13697jp = new C13697jp();
            ((fpw) c13697jp.getThreeDFormat()).f5088kk = 0;
            ((fpw) c13697jp.getThreeDFormat()).f5083du = 0;
            c13697jp.m63480k4((EffectStyle) effectStyleCollection.get_Item(i));
            this.f48099k4.addItem(c13697jp);
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        List.Enumerator<IEffectStyleEffectiveData> it = this.f48099k4.iterator();
        while (it.hasNext()) {
            try {
                ((C13697jp) it.next()).mo4833k4(iBaseSlide, dm6Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69158k4(InterfaceC14672vc interfaceC14672vc) {
        if (interfaceC14672vc == null) {
            return;
        }
        C14295pn c14295pn = (C14295pn) interfaceC14672vc;
        if (this.f48099k4.size() > c14295pn.f48099k4.size()) {
            this.f48099k4.removeRange(c14295pn.f48099k4.size(), this.f48099k4.size() - c14295pn.f48099k4.size());
        }
        for (int i = 0; i < c14295pn.f48099k4.size(); i++) {
            if (i == this.f48099k4.size()) {
                this.f48099k4.addItem(new C13697jp());
            } else {
                ((C13697jp) this.f48099k4.get_Item(i)).m63479k4();
            }
            ((C13697jp) this.f48099k4.get_Item(i)).m63481k4((InterfaceC14672vc) c14295pn.f48099k4.get_Item(i));
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, EffectStyleCollection effectStyleCollection) {
        m69158k4(interfaceC14672vc);
        m69157k4(effectStyleCollection);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14295pn c14295pn) {
        if (c14295pn == null || this.f48099k4.size() != c14295pn.f48099k4.size()) {
            return false;
        }
        for (int size = this.f48099k4.size(); size < this.f48099k4.size(); size++) {
            if (!this.f48099k4.get_Item(size).equals(c14295pn.f48099k4.get_Item(size))) {
                return false;
            }
        }
        return true;
    }
}
