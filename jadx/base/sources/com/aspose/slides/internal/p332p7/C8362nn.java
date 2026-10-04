package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nn */
/* JADX INFO: loaded from: classes4.dex */
public class C8362nn extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27472to = new C7017h4("m:rPr", "a:rPr", "w:br", "w:t", "w:delText", "w:instrText", "w:delInstrText", "w:noBreakHyphen", "w:softHyphen", "w:dayShort", "w:monthShort", "w:yearShort", "w:dayLong", "w:monthLong", "w:yearLong", "w:annotationRef", "w:footnoteRef", "w:endnoteRef", "w:separator", "w:continuationSeparator", "w:sym", "w:pgNum", "w:cr", "w:tab", "w:object", "w:pict", "w:fldChar", "w:ruby", "w:footnoteReference", "w:endnoteReference", "w:commentReference", "w:drawing", "w:ptab", "w:lastRenderedPageBreak", "m:t");

    /* JADX INFO: renamed from: k4 */
    private C7330bl f27473k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f27474kk;

    /* JADX INFO: renamed from: x1 */
    private C9135ws f27475x1;

    public C8362nn() {
        m37720h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m37720h4() {
        this.f27474kk = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final List<C7394ca> m37721du() {
        return this.f27474kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7330bl m37722k4() {
        if (this.f27473k4 != null) {
            throw new Exception("Only one <rPr> element can be added.");
        }
        C7330bl c7330bl = new C7330bl();
        this.f27473k4 = c7330bl;
        return c7330bl;
    }

    /* JADX INFO: renamed from: kk */
    public final C7330bl m37724kk() {
        return this.f27473k4;
    }

    /* JADX INFO: renamed from: to */
    public final C9135ws m37725to() {
        return this.f27475x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9135ws m37726x1() {
        if (this.f27475x1 != null) {
            throw new Exception("Only one <rPr2> element can be added.");
        }
        C9135ws c9135ws = new C9135ws();
        this.f27475x1 = c9135ws;
        return c9135ws;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        r2.addItem(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8362nn(AbstractC13912i5 abstractC13912i5) {
        List<C7394ca> list;
        C7394ca c7394ca;
        m37720h4();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f27472to.m27428k4(C14113y2.m67408k4(abstractC13912i5.mo65060yj(), C18241k5.f55433h, abstractC13912i5.mo65023fa()))) {
                        case 0:
                            this.f27473k4 = new C7330bl(abstractC13912i5);
                            break;
                        case 1:
                            this.f27475x1 = new C9135ws(abstractC13912i5);
                            break;
                        case 2:
                            lwe lweVar = new lwe(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "br"), lweVar);
                            break;
                        case 3:
                            this.f27474kk.addItem(new C7394ca(C14113y2.m67408k4("w:", "t"), new q4n(abstractC13912i5)));
                            break;
                        case 4:
                            q4n q4nVar = new q4n(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "delText"), q4nVar);
                            break;
                        case 5:
                            q4n q4nVar2 = new q4n(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "instrText"), q4nVar2);
                            break;
                        case 6:
                            q4n q4nVar3 = new q4n(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "delInstrText"), q4nVar3);
                            break;
                        case 7:
                            jx2 jx2Var = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "noBreakHyphen"), jx2Var);
                            break;
                        case 8:
                            jx2 jx2Var2 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "softHyphen"), jx2Var2);
                            break;
                        case 9:
                            jx2 jx2Var3 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "dayShort"), jx2Var3);
                            break;
                        case 10:
                            jx2 jx2Var4 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "monthShort"), jx2Var4);
                            break;
                        case 11:
                            jx2 jx2Var5 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "yearShort"), jx2Var5);
                            break;
                        case 12:
                            jx2 jx2Var6 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "dayLong"), jx2Var6);
                            break;
                        case 13:
                            jx2 jx2Var7 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "monthLong"), jx2Var7);
                            break;
                        case 14:
                            jx2 jx2Var8 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "yearLong"), jx2Var8);
                            break;
                        case 15:
                            jx2 jx2Var9 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "annotationRef"), jx2Var9);
                            break;
                        case 16:
                            jx2 jx2Var10 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "footnoteRef"), jx2Var10);
                            break;
                        case 17:
                            jx2 jx2Var11 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "endnoteRef"), jx2Var11);
                            break;
                        case 18:
                            jx2 jx2Var12 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "separator"), jx2Var12);
                            break;
                        case 19:
                            jx2 jx2Var13 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "continuationSeparator"), jx2Var13);
                            break;
                        case 20:
                            ryy ryyVar = new ryy(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "sym"), ryyVar);
                            break;
                        case 21:
                            jx2 jx2Var14 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "pgNum"), jx2Var14);
                            break;
                        case 22:
                            jx2 jx2Var15 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "cr"), jx2Var15);
                            break;
                        case 23:
                            jx2 jx2Var16 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "tab"), jx2Var16);
                            break;
                        case 24:
                            vah vahVar = new vah(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "object"), vahVar);
                            break;
                        case 25:
                            ozv ozvVar = new ozv(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "pict"), ozvVar);
                            break;
                        case 26:
                            ke2 ke2Var = new ke2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "fldChar"), ke2Var);
                            break;
                        case 27:
                            cjc cjcVar = new cjc(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "ruby"), cjcVar);
                            break;
                        case 28:
                            fsa fsaVar = new fsa(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "footnoteReference"), fsaVar);
                            break;
                        case 29:
                            fsa fsaVar2 = new fsa(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "endnoteReference"), fsaVar2);
                            break;
                        case 30:
                            skj skjVar = new skj(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "commentReference"), skjVar);
                            break;
                        case 31:
                            slj sljVar = new slj(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "drawing"), sljVar);
                            break;
                        case 32:
                            rdg rdgVar = new rdg(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "ptab"), rdgVar);
                            break;
                        case 33:
                            jx2 jx2Var17 = new jx2(abstractC13912i5);
                            list = this.f27474kk;
                            c7394ca = new C7394ca(C14113y2.m67408k4("w:", "lastRenderedPageBreak"), jx2Var17);
                            break;
                        case 34:
                            this.f27474kk.addItem(new C7394ca(C14113y2.m67408k4("m:", "t"), new C9051vl(abstractC13912i5)));
                            break;
                        default:
                            abstractC13912i5.mo65208bv();
                            if (!abstractC13912i5.mo65015ar()) {
                            }
                            break;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37723k4(C7394ca c7394ca) {
        this.f27474kk.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        q4n q4nVar;
        String str3;
        jx2 jx2Var;
        String str4;
        fsa fsaVar;
        String str5;
        c3059ii.mo12953k4(str, str2, (String) null);
        C7330bl c7330bl = this.f27473k4;
        if (c7330bl != null) {
            c7330bl.mo6846k4("m", c3059ii, "rPr");
        }
        C9135ws c9135ws = this.f27475x1;
        if (c9135ws != null) {
            c9135ws.mo6846k4("a", c3059ii, "rPr");
        }
        List.Enumerator<C7394ca> it = this.f27474kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f27472to.m27428k4(next.m29539k4())) {
                    case 2:
                        ((lwe) next.m29541kk()).mo6846k4("w", c3059ii, "br");
                        break;
                    case 3:
                        ((q4n) next.m29541kk()).mo6846k4("w", c3059ii, "t");
                        break;
                    case 4:
                        q4nVar = (q4n) next.m29541kk();
                        str3 = "delText";
                        q4nVar.mo6846k4("w", c3059ii, str3);
                        break;
                    case 5:
                        q4nVar = (q4n) next.m29541kk();
                        str3 = "instrText";
                        q4nVar.mo6846k4("w", c3059ii, str3);
                        break;
                    case 6:
                        q4nVar = (q4n) next.m29541kk();
                        str3 = "delInstrText";
                        q4nVar.mo6846k4("w", c3059ii, str3);
                        break;
                    case 7:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "noBreakHyphen";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 8:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "softHyphen";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 9:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "dayShort";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 10:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "monthShort";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 11:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "yearShort";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 12:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "dayLong";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 13:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "monthLong";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 14:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "yearLong";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 15:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "annotationRef";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 16:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "footnoteRef";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 17:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "endnoteRef";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 18:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "separator";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 19:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "continuationSeparator";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 20:
                        ((ryy) next.m29541kk()).mo6846k4("w", c3059ii, "sym");
                        break;
                    case 21:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "pgNum";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 22:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "cr";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 23:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "tab";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 24:
                        ((vah) next.m29541kk()).mo6846k4("w", c3059ii, "object");
                        break;
                    case 25:
                        ((ozv) next.m29541kk()).mo6846k4("w", c3059ii, "pict");
                        break;
                    case 26:
                        ((ke2) next.m29541kk()).mo6846k4("w", c3059ii, "fldChar");
                        break;
                    case 27:
                        ((cjc) next.m29541kk()).mo6846k4("w", c3059ii, "ruby");
                        break;
                    case 28:
                        fsaVar = (fsa) next.m29541kk();
                        str5 = "footnoteReference";
                        fsaVar.mo6846k4("w", c3059ii, str5);
                        break;
                    case 29:
                        fsaVar = (fsa) next.m29541kk();
                        str5 = "endnoteReference";
                        fsaVar.mo6846k4("w", c3059ii, str5);
                        break;
                    case 30:
                        ((skj) next.m29541kk()).mo6846k4("w", c3059ii, "commentReference");
                        break;
                    case 31:
                        ((slj) next.m29541kk()).mo6846k4("w", c3059ii, "drawing");
                        break;
                    case 32:
                        ((rdg) next.m29541kk()).mo6846k4("w", c3059ii, "ptab");
                        break;
                    case 33:
                        jx2Var = (jx2) next.m29541kk();
                        str4 = "lastRenderedPageBreak";
                        jx2Var.mo6846k4("w", c3059ii, str4);
                        break;
                    case 34:
                        ((C9051vl) next.m29541kk()).mo6846k4("m", c3059ii, "t");
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
