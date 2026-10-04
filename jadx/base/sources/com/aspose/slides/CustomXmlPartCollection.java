package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class CustomXmlPartCollection implements ICustomXmlPartCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f2081k4;

    /* JADX INFO: renamed from: x1 */
    private final List<ICustomXmlPart> f2082x1 = new List<>();

    public CustomXmlPartCollection(InterfaceC14397rj interfaceC14397rj) {
        this.f2081k4 = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: x1 */
    private Presentation m1284x1() {
        InterfaceC14397rj parent_Immediate = this.f2081k4;
        while (parent_Immediate != null && !C7019kk.m27469x1(parent_Immediate, Presentation.class)) {
            parent_Immediate = parent_Immediate.getParent_Immediate();
        }
        return (Presentation) C7019kk.m27452k4((Object) parent_Immediate, Presentation.class);
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final ICustomXmlPart add(InputStream inputStream) {
        return m1286k4(AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final void clear() {
        for (ICustomXmlPart iCustomXmlPart : this.f2082x1.toArray(new ICustomXmlPart[0])) {
            ((CustomXmlPart) iCustomXmlPart).m1283x1(this);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2082x1.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2081k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final ICustomXmlPart get_Item(int i) {
        if (i < 0 || i >= this.f2082x1.size()) {
            throw new IndexOutOfRangeException("Index can't be less than zero or equal to or greater than Count");
        }
        return this.f2082x1.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ICustomXmlPart> iterator() {
        return this.f2082x1.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ICustomXmlPart> iteratorJava() {
        return this.f2082x1.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<ICustomXmlPart> m1285k4() {
        return this.f2082x1;
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final boolean remove(ICustomXmlPart iCustomXmlPart) {
        if (iCustomXmlPart != null) {
            return ((CustomXmlPart) iCustomXmlPart).m1283x1(this);
        }
        throw new ArgumentNullException("item", "Item can't be null");
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final void removeAt(int i) {
        if (i < 0 || i >= this.f2082x1.size()) {
            throw new IndexOutOfRangeException("Index can't be less than zero or equal to or greater than Count");
        }
        ((CustomXmlPart) this.f2082x1.get_Item(i)).m1283x1(this);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2082x1.size();
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final ICustomXmlPart add(String str) {
        if (str == null) {
            throw new ArgumentNullException("xmlString", "XmlString can't be null");
        }
        if ("".equals(str)) {
            throw new ArgumentException("xmlString", "XmlString can't be empty");
        }
        return add(AbstractC6747ar.m26635ix().mo26677to(str));
    }

    /* JADX INFO: renamed from: k4 */
    public ICustomXmlPart m1286k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("inputStream", "Input stream can't be null");
        }
        long length = abstractC3150x6.getLength();
        byte[] bArr = new byte[(int) length];
        int i = 0;
        while (i < length) {
            i += abstractC3150x6.read(bArr, i, C14080ne.m66997m9(Long.valueOf(length)) - i);
        }
        return add(bArr);
    }

    @Override // com.aspose.slides.ICustomXmlPartCollection
    public final ICustomXmlPart add(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("xmlData", "XmlData can't be null");
        }
        CustomXmlPart customXmlPart = new CustomXmlPart(m1284x1(), bArr);
        customXmlPart.m1280k4(this);
        return customXmlPart;
    }
}
