package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.up */
/* JADX INFO: loaded from: classes3.dex */
public class C2603up extends AbstractC2582kk {
    public C2603up(String str, String str2) {
        super(str, str2);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: h4 */
    public String mo11884h4() {
        return m11904k4() != null ? C14113y2.m67402k4("{0}|{1}", m11904k4(), m11905x1()) : m11905x1();
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: k4 */
    public boolean mo11885k4(InterfaceC12769ix interfaceC12769ix, String str) {
        String strMo13292k4;
        if (interfaceC12769ix == null) {
            return false;
        }
        if (m11904k4() == null) {
            return C14113y2.m67432to(interfaceC12769ix.mo22626ck() == null ? interfaceC12769ix.mo22612m9() : interfaceC12769ix.mo22604c5(), m11905x1(), (short) 3);
        }
        if (m11904k4().length() == 0) {
            return C14113y2.m67411k4(interfaceC12769ix.mo22634jd());
        }
        if (C18358t1.g.f56183c.equals(m11904k4())) {
            return C14113y2.m67432to(interfaceC12769ix.mo22604c5(), m11905x1(), (short) 3);
        }
        if (m11893m9() == null || m11893m9().m23401a_() == null || (strMo13292k4 = m11893m9().m23401a_().m26017du().mo13292k4(m11904k4())) == null || !C14113y2.m67363du(strMo13292k4, interfaceC12769ix.mo22634jd())) {
            return false;
        }
        return C14113y2.m67432to(interfaceC12769ix.mo22604c5(), m11905x1(), (short) 3);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: kk */
    public int mo11886kk() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: to */
    public int mo11887to() {
        return 1;
    }
}
