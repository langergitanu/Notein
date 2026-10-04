package OooOo;

import OooOoO0.C20511OooO00o;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OooOo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20488OooOoo<K> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f58525OooO00o = C20491OooOooo.f58536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object[] f58526OooO0O0 = C20511OooO00o.f58582OooO0OO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long[] f58527OooO0OO = OooOOO0.f58496OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f58528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f58529OooO0o0;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (((r2 & ((~r2) << 6)) & r21) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        r26 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v10, types: [int] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [int] */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [int] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Object[] objArr;
        boolean z2;
        long[] jArr;
        long[] jArr2;
        ?? r24;
        boolean z3;
        long[] jArr3;
        long[] jArr4;
        int i;
        char c;
        long j;
        Object[] objArr2;
        ?? HashCode;
        int iNumberOfTrailingZeros;
        boolean z4 = true;
        if (obj == this) {
            return true;
        }
        boolean z5 = false;
        if (!(obj instanceof AbstractC20488OooOoo)) {
            return false;
        }
        AbstractC20488OooOoo abstractC20488OooOoo = (AbstractC20488OooOoo) obj;
        if (abstractC20488OooOoo.f58529OooO0o0 != this.f58529OooO0o0) {
            return false;
        }
        Object[] objArr3 = this.f58526OooO0O0;
        long[] jArr5 = this.f58527OooO0OO;
        long[] jArr6 = this.f58525OooO00o;
        int length = jArr6.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr6[i2];
            char c2 = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                z = z4;
                ?? r2 = z5;
                while (r2 < i4) {
                    if ((j2 & 255) < 128) {
                        int i5 = (i2 << 3) + (r2 == true ? 1 : 0);
                        z3 = z5;
                        Object obj2 = objArr3[i5];
                        long j4 = jArr5[i5];
                        if (obj2 != null) {
                            abstractC20488OooOoo.getClass();
                            HashCode = obj2.hashCode();
                        } else {
                            HashCode = z3;
                        }
                        int i6 = HashCode * (-862048943);
                        int i7 = i6 ^ (i6 << 16);
                        c = c2;
                        int i8 = i7 & 127;
                        j = j3;
                        int i9 = abstractC20488OooOoo.f58528OooO0Oo;
                        int i10 = (i7 >>> 7) & i9;
                        i = i3;
                        ?? r17 = z3;
                        ?? r22 = r2;
                        while (true) {
                            long[] jArr7 = abstractC20488OooOoo.f58525OooO00o;
                            int i11 = i10 >> 3;
                            int i12 = (i10 & 7) << 3;
                            long j5 = jArr7[i11] >>> i12;
                            long j6 = jArr7[i11 + 1] << (64 - i12);
                            r24 = r22;
                            objArr2 = objArr3;
                            long j7 = j5 | (j6 & ((-i12) >> 63));
                            long[] jArr8 = jArr5;
                            jArr4 = jArr6;
                            long j8 = (((long) i8) * 72340172838076673L) ^ j7;
                            long j9 = (j8 - 72340172838076673L) & (~j8) & j;
                            while (true) {
                                if (j9 == 0) {
                                    break;
                                }
                                iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
                                jArr3 = jArr8;
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC20488OooOoo.f58526OooO0O0[iNumberOfTrailingZeros], obj2)) {
                                    break;
                                }
                                j9 &= j9 - 1;
                                jArr8 = jArr3;
                            }
                            int i13 = r17 + 8;
                            i10 = (i10 + i13) & i9;
                            objArr3 = objArr2;
                            r22 = r24 == true ? 1 : 0;
                            jArr6 = jArr4;
                            jArr5 = jArr3;
                            r17 = i13;
                        }
                        if (iNumberOfTrailingZeros < 0) {
                            throw new NoSuchElementException(C20485OooOoO.OooO0O0("There is no key ", obj2, " in the map"));
                        }
                        if (j4 != abstractC20488OooOoo.f58527OooO0OO[iNumberOfTrailingZeros]) {
                            return z3;
                        }
                    } else {
                        r24 = r2 == true ? 1 : 0;
                        z3 = z5;
                        jArr3 = jArr5;
                        jArr4 = jArr6;
                        i = i3;
                        c = c2;
                        j = j3;
                        objArr2 = objArr3;
                    }
                    j2 >>= i;
                    c2 = c;
                    objArr3 = objArr2;
                    z5 = z3;
                    j3 = j;
                    i3 = i;
                    jArr6 = jArr4;
                    jArr5 = jArr3;
                    r2 = r24 + 1;
                }
                z2 = z5;
                jArr = jArr5;
                jArr2 = jArr6;
                int i14 = i3;
                objArr = objArr3;
                if (i4 != i14) {
                    return z;
                }
            } else {
                z = z4;
                objArr = objArr3;
                z2 = z5;
                jArr = jArr5;
                jArr2 = jArr6;
            }
            if (i2 == length) {
                return z;
            }
            i2++;
            objArr3 = objArr;
            z4 = z;
            z5 = z2;
            jArr6 = jArr2;
            jArr5 = jArr;
        }
    }

    public final int hashCode() {
        Object[] objArr = this.f58526OooO0O0;
        long[] jArr = this.f58527OooO0OO;
        long[] jArr2 = this.f58525OooO00o;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i4]);
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

    public final String toString() {
        int i;
        int i2;
        if (this.f58529OooO0o0 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f58526OooO0O0;
        long[] jArr = this.f58527OooO0OO;
        long[] jArr2 = this.f58525OooO00o;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.f58529OooO0o0) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "s.append('}').toString()");
        return string;
    }
}
