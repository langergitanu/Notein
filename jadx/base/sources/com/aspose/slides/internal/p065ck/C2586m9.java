package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C2586m9 extends AbstractC2581k4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f8420k4;

    public C2586m9(String str, String str2) {
        super(str, "class", str2);
        this.f8420k4 = C14113y2.m67364dy(m11900kk(), " ") == -1;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67408k4(".", m11900kk());
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        int i;
        if (!this.f8420k4 || !m11903x1(interfaceC12769ix)) {
            return false;
        }
        int i2 = m11888h4().m23401a_().m26022to().m25997kk().m26026kk().m53508x1() ? 4 : 5;
        String strM11899k4 = m11899k4(interfaceC12769ix);
        String strM11900kk = m11900kk();
        int length = strM11899k4.length();
        int length2 = strM11900kk.length();
        short s = (short) i2;
        for (int iM67367h4 = C14113y2.m67367h4(strM11899k4, strM11900kk, s); iM67367h4 != -1; iM67367h4 = C14113y2.m67381k4(strM11899k4, strM11900kk, iM67367h4 + length2, s)) {
            if ((iM67367h4 == 0 || C14117yj.m67518fa(strM11899k4.charAt(iM67367h4 - 1))) && ((i = iM67367h4 + length2) == length || C14117yj.m67518fa(strM11899k4.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}
