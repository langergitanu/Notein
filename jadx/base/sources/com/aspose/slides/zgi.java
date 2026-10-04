package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class zgi {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        r21 = r2;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0209 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:4:0x0010, B:6:0x0016, B:71:0x0187, B:73:0x018d, B:76:0x0194, B:85:0x01aa, B:91:0x01bf, B:93:0x01c5, B:96:0x01f3, B:98:0x01f6, B:100:0x01fd, B:101:0x0201, B:103:0x0209, B:89:0x01b2, B:90:0x01b9, B:83:0x01a4, B:106:0x0247, B:108:0x024d, B:109:0x0250, B:8:0x004a, B:10:0x0050, B:12:0x0062, B:15:0x0070, B:17:0x007a, B:19:0x008a, B:24:0x00a8, B:26:0x00b4, B:29:0x00c4, B:31:0x00ce, B:34:0x00e0, B:36:0x00ec, B:41:0x0101, B:43:0x010d, B:45:0x011e, B:47:0x012a, B:49:0x0136, B:51:0x0140, B:53:0x014a, B:66:0x0169, B:67:0x0173), top: B:118:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:4:0x0010, B:6:0x0016, B:71:0x0187, B:73:0x018d, B:76:0x0194, B:85:0x01aa, B:91:0x01bf, B:93:0x01c5, B:96:0x01f3, B:98:0x01f6, B:100:0x01fd, B:101:0x0201, B:103:0x0209, B:89:0x01b2, B:90:0x01b9, B:83:0x01a4, B:106:0x0247, B:108:0x024d, B:109:0x0250, B:8:0x004a, B:10:0x0050, B:12:0x0062, B:15:0x0070, B:17:0x007a, B:19:0x008a, B:24:0x00a8, B:26:0x00b4, B:29:0x00c4, B:31:0x00ce, B:34:0x00e0, B:36:0x00ec, B:41:0x0101, B:43:0x010d, B:45:0x011e, B:47:0x012a, B:49:0x0136, B:51:0x0140, B:53:0x014a, B:66:0x0169, B:67:0x0173), top: B:118:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m74519k4(ISequence iSequence, Dictionary<IShape, kte<String, String, Float, Float, String, String, Integer>> dictionary, int i) {
        int i2;
        Class<SetEffect> cls;
        Class<ColorEffect> cls2;
        float fM67481k4;
        Class cls3;
        Class<SetEffect> cls4 = SetEffect.class;
        Class<ColorEffect> cls5 = ColorEffect.class;
        IGenericEnumerator<IEffect> it = iSequence.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            i2 = i;
            try {
                if (!it.hasNext()) {
                    break;
                }
                IEffect next = it.next();
                IShape targetShape = next.getTargetShape();
                int presetClassType = next.getPresetClassType();
                int type = next.getType();
                int subtype = next.getSubtype();
                int triggerType = next.getTiming().getTriggerType();
                float triggerDelayTime = next.getTiming().getTriggerDelayTime();
                IGenericEnumerator<IBehavior> it2 = next.getBehaviors().iterator();
                IColorFormat to = null;
                String strM74521k4 = null;
                float duration = 0.0f;
                while (true) {
                    try {
                        if (!it2.hasNext()) {
                            cls = cls4;
                            break;
                        }
                        IBehavior next2 = it2.next();
                        cls = cls4;
                        if (C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) cls5)) {
                            to = ((ColorEffect) next2).getTo();
                        }
                        if (C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) cls) && C7019kk.m27469x1(((SetEffect) next2).getTo(), IColorFormat.class)) {
                            to = (IColorFormat) ((SetEffect) next2).getTo();
                            duration = next2.getTiming().getDuration();
                            break;
                        }
                        if (type == 145 && C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) MotionEffect.class)) {
                            strM74521k4 = ((MotionEffect) next2).m2013du().toString();
                        }
                        if (type == 142 && C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) cls)) {
                            strM74521k4 = ((SetEffect) next2).getTo().toString();
                        }
                        if (type == 131) {
                            cls2 = cls5;
                            if (C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) RotationEffect.class)) {
                                strM74521k4 = C14064he.m66704h4(((RotationEffect) next2).getBy());
                            }
                        } else {
                            cls2 = cls5;
                        }
                        if (type == 51) {
                            cls3 = ScaleEffect.class;
                            if (C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) cls3)) {
                                strM74521k4 = ((ScaleEffect) next2).m2514to().toString();
                            }
                        } else {
                            cls3 = ScaleEffect.class;
                        }
                        if (C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) PropertyEffect.class) || C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) FilterEffect.class) || C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) RotationEffect.class) || C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) cls3) || C14067j2.m66727k4(next2) == C7019kk.m27443k4((Class<?>) cls2)) {
                            if (type != 13 && type != 9 && type != 140 && type != 44 && type != 145) {
                                duration = next2.getTiming().getDuration();
                                break;
                            }
                            duration += next2.getTiming().getDuration();
                        }
                        cls4 = cls;
                        cls5 = cls2;
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                IColorFormat iColorFormat = to;
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                if (C14064he.m66717x1(duration)) {
                    duration = 0.5f;
                }
                if (type == 13 || type == 9) {
                    duration /= 2.0f;
                }
                if (triggerType == 0) {
                    f += f2;
                    fM67481k4 = triggerDelayTime + duration;
                } else if (triggerType == 2) {
                    fM67481k4 = C14116yg.m67481k4(f2, triggerDelayTime + duration);
                } else {
                    i2++;
                    f2 = triggerDelayTime + duration;
                    f = 0.0f;
                    String strM67408k4 = iSequence.getTriggerShape() == null ? C14113y2.m67408k4("slide-", C14114y9.m67465x1(iSequence.getTriggerShape().getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(iSequence.getTriggerShape().getUniqueId())) : "slide";
                    float f3 = triggerDelayTime + f;
                    if (iColorFormat != null && iColorFormat.getColorType() != -1) {
                        strM74521k4 = m74521k4(targetShape, iColorFormat);
                    }
                    String str = strM74521k4;
                    if (dictionary.containsKey(targetShape)) {
                        i = i2;
                        dictionary.addItem(targetShape, new kte<>(C14113y2.m67408k4(C14042ak.m66410k4(EffectPresetClassType.class, presetClassType), C14042ak.m66410k4(EffectType.class, type)), C14042ak.m66410k4(EffectSubtype.class, subtype), Float.valueOf(duration), Float.valueOf(f3), strM67408k4, str, Integer.valueOf(i)));
                    } else {
                        i = i2;
                    }
                    cls4 = cls;
                    cls5 = cls2;
                }
                f2 = fM67481k4;
                String strM67408k42 = iSequence.getTriggerShape() == null ? C14113y2.m67408k4("slide-", C14114y9.m67465x1(iSequence.getTriggerShape().getSlide().getSlideId()), "-shape-", C14114y9.m67465x1(iSequence.getTriggerShape().getUniqueId())) : "slide";
                float f32 = triggerDelayTime + f;
                if (iColorFormat != null) {
                    strM74521k4 = m74521k4(targetShape, iColorFormat);
                }
                String str2 = strM74521k4;
                if (dictionary.containsKey(targetShape)) {
                }
                cls4 = cls;
                cls5 = cls2;
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return i2;
    }

    /* JADX INFO: renamed from: kk */
    public static String m74523kk(ISlide iSlide) {
        return iSlide.getSlideShowTransition().getType() == 39 ? ((IFlyThroughTransition) iSlide.getSlideShowTransition().getValue()).hasBounce() ? "HasBounce" : "" : iSlide.getSlideShowTransition().getType() == 42 ? ((IRevealTransition) iSlide.getSlideShowTransition().getValue()).getThroughBlack() ? "ThroughBlack" : "" : iSlide.getSlideShowTransition().getType() == 16 ? C14042ak.m66410k4(Orientation.class, ((ISplitTransition) iSlide.getSlideShowTransition().getValue()).getOrientation()) : "";
    }

    /* JADX INFO: renamed from: to */
    public static Dictionary<IShape, kte<String, String, Float, Float, String, String, Integer>> m74524to(ISlide iSlide) {
        Dictionary<IShape, kte<String, String, Float, Float, String, String, Integer>> dictionary = new Dictionary<>();
        m74519k4(iSlide.getTimeline().getMainSequence(), dictionary, m74519k4(iSlide.getLayoutSlide().getTimeline().getMainSequence(), dictionary, m74519k4(iSlide.getLayoutSlide().getMasterSlide().getTimeline().getMainSequence(), dictionary, 0)));
        IGenericEnumerator<ISequence> it = iSlide.getLayoutSlide().getMasterSlide().getTimeline().getInteractiveSequences().iterator();
        while (it.hasNext()) {
            try {
                m74519k4(it.next(), dictionary, -1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ISequence> it2 = iSlide.getLayoutSlide().getTimeline().getInteractiveSequences().iterator();
        while (it2.hasNext()) {
            try {
                m74519k4(it2.next(), dictionary, -1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = iSlide.getTimeline().getInteractiveSequences().iterator();
        while (it.hasNext()) {
            try {
                m74519k4(it.next(), dictionary, -1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m74525x1(ISlide iSlide) {
        int type = iSlide.getSlideShowTransition().getType();
        if (type == 4) {
            return C14042ak.m66410k4(Orientation.class, ((IOrientationTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
        }
        if (type == 5 || type == 12) {
            return C14042ak.m66410k4(TransitionEightDirectionType.class, ((IEightDirectionTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
        }
        if (type != 13) {
            if (type == 15) {
                return C14042ak.m66410k4(Orientation.class, ((IOrientationTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
            }
            if (type == 16) {
                return C14042ak.m66410k4(TransitionInOutDirectionType.class, ((ISplitTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
            }
            if (type != 20) {
                if (type != 21) {
                    if (type != 23 && type != 24) {
                        if (type != 38) {
                            if (type == 39) {
                                return C14042ak.m66410k4(TransitionInOutDirectionType.class, ((IFlyThroughTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
                            }
                            if (type == 42) {
                                return C14042ak.m66410k4(TransitionLeftRightDirectionType.class, ((IRevealTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
                            }
                            switch (type) {
                                default:
                                    switch (type) {
                                        case 33:
                                        case 34:
                                        case 35:
                                            break;
                                        case 36:
                                            break;
                                        default:
                                            return "";
                                    }
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                    return C14042ak.m66410k4(TransitionSideDirectionType.class, ((ISideDirectionTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
                            }
                        }
                    }
                    return C14042ak.m66410k4(TransitionLeftRightDirectionType.class, ((ILeftRightDirectionTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
                }
                return C14042ak.m66410k4(TransitionInOutDirectionType.class, ((IInOutTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
            }
        }
        return C14042ak.m66410k4(TransitionSideDirectionType.class, ((ISideDirectionTransition) iSlide.getSlideShowTransition().getValue()).getDirection());
    }

    /* JADX INFO: renamed from: k4 */
    public static int m74520k4(ISlide iSlide) {
        int i = 0;
        for (int i2 = 0; i2 < iSlide.getSlideNumber(); i2++) {
            if (iSlide.getPresentation().getSlides().get_Item(i2).getHidden()) {
                i++;
            }
        }
        return iSlide.getSlideNumber() - i;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m74521k4(IShape iShape, IColorFormat iColorFormat) {
        IShape iShapeAddClone = iShape.getSlide().getShapes().addClone(iShape);
        iShapeAddClone.getFillFormat().setFillType((byte) 1);
        iShapeAddClone.getFillFormat().getSolidFillColor().copyFrom(iColorFormat);
        C12003du c12003duClone = ((C14176nc) iShapeAddClone.getFillFormat().getEffective()).m67938m9().Clone();
        iShape.getSlide().getShapes().remove(iShapeAddClone);
        return C14113y2.m67408k4("rgb(", C14098up.m67323x1(c12003duClone.m56507jd()), ",", C14098up.m67323x1(c12003duClone.m56502ck()), ",", C14098up.m67323x1(c12003duClone.m56505fa()), ")");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m74522k4(TemplateContext<Slide> templateContext) {
        IFillFormatEffectiveData fillFormat = templateContext.getObject().getBackground().getEffective().getFillFormat();
        String strM70498k4 = C14442sb.m70498k4(fillFormat, templateContext);
        return (fillFormat.getFillType() == 4 && fillFormat.getPictureFillFormat().getPictureFillMode() == 1) ? C14113y2.m67400k4(strM70498k4, " background-size: cover;") : strM70498k4;
    }
}
