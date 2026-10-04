package com.aspose.slides;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class fz8 extends AbstractC0858ck<TextStyle, fz8> implements ITextStyleEffectiveData {

    /* JADX INFO: renamed from: kk */
    private fqc[] f5153kk;

    /* JADX INFO: renamed from: to */
    private static final fz8 f5152to = m6363m9();

    /* JADX INFO: renamed from: du */
    private static final fz8 f5149du = m6358dy();

    /* JADX INFO: renamed from: h4 */
    private static final fz8 f5150h4 = m6357c5();

    /* JADX INFO: renamed from: m9 */
    private static final fz8 f5151m9 = m6359jd();

    public fz8(TextStyle textStyle) {
        super(textStyle);
        this.f5153kk = new fqc[10];
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = this.f5153kk;
            if (i >= fqcVarArr.length) {
                return;
            }
            fqcVarArr[i] = fqc.m6264dy();
            i++;
        }
    }

    /* JADX INFO: renamed from: c5 */
    private static fz8 m6357c5() {
        fz8 fz8Var = new fz8(null);
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = fz8Var.f5153kk;
            if (i >= fqcVarArr.length) {
                return fz8Var;
            }
            fqcVarArr[i] = fqc.m6263c5();
            i++;
        }
    }

    /* JADX INFO: renamed from: dy */
    private static fz8 m6358dy() {
        fz8 fz8Var = new fz8(null);
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = fz8Var.f5153kk;
            if (i >= fqcVarArr.length) {
                return fz8Var;
            }
            fqcVarArr[i] = fqc.m6264dy();
            i++;
        }
    }

    /* JADX INFO: renamed from: jd */
    private static fz8 m6359jd() {
        fz8 fz8Var = new fz8(null);
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = fz8Var.f5153kk;
            if (i >= fqcVarArr.length) {
                return fz8Var;
            }
            fqcVarArr[i] = fqc.m6265jd();
            fz8Var.f5153kk[i].f5112up = (i > 0 ? i - 1 : 0) * 36.0f;
            i++;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private static fz8 m6363m9() {
        fz8 fz8Var = new fz8(null);
        fqc fqcVar = fqc.f5096u4;
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = fz8Var.f5153kk;
            if (i >= fqcVarArr.length) {
                return fz8Var;
            }
            fqcVarArr[i] = fqcVar;
            i++;
        }
    }

    @Override // com.aspose.slides.ITextStyleEffectiveData
    public final IParagraphFormatEffectiveData getDefaultParagraphFormat() {
        return this.f5153kk[0];
    }

    @Override // com.aspose.slides.ITextStyleEffectiveData
    public final IParagraphFormatEffectiveData getLevel(int i) {
        return m6365k4(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final fz8 m6364h4() {
        return f5149du;
    }

    /* JADX INFO: renamed from: k4 */
    public final fqc m6365k4(int i) {
        if (i < 0 || i > 8) {
            throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
        }
        return this.f5153kk[i + 1];
    }

    public fz8(TextStyle textStyle, fz8 fz8Var) {
        super(textStyle);
        this.f5153kk = new fqc[10];
        int i = 0;
        if (fz8Var != null) {
            while (true) {
                fqc[] fqcVarArr = this.f5153kk;
                if (i >= fqcVarArr.length) {
                    return;
                }
                fqcVarArr[i] = fz8Var.m6360k4(i, this);
                i++;
            }
        } else {
            while (true) {
                fqc[] fqcVarArr2 = this.f5153kk;
                if (i >= fqcVarArr2.length) {
                    return;
                }
                fqcVarArr2[i] = fqc.m6264dy();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private fqc m6360k4(int i, fz8 fz8Var) {
        return this.f5153kk[i] != fqc.m6264dy() ? new fqc(fz8Var, this.f5153kk[i], 0) : fqc.m6264dy();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fz8 m6361k4(TextStyle textStyle) {
        IPresentation presentation;
        fz8 fz8VarM2980dy;
        ITextStyle notesStyle;
        IPresentationComponent parent_IPresentationComponent = textStyle.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, TextFrame.class)) {
            TextFrame textFrame = (TextFrame) parent_IPresentationComponent;
            if (C7019kk.m27469x1(textFrame.getParent_Immediate(), GeometryShape.class)) {
                GeometryShape geometryShape = (GeometryShape) textFrame.getParent_Immediate();
                GeometryShape geometryShape2 = (GeometryShape) C7019kk.m27452k4((Object) geometryShape.getBasePlaceholder(), GeometryShape.class);
                if (geometryShape2 == null) {
                    fz8VarM2980dy = null;
                    if (fz8VarM2980dy == null) {
                        BaseSlide baseSlide = (BaseSlide) textFrame.getSlide();
                        MasterSlide masterSlideM409yj = baseSlide.m409yj();
                        if (masterSlideM409yj != null) {
                            IPlaceholder placeholder = geometryShape.getPlaceholder();
                            if (placeholder != null) {
                                int iIntValue = TextFrame.f3512du.m13012x1(Byte.valueOf(placeholder.getType())).intValue();
                                if (iIntValue == 1) {
                                    notesStyle = masterSlideM409yj.getTitleStyle();
                                } else if (iIntValue == 2) {
                                    notesStyle = masterSlideM409yj.getBodyStyle();
                                } else if (iIntValue == 3) {
                                    notesStyle = masterSlideM409yj.getOtherStyle();
                                }
                                fz8VarM2980dy = ((TextStyle) notesStyle).m2980dy();
                            }
                        } else if (C7019kk.m27469x1(baseSlide, MasterNotesSlide.class)) {
                            MasterNotesSlide masterNotesSlide = (MasterNotesSlide) baseSlide;
                            if (masterNotesSlide.getNotesStyle() != null) {
                                notesStyle = masterNotesSlide.getNotesStyle();
                                fz8VarM2980dy = ((TextStyle) notesStyle).m2980dy();
                            }
                        }
                    }
                } else {
                    TextFrame textFrameM288x1 = C7019kk.m27469x1(geometryShape2, AutoShape.class) ? ((AutoShape) geometryShape2).m288x1() : C7019kk.m27469x1(geometryShape2, SmartArtShape.class) ? ((SmartArtShape) geometryShape2).m2820kk() : null;
                    if (textFrameM288x1 != null) {
                        fz8VarM2980dy = textFrameM288x1.f3519k4.m2959m9().m2980dy();
                    }
                    if (fz8VarM2980dy == null) {
                    }
                }
            } else {
                if (C7019kk.m27469x1(textFrame.getParent_Immediate(), Cell.class)) {
                    MasterSlide masterSlideM409yj2 = ((BaseSlide) textFrame.getSlide()).m409yj();
                    if (masterSlideM409yj2 != null) {
                        fz8VarM2980dy = ((TextStyle) masterSlideM409yj2.getOtherStyle()).m2980dy();
                    }
                } else if (C7019kk.m27469x1(textFrame.getParent_Immediate(), IOverridableText.class)) {
                    ((BaseSlide) ((Chart) ((IOverridableText) textFrame.getParent_Immediate()).getChart()).getSlide()).m409yj();
                }
                fz8VarM2980dy = null;
            }
            if (fz8VarM2980dy != null) {
                return fz8VarM2980dy;
            }
            if (kke.m63959k4(Chart.class, textFrame, new Chart[]{null})) {
                return f5150h4;
            }
            if (kke.m63959k4(MasterNotesSlide.class, textFrame, new MasterNotesSlide[]{null})) {
                return f5151m9;
            }
            presentation = textFrame.getPresentation();
        } else {
            if (!C7019kk.m27469x1(parent_IPresentationComponent, IFormattedTextContainer.class)) {
                if (C7019kk.m27469x1(parent_IPresentationComponent, MasterSlide.class)) {
                    return f5152to;
                }
                if (C7019kk.m27469x1(parent_IPresentationComponent, MasterNotesSlide.class)) {
                    return f5151m9;
                }
                if (C7019kk.m27469x1(parent_IPresentationComponent, Presentation.class)) {
                    return f5152to;
                }
                throw new NotImplementedException();
            }
            ((BaseSlide) ((Chart) ((IFormattedTextContainer) parent_IPresentationComponent).getChart()).getSlide()).m409yj();
            presentation = parent_IPresentationComponent.getPresentation();
        }
        return ((Presentation) presentation).f3085kk.m2980dy();
    }

    /* JADX INFO: renamed from: k4 */
    public static fz8 m6362k4(TextStyle textStyle, fz8 fz8Var) {
        return new fz8(textStyle, fz8Var);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo6273k4(IBaseSlide iBaseSlide) {
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = this.f5153kk;
            if (i >= fqcVarArr.length) {
                return;
            }
            fqcVarArr[i].mo6273k4(iBaseSlide);
            i++;
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = this.f5153kk;
            if (i >= fqcVarArr.length) {
                return;
            }
            fqcVarArr[i].mo4833k4(iBaseSlide, dm6Var);
            i++;
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, TextStyle textStyle) {
        fz8 fz8VarM6364h4 = interfaceC14672vc == null ? m6364h4() : (fz8) interfaceC14672vc;
        for (int i = 0; i < this.f5153kk.length; i++) {
            ParagraphFormat paragraphFormat = textStyle.m2990to()[i];
            fqc fqcVar = fz8VarM6364h4.f5153kk[i];
            this.f5153kk[i] = paragraphFormat != null ? !C14067j2.m66729x1(fqcVar, fqc.m6264dy()) ? new fqc(this, fqcVar, paragraphFormat) : new fqc(this, paragraphFormat) : !C14067j2.m66729x1(fqcVar, fqc.m6264dy()) ? new fqc(this, fqcVar, 0) : fqc.m6264dy();
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(fz8 fz8Var) {
        if (C14067j2.m66729x1(this, fz8Var)) {
            return true;
        }
        if (fz8Var == null) {
            return false;
        }
        int i = 0;
        while (true) {
            fqc[] fqcVarArr = this.f5153kk;
            if (i >= fqcVarArr.length) {
                return true;
            }
            if (!C3085sv.m13090k4(fqcVarArr[i], fz8Var.f5153kk[i])) {
                return false;
            }
            i++;
        }
    }
}
