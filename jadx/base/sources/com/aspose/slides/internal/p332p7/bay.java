package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class bay extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f20461k4 = er8.m31248k4("left");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f20462up = new C7017h4("text:number-lines", "style:num-format", "style:num-letter-sync", "text:style-name", "text:increment", "text:number-position", "text:offset", "text:count-empty-lines", "text:count-in-text-boxes", "text:restart-on-page", "linenumbering-separator");

    /* JADX INFO: renamed from: c5 */
    private boolean f20463c5;

    /* JADX INFO: renamed from: ck */
    private boolean f20464ck;

    /* JADX INFO: renamed from: du */
    private String f20465du;

    /* JADX INFO: renamed from: dy */
    private String f20466dy;

    /* JADX INFO: renamed from: fa */
    private lh6 f20467fa;

    /* JADX INFO: renamed from: h4 */
    private long f20468h4;

    /* JADX INFO: renamed from: jd */
    private boolean f20469jd;

    /* JADX INFO: renamed from: kk */
    private String f20470kk;

    /* JADX INFO: renamed from: m9 */
    private int f20471m9;

    /* JADX INFO: renamed from: to */
    private byte f20472to;

    /* JADX INFO: renamed from: x1 */
    private boolean f20473x1;

    public bay() {
        m28769x1();
    }

    public bay(final AbstractC13912i5 abstractC13912i5) {
        m28769x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bay.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (bay.f20462up.m27428k4(str)) {
                    case 0:
                        bay.this.f20473x1 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        bay.this.f20470kk = str2;
                        break;
                    case 2:
                        bay.this.f20472to = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 3:
                        bay.this.f20465du = str2;
                        break;
                    case 4:
                        bay.this.f20468h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 5:
                        bay.this.f20471m9 = er8.m31248k4(str2);
                        break;
                    case 6:
                        bay.this.f20466dy = str2;
                        break;
                    case 7:
                        bay.this.f20463c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        bay.this.f20469jd = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        bay.this.f20464ck = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bay.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (bay.f20462up.m27428k4(abstractC13912i5.mo65023fa()) != 10) {
                    return false;
                }
                bay.this.f20467fa = new lh6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m28769x1() {
        this.f20473x1 = true;
        this.f20472to = (byte) -1;
        this.f20468h4 = 4294967295L;
        this.f20471m9 = f20461k4;
        this.f20463c5 = true;
        this.f20469jd = false;
        this.f20464ck = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f20473x1;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:number-lines", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f20470kk;
        if (str4 != null) {
            c3059ii.m12955x1("style:num-format", str4);
        }
        byte b = this.f20472to;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f20465du;
        if (str5 != null) {
            c3059ii.m12955x1("text:style-name", str5);
        }
        long j = this.f20468h4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:increment", C13850af.m65147x1(j));
        }
        int i = this.f20471m9;
        if (i != f20461k4) {
            c3059ii.m12955x1("text:number-position", er8.m31249k4(i));
        }
        String str6 = this.f20466dy;
        if (str6 != null) {
            c3059ii.m12955x1("text:offset", str6);
        }
        boolean z2 = this.f20463c5;
        if (!z2) {
            c3059ii.m12955x1("text:count-empty-lines", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f20469jd;
        if (z3) {
            c3059ii.m12955x1("text:count-in-text-boxes", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f20464ck;
        if (z4) {
            if (z4) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:restart-on-page", str3);
        }
        lh6 lh6Var = this.f20467fa;
        if (lh6Var != null) {
            lh6Var.mo6846k4("text", c3059ii, "linenumbering-separator");
        }
        c3059ii.mo21898jd();
    }
}
