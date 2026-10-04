package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.u5 */
/* JADX INFO: loaded from: classes.dex */
public final class C5742u5 extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private C5689dc<AbstractC10925du> f15794du;

    /* JADX INFO: renamed from: h4 */
    private List<AbstractC10925du> f15795h4;

    /* JADX INFO: renamed from: m9 */
    private AbstractC10925du f15796m9;

    public C5742u5(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
        this.f15794du = new C5689dc<>();
        this.f15795h4 = new List<>();
    }

    /* JADX INFO: renamed from: rv */
    private AbstractC10925du m23350rv() {
        AbstractC10925du abstractC10925duMo23142m9;
        do {
            abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
        } while (m23351to(abstractC10925duMo23142m9));
        return abstractC10925duMo23142m9.deepClone();
    }

    /* JADX INFO: renamed from: to */
    private boolean m23351to(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        abstractC10925duDeepClone.mo21864ne();
        for (int i = 0; i < this.f15795h4.size(); i++) {
            if (abstractC10925duDeepClone.mo21876x1(this.f15795h4.get_Item(i))) {
                return true;
            }
        }
        this.f15795h4.addItem(abstractC10925duDeepClone);
        return false;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15794du.clear();
        this.f15795h4.clear();
        this.f15796m9 = null;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5742u5(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        while (true) {
            if (this.f15832x1 == null) {
                if (this.f15796m9 == null) {
                    this.f15796m9 = m23350rv();
                }
                if (this.f15794du.size() == 0) {
                    AbstractC10925du abstractC10925du = this.f15796m9;
                    if (abstractC10925du == null) {
                        return null;
                    }
                    this.f15832x1 = abstractC10925du;
                    this.f15796m9 = m23350rv();
                } else {
                    this.f15832x1 = this.f15794du.m23228k4();
                }
            }
            while (this.f15832x1.mo21859kk(this.f15796m9)) {
                this.f15794du.m23229k4(this.f15832x1);
                this.f15832x1 = this.f15796m9;
                AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
                this.f15796m9 = abstractC10925duMo23142m9;
                if (abstractC10925duMo23142m9 != null) {
                    this.f15796m9 = abstractC10925duMo23142m9.deepClone();
                }
            }
            while (this.f15832x1.mo21865rv()) {
                if (mo23355x1(this.f15832x1)) {
                    this.f15831to++;
                    return this.f15832x1;
                }
            }
            this.f15832x1 = null;
        }
    }

    private C5742u5(C5742u5 c5742u5) {
        super((AbstractC5768yn) c5742u5);
        this.f15794du = c5742u5.f15794du.m23230kk();
        this.f15795h4 = new List<>(c5742u5.f15795h4);
        this.f15796m9 = AbstractC5728qw.m23315kk(c5742u5.f15796m9);
    }
}
