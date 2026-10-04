package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p200j6.C5208m9;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ak */
/* JADX INFO: loaded from: classes.dex */
public class C3916ak implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10647k4;

    public C3916ak(InterfaceC9477x1 interfaceC9477x1) {
        this.f10647k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() > 3) {
            return;
        }
        C9470du c9470duMo46638k4 = this.f10647k4.mo46638k4();
        C5208m9 c5208m9M46596to = c9470duMo46638k4.m46596to();
        float[] fArr = new float[3];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = ((C7179c5) list.get_Item(i)).m27753to();
        }
        c5208m9M46596to.m22224k4(fArr);
        c9470duMo46638k4.m46611x1(c5208m9M46596to);
        this.f10647k4.mo46639k4(c9470duMo46638k4);
    }
}
