package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cp */
/* JADX INFO: loaded from: classes4.dex */
public class C7429cp extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21163x1 = new C7017h4("jc");

    /* JADX INFO: renamed from: k4 */
    private C8607ql f21164k4;

    public C7429cp() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8607ql m29712k4() {
        return this.f21164k4;
    }

    public C7429cp(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7429cp.f21163x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7429cp.this.f21164k4 = new C8607ql(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29713k4(C8607ql c8607ql) {
        this.f21164k4 = c8607ql;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8607ql c8607ql = this.f21164k4;
        if (c8607ql != null) {
            c8607ql.mo6846k4("m", c3059ii, "jc");
        }
        c3059ii.mo21898jd();
    }
}
