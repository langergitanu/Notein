package OooOo;

/* JADX INFO: renamed from: OooOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20477OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f58489OooO00o = C20491OooOooo.f58536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long[] f58490OooO0O0 = OooOOO0.f58496OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f58491OooO0OO;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        r28 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        if (((r12 & ((~r12) << 6)) & r24) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        long j;
        int iNumberOfTrailingZeros;
        boolean z5 = true;
        if (obj == this) {
            return true;
        }
        boolean z6 = false;
        if (!(obj instanceof AbstractC20477OooOO0o)) {
            return false;
        }
        AbstractC20477OooOO0o abstractC20477OooOO0o = (AbstractC20477OooOO0o) obj;
        abstractC20477OooOO0o.getClass();
        long[] jArr = this.f58490OooO0O0;
        long[] jArr2 = this.f58489OooO00o;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (?? r15 = z6; r15 < i4; r15++) {
                    if ((j2 & 255) < 128) {
                        long j4 = jArr[(i2 << 3) + r15];
                        abstractC20477OooOO0o.getClass();
                        int iHashCode = Long.hashCode(j4) * (-862048943);
                        int i5 = iHashCode ^ (iHashCode << 16);
                        z3 = z5;
                        int i6 = i5 & 127;
                        z4 = z6;
                        int i7 = abstractC20477OooOO0o.f58491OooO0OO;
                        int i8 = (i5 >>> 7) & i7;
                        ?? r21 = z4;
                        while (true) {
                            long[] jArr3 = abstractC20477OooOO0o.f58489OooO00o;
                            int i9 = i8 >> 3;
                            j = j3;
                            int i10 = (i8 & 7) << 3;
                            long j5 = (jArr3[i9] >>> i10) | ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                            int i11 = i3;
                            long j6 = j5 ^ (((long) i6) * 72340172838076673L);
                            long j7 = (j6 - 72340172838076673L) & (~j6) & j;
                            while (true) {
                                if (j7 == 0) {
                                    break;
                                }
                                iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                                i = i11;
                                if (abstractC20477OooOO0o.f58490OooO0O0[iNumberOfTrailingZeros] == j4) {
                                    break;
                                }
                                j7 &= j7 - 1;
                                i11 = i;
                            }
                            int i12 = r21 + 8;
                            i8 = (i8 + i12) & i7;
                            j3 = j;
                            i3 = i;
                            r21 = i12;
                        }
                        if (!(iNumberOfTrailingZeros >= 0 ? z3 : z4)) {
                            return z4;
                        }
                    } else {
                        z3 = z5;
                        z4 = z6;
                        i = i3;
                        j = j3;
                    }
                    j2 >>= i;
                    z5 = z3;
                    z6 = z4;
                    j3 = j;
                    i3 = i;
                }
                z = z5;
                z2 = z6;
                if (i4 != i3) {
                    return z;
                }
            } else {
                z = z5;
                z2 = z6;
            }
            if (i2 == length) {
                return z;
            }
            i2++;
            z5 = z;
            z6 = z2;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f58490OooO0O0;
        long[] jArr2 = this.f58489OooO00o;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Long.hashCode(jArr[(i << 3) + i3]) + iHashCode;
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
        long[] jArr = this.f58490OooO0O0;
        long[] jArr2 = this.f58489OooO00o;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j2);
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
