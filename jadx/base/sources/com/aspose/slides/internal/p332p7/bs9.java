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
public class bs9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20685x1 = new C7017h4("r", "proofErr", "permStart", "permEnd", "bookmarkStart", "bookmarkEnd", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd", "commentRangeStart", "commentRangeEnd", "customXmlInsRangeStart", "customXmlInsRangeEnd", "customXmlDelRangeStart", "customXmlDelRangeEnd", "customXmlMoveFromRangeStart", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeStart", "customXmlMoveToRangeEnd", "ins", "del", "moveFrom", "moveTo", "oMathPara", "oMath");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f20686k4;

    public bs9() {
        m29104x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29104x1() {
        this.f20686k4 = new List<>();
    }

    public bs9(final AbstractC13912i5 abstractC13912i5) {
        m29104x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bs9.1
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
                switch (bs9.f20685x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        iys iysVar = new iys(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("r", iysVar);
                        list.addItem(c7394ca);
                        return true;
                    case 1:
                        g2p g2pVar = new g2p(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("proofErr", g2pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 2:
                        rtq rtqVar = new rtq(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("permStart", rtqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 3:
                        tan tanVar = new tan(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("permEnd", tanVar);
                        list.addItem(c7394ca);
                        return true;
                    case 4:
                        gev gevVar = new gev(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("bookmarkStart", gevVar);
                        list.addItem(c7394ca);
                        return true;
                    case 5:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = bs9.this.f20686k4;
                        str = "bookmarkEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 6:
                        g0g g0gVar = new g0g(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("moveFromRangeStart", g0gVar);
                        list.addItem(c7394ca);
                        return true;
                    case 7:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = bs9.this.f20686k4;
                        str = "moveFromRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 8:
                        g0g g0gVar2 = new g0g(abstractC13912i5);
                        list = bs9.this.f20686k4;
                        c7394ca = new C7394ca("moveToRangeStart", g0gVar2);
                        list.addItem(c7394ca);
                        return true;
                    case 9:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = bs9.this.f20686k4;
                        str = "moveToRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 10:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = bs9.this.f20686k4;
                        str = "commentRangeStart";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 11:
                        jklVar = new jkl(abstractC13912i5);
                        list2 = bs9.this.f20686k4;
                        str = "commentRangeEnd";
                        OooO0OO.OooO0OO(str, jklVar, list2);
                        return true;
                    case 12:
                        udeVar = new ude(abstractC13912i5);
                        list3 = bs9.this.f20686k4;
                        str2 = "customXmlInsRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 13:
                        skjVar = new skj(abstractC13912i5);
                        list4 = bs9.this.f20686k4;
                        str3 = "customXmlInsRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 14:
                        udeVar = new ude(abstractC13912i5);
                        list3 = bs9.this.f20686k4;
                        str2 = "customXmlDelRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 15:
                        skjVar = new skj(abstractC13912i5);
                        list4 = bs9.this.f20686k4;
                        str3 = "customXmlDelRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 16:
                        udeVar = new ude(abstractC13912i5);
                        list3 = bs9.this.f20686k4;
                        str2 = "customXmlMoveFromRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 17:
                        skjVar = new skj(abstractC13912i5);
                        list4 = bs9.this.f20686k4;
                        str3 = "customXmlMoveFromRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 18:
                        udeVar = new ude(abstractC13912i5);
                        list3 = bs9.this.f20686k4;
                        str2 = "customXmlMoveToRangeStart";
                        C22237OooO0o0.OooO0O0(str2, udeVar, list3);
                        return true;
                    case 19:
                        skjVar = new skj(abstractC13912i5);
                        list4 = bs9.this.f20686k4;
                        str3 = "customXmlMoveToRangeEnd";
                        C21421OooO0oO.OooO0O0(str3, skjVar, list4);
                        return true;
                    case 20:
                        kneVar = new kne(abstractC13912i5);
                        list5 = bs9.this.f20686k4;
                        str4 = "ins";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 21:
                        kneVar = new kne(abstractC13912i5);
                        list5 = bs9.this.f20686k4;
                        str4 = "del";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 22:
                        kneVar = new kne(abstractC13912i5);
                        list5 = bs9.this.f20686k4;
                        str4 = "moveFrom";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 23:
                        kneVar = new kne(abstractC13912i5);
                        list5 = bs9.this.f20686k4;
                        str4 = "moveTo";
                        C22236OooO0Oo.OooO0O0(str4, kneVar, list5);
                        return true;
                    case 24:
                        C8992v2 c8992v2 = new C8992v2(abstractC13912i5);
                        list6 = bs9.this.f20686k4;
                        c7394ca2 = new C7394ca("oMathPara", c8992v2);
                        list6.addItem(c7394ca2);
                        return true;
                    case 25:
                        C7211a4 c7211a4 = new C7211a4(abstractC13912i5);
                        list6 = bs9.this.f20686k4;
                        c7394ca2 = new C7394ca("oMath", c7211a4);
                        list6.addItem(c7394ca2);
                        return true;
                    default:
                        return false;
                }
            }
        });
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
        List.Enumerator<C7394ca> it = this.f20686k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f20685x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((iys) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        ((g2p) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((rtq) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((tan) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((gev) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 6:
                        g0gVar = (g0g) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        g0gVar.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 7:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 8:
                        g0gVar = (g0g) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        g0gVar.mo6846k4("w", c3059ii, strM29539k42);
                        break;
                    case 9:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 10:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 11:
                        jklVar = (jkl) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        jklVar.mo6846k4("w", c3059ii, strM29539k4);
                        break;
                    case 12:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 13:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 14:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 15:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 16:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 17:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 18:
                        udeVar = (ude) next.m29541kk();
                        strM29539k43 = next.m29539k4();
                        udeVar.mo6846k4("w", c3059ii, strM29539k43);
                        break;
                    case 19:
                        skjVar = (skj) next.m29541kk();
                        strM29539k44 = next.m29539k4();
                        skjVar.mo6846k4("w", c3059ii, strM29539k44);
                        break;
                    case 20:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 21:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 22:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 23:
                        kneVar = (kne) next.m29541kk();
                        strM29539k45 = next.m29539k4();
                        kneVar.mo6846k4("w", c3059ii, strM29539k45);
                        break;
                    case 24:
                        ((C8992v2) next.m29541kk()).mo6846k4("m", c3059ii, next.m29539k4());
                        break;
                    case 25:
                        ((C7211a4) next.m29541kk()).mo6846k4("m", c3059ii, next.m29539k4());
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
