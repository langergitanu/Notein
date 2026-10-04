package o000OO0o;

import OooOo.C20481OooOOoo;
import OooOoO.C20509OooO0oo;
import Oooo0O0.OooOO0;
import OooooO0.C21292OooO0oo;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.huawei.hms.network.embedded.C18177fb;
import kotlin.jvm.internal.OooOOO0;
import o000OOO.C24497OooO0Oo;
import o000OOO.C24498OooO0o0;
import o000OOO.C24499OooO0oO;
import o000OOO.C24500OooO0oo;
import o000OOO.C24504OooOOo0;
import o000OOO.OooO0OO;

/* JADX INFO: renamed from: o000OO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24495OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f82813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f82814OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f82815OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f82816OooO00o;

    static {
        C21292OooO0oo.OooO0O0(ViewCompat.MEASURED_STATE_MASK);
        C21292OooO0oo.OooO0O0(-12303292);
        C21292OooO0oo.OooO0O0(-7829368);
        C21292OooO0oo.OooO0O0(-3355444);
        f82813OooO0O0 = C21292OooO0oo.OooO0O0(-1);
        C21292OooO0oo.OooO0O0(SupportMenu.CATEGORY_MASK);
        C21292OooO0oo.OooO0O0(-16711936);
        C21292OooO0oo.OooO0O0(-16776961);
        C21292OooO0oo.OooO0O0(InputDeviceCompat.SOURCE_ANY);
        C21292OooO0oo.OooO0O0(-16711681);
        C21292OooO0oo.OooO0O0(-65281);
        f82814OooO0OO = C21292OooO0oo.OooO0O0(0);
        C21292OooO0oo.OooO00o(0.0f, 0.0f, 0.0f, 0.0f, C24498OooO0o0.f82836OooO0oo);
    }

    public /* synthetic */ C24495OooO00o(long j) {
        this.f82816OooO00o = j;
    }

    public static final long OooO00o(long j, C24504OooOOo0 colorSpace) {
        C24499OooO0oO c24499OooO0oOOooO0Oo;
        OooOOO0.OooO0oO(colorSpace, "colorSpace");
        OooO0OO connect = OooO0Oo(j);
        OooOOO0.OooO0oO(connect, "$this$connect");
        int i = connect.f82827OooO0OO;
        int i2 = colorSpace.f82827OooO0OO;
        if ((i | i2) < 0) {
            c24499OooO0oOOooO0Oo = C24497OooO0Oo.OooO0Oo(connect, colorSpace);
        } else {
            C20481OooOOoo<C24499OooO0oO> c20481OooOOoo = C24500OooO0oo.f82845OooO00o;
            int i3 = i | (i2 << 6);
            C24499OooO0oO c24499OooO0oOOooO0O0 = c20481OooOOoo.OooO0O0(i3);
            if (c24499OooO0oOOooO0O0 == null) {
                c24499OooO0oOOooO0O0 = C24497OooO0Oo.OooO0Oo(connect, colorSpace);
                c20481OooOOoo.OooO0oO(i3, c24499OooO0oOOooO0O0);
            }
            c24499OooO0oOOooO0Oo = c24499OooO0oOOooO0O0;
        }
        return c24499OooO0oOOooO0Oo.OooO00o(j);
    }

    public static final float OooO0O0(long j) {
        float fOooO0O0;
        float f;
        if ((63 & j) == 0) {
            fOooO0O0 = (float) OooOO0.OooO0O0((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fOooO0O0 = (float) OooOO0.OooO0O0((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fOooO0O0 / f;
    }

    public static final float OooO0OO(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) OooOO0.OooO0O0((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & C18177fb.f54859s);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - C24496OooO0O0.f82817OooO00o;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final OooO0OO OooO0Oo(long j) {
        float[] fArr = C24498OooO0o0.f82829OooO00o;
        return C24498OooO0o0.f82837OooOO0[(int) (j & 63)];
    }

    public static final float OooO0o(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) OooOO0.OooO0O0((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & C18177fb.f54859s);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - C24496OooO0O0.f82817OooO00o;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float OooO0o0(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) OooOO0.OooO0O0((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & C18177fb.f54859s);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - C24496OooO0O0.f82817OooO00o;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String OooO0oO(long j) {
        float fOooO0o = OooO0o(j);
        float fOooO0o0 = OooO0o0(j);
        float fOooO0OO = OooO0OO(j);
        float fOooO0O0 = OooO0O0(j);
        String str = OooO0Oo(j).f82825OooO00o;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("Color(", fOooO0o, ", ", fOooO0o0, ", ");
        sbOooO0Oo.append(fOooO0OO);
        sbOooO0Oo.append(", ");
        sbOooO0Oo.append(fOooO0O0);
        sbOooO0Oo.append(", ");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0Oo, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24495OooO00o) {
            return this.f82816OooO00o == ((C24495OooO00o) obj).f82816OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f82816OooO00o);
    }

    public final String toString() {
        return OooO0oO(this.f82816OooO00o);
    }
}
