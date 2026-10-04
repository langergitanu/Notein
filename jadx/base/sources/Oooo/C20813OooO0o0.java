package Oooo;

import OooOo.C20486OooOoO0;
import OooOo.C20491OooOooo;
import OooOo.OooOo;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0o0.InterfaceC27605OooO00o;

/* JADX INFO: renamed from: Oooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20813OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f59765OooO00o;

    public C20813OooO0o0(InterfaceC27605OooO00o cloudSyncRepo) {
        OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f59765OooO00o = cloudSyncRepo;
    }

    public void OooO00o(Object obj, Object obj2) {
        OooOo oooOo = (OooOo) this.f59765OooO00o;
        int iOooO0o0 = oooOo.OooO0o0(obj);
        boolean z = iOooO0o0 < 0;
        Object obj3 = z ? null : oooOo.f58533OooO0OO[iOooO0o0];
        if (obj3 != null) {
            if (obj3 instanceof C20486OooOoO0) {
                ((C20486OooOoO0) obj3).OooO0Oo(obj2);
            } else if (obj3 != obj2) {
                C20486OooOoO0 c20486OooOoO0 = new C20486OooOoO0((Object) null);
                c20486OooOoO0.OooO0Oo(obj3);
                c20486OooOoO0.OooO0Oo(obj2);
                obj2 = c20486OooOoO0;
            }
            obj2 = obj3;
        }
        if (!z) {
            oooOo.f58533OooO0OO[iOooO0o0] = obj2;
            return;
        }
        int i = ~iOooO0o0;
        oooOo.f58532OooO0O0[i] = obj;
        oooOo.f58533OooO0OO[i] = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean OooO0O0(Object obj, Object obj2) {
        OooOo oooOo = (OooOo) this.f59765OooO00o;
        V vOooO0O0 = oooOo.OooO0O0(obj);
        if (vOooO0O0 == 0) {
            return false;
        }
        if (!(vOooO0O0 instanceof C20486OooOoO0)) {
            if (!vOooO0O0.equals(obj2)) {
                return false;
            }
            oooOo.OooO0oO(obj);
            return true;
        }
        C20486OooOoO0 c20486OooOoO0 = (C20486OooOoO0) vOooO0O0;
        boolean zOooOO0 = c20486OooOoO0.OooOO0(obj2);
        if (zOooOO0 && c20486OooOoO0.OooO0O0()) {
            oooOo.OooO0oO(obj);
        }
        return zOooOO0;
    }

    public void OooO0OO(Object obj) {
        boolean zOooO0O0;
        OooOo oooOo = (OooOo) this.f59765OooO00o;
        long[] jArr = oooOo.f58531OooO00o;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = oooOo.f58532OooO0O0[i4];
                        Object obj3 = oooOo.f58533OooO0OO[i4];
                        if (obj3 instanceof C20486OooOoO0) {
                            OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C20486OooOoO0 c20486OooOoO0 = (C20486OooOoO0) obj3;
                            c20486OooOoO0.OooOO0(obj);
                            zOooO0O0 = c20486OooOoO0.OooO0O0();
                        } else {
                            zOooO0O0 = obj3 == obj;
                        }
                        if (zOooO0O0) {
                            oooOo.OooO0oo(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public C20813OooO0o0() {
        long[] jArr = C20491OooOooo.f58536OooO00o;
        this.f59765OooO00o = new OooOo();
    }
}
