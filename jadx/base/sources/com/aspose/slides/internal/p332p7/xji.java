package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class xji extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f32864ck = new C7017h4("text:level", "text:style-name", "style:num-format", "style:num-letter-sync", "style:num-prefix", "style:num-suffix", "text:display-levels", "text:start-value", "list-level-properties", "text-properties");

    /* JADX INFO: renamed from: c5 */
    private gwj f32865c5;

    /* JADX INFO: renamed from: du */
    private String f32866du;

    /* JADX INFO: renamed from: dy */
    private long f32867dy;

    /* JADX INFO: renamed from: h4 */
    private String f32868h4;

    /* JADX INFO: renamed from: jd */
    private zob f32869jd;

    /* JADX INFO: renamed from: k4 */
    private long f32870k4;

    /* JADX INFO: renamed from: kk */
    private String f32871kk;

    /* JADX INFO: renamed from: m9 */
    private long f32872m9;

    /* JADX INFO: renamed from: to */
    private byte f32873to;

    /* JADX INFO: renamed from: x1 */
    private String f32874x1;

    public xji() {
        m44431x1();
    }

    public xji(final AbstractC13912i5 abstractC13912i5) {
        m44431x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xji.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (xji.f32864ck.m27428k4(str)) {
                    case 0:
                        xji.this.f32870k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        xji.this.f32874x1 = str2;
                        break;
                    case 2:
                        xji.this.f32871kk = str2;
                        break;
                    case 3:
                        xji.this.f32873to = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 4:
                        xji.this.f32866du = str2;
                        break;
                    case 5:
                        xji.this.f32868h4 = str2;
                        break;
                    case 6:
                        xji.this.f32872m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        xji.this.f32867dy = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xji.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xji.f32864ck.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 8) {
                    xji.this.f32865c5 = new gwj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 9) {
                    return false;
                }
                xji.this.f32869jd = new zob(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44431x1() {
        this.f32873to = (byte) -1;
        this.f32872m9 = 1L;
        this.f32867dy = 1L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:level", C13850af.m65147x1(this.f32870k4));
        String str3 = this.f32874x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        String str4 = this.f32871kk;
        if (str4 != null) {
            c3059ii.m12955x1("style:num-format", str4);
        }
        byte b = this.f32873to;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f32866du;
        if (str5 != null) {
            c3059ii.m12955x1("style:num-prefix", str5);
        }
        String str6 = this.f32868h4;
        if (str6 != null) {
            c3059ii.m12955x1("style:num-suffix", str6);
        }
        long j = this.f32872m9;
        if ((j & 4294967295L) != 1) {
            c3059ii.m12955x1("text:display-levels", C13850af.m65147x1(j));
        }
        long j2 = this.f32867dy;
        if ((4294967295L & j2) != 1) {
            c3059ii.m12955x1("text:start-value", C13850af.m65147x1(j2));
        }
        gwj gwjVar = this.f32865c5;
        if (gwjVar != null) {
            gwjVar.mo6846k4("style", c3059ii, "list-level-properties");
        }
        zob zobVar = this.f32869jd;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        c3059ii.mo21898jd();
    }
}
