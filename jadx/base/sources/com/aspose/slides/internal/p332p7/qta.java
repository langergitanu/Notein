package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class qta extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f29012c5 = new C7017h4("chart:legend-position", "chart:legend-align", "svg:x", "svg:y", "style:legend-expansion", "style:legend-expansion-aspect-ratio", "chart:style-name", "loext:overlay");

    /* JADX INFO: renamed from: du */
    private int f29013du;

    /* JADX INFO: renamed from: dy */
    private byte f29014dy;

    /* JADX INFO: renamed from: h4 */
    private double f29015h4;

    /* JADX INFO: renamed from: k4 */
    private int f29016k4;

    /* JADX INFO: renamed from: kk */
    private String f29017kk;

    /* JADX INFO: renamed from: m9 */
    private String f29018m9;

    /* JADX INFO: renamed from: to */
    private String f29019to;

    /* JADX INFO: renamed from: x1 */
    private int f29020x1;

    public qta() {
        m39659du();
    }

    /* JADX INFO: renamed from: du */
    private void m39659du() {
        this.f29016k4 = 0;
        this.f29020x1 = 0;
        this.f29013du = 0;
        this.f29015h4 = Double.NaN;
        this.f29014dy = (byte) -1;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m39670kk() {
        return this.f29014dy;
    }

    public qta(AbstractC13912i5 abstractC13912i5) {
        m39659du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qta.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (qta.f29012c5.m27428k4(str)) {
                    case 0:
                        qta.this.f29016k4 = qe8.m39458k4(str2);
                        break;
                    case 1:
                        qta.this.f29020x1 = n4m.m37226k4(str2);
                        break;
                    case 2:
                        qta.this.f29017kk = str2;
                        break;
                    case 3:
                        qta.this.f29019to = str2;
                        break;
                    case 4:
                        qta.this.f29013du = gbd.m32396k4(str2);
                        break;
                    case 5:
                        qta.this.f29015h4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 6:
                        qta.this.f29018m9 = str2;
                        break;
                    case 7:
                        qta.this.f29014dy = AbstractC7361bz.m29296rv(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39671x1() {
        return this.f29018m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m39669k4() {
        return this.f29016k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29016k4;
        if (i != 0) {
            c3059ii.m12955x1("chart:legend-position", qe8.m39459k4(i));
        }
        int i2 = this.f29020x1;
        if (i2 != 0) {
            c3059ii.m12955x1("chart:legend-align", n4m.m37227k4(i2));
        }
        String str3 = this.f29017kk;
        if (str3 != null) {
            c3059ii.m12955x1("svg:x", str3);
        }
        String str4 = this.f29019to;
        if (str4 != null) {
            c3059ii.m12955x1("svg:y", str4);
        }
        int i3 = this.f29013du;
        if (i3 != 0) {
            c3059ii.m12955x1("style:legend-expansion", gbd.m32397k4(i3));
        }
        if (!C14044b3.m66437kk(this.f29015h4)) {
            c3059ii.m12955x1("style:legend-expansion-aspect-ratio", C13850af.m65101k4(this.f29015h4));
        }
        String str5 = this.f29018m9;
        if (str5 != null) {
            c3059ii.m12955x1("chart:style-name", str5);
        }
        byte b = this.f29014dy;
        if (b != -1) {
            c3059ii.m12955x1("loext:overlay", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
