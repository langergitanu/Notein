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
public class swn extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30464h4 = new C7017h4("w_Instr", "w_FldLock", "w_Dirty", "fldData", "customXml", "smartTag", "sdt", "r", "proofErr", "permStart", "permEnd", "bookmarkStart", "bookmarkEnd", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd", "commentRangeStart", "commentRangeEnd", "customXmlInsRangeStart", "customXmlInsRangeEnd", "customXmlDelRangeStart", "customXmlDelRangeEnd", "customXmlMoveFromRangeStart", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeStart", "customXmlMoveToRangeEnd", "ins", "del", "moveFrom", "moveTo", "oMathPara", "oMath", "fldSimple", "hyperlink", "subDoc");

    /* JADX INFO: renamed from: du */
    private List<C7394ca> f30465du;

    /* JADX INFO: renamed from: k4 */
    private String f30466k4;

    /* JADX INFO: renamed from: kk */
    private int f30467kk;

    /* JADX INFO: renamed from: to */
    private q4n f30468to;

    /* JADX INFO: renamed from: x1 */
    private int f30469x1;

    public swn() {
        m41408x1();
    }

    public swn(final AbstractC13912i5 abstractC13912i5) {
        m41408x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.swn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = swn.f30464h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    swn.this.f30466k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    swn.this.f30469x1 = vn6.m43185k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                swn.this.f30467kk = vn6.m43185k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.swn.2
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
                switch (swn.f30464h4.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        swn.this.f30468to = new q4n(abstractC13912i5);
                        return true;
                    case 4:
                        dzn dznVar = new dzn(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("customXml", dznVar);
                        list.addItem(c7394ca);
                        return true;
                    case 5:
                        zrq zrqVar = new zrq(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("smartTag", zrqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 6:
                        vfd vfdVar = new vfd(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("sdt", vfdVar);
                        list.addItem(c7394ca);
                        return true;
                    case 7:
                        iys iysVar = new iys(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("r", iysVar);
                        list.addItem(c7394ca);
                        return true;
                    case 8:
                        g2p g2pVar = new g2p(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("proofErr", g2pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 9:
                        rtq rtqVar = new rtq(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("permStart", rtqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 10:
                        tan tanVar = new tan(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("permEnd", tanVar);
                        list.addItem(c7394ca);
                        return true;
                    case 11:
                        gev gevVar = new gev(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("bookmarkStart", gevVar);
                        list.addItem(c7394ca);
                        return true;
                    case 12:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = swn.this.f30465du;
                        str = "bookmarkEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 13:
                        g0g g0gVar = new g0g(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("moveFromRangeStart", g0gVar);
                        list.addItem(c7394ca);
                        return true;
                    case 14:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = swn.this.f30465du;
                        str = "moveFromRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 15:
                        g0g g0gVar2 = new g0g(abstractC13912i5);
                        list = swn.this.f30465du;
                        c7394ca = new C7394ca("moveToRangeStart", g0gVar2);
                        list.addItem(c7394ca);
                        return true;
                    case 16:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = swn.this.f30465du;
                        str = "moveToRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 17:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = swn.this.f30465du;
                        str = "commentRangeStart";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 18:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = swn.this.f30465du;
                        str = "commentRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 19:
                        udeVar = new ude(abstractC13912i5);
                        list3 = swn.this.f30465du;
                        str2 = "customXmlInsRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 20:
                        skjVar = new skj(abstractC13912i5);
                        list4 = swn.this.f30465du;
                        str3 = "customXmlInsRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 21:
                        udeVar = new ude(abstractC13912i5);
                        list3 = swn.this.f30465du;
                        str2 = "customXmlDelRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 22:
                        skjVar = new skj(abstractC13912i5);
                        list4 = swn.this.f30465du;
                        str3 = "customXmlDelRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 23:
                        udeVar = new ude(abstractC13912i5);
                        list3 = swn.this.f30465du;
                        str2 = "customXmlMoveFromRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 24:
                        skjVar = new skj(abstractC13912i5);
                        list4 = swn.this.f30465du;
                        str3 = "customXmlMoveFromRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 25:
                        udeVar = new ude(abstractC13912i5);
                        list3 = swn.this.f30465du;
                        str2 = "customXmlMoveToRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 26:
                        skjVar = new skj(abstractC13912i5);
                        list4 = swn.this.f30465du;
                        str3 = "customXmlMoveToRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 27:
                        kneVar = new kne(abstractC13912i5);
                        list5 = swn.this.f30465du;
                        str4 = "ins";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 28:
                        kneVar = new kne(abstractC13912i5);
                        list5 = swn.this.f30465du;
                        str4 = "del";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 29:
                        kneVar = new kne(abstractC13912i5);
                        list5 = swn.this.f30465du;
                        str4 = "moveFrom";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 30:
                        kneVar = new kne(abstractC13912i5);
                        list5 = swn.this.f30465du;
                        str4 = "moveTo";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 31:
                        C8992v2 c8992v2 = new C8992v2(abstractC13912i5);
                        list6 = swn.this.f30465du;
                        c7394ca2 = new C7394ca("oMathPara", c8992v2);
                        list6.addItem(c7394ca2);
                        return true;
                    case 32:
                        C7211a4 c7211a4 = new C7211a4(abstractC13912i5);
                        list6 = swn.this.f30465du;
                        c7394ca2 = new C7394ca("oMath", c7211a4);
                        list6.addItem(c7394ca2);
                        return true;
                    case 33:
                        swn swnVar = new swn(abstractC13912i5);
                        list6 = swn.this.f30465du;
                        c7394ca2 = new C7394ca("fldSimple", swnVar);
                        list6.addItem(c7394ca2);
                        return true;
                    case 34:
                        r5v r5vVar = new r5v(abstractC13912i5);
                        list6 = swn.this.f30465du;
                        c7394ca2 = new C7394ca("hyperlink", r5vVar);
                        list6.addItem(c7394ca2);
                        return true;
                    case 35:
                        hz2 hz2Var = new hz2(abstractC13912i5);
                        list6 = swn.this.f30465du;
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
    private void m41408x1() {
        this.f30469x1 = 0;
        this.f30467kk = 0;
        this.f30465du = new List<>();
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
        c3059ii.m12955x1("w:instr", this.f30466k4);
        int i = this.f30469x1;
        if (i != 0) {
            c3059ii.m12955x1("w:fldLock", vn6.m43186k4(i));
        }
        int i2 = this.f30467kk;
        if (i2 != 0) {
            c3059ii.m12955x1("w:dirty", vn6.m43186k4(i2));
        }
        q4n q4nVar = this.f30468to;
        if (q4nVar != null) {
            q4nVar.mo6846k4("w", c3059ii, "fldData");
        }
        List.Enumerator<C7394ca> it = this.f30465du.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f30464h4.m27428k4(next.m29539k4())) {
                    case 4:
                        ((dzn) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((zrq) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((vfd) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((iys) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((g2p) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((rtq) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((tan) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((gev) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 13:
                        g0gVar = (g0g) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        g0gVar.mo6846k4("w", c3059ii, strM29539k42);
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
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 18:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 19:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 20:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
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
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 28:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
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
                        ((C8992v2) next.m29541kk()).mo6846k4("m", c3059ii, next.m29539k4());
                        break;
                    case 32:
                        ((C7211a4) next.m29541kk()).mo6846k4("m", c3059ii, next.m29539k4());
                        break;
                    case 33:
                        ((swn) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 34:
                        ((r5v) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 35:
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
