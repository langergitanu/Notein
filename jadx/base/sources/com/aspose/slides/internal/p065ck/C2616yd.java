package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9931u4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C2616yd extends AbstractC2600ts {

    /* JADX INFO: renamed from: k4 */
    private String f8429k4;

    public C2616yd(String str) {
        super("dir(");
        if (!"ltr".equals(str) && !"rtl".equals(str) && !"auto".equals(str)) {
            throw new C9931u4(str);
        }
        this.f8429k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m11954x1(InterfaceC12769ix interfaceC12769ix) {
        if (interfaceC12769ix.mo22698c5("dir")) {
            String strMo22721to = interfaceC12769ix.mo22721to("dir");
            if (!"ltr".equals(strMo22721to) || !"rtl".equals(strMo22721to) || !"auto".equals(strMo22721to)) {
                return strMo22721to;
            }
        }
        return (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) ? "auto" : m11954x1((InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC12769ix.mo22646kp(), InterfaceC12769ix.class));
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2598to, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67402k4(":{0}{1})", "dir(", this.f8429k4);
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        String strM11954x1 = m11954x1(interfaceC12769ix);
        if (C14113y2.m67363du(strM11954x1, this.f8429k4)) {
            return true;
        }
        return C14113y2.m67363du(strM11954x1, "auto") && C14113y2.m67363du(this.f8429k4, "ltr");
    }
}
