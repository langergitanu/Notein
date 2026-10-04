package com.aspose.slides.internal.p055c4;

import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.AbstractC6155lr;
import com.aspose.slides.internal.p253lm.AbstractC6172qq;
import com.aspose.slides.internal.p253lm.C6116bs;
import com.aspose.slides.internal.p253lm.C6126dc;
import com.aspose.slides.internal.p253lm.C6198wp;
import com.aspose.slides.internal.p253lm.InterfaceC6173qw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.c4.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1947m9 extends AbstractC6172qq {

    /* JADX INFO: renamed from: du */
    private C6116bs f6922du;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f6923h4;

    /* JADX INFO: renamed from: to */
    private final AbstractC1949x1 f6924to;

    public C1947m9(InterfaceC6173qw interfaceC6173qw, String str, AbstractC1949x1 abstractC1949x1) {
        super(interfaceC6173qw);
        m25137m9(str);
        this.f6924to = abstractC1949x1;
        C6116bs c6116bsM24760k4 = interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this);
        this.f6922du = c6116bsM24760k4;
        m25174k4("prototype", c6116bsM24760k4, 7);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m10091h4(String str) {
        this.f6923h4 = new C1944h4(m24965ck(), str, m25138rv(), this.f6924to);
        m25138rv().m25174k4(str, this.f6923h4, 7);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC6123ca m10092jd() {
        return new C6116bs(m25138rv());
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m10095x1(Object obj) {
        return new C6116bs(obj, m25138rv());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10094k4(String str, int i) {
        C6126dc c6126dc = new C6126dc(m24965ck(), this, str);
        if ((i & 1) == 1) {
            c6126dc.m24801k4((C6198wp) new C1944h4(m24965ck(), C14113y2.m67408k4("get_", str), m25138rv(), this.f6924to));
        }
        if ((i & 2) == 2) {
            c6126dc.m24804x1(new C1944h4(m24965ck(), C14113y2.m67408k4("set_", str), m25138rv(), this.f6924to));
        }
        m25138rv().mo25036k4((AbstractC6155lr) c6126dc);
    }
}
