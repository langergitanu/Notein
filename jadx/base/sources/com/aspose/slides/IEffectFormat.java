package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IEffectFormat extends IEffectParamSource {
    void disableBlurEffect();

    void disableFillOverlayEffect();

    void disableGlowEffect();

    void disableInnerShadowEffect();

    void disableOuterShadowEffect();

    void disablePresetShadowEffect();

    void disableReflectionEffect();

    void disableSoftEdgeEffect();

    void enableFillOverlayEffect();

    void enableGlowEffect();

    void enableInnerShadowEffect();

    void enableOuterShadowEffect();

    void enablePresetShadowEffect();

    void enableReflectionEffect();

    void enableSoftEdgeEffect();

    IBlur getBlurEffect();

    IEffectFormatEffectiveData getEffective();

    IFillOverlay getFillOverlayEffect();

    IGlow getGlowEffect();

    IInnerShadow getInnerShadowEffect();

    IOuterShadow getOuterShadowEffect();

    IPresetShadow getPresetShadowEffect();

    IReflection getReflectionEffect();

    ISoftEdge getSoftEdgeEffect();

    boolean isNoEffects();

    void setBlurEffect(double d, boolean z);

    void setBlurEffect(IBlur iBlur);

    void setFillOverlayEffect(IFillOverlay iFillOverlay);

    void setGlowEffect(IGlow iGlow);

    void setInnerShadowEffect(IInnerShadow iInnerShadow);

    void setOuterShadowEffect(IOuterShadow iOuterShadow);

    void setPresetShadowEffect(IPresetShadow iPresetShadow);

    void setReflectionEffect(IReflection iReflection);

    void setSoftEdgeEffect(ISoftEdge iSoftEdge);
}
