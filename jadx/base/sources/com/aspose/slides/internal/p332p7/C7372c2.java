package com.aspose.slides.internal.p332p7;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.c2 */
/* JADX INFO: loaded from: classes4.dex */
public class C7372c2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20886x1 = new C7017h4("tint", "shade", "comp", "inv", "gray", "alpha", "alphaOff", "alphaMod", "hue", "hueOff", "hueMod", LocalePreferences.FirstDayOfWeek.SATURDAY, "satOff", "satMod", "lum", "lumOff", "lumMod", "red", "redOff", "redMod", "green", "greenOff", "greenMod", "blue", "blueOff", "blueMod", "gamma", "invGamma");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f20887k4;

    public C7372c2() {
        m29393kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m29393kk() {
        this.f20887k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m29395k4() {
        return this.f20887k4;
    }

    public C7372c2(final AbstractC13912i5 abstractC13912i5) {
        m29393kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8082kf c8082kf;
                List list;
                String str;
                List list2;
                C7394ca c7394ca;
                List list3;
                C7394ca c7394ca2;
                switch (C7372c2.f20886x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "tint";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 1:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "shade";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 2:
                        C7882hu c7882hu = new C7882hu(abstractC13912i5);
                        list2 = C7372c2.this.f20887k4;
                        c7394ca = new C7394ca("comp", c7882hu);
                        list2.addItem(c7394ca);
                        return true;
                    case 3:
                        C7916i9 c7916i9 = new C7916i9(abstractC13912i5);
                        list2 = C7372c2.this.f20887k4;
                        c7394ca = new C7394ca("inv", c7916i9);
                        list2.addItem(c7394ca);
                        return true;
                    case 4:
                        C8162l6 c8162l6 = new C8162l6(abstractC13912i5);
                        list2 = C7372c2.this.f20887k4;
                        c7394ca = new C7394ca("gray", c8162l6);
                        list2.addItem(c7394ca);
                        return true;
                    case 5:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "alpha";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 6:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "alphaOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 7:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "alphaMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 8:
                        C7608ev c7608ev = new C7608ev(abstractC13912i5);
                        list2 = C7372c2.this.f20887k4;
                        c7394ca = new C7394ca("hue", c7608ev);
                        list2.addItem(c7394ca);
                        return true;
                    case 9:
                        C7608ev c7608ev2 = new C7608ev(abstractC13912i5);
                        list2 = C7372c2.this.f20887k4;
                        c7394ca = new C7394ca("hueOff", c7608ev2);
                        list2.addItem(c7394ca);
                        return true;
                    case 10:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "hueMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 11:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = LocalePreferences.FirstDayOfWeek.SATURDAY;
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 12:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "satOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 13:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "satMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 14:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "lum";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 15:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "lumOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 16:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "lumMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 17:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "red";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 18:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "redOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 19:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "redMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 20:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "green";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 21:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "greenOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 22:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "greenMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 23:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "blue";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 24:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "blueOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 25:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C7372c2.this.f20887k4;
                        str = "blueMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 26:
                        C8595qc c8595qc = new C8595qc(abstractC13912i5);
                        list3 = C7372c2.this.f20887k4;
                        c7394ca2 = new C7394ca("gamma", c8595qc);
                        list3.addItem(c7394ca2);
                        return true;
                    case 27:
                        C7544eb c7544eb = new C7544eb(abstractC13912i5);
                        list3 = C7372c2.this.f20887k4;
                        c7394ca2 = new C7394ca("invGamma", c7544eb);
                        list3.addItem(c7394ca2);
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
        C8082kf c8082kf;
        String strM29539k4;
        C7608ev c7608ev;
        String strM29539k42;
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f20887k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f20886x1.m27428k4(next.m29539k4())) {
                    case 0:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 1:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 2:
                        ((C7882hu) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C7916i9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C8162l6) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 6:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 7:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 8:
                        c7608ev = (C7608ev) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        c7608ev.mo6846k4("a", c3059ii, strM29539k42);
                        break;
                    case 9:
                        c7608ev = (C7608ev) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        c7608ev.mo6846k4("a", c3059ii, strM29539k42);
                        break;
                    case 10:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 11:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 12:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 13:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 14:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 15:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 16:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 17:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 18:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 19:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 20:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 21:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 22:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 23:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 24:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 25:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 26:
                        ((C8595qc) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 27:
                        ((C7544eb) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
