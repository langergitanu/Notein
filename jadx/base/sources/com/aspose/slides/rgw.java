package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7291b2;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7568eg;
import com.aspose.slides.internal.p332p7.C7610ex;
import com.aspose.slides.internal.p332p7.C7770gj;
import com.aspose.slides.internal.p332p7.C8142kw;
import com.aspose.slides.internal.p332p7.C8171ld;
import com.aspose.slides.internal.p332p7.C8254mc;
import com.aspose.slides.internal.p332p7.C8264mh;
import com.aspose.slides.internal.p332p7.C8295mx;
import com.aspose.slides.internal.p332p7.C8495p8;
import com.aspose.slides.internal.p332p7.C8964ul;
import com.aspose.slides.internal.p332p7.C9250y1;
import com.aspose.slides.internal.p332p7.C9384zn;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class rgw {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48565k4 = new C7017h4("alphaBiLevel", "alphaCeiling", "alphaFloor", "alphaInv", "alphaMod", "alphaModFix", "alphaRepl", "biLevel", "blur", "clrChange", "clrRepl", "duotone", "fillOverlay", "grayscl", "hsl", "lum", "tint");

    /* JADX INFO: renamed from: k4 */
    public static void m70095k4(IImageTransformOperationCollection iImageTransformOperationCollection, IGenericEnumerable<C7394ca> iGenericEnumerable, gnb gnbVar) {
        IColorFormat iColorFormatM242x1;
        C7394ca c7394caM37155k4;
        if (iGenericEnumerable == null) {
            return;
        }
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f48565k4.m27428k4(next.m29539k4())) {
                    case 0:
                        iImageTransformOperationCollection.addAlphaBiLevelEffect(((C7770gj) next.m29542x1()).m32584k4());
                        break;
                    case 1:
                        iImageTransformOperationCollection.addAlphaCeilingEffect();
                        break;
                    case 2:
                        iImageTransformOperationCollection.addAlphaFloorEffect();
                        break;
                    case 3:
                        C8295mx c8295mx = (C8295mx) next.m29542x1();
                        iColorFormatM242x1 = ((AlphaInverse) iImageTransformOperationCollection.addAlphaInverseEffect()).m242x1();
                        c7394caM37155k4 = c8295mx.m37155k4();
                        C1246ib.m7610k4(iColorFormatM242x1, c7394caM37155k4);
                        break;
                    case 4:
                        iImageTransformOperationCollection.addAlphaModulateEffect();
                        break;
                    case 5:
                        iImageTransformOperationCollection.addAlphaModulateFixedEffect(((C9250y1) next.m29542x1()).m44763k4());
                        break;
                    case 6:
                        iImageTransformOperationCollection.addAlphaReplaceEffect(((C7568eg) next.m29542x1()).m31065k4());
                        break;
                    case 7:
                        iImageTransformOperationCollection.addBiLevelEffect(((C8495p8) next.m29542x1()).m38635k4());
                        break;
                    case 8:
                        C8142kw c8142kw = (C8142kw) next.m29542x1();
                        iImageTransformOperationCollection.addBlurEffect(c8142kw.m35756k4(), c8142kw.m35759x1());
                        break;
                    case 9:
                        C7291b2 c7291b2 = (C7291b2) next.m29542x1();
                        IColorChange iColorChangeAddColorChangeEffect = iImageTransformOperationCollection.addColorChangeEffect();
                        ((ColorChange) iColorChangeAddColorChangeEffect).m1058k4(c7291b2.m28690k4());
                        C1246ib.m7610k4(iColorChangeAddColorChangeEffect.getFromColor(), c7291b2.m28692x1().m29964k4());
                        iColorFormatM242x1 = iColorChangeAddColorChangeEffect.getToColor();
                        c7394caM37155k4 = c7291b2.m28691kk().m29964k4();
                        C1246ib.m7610k4(iColorFormatM242x1, c7394caM37155k4);
                        break;
                    case 10:
                        C8254mc c8254mc = (C8254mc) next.m29542x1();
                        iColorFormatM242x1 = iImageTransformOperationCollection.addColorReplaceEffect().getColor();
                        c7394caM37155k4 = c8254mc.m36790k4();
                        C1246ib.m7610k4(iColorFormatM242x1, c7394caM37155k4);
                        break;
                    case 11:
                        C9384zn c9384zn = (C9384zn) next.m29542x1();
                        IDuotone iDuotoneAddDuotoneEffect = iImageTransformOperationCollection.addDuotoneEffect();
                        C1246ib.m7610k4(iDuotoneAddDuotoneEffect.getColor1(), c9384zn.m45694k4().get_Item(0));
                        iColorFormatM242x1 = iDuotoneAddDuotoneEffect.getColor2();
                        c7394caM37155k4 = c9384zn.m45694k4().get_Item(1);
                        C1246ib.m7610k4(iColorFormatM242x1, c7394caM37155k4);
                        break;
                    case 12:
                        C8964ul c8964ul = (C8964ul) next.m29542x1();
                        IFillOverlay iFillOverlayAddFillOverlayEffect = iImageTransformOperationCollection.addFillOverlayEffect();
                        iFillOverlayAddFillOverlayEffect.setBlend(c8964ul.m42483k4());
                        C1169h1.m6958k4(iFillOverlayAddFillOverlayEffect.getFillFormat(), c8964ul.m42486x1(), gnbVar);
                        break;
                    case 13:
                        iImageTransformOperationCollection.addGrayScaleEffect();
                        break;
                    case 14:
                        C8264mh c8264mh = (C8264mh) next.m29542x1();
                        iImageTransformOperationCollection.addHSLEffect(c8264mh.m36941k4(), c8264mh.m36945x1(), c8264mh.m36943kk());
                        break;
                    case 15:
                        C7610ex c7610ex = (C7610ex) next.m29542x1();
                        iImageTransformOperationCollection.addLuminanceEffect(c7610ex.m31407k4(), c7610ex.m31409x1());
                        break;
                    case 16:
                        C8171ld c8171ld = (C8171ld) next.m29542x1();
                        iImageTransformOperationCollection.addTintEffect(c8171ld.m35991k4(), c8171ld.m35993x1());
                        break;
                    default:
                        throw new Exception(C14113y2.m67408k4("Unknown element \"", next.m29539k4(), "\""));
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70096k4(IImageTransformOperationCollection iImageTransformOperationCollection, C7394ca.k4 k4Var, u8s u8sVar) {
        String str;
        IColorFormat iColorFormatM242x1;
        C7394ca.k4 k4Var2;
        IGenericEnumerator<IImageTransformOperation> it = iImageTransformOperationCollection.iterator();
        while (it.hasNext()) {
            try {
                IImageTransformOperation next = it.next();
                if (C7019kk.m27469x1(next, IAlphaBiLevel.class)) {
                    ((C7770gj) k4Var.mo2788k4("alphaBiLevel").m29542x1()).m32585k4(((IAlphaBiLevel) next).getThreshold());
                } else {
                    if (C7019kk.m27469x1(next, IAlphaCeiling.class)) {
                        str = "alphaCeiling";
                    } else if (C7019kk.m27469x1(next, IAlphaFloor.class)) {
                        str = "alphaFloor";
                    } else {
                        if (C7019kk.m27469x1(next, IAlphaInverse.class)) {
                            final C8295mx c8295mx = (C8295mx) k4Var.mo2788k4("alphaInv").m29542x1();
                            iColorFormatM242x1 = ((AlphaInverse) ((IAlphaInverse) next)).m242x1();
                            k4Var2 = new C7394ca.k4() { // from class: com.aspose.slides.rgw.1
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c8295mx) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_AlphaInverseEffectElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c8295mx.m37156k4(str2);
                                }
                            };
                        } else if (C7019kk.m27469x1(next, IAlphaModulate.class)) {
                            str = "alphaMod";
                        } else if (C7019kk.m27469x1(next, IAlphaModulateFixed.class)) {
                            ((C9250y1) k4Var.mo2788k4("alphaModFix").m29542x1()).m44764k4(((IAlphaModulateFixed) next).getAmount());
                        } else if (C7019kk.m27469x1(next, IAlphaReplace.class)) {
                            ((C7568eg) k4Var.mo2788k4("alphaRepl").m29542x1()).m31066k4(((AlphaReplace) ((IAlphaReplace) next)).m248x1());
                        } else if (C7019kk.m27469x1(next, IBiLevel.class)) {
                            ((C8495p8) k4Var.mo2788k4("biLevel").m29542x1()).m38636k4(((BiLevel) ((IBiLevel) next)).m426to());
                        } else if (C7019kk.m27469x1(next, IBlur.class)) {
                            C8142kw c8142kw = (C8142kw) k4Var.mo2788k4("blur").m29542x1();
                            IBlur iBlur = (IBlur) next;
                            c8142kw.m35757k4(iBlur.getRadius());
                            c8142kw.m35758k4(iBlur.getGrow());
                        } else if (C7019kk.m27469x1(next, IColorChange.class)) {
                            final C7291b2 c7291b2 = (C7291b2) k4Var.mo2788k4("clrChange").m29542x1();
                            IColorChange iColorChange = (IColorChange) next;
                            c7291b2.m28689k4(((ColorChange) iColorChange).m1059to());
                            C1246ib.m7609k4(iColorChange.getFromColor(), new C7394ca.k4() { // from class: com.aspose.slides.rgw.2
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c7291b2.m28692x1()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c7291b2.m28692x1().m29965k4(str2);
                                }
                            });
                            iColorFormatM242x1 = iColorChange.getToColor();
                            k4Var2 = new C7394ca.k4() { // from class: com.aspose.slides.rgw.3
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c7291b2.m28691kk()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c7291b2.m28691kk().m29965k4(str2);
                                }
                            };
                        } else if (C7019kk.m27469x1(next, IColorReplace.class)) {
                            final C8254mc c8254mc = (C8254mc) k4Var.mo2788k4("clrRepl").m29542x1();
                            iColorFormatM242x1 = ((IColorReplace) next).getColor();
                            k4Var2 = new C7394ca.k4() { // from class: com.aspose.slides.rgw.4
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c8254mc) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ColorReplaceEffectElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c8254mc.m36791k4(str2);
                                }
                            };
                        } else if (C7019kk.m27469x1(next, IDuotone.class)) {
                            final C9384zn c9384zn = (C9384zn) k4Var.mo2788k4("duotone").m29542x1();
                            IDuotone iDuotone = (IDuotone) next;
                            C1246ib.m7609k4(iDuotone.getColor1(), new C7394ca.k4() { // from class: com.aspose.slides.rgw.5
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c9384zn) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_DuotoneEffectElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c9384zn.m45695k4(str2);
                                }
                            });
                            iColorFormatM242x1 = iDuotone.getColor2();
                            k4Var2 = new C7394ca.k4() { // from class: com.aspose.slides.rgw.6
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c9384zn) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_DuotoneEffectElementData.AddColor(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c9384zn.m45695k4(str2);
                                }
                            };
                        } else if (C7019kk.m27469x1(next, IFillOverlay.class)) {
                            final C8964ul c8964ul = (C8964ul) k4Var.mo2788k4("fillOverlay").m29542x1();
                            IFillOverlay iFillOverlay = (IFillOverlay) next;
                            c8964ul.m42485k4(iFillOverlay.getBlend());
                            C1169h1.m6956k4(iFillOverlay.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.rgw.7
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c8964ul) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_FillOverlayEffectElementData.AddFillProperties(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str2) {
                                    return c8964ul.m42484k4(str2);
                                }
                            }, u8sVar);
                        } else if (C7019kk.m27469x1(next, IGrayScale.class)) {
                            str = "grayscl";
                        } else if (C7019kk.m27469x1(next, IHSL.class)) {
                            C8264mh c8264mh = (C8264mh) k4Var.mo2788k4("hsl").m29542x1();
                            IHSL ihsl = (IHSL) next;
                            c8264mh.m36942k4(((HSL) ihsl).m1659to());
                            c8264mh.m36946x1(((HSL) ihsl).m1657du());
                            c8264mh.m36944kk(((HSL) ihsl).m1658h4());
                        } else if (C7019kk.m27469x1(next, ILuminance.class)) {
                            C7610ex c7610ex = (C7610ex) k4Var.mo2788k4("lum").m29542x1();
                            ILuminance iLuminance = (ILuminance) next;
                            c7610ex.m31408k4(((Luminance) iLuminance).m1926to());
                            c7610ex.m31410x1(((Luminance) iLuminance).m1925du());
                        } else {
                            if (!C7019kk.m27469x1(next, ITint.class)) {
                                throw new Exception();
                            }
                            C8171ld c8171ld = (C8171ld) k4Var.mo2788k4("tint").m29542x1();
                            ITint iTint = (ITint) next;
                            c8171ld.m35992k4(((Tint) iTint).m3024to());
                            c8171ld.m35994x1(((Tint) iTint).m3023du());
                        }
                        C1246ib.m7609k4(iColorFormatM242x1, k4Var2);
                    }
                    k4Var.mo2788k4(str);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }
}
