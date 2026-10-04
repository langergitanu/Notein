package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12774lr;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5545k4 extends AbstractC5535bv implements InterfaceC12772kk {

    /* JADX INFO: renamed from: k4 */
    private C5565yj f15237k4;

    /* JADX INFO: renamed from: kk */
    private boolean f15238kk;

    /* JADX INFO: renamed from: to */
    private boolean f15239to;

    /* JADX INFO: renamed from: x1 */
    private String f15240x1;

    public C5545k4(C5565yj c5565yj, C5552rv c5552rv) {
        super(c5552rv);
        this.f15237k4 = c5565yj;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: c5 */
    public String mo22604c5() {
        return this.f15237k4.mo22875k4();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ck */
    public String mo22626ck() {
        return this.f15237k4.m22873du();
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC12774lr m22736du() {
        return new C5538dq(this);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: dy */
    public String mo22606dy() {
        return mo22741kk();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 2;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12772kk
    /* JADX INFO: renamed from: h4 */
    public final boolean mo22737h4() {
        return this.f15239to;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: jd */
    public String mo22634jd() {
        return this.f15237k4.m22877kk();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12772kk
    /* JADX INFO: renamed from: k4 */
    public final String mo22738k4() {
        return this.f15237k4.m22879x1();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12772kk
    /* JADX INFO: renamed from: kk */
    public final String mo22741kk() {
        return this.f15240x1;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return mo22738k4();
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC12769ix m22742to() {
        return (InterfaceC12769ix) C7019kk.m27452k4((Object) mo22646kp(), C5543ix.class);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        C5545k4 c5545k4M22811x1 = mo22660v4().m22811x1(mo22626ck(), mo22604c5(), mo22634jd());
        c5545k4M22811x1.mo22739k4(mo22741kk());
        return c5545k4M22811x1;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12772kk
    /* JADX INFO: renamed from: k4 */
    public final void mo22739k4(String str) {
        this.f15240x1 = str;
        this.f15238kk = false;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: kk */
    public void mo22645kk(String str) {
        C5565yj c5565yj = this.f15237k4;
        c5565yj.m22876k4(c5565yj.m22878to().m22796kk().mo65266k4(str));
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public void mo22667x1(String str) {
        mo22739k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22740k4(boolean z) {
        this.f15239to = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m22743x1() {
        return this.f15238kk;
    }
}
