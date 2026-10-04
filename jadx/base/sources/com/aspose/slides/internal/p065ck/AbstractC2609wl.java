package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p270m9.AbstractC6340k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.wl */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2609wl extends AbstractC2566ca {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC2563bz f8425k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2563bz f8426x1;

    public AbstractC2609wl(InterfaceC2563bz interfaceC2563bz, InterfaceC2563bz interfaceC2563bz2) {
        this.f8425k4 = interfaceC2563bz;
        this.f8426x1 = interfaceC2563bz2;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2563bz m11950k4() {
        return this.f8425k4;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: to */
    public int mo11887to() {
        return m11951x1().mo11887to() + m11950k4().mo11887to();
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC2563bz m11951x1() {
        return this.f8426x1;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: k4 */
    public void mo11892k4(AbstractC6340k4 abstractC6340k4) {
        super.mo11892k4(abstractC6340k4);
        ((AbstractC2566ca) m11950k4()).mo11892k4(abstractC6340k4);
        ((AbstractC2566ca) m11951x1()).mo11892k4(abstractC6340k4);
    }
}
