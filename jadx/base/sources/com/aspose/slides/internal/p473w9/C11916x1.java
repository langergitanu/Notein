package com.aspose.slides.internal.p473w9;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.w9.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11916x1 {

    /* JADX INFO: renamed from: k4 */
    private List<KeyValuePair<Integer, C12014ne>> f40140k4;

    /* JADX INFO: renamed from: kk */
    private double f40141kk;

    /* JADX INFO: renamed from: x1 */
    private int f40142x1;

    public C11916x1(int i, double d) {
        m55821k4(i);
        m55820k4(d);
    }

    /* JADX INFO: renamed from: to */
    private void m55816to() {
        if (this.f40140k4 == null) {
            this.f40140k4 = new List<>();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m55817k4() {
        return this.f40142x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m55823kk() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(C14057f9.m66587k4(m55817k4(), "X"));
        c6765kp.m26792k4(C14057f9.m66587k4(C7019kk.m27462to(Double.valueOf(m55824x1() * 1000.0d), 14), "X"));
        List<KeyValuePair<Integer, C12014ne>> list = this.f40140k4;
        if (list != null) {
            List.Enumerator<KeyValuePair<Integer, C12014ne>> it = list.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<Integer, C12014ne> next = it.next();
                    c6765kp.m26792k4(C14057f9.m66587k4(next.getKey().intValue(), "X"));
                    c6765kp.m26792k4(C14057f9.m66587k4(next.getValue().m56669jd(), "X"));
                    c6765kp.m26792k4(C14057f9.m66587k4(next.getValue().m56664ck(), "X"));
                    c6765kp.m26792k4(C14057f9.m66587k4(next.getValue().m56663c5(), "X"));
                    c6765kp.m26792k4(C14057f9.m66587k4(next.getValue().m56683x1(), "X"));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final double m55824x1() {
        return this.f40141kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11916x1 m55818k4(int i, int i2, int i3, int i4) {
        return m55819k4(new C12014ne(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: x1 */
    public final C11916x1 m55825x1(int i, int i2, int i3, int i4) {
        return m55826x1(new C12014ne(i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: k4 */
    public final C11916x1 m55819k4(C12014ne... c12014neArr) {
        m55816to();
        for (C12014ne c12014ne : c12014neArr) {
            this.f40140k4.addItem(new KeyValuePair<>(1, c12014ne.Clone()));
        }
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11916x1 m55826x1(C12014ne... c12014neArr) {
        m55816to();
        for (C12014ne c12014ne : c12014neArr) {
            this.f40140k4.addItem(new KeyValuePair<>(0, c12014ne.Clone()));
        }
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55820k4(double d) {
        this.f40141kk = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55821k4(int i) {
        this.f40142x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m55822k4(int i, int i2) {
        List<KeyValuePair<Integer, C12014ne>> list = this.f40140k4;
        if (list == null || list.size() == 0) {
            return true;
        }
        boolean z = this.f40140k4.get_Item(0).getKey().intValue() == 1;
        List.Enumerator<KeyValuePair<Integer, C12014ne>> it = this.f40140k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Integer, C12014ne> next = it.next();
                int iIntValue = next.getKey().intValue();
                C12014ne c12014neClone = next.getValue().Clone();
                if (iIntValue == 1 && z && c12014neClone.m56675k4(i, i2)) {
                    z = false;
                }
                if (iIntValue == 0 && !z && c12014neClone.m56675k4(i, i2)) {
                    z = true;
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
        return z;
    }
}
