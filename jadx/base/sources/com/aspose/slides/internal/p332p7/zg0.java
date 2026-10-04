package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class zg0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private boolean f33887c5;

    /* JADX INFO: renamed from: du */
    private String f33888du;

    /* JADX INFO: renamed from: dy */
    private String f33889dy;

    /* JADX INFO: renamed from: h4 */
    private int f33890h4;

    /* JADX INFO: renamed from: jd */
    private vtn f33891jd;

    /* JADX INFO: renamed from: kk */
    private int f33892kk;

    /* JADX INFO: renamed from: m9 */
    private String f33893m9;

    /* JADX INFO: renamed from: to */
    private int f33894to;

    /* JADX INFO: renamed from: x1 */
    private String f33895x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f33886k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f33885ck = new C7017h4("xlink:href", "xlink:type", "xlink:actuate", "office:target-frame-name", "xlink:show", "office:name", "office:title", "office:server-map", "frame");

    public zg0() {
        m45612x1();
        this.f33891jd = new vtn();
    }

    public zg0(final AbstractC13912i5 abstractC13912i5) {
        m45612x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zg0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (zg0.f33885ck.m27428k4(str)) {
                    case 0:
                        zg0.this.f33895x1 = str2;
                        break;
                    case 1:
                        zg0.this.f33892kk = bhu.m28903k4(str2);
                        break;
                    case 2:
                        zg0.this.f33894to = x2a.m44176k4(str2);
                        break;
                    case 3:
                        zg0.this.f33888du = str2;
                        break;
                    case 4:
                        zg0.this.f33890h4 = ina.m34328k4(str2);
                        break;
                    case 5:
                        zg0.this.f33893m9 = str2;
                        break;
                    case 6:
                        zg0.this.f33889dy = str2;
                        break;
                    case 7:
                        zg0.this.f33887c5 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zg0.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (zg0.f33885ck.m27428k4(abstractC13912i5.mo65023fa()) != 8) {
                    return false;
                }
                zg0.this.f33891jd = new vtn(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m45612x1() {
        this.f33892kk = f33886k4;
        this.f33894to = 0;
        this.f33890h4 = 0;
        this.f33887c5 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xlink:href", this.f33895x1);
        int i = this.f33892kk;
        if (i != f33886k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f33894to;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        String str3 = this.f33888du;
        if (str3 != null) {
            c3059ii.m12955x1("office:target-frame-name", str3);
        }
        int i3 = this.f33890h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:show", ina.m34329k4(i3));
        }
        String str4 = this.f33893m9;
        if (str4 != null) {
            c3059ii.m12955x1("office:name", str4);
        }
        String str5 = this.f33889dy;
        if (str5 != null) {
            c3059ii.m12955x1("office:title", str5);
        }
        boolean z = this.f33887c5;
        if (z) {
            c3059ii.m12955x1("office:server-map", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        this.f33891jd.mo6846k4("draw", c3059ii, "frame");
        c3059ii.mo21898jd();
    }
}
