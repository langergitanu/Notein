package com.miui.penengine.p597f;

import OooOoO.C20509OooO0oo;
import Oooo0.C20855OooooOO;
import android.content.Context;
import com.miui.penengine.p594c.C18759b;
import com.miui.penengine.p595d.C18763c;
import com.miui.penengine.p596e.C18767b;
import java.util.List;

/* JADX INFO: renamed from: com.miui.penengine.f.e */
/* JADX INFO: loaded from: classes9.dex */
public class C18780e {

    /* JADX INFO: renamed from: k */
    public static final String f57307k = "predictParam";

    /* JADX INFO: renamed from: l */
    public static boolean f57308l = true;

    /* JADX INFO: renamed from: m */
    public static C18780e f57309m;

    /* JADX INFO: renamed from: a */
    public C18767b f57310a = C18767b.m80323c();

    /* JADX INFO: renamed from: b */
    public float f57311b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f57312c = 0.0f;

    /* JADX INFO: renamed from: d */
    public double f57313d = 999.0d;

    /* JADX INFO: renamed from: e */
    public float f57314e = 0.0f;

    /* JADX INFO: renamed from: f */
    public int f57315f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f57316g = false;

    /* JADX INFO: renamed from: h */
    public float f57317h = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f57318i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float[] f57319j;

    public C18780e(Context context) {
        m80402c();
    }

