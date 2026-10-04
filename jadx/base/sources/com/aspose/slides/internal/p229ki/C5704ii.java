package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.ii */
/* JADX INFO: loaded from: classes.dex */
public class C5704ii extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private AbstractC10929m9 f15743du;

    public C5704ii(C5704ii c5704ii) {
        super((AbstractC5768yn) c5704ii);
        this.f15743du = C5722nv.f15764k4;
        this.f15743du = AbstractC5728qw.m23316x1(c5704ii.f15743du);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15743du = C5722nv.f15764k4;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public final AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        if (abstractC10925du != null && mo23355x1(abstractC10925du)) {
            AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
            if (abstractC10925duDeepClone.mo21857kk() != 2 && abstractC10925duDeepClone.mo21864ne()) {
                return this.f15829k4.mo23147k4(abstractC10925duDeepClone);
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        AbstractC10929m9 abstractC10929m9Mo21845h4;
        while (!this.f15743du.mo21770x1()) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
            if (!m23368yj()) {
                abstractC10929m9Mo21845h4 = abstractC10925duMo23142m9.mo21845h4(m23366ks());
            } else if (m23366ks() == 7) {
                this.f15743du = new C5692dy(abstractC10925duMo23142m9.mo21845h4(m23366ks()), m23365fa());
                this.f15831to = 0;
            } else {
                abstractC10929m9Mo21845h4 = abstractC10925duMo23142m9.mo21840du(m23365fa(), m23367up());
            }
            this.f15743du = abstractC10929m9Mo21845h4;
            this.f15831to = 0;
        }
        this.f15831to++;
        AbstractC10925du abstractC10925duMo21834kk = this.f15743du.mo21834kk();
        this.f15832x1 = abstractC10925duMo21834kk;
        return abstractC10925duMo21834kk;
    }

    public C5704ii(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
        this.f15743du = C5722nv.f15764k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5704ii(this);
    }
}
