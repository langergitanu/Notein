package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class ada extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f19968kk = new C7017h4("table:layout-mode", "table:add-empty-lines");

    /* JADX INFO: renamed from: k4 */
    private int f19969k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f19970x1;

    public ada() {
        m28135x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28135x1() {
        this.f19969k4 = 0;
    }

    public ada(AbstractC13912i5 abstractC13912i5) {
        m28135x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ada.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ada.f19968kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    ada.this.f19969k4 = kel.m35320k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                ada.this.f19970x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:layout-mode", kel.m35321k4(this.f19969k4));
        c3059ii.m12955x1("table:add-empty-lines", this.f19970x1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        c3059ii.mo21898jd();
    }
}
