package com.aspose.slides.internal.p275mi;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p284mx.C6619kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mi.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6394to {

    /* JADX INFO: renamed from: k4 */
    public static final k4 f18167k4 = new k4();

    /* JADX INFO: renamed from: x1 */
    public static final x1 f18168x1 = new x1();

    /* JADX INFO: renamed from: c5 */
    private boolean f18169c5;

    /* JADX INFO: renamed from: du */
    private boolean f18170du;

    /* JADX INFO: renamed from: dy */
    private long f18171dy;

    /* JADX INFO: renamed from: h4 */
    private int f18172h4;

    /* JADX INFO: renamed from: kk */
    private int f18173kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f18174m9;

    /* JADX INFO: renamed from: to */
    private int f18175to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.mi.to$k4 */
    public static class k4 implements Comparator<C6394to> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(C6394to c6394to, C6394to c6394to2) {
            return c6394to.f18175to - c6394to2.f18175to;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.mi.to$x1 */
    public static class x1 implements Comparator<C6394to> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(C6394to c6394to, C6394to c6394to2) {
            return c6394to.f18173kk - c6394to2.f18173kk;
        }
    }

    public C6394to(int i, int i2) {
        this.f18173kk = i;
        this.f18171dy = 0L;
        this.f18169c5 = false;
        this.f18175to = 0;
        this.f18170du = false;
        this.f18172h4 = i2;
        this.f18174m9 = true;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C7019kk.m27443k4((Class<?>) C6394to.class)) {
            return false;
        }
        return m26232k4((C6394to) obj);
    }

    public int hashCode() {
        return this.f18173kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m26231k4() {
        return this.f18173kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int m26233kk() {
        return this.f18172h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m26234to() {
        return this.f18171dy;
    }

    public final String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        c6765kpOooO00o.m26792k4(C6619kk.m26414x1(this.f18173kk));
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Long.valueOf(this.f18171dy)));
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(this.f18175to)));
        c6765kpOooO00o.m26792k4(", ");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(this.f18172h4)));
        c6765kpOooO00o.m26792k4("]");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m26235x1() {
        return this.f18175to;
    }

    public C6394to(int i, long j, int i2, int i3) {
        this.f18173kk = i;
        this.f18171dy = j;
        this.f18169c5 = true;
        this.f18175to = i2;
        this.f18170du = true;
        this.f18172h4 = i3;
        this.f18174m9 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m26232k4(C6394to c6394to) {
        if (C14067j2.m66729x1(null, c6394to)) {
            return false;
        }
        return C14067j2.m66729x1(this, c6394to) || c6394to.f18173kk == this.f18173kk;
    }
}
