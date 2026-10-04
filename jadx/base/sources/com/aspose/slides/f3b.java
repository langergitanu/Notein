package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class f3b extends AbstractC1137ga<kp9, f3b> {

    /* JADX INFO: renamed from: kk */
    Dictionary<String, Integer> f4961kk;

    /* JADX INFO: renamed from: x1 */
    C13791lr[] f4962x1 = null;

    /* JADX INFO: renamed from: k4 */
    byte f4960k4 = -1;

    /* JADX INFO: renamed from: k4 */
    public final byte m5815k4() {
        return this.f4960k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m5819x1() {
        byte b = this.f4960k4;
        return (b == 9 || b == 10 || b == 11 || b == 12) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5816k4(kp9 kp9Var) {
        if (kp9Var.m64091k4() != -1) {
            this.f4960k4 = kp9Var.m64091k4();
        }
        if (kp9Var.m64091k4() == -1) {
            return;
        }
        C13791lr[] c13791lrArr = kp9Var.f45823k4;
        if (c13791lrArr == null) {
            this.f4962x1 = null;
            return;
        }
        this.f4962x1 = new C13791lr[c13791lrArr.length];
        int i = 0;
        while (true) {
            C13791lr[] c13791lrArr2 = this.f4962x1;
            if (i >= c13791lrArr2.length) {
                return;
            }
            c13791lrArr2[i] = new C13791lr(kp9Var.f45823k4[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5817k4(InterfaceC14672vc interfaceC14672vc) {
        f3b f3bVar = (f3b) interfaceC14672vc;
        this.f4960k4 = f3bVar.f4960k4;
        this.f4962x1 = f3bVar.f4962x1;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, kp9 kp9Var) {
        m5817k4(interfaceC14672vc);
        m5816k4(kp9Var);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(f3b f3bVar) {
        String next;
        String next2;
        if (f3bVar == null) {
            return false;
        }
        try {
            if (C14067j2.m66729x1(this, f3bVar)) {
                return true;
            }
            if (!C3085sv.m13092k4((Object[]) this.f4962x1, (Object[]) f3bVar.f4962x1) || this.f4960k4 != f3bVar.f4960k4) {
                return false;
            }
            Dictionary<String, Integer> dictionary = this.f4961kk;
            if (dictionary == null && f3bVar.f4961kk != null) {
                return false;
            }
            if (dictionary != null) {
                if (f3bVar.f4961kk == null || dictionary.size() != f3bVar.f4961kk.size()) {
                    return false;
                }
                Dictionary.KeyCollection.Enumerator<String, Integer> it = this.f4961kk.getKeys().iterator();
                do {
                    try {
                        if (it.hasNext()) {
                            next2 = it.next();
                            if (!f3bVar.f4961kk.containsKey(next2)) {
                                break;
                            }
                        } else {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            it = f3bVar.f4961kk.getKeys().iterator();
                            do {
                                try {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (!this.f4961kk.containsKey(next)) {
                                            break;
                                        }
                                    } else if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                }
                            } while (!f3bVar.f4961kk.get_Item(next).equals(this.f4961kk.get_Item(next)));
                            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                return false;
                            }
                        }
                        return false;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } while (this.f4961kk.get_Item(next2).equals(f3bVar.f4961kk.get_Item(next2)));
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
