package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class uus extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f31427fa = new C7017h4("draw:handle-mirror-vertical", "draw:handle-mirror-horizontal", "draw:handle-switched", "draw:handle-position", "draw:handle-range-x-minimum", "draw:handle-range-x-maximum", "draw:handle-range-y-minimum", "draw:handle-range-y-maximum", "draw:handle-polar", "draw:handle-radius-range-minimum", "draw:handle-radius-range-maximum");

    /* JADX INFO: renamed from: c5 */
    private String f31428c5;

    /* JADX INFO: renamed from: ck */
    private String f31429ck;

    /* JADX INFO: renamed from: du */
    private String f31430du;

    /* JADX INFO: renamed from: dy */
    private String f31431dy;

    /* JADX INFO: renamed from: h4 */
    private String f31432h4;

    /* JADX INFO: renamed from: jd */
    private String f31433jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f31434k4;

    /* JADX INFO: renamed from: kk */
    private boolean f31435kk;

    /* JADX INFO: renamed from: m9 */
    private String f31436m9;

    /* JADX INFO: renamed from: to */
    private String f31437to;

    /* JADX INFO: renamed from: x1 */
    private boolean f31438x1;

    public uus() {
        m42579x1();
    }

    public uus(AbstractC13912i5 abstractC13912i5) {
        m42579x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uus.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (uus.f31427fa.m27428k4(str)) {
                    case 0:
                        uus.this.f31434k4 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        uus.this.f31438x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        uus.this.f31435kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        uus.this.f31437to = str2;
                        break;
                    case 4:
                        uus.this.f31430du = str2;
                        break;
                    case 5:
                        uus.this.f31432h4 = str2;
                        break;
                    case 6:
                        uus.this.f31436m9 = str2;
                        break;
                    case 7:
                        uus.this.f31431dy = str2;
                        break;
                    case 8:
                        uus.this.f31428c5 = str2;
                        break;
                    case 9:
                        uus.this.f31433jd = str2;
                        break;
                    case 10:
                        uus.this.f31429ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m42579x1() {
        this.f31434k4 = false;
        this.f31438x1 = false;
        this.f31435kk = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f31434k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("draw:handle-mirror-vertical", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f31438x1;
        if (z2) {
            c3059ii.m12955x1("draw:handle-mirror-horizontal", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f31435kk;
        if (z3) {
            if (z3) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("draw:handle-switched", str3);
        }
        c3059ii.m12955x1("draw:handle-position", this.f31437to);
        String str4 = this.f31430du;
        if (str4 != null) {
            c3059ii.m12955x1("draw:handle-range-x-minimum", str4);
        }
        String str5 = this.f31432h4;
        if (str5 != null) {
            c3059ii.m12955x1("draw:handle-range-x-maximum", str5);
        }
        String str6 = this.f31436m9;
        if (str6 != null) {
            c3059ii.m12955x1("draw:handle-range-y-minimum", str6);
        }
        String str7 = this.f31431dy;
        if (str7 != null) {
            c3059ii.m12955x1("draw:handle-range-y-maximum", str7);
        }
        String str8 = this.f31428c5;
        if (str8 != null) {
            c3059ii.m12955x1("draw:handle-polar", str8);
        }
        String str9 = this.f31433jd;
        if (str9 != null) {
            c3059ii.m12955x1("draw:handle-radius-range-minimum", str9);
        }
        String str10 = this.f31429ck;
        if (str10 != null) {
            c3059ii.m12955x1("draw:handle-radius-range-maximum", str10);
        }
        c3059ii.mo21898jd();
    }
}
