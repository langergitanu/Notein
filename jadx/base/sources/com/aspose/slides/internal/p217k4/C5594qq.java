package com.aspose.slides.internal.p217k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.qq */
/* JADX INFO: loaded from: classes.dex */
public class C5594qq extends AbstractC5596to {

    /* JADX INFO: renamed from: x1 */
    public InterfaceC5578b3 f15417x1;

    public C5594qq(InterfaceC5578b3 interfaceC5578b3, C5579bv c5579bv) {
        super(c5579bv);
        m22975k4(interfaceC5578b3);
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5596to
    /* JADX INFO: renamed from: k4 */
    public Object mo22973k4(InterfaceC5607yj interfaceC5607yj) {
        return ((InterfaceC5578b3) interfaceC5607yj).mo22909h4(1);
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5596to
    /* JADX INFO: renamed from: k4 */
    public Object mo22974k4(InterfaceC5607yj interfaceC5607yj, C5598um c5598um, int i, C5582du c5582du) {
        String string;
        if (i == -1) {
            string = "<missing EOF>";
        } else {
            StringBuffer stringBuffer = new StringBuffer("<missing ");
            stringBuffer.append(mo22453h4()[i]);
            stringBuffer.append(">");
            string = stringBuffer.toString();
        }
        C5580c5 c5580c5 = new C5580c5(i, string);
        InterfaceC5578b3 interfaceC5578b3 = (InterfaceC5578b3) interfaceC5607yj;
        InterfaceC5591lr interfaceC5591lrMo22909h4 = interfaceC5578b3.mo22909h4(1);
        if (interfaceC5591lrMo22909h4.mo22915k4() == -1) {
            interfaceC5591lrMo22909h4 = interfaceC5578b3.mo22909h4(-1);
        }
        c5580c5.f15374x1 = interfaceC5591lrMo22909h4.mo22919kk();
        c5580c5.f15371kk = interfaceC5591lrMo22909h4.mo22922to();
        c5580c5.f15373to = 0;
        return c5580c5;
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5596to
    /* JADX INFO: renamed from: k4 */
    public void mo22965k4() {
        super.mo22965k4();
        InterfaceC5578b3 interfaceC5578b3 = this.f15417x1;
        if (interfaceC5578b3 != null) {
            interfaceC5578b3.mo22957to(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m22975k4(InterfaceC5578b3 interfaceC5578b3) {
        this.f15417x1 = null;
        mo22965k4();
        this.f15417x1 = interfaceC5578b3;
    }
}
