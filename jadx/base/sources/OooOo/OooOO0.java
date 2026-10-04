package OooOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f58485OooO00o = C20491OooOooo.f58536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f58486OooO0O0 = OooOO0O.f58488OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f58487OooO0OO;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        if (((r8 & ((~r8) << 6)) & r20) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        long j;
        int i;
        char c;
        long j2;
        int iNumberOfTrailingZeros;
        if (obj != this) {
            if (!(obj instanceof OooOO0)) {
                return false;
            }
            OooOO0 oooOO02 = (OooOO0) obj;
            oooOO02.getClass();
            int[] iArr = this.f58486OooO0O0;
            long[] jArr = this.f58485OooO00o;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j3 = jArr[i2];
                    char c2 = 7;
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j3 & 255) < 128) {
                                int i6 = iArr[(i2 << 3) + i5];
                                int iHashCode = Integer.hashCode(i6) * (-862048943);
                                int i7 = iHashCode ^ (iHashCode << 16);
                                int i8 = i7 & 127;
                                c = c2;
                                int i9 = oooOO02.f58487OooO0OO;
                                int i10 = (i7 >>> 7) & i9;
                                j2 = j4;
                                int i11 = 0;
                                while (true) {
                                    long[] jArr2 = oooOO02.f58485OooO00o;
                                    int i12 = i10 >> 3;
                                    i = i3;
                                    int i13 = (i10 & 7) << 3;
                                    j = j3;
                                    long j5 = (jArr2[i12] >>> i13) | (((-i13) >> 63) & (jArr2[i12 + 1] << (64 - i13)));
                                    long j6 = (((long) i8) * 72340172838076673L) ^ j5;
                                    long j7 = (j6 - 72340172838076673L) & (~j6) & j2;
                                    while (true) {
                                        if (j7 == 0) {
                                            break;
                                        }
                                        iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                                        if (oooOO02.f58486OooO0O0[iNumberOfTrailingZeros] == i6) {
                                            break;
                                        }
                                        j7 &= j7 - 1;
                                    }
                                    i11 += 8;
                                    i10 = (i10 + i11) & i9;
                                    i3 = i;
                                    j3 = j;
                                }
                                if (!(iNumberOfTrailingZeros >= 0)) {
                                    return false;
                                }
                            } else {
                                j = j3;
                                i = i3;
                                c = c2;
                                j2 = j4;
                            }
                            j3 = j >> i;
                            i5++;
                            c2 = c;
                            j4 = j2;
                            i3 = i;
                        }
                        z = true;
                        if (i4 != i3) {
                            return true;
                        }
                    } else {
                        z = true;
                    }
                    if (i2 == length) {
                        return z;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f58486OooO0O0;
        long[] jArr = this.f58485OooO00o;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f58486OooO0O0;
        long[] jArr = this.f58485OooO00o;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
