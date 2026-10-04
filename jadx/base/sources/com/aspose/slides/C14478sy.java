package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.sy */
/* JADX INFO: loaded from: classes3.dex */
final class C14478sy extends tf7 {

    /* JADX INFO: renamed from: ix */
    private static final float[] f48981ix = {0.014f, 0.033f, 0.096f, 0.2f, 0.333f};

    /* JADX INFO: renamed from: u4 */
    private static final float[] f48982u4 = {0.05f, 0.1f, 0.2f, 0.3f, 0.4f};

    /* JADX INFO: renamed from: c5 */
    private byte f48983c5;

    /* JADX INFO: renamed from: ck */
    private short f48984ck;

    /* JADX INFO: renamed from: dy */
    private short f48985dy;

    /* JADX INFO: renamed from: fa */
    private final short f48986fa;

    /* JADX INFO: renamed from: jd */
    private final boolean f48987jd;

    /* JADX INFO: renamed from: ks */
    private SortedList<Float, C12003du> f48988ks;

    /* JADX INFO: renamed from: m9 */
    private short f48989m9;

    /* JADX INFO: renamed from: ne */
    private IShape f48990ne;

    /* JADX INFO: renamed from: rv */
    private bia f48991rv;

    /* JADX INFO: renamed from: up */
    private short f48992up;

    /* JADX INFO: renamed from: x6 */
    private C11913yj f48993x6;

    /* JADX INFO: renamed from: yj */
    private ohe f48994yj;

    public C14478sy(ajz ajzVar, GradientFormat gradientFormat, boolean z) {
        super(ajzVar, z);
        this.f48989m9 = (short) -1;
        this.f48985dy = (short) -1;
        this.f48983c5 = (byte) 0;
        this.f48984ck = (short) -1;
        this.f48986fa = (short) -1;
        this.f48992up = (short) -101;
        this.f48994yj = new ohe(0.5f, 0.5f, 0.0f, 0.0f);
        this.f48988ks = null;
        this.f48991rv = new bia();
        this.f48993x6 = new C11913yj();
        this.f4865k4 = (byte) 2;
        this.f48983c5 = gradientFormat.getGradientShape() != -1 ? gradientFormat.getGradientShape() : (byte) 0;
        byte gradientShape = gradientFormat.getGradientShape();
        if (gradientShape == -1 || gradientShape == 0) {
            this.f48989m9 = (short) 1;
            this.f48991rv = gradientFormat.m1613to();
        } else if (gradientShape == 1 || gradientShape == 2) {
            this.f48989m9 = (short) 6;
            this.f48991rv = gradientFormat.m1613to();
            gradientFormat.m1605h4().CloneTo(this.f48994yj);
        } else if (gradientShape == 3) {
            ((tf7) this).f49117du = ajzVar.f3917to;
            this.f48989m9 = (short) 6;
            this.f48991rv = gradientFormat.m1613to();
            gradientFormat.m1605h4().CloneTo(this.f48994yj);
        }
        ohe oheVar = this.f48994yj;
        oju ojuVar = oheVar.f47809x1;
        if (ojuVar.f47836k4 < 0.0f || ojuVar.f47837x1 < 0.0f) {
            this.f48994yj = new ohe(oheVar.f47808k4.Clone(), oju.m68616du(this.f48994yj.f47809x1.Clone(), oju.f47834kk.Clone()).Clone());
        }
        this.f48992up = (short) 0;
        if (!C14064he.m66715kk(gradientFormat.getLinearGradientAngle())) {
            this.f48984ck = m5677k4(gradientFormat.getLinearGradientAngle());
        }
        this.f48987jd = gradientFormat.getLinearGradientScaled() > 0;
        if (gradientFormat.getGradientStops().size() != 0) {
            this.f48988ks = gradientFormat.m1606k4(ajzVar.f3912du);
        }
        this.f48985dy = (short) 3;
    }

    /* JADX INFO: renamed from: kk */
    private static float m70880kk(float f) {
        return (float) C14116yg.m67469du(f, 0.45454543828964233d);
    }

    /* JADX INFO: renamed from: x1 */
    private static float m70881x1(float f) {
        return (float) C14116yg.m67469du(f, 2.200000047683716d);
    }

