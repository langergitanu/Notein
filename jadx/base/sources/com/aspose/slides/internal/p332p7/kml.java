package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class kml extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25801to = new C7017h4("table:id", "cell-address", "change-track-table-cell");

    /* JADX INFO: renamed from: k4 */
    private String f25802k4;

    /* JADX INFO: renamed from: kk */
    private fmm f25803kk;

    /* JADX INFO: renamed from: x1 */
    private s6u f25804x1;

    public kml() {
    }

    public kml(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kml.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (kml.f25801to.m27428k4(str) != 0) {
                    return false;
                }
                kml.this.f25802k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kml.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = kml.f25801to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    kml.this.f25804x1 = new s6u(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    kml.this.f25803kk = new fmm(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25802k4;
        if (str3 != null) {
            c3059ii.m12955x1("table:id", str3);
        }
        s6u s6uVar = this.f25804x1;
        if (s6uVar != null) {
            s6uVar.mo6846k4("table", c3059ii, "cell-address");
        }
        fmm fmmVar = this.f25803kk;
        if (fmmVar != null) {
            fmmVar.mo6846k4("table", c3059ii, "change-track-table-cell");
        }
        c3059ii.mo21898jd();
    }
}
