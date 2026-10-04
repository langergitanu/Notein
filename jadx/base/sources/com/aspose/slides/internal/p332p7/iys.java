package com.aspose.slides.internal.p332p7;

import OoooooO.C21421OooO0oO;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class iys extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f24971h4 = new C7017h4("w_RsidRPr", "w_RsidDel", "w_RsidR", "rPr", "br", "t", "delText", "instrText", "delInstrText", "noBreakHyphen", "softHyphen", "dayShort", "monthShort", "yearShort", "dayLong", "monthLong", "yearLong", "annotationRef", "footnoteRef", "endnoteRef", "separator", "continuationSeparator", "sym", "pgNum", "cr", "tab", "object", "pict", "fldChar", "ruby", "footnoteReference", "endnoteReference", "commentReference", "drawing", "ptab", "lastRenderedPageBreak");

    /* JADX INFO: renamed from: du */
    private List<C7394ca> f24972du;

    /* JADX INFO: renamed from: k4 */
    private int f24973k4;

    /* JADX INFO: renamed from: kk */
    private int f24974kk;

    /* JADX INFO: renamed from: to */
    private mrm f24975to;

    /* JADX INFO: renamed from: x1 */
    private int f24976x1;

    public iys() {
        m34516x1();
    }

    public iys(final AbstractC13912i5 abstractC13912i5) {
        m34516x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.iys.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = iys.f24971h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    iys.this.f24973k4 = C14057f9.m66582k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    iys.this.f24976x1 = C14057f9.m66582k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                iys.this.f24974kk = C14057f9.m66582k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iys.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                jx2 jx2Var;
                List list2;
                String str;
                switch (iys.f24971h4.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        iys.this.f24975to = new mrm(abstractC13912i5);
                        return true;
                    case 4:
                        lwe lweVar = new lwe(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("br", lweVar);
                        list.addItem(c7394ca);
                        return true;
                    case 5:
                        q4n q4nVar = new q4n(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("t", q4nVar);
                        list.addItem(c7394ca);
                        return true;
                    case 6:
                        q4n q4nVar2 = new q4n(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("delText", q4nVar2);
                        list.addItem(c7394ca);
                        return true;
                    case 7:
                        q4n q4nVar3 = new q4n(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("instrText", q4nVar3);
                        list.addItem(c7394ca);
                        return true;
                    case 8:
                        q4n q4nVar4 = new q4n(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("delInstrText", q4nVar4);
                        list.addItem(c7394ca);
                        return true;
                    case 9:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "noBreakHyphen";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 10:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "softHyphen";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 11:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "dayShort";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 12:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "monthShort";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 13:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "yearShort";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 14:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "dayLong";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 15:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "monthLong";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 16:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "yearLong";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 17:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "annotationRef";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 18:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "footnoteRef";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 19:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "endnoteRef";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 20:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "separator";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 21:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "continuationSeparator";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 22:
                        ryy ryyVar = new ryy(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("sym", ryyVar);
                        list.addItem(c7394ca);
                        return true;
                    case 23:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "pgNum";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 24:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "cr";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 25:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "tab";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    case 26:
                        vah vahVar = new vah(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("object", vahVar);
                        list.addItem(c7394ca);
                        return true;
                    case 27:
                        ozv ozvVar = new ozv(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("pict", ozvVar);
                        list.addItem(c7394ca);
                        return true;
                    case 28:
                        ke2 ke2Var = new ke2(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("fldChar", ke2Var);
                        list.addItem(c7394ca);
                        return true;
                    case 29:
                        cjc cjcVar = new cjc(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("ruby", cjcVar);
                        list.addItem(c7394ca);
                        return true;
                    case 30:
                        fsa fsaVar = new fsa(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("footnoteReference", fsaVar);
                        list.addItem(c7394ca);
                        return true;
                    case 31:
                        fsa fsaVar2 = new fsa(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("endnoteReference", fsaVar2);
                        list.addItem(c7394ca);
                        return true;
                    case 32:
                        C21421OooO0oO.OooO0O0("commentReference", new skj(abstractC13912i5), iys.this.f24972du);
                        return true;
                    case 33:
                        slj sljVar = new slj(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("drawing", sljVar);
                        list.addItem(c7394ca);
                        return true;
                    case 34:
                        rdg rdgVar = new rdg(abstractC13912i5);
                        list = iys.this.f24972du;
                        c7394ca = new C7394ca("ptab", rdgVar);
                        list.addItem(c7394ca);
                        return true;
                    case 35:
                        jx2Var = new jx2(abstractC13912i5);
                        list2 = iys.this.f24972du;
                        str = "lastRenderedPageBreak";
                        OooOOO.OooO00o(str, jx2Var, list2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m34516x1() {
        this.f24973k4 = 0;
        this.f24976x1 = 0;
        this.f24974kk = 0;
        this.f24972du = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        q4n q4nVar;
        String strM29539k4;
        jx2 jx2Var;
        String strM29539k42;
        fsa fsaVar;
        String strM29539k43;
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f24973k4;
        if (i != 0) {
            c3059ii.m12955x1("w:rsidRPr", C13850af.m65103k4(i));
        }
        int i2 = this.f24976x1;
        if (i2 != 0) {
            c3059ii.m12955x1("w:rsidDel", C13850af.m65103k4(i2));
        }
        int i3 = this.f24974kk;
        if (i3 != 0) {
            c3059ii.m12955x1("w:rsidR", C13850af.m65103k4(i3));
        }
        mrm mrmVar = this.f24975to;
        if (mrmVar != null) {
            mrmVar.mo6846k4("w", c3059ii, "rPr");
        }
        List.Enumerator<C7394ca> it = this.f24972du.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f24971h4.m27428k4(next.m29539k4())) {
                    case 4:
                        ((lwe) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        q4nVar = (q4n) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        q4nVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 6:
                        q4nVar = (q4n) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        q4nVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 7:
                        q4nVar = (q4n) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        q4nVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 8:
                        q4nVar = (q4n) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        q4nVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 9:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 10:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 11:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 12:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 13:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 14:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 15:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 16:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 17:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 18:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 19:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 20:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 21:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 22:
                        ((ryy) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 24:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 25:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 26:
                        ((vah) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 27:
                        ((ozv) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 28:
                        ((ke2) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 29:
                        ((cjc) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 30:
                        fsaVar = (fsa) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        fsaVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 31:
                        fsaVar = (fsa) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        fsaVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 32:
                        ((skj) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 33:
                        ((slj) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 34:
                        ((rdg) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 35:
                        jx2Var = (jx2) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        jx2Var.mo6846k4("w", c3059ii, strM29539k42);
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
        c3059ii.mo21898jd();
    }
}
