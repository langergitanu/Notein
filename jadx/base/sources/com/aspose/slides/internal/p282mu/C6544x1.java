package com.aspose.slides.internal.p282mu;

import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mu.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6544x1 {

    /* JADX INFO: renamed from: k4 */
    private final Object f18292k4;

    public C6544x1(C12016rv c12016rv) {
        this.f18292k4 = c12016rv;
    }

    /* JADX INFO: renamed from: du */
    public static C12016rv m26366du(C6544x1 c6544x1) {
        if (c6544x1 == null) {
            return null;
        }
        boolean zM26375x1 = m26375x1(c6544x1);
        Object objM26374to = c6544x1.m26374to();
        return zM26375x1 ? (C12016rv) objM26374to : C12016rv.m56705kk((C12025x6) objM26374to);
    }

    /* JADX INFO: renamed from: k4 */
    public static C6544x1 m26367k4(C12016rv c12016rv) {
        return new C6544x1(c12016rv);
    }

    /* JADX INFO: renamed from: kk */
    public static C12025x6 m26372kk(C6544x1 c6544x1) {
        if (c6544x1 == null) {
            return null;
        }
        boolean zM26369k4 = m26369k4(c6544x1);
        Object objM26374to = c6544x1.m26374to();
        return zM26369k4 ? (C12025x6) objM26374to : C12025x6.m56880k4((C12016rv) objM26374to);
    }

    /* JADX INFO: renamed from: to */
    public static C12016rv m26373to(C6544x1 c6544x1) {
        if (c6544x1 == null) {
            return null;
        }
        boolean zM26375x1 = m26375x1(c6544x1);
        Object objM26374to = c6544x1.m26374to();
        return zM26375x1 ? (C12016rv) objM26374to : C12016rv.m56707x1((C12025x6) objM26374to);
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m26376h4(C6544x1 c6544x1) {
        return m26374to().equals(c6544x1.m26374to());
    }

    /* JADX INFO: renamed from: x1 */
    public Number m26379x1() {
        return Float.valueOf(m26378kk() ? ((C12016rv) this.f18292k4).m56713x1() : ((C12025x6) this.f18292k4).m56895kk());
    }

    public C6544x1(C12025x6 c12025x6) {
        this.f18292k4 = c12025x6;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6544x1 m26368k4(C12025x6 c12025x6) {
        return new C6544x1(c12025x6);
    }

    /* JADX INFO: renamed from: to */
    private Object m26374to() {
        return this.f18292k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m26375x1(C6544x1 c6544x1) {
        return c6544x1.m26374to() instanceof C12016rv;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m26378kk() {
        return m26375x1(this);
    }

    /* JADX INFO: renamed from: k4 */
    public Number m26377k4() {
        return Float.valueOf(m26378kk() ? ((C12016rv) this.f18292k4).m56708k4() : ((C12025x6) this.f18292k4).m56897x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m26369k4(C6544x1 c6544x1) {
        return c6544x1.m26374to() instanceof C12025x6;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6544x1[] m26370k4(C12016rv[] c12016rvArr) {
        if (c12016rvArr == null) {
            return null;
        }
        if (c12016rvArr.length == 0) {
            return new C6544x1[0];
        }
        C6544x1[] c6544x1Arr = new C6544x1[c12016rvArr.length];
        for (int i = 0; i < c12016rvArr.length; i++) {
            c6544x1Arr[i] = m26367k4(c12016rvArr[i]);
        }
        return c6544x1Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6544x1[] m26371k4(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            return null;
        }
        if (c12025x6Arr.length == 0) {
            return new C6544x1[0];
        }
        C6544x1[] c6544x1Arr = new C6544x1[c12025x6Arr.length];
        for (int i = 0; i < c12025x6Arr.length; i++) {
            c6544x1Arr[i] = m26368k4(c12025x6Arr[i]);
        }
        return c6544x1Arr;
    }
}
