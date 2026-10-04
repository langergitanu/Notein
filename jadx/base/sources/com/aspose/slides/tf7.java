package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
abstract class tf7 extends C0962es {

    /* JADX INFO: renamed from: c5 */
    private boolean f49116c5;

    /* JADX INFO: renamed from: du */
    protected C11896dy f49117du;

    /* JADX INFO: renamed from: dy */
    private float f49118dy;

    /* JADX INFO: renamed from: h4 */
    protected C12007ix f49119h4;

    /* JADX INFO: renamed from: jd */
    private boolean f49120jd;

    /* JADX INFO: renamed from: m9 */
    private C12025x6 f49121m9;

    public tf7(ajz ajzVar) {
        super(ajzVar);
        this.f49121m9 = new C12025x6();
        this.f49119h4 = new C12007ix();
        this.f49118dy = 0.0f;
        this.f49121m9 = new C12025x6(ajzVar.f3918x1.getCenterX(), ajzVar.f3918x1.getCenterY());
        ((ShapeFrame) ajzVar.f3918x1).m2660k4().CloneTo(this.f49119h4);
    }

    /* JADX INFO: renamed from: ak */
    public final boolean m71125ak() {
        return this.f49116c5;
    }

    /* JADX INFO: renamed from: b3 */
    public final C12025x6 m71126b3() {
        return this.f49121m9;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m71127c6() {
        if (this.f49119h4.m56550c5() == 0.0f) {
            this.f49119h4.m56576x1(1.0f);
        }
        if (this.f49119h4.m56575x1() == 0.0f) {
            this.f49119h4.m56560k4(1.0f);
        }
    }

    /* JADX INFO: renamed from: dq */
    public final boolean m71128dq() {
        return this.f49120jd;
    }

    /* JADX INFO: renamed from: kk */
    public final void m71129kk(C12007ix c12007ix) {
        c12007ix.CloneTo(this.f49119h4);
    }

    /* JADX INFO: renamed from: wy */
    public final float m71130wy() {
        return this.f49118dy;
    }

    /* JADX INFO: renamed from: xk */
    public final C12007ix m71131xk() {
        return this.f49119h4;
    }

    public tf7(ajz ajzVar, boolean z) {
        this(ajzVar);
        this.f49117du = ajzVar.f3917to;
        if (z) {
            IShapeFrame iShapeFrame = ajzVar.f3918x1;
            if (!C14064he.m66715kk(iShapeFrame.getRotation())) {
                this.f49118dy = -iShapeFrame.getRotation();
            }
            this.f49116c5 = iShapeFrame.getFlipH() == 1;
            boolean z2 = iShapeFrame.getFlipV() == 1;
            this.f49120jd = z2;
            if (this.f49116c5 ^ z2) {
                this.f49118dy = -this.f49118dy;
            }
        }
    }
}
