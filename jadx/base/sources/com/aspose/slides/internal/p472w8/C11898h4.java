package com.aspose.slides.internal.p472w8;

import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p282mu.C6542kk;
import com.aspose.slides.internal.p314oc.C7015du;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11898h4 implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: c5 */
    protected int f40066c5;

    /* JADX INFO: renamed from: du */
    protected int f40067du;

    /* JADX INFO: renamed from: dy */
    protected int f40068dy;

    /* JADX INFO: renamed from: h4 */
    protected C11896dy f40069h4;

    /* JADX INFO: renamed from: jd */
    private boolean f40070jd;

    /* JADX INFO: renamed from: k4 */
    protected int f40071k4;

    /* JADX INFO: renamed from: kk */
    protected int f40072kk;

    /* JADX INFO: renamed from: m9 */
    protected C11896dy f40073m9;

    /* JADX INFO: renamed from: to */
    protected float f40074to;

    /* JADX INFO: renamed from: x1 */
    protected float f40075x1;

    public C11898h4() {
        this.f40070jd = false;
    }

    /* JADX INFO: renamed from: k4 */
    private static C11898h4 m55586k4(C11898h4 c11898h4) {
        int i = c11898h4.f40067du;
        if (i == 0) {
            C11898h4 c11898h42 = new C11898h4();
            m55591k4(c11898h4, c11898h42);
            return c11898h42;
        }
        if (i == 1) {
            return new C11901k4(c11898h4);
        }
        c11898h4.m55592x1();
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: c5 */
    public float m55596c5() {
        return this.f40074to;
    }

    /* JADX INFO: renamed from: ck */
    public boolean m55597ck() {
        return m55608up() != null;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C7015du<C11898h4> c7015du = new C7015du<>(null);
        if (m55594x1(c7015du)) {
            return m55586k4(c7015du.f19072k4);
        }
        throw new ArgumentException();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m55610x1(true);
    }

    /* JADX INFO: renamed from: du */
    public void m55598du(float f) {
        this.f40074to = f;
    }

    /* JADX INFO: renamed from: dy */
    public float m55599dy() {
        return this.f40075x1;
    }

    /* JADX INFO: renamed from: fa */
    public C11896dy m55600fa() {
        return this.f40069h4;
    }

    /* JADX INFO: renamed from: h4 */
    public int m55601h4() {
        return this.f40071k4;
    }

    /* JADX INFO: renamed from: jd */
    public void m55602jd() {
        this.f40071k4 = 0;
        this.f40068dy = 0;
        this.f40066c5 = 0;
        this.f40072kk = 0;
        this.f40075x1 = 0.0f;
        this.f40074to = 1.0f;
        this.f40069h4 = null;
        this.f40073m9 = null;
    }

    /* JADX INFO: renamed from: m9 */
    public int m55606m9() {
        return this.f40072kk;
    }

    /* JADX INFO: renamed from: to */
    public void m55607to(float f) {
        this.f40075x1 = f;
    }

    /* JADX INFO: renamed from: up */
    public C11896dy m55608up() {
        return this.f40073m9;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55609x1(int i) {
        this.f40072kk = i;
    }

    public C11898h4(C11896dy c11896dy, C11896dy c11896dy2) {
        this(c11896dy, c11896dy2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55603k4(int i) {
        this.f40071k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55610x1(boolean z) {
        if (this.f40070jd) {
            return;
        }
        this.f40070jd = true;
    }

    public C11898h4(C11896dy c11896dy, C11896dy c11896dy2, int i) {
        this(c11896dy, c11896dy2, i, 0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m55592x1() {
        return m55587k4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m55604k4(int i, int i2) {
        if (!m55593x1(i, i2)) {
            throw new ArgumentException();
        }
    }

    public C11898h4(C11896dy c11896dy, C11896dy c11896dy2, int i, float f) {
        C11896dy c11896dy3;
        this.f40070jd = false;
        if (c11896dy == null && c11896dy2 == null) {
            throw new ArgumentException("Values of 'fillPath' and 'strokePath' cannot be null both");
        }
        if (c11896dy != null && c11896dy.m55525du() > 0 && c11896dy.m55525du() <= 2) {
            throw new ArgumentException("Parameter is invalid");
        }
        if (c11896dy != null && c11896dy2 == c11896dy) {
            throw new InvalidOperationException("Object is currently in use elsewhere");
        }
        if (c11896dy != null && c11896dy.m55525du() > 0 && (c11896dy.m55530jd().m56571to() > 0.0f || c11896dy.m55530jd().m56551ck() >= 0.0f || c11896dy.m55530jd().m56556h4() < 0.0f)) {
            throw new NotImplementedException();
        }
        if (c11896dy != null && c11896dy.m55525du() > 0 && !m55589k4(c11896dy)) {
            throw new NotImplementedException();
        }
        m55602jd();
        C11896dy c11896dy4 = null;
        if (c11896dy != null) {
            c11896dy3 = (C11896dy) c11896dy.deepClone();
            if (c11896dy3 == null) {
                throw new OutOfMemoryException();
            }
        } else {
            c11896dy3 = null;
        }
        this.f40069h4 = c11896dy3;
        if (c11896dy2 != null && (c11896dy4 = (C11896dy) c11896dy2.deepClone()) == null) {
            throw new OutOfMemoryException();
        }
        this.f40073m9 = c11896dy4;
        this.f40071k4 = i;
        this.f40075x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m55593x1(int i, int i2) {
        this.f40068dy = i;
        this.f40066c5 = i2;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55605k4(int[] iArr, int[] iArr2) {
        if (!m55595x1(iArr, iArr2)) {
            throw new ArgumentException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m55587k4() {
        C11896dy c11896dy = this.f40069h4;
        if (c11896dy != null) {
            c11896dy.dispose();
            this.f40069h4 = null;
        }
        C11896dy c11896dy2 = this.f40073m9;
        if (c11896dy2 == null) {
            return true;
        }
        c11896dy2.dispose();
        this.f40073m9 = null;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m55594x1(C7015du<C11898h4> c7015du) {
        if (c7015du == null) {
            return false;
        }
        return m55588k4(c7015du);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E, com.aspose.slides.internal.w8.h4] */
    /* JADX INFO: renamed from: k4 */
    private boolean m55588k4(C7015du<C11898h4> c7015du) {
        if (c7015du == null) {
            return false;
        }
        ?? c11898h4 = new C11898h4();
        m55591k4(this, (C11898h4) c11898h4);
        c7015du.f19072k4 = c11898h4;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m55595x1(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr2 == null) {
            return false;
        }
        iArr[0] = this.f40068dy;
        iArr2[0] = this.f40066c5;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m55589k4(C11896dy c11896dy) {
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        c11896dy.m55571to();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < c12025x6ArrM55565kk.length && C21036OooOOo0.OooO00o(i, 1, i2, i3) != 4; i4++) {
            if (c12025x6ArrM55565kk[i4].m56897x1() >= 0.0f) {
                if (c12025x6ArrM55565kk[i4].m56895kk() >= 0.0f) {
                    i = 1;
                } else {
                    i3 = 1;
                }
            } else if (c12025x6ArrM55565kk[i4].m56895kk() < 0.0f) {
                i2 = 1;
            }
        }
        if (C21036OooOOo0.OooO00o(i, 1, i2, i3) == 4) {
            return true;
        }
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        c11896dy2.m55526dy();
        float f = 999999;
        boolean zM55590k4 = m55590k4(c11896dy2, 0.0f, -999999, 0.0f, f, 0.5f);
        return (zM55590k4 && c11896dy2.m55584x6()) || (m55590k4(c11896dy2, 0.0f, 0.0f, f, 0.0f, 0.5f) && zM55590k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m55590k4(C11896dy c11896dy, float f, float f2, float f3, float f4, float f5) {
        int i;
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        byte[] bArrM55571to = c11896dy.m55571to();
        C12025x6 c12025x6 = new C12025x6(f, f2);
        C12025x6 c12025x62 = new C12025x6(f + f3, f2 + f4);
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < c12025x6ArrM55565kk.length) {
            int i5 = i3 + 1;
            byte b = bArrM55571to[i3];
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0 && i2 == i3 - 1) {
                i = i3 - 1;
            } else if (i3 != c12025x6ArrM55565kk.length - 1) {
                i5 = i4;
                i4 = i5;
                i = i3;
            } else {
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return false;
                }
                i = i3;
                i5 = i4;
                i4 = 0;
            }
            C12025x6 c12025x6M26358k4 = C6542kk.m26358k4(c12025x6ArrM55565kk[i3], c12025x6ArrM55565kk[i4], c12025x62, c12025x6);
            if (c12025x6M26358k4 != null && C6542kk.m26364x1(c12025x6ArrM55565kk[i3], c12025x6ArrM55565kk[i4], c12025x6M26358k4, f5) && C6542kk.m26364x1(c12025x62, c12025x6, c12025x6M26358k4, f5)) {
                return true;
            }
            double dM26361kk = C6542kk.m26361kk(c12025x6ArrM55565kk[i3], c12025x6ArrM55565kk[i4]);
            C11896dy c11896dy2 = new C11896dy();
            c11896dy2.m55547k4(c12025x6ArrM55565kk[i3], c12025x6ArrM55565kk[i4]);
            C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
            c11913yj.m55762k4((float) (-Math.toDegrees(dM26361kk)));
            c11896dy2.m55577x1(c11913yj);
            C11896dy c11896dy3 = new C11896dy();
            c11896dy3.m55547k4(c12025x6, c12025x62);
            c11896dy3.m55577x1(c11913yj);
            int i6 = i3;
            if (c11896dy3.m55558k4(c11896dy2.m55530jd().m56557jd() - f5, c11896dy2.m55530jd().m56551ck() - f5, c11896dy2.m55530jd().m56550c5() + r0, f5 * 2.0f)) {
                return true;
            }
            i3 = i + 1;
            i4 = i5;
            i2 = i6;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55591k4(C11898h4 c11898h4, C11898h4 c11898h42) {
        if (c11898h4 == null || c11898h42 == null) {
            return false;
        }
        c11898h42.f40071k4 = c11898h4.f40071k4;
        c11898h42.f40068dy = c11898h4.f40068dy;
        c11898h42.f40066c5 = c11898h4.f40066c5;
        c11898h42.f40072kk = c11898h4.f40072kk;
        c11898h42.f40075x1 = c11898h4.f40075x1;
        c11898h42.f40074to = c11898h4.f40074to;
        c11898h42.f40067du = c11898h4.f40067du;
        C11896dy c11896dy = c11898h4.f40069h4;
        c11898h42.f40069h4 = c11896dy != null ? (C11896dy) c11896dy.deepClone() : null;
        C11896dy c11896dy2 = c11898h4.f40073m9;
        c11898h42.f40073m9 = c11896dy2 != null ? (C11896dy) c11896dy2.deepClone() : null;
        return true;
    }
}
