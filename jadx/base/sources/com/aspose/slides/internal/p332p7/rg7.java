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
public class rg7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f29285k4 = se2.m40990k4("document");

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f29286yj = new C7017h4("text:index-scope", "text:relative-tab-stop-position", "text:index-name", "text:use-index-marks", "text:use-graphics", "text:use-tables", "text:use-floating-frames", "text:use-objects", "text:copy-outline-levels", "index-title-template", "user-index-entry-template", "index-source-styles");

    /* JADX INFO: renamed from: c5 */
    private boolean f29287c5;

    /* JADX INFO: renamed from: ck */
    private pzs f29288ck;

    /* JADX INFO: renamed from: du */
    private boolean f29289du;

    /* JADX INFO: renamed from: dy */
    private boolean f29290dy;

    /* JADX INFO: renamed from: fa */
    private List<x3l> f29291fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f29292h4;

    /* JADX INFO: renamed from: jd */
    private boolean f29293jd;

    /* JADX INFO: renamed from: kk */
    private boolean f29294kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f29295m9;

    /* JADX INFO: renamed from: to */
    private String f29296to;

    /* JADX INFO: renamed from: up */
    private List<o8s> f29297up;

    /* JADX INFO: renamed from: x1 */
    private int f29298x1;

    public rg7() {
        m39998x1();
    }

    public rg7(final AbstractC13912i5 abstractC13912i5) {
        m39998x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rg7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (rg7.f29286yj.m27428k4(str)) {
                    case 0:
                        rg7.this.f29298x1 = se2.m40990k4(str2);
                        break;
                    case 1:
                        rg7.this.f29294kk = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        rg7.this.f29296to = str2;
                        break;
                    case 3:
                        rg7.this.f29289du = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        rg7.this.f29292h4 = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        rg7.this.f29295m9 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        rg7.this.f29290dy = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        rg7.this.f29287c5 = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        rg7.this.f29293jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rg7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz x3lVar;
                List list;
                switch (rg7.f29286yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        rg7.this.f29288ck = new pzs(abstractC13912i5);
                        return true;
                    case 10:
                        x3lVar = new x3l(abstractC13912i5);
                        list = rg7.this.f29291fa;
                        break;
                    case 11:
                        x3lVar = new o8s(abstractC13912i5);
                        list = rg7.this.f29297up;
                        break;
                    default:
                        return false;
                }
                list.addItem(x3lVar);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39998x1() {
        this.f29298x1 = f29285k4;
        this.f29294kk = true;
        this.f29289du = false;
        this.f29292h4 = false;
        this.f29295m9 = false;
        this.f29290dy = false;
        this.f29287c5 = false;
        this.f29293jd = false;
        this.f29291fa = new List<>();
        this.f29297up = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29298x1;
        if (i != f29285k4) {
            c3059ii.m12955x1("text:index-scope", se2.m40991k4(i));
        }
        boolean z = this.f29294kk;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (!z) {
            c3059ii.m12955x1("text:relative-tab-stop-position", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.m12955x1("text:index-name", this.f29296to);
        boolean z2 = this.f29289du;
        if (z2) {
            c3059ii.m12955x1("text:use-index-marks", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f29292h4;
        if (z3) {
            c3059ii.m12955x1("text:use-graphics", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f29295m9;
        if (z4) {
            c3059ii.m12955x1("text:use-tables", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f29290dy;
        if (z5) {
            c3059ii.m12955x1("text:use-floating-frames", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z6 = this.f29287c5;
        if (z6) {
            c3059ii.m12955x1("text:use-objects", z6 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z7 = this.f29293jd;
        if (z7) {
            if (z7) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:copy-outline-levels", str3);
        }
        pzs pzsVar = this.f29288ck;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        List.Enumerator<o8s> it = this.f29291fa.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "user-index-entry-template");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f29297up.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "index-source-styles");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
