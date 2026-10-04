package Oooo0oO;

import OooO0Oo.C20398OooO0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import java.util.ArrayList;

/* JADX INFO: renamed from: Oooo0oO.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21092o0000o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f61140OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21093o0000o0O f61141OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f61142OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f61143OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object[] f61144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f61145OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f61146OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f61147OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f61148OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C21069OoooOoo f61149OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f61150OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f61151OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f61152OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f61153OooOOO0;

    public C21092o0000o0(C21093o0000o0O c21093o0000o0O) {
        this.f61141OooO00o = c21093o0000o0O;
        this.f61142OooO0O0 = c21093o0000o0O.f61155OooOo0o;
        int i = c21093o0000o0O.f61154OooOo;
        this.f61143OooO0OO = i;
        this.f61144OooO0Oo = c21093o0000o0O.f61157OooOoO0;
        this.f61146OooO0o0 = c21093o0000o0O.f61156OooOoO;
        this.f61148OooO0oo = i;
        this.f61140OooO = -1;
        this.f61149OooOO0 = new C21069OoooOoo();
    }

    public final Object OooO(int i) {
        int[] iArr = this.f61142OooO0O0;
        if (!C21091o0000o.OooO0oO(iArr, i)) {
            return null;
        }
        if (!C21091o0000o.OooO0oO(iArr, i)) {
            return InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        }
        return this.f61144OooO0Oo[iArr[(i * 5) + 4]];
    }

    public final C21025OooO0o0 OooO00o(int i) {
        ArrayList<C21025OooO0o0> arrayList = this.f61141OooO00o.f61161OooOooO;
        int iOooOOOo = C21091o0000o.OooOOOo(arrayList, i, this.f61143OooO0OO);
        if (iOooOOOo >= 0) {
            return arrayList.get(iOooOOOo);
        }
        C21025OooO0o0 c21025OooO0o0 = new C21025OooO0o0(i);
        arrayList.add(-(iOooOOOo + 1), c21025OooO0o0);
        return c21025OooO0o0;
    }

    public final Object OooO0O0(int[] iArr, int i) {
        int length;
        if (!C21091o0000o.OooO0o0(iArr, i)) {
            return InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        }
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            length = iArr.length;
        } else {
            int i3 = iArr[i2 + 4];
            int i4 = 1;
            switch (iArr[i2 + 1] >> 29) {
                case 0:
                    i4 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                    break;
                case 3:
                case 5:
                case 6:
                    i4 = 2;
                    break;
                default:
                    i4 = 3;
                    break;
            }
            length = i4 + i3;
        }
        return this.f61144OooO0Oo[length];
    }

    public final void OooO0OO() {
        int i;
        this.f61145OooO0o = true;
        C21093o0000o0O c21093o0000o0O = this.f61141OooO00o;
        c21093o0000o0O.getClass();
        if (this.f61141OooO00o != c21093o0000o0O || (i = c21093o0000o0O.f61158OooOoOO) <= 0) {
            C21038OooOo.OooO0OO("Unexpected reader close()");
            throw null;
        }
        c21093o0000o0O.f61158OooOoOO = i - 1;
    }

    public final void OooO0Oo() {
        if (this.f61150OooOO0O == 0) {
            if (!(this.f61147OooO0oO == this.f61148OooO0oo)) {
                C21038OooOo.OooO0OO("endGroup() not called at the end of a group");
                throw null;
            }
            int i = this.f61140OooO;
            int[] iArr = this.f61142OooO0O0;
            int iOooOO0 = C21091o0000o.OooOO0(iArr, i);
            this.f61140OooO = iOooOO0;
            int i2 = this.f61143OooO0OO;
            this.f61148OooO0oo = iOooOO0 < 0 ? i2 : C21091o0000o.OooO0Oo(iArr, iOooOO0) + iOooOO0;
            int iOooO00o = this.f61149OooOO0.OooO00o();
            if (iOooO00o < 0) {
                this.f61151OooOO0o = 0;
                this.f61153OooOOO0 = 0;
            } else {
                this.f61151OooOO0o = iOooO00o;
                this.f61153OooOOO0 = iOooOO0 >= i2 - 1 ? this.f61146OooO0o0 : C21091o0000o.OooO0OO(iArr, iOooOO0 + 1);
            }
        }
    }

    public final int OooO0o() {
        int i = this.f61147OooO0oO;
        if (i >= this.f61148OooO0oo) {
            return 0;
        }
        return this.f61142OooO0O0[i * 5];
    }

    public final Object OooO0o0() {
        int i = this.f61147OooO0oO;
        if (i < this.f61148OooO0oo) {
            return OooO0O0(this.f61142OooO0O0, i);
        }
        return 0;
    }

    public final Object OooO0oO(int i, int i2) {
        int[] iArr = this.f61142OooO0O0;
        int iOooOO0O = C21091o0000o.OooOO0O(iArr, i);
        int i3 = i + 1;
        int i4 = iOooOO0O + i2;
        return i4 < (i3 < this.f61143OooO0OO ? iArr[(i3 * 5) + 4] : this.f61146OooO0o0) ? this.f61144OooO0Oo[i4] : InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
    }

    public final Object OooO0oo() {
        int i;
        if (this.f61150OooOO0O > 0 || (i = this.f61151OooOO0o) >= this.f61153OooOOO0) {
            this.f61152OooOOO = false;
            return InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
        }
        this.f61152OooOOO = true;
        this.f61151OooOO0o = i + 1;
        return this.f61144OooO0Oo[i];
    }

    public final Object OooOO0(int[] iArr, int i) {
        if (!C21091o0000o.OooO0o(iArr, i)) {
            return null;
        }
        Object[] objArr = this.f61144OooO0Oo;
        int i2 = i * 5;
        int i3 = iArr[i2 + 4];
        int i4 = 1;
        switch (iArr[i2 + 1] >> 30) {
            case 0:
                i4 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        return objArr[i4 + i3];
    }

    public final void OooOO0O(int i) {
        if (!(this.f61150OooOO0O == 0)) {
            C21038OooOo.OooO0OO("Cannot reposition while in an empty region");
            throw null;
        }
        this.f61147OooO0oO = i;
        int[] iArr = this.f61142OooO0O0;
        int i2 = this.f61143OooO0OO;
        int iOooOO0 = i < i2 ? C21091o0000o.OooOO0(iArr, i) : -1;
        this.f61140OooO = iOooOO0;
        if (iOooOO0 < 0) {
            this.f61148OooO0oo = i2;
        } else {
            this.f61148OooO0oo = C21091o0000o.OooO0Oo(iArr, iOooOO0) + iOooOO0;
        }
        this.f61151OooOO0o = 0;
        this.f61153OooOOO0 = 0;
    }

    public final int OooOO0o() {
        if (!(this.f61150OooOO0O == 0)) {
            C21038OooOo.OooO0OO("Cannot skip while in an empty region");
            throw null;
        }
        int i = this.f61147OooO0oO;
        int[] iArr = this.f61142OooO0O0;
        int iOooO = C21091o0000o.OooO0oO(iArr, i) ? 1 : C21091o0000o.OooO(iArr, this.f61147OooO0oO);
        int i2 = this.f61147OooO0oO;
        this.f61147OooO0oO = C21091o0000o.OooO0Oo(iArr, i2) + i2;
        return iOooO;
    }

    public final void OooOOO() {
        if (this.f61150OooOO0O <= 0) {
            int i = this.f61140OooO;
            int i2 = this.f61147OooO0oO;
            int[] iArr = this.f61142OooO0O0;
            if (!(C21091o0000o.OooOO0(iArr, i2) == i)) {
                o000000O.OooO0O0("Invalid slot table detected");
                throw null;
            }
            int i3 = this.f61151OooOO0o;
            int i4 = this.f61153OooOOO0;
            C21069OoooOoo c21069OoooOoo = this.f61149OooOO0;
            if (i3 == 0 && i4 == 0) {
                c21069OoooOoo.OooO0O0(-1);
            } else {
                c21069OoooOoo.OooO0O0(i3);
            }
            this.f61140OooO = i2;
            this.f61148OooO0oo = C21091o0000o.OooO0Oo(iArr, i2) + i2;
            int i5 = i2 + 1;
            this.f61147OooO0oO = i5;
            this.f61151OooOO0o = C21091o0000o.OooOO0O(iArr, i2);
            this.f61153OooOOO0 = i2 >= this.f61143OooO0OO - 1 ? this.f61146OooO0o0 : C21091o0000o.OooO0OO(iArr, i5);
        }
    }

    public final void OooOOO0() {
        if (!(this.f61150OooOO0O == 0)) {
            C21038OooOo.OooO0OO("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f61147OooO0oO = this.f61148OooO0oo;
        this.f61151OooOO0o = 0;
        this.f61153OooOOO0 = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f61147OooO0oO);
        sb.append(", key=");
        sb.append(OooO0o());
        sb.append(", parent=");
        sb.append(this.f61140OooO);
        sb.append(", end=");
        return C20398OooO0O0.OooO00o(')', sb, this.f61148OooO0oo);
    }
}
