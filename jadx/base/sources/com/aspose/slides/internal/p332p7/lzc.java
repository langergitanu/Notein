package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lzc extends AbstractC7361bz {

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f26605yj = new C7017h4("style:name", "style:display-name", "style:parent-style-name", "style:next-style-name", "style:list-style-name", "style:master-page-name", "style:auto-update", "style:data-style-name", "style:class", "style:default-outline-level", "style:family", "chart-properties", "graphic-properties", "table-cell-properties", "paragraph-properties", "text-properties", "section-properties", "ruby-properties", "table-properties", "table-column-properties", "table-row-properties", "drawing-page-properties", "map");

    /* JADX INFO: renamed from: c5 */
    private String f26606c5;

    /* JADX INFO: renamed from: ck */
    private int f26607ck;

    /* JADX INFO: renamed from: du */
    private String f26608du;

    /* JADX INFO: renamed from: dy */
    private String f26609dy;

    /* JADX INFO: renamed from: fa */
    private List<C7394ca> f26610fa;

    /* JADX INFO: renamed from: h4 */
    private String f26611h4;

    /* JADX INFO: renamed from: jd */
    private long f26612jd;

    /* JADX INFO: renamed from: k4 */
    private String f26613k4;

    /* JADX INFO: renamed from: kk */
    private String f26614kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f26615m9;

    /* JADX INFO: renamed from: to */
    private String f26616to;

    /* JADX INFO: renamed from: up */
    private List<abb> f26617up;

    /* JADX INFO: renamed from: x1 */
    private String f26618x1;

    public lzc() {
        m36534h4();
    }

    /* JADX INFO: renamed from: kk */
    public final int m36549kk() {
        return this.f26607ck;
    }

    /* JADX INFO: renamed from: to */
    public final List<C7394ca> m36550to() {
        return this.f26610fa;
    }

    public lzc(final AbstractC13912i5 abstractC13912i5) {
        m36534h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lzc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (lzc.f26605yj.m27428k4(str)) {
                    case 0:
                        lzc.this.f26613k4 = str2;
                        break;
                    case 1:
                        lzc.this.f26618x1 = str2;
                        break;
                    case 2:
                        lzc.this.f26614kk = str2;
                        break;
                    case 3:
                        lzc.this.f26616to = str2;
                        break;
                    case 4:
                        lzc.this.f26608du = str2;
                        break;
                    case 5:
                        lzc.this.f26611h4 = str2;
                        break;
                    case 6:
                        lzc.this.f26615m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        lzc.this.f26609dy = str2;
                        break;
                    case 8:
                        lzc.this.f26606c5 = str2;
                        break;
                    case 9:
                        lzc.this.f26612jd = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 10:
                        lzc.this.f26607ck = hj7.m33486k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lzc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (lzc.f26605yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 11:
                        im9 im9Var = new im9(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("chart-properties", im9Var);
                        break;
                    case 12:
                        rsv rsvVar = new rsv(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("graphic-properties", rsvVar);
                        break;
                    case 13:
                        v9h v9hVar = new v9h(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("table-cell-properties", v9hVar);
                        break;
                    case 14:
                        mdp mdpVar = new mdp(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("paragraph-properties", mdpVar);
                        break;
                    case 15:
                        zob zobVar = new zob(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("text-properties", zobVar);
                        break;
                    case 16:
                        lgn lgnVar = new lgn(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("section-properties", lgnVar);
                        break;
                    case 17:
                        eej eejVar = new eej(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("ruby-properties", eejVar);
                        break;
                    case 18:
                        crt crtVar = new crt(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("table-properties", crtVar);
                        break;
                    case 19:
                        enf enfVar = new enf(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("table-column-properties", enfVar);
                        break;
                    case 20:
                        hj8 hj8Var = new hj8(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("table-row-properties", hj8Var);
                        break;
                    case 21:
                        nk7 nk7Var = new nk7(abstractC13912i5);
                        list = lzc.this.f26610fa;
                        c7394ca = new C7394ca("drawing-page-properties", nk7Var);
                        break;
                    case 22:
                        lzc.this.f26617up.addItem(new abb(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    private void m36534h4() {
        this.f26615m9 = false;
        this.f26612jd = 4294967295L;
        this.f26607ck = 0;
        this.f26610fa = new List<>();
        this.f26617up = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m36551x1() {
        return this.f26614kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m36545k4(String str) {
        C7394ca c7394ca;
        switch (f26605yj.m27428k4(str)) {
            case 11:
                c7394ca = new C7394ca("chart-properties", new im9());
                break;
            case 12:
                c7394ca = new C7394ca("graphic-properties", new rsv());
                break;
            case 13:
                c7394ca = new C7394ca("table-cell-properties", new v9h());
                break;
            case 14:
                c7394ca = new C7394ca("paragraph-properties", new mdp());
                break;
            case 15:
                c7394ca = new C7394ca("text-properties", new zob());
                break;
            case 16:
                c7394ca = new C7394ca("section-properties", new lgn());
                break;
            case 17:
                c7394ca = new C7394ca("ruby-properties", new eej());
                break;
            case 18:
                c7394ca = new C7394ca("table-properties", new crt());
                break;
            case 19:
                c7394ca = new C7394ca("table-column-properties", new enf());
                break;
            case 20:
                c7394ca = new C7394ca("table-row-properties", new hj8());
                break;
            case 21:
                c7394ca = new C7394ca("drawing-page-properties", new nk7());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f26610fa.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m36552x1(String str) {
        this.f26613k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36546k4() {
        return this.f26613k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36547k4(int i) {
        this.f26607ck = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36548k4(C7394ca c7394ca) {
        this.f26610fa.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f26613k4);
        String str3 = this.f26618x1;
        if (str3 != null) {
            c3059ii.m12955x1("style:display-name", str3);
        }
        String str4 = this.f26614kk;
        if (str4 != null) {
            c3059ii.m12955x1("style:parent-style-name", str4);
        }
        String str5 = this.f26616to;
        if (str5 != null) {
            c3059ii.m12955x1("style:next-style-name", str5);
        }
        String str6 = this.f26608du;
        if (str6 != null) {
            c3059ii.m12955x1("style:list-style-name", str6);
        }
        String str7 = this.f26611h4;
        if (str7 != null) {
            c3059ii.m12955x1("style:master-page-name", str7);
        }
        boolean z = this.f26615m9;
        if (z) {
            c3059ii.m12955x1("style:auto-update", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str8 = this.f26609dy;
        if (str8 != null) {
            c3059ii.m12955x1("style:data-style-name", str8);
        }
        String str9 = this.f26606c5;
        if (str9 != null) {
            c3059ii.m12955x1("style:class", str9);
        }
        long j = this.f26612jd;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("style:default-outline-level", C13850af.m65147x1(j));
        }
        c3059ii.m12955x1("style:family", hj7.m33487k4(this.f26607ck));
        List.Enumerator<C7394ca> it = this.f26610fa.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f26605yj.m27428k4(next.m29539k4())) {
                    case 11:
                        ((im9) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((rsv) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((v9h) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((mdp) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((zob) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((lgn) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((eej) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((crt) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((enf) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((hj8) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((nk7) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<abb> it2 = this.f26617up.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("style", c3059ii, "map");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
