package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.p3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2851p3 implements IGenericCloneable<C2851p3> {

    /* JADX INFO: renamed from: kk */
    private C2934v4 f8707kk;

    /* JADX INFO: renamed from: k4 */
    private C2971xw f8706k4 = new C2971xw();

    /* JADX INFO: renamed from: x1 */
    private C2676bx f8708x1 = new C2676bx();

    public C2851p3() {
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2851p3 cloneT() {
        return new C2851p3(this);
    }

    private C2851p3(C2851p3 c2851p3) {
        m12461k4(c2851p3.f8706k4);
        m12459k4(c2851p3.f8708x1);
        m12460k4(c2851p3.f8707kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12459k4(C2676bx c2676bx) {
        if (c2676bx == null) {
            throw new ArgumentNullException("value");
        }
        if (this.f8708x1 == c2676bx) {
            return;
        }
        this.f8708x1 = c2676bx.cloneT();
    }

    /* JADX INFO: renamed from: k4 */
    public void m12460k4(C2934v4 c2934v4) {
        if (this.f8707kk != c2934v4) {
            this.f8707kk = c2934v4 != null ? c2934v4.cloneT() : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12461k4(C2971xw c2971xw) {
        if (c2971xw == null) {
            throw new ArgumentNullException("value");
        }
        if (this.f8706k4 == c2971xw) {
            return;
        }
        this.f8706k4 = c2971xw.cloneT();
    }
}
