package OooOo;

import OooOoO0.C20514OooO0Oo;

/* JADX INFO: renamed from: OooOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20481OooOOoo<V> extends AbstractC20476OooO0oo<V> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f58499OooO0o;

    public C20481OooOOoo() {
        this((Object) null);
    }

    public final int OooO0OO(int i) {
        long j;
        int i2;
        long j2;
        long[] jArr;
        long[] jArr2;
        int i3;
        int[] iArr;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f58483OooO0Oo;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.f58480OooO00o;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j3 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j4 = i7;
            int i14 = i10;
            int i15 = 0;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j6 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.f58481OooO0O0[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j6 &= j6 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            char c = '\b';
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int iOooO0Oo = OooO0Oo(i6);
                long j7 = 255;
                if (this.f58499OooO0o != 0 || ((this.f58480OooO00o[iOooO0Oo >> 3] >> ((iOooO0Oo & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    j2 = 128;
                } else {
                    int i20 = this.f58483OooO0Oo;
                    if (i20 <= 8 || Long.compareUnsigned(((long) this.f58484OooO0o0) * 32, ((long) i20) * 25) > 0) {
                        j = 255;
                        i2 = 1;
                        j2 = 128;
                        int iOooO0Oo2 = C20491OooOooo.OooO0Oo(this.f58483OooO0Oo);
                        long[] jArr4 = this.f58480OooO00o;
                        int[] iArr2 = this.f58481OooO0O0;
                        Object[] objArr = this.f58482OooO0OO;
                        int i21 = this.f58483OooO0Oo;
                        OooO0o0(iOooO0Oo2);
                        long[] jArr5 = this.f58480OooO00o;
                        int[] iArr3 = this.f58481OooO0O0;
                        Object[] objArr2 = this.f58482OooO0OO;
                        int i22 = this.f58483OooO0Oo;
                        int i23 = i19;
                        while (i23 < i21) {
                            if (((jArr4[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                int i24 = iArr2[i23];
                                int iHashCode2 = Integer.hashCode(i24) * i18;
                                int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                int iOooO0Oo3 = OooO0Oo(i25 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j8 = i25 & 127;
                                int i26 = iOooO0Oo3 >> 3;
                                int i27 = (iOooO0Oo3 & 7) << 3;
                                long j9 = (jArr[i26] & (~(255 << i27))) | (j8 << i27);
                                jArr[i26] = j9;
                                jArr[(((iOooO0Oo3 - 7) & i22) + (i22 & 7)) >> 3] = j9;
                                iArr3[iOooO0Oo3] = i24;
                                objArr2[iOooO0Oo3] = objArr[i23];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i23++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.f58480OooO00o;
                        int i28 = this.f58483OooO0Oo;
                        int[] iArr4 = this.f58481OooO0O0;
                        Object[] objArr3 = this.f58482OooO0OO;
                        C20491OooOooo.OooO00o(jArr6, i28);
                        int i29 = i19;
                        int iOooO0O0 = -1;
                        j2 = 128;
                        while (i29 != i28) {
                            int i30 = i29 >> 3;
                            int i31 = (i29 & 7) << 3;
                            long j10 = (jArr6[i30] >> i31) & j7;
                            if (j10 == 128) {
                                int i32 = i29;
                                i29++;
                                iOooO0O0 = i32;
                            } else if (j10 != 254) {
                                i29++;
                            } else {
                                int iHashCode3 = Integer.hashCode(iArr4[i29]) * i18;
                                int i33 = iHashCode3 ^ (iHashCode3 << 16);
                                char c2 = c;
                                int i34 = i33 >>> 7;
                                int iOooO0Oo4 = OooO0Oo(i34);
                                int i35 = i34 & i28;
                                long j11 = j7;
                                if (((iOooO0Oo4 - i35) & i28) / 8 == ((i29 - i35) & i28) / 8) {
                                    int i36 = i13;
                                    jArr6[i30] = (((long) (i33 & 127)) << i31) | (jArr6[i30] & (~(j11 << i31)));
                                    jArr6[jArr6.length - i36] = (jArr6[i19] & 72057594037927935L) | Long.MIN_VALUE;
                                    i29++;
                                    i13 = i36;
                                    c = c2;
                                    j7 = j11;
                                } else {
                                    int i37 = i13;
                                    int i38 = iOooO0Oo4 >> 3;
                                    long j12 = jArr6[i38];
                                    int i39 = (iOooO0Oo4 & 7) << 3;
                                    if (((j12 >> i39) & j11) == 128) {
                                        i3 = i37;
                                        iArr = iArr4;
                                        jArr6[i38] = ((~(j11 << i39)) & j12) | (((long) (i33 & 127)) << i39);
                                        jArr6[i30] = (jArr6[i30] & (~(j11 << i31))) | (128 << i31);
                                        iArr[iOooO0Oo4] = iArr[i29];
                                        iArr[i29] = i19;
                                        objArr3[iOooO0Oo4] = objArr3[i29];
                                        objArr3[i29] = null;
                                        iOooO0O0 = i29;
                                    } else {
                                        i3 = i37;
                                        iArr = iArr4;
                                        jArr6[i38] = ((~(j11 << i39)) & j12) | (((long) (i33 & 127)) << i39);
                                        if (iOooO0O0 == -1) {
                                            iOooO0O0 = C20491OooOooo.OooO0O0(jArr6, i29 + 1, i28);
                                        }
                                        iArr[iOooO0O0] = iArr[iOooO0Oo4];
                                        iArr[iOooO0Oo4] = iArr[i29];
                                        iArr[i29] = iArr[iOooO0O0];
                                        objArr3[iOooO0O0] = objArr3[iOooO0Oo4];
                                        objArr3[iOooO0Oo4] = objArr3[i29];
                                        objArr3[i29] = objArr3[iOooO0O0];
                                        i29--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[i19] & 72057594037927935L) | Long.MIN_VALUE;
                                    i29++;
                                    c = c2;
                                    iArr4 = iArr;
                                    j7 = j11;
                                    i13 = i3;
                                }
                            }
                        }
                        j = j7;
                        i2 = i13;
                        this.f58499OooO0o = C20491OooOooo.OooO0OO(this.f58483OooO0Oo) - this.f58484OooO0o0;
                    }
                    iOooO0Oo = OooO0Oo(i6);
                }
                this.f58484OooO0o0++;
                int i40 = this.f58499OooO0o;
                long[] jArr7 = this.f58480OooO00o;
                int i41 = iOooO0Oo >> 3;
                long j13 = jArr7[i41];
                int i42 = (iOooO0Oo & 7) << 3;
                if (((j13 >> i42) & j) != j2) {
                    i2 = i19;
                }
                this.f58499OooO0o = i40 - i2;
                int i43 = this.f58483OooO0Oo;
                long j14 = (j13 & (~(j << i42))) | (j4 << i42);
                jArr7[i41] = j14;
                jArr7[(((iOooO0Oo - 7) & i43) + (i43 & 7)) >> 3] = j14;
                return iOooO0Oo;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public final int OooO0Oo(int i) {
        int i2 = this.f58483OooO0Oo;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f58480OooO00o;
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
        this.f58484OooO0o0--;
        long[] jArr = this.f58480OooO00o;
        int i2 = this.f58483OooO0Oo;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.f58482OooO0OO;
        Object obj = objArr[i];
        objArr[i] = null;
    }

    public final void OooO0o0(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C20491OooOooo.OooO0o0(i)) : 0;
        this.f58483OooO0Oo = iMax;
        if (iMax == 0) {
            jArr = C20491OooOooo.f58536OooO00o;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Oooo.OooO0OO.OooOOOo(jArr);
        }
        this.f58480OooO00o = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f58499OooO0o = C20491OooOooo.OooO0OO(this.f58483OooO0Oo) - this.f58484OooO0o0;
        this.f58481OooO0O0 = new int[iMax];
        this.f58482OooO0OO = new Object[iMax];
    }

    public final void OooO0oO(int i, V v) {
        int iOooO0OO = OooO0OO(i);
        this.f58481OooO0O0[iOooO0OO] = i;
        this.f58482OooO0OO[iOooO0OO] = v;
    }

    public C20481OooOOoo(int i) {
        if (i >= 0) {
            OooO0o0(C20491OooOooo.OooO0o(i));
        } else {
            C20514OooO0Oo.OooO00o("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ C20481OooOOoo(Object obj) {
        this(6);
    }
}
