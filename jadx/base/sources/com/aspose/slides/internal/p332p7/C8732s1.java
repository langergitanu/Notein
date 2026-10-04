package com.aspose.slides.internal.p332p7;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.s1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8732s1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f29861kk = new C7017h4("val", "tint", "shade", "comp", "inv", "gray", "alpha", "alphaOff", "alphaMod", "hue", "hueOff", "hueMod", LocalePreferences.FirstDayOfWeek.SATURDAY, "satOff", "satMod", "lum", "lumOff", "lumMod", "red", "redOff", "redMod", "green", "greenOff", "greenMod", "blue", "blueOff", "blueMod", "gamma", "invGamma");

    /* JADX INFO: renamed from: k4 */
    private int f29862k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f29863x1;

    public C8732s1() {
        m40713to();
    }

    /* JADX INFO: renamed from: to */
    private void m40713to() {
        this.f29862k4 = 0;
        this.f29863x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m40714k4() {
        return this.f29862k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m40717x1() {
        return this.f29863x1;
    }

    public C8732s1(final AbstractC13912i5 abstractC13912i5) {
        m40713to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8732s1.f29861kk.m27428k4(str) != 0) {
                    return false;
                }
                C8732s1.this.f29862k4 = C7518dw.m30682k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.s1.2
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
                switch (C8732s1.f29861kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "tint";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 2:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "shade";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 3:
                        C7882hu c7882hu = new C7882hu(abstractC13912i5);
                        list2 = C8732s1.this.f29863x1;
                        c7394ca = new C7394ca("comp", c7882hu);
                        list2.addItem(c7394ca);
                        return true;
                    case 4:
                        C7916i9 c7916i9 = new C7916i9(abstractC13912i5);
                        list2 = C8732s1.this.f29863x1;
                        c7394ca = new C7394ca("inv", c7916i9);
                        list2.addItem(c7394ca);
                        return true;
                    case 5:
                        C8162l6 c8162l6 = new C8162l6(abstractC13912i5);
                        list2 = C8732s1.this.f29863x1;
                        c7394ca = new C7394ca("gray", c8162l6);
                        list2.addItem(c7394ca);
                        return true;
                    case 6:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "alpha";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 7:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "alphaOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 8:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "alphaMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 9:
                        C7608ev c7608ev = new C7608ev(abstractC13912i5);
                        list2 = C8732s1.this.f29863x1;
                        c7394ca = new C7394ca("hue", c7608ev);
                        list2.addItem(c7394ca);
                        return true;
                    case 10:
                        C7608ev c7608ev2 = new C7608ev(abstractC13912i5);
                        list2 = C8732s1.this.f29863x1;
                        c7394ca = new C7394ca("hueOff", c7608ev2);
                        list2.addItem(c7394ca);
                        return true;
                    case 11:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "hueMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 12:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = LocalePreferences.FirstDayOfWeek.SATURDAY;
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 13:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "satOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 14:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "satMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 15:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "lum";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 16:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "lumOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 17:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "lumMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 18:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "red";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 19:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "redOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 20:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "redMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 21:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "green";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 22:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "greenOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 23:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "greenMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 24:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "blue";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 25:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "blueOff";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 26:
                        c8082kf = new C8082kf(abstractC13912i5);
                        list = C8732s1.this.f29863x1;
                        str = "blueMod";
                        OooOOO0.OooO00o(str, c8082kf, list);
                        return true;
                    case 27:
                        C8595qc c8595qc = new C8595qc(abstractC13912i5);
                        list3 = C8732s1.this.f29863x1;
                        c7394ca2 = new C7394ca("gamma", c8595qc);
                        list3.addItem(c7394ca2);
                        return true;
                    case 28:
                        C7544eb c7544eb = new C7544eb(abstractC13912i5);
                        list3 = C8732s1.this.f29863x1;
                        c7394ca2 = new C7394ca("invGamma", c7544eb);
                        list3.addItem(c7394ca2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m40715k4(String str) {
        C7394ca c7394ca;
        switch (f29861kk.m27428k4(str)) {
            case 1:
                c7394ca = new C7394ca("tint", new C8082kf());
                break;
            case 2:
                c7394ca = new C7394ca("shade", new C8082kf());
                break;
            case 3:
                c7394ca = new C7394ca("comp", new C7882hu());
                break;
            case 4:
                c7394ca = new C7394ca("inv", new C7916i9());
                break;
            case 5:
                c7394ca = new C7394ca("gray", new C8162l6());
                break;
            case 6:
                c7394ca = new C7394ca("alpha", new C8082kf());
                break;
            case 7:
                c7394ca = new C7394ca("alphaOff", new C8082kf());
                break;
            case 8:
                c7394ca = new C7394ca("alphaMod", new C8082kf());
                break;
            case 9:
                c7394ca = new C7394ca("hue", new C7608ev());
                break;
            case 10:
                c7394ca = new C7394ca("hueOff", new C7608ev());
                break;
            case 11:
                c7394ca = new C7394ca("hueMod", new C8082kf());
                break;
            case 12:
                c7394ca = new C7394ca(LocalePreferences.FirstDayOfWeek.SATURDAY, new C8082kf());
                break;
            case 13:
                c7394ca = new C7394ca("satOff", new C8082kf());
                break;
            case 14:
                c7394ca = new C7394ca("satMod", new C8082kf());
                break;
            case 15:
                c7394ca = new C7394ca("lum", new C8082kf());
                break;
            case 16:
                c7394ca = new C7394ca("lumOff", new C8082kf());
                break;
            case 17:
                c7394ca = new C7394ca("lumMod", new C8082kf());
                break;
            case 18:
                c7394ca = new C7394ca("red", new C8082kf());
                break;
            case 19:
                c7394ca = new C7394ca("redOff", new C8082kf());
                break;
            case 20:
                c7394ca = new C7394ca("redMod", new C8082kf());
                break;
            case 21:
                c7394ca = new C7394ca("green", new C8082kf());
                break;
            case 22:
                c7394ca = new C7394ca("greenOff", new C8082kf());
                break;
            case 23:
                c7394ca = new C7394ca("greenMod", new C8082kf());
                break;
            case 24:
                c7394ca = new C7394ca("blue", new C8082kf());
                break;
            case 25:
                c7394ca = new C7394ca("blueOff", new C8082kf());
                break;
            case 26:
                c7394ca = new C7394ca("blueMod", new C8082kf());
                break;
            case 27:
                c7394ca = new C7394ca("gamma", new C8595qc());
                break;
            case 28:
                c7394ca = new C7394ca("invGamma", new C7544eb());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f29863x1.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40716k4(int i) {
        this.f29862k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C8082kf c8082kf;
        String strM29539k4;
        C7608ev c7608ev;
        String strM29539k42;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C7518dw.m30683k4(this.f29862k4));
        List.Enumerator<C7394ca> it = this.f29863x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f29861kk.m27428k4(next.m29539k4())) {
                    case 1:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 2:
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 3:
                        ((C7882hu) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C7916i9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8162l6) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 9:
                        c7608ev = (C7608ev) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        c7608ev.mo6846k4("a", c3059ii, strM29539k42);
                        break;
                    case 10:
                        c7608ev = (C7608ev) next.m29541kk();
                        strM29539k42 = next.m29539k4();
                        c7608ev.mo6846k4("a", c3059ii, strM29539k42);
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
                        c8082kf = (C8082kf) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        c8082kf.mo6846k4("a", c3059ii, strM29539k4);
                        break;
                    case 27:
                        ((C8595qc) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 28:
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
