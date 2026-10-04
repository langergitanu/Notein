package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.o9 */
/* JADX INFO: loaded from: classes3.dex */
final class C14219o9 extends AbstractC1137ga<Backdrop3DScene, C14219o9> {

    /* JADX INFO: renamed from: k4 */
    private float[] f47720k4;

    /* JADX INFO: renamed from: kk */
    private float[] f47721kk;

    /* JADX INFO: renamed from: x1 */
    private float[] f47722x1;

    /* JADX INFO: renamed from: k4 */
    public final void m68401k4() {
        this.f47720k4 = null;
        this.f47721kk = null;
        this.f47722x1 = null;
    }

    /* JADX INFO: renamed from: kk */
    public final float[] m68405kk() {
        float[] fArr = this.f47722x1;
        if (fArr != null) {
            return (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr).deepClone(), float[].class);
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final float[] m68406to() {
        float[] fArr = this.f47721kk;
        if (fArr != null) {
            return (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr).deepClone(), float[].class);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final float[] m68407x1() {
        float[] fArr = this.f47720k4;
        if (fArr != null) {
            return (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr).deepClone(), float[].class);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68402k4(Backdrop3DScene backdrop3DScene) {
        this.f47720k4 = (float[]) backdrop3DScene.getNormalVector().clone();
        this.f47722x1 = (float[]) backdrop3DScene.getAnchorPoint().clone();
        this.f47721kk = (float[]) backdrop3DScene.getUpVector().clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68403k4(InterfaceC14672vc interfaceC14672vc) {
        C14219o9 c14219o9 = (C14219o9) interfaceC14672vc;
        this.f47720k4 = c14219o9.f47720k4;
        this.f47722x1 = c14219o9.f47722x1;
        this.f47721kk = c14219o9.f47721kk;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, Backdrop3DScene backdrop3DScene) {
        m68403k4(interfaceC14672vc);
        m68402k4(backdrop3DScene);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14219o9 c14219o9) {
        return c14219o9 != null && C3085sv.m13091k4(this.f47720k4, c14219o9.f47720k4) && C3085sv.m13091k4(this.f47722x1, c14219o9.f47722x1) && C3085sv.m13091k4(this.f47721kk, c14219o9.f47721kk);
    }
}
