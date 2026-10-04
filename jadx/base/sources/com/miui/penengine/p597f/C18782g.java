package com.miui.penengine.p597f;

import android.graphics.Path;
import com.miui.penengine.p595d.C18763c;
import java.util.List;

/* JADX INFO: renamed from: com.miui.penengine.f.g */
/* JADX INFO: loaded from: classes9.dex */
public class C18782g {
    /* JADX INFO: renamed from: a */
    public static float m80415a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f - f3;
        float f8 = f2 - f4;
        float f9 = f5 - f3;
        float f10 = f6 - f4;
        float f11 = f5 - f;
        float f12 = f6 - f2;
        return (float) (((double) (((f7 * f10) - (f9 * f8)) * 2.0f)) / (((double) ((((float) Math.sqrt((f8 * f8) + (f7 * f7))) * ((float) Math.sqrt((f10 * f10) + (f9 * f9)))) * ((float) Math.sqrt((f12 * f12) + (f11 * f11))))) + 1.0E-9d));
    }

    /* JADX INFO: renamed from: b */
    public static C18763c[] m80421b(C18763c[] c18763cArr, int i) {
        if (c18763cArr == null || c18763cArr.length < i) {
            return null;
        }
        C18763c[] c18763cArr2 = new C18763c[i];
        int i2 = i - 1;
        for (int length = c18763cArr.length - 1; length >= 0; length--) {
            if (!c18763cArr[length].m80316h()) {
                c18763cArr2[i2] = c18763cArr[length];
                i2--;
            }
            if (i2 < 0) {
                break;
            }
        }
        if (i2 >= 0) {
            return null;
        }
        return c18763cArr2;
    }

    /* JADX INFO: renamed from: c */
    public static C18763c[] m80422c(C18763c[] c18763cArr, int i) {
        if (c18763cArr == null || c18763cArr.length < i) {
            return null;
        }
        if (c18763cArr.length == i) {
            return c18763cArr;
        }
        C18763c[] c18763cArr2 = new C18763c[i];
        System.arraycopy(c18763cArr, c18763cArr.length - i, c18763cArr2, 0, i);
        return c18763cArr2;
    }

    /* JADX INFO: renamed from: a */
    public static float m80416a(C18763c c18763c, C18763c c18763c2, C18763c c18763c3) {
        if (c18763c == null || c18763c2 == null || c18763c3 == null) {
            return 0.0f;
        }
        float fM80314f = c18763c.m80314f() - c18763c2.m80314f();
        float fM80315g = c18763c.m80315g() - c18763c2.m80315g();
        float fM80314f2 = c18763c3.m80314f() - c18763c2.m80314f();
        float fM80315g2 = c18763c3.m80315g() - c18763c2.m80315g();
        float fM80314f3 = c18763c3.m80314f() - c18763c.m80314f();
        float fM80315g3 = c18763c3.m80315g() - c18763c.m80315g();
        float f = fM80315g3 * fM80315g3;
        return (float) (((double) (((fM80314f * fM80315g2) - (fM80314f2 * fM80315g)) * 2.0f)) / (((double) ((((float) Math.sqrt((fM80315g * fM80315g) + (fM80314f * fM80314f))) * ((float) Math.sqrt((fM80315g2 * fM80315g2) + (fM80314f2 * fM80314f2)))) * ((float) Math.sqrt(f + (fM80314f3 * fM80314f3))))) + 1.0E-9d));
    }

    /* JADX INFO: renamed from: a */
    public static double m80413a(double d, double d2, double d3, double d4) {
        double d5 = d - d3;
        double d6 = d2 - d4;
        return Math.sqrt((d6 * d6) + (d5 * d5));
    }

    /* JADX INFO: renamed from: a */
    public static double m80414a(C18763c c18763c, C18763c c18763c2) {
        return Math.sqrt(((c18763c.m80315g() - c18763c2.m80315g()) * (c18763c.m80315g() - c18763c2.m80315g())) + ((c18763c.m80314f() - c18763c2.m80314f()) * (c18763c.m80314f() - c18763c2.m80314f())));
    }

    /* JADX INFO: renamed from: a */
    public static C18763c[] m80419a(C18763c[] c18763cArr, int i) {
        if (c18763cArr == null || c18763cArr.length < i) {
            return null;
        }
        C18763c[] c18763cArr2 = new C18763c[i];
        int i2 = i - 1;
        for (int length = c18763cArr.length - 1; length >= 0; length--) {
            if (c18763cArr[length].m80316h()) {
                c18763cArr2[i2] = c18763cArr[length];
                i2--;
            }
            if (i2 < 0) {
                break;
            }
        }
        if (i2 >= 0) {
            return null;
        }
        return c18763cArr2;
    }

    /* JADX INFO: renamed from: a */
    public static C18763c[] m80420a(C18763c[] c18763cArr, long j, long j2) {
        if (c18763cArr != null) {
            long jM80313e = c18763cArr[c18763cArr.length - 1].m80313e() - j;
            int length = c18763cArr.length - 1;
            double dM80414a = 0.0d;
            while (length >= 0 && c18763cArr[length].m80313e() > jM80313e) {
                if (length < c18763cArr.length - 1) {
                    dM80414a = m80414a(c18763cArr[length], c18763cArr[length + 1]) + dM80414a;
                }
                length--;
            }
            if (length != -1 && (dM80414a > j2 || length != 0)) {
                int length2 = (c18763cArr.length - length) - 1;
                C18763c[] c18763cArr2 = new C18763c[length2];
                System.arraycopy(c18763cArr, c18763cArr.length - length2, c18763cArr2, 0, length2);
                return c18763cArr2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Path m80417a(C18763c c18763c, C18781f[] c18781fArr) {
        if (c18781fArr == null || c18781fArr.length <= 0) {
            return null;
        }
        Path path = new Path();
        path.moveTo(c18763c.m80314f(), c18763c.m80315g());
        for (C18781f c18781f : c18781fArr) {
            path.lineTo(c18781f.m80410b(), c18781f.m80412c());
        }
        return path;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80418a(List<C18763c> list, List<C18763c> list2, float f, int i, boolean z) {
        List<C18763c> list3 = list;
        int size = list2.size();
        int i2 = 0;
        if (i > 0) {
            int i3 = size - 1;
            float f2 = i3 * f;
            if (list3.get(0).m80313e() <= list3.get(i).m80313e() - f2 || z) {
                boolean z2 = true;
                float fM80313e = (((float) list3.get(0).m80313e()) <= ((float) list3.get(i).m80313e()) - f2 || !z) ? f : (((list3.get(i).m80313e() - list3.get(0).m80313e()) * 1.0f) / (list3.size() - 1)) - 0.1f;
                double dM80313e = list3.get(i).m80313e();
                int i4 = i - 1;
                int i5 = 0;
                while (i5 < size) {
                    double d = dM80313e - ((double) (i5 * fM80313e));
                    while (i4 >= 0 && list3.get(i4).m80313e() > d) {
                        i4--;
                    }
                    int iMax = Math.max(i4, i2);
                    C18763c c18763c = list3.get(iMax);
                    C18763c c18763c2 = list3.get(iMax + 1);
                    int i6 = i2;
                    double dMax = 1.0d - Math.max(0.0d, (d - c18763c.m80313e()) / (c18763c2.m80313e() - c18763c.m80313e()));
                    list2.get(i3 - i5).m80301a((float) ((((double) c18763c2.m80314f()) * r3) + (((double) c18763c.m80314f()) * dMax)), (float) ((((double) c18763c2.m80315g()) * r3) + (((double) c18763c.m80315g()) * dMax)), (long) d, (float) ((c18763c2.m80310c() * r3) + (c18763c.m80310c() * dMax)), (float) ((c18763c2.m80307b() * r3) + (c18763c.m80307b() * dMax)), (float) ((c18763c2.m80312d() * r3) + (c18763c.m80312d() * dMax)), true, c18763c.m80299a());
                    i5++;
                    list3 = list;
                    fM80313e = fM80313e;
                    i4 = iMax;
                    size = size;
                    z2 = z2;
                    i2 = i6;
                }
                return z2;
            }
        }
        return false;
    }
}
