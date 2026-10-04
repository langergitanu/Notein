package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bw */
/* JADX INFO: loaded from: classes4.dex */
public class C7355bw extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f20744up = new C7017h4("xml:id", "manufacturer", "model", "serialNo", "specificationRef", "description", "traceFormat", "sampleRate", "latency", "activeArea", "sourceProperty", "channelProperties");

    /* JADX INFO: renamed from: c5 */
    private C7983j9 f20745c5;

    /* JADX INFO: renamed from: ck */
    private List<C8149kz> f20746ck;

    /* JADX INFO: renamed from: du */
    private String f20747du;

    /* JADX INFO: renamed from: dy */
    private C8385nw f20748dy;

    /* JADX INFO: renamed from: fa */
    private C9375zk f20749fa;

    /* JADX INFO: renamed from: h4 */
    private String f20750h4;

    /* JADX INFO: renamed from: jd */
    private C8357nl f20751jd;

    /* JADX INFO: renamed from: k4 */
    private String f20752k4;

    /* JADX INFO: renamed from: kk */
    private String f20753kk;

    /* JADX INFO: renamed from: m9 */
    private C9340z3 f20754m9;

    /* JADX INFO: renamed from: to */
    private String f20755to;

    /* JADX INFO: renamed from: x1 */
    private String f20756x1;

    public C7355bw() {
        m29176yj();
    }

    /* JADX INFO: renamed from: yj */
    private void m29176yj() {
        this.f20746ck = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final C7983j9 m29177c5() {
        return this.f20745c5;
    }

    /* JADX INFO: renamed from: ck */
    public final C8149kz[] m29178ck() {
        return this.f20746ck.toArray(new C8149kz[0]);
    }

    /* JADX INFO: renamed from: du */
    public final String m29179du() {
        return this.f20747du;
    }

    /* JADX INFO: renamed from: dy */
    public final C8385nw m29181dy() {
        return this.f20748dy;
    }

    /* JADX INFO: renamed from: fa */
    public final C9375zk m29182fa() {
        return this.f20749fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m29183h4() {
        return this.f20750h4;
    }

    /* JADX INFO: renamed from: jd */
    public final C8357nl m29185jd() {
        return this.f20751jd;
    }

    /* JADX INFO: renamed from: kk */
    public final String m29193kk() {
        return this.f20753kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C9340z3 m29195m9() {
        return this.f20754m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m29196to() {
        return this.f20755to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29198x1() {
        return this.f20756x1;
    }

    public C7355bw(final AbstractC13912i5 abstractC13912i5) {
        m29176yj();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7355bw.f20744up.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7355bw.this.f20752k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7355bw.this.f20756x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7355bw.this.f20753kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7355bw.this.f20755to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7355bw.this.f20747du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7355bw.this.f20750h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C7355bw.f20744up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        C7355bw.this.f20754m9 = new C9340z3(abstractC13912i5);
                        return true;
                    case 7:
                        C7355bw.this.f20748dy = new C8385nw(abstractC13912i5);
                        return true;
                    case 8:
                        C7355bw.this.f20745c5 = new C7983j9(abstractC13912i5);
                        return true;
                    case 9:
                        C7355bw.this.f20751jd = new C8357nl(abstractC13912i5);
                        return true;
                    case 10:
                        C7355bw.this.f20746ck.addItem(new C8149kz(abstractC13912i5));
                        return true;
                    case 11:
                        C7355bw.this.f20749fa = new C9375zk(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final void m29180du(String str) {
        this.f20747du = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m29184h4(String str) {
        this.f20750h4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m29194kk(String str) {
        this.f20753kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m29197to(String str) {
        this.f20755to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29199x1(String str) {
        this.f20756x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29186k4() {
        return this.f20752k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29187k4(C7983j9 c7983j9) {
        this.f20745c5 = c7983j9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29188k4(C8357nl c8357nl) {
        this.f20751jd = c8357nl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29189k4(C8385nw c8385nw) {
        this.f20748dy = c8385nw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29190k4(C9340z3 c9340z3) {
        this.f20754m9 = c9340z3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29191k4(C9375zk c9375zk) {
        this.f20749fa = c9375zk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29192k4(String str) {
        this.f20752k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xml:id", this.f20752k4);
        String str3 = this.f20756x1;
        if (str3 != null) {
            c3059ii.m12955x1("manufacturer", str3);
        }
        String str4 = this.f20753kk;
        if (str4 != null) {
            c3059ii.m12955x1("model", str4);
        }
        String str5 = this.f20755to;
        if (str5 != null) {
            c3059ii.m12955x1("serialNo", str5);
        }
        String str6 = this.f20747du;
        if (str6 != null) {
            c3059ii.m12955x1("specificationRef", str6);
        }
        String str7 = this.f20750h4;
        if (str7 != null) {
            c3059ii.m12955x1("description", str7);
        }
        C9340z3 c9340z3 = this.f20754m9;
        if (c9340z3 != null) {
            c9340z3.mo6846k4("inkml", c3059ii, "traceFormat");
        }
        C8385nw c8385nw = this.f20748dy;
        if (c8385nw != null) {
            c8385nw.mo6846k4("inkml", c3059ii, "sampleRate");
        }
        C7983j9 c7983j9 = this.f20745c5;
        if (c7983j9 != null) {
            c7983j9.mo6846k4("inkml", c3059ii, "latency");
        }
        C8357nl c8357nl = this.f20751jd;
        if (c8357nl != null) {
            c8357nl.mo6846k4("inkml", c3059ii, "activeArea");
        }
        List.Enumerator<C8149kz> it = this.f20746ck.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("inkml", c3059ii, "sourceProperty");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C9375zk c9375zk = this.f20749fa;
        if (c9375zk != null) {
            c9375zk.mo6846k4("inkml", c3059ii, "channelProperties");
        }
        c3059ii.mo21898jd();
    }
}
