package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p200j6.C5201dy;
import com.aspose.slides.internal.p200j6.C5208m9;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.dq */
/* JADX INFO: loaded from: classes.dex */
public class C3925dq implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10668k4;

    public C3925dq(InterfaceC9477x1 interfaceC9477x1) {
        this.f10668k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() != 4) {
            return;
        }
        C5201dy c5201dy = C5201dy.f14206k4;
        C9470du c9470duMo46638k4 = this.f10668k4.mo46638k4();
        C5208m9 c5208m9M46596to = c9470duMo46638k4.m46596to();
        c5208m9M46596to.m22223k4(c5201dy);
        float[] fArr = new float[4];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = ((C7179c5) list.get_Item(i)).m27753to();
        }
        c5208m9M46596to.m22224k4(fArr);
        float[] fArrMo8468k4 = C5201dy.f14206k4.mo8468k4(fArr);
        c9470duMo46638k4.m46580k4(C12003du.m56398k4(c9470duMo46638k4.m46552b3().m56501c5() & 255, OooO.OooO00o(fArrMo8468k4[0] * 255.0f, 14), OooO.OooO00o(fArrMo8468k4[1] * 255.0f, 14), OooO.OooO00o(fArrMo8468k4[2] * 255.0f, 14)).Clone());
        c9470duMo46638k4.m46611x1(c5208m9M46596to);
        this.f10668k4.mo46639k4(c9470duMo46638k4);
    }
}
