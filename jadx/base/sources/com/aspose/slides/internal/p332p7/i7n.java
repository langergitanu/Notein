package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i7n extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private boolean f24515c5;

    /* JADX INFO: renamed from: ck */
    private boolean f24516ck;

    /* JADX INFO: renamed from: du */
    private String f24517du;

    /* JADX INFO: renamed from: dy */
    private C14077m4 f24518dy = new C14077m4();

    /* JADX INFO: renamed from: fa */
    private boolean f24519fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f24520h4;

    /* JADX INFO: renamed from: jd */
    private boolean f24521jd;

    /* JADX INFO: renamed from: ks */
    private int f24522ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f24523m9;

    /* JADX INFO: renamed from: ne */
    private List<afv> f24524ne;

    /* JADX INFO: renamed from: rv */
    private boolean f24525rv;

    /* JADX INFO: renamed from: to */
    private String f24526to;

    /* JADX INFO: renamed from: up */
    private boolean f24527up;

    /* JADX INFO: renamed from: x6 */
    private boolean f24528x6;

    /* JADX INFO: renamed from: yj */
    private int f24529yj;

    /* JADX INFO: renamed from: k4 */
    public static final C14077m4 f24512k4 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final int f24514x1 = wjx.m43736k4("enabled");

    /* JADX INFO: renamed from: kk */
    public static final int f24513kk = mj1.m36975k4("enabled");

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f24511ix = new C7017h4("presentation:start-page", "presentation:show", "presentation:full-screen", "presentation:endless", "presentation:pause", "presentation:show-logo", "presentation:force-manual", "presentation:mouse-visible", "presentation:mouse-as-pen", "presentation:start-with-navigator", "presentation:animations", "presentation:transition-on-click", "presentation:stay-on-top", "presentation:show-end-of-presentation-slide", "show");

    public i7n() {
        m33909x1();
    }

    public i7n(final AbstractC13912i5 abstractC13912i5) {
        m33909x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.i7n.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (i7n.f24511ix.m27428k4(str)) {
                    case 0:
                        i7n.this.f24526to = str2;
                        break;
                    case 1:
                        i7n.this.f24517du = str2;
                        break;
                    case 2:
                        i7n.this.f24520h4 = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        i7n.this.f24523m9 = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        AbstractC7361bz.m29294ks(str2).CloneTo(i7n.this.f24518dy);
                        break;
                    case 5:
                        i7n.this.f24515c5 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        i7n.this.f24521jd = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        i7n.this.f24516ck = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        i7n.this.f24519fa = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        i7n.this.f24527up = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        i7n.this.f24529yj = wjx.m43736k4(str2);
                        break;
                    case 11:
                        i7n.this.f24522ks = mj1.m36975k4(str2);
                        break;
                    case 12:
                        i7n.this.f24525rv = C13850af.m65068c5(str2);
                        break;
                    case 13:
                        i7n.this.f24528x6 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i7n.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (i7n.f24511ix.m27428k4(abstractC13912i5.mo65023fa()) != 14) {
                    return false;
                }
                i7n.this.f24524ne.addItem(new afv(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m33909x1() {
        this.f24520h4 = true;
        this.f24523m9 = false;
        f24512k4.CloneTo(this.f24518dy);
        this.f24515c5 = false;
        this.f24521jd = false;
        this.f24516ck = true;
        this.f24519fa = false;
        this.f24527up = false;
        this.f24529yj = f24514x1;
        this.f24522ks = f24513kk;
        this.f24525rv = false;
        this.f24528x6 = true;
        this.f24524ne = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f24526to;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:start-page", str3);
        }
        String str4 = this.f24517du;
        if (str4 != null) {
            c3059ii.m12955x1("presentation:show", str4);
        }
        boolean z = this.f24520h4;
        String str5 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("presentation:full-screen", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f24523m9;
        if (z2) {
            c3059ii.m12955x1("presentation:endless", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        if (C14077m4.m66795du(this.f24518dy, f24512k4)) {
            C22240OooOO0o.OooO00o(this.f24518dy, c3059ii, "presentation:pause");
        }
        boolean z3 = this.f24515c5;
        if (z3) {
            c3059ii.m12955x1("presentation:show-logo", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f24521jd;
        if (z4) {
            c3059ii.m12955x1("presentation:force-manual", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f24516ck;
        if (!z5) {
            c3059ii.m12955x1("presentation:mouse-visible", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z6 = this.f24519fa;
        if (z6) {
            c3059ii.m12955x1("presentation:mouse-as-pen", z6 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z7 = this.f24527up;
        if (z7) {
            c3059ii.m12955x1("presentation:start-with-navigator", z7 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f24529yj;
        if (i != f24514x1) {
            c3059ii.m12955x1("presentation:animations", wjx.m43737k4(i));
        }
        int i2 = this.f24522ks;
        if (i2 != f24513kk) {
            c3059ii.m12955x1("presentation:transition-on-click", mj1.m36976k4(i2));
        }
        boolean z8 = this.f24525rv;
        if (z8) {
            c3059ii.m12955x1("presentation:stay-on-top", z8 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z9 = this.f24528x6;
        if (!z9) {
            if (z9) {
                str5 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("presentation:show-end-of-presentation-slide", str5);
        }
        List.Enumerator<afv> it = this.f24524ne.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("presentation", c3059ii, "show");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
