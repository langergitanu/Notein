package com.google.android.gms.internal.p624firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i = this.zzd;
        if (obj != null) {
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v = (V) objArr[1];
                    Objects.requireNonNull(v);
                } else {
                    v = null;
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int iZza = zzad.zza(obj.hashCode());
                    while (true) {
                        int i2 = iZza & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            v = (V) objArr[i3 ^ 1];
                            break;
                        }
                        iZza = i2 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i4 = iZza2 & length2;
                        int i5 = sArr[i4] & 65535;
                        if (i5 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            v = (V) objArr[i5 ^ 1];
                            break;
                        }
                        iZza2 = i4 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzad.zza(obj.hashCode());
                    while (true) {
                        int i6 = iZza3 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            v = (V) objArr[i7 ^ 1];
                            break;
                        }
                        iZza3 = i6 + 1;
                    }
                }
            }
        }
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzal
    public final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzal
    public final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzal
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <K, V> zzas<K, V> zza(int i, Object[] objArr, zzao<K, V> zzaoVar) {
        int iHighestOneBit;
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzas) zza;
        }
        zzan zzanVar = null;
        ?? r32 = 0;
        zzan zzanVar2 = null;
        zzan zzanVar3 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzae.zza(obj, obj2);
            return new zzas<>(null, objArrCopyOf, 1);
        }
        zzu.zzb(i4, objArrCopyOf.length >> 1);
        char c3 = 2;
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            zzu.zza(iMax < 1073741824, "collection too large");
        }
        if (i4 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzae.zza(obj3, obj4);
            z4 = false;
            i2 = 1;
        } else {
            int i6 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj5 = objArrCopyOf[i9];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i9 ^ i5];
                    Objects.requireNonNull(obj6);
                    zzae.zza(obj5, obj6);
                    int iZza = zzad.zza(obj5.hashCode());
                    while (true) {
                        int i11 = iZza & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArrCopyOf[i10] = obj5;
                                objArrCopyOf[i10 ^ 1] = obj6;
                            }
                            i8++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                                int i13 = ~i12;
                                Object obj7 = objArrCopyOf[i13 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                zzanVar2 = new zzan(obj5, obj6, obj7);
                                objArrCopyOf[i13 == true ? 1 : 0] = obj6;
                                break;
                            }
                            iZza = i11 + 1;
                            z5 = z2;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    c = 2;
                    r3 = bArr;
                    r16 = z;
                    z3 = r3 instanceof Object[];
                    ?? r33 = r3;
                    if (z3) {
                        Object[] objArr2 = (Object[]) r3;
                        zzan zzanVar4 = (zzan) objArr2[c];
                        if (zzaoVar == null) {
                            throw zzanVar4.zza();
                        }
                        zzaoVar.zza = zzanVar4;
                        Object obj8 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i2]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                        r33 = obj8;
                        i4 = iIntValue;
                    }
                    return new zzas<>(r33, objArrCopyOf, i4);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i2] = Integer.valueOf(i8);
                sArr[2] = zzanVar2;
                r32 = sArr;
                z4 = z;
            } else {
                z = false;
                i2 = 1;
                if (iHighestOneBit > 32768) {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i14 * 2;
                        int i17 = i15 * 2;
                        Object obj9 = objArrCopyOf[i16];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i16 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzae.zza(obj9, obj10);
                        int iZza2 = zzad.zza(obj9.hashCode());
                        while (true) {
                            int i18 = iZza2 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i17;
                                if (i15 < i14) {
                                    objArrCopyOf[i17] = obj9;
                                    objArrCopyOf[i17 ^ 1] = obj10;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj9.equals(objArrCopyOf[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj11 = objArrCopyOf[i20];
                                    Objects.requireNonNull(obj11);
                                    zzanVar = new zzan(obj9, obj10, obj11);
                                    objArrCopyOf[i20] = obj10;
                                    break;
                                }
                                iZza2 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = zzanVar;
                        r3 = objArr3;
                        r16 = z;
                    }
                    z3 = r3 instanceof Object[];
                    ?? r332 = r3;
                    if (z3) {
                    }
                    return new zzas<>(r332, objArrCopyOf, i4);
                }
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i22 * 2;
                    int i24 = i21 * 2;
                    Object obj12 = objArrCopyOf[i23];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArrCopyOf[i23 ^ 1];
                    Objects.requireNonNull(obj13);
                    zzae.zza(obj12, obj13);
                    int iZza3 = zzad.zza(obj12.hashCode());
                    while (true) {
                        int i25 = iZza3 & i6;
                        int i26 = sArr[i25] & 65535;
                        if (i26 == 65535) {
                            sArr[i25] = (short) i24;
                            if (i21 < i22) {
                                objArrCopyOf[i24] = obj12;
                                objArrCopyOf[i24 ^ 1] = obj13;
                            }
                            i21++;
                        } else {
                            if (obj12.equals(objArrCopyOf[i26 == true ? 1 : 0])) {
                                int i27 = ~i26;
                                Object obj14 = objArrCopyOf[i27 == true ? 1 : 0];
                                Objects.requireNonNull(obj14);
                                zzanVar3 = new zzan(obj12, obj13, obj14);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj13;
                                break;
                            }
                            iZza3 = i25 + 1;
                        }
                    }
                }
                if (i21 == i4) {
                    r32 = sArr;
                    z4 = z;
                } else {
                    r32 = new Object[]{sArr, Integer.valueOf(i21), zzanVar3};
                    z4 = z;
                }
            }
        }
        c = 2;
        r3 = r32;
        r16 = z4;
        z3 = r3 instanceof Object[];
        ?? r3322 = r3;
        if (z3) {
        }
        return new zzas<>(r3322, objArrCopyOf, i4);
    }
}
