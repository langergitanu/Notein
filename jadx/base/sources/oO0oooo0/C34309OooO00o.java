package oO0oooo0;

import o000o0Oo.C24610OooO0O0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34309OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f123177OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f123178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f123179OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public short[][][] f123180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public short[][] f123181OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public short[][][] f123182OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public short[] f123183OooO0oO;

    public final boolean equals(Object obj) {
        boolean zOooO0oo;
        boolean zOooO0oo2;
        if (obj != null && (obj instanceof C34309OooO00o)) {
            C34309OooO00o c34309OooO00o = (C34309OooO00o) obj;
            if (this.f123177OooO00o == c34309OooO00o.f123177OooO00o && this.f123178OooO0O0 == c34309OooO00o.f123178OooO0O0 && this.f123179OooO0OO == c34309OooO00o.f123179OooO0OO) {
                short[][][] sArr = this.f123180OooO0Oo;
                short[][][] sArr2 = c34309OooO00o.f123180OooO0Oo;
                if (sArr.length != sArr2.length) {
                    zOooO0oo = false;
                } else {
                    zOooO0oo = true;
                    for (int length = sArr.length - 1; length >= 0; length--) {
                        zOooO0oo &= C24610OooO0O0.OooO0oo(sArr[length], sArr2[length]);
                    }
                }
                if (zOooO0oo) {
                    short[][][] sArr3 = this.f123182OooO0o0;
                    short[][][] sArr4 = c34309OooO00o.f123182OooO0o0;
                    if (sArr3.length != sArr4.length) {
                        zOooO0oo2 = false;
                    } else {
                        zOooO0oo2 = true;
                        for (int length2 = sArr3.length - 1; length2 >= 0; length2--) {
                            zOooO0oo2 &= C24610OooO0O0.OooO0oo(sArr3[length2], sArr4[length2]);
                        }
                    }
                    if (zOooO0oo2 && C24610OooO0O0.OooO0oo(this.f123181OooO0o, c34309OooO00o.f123181OooO0o) && C24610OooO0O0.OooO0oO(this.f123183OooO0oO, c34309OooO00o.f123183OooO0oO)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f123177OooO00o * 37) + this.f123178OooO0O0) * 37) + this.f123179OooO0OO) * 37;
        short[][][] sArr = this.f123180OooO0Oo;
        int iOooO0oo = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            iOooO0oo = (iOooO0oo * 257) + C34332OooO00o.OooO0oo(sArr[i2]);
        }
        int i3 = (iOooO0oo + i) * 37;
        short[][][] sArr2 = this.f123182OooO0o0;
        int iOooO0oo2 = 0;
        for (int i4 = 0; i4 != sArr2.length; i4++) {
            iOooO0oo2 = (iOooO0oo2 * 257) + C34332OooO00o.OooO0oo(sArr2[i4]);
        }
        return C34332OooO00o.OooO0oO(this.f123183OooO0oO) + ((C34332OooO00o.OooO0oo(this.f123181OooO0o) + ((iOooO0oo2 + i3) * 37)) * 37);
    }
}
