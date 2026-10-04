package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jr */
/* JADX INFO: loaded from: classes4.dex */
public class C8035jr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25322du = new C7017h4("geoLocationQueryResults", "geoDataEntityQueryResults", "geoDataPointToEntityQueryResults", "geoChildEntitiesQueryResults");

    /* JADX INFO: renamed from: k4 */
    private C9053vn f25323k4;

    /* JADX INFO: renamed from: kk */
    private C8647r3 f25324kk;

    /* JADX INFO: renamed from: to */
    private C8718rx f25325to;

    /* JADX INFO: renamed from: x1 */
    private C7778gn f25326x1;

    public C8035jr() {
    }

    public C8035jr(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8035jr.f25322du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8035jr.this.f25323k4 = new C9053vn(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8035jr.this.f25326x1 = new C7778gn(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8035jr.this.f25324kk = new C8647r3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8035jr.this.f25325to = new C8718rx(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9053vn c9053vn = this.f25323k4;
        if (c9053vn != null) {
            c9053vn.mo6846k4("cx", c3059ii, "geoLocationQueryResults");
        }
        C7778gn c7778gn = this.f25326x1;
        if (c7778gn != null) {
            c7778gn.mo6846k4("cx", c3059ii, "geoDataEntityQueryResults");
        }
        C8647r3 c8647r3 = this.f25324kk;
        if (c8647r3 != null) {
            c8647r3.mo6846k4("cx", c3059ii, "geoDataPointToEntityQueryResults");
        }
        C8718rx c8718rx = this.f25325to;
        if (c8718rx != null) {
            c8718rx.mo6846k4("cx", c3059ii, "geoChildEntitiesQueryResults");
        }
        c3059ii.mo21898jd();
    }
}
