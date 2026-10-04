package com.aspose.slides.internal.p332p7;

import OoooooO.C21445Oooo;
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
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class psc extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f28552fa = new C7017h4("style:display", "tracked-changes", "variable-decls", "sequence-decls", "user-field-decls", "dde-connection-decls", "alphabetical-index-auto-mark-file", C18773h.f57233c, ContextChain.TAG_PRODUCT, "list", "table", "section", "table-of-content", "illustration-index", "table-index", "object-index", "user-index", "alphabetical-index", "bibliography", "index-title", "change", "change-start", "change-end", "region-left", "region-center", "region-right");

    /* JADX INFO: renamed from: c5 */
    private xdd f28553c5;

    /* JADX INFO: renamed from: ck */
    private xdd f28554ck;

    /* JADX INFO: renamed from: du */
    private ge7 f28555du;

    /* JADX INFO: renamed from: dy */
    private List<C7394ca> f28556dy;

    /* JADX INFO: renamed from: h4 */
    private klp f28557h4;

    /* JADX INFO: renamed from: jd */
    private xdd f28558jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f28559k4;

    /* JADX INFO: renamed from: kk */
    private wyh f28560kk;

    /* JADX INFO: renamed from: m9 */
    private au9 f28561m9;

    /* JADX INFO: renamed from: to */
    private ht5 f28562to;

    /* JADX INFO: renamed from: x1 */
    private nxm f28563x1;

    public psc() {
        m39109x1();
    }

    public psc(final AbstractC13912i5 abstractC13912i5) {
        m39109x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.psc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (psc.f28552fa.m27428k4(str) != 0) {
                    return false;
                }
                psc.this.f28559k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.psc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                wiq wiqVar;
                List list2;
                String str;
                switch (psc.f28552fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        psc.this.f28563x1 = new nxm(abstractC13912i5);
                        return true;
                    case 2:
                        psc.this.f28560kk = new wyh(abstractC13912i5);
                        return true;
                    case 3:
                        psc.this.f28562to = new ht5(abstractC13912i5);
                        return true;
                    case 4:
                        psc.this.f28555du = new ge7(abstractC13912i5);
                        return true;
                    case 5:
                        psc.this.f28557h4 = new klp(abstractC13912i5);
                        return true;
                    case 6:
                        psc.this.f28561m9 = new au9(abstractC13912i5);
                        return true;
                    case 7:
                        kmn kmnVar = new kmn(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca(C18773h.f57233c, kmnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 8:
                        C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), psc.this.f28556dy);
                        return true;
                    case 9:
                        C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), psc.this.f28556dy);
                        return true;
                    case 10:
                        n6p n6pVar = new n6p(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("table", n6pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 11:
                        gd6 gd6Var = new gd6(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("section", gd6Var);
                        list.addItem(c7394ca);
                        return true;
                    case 12:
                        oew oewVar = new oew(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("table-of-content", oewVar);
                        list.addItem(c7394ca);
                        return true;
                    case 13:
                        ywb ywbVar = new ywb(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("illustration-index", ywbVar);
                        list.addItem(c7394ca);
                        return true;
                    case 14:
                        etq etqVar = new etq(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("table-index", etqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 15:
                        c7p c7pVar = new c7p(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("object-index", c7pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 16:
                        f2w f2wVar = new f2w(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("user-index", f2wVar);
                        list.addItem(c7394ca);
                        return true;
                    case 17:
                        f5k f5kVar = new f5k(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("alphabetical-index", f5kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 18:
                        mqt mqtVar = new mqt(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("bibliography", mqtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 19:
                        nps npsVar = new nps(abstractC13912i5);
                        list = psc.this.f28556dy;
                        c7394ca = new C7394ca("index-title", npsVar);
                        list.addItem(c7394ca);
                        return true;
                    case 20:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = psc.this.f28556dy;
                        str = "change";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 21:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = psc.this.f28556dy;
                        str = "change-start";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 22:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = psc.this.f28556dy;
                        str = "change-end";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 23:
                        psc.this.f28553c5 = new xdd(abstractC13912i5);
                        return true;
                    case 24:
                        psc.this.f28558jd = new xdd(abstractC13912i5);
                        return true;
                    case 25:
                        psc.this.f28554ck = new xdd(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39109x1() {
        this.f28559k4 = true;
        this.f28556dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        wiq wiqVar;
        String strM29539k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f28559k4;
        if (!z) {
            c3059ii.m12955x1("style:display", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        nxm nxmVar = this.f28563x1;
        if (nxmVar != null) {
            nxmVar.mo6846k4("text", c3059ii, "tracked-changes");
        }
        wyh wyhVar = this.f28560kk;
        if (wyhVar != null) {
            wyhVar.mo6846k4("text", c3059ii, "variable-decls");
        }
        ht5 ht5Var = this.f28562to;
        if (ht5Var != null) {
            ht5Var.mo6846k4("text", c3059ii, "sequence-decls");
        }
        ge7 ge7Var = this.f28555du;
        if (ge7Var != null) {
            ge7Var.mo6846k4("text", c3059ii, "user-field-decls");
        }
        klp klpVar = this.f28557h4;
        if (klpVar != null) {
            klpVar.mo6846k4("text", c3059ii, "dde-connection-decls");
        }
        au9 au9Var = this.f28561m9;
        if (au9Var != null) {
            au9Var.mo6846k4("text", c3059ii, "alphabetical-index-auto-mark-file");
        }
        List.Enumerator<C7394ca> it = this.f28556dy.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28552fa.m27428k4(next.m29539k4())) {
                    case 7:
                        ((kmn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 8:
                        ((ok7) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 9:
                        ((lxj) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 10:
                        ((n6p) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        continue;
                    case 11:
                        ((gd6) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 12:
                        ((oew) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 13:
                        ((ywb) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 14:
                        ((etq) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 15:
                        ((c7p) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 16:
                        ((f2w) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 17:
                        ((f5k) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 18:
                        ((mqt) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 19:
                        ((nps) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 20:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 21:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 22:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    default:
                        continue;
                }
                wiqVar.mo6846k4("text", c3059ii, strM29539k4);
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
        xdd xddVar = this.f28553c5;
        if (xddVar != null) {
            xddVar.mo6846k4("style", c3059ii, "region-left");
        }
        xdd xddVar2 = this.f28558jd;
        if (xddVar2 != null) {
            xddVar2.mo6846k4("style", c3059ii, "region-center");
        }
        xdd xddVar3 = this.f28554ck;
        if (xddVar3 != null) {
            xddVar3.mo6846k4("style", c3059ii, "region-right");
        }
        c3059ii.mo21898jd();
    }
}
