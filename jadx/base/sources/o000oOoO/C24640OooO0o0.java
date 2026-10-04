package o000oOoO;

/* JADX INFO: renamed from: o000oOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24640OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f83460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f83461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f83462OooO0OO;

    public C24640OooO0o0(int i, long[] jArr, Object[] objArr) {
        this.f83460OooO00o = i;
        this.f83461OooO0O0 = jArr;
        this.f83462OooO0OO = objArr;
    }

    public final int OooO00o(long j) {
        int i = this.f83460OooO00o - 1;
        if (i != -1) {
            long[] jArr = this.f83461OooO0O0;
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j2 = jArr[i3] - j;
                    if (j2 < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j2 <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j3 = jArr[0];
            if (j3 == j) {
                return 0;
            }
            if (j3 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final C24640OooO0o0 OooO0O0(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.f83462OooO0OO;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr2 = new long[i4];
        Object[] objArr2 = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                jArr = this.f83461OooO0O0;
                i = this.f83460OooO00o;
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = jArr[i5];
                Object obj3 = objArr[i5];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr2[i3] = j;
                objArr2[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = jArr[i5];
                    Object obj4 = objArr[i5];
                    if (obj4 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new C24640OooO0o0(i4, jArr2, objArr2);
    }
}
