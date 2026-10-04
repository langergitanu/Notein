package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.um */
/* JADX INFO: loaded from: classes5.dex */
public final class C12019um implements IDisposable, InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private float f40568c5;

    /* JADX INFO: renamed from: ck */
    private boolean f40569ck;

    /* JADX INFO: renamed from: du */
    private int f40570du;

    /* JADX INFO: renamed from: dy */
    private int f40571dy;

    /* JADX INFO: renamed from: fa */
    private boolean f40572fa;

    /* JADX INFO: renamed from: h4 */
    private int f40573h4;

    /* JADX INFO: renamed from: jd */
    private float[] f40574jd;

    /* JADX INFO: renamed from: k4 */
    private C12017to[] f40575k4;

    /* JADX INFO: renamed from: kk */
    private int f40576kk;

    /* JADX INFO: renamed from: m9 */
    private int f40577m9;

    /* JADX INFO: renamed from: to */
    private int f40578to;

    /* JADX INFO: renamed from: x1 */
    private int f40579x1;

    public C12019um() {
        this(0, 0);
    }

    /* JADX INFO: renamed from: c5 */
    public static C12019um m56799c5() {
        C12019um c12019um = new C12019um(24580, 0);
        c12019um.m56805du(0);
        c12019um.f40569ck = true;
        return c12019um;
    }

    /* JADX INFO: renamed from: dy */
    public static C12019um m56800dy() {
        return new C12019um();
    }

    /* JADX INFO: renamed from: u4 */
    private void m56801u4() {
        if (this.f40572fa) {
            throw new ArgumentException("Already disposed");
        }
    }

    /* JADX INFO: renamed from: ck */
    public boolean m56803ck() {
        return (m56816kk() & 2) != 0;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C12019um c12019um = (C12019um) m56808ix();
        C12017to[] c12017toArr = this.f40575k4;
        if (c12017toArr != null) {
            c12019um.f40575k4 = (C12017to[]) c12017toArr.clone();
        }
        float[] fArr = this.f40574jd;
        if (fArr != null) {
            c12019um.f40574jd = (float[]) fArr.clone();
        }
        return c12019um;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f40572fa = true;
    }

    /* JADX INFO: renamed from: du */
    public int m56804du() {
        m56801u4();
        return this.f40571dy;
    }

    /* JADX INFO: renamed from: fa */
    public boolean m56806fa() {
        return (m56816kk() & 2048) != 0;
    }

    /* JADX INFO: renamed from: h4 */
    public int m56807h4() {
        m56801u4();
        return this.f40577m9;
    }

    /* JADX INFO: renamed from: ix */
    public Object m56808ix() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: jd */
    public boolean m56809jd() {
        return (m56816kk() & 4096) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public int m56810k4() {
        m56801u4();
        return this.f40579x1;
    }

    /* JADX INFO: renamed from: kk */
    public int m56816kk() {
        m56801u4();
        return this.f40570du;
    }

    /* JADX INFO: renamed from: ks */
    public boolean m56818ks() {
        return (m56816kk() & 1) != 0;
    }

    /* JADX INFO: renamed from: m9 */
    public int m56819m9() {
        m56801u4();
        return this.f40573h4;
    }

    /* JADX INFO: renamed from: ne */
    public boolean m56820ne() {
        return this.f40569ck;
    }

    /* JADX INFO: renamed from: rv */
    public boolean m56821rv() {
        return (m56816kk() & 4) != 0;
    }

    /* JADX INFO: renamed from: to */
    public int m56822to() {
        m56801u4();
        return this.f40578to;
    }

    public String toString() {
        return "[StringFormat, FormatFlags=" + C14042ak.m66410k4(C12000bv.class, m56816kk()) + "]";
    }

    /* JADX INFO: renamed from: up */
    public boolean m56824up() {
        return (m56816kk() & 8192) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public int m56825x1() {
        m56801u4();
        return this.f40576kk;
    }

    /* JADX INFO: renamed from: x6 */
    public C12017to[] m56827x6() {
        return this.f40575k4;
    }

    /* JADX INFO: renamed from: yj */
    public boolean m56828yj() {
        return (m56816kk() & 16384) != 0;
    }

    public C12019um(int i) {
        this(i, 0);
    }

    /* JADX INFO: renamed from: x1 */
    private void m56802x1(float f, float[] fArr) {
        this.f40574jd = null;
        if (fArr.length < 0) {
            f = 0.0f;
        }
        this.f40568c5 = f;
        if (fArr.length <= 0) {
            this.f40574jd = null;
            return;
        }
        this.f40574jd = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            this.f40574jd[i] = fArr[i];
        }
    }

    /* JADX INFO: renamed from: du */
    public void m56805du(int i) {
        if (i < 0 || i > 5) {
            throw new InvalidEnumArgumentException("value");
        }
        m56801u4();
        this.f40571dy = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56811k4(float f, float[] fArr) {
        if (fArr == null) {
            throw new NullReferenceException("Value of 'tabStops' cannot be null");
        }
        if (f < 0.0f) {
            throw new ArgumentException("Value of 'firstTabOffset' is invalid");
        }
        m56802x1(f, fArr);
    }

    /* JADX INFO: renamed from: kk */
    public void m56817kk(int i) {
        m56801u4();
        this.f40570du = i;
    }

    /* JADX INFO: renamed from: to */
    public void m56823to(int i) {
        if (i < 0 || i > 2) {
            throw new InvalidEnumArgumentException("value");
        }
        m56801u4();
        this.f40578to = i;
    }

    public C12019um(int i, int i2) {
        this.f40569ck = false;
        this.f40572fa = false;
        this.f40579x1 = 0;
        this.f40577m9 = 0;
        this.f40573h4 = 0;
        this.f40570du = i;
        this.f40578to = 0;
        this.f40576kk = 0;
        this.f40571dy = 1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56812k4(int i) {
        if (i < 0 || i > 2) {
            throw new InvalidEnumArgumentException("value");
        }
        m56801u4();
        this.f40579x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m56826x1(int i) {
        if (i < 0 || i > 2) {
            throw new InvalidEnumArgumentException("value");
        }
        m56801u4();
        this.f40576kk = i;
    }

    public C12019um(C12019um c12019um) {
        this.f40569ck = false;
        this.f40572fa = false;
        if (c12019um == null) {
            throw new ArgumentNullException("format");
        }
        this.f40579x1 = c12019um.m56810k4();
        this.f40577m9 = c12019um.m56807h4();
        this.f40573h4 = c12019um.m56819m9();
        this.f40570du = c12019um.m56816kk();
        this.f40578to = c12019um.m56822to();
        this.f40576kk = c12019um.m56825x1();
        this.f40571dy = c12019um.m56804du();
        this.f40569ck = c12019um.m56820ne();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56813k4(int i, int i2) {
        this.f40573h4 = i2;
        this.f40577m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56814k4(C12017to[] c12017toArr) {
        if (c12017toArr == null) {
            throw new NullReferenceException("Value of 'range' cannot be null");
        }
        if (c12017toArr.length > 32) {
            throw new OverflowException("Value of 'range.length' should be less than 32");
        }
        if (c12017toArr.length == 0) {
            return;
        }
        this.f40575k4 = (C12017to[]) c12017toArr.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public float[] m56815k4(float[] fArr) {
        if (fArr == null) {
            throw new ArgumentNullException("Value of 'firstTabOffset' cannot be null");
        }
        float[] fArr2 = this.f40574jd;
        int i = 0;
        if (fArr2 == null) {
            fArr[0] = 0.0f;
            return new float[0];
        }
        fArr[0] = this.f40568c5;
        float[] fArr3 = new float[fArr2.length];
        while (true) {
            float[] fArr4 = this.f40574jd;
            if (i >= fArr4.length) {
                return fArr3;
            }
            fArr3[i] = fArr4[i];
            i++;
        }
    }
}
