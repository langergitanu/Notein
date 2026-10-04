package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.xw */
/* JADX INFO: loaded from: classes.dex */
public final class C5761xw extends AbstractC5679b1 {
    public C5761xw(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5761xw(this);
    }

    private C5761xw(C5761xw c5761xw) {
        super(c5761xw);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5679b1, com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        super.mo23148k4(abstractC10929m9);
        while (true) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return this;
            }
            AbstractC10925du abstractC10925duDeepClone = abstractC10925duMo23142m9.deepClone();
            if (abstractC10925duDeepClone.mo21864ne() && mo23355x1(abstractC10925duDeepClone)) {
                m23319k4(((AbstractC5679b1) this).f15687du, abstractC10925duDeepClone);
            }
        }
    }
}
