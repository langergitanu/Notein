package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class qmc extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f28940fa = new C7017h4("chart:values-cell-range-address", "chart:label-cell-address", "chart:class", "chart:attached-axis", "chart:style-name", "loext:hide-legend", "domain", "mean-value", "regression-curve", "error-indicator", "data-point");

    /* JADX INFO: renamed from: c5 */
    private smn f28941c5;

    /* JADX INFO: renamed from: ck */
    private List<bls> f28942ck;

    /* JADX INFO: renamed from: du */
    private String f28943du;

    /* JADX INFO: renamed from: dy */
    private uki f28944dy;

    /* JADX INFO: renamed from: h4 */
    private byte f28945h4;

    /* JADX INFO: renamed from: jd */
    private jgi f28946jd;

    /* JADX INFO: renamed from: k4 */
    private String f28947k4;

    /* JADX INFO: renamed from: kk */
    private String f28948kk;

    /* JADX INFO: renamed from: m9 */
    private List<o9y> f28949m9;

    /* JADX INFO: renamed from: to */
    private String f28950to;

    /* JADX INFO: renamed from: x1 */
    private String f28951x1;

    public qmc() {
        m39576jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m39576jd() {
        this.f28945h4 = (byte) -1;
        this.f28949m9 = new List<>();
        this.f28942ck = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final String m39587du() {
        return this.f28943du;
    }

    /* JADX INFO: renamed from: dy */
    public final bls[] m39588dy() {
        return this.f28942ck.toArray(new bls[0]);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m39589h4() {
        return this.f28945h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m39591kk() {
        return this.f28948kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final o9y[] m39592m9() {
        return this.f28949m9.toArray(new o9y[0]);
    }

    /* JADX INFO: renamed from: to */
    public final String m39593to() {
        return this.f28950to;
    }

    public qmc(final AbstractC13912i5 abstractC13912i5) {
        m39576jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qmc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qmc.f28940fa.m27428k4(str);
                if (iM27428k4 == 0) {
                    qmc.this.f28947k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    qmc.this.f28951x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    qmc.this.f28948kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    qmc.this.f28950to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    qmc.this.f28943du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                qmc.this.f28945h4 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qmc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz o9yVar;
                List list;
                switch (qmc.f28940fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        o9yVar = new o9y(abstractC13912i5);
                        list = qmc.this.f28949m9;
                        break;
                    case 7:
                        qmc.this.f28944dy = new uki(abstractC13912i5);
                        return true;
                    case 8:
                        qmc.this.f28941c5 = new smn(abstractC13912i5);
                        return true;
                    case 9:
                        qmc.this.f28946jd = new jgi(abstractC13912i5);
                        return true;
                    case 10:
                        o9yVar = new bls(abstractC13912i5);
                        list = qmc.this.f28942ck;
                        break;
                    default:
                        return false;
                }
                list.addItem(o9yVar);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39594x1() {
        return this.f28951x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m39590k4() {
        return this.f28947k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28947k4;
        if (str3 != null) {
            c3059ii.m12955x1("chart:values-cell-range-address", str3);
        }
        String str4 = this.f28951x1;
        if (str4 != null) {
            c3059ii.m12955x1("chart:label-cell-address", str4);
        }
        String str5 = this.f28948kk;
        if (str5 != null) {
            c3059ii.m12955x1("chart:class", str5);
        }
        String str6 = this.f28950to;
        if (str6 != null) {
            c3059ii.m12955x1("chart:attached-axis", str6);
        }
        String str7 = this.f28943du;
        if (str7 != null) {
            c3059ii.m12955x1("chart:style-name", str7);
        }
        byte b = this.f28945h4;
        if (b != -1) {
            c3059ii.m12955x1("loext:hide-legend", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<bls> it = this.f28949m9.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("chart", c3059ii, "domain");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        uki ukiVar = this.f28944dy;
        if (ukiVar != null) {
            ukiVar.mo6846k4("chart", c3059ii, "mean-value");
        }
        smn smnVar = this.f28941c5;
        if (smnVar != null) {
            smnVar.mo6846k4("chart", c3059ii, "regression-curve");
        }
        jgi jgiVar = this.f28946jd;
        if (jgiVar != null) {
            jgiVar.mo6846k4("chart", c3059ii, "error-indicator");
        }
        it = this.f28942ck.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("chart", c3059ii, "data-point");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
