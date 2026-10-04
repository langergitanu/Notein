package OooOo;

import OooOoO0.C20511OooO00o;
import OooOoO0.C20514OooO0Oo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO<E> implements Cloneable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ long[] f58492OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f58493OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ int f58494OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object[] f58495OooOoO0;

    public OooOOO(int i) {
        if (i == 0) {
            this.f58492OooOo = C20511OooO00o.f58581OooO0O0;
            this.f58495OooOoO0 = C20511OooO00o.f58582OooO0OO;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f58492OooOo = new long[i5];
        this.f58495OooOoO0 = new Object[i5];
    }

    public final void OooO00o() {
        int i = this.f58494OooOoO;
        Object[] objArr = this.f58495OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f58494OooOoO = 0;
        this.f58493OooOo0o = false;
    }

    public final E OooO0O0(long j) {
        E e;
        int iOooO00o = C20511OooO00o.OooO00o(this.f58494OooOoO, this.f58492OooOo, j);
        if (iOooO00o < 0 || (e = (E) this.f58495OooOoO0[iOooO00o]) == OooOOOO.f58497OooO00o) {
            return null;
        }
        return e;
    }

    public final int OooO0OO(long j) {
        if (this.f58493OooOo0o) {
            int i = this.f58494OooOoO;
            long[] jArr = this.f58492OooOo;
            Object[] objArr = this.f58495OooOoO0;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != OooOOOO.f58497OooO00o) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f58493OooOo0o = false;
            this.f58494OooOoO = i2;
        }
        return C20511OooO00o.OooO00o(this.f58494OooOoO, this.f58492OooOo, j);
    }

    public final long OooO0Oo(int i) {
        if (!(i >= 0 && i < this.f58494OooOoO)) {
            C20514OooO0Oo.OooO00o("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f58493OooOo0o) {
            int i2 = this.f58494OooOoO;
            long[] jArr = this.f58492OooOo;
            Object[] objArr = this.f58495OooOoO0;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != OooOOOO.f58497OooO00o) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f58493OooOo0o = false;
            this.f58494OooOoO = i3;
        }
        return this.f58492OooOo[i];
    }

    public final void OooO0o(long j) {
        int iOooO00o = C20511OooO00o.OooO00o(this.f58494OooOoO, this.f58492OooOo, j);
        if (iOooO00o >= 0) {
            Object[] objArr = this.f58495OooOoO0;
            Object obj = objArr[iOooO00o];
            Object obj2 = OooOOOO.f58497OooO00o;
            if (obj != obj2) {
                objArr[iOooO00o] = obj2;
                this.f58493OooOo0o = true;
            }
        }
    }

    public final void OooO0o0(long j, E e) {
        int iOooO00o = C20511OooO00o.OooO00o(this.f58494OooOoO, this.f58492OooOo, j);
        if (iOooO00o >= 0) {
            this.f58495OooOoO0[iOooO00o] = e;
            return;
        }
        int i = ~iOooO00o;
        int i2 = this.f58494OooOoO;
        Object obj = OooOOOO.f58497OooO00o;
        if (i < i2) {
            Object[] objArr = this.f58495OooOoO0;
            if (objArr[i] == obj) {
                this.f58492OooOo[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f58493OooOo0o) {
            long[] jArr = this.f58492OooOo;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f58495OooOoO0;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != obj) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f58493OooOo0o = false;
                this.f58494OooOoO = i3;
                i = ~C20511OooO00o.OooO00o(i3, this.f58492OooOo, j);
            }
        }
        int i5 = this.f58494OooOoO;
        if (i5 >= this.f58492OooOo.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f58492OooOo, i9);
            kotlin.jvm.internal.OooOOO0.OooO0o(jArrCopyOf, "copyOf(this, newSize)");
            this.f58492OooOo = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f58495OooOoO0, i9);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f58495OooOoO0 = objArrCopyOf;
        }
        int i10 = this.f58494OooOoO - i;
        if (i10 != 0) {
            long[] jArr2 = this.f58492OooOo;
            int i11 = i + 1;
            kotlin.jvm.internal.OooOOO0.OooO0oO(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f58495OooOoO0;
            Oooo.OooO0OO.OooO0oo(objArr3, i11, objArr3, i, this.f58494OooOoO);
        }
        this.f58492OooOo[i] = j;
        this.f58495OooOoO0[i] = e;
        this.f58494OooOoO++;
    }

    public final int OooO0oO() {
        if (this.f58493OooOo0o) {
            int i = this.f58494OooOoO;
            long[] jArr = this.f58492OooOo;
            Object[] objArr = this.f58495OooOoO0;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != OooOOOO.f58497OooO00o) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f58493OooOo0o = false;
            this.f58494OooOoO = i2;
        }
        return this.f58494OooOoO;
    }

    public final E OooO0oo(int i) {
        if (!(i >= 0 && i < this.f58494OooOoO)) {
            C20514OooO0Oo.OooO00o("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f58493OooOo0o) {
            int i2 = this.f58494OooOoO;
            long[] jArr = this.f58492OooOo;
            Object[] objArr = this.f58495OooOoO0;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != OooOOOO.f58497OooO00o) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f58493OooOo0o = false;
            this.f58494OooOoO = i3;
        }
        return (E) this.f58495OooOoO0[i];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.OooOOO0.OooO0o0(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        OooOOO oooOOO = (OooOOO) objClone;
        oooOOO.f58492OooOo = (long[]) this.f58492OooOo.clone();
        oooOOO.f58495OooOoO0 = (Object[]) this.f58495OooOoO0.clone();
        return oooOOO;
    }

    public final String toString() {
        if (OooO0oO() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f58494OooOoO * 28);
        sb.append('{');
        int i = this.f58494OooOoO;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(OooO0Oo(i2));
            sb.append('=');
            E eOooO0oo = OooO0oo(i2);
            if (eOooO0oo != sb) {
                sb.append(eOooO0oo);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public OooOOO() {
        this(10);
    }
}
