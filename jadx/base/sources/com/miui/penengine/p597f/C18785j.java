package com.miui.penengine.p597f;

import OooOO0.OooO0OO;
import android.content.Context;
import com.aspose.slides.OooOOOO;
import com.google.firebase.storage.OooO;
import com.miui.penengine.facade.algorithm.JNIPathEstimateInterface;
import com.miui.penengine.p594c.C18759b;
import com.miui.penengine.p594c.EnumC18758a;
import com.miui.penengine.p595d.C18763c;
import com.miui.penengine.p596e.C18767b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.miui.penengine.f.j */
/* JADX INFO: loaded from: classes9.dex */
public class C18785j implements InterfaceC18778c {

    /* JADX INFO: renamed from: A */
    public static final int f57340A = -1;

    /* JADX INFO: renamed from: B */
    public static final int f57341B = 150;

    /* JADX INFO: renamed from: r */
    public static final String f57342r = "PredictAlgo";

    /* JADX INFO: renamed from: s */
    public static final int f57343s = 0;

    /* JADX INFO: renamed from: t */
    public static final boolean f57344t = true;

    /* JADX INFO: renamed from: u */
    public static final int f57345u = 40;

    /* JADX INFO: renamed from: v */
    public static final int f57346v = 12;

    /* JADX INFO: renamed from: w */
    public static final int f57347w = 1;

    /* JADX INFO: renamed from: x */
    public static final float f57348x = 4.333f;

    /* JADX INFO: renamed from: y */
    public static final int f57349y = 50;

    /* JADX INFO: renamed from: z */
    public static final int f57350z = 0;

    /* JADX INFO: renamed from: g */
    public C18780e f57357g;

    /* JADX INFO: renamed from: a */
    public float[][] f57351a = new float[0][];

    /* JADX INFO: renamed from: b */
    public float[] f57352b = new float[240];

    /* JADX INFO: renamed from: c */
    public float f57353c = 12.0f;

    /* JADX INFO: renamed from: d */
    public int f57354d = -1;

    /* JADX INFO: renamed from: e */
    public final float[] f57355e = new float[12];

    /* JADX INFO: renamed from: f */
    public final float[] f57356f = new float[12];

    /* JADX INFO: renamed from: h */
    public long f57358h = 5;

    /* JADX INFO: renamed from: i */
    public long f57359i = 200;

    /* JADX INFO: renamed from: j */
    public float f57360j = 0.0f;

    /* JADX INFO: renamed from: k */
    public List<C18763c> f57361k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public C18783h f57362l = C18783h.m80423a();

    /* JADX INFO: renamed from: m */
    public float[] f57363m = new float[40];

    /* JADX INFO: renamed from: n */
    public float[] f57364n = new float[12];

    /* JADX INFO: renamed from: o */
    public float[] f57365o = new float[12];

    /* JADX INFO: renamed from: p */
    public List<C18763c> f57366p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public C18767b f57367q = C18767b.m80323c();

