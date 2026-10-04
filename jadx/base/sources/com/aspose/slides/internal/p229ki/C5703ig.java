package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.ig */
/* JADX INFO: loaded from: classes.dex */
public final class C5703ig extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private boolean f15742du;

    private C5703ig(C5703ig c5703ig) {
        super((AbstractC5768yn) c5703ig);
        this.f15742du = false;
        this.f15742du = c5703ig.f15742du;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15742du = false;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        if (abstractC10925du == null || abstractC10925du.mo21857kk() != 2 || !mo23355x1(abstractC10925du)) {
            return null;
        }
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        if (abstractC10925duDeepClone.mo21864ne()) {
            return this.f15829k4.mo23147k4(abstractC10925duDeepClone);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        boolean zMo21861ks;
        while (true) {
            if (this.f15742du) {
                zMo21861ks = this.f15832x1.mo21861ks();
            } else {
                AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
                this.f15832x1 = abstractC10925duMo23142m9;
                if (abstractC10925duMo23142m9 == null) {
                    return null;
                }
                this.f15831to = 0;
                AbstractC10925du abstractC10925duDeepClone = abstractC10925duMo23142m9.deepClone();
                this.f15832x1 = abstractC10925duDeepClone;
                zMo21861ks = abstractC10925duDeepClone.mo21879yj();
            }
            this.f15742du = zMo21861ks;
            if (this.f15742du && mo23355x1(this.f15832x1)) {
                this.f15831to++;
                return this.f15832x1;
            }
        }
    }

    public C5703ig(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
        this.f15742du = false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5703ig(this);
    }
}
