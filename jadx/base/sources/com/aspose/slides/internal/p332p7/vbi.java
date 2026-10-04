package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class vbi extends AbstractC7361bz {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f31658ix = new C7017h4("form:name", "form:control-implementation", "form:id", "xforms:bind", "form:current-value", "form:disabled", "form:max-length", "form:printable", "form:readonly", "form:tab-index", "form:tab-stop", "form:title", "form:value", "form:convert-empty-to-null", "form:data-field", "properties", "event-listeners", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: c5 */
    private boolean f31659c5;

    /* JADX INFO: renamed from: ck */
    private boolean f31660ck;

    /* JADX INFO: renamed from: du */
    private String f31661du;

    /* JADX INFO: renamed from: dy */
    private boolean f31662dy;

    /* JADX INFO: renamed from: fa */
    private String f31663fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f31664h4;

    /* JADX INFO: renamed from: jd */
    private long f31665jd;

    /* JADX INFO: renamed from: k4 */
    private String f31666k4;

    /* JADX INFO: renamed from: kk */
    private String f31667kk;

    /* JADX INFO: renamed from: ks */
    private String f31668ks;

    /* JADX INFO: renamed from: m9 */
    private long f31669m9;

    /* JADX INFO: renamed from: ne */
    private List<ok7> f31670ne;

    /* JADX INFO: renamed from: rv */
    private eyu f31671rv;

    /* JADX INFO: renamed from: to */
    private String f31672to;

    /* JADX INFO: renamed from: up */
    private String f31673up;

    /* JADX INFO: renamed from: x1 */
    private String f31674x1;

    /* JADX INFO: renamed from: x6 */
    private hec f31675x6;

    /* JADX INFO: renamed from: yj */
    private boolean f31676yj;

    public vbi() {
        m42867x1();
    }

    public vbi(final AbstractC13912i5 abstractC13912i5) {
        m42867x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vbi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (vbi.f31658ix.m27428k4(str)) {
                    case 0:
                        vbi.this.f31666k4 = str2;
                        break;
                    case 1:
                        vbi.this.f31674x1 = str2;
                        break;
                    case 2:
                        vbi.this.f31667kk = str2;
                        break;
                    case 3:
                        vbi.this.f31672to = str2;
                        break;
                    case 4:
                        vbi.this.f31661du = str2;
                        break;
                    case 5:
                        vbi.this.f31664h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        vbi.this.f31669m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        vbi.this.f31662dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        vbi.this.f31659c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        vbi.this.f31665jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        vbi.this.f31660ck = C13850af.m65068c5(str2);
                        break;
                    case 11:
                        vbi.this.f31663fa = str2;
                        break;
                    case 12:
                        vbi.this.f31673up = str2;
                        break;
                    case 13:
                        vbi.this.f31676yj = C13850af.m65068c5(str2);
                        break;
                    case 14:
                        vbi.this.f31668ks = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vbi.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (vbi.f31658ix.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 15:
                        vbi.this.f31671rv = new eyu(abstractC13912i5);
                        return true;
                    case 16:
                        vbi.this.f31675x6 = new hec(abstractC13912i5);
                        return true;
                    case 17:
                        vbi.this.f31670ne.addItem(new ok7(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m42867x1() {
        this.f31664h4 = false;
        this.f31669m9 = 4294967295L;
        this.f31662dy = true;
        this.f31659c5 = false;
        this.f31665jd = 0L;
        this.f31660ck = true;
        this.f31676yj = false;
        this.f31670ne = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f31666k4;
        if (str3 != null) {
            c3059ii.m12955x1("form:name", str3);
        }
        String str4 = this.f31674x1;
        if (str4 != null) {
            c3059ii.m12955x1("form:control-implementation", str4);
        }
        c3059ii.m12955x1("form:id", this.f31667kk);
        String str5 = this.f31672to;
        if (str5 != null) {
            c3059ii.m12955x1("xforms:bind", str5);
        }
        c3059ii.m12955x1("form:current-value", this.f31661du);
        boolean z = this.f31664h4;
        String str6 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:disabled", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j = this.f31669m9;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("form:max-length", C13850af.m65147x1(j));
        }
        boolean z2 = this.f31662dy;
        if (!z2) {
            c3059ii.m12955x1("form:printable", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f31659c5;
        if (z3) {
            c3059ii.m12955x1("form:readonly", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        long j2 = this.f31665jd;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("form:tab-index", C13850af.m65147x1(j2));
        }
        boolean z4 = this.f31660ck;
        if (!z4) {
            c3059ii.m12955x1("form:tab-stop", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f31663fa;
        if (str7 != null) {
            c3059ii.m12955x1("form:title", str7);
        }
        c3059ii.m12955x1("form:value", this.f31673up);
        boolean z5 = this.f31676yj;
        if (z5) {
            if (z5) {
                str6 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:convert-empty-to-null", str6);
        }
        String str8 = this.f31668ks;
        if (str8 != null) {
            c3059ii.m12955x1("form:data-field", str8);
        }
        eyu eyuVar = this.f31671rv;
        if (eyuVar != null) {
            eyuVar.mo6846k4("form", c3059ii, "properties");
        }
        hec hecVar = this.f31675x6;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        List.Enumerator<ok7> it = this.f31670ne.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, ContextChain.TAG_PRODUCT);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
