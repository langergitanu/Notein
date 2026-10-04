package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ir */
/* JADX INFO: loaded from: classes3.dex */
final class C13657ir {

    /* JADX INFO: renamed from: c5 */
    private boolean f45350c5 = false;

    /* JADX INFO: renamed from: ck */
    private long f45351ck;

    /* JADX INFO: renamed from: du */
    private OuterShadow f45352du;

    /* JADX INFO: renamed from: dy */
    private SoftEdge f45353dy;

    /* JADX INFO: renamed from: h4 */
    private PresetShadow f45354h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC14397rj f45355jd;

    /* JADX INFO: renamed from: k4 */
    private Blur f45356k4;

    /* JADX INFO: renamed from: kk */
    private Glow f45357kk;

    /* JADX INFO: renamed from: m9 */
    private Reflection f45358m9;

    /* JADX INFO: renamed from: to */
    private InnerShadow f45359to;

    /* JADX INFO: renamed from: x1 */
    private FillOverlay f45360x1;

    public C13657ir(InterfaceC14397rj interfaceC14397rj) {
        this.f45355jd = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: ks */
    private void m63066ks() {
        this.f45351ck++;
    }

    /* JADX INFO: renamed from: c5 */
    public final ISoftEdge m63067c5() {
        return this.f45353dy;
    }

    /* JADX INFO: renamed from: ck */
    public final void m63068ck() {
        this.f45351ck = m63089up();
        m63066ks();
        this.f45356k4 = null;
        this.f45360x1 = null;
        this.f45357kk = null;
        this.f45359to = null;
        this.f45352du = null;
        this.f45354h4 = null;
        this.f45358m9 = null;
        this.f45353dy = null;
        this.f45350c5 = false;
    }

    /* JADX INFO: renamed from: du */
    public final IInnerShadow m63069du() {
        return this.f45359to;
    }

    /* JADX INFO: renamed from: dy */
    public final IReflection m63070dy() {
        return this.f45358m9;
    }

    public boolean equals(Object obj) {
        Blur blur;
        FillOverlay fillOverlay;
        Glow glow;
        InnerShadow innerShadow;
        OuterShadow outerShadow;
        PresetShadow presetShadow;
        Reflection reflection;
        IEffectFormat iEffectFormat = (IEffectFormat) C7019kk.m27452k4(obj, IEffectFormat.class);
        if (iEffectFormat == null) {
            return super.equals(obj);
        }
        if (!(this.f45356k4 == null && iEffectFormat.getBlurEffect() == null) && ((blur = this.f45356k4) == null || !blur.equals(iEffectFormat.getBlurEffect()))) {
            return false;
        }
        if (!(this.f45360x1 == null && iEffectFormat.getFillOverlayEffect() == null) && ((fillOverlay = this.f45360x1) == null || !fillOverlay.equals(iEffectFormat.getFillOverlayEffect()))) {
            return false;
        }
        if (!(this.f45357kk == null && iEffectFormat.getGlowEffect() == null) && ((glow = this.f45357kk) == null || !glow.equals(iEffectFormat.getGlowEffect()))) {
            return false;
        }
        if (!(this.f45359to == null && iEffectFormat.getInnerShadowEffect() == null) && ((innerShadow = this.f45359to) == null || !innerShadow.equals(iEffectFormat.getInnerShadowEffect()))) {
            return false;
        }
        if (!(this.f45352du == null && iEffectFormat.getOuterShadowEffect() == null) && ((outerShadow = this.f45352du) == null || !outerShadow.equals(iEffectFormat.getOuterShadowEffect()))) {
            return false;
        }
        if (!(this.f45354h4 == null && iEffectFormat.getPresetShadowEffect() == null) && ((presetShadow = this.f45354h4) == null || !presetShadow.equals(iEffectFormat.getPresetShadowEffect()))) {
            return false;
        }
        if (!(this.f45358m9 == null && iEffectFormat.getReflectionEffect() == null) && ((reflection = this.f45358m9) == null || !reflection.equals(iEffectFormat.getReflectionEffect()))) {
            return false;
        }
        if (this.f45353dy == null && iEffectFormat.getSoftEdgeEffect() == null) {
            return true;
        }
        SoftEdge softEdge = this.f45353dy;
        return softEdge != null && softEdge.equals(iEffectFormat.getSoftEdgeEffect());
    }

    /* JADX INFO: renamed from: fa */
    public final void m63071fa() {
        m63065k4(true);
    }

    /* JADX INFO: renamed from: h4 */
    public final IOuterShadow m63072h4() {
        return this.f45352du;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m63073jd() {
        return !m63085k4() || this.f45350c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63074k4(double d, boolean z) {
        this.f45356k4.setRadius(d);
        this.f45356k4.setGrow(z);
    }

    /* JADX INFO: renamed from: kk */
    public final IFillOverlay m63086kk() {
        return this.f45360x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final IPresetShadow m63087m9() {
        return this.f45354h4;
    }

    /* JADX INFO: renamed from: to */
    public final IGlow m63088to() {
        return this.f45357kk;
    }

    /* JADX INFO: renamed from: up */
    public final long m63089up() {
        long j = this.f45351ck & 4294967295L;
        Blur blur = this.f45356k4;
        long version = (j + ((blur != null ? blur.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        FillOverlay fillOverlay = this.f45360x1;
        long version2 = (version + ((fillOverlay != null ? fillOverlay.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        Glow glow = this.f45357kk;
        long version3 = (version2 + ((glow != null ? glow.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        InnerShadow innerShadow = this.f45359to;
        long version4 = (version3 + ((innerShadow != null ? innerShadow.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        OuterShadow outerShadow = this.f45352du;
        long version5 = (version4 + ((outerShadow != null ? outerShadow.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        PresetShadow presetShadow = this.f45354h4;
        long version6 = (version5 + ((presetShadow != null ? presetShadow.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        Reflection reflection = this.f45358m9;
        long version7 = (version6 + ((reflection != null ? reflection.getVersion() : 0L) & 4294967295L)) & 4294967295L;
        SoftEdge softEdge = this.f45353dy;
        return (version7 + ((softEdge != null ? softEdge.getVersion() : 0L) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final IBlur m63090x1() {
        return this.f45356k4;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m63091yj() {
        return this.f45356k4 == null && this.f45360x1 == null && this.f45357kk == null && this.f45359to == null && this.f45352du == null && this.f45354h4 == null && this.f45358m9 == null && this.f45353dy == null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63075k4(EffectFormat effectFormat) {
        boolean z;
        this.f45351ck = m63089up();
        m63066ks();
        if (effectFormat.getBlurEffect() != null) {
            if (this.f45356k4 == null) {
                this.f45356k4 = new Blur(this.f45355jd);
            }
            this.f45356k4.setRadius(effectFormat.getBlurEffect().getRadius());
            this.f45356k4.setGrow(effectFormat.getBlurEffect().getGrow());
        } else {
            this.f45356k4 = null;
        }
        if (effectFormat.getFillOverlayEffect() != null) {
            if (this.f45360x1 == null) {
                this.f45360x1 = new FillOverlay(this.f45355jd);
            }
            this.f45360x1.setBlend(effectFormat.getFillOverlayEffect().getBlend());
            ((FillFormat) this.f45360x1.getFillFormat()).m1456k4(effectFormat.getFillOverlayEffect().getFillFormat());
        } else {
            this.f45360x1 = null;
        }
        if (effectFormat.getGlowEffect() != null) {
            if (this.f45357kk == null) {
                this.f45357kk = new Glow(this.f45355jd);
            }
            this.f45357kk.setRadius(effectFormat.getGlowEffect().getRadius());
            ((ColorFormat) this.f45357kk.getColor()).m1079k4((ColorFormat) effectFormat.getGlowEffect().getColor());
        } else {
            this.f45357kk = null;
        }
        if (effectFormat.getInnerShadowEffect() != null) {
            if (this.f45359to == null) {
                this.f45359to = new InnerShadow(this.f45355jd);
            }
            this.f45359to.setBlurRadius(effectFormat.getInnerShadowEffect().getBlurRadius());
            this.f45359to.setDirection(effectFormat.getInnerShadowEffect().getDirection());
            this.f45359to.setDistance(effectFormat.getInnerShadowEffect().getDistance());
            ((ColorFormat) this.f45359to.getShadowColor()).m1079k4((ColorFormat) effectFormat.getInnerShadowEffect().getShadowColor());
        } else {
            this.f45359to = null;
        }
        if (effectFormat.getOuterShadowEffect() != null) {
            if (this.f45352du == null) {
                this.f45352du = new OuterShadow(this.f45355jd);
            }
            this.f45352du.setBlurRadius(effectFormat.getOuterShadowEffect().getBlurRadius());
            this.f45352du.setDirection(effectFormat.getOuterShadowEffect().getDirection());
            this.f45352du.setDistance(effectFormat.getOuterShadowEffect().getDistance());
            this.f45352du.setRectangleAlign(effectFormat.getOuterShadowEffect().getRectangleAlign());
            this.f45352du.setRotateShadowWithShape(effectFormat.getOuterShadowEffect().getRotateShadowWithShape());
            this.f45352du.setScaleHorizontal(effectFormat.getOuterShadowEffect().getScaleHorizontal());
            this.f45352du.setScaleVertical(effectFormat.getOuterShadowEffect().getScaleVertical());
            ((ColorFormat) this.f45352du.getShadowColor()).m1079k4((ColorFormat) effectFormat.getOuterShadowEffect().getShadowColor());
            this.f45352du.setSkewHorizontal(effectFormat.getOuterShadowEffect().getSkewHorizontal());
            this.f45352du.setSkewVertical(effectFormat.getOuterShadowEffect().getSkewVertical());
        } else {
            this.f45352du = null;
        }
        if (effectFormat.getPresetShadowEffect() != null) {
            if (this.f45354h4 == null) {
                this.f45354h4 = new PresetShadow(this.f45355jd);
            }
            this.f45354h4.setDirection(effectFormat.getPresetShadowEffect().getDirection());
            this.f45354h4.setDistance(effectFormat.getPresetShadowEffect().getDistance());
            this.f45354h4.setPreset(effectFormat.getPresetShadowEffect().getPreset());
            ((ColorFormat) this.f45354h4.getShadowColor()).m1079k4((ColorFormat) effectFormat.getPresetShadowEffect().getShadowColor());
        } else {
            this.f45354h4 = null;
        }
        if (effectFormat.getReflectionEffect() != null) {
            if (this.f45358m9 == null) {
                this.f45358m9 = new Reflection(this.f45355jd);
            }
            this.f45358m9.setBlurRadius(effectFormat.getReflectionEffect().getBlurRadius());
            this.f45358m9.setDirection(effectFormat.getReflectionEffect().getDirection());
            this.f45358m9.setDistance(effectFormat.getReflectionEffect().getDistance());
            this.f45358m9.setEndPosAlpha(effectFormat.getReflectionEffect().getEndPosAlpha());
            this.f45358m9.setEndReflectionOpacity(effectFormat.getReflectionEffect().getEndReflectionOpacity());
            this.f45358m9.setFadeDirection(effectFormat.getReflectionEffect().getFadeDirection());
            this.f45358m9.setRectangleAlign(effectFormat.getReflectionEffect().getRectangleAlign());
            this.f45358m9.setRotateShadowWithShape(effectFormat.getReflectionEffect().getRotateShadowWithShape());
            this.f45358m9.setScaleHorizontal(effectFormat.getReflectionEffect().getScaleHorizontal());
            this.f45358m9.setScaleVertical(effectFormat.getReflectionEffect().getScaleVertical());
            this.f45358m9.setSkewHorizontal(effectFormat.getReflectionEffect().getSkewHorizontal());
            this.f45358m9.setSkewVertical(effectFormat.getReflectionEffect().getSkewVertical());
            this.f45358m9.setStartPosAlpha(effectFormat.getReflectionEffect().getStartPosAlpha());
            this.f45358m9.setStartReflectionOpacity(effectFormat.getReflectionEffect().getStartReflectionOpacity());
        } else {
            this.f45358m9 = null;
        }
        if (effectFormat.getSoftEdgeEffect() != null) {
            if (this.f45353dy == null) {
                this.f45353dy = new SoftEdge(this.f45355jd);
            }
            this.f45353dy.setRadius(effectFormat.getSoftEdgeEffect().getRadius());
        } else {
            this.f45353dy = null;
        }
        if (!effectFormat.m1390to()) {
            z = false;
        } else if (!effectFormat.isNoEffects()) {
            return;
        } else {
            z = true;
        }
        this.f45350c5 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63076k4(IBlur iBlur) {
        Blur blur;
        if (iBlur == null && (blur = this.f45356k4) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (blur.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45356k4 = (Blur) iBlur;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63077k4(IEffectFormatEffectiveData iEffectFormatEffectiveData) {
        if (iEffectFormatEffectiveData.getBlurEffect() != null) {
            if (this.f45356k4 == null) {
                this.f45356k4 = new Blur(this.f45355jd);
            }
            this.f45356k4.setRadius(iEffectFormatEffectiveData.getBlurEffect().getRadius());
            this.f45356k4.setGrow(iEffectFormatEffectiveData.getBlurEffect().getGrow());
        } else {
            this.f45356k4 = null;
        }
        if (iEffectFormatEffectiveData.getFillOverlayEffect() != null) {
            if (this.f45360x1 == null) {
                this.f45360x1 = new FillOverlay(this.f45355jd);
            }
            this.f45360x1.setBlend(iEffectFormatEffectiveData.getFillOverlayEffect().getBlend());
            ((FillFormat) this.f45360x1.getFillFormat()).m1457k4(iEffectFormatEffectiveData.getFillOverlayEffect().getFillFormat());
        } else {
            this.f45360x1 = null;
        }
        if (iEffectFormatEffectiveData.getGlowEffect() != null) {
            if (this.f45357kk == null) {
                this.f45357kk = new Glow(this.f45355jd);
            }
            this.f45357kk.setRadius(iEffectFormatEffectiveData.getGlowEffect().getRadius());
            ((ColorFormat) this.f45357kk.getColor()).m1089x1(((C1241i6) iEffectFormatEffectiveData.getGlowEffect()).m7537x1().Clone());
        } else {
            this.f45357kk = null;
        }
        if (iEffectFormatEffectiveData.getInnerShadowEffect() != null) {
            if (this.f45359to == null) {
                this.f45359to = new InnerShadow(this.f45355jd);
            }
            this.f45359to.setBlurRadius(iEffectFormatEffectiveData.getInnerShadowEffect().getBlurRadius());
            this.f45359to.setDirection(iEffectFormatEffectiveData.getInnerShadowEffect().getDirection());
            this.f45359to.setDistance(iEffectFormatEffectiveData.getInnerShadowEffect().getDistance());
            ((ColorFormat) this.f45359to.getShadowColor()).m1089x1(((zg0) iEffectFormatEffectiveData.getInnerShadowEffect()).m74518x1().Clone());
        } else {
            this.f45359to = null;
        }
        if (iEffectFormatEffectiveData.getOuterShadowEffect() != null) {
            if (this.f45352du == null) {
                this.f45352du = new OuterShadow(this.f45355jd);
            }
            this.f45352du.setBlurRadius(iEffectFormatEffectiveData.getOuterShadowEffect().getBlurRadius());
            this.f45352du.setDirection(iEffectFormatEffectiveData.getOuterShadowEffect().getDirection());
            this.f45352du.setDistance(iEffectFormatEffectiveData.getOuterShadowEffect().getDistance());
            this.f45352du.setRectangleAlign(iEffectFormatEffectiveData.getOuterShadowEffect().getRectangleAlign());
            this.f45352du.setRotateShadowWithShape(iEffectFormatEffectiveData.getOuterShadowEffect().getRotateShadowWithShape());
            this.f45352du.setScaleHorizontal(iEffectFormatEffectiveData.getOuterShadowEffect().getScaleHorizontal());
            this.f45352du.setScaleVertical(iEffectFormatEffectiveData.getOuterShadowEffect().getScaleVertical());
            ((ColorFormat) this.f45352du.getShadowColor()).m1089x1(((vmd) iEffectFormatEffectiveData.getOuterShadowEffect()).m72367x1().Clone());
            this.f45352du.setSkewHorizontal(iEffectFormatEffectiveData.getOuterShadowEffect().getSkewHorizontal());
            this.f45352du.setSkewVertical(iEffectFormatEffectiveData.getOuterShadowEffect().getSkewVertical());
        } else {
            this.f45352du = null;
        }
        if (iEffectFormatEffectiveData.getPresetShadowEffect() != null) {
            if (this.f45354h4 == null) {
                this.f45354h4 = new PresetShadow(this.f45355jd);
            }
            this.f45354h4.setDirection(iEffectFormatEffectiveData.getPresetShadowEffect().getDirection());
            this.f45354h4.setDistance(iEffectFormatEffectiveData.getPresetShadowEffect().getDistance());
            this.f45354h4.setPreset(iEffectFormatEffectiveData.getPresetShadowEffect().getPreset());
            ((ColorFormat) this.f45354h4.getShadowColor()).m1089x1(((him) iEffectFormatEffectiveData.getPresetShadowEffect()).m7192x1().Clone());
        } else {
            this.f45354h4 = null;
        }
        if (iEffectFormatEffectiveData.getReflectionEffect() != null) {
            if (this.f45358m9 == null) {
                this.f45358m9 = new Reflection(this.f45355jd);
            }
            this.f45358m9.setBlurRadius(iEffectFormatEffectiveData.getReflectionEffect().getBlurRadius());
            this.f45358m9.setDirection(iEffectFormatEffectiveData.getReflectionEffect().getDirection());
            this.f45358m9.setDistance(iEffectFormatEffectiveData.getReflectionEffect().getDistance());
            this.f45358m9.setEndPosAlpha(iEffectFormatEffectiveData.getReflectionEffect().getEndPosAlpha());
            this.f45358m9.setEndReflectionOpacity(iEffectFormatEffectiveData.getReflectionEffect().getEndReflectionOpacity());
            this.f45358m9.setFadeDirection(iEffectFormatEffectiveData.getReflectionEffect().getFadeDirection());
            this.f45358m9.setRectangleAlign(iEffectFormatEffectiveData.getReflectionEffect().getRectangleAlign());
            this.f45358m9.setRotateShadowWithShape(iEffectFormatEffectiveData.getReflectionEffect().getRotateShadowWithShape());
            this.f45358m9.setScaleHorizontal(iEffectFormatEffectiveData.getReflectionEffect().getScaleHorizontal());
            this.f45358m9.setScaleVertical(iEffectFormatEffectiveData.getReflectionEffect().getScaleVertical());
            this.f45358m9.setSkewHorizontal(iEffectFormatEffectiveData.getReflectionEffect().getSkewHorizontal());
            this.f45358m9.setSkewVertical(iEffectFormatEffectiveData.getReflectionEffect().getSkewVertical());
            this.f45358m9.setStartPosAlpha(iEffectFormatEffectiveData.getReflectionEffect().getStartPosAlpha());
            this.f45358m9.setStartReflectionOpacity(iEffectFormatEffectiveData.getReflectionEffect().getStartReflectionOpacity());
        } else {
            this.f45358m9 = null;
        }
        if (iEffectFormatEffectiveData.getSoftEdgeEffect() != null) {
            if (this.f45353dy == null) {
                this.f45353dy = new SoftEdge(this.f45355jd);
            }
            this.f45353dy.setRadius(iEffectFormatEffectiveData.getSoftEdgeEffect().getRadius());
        } else {
            this.f45353dy = null;
        }
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63078k4(IFillOverlay iFillOverlay) {
        FillOverlay fillOverlay;
        if (iFillOverlay == null && (fillOverlay = this.f45360x1) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (fillOverlay.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45360x1 = (FillOverlay) iFillOverlay;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63079k4(IGlow iGlow) {
        Glow glow;
        if (iGlow == null && (glow = this.f45357kk) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (glow.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45357kk = (Glow) iGlow;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63080k4(IInnerShadow iInnerShadow) {
        InnerShadow innerShadow;
        if (iInnerShadow == null && (innerShadow = this.f45359to) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (innerShadow.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45359to = (InnerShadow) iInnerShadow;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63081k4(IOuterShadow iOuterShadow) {
        OuterShadow outerShadow;
        if (iOuterShadow == null && (outerShadow = this.f45352du) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (outerShadow.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45352du = (OuterShadow) iOuterShadow;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63082k4(IPresetShadow iPresetShadow) {
        PresetShadow presetShadow;
        if (iPresetShadow == null && (presetShadow = this.f45354h4) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (presetShadow.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45354h4 = (PresetShadow) iPresetShadow;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63083k4(IReflection iReflection) {
        Reflection reflection;
        if (iReflection == null && (reflection = this.f45358m9) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (reflection.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45358m9 = (Reflection) iReflection;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63084k4(ISoftEdge iSoftEdge) {
        SoftEdge softEdge;
        if (iSoftEdge == null && (softEdge = this.f45353dy) != null) {
            this.f45351ck = ((this.f45351ck & 4294967295L) + (softEdge.getVersion() & 4294967295L)) & 4294967295L;
        }
        this.f45353dy = (SoftEdge) iSoftEdge;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    private void m63065k4(boolean z) {
        this.f45356k4 = null;
        this.f45360x1 = null;
        this.f45357kk = null;
        this.f45359to = null;
        this.f45352du = null;
        this.f45354h4 = null;
        this.f45358m9 = null;
        this.f45353dy = null;
        this.f45350c5 = z;
        m63066ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63085k4() {
        return m63091yj();
    }
}
