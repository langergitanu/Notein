package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.vw */
/* JADX INFO: loaded from: classes3.dex */
public final class C2941vw implements IGenericCloneable<C2941vw> {

    /* JADX INFO: renamed from: k4 */
    private final List<C2975y4> f8791k4 = new List<>();

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2941vw cloneT() {
        C2941vw c2941vw = new C2941vw();
        for (int i = 0; i < this.f8791k4.size(); i++) {
            c2941vw.m12585k4(m12584k4(i));
        }
        return c2941vw;
    }

    /* JADX INFO: renamed from: k4 */
    public C2975y4 m12584k4(int i) {
        return this.f8791k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12585k4(C2975y4 c2975y4) {
        if (c2975y4 == null) {
            throw new ArgumentNullException("dashStop");
        }
        this.f8791k4.addItem(c2975y4);
    }
}
