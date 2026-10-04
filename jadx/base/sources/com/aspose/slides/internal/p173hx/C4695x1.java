package com.aspose.slides.internal.p173hx;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p169hl.C4599x1;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p504xm.C12553to;

/* JADX INFO: renamed from: com.aspose.slides.internal.hx.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4695x1 extends AbstractC4691k4 {

    /* JADX INFO: renamed from: k4 */
    private final int f13101k4;

    /* JADX INFO: renamed from: x1 */
    private final C12553to f13102x1;

    public C4695x1(int i, C12553to c12553to) {
        this.f13101k4 = i;
        this.f13102x1 = c12553to;
    }

    /* JADX INFO: renamed from: k4 */
    private int m19551k4() {
        int i = this.f13101k4;
        if (i == 6) {
            return 0;
        }
        if (i == 7) {
            return -1;
        }
        throw new InvalidOperationException("Unexpected compression.");
    }

    @Override // com.aspose.slides.internal.p173hx.AbstractC4691k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 mo19544k4(AbstractC3150x6 abstractC3150x6) {
        return new C4599x1(abstractC3150x6, this.f13101k4 == 6 ? 3 : 4, (float) this.f13102x1.m58545kk(), this.f13102x1.m58544k4());
    }

    @Override // com.aspose.slides.internal.p173hx.AbstractC4691k4
    /* JADX INFO: renamed from: k4 */
    public void mo19546k4(C10922yj c10922yj) {
        c10922yj.m52666kk("/Filter", "/CCITTFaxDecode");
        c10922yj.m52665kk("/DecodeParms <<");
        c10922yj.m52652k4("/K", m19551k4());
        c10922yj.m52652k4("/Columns", this.f13102x1.m58544k4());
        c10922yj.m52652k4("/Rows", this.f13102x1.m58547x1());
        c10922yj.m52665kk(">>");
    }
}
