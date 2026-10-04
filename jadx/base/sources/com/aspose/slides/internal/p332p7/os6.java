package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class os6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f28076k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f28077m9 = new C7017h4("presentation:play-full", "xlink:href", "xlink:type", "xlink:actuate", "xlink:show");

    /* JADX INFO: renamed from: du */
    private int f28078du;

    /* JADX INFO: renamed from: h4 */
    private int f28079h4;

    /* JADX INFO: renamed from: kk */
    private String f28080kk;

    /* JADX INFO: renamed from: to */
    private int f28081to;

    /* JADX INFO: renamed from: x1 */
    private byte f28082x1;

    public os6() {
        m38428x1();
    }

    public os6(AbstractC13912i5 abstractC13912i5) {
        m38428x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.os6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = os6.f28077m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    os6.this.f28082x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    os6.this.f28080kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    os6.this.f28081to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    os6.this.f28078du = x2a.m44176k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                os6.this.f28079h4 = ina.m34328k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38428x1() {
        this.f28082x1 = (byte) -1;
        this.f28081to = f28076k4;
        this.f28078du = 0;
        this.f28079h4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f28082x1;
        if (b != -1) {
            c3059ii.m12955x1("presentation:play-full", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("xlink:href", this.f28080kk);
        int i = this.f28081to;
        if (i != f28076k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f28078du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        int i3 = this.f28079h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:show", ina.m34329k4(i3));
        }
        c3059ii.mo21898jd();
    }
}
