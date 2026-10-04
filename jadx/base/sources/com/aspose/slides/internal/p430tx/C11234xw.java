package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p229ki.AbstractC5728qw;
import com.aspose.slides.internal.p229ki.C5709jw;
import com.aspose.slides.internal.p229ki.C5758x5;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p331p6.C7202to;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14072kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13858b3;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.C13985tt;
import com.aspose.slides.p559ms.System.Xml.C13995uw;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.xw */
/* JADX INFO: loaded from: classes4.dex */
public final class C11234xw {

    /* JADX INFO: renamed from: c5 */
    private int f38762c5;

    /* JADX INFO: renamed from: ck */
    private C11226vj f38763ck;

    /* JADX INFO: renamed from: du */
    private List<C11235y2> f38764du;

    /* JADX INFO: renamed from: dy */
    private C6765kp f38765dy;

    /* JADX INFO: renamed from: fa */
    private C11191ig f38766fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC10925du f38767h4;

    /* JADX INFO: renamed from: ix */
    private AbstractC5728qw[] f38768ix;

    /* JADX INFO: renamed from: jd */
    private C11227w6 f38769jd;

    /* JADX INFO: renamed from: k4 */
    private int f38770k4;

    /* JADX INFO: renamed from: kk */
    private C11210qw f38771kk;

    /* JADX INFO: renamed from: ks */
    private C7202to f38772ks;

    /* JADX INFO: renamed from: m9 */
    private C13858b3 f38773m9;

    /* JADX INFO: renamed from: qq */
    private C11187gf f38775qq;

    /* JADX INFO: renamed from: rv */
    private Hashtable f38776rv;

    /* JADX INFO: renamed from: to */
    private C11176c6[] f38777to;

    /* JADX INFO: renamed from: u4 */
    private ArrayList f38778u4;

    /* JADX INFO: renamed from: uz */
    private Hashtable f38780uz;

    /* JADX INFO: renamed from: wl */
    private C11187gf f38781wl;

    /* JADX INFO: renamed from: x1 */
    private C11207os f38782x1;

    /* JADX INFO: renamed from: x6 */
    private ArrayList f38783x6;

    /* JADX INFO: renamed from: yj */
    private AbstractC13943n5 f38784yj;

    /* JADX INFO: renamed from: up */
    private AbstractC13883dt f38779up = new C13963qw();

    /* JADX INFO: renamed from: ne */
    private C11168ai f38774ne = new C11168ai();