    /* JADX INFO: renamed from: ck */
    public final int m70883ck() {
        short s = this.f48989m9;
        if (s >= 0) {
            return s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: fa */
    public final byte m70884fa() {
        C6005k4.m24261k4(this.f48983c5 != -1);
        return this.f48983c5;
    }

    /* JADX INFO: renamed from: ix */
    public final C11896dy m70885ix() {
        return ((tf7) this).f49117du;
    }

    /* JADX INFO: renamed from: jd */
    public final int m70886jd() {
        short s = this.f48985dy;
        if (s >= 0) {
            return s;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final SortedList<Float, C12003du> m70887k4(boolean z) {
        return m70879k4(z, m70902yj(), m5676k4().Clone(), m5682x1().Clone(), m70886jd(), m70897up(), m70883ck(), m70895rv());
    }

    /* JADX INFO: renamed from: ks */
    public final int m70892ks() {
        short s = this.f48984ck;
        if (s >= 0) {
            return s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ne */
    public final bia m70893ne() {
        return this.f48991rv;
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m70894qq() {
        return m70883ck() == 1;
    }

    /* JADX INFO: renamed from: rv */
    public final int m70895rv() {
        short s = this.f48992up;
        if (s >= -100) {
            return s;
        }
        return 0;
    }

    /* JADX INFO: renamed from: u4 */
    public final C11913yj m70896u4() {
        return (C11913yj) C7019kk.m27452k4((Object) this.f48993x6.m55760h4(), C11913yj.class);
    }

    /* JADX INFO: renamed from: up */
    public final int m70897up() {
        return 0;
    }

    /* JADX INFO: renamed from: uz */
    public final IShape m70898uz() {
        return this.f48990ne;
    }

    /* JADX INFO: renamed from: wl */
    public final float m70899wl() {
        return m70900x1(m70892ks());
    }

    /* JADX INFO: renamed from: x6 */
    public final ohe m70901x6() {
        return this.f48994yj;
    }

    /* JADX INFO: renamed from: yj */
    public final SortedList<Float, C12003du> m70902yj() {
        SortedList<Float, C12003du> sortedList = this.f48988ks;
        if (sortedList != null) {
            return new SortedList<>(sortedList);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14478sy(ajz ajzVar, IGradientFormat iGradientFormat) {
        short s;
        super(ajzVar);
        this.f48989m9 = (short) -1;
        this.f48985dy = (short) -1;
        this.f48983c5 = (byte) 0;
        this.f48984ck = (short) -1;
        this.f48986fa = (short) -1;
        this.f48992up = (short) -101;
        this.f48994yj = new ohe(0.5f, 0.5f, 0.0f, 0.0f);
        this.f48988ks = null;
        this.f48991rv = new bia();
        this.f48993x6 = new C11913yj();
        this.f4865k4 = (byte) 2;
        ((tf7) this).f49117du = ajzVar.f3917to;
        byte gradientShape = iGradientFormat.getGradientShape();
        if (gradientShape == -1 || gradientShape == 0) {
            this.f48989m9 = (short) 1;
        } else if (gradientShape == 1 || gradientShape == 2) {
            int gradientDirection = iGradientFormat.getGradientDirection();
            if (gradientDirection == 0) {
                this.f48989m9 = (short) 2;
            } else if (gradientDirection == 1) {
                this.f48989m9 = (short) 3;
            } else if (gradientDirection != 2) {
                if (gradientDirection != 3) {
                    s = gradientDirection == 4 ? (short) 6 : (short) 5;
                }
                this.f48989m9 = s;
            } else {
                this.f48989m9 = (short) 4;
            }
        } else if (gradientShape == 3) {
            ((tf7) this).f49117du = ajzVar.f3917to;
        }
        this.f48992up = (short) 0;
        if (!C14064he.m66715kk(iGradientFormat.getLinearGradientAngle())) {
            this.f48984ck = m5677k4(iGradientFormat.getLinearGradientAngle());
        }
        this.f48987jd = iGradientFormat.getLinearGradientScaled() > 0;
        this.f48988ks = new SortedList<>();
        IGenericEnumerator<IGradientStop> it = iGradientFormat.getGradientStops().iterator();
        while (it.hasNext()) {
            try {
                IGradientStop next = it.next();
                this.f48988ks.addItem(Float.valueOf(next.getPosition()), ((ColorFormat) next.getColor()).m1086x1(ajzVar.f3912du).m69339k4().Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f48985dy = (short) 3;
    }

    /* JADX INFO: renamed from: k4 */
    private static SortedList<Float, C12003du> m70879k4(boolean z, SortedList<Float, C12003du> sortedList, C12003du c12003du, C12003du c12003du2, int i, int i2, int i3, int i4) {
        int iOooO00o;
        int iM56507jd;
        int iM56502ck;
        if (sortedList == null) {
            if (!z) {
                return null;
            }
            C12003du c12003duClone = c12003du.Clone();
            C12003du c12003duClone2 = c12003du2.Clone();
            if (i == 1) {
                if (i2 < 10) {
                    iM56507jd = ((c12003duClone.m56507jd() & 255) * i2) / 9;
                    iM56502ck = ((c12003duClone.m56502ck() & 255) * i2) / 9;
                    iOooO00o = ((c12003duClone.m56505fa() & 255) * i2) / 9;
                } else {
                    int i5 = i2 - 9;
                    int iM56507jd2 = (((255 - (c12003duClone.m56507jd() & 255)) * i5) / 10) + (c12003duClone.m56507jd() & 255);
                    int iOooO00o2 = com.aspose.slides.internal.p497xc.OooO00o.OooO00o(255, c12003duClone.m56502ck() & 255, i5, 10) + (c12003duClone.m56502ck() & 255);
                    iOooO00o = com.aspose.slides.internal.p497xc.OooO00o.OooO00o(255, c12003duClone.m56505fa() & 255, i5, 10) + (c12003duClone.m56505fa() & 255);
                    iM56507jd = iM56507jd2;
                    iM56502ck = iOooO00o2;
                }
                C12003du.m56398k4(c12003du2.m56501c5() & 255, iM56507jd, iM56502ck, iOooO00o).CloneTo(c12003duClone2);
            }
            SortedList<Float, C12003du> sortedList2 = new SortedList<>(2);
            sortedList2.set_Item(Float.valueOf(0.0f), c12003duClone.Clone());
            sortedList2.set_Item(Float.valueOf(1.0f), c12003duClone2.Clone());
            sortedList = sortedList2;
        }
        float f = i4 / 100.0f;
        if (i3 < 1) {
            f = 1.0f - f;
        }
        if (f != 1.0f) {
            int size = sortedList.size();
            float f2 = f % 1.0f;
            int i6 = 0;
            if (f2 == 0.0f) {
                SortedList<Float, C12003du> sortedList3 = new SortedList<>(size);
                while (i6 < size) {
                    sortedList3.set_Item(Float.valueOf(1.0f - sortedList.getKeys().get_Item(i6).floatValue()), sortedList.getValues().get_Item(i6).Clone());
                    i6++;
                }
                sortedList = sortedList3;
            } else {
                SortedList<Float, C12003du> sortedList4 = new SortedList<>(size * 2);
                if (f2 > 0.0f) {
                    while (i6 < size) {
                        sortedList4.set_Item(Float.valueOf(sortedList.getKeys().get_Item(i6).floatValue() * f2), sortedList.getValues().get_Item(i6).Clone());
                        sortedList4.set_Item(Float.valueOf(((1.0f - f2) * (1.0f - sortedList.getKeys().get_Item(i6).floatValue())) + f2), sortedList.getValues().get_Item(i6).Clone());
                        i6++;
                    }
                } else {
                    float f3 = f2 + 1.0f;
                    while (i6 < size) {
                        sortedList4.set_Item(Float.valueOf((1.0f - sortedList.getKeys().get_Item(i6).floatValue()) * f3), sortedList.getValues().get_Item(i6).Clone());
                        sortedList4.set_Item(Float.valueOf(((1.0f - f3) * sortedList.getKeys().get_Item(i6).floatValue()) + f3), sortedList.getValues().get_Item(i6).Clone());
                        i6++;
                    }
                }
                sortedList = sortedList4;
            }
        }
        return m70882x1(sortedList);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m70900x1(int i) {
        float f = i + 90.0f;
        if (!this.f48987jd) {
            return f;
        }
        double d = ((double) (f / 180.0f)) * 3.141592653589793d;
        float fM67498to = (float) ((C14116yg.m67498to(C14116yg.m67495m9(d) * ((double) ((tf7) this).f49119h4.m56550c5()), C14116yg.m67470dy(d) * ((double) ((tf7) this).f49119h4.m56575x1())) * 180.0d) / 3.141592653589793d);
        return fM67498to < 0.0f ? fM67498to + 360.0f : fM67498to;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14478sy(ajz ajzVar, C13787ln c13787ln) {
        short s;
        super(ajzVar);
        this.f48989m9 = (short) -1;
        this.f48985dy = (short) -1;
        this.f48983c5 = (byte) 0;
        this.f48984ck = (short) -1;
        this.f48986fa = (short) -1;
        this.f48992up = (short) -101;
        this.f48994yj = new ohe(0.5f, 0.5f, 0.0f, 0.0f);
        this.f48988ks = null;
        this.f48991rv = new bia();
        this.f48993x6 = new C11913yj();
        this.f4865k4 = (byte) 2;
        ((tf7) this).f49117du = ajzVar.f3917to;
        C6005k4.m24261k4(c13787ln.getGradientShape() != -1);
        byte gradientShape = c13787ln.getGradientShape();
        if (gradientShape == -1) {
            C6005k4.m24259k4("Must be defined");
        } else if (gradientShape == 0) {
            this.f48989m9 = (short) 1;
            this.f48991rv = new bia(c13787ln.m64492x1());
        } else if (gradientShape == 1 || gradientShape == 2) {
            this.f48991rv = c13787ln.m64492x1();
            int gradientDirection = c13787ln.getGradientDirection();
            if (gradientDirection == 0) {
                this.f48989m9 = (short) 2;
            } else if (gradientDirection == 1) {
                this.f48989m9 = (short) 3;
            } else if (gradientDirection != 2) {
                if (gradientDirection != 3) {
                    s = gradientDirection == 4 ? (short) 6 : (short) 5;
                }
                this.f48989m9 = s;
            } else {
                this.f48989m9 = (short) 4;
            }
        } else if (gradientShape == 3) {
            this.f48991rv = c13787ln.m64492x1();
            ((tf7) this).f49117du = ajzVar.f3917to;
        }
        this.f48992up = (short) 0;
        if (!C14064he.m66715kk(c13787ln.getLinearGradientAngle())) {
            this.f48984ck = m5677k4(c13787ln.getLinearGradientAngle());
        }
        this.f48987jd = c13787ln.getLinearGradientScaled();
        this.f48983c5 = c13787ln.getGradientShape();
        this.f48988ks = c13787ln.m64484du();
        IGenericEnumerator<IGradientStopEffectiveData> it = c13787ln.getGradientStops().iterator();
        while (it.hasNext()) {
            try {
                IGradientStopEffectiveData next = it.next();
                if (!this.f48988ks.containsKey(Float.valueOf(next.getPosition()))) {
                    this.f48988ks.addItem(Float.valueOf(next.getPosition()), ((GradientStopEffectiveData) next).m1634k4().Clone());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f48985dy = (short) 3;
    }

    /* JADX INFO: renamed from: x1 */
    private static SortedList<Float, C12003du> m70882x1(SortedList<Float, C12003du> sortedList) {
        if (sortedList.size() < 2) {
            return null;
        }
        SortedList<Float, C12003du> sortedList2 = new SortedList<>();
        C12003du c12003duClone = C12003du.f40505to.Clone();
        IGenericEnumerator<Float> it = sortedList.getKeys().iterator();
        float f = -1.0f;
        while (it.hasNext()) {
            try {
                Float f2 = (Float) C7019kk.m27464to(it.next(), Float.TYPE);
                float fFloatValue = f2.floatValue();
                if (!sortedList2.containsKey(f2)) {
                    sortedList2.addItem(f2, sortedList.get_Item(f2).Clone());
                }
                if (fFloatValue >= f) {
                    sortedList.get_Item(f2).CloneTo(c12003duClone);
                    f = fFloatValue;
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
        float f3 = 1.0f;
        if (sortedList2.getKeys().get_Item(sortedList2.size() - 1).floatValue() < 1.0f) {
            sortedList2.addItem(Float.valueOf(1.0f), c12003duClone.Clone());
        }
        if (sortedList.size() == 2 && sortedList2.size() == 2) {
            int i = 0;
            if (sortedList2.getKeys().get_Item(0).floatValue() == 0.0f && sortedList2.getKeys().get_Item(1).floatValue() == 1.0f) {
                C14321pz c14321pz = new C14321pz(sortedList2.getValues().get_Item(0).Clone());
                C14321pz c14321pz2 = new C14321pz(sortedList2.getValues().get_Item(1).Clone());
                if (!c14321pz2.m69341k4(c14321pz)) {
                    float fM70881x1 = m70881x1(c14321pz.f48205k4);
                    float fM70881x12 = m70881x1(c14321pz.f48208x1);
                    float fM70881x13 = m70881x1(c14321pz.f48206kk);
                    float fM70881x14 = m70881x1(c14321pz.f48207to);
                    float fM70881x15 = m70881x1(c14321pz2.f48205k4);
                    float fM70881x16 = m70881x1(c14321pz2.f48208x1);
                    float fM70881x17 = m70881x1(c14321pz2.f48206kk);
                    float fM70881x18 = m70881x1(c14321pz2.f48207to);
                    sortedList2.setCapacity((f48981ix.length * 2) + 2);
                    while (true) {
                        float[] fArr = f48981ix;
                        if (i >= fArr.length) {
                            break;
                        }
                        float[] fArr2 = f48982u4;
                        Float fValueOf = Float.valueOf(fArr2[i]);
                        float f4 = fM70881x15 - fM70881x1;
                        float f5 = f3;
                        float fM70880kk = m70880kk((fArr[i] * f4) + fM70881x1);
                        int i2 = i;
                        float f6 = fM70881x16 - fM70881x12;
                        float f7 = fM70881x18;
                        float f8 = fM70881x17 - fM70881x13;
                        float f9 = fM70881x15;
                        float f10 = fM70881x16;
                        float f11 = f7 - fM70881x14;
                        sortedList2.addItem(fValueOf, new C14321pz(fM70880kk, m70880kk((fArr[i2] * f6) + fM70881x12), m70880kk((fArr[i2] * f8) + fM70881x13), m70880kk((fArr[i2] * f11) + fM70881x14)).m69339k4().Clone());
                        sortedList2.addItem(Float.valueOf(f5 - fArr2[i2]), new C14321pz(m70880kk(OooOO0.OooO0OO.OooO0O0(f5, fArr[i2], f4, fM70881x1)), m70880kk(OooOO0.OooO0OO.OooO0O0(f5, fArr[i2], f6, fM70881x12)), m70880kk(OooOO0.OooO0OO.OooO0O0(f5, fArr[i2], f8, fM70881x13)), m70880kk(OooOO0.OooO0OO.OooO0O0(f5, fArr[i2], f11, fM70881x14))).m69339k4().Clone());
                        i = i2 + 1;
                        f3 = f5;
                        fM70881x18 = f7;
                        fM70881x16 = f10;
                        fM70881x15 = f9;
                        fM70881x17 = fM70881x17;
                    }
                }
            }
        }
        return sortedList2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70888k4(int i) {
        this.f48989m9 = (short) i;
    }

    public C14478sy(ajz ajzVar, C13787ln c13787ln, byte b, boolean z) {
        bia biaVar;
        super(ajzVar, z);
        this.f48989m9 = (short) -1;
        this.f48985dy = (short) -1;
        this.f48983c5 = (byte) 0;
        this.f48984ck = (short) -1;
        this.f48986fa = (short) -1;
        this.f48992up = (short) -101;
        this.f48994yj = new ohe(0.5f, 0.5f, 0.0f, 0.0f);
        this.f48988ks = null;
        this.f48991rv = new bia();
        this.f48993x6 = new C11913yj();
        this.f4865k4 = (byte) 2;
        C6005k4.m24261k4(c13787ln.getGradientShape() != -1);
        this.f48983c5 = c13787ln.getGradientShape();
        byte gradientShape = c13787ln.getGradientShape();
        if (gradientShape == -1) {
            C6005k4.m24259k4("Must be defined");
        } else if (gradientShape != 0) {
            if (gradientShape == 1 || gradientShape == 2) {
                this.f48989m9 = (short) 6;
                biaVar = new bia(c13787ln.m64492x1());
            } else if (gradientShape == 3) {
                ((tf7) this).f49117du = ajzVar.f3917to;
                this.f48989m9 = (short) 6;
                biaVar = new bia(c13787ln.m64492x1());
            }
            this.f48991rv = biaVar;
            c13787ln.m64490kk().m4218k4().CloneTo(this.f48994yj);
        } else {
            this.f48989m9 = (short) 1;
            this.f48991rv = new bia(c13787ln.m64492x1());
        }
        ohe oheVar = this.f48994yj;
        oju ojuVar = oheVar.f47809x1;
        if (ojuVar.f47836k4 < 0.0f || ojuVar.f47837x1 < 0.0f) {
            this.f48994yj = new ohe(oheVar.f47808k4.Clone(), oju.m68616du(this.f48994yj.f47809x1.Clone(), oju.f47834kk.Clone()).Clone());
        }
        this.f48992up = (short) 0;
        if (!C14064he.m66715kk(c13787ln.getLinearGradientAngle())) {
            this.f48984ck = m5677k4(c13787ln.getLinearGradientAngle());
        }
        this.f48987jd = c13787ln.getLinearGradientScaled();
        kg7 kg7Var = ajzVar.f3913h4;
        this.f48988ks = kg7Var != null ? c13787ln.m64485k4(kg7Var.m63837ix()) : c13787ln.m64491to();
        SortedList<Float, C12003du> sortedList = this.f48988ks;
        if (sortedList != null && sortedList.size() > 0) {
            if (C0962es.m5668k4(b)) {
                for (int i = 0; i < this.f48988ks.size(); i++) {
                    SortedList<Float, C12003du> sortedList2 = this.f48988ks;
                    sortedList2.set_Item(sortedList2.getKeys().get_Item(i), C0962es.m5666k4(this.f48988ks.getValues().get_Item(i).Clone(), b).Clone());
                }
            }
            if (this.f48988ks.size() == 1) {
                this.f48988ks.addItem(Float.valueOf(0.0f), this.f48988ks.getValues().get_Item(0).Clone());
            }
        }
        this.f48985dy = (short) 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70889k4(IShape iShape) {
        this.f48990ne = iShape;
    }

    public C14478sy(ajz ajzVar, C13787ln c13787ln, int i) {
        bia biaVar;
        super(ajzVar);
        this.f48989m9 = (short) -1;
        this.f48985dy = (short) -1;
        this.f48983c5 = (byte) 0;
        this.f48984ck = (short) -1;
        this.f48986fa = (short) -1;
        this.f48992up = (short) -101;
        this.f48994yj = new ohe(0.5f, 0.5f, 0.0f, 0.0f);
        this.f48988ks = null;
        this.f48991rv = new bia();
        this.f48993x6 = new C11913yj();
        this.f4865k4 = (byte) 2;
        ((tf7) this).f49117du = ajzVar.f3917to;
        byte gradientShape = c13787ln.getGradientShape();
        if (gradientShape != -1) {
            if (gradientShape == 0) {
                this.f48989m9 = (short) 1;
                biaVar = new bia(c13787ln.m64492x1());
            } else if (gradientShape == 1 || gradientShape == 2) {
                this.f48991rv = c13787ln.m64492x1();
                int gradientDirection = c13787ln.getGradientDirection();
                if (gradientDirection == 0) {
                    this.f48989m9 = (short) 2;
                } else if (gradientDirection != 1) {
                    short s = 4;
                    if (gradientDirection == 2) {
                        this.f48989m9 = s;
                    } else {
                        if (gradientDirection == 3) {
                            s = 5;
                        } else if (gradientDirection == 4) {
                            s = 6;
                        }
                        this.f48989m9 = s;
                    }
                } else {
                    this.f48989m9 = (short) 3;
                }
            } else if (gradientShape == 3) {
                ((tf7) this).f49117du = ajzVar.f3917to;
                biaVar = c13787ln.m64492x1();
            }
            this.f48991rv = biaVar;
        } else {
            C6005k4.m24259k4("Must be defined");
        }
        this.f48992up = (short) 0;
        if (!C14064he.m66715kk(c13787ln.getLinearGradientAngle())) {
            this.f48984ck = m5677k4(c13787ln.getLinearGradientAngle());
        }
        this.f48987jd = c13787ln.getLinearGradientScaled();
        this.f48983c5 = c13787ln.getGradientShape();
        kg7 kg7Var = ajzVar.f3913h4;
        this.f48988ks = kg7Var != null ? c13787ln.m64485k4(kg7Var.m63837ix()) : c13787ln.m64491to();
        this.f48985dy = (short) 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70890k4(C11906rv c11906rv) {
        float width = (m70898uz().getWidth() / 2.0f) + m70898uz().getX();
        float height = (m70898uz().getHeight() / 2.0f) + m70898uz().getY();
        C12025x6 c12025x6 = new C12025x6(width, height);
        float fM67481k4 = C14116yg.m67481k4(m70898uz().getX() - ((tf7) this).f49119h4.m56557jd(), ((tf7) this).f49119h4.m56550c5() - m70898uz().getWidth());
        float fM67481k42 = C14116yg.m67481k4(m70898uz().getY() - ((tf7) this).f49119h4.m56551ck(), ((tf7) this).f49119h4.m56575x1() - m70898uz().getHeight());
        c11906rv.m55693k4(C12025x6.m56886x1(c12025x6.Clone(), new C12015qq((m70898uz().getWidth() / fM67481k4) * (width - c11906rv.m55684dy().m56897x1()), (m70898uz().getHeight() / fM67481k42) * (height - c11906rv.m55684dy().m56895kk()))).Clone());
        c11906rv.m55703x1(new C12025x6(m70898uz().getWidth() / ((tf7) this).f49119h4.m56550c5(), m70898uz().getHeight() / ((tf7) this).f49119h4.m56575x1()));
    }

    public C14478sy(ajz ajzVar, C13787ln c13787ln, boolean z) {
        super(ajzVar, z);
        this.f48989m9 = (short) -1;
        this.f48985dy = (short) -1;
        this.f48983c5 = (byte) 0;
        this.f48984ck = (short) -1;
        this.f48986fa = (short) -1;
        this.f48992up = (short) -101;
        this.f48994yj = new ohe(0.5f, 0.5f, 0.0f, 0.0f);
        this.f48988ks = null;
        this.f48991rv = new bia();
        this.f48993x6 = new C11913yj();
        if (c13787ln == null) {
            throw new ArgumentNullException("fillprops");
        }
        this.f4865k4 = (byte) 2;
        this.f48983c5 = c13787ln.getGradientShape() != -1 ? c13787ln.getGradientShape() : (byte) 0;
        byte gradientShape = c13787ln.getGradientShape();
        if (gradientShape == -1 || gradientShape == 0) {
            this.f48989m9 = (short) 1;
            this.f48991rv = new bia(c13787ln.m64492x1());
        } else if (gradientShape == 1 || gradientShape == 2) {
            this.f48989m9 = (short) 6;
            this.f48991rv = c13787ln.m64492x1();
            c13787ln.m64490kk().m4218k4().CloneTo(this.f48994yj);
        } else if (gradientShape == 3) {
            ((tf7) this).f49117du = ajzVar.f3917to;
            this.f48989m9 = (short) 6;
            this.f48991rv = c13787ln.m64492x1();
            c13787ln.m64490kk().m4218k4().CloneTo(this.f48994yj);
        }
        ohe oheVar = this.f48994yj;
        oju ojuVar = oheVar.f47809x1;
        if (ojuVar.f47836k4 < 0.0f || ojuVar.f47837x1 < 0.0f) {
            this.f48994yj = new ohe(oheVar.f47808k4.Clone(), oju.m68616du(this.f48994yj.f47809x1.Clone(), oju.f47834kk.Clone()).Clone());
        }
        this.f48992up = (short) 0;
        if (!C14064he.m66715kk(c13787ln.getLinearGradientAngle())) {
            this.f48984ck = m5677k4(c13787ln.getLinearGradientAngle());
        }
        this.f48987jd = c13787ln.getLinearGradientScaled();
        kg7 kg7Var = ajzVar.f3913h4;
        this.f48988ks = kg7Var != null ? c13787ln.m64485k4(kg7Var.m63837ix()) : c13787ln.m64491to();
        this.f48985dy = (short) 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70891k4(C11913yj c11913yj) {
        this.f48993x6 = c11913yj == null ? new C11913yj() : (C11913yj) C7019kk.m27452k4((Object) c11913yj.m55760h4(), C11913yj.class);
    }
}
