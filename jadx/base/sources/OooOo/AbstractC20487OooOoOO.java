package OooOo;

import OooOoO0.C20511OooO00o;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OooOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20487OooOoOO<K> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f58520OooO00o = C20491OooOooo.f58536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object[] f58521OooO0O0 = C20511OooO00o.f58582OooO0OO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f58522OooO0OO = OooOO0O.f58488OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f58523OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f58524OooO0o0;

    public final int OooO00o(K k) {
        int i = 0;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f58523OooO0Oo;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f58520OooO00o;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f58521OooO0O0[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int OooO0O0(K k) {
        int iOooO00o = OooO00o(k);
        if (iOooO00o >= 0) {
            return this.f58522OooO0OO[iOooO00o];
        }
        throw new NoSuchElementException(C20485OooOoO.OooO0O0("There is no key ", k, " in the map"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20487OooOoOO)) {
            return false;
        }
        AbstractC20487OooOoOO abstractC20487OooOoOO = (AbstractC20487OooOoOO) obj;
        if (abstractC20487OooOoOO.f58524OooO0o0 != this.f58524OooO0o0) {
            return false;
        }
        Object[] objArr = this.f58521OooO0O0;
        int[] iArr = this.f58522OooO0OO;
        long[] jArr = this.f58520OooO00o;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (iArr[i4] != abstractC20487OooOoOO.OooO0O0(objArr[i4])) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f58521OooO0O0;
        int[] iArr = this.f58522OooO0OO;
        long[] jArr = this.f58520OooO00o;
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
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f58524OooO0o0 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f58521OooO0O0;
        int[] iArr = this.f58522OooO0OO;
        long[] jArr = this.f58520OooO00o;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.f58524OooO0o0) {
                                sb.append(", ");
                            }
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
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "s.append('}').toString()");
        return string;
    }
}
