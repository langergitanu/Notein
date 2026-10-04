package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p174hz.C4775yj;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p456v5.C11607k4;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.aspose.slides.vn */
/* JADX INFO: loaded from: classes3.dex */
class C14694vn {

    /* JADX INFO: renamed from: du */
    private byte[] f49616du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f49617h4;

    /* JADX INFO: renamed from: k4 */
    private byte[] f49618k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f49619kk;

    /* JADX INFO: renamed from: to */
    private byte[] f49620to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f49621x1;

    public C14694vn(AbstractC13901ga abstractC13901ga, byte[] bArr) {
        this.f49618k4 = new byte[20];
        this.f49621x1 = new byte[]{-13, 37, 115, -73, -5, -80, 94, 112, -52, PatternStyle.Sphere, -38, 72, -22, -74, 124, -98};
        this.f49619kk = new byte[]{-122, -39, -127, 105, -11, -77, -126, PatternStyle.Cross, 86, -80, 21, -69, PatternStyle.Cross, -7, -33, -53};
        this.f49620to = new byte[]{26, -109, 86, 19, 26, 94, -86, -48, -38, 36, -71, -78, 23, -81, -73, -51};
        this.f49616du = new byte[]{-50, -111, 10, 82, 17, -44, -1, 18, 74, -12, 35, PatternStyle.DottedGrid, -37, 29, -58, -5, -72, -122, 111, -93, -88, -65, 39, 29, -55, -26, 33, -45, 120, -50, 24, -15};
        this.f49617h4 = new byte[]{-57, -104, -55, -34, -51, -97, -53, -72, 39, 88, 114, Ascii.DEL, -18, -8, -26, -25};
        this.f49621x1 = C14080ne.m66934jd(abstractC13901ga.get_Item("keyData").getAttributes().m65165k4("saltValue").getValue());
        C13981tl c13981tl = abstractC13901ga.get_Item("keyEncryptors").get_Item("keyEncryptor").get_Item("p:encryptedKey");
        this.f49619kk = C14080ne.m66934jd(c13981tl.getAttributes().m65165k4("saltValue").getValue());
        this.f49620to = C14080ne.m66934jd(c13981tl.getAttributes().m65165k4("encryptedVerifierHashInput").getValue());
        this.f49616du = C14080ne.m66934jd(c13981tl.getAttributes().m65165k4("encryptedVerifierHashValue").getValue());
        this.f49617h4 = C14080ne.m66934jd(c13981tl.getAttributes().m65165k4("encryptedKeyValue").getValue());
        byte[] bArr2 = this.f49619kk;
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, this.f49619kk.length, bArr.length);
        C4772y9 c4772y9 = new C4772y9();
        try {
            this.f49618k4 = c4772y9.m19588x1(bArr3);
            for (int i = 0; i < 100000; i++) {
                System.arraycopy(C14069jd.m66785x1(i), 0, bArr4, 0, 4);
                System.arraycopy(this.f49618k4, 0, bArr4, 4, 20);
                this.f49618k4 = c4772y9.m19588x1(bArr4);
            }
        } finally {
            c4772y9.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m72369x1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = {-41, -86, 15, 109, PatternStyle.Wave, 97, PatternStyle.DownwardDiagonal, 78};
        byte[] bArr5 = new byte[bArr.length + 8];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length, 8);
        byte[] bArr6 = new byte[16];
        C4772y9 c4772y9 = new C4772y9();
        try {
            System.arraycopy(c4772y9.m19588x1(bArr5), 0, bArr6, 0, 16);
            c4772y9.dispose();
            byte[] bArr7 = new byte[32];
            byte[] bArr8 = new byte[32];
            System.arraycopy(bArr3, 0, bArr7, 0, bArr3.length);
            C11607k4 c11607k4 = new C11607k4();
            try {
                c11607k4.mo19609k4(128);
                c11607k4.m19687kk(1);
                c11607k4.m19691to(3);
                c11607k4.mo19692to(bArr2);
                c11607k4.mo19688kk(bArr6);
                C4775yj c4775yj = new C4775yj(new C3152yj(bArr8), c11607k4.m19689ks(), 1);
                c4775yj.write(bArr7, 0, 32);
                c4775yj.close();
                return bArr8;
            } finally {
                c11607k4.dispose();
            }
        } catch (Throwable th) {
            c4772y9.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m72370k4(C3152yj c3152yj) {
        C3152yj c3152yj2 = c3152yj;
        byte[] bArr = new byte[28];
        int i = 0;
        System.arraycopy(this.f49618k4, 0, bArr, 0, 20);
        System.arraycopy(new byte[]{20, 110, 11, -25, -85, -84, -48, -42}, 0, bArr, 20, 8);
        C4772y9 c4772y9 = new C4772y9();
        try {
            int i2 = 16;
            byte[] bArr2 = new byte[16];
            System.arraycopy(c4772y9.m19588x1(bArr), 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[16];
            C11607k4 c11607k4 = new C11607k4();
            try {
                c11607k4.mo19609k4(128);
                c11607k4.m19687kk(1);
                c11607k4.m19691to(3);
                c11607k4.mo19692to(this.f49619kk);
                c11607k4.mo19688kk(bArr2);
                C4775yj c4775yj = new C4775yj(new C3152yj(this.f49617h4), c11607k4.m19696yj(), 0);
                c4775yj.read(bArr3, 0, 16);
                c4775yj.close();
                long length = c3152yj2.getLength();
                C3152yj c3152yj3 = new C3152yj((int) c3152yj2.getLength());
                byte[] bArr4 = new byte[4096];
                byte[] bArr5 = new byte[4096];
                c3152yj2.setPosition(8L);
                byte[] bArr6 = new byte[20];
                byte[] bArr7 = new byte[16];
                byte[] bArr8 = bArr4;
                long j = 0;
                while (j < length - 8) {
                    try {
                        System.arraycopy(this.f49621x1, i, bArr6, i, i2);
                        System.arraycopy(C14069jd.m66786x1(j / 4096), i, bArr6, i2, 4);
                        System.arraycopy(c4772y9.m19588x1(bArr6), i, bArr7, i, i2);
                        c11607k4.mo19692to(bArr7);
                        c11607k4.mo19688kk(bArr3);
                        InterfaceC4752ts interfaceC4752tsM19696yj = c11607k4.m19696yj();
                        byte[] bArr9 = bArr8;
                        int i3 = c3152yj2.read(bArr9, i, 4096);
                        C4775yj c4775yj2 = new C4775yj(new C3152yj(bArr9), interfaceC4752tsM19696yj, i);
                        c4775yj2.read(bArr5, i, i3);
                        c3152yj3.write(bArr5, i, i3);
                        c4775yj2.close();
                        j += (long) i3;
                        c3152yj2 = c3152yj;
                        bArr6 = bArr6;
                        bArr8 = bArr9;
                        i = 0;
                        i2 = 16;
                    } catch (RuntimeException e) {
                        throw new OOXMLCorruptFileException("Unkown file content!", e);
                    }
                }
                c3152yj3.setPosition(0L);
                return c3152yj3;
            } finally {
                c11607k4.dispose();
            }
        } finally {
            c4772y9.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72371k4() {
        byte[] bArrM72369x1 = m72369x1(this.f49618k4, this.f49619kk, m72368k4(this.f49618k4, this.f49619kk, this.f49620to));
        for (int i = 0; i < bArrM72369x1.length; i++) {
            if ((bArrM72369x1[i] & 255) != (this.f49616du[i] & 255)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m72368k4(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length + 8];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(new byte[]{-2, -89, -46, 118, 59, 75, -98, 121}, 0, bArr4, bArr.length, 8);
        byte[] bArr5 = new byte[16];
        C4772y9 c4772y9 = new C4772y9();
        try {
            System.arraycopy(c4772y9.m19588x1(bArr4), 0, bArr5, 0, 16);
            byte[] bArr6 = new byte[bArr3.length];
            C11607k4 c11607k4 = new C11607k4();
            try {
                c11607k4.mo19609k4(128);
                c11607k4.m19687kk(1);
                c11607k4.m19691to(3);
                c11607k4.mo19692to(bArr2);
                c11607k4.mo19688kk(bArr5);
                C4775yj c4775yj = new C4775yj(new C3152yj(bArr3), c11607k4.m19696yj(), 0);
                c4775yj.read(bArr6, 0, bArr3.length);
                c4775yj.close();
                c11607k4.dispose();
                return c4772y9.m19588x1(bArr6);
            } catch (Throwable th) {
                c11607k4.dispose();
                throw th;
            }
        } finally {
            c4772y9.dispose();
        }
    }
}
