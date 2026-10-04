package com.aspose.slides.internal.p107eg;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3692x1 implements Comparable<C3692x1> {

    /* JADX INFO: renamed from: du */
    private final int f10262du;

    /* JADX INFO: renamed from: to */
    private final int f10263to;

    /* JADX INFO: renamed from: k4 */
    public static final C3692x1 f10259k4 = m15006k4(3, 1);

    /* JADX INFO: renamed from: x1 */
    public static final C3692x1 f10261x1 = m15006k4(3, 10);

    /* JADX INFO: renamed from: kk */
    public static final C3692x1 f10260kk = m15006k4(1, 0);

    private C3692x1(int i, int i2) {
        this.f10263to = i;
        this.f10262du = i2;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C7019kk.m27443k4((Class<?>) C3692x1.class)) {
            return false;
        }
        return m15010x1((C3692x1) obj);
    }

    public int hashCode() {
        return (this.f10263to << 8) | this.f10262du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m15007k4() {
        return this.f10263to;
    }

    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("pid = ");
        c6765kpOooO00o.m26805kk(this.f10263to);
        c6765kpOooO00o.m26792k4(", eid = ");
        c6765kpOooO00o.m26805kk(this.f10262du);
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m15009x1() {
        return this.f10262du;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3692x1 c3692x1) {
        return hashCode() - c3692x1.hashCode();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m15010x1(C3692x1 c3692x1) {
        if (C14067j2.m66729x1(null, c3692x1)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c3692x1)) {
            return true;
        }
        return c3692x1.f10263to == this.f10263to && c3692x1.f10262du == this.f10262du;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3692x1 m15006k4(int i, int i2) {
        return new C3692x1(i, i2);
    }
}
