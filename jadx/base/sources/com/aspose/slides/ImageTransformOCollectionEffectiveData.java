package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ImageTransformOCollectionEffectiveData implements IImageTransformOCollectionEffectiveData, InterfaceC14672vc {

    /* JADX INFO: renamed from: k4 */
    private List<IEffectEffectiveData> f2488k4 = new List<>();

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2488k4.copyTo(abstractC14092to, i);
    }

    public boolean equals(Object obj) {
        ImageTransformOCollectionEffectiveData imageTransformOCollectionEffectiveData = (ImageTransformOCollectionEffectiveData) C7019kk.m27452k4(obj, ImageTransformOCollectionEffectiveData.class);
        if (imageTransformOCollectionEffectiveData == null) {
            return false;
        }
        return m1746k4(imageTransformOCollectionEffectiveData);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IImageTransformOCollectionEffectiveData
    public final IEffectEffectiveData get_Item(int i) {
        return this.f2488k4.get_Item(i);
    }

    public int hashCode() {
        return 23454;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IEffectEffectiveData> iterator() {
        return this.f2488k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IEffectEffectiveData> iteratorJava() {
        return this.f2488k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IEffectEffectiveData m1742k4(IEffectEffectiveData iEffectEffectiveData) {
        this.f2488k4.addItem(iEffectEffectiveData);
        return iEffectEffectiveData;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2488k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m1747x1() {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<IEffectEffectiveData> it = iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(((InterfaceC13788lo) it.next()).mo3874k4());
                c6765kp.m26780k4(';');
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final IEffectEffectiveData m1743k4(ImageTransformOperation imageTransformOperation) {
        IEffectEffectiveData effective = ((lft) imageTransformOperation).getEffective();
        this.f2488k4.addItem(effective);
        return effective;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m1744k4(C12009k4 c12009k4, boolean z) {
        if (size() <= 0 && !z) {
            return c12009k4;
        }
        tc4 tc4VarM71076k4 = tc4.m71076k4(c12009k4);
        c12009k4.dispose();
        IGenericEnumerator<IEffectEffectiveData> it = iterator();
        while (it.hasNext()) {
            try {
                tc4VarM71076k4 = ((InterfaceC13788lo) it.next()).mo3873k4(tc4VarM71076k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return tc4VarM71076k4.m71080c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1745k4() {
        this.f2488k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1746k4(ImageTransformOCollectionEffectiveData imageTransformOCollectionEffectiveData) {
        if (imageTransformOCollectionEffectiveData != null && this.f2488k4.size() == imageTransformOCollectionEffectiveData.f2488k4.size()) {
            for (int i = 0; i < this.f2488k4.size(); i++) {
                if (!this.f2488k4.get_Item(i).equals(imageTransformOCollectionEffectiveData.f2488k4.get_Item(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
