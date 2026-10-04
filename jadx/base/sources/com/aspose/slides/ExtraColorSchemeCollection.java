package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ExtraColorSchemeCollection implements IExtraColorSchemeCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: to */
    private InterfaceC14397rj f2231to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0787b0 f2232x1;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0787b0> f2229k4 = new AbstractC7018k4<AbstractC0787b0>() { // from class: com.aspose.slides.ExtraColorSchemeCollection.1
        {
            ExtraColorSchemeCollection.this.f2232x1 = new AbstractC0787b0() { // from class: com.aspose.slides.ExtraColorSchemeCollection.1.1
                @Override // com.aspose.slides.AbstractC0787b0
                /* JADX INFO: renamed from: k4 */
                public void mo1440k4() {
                    for (AbstractC0787b0 abstractC0787b0 : ((AbstractC7018k4) C03921.this).f19081x1) {
                        if (abstractC0787b0 != null) {
                            abstractC0787b0.mo1440k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private final List<IExtraColorScheme> f2230kk = new List<>();

    /* JADX INFO: renamed from: du */
    private long f2227du = 1;

    /* JADX INFO: renamed from: h4 */
    private long f2228h4 = 0;

    public ExtraColorSchemeCollection(MasterTheme masterTheme) {
        this.f2231to = masterTheme;
    }

    /* JADX INFO: renamed from: kk */
    private void m1433kk() {
        this.f2227du++;
        m1434to();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m1434to() {
        this.f2228h4 = 0L;
        AbstractC0787b0 abstractC0787b0 = this.f2232x1;
        if (abstractC0787b0 == null || this.f2229k4.m27430k4()) {
            return;
        }
        abstractC0787b0.mo1440k4();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2230kk.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2231to;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IExtraColorSchemeCollection
    public final IExtraColorScheme get_Item(int i) {
        return this.f2230kk.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IExtraColorScheme> iterator() {
        return this.f2230kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IExtraColorScheme> iteratorJava() {
        return this.f2230kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IExtraColorScheme m1435k4(IPresentationComponent iPresentationComponent) {
        ExtraColorScheme extraColorScheme = new ExtraColorScheme(this);
        extraColorScheme.f2220k4.mo27432x1(new AbstractC14828y3() { // from class: com.aspose.slides.ExtraColorSchemeCollection.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.ExtraColorSchemeCollection.OnExtraColorSchemeCollectionChanged()";
            }

            @Override // com.aspose.slides.AbstractC14828y3
            /* JADX INFO: renamed from: k4 */
            public void mo1430k4() {
                ExtraColorSchemeCollection.this.m1434to();
            }
        });
        this.f2230kk.addItem(extraColorScheme);
        m1433kk();
        return extraColorScheme;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2230kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m1438x1() {
        if ((this.f2228h4 & 4294967295L) == 0) {
            this.f2228h4 = this.f2227du;
            List.Enumerator<IExtraColorScheme> it = this.f2230kk.iterator();
            while (it.hasNext()) {
                try {
                    this.f2228h4 = ((this.f2228h4 & 4294967295L) + (((ExtraColorScheme) it.next()).m1428x1() & 4294967295L)) & 4294967295L;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f2228h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1436k4() {
        this.f2227du = m1438x1();
        List.Enumerator<IExtraColorScheme> it = this.f2230kk.iterator();
        while (it.hasNext()) {
            try {
                ((ExtraColorScheme) it.next()).f2220k4.mo27429k4(new AbstractC14828y3() { // from class: com.aspose.slides.ExtraColorSchemeCollection.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.ExtraColorSchemeCollection.OnExtraColorSchemeCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC14828y3
                    /* JADX INFO: renamed from: k4 */
                    public void mo1430k4() {
                        ExtraColorSchemeCollection.this.m1434to();
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1433kk();
        this.f2230kk.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1437k4(ExtraColorScheme extraColorScheme) {
        extraColorScheme.f2220k4.mo27432x1(new AbstractC14828y3() { // from class: com.aspose.slides.ExtraColorSchemeCollection.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.ExtraColorSchemeCollection.OnExtraColorSchemeCollectionChanged()";
            }

            @Override // com.aspose.slides.AbstractC14828y3
            /* JADX INFO: renamed from: k4 */
            public void mo1430k4() {
                ExtraColorSchemeCollection.this.m1434to();
            }
        });
        this.f2230kk.addItem(extraColorScheme);
        m1433kk();
    }
}
