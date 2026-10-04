package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.aspose.slides.internal.p515xz.C12755kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4099m9 {

    /* JADX INFO: renamed from: k4 */
    private final C3152yj f11224k4 = new C3152yj();

    /* JADX INFO: renamed from: k4 */
    public C3152yj m16364k4() {
        return this.f11224k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16363k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        abstractC3150x6.seek(0L, 0);
        long jM23130x1 = C5666m9.m23130x1((int) abstractC3150x6.getLength(), 65515);
        for (int i = 1; i <= jM23130x1; i++) {
            abstractC3150x62.writeByte((byte) -1);
            abstractC3150x62.writeByte((byte) -30);
            C3152yj c3152yj = new C3152yj();
            try {
                byte[] bArr = new byte[65515];
                int i2 = abstractC3150x6.read(bArr, 0, 65515);
                c3152yj.write(new byte[]{73, 67, 67, 95, 80, 82, 79, 70, 73, 76, 69, 0}, 0, 12);
                c3152yj.writeByte((byte) i);
                c3152yj.writeByte((byte) jM23130x1);
                c3152yj.write(bArr, 0, i2);
                int length = ((int) c3152yj.getLength()) + 2;
                abstractC3150x62.writeByte((byte) ((length >> 8) & 255));
                abstractC3150x62.writeByte((byte) (length & 255));
                abstractC3150x62.write(c3152yj.toArray(), 0, (int) c3152yj.getLength());
                c3152yj.dispose();
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m16365k4(C4094ix c4094ix) {
        int[] iArr = {0};
        c4094ix.m16302k4(iArr);
        int i = iArr[0] - 2;
        byte[] bArr = new byte[12];
        C3152yj c3152yj = new C3152yj();
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = new byte[i];
            if (!c4094ix.m16304kk()) {
                throw new C12754k4("Cannot parse file.", (Exception) new C12755kk("Not enough data in stream."));
            }
            int iM16300k4 = c4094ix.m16300k4(bArr2, i2);
            c3152yj.write(bArr2, 0, iM16300k4);
            i2 -= iM16300k4;
        }
        c3152yj.seek(0L, 0);
        c3152yj.read(bArr, 0, 12);
        if (AbstractC6747ar.m26650yj().mo26682x1(bArr, 0, 12).startsWith("ICC_PROFILE")) {
            c3152yj.readByte();
            c3152yj.readByte();
            this.f11224k4.write(c3152yj.getBuffer(), (int) c3152yj.getPosition(), (int) (c3152yj.getLength() - c3152yj.getPosition()));
        }
    }
}
