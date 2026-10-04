package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class sxo extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f30488up = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:printable", "form:tab-index", "form:tab-stop", "form:title", "properties", "event-listeners", "column");

    /* JADX INFO: renamed from: c5 */
    private String f30489c5;

    /* JADX INFO: renamed from: ck */
    private hec f30490ck;

    /* JADX INFO: renamed from: du */
    private boolean f30491du;

    /* JADX INFO: renamed from: dy */
    private boolean f30492dy;

    /* JADX INFO: renamed from: fa */
    private List<skr> f30493fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f30494h4;

    /* JADX INFO: renamed from: jd */
    private eyu f30495jd;

    /* JADX INFO: renamed from: k4 */
    private String f30496k4;

    /* JADX INFO: renamed from: kk */
    private String f30497kk;

    /* JADX INFO: renamed from: m9 */
    private long f30498m9;

    /* JADX INFO: renamed from: to */
    private String f30499to;

    /* JADX INFO: renamed from: x1 */
    private String f30500x1;

    public sxo() {
        m41440x1();
    }

    public sxo(final AbstractC13912i5 abstractC13912i5) {
        m41440x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sxo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (sxo.f30488up.m27428k4(str)) {
                    case 0:
                        sxo.this.f30496k4 = str2;
                        break;
                    case 1:
                        sxo.this.f30500x1 = str2;
                        break;
                    case 2:
                        sxo.this.f30497kk = str2;
                        break;
                    case 3:
                        sxo.this.f30499to = str2;
                        break;
                    case 4:
                        sxo.this.f30491du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        sxo.this.f30494h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        sxo.this.f30498m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        sxo.this.f30492dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        sxo.this.f30489c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sxo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (sxo.f30488up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        sxo.this.f30495jd = new eyu(abstractC13912i5);
                        return true;
                    case 10:
                        sxo.this.f30490ck = new hec(abstractC13912i5);
                        return true;
                    case 11:
                        sxo.this.f30493fa.addItem(new skr(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41440x1() {
        this.f30491du = false;
        this.f30494h4 = true;
        this.f30498m9 = 0L;
        this.f30492dy = true;
        this.f30493fa = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30496k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f30500x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f30497kk);
        String str5 = this.f30499to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f30491du;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f30494h4;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f30498m9;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j));
        }
        boolean z3 = this.f30492dy;
        if (!z3) {
            if (z3) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:tab-stop", str6);
        }
        String str7 = this.f30489c5;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        eyu eyuVar = this.f30495jd;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f30490ck;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        List.Enumerator<skr> it = this.f30493fa.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("form", c3059ii, "column");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
