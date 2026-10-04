package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2709e0 implements IGenericCloneable<C2709e0> {

    /* JADX INFO: renamed from: k4 */
    private String f8566k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2834nh f8567x1;

    private C2709e0(C2709e0 c2709e0) {
        if (c2709e0 == null) {
            throw new ArgumentNullException("src");
        }
        m12216k4(c2709e0.m12218x1());
        this.f8566k4 = c2709e0.m12215k4();
    }

    /* JADX INFO: renamed from: k4 */
    public String m12215k4() {
        return this.f8566k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C2709e0 cloneT() {
        return new C2709e0(this);
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC2834nh m12218x1() {
        return this.f8567x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12216k4(AbstractC2834nh abstractC2834nh) {
        if (this.f8567x1 != abstractC2834nh) {
            this.f8567x1 = abstractC2834nh != null ? abstractC2834nh.cloneT() : null;
        }
    }
}
