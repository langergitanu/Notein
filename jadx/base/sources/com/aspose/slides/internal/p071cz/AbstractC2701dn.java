package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.dn */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2701dn implements IGenericCloneable<AbstractC2701dn> {

    /* JADX INFO: renamed from: k4 */
    private C2778ji f8559k4;

    public AbstractC2701dn() {
    }

    /* JADX INFO: renamed from: k4 */
    public void m12204k4(C2778ji c2778ji) {
        if (c2778ji == this.f8559k4) {
            return;
        }
        this.f8559k4 = c2778ji != null ? c2778ji.cloneT() : null;
    }

    /* JADX INFO: renamed from: to */
    public C2778ji m12205to() {
        return this.f8559k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC2701dn cloneT();

    public AbstractC2701dn(AbstractC2701dn abstractC2701dn) {
        m12204k4(abstractC2701dn.m12205to());
    }
}
