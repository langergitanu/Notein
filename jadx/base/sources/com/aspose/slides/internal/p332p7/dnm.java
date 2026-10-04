package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class dnm extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21758kk = new C7017h4("text:key", "text:sort-ascending");

    /* JADX INFO: renamed from: k4 */
    private int f21759k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f21760x1;

    public dnm() {
        m30473x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30473x1() {
        this.f21759k4 = 0;
        this.f21760x1 = true;
    }

    public dnm(AbstractC13912i5 abstractC13912i5) {
        m30473x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dnm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dnm.f21758kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    dnm.this.f21759k4 = jax.m34612k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                dnm.this.f21760x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:key", jax.m34613k4(this.f21759k4));
        boolean z = this.f21760x1;
        if (!z) {
            c3059ii.m12955x1("text:sort-ascending", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
