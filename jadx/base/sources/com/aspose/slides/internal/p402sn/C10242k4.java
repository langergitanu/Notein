package com.aspose.slides.internal.p402sn;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p245la.C6015h4;
import com.aspose.slides.internal.p245la.C6019to;
import com.aspose.slides.internal.p245la.C6020x1;
import com.aspose.slides.internal.p245la.InterfaceC6014dy;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p470w5.C11885h4;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p550zi.AbstractC13605ks;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.internal.p550zi.C13620x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.sn.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10242k4 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13605ks m50152k4(C13618wy c13618wy, C13620x6 c13620x6) {
        C6019to c6019toM24318k4 = C6019to.m24318k4(c13618wy, false);
        InterfaceC6901du interfaceC6901duM24294k4 = c6019toM24318k4.m24325to() ? C6013du.m24294k4(c13618wy, c6019toM24318k4.m24319du()) : null;
        List list = new List();
        boolean z = false;
        C11887kk c11887kk = null;
        while (c13618wy.m62853k4() < c13618wy.m62859kk()) {
            if (c13618wy.m62853k4() == c13618wy.m62859kk() - 1) {
                z = c13618wy.m62847c5() == 59;
            } else {
                InterfaceC6014dy interfaceC6014dyM24327k4 = C6020x1.m24327k4(c13618wy.m62861x1());
                if (interfaceC6014dyM24327k4 == null) {
                    byte[] bArr = new byte[2];
                    if (c13618wy.m62860x1(bArr) != 2 || C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != C7019kk.m27462to((Object) (byte) 33, 6)) {
                        break;
                    }
                    list.addItem(new C11885h4(bArr[1], C6013du.m24298k4(c13618wy)));
                } else {
                    InterfaceC6018m9 interfaceC6018m9Mo22586k4 = interfaceC6014dyM24327k4.mo22586k4(c13618wy, interfaceC6901duM24294k4);
                    if (C7019kk.m27469x1(interfaceC6018m9Mo22586k4, C11887kk.class) && c11887kk == null) {
                        c11887kk = (C11887kk) C7019kk.m27452k4((Object) interfaceC6018m9Mo22586k4, C11887kk.class);
                    }
                    list.addItem(interfaceC6018m9Mo22586k4);
                }
            }
        }
        return new C6015h4(c6019toM24318k4, (InterfaceC6018m9[]) list.toArray(new InterfaceC6018m9[0]), interfaceC6901duM24294k4, z, c11887kk);
    }
}