    /* JADX INFO: renamed from: a */
    public final float m80395a(List<C18763c> list, int i, int i2) {
        int i3 = i;
        if (i2 <= i3) {
            return 1.0f;
        }
        float fM80314f = 0.0f;
        float fM80314f2 = 0.0f;
        float fM80315g = 0.0f;
        float fM80315g2 = 0.0f;
        for (int i4 = i3; i4 < i2; i4 += 2) {
            C18763c c18763c = list.get(i4);
            fM80314f2 += c18763c.m80314f();
            fM80314f += c18763c.m80314f() * c18763c.m80314f();
            fM80315g += c18763c.m80315g() * c18763c.m80314f();
            fM80315g2 += c18763c.m80315g();
        }
        float f = i2 - i3;
        float f2 = (f * fM80314f) - (fM80314f2 * fM80314f2);
        float fOooO0O0 = ((double) Math.abs(f2)) > 1.0E-5d ? C20509OooO0oo.OooO0O0(fM80314f2, fM80315g2, f * fM80315g, f2) : 0.0f;
        float fOooO0O02 = ((double) Math.abs(f2)) > 1.0E-5d ? C20509OooO0oo.OooO0O0(fM80314f2, fM80315g, fM80314f * fM80315g2, f2) : 0.0f;
        float fM80315g3 = 0.0f;
        float fM80315g4 = 0.0f;
        while (i3 < i2) {
            C18763c c18763c2 = list.get(i3);
            fM80315g3 += ((c18763c2.m80315g() - (c18763c2.m80314f() * fOooO0O0)) - fOooO0O02) * ((c18763c2.m80315g() - (c18763c2.m80314f() * fOooO0O0)) - fOooO0O02);
            float f3 = fM80315g2 / f;
            fM80315g4 += (f3 - c18763c2.m80315g()) * (f3 - c18763c2.m80315g());
            i3++;
        }
        if (fM80315g3 > fM80315g4) {
            return 0.0f;
        }
        if (Math.abs(fM80315g4) > 1.0E-5d) {
            return 1.0f - (fM80315g3 / fM80315g4);
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m80400b(List<C18763c> list, int i, int i2) {
        if (i >= i2) {
            return 1.0f;
        }
        float fM80314f = 0.0f;
        float fM80315g = 0.0f;
        for (int i3 = i; i3 < i2; i3++) {
            float f = i2 - i;
            fM80314f += list.get(i3).m80314f() / f;
            fM80315g += list.get(i3).m80315g() / f;
        }
        float fM80315g2 = 0.0f;
        float fM80314f2 = 0.0f;
        float fM80315g3 = 0.0f;
        while (i < i2) {
            C18763c c18763c = list.get(i);
            fM80315g3 += (c18763c.m80315g() - fM80315g) * (c18763c.m80314f() - fM80314f);
            fM80314f2 += (c18763c.m80314f() - fM80314f) * (c18763c.m80314f() - fM80314f);
            fM80315g2 += (c18763c.m80315g() - fM80315g) * (c18763c.m80315g() - fM80315g);
            i += 2;
        }
        double d = fM80314f2;
        double d2 = fM80315g2;
        if (Math.sqrt(d2) * Math.sqrt(d) < 1.0E-4d) {
            return 0.0f;
        }
        return (float) Math.abs(((double) fM80315g3) / (Math.sqrt(d2) * Math.sqrt(d)));
    }

    /* JADX INFO: renamed from: c */
    public void m80402c() {
        this.f57318i = 0.0f;
        this.f57311b = 0.0f;
        this.f57313d = 999.0d;
        this.f57316g = false;
        this.f57315f = 0;
        this.f57314e = 0.0f;
        this.f57317h = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public void m80404d(List<C18763c> list) {
        m80406f(list);
        m80403c(list);
        if (this.f57315f > 4) {
            this.f57317h = ((((1.0f - Math.min(this.f57311b / 6.0f, 1.0f)) * 1.7f) + 3.0f) / 5.5f) + 0.76f;
            return;
        }
        float f = this.f57311b;
        if (f < 1.6f) {
            this.f57317h = C20855OooooOO.OooO00o(f, 0.8f, 3.2f, 0.6f);
        } else {
            this.f57317h = 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m80405e(List<C18763c> list) {
        float fMin;
        float f;
        float fMin2;
        if (this.f57316g) {
            int i = this.f57315f;
            if (i > 6) {
                fMin2 = (float) ((((double) Math.min(i, 7)) * 0.13d) - ((double) (Math.min(this.f57311b, 8.0f) * 0.09f)));
                this.f57318i = fMin2;
                if (this.f57311b >= 1.0f) {
                    this.f57318i = this.f57314e * 0.21f;
                    return;
                }
                return;
            }
            fMin = Math.min(i, 6);
            f = 0.04f;
        } else {
            fMin = this.f57314e;
            f = 0.1f;
        }
        fMin2 = fMin * f;
        this.f57318i = fMin2;
        if (this.f57311b >= 1.0f) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m80406f(List<C18763c> list) {
        int size = list.size();
        this.f57311b = 0.0f;
        this.f57312c = 0.0f;
        float fMax = Math.max(0.01f, this.f57310a.m80328b());
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            C18763c c18763c = list.get(i2);
            C18763c c18763c2 = list.get(i);
            float fM80314f = (c18763c.m80314f() - c18763c2.m80314f()) * fMax;
            float fM80315g = (c18763c.m80315g() - c18763c2.m80315g()) * fMax;
            float fM80313e = (c18763c.m80313e() - c18763c2.m80313e()) * 1.0f;
            float fHypot = (float) Math.hypot(fM80314f / fM80313e, fM80315g / fM80313e);
            if (i >= size / 2) {
                float f = this.f57311b;
                if (f <= fHypot) {
                    f = fHypot;
                }
                this.f57311b = f;
                this.f57312c += fHypot;
            }
            i = i2;
        }
        this.f57312c /= size - (size / 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m80398a(List<C18763c> list) {
        StringBuilder sb = new StringBuilder("After Resample Step1 ");
        for (int i = 0; i < list.size(); i++) {
            m80396a(list.get(i), sb);
        }
        m80397a(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public double m80399b() {
        return this.f57313d;
    }

    /* JADX INFO: renamed from: c */
    public final void m80403c(List<C18763c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = list.size();
        float fM80400b = m80400b(list, size / 2, size);
        float fM80400b2 = m80400b(list, 0, size);
        boolean z = Math.min(fM80400b2, fM80400b) > 0.98f;
        this.f57316g = z;
        if (z) {
            this.f57315f++;
        } else {
            this.f57315f = 0;
        }
        this.f57314e = fM80400b2;
    }

    /* JADX INFO: renamed from: a */
    public float m80394a() {
        return this.f57318i;
    }

    /* JADX INFO: renamed from: b */
    public boolean m80401b(List<C18763c> list) {
        m80404d(list);
        m80405e(list);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static C18780e m80393a(Context context) {
        if (f57309m == null) {
            f57309m = new C18780e(context);
        }
        return f57309m;
    }

    /* JADX INFO: renamed from: a */
    public final void m80397a(String str) {
        if (f57308l) {
            C18759b.m80277c(f57307k, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80396a(C18763c c18763c, StringBuilder sb) {
        sb.append("(");
        sb.append(c18763c.m80314f());
        sb.append(",");
        sb.append(c18763c.m80315g());
        sb.append(",");
        sb.append(c18763c.m80313e());
        sb.append(")");
    }
}
