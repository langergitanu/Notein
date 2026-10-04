package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.he */
/* JADX INFO: loaded from: classes.dex */
public final class C5702he extends AbstractC5679b1 {

    /* JADX INFO: renamed from: h4 */
    private boolean f15741h4;

    private C5702he(C5702he c5702he) {
        super(c5702he);
        this.f15741h4 = c5702he.f15741h4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5679b1, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return super.mo23151dy() | 8;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5702he(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5679b1, com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return (((AbstractC5679b1) this).f15687du.size() - this.f38011kk) + 1;
    }

    public C5702he(AbstractC5728qw abstractC5728qw, String str, String str2, int i, boolean z) {
        super(abstractC5728qw, str, str2, i);
        this.f15741h4 = z;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5679b1, com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        super.mo23148k4(abstractC10929m9);
        AbstractC10925du abstractC10925duDeepClone = null;
        while (true) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return this;
            }
            if (!this.f15741h4 || !mo23355x1(abstractC10925duMo23142m9) || m23319k4(((AbstractC5679b1) this).f15687du, abstractC10925duMo23142m9)) {
                if (abstractC10925duDeepClone == null || !abstractC10925duDeepClone.mo21855k4(abstractC10925duMo23142m9)) {
                    abstractC10925duDeepClone = abstractC10925duMo23142m9.deepClone();
                }
                while (abstractC10925duDeepClone.mo21864ne() && (!mo23355x1(abstractC10925duDeepClone) || m23319k4(((AbstractC5679b1) this).f15687du, abstractC10925duDeepClone))) {
                }
            }
        }
    }
}
