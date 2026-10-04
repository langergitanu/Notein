package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.qn */
/* JADX INFO: loaded from: classes.dex */
public class C5726qn extends AbstractC5750vw {

    /* JADX INFO: renamed from: m9 */
    private AbstractC10929m9 f15765m9;

    public C5726qn(C5726qn c5726qn) {
        super(c5726qn);
        this.f15765m9 = AbstractC5728qw.m23316x1(c5726qn.f15765m9);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15765m9 = null;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5726qn(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        AbstractC10929m9 abstractC10929m9Mo21852k4;
        while (true) {
            if (this.f15765m9 == null) {
                this.f15831to = 0;
                AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
                if (abstractC10925duMo23142m9 == null) {
                    return null;
                }
                if (!m23368yj()) {
                    abstractC10929m9Mo21852k4 = abstractC10925duMo23142m9.mo21852k4(m23366ks(), ((AbstractC5750vw) this).f15800du);
                } else if (m23366ks() == 7) {
                    this.f15765m9 = new C5692dy(abstractC10925duMo23142m9.mo21852k4(m23366ks(), ((AbstractC5750vw) this).f15800du), m23365fa());
                } else {
                    abstractC10929m9Mo21852k4 = abstractC10925duMo23142m9.mo21853k4(m23365fa(), m23367up(), ((AbstractC5750vw) this).f15800du);
                }
                this.f15765m9 = abstractC10929m9Mo21852k4;
            }
            if (this.f15765m9.mo21770x1()) {
                this.f15831to++;
                AbstractC10925du abstractC10925duMo21834kk = this.f15765m9.mo21834kk();
                this.f15832x1 = abstractC10925duMo21834kk;
                return abstractC10925duMo21834kk;
            }
            this.f15765m9 = null;
        }
    }

    public C5726qn(AbstractC5728qw abstractC5728qw, String str, String str2, int i, boolean z, boolean z2) {
        super(abstractC5728qw, str, str2, i, z, z2);
    }
}
