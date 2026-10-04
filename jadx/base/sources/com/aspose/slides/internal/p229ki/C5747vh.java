package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.vh */
/* JADX INFO: loaded from: classes.dex */
public final class C5747vh extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private AbstractC10929m9 f15797du;

    /* JADX INFO: renamed from: h4 */
    private C5689dc<AbstractC10925du> f15798h4;

    public C5747vh(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
        this.f15798h4 = new C5689dc<>();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15797du = null;
        this.f15798h4.clear();
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return super.mo23151dy() | 8;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5747vh(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        if (this.f15797du == null) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
            AbstractC10925du abstractC10925duDeepClone = abstractC10925duMo23142m9.deepClone();
            do {
                abstractC10925duDeepClone.mo21855k4(abstractC10925duMo23142m9);
                abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            } while (abstractC10925duMo23142m9 != null);
            if (abstractC10925duDeepClone.mo21857kk() == 2 || abstractC10925duDeepClone.mo21857kk() == 3) {
                abstractC10925duDeepClone.mo21864ne();
            }
            do {
                this.f15798h4.m23229k4(abstractC10925duDeepClone.deepClone());
            } while (abstractC10925duDeepClone.mo21864ne());
            this.f15797du = abstractC10925duDeepClone.mo21852k4(9, true);
        }
        while (this.f15797du.mo21770x1()) {
            AbstractC10925du abstractC10925duMo21834kk = this.f15797du.mo21834kk();
            this.f15832x1 = abstractC10925duMo21834kk;
            if (abstractC10925duMo21834kk.mo21876x1(this.f15798h4.m23231x1())) {
                this.f15798h4.m23228k4();
                if (this.f15798h4.size() == 0) {
                    this.f15832x1 = null;
                    this.f15797du = null;
                    return null;
                }
            } else if (mo23355x1(this.f15832x1)) {
                this.f15831to++;
                return this.f15832x1;
            }
        }
        C6005k4.m24259k4("Algorithm error: we missed the centinel node");
        return null;
    }

    private C5747vh(C5747vh c5747vh) {
        super((AbstractC5768yn) c5747vh);
        this.f15797du = AbstractC5728qw.m23316x1(c5747vh.f15797du);
        this.f15798h4 = c5747vh.f15798h4.m23230kk();
    }
}
