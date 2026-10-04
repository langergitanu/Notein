package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.MovePlayer;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p233kn.C5888k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class hw5 {
    /* JADX INFO: renamed from: k4 */
    private static double m7309k4(float f) {
        if (C14064he.m66717x1(f)) {
            return 500.0d;
        }
        return ((double) f) * 1000.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static lrw m7310k4(ISequence iSequence, C14571tq c14571tq) {
        vbl vblVar;
        C14571tq c14571tq2 = c14571tq;
        int count = iSequence.getCount();
        vbl[] vblVarArr = new vbl[count];
        int i = 0;
        int i2 = 0;
        while (i2 < iSequence.getCount()) {
            Effect effect = (Effect) iSequence.get_Item(i2);
            List list = new List();
            IBehaviorCollection behaviors = effect.getBehaviors();
            int i3 = 0;
            IBehavior iBehavior = null;
            while (i3 < behaviors.getCount()) {
                IBehavior iBehavior2 = behaviors.get_Item(i3);
                double dM7309k4 = m7309k4(iBehavior2.getTiming().getDuration());
                IBehavior iBehavior3 = iBehavior2;
                if (effect.getType() == 140) {
                    iBehavior3 = iBehavior2;
                    if (i3 + 1 == behaviors.getCount()) {
                        boolean zM27469x1 = C7019kk.m27469x1(iBehavior2, RotationEffect.class);
                        iBehavior3 = iBehavior2;
                        if (zM27469x1) {
                            RotationEffect rotationEffect = new RotationEffect();
                            rotationEffect.setBy(effect.getTargetShape().getRotation());
                            rotationEffect.setTiming(rotationEffect.getTiming());
                            iBehavior3 = rotationEffect;
                        }
                    }
                }
                IBehavior iBehavior4 = iBehavior3;
                vbl vblVarM7312k4 = (effect.getType() != 16 && effect.f2144to < 0) ? m7312k4((Shape) effect.getTargetShape(), c14571tq2, iBehavior, iBehavior4, dM7309k4) : m7311k4(effect, c14571tq2, iBehavior4, dM7309k4);
                if (vblVarM7312k4 != null) {
                    list.addItem(m7315k4(vblVarM7312k4, iBehavior4.getTiming()));
                }
                i3++;
                c14571tq2 = c14571tq;
                iBehavior = iBehavior4;
            }
            vbl btkVar = list.size() > 0 ? list.size() == 1 ? (vbl) list.get_Item(0) : new btk(list) : null;
            if (btkVar != null) {
                vbl vblVarM7315k4 = m7315k4(btkVar, effect.getTiming());
                if (effect.getTiming().getTriggerType() != 2 || i2 < 1) {
                    vblVarArr[i2] = vblVarM7315k4;
                } else {
                    int i4 = i2 - 1;
                    while (i4 >= 0) {
                        Effect effect2 = (Effect) iSequence.get_Item(i4);
                        if (effect2.getTiming().getTriggerType() != 2 || (effect2.getTiming().getTriggerType() == 2 && i4 == 0)) {
                            break;
                        }
                        i4--;
                    }
                    if (i4 < 0 || (vblVar = vblVarArr[i4]) == null) {
                        vblVarArr[i2] = vblVarM7315k4;
                    } else {
                        if (C7019kk.m27469x1(vblVar, btk.class)) {
                            ((btk) C7019kk.m27452k4((Object) vblVar, btk.class)).m4314k4(vblVarM7315k4);
                        } else {
                            btk btkVar2 = new btk();
                            btkVar2.m4314k4(vblVar);
                            btkVar2.m4314k4(vblVarM7315k4);
                            vblVarArr[i4] = btkVar2;
                        }
                        vblVarArr[i2] = null;
                    }
                }
            }
            i2++;
            c14571tq2 = c14571tq;
        }
        lrw lrwVar = null;
        while (i < count) {
            vbl vblVar2 = vblVarArr[i];
            lrwVar = lrwVar;
            if (vblVar2 != null) {
                if (lrwVar == null) {
                    lrwVar = new lrw();
                }
                lrwVar.m64544k4(vblVar2);
            }
            i++;
            lrwVar = lrwVar;
        }
        return lrwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static vbl m7311k4(Effect effect, C14571tq c14571tq, IBehavior iBehavior, double d) {
        int i;
        InterfaceC14751wu interfaceC14751wuM69506k4;
        Shape shape = (Shape) effect.getTargetShape();
        if (!C7019kk.m27469x1(iBehavior, FilterEffect.class)) {
            if (C7019kk.m27469x1(iBehavior, SetEffect.class)) {
                b3h b3hVarM3986k4 = b3h.m3986k4(shape, new C5888k4(Integer.valueOf(effect.f2144to), Integer.valueOf(effect.f2137du)), (SetEffect) iBehavior);
                if (b3hVarM3986k4 != null) {
                    return new nii(b3hVarM3986k4, d);
                }
                return null;
            }
            if (C7019kk.m27469x1(iBehavior, ColorEffect.class) && C7019kk.m27469x1(shape, AutoShape.class)) {
                ColorEffect colorEffect = (ColorEffect) iBehavior;
                if (hgg.m7139k4(colorEffect)) {
                    AutoShape autoShape = (AutoShape) shape;
                    int i2 = effect.f2144to;
                    if (i2 >= 0 && (i = effect.f2137du) >= 0) {
                        return new nii(new hgg(i2, i, autoShape, colorEffect), d);
                    }
                    IParagraphCollection paragraphs = autoShape.getTextFrame().getParagraphs();
                    if (paragraphs.getCount() > 0) {
                        return new nii(new hgg(0, paragraphs.getCount() - 1, autoShape, colorEffect), d);
                    }
                }
            }
            return null;
        }
        FilterEffect filterEffect = (FilterEffect) iBehavior;
        int type = filterEffect.getType();
        if (type == 1) {
            interfaceC14751wuM69506k4 = C14336qb.m69506k4(effect.m1372k4(), shape, c14571tq, filterEffect);
        } else if (type == 3) {
            interfaceC14751wuM69506k4 = C14166n4.m67867k4(effect.m1372k4(), shape, c14571tq, filterEffect);
        } else if (type == 8) {
            interfaceC14751wuM69506k4 = C14865yy.m74144k4(effect.m1372k4(), shape, c14571tq, filterEffect.getReveal() == 1);
        } else if (type != 5 && type != 6 && type != 11) {
            if (type == 12) {
                interfaceC14751wuM69506k4 = q6c.m69432k4(effect.m1372k4(), shape, c14571tq, filterEffect.getSubtype() == 9, filterEffect.getReveal() == 1);
            } else if (type != 17 && type != 18) {
                interfaceC14751wuM69506k4 = null;
            }
        }
        if (interfaceC14751wuM69506k4 != null) {
            return new nii(interfaceC14751wuM69506k4, d);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static vbl m7312k4(Shape shape, C14571tq c14571tq, IBehavior iBehavior, IBehavior iBehavior2, double d) {
        InterfaceC14751wu interfaceC14751wuM69507k4;
        if (C7019kk.m27469x1(iBehavior2, MotionEffect.class)) {
            return m7314k4(c14571tq, (MotionEffect) iBehavior2, shape, d);
        }
        if (C7019kk.m27469x1(iBehavior2, RotationEffect.class)) {
            g5j g5jVar = new g5j(shape);
            g5jVar.f5175kk = ((RotationEffect) iBehavior2).getBy();
            if (C7019kk.m27469x1(iBehavior, RotationEffect.class)) {
                g5jVar.f5176x1 = ((RotationEffect) iBehavior).getBy();
            }
            return new nii(g5jVar, d);
        }
        if (C7019kk.m27469x1(iBehavior2, FilterEffect.class)) {
            FilterEffect filterEffect = (FilterEffect) iBehavior2;
            int type = filterEffect.getType();
            if (type == 1) {
                interfaceC14751wuM69507k4 = C14336qb.m69507k4(shape, c14571tq, filterEffect);
            } else if (type == 3) {
                interfaceC14751wuM69507k4 = C14166n4.m67866k4(shape, c14571tq, filterEffect);
            } else if (type == 8) {
                interfaceC14751wuM69507k4 = C14865yy.m74145k4(shape, c14571tq, filterEffect.getReveal() == 1);
            } else if (type != 5 && type != 6 && type != 11) {
                if (type == 12) {
                    interfaceC14751wuM69507k4 = q6c.m69433k4(shape, c14571tq, filterEffect.getSubtype() == 9, filterEffect.getReveal() == 1);
                } else if (type != 17 && type != 18) {
                    interfaceC14751wuM69507k4 = null;
                }
            }
            if (interfaceC14751wuM69507k4 != null) {
                return new nii(interfaceC14751wuM69507k4, d);
            }
            return null;
        }
        if (C7019kk.m27469x1(iBehavior2, PropertyEffect.class)) {
            InterfaceC14751wu interfaceC14751wuM2460k4 = PropertyEffectPlaying.m2460k4(c14571tq, shape, (PropertyEffect) iBehavior2);
            if (interfaceC14751wuM2460k4 != null) {
                return new nii(interfaceC14751wuM2460k4, d);
            }
            return null;
        }
        if (!C7019kk.m27469x1(iBehavior2, ScaleEffect.class)) {
            if (C7019kk.m27469x1(iBehavior2, SetEffect.class)) {
                b3h b3hVarM3985k4 = b3h.m3985k4(shape, (SetEffect) iBehavior2);
                if (b3hVarM3985k4 != null) {
                    return new nii(b3hVarM3985k4, d);
                }
                return null;
            }
            if (C7019kk.m27469x1(iBehavior2, ColorEffect.class)) {
                ColorEffect colorEffect = (ColorEffect) iBehavior2;
                if (C13775lg.m64388k4(colorEffect)) {
                    return new nii(new C13775lg(shape, colorEffect), d);
                }
            }
            return null;
        }
        ScaleEffect scaleEffect = (ScaleEffect) C7019kk.m27452k4((Object) iBehavior2, ScaleEffect.class);
        C12025x6 c12025x6Clone = scaleEffect.m2515x1().Clone();
        C12025x6 c12025x6Clone2 = scaleEffect.m2512kk().Clone();
        C12025x6 c12025x6Clone3 = scaleEffect.m2514to().Clone();
        oju ojuVarClone = oju.f47835to.Clone();
        oju ojuVar = oju.f47834kk;
        oju ojuVarClone2 = ojuVar.Clone();
        if (!C14064he.m66715kk(c12025x6Clone.m56897x1()) && !C14064he.m66715kk(c12025x6Clone.m56895kk())) {
            oju.m68617k4(new oju(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()), 0.01f).CloneTo(ojuVarClone);
        }
        if (!C14064he.m66715kk(c12025x6Clone2.m56897x1()) && !C14064he.m66715kk(c12025x6Clone2.m56895kk())) {
            ojuVarClone2 = new oju(c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk());
        } else if (!C14064he.m66715kk(c12025x6Clone3.m56897x1()) && !C14064he.m66715kk(c12025x6Clone3.m56895kk())) {
            ojuVarClone2 = new oju(c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk());
        }
        if (oju.m68621to(ojuVarClone2, ojuVar)) {
            return new nii(new phu(c14571tq, shape, ojuVarClone.Clone(), oju.m68617k4(ojuVarClone2, 0.01f).Clone()), d);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static vbl m7313k4(C14571tq c14571tq, IShape iShape, IMotionPath iMotionPath, double d, AbstractC4687to<C12025x6, oju> abstractC4687to) {
        int i;
        KeyValuePair keyValuePair;
        List list = new List();
        oju ojuVarClone = abstractC4687to.invoke(new C12025x6(0.0f, 0.0f)).Clone();
        int i2 = 0;
        int i3 = 0;
        double d2 = 0.0d;
        while (i3 < iMotionPath.getCount()) {
            MotionCmdPath motionCmdPath = (MotionCmdPath) iMotionPath.get_Item(i3);
            if (motionCmdPath.getCommandType() == 0) {
                abstractC4687to.invoke(motionCmdPath.m2012k4()[i2].Clone()).CloneTo(ojuVarClone);
                i = i2;
            } else {
                if (motionCmdPath.getCommandType() == 1) {
                    oju ojuVarClone2 = abstractC4687to.invoke(motionCmdPath.m2012k4()[i2].Clone()).Clone();
                    i = i2;
                    final ev2 ev2Var = new ev2(ojuVarClone.Clone(), oju.m68622x1(ojuVarClone2, ojuVarClone).Clone());
                    ojuVarClone2.CloneTo(ojuVarClone);
                    double dM68627kk = ev2Var.f4884x1.m68627kk();
                    d2 += dM68627kk;
                    keyValuePair = new KeyValuePair(Double.valueOf(dM68627kk), new MovePlayer(c14571tq, iShape, new MovePlayer.GetPointHandler() { // from class: com.aspose.slides.hw5.3
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(ev2Var) + "Aspose.Slides.Export.FramesStream.AnimationPlaying.LineCurve.Get(float)";
                        }

                        @Override // com.aspose.slides.MovePlayer.GetPointHandler
                        public oju invoke(float f) {
                            return ev2Var.m5737k4(f);
                        }
                    }));
                } else {
                    i = i2;
                    if (motionCmdPath.getCommandType() == 2) {
                        oju ojuVarClone3 = abstractC4687to.invoke(motionCmdPath.m2012k4()[2].Clone()).Clone();
                        final C0977f5 c0977f5 = new C0977f5();
                        ojuVarClone.CloneTo(c0977f5.f4963k4);
                        abstractC4687to.invoke(motionCmdPath.m2012k4()[i].Clone()).CloneTo(c0977f5.f4966x1);
                        abstractC4687to.invoke(motionCmdPath.m2012k4()[1].Clone()).CloneTo(c0977f5.f4964kk);
                        ojuVarClone3.CloneTo(c0977f5.f4965to);
                        ojuVarClone3.CloneTo(ojuVarClone);
                        double dM5822k4 = c0977f5.m5822k4();
                        d2 += dM5822k4;
                        keyValuePair = new KeyValuePair(Double.valueOf(dM5822k4), new MovePlayer(c14571tq, iShape, new MovePlayer.GetPointHandler() { // from class: com.aspose.slides.hw5.4
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(c0977f5) + "Aspose.Slides.Export.FramesStream.AnimationPlaying.BezierBy4Points.Get(float)";
                            }

                            @Override // com.aspose.slides.MovePlayer.GetPointHandler
                            public oju invoke(float f) {
                                return c0977f5.m5823k4(f);
                            }
                        }));
                    }
                }
                list.addItem(keyValuePair);
            }
            i3++;
            i2 = i;
        }
        int i4 = i2;
        if (list.size() <= 0) {
            return null;
        }
        double d3 = d2 > 0.0d ? 1.0d / d2 : 0.0d;
        if (list.size() == 1) {
            return new nii((InterfaceC14751wu) ((KeyValuePair) list.get_Item(i4)).Clone().getValue(), d);
        }
        lrw lrwVar = new lrw();
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair2 = (KeyValuePair) it.next();
                lrwVar.m64544k4(new nii((MovePlayer) keyValuePair2.getValue(), ((Double) keyValuePair2.getKey()).doubleValue() * d3 * d));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return lrwVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static vbl m7314k4(C14571tq c14571tq, MotionEffect motionEffect, IShape iShape, double d) {
        final w2q w2qVar = new w2q(iShape);
        IMotionPath path = motionEffect.getPath();
        if (path != null) {
            return m7313k4(c14571tq, iShape, path, d, new AbstractC4687to<C12025x6, oju>() { // from class: com.aspose.slides.hw5.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(w2qVar) + "Aspose.Slides.Export.FramesStream.AnimationPlaying.ShapeMoveState.PathPointToPosition(System.Drawing.PointF)";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public oju invoke(C12025x6 c12025x6) {
                    return w2qVar.m72624k4(c12025x6);
                }
            });
        }
        oju ojuVarClone = w2qVar.m72624k4(motionEffect.m2019x1().Clone()).Clone();
        final ev2 ev2Var = new ev2(ojuVarClone.Clone(), oju.m68622x1(w2qVar.m72624k4(motionEffect.m2015kk().Clone()).Clone(), ojuVarClone).Clone());
        return new nii(new MovePlayer(c14571tq, iShape, new MovePlayer.GetPointHandler() { // from class: com.aspose.slides.hw5.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(ev2Var) + "Aspose.Slides.Export.FramesStream.AnimationPlaying.LineCurve.Get(float)";
            }

            @Override // com.aspose.slides.MovePlayer.GetPointHandler
            public oju invoke(float f) {
                return ev2Var.m5737k4(f);
            }
        }), d);
    }

    /* JADX INFO: renamed from: k4 */
    private static vbl m7315k4(vbl vblVar, ITiming iTiming) {
        if (iTiming.getAccelerate() > 0.0f || iTiming.getDecelerate() > 0.0f) {
            vblVar = new C14761x1(vblVar, iTiming.getAccelerate(), iTiming.getDecelerate());
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf(iTiming.getRepeatCount()), 13);
        if (iM27462to > 1) {
            vblVar = new nk7(vblVar, iM27462to);
        }
        if (iTiming.getAutoReverse()) {
            vblVar = new C14160my(vblVar);
        }
        return iTiming.getTriggerDelayTime() > 0.0f ? new C14867yz(vblVar, m7309k4(iTiming.getTriggerDelayTime())) : vblVar;
    }
}
