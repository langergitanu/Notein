package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p172hu.C4688x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class giy extends AbstractC1137ga<LineFormatCollection, giy> implements ILineFormatCollectionEffectiveData {

    /* JADX INFO: renamed from: k4 */
    private final List<ILineFormatEffectiveData> f5263k4 = new List<>();

    public giy() {
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f5263k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ILineFormatCollectionEffectiveData
    public final ILineFormatEffectiveData get_Item(int i) {
        return this.f5263k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ILineFormatEffectiveData> iterator() {
        return new C4688x1(this.f5263k4.iterator().Clone(), new AbstractC4687to<ILineFormatEffectiveData, ILineFormatEffectiveData>() { // from class: com.aspose.slides.giy.1
            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public ILineFormatEffectiveData invoke(ILineFormatEffectiveData iLineFormatEffectiveData) {
                return iLineFormatEffectiveData;
            }
        });
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ILineFormatEffectiveData> iteratorJava() {
        return this.f5263k4.iteratorJava();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        List.Enumerator<ILineFormatEffectiveData> it = this.f5263k4.iterator();
        while (it.hasNext()) {
            try {
                ((skr) it.next()).mo4833k4(iBaseSlide, dm6Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f5263k4.size();
    }

    public giy(LineFormatCollection lineFormatCollection) {
        if (lineFormatCollection == null || lineFormatCollection.size() <= 0) {
            return;
        }
        for (int i = 0; i < lineFormatCollection.size(); i++) {
            skr skrVar = new skr((LineFormat) null);
            erk erkVar = skrVar.f48872ks;
            erkVar.f4854k4 = (byte) 1;
            erkVar.m5652kk().m73525k4(C12003du.m56460uz().Clone());
            skrVar.f48872ks.m5647du().f47492x1.m73525k4(C12003du.m56460uz().Clone());
            skrVar.f48872ks.m5647du().f47491kk.m73525k4(C12003du.m56385i5().Clone());
            skrVar.f48871kk = null;
            skrVar.f48875to = (byte) 2;
            skrVar.f48865du = (byte) 0;
            skrVar.f48868h4 = (byte) 0;
            skrVar.f48873m9 = (byte) 0;
            skrVar.f48866dy = 10.0f;
            skrVar.f48863c5 = (byte) 0;
            skrVar.f48870jd = (byte) 0;
            skrVar.f48877up = (byte) 1;
            skrVar.f48878yj = (byte) 1;
            skrVar.f48864ck = (byte) 1;
            skrVar.f48867fa = (byte) 1;
            skrVar.m70666x1((LineFormat) lineFormatCollection.get_Item(i));
            this.f5263k4.addItem(skrVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6737k4(LineFormatCollection lineFormatCollection) {
        if (this.f5263k4.size() > lineFormatCollection.size()) {
            this.f5263k4.removeRange(lineFormatCollection.size(), this.f5263k4.size() - lineFormatCollection.size());
        }
        for (int i = 0; i < lineFormatCollection.size(); i++) {
            if (i == this.f5263k4.size()) {
                this.f5263k4.addItem(new skr((LineFormat) null));
            } else {
                ((skr) this.f5263k4.get_Item(i)).m70662h4();
            }
            skr skrVar = (skr) this.f5263k4.get_Item(i);
            erk erkVar = skrVar.f48872ks;
            erkVar.f4854k4 = (byte) 1;
            erkVar.m5652kk().m73525k4(C12003du.m56460uz().Clone());
            skrVar.f48872ks.m5647du().f47492x1.m73525k4(C12003du.m56460uz().Clone());
            skrVar.f48872ks.m5647du().f47491kk.m73525k4(C12003du.m56385i5().Clone());
            skrVar.f48871kk = null;
            skrVar.f48875to = (byte) 2;
            skrVar.f48865du = (byte) 0;
            skrVar.f48868h4 = (byte) 0;
            skrVar.f48873m9 = (byte) 0;
            skrVar.f48866dy = 10.0f;
            skrVar.f48863c5 = (byte) 0;
            skrVar.f48870jd = (byte) 0;
            skrVar.f48877up = (byte) 1;
            skrVar.f48878yj = (byte) 1;
            skrVar.f48864ck = (byte) 1;
            skrVar.f48867fa = (byte) 1;
            skrVar.m70666x1((LineFormat) lineFormatCollection.get_Item(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6738k4(InterfaceC14672vc interfaceC14672vc) {
        if (interfaceC14672vc == null) {
            return;
        }
        giy giyVar = (giy) interfaceC14672vc;
        if (this.f5263k4.size() > giyVar.f5263k4.size()) {
            this.f5263k4.removeRange(giyVar.f5263k4.size(), this.f5263k4.size() - giyVar.f5263k4.size());
        }
        for (int i = 0; i < giyVar.f5263k4.size(); i++) {
            if (i == this.f5263k4.size()) {
                this.f5263k4.addItem(new skr((LineFormat) null));
            } else {
                ((skr) this.f5263k4.get_Item(i)).m70662h4();
            }
            ((skr) this.f5263k4.get_Item(i)).m70663k4((InterfaceC14672vc) giyVar.f5263k4.get_Item(i));
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, LineFormatCollection lineFormatCollection) {
        m6738k4(interfaceC14672vc);
        m6737k4(lineFormatCollection);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(giy giyVar) {
        if (giyVar == null || this.f5263k4.size() != giyVar.f5263k4.size()) {
            return false;
        }
        for (int size = this.f5263k4.size(); size < this.f5263k4.size(); size++) {
            if (!this.f5263k4.get_Item(size).equals(giyVar.f5263k4.get_Item(size))) {
                return false;
            }
        }
        return true;
    }
}
