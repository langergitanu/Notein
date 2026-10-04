package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p172hu.C4684k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class PortionCollection extends DomObject<Paragraph> implements IPortionCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IPortion> f3053k4;

    public PortionCollection(Paragraph paragraph) {
        super(paragraph);
        this.f3053k4 = new List<>();
    }

    @Override // com.aspose.slides.IPortionCollection
    public final void add(IPortion iPortion) {
        if (((InterfaceC14397rj) iPortion).getParent_Immediate() != null) {
            throw new PptxEditException("Can't add already used portion");
        }
        ((Portion) iPortion).m2288k4(this);
        this.f3053k4.addItem(iPortion);
        m2296k4(iPortion);
    }

    @Override // com.aspose.slides.IPortionCollection
    public final void clear() {
        List.Enumerator<IPortion> it = this.f3053k4.iterator();
        while (it.hasNext()) {
            try {
                ((Portion) it.next()).m2288k4((PortionCollection) null);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f3053k4.clear();
        m2296k4((IPortion) null);
    }

    @Override // com.aspose.slides.IPortionCollection
    public final boolean contains(IPortion iPortion) {
        return this.f3053k4.containsItem(iPortion);
    }

    public final void copyTo(IPortion[] iPortionArr, int i) {
        this.f3053k4.copyToTArray(iPortionArr, i);
    }

    @Override // com.aspose.slides.IPortionCollection
    public final int getCount() {
        return this.f3053k4.size();
    }

    @Override // com.aspose.slides.IPortionCollection
    public final IPortion get_Item(int i) {
        return this.f3053k4.get_Item(i);
    }

    @Override // com.aspose.slides.IPortionCollection
    public final int indexOf(IPortion iPortion) {
        return this.f3053k4.indexOf(iPortion);
    }

    @Override // com.aspose.slides.IPortionCollection
    public final void insert(int i, IPortion iPortion) {
        if (((InterfaceC14397rj) iPortion).getParent_Immediate() != null) {
            throw new PptxEditException("Can't insert already used portion");
        }
        ((Portion) iPortion).m2288k4(this);
        this.f3053k4.insertItem(i, iPortion);
        m2296k4(iPortion);
    }

    public final boolean isReadOnly() {
        return this.f3053k4.isReadOnly();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IPortion> iterator() {
        return this.f3053k4.iterator();
    }

    public final IGenericEnumerator<IPortion> iteratorJava() {
        return this.f3053k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IPortion m2297k4() {
        Portion portion = new Portion("");
        add(portion);
        return portion;
    }

    /* JADX INFO: renamed from: kk */
    public final IGenericEnumerable<InterfaceC14342qd> m2299kk() {
        return new C4684k4(this.f3053k4, new AbstractC4687to<IPortion, InterfaceC14342qd>() { // from class: com.aspose.slides.PortionCollection.1
            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public InterfaceC14342qd invoke(IPortion iPortion) {
                return new cqn((Portion) iPortion);
            }
        });
    }

    @Override // com.aspose.slides.IPortionCollection
    public final boolean remove(IPortion iPortion) {
        ((Portion) iPortion).m2288k4((PortionCollection) null);
        boolean zRemoveItem = this.f3053k4.removeItem(iPortion);
        if (zRemoveItem) {
            m2296k4((IPortion) null);
        }
        return zRemoveItem;
    }

    @Override // com.aspose.slides.IPortionCollection
    public final void removeAt(int i) {
        ((Portion) get_Item(i)).m2288k4((PortionCollection) null);
        this.f3053k4.removeAt(i);
        m2296k4((IPortion) null);
    }

    public final void set_Item(int i, IPortion iPortion) {
        ((Portion) get_Item(i)).m2288k4((PortionCollection) null);
        if (((InterfaceC14397rj) iPortion).getParent_Immediate() != null) {
            throw new PptxEditException("Can't insert already used portion");
        }
        ((Portion) iPortion).m2288k4(this);
        this.f3053k4.set_Item(i, iPortion);
        m2296k4(iPortion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final Paragraph m2300to() {
        return (Paragraph) this.f2127h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2301x1() {
        if (getCount() == 0) {
            return;
        }
        removeAt(getCount() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m2296k4(IPortion iPortion) {
        TParent tparent = this.f2127h4;
        if (tparent != 0) {
            ((Paragraph) tparent).m2162k4(iPortion != null ? iPortion.getPortionFormat() : null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2298k4(Portion portion) {
        this.f3053k4.addItem(portion);
        m2296k4((IPortion) portion);
    }
}
