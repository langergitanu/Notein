package com.aspose.slides.internal.p333p8;

import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9426h4 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private final C7187kk f34304k4;

    /* JADX INFO: renamed from: kk */
    private C9424dy f34305kk;

    /* JADX INFO: renamed from: to */
    private C9430m9 f34306to;

    /* JADX INFO: renamed from: x1 */
    private C9421c5 f34307x1;

    public C9426h4() {
        this(C9424dy.m46136k4());
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f34304k4;
    }

    /* JADX INFO: renamed from: du */
    public final float m46148du() {
        return this.f34304k4.m27795k4(C7182dy.f19481ji, 0.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9430m9 m46149k4() {
        C7187kk c7187kk;
        if (this.f34306to == null && (c7187kk = (C7187kk) this.f34304k4.m27799k4(C7182dy.f19459i2, C7182dy.f19430g6)) != null) {
            this.f34306to = new C9430m9(c7187kk);
        }
        return this.f34306to;
    }

    /* JADX INFO: renamed from: kk */
    public final C9421c5 m46150kk() {
        if (this.f34307x1 == null) {
            C7187kk c7187kk = (C7187kk) this.f34304k4.mo27768h4(C7182dy.f19624sf);
            if (c7187kk != null) {
                this.f34307x1 = new C9421c5(c7187kk);
            }
            if (this.f34307x1 == null && m46149k4() != null) {
                this.f34307x1 = m46149k4().m46166x1();
            }
        }
        return this.f34307x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9427jd m46151to() {
        return C9427jd.m46153k4(this.f34304k4.mo27768h4(C7182dy.f19520m2));
    }

    /* JADX INFO: renamed from: x1 */
    public final C9424dy m46152x1() {
        C7186k4 c7186k4;
        C9424dy c9424dy;
        if (this.f34305kk == null) {
            C7187kk c7187kk = this.f34304k4;
            C7182dy c7182dy = C7182dy.f19354br;
            C7186k4 c7186k42 = (C7186k4) c7187kk.mo27768h4(c7182dy);
            if (c7186k42 != null) {
                c9424dy = new C9424dy(c7186k42);
            } else if (m46149k4() != null && (c7186k4 = (C7186k4) m46149k4().m46165kk().mo27768h4(c7182dy)) != null) {
                c9424dy = new C9424dy(c7186k4);
            }
            this.f34305kk = c9424dy;
        }
        return this.f34305kk;
    }

    public C9426h4(C7187kk c7187kk) {
        this.f34304k4 = c7187kk;
    }

    public C9426h4(C9424dy c9424dy) {
        C7187kk c7187kk = new C7187kk();
        this.f34304k4 = c7187kk;
        c7187kk.m27815x1(C7182dy.f19711xz, C7182dy.f19615s0);
        c7187kk.m27801k4(C7182dy.f19354br, c9424dy);
    }
}
