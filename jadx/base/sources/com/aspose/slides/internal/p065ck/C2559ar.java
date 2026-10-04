package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C2559ar extends AbstractC2582kk {
    public C2559ar(String str) {
        super(str, null);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: h4 */
    public String mo11884h4() {
        return m11904k4() != null ? C14113y2.m67402k4("{0}|*", m11904k4()) : C18358t1.g.f56183c;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: k4 */
    public boolean mo11885k4(InterfaceC12769ix interfaceC12769ix, String str) {
        String strMo13292k4;
        if (m11904k4() == null) {
            return true;
        }
        if (m11904k4().length() == 0) {
            return C14113y2.m67411k4(interfaceC12769ix.mo22634jd());
        }
        if (C18358t1.g.f56183c.equals(m11904k4())) {
            return true;
        }
        if (m11893m9() == null || m11893m9().m23401a_() == null || (strMo13292k4 = m11893m9().m23401a_().m26017du().mo13292k4(m11904k4())) == null) {
            return false;
        }
        return C14113y2.m67363du(strMo13292k4, interfaceC12769ix.mo22634jd());
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: kk */
    public int mo11886kk() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: to */
    public int mo11887to() {
        return 0;
    }
}
