package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.q8 */
/* JADX INFO: loaded from: classes4.dex */
public class C8585q8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28782kk = new C7017h4("geoDataPointQuery", "geoDataPointToEntityQuery");

    /* JADX INFO: renamed from: k4 */
    private C8139kv f28783k4;

    /* JADX INFO: renamed from: x1 */
    private C8879tm f28784x1;

    public C8585q8() {
    }

    public C8585q8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8585q8.f28782kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8585q8.this.f28783k4 = new C8139kv(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8585q8.this.f28784x1 = new C8879tm(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8139kv c8139kv = this.f28783k4;
        if (c8139kv != null) {
            c8139kv.mo6846k4("cx", c3059ii, "geoDataPointQuery");
        }
        C8879tm c8879tm = this.f28784x1;
        if (c8879tm != null) {
            c8879tm.mo6846k4("cx", c3059ii, "geoDataPointToEntityQuery");
        }
        c3059ii.mo21898jd();
    }
}
