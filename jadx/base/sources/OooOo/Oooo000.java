package OooOo;

import OooOoO0.C20511OooO00o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C24017OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo000<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f58541OooO00o = C20491OooOooo.f58536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object[] f58542OooO0O0 = C20511OooO00o.f58582OooO0OO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f58543OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f58544OooO0Oo;

    public class OooO00o implements Set<E>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20486OooOoO0 f58545OooOo0o;

        public OooO00o(C20486OooOoO0 c20486OooOoO0) {
            this.f58545OooOo0o = c20486OooOoO0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f58545OooOo0o.OooO00o(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!this.f58545OooOo0o.OooO00o(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return this.f58545OooOo0o.OooO0O0();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return this.f58545OooOo0o.f58544OooO0Oo;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return C24017OooO0oO.OooO00o(this);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
            return (T[]) C24017OooO0oO.OooO0O0(this, array);
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<E, CharSequence> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000<E> f58546OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo000<E> oooo000) {
            super(1);
            this.f58546OooOo0o = oooo000;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final CharSequence invoke(Object obj) {
            return obj == this.f58546OooOo0o ? "(this)" : String.valueOf(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(E e) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f58543OooO0OO;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f58541OooO00o;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f58542OooO0O0[iNumberOfTrailingZeros], e)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean OooO0O0() {
        return this.f58544OooO0Oo == 0;
    }

    public final boolean OooO0OO() {
        return this.f58544OooO0Oo != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        if (oooo000.f58544OooO0Oo != this.f58544OooO0Oo) {
            return false;
        }
        Object[] objArr = this.f58542OooO0O0;
        long[] jArr = this.f58541OooO00o;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !oooo000.OooO00o(objArr[(i << 3) + i3])) {
                            return false;
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
        Object[] objArr = this.f58542OooO0O0;
        long[] jArr = this.f58541OooO00o;
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
                        Object obj = objArr[(i << 3) + i3];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[PHI: r8
      0x0065: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0028, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        OooO0O0 oooO0O0 = new OooO0O0(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f58542OooO0O0;
        long[] jArr = this.f58541OooO00o;
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
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) oooO0O0.invoke(obj));
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