    /* JADX WARN: Multi-variable type inference failed */
    public C11234xw(AbstractC10925du abstractC10925du, C7202to c7202to, AbstractC13943n5 abstractC13943n5, C11207os c11207os, List<C11235y2> list, C11210qw c11210qw) {
        this.f38782x1 = c11207os;
        this.f38764du = list;
        this.f38771kk = c11210qw;
        this.f38768ix = new AbstractC5728qw[list.size()];
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f38768ix[i2] = AbstractC5728qw.m23314k4(list.get_Item(i2).m54212k4().m23222x1());
        }
        this.f38769jd = new C11227w6();
        this.f38767h4 = abstractC10925du;
        this.f38763ck = null;
        this.f38773m9 = new C13858b3(10);
        this.f38766fa = this.f38771kk.m53886k4();
        this.f38784yj = abstractC13943n5 == null ? C13995uw.f47035k4 : abstractC13943n5;
        this.f38772ks = c7202to == null ? new C7202to() : c7202to;
        if (this.f38771kk.m53891x1() != null) {
            this.f38777to = new C11176c6[this.f38771kk.m53891x1().size()];
            while (true) {
                C11176c6[] c11176c6Arr = this.f38777to;
                if (i >= c11176c6Arr.length) {
                    break;
                }
                c11176c6Arr[i] = this.f38771kk.m53891x1().get_Item(i).m53689to();
                i++;
            }
        }
        this.f38776rv = new Hashtable(this.f38782x1.m53862h4().size());
        IDictionaryEnumerator it = this.f38782x1.m53862h4().iterator();
        while (it.hasNext()) {
            try {
                DictionaryEntry dictionaryEntry = (DictionaryEntry) it.next();
                String str = (String) dictionaryEntry.getKey();
                if (m54176k4(str) != null) {
                    throw XsltException.create("Namespace '{0}' has a duplicate implementation.", str);
                }
                this.f38776rv.addItem(str, C14072kk.m66791k4((AbstractC14068j5) dictionaryEntry.getValue(), 564, null, null, null));
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        m54181k4(this.f38771kk, (AbstractC10929m9) null);
    }

    /* JADX INFO: renamed from: ne */
    private C11187gf m54158ne() {
        if (this.f38775qq == null) {
            this.f38775qq = new C11187gf();
        }
        return this.f38775qq;
    }

    /* JADX INFO: renamed from: x6 */
    private C11187gf m54160x6() {
        if (this.f38781wl == null) {
            this.f38781wl = new C11187gf();
        }
        return this.f38781wl;
    }

    /* JADX INFO: renamed from: c5 */
    public final C6765kp m54161c5() {
        C6765kp c6765kp = this.f38765dy;
        if (c6765kp == null) {
            this.f38765dy = new C6765kp();
        } else {
            c6765kp.m26801k4(0);
        }
        return this.f38765dy;
    }

    /* JADX INFO: renamed from: ck */
    public final ArrayList m54162ck() {
        if (this.f38783x6 == null) {
            this.f38783x6 = new ArrayList();
        }
        return this.f38783x6;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m54163du(int i) {
        int i2 = this.f38762c5;
        if (i2 > 0) {
            this.f38762c5 = i2 - 1;
            return true;
        }
        int iM54059k4 = this.f38763ck.m54059k4(this.f38769jd.m54073to(i), i);
        if (iM54059k4 == 0) {
            this.f38769jd.m54069du(i);
            return true;
        }
        if (iM54059k4 == 1) {
            this.f38769jd.m54069du(i);
            m54179k4(1);
            return true;
        }
        if (iM54059k4 != 2) {
            C6005k4.m24259k4("Unexpected result of RecordBuilder.TextEvent()");
            return true;
        }
        m54179k4(1);
        return false;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC10925du m54166dy() {
        return this.f38767h4;
    }

    /* JADX INFO: renamed from: fa */
    public final void m54167fa() {
        while (true) {
            if (this.f38770k4 != 0) {
                break;
            }
            C11231x1 c11231x1 = (C11231x1) this.f38773m9.m65181kk();
            if (c11231x1 == null) {
                this.f38763ck.m54056dy();
                m54179k4(2);
                break;
            } else if (c11231x1.m54106k4(this)) {
                this.f38773m9.m65183x1();
            }
        }
        if (this.f38770k4 == 1) {
            this.f38770k4 = 0;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m54168h4() {
        ArrayList arrayList = this.f38778u4;
        if (arrayList == null) {
            this.f38778u4 = new ArrayList();
        } else {
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: jd */
    public final void m54169jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5728qw m54170k4(int i, C11187gf c11187gf) {
        C11235y2 c11235y2 = this.f38764du.get_Item(i);
        c11235y2.m54212k4().mo23218k4();
        AbstractC5728qw abstractC5728qw = this.f38768ix[i];
        if (c11187gf == null) {
            c11187gf = new C11187gf(c11235y2.f38785k4, this);
        } else {
            c11187gf.m53777k4(c11235y2.f38785k4, this);
        }
        abstractC5728qw.mo23149k4((AbstractC7201m9) c11187gf);
        return abstractC5728qw;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC5728qw m54193kk(int i) {
        C11235y2 c11235y2 = this.f38764du.get_Item(i);
        c11235y2.m54212k4().mo23218k4();
        AbstractC5728qw abstractC5728qwM23314k4 = AbstractC5728qw.m23314k4(this.f38768ix[i]);
        abstractC5728qwM23314k4.mo23149k4((AbstractC7201m9) new C11187gf(c11235y2.f38785k4, this));
        return abstractC5728qwM23314k4;
    }

    /* JADX INFO: renamed from: ks */
    public final InterfaceC11225vh m54198ks() {
        C11226vj c11226vj = this.f38763ck;
        C11226vj c11226vjM54068x1 = c11226vj.m54068x1();
        this.f38763ck = c11226vjM54068x1;
        this.f38769jd.m54071k4(c11226vjM54068x1.m54058k4());
        c11226vj.m54056dy();
        return c11226vj.m54065kk();
    }

    /* JADX INFO: renamed from: m9 */
    public final C11210qw m54199m9() {
        return this.f38771kk;
    }

    /* JADX INFO: renamed from: rv */
    public final void m54200rv() {
        ((C11231x1) this.f38773m9.m65178k4(r0.m65182to() - 1)).m54086c5();
    }

    /* JADX INFO: renamed from: to */
    public final ArrayList m54201to() {
        return this.f38778u4;
    }

    /* JADX INFO: renamed from: up */
    public final C11231x1 m54204up() {
        C11231x1 c11231x1 = (C11231x1) this.f38773m9.m65181kk();
        C11231x1 c11231x12 = (C11231x1) this.f38773m9.m65177k4();
        if (c11231x12 == null) {
            c11231x12 = new C11231x1();
            this.f38773m9.m65180k4(c11231x12);
        }
        if (c11231x1 != null) {
            c11231x12.m54101k4(c11231x1);
        }
        return c11231x12;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11207os m54205x1() {
        return this.f38782x1;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m54211yj() {
        return this.f38770k4 == 0;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m54164du(C11231x1 c11231x1, int i) {
        Object objM54206x1 = m54206x1(c11231x1, i);
        if (objM54206x1 == null) {
            return false;
        }
        AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(objM54206x1, AbstractC10925du.class);
        return abstractC10925du != null ? C14080ne.m66969k4(abstractC10925du.mo21843dy(), (InterfaceC14073kp) C11697x1.m55250kk()) : C14080ne.m66966k4(objM54206x1, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10925du m54171k4() {
        C11231x1 c11231x1 = (C11231x1) this.f38773m9.m65181kk();
        if (c11231x1 != null) {
            return c11231x1.m54088du();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13943n5 m54194kk() {
        return this.f38784yj;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC5728qw m54202to(int i) {
        return m54170k4(i, (C11187gf) null);
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m54206x1(C11231x1 c11231x1, int i) {
        return m54202to(i).mo23148k4(c11231x1.m54090h4());
    }

    /* JADX INFO: renamed from: du */
    public final C11176c6[] m54165du() {
        return this.f38777to;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10925du m54172k4(C14062gk c14062gk) {
        AbstractC10925du abstractC10925duCreateNavigator;
        Hashtable hashtable = this.f38780uz;
        if (hashtable != null) {
            AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(hashtable.get_Item(c14062gk), AbstractC10925du.class);
            if (abstractC10925du != null) {
                return abstractC10925du.deepClone();
            }
        } else {
            this.f38780uz = new Hashtable();
        }
        Object objMo5312k4 = this.f38784yj.mo5312k4(c14062gk, null, null);
        if (C7019kk.m27469x1(objMo5312k4, AbstractC3150x6.class)) {
            C13985tt c13985tt = new C13985tt(c14062gk.toString(), (AbstractC3150x6) objMo5312k4);
            c13985tt.m66099k4(this.f38784yj);
            abstractC10925duCreateNavigator = C11212rv.m53896k4(c13985tt).createNavigator();
        } else {
            if (!C7019kk.m27469x1(objMo5312k4, AbstractC10925du.class)) {
                throw XsltException.create("Cannot resolve the referenced document '{0}'.", c14062gk.toString());
            }
            abstractC10925duCreateNavigator = (AbstractC10925du) objMo5312k4;
        }
        this.f38780uz.set_Item(c14062gk, abstractC10925duCreateNavigator.deepClone());
        return abstractC10925duCreateNavigator;
    }

    /* JADX INFO: renamed from: kk */
    public final Object m54195kk(C11231x1 c11231x1, int i) {
        Object objMo23148k4 = m54193kk(i).mo23148k4(c11231x1.m54090h4());
        AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(objMo23148k4, AbstractC10929m9.class);
        return abstractC10929m9 != null ? new C5709jw(abstractC10929m9) : objMo23148k4;
    }

    /* JADX INFO: renamed from: to */
    public final String m54203to(C11231x1 c11231x1, int i) {
        Object objM54206x1 = m54206x1(c11231x1, i);
        String strM65148x1 = objM54206x1 != null ? C13850af.m65148x1(objM54206x1) : null;
        return strM65148x1 == null ? C14113y2.f47374k4 : strM65148x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m54207x1(C13890ei c13890ei) {
        return ((C11231x1) this.f38773m9.m65178k4(r0.m65182to() - 3)).m54093k4(c13890ei);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m54159to(AbstractC10925du abstractC10925du) {
        if (abstractC10925du.mo21857kk() == 0) {
            return true;
        }
        if (abstractC10925du.mo21857kk() != 1) {
            return false;
        }
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        abstractC10925duDeepClone.mo21848ix();
        return abstractC10925duDeepClone.mo21876x1(abstractC10925du);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10929m9 m54173k4(AbstractC10929m9 abstractC10929m9, int i) {
        AbstractC5728qw abstractC5728qwM54193kk = m54193kk(i);
        if (C7019kk.m27469x1(abstractC5728qwM54193kk.mo23148k4(abstractC10929m9), AbstractC10929m9.class)) {
            return new C5758x5(abstractC10929m9.mo21834kk(), abstractC5728qwM54193kk);
        }
        throw XsltException.create("Expression must evaluate to a node-set.", new String[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54196kk(AbstractC10925du abstractC10925du) {
        switch (abstractC10925du.mo21857kk()) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 9:
                return true;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
                return m54163du(abstractC10925du.mo21857kk());
            default:
                C6005k4.m24259k4("Invalid XPathNodeType in CopyEndEvent");
                return true;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m54208x1(String str) {
        return this.f38776rv.get_Item(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m54174k4(C11194j5 c11194j5) {
        int iM53814du = c11194j5.m53814du();
        if (!c11194j5.m53815h4()) {
            return ((C11231x1) this.f38773m9.m65181kk()).m54112to(iM53814du);
        }
        C11231x1 c11231x1 = (C11231x1) this.f38773m9.m65178k4(0);
        Object objM54112to = c11231x1.m54112to(iM53814du);
        if (objM54112to == C11194j5.f38571k4) {
            throw XsltException.create("Circular reference in the definition of variable '{0}'.", c11194j5.m53817to());
        }
        if (objM54112to != null) {
            return objM54112to;
        }
        int iM65182to = this.f38773m9.m65182to();
        C11231x1 c11231x1M54204up = m54204up();
        c11231x1M54204up.m54101k4(c11231x1);
        c11231x1M54204up.m54100k4(c11194j5, c11231x1.m54090h4());
        do {
            if (((C11231x1) this.f38773m9.m65181kk()).m54106k4(this)) {
                this.f38773m9.m65183x1();
            }
        } while (iM65182to < this.f38773m9.m65182to());
        return c11231x1.m54112to(iM53814du);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54197kk(String str) {
        return m54192k4(str, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m54209x1(int i) {
        return this.f38764du.get_Item(i).m54212k4().m23221kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m54175k4(C13890ei c13890ei) {
        Object objM27871k4 = this.f38772ks.m27871k4(c13890ei.m65289x1(), c13890ei.m65284k4());
        if (objM27871k4 == null) {
            return null;
        }
        return (C7019kk.m27469x1(objM27871k4, AbstractC10929m9.class) || C7019kk.m27469x1(objM27871k4, AbstractC10925du.class) || C7019kk.m27469x1(objM27871k4, Boolean.class) || C7019kk.m27469x1(objM27871k4, Double.class) || C7019kk.m27469x1(objM27871k4, String.class)) ? objM27871k4 : (C7019kk.m27469x1(objM27871k4, Short.class) || C7019kk.m27469x1(objM27871k4, Integer.class) || C7019kk.m27469x1(objM27871k4, Integer.class) || C7019kk.m27469x1(objM27871k4, Long.class) || C7019kk.m27469x1(objM27871k4, Long.class) || C7019kk.m27469x1(objM27871k4, Long.class) || C7019kk.m27469x1(objM27871k4, Float.class) || C7019kk.m27469x1(objM27871k4, C14046bv.class)) ? Double.valueOf(C13850af.m65076k4(objM27871k4)) : objM27871k4.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m54210x1(AbstractC10925du abstractC10925du) {
        switch (abstractC10925du.mo21857kk()) {
            case 0:
            case 1:
            case 3:
            case 9:
                return true;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return m54197kk(abstractC10925du.mo21843dy());
            default:
                C6005k4.m24259k4("Invalid XPathNodeType in CopyTextEvent");
                return true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m54176k4(String str) {
        return this.f38772ks.m27870k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m54177k4(AbstractC10925du abstractC10925du) {
        if (!this.f38782x1.m53869k4() || abstractC10925du.mo21857kk() != 1) {
            return abstractC10925du.mo21843dy();
        }
        C6765kp c6765kpM54161c5 = m54161c5();
        m54157k4(abstractC10925du, c6765kpM54161c5);
        m54169jd();
        return c6765kpM54161c5.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m54178k4(C11231x1 c11231x1, int i) {
        AbstractC5728qw abstractC5728qwM54170k4 = m54170k4(i, m54160x6());
        Object objMo23148k4 = abstractC5728qwM54170k4.mo23148k4(c11231x1.m54090h4());
        if (!C7019kk.m27469x1(objMo23148k4, AbstractC10929m9.class)) {
            return C13850af.m65148x1(objMo23148k4);
        }
        AbstractC10925du abstractC10925duMo23142m9 = abstractC5728qwM54170k4.mo23142m9();
        return abstractC10925duMo23142m9 != null ? m54177k4(abstractC10925duMo23142m9) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54179k4(int i) {
        this.f38770k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m54157k4(AbstractC10925du abstractC10925du, C6765kp c6765kp) {
        boolean zM53870k4 = m54205x1().m53870k4(this, abstractC10925du);
        if (abstractC10925du.mo21878x6()) {
            do {
                int iMo21857kk = abstractC10925du.mo21857kk();
                if (iMo21857kk == 1) {
                    m54157k4(abstractC10925du, c6765kp);
                } else if (iMo21857kk == 4 || iMo21857kk == 5 || (iMo21857kk == 6 && zM53870k4)) {
                    c6765kp.m26792k4(abstractC10925du.mo21843dy());
                }
            } while (abstractC10925du.mo21865rv());
            abstractC10925du.mo21864ne();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54180k4(AbstractC10929m9 abstractC10929m9, C13890ei c13890ei, C11207os c11207os) {
        this.f38774ne.m53669k4(c13890ei, c11207os);
        m54181k4(this.f38774ne, abstractC10929m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54181k4(AbstractC11197k4 abstractC11197k4, AbstractC10929m9 abstractC10929m9) {
        m54204up().m54100k4(abstractC11197k4, abstractC10929m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54182k4(C11218tq c11218tq) {
        this.f38778u4.addItem(c11218tq);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54183k4(InterfaceC11225vh interfaceC11225vh) {
        this.f38763ck.m54063k4(this.f38769jd.m54070k4());
        C11226vj c11226vj = this.f38763ck;
        C11226vj c11226vj2 = new C11226vj(interfaceC11225vh, this.f38779up);
        this.f38763ck = c11226vj2;
        c11226vj2.m54064k4(c11226vj);
        this.f38769jd.m54075x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54184k4(C11231x1 c11231x1) {
        m54185k4(c11231x1, c11231x1.m54090h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54185k4(C11231x1 c11231x1, AbstractC10929m9 abstractC10929m9) {
        m54204up().m54102k4(c11231x1, abstractC10929m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54186k4(C13890ei c13890ei, Object obj) {
        ((C11231x1) this.f38773m9.m65178k4(r0.m65182to() - 2)).m54104k4(c13890ei, obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54187k4(AbstractC13958qb abstractC13958qb) {
        this.f38763ck = new C11226vj(new C11236y9(this, abstractC13958qb), this.f38779up);
        m54167fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54188k4(int i, String str, String str2, String str3, boolean z) {
        return m54189k4(i, str, str2, str3, z, null, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54189k4(int i, String str, String str2, String str3, boolean z, Object obj, boolean z2) {
        int iM54074x1 = this.f38769jd.m54074x1(i);
        int i2 = this.f38762c5;
        if (i2 > 0 || iM54074x1 == 16) {
            this.f38762c5 = i2 + 1;
            return true;
        }
        int iM54060k4 = this.f38763ck.m54060k4(iM54074x1, i, str, str2, str3, z, obj, z2);
        if (iM54060k4 == 0) {
            this.f38769jd.m54072kk(i);
            return true;
        }
        if (iM54060k4 == 1) {
            this.f38769jd.m54072kk(i);
            m54179k4(1);
            return true;
        }
        if (iM54060k4 == 2) {
            m54179k4(1);
            return false;
        }
        if (iM54060k4 == 3) {
            this.f38762c5++;
            return true;
        }
        if (iM54060k4 != 4) {
            C6005k4.m24259k4("Unexpected result of RecordBuilder.BeginEvent()");
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54190k4(AbstractC10925du abstractC10925du, int i) {
        try {
            return m54170k4(i, m54158ne()).mo23147k4(abstractC10925du) != null;
        } catch (XPathException unused) {
            throw XsltException.create("'{0}' is an invalid XSLT pattern.", m54209x1(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54191k4(AbstractC10925du abstractC10925du, boolean z) {
        int iMo21857kk;
        String strMo21863m9;
        String strMo21867to;
        String strMo21841du;
        C11234xw c11234xw;
        boolean z2;
        switch (abstractC10925du.mo21857kk()) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 9:
                return true;
            case 1:
            case 2:
            case 7:
            case 8:
                iMo21857kk = abstractC10925du.mo21857kk();
                strMo21863m9 = abstractC10925du.mo21863m9();
                strMo21867to = abstractC10925du.mo21867to();
                strMo21841du = abstractC10925du.mo21841du();
                c11234xw = this;
                z2 = z;
                break;
            case 3:
                strMo21867to = abstractC10925du.mo21867to();
                strMo21841du = abstractC10925du.mo21843dy();
                z2 = false;
                iMo21857kk = 3;
                strMo21863m9 = null;
                c11234xw = this;
                break;
            default:
                C6005k4.m24259k4("Invalid XPathNodeType in CopyBeginEvent");
                return true;
        }
        return c11234xw.m54188k4(iMo21857kk, strMo21863m9, strMo21867to, strMo21841du, z2);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54192k4(String str, boolean z) {
        if (this.f38762c5 > 0) {
            return true;
        }
        int iM54061k4 = this.f38763ck.m54061k4(this.f38769jd.m54074x1(4), str, z);
        if (iM54061k4 == 0) {
            this.f38769jd.m54072kk(4);
            return true;
        }
        if (iM54061k4 == 1) {
            this.f38769jd.m54072kk(4);
            m54179k4(1);
            return true;
        }
        if (iM54061k4 == 2) {
            m54179k4(1);
            return false;
        }
        if (iM54061k4 != 3 && iM54061k4 != 4) {
            C6005k4.m24259k4("Unexpected result of RecordBuilder.TextEvent()");
        }
        return true;
    }
}
