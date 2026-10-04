package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class uty extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31417kk = new C7017h4("r:id", "collapse");

    /* JADX INFO: renamed from: k4 */
    private String f31418k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f31419x1;

    public uty() {
        m42554to();
    }

    /* JADX INFO: renamed from: to */
    private void m42554to() {
        this.f31419x1 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m42555k4() {
        return this.f31418k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m42558x1() {
        return this.f31419x1;
    }

    public uty(AbstractC13912i5 abstractC13912i5) {
        m42554to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uty.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = uty.f31417kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    uty.this.f31418k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                uty.this.f31419x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42556k4(String str) {
        this.f31418k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:id", this.f31418k4);
        boolean z = this.f31419x1;
        if (z) {
            c3059ii.m12955x1("collapse", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42557k4(boolean z) {
        this.f31419x1 = z;
    }
}
