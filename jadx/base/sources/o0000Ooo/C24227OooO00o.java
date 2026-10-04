package o0000Ooo;

import Oooo0.C20856OooooOo;
import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;

/* JADX INFO: renamed from: o0000Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24227OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f81471OooO0O0 = {18, 20, 17, 15};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f81472OooO0OO = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f81473OooO0Oo = {32767, 8191, 65535, 262143};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81474OooO00o;

    /* JADX INFO: renamed from: o0000Ooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19607OooO00o {
        public static int OooO00o(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Can't represent a size of ", " in Constraints"));
        }

        public static long OooO0O0(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int iOooO00o = OooO00o(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int iOooO00o2 = OooO00o(i6);
            if (iOooO00o + iOooO00o2 > 31) {
                throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Can't represent a width of ", i6, " and height of ", " in Constraints", i5));
            }
            if (iOooO00o2 == 13) {
                j = 3;
            } else if (iOooO00o2 == 18) {
                j = 1;
            } else if (iOooO00o2 == 15) {
                j = 2;
            } else {
                if (iOooO00o2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = C24227OooO00o.f81471OooO0O0[(int) j];
            return (((long) i7) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i8) << (i9 + 31));
        }
    }

    public static final int OooO(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> f81471OooO0O0[i])) & f81473OooO0Oo[i];
    }

    public static long OooO00o(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = OooOO0(j);
        }
        if ((i5 & 2) != 0) {
            i2 = OooO0oo(j);
        }
        if ((i5 & 4) != 0) {
            i3 = OooO(j);
        }
        if ((i5 & 8) != 0) {
            i4 = OooO0oO(j);
        }
        if (i3 < 0 || i < 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("minHeight(", i3, ") and minWidth(", ") must be >= 0", i).toString());
        }
        if (i2 < i && i2 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
            return C19607OooO00o.OooO0O0(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
    }

    public static final boolean OooO0O0(long j, long j2) {
        return j == j2;
    }

    public static final boolean OooO0OO(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (f81471OooO0O0[i] + 31))) & f81473OooO0Oo[i]) != 0;
    }

    public static final boolean OooO0Oo(long j) {
        return (((int) (j >> 33)) & f81472OooO0OO[(int) (3 & j)]) != 0;
    }

    public static final boolean OooO0o(long j) {
        return OooO0oo(j) == OooOO0(j);
    }

    public static final boolean OooO0o0(long j) {
        return OooO0oO(j) == OooO(j);
    }

    public static final int OooO0oO(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (f81471OooO0O0[i] + 31))) & f81473OooO0Oo[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int OooO0oo(long j) {
        int i = ((int) (j >> 33)) & f81472OooO0OO[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int OooOO0(long j) {
        return ((int) (j >> 2)) & f81472OooO0OO[(int) (3 & j)];
    }

    public static String OooOO0O(long j) {
        int iOooO0oo = OooO0oo(j);
        String strValueOf = iOooO0oo == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iOooO0oo);
        int iOooO0oO = OooO0oO(j);
        String strValueOf2 = iOooO0oO != Integer.MAX_VALUE ? String.valueOf(iOooO0oO) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(OooOO0(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(OooO(j));
        sb.append(", maxHeight = ");
        return C21111o0ooOoO.OooO0OO(strValueOf2, ')', sb);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24227OooO00o) {
            return this.f81474OooO00o == ((C24227OooO00o) obj).f81474OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81474OooO00o);
    }

    public final String toString() {
        return OooOO0O(this.f81474OooO00o);
    }
}
