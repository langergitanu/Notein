package com.aspose.slides.internal.p472w8;

import Oooo0oO.o0Oo0oo;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p308o1.C6965k4;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.rv */
/* JADX INFO: loaded from: classes4.dex */
public final class C11906rv extends AbstractC12024x1 {

    /* JADX INFO: renamed from: c5 */
    private int f40090c5;

    /* JADX INFO: renamed from: ck */
    private boolean f40091ck;

    /* JADX INFO: renamed from: du */
    private C12025x6 f40092du;

    /* JADX INFO: renamed from: dy */
    private C11902kk f40093dy;

    /* JADX INFO: renamed from: fa */
    private boolean f40094fa;

    /* JADX INFO: renamed from: h4 */
    private C12007ix f40095h4;

    /* JADX INFO: renamed from: jd */
    private C11896dy f40096jd;

    /* JADX INFO: renamed from: kk */
    private C12003du f40097kk;

    /* JADX INFO: renamed from: ks */
    private boolean f40098ks;

    /* JADX INFO: renamed from: m9 */
    private C12003du[] f40099m9;

    /* JADX INFO: renamed from: rv */
    private boolean f40100rv;

    /* JADX INFO: renamed from: to */
    private C12025x6 f40101to;

    /* JADX INFO: renamed from: up */
    private float f40102up;

    /* JADX INFO: renamed from: x1 */
    private C11911x1 f40103x1;

    /* JADX INFO: renamed from: yj */
    private float f40104yj;

    public C11906rv(C11896dy c11896dy) {
        this.f40097kk = new C12003du();
        this.f40101to = new C12025x6();
        this.f40092du = new C12025x6();
        this.f40095h4 = new C12007ix();
        this.f40090c5 = 4;
        this.f40091ck = false;
        this.f40094fa = false;
        this.f40102up = 1.0f;
        this.f40104yj = 1.0f;
        this.f40098ks = false;
        this.f40100rv = false;
        m55676k4(c11896dy != null ? (C11896dy) c11896dy.deepClone() : null, 4, true, true, true, true, false);
    }

    /* JADX INFO: renamed from: to */
    private void m55679to(float f, float f2) {
        this.f40102up = f;
        this.f40104yj = f2;
        int i = (f == 0.0f || f == 1.0f) ? 256 : FrameMetricsAggregator.EVERY_DURATION;
        float[] fArr = new float[i];
        float[] fArr2 = new float[i];
        if (f == 0.0f) {
            fArr2[0] = f;
            fArr[0] = f2;
            m55678k4(fArr2, fArr, 0, f, f2, 2.0f);
            int i2 = i - 1;
            fArr2[i2] = 1.0f;
            fArr[i2] = 0.0f;
        } else if (f == 1.0f) {
            fArr2[0] = 0.0f;
            fArr[0] = 0.0f;
            m55677k4(fArr2, fArr, f, f2, 2.0f);
            int i3 = i - 1;
            fArr2[i3] = f;
            fArr[i3] = f2;
        } else {
            fArr2[0] = 0.0f;
            fArr[0] = 0.0f;
            m55677k4(fArr2, fArr, f, f2, 2.0f);
            fArr2[255] = f;
            fArr[255] = f2;
            m55678k4(fArr2, fArr, 255, f, f2, 2.0f);
            int i4 = i - 1;
            fArr2[i4] = 1.0f;
            fArr[i4] = 0.0f;
        }
        C11911x1 c11911x1 = new C11911x1();
        c11911x1.m55742k4(fArr);
        c11911x1.m55746x1(fArr2);
        m55691k4(c11911x1);
    }

    /* JADX INFO: renamed from: c5 */
    public C12025x6 m55681c5() {
        return this.f40092du;
    }

