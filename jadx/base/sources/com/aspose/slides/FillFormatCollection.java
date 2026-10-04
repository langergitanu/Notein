package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class FillFormatCollection extends DomObject<FormatScheme> implements IFillFormatCollection {

    /* JADX INFO: renamed from: du */
    private long f2272du;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC14259ox> f2273k4;

    /* JADX INFO: renamed from: kk */
    private final List<IFillFormat> f2274kk;

    /* JADX INFO: renamed from: to */
    private long f2275to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14259ox f2276x1;

    public FillFormatCollection(FormatScheme formatScheme) {
        super(formatScheme);
        this.f2273k4 = new AbstractC7018k4<AbstractC14259ox>() { // from class: com.aspose.slides.FillFormatCollection.1
            {
                FillFormatCollection.this.f2276x1 = new AbstractC14259ox() { // from class: com.aspose.slides.FillFormatCollection.1.1
                    @Override // com.aspose.slides.AbstractC14259ox
                    /* JADX INFO: renamed from: k4 */
                    public void mo1476k4() {
                        for (AbstractC14259ox abstractC14259ox : ((AbstractC7018k4) C04021.this).f19081x1) {
                            if (abstractC14259ox != null) {
                                abstractC14259ox.mo1476k4();
                            }
                        }
                    }
                };
            }
        };
        this.f2275to = 1L;
        this.f2272du = 0L;
        this.f2274kk = new List<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public void m1466du() {
        this.f2272du = 0L;
        AbstractC14259ox abstractC14259ox = this.f2276x1;
        if (abstractC14259ox == null || this.f2273k4.m27430k4()) {
            return;
        }
        abstractC14259ox.mo1476k4();
    }

    /* JADX INFO: renamed from: to */
    private void m1468to() {
        this.f2275to++;
        m1466du();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2274kk.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IFillFormatCollection
    public final IFillFormat get_Item(int i) {
        return this.f2274kk.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IFillFormat> iterator() {
        return this.f2274kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IFillFormat> iteratorJava() {
        return this.f2274kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IFillFormat m1470k4() {
        FillFormat fillFormat = new FillFormat(this);
        fillFormat.f2261k4.mo27432x1(new AbstractC0766ax() { // from class: com.aspose.slides.FillFormatCollection.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FillFormatCollection.OnFillFormatCollectionChanged()";
            }

            @Override // com.aspose.slides.AbstractC0766ax
            /* JADX INFO: renamed from: k4 */
            public void mo1462k4() {
                FillFormatCollection.this.m1466du();
            }
        });
        this.f2274kk.addItem(fillFormat);
        m1468to();
        return fillFormat;
    }

    /* JADX INFO: renamed from: kk */
    public final long m1473kk() {
        if ((this.f2272du & 4294967295L) == 0) {
            this.f2272du = this.f2275to;
            List.Enumerator<IFillFormat> it = this.f2274kk.iterator();
            while (it.hasNext()) {
                try {
                    this.f2272du = ((this.f2272du & 4294967295L) + (((FillFormat) it.next()).getVersion() & 4294967295L)) & 4294967295L;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f2272du;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2274kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1474x1() {
        this.f2275to = m1473kk();
        List.Enumerator<IFillFormat> it = this.f2274kk.iterator();
        while (it.hasNext()) {
            try {
                ((FillFormat) it.next()).f2261k4.mo27429k4(new AbstractC0766ax() { // from class: com.aspose.slides.FillFormatCollection.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.FillFormatCollection.OnFillFormatCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC0766ax
                    /* JADX INFO: renamed from: k4 */
                    public void mo1462k4() {
                        FillFormatCollection.this.m1466du();
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1468to();
        this.f2274kk.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1471k4(FillFormatCollection fillFormatCollection) {
        this.f2275to = m1473kk();
        this.f2274kk.clear();
        IGenericEnumerator<IFillFormat> it = fillFormatCollection.iterator();
        while (it.hasNext()) {
            try {
                FillFormat fillFormat = (FillFormat) it.next();
                FillFormat fillFormat2 = new FillFormat(this);
                this.f2274kk.addItem(fillFormat2);
                fillFormat2.m1456k4((IFillFormat) fillFormat);
                fillFormat2.f2261k4.mo27432x1(new AbstractC0766ax() { // from class: com.aspose.slides.FillFormatCollection.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.FillFormatCollection.OnFillFormatCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC0766ax
                    /* JADX INFO: renamed from: k4 */
                    public void mo1462k4() {
                        FillFormatCollection.this.m1466du();
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1468to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1472k4(IFillFormatCollectionEffectiveData iFillFormatCollectionEffectiveData) {
        this.f2275to = m1473kk();
        this.f2274kk.clear();
        IGenericEnumerator<IFillFormatEffectiveData> it = iFillFormatCollectionEffectiveData.iterator();
        while (it.hasNext()) {
            try {
                IFillFormatEffectiveData next = it.next();
                FillFormat fillFormat = new FillFormat(this);
                fillFormat.m1457k4(next);
                this.f2274kk.addItem(fillFormat);
                fillFormat.f2261k4.mo27432x1(new AbstractC0766ax() { // from class: com.aspose.slides.FillFormatCollection.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.FillFormatCollection.OnFillFormatCollectionChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC0766ax
                    /* JADX INFO: renamed from: k4 */
                    public void mo1462k4() {
                        FillFormatCollection.this.m1466du();
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1468to();
    }
}
