package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public final class z2c extends AbstractC9290yj {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33658du = new C7017h4("E2oFrame", "sp");

    /* JADX INFO: renamed from: k4 */
    private ipq f33659k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f33660kk;

    /* JADX INFO: renamed from: to */
    private dnu f33661to;

    /* JADX INFO: renamed from: x1 */
    private C7664fe f33662x1;

    public z2c() {
        m45334h4();
        this.f33659k4 = new ipq();
        this.f33662x1 = new C7664fe();
    }

    /* JADX INFO: renamed from: h4 */
    private void m45334h4() {
        this.f33660kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: kk */
    public List<C7394ca> mo28601kk() {
        return this.f33660kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: to */
    public AbstractC7414ck mo28602to() {
        return this.f33661to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: x1 */
    public C7664fe mo28603x1() {
        return this.f33662x1;
    }

    public z2c(final AbstractC13912i5 abstractC13912i5) {
        m45334h4();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.z2c.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (z2c.f33658du.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                z2c.this.f33660kk.addItem(new C7394ca("graphicFrame", new pij(abstractC13912i5)));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public C7394ca mo28598k4(String str) {
        if (f33658du.m27428k4(str) != 1) {
            throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        C7394ca c7394ca = new C7394ca("cxnSp", new ez4());
        this.f33660kk.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public AbstractC8125ks mo28599k4() {
        return this.f33659k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9290yj
    /* JADX INFO: renamed from: k4 */
    public void mo28600k4(AbstractC7414ck abstractC7414ck) {
        this.f33661to = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
    }
}
