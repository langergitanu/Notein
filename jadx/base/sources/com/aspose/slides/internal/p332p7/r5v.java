package com.aspose.slides.internal.p332p7;

import OoooooO.C21421OooO0oO;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class r5v extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f29178dy = new C7017h4("w_TgtFrame", "w_Tooltip", "w_DocLocation", "w_History", "w_Anchor", "r:id", "customXml", "smartTag", "sdt", "r", "proofErr", "permStart", "permEnd", "bookmarkStart", "bookmarkEnd", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd", "commentRangeStart", "commentRangeEnd", "customXmlInsRangeStart", "customXmlInsRangeEnd", "customXmlDelRangeStart", "customXmlDelRangeEnd", "customXmlMoveFromRangeStart", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeStart", "customXmlMoveToRangeEnd", "ins", "del", "moveFrom", "moveTo", "oMathPara", "oMath", "fldSimple", "hyperlink", "subDoc");

    /* JADX INFO: renamed from: du */
    private String f29179du;

    /* JADX INFO: renamed from: h4 */
    private String f29180h4;

    /* JADX INFO: renamed from: k4 */
    private String f29181k4;

    /* JADX INFO: renamed from: kk */
    private String f29182kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7394ca> f29183m9;

    /* JADX INFO: renamed from: to */
    private int f29184to;

    /* JADX INFO: renamed from: x1 */
    private String f29185x1;

    public r5v() {
        m39890x1();
    }

    public r5v(final AbstractC13912i5 abstractC13912i5) {
        m39890x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.r5v.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = r5v.f29178dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    r5v.this.f29181k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    r5v.this.f29185x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    r5v.this.f29182kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    r5v.this.f29184to = vn6.m43185k4(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    r5v.this.f29179du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                r5v.this.f29180h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.r5v.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                jkl jklVar;
                List list2;
                String str;
                ude udeVar;
                List list3;
                String str2;
                skj skjVar;
                List list4;
                String str3;
                kne kneVar;
                List list5;
                String str4;
                List list6;
                C7394ca c7394ca2;
                switch (r5v.f29178dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        dzn dznVar = new dzn(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("customXml", dznVar);
                        list.addItem(c7394ca);
                        return true;
                    case 7:
                        zrq zrqVar = new zrq(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("smartTag", zrqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 8:
                        vfd vfdVar = new vfd(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("sdt", vfdVar);
                        list.addItem(c7394ca);
                        return true;
                    case 9:
                        iys iysVar = new iys(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("r", iysVar);
                        list.addItem(c7394ca);
                        return true;
                    case 10:
                        g2p g2pVar = new g2p(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("proofErr", g2pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 11:
                        rtq rtqVar = new rtq(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("permStart", rtqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 12:
                        tan tanVar = new tan(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("permEnd", tanVar);
                        list.addItem(c7394ca);
                        return true;
                    case 13:
                        gev gevVar = new gev(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("bookmarkStart", gevVar);
                        list.addItem(c7394ca);
                        return true;
                    case 14:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = r5v.this.f29183m9;
                        str = "bookmarkEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 15:
                        g0g g0gVar = new g0g(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("moveFromRangeStart", g0gVar);
                        list.addItem(c7394ca);
                        return true;
                    case 16:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = r5v.this.f29183m9;
                        str = "moveFromRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 17:
                        g0g g0gVar2 = new g0g(abstractC13912i5);
                        list = r5v.this.f29183m9;
                        c7394ca = new C7394ca("moveToRangeStart", g0gVar2);
                        list.addItem(c7394ca);
                        return true;
                    case 18:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = r5v.this.f29183m9;
                        str = "moveToRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 19:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = r5v.this.f29183m9;
                        str = "commentRangeStart";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 20:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = r5v.this.f29183m9;
                        str = "commentRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 21:
                        udeVar = new ude(abstractC13912i5);
                        list3 = r5v.this.f29183m9;
                        str2 = "customXmlInsRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 22:
                        skjVar = new skj(abstractC13912i5);
                        list4 = r5v.this.f29183m9;
                        str3 = "customXmlInsRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 23:
                        udeVar = new ude(abstractC13912i5);
                        list3 = r5v.this.f29183m9;
                        str2 = "customXmlDelRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 24:
                        skjVar = new skj(abstractC13912i5);
                        list4 = r5v.this.f29183m9;
                        str3 = "customXmlDelRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 25:
                        udeVar = new ude(abstractC13912i5);
                        list3 = r5v.this.f29183m9;
                        str2 = "customXmlMoveFromRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 26:
                        skjVar = new skj(abstractC13912i5);
                        list4 = r5v.this.f29183m9;
                        str3 = "customXmlMoveFromRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 27:
                        udeVar = new ude(abstractC13912i5);
                        list3 = r5v.this.f29183m9;
                        str2 = "customXmlMoveToRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 28:
                        skjVar = new skj(abstractC13912i5);
                        list4 = r5v.this.f29183m9;
                        str3 = "customXmlMoveToRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 29:
                        kneVar = new kne(abstractC13912i5);
                        list5 = r5v.this.f29183m9;
                        str4 = "ins";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 30:
                        kneVar = new kne(abstractC13912i5);
                        list5 = r5v.this.f29183m9;
                        str4 = "del";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 31:
                        kneVar = new kne(abstractC13912i5);
                        list5 = r5v.this.f29183m9;
                        str4 = "moveFrom";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 32:
                        kneVar = new kne(abstractC13912i5);
                        list5 = r5v.this.f29183m9;
                        str4 = "moveTo";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 33:
                        C8992v2 c8992v2 = new C8992v2(abstractC13912i5);
                        list6 = r5v.this.f29183m9;
                        c7394ca2 = new C7394ca("oMathPara", c8992v2);
                        list6.addItem(c7394ca2);
                        return true;
                    case 34:
                        C7211a4 c7211a4 = new C7211a4(abstractC13912i5);
                        list6 = r5v.this.f29183m9;
                        c7394ca2 = new C7394ca("oMath", c7211a4);
                        list6.addItem(c7394ca2);
                        return true;
                    case 35:
                        swn swnVar = new swn(abstractC13912i5);
                        list6 = r5v.this.f29183m9;
                        c7394ca2 = new C7394ca("fldSimple", swnVar);
                        list6.addItem(c7394ca2);
                        return true;
                    case 36:
                        r5v r5vVar = new r5v(abstractC13912i5);
                        list6 = r5v.this.f29183m9;
                        c7394ca2 = new C7394ca("hyperlink", r5vVar);
                        list6.addItem(c7394ca2);
                        return true;
                    case 37:
                        hz2 hz2Var = new hz2(abstractC13912i5);
                        list6 = r5v.this.f29183m9;
                        c7394ca2 = new C7394ca("subDoc", hz2Var);
                        list6.addItem(c7394ca2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39890x1() {
        this.f29184to = 0;
        this.f29183m9 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        jkl jklVar;
        String strM29539k4;
        g0g g0gVar;
        String strM29539k42;
        ude udeVar;
        String strM29539k43;
        skj skjVar;
        String strM29539k44;
        kne kneVar;
        String strM29539k45;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29181k4;
        if (str3 != null) {
            c3059ii.m12955x1("w:tgtFrame", str3);
        }
        String str4 = this.f29185x1;
        if (str4 != null) {
            c3059ii.m12955x1("w:tooltip", str4);
        }
        String str5 = this.f29182kk;
        if (str5 != null) {
            c3059ii.m12955x1("w:docLocation", str5);
        }
        int i = this.f29184to;
        if (i != 0) {
            c3059ii.m12955x1("w:history", vn6.m43186k4(i));
        }
        String str6 = this.f29179du;
        if (str6 != null) {
            c3059ii.m12955x1("w:anchor", str6);
        }
        if (this.f29180h4 != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f29180h4);
        }
        List.Enumerator<C7394ca> it = this.f29183m9.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f29178dy.m27428k4(next.m29539k4())) {
                    case 6:
                        ((dzn) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((zrq) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((vfd) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((iys) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((g2p) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((rtq) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((tan) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((gev) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 15:
                        g0gVar = (g0g) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        g0gVar.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 16:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 17:
                        g0gVar = (g0g) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        g0gVar.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 18:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 19:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 20:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 21:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 22:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 23:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 24:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 25:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 26:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 27:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 28:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 29:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 30:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 31:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 32:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 33:
                        ((C8992v2) next.m29541kk()).mo6846k4("m", c3059ii, next.m29539k4());
                        break;
                    case 34:
                        ((C7211a4) next.m29541kk()).mo6846k4("m", c3059ii, next.m29539k4());
                        break;
                    case 35:
                        ((swn) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 36:
                        ((r5v) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 37:
                        ((hz2) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
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
