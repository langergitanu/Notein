package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.v4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12273v4 {

    /* JADX INFO: renamed from: k4 */
    private long[] f41046k4 = {305419896, 591751049, 878082192};

    /* JADX INFO: renamed from: x1 */
    private C12263m9 f41047x1 = new C12263m9();

    private C12273v4() {
    }

    /* JADX INFO: renamed from: k4 */
    private byte m57412k4() {
        int i = ((((int) (this.f41046k4[2] & C18177fb.f54859s)) & 65535) | 2) & 65535;
        return (byte) ((i * (i ^ 1)) >> 8);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57417x1(String str) {
        byte[] bArrM57407kk = C12272uz.m57407kk(str);
        for (int i = 0; i < str.length(); i++) {
            m57415k4(bArrM57407kk[i]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12273v4 m57413k4(String str) {
        C12273v4 c12273v4 = new C12273v4();
        if (str == null) {
            throw new C12267to("This entry requires a password.");
        }
        c12273v4.m57417x1(str);
        return c12273v4;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m57418x1(byte[] bArr, int i) {
        if (bArr == null) {
            throw new C12247b3("Cannot encrypt.", new ArgumentException("Bad length during Encryption: the plainText must be non-null.", "plaintext"));
        }
        if (i > bArr.length) {
            throw new C12247b3("Cannot encrypt.", new ArgumentException("Bad length during Encryption: The length parameter must be smaller than or equal to the size of the destination array.", "length"));
        }
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            bArr2[i2] = (byte) ((b & 255) ^ (m57412k4() & 255));
            m57415k4(b);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12273v4 m57414k4(String str, C12262lr c12262lr) {
        AbstractC3150x6 abstractC3150x6 = c12262lr.f40972qq;
        byte[] bArr = new byte[12];
        c12262lr.f40991wl = bArr;
        C12273v4 c12273v4 = new C12273v4();
        if (str == null) {
            throw new C12267to("This entry requires a password.");
        }
        c12273v4.m57417x1(str);
        C12262lr.m57290k4(abstractC3150x6, bArr);
        byte b = c12273v4.m57416k4(bArr, bArr.length)[11];
        if ((b & 255) != (((byte) ((c12262lr.f40954fa >> 24) & 255)) & 255)) {
            if ((c12262lr.f40949du & 8) != 8) {
                throw new C12267to("The password did not match.");
            }
            if ((b & 255) != (((byte) ((c12262lr.f40947ck >> 8) & 255)) & 255)) {
                throw new C12267to("The password did not match.");
            }
        }
        return c12273v4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m57415k4(byte b) {
        long[] jArr = this.f41046k4;
        jArr[0] = ((long) this.f41047x1.m57373k4((int) jArr[0], b)) & 4294967295L;
        long[] jArr2 = this.f41046k4;
        long j = (jArr2[1] & 4294967295L) + ((long) (((byte) jArr2[0]) & 255));
        jArr2[1] = j & 4294967295L;
        jArr2[1] = ((((j & 4294967295L) * 134775813) & 4294967295L) + 1) & 4294967295L;
        jArr2[2] = ((long) this.f41047x1.m57373k4((int) jArr2[2], (byte) (((r1 & 4294967295L) >> 24) & 4294967295L))) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m57416k4(byte[] bArr, int i) {
        if (bArr == null) {
            throw new C12247b3("Cannot decrypt.", new ArgumentException("Bad length during Decryption: cipherText must be non-null.", "cipherText"));
        }
        if (i > bArr.length) {
            throw new C12247b3("Cannot decrypt.", new ArgumentException("Bad length during Decryption: the length parameter must be smaller than or equal to the size of the destination array.", "length"));
        }
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            byte bM57412k4 = (byte) ((bArr[i2] & 255) ^ (m57412k4() & 255));
            m57415k4(bM57412k4);
            bArr2[i2] = bM57412k4;
        }
        return bArr2;
    }
}
