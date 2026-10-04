package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectFormat extends PVIObject implements IEffectFormat {

    /* JADX INFO: renamed from: x1 */
    static final AbstractC4682du<EffectFormat, C14754wx, C14754wx> f2148x1 = new AbstractC4682du<EffectFormat, C14754wx, C14754wx>() { // from class: com.aspose.slides.EffectFormat.19
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.EffectFormatEffectiveData.CreateEmpty(Aspose.Slides.EffectFormat,Aspose.Slides.EffectFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C14754wx mo445k4(EffectFormat effectFormat, C14754wx c14754wx) {
            return C14754wx.m72945k4(effectFormat, c14754wx);
        }
    };

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC14380ra> f2149k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14380ra f2150kk;

    /* JADX INFO: renamed from: to */
    private C14754wx f2151to;

    public EffectFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2149k4 = new AbstractC7018k4<AbstractC14380ra>() { // from class: com.aspose.slides.EffectFormat.1
            {
                EffectFormat.this.f2150kk = new AbstractC14380ra() { // from class: com.aspose.slides.EffectFormat.1.1
                    @Override // com.aspose.slides.AbstractC14380ra
                    /* JADX INFO: renamed from: k4 */
                    public void mo1393k4() {
                        for (AbstractC14380ra abstractC14380ra : ((AbstractC7018k4) C03461.this).f19081x1) {
                            if (abstractC14380ra != null) {
                                abstractC14380ra.mo1393k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dy */
    public void m1381dy() {
        AbstractC14380ra abstractC14380ra = this.f2150kk;
        if (abstractC14380ra == null || this.f2149k4.m27430k4()) {
            return;
        }
        abstractC14380ra.mo1393k4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C13657ir(getParent_Immediate());
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableBlurEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63090x1() == null) {
            return;
        }
        ((ImageTransformOperation) ((Blur) m1391x1().m63090x1())).f2489k4.mo27429k4(new smn() { // from class: com.aspose.slides.EffectFormat.10
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63076k4((IBlur) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableFillOverlayEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63086kk() == null) {
            return;
        }
        ((ImageTransformOperation) ((FillOverlay) m1391x1().m63086kk())).f2489k4.mo27429k4(new smn() { // from class: com.aspose.slides.EffectFormat.11
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63078k4((IFillOverlay) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableGlowEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63088to() == null) {
            return;
        }
        ((Glow) m1391x1().m63088to()).f2400k4.mo27429k4(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.13
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1156gp
            /* JADX INFO: renamed from: k4 */
            public void mo1395k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63079k4((IGlow) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableInnerShadowEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63069du() == null) {
            return;
        }
        ((InnerShadow) m1391x1().m63069du()).f2560k4.mo27429k4(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.14
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1156gp
            /* JADX INFO: renamed from: k4 */
            public void mo1395k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63080k4((IInnerShadow) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableOuterShadowEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63072h4() == null) {
            return;
        }
        ((OuterShadow) m1391x1().m63072h4()).f2897k4.mo27429k4(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.15
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1156gp
            /* JADX INFO: renamed from: k4 */
            public void mo1395k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63081k4((IOuterShadow) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disablePresetShadowEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63087m9() == null) {
            return;
        }
        ((PresetShadow) m1391x1().m63087m9()).f3172k4.mo27429k4(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.16
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1156gp
            /* JADX INFO: renamed from: k4 */
            public void mo1395k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63082k4((IPresetShadow) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableReflectionEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63070dy() == null) {
            return;
        }
        ((Reflection) m1391x1().m63070dy()).f3211k4.mo27429k4(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.17
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1156gp
            /* JADX INFO: renamed from: k4 */
            public void mo1395k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63083k4((IReflection) null);
        m1381dy();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void disableSoftEdgeEffect() {
        m2145uz();
        if (!m2138ix() || m1391x1().m63067c5() == null) {
            return;
        }
        ((SoftEdge) m1391x1().m63067c5()).f3449k4.mo27429k4(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.18
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
            }

            @Override // com.aspose.slides.AbstractC1156gp
            /* JADX INFO: renamed from: k4 */
            public void mo1395k4() {
                EffectFormat.this.m1381dy();
            }
        });
        m1391x1().m63084k4((ISoftEdge) null);
        m1381dy();
    }

    /* JADX INFO: renamed from: du */
    public final void m1385du() {
        m2145uz();
        m1391x1().m63071fa();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enableFillOverlayEffect() {
        m2145uz();
        if (m1391x1().m63086kk() == null) {
            FillOverlay fillOverlay = new FillOverlay(this);
            ((ImageTransformOperation) fillOverlay).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.EffectFormat.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.smn
                /* JADX INFO: renamed from: k4 */
                public void mo1394k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63078k4(fillOverlay);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enableGlowEffect() {
        m2145uz();
        if (m1391x1().m63088to() == null) {
            Glow glow = new Glow(this);
            glow.f2400k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63079k4(glow);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enableInnerShadowEffect() {
        m2145uz();
        if (m1391x1().m63069du() == null) {
            InnerShadow innerShadow = new InnerShadow(this);
            innerShadow.f2560k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63080k4(innerShadow);
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enableOuterShadowEffect() {
        m2145uz();
        if (m1391x1().m63072h4() == null) {
            OuterShadow outerShadow = new OuterShadow(this);
            outerShadow.f2897k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.6
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63081k4(outerShadow);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enablePresetShadowEffect() {
        m2145uz();
        if (m1391x1().m63087m9() == null) {
            PresetShadow presetShadow = new PresetShadow(this);
            presetShadow.f3172k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.7
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63082k4(presetShadow);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enableReflectionEffect() {
        m2145uz();
        if (m1391x1().m63070dy() == null) {
            Reflection reflection = new Reflection(this);
            reflection.f3211k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.8
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63083k4(reflection);
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void enableSoftEdgeEffect() {
        m2145uz();
        if (m1391x1().m63067c5() == null) {
            SoftEdge softEdge = new SoftEdge(this);
            softEdge.f3449k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.9
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.AbstractC1156gp
                /* JADX INFO: renamed from: k4 */
                public void mo1395k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63084k4(softEdge);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IBlur getBlurEffect() {
        if (m2138ix()) {
            return m1391x1().m63090x1();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IEffectFormatEffectiveData getEffective() {
        return m1389m9();
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IFillOverlay getFillOverlayEffect() {
        if (m2138ix()) {
            return m1391x1().m63086kk();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IGlow getGlowEffect() {
        if (m2138ix()) {
            return m1391x1().m63088to();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IInnerShadow getInnerShadowEffect() {
        if (m2138ix()) {
            return m1391x1().m63069du();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IOuterShadow getOuterShadowEffect() {
        if (m2138ix()) {
            return m1391x1().m63072h4();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IPresetShadow getPresetShadowEffect() {
        if (m2138ix()) {
            return m1391x1().m63087m9();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final IReflection getReflectionEffect() {
        if (m2138ix()) {
            return m1391x1().m63070dy();
        }
        return null;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final ISoftEdge getSoftEdgeEffect() {
        if (m2138ix()) {
            return m1391x1().m63067c5();
        }
        return null;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1391x1().m63089up();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1386h4() {
        if (m2138ix() && m1390to()) {
            m2145uz();
            m1391x1().m63068ck();
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final boolean isNoEffects() {
        return !m2138ix() || m1391x1().m63085k4();
    }

    /* JADX INFO: renamed from: m9 */
    public final C14754wx m1389m9() {
        C14754wx[] c14754wxArr = {this.f2151to};
        C14754wx c14754wx = (C14754wx) AbstractC0858ck.m4598k4(C14754wx.class, c14754wxArr, this, f2148x1);
        C14754wx c14754wx2 = c14754wxArr[0];
        this.f2151to = c14754wx2;
        if (c14754wx2 != null) {
            c14754wx2.m4604k4(C14754wx.class);
        }
        return c14754wx;
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setBlurEffect(double d, boolean z) {
        m2145uz();
        if (m1391x1().m63090x1() == null) {
            Blur blur = new Blur(d, z, this);
            ((ImageTransformOperation) blur).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.EffectFormat.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                }

                @Override // com.aspose.slides.smn
                /* JADX INFO: renamed from: k4 */
                public void mo1394k4() {
                    EffectFormat.this.m1381dy();
                }
            });
            m1391x1().m63076k4(blur);
        } else {
            m1391x1().m63074k4(d, z);
        }
        m1381dy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IEffectFormat
    public final void setFillOverlayEffect(IFillOverlay iFillOverlay) {
        m2141k4((IFillOverlay) null, iFillOverlay);
        if (m2138ix()) {
            FillOverlay fillOverlay = (FillOverlay) iFillOverlay;
            if (iFillOverlay != 0) {
                if (((InterfaceC14397rj) iFillOverlay).getParent_Immediate() != null) {
                    fillOverlay = (FillOverlay) ((ImageTransformOperation) iFillOverlay).mo241kk();
                }
                fillOverlay.mo240k4((InterfaceC14397rj) this);
                ((ImageTransformOperation) fillOverlay).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.EffectFormat.20
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.smn
                    /* JADX INFO: renamed from: k4 */
                    public void mo1394k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63078k4(fillOverlay);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setGlowEffect(IGlow iGlow) {
        m2141k4((IGlow) null, iGlow);
        if (m2138ix()) {
            Glow glowM1601x1 = (Glow) iGlow;
            if (iGlow != null) {
                if (((InterfaceC14397rj) iGlow).getParent_Immediate() != null) {
                    glowM1601x1 = ((Glow) iGlow).m1601x1();
                }
                glowM1601x1.m1600k4(this);
                glowM1601x1.f2400k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.21
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1156gp
                    /* JADX INFO: renamed from: k4 */
                    public void mo1395k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63079k4(glowM1601x1);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setInnerShadowEffect(IInnerShadow iInnerShadow) {
        m2141k4((IInnerShadow) null, iInnerShadow);
        if (m2138ix()) {
            InnerShadow innerShadowM1839x1 = (InnerShadow) iInnerShadow;
            if (iInnerShadow != null) {
                if (((InterfaceC14397rj) iInnerShadow).getParent_Immediate() != null) {
                    innerShadowM1839x1 = ((InnerShadow) iInnerShadow).m1839x1();
                }
                innerShadowM1839x1.m1838k4(this);
                innerShadowM1839x1.f2560k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.22
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1156gp
                    /* JADX INFO: renamed from: k4 */
                    public void mo1395k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63080k4(innerShadowM1839x1);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setOuterShadowEffect(IOuterShadow iOuterShadow) {
        m2141k4((IOuterShadow) null, iOuterShadow);
        if (m2138ix()) {
            OuterShadow outerShadowM2099x1 = (OuterShadow) iOuterShadow;
            if (iOuterShadow != null) {
                if (((InterfaceC14397rj) iOuterShadow).getParent_Immediate() != null) {
                    outerShadowM2099x1 = ((OuterShadow) iOuterShadow).m2099x1();
                }
                outerShadowM2099x1.m2098k4(this);
                outerShadowM2099x1.f2897k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.23
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1156gp
                    /* JADX INFO: renamed from: k4 */
                    public void mo1395k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63081k4(outerShadowM2099x1);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setPresetShadowEffect(IPresetShadow iPresetShadow) {
        m2141k4((IPresetShadow) null, iPresetShadow);
        if (m2138ix()) {
            PresetShadow presetShadowM2456x1 = (PresetShadow) iPresetShadow;
            if (iPresetShadow != null) {
                if (((InterfaceC14397rj) iPresetShadow).getParent_Immediate() != null) {
                    presetShadowM2456x1 = ((PresetShadow) iPresetShadow).m2456x1();
                }
                presetShadowM2456x1.m2455k4(this);
                presetShadowM2456x1.f3172k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.24
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1156gp
                    /* JADX INFO: renamed from: k4 */
                    public void mo1395k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63082k4(presetShadowM2456x1);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setReflectionEffect(IReflection iReflection) {
        m2141k4((IReflection) null, iReflection);
        if (m2138ix()) {
            Reflection reflectionM2472x1 = (Reflection) iReflection;
            if (iReflection != null) {
                if (((InterfaceC14397rj) iReflection).getParent_Immediate() != null) {
                    reflectionM2472x1 = ((Reflection) iReflection).m2472x1();
                }
                reflectionM2472x1.m2471k4(this);
                reflectionM2472x1.f3211k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.25
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1156gp
                    /* JADX INFO: renamed from: k4 */
                    public void mo1395k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63083k4(reflectionM2472x1);
            m1381dy();
        }
    }

    @Override // com.aspose.slides.IEffectFormat
    public final void setSoftEdgeEffect(ISoftEdge iSoftEdge) {
        m2141k4((ISoftEdge) null, iSoftEdge);
        if (m2138ix()) {
            SoftEdge softEdgeM2829x1 = (SoftEdge) iSoftEdge;
            if (iSoftEdge != null) {
                if (((InterfaceC14397rj) iSoftEdge).getParent_Immediate() != null) {
                    softEdgeM2829x1 = ((SoftEdge) iSoftEdge).m2829x1();
                }
                softEdgeM2829x1.m2828k4(this);
                softEdgeM2829x1.f3449k4.mo27432x1(new AbstractC1156gp() { // from class: com.aspose.slides.EffectFormat.26
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.AbstractC1156gp
                    /* JADX INFO: renamed from: k4 */
                    public void mo1395k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63084k4(softEdgeM2829x1);
            m1381dy();
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m1390to() {
        return m2138ix() && m1391x1().m63073jd();
    }

    /* JADX INFO: renamed from: x1 */
    public final C13657ir m1391x1() {
        return (C13657ir) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1387k4(IEffectFormat iEffectFormat) {
        if (m1390to() || iEffectFormat == null || ((EffectFormat) iEffectFormat).m1390to()) {
            m2145uz();
            m1391x1().m63075k4((EffectFormat) iEffectFormat);
            m1381dy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IEffectFormat
    public final void setBlurEffect(IBlur iBlur) {
        m2141k4((IBlur) null, iBlur);
        if (m2138ix()) {
            Blur blur = (Blur) iBlur;
            if (iBlur != 0) {
                if (((InterfaceC14397rj) iBlur).getParent_Immediate() != null) {
                    blur = (Blur) ((ImageTransformOperation) iBlur).mo241kk();
                }
                blur.mo240k4((InterfaceC14397rj) this);
                ((ImageTransformOperation) blur).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.EffectFormat.12
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Slides.EffectFormat.OnEffectFormatChanged()";
                    }

                    @Override // com.aspose.slides.smn
                    /* JADX INFO: renamed from: k4 */
                    public void mo1394k4() {
                        EffectFormat.this.m1381dy();
                    }
                });
            }
            m1391x1().m63076k4(blur);
            m1381dy();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1388k4(IEffectFormatEffectiveData iEffectFormatEffectiveData) {
        m2145uz();
        m1391x1().m63077k4(iEffectFormatEffectiveData);
        m1381dy();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m1383k4(EffectFormat effectFormat) {
        if (effectFormat == null) {
            return false;
        }
        if (effectFormat.m2138ix()) {
            return effectFormat.m1391x1().m63091yj();
        }
        return true;
    }
}
