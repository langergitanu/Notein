package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7855hi;
import com.aspose.slides.internal.p332p7.C7910i7;
import com.aspose.slides.internal.p332p7.C7975j4;
import com.aspose.slides.internal.p332p7.C8260mf;
import com.aspose.slides.internal.p332p7.C8404o5;
import com.aspose.slides.internal.p332p7.C8410o8;
import com.aspose.slides.internal.p332p7.C8916u3;
import com.aspose.slides.internal.p332p7.C9103wc;
import com.aspose.slides.internal.p332p7.C9229xr;
import com.aspose.slides.internal.p332p7.C9306yr;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class wsu {

    /* JADX INFO: renamed from: k4 */
    private a7l f49851k4;

    /* JADX INFO: renamed from: kk */
    private o5n f49852kk;

    /* JADX INFO: renamed from: to */
    private AbstractC7361bz f49853to;

    /* JADX INFO: renamed from: x1 */
    private wsu f49854x1;

    /* JADX INFO: renamed from: J_ */
    public String mo4816J_() {
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: K_ */
    public boolean mo6244K_() {
        return false;
    }

    /* JADX INFO: renamed from: L_ */
    public void mo4732L_() {
    }

    /* JADX INFO: renamed from: k4 */
    public o5n mo6245k4(C14244on c14244on, bay bayVar) {
        return m72920ks();
    }

    /* JADX INFO: renamed from: ks */
    public final o5n m72920ks() {
        if (this.f49852kk == null) {
            this.f49852kk = new o5n();
        }
        return this.f49852kk;
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC7361bz m72921ne() {
        return this.f49853to;
    }

    /* JADX INFO: renamed from: rv */
    public final a7l m72922rv() {
        return this.f49851k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0} ({1})", C14067j2.m66727k4(this).mo48540du(), mo4816J_());
    }

    /* JADX INFO: renamed from: x6 */
    public final void m72923x6() {
        mo4732L_();
        IGenericEnumerator<wsu> it = m72920ks().iterator();
        while (it.hasNext()) {
            try {
                it.next().m72923x6();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: yj */
    public final wsu m72924yj() {
        return this.f49854x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static wsu m72915k4(a7l a7lVar, AbstractC7361bz abstractC7361bz, wsu wsuVar) {
        List.Enumerator<C7394ca> it;
        boolean zM27456k4;
        wsu m6rVar = C7019kk.m27469x1(abstractC7361bz, C9103wc.class) ? new m6r(a7lVar, (C9103wc) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C8404o5.class) ? new cuq(a7lVar, (C8404o5) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C7254aj.class) ? AbstractC0753ak.m3631k4((C7254aj) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C7855hi.class) ? new er2((C7855hi) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C8916u3.class) ? new vcq((C8916u3) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C7910i7.class) ? new rmh((C7910i7) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C9306yr.class) ? new fp3(a7lVar, (C9306yr) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C9229xr.class) ? new ez3((C9229xr) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C7975j4.class) ? new s0k((C7975j4) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C8260mf.class) ? new fwr((C8260mf) abstractC7361bz) : C7019kk.m27469x1(abstractC7361bz, C8410o8.class) ? new uus((C8410o8) abstractC7361bz) : null;
        if (m6rVar != null) {
            m6rVar.f49851k4 = a7lVar;
            m6rVar.f49854x1 = wsuVar;
            m6rVar.f49853to = abstractC7361bz;
            if (wsuVar != null) {
                wsuVar.m72920ks().m68340k4(m6rVar);
            }
            if (C7019kk.m27469x1(abstractC7361bz, C9103wc.class)) {
                it = ((C9103wc) abstractC7361bz).m43619du().iterator();
                while (it.hasNext()) {
                    try {
                        m72915k4(a7lVar, it.next().m29542x1(), m6rVar);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (zM27456k4) {
                    return m6rVar;
                }
            } else if (C7019kk.m27469x1(abstractC7361bz, C8404o5.class)) {
                it = ((C8404o5) abstractC7361bz).m38003c5().iterator();
                while (it.hasNext()) {
                    try {
                        m72915k4(a7lVar, it.next().m29542x1(), m6rVar);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                    return m6rVar;
                }
            } else {
                int i = 0;
                if (C7019kk.m27469x1(abstractC7361bz, C7975j4.class)) {
                    C8260mf[] c8260mfArrM34555k4 = ((C7975j4) abstractC7361bz).m34555k4();
                    int length = c8260mfArrM34555k4.length;
                    while (i < length) {
                        m72915k4(a7lVar, c8260mfArrM34555k4[i], m6rVar);
                        i++;
                    }
                } else if (C7019kk.m27469x1(abstractC7361bz, C7910i7.class)) {
                    C8410o8[] c8410o8ArrM33893k4 = ((C7910i7) abstractC7361bz).m33893k4();
                    int length2 = c8410o8ArrM33893k4.length;
                    while (i < length2) {
                        m72915k4(a7lVar, c8410o8ArrM33893k4[i], m6rVar);
                        i++;
                    }
                }
            }
        }
        return m6rVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final wsu m72916k4(wsu wsuVar) {
        wsu wsuVarM72915k4 = m72915k4(m72922rv(), this.f49853to, wsuVar);
        wsuVarM72915k4.f49854x1 = wsuVar;
        return wsuVarM72915k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final wsu m72917k4(wsu wsuVar, String str) {
        IGenericEnumerator<wsu> it = wsuVar.m72920ks().iterator();
        while (it.hasNext()) {
            try {
                wsu next = it.next();
                if (C14113y2.m67363du(next.mo4816J_(), str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = wsuVar.m72920ks().iterator();
        while (it.hasNext()) {
            try {
                wsu wsuVarM72917k4 = m72917k4(it.next(), str);
                if (wsuVarM72917k4 != null) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return wsuVarM72917k4;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final <T extends wsu> T m72918k4(Class<T> cls) {
        T t = (T) m72924yj();
        while (t != null && !C7019kk.m27469x1(t, cls)) {
            t = (T) t.m72924yj();
        }
        if (t == null || !C7019kk.m27469x1(t, cls)) {
            return null;
        }
        return t;
    }

    /* JADX INFO: renamed from: k4 */
    public final <T extends wsu> T m72919k4(Class<T> cls, C14244on c14244on, bay bayVar) {
        T t;
        o5n o5nVarMo6245k4 = mo6245k4(c14244on, bayVar);
        IGenericEnumerator<wsu> it = o5nVarMo6245k4.iterator();
        while (it.hasNext()) {
            try {
                T t2 = (T) it.next();
                if (C7019kk.m27469x1(t2, cls)) {
                    return t2;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<wsu> it2 = o5nVarMo6245k4.iterator();
        while (it2.hasNext()) {
            try {
                wsu next = it2.next();
                if (next.mo6244K_() && (t = (T) next.m72919k4(cls, c14244on, bayVar)) != null) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    return t;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it2.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4817k4(bay bayVar, C14244on c14244on) {
    }
}
