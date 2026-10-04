package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C2580jd extends AbstractC2581k4 {
    public C2580jd(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67407k4('[', m11902x1(), "|=\"", m11900kk(), "\"]");
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!m11903x1(interfaceC12769ix)) {
            return false;
        }
        String strM11899k4 = m11899k4(interfaceC12769ix);
        if (strM11899k4.length() < m11900kk().length()) {
            return false;
        }
        return strM11899k4.length() == m11900kk().length() ? C14113y2.m67363du(strM11899k4, m11900kk()) : C14113y2.m67364dy(strM11899k4, m11900kk()) == 0 && strM11899k4.charAt(m11900kk().length()) == '-';
    }
}
