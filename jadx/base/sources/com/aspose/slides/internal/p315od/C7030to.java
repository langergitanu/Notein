package com.aspose.slides.internal.p315od;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.od.to */
/* JADX INFO: loaded from: classes4.dex */
public class C7030to implements InterfaceC4809to {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4146h4 f19104k4;

    /* JADX INFO: renamed from: kk */
    private C12025x6 f19105kk;

    /* JADX INFO: renamed from: to */
    private C12025x6 f19106to;

    /* JADX INFO: renamed from: x1 */
    private C7029m9 f19107x1 = new C7029m9();

    public C7030to(InterfaceC4146h4 interfaceC4146h4) {
        this.f19104k4 = interfaceC4146h4;
    }

    /* JADX INFO: renamed from: k4 */
    public C7026h4 m27485k4(C2631kk c2631kk) {
        this.f19105kk = new C12025x6(0.0f, 0.0f);
        this.f19106to = null;
        Iterator<C2633x1> itM12022kk = c2631kk.m12019du().m12022kk();
        while (itM12022kk.hasNext()) {
            itM12022kk.next().m12033k4(this);
            if (this.f19106to != null) {
                break;
            }
        }
        C12025x6 c12025x6 = this.f19106to;
        if (c12025x6 == null) {
            return null;
        }
        return C7026h4.m27478k4(this.f19104k4, this.f19105kk, c12025x6);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        float[] fArrM27482k4 = this.f19107x1.m27482k4(this.f19105kk.m56897x1(), this.f19105kk.m56895kk(), f, f2);
        this.f19106to = new C12025x6(-fArrM27482k4[0], -fArrM27482k4[1]);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        this.f19105kk.m56891k4(f);
        this.f19105kk.m56898x1(f2);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        float[] fArrM27483k4 = this.f19107x1.m27483k4(this.f19105kk.m56897x1(), this.f19105kk.m56895kk(), f, f2, f3, f4);
        this.f19106to = new C12025x6(-fArrM27483k4[0], -fArrM27483k4[1]);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArrM27484k4 = this.f19107x1.m27484k4(this.f19105kk.m56897x1(), this.f19105kk.m56895kk(), f, f2, f3, f4, f5, f6);
        this.f19106to = new C12025x6(-fArrM27484k4[0], -fArrM27484k4[1]);
    }
}
