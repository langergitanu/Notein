package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.lm */
/* JADX INFO: loaded from: classes.dex */
public final class C5714lm extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private AbstractC10925du f15754du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC10929m9 f15755h4;

    private C5714lm(C5714lm c5714lm) {
        super((AbstractC5768yn) c5714lm);
        this.f15754du = AbstractC5728qw.m23315kk(c5714lm.f15754du);
        this.f15755h4 = AbstractC5728qw.m23316x1(c5714lm.f15755h4);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15755h4 = null;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5714lm(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        AbstractC10925du abstractC10925duDeepClone;
        AbstractC10925du abstractC10925duMo23142m9;
        if (this.f15755h4 == null) {
            AbstractC10925du abstractC10925duMo23142m92 = this.f15829k4.mo23142m9();
            this.f15754du = abstractC10925duMo23142m92;
            if (abstractC10925duMo23142m92 == null) {
                return null;
            }
            do {
                abstractC10925duDeepClone = this.f15754du.deepClone();
                abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
                this.f15754du = abstractC10925duMo23142m9;
            } while (abstractC10925duDeepClone.mo21859kk(abstractC10925duMo23142m9));
            this.f15754du = abstractC10925duDeepClone;
            this.f15755h4 = C5722nv.f15764k4;
        }
        while (true) {
            boolean z = true;
            if (this.f15755h4.mo21770x1()) {
                this.f15831to++;
                AbstractC10925du abstractC10925duMo21834kk = this.f15755h4.mo21834kk();
                this.f15832x1 = abstractC10925duMo21834kk;
                return abstractC10925duMo21834kk;
            }
            if (this.f15754du.mo21857kk() == 2 || this.f15754du.mo21857kk() == 3) {
                this.f15754du.mo21864ne();
                z = false;
            } else {
                while (!this.f15754du.mo21865rv()) {
                    if (!this.f15754du.mo21864ne()) {
                        return null;
                    }
                }
            }
            if (m23368yj()) {
                this.f15755h4 = this.f15754du.mo21853k4(m23365fa(), m23367up(), z);
            } else {
                this.f15755h4 = this.f15754du.mo21852k4(m23366ks(), z);
            }
        }
    }

    public C5714lm(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
    }
}
