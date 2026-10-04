package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qu */
/* JADX INFO: loaded from: classes3.dex */
class C14360qu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.aspose.slides.tbp] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.aspose.slides.zn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.aspose.slides.TextFrame] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.aspose.slides.ms.System.IDisposable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.aspose.slides.l4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.aspose.slides.internal.wh.ck, com.aspose.slides.ms.System.IDisposable] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m69754k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame) throws Throwable {
        ?? r12;
        float f;
        tbp tbpVar;
        AbstractC12008jd abstractC12008jdM56582k4;
        IGenericEnumerator<IPortion> it;
        ?? r2 = textFrame;
        if (C7019kk.m27469x1((Object) abstractC14897zn, omq.class) || r2.m2926m9()) {
            return false;
        }
        tbp tbpVarClone = geometryShape.m2575sv().Clone();
        oju ojuVar = new oju(geometryShape.getX(), geometryShape.getY());
        try {
            try {
                IGenericEnumerator<IParagraph> it2 = r2.getParagraphs().iterator();
                float fM67481k4 = 0.0f;
                boolean z = false;
                boolean z2 = false;
                while (it2.hasNext()) {
                    try {
                        try {
                            IParagraph next = it2.next();
                            if (z) {
                                break;
                            }
                            it = next.getPortions().iterator();
                            while (it.hasNext()) {
                                try {
                                    IEffectFormatEffectiveData effectFormat = it.next().getPortionFormat().getEffective().getEffectFormat();
                                    z = z || effectFormat.getInnerShadowEffect() != null;
                                    if (effectFormat.getReflectionEffect() != null && effectFormat.getReflectionEffect().getScaleHorizontal() != 0.0d && effectFormat.getReflectionEffect().getScaleVertical() != 0.0d) {
                                        fM67481k4 = C14116yg.m67481k4(fM67481k4, (float) effectFormat.getReflectionEffect().getDistance());
                                        z2 = true;
                                    }
                                    if (z && z2) {
                                        break;
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
                        } catch (Throwable th2) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th2;
                        }
                    } catch (RuntimeException e) {
                        e = e;
                        r12 = it;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                if (!z && !z2) {
                    geometryShape.mo1650kk(tbpVarClone.Clone());
                    geometryShape.m2565k4(ojuVar.Clone());
                    return false;
                }
                w0l w0lVarM2937b3 = r2.m2908jd().m2937b3();
                if (w0lVarM2937b3.getTextVerticalType() == 0 && !C14113y2.m67411k4(r2.getText()) && w0lVarM2937b3.m72613h4().m5815k4() == 0 && w0lVarM2937b3.m72614jd() == 0) {
                    jq6.m63494x1(r2.f3523to);
                    if (r2.f3523to.mo64296kk().f47836k4 > geometryShape.getWidth() || r2.f3523to.mo64296kk().f47837x1 > geometryShape.getHeight()) {
                        double marginLeft = ((double) r2.f3523to.mo64296kk().f47836k4) + w0lVarM2937b3.getMarginLeft() + w0lVarM2937b3.getMarginRight();
                        tbpVar = tbpVarClone;
                        double marginTop = ((double) r2.f3523to.mo64296kk().f47837x1) + w0lVarM2937b3.getMarginTop() + w0lVarM2937b3.getMarginBottom();
                        f = fM67481k4;
                        geometryShape.m2555k4(C14116yg.m67502x1(marginLeft, geometryShape.getWidth()), C14116yg.m67502x1(marginTop, geometryShape.getHeight()));
                        if (w0lVarM2937b3.getAnchoringType() == 2 && marginTop > tbpVar.f49091x1) {
                            geometryShape.setY(geometryShape.getY() - ((float) (marginTop - tbpVar.f49091x1)));
                        }
                        if (w0lVarM2937b3.getAnchoringType() == 1 && marginTop > tbpVar.f49091x1) {
                            geometryShape.setY(geometryShape.getY() - (((float) (marginTop - tbpVar.f49091x1)) / 2.0f));
                        }
                        if (w0lVarM2937b3.getCenterText() && marginLeft > tbpVar.f49090k4) {
                            geometryShape.setX(geometryShape.getX() - (((float) (marginLeft - tbpVar.f49090k4)) / 2.0f));
                        }
                    }
                } else {
                    f = fM67481k4;
                    tbpVar = tbpVarClone;
                }
                C4317dy c4317dyM63485k4 = jq6.m63485k4(r2.f3523to, kg7Var);
                int iM27462to = C7019kk.m27462to(Float.valueOf(geometryShape.getWidth()), 13);
                int iM27462to2 = C7019kk.m27462to(Float.valueOf(geometryShape.getHeight()), 13);
                if (z2) {
                    iM27462to2 = (iM27462to2 * 2) + C7019kk.m27462to(Float.valueOf(3.0f * f), 13);
                }
                C12009k4 c12009k4 = new C12009k4(iM27462to, iM27462to2, 2498570);
                try {
                    c12009k4.m56332k4(96.0f, 96.0f);
                    abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                } catch (Throwable th3) {
                    th = th3;
                    r2 = c12009k4;
                }
                try {
                    try {
                        abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
                        abstractC12008jdM56582k4.dispose();
                        omq omqVar = new omq(c12009k4, c12009k4.mo15760yj(), c12009k4.mo15757m9());
                        try {
                            r2 = r2.f3523to;
                            r2.mo64295k4(omqVar, kg7Var);
                            omqVar.dispose();
                            abstractC14897zn.m74622kk(c4317dyM63485k4);
                            r2 = c12009k4;
                            try {
                                abstractC14897zn.mo64341k4(r2, 0, 0, iM27462to, iM27462to2);
                                r2.dispose();
                                geometryShape.mo1650kk(tbpVar.Clone());
                                geometryShape.m2565k4(ojuVar.Clone());
                                return true;
                            } finally {
                                abstractC14897zn.m74626rv();
                            }
                        } catch (Throwable th4) {
                            omqVar.dispose();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        if (abstractC12008jdM56582k4 != null) {
                            abstractC12008jdM56582k4.dispose();
                        }
                        throw th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r2.dispose();
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                geometryShape.mo1650kk(tbpVarClone.Clone());
                geometryShape.m2565k4(ojuVar.Clone());
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            r12 = tbpVarClone;
        } catch (Throwable th8) {
            th = th8;
            geometryShape.mo1650kk(tbpVarClone.Clone());
            geometryShape.m2565k4(ojuVar.Clone());
            throw th;
        }
        C3085sv.m13082k4(e);
        geometryShape.mo1650kk(r12.Clone());
        geometryShape.m2565k4(ojuVar.Clone());
        return false;
    }
}
