package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C12015qq extends AbstractC7020m9<C12015qq> {

    /* JADX INFO: renamed from: k4 */
    public static C12015qq f40552k4 = new C12015qq();

    /* JADX INFO: renamed from: x1 */
    static final /* synthetic */ boolean f40553x1 = true;

    /* JADX INFO: renamed from: kk */
    private float f40554kk;

    /* JADX INFO: renamed from: to */
    private float f40555to;

    public C12015qq() {
        this.f40554kk = 0.0f;
        this.f40555to = 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m56688k4(C12015qq c12015qq, C12015qq c12015qq2) {
        return new C12015qq(c12015qq2.m56699x1() + c12015qq.m56699x1(), c12015qq2.m56697kk() + c12015qq.m56697kk());
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C12015qq Clone() {
        C12015qq c12015qq = new C12015qq();
        CloneTo(c12015qq);
        return c12015qq;
    }

    public boolean equals(Object obj) {
        if (!f40553x1 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12015qq) {
            return m56691kk((C12015qq) obj);
        }
        return false;
    }

    public int hashCode() {
        return ((int) m56699x1()) ^ ((int) m56697kk());
    }

    /* JADX INFO: renamed from: kk */
    public float m56697kk() {
        return this.f40555to;
    }

    /* JADX INFO: renamed from: to */
    public C12023wl m56698to() {
        return new C12023wl((int) m56699x1(), (int) m56697kk());
    }

    public String toString() {
        return C14113y2.m67402k4("{{Width={0}, Height={1}}}", C14064he.m66711k4(m56699x1(), (InterfaceC14073kp) C11697x1.m55252to()), C14064he.m66711k4(m56697kk(), (InterfaceC14073kp) C11697x1.m55252to()));
    }

    /* JADX INFO: renamed from: x1 */
    public float m56699x1() {
        return this.f40554kk;
    }

    public C12015qq(float f, float f2) {
        this.f40554kk = f;
        this.f40555to = f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C12015qq m56689k4(T t) {
        return t == null ? new C12015qq(0.0f, 0.0f) : AbstractC14124to.m67619x1().mo67633x1(t);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m56691kk(C12015qq c12015qq) {
        return c12015qq.m56699x1() == m56699x1() && c12015qq.m56697kk() == m56697kk();
    }

    /* JADX INFO: renamed from: x1 */
    public void m56700x1(float f) {
        this.f40555to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> T m56690k4(C12015qq c12015qq) {
        if (c12015qq == null) {
            return null;
        }
        return (T) AbstractC14124to.m67619x1().mo67631k4(c12015qq);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m56692kk(C12015qq c12015qq, C12015qq c12015qq2) {
        return (c12015qq.m56699x1() == c12015qq2.m56699x1() && c12015qq.m56697kk() == c12015qq2.m56697kk()) ? false : true;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12015qq c12015qq) {
        c12015qq.m56695k4(m56699x1());
        c12015qq.m56700x1(m56697kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m56693x1(C12015qq c12015qq, C12015qq c12015qq2) {
        return c12015qq.m56699x1() == c12015qq2.m56699x1() && c12015qq.m56697kk() == c12015qq2.m56697kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56695k4(float f) {
        this.f40554kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56696k4() {
        return ((double) m56699x1()) == 0.0d && ((double) m56697kk()) == 0.0d;
    }
}
