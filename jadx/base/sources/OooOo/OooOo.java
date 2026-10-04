package OooOo;

import OooOoO0.C20514OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo<K, V> extends AbstractC20490OooOooO<K, V> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f58500OooO0o;

    public OooOo(int i) {
        if (i >= 0) {
            OooO0o(C20491OooOooo.OooO0o(i));
        } else {
            C20514OooO0Oo.OooO00o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void OooO(K k, V v) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 < 0) {
            iOooO0o0 = ~iOooO0o0;
        }
        this.f58532OooO0O0[iOooO0o0] = k;
        this.f58533OooO0OO[iOooO0o0] = v;
    }

    public final void OooO0OO() {
        this.f58535OooO0o0 = 0;
        long[] jArr = this.f58531OooO00o;
        if (jArr != C20491OooOooo.f58536OooO00o) {
            Oooo.OooO0OO.OooOOOo(jArr);
            long[] jArr2 = this.f58531OooO00o;
            int i = this.f58534OooO0Oo;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Oooo.OooO0OO.OooOOOO(this.f58533OooO0OO, null, 0, this.f58534OooO0Oo);
        Oooo.OooO0OO.OooOOOO(this.f58532OooO0O0, null, 0, this.f58534OooO0Oo);
        this.f58500OooO0o = C20491OooOooo.OooO0OO(this.f58534OooO0Oo) - this.f58535OooO0o0;
    }

    public final int OooO0Oo(int i) {
        int i2 = this.f58534OooO0Oo;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f58531OooO00o;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void OooO0o(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C20491OooOooo.OooO0o0(i)) : 0;
        this.f58534OooO0Oo = iMax;
        if (iMax == 0) {
            jArr = C20491OooOooo.f58536OooO00o;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Oooo.OooO0OO.OooOOOo(jArr);
        }
        this.f58531OooO00o = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f58500OooO0o = C20491OooOooo.OooO0OO(this.f58534OooO0Oo) - this.f58535OooO0o0;
        this.f58532OooO0O0 = new Object[iMax];
        this.f58533OooO0OO = new Object[iMax];
    }

    public final int OooO0o0(K k) {
        long j;
        long j2;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i;
        int i2 = -862048943;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f58534OooO0Oo;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f58531OooO00o;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = 1;
            long j3 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j4 = i5;
            int i12 = i5;
            int i13 = 0;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j6 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                int i14 = i2;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f58532OooO0O0[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
                j6 &= j6 - 1;
                i2 = i14;
            }
            int i15 = i2;
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int iOooO0Oo = OooO0Oo(i4);
                long j7 = 128;
                long j8 = 255;
                if (this.f58500OooO0o != 0 || ((this.f58531OooO00o[iOooO0Oo >> 3] >> ((iOooO0Oo & 7) << 3)) & 255) == 254) {
                    j = 128;
                    j2 = 255;
                } else {
                    int i16 = this.f58534OooO0Oo;
                    if (i16 <= 8 || Long.compareUnsigned(((long) this.f58535OooO0o0) * 32, ((long) i16) * 25) > 0) {
                        j = 128;
                        j2 = 255;
                        int iOooO0Oo2 = C20491OooOooo.OooO0Oo(this.f58534OooO0Oo);
                        long[] jArr4 = this.f58531OooO00o;
                        Object[] objArr2 = this.f58532OooO0O0;
                        Object[] objArr3 = this.f58533OooO0OO;
                        int i17 = this.f58534OooO0Oo;
                        OooO0o(iOooO0Oo2);
                        long[] jArr5 = this.f58531OooO00o;
                        Object[] objArr4 = this.f58532OooO0O0;
                        Object[] objArr5 = this.f58533OooO0OO;
                        int i18 = this.f58534OooO0Oo;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr4[i19 >> 3] >> ((i19 & 7) << 3)) & 255) < 128) {
                                Object obj = objArr2[i19];
                                int iHashCode2 = (obj != null ? obj.hashCode() : i13) * i15;
                                int i20 = iHashCode2 ^ (iHashCode2 << 16);
                                int iOooO0Oo3 = OooO0Oo(i20 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j9 = i20 & 127;
                                int i21 = iOooO0Oo3 >> 3;
                                int i22 = (iOooO0Oo3 & 7) << 3;
                                long j10 = (jArr[i21] & (~(255 << i22))) | (j9 << i22);
                                jArr[i21] = j10;
                                jArr[(((iOooO0Oo3 - 7) & i18) + (i18 & 7)) >> 3] = j10;
                                objArr4[iOooO0Oo3] = obj;
                                objArr5[iOooO0Oo3] = objArr3[i19];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i19++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                            i13 = 0;
                        }
                    } else {
                        long[] jArr6 = this.f58531OooO00o;
                        int i23 = this.f58534OooO0Oo;
                        Object[] objArr6 = this.f58532OooO0O0;
                        Object[] objArr7 = this.f58533OooO0OO;
                        C20491OooOooo.OooO00o(jArr6, i23);
                        int i24 = 0;
                        int iOooO0O0 = -1;
                        while (i24 != i23) {
                            int i25 = i24 >> 3;
                            int i26 = (i24 & 7) << 3;
                            long j11 = (jArr6[i25] >> i26) & j8;
                            if (j11 == j7) {
                                int i27 = i24;
                                i24++;
                                iOooO0O0 = i27;
                            } else if (j11 != 254) {
                                i24++;
                            } else {
                                Object obj2 = objArr6[i24];
                                int iHashCode3 = (obj2 != null ? obj2.hashCode() : 0) * i15;
                                int i28 = iHashCode3 ^ (iHashCode3 << 16);
                                long j12 = j7;
                                int i29 = i28 >>> 7;
                                int iOooO0Oo4 = OooO0Oo(i29);
                                int i30 = i29 & i23;
                                long j13 = j8;
                                if (((iOooO0Oo4 - i30) & i23) / 8 == ((i24 - i30) & i23) / 8) {
                                    jArr6[i25] = (((long) (i28 & 127)) << i26) | (jArr6[i25] & (~(j13 << i26)));
                                    jArr6[jArr6.length - 1] = jArr6[0];
                                    i24++;
                                    j7 = j12;
                                    j8 = j13;
                                } else {
                                    int i31 = i24;
                                    int i32 = iOooO0Oo4 >> 3;
                                    long j14 = jArr6[i32];
                                    int i33 = (iOooO0Oo4 & 7) << 3;
                                    if (((j14 >> i33) & j13) == j12) {
                                        objArr = objArr6;
                                        jArr6[i32] = ((~(j13 << i33)) & j14) | (((long) (i28 & 127)) << i33);
                                        jArr6[i25] = (jArr6[i25] & (~(j13 << i26))) | (j12 << i26);
                                        objArr[iOooO0Oo4] = objArr[i31];
                                        objArr[i31] = null;
                                        objArr7[iOooO0Oo4] = objArr7[i31];
                                        objArr7[i31] = null;
                                        iOooO0O0 = i31;
                                        i = iOooO0O0;
                                    } else {
                                        objArr = objArr6;
                                        jArr6[i32] = ((~(j13 << i33)) & j14) | (((long) (i28 & 127)) << i33);
                                        if (iOooO0O0 == -1) {
                                            iOooO0O0 = C20491OooOooo.OooO0O0(jArr6, i31 + 1, i23);
                                        }
                                        objArr[iOooO0O0] = objArr[iOooO0Oo4];
                                        objArr[iOooO0Oo4] = objArr[i31];
                                        objArr[i31] = objArr[iOooO0O0];
                                        objArr7[iOooO0O0] = objArr7[iOooO0Oo4];
                                        objArr7[iOooO0Oo4] = objArr7[i31];
                                        objArr7[i31] = objArr7[iOooO0O0];
                                        i = i31 - 1;
                                    }
                                    jArr6[jArr6.length - 1] = jArr6[0];
                                    objArr6 = objArr;
                                    j8 = j13;
                                    i24 = i + 1;
                                    j7 = j12;
                                }
                            }
                        }
                        j = j7;
                        j2 = j8;
                        this.f58500OooO0o = C20491OooOooo.OooO0OO(this.f58534OooO0Oo) - this.f58535OooO0o0;
                    }
                    iOooO0Oo = OooO0Oo(i4);
                }
                this.f58535OooO0o0++;
                int i34 = this.f58500OooO0o;
                long[] jArr7 = this.f58531OooO00o;
                int i35 = iOooO0Oo >> 3;
                long j15 = jArr7[i35];
                int i36 = (iOooO0Oo & 7) << 3;
                if (((j15 >> i36) & j2) != j) {
                    i11 = 0;
                }
                this.f58500OooO0o = i34 - i11;
                int i37 = this.f58534OooO0Oo;
                long j16 = (j15 & (~(j2 << i36))) | (j4 << i36);
                jArr7[i35] = j16;
                jArr7[(((iOooO0Oo - 7) & i37) + (i37 & 7)) >> 3] = j16;
                return ~iOooO0Oo;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i12;
            i2 = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oO(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f58534OooO0Oo;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f58531OooO00o;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f58532OooO0O0[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            OooO0oo(iNumberOfTrailingZeros);
        }
    }

    public final V OooO0oo(int i) {
        this.f58535OooO0o0--;
        long[] jArr = this.f58531OooO00o;
        int i2 = this.f58534OooO0Oo;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f58532OooO0O0[i] = null;
        Object[] objArr = this.f58533OooO0OO;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public /* synthetic */ OooOo() {
        this(6);
    }
}
