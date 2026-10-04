package com.aspose.slides.internal.p401sl;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sl.m9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10239m9 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private final C9427jd f36695k4;

    public AbstractC10239m9(C7180ck c7180ck) {
        this.f36695k4 = new C9427jd(c7180ck);
        m50133yj().m27815x1(C7182dy.f19711xz, C7182dy.f19472iy);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10239m9 m50130k4(C7185jd c7185jd, C9421c5 c9421c5) {
        return m50131k4(c7185jd, false, c9421c5);
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f36695k4.mo8461c5();
    }

    /* JADX INFO: renamed from: ks */
    public final C9427jd m50132ks() {
        return this.f36695k4;
    }

    /* JADX INFO: renamed from: yj */
    public final C7180ck m50133yj() {
        return this.f36695k4.m46156x1();
    }

    public AbstractC10239m9(C9427jd c9427jd) {
        this.f36695k4 = c9427jd;
        m50133yj().m27815x1(C7182dy.f19711xz, C7182dy.f19472iy);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10239m9 m50131k4(C7185jd c7185jd, boolean z, C9421c5 c9421c5) {
        if (C7019kk.m27469x1(c7185jd, C7180ck.class)) {
            C7180ck c7180ck = (C7180ck) C7019kk.m27452k4((Object) c7185jd, C7180ck.class);
            String strM27811to = c7180ck.m27811to(C7182dy.f19585pu);
            if (C14113y2.m67363du(AbstractC10240to.m50137x1(), strM27811to) || (strM27811to == null && z)) {
                C9427jd c9427jd = new C9427jd(c7180ck);
                List<C7182dy> listM46155kk = c9427jd.m46155kk();
                return (listM46155kk == null || !listM46155kk.containsItem(C7182dy.f19742zm)) ? (listM46155kk == null || !listM46155kk.containsItem(C7182dy.f19669vh)) ? (listM46155kk == null || !listM46155kk.containsItem(C7182dy.f19537mx)) ? new C10235dy(c9427jd, c9421c5) : new C10236h4(c9427jd) : new C10241x1(c9427jd) : new C10234du(c9427jd);
            }
            if (C14113y2.m67363du(C10238kk.m50128k4(), strM27811to)) {
                C7187kk c7187kkM27810m9 = c7180ck.m27810m9(C7182dy.f19657uo);
                return (c7187kkM27810m9 == null || !C7182dy.f19593qh.equals(c7187kkM27810m9.m27792du(C7182dy.f19617s2))) ? new C10238kk(c7180ck) : new C10237k4(c7180ck, null);
            }
        }
        return null;
    }
}
