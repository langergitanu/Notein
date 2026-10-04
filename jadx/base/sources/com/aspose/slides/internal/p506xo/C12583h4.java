package com.aspose.slides.internal.p506xo;

import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.internal.p333p8.C9424dy;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12583h4 extends AbstractC12580du implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private final C7187kk f42106k4;

    /* JADX INFO: renamed from: kk */
    private float f42107kk;

    /* JADX INFO: renamed from: x1 */
    private float f42108x1;

    public C12583h4() {
        C7187kk c7187kk = new C7187kk();
        this.f42106k4 = c7187kk;
        c7187kk.m27815x1(C7182dy.f19711xz, C7182dy.f19352bp);
        this.f42108x1 = Float.NEGATIVE_INFINITY;
        this.f42107kk = Float.NEGATIVE_INFINITY;
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f42106k4;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: ck */
    public float mo58726ck() {
        return this.f42106k4.m27795k4(C7182dy.f19644tt, 0.0f);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: du */
    public float mo58727du() {
        return this.f42106k4.m27795k4(C7182dy.f19527mc, 0.0f);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: dy */
    public String mo58728dy() {
        C7191up c7191up = (C7191up) this.f42106k4.mo27768h4(C7182dy.f19729z1);
        if (c7191up != null) {
            return c7191up.m27847x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: fa */
    public final C9427jd m58739fa() {
        C7180ck c7180ck = (C7180ck) this.f42106k4.mo27768h4(C7182dy.f19543n5);
        if (c7180ck != null) {
            return new C9427jd(c7180ck);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: h4 */
    public String mo58729h4() {
        C7191up c7191up = (C7191up) this.f42106k4.mo27768h4(C7182dy.f19407em);
        if (c7191up != null) {
            return c7191up.m27847x1();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: jd */
    public float mo58730jd() {
        return this.f42106k4.m27795k4(C7182dy.f19728z0, 0.0f);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: k4 */
    public float mo58731k4() {
        if (this.f42107kk == Float.NEGATIVE_INFINITY) {
            this.f42107kk = C14116yg.m67480k4(this.f42106k4.m27795k4(C7182dy.f19670vj, 0.0f));
        }
        return this.f42107kk;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: kk */
    public float mo58732kk() {
        return this.f42106k4.m27795k4(C7182dy.f19547ne, 0.0f);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: m9 */
    public C9424dy mo58733m9() {
        C7186k4 c7186k4M27793dy = this.f42106k4.m27793dy(C7182dy.f19441gx);
        if (c7186k4M27793dy != null) {
            return new C9424dy(c7186k4M27793dy);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: to */
    public float mo58734to() {
        return this.f42106k4.m27795k4(C7182dy.f19673vw, 0.0f);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12580du
    /* JADX INFO: renamed from: x1 */
    public float mo58735x1() {
        if (this.f42108x1 == Float.NEGATIVE_INFINITY) {
            this.f42108x1 = C14116yg.m67480k4(this.f42106k4.m27795k4(C7182dy.f19519m1, 0.0f));
        }
        return this.f42108x1;
    }

    public C12583h4(C7187kk c7187kk) {
        this.f42106k4 = c7187kk;
        this.f42108x1 = Float.NEGATIVE_INFINITY;
        this.f42107kk = Float.NEGATIVE_INFINITY;
    }
}
