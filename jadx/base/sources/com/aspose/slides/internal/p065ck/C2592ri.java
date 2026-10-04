package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p270m9.AbstractC6340k4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2592ri extends AbstractC2566ca {

    /* JADX INFO: renamed from: k4 */
    private AbstractC2566ca f8421k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2566ca f8422x1;

    public C2592ri(AbstractC2566ca abstractC2566ca, AbstractC2566ca abstractC2566ca2) {
        this.f8421k4 = abstractC2566ca;
        this.f8422x1 = abstractC2566ca2;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: du */
    public boolean mo11891du() {
        return this.f8422x1.mo11891du();
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: h4 */
    public String mo11884h4() {
        return C14113y2.m67408k4(this.f8421k4.mo11884h4(), this.f8422x1.mo11884h4());
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: k4 */
    public void mo11892k4(AbstractC6340k4 abstractC6340k4) {
        this.f8421k4.mo11892k4(abstractC6340k4);
        this.f8422x1.mo11892k4(abstractC6340k4);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: kk */
    public int mo11886kk() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: to */
    public int mo11887to() {
        return this.f8422x1.mo11887to() + this.f8421k4.mo11887to();
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: k4 */
    public boolean mo11885k4(InterfaceC12769ix interfaceC12769ix, String str) {
        return this.f8421k4.mo11885k4(interfaceC12769ix, str) && this.f8422x1.mo11885k4(interfaceC12769ix, str);
    }
}
