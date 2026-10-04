package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
final class vlf extends AbstractC1137ga<LightRig, vlf> implements ILightRigEffectiveData {

    /* JADX INFO: renamed from: k4 */
    int f49595k4 = 1;

    /* JADX INFO: renamed from: x1 */
    int f49597x1 = 25;

    /* JADX INFO: renamed from: kk */
    float[] f49596kk = {0.0f, 0.0f, 0.0f};

    @Override // com.aspose.slides.ILightRigEffectiveData
    public final int getDirection() {
        return this.f49595k4;
    }

    @Override // com.aspose.slides.ILightRigEffectiveData
    public final int getLightType() {
        return this.f49597x1;
    }

    @Override // com.aspose.slides.ILightRigEffectiveData
    public final float[] getRotation() {
        float[] fArr = this.f49596kk;
        if (fArr != null) {
            return (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr).deepClone(), float[].class);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72349k4() {
        this.f49595k4 = 1;
        this.f49597x1 = 25;
        float[] fArr = this.f49596kk;
        if (fArr != null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72350k4(LightRig lightRig) {
        if (lightRig.getDirection() == -1 && lightRig.getLightType() == -1 && lightRig.m1865du() == null) {
            return;
        }
        if (lightRig.getDirection() != -1) {
            this.f49595k4 = lightRig.getDirection();
        }
        if (lightRig.getLightType() != -1) {
            this.f49597x1 = lightRig.getLightType();
        }
        this.f49596kk = lightRig.getRotation();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72351k4(InterfaceC14672vc interfaceC14672vc) {
        vlf vlfVar = (vlf) interfaceC14672vc;
        this.f49595k4 = vlfVar.f49595k4;
        this.f49597x1 = vlfVar.f49597x1;
        this.f49596kk = vlfVar.f49596kk;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, LightRig lightRig) {
        m72351k4(interfaceC14672vc);
        m72350k4(lightRig);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(vlf vlfVar) {
        return vlfVar != null && this.f49595k4 == vlfVar.f49595k4 && this.f49597x1 == vlfVar.f49597x1 && C3085sv.m13091k4(this.f49596kk, vlfVar.f49596kk);
    }
}
