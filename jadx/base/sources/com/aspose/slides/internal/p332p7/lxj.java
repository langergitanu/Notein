package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lxj extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26583du = new C7017h4("text:style-name", "text:continue-numbering", "list-header", "list-item");

    /* JADX INFO: renamed from: k4 */
    private String f26584k4;

    /* JADX INFO: renamed from: kk */
    private pnx f26585kk;

    /* JADX INFO: renamed from: to */
    private List<aq8> f26586to;

    /* JADX INFO: renamed from: x1 */
    private byte f26587x1;

    public lxj() {
        m36510m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m36510m9() {
        this.f26587x1 = (byte) -1;
        this.f26586to = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final aq8[] m36511du() {
        return this.f26586to.toArray(new aq8[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final String m36514kk() {
        return this.f26584k4;
    }

    /* JADX INFO: renamed from: to */
    public final pnx m36515to() {
        return this.f26585kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final aq8 m36516x1() {
        aq8 aq8Var = new aq8();
        this.f26586to.addItem(aq8Var);
        return aq8Var;
    }

    public lxj(final AbstractC13912i5 abstractC13912i5) {
        m36510m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lxj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lxj.f26583du.m27428k4(str);
                if (iM27428k4 == 0) {
                    lxj.this.f26584k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                lxj.this.f26587x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lxj.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = lxj.f26583du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    lxj.this.f26585kk = new pnx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                lxj.this.f26586to.addItem(new aq8(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final pnx m36512k4() {
        if (this.f26585kk != null) {
            throw new Exception("Only one <list_header> element can be added.");
        }
        pnx pnxVar = new pnx();
        this.f26585kk = pnxVar;
        return pnxVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36513k4(String str) {
        this.f26584k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26584k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        byte b = this.f26587x1;
        if (b != -1) {
            c3059ii.m12955x1("text:continue-numbering", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        pnx pnxVar = this.f26585kk;
        if (pnxVar != null) {
            pnxVar.mo6846k4("text", c3059ii, "list-header");
        }
        List.Enumerator<aq8> it = this.f26586to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "list-item");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
