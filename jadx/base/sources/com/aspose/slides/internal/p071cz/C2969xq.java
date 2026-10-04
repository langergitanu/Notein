package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.xq */
/* JADX INFO: loaded from: classes3.dex */
public final class C2969xq extends AbstractC2935v6 {

    /* JADX INFO: renamed from: k4 */
    private C2654ae f8805k4;

    /* JADX INFO: renamed from: x1 */
    private int f8806x1;

    public C2969xq() {
        super(1);
        m12615x1(new C2654ae(50.0d, 50.0d, 50.0d, 50.0d));
        m12614x1(3);
    }

    /* JADX INFO: renamed from: h4 */
    public final C2654ae m12612h4() {
        return this.f8805k4;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2718ew, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4 */
    public AbstractC2718ew cloneT() {
        C2969xq c2969xq = new C2969xq(m12612h4().cloneT(), m12613m9());
        m12576k4(c2969xq);
        return c2969xq;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m12613m9() {
        return this.f8806x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12614x1(int i) {
        this.f8806x1 = i;
    }

    public C2969xq(C2654ae c2654ae, int i) {
        super(1);
        m12615x1(c2654ae);
        m12614x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12615x1(C2654ae c2654ae) {
        if (c2654ae == null) {
            throw new ArgumentNullException("value");
        }
        this.f8805k4 = c2654ae;
    }
}
