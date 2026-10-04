package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.sq */
/* JADX INFO: loaded from: classes.dex */
public final class C5733sq extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    private AbstractC5728qw f15768du;

    /* JADX INFO: renamed from: h4 */
    private boolean f15769h4;

    public C5733sq(AbstractC5728qw abstractC5728qw, AbstractC5728qw abstractC5728qw2, boolean z) {
        super(abstractC5728qw);
        this.f15768du = abstractC5728qw2;
        this.f15769h4 = z;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15768du.mo23138c5();
        super.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return (this.f15829k4.mo23151dy() & 24) | 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104 A[SYNTHETIC] */
    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duMo23147k4;
        AbstractC10925du abstractC10925duMo23142m9;
        if (abstractC10925du != null && (abstractC10925duMo23147k4 = this.f15829k4.mo23147k4(abstractC10925du)) != null) {
            int iMo23141h4 = this.f15768du.mo23141h4();
            if (iMo23141h4 != 0) {
                if (iMo23141h4 == 1) {
                    if (this.f15769h4) {
                        if (((String) this.f15768du.mo23148k4((AbstractC10929m9) new C5720na(abstractC10925du, true))).length() == 0) {
                            return null;
                        }
                    }
                    return abstractC10925duMo23147k4;
                }
                if (iMo23141h4 != 2) {
                    if (iMo23141h4 == 3) {
                        this.f15768du.mo23148k4((AbstractC10929m9) new C5720na(abstractC10925du, true));
                        if (this.f15768du.mo23142m9() == null) {
                            return null;
                        }
                    } else if (iMo23141h4 != 4) {
                        return null;
                    }
                } else if (!this.f15769h4) {
                    mo23148k4((AbstractC10929m9) new C5720na(abstractC10925duMo23147k4, true));
                    do {
                        abstractC10925duMo23142m9 = mo23142m9();
                        if (abstractC10925duMo23142m9 == null) {
                        }
                    } while (!abstractC10925duMo23142m9.mo21876x1(abstractC10925du));
                } else if (!((Boolean) C7019kk.m27464to(this.f15768du.mo23148k4((AbstractC10929m9) new C5720na(abstractC10925du, true)), Boolean.TYPE)).booleanValue()) {
                    return null;
                }
                return abstractC10925duMo23147k4;
            }
            C5695f9 c5695f9 = (C5695f9) C7019kk.m27452k4((Object) this.f15768du, C5695f9.class);
            if (c5695f9 != null) {
                double dDoubleValue = ((Double) C7019kk.m27464to(c5695f9.f15710k4, Double.TYPE)).doubleValue();
                C5704ii c5704ii = (C5704ii) C7019kk.m27452k4((Object) this.f15829k4, C5704ii.class);
                int i = 0;
                if (c5704ii != null) {
                    AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
                    abstractC10925duDeepClone.mo21864ne();
                    abstractC10925duDeepClone.mo21878x6();
                    do {
                        if (c5704ii.mo23355x1(abstractC10925duDeepClone)) {
                            i++;
                            if (abstractC10925du.mo21876x1(abstractC10925duDeepClone)) {
                                if (dDoubleValue != i) {
                                    return null;
                                }
                            }
                        }
                    } while (abstractC10925duDeepClone.mo21865rv());
                    return null;
                }
                C5703ig c5703ig = (C5703ig) C7019kk.m27452k4((Object) this.f15829k4, C5703ig.class);
                if (c5703ig != null) {
                    AbstractC10925du abstractC10925duDeepClone2 = abstractC10925du.deepClone();
                    abstractC10925duDeepClone2.mo21864ne();
                    abstractC10925duDeepClone2.mo21879yj();
                    do {
                        if (c5703ig.mo23355x1(abstractC10925duDeepClone2)) {
                            i++;
                            if (abstractC10925du.mo21876x1(abstractC10925duDeepClone2)) {
                                if (dDoubleValue != i) {
                                    return null;
                                }
                            }
                        }
                    } while (abstractC10925duDeepClone2.mo21861ks());
                    return null;
                }
                return abstractC10925duMo23147k4;
            }
            mo23148k4((AbstractC10929m9) new C5720na(abstractC10925duMo23147k4, true));
            do {
                abstractC10925duMo23142m9 = mo23142m9();
                if (abstractC10925duMo23142m9 == null) {
                }
            } while (!abstractC10925duMo23142m9.mo21876x1(abstractC10925du));
            return abstractC10925duMo23147k4;
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        do {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            this.f15832x1 = abstractC10925duMo23142m9;
            if (abstractC10925duMo23142m9 == null) {
                return null;
            }
        } while (!m23322x6());
        this.f15831to++;
        return this.f15832x1;
    }

    /* JADX INFO: renamed from: rv */
    public final AbstractC5728qw m23321rv() {
        return this.f15768du;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m23322x6() {
        Object objMo23148k4 = this.f15768du.mo23148k4((AbstractC10929m9) this.f15829k4);
        if (C7019kk.m27469x1(objMo23148k4, AbstractC10929m9.class)) {
            return this.f15768du.mo23142m9() != null;
        }
        if (C7019kk.m27469x1(objMo23148k4, String.class)) {
            return ((String) objMo23148k4).length() != 0;
        }
        if (C7019kk.m27469x1(objMo23148k4, Double.class)) {
            return ((Double) C7019kk.m27464to(objMo23148k4, Double.TYPE)).doubleValue() == ((double) this.f15829k4.mo21835to());
        }
        if (C7019kk.m27469x1(objMo23148k4, Boolean.class)) {
            return ((Boolean) C7019kk.m27464to(objMo23148k4, Boolean.TYPE)).booleanValue();
        }
        return true;
    }

    private C5733sq(C5733sq c5733sq) {
        super((AbstractC5768yn) c5733sq);
        this.f15768du = AbstractC5728qw.m23314k4(c5733sq.f15768du);
        this.f15769h4 = c5733sq.f15769h4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5733sq(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        C5751w6 c5751w6;
        super.mo23149k4(abstractC7201m9);
        this.f15768du.mo23149k4(abstractC7201m9);
        if (this.f15768du.mo23141h4() == 0 || this.f15768du.mo23141h4() == 5 || !this.f15769h4 || (c5751w6 = (C5751w6) C7019kk.m27452k4((Object) this.f15829k4, C5751w6.class)) == null) {
            return;
        }
        this.f15829k4 = c5751w6.f15840k4;
    }
}
