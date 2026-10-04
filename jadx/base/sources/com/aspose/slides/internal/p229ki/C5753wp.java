package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.wp */
/* JADX INFO: loaded from: classes.dex */
public final class C5753wp extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private boolean f15802du;

    public C5753wp(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15802du = false;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5753wp(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        boolean zM52685ar;
        while (true) {
            if (this.f15802du) {
                zM52685ar = this.f15832x1.m52685ar();
            } else {
                AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
                this.f15832x1 = abstractC10925duMo23142m9;
                if (abstractC10925duMo23142m9 == null) {
                    return null;
                }
                this.f15831to = 0;
                AbstractC10925du abstractC10925duDeepClone = abstractC10925duMo23142m9.deepClone();
                this.f15832x1 = abstractC10925duDeepClone;
                zM52685ar = abstractC10925duDeepClone.m52696qq();
            }
            this.f15802du = zM52685ar;
            if (this.f15802du && mo23355x1(this.f15832x1)) {
                this.f15831to++;
                return this.f15832x1;
            }
        }
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn
    /* JADX INFO: renamed from: x1 */
    public boolean mo23355x1(AbstractC10925du abstractC10925du) {
        if (abstractC10925du.mo21843dy().length() == 0) {
            return false;
        }
        if (m23368yj()) {
            return C14113y2.m67363du(m23365fa(), abstractC10925du.mo21867to());
        }
        return true;
    }

    private C5753wp(C5753wp c5753wp) {
        super((AbstractC5768yn) c5753wp);
        this.f15802du = c5753wp.f15802du;
    }
}
