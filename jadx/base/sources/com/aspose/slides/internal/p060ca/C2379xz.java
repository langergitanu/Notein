package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.xz */
/* JADX INFO: loaded from: classes3.dex */
public class C2379xz {

    /* JADX INFO: renamed from: c5 */
    private C2132iq f8228c5;

    /* JADX INFO: renamed from: du */
    private final List<C2130il> f8229du = new List<>();

    /* JADX INFO: renamed from: dy */
    private boolean f8230dy;

    /* JADX INFO: renamed from: h4 */
    private final String f8231h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f8232k4;

    /* JADX INFO: renamed from: kk */
    private int f8233kk;

    /* JADX INFO: renamed from: m9 */
    private final boolean f8234m9;

    /* JADX INFO: renamed from: to */
    private C2078f3 f8235to;

    /* JADX INFO: renamed from: x1 */
    private int f8236x1;

    public C2379xz(C2084fc c2084fc, C2132iq c2132iq, boolean z) {
        this.f8231h4 = c2084fc.m10523x1();
        this.f8234m9 = z;
        for (int i = 0; i < c2084fc.m10523x1().length(); i++) {
            this.f8229du.addItem(new C2130il(c2132iq.mo10263jd().mo10989x1(c2084fc.m10523x1().charAt(i)), c2084fc.m10522k4().get_Item(i).longValue()));
        }
        m11706k4(c2132iq);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m11707c5() {
        return this.f8234m9;
    }

    /* JADX INFO: renamed from: du */
    public final int m11708du() {
        return this.f8233kk;
    }

    /* JADX INFO: renamed from: dy */
    public final int m11709dy() {
        if (m11707c5()) {
            return m11721x1() - 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h4 */
    public final C2132iq m11710h4() {
        return this.f8228c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C2130il> m11711k4() {
        return this.f8229du;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11716kk(int i) {
        this.f8233kk = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final C2078f3 m11718m9() {
        return this.f8235to;
    }

    /* JADX INFO: renamed from: to */
    public final int m11719to() {
        return this.f8236x1;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C2130il> it = this.f8229du.iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26791k4(it.next().m10719k4()).m26792k4(" ");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11721x1() {
        return this.f8229du.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2130il m11712k4(int i) {
        return this.f8229du.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m11717kk() {
        return this.f8232k4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m11720to(int i) {
        return m11707c5() ? i >= 0 : i < m11721x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11722x1(int i) {
        this.f8236x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11713k4(C2078f3 c2078f3) {
        this.f8235to = c2078f3;
    }

    /* JADX INFO: renamed from: k4 */
    private void m11706k4(C2132iq c2132iq) {
        this.f8228c5 = c2132iq;
        this.f8230dy = false;
        m11714k4(false);
        m11722x1(0);
        m11716kk(0);
        if (m11707c5()) {
            this.f8229du.reverse();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11714k4(boolean z) {
        this.f8232k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11715k4(int[] iArr) {
        if (m11707c5()) {
            iArr[0] = iArr[0] - 1;
        } else {
            iArr[0] = iArr[0] + 1;
        }
    }
}
