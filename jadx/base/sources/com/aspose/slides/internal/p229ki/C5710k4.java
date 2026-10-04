package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5710k4 extends C5763y4 {
    public C5710k4() {
    }

    @Override // com.aspose.slides.internal.p229ki.C5763y4, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        if (abstractC10925du == null || abstractC10925du.mo21857kk() != 0) {
            return null;
        }
        return abstractC10925du;
    }

    private C5710k4(C5710k4 c5710k4) {
        super(c5710k4);
    }

    @Override // com.aspose.slides.internal.p229ki.C5763y4, com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5710k4(this);
    }

    @Override // com.aspose.slides.internal.p229ki.C5763y4, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        AbstractC10925du abstractC10925duDeepClone = abstractC10929m9.mo21834kk().deepClone();
        this.f15818k4 = abstractC10925duDeepClone;
        abstractC10925duDeepClone.mo21848ix();
        this.f38011kk = 0;
        return this;
    }
}
