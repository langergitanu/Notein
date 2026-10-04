package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class InkTrace implements IInkTrace {

    /* JADX INFO: renamed from: c5 */
    private String f2544c5;

    /* JADX INFO: renamed from: ck */
    private List<List<Float>> f2545ck;

    /* JADX INFO: renamed from: du */
    private String f2546du;

    /* JADX INFO: renamed from: h4 */
    private String f2548h4;

    /* JADX INFO: renamed from: jd */
    private Ink f2549jd;

    /* JADX INFO: renamed from: k4 */
    private String f2550k4;

    /* JADX INFO: renamed from: kk */
    private int f2551kk;

    /* JADX INFO: renamed from: to */
    private String f2553to;

    /* JADX INFO: renamed from: x1 */
    private int f2554x1;

    /* JADX INFO: renamed from: m9 */
    private double f2552m9 = 0.0d;

    /* JADX INFO: renamed from: dy */
    private double f2547dy = 0.0d;

    public InkTrace(Ink ink) {
        this.f2549jd = ink;
        m1831x1(0);
        m1820k4(1);
    }

    /* JADX INFO: renamed from: h4 */
    private double m1806h4(String str) {
        return wzw.m72987k4(2540.0d, "1/in");
    }

    /* JADX INFO: renamed from: ks */
    private String m1808ks() {
        C6765kp c6765kp = new C6765kp();
        char cCharAt = ' ';
        for (int i = 0; i < m1811ck().length(); i++) {
            if (m1811ck().charAt(i) == '+') {
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
            }
            if (m1811ck().charAt(i) == '\'' || m1811ck().charAt(i) == '\"') {
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
            }
            if (m1811ck().charAt(i) == '-' && (C14117yj.m67539to(cCharAt) || C14117yj.m67519h4(cCharAt))) {
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
            }
            c6765kp.m26780k4(m1811ck().charAt(i));
            cCharAt = m1811ck().charAt(i);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: yj */
    private List<List<aze>> m1809yj() {
        String strM67422kk;
        int i;
        String[] strArrM67414k4 = C14113y2.m67414k4(m1808ks(), ',');
        List<List<aze>> list = new List<>();
        for (int i2 = 0; i2 <= strArrM67414k4.length - 1; i2++) {
            String[] strArrM67417k4 = C14113y2.m67417k4(strArrM67414k4[i2], new String[]{" ", IOUtils.LINE_SEPARATOR_WINDOWS, "\t", "\r", IOUtils.LINE_SEPARATOR_UNIX}, 1);
            List<aze> list2 = new List<>();
            for (int i3 = 0; i3 < strArrM67417k4.length; i3++) {
                aze azeVar = new aze();
                if (C14113y2.m67432to(strArrM67417k4[i3], "T", (short) 5) || C14113y2.m67432to(strArrM67417k4[i3], "F", (short) 5)) {
                    strM67422kk = strArrM67417k4[i3];
                } else if (C14113y2.m67359c5(strArrM67417k4[i3], "#")) {
                    String str = strArrM67417k4[i3];
                    strM67422kk = C14113y2.m67422kk(str, C14113y2.m67430to(str, "#") + 1);
                } else {
                    strM67422kk = C14113y2.m67359c5(strArrM67417k4[i3], ".") ? strArrM67417k4[i3] : strArrM67417k4[i3];
                }
                azeVar.m3877k4(strM67422kk);
                if (C14113y2.m67448x1(strArrM67417k4[i3], "'")) {
                    azeVar.m3877k4(C14113y2.m67422kk(strArrM67417k4[i3], 1));
                    azeVar.m3876k4(0);
                } else if (C14113y2.m67448x1(strArrM67417k4[i3], "\"")) {
                    azeVar.m3877k4(C14113y2.m67422kk(strArrM67417k4[i3], 1));
                    azeVar.m3876k4(1);
                } else {
                    if (C14113y2.m67448x1(strArrM67417k4[i3], "!")) {
                        azeVar.m3877k4(C14113y2.m67422kk(strArrM67417k4[i3], 1));
                        i = 2;
                    } else if (C14113y2.m67363du(strArrM67417k4[i3], C18358t1.g.f56183c)) {
                        azeVar.m3877k4(strArrM67417k4[i3]);
                        i = 4;
                    } else if (C14113y2.m67363du(strArrM67417k4[i3], MsalUtils.QUERY_STRING_SYMBOL)) {
                        azeVar.m3877k4(strArrM67417k4[i3]);
                        i = 3;
                    }
                    azeVar.m3876k4(i);
                }
                list2.addItem(azeVar);
            }
            list.addItem(list2);
        }
        return list;
    }

    /* JADX INFO: renamed from: c5 */
    public final double m1810c5() {
        return this.f2552m9;
    }

    /* JADX INFO: renamed from: ck */
    public final String m1811ck() {
        return this.f2544c5;
    }

    /* JADX INFO: renamed from: du */
    public final int m1812du() {
        return this.f2551kk;
    }

    /* JADX INFO: renamed from: dy */
    public final String m1814dy() {
        return this.f2548h4;
    }

    /* JADX INFO: renamed from: fa */
    public final cow m1815fa() {
        return wzw.m72988k4(this.f2549jd, m1825m9());
    }

    @Override // com.aspose.slides.IInkTrace
    public final IInkBrush getBrush() {
        return wzw.m72990x1(this.f2549jd, m1814dy());
    }

    @Override // com.aspose.slides.IInkTrace
    public final PointF[] getPoints() {
        return C3085sv.m13096k4(m1822k4());
    }

    /* JADX INFO: renamed from: jd */
    public final double m1817jd() {
        return this.f2547dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C12025x6> m1818k4(C12015qq c12015qq) {
        m1807k4(m1815fa());
        List<C12025x6> list = new List<>();
        double dM1806h4 = m1806h4("X");
        double dM1806h42 = m1806h4("Y");
        List.Enumerator<List<Float>> it = this.f2545ck.iterator();
        while (it.hasNext()) {
            try {
                List<Float> next = it.next();
                next.set_Item(0, Float.valueOf(next.get_Item(0).floatValue() / ((float) dM1806h4)));
                next.set_Item(1, Float.valueOf(next.get_Item(1).floatValue() / ((float) dM1806h42)));
                list.addItem(new C12025x6(next.get_Item(0).floatValue(), next.get_Item(1).floatValue()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final String m1823kk() {
        return this.f2550k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m1825m9() {
        return this.f2546du;
    }

    /* JADX INFO: renamed from: to */
    public final int m1826to() {
        return this.f2554x1;
    }

    /* JADX INFO: renamed from: up */
    public final C12003du m1828up() {
        return ((InkBrush) getBrush()).m1786k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<List<Float>> m1829x1() {
        return this.f2545ck;
    }

    /* JADX INFO: renamed from: du */
    public final void m1813du(String str) {
        this.f2544c5 = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m1816h4() {
        return this.f2553to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1819k4(double d) {
        this.f2552m9 = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1824kk(String str) {
        this.f2546du = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m1827to(String str) {
        this.f2548h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1830x1(double d) {
        this.f2547dy = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1820k4(int i) {
        this.f2554x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1831x1(int i) {
        this.f2551kk = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1807k4(cow cowVar) {
        double d;
        int i;
        double dM66904fa;
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        new List();
        List list4 = new List();
        int i2 = 0;
        while (true) {
            d = 0.0d;
            if (i2 >= cowVar.m4707x1().size()) {
                break;
            }
            list2.addItem(Double.valueOf(0.0d));
            list.addItem(Double.valueOf(0.0d));
            list3.addItem(Double.valueOf(i2));
            list4.addItem(2);
            i2++;
        }
        List<List<aze>> listM1809yj = m1809yj();
        this.f2545ck = new List<>();
        List.Enumerator<List<aze>> it = listM1809yj.iterator();
        while (it.hasNext()) {
            try {
                List<aze> next = it.next();
                List<Float> list5 = new List<>();
                int i3 = 0;
                while (i3 < next.size()) {
                    if (cowVar.m4707x1().get_Item(i3).m69638kk() == 1 || cowVar.m4707x1().get_Item(i3).m69638kk() == 2) {
                        i = 0;
                    } else {
                        i = 0;
                        if (cowVar.m4707x1().get_Item(i3).m69638kk() != 3) {
                            dM66904fa = (cowVar.m4707x1().get_Item(i3).m69638kk() == 4 && C14080ne.m66968k4(next.get_Item(i3).m3875k4())) ? 1.0d : d;
                            list5.addItem(Float.valueOf((float) dM66904fa));
                            i3++;
                            d = 0.0d;
                        }
                    }
                    if (next.get_Item(i3).m3878x1() == 0 || (next.get_Item(i3).m3878x1() == 5 && ((Integer) list4.get_Item(i3)).intValue() == 0)) {
                        dM66904fa = C14080ne.m66904fa(list3.get_Item(i3), C11697x1.m55250kk()) + C14080ne.m66906fa(next.get_Item(i3).m3875k4(), (InterfaceC14073kp) C11697x1.m55250kk());
                        list3.set_Item(i3, Double.valueOf(dM66904fa));
                        list2.set_Item(i3, Double.valueOf(C14080ne.m66906fa(next.get_Item(i3).m3875k4(), (InterfaceC14073kp) C11697x1.m55250kk())));
                        list4.set_Item(i3, Integer.valueOf(i));
                    } else if (next.get_Item(i3).m3878x1() == 1 || (next.get_Item(i3).m3878x1() == 5 && ((Integer) list4.get_Item(i3)).intValue() == 1)) {
                        list.set_Item(i3, Double.valueOf(C14080ne.m66904fa(list2.get_Item(i3), C11697x1.m55250kk()) + C14080ne.m66906fa(next.get_Item(i3).m3875k4(), (InterfaceC14073kp) C11697x1.m55250kk())));
                        list2.set_Item(i3, list.get_Item(i3));
                        double dM66904fa2 = C14080ne.m66904fa(list3.get_Item(i3), C11697x1.m55250kk()) + C14080ne.m66904fa(list.get_Item(i3), C11697x1.m55250kk());
                        list3.set_Item(i3, Double.valueOf(dM66904fa2));
                        list4.set_Item(i3, 1);
                        dM66904fa = dM66904fa2;
                    } else if (next.get_Item(i3).m3878x1() == 2 || (next.get_Item(i3).m3878x1() == 5 && ((Integer) list4.get_Item(i3)).intValue() == 2)) {
                        list4.set_Item(i3, 2);
                        dM66904fa = C14080ne.m66906fa(next.get_Item(i3).m3875k4(), (InterfaceC14073kp) C11697x1.m55250kk());
                        list3.set_Item(i3, Double.valueOf(dM66904fa));
                    } else if (C14042ak.m66412k4(ixq.class, next.get_Item(i3).m3878x1(), ixq.class, 4L)) {
                        dM66904fa = ((Double) list3.get_Item(i3)).doubleValue();
                    }
                    list5.addItem(Float.valueOf((float) dM66904fa));
                    i3++;
                    d = 0.0d;
                }
                this.f2545ck.addItem(list5);
                d = 0.0d;
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
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1832x1(String str) {
        this.f2553to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1821k4(String str) {
        this.f2550k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6[] m1822k4() {
        return m1818k4(C12023wl.m56853k4(new C12023wl(0, 0)).Clone()).toArray(new C12025x6[0]);
    }
}
