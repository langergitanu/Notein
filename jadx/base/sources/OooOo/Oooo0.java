package OooOo;

import OooOoO0.C20511OooO00o;
import java.util.Arrays;
import o000o0O0.C24567OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0<E> implements Cloneable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int[] f58537OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f58538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ int f58539OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object[] f58540OooOoO0;

    public Oooo0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f58537OooOo = new int[i4];
        this.f58540OooOoO0 = new Object[i4];
    }

    public final void OooO00o(int i, E e) {
        int i2 = this.f58539OooOoO;
        if (i2 != 0 && i <= this.f58537OooOo[i2 - 1]) {
            OooO0o0(i, e);
            return;
        }
        if (this.f58538OooOo0o && i2 >= this.f58537OooOo.length) {
            C20494Oooo0O0.OooO00o(this);
        }
        int i3 = this.f58539OooOoO;
        if (i3 >= this.f58537OooOo.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f58537OooOo, i7);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f58537OooOo = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f58540OooOoO0, i7);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f58540OooOoO0 = objArrCopyOf;
        }
        this.f58537OooOo[i3] = i;
        this.f58540OooOoO0[i3] = e;
        this.f58539OooOoO = i3 + 1;
    }

    public final boolean OooO0O0(C24567OooO0o0 c24567OooO0o0) {
        if (this.f58538OooOo0o) {
            C20494Oooo0O0.OooO00o(this);
        }
        int i = this.f58539OooOoO;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (this.f58540OooOoO0[i2] == c24567OooO0o0) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public final E OooO0OO(int i) {
        E e;
        int iOooO0O0 = C20511OooO00o.OooO0O0(this.f58537OooOo, this.f58539OooOoO, i);
        if (iOooO0O0 < 0 || (e = (E) this.f58540OooOoO0[iOooO0O0]) == C20494Oooo0O0.f58551OooO00o) {
            return null;
        }
        return e;
    }

    public final int OooO0Oo(int i) {
        if (this.f58538OooOo0o) {
            C20494Oooo0O0.OooO00o(this);
        }
        return this.f58537OooOo[i];
    }

    public final int OooO0o() {
        if (this.f58538OooOo0o) {
            C20494Oooo0O0.OooO00o(this);
        }
        return this.f58539OooOoO;
    }

    public final void OooO0o0(int i, E e) {
        int iOooO0O0 = C20511OooO00o.OooO0O0(this.f58537OooOo, this.f58539OooOoO, i);
        if (iOooO0O0 >= 0) {
            this.f58540OooOoO0[iOooO0O0] = e;
            return;
        }
        int i2 = ~iOooO0O0;
        int i3 = this.f58539OooOoO;
        if (i2 < i3) {
            Object[] objArr = this.f58540OooOoO0;
            if (objArr[i2] == C20494Oooo0O0.f58551OooO00o) {
                this.f58537OooOo[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f58538OooOo0o && i3 >= this.f58537OooOo.length) {
            C20494Oooo0O0.OooO00o(this);
            i2 = ~C20511OooO00o.OooO0O0(this.f58537OooOo, this.f58539OooOoO, i);
        }
        int i4 = this.f58539OooOoO;
        if (i4 >= this.f58537OooOo.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f58537OooOo, i8);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f58537OooOo = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f58540OooOoO0, i8);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f58540OooOoO0 = objArrCopyOf;
        }
        int i9 = this.f58539OooOoO;
        if (i9 - i2 != 0) {
            int[] iArr = this.f58537OooOo;
            int i10 = i2 + 1;
            Oooo.OooO0OO.OooO0oO(iArr, iArr, i10, i2, i9);
            Object[] objArr2 = this.f58540OooOoO0;
            Oooo.OooO0OO.OooO0oo(objArr2, i10, objArr2, i2, this.f58539OooOoO);
        }
        this.f58537OooOo[i2] = i;
        this.f58540OooOoO0[i2] = e;
        this.f58539OooOoO++;
    }

    public final E OooO0oO(int i) {
        if (this.f58538OooOo0o) {
            C20494Oooo0O0.OooO00o(this);
        }
        return (E) this.f58540OooOoO0[i];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.OooOOO0.OooO0o0(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Oooo0 oooo0 = (Oooo0) objClone;
        oooo0.f58537OooOo = (int[]) this.f58537OooOo.clone();
        oooo0.f58540OooOoO0 = (Object[]) this.f58540OooOoO0.clone();
        return oooo0;
    }

    public final String toString() {
        if (OooO0o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f58539OooOoO * 28);
        sb.append('{');
        int i = this.f58539OooOoO;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(OooO0Oo(i2));
            sb.append('=');
            E eOooO0oO = OooO0oO(i2);
            if (eOooO0oO != this) {
                sb.append(eOooO0oO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "buffer.toString()");
        return string;
    }
}
