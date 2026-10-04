package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14123kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12025x6 extends AbstractC7020m9<C12025x6> {

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 f40591k4 = new C12025x6();

    /* JADX INFO: renamed from: x1 */
    static final /* synthetic */ boolean f40592x1 = true;

    /* JADX INFO: renamed from: kk */
    private InterfaceC14123kk f40593kk;

    static {
        C7019kk.m27454k4(C12025x6.class, (InterfaceC7014c5) new InterfaceC7014c5<C12025x6>() { // from class: com.aspose.slides.internal.wh.x6.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C12025x6 mo838x1() {
                return new C12025x6();
            }
        });
    }

    public C12025x6() {
        this.f40593kk = AbstractC14124to.m67615k4().mo67648x1(null);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m56880k4(C12016rv c12016rv) {
        return new C12025x6(c12016rv.m56708k4(), c12016rv.m56713x1());
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public C12016rv m56889du() {
        return new C12016rv((int) m56897x1(), (int) m56895kk());
    }

    public boolean equals(Object obj) {
        if (!f40592x1 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12025x6) {
            return m56885kk((C12025x6) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public C12016rv m56890h4() {
        return new C12016rv(Math.round(m56897x1()), Math.round(m56895kk()));
    }

    public int hashCode() {
        return ((int) m56897x1()) ^ ((int) m56895kk());
    }

    /* JADX INFO: renamed from: kk */
    public float m56895kk() {
        return this.f40593kk.mo67608x1();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public C12025x6 Clone() {
        C12025x6 c12025x6 = new C12025x6();
        CloneTo(c12025x6);
        return c12025x6;
    }

    public String toString() {
        return C14113y2.m67402k4("{{X={0}, Y={1}}}", C14064he.m66711k4(m56897x1(), (InterfaceC14073kp) C11697x1.m55252to()), C14064he.m66711k4(m56895kk(), (InterfaceC14073kp) C11697x1.m55252to()));
    }

    /* JADX INFO: renamed from: x1 */
    public float m56897x1() {
        return this.f40593kk.mo67605k4();
    }

    public C12025x6(float f, float f2) {
        InterfaceC14123kk interfaceC14123kkMo67648x1 = AbstractC14124to.m67615k4().mo67648x1(null);
        this.f40593kk = interfaceC14123kkMo67648x1;
        interfaceC14123kkMo67648x1.mo67606k4(f);
        this.f40593kk.mo67609x1(f2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m56881k4(C12025x6 c12025x6, C12015qq c12015qq) {
        return new C12025x6(c12015qq.m56699x1() + c12025x6.m56897x1(), c12015qq.m56697kk() + c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: kk */
    private boolean m56885kk(C12025x6 c12025x6) {
        return c12025x6.m56897x1() == m56897x1() && c12025x6.m56895kk() == m56895kk();
    }

    /* JADX INFO: renamed from: x1 */
    public static C12025x6 m56886x1(C12025x6 c12025x6, C12015qq c12015qq) {
        return new C12025x6(c12015qq.m56699x1() + c12025x6.m56897x1(), c12015qq.m56697kk() + c12025x6.m56895kk());
    }

    private C12025x6(InterfaceC14123kk interfaceC14123kk) {
        AbstractC14124to.m67615k4().mo67648x1(null);
        this.f40593kk = interfaceC14123kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C12025x6 m56882k4(T t) {
        return new C12025x6(AbstractC14124to.m67615k4().mo67648x1(t));
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> T m56887x1(C12025x6 c12025x6) {
        if (c12025x6 == null) {
            return null;
        }
        return (T) c12025x6.f40593kk.mo67607kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56891k4(float f) {
        this.f40593kk.mo67606k4(f);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56898x1(float f) {
        this.f40593kk.mo67609x1(f);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m56888x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        return (c12025x6.m56897x1() == c12025x62.m56897x1() && c12025x6.m56895kk() == c12025x62.m56895kk()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56892k4(float f, float f2) {
        m56891k4(f);
        m56898x1(f2);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12025x6 c12025x6) {
        c12025x6.m56891k4(m56897x1());
        c12025x6.m56898x1(m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56894k4() {
        return ((double) m56897x1()) == 0.0d && ((double) m56895kk()) == 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56883k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return c12025x6.m56897x1() == c12025x62.m56897x1() && c12025x6.m56895kk() == c12025x62.m56895kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m56884k4(C12016rv[] c12016rvArr) {
        if (c12016rvArr == null) {
            return null;
        }
        if (c12016rvArr.length == 0) {
            return new C12025x6[0];
        }
        C12025x6[] c12025x6Arr = new C12025x6[c12016rvArr.length];
        for (int i = 0; i < c12016rvArr.length; i++) {
            c12025x6Arr[i] = m56880k4(c12016rvArr[i]);
        }
        return c12025x6Arr;
    }
}
