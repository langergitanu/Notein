package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.yw */
/* JADX INFO: loaded from: classes.dex */
public final class C5770yw extends C5704ii {

    /* JADX INFO: renamed from: du */
    private AbstractC10925du f15833du;

    /* JADX INFO: renamed from: dy */
    private boolean f15834dy;

    /* JADX INFO: renamed from: h4 */
    private C5689dc<AbstractC10925du> f15835h4;

    /* JADX INFO: renamed from: m9 */
    private C5689dc<Integer> f15836m9;

    public C5770yw(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
        this.f15833du = null;
        this.f15835h4 = new C5689dc<>();
        this.f15836m9 = new C5689dc<>();
        this.f15834dy = true;
    }

    /* JADX INFO: renamed from: rv */
    private boolean m23369rv() {
        AbstractC10925du abstractC10925duM23370x6 = m23370x6();
        this.f15833du = abstractC10925duM23370x6;
        if (abstractC10925duM23370x6 != null && AbstractC5728qw.m23313k4(this.f15832x1, abstractC10925duM23370x6) == 1) {
            this.f15835h4.m23229k4(this.f15832x1);
            this.f15836m9.m23229k4(Integer.valueOf(this.f15831to));
            AbstractC10925du abstractC10925du = this.f15833du;
            this.f15832x1 = abstractC10925du;
            this.f15833du = null;
            if (!abstractC10925du.mo21878x6()) {
                return false;
            }
            this.f15831to = 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: x6 */
    private AbstractC10925du m23370x6() {
        AbstractC10925du abstractC10925du = this.f15833du;
        if (abstractC10925du != null) {
            this.f15833du = null;
            return abstractC10925du;
        }
        AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
        return abstractC10925duMo23142m9 != null ? abstractC10925duMo23142m9.deepClone() : abstractC10925duMo23142m9;
    }

    @Override // com.aspose.slides.internal.p229ki.C5704ii, com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15833du = null;
        this.f15835h4.clear();
        this.f15836m9.clear();
        this.f15834dy = true;
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p229ki.C5704ii, com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5770yw(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0000 A[SYNTHETIC] */
    @Override // com.aspose.slides.internal.p229ki.C5704ii, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC10925du mo23142m9() {
        while (true) {
            if (this.f15834dy) {
                if (this.f15835h4.size() == 0) {
                    AbstractC10925du abstractC10925duM23370x6 = m23370x6();
                    this.f15832x1 = abstractC10925duM23370x6;
                    if (abstractC10925duM23370x6 == null) {
                        return null;
                    }
                    if (abstractC10925duM23370x6.mo21878x6()) {
                        this.f15831to = 0;
                        this.f15834dy = false;
                    } else {
                        continue;
                    }
                } else {
                    this.f15832x1 = this.f15835h4.m23228k4();
                    this.f15831to = this.f15836m9.m23228k4().intValue();
                    if (m23369rv()) {
                        this.f15834dy = false;
                    } else {
                        continue;
                    }
                }
                if (!mo23355x1(this.f15832x1)) {
                    this.f15831to++;
                    return this.f15832x1;
                }
            } else if (!this.f15832x1.mo21865rv() || !m23369rv()) {
                this.f15834dy = true;
            } else if (!mo23355x1(this.f15832x1)) {
            }
        }
    }

    private C5770yw(C5770yw c5770yw) {
        super(c5770yw);
        this.f15833du = null;
        this.f15833du = AbstractC5728qw.m23315kk(c5770yw.f15833du);
        this.f15835h4 = c5770yw.f15835h4.m23230kk();
        this.f15836m9 = c5770yw.f15836m9.m23230kk();
        this.f15834dy = c5770yw.f15834dy;
    }
}
