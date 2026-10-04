package com.aspose.slides.internal.p284mx;

import OooooOo.C21392OooOo00;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p107eg.C3684du;
import com.aspose.slides.internal.p107eg.C3685dy;
import com.aspose.slides.internal.p107eg.C3686h4;
import com.aspose.slides.internal.p107eg.C3690m9;
import com.aspose.slides.internal.p107eg.C3691to;
import com.aspose.slides.internal.p116ev.C3802m9;
import com.aspose.slides.internal.p264m3.C6312k4;
import com.aspose.slides.internal.p264m3.InterfaceC6313x1;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6393m9;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p516y1.C12758k4;
import com.aspose.slides.internal.p516y1.C12759x1;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13640kk;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.internal.p558zz.C13642to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mx.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6618k4 {

    /* JADX INFO: renamed from: k4 */
    public static final int f18293k4 = C12758k4.m59433k4(1, 0);

    /* JADX INFO: renamed from: kk */
    private static final List<Integer> f18294kk;

    /* JADX INFO: renamed from: x1 */
    private static final List<Integer> f18295x1;

    /* JADX INFO: renamed from: du */
    private final byte[] f18296du;

    /* JADX INFO: renamed from: h4 */
    private long f18297h4;

    /* JADX INFO: renamed from: m9 */
    private Dictionary<Integer, C6393m9> f18298m9;

    /* JADX INFO: renamed from: to */
    private final int f18299to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.mx.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: c5 */
        private byte[] f18300c5;

        /* JADX INFO: renamed from: du */
        private int f18301du;

        /* JADX INFO: renamed from: dy */
        private Dictionary<C6394to, C13637dy> f18302dy;

        /* JADX INFO: renamed from: h4 */
        private int f18303h4;

        /* JADX INFO: renamed from: m9 */
        private int f18306m9;

        /* JADX INFO: renamed from: to */
        private int f18307to;

        /* JADX INFO: renamed from: x1 */
        private C6621x1 f18308x1;

        /* JADX INFO: renamed from: kk */
        private int f18305kk = C6618k4.f18293k4;

        /* JADX INFO: renamed from: k4 */
        private Dictionary<Integer, C6393m9.k4> f18304k4 = new Dictionary<>();

        private k4(C6621x1 c6621x1) {
            this.f18308x1 = c6621x1;
        }

        /* JADX INFO: renamed from: k4 */
        private static Dictionary<Integer, C6393m9.k4> m26397k4(Dictionary<C6394to, C13637dy> dictionary) {
            Dictionary<Integer, C6393m9.k4> dictionary2 = new Dictionary<>();
            Dictionary.KeyCollection.Enumerator<C6394to, C13637dy> it = dictionary.getKeys().iterator();
            while (it.hasNext()) {
                try {
                    C6394to next = it.next();
                    dictionary2.addItem(Integer.valueOf(next.m26231k4()), m26403k4(next, dictionary.get_Item(next)));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            m26408x1(dictionary2);
            return dictionary2;
        }

        /* JADX INFO: renamed from: x1 */
        private static void m26408x1(Dictionary<Integer, C6393m9.k4> dictionary) {
            C6393m9.k4[] k4VarArr = {null};
            C3691to.k4 k4Var = dictionary.tryGetValue(Integer.valueOf(C6619kk.f18329kk), k4VarArr) ? (C3691to.k4) k4VarArr[0] : null;
            k4VarArr[0] = k4VarArr[0];
            C3686h4.k4 k4Var2 = dictionary.tryGetValue(Integer.valueOf(C6619kk.f18342to), k4VarArr) ? (C3686h4.k4) k4VarArr[0] : null;
            k4VarArr[0] = k4VarArr[0];
            C3685dy.k4 k4Var3 = dictionary.tryGetValue(Integer.valueOf(C6619kk.f18325h4), k4VarArr) ? (C3685dy.k4) k4VarArr[0] : null;
            k4VarArr[0] = k4VarArr[0];
            C3802m9.k4 k4Var4 = dictionary.tryGetValue(Integer.valueOf(C6619kk.f18346up), k4VarArr) ? (C3802m9.k4) k4VarArr[0] : null;
            k4VarArr[0] = k4VarArr[0];
            C3690m9.k4 k4Var5 = dictionary.tryGetValue(Integer.valueOf(C6619kk.f18318du), k4VarArr) ? (C3690m9.k4) k4VarArr[0] : null;
            k4VarArr[0] = k4VarArr[0];
            C3684du.k4 k4Var6 = dictionary.tryGetValue(Integer.valueOf(C6619kk.f18348v4), k4VarArr) ? (C3684du.k4) k4VarArr[0] : null;
            if (k4Var5 != null) {
                if (k4Var3 != null) {
                    k4Var5.m14996x1(k4Var3.m14966ks());
                }
                if (k4Var2 != null) {
                    k4Var5.m14995k4(k4Var2.m14968ks());
                }
            }
            if (k4Var4 != null) {
                if (k4Var3 != null) {
                    k4Var4.m15204x1(k4Var3.m14966ks());
                }
                if (k4Var != null) {
                    k4Var4.m15203k4(k4Var.m15004ks());
                }
            }
            if (k4Var6 == null || k4Var3 == null) {
                return;
            }
            k4Var6.m14963k4(k4Var3.m14966ks());
        }

        /* JADX INFO: renamed from: k4 */
        private static Dictionary<C6394to, C13637dy> m26398k4(List<C6394to> list, C13637dy c13637dy) {
            Dictionary<C6394to, C13637dy> dictionary = new Dictionary<>(list.size());
            List.Enumerator<C6394to> it = list.iterator();
            while (it.hasNext()) {
                try {
                    C6394to next = it.next();
                    dictionary.addItem(next, (C13637dy) c13637dy.mo62967kk(next.m26235x1(), next.m26233kk()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return dictionary;
        }

        /* JADX INFO: renamed from: k4 */
        private static Dictionary<C6394to, C13637dy> m26399k4(List<C6394to> list, C13640kk c13640kk) {
            Dictionary<C6394to, C13637dy> dictionary = new Dictionary<>();
            List.Enumerator<C6394to> it = list.iterator();
            while (it.hasNext()) {
                try {
                    C6394to next = it.next();
                    c13640kk.m62986k4(((long) next.m26235x1()) - c13640kk.m62988kk());
                    C13640kk c13640kk2 = new C13640kk(c13640kk.m62987k4(), next.m26233kk());
                    C13637dy c13637dyM62959fa = C13637dy.m62959fa(next.m26233kk());
                    c13637dyM62959fa.m62965k4(c13640kk2.m62987k4(), next.m26233kk());
                    dictionary.addItem(next, c13637dyM62959fa);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return dictionary;
        }

        /* JADX INFO: renamed from: k4 */
        private static Dictionary<Integer, C6393m9> m26400k4(C6618k4 c6618k4, Dictionary<Integer, C6393m9.k4> dictionary) {
            C6393m9 c6393m9;
            Dictionary<Integer, C6393m9> dictionary2 = new Dictionary<>();
            m26408x1(dictionary);
            Dictionary.ValueCollection.Enumerator<Integer, C6393m9.k4> it = dictionary.getValues().iterator();
            long jM26224kk = 0;
            boolean zM26243du = false;
            C6393m9 c6393m92 = null;
            C3691to.k4 k4Var = null;
            while (it.hasNext()) {
                try {
                    C6393m9.k4 next = it.next();
                    if (C6619kk.m26413kk(next.m26228up().m26231k4())) {
                        k4Var = (C3691to.k4) next;
                    } else {
                        if (next.m26250x1()) {
                            zM26243du |= next.m26243du();
                            c6393m9 = (C6393m9) next.mo26221k4();
                        } else {
                            c6393m9 = null;
                        }
                        if (c6393m9 == null) {
                            throw new Exception("Unable to build table - " + next);
                        }
                        jM26224kk += c6393m9.m26224kk();
                        dictionary2.addItem(Integer.valueOf(c6393m9.m26225to().m26231k4()), c6393m9);
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
            if (k4Var != null) {
                if (zM26243du) {
                    k4Var.m15003k4(jM26224kk);
                }
                if (k4Var.m26250x1()) {
                    k4Var.m26243du();
                    c6393m92 = (C6393m9) k4Var.mo26221k4();
                }
                if (c6393m92 == null) {
                    throw new Exception("Unable to build table - " + k4Var);
                }
                jM26224kk += c6393m92.m26224kk();
                dictionary2.addItem(Integer.valueOf(c6393m92.m26225to().m26231k4()), c6393m92);
            }
            c6618k4.f18297h4 = jM26224kk & 4294967295L;
            return dictionary2;
        }

        /* JADX INFO: renamed from: k4 */
        private List<C6394to> m26401k4(C13640kk c13640kk) {
            List<C6394to> list = new List<>();
            this.f18305kk = c13640kk.m62984dy();
            this.f18307to = c13640kk.m62990to();
            this.f18301du = c13640kk.m62990to();
            this.f18303h4 = c13640kk.m62990to();
            this.f18306m9 = c13640kk.m62990to();
            for (int i = 0; i < this.f18307to; i++) {
                list.addItem(new C6394to(c13640kk.m62985h4(), c13640kk.m62983du(), c13640kk.m62985h4(), c13640kk.m62985h4()));
            }
            list.sort(C6394to.f18167k4);
            return list;
        }

        /* JADX INFO: renamed from: k4 */
        private List<C6394to> m26402k4(C13641m9 c13641m9, int i) {
            List<C6394to> list = new List<>();
            this.f18305kk = c13641m9.m63000jd(i);
            this.f18307to = c13641m9.m62997du(i + 4);
            this.f18301du = c13641m9.m62997du(i + 6);
            this.f18303h4 = c13641m9.m62997du(i + 8);
            this.f18306m9 = c13641m9.m62997du(i + 10);
            int i2 = i + 12;
            int i3 = 0;
            while (i3 < this.f18307to) {
                list.addItem(new C6394to(c13641m9.m62998dy(i2), c13641m9.m63007m9(i2 + 4), c13641m9.m62998dy(i2 + 8), c13641m9.m62998dy(i2 + 12)));
                i3++;
                i2 += 16;
            }
            list.sort(C6394to.f18167k4);
            return list;
        }

        /* JADX INFO: renamed from: k4 */
        private static C6393m9.k4 m26403k4(C6394to c6394to, C13637dy c13637dy) {
            return C6393m9.k4.m26226x1(c6394to, c13637dy);
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m26404k4(C6621x1 c6621x1, C3148wl c3148wl) throws Throwable {
            k4 k4Var = new k4(c6621x1);
            k4Var.m26406k4(c3148wl);
            return k4Var;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m26405k4(C6621x1 c6621x1, C13637dy c13637dy, int i) {
            k4 k4Var = new k4(c6621x1);
            k4Var.m26407k4(c13637dy, i);
            return k4Var;
        }

        /* JADX INFO: renamed from: k4 */
        public final C6618k4 m26409k4() {
            C6618k4 c6618k4 = new C6618k4(this.f18305kk, this.f18300c5);
            c6618k4.f18298m9 = this.f18304k4.size() > 0 ? m26400k4(c6618k4, this.f18304k4) : null;
            this.f18304k4 = null;
            this.f18302dy = null;
            return c6618k4;
        }

        /* JADX INFO: renamed from: k4 */
        private void m26406k4(C3148wl c3148wl) throws Throwable {
            if (c3148wl == null) {
                throw new IOException("No input stream for font.");
            }
            C13640kk c13640kk = null;
            try {
                C13640kk c13640kk2 = new C13640kk(c3148wl);
                try {
                    Dictionary<C6394to, C13637dy> dictionaryM26399k4 = m26399k4(m26401k4(c13640kk2), c13640kk2);
                    this.f18302dy = dictionaryM26399k4;
                    this.f18304k4 = m26397k4(dictionaryM26399k4);
                    c13640kk2.m62987k4().mo13059to();
                } catch (Throwable th) {
                    th = th;
                    c13640kk = c13640kk2;
                    c13640kk.m62987k4().mo13059to();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m26407k4(C13637dy c13637dy, int i) {
            if (c13637dy == null) {
                throw new IOException("No data for font.");
            }
            Dictionary<C6394to, C13637dy> dictionaryM26398k4 = m26398k4(m26402k4((C13641m9) c13637dy, i), c13637dy);
            this.f18302dy = dictionaryM26398k4;
            this.f18304k4 = m26397k4(dictionaryM26398k4);
        }
    }

    static {
        List<Integer> list = new List<>();
        f18295x1 = list;
        int i = C6619kk.f18329kk;
        list.addItem(Integer.valueOf(i));
        int i2 = C6619kk.f18342to;
        list.addItem(Integer.valueOf(i2));
        int i3 = C6619kk.f18325h4;
        list.addItem(Integer.valueOf(i3));
        int i4 = C6619kk.f18319dy;
        list.addItem(Integer.valueOf(i4));
        int i5 = C6619kk.f18333m9;
        list.addItem(Integer.valueOf(i5));
        int i6 = C6619kk.f18352x1;
        list.addItem(Integer.valueOf(i6));
        int i7 = C6619kk.f18314c5;
        list.addItem(Integer.valueOf(i7));
        list.addItem(Integer.valueOf(C6619kk.f18331ks));
        List<Integer> list2 = new List<>();
        f18294kk = list2;
        OooO0O0.OooO00o(i, list2, i2, i3, i4);
        list2.addItem(Integer.valueOf(C6619kk.f18318du));
        list2.addItem(Integer.valueOf(C6619kk.f18355yd));
        list2.addItem(Integer.valueOf(C6619kk.f18351wy));
        OooO00o.OooO00o(C6619kk.f18348v4, i6, list2);
        list2.addItem(Integer.valueOf(C6619kk.f18316ck));
        list2.addItem(Integer.valueOf(C6619kk.f18356yj));
        list2.addItem(Integer.valueOf(C6619kk.f18327jd));
        list2.addItem(Integer.valueOf(C6619kk.f18346up));
        list2.addItem(Integer.valueOf(C6619kk.f18322fa));
        C21392OooOo00.OooO0O0(C6619kk.f18332lr, i5, i7, list2);
        list2.addItem(Integer.valueOf(C6619kk.f18312bv));
        list2.addItem(Integer.valueOf(C6619kk.f18311b3));
        list2.addItem(Integer.valueOf(C6619kk.f18345um));
    }

    private C6618k4(int i, byte[] bArr) {
        this.f18299to = i;
        this.f18296du = bArr;
    }

    /* JADX INFO: renamed from: du */
    private List<Integer> m26383du() {
        return m26391k4(C6619kk.f18331ks) ? f18295x1 : f18294kk;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC6313x1 m26393kk() {
        return new C6312k4(this.f18298m9.getValues());
    }

    /* JADX INFO: renamed from: to */
    public final Dictionary<Integer, C6393m9> m26394to() {
        return this.f18298m9;
    }

    public final String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("digest = ");
        byte[] bArrM26392k4 = m26392k4();
        if (bArrM26392k4 != null) {
            for (byte b : bArrM26392k4) {
                int i = b & 255;
                if (i < 16) {
                    c6765kpOooO00o.m26792k4("0");
                }
                c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(i)));
            }
        }
        c6765kpOooO00o.m26792k4("\n[");
        c6765kpOooO00o.m26792k4(C12758k4.m59434kk(this.f18299to));
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26805kk(m26395x1());
        c6765kpOooO00o.m26792k4("]\n");
        InterfaceC6313x1 interfaceC6313x1M26393kk = m26393kk();
        while (interfaceC6313x1M26393kk.mo14953k4()) {
            AbstractC6395x1 abstractC6395x1 = (AbstractC6395x1) interfaceC6313x1M26393kk.mo14954x1();
            c6765kpOooO00o.m26792k4("\t");
            c6765kpOooO00o.m26791k4(abstractC6395x1);
            c6765kpOooO00o.m26792k4(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m26395x1() {
        return this.f18298m9.size();
    }

    /* JADX INFO: renamed from: x1 */
    private List<Integer> m26388x1(List<Integer> list) {
        Class cls;
        if (list == null) {
            list = m26383du();
        }
        List list2 = new List();
        Dictionary.KeyCollection.Enumerator<Integer, C6393m9> it = this.f18298m9.getKeys().iterator();
        while (true) {
            try {
                boolean zHasNext = it.hasNext();
                cls = Integer.TYPE;
                if (!zHasNext) {
                    break;
                }
                Integer num = (Integer) C7019kk.m27464to(it.next(), cls);
                num.intValue();
                list2.addItem(num);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List<Integer> list3 = new List<>(this.f18298m9.size());
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                Integer num2 = (Integer) C7019kk.m27464to(it2.next(), cls);
                if (m26391k4(num2.intValue())) {
                    list3.addItem(num2);
                    list2.removeItem(num2);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                Integer num3 = (Integer) C7019kk.m27464to(it2.next(), cls);
                num3.intValue();
                list3.addItem(num3);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return list3;
    }

    /* JADX INFO: renamed from: k4 */
    private List<C6394to> m26386k4(List<Integer> list) {
        List<Integer> listM26388x1 = m26388x1(list);
        List<C6394to> list2 = new List<>(m26395x1());
        int iM26395x1 = (m26395x1() * 16) + 12;
        List.Enumerator<Integer> it = listM26388x1.iterator();
        int iM26240x1 = iM26395x1;
        while (it.hasNext()) {
            try {
                Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                int iIntValue = num.intValue();
                C6393m9[] c6393m9Arr = {null};
                boolean zTryGetValue = this.f18298m9.tryGetValue(num, c6393m9Arr);
                C6393m9 c6393m9 = c6393m9Arr[0];
                if (zTryGetValue) {
                    list2.addItem(new C6394to(iIntValue, c6393m9.m26224kk(), iM26240x1, c6393m9.m26225to().m26233kk()));
                    iM26240x1 += (c6393m9.m26240x1() + 3) & (-4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6393m9 m26396x1(int i) {
        C6393m9[] c6393m9Arr = {null};
        this.f18298m9.tryGetValue(Integer.valueOf(i), c6393m9Arr);
        return c6393m9Arr[0];
    }

    /* JADX INFO: renamed from: x1 */
    private void m26389x1(C13642to c13642to, List<C6394to> list) {
        List.Enumerator<C6394to> it = list.iterator();
        while (it.hasNext()) {
            try {
                C6393m9 c6393m9M26396x1 = m26396x1(it.next().m26231k4());
                if (c6393m9M26396x1 == null) {
                    throw new IOException("Table out of sync with font header.");
                }
                int iM26238k4 = c6393m9M26396x1.m26238k4(c13642to.m63009k4());
                int i = ((iM26238k4 + 3) & (-4)) - iM26238k4;
                for (int i2 = 0; i2 < i; i2++) {
                    c13642to.m63010k4(0);
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26390k4(C3123ar c3123ar, List<Integer> list) {
        List<C6394to> listM26386k4 = m26386k4(m26388x1(list));
        C13642to c13642to = new C13642to(c3123ar);
        m26387k4(c13642to, listM26386k4);
        m26389x1(c13642to, listM26386k4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m26387k4(C13642to c13642to, List<C6394to> list) {
        c13642to.m63012kk(this.f18299to);
        c13642to.m63013x1(list.size());
        int iM59436k4 = C12759x1.m59436k4(list.size());
        int i = 2 << (iM59436k4 + 3);
        c13642to.m63013x1(i);
        c13642to.m63013x1(iM59436k4);
        c13642to.m63013x1((list.size() * 16) - i);
        List list2 = new List(list);
        list2.sort(C6394to.f18168x1);
        List.Enumerator it = list2.iterator();
        while (it.hasNext()) {
            try {
                C6394to c6394to = (C6394to) it.next();
                c13642to.m63011k4(c6394to.m26231k4());
                c13642to.m63011k4(c6394to.m26234to());
                c13642to.m63011k4(c6394to.m26235x1());
                c13642to.m63011k4(c6394to.m26233kk());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m26391k4(int i) {
        return this.f18298m9.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m26392k4() {
        byte[] bArr = this.f18296du;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), this.f18296du.length);
        return bArr2;
    }
}
