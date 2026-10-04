package com.aspose.slides.internal.p447up;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5779c5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p517y2.C12786x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11530du extends AbstractC11535k4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5803to f39015k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC5803to f39016kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5803to f39017x1;

    public C11530du(AbstractC5803to abstractC5803to, AbstractC5803to abstractC5803to2, AbstractC5803to abstractC5803to3) {
        super((short) 23);
        this.f39015k4 = abstractC5803to;
        this.f39017x1 = abstractC5803to2;
        this.f39016kk = abstractC5803to3;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("counters(");
        c6765kpOooO00o.m26792k4(this.f39015k4.mo23706x1());
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26792k4(this.f39016kk.mo23706x1());
        if (this.f39017x1 != null) {
            c6765kpOooO00o.m26792k4(", ");
            c6765kpOooO00o.m26792k4(this.f39017x1.mo23706x1());
        }
        c6765kpOooO00o.m26792k4(")");
        return c6765kpOooO00o.toString();
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: kk */
    public C5779c5 mo23703kk() {
        String strMo23706x1 = this.f39015k4.mo23706x1();
        AbstractC5803to abstractC5803to = this.f39017x1;
        return new C5779c5(strMo23706x1, abstractC5803to != null ? abstractC5803to.mo23706x1() : null, this.f39016kk.mo23706x1());
    }
}
