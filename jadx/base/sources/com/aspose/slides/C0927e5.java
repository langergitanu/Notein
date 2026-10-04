package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.e5 */
/* JADX INFO: loaded from: classes3.dex */
final class C0927e5 extends AbstractC1137ga<FillFormatCollection, C0927e5> implements IFillFormatCollectionEffectiveData {

    /* JADX INFO: renamed from: k4 */
    List<IFillFormatEffectiveData> f4706k4;

    public C0927e5() {
        this.f4706k4 = new List<>();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f4706k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IFillFormatCollectionEffectiveData
    public final IFillFormatEffectiveData get_Item(int i) {
        return this.f4706k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IFillFormatEffectiveData> iterator() {
        return this.f4706k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IFillFormatEffectiveData> iteratorJava() {
        return this.f4706k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5342k4(FillFormatCollection fillFormatCollection) {
        if (this.f4706k4.size() > fillFormatCollection.size()) {
            this.f4706k4.removeRange(fillFormatCollection.size(), this.f4706k4.size() - fillFormatCollection.size());
        }
        for (int i = 0; i < fillFormatCollection.size(); i++) {
            if (i == this.f4706k4.size()) {
                this.f4706k4.addItem(new C14176nc((FillFormat) null));
            } else {
                ((C14176nc) this.f4706k4.get_Item(i)).m67930h4();
            }
            C14176nc c14176nc = (C14176nc) this.f4706k4.get_Item(i);
            c14176nc.f47502kk = (byte) 1;
            c14176nc.f47504to = (byte) 1;
            c14176nc.m67926c5().m73525k4(C12003du.m56460uz().Clone());
            c14176nc.m67927ck().f47492x1.m73525k4(C12003du.m56460uz().Clone());
            c14176nc.m67927ck().f47491kk.m73525k4(C12003du.m56385i5().Clone());
            c14176nc.m67931jd().f46043du = (byte) 0;
            c14176nc.m67929fa();
            c14176nc.m67936kk((FillFormat) fillFormatCollection.get_Item(i));
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f4706k4.size();
    }

    public C0927e5(FillFormatCollection fillFormatCollection) {
        if (fillFormatCollection == null || fillFormatCollection.size() <= 0) {
            this.f4706k4 = new List<>();
            return;
        }
        this.f4706k4 = new List<>();
        for (int i = 0; i < fillFormatCollection.size(); i++) {
            C14176nc c14176nc = new C14176nc((FillFormat) null);
            c14176nc.f47502kk = (byte) 1;
            c14176nc.f47504to = (byte) 1;
            c14176nc.m67926c5().m73525k4(C12003du.m56460uz().Clone());
            c14176nc.m67927ck().f47492x1.m73525k4(C12003du.m56460uz().Clone());
            c14176nc.m67927ck().f47491kk.m73525k4(C12003du.m56385i5().Clone());
            c14176nc.m67931jd().f46043du = (byte) 0;
            c14176nc.m67929fa();
            c14176nc.m67936kk((FillFormat) fillFormatCollection.get_Item(i));
            this.f4706k4.addItem(c14176nc);
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        List.Enumerator<IFillFormatEffectiveData> it = this.f4706k4.iterator();
        while (it.hasNext()) {
            try {
                ((C14176nc) it.next()).mo4833k4(iBaseSlide, dm6Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5343k4(InterfaceC14672vc interfaceC14672vc) {
        if (interfaceC14672vc == null) {
            return;
        }
        C0927e5 c0927e5 = (C0927e5) interfaceC14672vc;
        if (this.f4706k4.size() > c0927e5.f4706k4.size()) {
            this.f4706k4.removeRange(c0927e5.f4706k4.size(), this.f4706k4.size() - c0927e5.f4706k4.size());
        }
        for (int i = 0; i < c0927e5.f4706k4.size(); i++) {
            if (i == this.f4706k4.size()) {
                this.f4706k4.addItem(new C14176nc((FillFormat) null));
            } else {
                ((C14176nc) this.f4706k4.get_Item(i)).m67930h4();
            }
            ((C14176nc) this.f4706k4.get_Item(i)).m67934k4((InterfaceC14672vc) c0927e5.f4706k4.get_Item(i));
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, FillFormatCollection fillFormatCollection) {
        m5343k4(interfaceC14672vc);
        m5342k4(fillFormatCollection);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C0927e5 c0927e5) {
        if (c0927e5 == null || this.f4706k4.size() != c0927e5.f4706k4.size()) {
            return false;
        }
        for (int size = this.f4706k4.size(); size < this.f4706k4.size(); size++) {
            if (!this.f4706k4.get_Item(size).equals(c0927e5.f4706k4.get_Item(size))) {
                return false;
            }
        }
        return true;
    }
}
