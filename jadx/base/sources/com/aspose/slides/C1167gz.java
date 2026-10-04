package com.aspose.slides;

import com.aspose.slides.internal.p159h0.C4456lr;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4485xk;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.gz */
/* JADX INFO: loaded from: classes3.dex */
class C1167gz extends h4p {

    /* JADX INFO: renamed from: c5 */
    private boolean f5369c5;

    public C1167gz(C11896dy c11896dy, float f, float f2, int i, ilw ilwVar, C14093tq<C4459os> c14093tq) {
        super(c11896dy, f, f2, i, ilwVar, c14093tq);
        this.f5369c5 = true;
    }

    @Override // com.aspose.slides.h4p
    /* JADX INFO: renamed from: k4 */
    public C4476v4 mo6948k4() throws Throwable {
        if (this.f5369c5) {
            return new C4476v4(this.f5428x1, this.f5422kk, this.f5426to, 6, this.f5419h4, null, false, this.f5421k4, this.f5416du.Clone());
        }
        C4476v4 c4476v4 = new C4476v4();
        C4485xk c4485xkMo3144x1 = mo3144x1();
        m7027k4(c4476v4, c4485xkMo3144x1);
        m7031x1(c4476v4, c4485xkMo3144x1);
        return c4476v4;
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
            c11896dy.m55578x1(new C12007ix(m7028kk(), 0.0f, m7021du(), C14116yg.m67480k4(this.f5426to)));
            if (this.f5416du.m67302x1()) {
                z = this.f5421k4;
                c14093tq = new C14093tq(new C4459os(this.f5416du.m67297k4().m18285k4(), this.f5422kk));
            } else if (C14164n2.m67858x1(this.f5424m9)) {
                c11896dy.m55578x1(new C12007ix(m7030to(), 0.0f, m7024h4(), C14116yg.m67480k4(this.f5426to)));
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
    /* JADX INFO: renamed from: k4 */
    public C4489zj mo3143k4(float f, float f2) {
        return C14164n2.m67858x1(this.f5424m9) ? new C4489zj(m7028kk() - this.f5416du.m67297k4().m18285k4(), -f, ((this.f5422kk * 2.0f) - this.f5426to) - f2) : new C4489zj(f, this.f5416du.m67297k4().m18290x1() - m7029m9(), f2);
    }

    @Override // com.aspose.slides.h4p
    /* JADX INFO: renamed from: x1 */
    public C4489zj mo3145x1(float f, float f2) {
        return C14164n2.m67858x1(this.f5424m9) ? new C4489zj(m7022dy() - this.f5416du.m67297k4().m18285k4(), -f, ((this.f5422kk * 2.0f) - this.f5426to) - f2) : new C4489zj(f, this.f5416du.m67297k4().m18290x1() - m7030to(), f2);
    }
}
