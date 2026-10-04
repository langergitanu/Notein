package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.v4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8999v4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31537x1 = new C7017h4("id");

    /* JADX INFO: renamed from: k4 */
    private String f31538k4;

    public C8999v4() {
    }

    /* JADX INFO: renamed from: to */
    private void m42715to(AbstractC13912i5 abstractC13912i5) {
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && f31537x1.m27428k4(abstractC13912i5.mo65023fa()) == 0 && "http://schemas.openxmlformats.org/officeDocument/2006/relationships".equals(abstractC13912i5.mo65050up())) {
                this.f31538k4 = abstractC13912i5.mo65042rv();
            }
        }
        abstractC13912i5.mo65020du();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m42716k4() {
        return this.f31538k4;
    }

    public C8999v4(AbstractC13912i5 abstractC13912i5) {
        m42714k4(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m42714k4(AbstractC13912i5 abstractC13912i5) {
        String strMo65023fa = abstractC13912i5.mo65023fa();
        m42715to(abstractC13912i5);
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                } else {
                    if (abstractC13912i5.mo65028jd() == 1) {
                    }
                }
            } while (!OooO0o.OooO0OO(abstractC13912i5, f31537x1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42717k4(String str) {
        this.f31538k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("c", str2, "http://schemas.openxmlformats.org/drawingml/2006/chart");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f31538k4);
        c3059ii.mo21898jd();
    }
}
