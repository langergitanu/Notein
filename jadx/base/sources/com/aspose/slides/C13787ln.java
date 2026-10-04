package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ln */
/* JADX INFO: loaded from: classes3.dex */
final class C13787ln extends AbstractC1137ga<GradientFormat, C13787ln> implements IGradientFormatEffectiveData {

    /* JADX INFO: renamed from: du */
    byte f46043du;

    /* JADX INFO: renamed from: dy */
    private bia f46044dy;

    /* JADX INFO: renamed from: h4 */
    private GradientStopCollectionEffectiveData f46045h4;

    /* JADX INFO: renamed from: k4 */
    int f46046k4;

    /* JADX INFO: renamed from: kk */
    float f46047kk;

    /* JADX INFO: renamed from: m9 */
    private bia f46048m9;

    /* JADX INFO: renamed from: to */
    boolean f46049to;

    /* JADX INFO: renamed from: x1 */
    int f46050x1;

    /* JADX INFO: renamed from: c5 */
    private static final float[] f46040c5 = {0.05f, 0.1f, 0.2f, 0.3f, 0.4f};

    /* JADX INFO: renamed from: jd */
    private static final float[] f46042jd = {0.014f, 0.033f, 0.096f, 0.2f, 0.333f};

    /* JADX INFO: renamed from: ck */
    private static final float[] f46041ck = {0.0f, 0.1f, 0.5f, 1.0f};

    public C13787ln() {
        GradientStopCollectionEffectiveData gradientStopCollectionEffectiveData = new GradientStopCollectionEffectiveData();
        this.f46045h4 = gradientStopCollectionEffectiveData;
        gradientStopCollectionEffectiveData.m1631k4();
        this.f46048m9 = new bia();
        this.f46044dy = new bia();
        this.f46050x1 = -1;
    }

    /* JADX INFO: renamed from: k4 */
    private double m64473k4(double d) {
        double d2 = d * d;
        return C14116yg.m67477k4(o000oOoO.OooO00o(d, 1.8616d, (d2 * (-0.7808d)) + (d2 * d * (-0.0826d)), 0.0022d), 3);
    }

    /* JADX INFO: renamed from: x1 */
    private static float m64481x1(float f) {
        return (float) C14116yg.m67469du(f, 2.200000047683716d);
    }

    /* JADX INFO: renamed from: du */
    public final SortedList<Float, C12003du> m64484du() {
        SortedList<Float, C12003du> sortedList = new SortedList<>();
        if (this.f46045h4.size() == 0) {
            sortedList.addItem(Float.valueOf(0.0f), C12003du.m56460uz().Clone());
            sortedList.addItem(Float.valueOf(1.0f), C12003du.m56385i5().Clone());
        }
        return sortedList;
    }

    @Override // com.aspose.slides.IGradientFormatEffectiveData
    public final int getGradientDirection() {
        return this.f46050x1;
    }

    @Override // com.aspose.slides.IGradientFormatEffectiveData
    public final byte getGradientShape() {
        return this.f46043du;
    }

    @Override // com.aspose.slides.IGradientFormatEffectiveData
    public final IGradientStopCollectionEffectiveData getGradientStops() {
        return this.f46045h4;
    }

    @Override // com.aspose.slides.IGradientFormatEffectiveData
    public final float getLinearGradientAngle() {
        return this.f46047kk;
    }

    @Override // com.aspose.slides.IGradientFormatEffectiveData
    public final boolean getLinearGradientScaled() {
        return this.f46049to;
    }

    @Override // com.aspose.slides.IGradientFormatEffectiveData
    public final int getTileFlip() {
        return this.f46046k4;
    }

    /* JADX INFO: renamed from: kk */
    public final bia m64490kk() {
        return this.f46044dy;
    }

