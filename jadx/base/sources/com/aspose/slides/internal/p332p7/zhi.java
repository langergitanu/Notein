package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class zhi extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33909to = new C7017h4("table:database-name", "table:sql-statement", "table:parse-sql-statement");

    /* JADX INFO: renamed from: k4 */
    private String f33910k4;

    /* JADX INFO: renamed from: kk */
    private boolean f33911kk;

    /* JADX INFO: renamed from: x1 */
    private String f33912x1;

    public zhi() {
        m45628x1();
    }

    public zhi(AbstractC13912i5 abstractC13912i5) {
        m45628x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zhi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = zhi.f33909to.m27428k4(str);
                if (iM27428k4 == 0) {
                    zhi.this.f33910k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    zhi.this.f33912x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                zhi.this.f33911kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45628x1() {
        this.f33911kk = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:database-name", this.f33910k4);
        c3059ii.m12955x1("table:sql-statement", this.f33912x1);
        boolean z = this.f33911kk;
        if (z) {
            c3059ii.m12955x1("table:parse-sql-statement", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
