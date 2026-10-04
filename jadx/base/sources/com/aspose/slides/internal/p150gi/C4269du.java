package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.C1980dy;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14051ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.du */
/* JADX INFO: loaded from: classes.dex */
public class C4269du extends AbstractC4282kp {

    /* JADX INFO: renamed from: k4 */
    protected C1980dy f11642k4;

    /* JADX INFO: renamed from: x1 */
    private final boolean f11643x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.du$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4269du.class) ? abstractC4282kp : abstractC4282kp.mo17251du() == 9 ? new C4269du() : mo14303k4(abstractC4282kp, abstractC3533um, abstractC3524ks);
        }
    }

    private C4269du() {
        this.f11643x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4269du m17195k4(InterfaceC1984kk interfaceC1984kk, InterfaceC1984kk interfaceC1984kk2, InterfaceC1984kk interfaceC1984kk3, InterfaceC1984kk interfaceC1984kk4) {
        return new C4269du(new C1980dy(interfaceC1984kk, interfaceC1984kk2, interfaceC1984kk3, interfaceC1984kk4));
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m17197c5() {
        return this.f11643x1;
    }

    public int hashCode() {
        boolean z = this.f11643x1;
        return z ? C14051ck.m66552k4(z) : this.f11642k4.hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public final C1980dy m17198jd() {
        return this.f11642k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    public String toString() {
        return m17197c5() ? "auto" : this.f11642k4.toString();
    }

    private C4269du(C1980dy c1980dy) {
        this.f11642k4 = c1980dy;
        this.f11643x1 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4269du m17196k4(AbstractC3533um abstractC3533um) {
        return (C4269du) C7019kk.m27452k4((Object) abstractC3533um.m14385du(71), C4269du.class);
    }
}
