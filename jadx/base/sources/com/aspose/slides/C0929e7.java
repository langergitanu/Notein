package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.e7 */
/* JADX INFO: loaded from: classes3.dex */
final class C0929e7 {

    /* JADX INFO: renamed from: c5 */
    private long f4710c5;

    /* JADX INFO: renamed from: dy */
    private ohe f4712dy;

    /* JADX INFO: renamed from: h4 */
    private GradientStopCollection f4713h4;

    /* JADX INFO: renamed from: m9 */
    private final bia f4716m9;

    /* JADX INFO: renamed from: jd */
    private static final float[] f4709jd = {0.05f, 0.1f, 0.2f, 0.3f, 0.4f};

    /* JADX INFO: renamed from: ck */
    private static final float[] f4707ck = {0.014f, 0.033f, 0.096f, 0.2f, 0.333f};

    /* JADX INFO: renamed from: fa */
    private static final float[][] f4708fa = {new float[]{0.0f, 0.0f, -1.0f, -1.0f, 2.0f, 2.0f}, new float[]{1.0f, 0.0f, 0.0f, -1.0f, 2.0f, 2.0f}, new float[]{0.0f, 1.0f, -1.0f, 0.0f, 2.0f, 2.0f}, new float[]{1.0f, 1.0f, 0.0f, 0.0f, 2.0f, 2.0f}, new float[]{0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 1.0f}};

    /* JADX INFO: renamed from: k4 */
    private int f4714k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private float f4718x1 = Float.NaN;

    /* JADX INFO: renamed from: kk */
    private byte f4715kk = -1;

    /* JADX INFO: renamed from: to */
    private byte f4717to = -1;

    /* JADX INFO: renamed from: du */
    private int f4711du = -1;

    public C0929e7(GradientStopCollection gradientStopCollection, bia biaVar) {
        this.f4712dy = new ohe();
        this.f4713h4 = gradientStopCollection;
        this.f4716m9 = biaVar;
        this.f4712dy = new ohe(oju.f47834kk.Clone(), oju.f47835to.Clone());
    }

