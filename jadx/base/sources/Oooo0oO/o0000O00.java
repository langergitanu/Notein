package Oooo0oO;

import OooOo.C20486OooOoO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21055Oooo0OO f61128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20486OooOoO0<Object> f61129OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(C20486OooOoO0<Object> c20486OooOoO0, InterfaceC21055Oooo0OO interfaceC21055Oooo0OO) {
        super(0);
        this.f61129OooOo0o = c20486OooOoO0;
        this.f61128OooOo = interfaceC21055Oooo0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // oO0O000o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO invoke() {
        C20486OooOoO0<Object> c20486OooOoO0 = this.f61129OooOo0o;
        Object[] objArr = c20486OooOoO0.f58542OooO0O0;
        long[] jArr = c20486OooOoO0.f58541OooO00o;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f61128OooOo.OooOOO(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
