package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p270m9.AbstractC6340k4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2585lr extends AbstractC2566ca {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC2563bz f8418k4;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC2589qm f8419x1;

    public C2585lr(InterfaceC2563bz interfaceC2563bz, InterfaceC2589qm interfaceC2589qm) {
        this.f8418k4 = interfaceC2563bz;
        this.f8419x1 = interfaceC2589qm;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: h4 */
    public String mo11884h4() {
        return C14113y2.m67408k4(m11907k4().mo11884h4(), m11908x1().mo11890du());
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2563bz m11907k4() {
        return this.f8418k4;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: kk */
    public int mo11886kk() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: to */
    public int mo11887to() {
        return m11908x1().mo11901to() + m11907k4().mo11887to();
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC2589qm m11908x1() {
        return this.f8419x1;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: k4 */
    public void mo11892k4(AbstractC6340k4 abstractC6340k4) {
        ((AbstractC2562bv) this.f8419x1).mo11889k4(abstractC6340k4);
        ((AbstractC2566ca) this.f8418k4).mo11892k4(abstractC6340k4);
        super.mo11892k4(abstractC6340k4);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: k4 */
    public boolean mo11885k4(InterfaceC12769ix interfaceC12769ix, String str) {
        return this.f8418k4.mo11885k4(interfaceC12769ix, str) && this.f8419x1.mo11883k4(interfaceC12769ix, str);
    }
}
