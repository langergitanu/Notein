package com.yubico.yubikit.core.smartcard;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.yubico.yubikit.core.smartcard.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23923OooO0oO implements Closeable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0o f80304OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0OO f80303OooOo = OooO0OO.f80299OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f80306OooOoO0 = false;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f80305OooOoO = 0;

    public C23923OooO0oO(OooO0o oooO0o) {
        this.f80304OooOo0o = oooO0o;
    }

    public static byte[] OooO00o(byte b, byte b2, byte b3, byte b4, byte[] bArr, int i, int i2) {
        if (i2 <= 255) {
            return ByteBuffer.allocate(i2 + 5).put(b).put(b2).put(b3).put(b4).put((byte) i2).put(bArr, i, i2).array();
        }
        throw new IllegalArgumentException("Length must be no greater than 255");
    }

    public final byte[] OooO0OO(OooO00o oooO00o) throws OooO0O0, IOException {
        short s;
        C23921OooO0Oo c23921OooO0Oo;
        byte[] bArr;
        byte[] bArr2;
        boolean z = this.f80306OooOoO0;
        OooO0o oooO0o = this.f80304OooOo0o;
        if (z && this.f80305OooOoO > 0 && System.currentTimeMillis() - this.f80305OooOoO < 2000) {
            oooO0o.Ooooo0o(new byte[5]);
            this.f80305OooOoO = 0L;
        }
        byte[] bArr3 = oooO00o.f80296OooO0o0;
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
        int iOrdinal = this.f80303OooOo.ordinal();
        short s2 = -28672;
        boolean z2 = true;
        byte b = oooO00o.f80292OooO00o;
        if (iOrdinal == 0) {
            int i = 0;
            while (bArrCopyOf.length - i > 255) {
                byte b2 = b;
                boolean z3 = z2;
                short s3 = s2;
                byte[] bArrOoooo0o = oooO0o.Ooooo0o(OooO00o((byte) (b | 16), oooO00o.f80293OooO0O0, oooO00o.f80294OooO0OO, oooO00o.f80295OooO0Oo, bArrCopyOf, i, 255));
                if (bArrOoooo0o.length < 2) {
                    throw new IllegalArgumentException("Invalid APDU response data");
                }
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrOoooo0o, bArrOoooo0o.length);
                if (((short) (((bArrCopyOf2[bArrCopyOf2.length - 2] & 255) << 8) | (bArrCopyOf2[bArrCopyOf2.length - 1] & 255))) != s3) {
                    throw new OooO0O0((short) (((bArrCopyOf2[bArrCopyOf2.length - 2] & 255) << 8) | (bArrCopyOf2[bArrCopyOf2.length - 1] & 255)));
                }
                i += 255;
                s2 = s3;
                z2 = z3;
                b = b2;
            }
            s = s2;
            c23921OooO0Oo = new C23921OooO0Oo(oooO0o.Ooooo0o(OooO00o(oooO00o.f80292OooO00o, oooO00o.f80293OooO0O0, oooO00o.f80294OooO0OO, oooO00o.f80295OooO0Oo, bArrCopyOf, i, bArrCopyOf.length - i)));
            bArr = new byte[5];
            bArr[0] = 0;
            bArr[z2 ? 1 : 0] = -64;
            bArr[2] = 0;
            bArr[3] = 0;
            bArr[4] = 0;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Invalid APDU format");
            }
            bArr = new byte[]{0, -64, 0, 0, 0, 0, 0};
            c23921OooO0Oo = new C23921OooO0Oo(oooO0o.Ooooo0o(ByteBuffer.allocate(bArrCopyOf.length + 7).put(b).put(oooO00o.f80293OooO0O0).put(oooO00o.f80294OooO0OO).put(oooO00o.f80295OooO0Oo).put((byte) 0).putShort((short) bArrCopyOf.length).put(bArrCopyOf).array()));
            s = -28672;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iOooO00o = c23921OooO0Oo.OooO00o() >> 8;
            bArr2 = c23921OooO0Oo.f80301OooO00o;
            if (iOooO00o != 97) {
                break;
            }
            byteArrayOutputStream.write(Arrays.copyOfRange(bArr2, 0, bArr2.length - 2));
            c23921OooO0Oo = new C23921OooO0Oo(oooO0o.Ooooo0o(bArr));
        }
        if (c23921OooO0Oo.OooO00o() != s) {
            throw new OooO0O0(c23921OooO0Oo.OooO00o());
        }
        byteArrayOutputStream.write(Arrays.copyOfRange(bArr2, 0, bArr2.length - 2));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!this.f80306OooOoO0 || byteArray.length <= 54) {
            this.f80305OooOoO = 0L;
            return byteArray;
        }
        this.f80305OooOoO = System.currentTimeMillis();
        return byteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f80304OooOo0o.close();
    }
}
