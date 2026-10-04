package OoooOOo;

import OooOo.C20486OooOoO0;
import OoooOOo.C21212OooOoO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OoooOOo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21215OooOoo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21212OooOoO0 f61554OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21215OooOoo0(C21212OooOoO0 c21212OooOoO0) {
        super(0);
        this.f61554OooOo0o = c21212OooOoO0;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // oO0O000o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO invoke() throws Throwable {
        boolean z;
        int i;
        int i2;
        C21215OooOoo0 c21215OooOoo0 = this;
        boolean z2 = true;
        while (true) {
            C21212OooOoO0 c21212OooOoO0 = c21215OooOoo0.f61554OooOo0o;
            synchronized (c21212OooOoO0.f61533OooO0o) {
                try {
                    if (c21212OooOoO0.f61531OooO0OO) {
                        z = z2;
                    } else {
                        try {
                            c21212OooOoO0.f61531OooO0OO = z2;
                            try {
                                Oooo.OooO0O0<C21212OooOoO0.OooO00o> oooO0O0 = c21212OooOoO0.f61533OooO0o;
                                int i3 = oooO0O0.f59746OooOoO0;
                                if (i3 > 0) {
                                    C21212OooOoO0.OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
                                    int i4 = 0;
                                    while (true) {
                                        C21212OooOoO0.OooO00o oooO00o = oooO00oArr[i4];
                                        C20486OooOoO0<Object> c20486OooOoO0 = oooO00o.f61544OooO0oO;
                                        Object[] objArr = c20486OooOoO0.f58542OooO0O0;
                                        long[] jArr = c20486OooOoO0.f58541OooO00o;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                z = z2;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j & 255) < 128) {
                                                            i = i6;
                                                            i2 = i8;
                                                            oooO00o.f61538OooO00o.invoke(objArr[(i5 << 3) + i8]);
                                                        } else {
                                                            i = i6;
                                                            i2 = i8;
                                                        }
                                                        j >>= i;
                                                        i8 = i2 + 1;
                                                        i6 = i;
                                                    }
                                                    if (i7 != i6) {
                                                        break;
                                                    }
                                                    if (i5 == length) {
                                                        break;
                                                    }
                                                    i5++;
                                                    z2 = z;
                                                }
                                            }
                                        } else {
                                            z = z2;
                                        }
                                        c20486OooOoO0.OooO0o0();
                                        i4++;
                                        if (i4 >= i3) {
                                            break;
                                        }
                                        z2 = z;
                                    }
                                } else {
                                    z = z2;
                                }
                                c21212OooOoO0.f61531OooO0OO = false;
                            } catch (Throwable th) {
                                c21212OooOoO0.f61531OooO0OO = false;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    c21215OooOoo0 = this;
                    if (!C21212OooOoO0.OooO00o(c21215OooOoo0.f61554OooOo0o)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    z2 = z;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }
}
