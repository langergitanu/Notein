package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class DigitalSignatureCollection extends DomObject<Presentation> implements IDigitalSignatureCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IDigitalSignature> f2119k4;

    public DigitalSignatureCollection(Presentation presentation) {
        super(presentation);
        this.f2119k4 = new List<>();
    }

    @Override // com.aspose.slides.IDigitalSignatureCollection
    public final void add(IDigitalSignature iDigitalSignature) {
        this.f2119k4.addItem(iDigitalSignature);
    }

    @Override // com.aspose.slides.IDigitalSignatureCollection
    public final void clear() {
        this.f2119k4.clear();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2119k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IDigitalSignatureCollection
    public final IDigitalSignature get_Item(int i) {
        return this.f2119k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IDigitalSignature> iterator() {
        return this.f2119k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IDigitalSignature> iteratorJava() {
        return this.f2119k4.iteratorJava();
    }

    @Override // com.aspose.slides.IDigitalSignatureCollection
    public final void removeAt(int i) {
        this.f2119k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2119k4.size();
    }
}
