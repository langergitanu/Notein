package com.aspose.slides.internal.p159h0;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.os */
/* JADX INFO: loaded from: classes.dex */
public class C4459os extends AbstractC7020m9<C4459os> {

    /* JADX INFO: renamed from: k4 */
    private float f12250k4;

    /* JADX INFO: renamed from: x1 */
    private float f12251x1;

    public C4459os() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C4459os Clone() {
        C4459os c4459os = new C4459os();
        CloneTo(c4459os);
        return c4459os;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4459os) {
            return m18283x1((C4459os) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f12250k4), Float.valueOf(this.f12251x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final float m18285k4() {
        return this.f12250k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m18288kk() {
        return (float) C14116yg.m67496rv((m18290x1() * m18290x1()) + (m18285k4() * m18285k4()));
    }

    /* JADX INFO: renamed from: to */
    public final C4459os m18289to() {
        float fM67496rv = (float) C14116yg.m67496rv((m18290x1() * m18290x1()) + (m18285k4() * m18285k4()));
        return fM67496rv > 0.0f ? new C4459os(m18285k4() / fM67496rv, m18290x1() / fM67496rv) : new C4459os(0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m18290x1() {
        return this.f12251x1;
    }

    public C4459os(float f) {
        m18286k4(f);
        m18291x1(f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4459os m18277k4(float f, C4459os c4459os) {
        return new C4459os(c4459os.m18285k4() * f, c4459os.m18290x1() * f);
    }

    /* JADX INFO: renamed from: kk */
    public static float m18280kk(C4459os c4459os, C4459os c4459os2) {
        return (c4459os2.m18290x1() * c4459os.m18290x1()) + (c4459os2.m18285k4() * c4459os.m18285k4());
    }

    /* JADX INFO: renamed from: x1 */
    public static C4459os m18281x1(C4459os c4459os, float f) {
        return new C4459os(c4459os.m18285k4() / f, c4459os.m18290x1() / f);
    }

    public C4459os(float f, float f2) {
        m18286k4(f);
        m18291x1(f2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4459os m18278k4(C4459os c4459os, float f) {
        return new C4459os(c4459os.m18285k4() * f, c4459os.m18290x1() * f);
    }

    /* JADX INFO: renamed from: x1 */
    public static C4459os m18282x1(C4459os c4459os, C4459os c4459os2) {
        return new C4459os(c4459os.m18285k4() - c4459os2.m18285k4(), c4459os.m18290x1() - c4459os2.m18290x1());
    }

    public C4459os(C12025x6 c12025x6) {
        m18286k4(c12025x6.m56897x1());
        m18291x1(c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static C4459os m18279k4(C4459os c4459os, C4459os c4459os2) {
        return new C4459os(c4459os2.m18285k4() + c4459os.m18285k4(), c4459os2.m18290x1() + c4459os.m18290x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18291x1(float f) {
        this.f12251x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m18283x1(C4459os c4459os) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18286k4(float f) {
        this.f12250k4 = f;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4459os c4459os) {
        c4459os.f12250k4 = this.f12250k4;
        c4459os.f12251x1 = this.f12251x1;
    }
}
