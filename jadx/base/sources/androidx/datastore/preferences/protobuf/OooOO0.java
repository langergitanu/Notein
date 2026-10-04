package androidx.datastore.preferences.protobuf;

import Oooo0oO.o0Oo0oo;
import androidx.datastore.preferences.protobuf.OooO;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f64417OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f64418OooO0O0 = 100;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f64419OooO0OO = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOO0O f64420OooO0Oo;

    public static final class OooO00o extends OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f64421OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f64422OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final byte[] f64423OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f64424OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f64425OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f64426OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f64427OooOO0O = Integer.MAX_VALUE;

        public OooO00o(byte[] bArr, int i, int i2, boolean z) {
            this.f64423OooO0o0 = bArr;
            this.f64422OooO0o = i2 + i;
            this.f64425OooO0oo = i;
            this.f64421OooO = i;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooO() throws IOException {
            return OooOoo0();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final void OooO00o(int i) throws C21807OooOoOO {
            if (this.f64426OooOO0 != i) {
                throw new C21807OooOoOO("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooO0O0() {
            return this.f64425OooO0oo - this.f64421OooO;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final boolean OooO0OO() throws IOException {
            return this.f64425OooO0oo == this.f64422OooO0o;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final void OooO0Oo(int i) {
            this.f64427OooOO0O = i;
            OooOooo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final boolean OooO0o() throws IOException {
            return OooOoo() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooO0o0(int i) throws C21807OooOoOO {
            if (i < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            int iOooO0O0 = OooO0O0() + i;
            if (iOooO0O0 < 0) {
                throw new C21807OooOoOO("Failed to parse the message.");
            }
            int i2 = this.f64427OooOO0O;
            if (iOooO0O0 > i2) {
                throw C21807OooOoOO.OooO0o0();
            }
            this.f64427OooOO0O = iOooO0O0;
            OooOooo();
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // androidx.datastore.preferences.protobuf.OooOO0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final OooO.OooO0o OooO0oO() throws IOException {
            byte[] bArrCopyOfRange;
            int iOooOoo0 = OooOoo0();
            byte[] bArr = this.f64423OooO0o0;
            if (iOooOoo0 > 0) {
                int i = this.f64422OooO0o;
                int i2 = this.f64425OooO0oo;
                if (iOooOoo0 <= i - i2) {
                    OooO.OooO0o oooO0oOooO0Oo = OooO.OooO0Oo(i2, iOooOoo0, bArr);
                    this.f64425OooO0oo += iOooOoo0;
                    return oooO0oOooO0Oo;
                }
            }
            if (iOooOoo0 == 0) {
                return OooO.f64403OooOo;
            }
            if (iOooOoo0 > 0) {
                int i3 = this.f64422OooO0o;
                int i4 = this.f64425OooO0oo;
                if (iOooOoo0 <= i3 - i4) {
                    int i5 = iOooOoo0 + i4;
                    this.f64425OooO0oo = i5;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                } else {
                    if (iOooOoo0 > 0) {
                        throw C21807OooOoOO.OooO0o0();
                    }
                    if (iOooOoo0 != 0) {
                        throw C21807OooOoOO.OooO0Oo();
                    }
                    bArrCopyOfRange = C21805OooOoO.f64483OooO0O0;
                }
            }
            OooO.OooO0o oooO0o = OooO.f64403OooOo;
            return new OooO.OooO0o(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final double OooO0oo() throws IOException {
            return Double.longBitsToDouble(OooOoOO());
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOO0() throws IOException {
            return OooOoO();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOO0O() throws IOException {
            return OooOoOO();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final float OooOO0o() throws IOException {
            return Float.intBitsToFloat(OooOoO());
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOOO() throws IOException {
            return OooOoo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOOO0() throws IOException {
            return OooOoo0();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOOOO() throws IOException {
            return OooOoO();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOOOo() throws IOException {
            return OooOoOO();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOOo() throws IOException {
            long jOooOoo = OooOoo();
            return (-(jOooOoo & 1)) ^ (jOooOoo >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOOo0() throws IOException {
            int iOooOoo0 = OooOoo0();
            return (-(iOooOoo0 & 1)) ^ (iOooOoo0 >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final String OooOOoo() throws IOException {
            int iOooOoo0 = OooOoo0();
            if (iOooOoo0 > 0) {
                int i = this.f64422OooO0o;
                int i2 = this.f64425OooO0oo;
                if (iOooOoo0 <= i - i2) {
                    String str = new String(this.f64423OooO0o0, i2, iOooOoo0, C21805OooOoO.f64482OooO00o);
                    this.f64425OooO0oo += iOooOoo0;
                    return str;
                }
            }
            if (iOooOoo0 == 0) {
                return "";
            }
            if (iOooOoo0 < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            throw C21807OooOoOO.OooO0o0();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final boolean OooOo(int i) throws IOException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    Oooo000(8);
                    return true;
                }
                if (i2 == 2) {
                    Oooo000(OooOoo0());
                    return true;
                }
                if (i2 == 3) {
                    OooOoO0();
                    OooO00o(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw C21807OooOoOO.OooO0O0();
                }
                Oooo000(4);
                return true;
            }
            int i4 = this.f64422OooO0o - this.f64425OooO0oo;
            byte[] bArr = this.f64423OooO0o0;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f64425OooO0oo;
                    this.f64425OooO0oo = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C21807OooOoOO.OooO0OO();
            }
            while (i3 < 10) {
                int i6 = this.f64425OooO0oo;
                if (i6 == this.f64422OooO0o) {
                    throw C21807OooOoOO.OooO0o0();
                }
                this.f64425OooO0oo = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C21807OooOoOO.OooO0OO();
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOo0() throws IOException {
            if (OooO0OO()) {
                this.f64426OooOO0 = 0;
                return 0;
            }
            int iOooOoo0 = OooOoo0();
            this.f64426OooOO0 = iOooOoo0;
            if ((iOooOoo0 >>> 3) != 0) {
                return iOooOoo0;
            }
            throw new C21807OooOoOO("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final String OooOo00() throws IOException {
            int iOooOoo0 = OooOoo0();
            if (iOooOoo0 > 0) {
                int i = this.f64422OooO0o;
                int i2 = this.f64425OooO0oo;
                if (iOooOoo0 <= i - i2) {
                    String strOooO00o = oo000o.f64604OooO00o.OooO00o(this.f64423OooO0o0, i2, iOooOoo0);
                    this.f64425OooO0oo += iOooOoo0;
                    return strOooO00o;
                }
            }
            if (iOooOoo0 == 0) {
                return "";
            }
            if (iOooOoo0 <= 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            throw C21807OooOoOO.OooO0o0();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOo0O() throws IOException {
            return OooOoo0();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOo0o() throws IOException {
            return OooOoo();
        }

        public final int OooOoO() throws IOException {
            int i = this.f64425OooO0oo;
            if (this.f64422OooO0o - i < 4) {
                throw C21807OooOoOO.OooO0o0();
            }
            this.f64425OooO0oo = i + 4;
            byte[] bArr = this.f64423OooO0o0;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long OooOoOO() throws IOException {
            int i = this.f64425OooO0oo;
            if (this.f64422OooO0o - i < 8) {
                throw C21807OooOoOO.OooO0o0();
            }
            this.f64425OooO0oo = i + 8;
            byte[] bArr = this.f64423OooO0o0;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final long OooOoo() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.f64425OooO0oo;
            int i2 = this.f64422OooO0o;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f64423OooO0o0;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f64425OooO0oo = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.f64425OooO0oo = i4;
                    return j;
                }
            }
            return OooOooO();
        }

        public final int OooOoo0() throws IOException {
            int i;
            int i2 = this.f64425OooO0oo;
            int i3 = this.f64422OooO0o;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f64423OooO0o0;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f64425OooO0oo = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f64425OooO0oo = i5;
                    return i;
                }
            }
            return (int) OooOooO();
        }

        public final long OooOooO() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.f64425OooO0oo;
                if (i2 == this.f64422OooO0o) {
                    throw C21807OooOoOO.OooO0o0();
                }
                this.f64425OooO0oo = i2 + 1;
                byte b = this.f64423OooO0o0[i2];
                j |= ((long) (b & Ascii.DEL)) << i;
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw C21807OooOoOO.OooO0OO();
        }

        public final void OooOooo() {
            int i = this.f64422OooO0o + this.f64424OooO0oO;
            this.f64422OooO0o = i;
            int i2 = i - this.f64421OooO;
            int i3 = this.f64427OooOO0O;
            if (i2 <= i3) {
                this.f64424OooO0oO = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f64424OooO0oO = i4;
            this.f64422OooO0o = i - i4;
        }

        public final void Oooo000(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f64422OooO0o;
                int i3 = this.f64425OooO0oo;
                if (i <= i2 - i3) {
                    this.f64425OooO0oo = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw C21807OooOoOO.OooO0o0();
            }
            throw C21807OooOoOO.OooO0Oo();
        }
    }

    public static final class OooO0O0 extends OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f64428OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final byte[] f64429OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final FileInputStream f64430OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f64431OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f64432OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f64433OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f64434OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f64435OooOO0o = Integer.MAX_VALUE;

        public OooO0O0(FileInputStream fileInputStream) {
            Charset charset = C21805OooOoO.f64482OooO00o;
            this.f64430OooO0o0 = fileInputStream;
            this.f64429OooO0o = new byte[4096];
            this.f64431OooO0oO = 0;
            this.f64428OooO = 0;
            this.f64434OooOO0O = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooO() throws IOException {
            return OooOooo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final void OooO00o(int i) throws C21807OooOoOO {
            if (this.f64433OooOO0 != i) {
                throw new C21807OooOoOO("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooO0O0() {
            return this.f64434OooOO0O + this.f64428OooO;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final boolean OooO0OO() throws IOException {
            return this.f64428OooO == this.f64431OooO0oO && !Oooo0OO(1);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final void OooO0Oo(int i) {
            this.f64435OooOO0o = i;
            Oooo00o();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final boolean OooO0o() throws IOException {
            return Oooo000() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooO0o0(int i) throws C21807OooOoOO {
            if (i < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            int i2 = this.f64434OooOO0O + this.f64428OooO + i;
            if (i2 < 0) {
                throw new C21807OooOoOO("Failed to parse the message.");
            }
            int i3 = this.f64435OooOO0o;
            if (i2 > i3) {
                throw C21807OooOoOO.OooO0o0();
            }
            this.f64435OooOO0o = i2;
            Oooo00o();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final OooO.OooO0o OooO0oO() throws IOException {
            int iOooOooo = OooOooo();
            int i = this.f64431OooO0oO;
            int i2 = this.f64428OooO;
            int i3 = i - i2;
            byte[] bArr = this.f64429OooO0o;
            if (iOooOooo <= i3 && iOooOooo > 0) {
                OooO.OooO0o oooO0oOooO0Oo = OooO.OooO0Oo(i2, iOooOooo, bArr);
                this.f64428OooO += iOooOooo;
                return oooO0oOooO0Oo;
            }
            if (iOooOooo == 0) {
                return OooO.f64403OooOo;
            }
            if (iOooOooo < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            byte[] bArrOooOoOO = OooOoOO(iOooOooo);
            if (bArrOooOoOO != null) {
                return OooO.OooO0Oo(0, bArrOooOoOO.length, bArrOooOoOO);
            }
            int i4 = this.f64428OooO;
            int i5 = this.f64431OooO0oO;
            int length = i5 - i4;
            this.f64434OooOO0O += i5;
            this.f64428OooO = 0;
            this.f64431OooO0oO = 0;
            ArrayList<byte[]> arrayListOooOoo0 = OooOoo0(iOooOooo - length);
            byte[] bArr2 = new byte[iOooOooo];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            for (byte[] bArr3 : arrayListOooOoo0) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            OooO.OooO0o oooO0o = OooO.f64403OooOo;
            return new OooO.OooO0o(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final double OooO0oo() throws IOException {
            return Double.longBitsToDouble(OooOooO());
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOO0() throws IOException {
            return OooOoo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOO0O() throws IOException {
            return OooOooO();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final float OooOO0o() throws IOException {
            return Float.intBitsToFloat(OooOoo());
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOOO() throws IOException {
            return Oooo000();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOOO0() throws IOException {
            return OooOooo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOOOO() throws IOException {
            return OooOoo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOOOo() throws IOException {
            return OooOooO();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOOo() throws IOException {
            long jOooo000 = Oooo000();
            return (-(jOooo000 & 1)) ^ (jOooo000 >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOOo0() throws IOException {
            int iOooOooo = OooOooo();
            return (-(iOooOooo & 1)) ^ (iOooOooo >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final String OooOOoo() throws IOException {
            int iOooOooo = OooOooo();
            byte[] bArr = this.f64429OooO0o;
            if (iOooOooo > 0) {
                int i = this.f64431OooO0oO;
                int i2 = this.f64428OooO;
                if (iOooOooo <= i - i2) {
                    String str = new String(bArr, i2, iOooOooo, C21805OooOoO.f64482OooO00o);
                    this.f64428OooO += iOooOooo;
                    return str;
                }
            }
            if (iOooOooo == 0) {
                return "";
            }
            if (iOooOooo < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            if (iOooOooo > this.f64431OooO0oO) {
                return new String(OooOoO(iOooOooo), C21805OooOoO.f64482OooO00o);
            }
            Oooo0(iOooOooo);
            String str2 = new String(bArr, this.f64428OooO, iOooOooo, C21805OooOoO.f64482OooO00o);
            this.f64428OooO += iOooOooo;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final boolean OooOo(int i) throws IOException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    Oooo0O0(8);
                    return true;
                }
                if (i2 == 2) {
                    Oooo0O0(OooOooo());
                    return true;
                }
                if (i2 == 3) {
                    OooOoO0();
                    OooO00o(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw C21807OooOoOO.OooO0O0();
                }
                Oooo0O0(4);
                return true;
            }
            int i4 = this.f64431OooO0oO - this.f64428OooO;
            byte[] bArr = this.f64429OooO0o;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f64428OooO;
                    this.f64428OooO = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C21807OooOoOO.OooO0OO();
            }
            while (i3 < 10) {
                if (this.f64428OooO == this.f64431OooO0oO) {
                    Oooo0(1);
                }
                int i6 = this.f64428OooO;
                this.f64428OooO = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C21807OooOoOO.OooO0OO();
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOo0() throws IOException {
            if (OooO0OO()) {
                this.f64433OooOO0 = 0;
                return 0;
            }
            int iOooOooo = OooOooo();
            this.f64433OooOO0 = iOooOooo;
            if ((iOooOooo >>> 3) != 0) {
                return iOooOooo;
            }
            throw new C21807OooOoOO("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final String OooOo00() throws IOException {
            int iOooOooo = OooOooo();
            int i = this.f64428OooO;
            int i2 = this.f64431OooO0oO;
            int i3 = i2 - i;
            byte[] bArrOooOoO = this.f64429OooO0o;
            if (iOooOooo <= i3 && iOooOooo > 0) {
                this.f64428OooO = i + iOooOooo;
            } else {
                if (iOooOooo == 0) {
                    return "";
                }
                if (iOooOooo < 0) {
                    throw C21807OooOoOO.OooO0Oo();
                }
                i = 0;
                if (iOooOooo <= i2) {
                    Oooo0(iOooOooo);
                    this.f64428OooO = iOooOooo;
                } else {
                    bArrOooOoO = OooOoO(iOooOooo);
                }
            }
            return oo000o.f64604OooO00o.OooO00o(bArrOooOoO, i, iOooOooo);
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final int OooOo0O() throws IOException {
            return OooOooo();
        }

        @Override // androidx.datastore.preferences.protobuf.OooOO0
        public final long OooOo0o() throws IOException {
            return Oooo000();
        }

        public final byte[] OooOoO(int i) throws IOException {
            byte[] bArrOooOoOO = OooOoOO(i);
            if (bArrOooOoOO != null) {
                return bArrOooOoOO;
            }
            int i2 = this.f64428OooO;
            int i3 = this.f64431OooO0oO;
            int length = i3 - i2;
            this.f64434OooOO0O += i3;
            this.f64428OooO = 0;
            this.f64431OooO0oO = 0;
            ArrayList<byte[]> arrayListOooOoo0 = OooOoo0(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f64429OooO0o, i2, bArr, 0, length);
            for (byte[] bArr2 : arrayListOooOoo0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] OooOoOO(int i) throws IOException {
            if (i == 0) {
                return C21805OooOoO.f64483OooO0O0;
            }
            if (i < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            int i2 = this.f64434OooOO0O;
            int i3 = this.f64428OooO;
            int i4 = i2 + i3 + i;
            if (i4 - this.f64419OooO0OO > 0) {
                throw new C21807OooOoOO("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.f64435OooOO0o;
            if (i4 > i5) {
                Oooo0O0((i5 - i2) - i3);
                throw C21807OooOoOO.OooO0o0();
            }
            int i6 = this.f64431OooO0oO - i3;
            int i7 = i - i6;
            FileInputStream fileInputStream = this.f64430OooO0o0;
            if (i7 >= 4096) {
                try {
                    if (i7 > fileInputStream.available()) {
                        return null;
                    }
                } catch (C21807OooOoOO e) {
                    e.f64486OooOo0o = true;
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f64429OooO0o, this.f64428OooO, bArr, 0, i6);
            this.f64434OooOO0O += this.f64431OooO0oO;
            this.f64428OooO = 0;
            this.f64431OooO0oO = 0;
            while (i6 < i) {
                try {
                    int i8 = fileInputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw C21807OooOoOO.OooO0o0();
                    }
                    this.f64434OooOO0O += i8;
                    i6 += i8;
                } catch (C21807OooOoOO e2) {
                    e2.f64486OooOo0o = true;
                    throw e2;
                }
            }
            return bArr;
        }

        public final int OooOoo() throws IOException {
            int i = this.f64428OooO;
            if (this.f64431OooO0oO - i < 4) {
                Oooo0(4);
                i = this.f64428OooO;
            }
            this.f64428OooO = i + 4;
            byte[] bArr = this.f64429OooO0o;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final ArrayList OooOoo0(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f64430OooO0o0.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw C21807OooOoOO.OooO0o0();
                    }
                    this.f64434OooOO0O += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final long OooOooO() throws IOException {
            int i = this.f64428OooO;
            if (this.f64431OooO0oO - i < 8) {
                Oooo0(8);
                i = this.f64428OooO;
            }
            this.f64428OooO = i + 8;
            byte[] bArr = this.f64429OooO0o;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final int OooOooo() throws IOException {
            int i;
            int i2 = this.f64428OooO;
            int i3 = this.f64431OooO0oO;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f64429OooO0o;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f64428OooO = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f64428OooO = i5;
                    return i;
                }
            }
            return (int) Oooo00O();
        }

        public final void Oooo0(int i) throws IOException {
            if (Oooo0OO(i)) {
                return;
            }
            if (i <= (this.f64419OooO0OO - this.f64434OooOO0O) - this.f64428OooO) {
                throw C21807OooOoOO.OooO0o0();
            }
            throw new C21807OooOoOO("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final long Oooo000() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.f64428OooO;
            int i2 = this.f64431OooO0oO;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f64429OooO0o;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f64428OooO = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.f64428OooO = i4;
                    return j;
                }
            }
            return Oooo00O();
        }

        public final long Oooo00O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f64428OooO == this.f64431OooO0oO) {
                    Oooo0(1);
                }
                int i2 = this.f64428OooO;
                this.f64428OooO = i2 + 1;
                byte b = this.f64429OooO0o[i2];
                j |= ((long) (b & Ascii.DEL)) << i;
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw C21807OooOoOO.OooO0OO();
        }

        public final void Oooo00o() {
            int i = this.f64431OooO0oO + this.f64432OooO0oo;
            this.f64431OooO0oO = i;
            int i2 = this.f64434OooOO0O + i;
            int i3 = this.f64435OooOO0o;
            if (i2 <= i3) {
                this.f64432OooO0oo = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f64432OooO0oo = i4;
            this.f64431OooO0oO = i - i4;
        }

        public final void Oooo0O0(int i) throws IOException {
            int i2 = this.f64431OooO0oO;
            int i3 = this.f64428OooO;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.f64428OooO = i3 + i;
                return;
            }
            FileInputStream fileInputStream = this.f64430OooO0o0;
            if (i < 0) {
                throw C21807OooOoOO.OooO0Oo();
            }
            int i5 = this.f64434OooOO0O;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.f64435OooOO0o;
            if (i7 > i8) {
                Oooo0O0((i8 - i5) - i3);
                throw C21807OooOoOO.OooO0o0();
            }
            this.f64434OooOO0O = i6;
            this.f64431OooO0oO = 0;
            this.f64428OooO = 0;
            while (i4 < i) {
                long j = i - i4;
                try {
                    try {
                        long jSkip = fileInputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } catch (C21807OooOoOO e) {
                        e.f64486OooOo0o = true;
                        throw e;
                    }
                } catch (Throwable th) {
                    this.f64434OooOO0O += i4;
                    Oooo00o();
                    throw th;
                }
            }
            this.f64434OooOO0O += i4;
            Oooo00o();
            if (i4 >= i) {
                return;
            }
            int i9 = this.f64431OooO0oO;
            int i10 = i9 - this.f64428OooO;
            this.f64428OooO = i9;
            Oooo0(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.f64431OooO0oO;
                if (i11 <= i12) {
                    this.f64428OooO = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f64428OooO = i12;
                    Oooo0(1);
                }
            }
        }

        public final boolean Oooo0OO(int i) throws IOException {
            int i2 = this.f64428OooO;
            int i3 = i2 + i;
            int i4 = this.f64431OooO0oO;
            if (i3 <= i4) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i5 = this.f64434OooOO0O;
            int i6 = this.f64419OooO0OO;
            if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.f64435OooOO0o) {
                byte[] bArr = this.f64429OooO0o;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f64434OooOO0O += i2;
                    this.f64431OooO0oO -= i2;
                    this.f64428OooO = 0;
                }
                int i7 = this.f64431OooO0oO;
                int iMin = Math.min(bArr.length - i7, (i6 - this.f64434OooOO0O) - i7);
                FileInputStream fileInputStream = this.f64430OooO0o0;
                try {
                    int i8 = fileInputStream.read(bArr, i7, iMin);
                    if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i8 > 0) {
                        this.f64431OooO0oO += i8;
                        Oooo00o();
                        if (this.f64431OooO0oO >= i) {
                            return true;
                        }
                        return Oooo0OO(i);
                    }
                } catch (C21807OooOoOO e) {
                    e.f64486OooOo0o = true;
                    throw e;
                }
            }
            return false;
        }
    }

    public abstract int OooO() throws IOException;

    public abstract void OooO00o(int i) throws C21807OooOoOO;

    public abstract int OooO0O0();

    public abstract boolean OooO0OO() throws IOException;

    public abstract void OooO0Oo(int i);

    public abstract boolean OooO0o() throws IOException;

    public abstract int OooO0o0(int i) throws C21807OooOoOO;

    public abstract OooO.OooO0o OooO0oO() throws IOException;

    public abstract double OooO0oo() throws IOException;

    public abstract int OooOO0() throws IOException;

    public abstract long OooOO0O() throws IOException;

    public abstract float OooOO0o() throws IOException;

    public abstract long OooOOO() throws IOException;

    public abstract int OooOOO0() throws IOException;

    public abstract int OooOOOO() throws IOException;

    public abstract long OooOOOo() throws IOException;

    public abstract long OooOOo() throws IOException;

    public abstract int OooOOo0() throws IOException;

    public abstract String OooOOoo() throws IOException;

    public abstract boolean OooOo(int i) throws IOException;

    public abstract int OooOo0() throws IOException;

    public abstract String OooOo00() throws IOException;

    public abstract int OooOo0O() throws IOException;

    public abstract long OooOo0o() throws IOException;

    public final void OooOoO0() throws IOException {
        int iOooOo0;
        do {
            iOooOo0 = OooOo0();
            if (iOooOo0 == 0) {
                return;
            }
            int i = this.f64417OooO00o;
            if (i >= this.f64418OooO0O0) {
                throw new C21807OooOoOO("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f64417OooO00o = i + 1;
            this.f64417OooO00o--;
        } while (OooOo(iOooOo0));
    }
}
