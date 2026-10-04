package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C2617yj extends AbstractC2581k4 {
    public C2617yj(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67407k4('[', m11902x1(), "$=\"", m11900kk(), "\"]");
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!m11903x1(interfaceC12769ix) || C14113y2.m67411k4(m11900kk())) {
            return false;
        }
        String strM11899k4 = m11899k4(interfaceC12769ix);
        if (strM11899k4.length() == 0) {
            return false;
        }
        return C14113y2.m67424kk(strM11899k4, m11900kk());
    }
}
