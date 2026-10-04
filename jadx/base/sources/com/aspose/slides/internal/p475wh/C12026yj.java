package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p314oc.C7015du;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.yj */
/* JADX INFO: loaded from: classes5.dex */
public final class C12026yj implements IDisposable, InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private AbstractC12024x1 f40598c5;

    /* JADX INFO: renamed from: ck */
    private int f40599ck;

    /* JADX INFO: renamed from: du */
    boolean f40600du;

    /* JADX INFO: renamed from: dy */
    private float[] f40601dy;

    /* JADX INFO: renamed from: fa */
    private int f40602fa;

    /* JADX INFO: renamed from: h4 */
    C11898h4 f40603h4;

    /* JADX INFO: renamed from: ix */
    private C7015du<float[]> f40604ix;

    /* JADX INFO: renamed from: jd */
    private int f40605jd;

    /* JADX INFO: renamed from: ks */
    private int f40606ks;

    /* JADX INFO: renamed from: m9 */
    C11898h4 f40607m9;

    /* JADX INFO: renamed from: ne */
    private float f40608ne;

    /* JADX INFO: renamed from: rv */
    private C11913yj f40609rv;

    /* JADX INFO: renamed from: u4 */
    private float f40610u4;

    /* JADX INFO: renamed from: up */
    private int f40611up;

    /* JADX INFO: renamed from: uz */
    private boolean f40612uz;

    /* JADX INFO: renamed from: x6 */
    private float f40613x6;

    /* JADX INFO: renamed from: yj */
    private int f40614yj;

    /* JADX INFO: renamed from: k4 */
    static float[] f40594k4 = {1.0f, 1.0f};

    /* JADX INFO: renamed from: x1 */
    static float[] f40597x1 = {3.0f, 1.0f};

    /* JADX INFO: renamed from: kk */
    static float[] f40595kk = {3.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: to */
    static float[] f40596to = {3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    public C12026yj(C12003du c12003du) {
        this(c12003du.Clone(), 1.0f);
    }

    /* JADX INFO: renamed from: u4 */
    private C11898h4 m56903u4() {
        C11898h4 c11898h4 = this.f40603h4;
        if (c11898h4 != null) {
            return (C11898h4) c11898h4.deepClone();
        }
        return null;
    }

    /* JADX INFO: renamed from: uz */
    private C11898h4 m56904uz() {
        C11898h4 c11898h4 = this.f40607m9;
        if (c11898h4 != null) {
            return (C11898h4) c11898h4.deepClone();
        }
        return null;
    }

    /* JADX INFO: renamed from: wl */
    private void m56905wl() {
        if (!this.f40600du) {
            throw new ArgumentException("You may not change this Pen because it does not belong to you.");
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static C12003du m56906x1(AbstractC12024x1 abstractC12024x1) {
        return abstractC12024x1 instanceof C11999ar ? ((C11999ar) abstractC12024x1).m56305h4() : abstractC12024x1 instanceof C11900jd ? ((C11900jd) abstractC12024x1).m55652m9() : C12003du.f40505to.Clone();
    }

    /* JADX INFO: renamed from: c5 */
    public float m56907c5() {
        return this.f40608ne;
    }

    /* JADX INFO: renamed from: ck */
    public int m56908ck() {
        return this.f40605jd;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        float[] fArr;
        C12026yj c12026yj = (C12026yj) m56915ix();
        C11913yj c11913yj = c12026yj.f40609rv;
        if (c11913yj != null) {
            c12026yj.f40609rv = c11913yj.m55760h4();
        }
        C7015du<float[]> c7015du = c12026yj.f40604ix;
        if (c7015du != null && (fArr = c7015du.f19072k4) != null) {
            c7015du.f19072k4 = fArr.clone();
        }
        c12026yj.f40600du = true;
        return c12026yj;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m56901k4(true);
    }

    /* JADX INFO: renamed from: du */
    public void m56909du(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 240 && i != 255) {
            switch (i) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    throw new InvalidEnumArgumentException("EndCap value");
            }
        }
        m56905wl();
        this.f40607m9 = null;
        this.f40611up = i;
    }

    /* JADX INFO: renamed from: dy */
    public int m56911dy() {
        return this.f40599ck;
    }

    /* JADX INFO: renamed from: fa */
    public int m56912fa() {
        return this.f40602fa;
    }

    /* JADX INFO: renamed from: h4 */
    public C11898h4 m56913h4() {
        if (this.f40607m9 != null) {
            return m56904uz();
        }
        throw new ArgumentException("customEndCap member is null");
    }

    /* JADX INFO: renamed from: ix */
    public Object m56915ix() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: jd */
    public float[] m56916jd() {
        C7015du<float[]> c7015du = this.f40604ix;
        if (c7015du != null) {
            return (float[]) c7015du.f19072k4.clone();
        }
        throw new OutOfMemoryException("dashPattern");
    }

    /* JADX INFO: renamed from: k4 */
    public int m56917k4() {
        return this.f40606ks;
    }

    /* JADX INFO: renamed from: kk */
    public C12003du m56925kk() {
        return m56906x1(this.f40598c5);
    }

    /* JADX INFO: renamed from: ks */
    public float m56928ks() {
        return this.f40610u4;
    }

    /* JADX INFO: renamed from: m9 */
    public C11898h4 m56929m9() {
        if (this.f40603h4 != null) {
            return m56903u4();
        }
        throw new ArgumentException("customStartCap member is null");
    }

    /* JADX INFO: renamed from: ne */
    public float m56930ne() {
        return this.f40613x6;
    }

    /* JADX INFO: renamed from: rv */
    public int m56931rv() {
        if (m56935x1() instanceof C12012lr) {
            return 2;
        }
        if (m56935x1() instanceof C11900jd) {
            return 1;
        }
        if (m56935x1() instanceof C11909up) {
            return 4;
        }
        return m56935x1() instanceof C11906rv ? 3 : 0;
    }

    /* JADX INFO: renamed from: to */
    public void m56932to(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 240 && i != 255) {
            switch (i) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    throw new InvalidEnumArgumentException("StartCap value");
            }
        }
        m56905wl();
        this.f40603h4 = null;
        this.f40602fa = i;
    }

    /* JADX INFO: renamed from: up */
    public int m56934up() {
        return this.f40611up;
    }

    /* JADX INFO: renamed from: x6 */
    public C11913yj m56940x6() {
        return this.f40609rv.m55760h4();
    }

    /* JADX INFO: renamed from: yj */
    public int m56941yj() {
        return this.f40614yj;
    }

    public C12026yj(C12003du c12003du, float f) {
        this(new C11999ar(c12003du.Clone()), f);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12024x1 m56900k4(AbstractC12024x1 abstractC12024x1) {
        return abstractC12024x1 instanceof C11999ar ? ((C11999ar) abstractC12024x1).m56308m9() : abstractC12024x1 instanceof C11900jd ? (AbstractC12024x1) ((C11900jd) abstractC12024x1).deepClone() : (AbstractC12024x1) abstractC12024x1.deepClone();
    }

    /* JADX INFO: renamed from: m9 */
    private void m56902m9(int i) {
        C7015du<float[]> c7015du;
        if (i == 0) {
            c7015du = new C7015du<>(new float[0]);
        } else if (i == 1) {
            c7015du = new C7015du<>(f40597x1);
        } else if (i == 2) {
            c7015du = new C7015du<>(f40594k4);
        } else if (i == 3) {
            c7015du = new C7015du<>(f40595kk);
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new RuntimeException();
                }
                this.f40605jd = i;
            }
            c7015du = new C7015du<>(f40596to);
        }
        this.f40604ix = c7015du;
        this.f40605jd = i;
    }

    /* JADX INFO: renamed from: du */
    public float[] m56910du() {
        return this.f40601dy;
    }

    /* JADX INFO: renamed from: h4 */
    public void m56914h4(int i) {
        if (i < 0 || i > 3) {
            throw new InvalidEnumArgumentException("LineJoin");
        }
        m56905wl();
        this.f40614yj = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m56926kk(float f) {
        m56905wl();
        this.f40613x6 = f;
    }

    /* JADX INFO: renamed from: to */
    public boolean m56933to() {
        float[] fArrM56910du = m56910du();
        return (fArrM56910du == null || fArrM56910du.length <= 1 || fArrM56910du.length % 2 == 1 || (fArrM56910du.length == 2 && fArrM56910du[0] == 0.0f && fArrM56910du[1] == 1.0f)) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC12024x1 m56935x1() {
        return (AbstractC12024x1) this.f40598c5.deepClone();
    }

    public C12026yj(AbstractC12024x1 abstractC12024x1) {
        this(abstractC12024x1, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56918k4(float f) {
        m56905wl();
        this.f40608ne = f;
    }

    /* JADX INFO: renamed from: kk */
    public void m56927kk(int i) {
        float[] fArr;
        if (i < 0 || i > 5) {
            throw new InvalidEnumArgumentException("DashStyle value");
        }
        m56905wl();
        m56902m9(i);
        if (i == 5) {
            C7015du<float[]> c7015du = this.f40604ix;
            if (c7015du == null || (fArr = c7015du.f19072k4) == null || fArr.length == 0) {
                this.f40604ix = new C7015du<>(new float[]{1.0f});
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m56936x1(float f) {
        m56905wl();
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.f40610u4 = f;
    }

    public C12026yj(AbstractC12024x1 abstractC12024x1, float f) {
        this.f40601dy = new float[0];
        this.f40600du = true;
        this.f40612uz = false;
        if (abstractC12024x1 == null) {
            throw new ArgumentNullException("Value of 'brush' cannot be null");
        }
        this.f40598c5 = m56900k4(abstractC12024x1);
        this.f40613x6 = f;
        this.f40605jd = 0;
        this.f40602fa = 0;
        this.f40599ck = 0;
        this.f40611up = 0;
        this.f40606ks = 0;
        this.f40614yj = 0;
        this.f40610u4 = 10.0f;
        this.f40609rv = new C11913yj();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56919k4(int i) {
        m56905wl();
        if (i < 0 || i > 4) {
            throw new InvalidEnumArgumentException("alignment value");
        }
        if (this.f40612uz) {
            throw new ArgumentException("Pen is already disposed");
        }
        this.f40606ks = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56937x1(int i) {
        if (i != 0 && i != 2 && i != 3) {
            throw new InvalidEnumArgumentException("DashCap value");
        }
        m56905wl();
        this.f40599ck = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56920k4(int i, int i2, int i3) {
        if (!this.f40600du) {
            throw new ArgumentException("Pen is not modifiable");
        }
        this.f40602fa = i;
        this.f40611up = i2;
        if (i3 == 2 || i3 == 3) {
            m56937x1(i3);
        } else {
            m56937x1(0);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m56938x1(C11898h4 c11898h4) {
        if (c11898h4 == null) {
            throw new ArgumentException("Parameter 'value' cannot be null");
        }
        if (!this.f40600du) {
            throw new ArgumentException("Pen object is immutable");
        }
        m56932to(255);
        this.f40603h4 = (C11898h4) c11898h4.deepClone();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56921k4(C11898h4 c11898h4) {
        if (c11898h4 == null) {
            throw new ArgumentException("Parameter 'value' cannot be null");
        }
        if (!this.f40600du) {
            throw new ArgumentException("Pen object is immutable");
        }
        m56909du(255);
        this.f40607m9 = (C11898h4) c11898h4.deepClone();
    }

    /* JADX INFO: renamed from: x1 */
    public void m56939x1(float[] fArr) {
        m56905wl();
        if (fArr == null || fArr.length == 0) {
            throw new ArgumentException("Argument 'value' is invalid");
        }
        for (float f : fArr) {
            if (f <= 0.0f) {
                throw new ArgumentException("Parameter is invalid");
            }
        }
        this.f40605jd = 5;
        this.f40604ix = new C7015du<>(fArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56922k4(C11913yj c11913yj) {
        m56905wl();
        if (c11913yj == null) {
            throw new ArgumentNullException("Value of 'value' cannot be null");
        }
        if (!c11913yj.m55778kk()) {
            throw new ArgumentException("Matrix 'value' must be invertible");
        }
        c11913yj.m55768k4(this.f40609rv);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56923k4(C12003du c12003du) {
        m56905wl();
        this.f40598c5 = new C11999ar(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m56901k4(boolean z) {
        if (!this.f40600du && z) {
            throw new ArgumentException("You may not change this Pen because it does not belong to you.");
        }
        this.f40612uz = true;
        if (z) {
            return;
        }
        this.f40600du = true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56924k4(float[] fArr) {
        if (fArr == null) {
            throw new NullReferenceException();
        }
        if (fArr.length == 0 || fArr.length % 2 == 1) {
            throw new ArgumentException();
        }
        if (m56917k4() == 1) {
            throw new NotImplementedException();
        }
        int length = fArr.length;
        float f = 0.0f;
        int i = 0;
        while (i < length) {
            float f2 = fArr[i];
            if (f2 < f || f2 > 1.0f) {
                throw new ArgumentException();
            }
            i++;
            f = f2;
        }
        this.f40601dy = new float[fArr.length];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4(fArr), 0, AbstractC14092to.m67208k4(this.f40601dy), 0, fArr.length);
    }
}
