package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class LineFormatCollection extends DomObject<FormatScheme> implements ILineFormatCollection {

    /* JADX INFO: renamed from: du */
    private long f2636du;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<shv> f2637k4;

    /* JADX INFO: renamed from: kk */
    private final List<ILineFormat> f2638kk;

    /* JADX INFO: renamed from: to */
    private long f2639to;

    /* JADX INFO: renamed from: x1 */
    private shv f2640x1;

    public LineFormatCollection(FormatScheme formatScheme) {
        super(formatScheme);
        this.f2637k4 = new AbstractC7018k4<shv>() { // from class: com.aspose.slides.LineFormatCollection.1
            {
                LineFormatCollection.this.f2640x1 = new shv() { // from class: com.aspose.slides.LineFormatCollection.1.1
                    @Override // com.aspose.slides.shv
                    /* JADX INFO: renamed from: k4 */
                    public void mo1571k4() {
                        Iterator it = ((AbstractC7018k4) C04991.this).f19081x1.iterator();
                        while (it.hasNext()) {
                            ((shv) it.next()).mo1571k4();
                        }
                    }
                };
            }
        };
        this.f2639to = 1L;
        this.f2636du = 0L;
        this.f2638kk = new List<>();
    }

    /* JADX INFO: renamed from: du */
    private void m1907du() {
        this.f2636du = 0L;
        shv shvVar = this.f2640x1;
        if (shvVar == null || this.f2637k4.m27430k4()) {
            return;
        }
        shvVar.mo1571k4();
    }

    /* JADX INFO: renamed from: to */
    private void m1911to() {
        this.f2639to++;
        m1907du();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2638kk.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ILineFormatCollection
    public final ILineFormat get_Item(int i) {
        return this.f2638kk.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ILineFormat> iterator() {
        return this.f2638kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ILineFormat> iteratorJava() {
        return this.f2638kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final ILineFormat m1912k4() {
        LineFormat lineFormat = new LineFormat(this);
        lineFormat.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.LineFormatCollection.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.LineFormatCollection.OnChildLineFormatChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat2) {
                LineFormatCollection.this.m1909k4(lineFormat2);
            }
        });
        this.f2638kk.addItem(lineFormat);
        m1911to();
        return lineFormat;
    }

    /* JADX INFO: renamed from: kk */
    public final long m1916kk() {
        if ((this.f2636du & 4294967295L) == 0) {
            this.f2636du = this.f2639to;
            List.Enumerator<ILineFormat> it = this.f2638kk.iterator();
            while (it.hasNext()) {
                try {
                    this.f2636du = ((this.f2636du & 4294967295L) + (((LineFormat) it.next()).getVersion() & 4294967295L)) & 4294967295L;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return this.f2636du;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2638kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1917x1() {
        this.f2639to = m1916kk();
        List.Enumerator<ILineFormat> it = this.f2638kk.iterator();
        while (it.hasNext()) {
            try {
                ((LineFormat) it.next()).f2625k4.mo27429k4(new v9k() { // from class: com.aspose.slides.LineFormatCollection.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.LineFormatCollection.OnChildLineFormatChanged(Aspose.Slides.LineFormat)";
                    }

                    @Override // com.aspose.slides.v9k
                    /* JADX INFO: renamed from: k4 */
                    public void mo501k4(LineFormat lineFormat) {
                        LineFormatCollection.this.m1909k4(lineFormat);
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1911to();
        this.f2638kk.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1913k4(ILineFormat iLineFormat) {
        ((LineFormat) iLineFormat).f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.LineFormatCollection.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.LineFormatCollection.OnChildLineFormatChanged(Aspose.Slides.LineFormat)";
            }

            @Override // com.aspose.slides.v9k
            /* JADX INFO: renamed from: k4 */
            public void mo501k4(LineFormat lineFormat) {
                LineFormatCollection.this.m1909k4(lineFormat);
            }
        });
        this.f2638kk.addItem(iLineFormat);
        m1911to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1914k4(ILineFormatCollectionEffectiveData iLineFormatCollectionEffectiveData) {
        this.f2639to = m1916kk();
        m1911to();
        this.f2638kk.clear();
        IGenericEnumerator<ILineFormatEffectiveData> it = iLineFormatCollectionEffectiveData.iterator();
        while (it.hasNext()) {
            try {
                ILineFormatEffectiveData next = it.next();
                LineFormat lineFormat = new LineFormat(this);
                lineFormat.m1897k4(next);
                lineFormat.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.LineFormatCollection.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.LineFormatCollection.OnChildLineFormatChanged(Aspose.Slides.LineFormat)";
                    }

                    @Override // com.aspose.slides.v9k
                    /* JADX INFO: renamed from: k4 */
                    public void mo501k4(LineFormat lineFormat2) {
                        LineFormatCollection.this.m1909k4(lineFormat2);
                    }
                });
                this.f2638kk.addItem(lineFormat);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m1909k4(LineFormat lineFormat) {
        m1907du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1915k4(LineFormatCollection lineFormatCollection) {
        this.f2639to = m1916kk();
        m1911to();
        this.f2638kk.clear();
        IGenericEnumerator<ILineFormat> it = lineFormatCollection.iterator();
        while (it.hasNext()) {
            try {
                LineFormat lineFormat = (LineFormat) it.next();
                LineFormat lineFormat2 = new LineFormat(this);
                lineFormat2.m1896k4((ILineFormat) lineFormat);
                lineFormat2.f2625k4.mo27432x1(new v9k() { // from class: com.aspose.slides.LineFormatCollection.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.Theme.LineFormatCollection.OnChildLineFormatChanged(Aspose.Slides.LineFormat)";
                    }

                    @Override // com.aspose.slides.v9k
                    /* JADX INFO: renamed from: k4 */
                    public void mo501k4(LineFormat lineFormat3) {
                        LineFormatCollection.this.m1909k4(lineFormat3);
                    }
                });
                this.f2638kk.addItem(lineFormat2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
