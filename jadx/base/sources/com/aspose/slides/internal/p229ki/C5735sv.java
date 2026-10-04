package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.sv */
/* JADX INFO: loaded from: classes.dex */
public final class C5735sv extends AbstractC5772zm {

    /* JADX INFO: renamed from: to */
    private AbstractC5728qw f15773to;

    public C5735sv(AbstractC5728qw abstractC5728qw, AbstractC5728qw abstractC5728qw2) {
        super(abstractC5728qw);
        this.f15773to = abstractC5728qw2;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duMo23147k4;
        AbstractC10925du abstractC10925duMo23142m9;
        AbstractC10925du abstractC10925duMo23147k42 = this.f15773to.mo23147k4(abstractC10925du);
        if (abstractC10925duMo23147k42 == null || (abstractC10925duMo23147k4 = this.f15840k4.mo23147k4(abstractC10925duMo23147k42)) == null) {
            return null;
        }
        mo23148k4((AbstractC10929m9) new C5720na(abstractC10925duMo23147k4.deepClone(), true));
        do {
            abstractC10925duMo23142m9 = mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
        } while (!abstractC10925duMo23142m9.mo21876x1(abstractC10925du));
        return abstractC10925duMo23147k4;
    }

    private C5735sv(C5735sv c5735sv) {
        super((AbstractC5772zm) c5735sv);
        this.f15773to = AbstractC5728qw.m23314k4(c5735sv.f15773to);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5735sv(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5772zm, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        super.mo23148k4(abstractC10929m9);
        while (this.f15840k4.mo23142m9() != null) {
            this.f15773to.mo23148k4((AbstractC10929m9) this.f15840k4);
            while (true) {
                AbstractC10925du abstractC10925duMo23142m9 = this.f15773to.mo23142m9();
                if (abstractC10925duMo23142m9 != null) {
                    m23319k4(this.f15841x1, abstractC10925duMo23142m9);
                }
            }
        }
        return this;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5772zm, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        super.mo23149k4(abstractC7201m9);
        this.f15773to.mo23149k4(abstractC7201m9);
    }
}
