package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p273mg.C6383k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C9604wy {

    /* JADX INFO: renamed from: k4 */
    protected final Dictionary<Integer, C9578b3> f34740k4 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private boolean f34741kk;

    /* JADX INFO: renamed from: x1 */
    private C9578b3 f34742x1;

    public C9604wy(boolean z) {
        this.f34741kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    private C9578b3 m46905x1() {
        C9578b3 c9578b3 = this.f34742x1;
        if (c9578b3 != null) {
            return c9578b3;
        }
        C9578b3 c9578b3M46907k4 = m46907k4(32);
        if (c9578b3M46907k4 != null) {
            return c9578b3M46907k4;
        }
        Dictionary.ValueCollection.Enumerator<Integer, C9578b3> it = this.f34740k4.getValues().iterator();
        it.hasNext();
        if (it.next() == null) {
            throw new InvalidOperationException("Cannot find a glyph for this character code.");
        }
        C9578b3 c9578b32 = new C9578b3(50, 0, it.next().m46755kk(), it.next().m46756to());
        this.f34742x1 = c9578b32;
        return c9578b32;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9578b3 m46906k4() {
        return this.f34742x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C9578b3 m46909kk(int i) {
        Dictionary.ValueCollection.Enumerator<Integer, C9578b3> it = this.f34740k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                C9578b3 next = it.next();
                if (next.m46757x1() == i) {
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
        return m46905x1();
    }

    /* JADX INFO: renamed from: k4 */
    public C9578b3 m46907k4(int i) {
        C9578b3[] c9578b3Arr = {null};
        boolean zTryGetValue = this.f34740k4.tryGetValue(Integer.valueOf(i), c9578b3Arr);
        C9578b3 c9578b3 = c9578b3Arr[0];
        if (zTryGetValue) {
            return c9578b3;
        }
        if (!this.f34741kk) {
            return null;
        }
        if (C6383k4.m26207x1(i)) {
            c9578b3Arr[0] = c9578b3;
            this.f34740k4.tryGetValue(Integer.valueOf(C6383k4.m26205k4(i)), c9578b3Arr);
            return c9578b3Arr[0];
        }
        c9578b3Arr[0] = c9578b3;
        this.f34740k4.tryGetValue(Integer.valueOf(C6383k4.m26206kk(i)), c9578b3Arr);
        return c9578b3Arr[0];
    }

    /* JADX INFO: renamed from: x1 */
    public final C9578b3 m46910x1(int i) {
        C9578b3 c9578b3M46907k4 = m46907k4(i);
        return c9578b3M46907k4 != null ? c9578b3M46907k4 : m46905x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46908k4(C9578b3 c9578b3) {
        this.f34740k4.set_Item(Integer.valueOf(c9578b3.m46754k4()), c9578b3);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46911x1(C9578b3 c9578b3) {
        this.f34742x1 = c9578b3;
    }
}
