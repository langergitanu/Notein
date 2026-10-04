package oO00o0oO;

/* JADX INFO: renamed from: oO00o0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32393OooO0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f116487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f116488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f116489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public T[] f116490OooO0Oo;

    public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        T t;
        Object obj;
        Object[] objArr = this.f116490OooO0Oo;
        int i = this.f116487OooO00o;
        int iHashCode = oooO0O0.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj2 = objArr[i2];
        if (obj2 != null) {
            if (obj2.equals(oooO0O0)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj = objArr[i2];
                if (obj == null) {
                }
            } while (!obj.equals(oooO0O0));
            return;
        }
        objArr[i2] = oooO0O0;
        int i3 = this.f116488OooO0O0 + 1;
        this.f116488OooO0O0 = i3;
        if (i3 < this.f116489OooO0OO) {
            return;
        }
        T[] tArr = this.f116490OooO0Oo;
        int length = tArr.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        T[] tArr2 = (T[]) new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.f116487OooO00o = i5;
                this.f116489OooO0OO = (int) (i4 * 0.75f);
                this.f116490OooO0Oo = tArr2;
                return;
            }
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iHashCode2 = t.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (tArr2[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (tArr2[i7] != null);
            }
            tArr2[i7] = tArr[length];
            i3 = i6;
        }
    }

    public final void OooO0O0(Object[] objArr, int i, int i2) {
        int i3;
        Object obj;
        this.f116488OooO0O0--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else if (i < i5 || i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
