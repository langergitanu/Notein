package oO0OOOO0;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: oO0OOOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32951OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f119060OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f119063OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f119065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InputStream f119066OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f119068OooO0oo = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f119061OooO00o = new byte[4096];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f119062OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f119064OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f119067OooO0oO = 0;

    public C32951OooO0Oo(InputStream inputStream) {
        this.f119066OooO0o0 = inputStream;
    }

    public final int OooO() throws IOException {
        int i = this.f119064OooO0Oo;
        if (this.f119062OooO0O0 - i < 4) {
            OooOOOo(4);
            i = this.f119064OooO0Oo;
        }
        this.f119064OooO0Oo = i + 4;
        byte[] bArr = this.f119061OooO00o;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final void OooO00o(int i) throws OooOO0 {
        if (this.f119065OooO0o != i) {
            throw new OooOO0("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int OooO0O0() {
        int i = this.f119068OooO0oo;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f119067OooO0oO + this.f119064OooO0Oo);
    }

    public final void OooO0OO(int i) {
        this.f119068OooO0oo = i;
        OooOOOO();
    }

    public final int OooO0Oo(int i) throws OooOO0 {
        if (i < 0) {
            throw new OooOO0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f119067OooO0oO + this.f119064OooO0Oo + i;
        int i3 = this.f119068OooO0oo;
        if (i2 > i3) {
            throw OooOO0.OooO00o();
        }
        this.f119068OooO0oo = i2;
        OooOOOO();
        return i3;
    }

    public final int OooO0o() throws IOException {
        return OooOO0O();
    }

    public final OooOOOO OooO0o0() throws IOException {
        int iOooOO0O = OooOO0O();
        int i = this.f119062OooO0O0;
        int i2 = this.f119064OooO0Oo;
        if (iOooOO0O > i - i2 || iOooOO0O <= 0) {
            return iOooOO0O == 0 ? OooO0OO.f119053OooOo0o : new OooOOOO(OooO0oo(iOooOO0O));
        }
        OooOOOO oooOOOO = OooO0OO.f119053OooOo0o;
        byte[] bArr = new byte[iOooOO0O];
        System.arraycopy(this.f119061OooO00o, i2, bArr, 0, iOooOO0O);
        OooOOOO oooOOOO2 = new OooOOOO(bArr);
        this.f119064OooO0Oo += iOooOO0O;
        return oooOOOO2;
    }

    public final <T extends InterfaceC32958OooOOOo> T OooO0oO(InterfaceC32959OooOOo<T> interfaceC32959OooOOo, OooO0o oooO0o) throws IOException {
        int iOooOO0O = OooOO0O();
        if (this.f119060OooO >= 64) {
            throw new OooOO0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iOooO0Oo = OooO0Oo(iOooOO0O);
        this.f119060OooO++;
        T tOooO00o = interfaceC32959OooOOo.OooO00o(this, oooO0o);
        OooO00o(0);
        this.f119060OooO--;
        OooO0OO(iOooO0Oo);
        return tOooO00o;
    }

    public final byte[] OooO0oo(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return OooO.f119051OooO00o;
            }
            throw new OooOO0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f119067OooO0oO;
        int i3 = this.f119064OooO0Oo;
        int i4 = i2 + i3 + i;
        int i5 = this.f119068OooO0oo;
        if (i4 > i5) {
            OooOOo((i5 - i2) - i3);
            throw OooOO0.OooO00o();
        }
        byte[] bArr = this.f119061OooO00o;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.f119062OooO0O0 - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.f119064OooO0Oo = this.f119062OooO0O0;
            int i7 = i - i6;
            if (i7 > 0) {
                OooOOOo(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.f119064OooO0Oo = i7;
            return bArr2;
        }
        int i8 = this.f119062OooO0O0;
        this.f119067OooO0oO = i2 + i8;
        this.f119064OooO0Oo = 0;
        this.f119062OooO0O0 = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f119066OooO0o0;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw OooOO0.OooO00o();
                }
                this.f119067OooO0oO += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final long OooOO0() throws IOException {
        int i = this.f119064OooO0Oo;
        if (this.f119062OooO0O0 - i < 8) {
            OooOOOo(8);
            i = this.f119064OooO0Oo;
        }
        this.f119064OooO0Oo = i + 8;
        byte[] bArr = this.f119061OooO00o;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int OooOO0O() throws IOException {
        int i;
        int i2 = this.f119064OooO0Oo;
        int i3 = this.f119062OooO0O0;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f119061OooO00o;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f119064OooO0Oo = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
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
                this.f119064OooO0Oo = i5;
                return i;
            }
        }
        return (int) OooOOO0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OooOO0o() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f119064OooO0Oo;
        int i2 = this.f119062OooO0O0;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f119061OooO00o;
            byte b = bArr[i];
            if (b >= 0) {
                this.f119064OooO0Oo = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ ((long) (bArr[i4] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ ((long) (bArr[i5] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (((long) bArr[i4]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j4 >= 0) {
                                            int i6 = i + 9;
                                            long j6 = (j4 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            i4 = j6 < 0 ? i + 10 : i6;
                                            j = j6;
                                            this.f119064OooO0Oo = i4;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                    j = j3 ^ j5;
                    this.f119064OooO0Oo = i4;
                    return j;
                }
                j2 = -128;
                j = j2 ^ j4;
                this.f119064OooO0Oo = i4;
                return j;
            }
        }
        return OooOOO0();
    }

    public final int OooOOO() throws IOException {
        if (this.f119064OooO0Oo == this.f119062OooO0O0 && !OooOOoo(1)) {
            this.f119065OooO0o = 0;
            return 0;
        }
        int iOooOO0O = OooOO0O();
        this.f119065OooO0o = iOooOO0O;
        if ((iOooOO0O >>> 3) != 0) {
            return iOooOO0O;
        }
        throw new OooOO0("Protocol message contained an invalid tag (zero).");
    }

    public final long OooOOO0() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f119064OooO0Oo == this.f119062OooO0O0) {
                OooOOOo(1);
            }
            int i2 = this.f119064OooO0Oo;
            this.f119064OooO0Oo = i2 + 1;
            byte b = this.f119061OooO00o[i2];
            j |= ((long) (b & Ascii.DEL)) << i;
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j;
            }
        }
        throw new OooOO0("CodedInputStream encountered a malformed varint.");
    }

    public final void OooOOOO() {
        int i = this.f119062OooO0O0 + this.f119063OooO0OO;
        this.f119062OooO0O0 = i;
        int i2 = this.f119067OooO0oO + i;
        int i3 = this.f119068OooO0oo;
        if (i2 <= i3) {
            this.f119063OooO0OO = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f119063OooO0OO = i4;
        this.f119062OooO0O0 = i - i4;
    }

    public final void OooOOOo(int i) throws IOException {
        if (!OooOOoo(i)) {
            throw OooOO0.OooO00o();
        }
    }

    public final void OooOOo(int i) throws IOException {
        int i2 = this.f119062OooO0O0;
        int i3 = this.f119064OooO0Oo;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f119064OooO0Oo = i3 + i;
            return;
        }
        if (i < 0) {
            throw new OooOO0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f119067OooO0oO;
        int i6 = i5 + i3 + i;
        int i7 = this.f119068OooO0oo;
        if (i6 > i7) {
            OooOOo((i7 - i5) - i3);
            throw OooOO0.OooO00o();
        }
        this.f119064OooO0Oo = i2;
        OooOOOo(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.f119062OooO0O0;
            if (i8 <= i9) {
                this.f119064OooO0Oo = i8;
                return;
            } else {
                i4 += i9;
                this.f119064OooO0Oo = i9;
                OooOOOo(1);
            }
        }
    }

    public final boolean OooOOo0(int i, C32952OooO0o0 c32952OooO0o0) throws IOException {
        int iOooOOO;
        int i2 = i & 7;
        if (i2 == 0) {
            long jOooOO0o = OooOO0o();
            c32952OooO0o0.OooOo0O(i);
            c32952OooO0o0.OooOo0o(jOooOO0o);
            return true;
        }
        if (i2 == 1) {
            long jOooOO0 = OooOO0();
            c32952OooO0o0.OooOo0O(i);
            c32952OooO0o0.OooOo0(jOooOO0);
            return true;
        }
        if (i2 == 2) {
            OooOOOO oooOOOOOooO0o0 = OooO0o0();
            c32952OooO0o0.OooOo0O(i);
            c32952OooO0o0.OooOo0O(oooOOOOOooO0o0.size());
            c32952OooO0o0.OooOOo(oooOOOOOooO0o0);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new OooOO0("Protocol message tag had invalid wire type.");
            }
            int iOooO = OooO();
            c32952OooO0o0.OooOo0O(i);
            c32952OooO0o0.OooOo00(iOooO);
            return true;
        }
        c32952OooO0o0.OooOo0O(i);
        do {
            iOooOOO = OooOOO();
            if (iOooOOO == 0) {
                break;
            }
        } while (OooOOo0(iOooOOO, c32952OooO0o0));
        int i3 = ((i >>> 3) << 3) | 4;
        OooO00o(i3);
        c32952OooO0o0.OooOo0O(i3);
        return true;
    }

    public final boolean OooOOoo(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.f119064OooO0Oo;
        int i3 = i2 + i;
        int i4 = this.f119062OooO0O0;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f119067OooO0oO + i2 + i <= this.f119068OooO0oo && (inputStream = this.f119066OooO0o0) != null) {
            byte[] bArr = this.f119061OooO00o;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f119067OooO0oO += i2;
                this.f119062OooO0O0 -= i2;
                this.f119064OooO0Oo = 0;
            }
            int i5 = this.f119062OooO0O0;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.f119062OooO0O0 += i6;
                if ((this.f119067OooO0oO + i) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL > 0) {
                    throw new OooOO0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                OooOOOO();
                if (this.f119062OooO0O0 >= i) {
                    return true;
                }
                return OooOOoo(i);
            }
        }
        return false;
    }
}