    /* JADX INFO: renamed from: to */
    public final SortedList<Float, C12003du> m64491to() {
        return m64485k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m64474k4(float f) {
        return (float) C14116yg.m67469du(f, 0.45454543828964233d);
    }

    /* JADX INFO: renamed from: x1 */
    private static float m64482x1(float f, float f2) {
        return (float) C14116yg.m67469du(f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m64475k4(float f, float f2) {
        return (float) C14116yg.m67469du(f, f2);
    }

    /* JADX INFO: renamed from: x1 */
    private SortedList<Float, C12003du> m64483x1(C12003du c12003du, C12003du c12003du2) {
        SortedList<Float, C12003du> sortedList = new SortedList<>();
        float fM56501c5 = (c12003du.m56501c5() & 255) / 255.0f;
        float fM64481x1 = m64481x1((c12003du.m56507jd() & 255) / 255.0f);
        float fM64481x12 = m64481x1((c12003du.m56502ck() & 255) / 255.0f);
        float fM64481x13 = m64481x1((c12003du.m56505fa() & 255) / 255.0f);
        float fM56501c52 = (c12003du2.m56501c5() & 255) / 255.0f;
        float fM64481x14 = m64481x1((c12003du2.m56507jd() & 255) / 255.0f);
        float fM64481x15 = m64481x1((c12003du2.m56502ck() & 255) / 255.0f);
        float fM64481x16 = m64481x1((c12003du2.m56505fa() & 255) / 255.0f);
        int i = 0;
        while (true) {
            float[] fArr = f46042jd;
            if (i >= fArr.length) {
                return sortedList;
            }
            float[] fArr2 = f46040c5;
            Float fValueOf = Float.valueOf(fArr2[i]);
            float f = fM56501c52 - fM56501c5;
            float f2 = (fArr2[i] * f) + fM56501c5;
            float f3 = fM64481x16;
            float f4 = fM64481x14 - fM64481x1;
            float f5 = fM56501c52;
            float fM64474k4 = m64474k4((fArr[i] * f4) + fM64481x1);
            float f6 = fM64481x14;
            float f7 = fM64481x15 - fM64481x12;
            float f8 = fM64481x15;
            float fM64474k42 = m64474k4((fArr[i] * f7) + fM64481x12);
            int i2 = i;
            float f9 = f3 - fM64481x13;
            sortedList.addItem(fValueOf, new C14321pz(f2, fM64474k4, fM64474k42, m64474k4((fArr[i2] * f9) + fM64481x13)).m69339k4().Clone());
            sortedList.addItem(Float.valueOf(1.0f - fArr2[i2]), new C14321pz(OooOO0.OooO0OO.OooO0O0(1.0f, fArr2[i2], f, fM56501c5), m64474k4(OooOO0.OooO0OO.OooO0O0(1.0f, fArr[i2], f4, fM64481x1)), m64474k4(OooOO0.OooO0OO.OooO0O0(1.0f, fArr[i2], f7, fM64481x12)), m64474k4(OooOO0.OooO0OO.OooO0O0(1.0f, fArr[i2], f9, fM64481x13))).m69339k4().Clone());
            i = i2 + 1;
            fM64481x16 = f3;
            fM64481x14 = f6;
            fM56501c52 = f5;
            fM64481x15 = f8;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private List<Double> m64476k4(float[] fArr, int i) {
        List<Double> list = new List<>();
        int iM67483k4 = i;
        for (int i2 = 0; i2 < fArr.length - 1; i2++) {
            m64480k4(list, fArr[i2], fArr[r9], iM67483k4);
            iM67483k4 = C14116yg.m67483k4(iM67483k4 / 2, 2);
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final bia m64492x1() {
        return this.f46048m9;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x002f A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SortedList<Float, C12003du> m64485k4(int i) {
        float f;
        float f2;
        boolean zM27456k4;
        Float fValueOf;
        C12003du c12003duClone;
        if (this.f46045h4.size() == 0) {
            return m64484du();
        }
        if (this.f46045h4.size() < 2) {
            return null;
        }
        SortedList<Float, C12003du> sortedList = new SortedList<>();
        C12003du c12003duClone2 = C12003du.f40505to.Clone();
        IGenericEnumerator<IGradientStopEffectiveData> it = this.f46045h4.iterator();
        float position = -1.0f;
        while (it.hasNext()) {
            try {
                GradientStopEffectiveData gradientStopEffectiveData = (GradientStopEffectiveData) it.next();
                if (sortedList.containsKey(Float.valueOf(gradientStopEffectiveData.getPosition()))) {
                    if (gradientStopEffectiveData.getPosition() <= 1.0E-6f) {
                        sortedList.set_Item(Float.valueOf(gradientStopEffectiveData.getPosition()), gradientStopEffectiveData.m1634k4().Clone());
                    } else if (gradientStopEffectiveData.getPosition() != 0.0f && gradientStopEffectiveData.getPosition() != 1.0f && C12003du.m56476x1(sortedList.get_Item(Float.valueOf(gradientStopEffectiveData.getPosition())), gradientStopEffectiveData.m1634k4())) {
                        fValueOf = Float.valueOf(gradientStopEffectiveData.getPosition() + 1.0E-7f);
                        c12003duClone = gradientStopEffectiveData.m1634k4().Clone();
                    }
                    if (gradientStopEffectiveData.getPosition() < position) {
                        position = gradientStopEffectiveData.getPosition();
                        gradientStopEffectiveData.m1634k4().CloneTo(c12003duClone2);
                    }
                } else {
                    fValueOf = Float.valueOf(gradientStopEffectiveData.getPosition());
                    c12003duClone = gradientStopEffectiveData.m1634k4().Clone();
                }
                sortedList.addItem(fValueOf, c12003duClone);
                if (gradientStopEffectiveData.getPosition() < position) {
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
        if (sortedList.getKeys().get_Item(sortedList.size() - 1).floatValue() < 1.0f) {
            sortedList.addItem(Float.valueOf(1.0f), c12003duClone2.Clone());
        }
        if (sortedList.size() == 1) {
            sortedList.addItem(Float.valueOf(0.0f), sortedList.getValues().get_Item(0).Clone());
        }
        if (this.f46045h4.size() != 2 || sortedList.size() != 2 || sortedList.getKeys().get_Item(0).floatValue() != 0.0f || sortedList.getKeys().get_Item(1).floatValue() != 1.0f) {
            if (this.f46045h4.size() == 3 && sortedList.size() == 3 && sortedList.getValues().get_Item(0).equals(sortedList.getValues().get_Item(2).Clone()) && sortedList.getKeys().get_Item(0).floatValue() == 0.0f && sortedList.getKeys().get_Item(2).floatValue() == 1.0f) {
                C12003du c12003duClone3 = sortedList.getValues().get_Item(0).Clone();
                C12003du c12003duClone4 = sortedList.getValues().get_Item(1).Clone();
                if (!c12003duClone4.equals(c12003duClone3.Clone())) {
                    float[] fArr = f46042jd;
                    sortedList.setCapacity((fArr.length * 2) + 2);
                    float fFloatValue = sortedList.getKeys().get_Item(1).floatValue();
                    float[] fArr2 = (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr).deepClone(), float[].class);
                    float[] fArr3 = f46040c5;
                    float[] fArr4 = (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr3).deepClone(), float[].class);
                    if ((c12003duClone4.m56501c5() & 255) < 255) {
                        fArr2 = (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr3).deepClone(), float[].class);
                        fArr4 = (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr3).deepClone(), float[].class);
                        f = 1.0f;
                        f2 = 1.0f;
                    } else {
                        f = 2.2f;
                        f2 = 0.45454544f;
                    }
                    float fM56501c5 = (c12003duClone3.m56501c5() & 255) / 255.0f;
                    float fM64482x1 = m64482x1((c12003duClone3.m56507jd() & 255) / 255.0f, f);
                    float fM64482x12 = m64482x1((c12003duClone3.m56502ck() & 255) / 255.0f, f);
                    float fM64482x13 = m64482x1((c12003duClone3.m56505fa() & 255) / 255.0f, f);
                    float fM56501c52 = (c12003duClone4.m56501c5() & 255) / 255.0f;
                    float fM64482x14 = m64482x1((c12003duClone4.m56507jd() & 255) / 255.0f, f);
                    float f3 = 1.0f;
                    float fM64482x15 = m64482x1((c12003duClone4.m56502ck() & 255) / 255.0f, f);
                    float fM64482x16 = m64482x1((c12003duClone4.m56505fa() & 255) / 255.0f, f);
                    int i2 = 0;
                    while (i2 < fArr4.length) {
                        Float fValueOf2 = Float.valueOf(fArr4[i2] * fFloatValue);
                        float f4 = fFloatValue;
                        float f5 = fM56501c52 - fM56501c5;
                        float f6 = fM64482x16;
                        float f7 = (fArr4[i2] * f5) + fM56501c5;
                        float f8 = fM56501c52;
                        float f9 = fM64482x14 - fM64482x1;
                        float[] fArr5 = fArr2;
                        float fM64475k4 = m64475k4((fArr2[i2] * f9) + fM64482x1, f2);
                        int i3 = i2;
                        float f10 = fM64482x15 - fM64482x12;
                        float f11 = fM64482x15;
                        float[] fArr6 = fArr4;
                        float f12 = f6 - fM64482x13;
                        sortedList.addItem(fValueOf2, new C14321pz(f7, fM64475k4, m64475k4((fArr5[i3] * f10) + fM64482x12, f2), m64475k4((fArr5[i3] * f12) + fM64482x13, f2)).m69339k4().Clone());
                        float f13 = f3;
                        sortedList.addItem(Float.valueOf((f3 - fArr6[i3]) * f4), new C14321pz(OooOO0.OooO0OO.OooO0O0(f13, fArr6[i3], f5, fM56501c5), m64475k4(OooOO0.OooO0OO.OooO0O0(f13, fArr5[i3], f9, fM64482x1), f2), m64475k4(OooOO0.OooO0OO.OooO0O0(f13, fArr5[i3], f10, fM64482x12), f2), m64475k4(OooOO0.OooO0OO.OooO0O0(f13, fArr5[i3], f12, fM64482x13), f2)).m69339k4().Clone());
                        float f14 = f13 - f4;
                        sortedList.addItem(Float.valueOf(f13 - (fArr6[i3] * f14)), new C14321pz((fArr6[i3] * f5) + fM56501c5, m64475k4((fArr5[i3] * f9) + fM64482x1, f2), m64475k4((fArr5[i3] * f10) + fM64482x12, f2), m64475k4((fArr5[i3] * f12) + fM64482x13, f2)).m69339k4().Clone());
                        sortedList.addItem(Float.valueOf((f14 * fArr6[i3]) + f4), new C14321pz(OooOO0.OooO0OO.OooO0O0(1.0f, fArr6[i3], f5, fM56501c5), m64475k4(OooOO0.OooO0OO.OooO0O0(1.0f, fArr5[i3], f9, fM64482x1), f2), m64475k4(OooOO0.OooO0OO.OooO0O0(1.0f, fArr5[i3], f10, fM64482x12), f2), m64475k4(OooOO0.OooO0OO.OooO0O0(1.0f, fArr5[i3], f12, fM64482x13), f2)).m69339k4().Clone());
                        i2 = i3 + 1;
                        fFloatValue = f4;
                        f3 = 1.0f;
                        fM56501c52 = f8;
                        fM64482x16 = f6;
                        fArr2 = fArr5;
                        fArr4 = fArr6;
                        fM64482x15 = f11;
                        fM64482x14 = fM64482x14;
                    }
                }
            }
        } else {
            SortedList<Float, C12003du> sortedListM64477k4 = m64477k4(i, sortedList.getValues().get_Item(0).Clone().Clone(), sortedList.getValues().get_Item(1).Clone().Clone());
            sortedList.setCapacity(sortedListM64477k4.size() + 2);
            IGenericEnumerator<KeyValuePair<Float, C12003du>> it2 = sortedListM64477k4.iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair<Float, C12003du> next = it2.next();
                    if (!sortedList.containsKey(next.getKey())) {
                        sortedList.addItem(next.getKey(), next.getValue().Clone());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return sortedList;
            }
        }
        return sortedList;
    }

    /* JADX INFO: renamed from: k4 */
    private SortedList<Float, C12003du> m64477k4(int i, C12003du c12003du, C12003du c12003du2) {
        return c12003du.equals(c12003du2.Clone()) ? new SortedList<>() : i == 1 ? m64478k4(c12003du.Clone(), c12003du2.Clone()) : m64483x1(c12003du.Clone(), c12003du2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private SortedList<Float, C12003du> m64478k4(C12003du c12003du, C12003du c12003du2) {
        SortedList<Float, C12003du> sortedList = new SortedList<>();
        float fM56501c5 = (c12003du.m56501c5() & 255) / 255.0f;
        float fM56507jd = (c12003du.m56507jd() & 255) / 255.0f;
        float fM56502ck = (c12003du.m56502ck() & 255) / 255.0f;
        float fM56505fa = (c12003du.m56505fa() & 255) / 255.0f;
        float fM56501c52 = (c12003du2.m56501c5() & 255) / 255.0f;
        float fM56507jd2 = (c12003du2.m56507jd() & 255) / 255.0f;
        float fM56502ck2 = (c12003du2.m56502ck() & 255) / 255.0f;
        float fM56505fa2 = (c12003du2.m56505fa() & 255) / 255.0f;
        IGenericEnumerator<KeyValuePair<Float, Float>> it = m64479k4(f46041ck).iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Float, Float> next = it.next();
                float f = fM56501c5;
                float f2 = fM56507jd;
                sortedList.addItem(next.getKey(), new C14321pz(((fM56501c52 - fM56501c5) * next.getValue().floatValue()) + fM56501c5, ((fM56507jd2 - fM56507jd) * next.getValue().floatValue()) + fM56507jd, ((fM56502ck2 - fM56502ck) * next.getValue().floatValue()) + fM56502ck, ((fM56505fa2 - fM56505fa) * next.getValue().floatValue()) + fM56505fa).m69339k4().Clone());
                fM56501c5 = f;
                fM56507jd = f2;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return sortedList;
    }

    /* JADX INFO: renamed from: k4 */
    private SortedList<Float, Float> m64479k4(float[] fArr) {
        SortedList<Float, Float> sortedList = new SortedList<>();
        List.Enumerator<Double> it = m64476k4(fArr, fArr.length * 2).iterator();
        while (it.hasNext()) {
            try {
                double dDoubleValue = ((Double) C7019kk.m27464to(it.next(), Double.TYPE)).doubleValue();
                float fM64473k4 = (float) m64473k4(dDoubleValue);
                float f = (float) dDoubleValue;
                if (!sortedList.containsKey(Float.valueOf(f))) {
                    sortedList.addItem(Float.valueOf(f), Float.valueOf(fM64473k4));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return sortedList;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64486k4() {
        this.f46045h4.m1631k4();
        this.f46048m9.m4222x1();
        this.f46044dy.m4222x1();
        this.f46050x1 = -1;
        this.f46043du = (byte) 0;
        this.f46046k4 = 0;
        this.f46047kk = 0.0f;
        this.f46049to = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m64480k4(List<Double> list, double d, double d2, int i) {
        double d3 = (d2 - d) / ((double) i);
        for (double d4 = (d3 / 2.0d) + d; d4 <= d2; d4 += d3) {
            list.addItem(Double.valueOf(C14116yg.m67477k4(d4, 3)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m64487k4(GradientFormat gradientFormat) {
        int gradientDirection;
        boolean zM27456k4;
        if (gradientFormat == null) {
            return;
        }
        if (gradientFormat.getGradientShape() != -1) {
            this.f46043du = gradientFormat.getGradientShape();
        }
        if (gradientFormat.getGradientDirection() != -1) {
            gradientDirection = gradientFormat.getGradientDirection();
        } else {
            if (gradientFormat.getGradientShape() != 2) {
                this.f46050x1 = 0;
                if (!C14064he.m66715kk(gradientFormat.getLinearGradientAngle())) {
                    this.f46047kk = gradientFormat.getLinearGradientAngle();
                }
                if (gradientFormat.getLinearGradientScaled() != -1) {
                    this.f46049to = gradientFormat.getLinearGradientScaled() == 1;
                }
                if (gradientFormat.getTileFlip() != -1) {
                    this.f46046k4 = gradientFormat.getTileFlip();
                }
                if (gradientFormat.m1613to() != null) {
                    this.f46048m9.m4220k4(gradientFormat.m1613to().m4218k4().Clone());
                }
                if (gradientFormat.getGradientStops() != null || gradientFormat.getGradientStops().size() <= 0) {
                }
                this.f46045h4.m1631k4();
                IGenericEnumerator<IGradientStop> it = gradientFormat.getGradientStops().iterator();
                while (it.hasNext()) {
                    try {
                        GradientStop gradientStop = (GradientStop) it.next();
                        this.f46045h4.m1632k4(gradientStop.getPosition(), (ColorFormat) gradientStop.getColor());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (zM27456k4) {
                    return;
                } else {
                    return;
                }
            }
            gradientDirection = 4;
        }
        this.f46050x1 = gradientDirection;
        this.f46044dy.m4220k4(gradientFormat.m1605h4().Clone());
        if (!C14064he.m66715kk(gradientFormat.getLinearGradientAngle())) {
        }
        if (gradientFormat.getLinearGradientScaled() != -1) {
        }
        if (gradientFormat.getTileFlip() != -1) {
        }
        if (gradientFormat.m1613to() != null) {
        }
        if (gradientFormat.getGradientStops() != null) {
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        IGenericEnumerator<IGradientStopEffectiveData> it = this.f46045h4.iterator();
        while (it.hasNext()) {
            try {
                ((GradientStopEffectiveData) it.next()).m1635k4(iBaseSlide, dm6Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64488k4(InterfaceC14672vc interfaceC14672vc) {
        if (interfaceC14672vc == null) {
            return;
        }
        C13787ln c13787ln = (C13787ln) interfaceC14672vc;
        this.f46046k4 = c13787ln.f46046k4;
        this.f46050x1 = c13787ln.getGradientDirection();
        this.f46047kk = c13787ln.f46047kk;
        this.f46049to = c13787ln.f46049to;
        this.f46043du = c13787ln.f46043du;
        this.f46048m9.m4220k4(c13787ln.f46048m9.m4218k4().Clone());
        this.f46044dy.m4220k4(c13787ln.f46044dy.m4218k4().Clone());
        this.f46045h4.m1631k4();
        IGenericEnumerator<IGradientStopEffectiveData> it = c13787ln.f46045h4.iterator();
        while (it.hasNext()) {
            try {
                this.f46045h4.m1633k4((GradientStopEffectiveData) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, GradientFormat gradientFormat) {
        m64488k4(interfaceC14672vc);
        m64487k4(gradientFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C13787ln c13787ln) {
        if (c13787ln != null && this.f46050x1 == c13787ln.getGradientDirection() && this.f46043du == c13787ln.getGradientShape()) {
            byte b = this.f46043du;
            if (b == 0) {
                if (C3085sv.m13089k4(this.f46047kk, c13787ln.f46047kk) && this.f46049to == c13787ln.f46049to) {
                }
                return false;
            }
            if (b == 1 || b == 2) {
                if (this.f46050x1 != c13787ln.getGradientDirection()) {
                    return false;
                }
            } else if (b != 3) {
                return true;
            }
            if (this.f46046k4 == c13787ln.getTileFlip() && this.f46045h4.size() == c13787ln.getGradientStops().size()) {
                for (int i = 0; i < this.f46045h4.size(); i++) {
                    if (!this.f46045h4.get_Item(i).equals(c13787ln.getGradientStops().get_Item(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