    /* JADX INFO: renamed from: ck */
    public C12003du[] m55682ck() {
        C12003du[] c12003duArr = this.f40099m9;
        if (c12003duArr == null) {
            return new C12003du[]{C12003du.m56385i5()};
        }
        C12003du[] c12003duArr2 = new C12003du[c12003duArr.length];
        int i = 0;
        while (true) {
            C12003du[] c12003duArr3 = this.f40099m9;
            if (i >= c12003duArr3.length) {
                return c12003duArr2;
            }
            c12003duArr2[i] = c12003duArr3[i].Clone();
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12024x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11906rv c11906rv = (C11906rv) m56874kk();
        C12003du[] c12003duArr = c11906rv.f40099m9;
        if (c12003duArr != null) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c12003duArr), 0, AbstractC14092to.m67208k4((Object) c11906rv.f40099m9), 0, c11906rv.f40099m9.length);
        }
        C11896dy c11896dy = c11906rv.f40096jd;
        if (c11896dy != null) {
            c11906rv.f40096jd = (C11896dy) c11896dy.deepClone();
        }
        if (this.f40093dy != null) {
            c11906rv.f40093dy = new C11902kk();
            if (this.f40093dy.m55668k4() != null) {
                c11906rv.f40093dy.m55667k4((C12003du[]) this.f40093dy.m55668k4().clone());
            }
            if (this.f40093dy.m55669x1() != null) {
                c11906rv.f40093dy.m55666k4((float[]) this.f40093dy.m55669x1().clone());
            }
        }
        if (this.f40103x1 != null) {
            c11906rv.f40103x1 = new C11911x1();
            if (this.f40103x1.m55747x1() != null) {
                c11906rv.f40103x1.m55743kk((float[]) this.f40103x1.m55747x1().clone());
            }
            if (this.f40103x1.m55744kk() != null) {
                c11906rv.f40103x1.m55745to((float[]) this.f40103x1.m55744kk().clone());
            }
            c11906rv.f40103x1.f40118k4 = this.f40103x1.f40118k4;
        }
        c11906rv.f40101to = this.f40101to.Clone();
        c11906rv.f40097kk = this.f40097kk.Clone();
        c11906rv.f40095h4 = this.f40095h4.Clone();
        c11906rv.f40091ck = this.f40091ck;
        c11906rv.f40094fa = this.f40094fa;
        c11906rv.f40104yj = this.f40104yj;
        c11906rv.f40102up = this.f40102up;
        c11906rv.f40098ks = this.f40098ks;
        c11906rv.f40100rv = this.f40100rv;
        c11906rv.f40092du = this.f40092du;
        c11906rv.f40090c5 = this.f40090c5;
        return c11906rv;
    }

    /* JADX INFO: renamed from: du */
    public C12012lr m55683du(C11913yj c11913yj) {
        return new C6965k4(this, this.f40096jd).m27229k4(c11913yj);
    }

    /* JADX INFO: renamed from: dy */
    public C12025x6 m55684dy() {
        return this.f40101to;
    }

    /* JADX INFO: renamed from: fa */
    public C11913yj m55685fa() {
        return m56867du();
    }

    /* JADX INFO: renamed from: h4 */
    public C11911x1 m55686h4() {
        if (this.f40098ks) {
            return null;
        }
        if (this.f40103x1 == null) {
            C11911x1 c11911x1 = new C11911x1();
            c11911x1.m55743kk(new float[]{1.0f});
            c11911x1.m55745to(new float[]{0.0f});
            this.f40103x1 = c11911x1;
        }
        return this.f40103x1;
    }

    /* JADX INFO: renamed from: jd */
    public C11902kk m55687jd() {
        if (!this.f40098ks) {
            C11902kk c11902kk = new C11902kk();
            c11902kk.m55667k4(new C12003du[]{C12003du.f40505to.Clone()});
            c11902kk.m55666k4(new float[]{0.0f});
            this.f40093dy = c11902kk;
        }
        return this.f40093dy;
    }

    /* JADX INFO: renamed from: k4 */
    public float m55688k4(float f, float f2, float f3) {
        float fSqrt = (float) (2.0d / Math.sqrt(3.141592653589793d));
        double dSqrt = (float) (((double) ((f - f3) / f2)) / Math.sqrt(2.0d));
        return fSqrt * ((float) (((Math.pow(dSqrt, 9.0d) / 216.0d) + (((Math.pow(dSqrt, 5.0d) / 10.0d) + (dSqrt - (Math.pow(dSqrt, 3.0d) / 3.0d))) - (Math.pow(dSqrt, 7.0d) / 42.0d))) - (Math.pow(dSqrt, 11.0d) / 1420.0d)));
    }

    /* JADX INFO: renamed from: kk */
    public void m55695kk(float f, float f2) {
        if (f > 1.0f || f < 0.0f) {
            throw new ArgumentException("Parameter 'focus' is not valid");
        }
        if (f2 > 1.0f || f2 < 0.0f) {
            throw new ArgumentException("Parameter 'scale' is not valid");
        }
        m55680x1(false);
        this.f40102up = f;
        this.f40104yj = f2;
        m55675k4(this.f40096jd, this.f40090c5, false, false, true, true);
        m55679to(f, f2);
    }

    /* JADX INFO: renamed from: m9 */
    public C12003du m55698m9() {
        return this.f40097kk;
    }

    /* JADX INFO: renamed from: up */
    public int m55700up() {
        return this.f40090c5;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55701x1(float f, int i) {
        super.m56870k4(f, i);
    }

    public C11906rv(C12025x6[] c12025x6Arr) {
        this(c12025x6Arr, 4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55689k4(int i) {
        if (!AbstractC14106wy.isDefined((Class<?>) C11910uz.class, i)) {
            throw new InvalidEnumArgumentException("The value of argument 'value' is invalid for Enum type 'WrapMode'");
        }
        this.f40090c5 = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m55696kk(float f, float f2, int i) {
        super.m56869k4(f, f2, i);
    }

    /* JADX INFO: renamed from: to */
    public void m55699to(C11913yj c11913yj) {
        super.m56879x1(c11913yj);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55702x1(C11913yj c11913yj, int i) {
        super.m56872k4(c11913yj, i);
    }

    public C11906rv(C12025x6[] c12025x6Arr, int i) {
        this.f40097kk = new C12003du();
        this.f40101to = new C12025x6();
        this.f40092du = new C12025x6();
        this.f40095h4 = new C12007ix();
        this.f40090c5 = 4;
        this.f40091ck = false;
        this.f40094fa = false;
        this.f40102up = 1.0f;
        this.f40104yj = 1.0f;
        this.f40098ks = false;
        this.f40100rv = false;
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Argument 'points' cannot be null");
        }
        if (c12025x6Arr.length < 2) {
            throw new OutOfMemoryException("Gradient points count must be 2 or more");
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55564kk(c12025x6Arr);
        m55675k4(c11896dy, i, true, true, true, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55675k4(C11896dy c11896dy, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        m55676k4(c11896dy, i, z, z2, z3, z4, true);
    }

    /* JADX INFO: renamed from: kk */
    public void m55697kk(C11913yj c11913yj) {
        m56871k4(c11913yj);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55703x1(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f40092du);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55676k4(C11896dy c11896dy, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (c11896dy == null) {
            throw new ArgumentNullException("Argument path cannot be null");
        }
        if (c11896dy.m55530jd().m56568kk()) {
            throw new OutOfMemoryException("Argument path cannot be empty");
        }
        if (!AbstractC14106wy.isDefined((Class<?>) C11910uz.class, i)) {
            throw new InvalidEnumArgumentException(o0Oo0oo.OooO0O0(i, "Argument value [", "] is invalid for Enum type 'wrapMode'"));
        }
        this.f40096jd = c11896dy;
        this.f40090c5 = i;
        this.f40095h4 = c11896dy.m55523c5();
        if (z4) {
            C11902kk c11902kk = new C11902kk(1);
            this.f40093dy = c11902kk;
            c11902kk.m55668k4()[0] = C12003du.m56396k4(0);
            this.f40093dy.m55669x1()[0] = 0.0f;
        }
        if (z3) {
            C11911x1 c11911x1 = new C11911x1(1);
            this.f40103x1 = c11911x1;
            c11911x1.m55743kk(new float[]{1.0f});
            this.f40103x1.m55745to(new float[]{0.0f});
            this.f40103x1.m55741k4();
        }
        if (z) {
            (z5 ? C12003du.m56460uz() : C12003du.m56385i5()).CloneTo(this.f40097kk);
            this.f40099m9 = new C12003du[]{C12003du.m56385i5()};
        }
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        c11896dy2.m55526dy();
        C12025x6[] c12025x6ArrM55565kk = c11896dy2.m55565kk();
        if (z2) {
            for (int i2 = 0; i2 < c12025x6ArrM55565kk.length; i2++) {
                C12025x6 c12025x6 = this.f40101to;
                OooO00o.OooO0O0(c12025x6ArrM55565kk[i2], c12025x6, c12025x6.m56897x1());
                C12025x6 c12025x62 = this.f40101to;
                c12025x62.m56898x1(c12025x6ArrM55565kk[i2].m56895kk() + c12025x62.m56895kk());
            }
            C12025x6 c12025x63 = this.f40101to;
            c12025x63.m56891k4(c12025x63.m56897x1() / c12025x6ArrM55565kk.length);
            C12025x6 c12025x64 = this.f40101to;
            c12025x64.m56898x1(c12025x64.m56895kk() / c12025x6ArrM55565kk.length);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m55680x1(boolean z) {
        this.f40091ck = z;
        this.f40094fa = true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55690k4(C11902kk c11902kk) {
        this.f40098ks = true;
        this.f40100rv = false;
        if (c11902kk == null) {
            throw new NullPointerException("The InterpolationColors value cannot be null");
        }
        this.f40093dy = c11902kk;
        m55675k4(this.f40096jd, this.f40090c5, false, false, true, false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55691k4(C11911x1 c11911x1) {
        if (c11911x1 == null) {
            throw new NullReferenceException("The blend value cannot be null");
        }
        if (c11911x1.m55744kk().length != c11911x1.m55747x1().length) {
            throw new ArgumentOutOfRangeException("Requested diapason exceeds array size");
        }
        if (c11911x1.m55744kk().length > 1 && (c11911x1.m55744kk()[0] != 0.0f || c11911x1.m55744kk()[c11911x1.m55744kk().length - 1] != 1.0f)) {
            throw new ArgumentException("Parameter's value is invalid");
        }
        this.f40103x1 = c11911x1;
        c11911x1.m55741k4();
        this.f40100rv = true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55692k4(C12003du c12003du) {
        c12003du.CloneTo(this.f40097kk);
        m55675k4(this.f40096jd, this.f40090c5, false, false, false, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55693k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f40101to);
        m55675k4(this.f40096jd, this.f40090c5, false, false, false, false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55677k4(float[] fArr, float[] fArr2, float f, float f2, float f3) {
        float f4 = f / (f3 * 2.0f);
        float f5 = f / 2.0f;
        float f6 = f / 255.0f;
        float fM55688k4 = (m55688k4(0.0f, f4, f5) + 1.0f) * 0.5f;
        float fM55688k42 = ((m55688k4(f, f4, f5) + 1.0f) * 0.5f) - fM55688k4;
        int i = 1;
        float f7 = f6;
        while (i < 255) {
            fArr[i] = f7;
            fArr2[i] = (((m55688k4(f7, f4, f5) + 1.0f) * 0.5f) - fM55688k4) * (f2 / fM55688k42);
            i++;
            f7 += f6;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m55678k4(float[] fArr, float[] fArr2, int i, float f, float f2, float f3) {
        float f4 = 1.0f - f;
        float f5 = f4 / (f3 * 2.0f);
        float f6 = (f + 1.0f) / 2.0f;
        float f7 = f4 / 255.0f;
        float fM55688k4 = (1.0f - m55688k4(1.0f, f5, f6)) * 0.5f;
        float fM55688k42 = ((1.0f - m55688k4(f, f5, f6)) * 0.5f) - fM55688k4;
        float f8 = f + f7;
        int i2 = 1;
        while (i2 < 255) {
            int i3 = i2 + i;
            fArr[i3] = f8;
            fArr2[i3] = (((1.0f - m55688k4(f8, f5, f6)) * 0.5f) - fM55688k4) * (f2 / fM55688k42);
            i2++;
            f8 += f7;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55694k4(C12003du[] c12003duArr) {
        if (c12003duArr == null) {
            throw new NullReferenceException("Argument value cannot be null");
        }
        if (c12003duArr.length == 0) {
            throw new ArgumentException("Argument value cannot be empty");
        }
        if (c12003duArr.length > this.f40096jd.m55525du()) {
            throw new ArgumentException("Parameter is not valid");
        }
        List list = new List(c12003duArr.length);
        int length = c12003duArr.length;
        for (int i = 0; i < c12003duArr.length; i++) {
            if (!c12003duArr[i].m56504dy()) {
                length = c12003duArr.length;
            } else if (length == c12003duArr.length) {
                length = i;
            }
            list.addItem(c12003duArr[i].Clone());
        }
        int length2 = c12003duArr.length;
        while (true) {
            length2--;
            if (length2 < length + 1) {
                this.f40099m9 = (C12003du[]) list.toArray(new C12003du[list.size()]);
                m55675k4(this.f40096jd, this.f40090c5, false, false, false, true);
                return;
            }
            list.remove(length2);
        }
    }
}
