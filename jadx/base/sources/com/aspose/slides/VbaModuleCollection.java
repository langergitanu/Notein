package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class VbaModuleCollection implements IVbaModuleCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IVbaModule> f3642k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final VbaProject f3643x1;

    public VbaModuleCollection(VbaProject vbaProject) {
        this.f3643x1 = vbaProject;
    }

    @Override // com.aspose.slides.IVbaModuleCollection
    public final IVbaModule addEmptyModule(final String str) {
        if (C14113y2.m67411k4(C14113y2.m67440x1(str))) {
            throw new ArgumentException("Name should not be an empty string", "name");
        }
        if (this.f3642k4.find(new AbstractC14041ai<IVbaModule>() { // from class: com.aspose.slides.VbaModuleCollection.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(IVbaModule iVbaModule) {
                return C14113y2.m67363du(iVbaModule.getName(), str);
            }
        }) != null) {
            throw new ArgumentException(C14113y2.m67402k4("Module with name {0} already exists", str));
        }
        VbaModule vbaModuleM3050k4 = this.f3643x1.m3050k4(str);
        this.f3642k4.addItem(vbaModuleM3050k4);
        return vbaModuleM3050k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3642k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IVbaModuleCollection
    public final IVbaModule get_Item(int i) {
        return this.f3642k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IVbaModule> iterator() {
        return this.f3642k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IVbaModule> iteratorJava() {
        return this.f3642k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3045k4(IVbaModule iVbaModule) {
        this.f3642k4.addItem(iVbaModule);
    }

    @Override // com.aspose.slides.IVbaModuleCollection
    public final void remove(IVbaModule iVbaModule) {
        if (this.f3642k4.containsItem(iVbaModule)) {
            this.f3643x1.m3055x1(iVbaModule.getName());
            this.f3642k4.removeItem(iVbaModule);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3642k4.size();
    }
}
