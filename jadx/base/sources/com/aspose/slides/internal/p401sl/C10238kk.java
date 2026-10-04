package com.aspose.slides.internal.p401sl;

import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.InterfaceC9428k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.sl.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10238kk extends AbstractC10239m9 {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9428k4 f36694k4;

    public C10238kk(C7180ck c7180ck) {
        super(c7180ck);
        m50133yj().m27802k4(C7182dy.f19585pu, m50128k4());
        this.f36694k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m50128k4() {
        return "Form";
    }

    /* JADX INFO: renamed from: x1 */
    public final C9421c5 m50129x1() {
        C7180ck c7180ckM50133yj = m50133yj();
        C7182dy c7182dy = C7182dy.f19624sf;
        C7187kk c7187kkM27810m9 = c7180ckM50133yj.m27810m9(c7182dy);
        if (c7187kkM27810m9 != null) {
            return new C9421c5(c7187kkM27810m9);
        }
        if (c7180ckM50133yj.m27805k4(c7182dy)) {
            return new C9421c5();
        }
        return null;
    }

    public C10238kk(C7180ck c7180ck, InterfaceC9428k4 interfaceC9428k4) {
        super(c7180ck);
        m50133yj().m27802k4(C7182dy.f19585pu, m50128k4());
        this.f36694k4 = interfaceC9428k4;
    }
}
