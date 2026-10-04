package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14125x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12016rv extends AbstractC7020m9<C12016rv> {

    /* JADX INFO: renamed from: k4 */
    public static C12016rv f40556k4 = new C12016rv();

    /* JADX INFO: renamed from: x1 */
    static final /* synthetic */ boolean f40557x1 = true;

    /* JADX INFO: renamed from: kk */
    private InterfaceC14125x1 f40558kk;

    public C12016rv() {
        this.f40558kk = AbstractC14124to.m67615k4().mo67647k4(null);
    }

    /* JADX INFO: renamed from: to */
    private boolean m56706to(C12016rv c12016rv) {
        return c12016rv.m56708k4() == m56708k4() && c12016rv.m56713x1() == m56713x1();
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f40557x1 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12016rv) {
            return m56706to((C12016rv) obj);
        }
        return false;
    }

    public int hashCode() {
        return m56708k4() ^ m56713x1();
    }

    /* JADX INFO: renamed from: k4 */
    public int m56708k4() {
        return this.f40558kk.mo67653k4();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C12016rv Clone() {
        C12016rv c12016rv = new C12016rv();
        CloneTo(c12016rv);
        return c12016rv;
    }

    public String toString() {
        return C14113y2.m67402k4("{{X={0},Y={1}}}", C14057f9.m66586k4(m56708k4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14057f9.m66586k4(m56713x1(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: x1 */
    public int m56713x1() {
        return this.f40558kk.mo67655x1();
    }

    public C12016rv(int i, int i2) {
        InterfaceC14125x1 interfaceC14125x1Mo67647k4 = AbstractC14124to.m67615k4().mo67647k4(null);
        this.f40558kk = interfaceC14125x1Mo67647k4;
        interfaceC14125x1Mo67647k4.mo67654k4(i);
        this.f40558kk.mo67656x1(i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12016rv m56702k4(C12025x6 c12025x6) {
        return new C12016rv((int) c12025x6.m56897x1(), (int) c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: kk */
    public static C12016rv m56705kk(C12025x6 c12025x6) {
        return c12025x6.m56890h4();
    }

    /* JADX INFO: renamed from: x1 */
    public static C12016rv m56707x1(C12025x6 c12025x6) {
        return c12025x6.m56889du();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m56703k4(C12016rv c12016rv) {
        return new C12025x6(c12016rv.m56708k4(), c12016rv.m56713x1());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12016rv c12016rv) {
        c12016rv.m56709k4(m56708k4());
        c12016rv.m56714x1(m56713x1());
    }

    /* JADX INFO: renamed from: x1 */
    public void m56714x1(int i) {
        this.f40558kk.mo67656x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56709k4(int i) {
        this.f40558kk.mo67654k4(i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56715x1(C12016rv c12016rv) {
        m56710k4(c12016rv.m56708k4(), c12016rv.m56713x1());
    }

    /* JADX INFO: renamed from: k4 */
    public void m56710k4(int i, int i2) {
        InterfaceC14125x1 interfaceC14125x1 = this.f40558kk;
        interfaceC14125x1.mo67654k4(interfaceC14125x1.mo67653k4() + i);
        InterfaceC14125x1 interfaceC14125x12 = this.f40558kk;
        interfaceC14125x12.mo67656x1(interfaceC14125x12.mo67655x1() + i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m56704k4(C12016rv c12016rv, C12016rv c12016rv2) {
        return c12016rv.equals(c12016rv2);
    }
}