    public C18785j(Context context) {
        this.f57357g = C18780e.m80393a(context);
        mo80392c();
        EnumC18758a.INSTANCE.m80272a(new OooO(context, 1));
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: a */
    public void mo80387a(C18763c c18763c) {
        System.nanoTime();
        if (c18763c.m80299a() == 0) {
            this.f57361k.clear();
            mo80392c();
            this.f57362l.m80427b(c18763c);
            this.f57361k.add(c18763c);
        }
        if (this.f57361k.size() > 0) {
            List<C18763c> list = this.f57361k;
            if (((C18763c) System.currentTimeMillis()).m80313e() == c18763c.m80313e()) {
                if (!c18763c.m80316h()) {
                    return;
                }
                c18763c.m80304a(c18763c.m80313e() + 1);
                C18759b.m80279e(f57342r, "Same Time point");
            }
        }
        if (c18763c.m80299a() == 2) {
            double d = this.f57360j;
            List<C18763c> list2 = this.f57361k;
            this.f57360j = (float) (C18782g.m80414a((C18763c) System.currentTimeMillis(), c18763c) + d);
            this.f57362l.m80424a(c18763c);
            c18763c.m80302a(this.f57362l.m80430e());
            c18763c.m80309b(this.f57362l.m80431f());
            c18763c.m80311c(this.f57362l.m80429d());
            c18763c.m80300a(this.f57362l.m80426b());
            c18763c.m80308b(this.f57362l.m80428c());
            this.f57361k.add(c18763c);
        }
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: b */
    public String mo80389b() {
        return "v2.1.5";
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: c */
    public void mo80392c() {
        this.f57357g.m80402c();
        this.f57362l.m80432g();
        this.f57360j = 0.0f;
        for (int i = 0; i < 12; i++) {
            this.f57355e[i] = 0.0f;
            this.f57356f[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: d */
    public float[] m80444d() {
        return this.f57357g.f57319j;
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: b */
    public void mo80391b(long j) {
        this.f57359i = j;
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: b */
    public void mo80390b(int i) {
        if (i > 0 && i <= 50) {
            this.f57353c = Math.min(12.0f, (((i * 0.85f) / 50.0f) + 0.15f) * 12.0f);
        }
        if (i <= 0) {
            this.f57353c = 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80443a(String str, float[] fArr, float[] fArr2) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < fArr.length; i++) {
            sb.append("(");
            sb.append(fArr[i]);
            sb.append(", ");
            sb.append(fArr2[i]);
            sb.append(") ");
        }
        m80442a(sb.toString());
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: a */
    public C18781f[] mo80388a() {
        int i;
        float fOooO00o;
        float f;
        float f2;
        float f3;
        boolean z;
        int i2;
        System.nanoTime();
        float fM80328b = this.f57367q.m80328b();
        int i3 = 1;
        boolean z2 = this.f57360j > ((float) this.f57359i) / fM80328b;
        int size = this.f57361k.size() - 1;
        while (this.f57366p.size() < 42) {
            this.f57366p.add(new C18763c(0.0d, 0.0d, 0L, 0));
        }
        float f4 = 4.333f;
        C18781f[] c18781fArr = null;
        if (!C18782g.m80418a(this.f57361k, this.f57366p, 4.333f, size, z2) || !this.f57357g.m80401b(this.f57366p)) {
            return null;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 40) {
            C18763c c18763c = this.f57366p.get(i4 + 2);
            int i6 = i4 + 1;
            C18763c c18763c2 = this.f57366p.get(i6);
            this.f57352b[i5] = c18763c.m80314f() - c18763c2.m80314f();
            this.f57352b[i5 + 1] = c18763c.m80315g() - c18763c2.m80315g();
            this.f57352b[i5 + 2] = (float) (c18763c.m80307b() - c18763c2.m80307b());
            int i7 = size;
            this.f57352b[i5 + 3] = (float) (c18763c.m80312d() - c18763c2.m80312d());
            int i8 = i5 + 5;
            this.f57352b[i5 + 4] = (float) (c18763c.m80310c() - c18763c2.m80310c());
            this.f57363m[i4] = C18782g.m80415a(this.f57366p.get(i4).m80314f(), this.f57366p.get(i4).m80315g(), this.f57366p.get(i6).m80314f(), this.f57366p.get(i6).m80315g(), c18763c.m80314f(), c18763c.m80315g());
            i5 += 6;
            this.f57352b[i8] = this.f57363m[i4];
            i4++;
            i3 = i3;
            size = i7;
            f4 = f4;
            c18781fArr = c18781fArr;
        }
        int i9 = i3;
        int i10 = size;
        C18781f[] c18781fArr2 = c18781fArr;
        float f5 = f4;
        System.nanoTime();
        float[] fArrRunModel = JNIPathEstimateInterface.runModel(this.f57352b, 26, 0);
        System.nanoTime();
        if (fArrRunModel == null || fArrRunModel.length != 26) {
            return c18781fArr2;
        }
        float fMax = Math.max(fArrRunModel[25], 0.0f);
        float fMax2 = Math.max(0.01f, fM80328b);
        float f6 = this.f57360j;
        float f7 = this.f57359i;
        float f8 = 1.0f;
        if (f6 < f7 / fMax2) {
            fOooO00o = ((f6 * fMax2) / f7) * 0.7f;
            i = i10;
        } else {
            i = i10;
            fOooO00o = i < 40 ? (i * 1.0f) / 40.0f : OooOOOO.OooO00o(0.55f, fMax2, 0.35f, 0.65f) * (((this.f57353c / 12.0f) * 0.6f) + 0.4f);
        }
        float fMin = Math.min(fMax * fOooO00o, this.f57353c);
        int i11 = (int) fMin;
        double dMin = Math.min(150.0d, this.f57357g.m80399b());
        int i12 = 0;
        double dM80413a = 0.0d;
        while (i12 < i11) {
            float f9 = f8;
            int i13 = i12 * 2;
            this.f57364n[i12] = this.f57361k.get(i).m80314f() + fArrRunModel[i13];
            this.f57365o[i12] = this.f57361k.get(i).m80315g() + fArrRunModel[i13 + 1];
            if (i12 <= 0 || i12 >= i11) {
                f3 = fMin;
                z = z2;
                i2 = i9;
                dM80413a = dM80413a;
            } else {
                i2 = i9;
                double d = this.f57364n[i12];
                float[] fArr = this.f57365o;
                int i14 = i12 - 1;
                f3 = fMin;
                z = z2;
                dM80413a += C18782g.m80413a(d, fArr[i12], r3[i14], fArr[i14]);
                if (dM80413a > dMin && !z) {
                    fMin = f3 - (i11 - i12);
                    i11 = i12;
                }
                i12++;
                f8 = f9;
                i9 = i2;
                z2 = z;
            }
            fMin = f3;
            i12++;
            f8 = f9;
            i9 = i2;
            z2 = z;
        }
        float f10 = fMin;
        float f11 = f8;
        int i15 = i9;
        float fM80394a = this.f57357g.m80394a();
        for (int i16 = i15; i16 <= 12; i16++) {
            int i17 = i16 - 1;
            int iMin = Math.min(i17, 11);
            if (i16 <= i11) {
                float f12 = this.f57364n[i17];
                float f13 = this.f57365o[i17];
                float f14 = f11 - fM80394a;
                float fM80314f = this.f57361k.get(i).m80314f() + (this.f57355e[iMin] * fM80394a) + ((f12 - this.f57361k.get(i).m80314f()) * f14);
                float fM80315g = this.f57361k.get(i).m80315g() + (this.f57356f[iMin] * fM80394a) + ((f13 - this.f57361k.get(i).m80315g()) * f14);
                this.f57355e[i17] = fM80314f - this.f57361k.get(i).m80314f();
                this.f57356f[i17] = fM80315g - this.f57361k.get(i).m80315g();
                this.f57364n[i17] = fM80314f;
                this.f57365o[i17] = fM80315g;
            } else if (i16 >= 2) {
                int i18 = i16 * 2;
                float fM80314f2 = this.f57361k.get(i).m80314f() + fArrRunModel[i18 - 2];
                float fM80315g2 = this.f57361k.get(i).m80315g() + fArrRunModel[i18 - 1];
                float f15 = f11 - fM80394a;
                float fM80314f3 = this.f57361k.get(i).m80314f() + (this.f57355e[iMin] * fM80394a) + ((fM80314f2 - this.f57361k.get(i).m80314f()) * f15);
                float fM80315g3 = this.f57361k.get(i).m80315g() + (this.f57356f[iMin] * fM80394a) + ((fM80315g2 - this.f57361k.get(i).m80315g()) * f15);
                this.f57355e[i17] = fM80314f3 - this.f57361k.get(i).m80314f();
                this.f57356f[i17] = fM80315g3 - this.f57361k.get(i).m80315g();
                if (i16 == i11 + 1) {
                    float f16 = f10 - i11;
                    float[] fArr2 = this.f57364n;
                    int i19 = i16 - 2;
                    float f17 = fArr2[i19];
                    fArr2[i19] = OooO0OO.OooO0O0(fM80314f3, f17, f16, f17);
                    float[] fArr3 = this.f57365o;
                    float f18 = fArr3[i19];
                    fArr3[i19] = OooO0OO.OooO0O0(fM80315g3, f18, f16, f18);
                }
                float[] fArr4 = this.f57364n;
                int i20 = i16 - 2;
                fArr4[i17] = fArr4[i20];
                float[] fArr5 = this.f57365o;
                fArr5[i17] = fArr5[i20];
            }
        }
        System.nanoTime();
        this.f57362l.m80425a(this.f57364n, this.f57365o, i11);
        System.nanoTime();
        int i21 = this.f57354d;
        if (i21 == -1) {
            i21 = i11;
        }
        int iMax = Math.max(i15, i21);
        C18781f[] c18781fArr3 = new C18781f[iMax];
        if (i11 > 0) {
            float f19 = iMax;
            int i22 = (int) ((f10 * f5) / f19);
            float f20 = (i11 * f11) / f19;
            for (int i23 = 0; i23 < iMax; i23++) {
                float fMin2 = Math.min(i23 * f20, f10 - f11);
                int iMax2 = (int) Math.max(0.0d, Math.floor(fMin2));
                float f21 = iMax2;
                if (f21 == fMin2) {
                    f2 = this.f57364n[iMax2];
                    f = this.f57365o[iMax2];
                } else {
                    float[] fArr6 = this.f57364n;
                    float f22 = (f11 - fMin2) + f21;
                    int i24 = iMax2 + 1;
                    float f23 = fMin2 - f21;
                    float f24 = (fArr6[i24] * f23) + (fArr6[iMax2] * f22);
                    float[] fArr7 = this.f57365o;
                    f = (fArr7[iMax2] * f22) + (fArr7[i24] * f23);
                    f2 = f24;
                }
                c18781fArr3[i23] = new C18781f(f2, f, this.f57361k.get(i).m80313e() + (((long) i23) * ((long) i22)));
            }
        } else {
            C18763c c18763c3 = this.f57361k.get(i);
            for (int i25 = 0; i25 < iMax; i25++) {
                c18781fArr3[i25] = new C18781f(c18763c3.m80314f(), c18763c3.m80315g(), c18763c3.m80313e());
            }
        }
        return c18781fArr3;
    }

    /* JADX INFO: renamed from: a */
    public final void m80442a(String str) {
        C18759b.m80277c(f57342r, str);
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: a */
    public void mo80386a(long j) {
        this.f57358h = j;
    }

    @Override // com.miui.penengine.p597f.InterfaceC18778c
    /* JADX INFO: renamed from: a */
    public void mo80385a(int i) {
        this.f57354d = i;
    }
}
