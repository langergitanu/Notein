package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p131fi.C3997k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9575x1;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.internal.p505xn.C12576x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.fa */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9769fa implements InterfaceC9759bv {

    /* JADX INFO: renamed from: kk */
    private List<byte[]> f35292kk;

    /* JADX INFO: renamed from: to */
    private List<String> f35293to;

    /* JADX INFO: renamed from: x1 */
    private final Object f35294x1 = new Object();

    /* JADX INFO: renamed from: du */
    private boolean f35290du = true;

    /* JADX INFO: renamed from: k4 */
    private C9778ks f35291k4 = null;

    public AbstractC9769fa(String[] strArr, byte[][] bArr) {
        m48062k4(new List<>());
        if (strArr != null) {
            m48056c5().addRange(AbstractC14092to.m67204k4((Object[]) strArr));
        }
        m48066x1(new List<>());
        if (bArr != null) {
            m48061jd().addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67210k4((Object) bArr, 1, true)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48053k4(IGenericCollection<AbstractC9784rv> iGenericCollection) {
        if (m48056c5() != null) {
            Dictionary dictionaryM46750k4 = C9575x1.m46750k4();
            List.Enumerator<String> it = m48056c5().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    if (C12565ks.m58630x1(next)) {
                        m48054k4(next, m48060h4(), dictionaryM46750k4);
                        if (C12567ne.f42083k4) {
                            String[] strArrMo15796k4 = C3997k4.m15793x1().mo15796k4();
                            int length = strArrMo15796k4.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                if (C14113y2.m67363du(strArrMo15796k4[i], next)) {
                                    C3997k4.m15793x1().mo15794k4((IGenericDictionary<String, String>) dictionaryM46750k4);
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C12576x6.m58708k4() == 1 && m48058du().length > 0) {
                mo48026k4((IGenericDictionary<String, String>) dictionaryM46750k4);
            }
            IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = dictionaryM46750k4.iterator();
            while (it2.hasNext()) {
                try {
                    iGenericCollection.addItem(new C9793up((String) ((KeyValuePair) it2.next()).getKey()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m48055x1(IGenericCollection<AbstractC9784rv> iGenericCollection) {
        C9758b3 c9758b3;
        if (m48061jd() != null) {
            List.Enumerator<byte[]> it = m48061jd().iterator();
            while (it.hasNext()) {
                try {
                    byte[] next = it.next();
                    if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(next, 0, 4))) {
                        byte[] bArrM54219k4 = C11240k4.m54219k4(next);
                        mo48068x1(bArrM54219k4);
                        c9758b3 = new C9758b3(bArrM54219k4);
                    } else {
                        mo48068x1(next);
                        c9758b3 = new C9758b3(next);
                    }
                    iGenericCollection.addItem(c9758b3);
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
    }

    /* JADX INFO: renamed from: c5 */
    public final List<String> m48056c5() {
        return this.f35293to;
    }

    /* JADX INFO: renamed from: ck */
    public final void m48057ck() {
        if (this.f35291k4 == null) {
            synchronized (this.f35294x1) {
                try {
                    if (this.f35291k4 == null) {
                        List list = new List();
                        m48053k4((IGenericCollection<AbstractC9784rv>) list);
                        m48055x1((IGenericCollection<AbstractC9784rv>) list);
                        this.f35291k4 = new C9778ks((AbstractC9784rv[]) list.toArray(new AbstractC9784rv[0]));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final String[] m48058du() {
        List<String> list = this.f35293to;
        return list == null ? new String[0] : list.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: dy */
    public final C9778ks m48059dy() {
        m48057ck();
        return this.f35291k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m48060h4() {
        return this.f35290du;
    }

    /* JADX INFO: renamed from: jd */
    public final List<byte[]> m48061jd() {
        return this.f35292kk;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C9790ts mo48024k4(int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo48026k4(IGenericDictionary<String, String> iGenericDictionary);

    /* JADX INFO: renamed from: kk */
    public abstract C9773ix[] mo48027kk();

    /* JADX INFO: renamed from: m9 */
    public final void m48064m9() {
        C9778ks c9778ks = this.f35291k4;
        if (c9778ks != null) {
            c9778ks.m48117kk();
        }
    }

    /* JADX INFO: renamed from: to */
    public void mo48065to() {
        this.f35291k4 = null;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract C9790ts mo48029x1(String str, int i);

    /* JADX INFO: renamed from: k4 */
    public final void m48062k4(List<String> list) {
        this.f35293to = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48066x1(List<byte[]> list) {
        this.f35292kk = list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48054k4(String str, boolean z, IGenericDictionary<String, String> iGenericDictionary) {
        try {
            if (C3142to.m13421kk(str)) {
                for (String str2 : C3142to.m13414du(str)) {
                    iGenericDictionary.set_Item(str2, str2);
                    try {
                        mo48067x1(str2);
                    } catch (RuntimeException unused) {
                    }
                }
                if (z) {
                    for (String str3 : C3142to.m13423to(str)) {
                        m48054k4(str3, z, iGenericDictionary);
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo48067x1(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48063k4(boolean z) {
        this.f35290du = z;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo48068x1(byte[] bArr) {
    }
}
