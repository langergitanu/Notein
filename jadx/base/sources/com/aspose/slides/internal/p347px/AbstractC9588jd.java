package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p036b6.C1629g8;
import com.aspose.slides.internal.p036b6.C1651um;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.internal.p437u9.C11298m9;
import com.aspose.slides.internal.p514xx.C12752x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.jd */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9588jd {

    /* JADX INFO: renamed from: kk */
    private List<byte[]> f34609kk;

    /* JADX INFO: renamed from: to */
    private List<String> f34610to;

    /* JADX INFO: renamed from: x1 */
    private final Object f34611x1 = new Object();

    /* JADX INFO: renamed from: du */
    private boolean f34607du = true;

    /* JADX INFO: renamed from: k4 */
    private C9600up f34608k4 = null;

    public AbstractC9588jd(String[] strArr, byte[][] bArr) {
        m46837k4(new List<>());
        if (strArr != null) {
            m46835du().addRange(AbstractC14092to.m67204k4((Object[]) strArr));
        }
        m46841x1(new List<>());
        if (bArr != null) {
            m46836h4().addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67210k4((Object) bArr, 1, true)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m46832k4(IGenericCollection<AbstractC9608yj> iGenericCollection) {
        if (m46835du() != null) {
            Dictionary<String, String> dictionaryM59429k4 = C12752x1.m59429k4();
            List.Enumerator<String> it = m46835du().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    if (C11292du.m54264k4(next)) {
                        m46833k4(next, m46838kk(), dictionaryM59429k4);
                        if (C11298m9.f38873k4) {
                            String[] strArrMo8969k4 = C1651um.m8967x1().mo8969k4();
                            int length = strArrMo8969k4.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                if (C14113y2.m67363du(strArrMo8969k4[i], next)) {
                                    C1651um.m8967x1().mo8968k4(dictionaryM59429k4);
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
            Dictionary.KeyCollection.Enumerator<String, String> it2 = dictionaryM59429k4.getKeys().iterator();
            while (it2.hasNext()) {
                try {
                    iGenericCollection.addItem(new C9581ck(it2.next()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m46834x1(IGenericCollection<AbstractC9608yj> iGenericCollection) {
        C9577ar c9577ar;
        if (m46836h4() != null) {
            List.Enumerator<byte[]> it = m46836h4().iterator();
            while (it.hasNext()) {
                try {
                    byte[] next = it.next();
                    if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(next, 0, 4))) {
                        byte[] bArrM8801k4 = C1629g8.m8801k4(next);
                        mo46816k4(bArrM8801k4);
                        c9577ar = new C9577ar(bArrM8801k4);
                    } else {
                        mo46816k4(next);
                        c9577ar = new C9577ar(next);
                    }
                    iGenericCollection.addItem(c9577ar);
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

    /* JADX INFO: renamed from: du */
    public final List<String> m46835du() {
        return this.f34610to;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<byte[]> m46836h4() {
        return this.f34609kk;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C9579bv mo46813k4(int i);

    /* JADX INFO: renamed from: kk */
    public abstract C9579bv mo46817kk(String str, int i);

    /* JADX INFO: renamed from: kk */
    public final boolean m46838kk() {
        return this.f34607du;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m46839m9() {
        if (this.f34608k4 == null) {
            synchronized (this.f34611x1) {
                try {
                    if (this.f34608k4 == null) {
                        List list = new List();
                        m46832k4((IGenericCollection<AbstractC9608yj>) list);
                        m46834x1((IGenericCollection<AbstractC9608yj>) list);
                        this.f34608k4 = new C9600up((AbstractC9608yj[]) list.toArray(new AbstractC9608yj[0]));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final C9600up m46840to() {
        m46839m9();
        return this.f34608k4;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract C9579bv mo46818x1(String str, int i);

    /* JADX INFO: renamed from: x1 */
    public abstract C9606x6[] mo46819x1();

    /* JADX INFO: renamed from: k4 */
    public final void m46837k4(List<String> list) {
        this.f34610to = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46841x1(List<byte[]> list) {
        this.f34609kk = list;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo46815k4(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m46833k4(String str, boolean z, IGenericDictionary<String, String> iGenericDictionary) {
        try {
            for (String str2 : C3142to.m13414du(str)) {
                iGenericDictionary.set_Item(str2, str2);
                mo46815k4(str2);
            }
            if (z) {
                for (String str3 : C3142to.m13423to(str)) {
                    m46833k4(str3, z, iGenericDictionary);
                }
            }
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo46816k4(byte[] bArr) {
    }
}
