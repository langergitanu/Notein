package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.ss */
/* JADX INFO: loaded from: classes.dex */
public final class C5734ss extends AbstractC5729ri {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw f15770k4;

    /* JADX INFO: renamed from: to */
    private AbstractC7201m9 f15771to;

    /* JADX INFO: renamed from: x1 */
    private int f15772x1;

    public C5734ss(int i, AbstractC5728qw abstractC5728qw) {
        this.f15772x1 = i;
        this.f15770k4 = abstractC5728qw;
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC10925du m23323kk(AbstractC10929m9 abstractC10929m9) {
        AbstractC5728qw abstractC5728qw = this.f15770k4;
        if (abstractC5728qw == null) {
            return abstractC10929m9.mo21834kk();
        }
        abstractC5728qw.mo23148k4(abstractC10929m9);
        return this.f15770k4.mo23142m9();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return C5711kk.f15747k4[this.f15772x1];
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        C5734ss c5734ss = new C5734ss(this.f15772x1, AbstractC5728qw.m23314k4(this.f15770k4));
        c5734ss.f15771to = this.f15771to;
        return c5734ss;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        int iMo23139du;
        double d;
        AbstractC10925du abstractC10925duM23323kk;
        int i = this.f15772x1;
        if (i == 0) {
            iMo23139du = abstractC10929m9.mo23139du();
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        AbstractC10925du abstractC10925duM23323kk2 = m23323kk(abstractC10929m9);
                        if (abstractC10925duM23323kk2 != null) {
                            return abstractC10925duM23323kk2.mo21867to();
                        }
                    } else if (i == 5) {
                        AbstractC10925du abstractC10925duM23323kk3 = m23323kk(abstractC10929m9);
                        if (abstractC10925duM23323kk3 != null) {
                            return abstractC10925duM23323kk3.mo21841du();
                        }
                    } else if (i == 6 && (abstractC10925duM23323kk = m23323kk(abstractC10929m9)) != null) {
                        return abstractC10925duM23323kk.mo21846h4();
                    }
                    return C14113y2.f47374k4;
                }
                this.f15770k4.mo23148k4(abstractC10929m9);
                int i2 = 0;
                if (this.f15771to != null) {
                    while (true) {
                        AbstractC10925du abstractC10925duMo23142m9 = this.f15770k4.mo23142m9();
                        if (abstractC10925duMo23142m9 == null) {
                            break;
                        }
                        if (abstractC10925duMo23142m9.mo21857kk() != 6 || this.f15771to.mo23225k4(abstractC10925duMo23142m9)) {
                            i2++;
                        }
                    }
                } else {
                    while (this.f15770k4.mo23142m9() != null) {
                        i2++;
                    }
                }
                d = i2;
                return Double.valueOf(d);
            }
            iMo23139du = abstractC10929m9.mo21835to();
        }
        d = iMo23139du;
        return Double.valueOf(d);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15771to = abstractC7201m9.mo23223du() ? abstractC7201m9 : null;
        AbstractC5728qw abstractC5728qw = this.f15770k4;
        if (abstractC5728qw != null) {
            abstractC5728qw.mo23149k4(abstractC7201m9);
        }
    }
}
