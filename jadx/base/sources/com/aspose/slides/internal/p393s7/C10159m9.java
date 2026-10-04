package com.aspose.slides.internal.p393s7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p048bv.C1868rv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9571du;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10159m9 {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f36553dy = new C7017h4("helvetica", "khmer", "lao", "meiryo", "courier", "segoe", "serif", "sans-serif", "cursive", "fantasy", "monospace");

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, AbstractC10164x6> f36556k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<C10155jd, Integer> f36557kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<String, AbstractC10164x6> f36559to;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<C10155jd, String> f36560x1;

    /* JADX INFO: renamed from: du */
    private Dictionary<C10155jd, Dictionary<k4, C10161to>> f36554du = null;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC10162up f36555h4 = null;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<C10155jd, C10155jd> f36558m9 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.s7.m9$k4 */
    public static final class k4 {

        /* JADX INFO: renamed from: k4 */
        private final int f36561k4;

        /* JADX INFO: renamed from: x1 */
        private final int f36562x1;

        public k4(int i, int i2) {
            this.f36561k4 = i;
            this.f36562x1 = i2;
        }

        public boolean equals(Object obj) {
            k4 k4Var = (k4) C7019kk.m27452k4(obj, k4.class);
            if (C14067j2.m66729x1(null, k4Var)) {
                return false;
            }
            if (C14067j2.m66729x1(this, k4Var)) {
                return true;
            }
            return C14057f9.m66592x1(k4Var.hashCode(), hashCode());
        }

        public int hashCode() {
            return C14057f9.m66579k4(this.f36562x1) + ((C14057f9.m66579k4(this.f36561k4) + 629) * 37);
        }
    }

    public C10159m9() {
        this.f36556k4 = null;
        this.f36560x1 = null;
        this.f36557kk = null;
        this.f36559to = null;
        this.f36560x1 = new Dictionary<>();
        this.f36557kk = new Dictionary<>();
        this.f36559to = new Dictionary<>();
        this.f36556k4 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    private List<C10155jd> m49944k4(String[] strArr, String str, int i, int i2, boolean z) {
        List<C10155jd> list = new List<>();
        int i3 = 0;
        while (i3 < strArr.length) {
            String str2 = str;
            int i4 = i;
            int i5 = i2;
            boolean z2 = z;
            C10155jd c10155jdM49946k4 = m49946k4(strArr[i3], str2, i4, i5, z2);
            if (c10155jdM49946k4 != null) {
                list.addItem(c10155jdM49946k4);
            }
            i3++;
            str = str2;
            i = i4;
            i2 = i5;
            z = z2;
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    private Dictionary<C10155jd, Dictionary<k4, C10161to>> m49949to() {
        if (this.f36554du == null) {
            this.f36554du = new Dictionary<>();
        }
        return this.f36554du;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<C10155jd, String> m49964kk() {
        return this.f36560x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        List list = new List();
        Dictionary.KeyCollection.Enumerator<C10155jd, String> it = this.f36560x1.getKeys().iterator();
        while (it.hasNext()) {
            try {
                C10155jd next = it.next();
                String strM49956k4 = m49956k4(next);
                list.addItem(C14113y2.m67408k4(next.toString(), " -> ", strM49956k4, " -> ", m49966x1(strM49956k4).mo15575x1(), IOUtils.LINE_SEPARATOR_UNIX));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.sort();
        C6765kp c6765kp = new C6765kp();
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                c6765kp.m26792k4((String) it2.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, AbstractC10164x6> m49965x1() {
        return this.f36559to;
    }

    /* JADX INFO: renamed from: kk */
    private String m49948kk(String str) {
        String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
        if (C14113y2.m67448x1(strM67398k4, "arial")) {
            return null;
        }
        int iM27428k4 = f36553dy.m27428k4(strM67398k4);
        if (iM27428k4 == 0) {
            return "Arial";
        }
        if (iM27428k4 == 1) {
            return "Khmer UI";
        }
        if (iM27428k4 == 2) {
            return "Lao UI";
        }
        if (iM27428k4 == 3) {
            return "Meiryo UI";
        }
        if (iM27428k4 == 4) {
            return "Courier New";
        }
        if (iM27428k4 == 5) {
            return "Segoe UI";
        }
        int iM67418kk = C14113y2.m67418kk(strM67398k4, ControlChar.SPACE_CHAR);
        if (iM67418kk >= 0) {
            return C14113y2.m67443x1(strM67398k4, 0, iM67418kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    private String m49950to(String str) {
        String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
        switch (f36553dy.m27428k4(strM67398k4)) {
            case 6:
                return "Times";
            case 7:
                return "Arial";
            case 8:
                return "Zapf-Chancery";
            case 9:
                return "Western";
            case 10:
                return "Courier";
            default:
                return strM67398k4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static C10155jd m49951x1(String str, String str2, int i, int i2) {
        return new C10155jd(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10155jd m49953k4(String str, String str2, int i, int i2) {
        C10155jd c10155jdM49951x1;
        String strM49956k4;
        if (i < 400) {
            int i3 = i;
            strM49956k4 = null;
            c10155jdM49951x1 = null;
            while (strM49956k4 == null && i3 > 100) {
                i3 -= 100;
                c10155jdM49951x1 = m49951x1(str, str2, i3, i2);
                strM49956k4 = m49956k4(c10155jdM49951x1);
            }
            int i4 = i;
            while (strM49956k4 == null && i4 < 400) {
                i4 += 100;
                c10155jdM49951x1 = m49951x1(str, str2, i4, i2);
                strM49956k4 = m49956k4(c10155jdM49951x1);
            }
        } else if (i == 400 || i == 500) {
            c10155jdM49951x1 = m49951x1(str, str2, 400, i2);
            strM49956k4 = m49956k4(c10155jdM49951x1);
        } else if (i > 500) {
            int i5 = i;
            strM49956k4 = null;
            c10155jdM49951x1 = null;
            while (strM49956k4 == null && i5 < 1000) {
                i5 += 100;
                c10155jdM49951x1 = m49951x1(str, str2, i5, i2);
                strM49956k4 = m49956k4(c10155jdM49951x1);
            }
            int i6 = i;
            while (strM49956k4 == null && i6 > 400) {
                i6 -= 100;
                c10155jdM49951x1 = m49951x1(str, str2, i6, i2);
                strM49956k4 = m49956k4(c10155jdM49951x1);
            }
        } else {
            strM49956k4 = null;
            c10155jdM49951x1 = null;
        }
        if (strM49956k4 == null && i != 400) {
            c10155jdM49951x1 = m49951x1(str, str2, 400, i2);
            strM49956k4 = m49956k4(c10155jdM49951x1);
        }
        if (strM49956k4 != null) {
            return c10155jdM49951x1;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10155jd m49954k4(String str, String str2, int i, int i2, int i3) {
        return m49946k4(str, str2, i, i2, true);
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC10158ks m49966x1(String str) {
        AbstractC10164x6[] abstractC10164x6Arr = {null};
        this.f36559to.tryGetValue(str, abstractC10164x6Arr);
        AbstractC10164x6 abstractC10164x6 = abstractC10164x6Arr[0];
        this.f36556k4.set_Item(str, abstractC10164x6);
        return abstractC10164x6;
    }

    /* JADX INFO: renamed from: k4 */
    private C10155jd m49945k4(String str, String str2, int i, int i2, C10155jd c10155jd, boolean z) {
        String strM49956k4;
        if (C14113y2.m67363du(str, c10155jd.m49937k4())) {
            strM49956k4 = null;
        } else {
            C10155jd c10155jdM49951x1 = m49951x1(str, str2, i, i2);
            strM49956k4 = m49956k4(c10155jdM49951x1);
            if (strM49956k4 != null) {
                return c10155jdM49951x1;
            }
        }
        C10155jd c10155jdM49953k4 = m49953k4(str, str2, i, i2);
        if (c10155jdM49953k4 != null) {
            strM49956k4 = m49956k4(c10155jdM49953k4);
        }
        if (!z && strM49956k4 == null) {
            return null;
        }
        if (strM49956k4 == null && !"normal".equals(str2)) {
            c10155jdM49953k4 = m49951x1(str, "normal", i, i2);
            strM49956k4 = m49956k4(c10155jdM49953k4);
        }
        if (strM49956k4 == null && !"normal".equals(str2) && (c10155jdM49953k4 = m49953k4(str, "normal", i, i2)) != null) {
            strM49956k4 = m49956k4(c10155jdM49953k4);
        }
        return strM49956k4 == null ? m49945k4("any", str2, i, i2, c10155jd, false) : c10155jdM49953k4;
    }

    /* JADX INFO: renamed from: x1 */
    private String m49952x1(C10155jd c10155jd) {
        byte[] array;
        C5659x1 c5659x1;
        String strM49937k4 = c10155jd.m49937k4();
        int iM49938kk = c10155jd.m49938kk();
        String strM49940x1 = c10155jd.m49940x1();
        int i = iM49938kk >= 700 ? 1 : 0;
        if ("italic".equals(strM49940x1) || "oblique".equals(strM49940x1)) {
            i |= 2;
        }
        String strM49950to = m49950to(strM49937k4);
        C9790ts c9790tsM9782k4 = C1868rv.m9778k4().m9782k4(strM49950to, strM49940x1, iM49938kk);
        if (c9790tsM9782k4 != null) {
            c5659x1 = new C5659x1(1.0f, i, c9790tsM9782k4);
        } else {
            String strM49948kk = m49948kk(strM49950to);
            C5659x1 c5659x1M48332k4 = C9763ck.m48030to().m48332k4(strM49950to, 1.0f, i, strM49948kk);
            if (!C9571du.m46734k4(c5659x1M48332k4.m23123m9(), strM49950to) && (strM49948kk == null || !C9571du.m46734k4(c5659x1M48332k4.m23123m9(), strM49948kk))) {
                return null;
            }
            AbstractC3150x6 abstractC3150x6Mo47984x1 = c5659x1M48332k4.m23120k4().m48233um().mo47984x1();
            C3130fa c3130fa = (C3130fa) C7019kk.m27452k4((Object) abstractC3150x6Mo47984x1, C3130fa.class);
            if (c3130fa != null) {
                c3130fa.seek(0L, 0);
                array = C12565ks.m58632x1(c3130fa);
            } else {
                array = ((C3152yj) abstractC3150x6Mo47984x1).toArray();
            }
            try {
                C1868rv.m9778k4().m9785x1(strM49950to, strM49940x1, iM49938kk, array);
            } catch (RuntimeException unused) {
            }
            c5659x1 = c5659x1M48332k4;
        }
        String strM67408k4 = C14113y2.m67408k4("F", C14057f9.m66591x1(this.f36559to.size() + 1));
        m49960k4(strM67408k4, new C10157kk(c5659x1, strM49950to));
        m49959k4(strM67408k4, c10155jd);
        return strM67408k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C10155jd m49946k4(String str, String str2, int i, int i2, boolean z) {
        C10159m9 c10159m9;
        C10155jd c10155jdM49945k4;
        C10155jd c10155jdM49951x1 = m49951x1(str, str2, i, i2);
        String strM49956k4 = m49956k4(c10155jdM49951x1);
        if (strM49956k4 == null) {
            if (this.f36558m9.containsKey(c10155jdM49951x1)) {
                return this.f36558m9.get_Item(c10155jdM49951x1);
            }
            strM49956k4 = m49952x1(c10155jdM49951x1);
        }
        if (strM49956k4 == null) {
            c10159m9 = this;
            c10155jdM49945k4 = c10159m9.m49945k4(str, str2, i, i2, c10155jdM49951x1, z);
        } else {
            c10159m9 = this;
            c10155jdM49945k4 = c10155jdM49951x1;
        }
        if (c10155jdM49945k4 == null) {
            return null;
        }
        if (c10155jdM49945k4 != c10155jdM49951x1) {
            if (!c10159m9.f36558m9.containsKey(c10155jdM49951x1)) {
                c10159m9.f36558m9.addItem(c10155jdM49951x1, c10155jdM49945k4);
            }
            m49947k4(c10155jdM49951x1, c10155jdM49945k4);
        }
        return c10155jdM49945k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10161to m49955k4(C10155jd c10155jd, int i, int i2) {
        Dictionary<k4, C10161to>[] dictionaryArr = {null};
        boolean zTryGetValue = m49949to().tryGetValue(c10155jd, dictionaryArr);
        Dictionary<k4, C10161to> dictionary = dictionaryArr[0];
        if (!zTryGetValue) {
            dictionary = new Dictionary<>();
            m49949to().addItem(c10155jd, dictionary);
        }
        k4 k4Var = new k4(i, i2);
        C10161to[] c10161toArr = {null};
        boolean zTryGetValue2 = dictionary.tryGetValue(k4Var, c10161toArr);
        C10161to c10161to = c10161toArr[0];
        if (zTryGetValue2) {
            return c10161to;
        }
        String strM49956k4 = m49956k4(c10155jd);
        m49958k4(strM49956k4);
        C10161to c10161to2 = new C10161to(strM49956k4, c10155jd, m49966x1(strM49956k4), i, i2);
        dictionary.addItem(k4Var, c10161to2);
        return c10161to2;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m49956k4(C10155jd c10155jd) {
        if (this.f36560x1.containsKey(c10155jd)) {
            return this.f36560x1.get_Item(c10155jd);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m49947k4(C10155jd c10155jd, C10155jd c10155jd2) {
        InterfaceC10162up interfaceC10162up = this.f36555h4;
        if (interfaceC10162up != null) {
            interfaceC10162up.mo49929k4(this, c10155jd, c10155jd2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49957k4(InterfaceC10162up interfaceC10162up) {
        this.f36555h4 = interfaceC10162up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49958k4(String str) {
        this.f36556k4.set_Item(str, this.f36559to.get_Item(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49959k4(String str, C10155jd c10155jd) {
        this.f36560x1.addItem(c10155jd, str);
        if (this.f36557kk != null) {
            this.f36557kk.addItem(c10155jd, Integer.valueOf(c10155jd.m49939to()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49960k4(String str, InterfaceC10158ks interfaceC10158ks) {
        if (C7019kk.m27469x1(interfaceC10158ks, AbstractC10164x6.class)) {
            ((AbstractC10164x6) interfaceC10158ks).m49990k4(this.f36555h4);
        }
        this.f36559to.addItem(str, (AbstractC10164x6) interfaceC10158ks);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49961k4(String str, String str2, String str3, int i) {
        m49959k4(str, m49951x1(str2, str3, i, 97));
        m49959k4(str, m49951x1(str2, str3, i, 131));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m49962k4() {
        this.f36557kk = null;
        return this.f36560x1.containsKey(C10161to.f36563k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10155jd[] m49963k4(String[] strArr, String str, int i, int i2) {
        if (strArr.length == 0) {
            strArr = new String[]{"Helvetica"};
        }
        String[] strArr2 = strArr;
        List<C10155jd> listM49944k4 = m49944k4(strArr2, str, i, i2, false);
        if (listM49944k4.size() == 0) {
            listM49944k4 = m49944k4(strArr2, str, i, i2, true);
        }
        if (listM49944k4.size() != 0) {
            return listM49944k4.toArray(new C10155jd[0]);
        }
        C6765kp c6765kp = new C6765kp();
        int length = strArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4(strArr2[i3]);
        }
        throw new InvalidOperationException(C14113y2.m67408k4("fontLookup must return an array with at least one ", "FontTriplet on the last call. Lookup: ", c6765kp.toString()));
    }
}
