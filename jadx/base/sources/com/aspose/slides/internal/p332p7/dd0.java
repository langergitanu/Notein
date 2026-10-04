package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class dd0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21597du = new C7017h4("dr3d:diffuse-color", "dr3d:direction", "dr3d:enabled", "dr3d:specular");

    /* JADX INFO: renamed from: k4 */
    private String f21598k4;

    /* JADX INFO: renamed from: kk */
    private byte f21599kk;

    /* JADX INFO: renamed from: to */
    private byte f21600to;

    /* JADX INFO: renamed from: x1 */
    private String f21601x1;

    public dd0() {
        m30305x1();
    }

    public dd0(AbstractC13912i5 abstractC13912i5) {
        m30305x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dd0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dd0.f21597du.m27428k4(str);
                if (iM27428k4 == 0) {
                    dd0.this.f21598k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    dd0.this.f21601x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    dd0.this.f21599kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                dd0.this.f21600to = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m30305x1() {
        this.f21599kk = (byte) -1;
        this.f21600to = (byte) -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21598k4;
        if (str3 != null) {
            c3059ii.m12955x1("dr3d:diffuse-color", str3);
        }
        c3059ii.m12955x1("dr3d:direction", this.f21601x1);
        byte b = this.f21599kk;
        String str4 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("dr3d:enabled", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        byte b2 = this.f21600to;
        if (b2 != -1) {
            if (b2 == 1) {
                str4 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("dr3d:specular", str4);
        }
        c3059ii.mo21898jd();
    }
}
