package com.aspose.slides.internal.p329p4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C7187kk extends C7185jd {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<C7182dy, C7185jd> f19755k4;

    public C7187kk() {
        this.f19755k4 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final int m27790c5(C7182dy c7182dy) {
        return m27796k4(c7182dy, -1);
    }

    /* JADX INFO: renamed from: ck */
    public final float m27791ck(C7182dy c7182dy) {
        return m27795k4(c7182dy, -1.0f);
    }

    /* JADX INFO: renamed from: du */
    public final C7182dy m27792du(C7182dy c7182dy) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        if (c7185jdMo27768h4 == null || !C7019kk.m27469x1(c7185jdMo27768h4, C7182dy.class)) {
            return null;
        }
        return (C7182dy) C7019kk.m27452k4((Object) c7185jdMo27768h4, C7182dy.class);
    }

    /* JADX INFO: renamed from: dy */
    public final C7186k4 m27793dy(C7182dy c7182dy) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        if (C7019kk.m27469x1(c7185jdMo27768h4, C7186k4.class)) {
            return (C7186k4) c7185jdMo27768h4;
        }
        return null;
    }

    /* JADX INFO: renamed from: fa */
    public C7185jd mo27767fa(C7182dy c7182dy) {
        C7185jd[] c7185jdArr = {null};
        boolean zTryGetValue = this.f19755k4.tryGetValue(c7182dy, c7185jdArr);
        C7185jd c7185jd = c7185jdArr[0];
        if (zTryGetValue) {
            return c7185jd;
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public C7185jd mo27768h4(C7182dy c7182dy) {
        if (!this.f19755k4.containsKey(c7182dy)) {
            return null;
        }
        C7185jd c7185jdM27772kk = this.f19755k4.get_Item(c7182dy);
        if (C7019kk.m27469x1(c7185jdM27772kk, C7184h4.class)) {
            c7185jdM27772kk = ((C7184h4) c7185jdM27772kk).m27772kk();
        }
        if (c7185jdM27772kk == C7185jd.m27775dy()) {
            return null;
        }
        return c7185jdM27772kk;
    }

    /* JADX INFO: renamed from: jd */
    public final C7179c5 m27794jd(C7182dy c7182dy) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        if (c7185jdMo27768h4 == null || !C7019kk.m27469x1(c7185jdMo27768h4, C7179c5.class)) {
            return null;
        }
        return (C7179c5) c7185jdMo27768h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m27795k4(C7182dy c7182dy, float f) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        return C7019kk.m27469x1(c7185jdMo27768h4, C7179c5.class) ? ((C7179c5) c7185jdMo27768h4).m27753to() : f;
    }

    /* JADX INFO: renamed from: kk */
    public final C7185jd m27809kk(C7182dy c7182dy) {
        if (m27805k4(c7182dy)) {
            return this.f19755k4.get_Item(c7182dy);
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7187kk m27810m9(C7182dy c7182dy) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        if (C7019kk.m27469x1(c7185jdMo27768h4, C7187kk.class)) {
            return (C7187kk) c7185jdMo27768h4;
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final String m27811to(C7182dy c7182dy) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        if (c7185jdMo27768h4 == null) {
            return null;
        }
        if (C7019kk.m27469x1(c7185jdMo27768h4, C7182dy.class)) {
            return ((C7182dy) c7185jdMo27768h4).m27766k4();
        }
        if (C7019kk.m27469x1(c7185jdMo27768h4, C7191up.class)) {
            return ((C7191up) c7185jdMo27768h4).m27847x1();
        }
        return null;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        Dictionary.Enumerator<C7182dy, C7185jd> it = this.f19755k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                c6765kp.m26792k4(C14113y2.m67402k4("{0} {1} ", next.getKey(), next.getValue()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return C14113y2.m67402k4("<< {0}>>", c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<C7182dy, C7185jd> m27812x1() {
        return this.f19755k4;
    }

    public C7187kk(C7187kk c7187kk) {
        this.f19755k4 = new Dictionary<>(c7187kk.f19755k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m27796k4(C7182dy c7182dy, int i) {
        return m27797k4(c7182dy, (C7182dy) null, i);
    }

    /* JADX INFO: renamed from: x1 */
    public final C7185jd m27813x1(String str) {
        if (!m27808k4(str)) {
            return null;
        }
        return this.f19755k4.get_Item(C7182dy.m27763k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m27797k4(C7182dy c7182dy, C7182dy c7182dy2, int i) {
        C7185jd c7185jdM27799k4 = m27799k4(c7182dy, c7182dy2);
        return (c7185jdM27799k4 == null || !C7019kk.m27469x1(c7185jdM27799k4, C7179c5.class)) ? i : ((C7179c5) c7185jdM27799k4).m27752kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27814x1(C7182dy c7182dy) {
        this.f19755k4.removeItemByKey(c7182dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerable<C7182dy> m27798k4() {
        return this.f19755k4.getKeys();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27815x1(C7182dy c7182dy, C7185jd c7185jd) {
        if (c7185jd == null) {
            m27814x1(c7182dy);
        } else {
            if (this.f19755k4.containsKey(c7182dy)) {
                return;
            }
            this.f19755k4.addItem(c7182dy, c7185jd);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C7185jd m27799k4(C7182dy c7182dy, C7182dy c7182dy2) {
        C7185jd c7185jdMo27768h4 = mo27768h4(c7182dy);
        return (c7185jdMo27768h4 != null || c7182dy2 == null) ? c7185jdMo27768h4 : mo27768h4(c7182dy2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27816x1(C7187kk c7187kk) {
        Dictionary.Enumerator<C7182dy, C7185jd> it = c7187kk.m27812x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                C7182dy c7182dy = C7182dy.f19495kf;
                if (!c7182dy.equals(next.getKey()) || !this.f19755k4.containsKey(c7182dy)) {
                    m27815x1((C7182dy) next.getKey(), (C7185jd) next.getValue());
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
    public static <TValue extends InterfaceC7193yj> C7187kk m27789k4(IGenericDictionary<String, TValue> iGenericDictionary) {
        C7187kk c7187kk = new C7187kk();
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = iGenericDictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                c7187kk.m27815x1(C7182dy.m27763k4((String) keyValuePair.getKey()), ((InterfaceC7193yj) keyValuePair.getValue()).mo8461c5());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27800k4(C7182dy c7182dy, C7185jd c7185jd) {
        this.f19755k4.addItem(c7182dy, c7185jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27801k4(C7182dy c7182dy, InterfaceC7193yj interfaceC7193yj) {
        m27815x1(c7182dy, interfaceC7193yj != null ? interfaceC7193yj.mo8461c5() : null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27802k4(C7182dy c7182dy, String str) {
        m27815x1(c7182dy, str != null ? C7182dy.m27763k4(str) : null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27803k4(C7187kk c7187kk) {
        if (c7187kk == null) {
            return;
        }
        Dictionary.Enumerator<C7182dy, C7185jd> it = c7187kk.f19755k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f19755k4.containsKey((C7182dy) next.getKey())) {
                    this.f19755k4.addItem((C7182dy) next.getKey(), (C7185jd) next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27804k4(String str, C7185jd c7185jd) {
        this.f19755k4.addItem(C7182dy.m27763k4(str), c7185jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27805k4(C7182dy c7182dy) {
        return this.f19755k4.containsKey(c7182dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27806k4(C7182dy c7182dy, C7182dy c7182dy2, boolean z) {
        C7185jd c7185jdM27799k4 = m27799k4(c7182dy, c7182dy2);
        return (c7185jdM27799k4 == null || !C7019kk.m27469x1(c7185jdM27799k4, C7192x1.class)) ? z : ((C7192x1) c7185jdM27799k4).m27852kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27807k4(C7182dy c7182dy, boolean z) {
        return m27806k4(c7182dy, (C7182dy) null, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27808k4(String str) {
        return this.f19755k4.containsKey(C7182dy.m27763k4(str));
    }
}
