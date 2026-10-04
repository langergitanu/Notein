package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.g9 */
/* JADX INFO: loaded from: classes3.dex */
class C1136g9 {
    /* JADX INFO: renamed from: k4 */
    public static void m6456k4(IBehavior iBehavior, AbstractC7361bz abstractC7361bz, yqd yqdVar) {
        com.aspose.slides.internal.p332p7.no7 no7VarM38216x1;
        if (C7019kk.m27469x1(iBehavior, IColorEffect.class)) {
            com.aspose.slides.internal.p332p7.nbb nbbVar = (com.aspose.slides.internal.p332p7.nbb) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.nbb.class);
            no7VarM38216x1 = nbbVar.m37354h4();
            C14818xu.m73607k4((IColorEffect) iBehavior, nbbVar);
        } else if (C7019kk.m27469x1(iBehavior, ICommandEffect.class)) {
            com.aspose.slides.internal.p332p7.zv9 zv9Var = (com.aspose.slides.internal.p332p7.zv9) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.zv9.class);
            com.aspose.slides.internal.p332p7.no7 no7VarM45969kk = zv9Var.m45969kk();
            C14907zo.m74711k4((ICommandEffect) iBehavior, zv9Var, yqdVar);
            no7VarM38216x1 = no7VarM45969kk;
        } else if (C7019kk.m27469x1(iBehavior, IFilterEffect.class)) {
            com.aspose.slides.internal.p332p7.i4y i4yVar = (com.aspose.slides.internal.p332p7.i4y) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.i4y.class);
            no7VarM38216x1 = i4yVar.m33856to();
            C14232oe.m68474k4((IFilterEffect) iBehavior, i4yVar);
        } else if (C7019kk.m27469x1(iBehavior, IMotionEffect.class)) {
            com.aspose.slides.internal.p332p7.glt gltVar = (com.aspose.slides.internal.p332p7.glt) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.glt.class);
            no7VarM38216x1 = gltVar.m32641jd();
            shu.m70633k4((IMotionEffect) iBehavior, gltVar);
        } else if (C7019kk.m27469x1(iBehavior, IPropertyEffect.class)) {
            com.aspose.slides.internal.p332p7.it6 it6Var = (com.aspose.slides.internal.p332p7.it6) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.it6.class);
            no7VarM38216x1 = it6Var.m34447m9();
            g7b.m6455k4((IPropertyEffect) iBehavior, it6Var);
        } else if (C7019kk.m27469x1(iBehavior, IRotationEffect.class)) {
            com.aspose.slides.internal.p332p7.u4g u4gVar = (com.aspose.slides.internal.p332p7.u4g) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.u4g.class);
            no7VarM38216x1 = u4gVar.m42101to();
            etq.m5694k4((IRotationEffect) iBehavior, u4gVar);
        } else if (C7019kk.m27469x1(iBehavior, IScaleEffect.class)) {
            com.aspose.slides.internal.p332p7.s0t s0tVar = (com.aspose.slides.internal.p332p7.s0t) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.s0t.class);
            no7VarM38216x1 = s0tVar.m40701du();
            s3h.m70439k4((IScaleEffect) iBehavior, s0tVar);
        } else {
            if (!C7019kk.m27469x1(iBehavior, ISetEffect.class)) {
                throw new Exception();
            }
            com.aspose.slides.internal.p332p7.oeg oegVar = (com.aspose.slides.internal.p332p7.oeg) C7019kk.m27452k4((Object) abstractC7361bz, com.aspose.slides.internal.p332p7.oeg.class);
            no7VarM38216x1 = oegVar.m38216x1();
            drp.m5225k4((ISetEffect) iBehavior, oegVar);
        }
        if (no7VarM38216x1.m37764dy() == null || no7VarM38216x1.m37764dy().m40904k4().length <= 0) {
            return;
        }
        for (String str : no7VarM38216x1.m37764dy().m40904k4()) {
            iBehavior.getProperties().addItem(BehaviorProperty.getOrCreateByValue(str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6457k4(IBehavior iBehavior, C7394ca.k4 k4Var, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        if (C7019kk.m27469x1(iBehavior, IColorEffect.class)) {
            C14818xu.m73606k4((IColorEffect) iBehavior, k4Var, no7VarArr);
        } else if (C7019kk.m27469x1(iBehavior, ICommandEffect.class)) {
            C14907zo.m74710k4((ICommandEffect) iBehavior, k4Var, no7VarArr);
        } else if (C7019kk.m27469x1(iBehavior, IFilterEffect.class)) {
            C14232oe.m68473k4((IFilterEffect) iBehavior, k4Var, no7VarArr);
        } else if (C7019kk.m27469x1(iBehavior, IMotionEffect.class)) {
            shu.m70632k4((IMotionEffect) iBehavior, k4Var, no7VarArr);
        } else if (C7019kk.m27469x1(iBehavior, IPropertyEffect.class)) {
            g7b.m6454k4((IPropertyEffect) iBehavior, k4Var, no7VarArr);
        } else if (C7019kk.m27469x1(iBehavior, IRotationEffect.class)) {
            etq.m5693k4((IRotationEffect) iBehavior, k4Var, no7VarArr);
        } else if (C7019kk.m27469x1(iBehavior, IScaleEffect.class)) {
            s3h.m70438k4((IScaleEffect) iBehavior, k4Var, no7VarArr);
        } else {
            if (!C7019kk.m27469x1(iBehavior, ISetEffect.class)) {
                throw new Exception();
            }
            drp.m5224k4((ISetEffect) iBehavior, k4Var, no7VarArr);
        }
        m6458k4(iBehavior, no7VarArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6458k4(IBehavior iBehavior, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        if (iBehavior.getProperties().size() > 0) {
            com.aspose.slides.internal.p332p7.sd0 sd0VarM37766k4 = no7VarArr[0].m37766k4();
            IGenericEnumerator<IBehaviorProperty> it = iBehavior.getProperties().iterator();
            while (it.hasNext()) {
                try {
                    sd0VarM37766k4.m40903k4(((BehaviorProperty) it.next()).getValue());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }
}
