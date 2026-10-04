package com.aspose.slides.internal.p474wg;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.kk */
/* JADX INFO: loaded from: classes5.dex */
class C11949kk implements InterfaceC11918ak {
    /* JADX INFO: renamed from: k4 */
    public static C11986x1 m55999k4(AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        C11950kp c11950kpMo55894k4;
        String strM56003x1;
        C11975um c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994yg, C11975um.class);
        if (c11975um == null || interfaceC11926c6 == null || (c11950kpMo55894k4 = interfaceC11926c6.mo55894k4(c11975um.m56231u4(), "basic")) == null || (strM56003x1 = c11950kpMo55894k4.m56003x1()) == null || "".equals(strM56003x1)) {
            return null;
        }
        String strM56002kk = c11950kpMo55894k4.m56002kk();
        String strM56001k4 = c11950kpMo55894k4.m56001k4();
        return new C11986x1(C14113y2.m67408k4("Basic ", C14080ne.m66952k4(m56000k4((strM56001k4 == null || "".equals(strM56001k4) || "".equals(C14113y2.m67440x1(strM56001k4))) ? C14113y2.m67408k4(strM56003x1, C18241k5.f55433h, strM56002kk) : C14113y2.m67408k4(strM56001k4, "\\", strM56003x1, C18241k5.f55433h, strM56002kk)))));
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: x1 */
    public C11986x1 mo15102x1(AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        return m55999k4(abstractC11994yg, interfaceC11926c6);
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: k4 */
    public C11986x1 mo15100k4(String str, AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        if (interfaceC11926c6 == null || str == null || C14113y2.m67367h4(C14113y2.m67368h4(C14113y2.m67440x1(str)), "basic", (short) 4) == -1) {
            return null;
        }
        return m55999k4(abstractC11994yg, interfaceC11926c6);
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: k4 */
    public String mo15101k4() {
        return "Basic";
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m56000k4(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr;
            }
            bArr[length] = C7019kk.m27442k4(Character.valueOf(str.charAt(length)), 4);
        }
    }
}