    /* JADX INFO: renamed from: c5 */
    private void m5356c5() {
        int i;
        oju ojuVarClone = this.f4712dy.f47808k4.Clone();
        oju ojuVar = this.f4712dy.f47809x1;
        if (ojuVar.f47836k4 == 0.0f && ojuVar.f47837x1 == 0.0f) {
            float f = ojuVarClone.f47836k4;
            if (f == 0.0f) {
                float f2 = ojuVarClone.f47837x1;
                if (f2 == 0.0f) {
                    i = 0;
                } else {
                    if (f2 == 1.0f) {
                        i = 2;
                    }
                    this.f4711du = -1;
                }
                this.f4711du = i;
            } else if (f == 1.0f) {
                float f3 = ojuVarClone.f47837x1;
                if (f3 == 0.0f) {
                    i = 1;
                } else {
                    if (f3 == 1.0f) {
                        i = 3;
                    }
                    this.f4711du = -1;
                }
                this.f4711du = i;
            } else {
                if (f == 0.5f && ojuVarClone.f47837x1 == 0.5f) {
                    i = 4;
                    this.f4711du = i;
                }
                this.f4711du = -1;
            }
        } else {
            this.f4711du = -1;
        }
        m5357dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m5357dy() {
        this.f4710c5++;
    }

    /* JADX INFO: renamed from: kk */
    private static float m5358kk(float f) {
        return (float) C14116yg.m67469du(f, 2.200000047683716d);
    }

    /* JADX INFO: renamed from: x1 */
    private static float m5359x1(float f) {
        return (float) C14116yg.m67469du(f, 0.45454543828964233d);
    }

    /* JADX INFO: renamed from: du */
    public final byte m5360du() {
        return this.f4715kk;
    }

    public boolean equals(Object obj) {
        IGradientFormat iGradientFormat = (IGradientFormat) C7019kk.m27452k4(obj, IGradientFormat.class);
        if (iGradientFormat == null) {
            return super.equals(obj);
        }
        if (m5371kk() != iGradientFormat.getGradientDirection() || this.f4717to != iGradientFormat.getGradientShape()) {
            return false;
        }
        byte b = this.f4717to;
        if (b != 0) {
            return !(b == 1 || b == 2) || m5371kk() == iGradientFormat.getGradientDirection();
        }
        if (this.f4718x1 != iGradientFormat.getLinearGradientAngle() || this.f4715kk != iGradientFormat.getLinearGradientScaled() || this.f4714k4 != iGradientFormat.getTileFlip() || this.f4713h4.size() != iGradientFormat.getGradientStops().size()) {
            return false;
        }
        for (int i = 0; i < this.f4713h4.size(); i++) {
            if (!this.f4713h4.get_Item(i).equals(iGradientFormat.getGradientStops().get_Item(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m5361h4() {
        return this.f4717to;
    }

    public int hashCode() {
        return 23456;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final SortedList<Float, C12003du> m5362k4(IBaseSlide iBaseSlide) {
        ColorFormat colorFormat = null;
        if (this.f4713h4.size() < 2) {
            return null;
        }
        SortedList sortedList = new SortedList();
        IGenericEnumerator<IGradientStop> it = this.f4713h4.iterator();
        float position = -1.0f;
        while (it.hasNext()) {
            try {
                GradientStop gradientStop = (GradientStop) it.next();
                if (!sortedList.containsKey(Float.valueOf(gradientStop.getPosition()))) {
                    sortedList.addItem(Float.valueOf(gradientStop.getPosition()), ((ColorFormat) gradientStop.getColor()).m1086x1(iBaseSlide));
                }
                if (gradientStop.getPosition() >= position) {
                    position = gradientStop.getPosition();
                    colorFormat = (ColorFormat) gradientStop.getColor();
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
        float f = 1.0f;
        if (((Float) sortedList.getKeys().get_Item(sortedList.size() - 1)).floatValue() < 1.0f) {
            sortedList.addItem(Float.valueOf(1.0f), colorFormat.m1086x1(iBaseSlide));
        }
        if (sortedList.size() == 1) {
            sortedList.addItem(Float.valueOf(0.0f), sortedList.getValues().get_Item(0));
        }
        if (this.f4713h4.size() == 2 && sortedList.size() == 2 && ((Float) sortedList.getKeys().get_Item(0)).floatValue() == 0.0f && ((Float) sortedList.getKeys().get_Item(1)).floatValue() == 1.0f) {
            C14321pz c14321pz = (C14321pz) sortedList.getValues().get_Item(0);
            C14321pz c14321pz2 = (C14321pz) sortedList.getValues().get_Item(1);
            if (!c14321pz2.m69341k4(c14321pz)) {
                float fM5358kk = m5358kk(c14321pz.f48205k4);
                float fM5358kk2 = m5358kk(c14321pz.f48208x1);
                float fM5358kk3 = m5358kk(c14321pz.f48206kk);
                float fM5358kk4 = m5358kk(c14321pz.f48207to);
                float fM5358kk5 = m5358kk(c14321pz2.f48205k4);
                float fM5358kk6 = m5358kk(c14321pz2.f48208x1);
                float fM5358kk7 = m5358kk(c14321pz2.f48206kk);
                float fM5358kk8 = m5358kk(c14321pz2.f48207to);
                sortedList.setCapacity((f4707ck.length * 2) + 2);
                int i = 0;
                while (true) {
                    float[] fArr = f4707ck;
                    if (i >= fArr.length) {
                        break;
                    }
                    float[] fArr2 = f4709jd;
                    Float fValueOf = Float.valueOf(fArr2[i]);
                    float f2 = f;
                    float f3 = fM5358kk5 - fM5358kk;
                    float f4 = fM5358kk8;
                    float fM5359x1 = m5359x1((fArr[i] * f3) + fM5358kk);
                    int i2 = i;
                    float f5 = fM5358kk6 - fM5358kk2;
                    float f6 = fM5358kk5;
                    float fM5359x12 = m5359x1((fArr[i2] * f5) + fM5358kk2);
                    float f7 = fM5358kk6;
                    float f8 = fM5358kk7 - fM5358kk3;
                    float f9 = fM5358kk7;
                    float fM5359x13 = m5359x1((fArr[i2] * f8) + fM5358kk3);
                    float f10 = f4 - fM5358kk4;
                    sortedList.addItem(fValueOf, new C14321pz(fM5359x1, fM5359x12, fM5359x13, m5359x1((fArr[i2] * f10) + fM5358kk4)));
                    sortedList.addItem(Float.valueOf(f2 - fArr2[i2]), new C14321pz(m5359x1(OooOO0.OooO0OO.OooO0O0(f2, fArr[i2], f3, fM5358kk)), m5359x1(OooOO0.OooO0OO.OooO0O0(f2, fArr[i2], f5, fM5358kk2)), m5359x1(OooOO0.OooO0OO.OooO0O0(f2, fArr[i2], f8, fM5358kk3)), m5359x1(OooOO0.OooO0OO.OooO0O0(f2, fArr[i2], f10, fM5358kk4))));
                    i = i2 + 1;
                    fM5358kk8 = f4;
                    fM5358kk6 = f7;
                    fM5358kk5 = f6;
                    fM5358kk7 = f9;
                    f = 1.0f;
                }
            }
        } else if (this.f4713h4.size() == 3 && sortedList.size() == 3 && ((C14321pz) sortedList.getValues().get_Item(0)).m69341k4((C14321pz) sortedList.getValues().get_Item(2)) && ((Float) sortedList.getKeys().get_Item(0)).floatValue() == 0.0f && ((Float) sortedList.getKeys().get_Item(2)).floatValue() == 1.0f) {
            C14321pz c14321pz3 = (C14321pz) sortedList.getValues().get_Item(0);
            C14321pz c14321pz4 = (C14321pz) sortedList.getValues().get_Item(1);
            if (!c14321pz4.m69341k4(c14321pz3)) {
                float fM5358kk9 = m5358kk(c14321pz3.f48205k4);
                float fM5358kk10 = m5358kk(c14321pz3.f48208x1);
                float fM5358kk11 = m5358kk(c14321pz3.f48206kk);
                float fM5358kk12 = m5358kk(c14321pz3.f48207to);
                float fM5358kk13 = m5358kk(c14321pz4.f48205k4);
                float fM5358kk14 = m5358kk(c14321pz4.f48208x1);
                float fM5358kk15 = m5358kk(c14321pz4.f48206kk);
                float fM5358kk16 = m5358kk(c14321pz4.f48207to);
                sortedList.setCapacity((f4707ck.length * 2) + 2);
                float fFloatValue = ((Float) sortedList.getKeys().get_Item(1)).floatValue();
                int i3 = 0;
                while (true) {
                    float[] fArr3 = f4707ck;
                    if (i3 >= fArr3.length) {
                        break;
                    }
                    float[] fArr4 = f4709jd;
                    float f11 = fM5358kk13 - fM5358kk9;
                    float f12 = fM5358kk16;
                    float f13 = fFloatValue;
                    float f14 = fM5358kk14 - fM5358kk10;
                    int i4 = i3;
                    float f15 = fM5358kk13;
                    float f16 = fM5358kk15 - fM5358kk11;
                    float f17 = fM5358kk15;
                    float f18 = f12 - fM5358kk12;
                    sortedList.addItem(Float.valueOf(fArr4[i3] * fFloatValue), new C14321pz(m5359x1((fArr3[i3] * f11) + fM5358kk9), m5359x1((fArr3[i3] * f14) + fM5358kk10), m5359x1((fArr3[i4] * f16) + fM5358kk11), m5359x1((fArr3[i4] * f18) + fM5358kk12)));
                    sortedList.addItem(Float.valueOf((1.0f - fArr4[i4]) * f13), new C14321pz(m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f11, fM5358kk9)), m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f14, fM5358kk10)), m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f16, fM5358kk11)), m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f18, fM5358kk12))));
                    float f19 = 1.0f - f13;
                    sortedList.addItem(Float.valueOf(1.0f - (fArr4[i4] * f19)), new C14321pz(m5359x1((fArr3[i4] * f11) + fM5358kk9), m5359x1((fArr3[i4] * f14) + fM5358kk10), m5359x1((fArr3[i4] * f16) + fM5358kk11), m5359x1((fArr3[i4] * f18) + fM5358kk12)));
                    sortedList.addItem(Float.valueOf((f19 * fArr4[i4]) + f13), new C14321pz(m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f11, fM5358kk9)), m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f14, fM5358kk10)), m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f16, fM5358kk11)), m5359x1(OooOO0.OooO0OO.OooO0O0(1.0f, fArr3[i4], f18, fM5358kk12))));
                    i3 = i4 + 1;
                    fFloatValue = f13;
                    fM5358kk16 = f12;
                    fM5358kk13 = f15;
                    fM5358kk15 = f17;
                    fM5358kk14 = fM5358kk14;
                }
            }
        }
        SortedList<Float, C12003du> sortedList2 = new SortedList<>();
        for (int i5 = 0; i5 < sortedList.size(); i5++) {
            sortedList2.addItem(sortedList.getKeys().get_Item(i5), ((C14321pz) sortedList.getValues().get_Item(i5)).m69339k4().Clone());
        }
        return sortedList2;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m5372m9() {
        return ((((this.f4710c5 & 4294967295L) + (this.f4713h4.getVersion() & 4294967295L)) & 4294967295L) + (this.f4716m9.m4221kk() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    public final float m5373to() {
        return this.f4718x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final ohe m5363k4() {
        return this.f4712dy;
    }

    /* JADX INFO: renamed from: kk */
    public final int m5371kk() {
        return this.f4711du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m5374x1() {
        return this.f4714k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5364k4(byte b) {
        this.f4715kk = b;
        m5357dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5375x1(byte b) {
        this.f4717to = b;
        m5357dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5365k4(float f) {
        float f2 = f % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        this.f4718x1 = f2;
        m5357dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5376x1(int i) {
        if (this.f4711du == i) {
            return;
        }
        this.f4711du = i;
        if (i != -1) {
            float[][] fArr = f4708fa;
            float[] fArr2 = fArr[i];
            this.f4712dy = new ohe(fArr2[0], fArr2[1], 0.0f, 0.0f);
            bia biaVar = this.f4716m9;
            float[] fArr3 = fArr[i];
            biaVar.m4220k4(new ohe(fArr3[2], fArr3[3], fArr3[4], fArr3[5]));
        }
        m5357dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5366k4(int i) {
        this.f4714k4 = i;
        m5357dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5377x1(GradientFormat gradientFormat) {
        this.f4714k4 = gradientFormat.getTileFlip();
        this.f4718x1 = gradientFormat.getLinearGradientAngle();
        this.f4715kk = gradientFormat.getLinearGradientScaled();
        this.f4717to = gradientFormat.getGradientShape();
        this.f4711du = gradientFormat.getGradientDirection();
        this.f4716m9.m4219k4(gradientFormat.m1613to());
        gradientFormat.m1605h4().CloneTo(this.f4712dy);
        this.f4713h4.m1623h4();
        IGenericEnumerator<IGradientStop> it = gradientFormat.getGradientStops().iterator();
        while (it.hasNext()) {
            try {
                ((GradientStop) this.f4713h4.m1622du()).m1618k4((GradientStop) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5367k4(GradientFormat gradientFormat) {
        m5377x1(gradientFormat);
        m5357dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5368k4(IGradientFormatEffectiveData iGradientFormatEffectiveData) {
        this.f4714k4 = iGradientFormatEffectiveData.getTileFlip();
        this.f4718x1 = iGradientFormatEffectiveData.getLinearGradientAngle();
        this.f4715kk = iGradientFormatEffectiveData.getLinearGradientScaled() ? (byte) 1 : (byte) 0;
        this.f4717to = iGradientFormatEffectiveData.getGradientShape();
        this.f4713h4.clear();
        IGenericEnumerator<IGradientStopEffectiveData> it = iGradientFormatEffectiveData.getGradientStops().iterator();
        while (it.hasNext()) {
            try {
                ((GradientStop) this.f4713h4.m1628to()).m1619k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int gradientDirection = iGradientFormatEffectiveData.getGradientDirection();
        this.f4711du = gradientDirection;
        if (gradientDirection != -1) {
            float[][] fArr = f4708fa;
            float[] fArr2 = fArr[gradientDirection];
            this.f4712dy = new ohe(fArr2[0], fArr2[1], 0.0f, 0.0f);
            bia biaVar = this.f4716m9;
            float[] fArr3 = fArr[gradientDirection];
            biaVar.m4220k4(new ohe(fArr3[2], fArr3[3], fArr3[4], fArr3[5]));
        }
        m5357dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5369k4(IGradientStopCollection iGradientStopCollection) {
        this.f4713h4 = (GradientStopCollection) iGradientStopCollection;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5370k4(ohe oheVar) {
        oheVar.CloneTo(this.f4712dy);
        m5356c5();
        m5357dy();
    }
}
