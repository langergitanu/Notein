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
public class zwj extends AbstractC7361bz {

    /* JADX INFO: renamed from: uz */
    private static final C7017h4 f34196uz = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:disabled", "form:dropdown", "form:printable", "form:size", "form:tab-index", "form:tab-stop", "form:title", "form:bound-column", "form:data-field", "form:list-source", "form:list-source-type", "form:multiple", "form:xforms-list-source", "properties", "event-listeners", "option");

    /* JADX INFO: renamed from: c5 */
    private long f34197c5;

    /* JADX INFO: renamed from: ck */
    private String f34198ck;

    /* JADX INFO: renamed from: du */
    private boolean f34199du;

    /* JADX INFO: renamed from: dy */
    private long f34200dy;

    /* JADX INFO: renamed from: fa */
    private String f34201fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f34202h4;

    /* JADX INFO: renamed from: ix */
    private hec f34203ix;

    /* JADX INFO: renamed from: jd */
    private boolean f34204jd;

    /* JADX INFO: renamed from: k4 */
    private String f34205k4;

    /* JADX INFO: renamed from: kk */
    private String f34206kk;

    /* JADX INFO: renamed from: ks */
    private int f34207ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f34208m9;

    /* JADX INFO: renamed from: ne */
    private eyu f34209ne;

    /* JADX INFO: renamed from: rv */
    private boolean f34210rv;

    /* JADX INFO: renamed from: to */
    private String f34211to;

    /* JADX INFO: renamed from: u4 */
    private List<xld> f34212u4;

    /* JADX INFO: renamed from: up */
    private String f34213up;

    /* JADX INFO: renamed from: x1 */
    private String f34214x1;

    /* JADX INFO: renamed from: x6 */
    private String f34215x6;

    /* JADX INFO: renamed from: yj */
    private String f34216yj;

    public zwj() {
        m46007x1();
    }

    public zwj(final AbstractC13912i5 abstractC13912i5) {
        m46007x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zwj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (zwj.f34196uz.m27428k4(str)) {
                    case 0:
                        zwj.this.f34205k4 = str2;
                        break;
                    case 1:
                        zwj.this.f34214x1 = str2;
                        break;
                    case 2:
                        zwj.this.f34206kk = str2;
                        break;
                    case 3:
                        zwj.this.f34211to = str2;
                        break;
                    case 4:
                        zwj.this.f34199du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        zwj.this.f34202h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        zwj.this.f34208m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        zwj.this.f34200dy = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 8:
                        zwj.this.f34197c5 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 9:
                        zwj.this.f34204jd = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        zwj.this.f34198ck = str2;
                        break;
                    case 11:
                        zwj.this.f34201fa = str2;
                        break;
                    case 12:
                        zwj.this.f34213up = str2;
                        break;
                    case 13:
                        zwj.this.f34216yj = str2;
                        break;
                    case 14:
                        zwj.this.f34207ks = pj5.m38942k4(str2);
                        break;
                    case 15:
                        zwj.this.f34210rv = C13850af.m65068c5(str2);
                        break;
                    case 16:
                        zwj.this.f34215x6 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zwj.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (zwj.f34196uz.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 17:
                        zwj.this.f34209ne = new eyu(abstractC13912i5);
                        return true;
                    case 18:
                        zwj.this.f34203ix = new hec(abstractC13912i5);
                        return true;
                    case 19:
                        zwj.this.f34212u4.addItem(new xld(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m46007x1() {
        this.f34199du = false;
        this.f34202h4 = false;
        this.f34208m9 = true;
        this.f34200dy = 4294967295L;
        this.f34197c5 = 0L;
        this.f34204jd = true;
        this.f34207ks = 0;
        this.f34210rv = false;
        this.f34212u4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f34205k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f34214x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f34206kk);
        String str5 = this.f34211to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        boolean z = this.f34199du;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f34202h4;
        if (z2) {
            c3059ii.m12955x1("form:dropdown", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f34208m9;
        if (!z3) {
            c3059ii.m12955x1("form:printable", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f34200dy;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:size", C13850af.m65147x1(j));
        }
        long j2 = this.f34197c5;
        if ((4294967295L & j2) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f34204jd;
        if (!z4) {
            c3059ii.m12955x1("form:tab-stop", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f34198ck;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        String str8 = this.f34201fa;
        if (str8 != null) {
            c3059ii.m12955x1("form:bound-column", str8);
        }
        String str9 = this.f34213up;
        if (str9 != null) {
            c3059ii.m12955x1("form:data-field", str9);
        }
        String str10 = this.f34216yj;
        if (str10 != null) {
            c3059ii.m12955x1("form:list-source", str10);
        }
        int i = this.f34207ks;
        if (i != 0) {
            c3059ii.m12955x1("form:list-source-type", pj5.m38943k4(i));
        }
        boolean z5 = this.f34210rv;
        if (z5) {
            if (z5) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:multiple", str6);
        }
        String str11 = this.f34215x6;
        if (str11 != null) {
            c3059ii.m12955x1("form:xforms-list-source", str11);
        }
        eyu eyuVar = this.f34209ne;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f34203ix;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        List.Enumerator<xld> it = this.f34212u4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("form", c3059ii, "option");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
