package com.aspose.slides.internal.p353q7;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9776kk extends AbstractC9768f9 {

    /* JADX INFO: renamed from: k4 */
    private C9772h4 f35313k4;

    /* JADX INFO: renamed from: kk */
    private final C9780m9 f35314kk;

    /* JADX INFO: renamed from: x1 */
    private final C9765du f35315x1;

    public C9776kk(C12564kk c12564kk) {
        this.f35313k4 = new C9772h4(c12564kk);
        m48098x1();
        this.f35313k4.m48084du();
        C9765du c9765duM48084du = this.f35313k4.m48084du();
        this.f35315x1 = c9765duM48084du;
        this.f35314kk = new C9780m9(new C9789to(c9765duM48084du.m48043k4()).m48163k4());
    }

    /* JADX INFO: renamed from: x1 */
    private void m48098x1() {
        this.f35313k4.m48085k4();
        this.f35313k4.m48085k4();
        this.f35313k4.m48085k4();
        this.f35313k4.m48087kk();
    }

    @Override // com.aspose.slides.internal.p353q7.AbstractC9768f9
    /* JADX INFO: renamed from: k4 */
    public void mo48051k4(C12570to c12570to) {
        throw new NotImplementedException("Not supposed to write CFF yet because no subsetting for CFF is implemented.");
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m48099k4() {
        return this.f35314kk.m48129k4() != null;
    }
}
