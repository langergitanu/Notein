package Oooo0oO;

import OooOo.C20481OooOOoo;
import OooOoOO.C20519OooO0Oo;
import java.util.ArrayList;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f61223OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f61224OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f61225OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f61226OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f61227OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C20481OooOOoo<C21066OoooOOo> f61228OooO0o0;

    public o000OOo(ArrayList arrayList, int i) {
        this.f61223OooO00o = arrayList;
        this.f61224OooO0O0 = i;
        if (!(i >= 0)) {
            o000000O.OooO0O0("Invalid start index");
            throw null;
        }
        this.f61226OooO0Oo = new ArrayList();
        C20481OooOOoo<C21066OoooOOo> c20481OooOOoo = new C20481OooOOoo<>((Object) null);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C21073OooooOO c21073OooooOO = (C21073OooooOO) this.f61223OooO00o.get(i3);
            int i4 = c21073OooooOO.f61038OooO0OO;
            int i5 = c21073OooooOO.f61039OooO0Oo;
            c20481OooOOoo.OooO0oO(i4, new C21066OoooOOo(i3, i2, i5));
            i2 += i5;
        }
        this.f61228OooO0o0 = c20481OooOOoo;
        this.f61227OooO0o = C20519OooO0Oo.OooO0OO(new o0O0O00(this));
    }

    public final boolean OooO00o(int i, int i2) {
        int i3;
        C20481OooOOoo<C21066OoooOOo> c20481OooOOoo = this.f61228OooO0o0;
        C21066OoooOOo c21066OoooOOoOooO0O0 = c20481OooOOoo.OooO0O0(i);
        if (c21066OoooOOoOooO0O0 == null) {
            return false;
        }
        int i4 = c21066OoooOOoOooO0O0.f61017OooO0O0;
        int i5 = i2 - c21066OoooOOoOooO0O0.f61018OooO0OO;
        c21066OoooOOoOooO0O0.f61018OooO0OO = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = c20481OooOOoo.f58482OooO0OO;
        long[] jArr = c20481OooOOoo.f58480OooO00o;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C21066OoooOOo c21066OoooOOo = (C21066OoooOOo) objArr[(i6 << 3) + i8];
                        if (c21066OoooOOo.f61017OooO0O0 >= i4 && !c21066OoooOOo.equals(c21066OoooOOoOooO0O0) && (i3 = c21066OoooOOo.f61017OooO0O0 + i5) >= 0) {
                            c21066OoooOOo.f61017OooO0O0 = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
