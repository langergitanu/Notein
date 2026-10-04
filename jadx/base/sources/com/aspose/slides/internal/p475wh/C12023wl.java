package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12023wl extends AbstractC7020m9<C12023wl> {

    /* JADX INFO: renamed from: k4 */
    public static C12023wl f40585k4 = new C12023wl();

    /* JADX INFO: renamed from: x1 */
    static final /* synthetic */ boolean f40586x1 = true;

    /* JADX INFO: renamed from: kk */
    private int f40587kk;

    /* JADX INFO: renamed from: to */
    private int f40588to;

    public C12023wl() {
        this.f40587kk = 0;
        this.f40588to = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m56853k4(C12023wl c12023wl) {
        return new C12015qq(c12023wl.m56865x1(), c12023wl.m56862kk());
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f40586x1 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12023wl) {
            return m56857to((C12023wl) obj);
        }
        return false;
    }

    public int hashCode() {
        return m56865x1() ^ m56862kk();
    }

    /* JADX INFO: renamed from: kk */
    public int m56862kk() {
        return this.f40588to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public C12023wl Clone() {
        C12023wl c12023wl = new C12023wl();
        CloneTo(c12023wl);
        return c12023wl;
    }

    public String toString() {
        return C14113y2.m67402k4("{{Width={0}, Height={1}}}", Integer.valueOf(m56865x1()), Integer.valueOf(m56862kk()));
    }

    /* JADX INFO: renamed from: x1 */
    public int m56865x1() {
        return this.f40587kk;
    }

    public C12023wl(int i, int i2) {
        this.f40587kk = i;
        this.f40588to = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m56854k4(C12015qq c12015qq) {
        return new C12023wl((int) Math.ceil(c12015qq.m56699x1()), (int) Math.ceil(c12015qq.m56697kk()));
    }

    /* JADX INFO: renamed from: to */
    private boolean m56857to(C12023wl c12023wl) {
        return c12023wl.m56865x1() == m56865x1() && c12023wl.m56862kk() == m56862kk();
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> T m56858x1(C12023wl c12023wl) {
        if (c12023wl == null) {
            return null;
        }
        return (T) AbstractC14124to.m67619x1().mo67632k4(c12023wl);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12023wl c12023wl) {
        c12023wl.m56860k4(m56865x1());
        c12023wl.m56866x1(m56862kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C12023wl m56855k4(T t) {
        return t == null ? new C12023wl(0, 0) : AbstractC14124to.m67619x1().mo67630k4(t);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56866x1(int i) {
        this.f40588to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m56859x1(C12023wl c12023wl, C12023wl c12023wl2) {
        return c12023wl.equals(c12023wl2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56860k4(int i) {
        this.f40587kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56861k4() {
        return m56865x1() == 0 && m56862kk() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56856k4(C12023wl c12023wl, C12023wl c12023wl2) {
        return (c12023wl.m56865x1() == c12023wl2.m56865x1() && c12023wl.m56862kk() == c12023wl2.m56862kk()) ? false : true;
    }
}
