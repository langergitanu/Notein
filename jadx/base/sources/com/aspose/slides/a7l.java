package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7438ct;
import com.aspose.slides.internal.p332p7.C7452d0;
import com.aspose.slides.internal.p332p7.C7670fk;
import com.aspose.slides.internal.p332p7.C8030jq;
import com.aspose.slides.internal.p332p7.C8082kf;
import com.aspose.slides.internal.p332p7.C8601qh;
import com.aspose.slides.internal.p332p7.C8740s4;
import com.aspose.slides.internal.p332p7.C9103wc;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class a7l extends DomObject<SmartArt> {

    /* JADX INFO: renamed from: du */
    private tbp f3832du;

    /* JADX INFO: renamed from: k4 */
    private final m6r f3833k4;

    /* JADX INFO: renamed from: kk */
    private final List<bay> f3834kk;

    /* JADX INFO: renamed from: to */
    private final GroupShape f3835to;

    /* JADX INFO: renamed from: x1 */
    private final bay f3836x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7l(SmartArt smartArt, C9103wc c9103wc, C14244on c14244on) {
        super(smartArt);
        this.f3832du = new tbp();
        this.f3833k4 = (m6r) wsu.m72915k4(this, c9103wc, (wsu) null);
        m3350k4().mo4817k4((bay) null, c14244on);
        bay bayVar = m3350k4().m64783kk().get_Item(0);
        this.f3836x1 = bayVar;
        bayVar.m4076h4().addItem(c14244on);
        List<bay> list = new List<>();
        this.f3834kk = list;
        m3341k4(bayVar, list, false);
        GroupShape groupShape = new GroupShape((ShapeCollection) m3357x1().getSlide().getShapes());
        this.f3835to = groupShape;
        GroupShapeLock groupShapeLock = (GroupShapeLock) groupShape.getShapeLock();
        groupShapeLock.setGroupingLocked(true);
        groupShapeLock.setPositionLocked(true);
        groupShapeLock.setRotationLocked(true);
        groupShapeLock.setSizeLocked(true);
        groupShapeLock.setUngroupingLocked(true);
        ShapeCollection shapeCollection = (ShapeCollection) groupShape.getShapes();
        List<z2c> listM3335c5 = m3335c5();
        List.Enumerator<z2c> it = listM3335c5.iterator();
        while (it.hasNext()) {
            try {
                SmartArtShape smartArtShapeM74280x1 = it.next().m74280x1();
                smartArtShapeM74280x1.m2592x1(shapeCollection);
                shapeCollection.m2636k4(smartArtShapeM74280x1);
                smartArtShapeM74280x1.m2822wl().m71869k4(smartArtShapeM74280x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m3339k4(listM3335c5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX INFO: renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<z2c> m3335c5() {
        z2c z2cVarM4074dy;
        List<z2c> list = new List<>();
        int i = 0;
        boolean z = m3350k4().m64780h4() == 2;
        List list2 = new List();
        m3341k4(this.f3836x1, (List<bay>) list2, true);
        int size = list2.size();
        int i2 = z ? size - 1 : 0;
        while (true) {
            if (z) {
                if (i2 < 0) {
                    break;
                }
                z2cVarM4074dy = ((bay) list2.get_Item(i2)).m4074dy();
                if (z2cVarM4074dy.m74280x1() != null) {
                    list.addItem(z2cVarM4074dy);
                    z2cVarM4074dy.m74247k4(i);
                    i++;
                }
                i2 += !z ? -1 : 1;
            } else {
                if (i2 >= size) {
                    break;
                }
                z2cVarM4074dy = ((bay) list2.get_Item(i2)).m4074dy();
                if (z2cVarM4074dy.m74280x1() != null) {
                }
                i2 += !z ? -1 : 1;
            }
        }
        list.sort();
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static ColorFormat m3336k4(C7394ca c7394ca) {
        ColorFormat colorFormat = new ColorFormat(null);
        C1246ib.m7610k4(colorFormat, c7394ca);
        return colorFormat;
    }

    /* JADX INFO: renamed from: du */
    public final void m3346du() {
        this.f3832du = new tbp(m3357x1().getWidth(), m3357x1().getHeight());
        this.f3836x1.m4107v4();
        this.f3836x1.m4111x1(61, m3356to().f49090k4);
        this.f3836x1.m4111x1(15, m3356to().f49091x1);
        m3350k4().m72923x6();
        m3350k4().m64779dy();
        if (this.f3836x1.m4077jd().mo3647k4(this.f3836x1, m3356to().Clone())) {
            this.f3836x1.m4109wy();
            this.f3836x1.m4105um();
            m3350k4().m64779dy();
        }
        this.f3836x1.m4113yd();
        this.f3836x1.m4067b3();
    }

    /* JADX INFO: renamed from: dy */
    public final int m3347dy() {
        List.Enumerator<bay> it = this.f3834kk.iterator();
        int iM5146rv = Integer.MIN_VALUE;
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (iM5146rv < next.m5146rv()) {
                    iM5146rv = next.m5146rv();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iM5146rv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        m3357x1().m2778k4().m69206to();
     */
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3348h4() {
        List.Enumerator<bay> it = this.f3834kk.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                SmartArtShape smartArtShapeM74280x1 = it.next().m4074dy().m74280x1();
                if (smartArtShapeM74280x1 != null && smartArtShapeM74280x1.m2820kk() != null && !C14113y2.m67363du(smartArtShapeM74280x1.m2820kk().getText(), C14113y2.f47374k4)) {
                    break;
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
        it = this.f3834kk.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                SmartArtShape smartArtShapeM74280x12 = next.m4074dy().m74280x1();
                if (smartArtShapeM74280x12 != null && smartArtShapeM74280x12.m2820kk() != null && !C14113y2.m67363du(smartArtShapeM74280x12.m2820kk().getText(), C14113y2.f47374k4)) {
                    next.m4074dy().m74251k4(smartArtShapeM74280x12.m2548dq());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final GroupShape m3354kk() {
        return this.f3835to;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m3355m9() {
        List.Enumerator<bay> it = this.f3834kk.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (next.m4074dy().m74280x1() != null) {
                    m3340k4(next);
                } else {
                    next.m5147up().m71873kk().m28368k4(0);
                    next.m5147up().m71873kk().m28390x1(0);
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

    /* JADX INFO: renamed from: to */
    public final tbp m3356to() {
        return this.f3832du;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final SmartArt m3357x1() {
        return (SmartArt) this.f2127h4;
    }

    /* JADX INFO: renamed from: kk */
    private C8030jq m3342kk(String str) {
        for (C8030jq c8030jq : m3357x1().mo272to().m63502k4().m44943kk()) {
            if (C14113y2.m67363du(c8030jq.m34878k4(), str)) {
                return c8030jq;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private C7438ct m3343x1(String str) {
        for (C7438ct c7438ct : m3357x1().mo272to().m63499du().m45521to()) {
            if (C14113y2.m67363du(c7438ct.m29802k4(), str)) {
                return c7438ct;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final bay m3349k4(String str) {
        List.Enumerator<bay> it = this.f3834kk.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (C14113y2.m67363du(next.m5144ks(), str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private C7394ca m3337k4(C7452d0 c7452d0, int i, int i2) {
        C7394ca c7394ca;
        C12003du c12003duM1082kk;
        C12003du c12003duClone = C12003du.f40505to.Clone();
        if (c7452d0.m29997k4() != 0) {
            if (c7452d0.m29998x1().size() > 1) {
                ColorFormat colorFormatM3336k4 = m3336k4(c7452d0.m29998x1().get_Item(0));
                ColorFormat colorFormatM3336k42 = m3336k4(c7452d0.m29998x1().get_Item(1));
                if (c7452d0.m29997k4() == 2) {
                    c12003duM1082kk = m3344x1(colorFormatM3336k4, colorFormatM3336k42, i, i2);
                } else if (c7452d0.m29997k4() == 1) {
                    c12003duM1082kk = m3338k4(colorFormatM3336k4, colorFormatM3336k42, i, i2);
                } else {
                    c7394ca = c7452d0.m29998x1().get_Item(i % c7452d0.m29998x1().size());
                }
                c12003duM1082kk.CloneTo(c12003duClone);
            } else if (c7452d0.m29998x1().size() > 0) {
                c7394ca = c7452d0.m29998x1().get_Item(0);
            }
            c12003duM1082kk = m3336k4(c7394ca).m1082kk(m3357x1().getSlide(), null);
            c12003duM1082kk.CloneTo(c12003duClone);
        }
        if (C12003du.m56403k4(c12003duClone, C12003du.f40505to)) {
            return null;
        }
        C7670fk c7670fk = new C7670fk();
        c7670fk.m31802k4(((long) (((c12003duClone.m56507jd() & 255) << 16) | ((c12003duClone.m56502ck() & 255) << 8) | (c12003duClone.m56505fa() & 255))) & 4294967295L);
        if ((c12003duClone.m56501c5() & 255) != 255) {
            C8082kf c8082kf = new C8082kf();
            c8082kf.m35326k4((float) ((((double) (255 & c12003duClone.m56501c5())) * 100.0d) / 255.0d));
            c7670fk.m31803k4(new C7394ca("alpha", c8082kf));
        }
        return new C7394ca("srgbClr", c7670fk);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [double, int] */
    /* JADX WARN: Type inference failed for: r13v4, types: [int, java.lang.StringBuffer] */
    /* JADX INFO: renamed from: x1 */
    private C12003du m3344x1(ColorFormat colorFormat, ColorFormat colorFormat2, int i, int i2) {
        int i3 = i;
        C14321pz c14321pzM1086x1 = colorFormat.m1086x1(m3357x1().getSlide());
        C14321pz c14321pzM1086x12 = colorFormat2.m1086x1(m3357x1().getSlide());
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        float[] fArr3 = {0.0f};
        ColorFormat.m1063k4(c14321pzM1086x1.f48208x1, c14321pzM1086x1.f48206kk, c14321pzM1086x1.f48207to, fArr, fArr2, fArr3);
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr3[0];
        float[] fArr4 = {0.0f};
        float[] fArr5 = {0.0f};
        float[] fArr6 = {0.0f};
        ColorFormat.m1063k4(c14321pzM1086x12.f48208x1, c14321pzM1086x12.f48206kk, c14321pzM1086x12.f48207to, fArr4, fArr5, fArr6);
        float f4 = fArr4[0];
        float f5 = fArr5[0];
        float f6 = fArr6[0];
        ?? Append = StringBuffer.append((int) (i2 / 2.0f));
        boolean z = i3 >= Append;
        if (z) {
            i3 = (i3 - Append) + (i2 % 2);
        }
        float f7 = Append != 0 ? i3 / ((float) Append) : 0.0f;
        float f8 = z ? 1.0f - f7 : f7;
        if (!z) {
            f7 = 1.0f - f7;
        }
        C14321pz c14321pzM1065to = ColorFormat.m1065to((f4 * f8) + (f * f7), (f5 * f8) + (f2 * f7), (f6 * f8) + (f3 * f7));
        c14321pzM1065to.f48205k4 = (f8 * c14321pzM1086x12.f48205k4) + (f7 * c14321pzM1086x1.f48205k4);
        return c14321pzM1065to.m69339k4();
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du m3338k4(ColorFormat colorFormat, ColorFormat colorFormat2, int i, int i2) {
        if (i2 == 0) {
            return colorFormat.m1084to();
        }
        C14321pz c14321pzM1086x1 = colorFormat.m1086x1(m3357x1().getSlide());
        C14321pz c14321pzM1086x12 = colorFormat2.m1086x1(m3357x1().getSlide());
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        float[] fArr3 = {0.0f};
        ColorFormat.m1063k4(c14321pzM1086x1.f48208x1, c14321pzM1086x1.f48206kk, c14321pzM1086x1.f48207to, fArr, fArr2, fArr3);
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr3[0];
        float[] fArr4 = {0.0f};
        float[] fArr5 = {0.0f};
        float[] fArr6 = {0.0f};
        ColorFormat.m1063k4(c14321pzM1086x12.f48208x1, c14321pzM1086x12.f48206kk, c14321pzM1086x12.f48207to, fArr4, fArr5, fArr6);
        float f4 = fArr4[0];
        float f5 = fArr5[0];
        float f6 = fArr6[0];
        int i3 = i2 - 1;
        float f7 = i3 != 0 ? i / i3 : 0.0f;
        float f8 = 1.0f - f7;
        C14321pz c14321pzM1065to = ColorFormat.m1065to((f4 * f7) + (f * f8), (f5 * f7) + (f2 * f8), (f6 * f7) + (f3 * f8));
        c14321pzM1065to.f48205k4 = (f7 * c14321pzM1086x12.f48205k4) + (f8 * c14321pzM1086x1.f48205k4);
        return c14321pzM1065to.m69339k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final m6r m3350k4() {
        return this.f3833k4;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m3339k4(List<z2c> list) {
        Dictionary dictionary = new Dictionary();
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                z2c next = it.next();
                String strM64784to = next.m74243k4().m4099m9().m64784to();
                if (C14113y2.m67411k4(strM64784to)) {
                    strM64784to = m3345x1(next.m74243k4());
                }
                next.m74243k4().m5147up().m71873kk().m28373kk(strM64784to);
                if (dictionary.containsKey(strM64784to)) {
                    ((List) dictionary.get_Item(strM64784to)).addItem(next.m74243k4());
                } else {
                    List list2 = new List();
                    list2.addItem(next.m74243k4());
                    dictionary.addItem(strM64784to, list2);
                }
                next.m74243k4().m5147up().m71873kk().m28368k4(-1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        Dictionary.ValueCollection.Enumerator it2 = dictionary.getValues().iterator();
        while (it2.hasNext()) {
            try {
                List list3 = (List) it2.next();
                int i = 0;
                for (int i2 = 0; i2 < list3.size(); i2++) {
                    bay bayVar = (bay) list3.get_Item(i2);
                    if (bayVar.m5147up().m71873kk().m28353du() == -1) {
                        bayVar.m5147up().m71873kk().m28368k4(i);
                        C14244on c14244onM4073du = bayVar.m4076h4().size() > 0 ? bayVar.m4076h4().get_Item(0) : bayVar.m4073du();
                        if (c14244onM4073du.m5149yj() == 3) {
                            bay bayVarM4102to = bayVar.m4102to();
                            if (bayVarM4102to != null && ((bayVarM4102to.m4076h4().containsItem(c14244onM4073du) || bayVarM4102to.m4073du() == c14244onM4073du) && bayVarM4102to.m4074dy().m74287x6())) {
                                bayVarM4102to.m5147up().m71873kk().m28368k4(i);
                            }
                        } else {
                            it = list3.iterator();
                            while (it.hasNext()) {
                                try {
                                    bay bayVar2 = (bay) it.next();
                                    if (bayVar2 != bayVar && (bayVar2.m4076h4().containsItem(c14244onM4073du) || bayVar2.m4073du() == c14244onM4073du)) {
                                        bayVar2.m5147up().m71873kk().m28368k4(i);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                        i++;
                    }
                }
                List.Enumerator it3 = list3.iterator();
                while (it3.hasNext()) {
                    try {
                        ((bay) it3.next()).m5147up().m71873kk().m28390x1(i);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3351k4(SmartArtNode smartArtNode) {
        smartArtNode.m2797k4(this.f3834kk);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3340k4(bay bayVar) {
        byte b;
        C8740s4 c8740s4M39498x1;
        long jM40765k4;
        C8740s4 c8740s4M39495k4;
        long jM40765k42;
        z2c z2cVarM4074dy = bayVar.m4074dy();
        SmartArtShape smartArtShapeM74280x1 = z2cVarM4074dy.m74280x1();
        boolean zM74240ix = z2cVarM4074dy.m74240ix();
        String strM28380to = bayVar.m5147up().m71873kk().m28380to();
        String strM3345x1 = m3345x1(bayVar);
        C7438ct c7438ctM3343x1 = m3343x1(strM28380to);
        if (c7438ctM3343x1 == null) {
            c7438ctM3343x1 = m3343x1(strM3345x1);
        }
        C8030jq c8030jqM3342kk = m3342kk(strM28380to);
        if (c8030jqM3342kk == null) {
            c8030jqM3342kk = m3342kk(strM3345x1);
        }
        if (c7438ctM3343x1 == null || c8030jqM3342kk == null) {
            return;
        }
        C7394ca c7394caM40769x1 = c7438ctM3343x1.m29803x1().m39498x1().m40769x1();
        C7394ca c7394caM40769x12 = c7438ctM3343x1.m29803x1().m39495k4().m40769x1();
        C7394ca c7394caM32942x1 = c7438ctM3343x1.m29803x1().m39497to().m32942x1();
        long jM40765k43 = c7438ctM3343x1.m29803x1().m39498x1().m40765k4();
        long jM40765k44 = c7438ctM3343x1.m29803x1().m39495k4().m40765k4();
        byte bM32938k4 = c7438ctM3343x1.m29803x1().m39497to().m32938k4();
        int iM28353du = bayVar.m5147up().m71873kk().m28353du();
        int iM28360h4 = bayVar.m5147up().m71873kk().m28360h4();
        C8601qh c8601qhM28387wl = smartArtShapeM74280x1.m2822wl().m71873kk().m28387wl();
        if (c8601qhM28387wl == null) {
            b = bM32938k4;
            if (c8030jqM3342kk.m34881x1() != null) {
                C7394ca c7394caM3337k4 = m3337k4(c8030jqM3342kk.m34881x1(), iM28353du, iM28360h4);
                if (c7394caM3337k4 != null) {
                    c7438ctM3343x1.m29803x1().m39498x1().m40768k4(c7394caM3337k4);
                }
                if (zM74240ix) {
                    c8740s4M39498x1 = c7438ctM3343x1.m29803x1().m39498x1();
                    jM40765k4 = 0;
                }
            }
            if (c8601qhM28387wl != null) {
                if (c8030jqM3342kk.m34879kk() != null) {
                    C7394ca c7394caM3337k42 = m3337k4((zM74240ix && (c7438ctM3343x1.m29803x1().m39495k4().m40765k4() & 4294967295L) == 0) ? c8030jqM3342kk.m34881x1() : c8030jqM3342kk.m34879kk(), iM28353du, iM28360h4);
                    if (c7394caM3337k42 != null) {
                        c7438ctM3343x1.m29803x1().m39495k4().m40768k4(c7394caM3337k42);
                        if (zM74240ix && (c7438ctM3343x1.m29803x1().m39495k4().m40765k4() & 4294967295L) == 0) {
                            c8740s4M39495k4 = c7438ctM3343x1.m29803x1().m39495k4();
                            jM40765k42 = 1;
                        }
                    }
                }
                if (c8030jqM3342kk.m34880to() != null) {
                    C7394ca c7394caM3337k43 = m3337k4(c8030jqM3342kk.m34880to(), iM28353du, iM28360h4);
                    if (c7394caM3337k43 != null || smartArtShapeM74280x1.getShapeType() == 8) {
                        c7438ctM3343x1.m29803x1().m39497to().m32941k4(c7394caM3337k43);
                    } else if (c8601qhM28387wl != null) {
                        c7438ctM3343x1.m29803x1().m39497to().m32941k4(c8601qhM28387wl.m39497to().m32942x1());
                        c7438ctM3343x1.m29803x1().m39497to().m32940k4(c8601qhM28387wl.m39497to().m32938k4());
                    }
                } else if (c8601qhM28387wl != null) {
                }
                tgm.m71152k4(smartArtShapeM74280x1, c7438ctM3343x1.m29803x1());
                c7438ctM3343x1.m29803x1().m39498x1().m40768k4(c7394caM40769x1);
                c7438ctM3343x1.m29803x1().m39495k4().m40768k4(c7394caM40769x12);
                c7438ctM3343x1.m29803x1().m39497to().m32941k4(c7394caM32942x1);
                c7438ctM3343x1.m29803x1().m39498x1().m40767k4(jM40765k43);
                c7438ctM3343x1.m29803x1().m39495k4().m40767k4(jM40765k44);
                c7438ctM3343x1.m29803x1().m39497to().m32940k4(b);
            }
            c7438ctM3343x1.m29803x1().m39495k4().m40768k4(c8601qhM28387wl.m39495k4().m40769x1());
            c8740s4M39495k4 = c7438ctM3343x1.m29803x1().m39495k4();
            jM40765k42 = c8601qhM28387wl.m39495k4().m40765k4();
            c8740s4M39495k4.m40767k4(jM40765k42);
            if (c8030jqM3342kk.m34880to() != null) {
            }
            tgm.m71152k4(smartArtShapeM74280x1, c7438ctM3343x1.m29803x1());
            c7438ctM3343x1.m29803x1().m39498x1().m40768k4(c7394caM40769x1);
            c7438ctM3343x1.m29803x1().m39495k4().m40768k4(c7394caM40769x12);
            c7438ctM3343x1.m29803x1().m39497to().m32941k4(c7394caM32942x1);
            c7438ctM3343x1.m29803x1().m39498x1().m40767k4(jM40765k43);
            c7438ctM3343x1.m29803x1().m39495k4().m40767k4(jM40765k44);
            c7438ctM3343x1.m29803x1().m39497to().m32940k4(b);
        }
        c7438ctM3343x1.m29803x1().m39498x1().m40768k4(c8601qhM28387wl.m39498x1().m40769x1());
        c8740s4M39498x1 = c7438ctM3343x1.m29803x1().m39498x1();
        b = bM32938k4;
        jM40765k4 = c8601qhM28387wl.m39498x1().m40765k4();
        c8740s4M39498x1.m40767k4(jM40765k4);
        if (c8601qhM28387wl != null) {
        }
        c8740s4M39495k4.m40767k4(jM40765k42);
        if (c8030jqM3342kk.m34880to() != null) {
        }
        tgm.m71152k4(smartArtShapeM74280x1, c7438ctM3343x1.m29803x1());
        c7438ctM3343x1.m29803x1().m39498x1().m40768k4(c7394caM40769x1);
        c7438ctM3343x1.m29803x1().m39495k4().m40768k4(c7394caM40769x12);
        c7438ctM3343x1.m29803x1().m39497to().m32941k4(c7394caM32942x1);
        c7438ctM3343x1.m29803x1().m39498x1().m40767k4(jM40765k43);
        c7438ctM3343x1.m29803x1().m39495k4().m40767k4(jM40765k44);
        c7438ctM3343x1.m29803x1().m39497to().m32940k4(b);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m3345x1(bay bayVar) {
        C6765kp c6765kp = new C6765kp();
        C14244on c14244onM4073du = bayVar.m4076h4().size() > 0 ? bayVar.m4076h4().get_Item(0) : bayVar.m4073du();
        int iM5149yj = c14244onM4073du.m5149yj();
        c6765kp.m26792k4(iM5149yj != 2 ? iM5149yj != 5 ? iM5149yj != 6 ? "node" : "sibTrans" : "parChTrans" : "asst");
        if (c14244onM4073du.m5149yj() == 6 || bayVar.m4073du().m5149yj() == 5) {
            c6765kp.m26792k4(bayVar.m4077jd().mo3649kk() ? "2D" : "1D");
        }
        int iM5146rv = c14244onM4073du.m5146rv();
        if (iM5146rv > 0 && c14244onM4073du.m5149yj() == 2) {
            iM5146rv--;
        } else if (iM5146rv == 0 && c14244onM4073du.m5149yj() == 3) {
            iM5146rv = 1;
        }
        c6765kp.m26805kk(C14116yg.m67507x1(4, iM5146rv));
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3341k4(bay bayVar, List<bay> list, boolean z) {
        List.Enumerator<bay> it;
        list.addItem(bayVar);
        if (!z) {
            it = bayVar.m4110x1().iterator();
            while (it.hasNext()) {
                try {
                    m3341k4(it.next(), list, z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
                return;
            }
            return;
        }
        List.Enumerator<bay> it2 = bayVar.m4110x1().iterator();
        while (it2.hasNext()) {
            try {
                bay next = it2.next();
                if (!next.m4074dy().m74287x6() || !C7019kk.m27469x1(next.m4077jd(), cpm.class)) {
                    m3341k4(next, list, z);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next2 = it.next();
                if (next2.m4074dy().m74287x6() && C7019kk.m27469x1(next2.m4077jd(), cpm.class)) {
                    m3341k4(next2, list, z);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3352k4(C1101fi c1101fi) {
        this.f3836x1.m5143k4(c1101fi);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3353k4(C14664v5 c14664v5) {
        this.f3836x1.mo4093k4(c14664v5);
    }
}
