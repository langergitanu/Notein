package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageTransformOperation extends PVIObject implements IImageTransformOperation, Cloneable {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<smn> f2489k4;

    /* JADX INFO: renamed from: kk */
    private long f2490kk;

    /* JADX INFO: renamed from: x1 */
    private smn f2491x1;

    public ImageTransformOperation(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2489k4 = new AbstractC7018k4<smn>() { // from class: com.aspose.slides.ImageTransformOperation.1
            {
                ImageTransformOperation.this.f2491x1 = new smn() { // from class: com.aspose.slides.ImageTransformOperation.1.1
                    @Override // com.aspose.slides.smn
                    /* JADX INFO: renamed from: k4 */
                    public void mo1394k4() {
                        for (smn smnVar : ((AbstractC7018k4) C04501.this).f19081x1) {
                            if (smnVar != null) {
                                smnVar.mo1394k4();
                            }
                        }
                    }
                };
            }
        };
        m2145uz();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return this;
    }

    /* JADX INFO: renamed from: dy */
    public final void m1749dy() {
        smn smnVar = this.f2491x1;
        if (smnVar == null || this.f2489k4.m27430k4()) {
            return;
        }
        smnVar.mo1394k4();
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        return this.f2490kk;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract tc4 mo234k4(tc4 tc4Var, IBaseSlide iBaseSlide);

    /* JADX INFO: renamed from: kk */
    public ImageTransformOperation mo241kk() {
        return (ImageTransformOperation) memberwiseClone();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1750m9() {
        this.f2490kk++;
        m1749dy();
    }

    public Object memberwiseClone() {
        try {
            return (ImageTransformOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String mo236k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        return C14067j2.m66727k4(this).mo48540du();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo240k4(InterfaceC14397rj interfaceC14397rj) {
        m2147x1(interfaceC14397rj);
        m1750m9();
    }
}
