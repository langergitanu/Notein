package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p270m9.AbstractC6340k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2612x1 extends AbstractC2566ca {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC2563bz f8427k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2563bz f8428x1;

    public AbstractC2612x1(InterfaceC2563bz interfaceC2563bz, InterfaceC2563bz interfaceC2563bz2) {
        this.f8427k4 = interfaceC2563bz;
        this.f8428x1 = interfaceC2563bz2;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: du */
    public boolean mo11891du() {
        return ((AbstractC2566ca) m11952k4()).mo11891du() | ((AbstractC2566ca) m11953x1()).mo11891du();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2563bz m11952k4() {
        return this.f8427k4;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: kk */
    public int mo11886kk() {
        return 10;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: to */
    public int mo11887to() {
        return m11953x1().mo11887to() + m11952k4().mo11887to();
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC2563bz m11953x1() {
        return this.f8428x1;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: k4 */
    public void mo11892k4(AbstractC6340k4 abstractC6340k4) {
        ((AbstractC2566ca) m11952k4()).mo11892k4(abstractC6340k4);
        if (m11953x1() != null) {
            ((AbstractC2566ca) m11953x1()).mo11892k4(abstractC6340k4);
        }
        super.mo11892k4(abstractC6340k4);
    }
}
