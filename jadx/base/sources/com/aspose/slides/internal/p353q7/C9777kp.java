package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C9777kp {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, C9797wp> f35316k4 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private boolean f35317kk;

    /* JADX INFO: renamed from: x1 */
    private C9797wp f35318x1;

    public C9777kp(boolean z) {
        this.f35317kk = z;
    }

    /* JADX INFO: renamed from: kk */
    private C9797wp m48100kk() {
        C9797wp c9797wp = this.f35318x1;
        if (c9797wp != null) {
            return c9797wp;
        }
        C9797wp c9797wpM48102k4 = m48102k4(32);
        if (c9797wpM48102k4 != null) {
            return c9797wpM48102k4;
        }
        Dictionary.ValueCollection.Enumerator<Integer, C9797wp> it = this.f35316k4.getValues().iterator();
        it.hasNext();
        if (it.next() == null) {
            throw new InvalidOperationException("Cannot find a glyph for this character code.");
        }
        C9797wp c9797wp2 = new C9797wp(50, 0, it.next().m48285kk(), it.next().m48286to());
        this.f35318x1 = c9797wp2;
        return c9797wp2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48101k4() {
        return this.f35316k4.size();
    }

    /* JADX INFO: renamed from: to */
    public final C9797wp m48105to(int i) {
        Dictionary.ValueCollection.Enumerator<Integer, C9797wp> it = this.f35316k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                C9797wp next = it.next();
                if (next.m48287x1() == ((char) i)) {
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
        return m48100kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9797wp m48106x1() {
        return this.f35318x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9797wp m48102k4(int i) {
        C9797wp[] c9797wpArr = {null};
        boolean zTryGetValue = this.f35316k4.tryGetValue(Integer.valueOf(i), c9797wpArr);
        C9797wp c9797wp = c9797wpArr[0];
        if (zTryGetValue) {
            return c9797wp;
        }
        if (!this.f35317kk) {
            return null;
        }
        if (C11240k4.m54222x1(i)) {
            c9797wpArr[0] = c9797wp;
            this.f35316k4.tryGetValue(Integer.valueOf(C11240k4.m54217k4(i)), c9797wpArr);
            return c9797wpArr[0];
        }
        c9797wpArr[0] = c9797wp;
        this.f35316k4.tryGetValue(Integer.valueOf(C11240k4.m54220kk(i)), c9797wpArr);
        return c9797wpArr[0];
    }

    /* JADX INFO: renamed from: kk */
    public final C9797wp m48104kk(int i) {
        Dictionary.ValueCollection.Enumerator<Integer, C9797wp> it = this.f35316k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                C9797wp next = it.next();
                if (next.m48287x1() == i) {
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
        return m48100kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9797wp m48107x1(int i) {
        C9797wp c9797wpM48102k4 = m48102k4(i);
        return c9797wpM48102k4 != null ? c9797wpM48102k4 : m48100kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48103k4(C9797wp c9797wp) {
        this.f35316k4.set_Item(Integer.valueOf(c9797wp.m48284k4()), c9797wp);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48108x1(C9797wp c9797wp) {
        this.f35318x1 = c9797wp;
    }
}
