package com.aspose.slides.internal.p022ai;

import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1373dy {

    /* JADX INFO: renamed from: k4 */
    private C1375h4 f5951k4;

    /* JADX INFO: renamed from: kk */
    private boolean f5952kk;

    /* JADX INFO: renamed from: to */
    private int f5953to;

    /* JADX INFO: renamed from: x1 */
    private boolean f5954x1;

    public C1373dy(C1375h4 c1375h4, boolean z, boolean z2, int i) {
        this.f5951k4 = c1375h4;
        this.f5954x1 = z;
        this.f5952kk = z2;
        this.f5953to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1373dy m8135k4(AbstractC4282kp abstractC4282kp) {
        return abstractC4282kp.mo17251du() == 97 ? new C1373dy(C1375h4.f5962k4, true, true, 0) : new C1373dy(abstractC4282kp.mo17204rv(), null);
    }

    /* JADX INFO: renamed from: kk */
    public final int m8139kk() {
        return this.f5953to;
    }

    /* JADX INFO: renamed from: to */
    public final C1375h4 m8140to() {
        return this.f5951k4;
    }

    public String toString() {
        return C14113y2.m67408k4("SpaceVal: ", m8140to().toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m8141x1() {
        return this.f5952kk;
    }

    public C1373dy(C4272f9 c4272f9, InterfaceC1981h4 interfaceC1981h4) {
        this.f5951k4 = m8137k4(c4272f9, interfaceC1981h4);
        this.f5954x1 = c4272f9.m17203ne().mo17251du() == 32;
        AbstractC4282kp abstractC4282kpM17206yj = c4272f9.m17206yj();
        if (abstractC4282kpM17206yj.mo9924m9() != null) {
            this.f5953to = ((Integer) C7019kk.m27464to(abstractC4282kpM17206yj.mo9924m9(), Integer.TYPE)).intValue();
            this.f5952kk = false;
        } else {
            this.f5952kk = abstractC4282kpM17206yj.mo17251du() == 53;
            this.f5953to = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C1373dy m8136k4(AbstractC4282kp abstractC4282kp, C1373dy c1373dy, C10161to c10161to) {
        if (abstractC4282kp.mo17251du() != 97) {
            return new C1373dy(abstractC4282kp.mo17204rv(), null);
        }
        int iM49984x1 = c10161to.m49984x1(ControlChar.SPACE_CHAR);
        return new C1373dy(C1375h4.m8146k4((-iM49984x1) / 3, 0, iM49984x1 / 2).m8156k4(c1373dy.m8140to().m8150du(2)), true, true, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static C1375h4 m8137k4(C4272f9 c4272f9, InterfaceC1981h4 interfaceC1981h4) {
        return C1375h4.m8146k4(c4272f9.m17134x1(interfaceC1981h4).mo9877dy().mo9886x1(interfaceC1981h4), c4272f9.m17133to(interfaceC1981h4).mo9877dy().mo9886x1(interfaceC1981h4), c4272f9.m17131kk(interfaceC1981h4).mo9877dy().mo9886x1(interfaceC1981h4));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8138k4() {
        return this.f5954x1;
    }
}
