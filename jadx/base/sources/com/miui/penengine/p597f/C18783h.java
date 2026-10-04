package com.miui.penengine.p597f;

import com.miui.penengine.p595d.C18763c;

/* JADX INFO: renamed from: com.miui.penengine.f.h */
/* JADX INFO: loaded from: classes9.dex */
public class C18783h {

    /* JADX INFO: renamed from: o */
    public static C18783h f57323o;

    /* JADX INFO: renamed from: a */
    public float f57324a;

    /* JADX INFO: renamed from: b */
    public float f57325b;

    /* JADX INFO: renamed from: c */
    public float f57326c;

    /* JADX INFO: renamed from: d */
    public float f57327d;

    /* JADX INFO: renamed from: e */
    public float f57328e;

    /* JADX INFO: renamed from: f */
    public float f57329f;

    /* JADX INFO: renamed from: g */
    public float f57330g;

    /* JADX INFO: renamed from: h */
    public float f57331h;

    /* JADX INFO: renamed from: i */
    public long f57332i;

    /* JADX INFO: renamed from: j */
    public long f57333j;

    /* JADX INFO: renamed from: k */
    public C18777b f57334k;

    /* JADX INFO: renamed from: l */
    public double f57335l = 0.0d;

    /* JADX INFO: renamed from: m */
    public double f57336m = 0.0d;

    /* JADX INFO: renamed from: n */
    public double f57337n = 0.0d;

    public C18783h() {
        this.f57334k = null;
        this.f57334k = new C18777b();
    }

    /* JADX INFO: renamed from: a */
    public static C18783h m80423a() {
        if (f57323o == null) {
            f57323o = new C18783h();
        }
        return f57323o;
    }

    /* JADX INFO: renamed from: b */
    public double m80426b() {
        return this.f57337n;
    }

    /* JADX INFO: renamed from: c */
    public double m80428c() {
        return this.f57335l;
    }

    /* JADX INFO: renamed from: d */
    public double m80429d() {
        return this.f57336m;
    }

    /* JADX INFO: renamed from: e */
    public float m80430e() {
        return this.f57328e;
    }

    /* JADX INFO: renamed from: f */
    public float m80431f() {
        return this.f57329f;
    }

    /* JADX INFO: renamed from: g */
    public void m80432g() {
        this.f57328e = 0.0f;
        this.f57329f = 0.0f;
        this.f57330g = 0.0f;
        this.f57331h = 0.0f;
        this.f57324a = 0.0f;
        this.f57325b = 0.0f;
        this.f57332i = 0L;
        this.f57333j = 0L;
        this.f57336m = 0.0d;
        this.f57337n = 0.0d;
        this.f57335l = 0.0d;
    }

    /* JADX INFO: renamed from: a */
    public void m80424a(C18763c c18763c) {
        float fM80314f;
        float fM80315g;
        this.f57329f = c18763c.m80315g();
        this.f57328e = c18763c.m80314f();
        long j = this.f57332i - this.f57333j;
        float f = j == 0 ? 0.0f : (this.f57324a - this.f57326c) / j;
        float f2 = j == 0 ? 0.0f : (this.f57325b - this.f57327d) / j;
        double dSqrt = Math.sqrt((f2 * f2) + (f * f));
        if (c18763c.m80314f() == this.f57324a && c18763c.m80315g() == this.f57325b) {
            long jM80313e = c18763c.m80313e() - this.f57332i;
            float f3 = jM80313e == 0 ? 0.0f : (f - this.f57330g) / jM80313e;
            float f4 = jM80313e != 0 ? (f2 - this.f57331h) / jM80313e : 0.0f;
            if (Math.abs(f) < 0.1f) {
                fM80314f = c18763c.m80314f();
            } else {
                float f5 = jM80313e;
                fM80314f = (((f3 * f5) * f5) / 2.0f) + (f * f5) + c18763c.m80314f();
            }
            if (Math.abs(f2) < 0.1f) {
                fM80315g = c18763c.m80315g();
            } else {
                float f6 = jM80313e;
                fM80315g = (((f4 * f6) * f6) / 2.0f) + (f2 * f6) + c18763c.m80315g();
            }
            if (dSqrt > 0.30000001192092896d) {
                this.f57328e = fM80314f;
                this.f57329f = fM80315g;
            }
        } else {
            this.f57335l = c18763c.m80310c();
            this.f57336m = c18763c.m80312d();
            this.f57337n = c18763c.m80307b();
        }
        this.f57330g = f;
        this.f57331h = f2;
        this.f57327d = this.f57325b;
        this.f57326c = this.f57324a;
        this.f57324a = this.f57328e;
        this.f57325b = this.f57329f;
        this.f57333j = this.f57332i;
        this.f57332i = c18763c.m80313e();
    }

    /* JADX INFO: renamed from: b */
    public void m80427b(C18763c c18763c) {
        this.f57328e = c18763c.m80314f();
        float fM80315g = c18763c.m80315g();
        this.f57329f = fM80315g;
        float f = this.f57328e;
        this.f57324a = f;
        this.f57325b = fM80315g;
        this.f57326c = f;
        this.f57327d = fM80315g;
        this.f57330g = 0.0f;
        this.f57331h = 0.0f;
        this.f57332i = c18763c.m80313e();
        this.f57333j = c18763c.m80313e();
        this.f57336m = c18763c.m80312d();
        this.f57335l = c18763c.m80310c();
        this.f57337n = c18763c.m80307b();
    }

    /* JADX INFO: renamed from: a */
    public void m80425a(float[] fArr, float[] fArr2, int i) {
        this.f57334k.m80371a(fArr[0], fArr2[0]);
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (i2 < i) {
                this.f57334k.m80375b(fArr[i2], fArr2[i2]);
                fArr[i2] = this.f57334k.m80377c();
                fArr2[i2] = this.f57334k.m80380d();
            } else {
                int i3 = i2 - 1;
                fArr[i2] = fArr[i3];
                fArr2[i2] = fArr2[i3];
            }
        }
    }
}
