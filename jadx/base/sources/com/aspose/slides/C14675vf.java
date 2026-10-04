package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.vf */
/* JADX INFO: loaded from: classes3.dex */
final class C14675vf extends AbstractC1137ga<Camera, C14675vf> implements ICameraEffectiveData {

    /* JADX INFO: renamed from: x1 */
    private float f49495x1 = Float.NaN;

    /* JADX INFO: renamed from: kk */
    private float f49493kk = Float.NaN;

    /* JADX INFO: renamed from: k4 */
    private int f49492k4 = -1;

    /* JADX INFO: renamed from: to */
    private float[] f49494to = {0.0f, 0.0f, 0.0f};

    @Override // com.aspose.slides.ICameraEffectiveData
    public final int getCameraType() {
        return this.f49492k4;
    }

    @Override // com.aspose.slides.ICameraEffectiveData
    public final float getFieldOfViewAngle() {
        return this.f49495x1;
    }

    @Override // com.aspose.slides.ICameraEffectiveData
    public final float[] getRotation() {
        float[] fArr = this.f49494to;
        if (fArr != null) {
            return (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr).deepClone(), float[].class);
        }
        return null;
    }

    @Override // com.aspose.slides.ICameraEffectiveData
    public final float getZoom() {
        return this.f49493kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72192k4() {
        this.f49495x1 = Float.NaN;
        this.f49493kk = Float.NaN;
        this.f49492k4 = -1;
        float[] fArr = this.f49494to;
        if (fArr != null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72193k4(Camera camera) {
        if (camera.getCameraType() != -1) {
            this.f49492k4 = camera.getCameraType();
            if (!C14067j2.m66728k4(Float.valueOf(camera.getFieldOfViewAngle()), Float.valueOf(Float.NaN))) {
                this.f49495x1 = camera.getFieldOfViewAngle();
            }
            if (!C14067j2.m66728k4(Float.valueOf(camera.getZoom()), Float.valueOf(Float.NaN))) {
                this.f49493kk = camera.getZoom();
            }
            this.f49494to = camera.getRotation();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72194k4(InterfaceC14672vc interfaceC14672vc) {
        C14675vf c14675vf = (C14675vf) interfaceC14672vc;
        this.f49492k4 = c14675vf.f49492k4;
        this.f49495x1 = c14675vf.f49495x1;
        this.f49493kk = c14675vf.f49493kk;
        this.f49494to = c14675vf.f49494to;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, Camera camera) {
        m72194k4(interfaceC14672vc);
        m72193k4(camera);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14675vf c14675vf) {
        return c14675vf != null && C3085sv.m13091k4(this.f49494to, c14675vf.f49494to) && this.f49492k4 == c14675vf.f49492k4 && C3085sv.m13089k4(this.f49495x1, c14675vf.f49495x1) && C3085sv.m13089k4(this.f49493kk, c14675vf.f49493kk);
    }
}
