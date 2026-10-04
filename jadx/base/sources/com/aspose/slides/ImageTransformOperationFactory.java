package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ImageTransformOperationFactory implements IImageTransformOperationFactory {
    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaCeiling createAlphCeiling() {
        return new AlphaCeiling(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaBiLevel createAlphaBiLevel(float f) {
        return new AlphaBiLevel(f, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaFloor createAlphaFloor() {
        return new AlphaFloor(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaInverse createAlphaInverse() {
        return new AlphaInverse(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaModulate createAlphaModulate() {
        return new AlphaModulate(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaModulateFixed createAlphaModulateFixed(float f) {
        return new AlphaModulateFixed(f, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IAlphaReplace createAlphaReplace(float f) {
        return new AlphaReplace(f, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IBiLevel createBiLevel(float f) {
        return new BiLevel(f, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IBlur createBlur(double d, boolean z) {
        return new Blur(d, z, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IColorChange createColorChange() {
        return new ColorChange(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IColorReplace createColorReplace() {
        return new ColorReplace(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IDuotone createDuotone() {
        return new Duotone(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IFillOverlay createFillOverlay() {
        return new FillOverlay(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IGrayScale createGrayScale() {
        return new GrayScale(null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final IHSL createHSL(float f, float f2, float f3) {
        return new HSL(f, f2, f3, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final ILuminance createLuminance(float f, float f2) {
        return new Luminance(f, f2, null);
    }

    @Override // com.aspose.slides.IImageTransformOperationFactory
    public final ITint createTint(float f, float f2) {
        return new Tint(f, f2, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final IImageTransformOperation m1764k4(IEffectEffectiveData iEffectEffectiveData) {
        if (C7019kk.m27469x1(iEffectEffectiveData, C14789xk.class)) {
            return new AlphaBiLevel(((C14789xk) iEffectEffectiveData).getThreshold(), null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C0843c6.class)) {
            return new AlphaCeiling(null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14574ts.class)) {
            return new AlphaFloor(null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C0922e0.class)) {
            return new AlphaInverse(null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14352qm.class)) {
            return new AlphaModulateFixed(((C14352qm) iEffectEffectiveData).getAmount(), null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C1135g8.class)) {
            return new AlphaReplace(((C1135g8) iEffectEffectiveData).getAlpha(), null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C13841ml.class)) {
            return new BiLevel(((C13841ml) iEffectEffectiveData).getThreshold(), null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C1194hc.class)) {
            C1194hc c1194hc = (C1194hc) iEffectEffectiveData;
            return new Blur(c1194hc.getRadius(), c1194hc.getGrow(), null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14410rr.class)) {
            C14410rr c14410rr = (C14410rr) iEffectEffectiveData;
            return new ColorChange(c14410rr.f48681k4.f50171k4, c14410rr.f48682x1.f50171k4, c14410rr.getUseAlpha(), (InterfaceC14397rj) null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14223od.class)) {
            return new ColorReplace(((C14223od) iEffectEffectiveData).f47742k4.f50171k4, null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14613u2.class)) {
            C14613u2 c14613u2 = (C14613u2) iEffectEffectiveData;
            return new Duotone(c14613u2.f49233k4.f50171k4, c14613u2.f49234x1.f50171k4, null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C1132g5.class)) {
            return new FillOverlay(null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14555te.class)) {
            return new GrayScale(null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, C14723w4.class)) {
            C14723w4 c14723w4 = (C14723w4) iEffectEffectiveData;
            return new HSL(c14723w4.getHue(), c14723w4.getSaturation(), c14723w4.getLuminance(), null);
        }
        if (C7019kk.m27469x1(iEffectEffectiveData, oaz.class)) {
            oaz oazVar = (oaz) iEffectEffectiveData;
            return new Luminance(oazVar.getBrightness(), oazVar.getContrast(), null);
        }
        if (!C7019kk.m27469x1(iEffectEffectiveData, az5.class)) {
            throw new NotImplementedException(C14113y2.m67408k4("Creating operation from ", C14067j2.m66727k4(iEffectEffectiveData).mo48540du(), " is not implemented"));
        }
        az5 az5Var = (az5) iEffectEffectiveData;
        return new Tint(az5Var.getHue(), az5Var.getAmount(), null);
    }
}
