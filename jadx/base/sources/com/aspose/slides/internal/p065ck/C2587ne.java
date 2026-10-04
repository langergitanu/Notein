package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.ne */
/* JADX INFO: loaded from: classes3.dex */
public class C2587ne extends AbstractC2581k4 {
    public C2587ne(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67407k4('[', m11902x1(), "~=\"", m11900kk(), "\"]");
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2581k4, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (C14113y2.m67411k4(m11900kk()) || C14113y2.m67429to(m11900kk(), ControlChar.SPACE_CHAR) != -1 || !m11903x1(interfaceC12769ix)) {
            return false;
        }
        for (String str2 : C14113y2.m67416k4(m11899k4(interfaceC12769ix), new char[]{ControlChar.SPACE_CHAR}, (short) 1)) {
            if (C14113y2.m67363du(str2, m11900kk())) {
                return true;
            }
        }
        return false;
    }
}
