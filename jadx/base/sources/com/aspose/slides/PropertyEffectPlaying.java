package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p395sa.AbstractC10169x1;
import com.aspose.slides.internal.p395sa.C10167k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class PropertyEffectPlaying {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f3188k4 = new C7017h4("ppt_x", "#ppt_x", "ppt_y", "#ppt_y", "ppt_w", "#ppt_w", "ppt_h", "#ppt_h", "style.rotation");

    public static abstract class SetValueHandler extends AbstractC14085qw {
        public final InterfaceC14083qm beginInvoke(final float f, AbstractC14078m9 abstractC14078m9, Object obj) {
            return C10167k4.m50006k4(new AbstractC10169x1(this, abstractC14078m9, obj) { // from class: com.aspose.slides.PropertyEffectPlaying.SetValueHandler.1
                @Override // com.aspose.slides.internal.p395sa.AbstractC10169x1
                public void beginInvoke() {
                    SetValueHandler.this.invoke(f);
                }
            });
        }

        public final void endInvoke(InterfaceC14083qm interfaceC14083qm) {
            C10167k4.m50008k4(this, interfaceC14083qm);
        }

        public abstract void invoke(float f);
    }

    /* JADX INFO: renamed from: com.aspose.slides.PropertyEffectPlaying$k4 */
    public static class C0597k4 {

        /* JADX INFO: renamed from: k4 */
        private final C14571tq f3194k4;

        /* JADX INFO: renamed from: kk */
        private final Shape f3195kk;

        /* JADX INFO: renamed from: x1 */
        private final String f3196x1;

        public C0597k4(C14571tq c14571tq, Shape shape, String str) {
            this.f3194k4 = c14571tq;
            this.f3195kk = shape;
            this.f3196x1 = str;
        }

        /* JADX INFO: renamed from: k4 */
        private float m2461k4(float f, boolean z) {
            float fM56697kk;
            float height;
            C12015qq c12015qqClone = ((SlideSize) this.f3195kk.getPresentation().getSlideSize()).m2755k4().Clone();
            IShapeFrame frame = this.f3195kk.getFrame();
            if (z) {
                fM56697kk = c12015qqClone.m56699x1() * f;
                height = frame.getWidth();
            } else {
                fM56697kk = c12015qqClone.m56697kk() * f;
                height = frame.getHeight();
            }
            return fM56697kk - (height / 2.0f);
        }

        /* JADX INFO: renamed from: x1 */
        private float m2462x1(float f, boolean z) {
            C12015qq c12015qqClone = ((SlideSize) this.f3195kk.getPresentation().getSlideSize()).m2755k4().Clone();
            return (z ? c12015qqClone.m56699x1() : c12015qqClone.m56697kk()) * f;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m2463k4(float f) {
            switch (PropertyEffectPlaying.f3188k4.m27428k4(this.f3196x1)) {
                case 0:
                case 1:
                    this.f3194k4.m71282k4((IShape) this.f3195kk, true, m2461k4(f, true));
                    break;
                case 2:
                case 3:
                    this.f3194k4.m71282k4((IShape) this.f3195kk, false, m2461k4(f, false));
                    break;
                case 4:
                case 5:
                    this.f3194k4.m71284k4(this.f3195kk, true, m2462x1(f, true));
                    break;
                case 6:
                case 7:
                    this.f3194k4.m71284k4(this.f3195kk, false, m2462x1(f, false));
                    break;
                case 8:
                    this.f3195kk.setRotation(f);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC1130g3 m2458k4(Object obj) {
        if (C7019kk.m27469x1(obj, String.class)) {
            return c7p.m4504k4((String) obj);
        }
        if (C7019kk.m27469x1(obj, Float.class)) {
            return new C1129g2(((Float) C7019kk.m27464to(obj, Float.TYPE)).floatValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC14751wu m2460k4(final C14571tq c14571tq, final IShape iShape, PropertyEffect propertyEffect) {
        boolean zM27456k4;
        Object bscVar;
        boolean z = true;
        if (propertyEffect.getProperties().size() != 1) {
            return null;
        }
        final IBehaviorProperty iBehaviorProperty = propertyEffect.getProperties().get_Item(0);
        switch (f3188k4.m27428k4(iBehaviorProperty.getValue())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                SetValueHandler setValueHandler = new SetValueHandler() { // from class: com.aspose.slides.PropertyEffectPlaying.1
                    @Override // com.aspose.slides.PropertyEffectPlaying.SetValueHandler
                    public void invoke(float f) {
                        new C0597k4(c14571tq, (Shape) iShape, iBehaviorProperty.getValue()).m2463k4(f);
                    }
                };
                IPointCollection points = propertyEffect.getPoints();
                if (points.getCount() > 1) {
                    List list = new List();
                    kdz kdzVar = new kdz(iShape);
                    for (int i = 1; i < points.getCount(); i++) {
                        IPoint iPoint = points.get_Item(i - 1);
                        IPoint iPoint2 = points.get_Item(i);
                        float time = iPoint2.getTime() - iPoint.getTime();
                        if (C14113y2.m67411k4(iPoint.getFormula())) {
                            InterfaceC1130g3 interfaceC1130g3M2458k4 = m2458k4(iPoint.getValue());
                            InterfaceC1130g3 interfaceC1130g3M4504k4 = !C14113y2.m67411k4(iPoint2.getFormula()) ? c7p.m4504k4(iPoint2.getFormula()) : m2458k4(iPoint2.getValue());
                            if (interfaceC1130g3M2458k4 != null && interfaceC1130g3M4504k4 != null) {
                                bscVar = new bsc(kdzVar, setValueHandler, interfaceC1130g3M2458k4, interfaceC1130g3M4504k4);
                            }
                        } else {
                            InterfaceC1130g3 interfaceC1130g3M4504k42 = c7p.m4504k4(iPoint.getFormula());
                            bscVar = interfaceC1130g3M4504k42 != null ? new goq(kdzVar, interfaceC1130g3M4504k42, setValueHandler) : null;
                        }
                        if (bscVar != null) {
                            list.addItem(new KeyValuePair(Float.valueOf(time), bscVar));
                        }
                    }
                    if (list.size() == 1) {
                        return (InterfaceC14751wu) ((KeyValuePair) list.get_Item(0)).getValue();
                    }
                    if (list.size() > 1) {
                        float fFloatValue = ((Float) ((KeyValuePair) list.get_Item(0)).getKey()).floatValue();
                        List.Enumerator it = list.iterator();
                        float fFloatValue2 = 0.0f;
                        while (it.hasNext()) {
                            try {
                                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                                fFloatValue2 += ((Float) keyValuePair.getKey()).floatValue();
                                if (((Float) keyValuePair.getKey()).floatValue() != fFloatValue) {
                                    z = false;
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        gle gleVar = new gle();
                        it = list.iterator();
                        if (z) {
                            while (it.hasNext()) {
                                try {
                                    gleVar.m6761k4((InterfaceC14751wu) ((KeyValuePair) it.next()).getValue());
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                }
                            }
                            if (zM27456k4) {
                                return gleVar;
                            }
                        } else {
                            while (it.hasNext()) {
                                try {
                                    KeyValuePair keyValuePair2 = (KeyValuePair) it.next();
                                    gleVar.m6761k4(new ukv((InterfaceC14751wu) keyValuePair2.getValue(), ((Float) keyValuePair2.getKey()).floatValue() / fFloatValue2));
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                }
                                break;
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                        return gleVar;
                    }
                }
                return null;
            default:
                return null;
        }
    }
}
