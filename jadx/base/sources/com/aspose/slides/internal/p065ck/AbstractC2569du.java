package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p028ar.C1561k4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.du */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2569du extends AbstractC2598to {

    /* JADX INFO: renamed from: k4 */
    private C1561k4 f8409k4;

    /* JADX INFO: renamed from: kk */
    private boolean f8410kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f8411x1;

    public AbstractC2569du(C1561k4 c1561k4, String str, boolean z, boolean z2) {
        super(str);
        this.f8409k4 = c1561k4;
        this.f8411x1 = z;
        this.f8410kk = z2;
    }

    /* JADX INFO: renamed from: kk */
    private int m11894kk(InterfaceC12769ix interfaceC12769ix) {
        String strMo22700du = interfaceC12769ix.mo22700du();
        int i = 1;
        for (InterfaceC12777qq interfaceC12777qqMo22631g8 = interfaceC12769ix.mo22631g8(); interfaceC12777qqMo22631g8 != null; interfaceC12777qqMo22631g8 = interfaceC12777qqMo22631g8.mo22631g8()) {
            if (interfaceC12777qqMo22631g8.mo22608fa() == 1 && (this.f8410kk || C14113y2.m67363du(((InterfaceC12769ix) interfaceC12777qqMo22631g8).mo22700du(), strMo22700du))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    private int m11895x1(InterfaceC12769ix interfaceC12769ix) {
        String strMo22700du = interfaceC12769ix.mo22700du();
        int i = 1;
        for (InterfaceC12777qq interfaceC12777qqMo22654sv = interfaceC12769ix.mo22654sv(); interfaceC12777qqMo22654sv != null; interfaceC12777qqMo22654sv = interfaceC12777qqMo22654sv.mo22654sv()) {
            if (interfaceC12777qqMo22654sv.mo22608fa() == 1 && (this.f8410kk || C14113y2.m67363du(((InterfaceC12769ix) interfaceC12777qqMo22654sv).mo22700du(), strMo22700du))) {
                i++;
            }
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2598to, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67407k4(':', m11909k4(), this.f8409k4.m8349k4(), ")");
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11896k4(InterfaceC12769ix interfaceC12769ix) {
        return this.f8411x1 ? m11895x1(interfaceC12769ix) : m11894kk(interfaceC12769ix);
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) {
            return false;
        }
        return m11897x1().m8350k4(m11896k4(interfaceC12769ix));
    }

    /* JADX INFO: renamed from: x1 */
    public final C1561k4 m11897x1() {
        return this.f8409k4;
    }
}
