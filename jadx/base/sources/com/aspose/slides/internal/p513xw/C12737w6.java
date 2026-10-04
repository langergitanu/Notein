package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p034b3.C1577ak;
import com.aspose.slides.internal.p034b3.C1578ar;
import com.aspose.slides.internal.p034b3.C1580bv;
import com.aspose.slides.internal.p034b3.C1586fa;
import com.aspose.slides.internal.p034b3.C1593lr;
import com.aspose.slides.internal.p034b3.C1594m9;
import com.aspose.slides.internal.p034b3.C1603v4;
import com.aspose.slides.internal.p034b3.InterfaceC1599u4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.C10339qq;
import com.aspose.slides.internal.p409sv.C10765ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.w6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12737w6 extends C1594m9 implements InterfaceC1599u4 {

    /* JADX INFO: renamed from: c5 */
    private int f42439c5;

    /* JADX INFO: renamed from: ck */
    private C1603v4 f42440ck;

    /* JADX INFO: renamed from: du */
    private int f42441du;

    /* JADX INFO: renamed from: dy */
    private String f42442dy;

    /* JADX INFO: renamed from: fa */
    private List<String> f42443fa;

    /* JADX INFO: renamed from: ix */
    private Dictionary<String, C10765ar> f42444ix;

    /* JADX INFO: renamed from: jd */
    private boolean f42445jd;

    /* JADX INFO: renamed from: k4 */
    private C1580bv f42446k4;

    /* JADX INFO: renamed from: kk */
    private String f42447kk;

    /* JADX INFO: renamed from: ks */
    private Dictionary<String, C10765ar> f42448ks;

    /* JADX INFO: renamed from: ne */
    private Dictionary<String, C10765ar> f42449ne;

    /* JADX INFO: renamed from: rv */
    private Dictionary<String, C10765ar> f42450rv;

    /* JADX INFO: renamed from: to */
    private String f42451to;

    /* JADX INFO: renamed from: up */
    private Dictionary<String, List<InterfaceC1599u4>> f42452up;

    /* JADX INFO: renamed from: x1 */
    private C12007ix f42453x1;

    /* JADX INFO: renamed from: x6 */
    private Dictionary<String, C10765ar> f42454x6;

    /* JADX INFO: renamed from: yj */
    private Dictionary<String, List<C12737w6>> f42455yj;

    public C12737w6() {
        this.f42453x1 = new C12007ix();
        this.f42441du = -1;
        this.f42442dy = null;
        this.f42439c5 = -1;
        this.f42443fa = new List<>();
        this.f42452up = new Dictionary<>();
        this.f42455yj = null;
        this.f42448ks = null;
        this.f42450rv = null;
        this.f42454x6 = null;
        this.f42449ne = null;
        this.f42444ix = null;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m59333c5() {
        return this.f42445jd;
    }

    /* JADX INFO: renamed from: ck */
    public final C1577ak m59334ck() {
        return m59339jd().m8566qq().m8617uz();
    }

    public final Object clone() {
        C12737w6 c12737w6 = (C12737w6) super.mo8601k4(new C12737w6());
        c12737w6.f42446k4 = (C1580bv) this.f42446k4.clone();
        this.f42453x1.CloneTo(c12737w6.f42453x1);
        return c12737w6;
    }

    /* JADX INFO: renamed from: du */
    public final C1580bv m59335du() {
        return this.f42446k4;
    }

    /* JADX INFO: renamed from: dy */
    public final void m59336dy() {
        this.f42446k4 = null;
    }

    /* JADX INFO: renamed from: fa */
    public final C1578ar m59337fa() {
        return m59334ck().m8477qq();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m59338h4() {
        return this.f42442dy;
    }

    /* JADX INFO: renamed from: jd */
    public final C1586fa m59339jd() {
        return (C1586fa) m59335du().m8495k4(58).m8684u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C1577ak m59340k4(boolean z) {
        return m59339jd().m8566qq().m8619x1(z);
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: kk */
    public final boolean mo8591kk() {
        Dictionary<String, List<InterfaceC1599u4>> dictionary = this.f42452up;
        return dictionary == null || dictionary.size() == 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m59349m9() {
        String str = this.f42451to;
        if (str != null) {
            return str;
        }
        throw new Exception(C14113y2.m67408k4("No page key set on the PageViewport: ", toString()));
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: to */
    public final String[] mo8592to() {
        Dictionary<String, List<InterfaceC1599u4>> dictionary = this.f42452up;
        if (dictionary == null) {
            return null;
        }
        String[] strArr = new String[dictionary.getKeys().size()];
        Dictionary.KeyCollection.Enumerator<String, List<InterfaceC1599u4>> it = this.f42452up.getKeys().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                strArr[i] = it.next();
                i++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return strArr;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(64);
        c6765kp.m26792k4("PageViewport: page=");
        c6765kp.m26792k4(m59338h4());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C1593lr m59350x1(int i) {
        return m59335du().m8495k4(i).m8684u4();
    }

    public C12737w6(C10339qq c10339qq, int i, String str, boolean z, boolean z2) {
        this.f42453x1 = new C12007ix();
        this.f42441du = -1;
        this.f42442dy = null;
        this.f42439c5 = -1;
        this.f42443fa = new List<>();
        this.f42452up = new Dictionary<>();
        this.f42455yj = null;
        this.f42448ks = null;
        this.f42450rv = null;
        this.f42454x6 = null;
        this.f42449ne = null;
        this.f42444ix = null;
        this.f42447kk = c10339qq.m50378bz();
        m8603k4(c10339qq.m14319dq());
        m8605x1(c10339qq.m14318c6());
        this.f42445jd = z;
        int iMo9884to = c10339qq.m50386qm().mo9884to();
        int iMo9884to2 = c10339qq.m50382g8().mo9884to();
        this.f42441du = i;
        this.f42442dy = str;
        this.f42453x1 = new C12007ix(0.0f, 0.0f, iMo9884to, iMo9884to2);
        this.f42446k4 = new C1580bv(c10339qq);
        m59340k4(z2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1603v4 m59341k4() {
        return this.f42440ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m59351x1() {
        return this.f42453x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10765ar m59342k4(String str, int i) {
        String str2;
        Dictionary<String, C10765ar> dictionary;
        String str3;
        Dictionary<String, C10765ar> dictionary2;
        String str4;
        Dictionary<String, C10765ar> dictionary3;
        C10765ar c10765ar = null;
        if (i == 49) {
            Dictionary<String, C10765ar> dictionary4 = this.f42454x6;
            if (dictionary4 != null) {
                C10765ar[] c10765arArr = {null};
                dictionary4.tryGetValue(str, c10765arArr);
                return c10765arArr[0];
            }
        } else {
            if (i == 54) {
                Dictionary<String, C10765ar> dictionary5 = this.f42448ks;
                if (dictionary5 != null) {
                    C10765ar[] c10765arArr2 = {null};
                    dictionary5.tryGetValue(str, c10765arArr2);
                    c10765ar = c10765arArr2[0];
                    str2 = "FSWP";
                } else {
                    str2 = null;
                }
                if (c10765ar != null || (dictionary = this.f42454x6) == null) {
                    return c10765ar;
                }
                C10765ar[] c10765arArr3 = {c10765ar};
                dictionary.tryGetValue(str, c10765arArr3);
                C10765ar c10765ar2 = c10765arArr3[0];
                C14113y2.m67408k4("FirstAny after ", str2);
                return c10765ar2;
            }
            if (i == 74) {
                Dictionary<String, C10765ar> dictionary6 = this.f42449ne;
                if (dictionary6 != null) {
                    C10765ar[] c10765arArr4 = {null};
                    dictionary6.tryGetValue(str, c10765arArr4);
                    c10765ar = c10765arArr4[0];
                    str3 = "LEWP";
                } else {
                    str3 = null;
                }
                if (c10765ar != null || (dictionary2 = this.f42444ix) == null) {
                    return c10765ar;
                }
                C10765ar[] c10765arArr5 = {c10765ar};
                dictionary2.tryGetValue(str, c10765arArr5);
                C10765ar c10765ar3 = c10765arArr5[0];
                C14113y2.m67408k4("LastAny after ", str3);
                return c10765ar3;
            }
            if (i == 81) {
                Dictionary<String, C10765ar> dictionary7 = this.f42450rv;
                if (dictionary7 != null) {
                    C10765ar[] c10765arArr6 = {null};
                    dictionary7.tryGetValue(str, c10765arArr6);
                    c10765ar = c10765arArr6[0];
                    str4 = "LSWP";
                } else {
                    str4 = null;
                }
                if (c10765ar != null || (dictionary3 = this.f42444ix) == null) {
                    return c10765ar;
                }
                C10765ar[] c10765arArr7 = {c10765ar};
                dictionary3.tryGetValue(str, c10765arArr7);
                C10765ar c10765ar4 = c10765arArr7[0];
                C14113y2.m67408k4("LastAny after ", str4);
                return c10765ar4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59352x1(String str) {
        if (str != null) {
            this.f42443fa.addItem(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59343k4(int i) {
        this.f42439c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59344k4(Dictionary<String, C10765ar> dictionary, boolean z, boolean z2, boolean z3) {
        if (dictionary == null) {
            return;
        }
        if (!z) {
            if (z3) {
                if (this.f42449ne == null) {
                    this.f42449ne = new Dictionary<>();
                }
                Dictionary.Enumerator<String, C10765ar> it = dictionary.iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        this.f42449ne.addItem((String) next.getKey(), (C10765ar) next.getValue());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            if (this.f42444ix == null) {
                this.f42444ix = new Dictionary<>();
            }
            Dictionary.Enumerator<String, C10765ar> it2 = dictionary.iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair next2 = it2.next();
                    this.f42444ix.addItem((String) next2.getKey(), (C10765ar) next2.getValue());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
                return;
            }
            return;
        }
        if (!z2) {
            if (this.f42454x6 == null) {
                this.f42454x6 = new Dictionary<>();
            }
            Dictionary.KeyCollection.Enumerator<String, C10765ar> it3 = dictionary.getKeys().iterator();
            while (it3.hasNext()) {
                try {
                    String next3 = it3.next();
                    if (!this.f42454x6.containsKey(next3)) {
                        this.f42454x6.addItem(next3, dictionary.get_Item(next3));
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                it3.dispose();
                return;
            }
            return;
        }
        if (this.f42448ks == null) {
            this.f42448ks = new Dictionary<>();
        }
        if (this.f42454x6 == null) {
            this.f42454x6 = new Dictionary<>();
        }
        Dictionary.KeyCollection.Enumerator<String, C10765ar> it4 = dictionary.getKeys().iterator();
        while (it4.hasNext()) {
            try {
                String next4 = it4.next();
                if (!this.f42448ks.containsKey(next4)) {
                    this.f42448ks.addItem(next4, dictionary.get_Item(next4));
                }
                if (!this.f42454x6.containsKey(next4)) {
                    this.f42454x6.addItem(next4, dictionary.get_Item(next4));
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
                throw th;
            }
        }
        if (this.f42450rv == null) {
            this.f42450rv = new Dictionary<>();
        }
        Dictionary.Enumerator<String, C10765ar> it5 = dictionary.iterator();
        while (it5.hasNext()) {
            try {
                KeyValuePair next5 = it5.next();
                this.f42450rv.addItem((String) next5.getKey(), (C10765ar) next5.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59345k4(InterfaceC1380to interfaceC1380to) {
        C1580bv c1580bv = this.f42446k4;
        if (c1580bv != null) {
            c1580bv.m8498k4(interfaceC1380to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59346k4(C1603v4 c1603v4) {
        this.f42440ck = c1603v4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59347k4(String str) {
        this.f42451to = str;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: k4 */
    public final void mo8590k4(String str, List<C12737w6> list) {
        if (this.f42446k4 == null) {
            if (this.f42455yj == null) {
                this.f42455yj = new Dictionary<>();
            }
            this.f42455yj.addItem(str, list);
        } else {
            Dictionary<String, List<InterfaceC1599u4>> dictionary = this.f42452up;
            if (dictionary != null) {
                List[] listArr = {null};
                boolean zTryGetValue = dictionary.tryGetValue(str, listArr);
                List list2 = listArr[0];
                if (zTryGetValue) {
                    List.Enumerator it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC1599u4) it.next()).mo8590k4(str, list);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
            }
        }
        Dictionary<String, List<InterfaceC1599u4>> dictionary2 = this.f42452up;
        if (dictionary2 == null || list == null) {
            return;
        }
        dictionary2.removeItemByKey(str);
        if (this.f42452up.size() == 0) {
            this.f42452up = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59348k4(String str, InterfaceC1599u4 interfaceC1599u4) {
        if (this.f42452up == null) {
            this.f42452up = new Dictionary<>();
        }
        List<InterfaceC1599u4>[] listArr = {null};
        boolean zTryGetValue = this.f42452up.tryGetValue(str, listArr);
        List<InterfaceC1599u4> list = listArr[0];
        if (!zTryGetValue) {
            list = new List<>();
            this.f42452up.addItem(str, list);
        }
        list.addItem(interfaceC1599u4);
    }
}
