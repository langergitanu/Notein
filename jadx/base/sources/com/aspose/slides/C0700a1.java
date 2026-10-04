package com.aspose.slides;

import com.aspose.slides.internal.p159h0.C4456lr;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4485xk;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.a1 */
/* JADX INFO: loaded from: classes3.dex */
class C0700a1 extends h4p {
    public C0700a1(C11896dy c11896dy, float f, float f2, int i, ilw ilwVar, C14093tq<C4459os> c14093tq) {
        super(c11896dy, f, f2, i, ilwVar, c14093tq);
    }

    @Override // com.aspose.slides.h4p
    /* JADX INFO: renamed from: k4 */
    public C4489zj mo3143k4(float f, float f2) {
        float fM7674x1 = this.f5417dy.m7674x1();
        if (!C14164n2.m67858x1(this.f5424m9)) {
            float f3 = 1.0f - fM7674x1;
            return new C4489zj(((m7019c5() - this.f5416du.m67297k4().m18285k4()) * f3) + (f * fM7674x1), this.f5416du.m67297k4().m18290x1() - m7029m9(), ((this.f5422kk - (this.f5426to / 2.0f)) * f3) + (f2 * fM7674x1));
        }
        float fM7028kk = m7028kk() - this.f5416du.m67297k4().m18285k4();
        float f4 = 1.0f - fM7674x1;
        float f5 = ((-(m7025jd() - this.f5416du.m67297k4().m18290x1())) * f4) - (f * fM7674x1);
        float f6 = this.f5422kk;
        float f7 = this.f5426to;
        return new C4489zj(fM7028kk, f5, ((((f6 * 2.0f) - f7) - f2) * fM7674x1) + ((f6 - (f7 / 2.0f)) * f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // com.aspose.slides.h4p
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4485xk mo3144x1() {
        boolean z;
        C14093tq c14093tq;
        C11896dy c11896dy = new C11896dy();
        if (C14164n2.m67855kk(this.f5424m9)) {
            c11896dy.m55542k4(new C12007ix(m7028kk(), 0.0f, m7021du(), C14116yg.m67480k4(this.f5426to)));
            if (this.f5416du.m67302x1()) {
                z = this.f5421k4;
                c14093tq = new C14093tq(new C4459os(this.f5416du.m67297k4().m18285k4(), this.f5422kk));
            } else if (C14164n2.m67858x1(this.f5424m9)) {
                c11896dy.m55542k4(new C12007ix(m7030to(), 0.0f, m7024h4(), C14116yg.m67480k4(this.f5426to)));
                z = this.f5421k4;
                c14093tq = new C14093tq(new C4459os(this.f5416du.m67297k4().m18290x1(), this.f5422kk));
            } else {
                z = this.f5421k4;
                c14093tq = new C14093tq();
            }
        }
        return C4456lr.m18248k4(c11896dy, z, c14093tq);
    }

    @Override // com.aspose.slides.h4p
    /* JADX INFO: renamed from: x1 */
    public C4489zj mo3145x1(float f, float f2) {
        float fM7673k4 = this.f5417dy.m7673k4();
        if (!C14164n2.m67858x1(this.f5424m9)) {
            float f3 = 1.0f - fM7673k4;
            return new C4489zj(((m7019c5() - this.f5416du.m67297k4().m18285k4()) * f3) + (f * fM7673k4), this.f5416du.m67297k4().m18290x1() - m7030to(), ((this.f5422kk - (this.f5426to / 2.0f)) * f3) + (f2 * fM7673k4));
        }
        float fM7022dy = m7022dy() - this.f5416du.m67297k4().m18285k4();
        float f4 = 1.0f - fM7673k4;
        float f5 = ((-(m7025jd() - this.f5416du.m67297k4().m18290x1())) * f4) - (f * fM7673k4);
        float f6 = this.f5422kk;
        float f7 = this.f5426to;
        return new C4489zj(fM7022dy, f5, ((((f6 * 2.0f) - f7) - f2) * fM7673k4) + ((f6 - (f7 / 2.0f)) * f4));
    }
}
