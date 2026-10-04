package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectStyleCollection extends DomObject<FormatScheme> implements IEffectStyleCollection {

    /* JADX INFO: renamed from: du */
    private long f2186du;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0701a2> f2187k4;

    /* JADX INFO: renamed from: kk */
    private final List<IEffectStyle> f2188kk;

    /* JADX INFO: renamed from: to */
    private long f2189to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0701a2 f2190x1;

    public EffectStyleCollection(FormatScheme formatScheme) {
        super(formatScheme);
        this.f2187k4 = new AbstractC7018k4<AbstractC0701a2>() { // from class: com.aspose.slides.EffectStyleCollection.1
            {
                EffectStyleCollection.this.f2190x1 = new AbstractC0701a2() { // from class: com.aspose.slides.EffectStyleCollection.1.1
                    @Override // com.aspose.slides.AbstractC0701a2
                    /* JADX INFO: renamed from: k4 */
                    public void mo1415k4() {
                        for (AbstractC0701a2 abstractC0701a2 : ((AbstractC7018k4) C03771.this).f19081x1) {
                            if (abstractC0701a2 != null) {
                                abstractC0701a2.mo1415k4();
                            }
                        }
                    }
                };
            }
        };
        this.f2189to = 1L;
        this.f2186du = 0L;
        this.f2188kk = new List<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public void m1405du() {
        this.f2186du = 0L;
        AbstractC0701a2 abstractC0701a2 = this.f2190x1;
        if (abstractC0701a2 == null || this.f2187k4.m27430k4()) {
            return;
        }
        abstractC0701a2.mo1415k4();
    }

    /* JADX INFO: renamed from: to */
    private void m1407to() {
        this.f2189to++;
        m1405du();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2188kk.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IEffectStyleCollection
    public final IEffectStyle get_Item(int i) {
        return this.f2188kk.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IEffectStyle> iterator() {
        return this.f2188kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IEffectStyle> iteratorJava() {
        return this.f2188kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IEffectStyle m1409k4() {
        EffectStyle effectStyle = new EffectStyle(this);
        effectStyle.f2178k4.mo27432x1(new AbstractC1249ie() { // from class: com.aspose.slides.EffectStyleCollection.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.EffectStyleCollection.OnEffectStyleCollectionChanged()";
            }

            @Override // com.aspose.slides.AbstractC1249ie
            /* JADX INFO: renamed from: k4 */
            public void mo1403k4() {
                EffectStyleCollection.this.m1405du();
            }
        });
        this.f2188kk.addItem(effectStyle);
        m1407to();
        return effectStyle;
    }

    /* JADX INFO: renamed from: kk */
    public final long m1412kk() {
        if ((this.f2186du & 4294967295L) == 0) {
            this.f2186du = this.f2189to;
            List.Enumerator<IEffectStyle> it = this.f2188kk.iterator();
            while (it.hasNext()) {
                try {
                    this.f2186du = ((this.f2186du & 4294967295L) + (((EffectStyle) it.next()).m1399k4() & 4294967295L)) & 4294967295L;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f2186du;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2188kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1413x1() {
        this.f2189to = m1412kk();
        List.Enumerator<IEffectStyle> it = this.f2188kk.iterator();
        while (it.hasNext()) {
            try {
                ((EffectStyle) it.next()).f2178k4.mo27429k4(new AbstractC1249ie() { // from class: com.aspose.slides.EffectStyleCollection.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.EffectStyleCollection.OnEffectStyleCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1249ie
                    /* JADX INFO: renamed from: k4 */
                    public void mo1403k4() {
                        EffectStyleCollection.this.m1405du();
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1407to();
        this.f2188kk.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1410k4(EffectStyleCollection effectStyleCollection) {
        this.f2189to = m1412kk();
        m1407to();
        this.f2188kk.clear();
        IGenericEnumerator<IEffectStyle> it = effectStyleCollection.iterator();
        while (it.hasNext()) {
            try {
                EffectStyle effectStyle = (EffectStyle) it.next();
                EffectStyle effectStyle2 = new EffectStyle(this);
                effectStyle2.m1400k4(effectStyle);
                effectStyle2.f2178k4.mo27432x1(new AbstractC1249ie() { // from class: com.aspose.slides.EffectStyleCollection.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.EffectStyleCollection.OnEffectStyleCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1249ie
                    /* JADX INFO: renamed from: k4 */
                    public void mo1403k4() {
                        EffectStyleCollection.this.m1405du();
                    }
                });
                this.f2188kk.addItem(effectStyle2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1411k4(IEffectStyleCollectionEffectiveData iEffectStyleCollectionEffectiveData) {
        this.f2189to = m1412kk();
        m1407to();
        this.f2188kk.clear();
        IGenericEnumerator<IEffectStyleEffectiveData> it = iEffectStyleCollectionEffectiveData.iterator();
        while (it.hasNext()) {
            try {
                IEffectStyleEffectiveData next = it.next();
                EffectStyle effectStyle = new EffectStyle(this);
                effectStyle.m1401k4(next);
                effectStyle.f2178k4.mo27432x1(new AbstractC1249ie() { // from class: com.aspose.slides.EffectStyleCollection.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.EffectStyleCollection.OnEffectStyleCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1249ie
                    /* JADX INFO: renamed from: k4 */
                    public void mo1403k4() {
                        EffectStyleCollection.this.m1405du();
                    }
                });
                this.f2188kk.addItem(effectStyle);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
