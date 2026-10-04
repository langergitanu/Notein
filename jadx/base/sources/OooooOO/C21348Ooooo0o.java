package OooooOO;

import OooOo.C20496Oooo0o0;
import Oooo0oO.C21111o0ooOoO;
import OooooOo.AbstractC21374OooO0OO;
import OooooOo.C21373OooO0O0;
import OooooOo.C21376OooO0o;
import OooooOo.C21378OooO0oO;
import OooooOo.C21379OooO0oo;
import OooooOo.C21391OooOo0;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: OooooOO.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21348Ooooo0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f61761OooO0O0 = C20496Oooo0o0.OooO0OO(4278190080L);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f61762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f61763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final long f61764OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f61765OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final long f61766OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f61767OooO0oo = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f61768OooO00o;

    static {
        C20496Oooo0o0.OooO0OO(4282664004L);
        C20496Oooo0o0.OooO0OO(4287137928L);
        C20496Oooo0o0.OooO0OO(4291611852L);
        f61762OooO0OO = C20496Oooo0o0.OooO0OO(4294967295L);
        f61763OooO0Oo = C20496Oooo0o0.OooO0OO(4294901760L);
        C20496Oooo0o0.OooO0OO(4278255360L);
        f61765OooO0o0 = C20496Oooo0o0.OooO0OO(4278190335L);
        C20496Oooo0o0.OooO0OO(4294967040L);
        C20496Oooo0o0.OooO0OO(4278255615L);
        C20496Oooo0o0.OooO0OO(4294902015L);
        f61764OooO0o = C20496Oooo0o0.OooO0O0(0);
        f61766OooO0oO = C20496Oooo0o0.OooO00o(0.0f, 0.0f, 0.0f, 0.0f, C21376OooO0o.f61848OooOOoo);
    }

    public /* synthetic */ C21348Ooooo0o(long j) {
        this.f61768OooO00o = j;
    }

    public static String OooO(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(OooO0oo(j));
        sb.append(", ");
        sb.append(OooO0oO(j));
        sb.append(", ");
        sb.append(OooO0o0(j));
        sb.append(", ");
        sb.append(OooO0Oo(j));
        sb.append(", ");
        return C21111o0ooOoO.OooO0OO(OooO0o(j).f61827OooO00o, ')', sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long OooO00o(long j, AbstractC21374OooO0OO colorSpace) {
        C21379OooO0oo oooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        AbstractC21374OooO0OO connect = OooO0o(j);
        if (colorSpace.equals(connect)) {
            return j;
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(connect, "$this$connect");
        C21391OooOo0 c21391OooOo0 = C21376OooO0o.f61833OooO0OO;
        if (connect == c21391OooOo0) {
            if (colorSpace == c21391OooOo0) {
                oooO0O0 = C21379OooO0oo.f61852OooO0o0;
            } else if (colorSpace == C21376OooO0o.f61850OooOo00) {
                oooO0O0 = C21379OooO0oo.f61851OooO0o;
            } else if (connect == colorSpace) {
                C21378OooO0oO c21378OooO0oO = C21379OooO0oo.f61852OooO0o0;
                oooO0O0 = new C21378OooO0oO(connect, connect, 1);
            } else {
                long j2 = C21373OooO0O0.f61822OooO00o;
                oooO0O0 = (C21373OooO0O0.OooO00o(connect.f61828OooO0O0, j2) && C21373OooO0O0.OooO00o(colorSpace.f61828OooO0O0, j2)) ? new C21379OooO0oo.OooO0O0((C21391OooOo0) connect, (C21391OooOo0) colorSpace) : new C21379OooO0oo(connect, colorSpace, 0);
            }
        } else if (connect == C21376OooO0o.f61850OooOo00 && colorSpace == c21391OooOo0) {
            oooO0O0 = C21379OooO0oo.f61853OooO0oO;
        }
        return oooO0O0.OooO00o(OooO0oo(j), OooO0oO(j), OooO0o0(j), OooO0Oo(j));
    }

    public static long OooO0O0(float f, long j) {
        return C20496Oooo0o0.OooO00o(OooO0oo(j), OooO0oO(j), OooO0o0(j), f, OooO0o(j));
    }

    public static final boolean OooO0OO(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0Oo(long j) {
        float fOooO0O0;
        float f;
        if ((63 & j) == 0) {
            fOooO0O0 = (float) Oooo0O0.OooOO0.OooO0O0((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fOooO0O0 = (float) Oooo0O0.OooOO0.OooO0O0((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fOooO0O0 / f;
    }

    public static final AbstractC21374OooO0OO OooO0o(long j) {
        float[] fArr = C21376OooO0o.f61831OooO00o;
        return C21376OooO0o.f61849OooOo0[(int) (j & 63)];
    }

    public static final float OooO0o0(long j) {
        return (63 & j) == 0 ? ((float) Oooo0O0.OooOO0.OooO0O0((j >>> 32) & 255)) / 255.0f : C21350OooooOO.OooO0O0((short) ((j >>> 16) & C18177fb.f54859s));
    }

    public static final float OooO0oO(long j) {
        return (63 & j) == 0 ? ((float) Oooo0O0.OooOO0.OooO0O0((j >>> 40) & 255)) / 255.0f : C21350OooooOO.OooO0O0((short) ((j >>> 32) & C18177fb.f54859s));
    }

    public static final float OooO0oo(long j) {
        return (63 & j) == 0 ? ((float) Oooo0O0.OooOO0.OooO0O0((j >>> 48) & 255)) / 255.0f : C21350OooooOO.OooO0O0((short) ((j >>> 48) & C18177fb.f54859s));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21348Ooooo0o) {
            return this.f61768OooO00o == ((C21348Ooooo0o) obj).f61768OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61768OooO00o);
    }

    public final String toString() {
        return OooO(this.f61768OooO00o);
    }
}
