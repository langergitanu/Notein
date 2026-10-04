package com.aspose.slides.internal.p112en;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p255lq.C6221x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.en.fa */
/* JADX INFO: loaded from: classes.dex */
public class C3768fa implements InterfaceC3764c5 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f10283k4;

    /* JADX INFO: renamed from: to */
    private int f10285to;

    /* JADX INFO: renamed from: x1 */
    private int f10286x1 = 0;

    /* JADX INFO: renamed from: kk */
    private int f10284kk = 0;

    /* JADX INFO: renamed from: du */
    private int[] f10282du = {FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095};

    /* JADX INFO: renamed from: k4 */
    private int m15092k4(int i) {
        try {
            int i2 = this.f10286x1 << 8;
            byte[] bArr = this.f10283k4;
            int i3 = this.f10285to;
            int i4 = i3 + 1;
            this.f10285to = i4;
            int i5 = i2 | (bArr[i3] & 255);
            this.f10286x1 = i5;
            int i6 = this.f10284kk;
            int i7 = i6 + 8;
            this.f10284kk = i7;
            if (i7 < i) {
                this.f10285to = i3 + 2;
                this.f10286x1 = (i5 << 8) | (bArr[i4] & 255);
                this.f10284kk = i6 + 16;
            }
            int i8 = this.f10286x1;
            int i9 = this.f10284kk;
            int i10 = (i8 >> (i9 - i)) & this.f10282du[i - 9];
            this.f10284kk = i9 - i;
            return i10;
        } catch (RuntimeException unused) {
            return 257;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m15093k4(int i, int i2) {
        if (i >= 2048 - i2) {
            return 12;
        }
        if (i >= 1024 - i2) {
            return 11;
        }
        return i >= 512 - i2 ? 10 : 9;
    }

    /* JADX INFO: renamed from: k4 */
    private List<byte[]> m15094k4() {
        List<byte[]> list = new List<>(4096);
        for (int i = 0; i < 256; i++) {
            list.addItem(new byte[]{(byte) (i & 255)});
        }
        list.addItem(null);
        list.addItem(null);
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    @Override // com.aspose.slides.internal.p112en.InterfaceC3764c5
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3769h4 mo15090k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, C7187kk c7187kk, int i) {
        C7187kk c7187kk2;
        int iM27790c5;
        int i2;
        int i3;
        C7185jd c7185jdM27799k4 = c7187kk.m27799k4(C7182dy.f19379d4, C7182dy.f19587q3);
        if (C7019kk.m27469x1(c7185jdM27799k4, C7187kk.class)) {
            c7187kk2 = (C7187kk) c7185jdM27799k4;
        } else {
            if (C7019kk.m27469x1(c7185jdM27799k4, C7186k4.class)) {
                C7186k4 c7186k4 = (C7186k4) c7185jdM27799k4;
                if (i < c7186k4.m27778k4()) {
                    c7187kk2 = (C7187kk) c7186k4.m27787x1(i);
                }
            } else if (c7185jdM27799k4 != null) {
                throw new IOException(C14113y2.m67402k4(C14113y2.m67408k4("Error: Expected CosArray or CosDictionary and not ", C14067j2.m66727k4(c7185jdM27799k4).mo48540du()), new Object[0]));
            }
            c7187kk2 = null;
        }
        if (c7187kk2 != null) {
            iM27790c5 = c7187kk2.m27790c5(C7182dy.f19529mh);
            int iM27796k4 = c7187kk2.m27796k4(C7182dy.f19605r7, 1);
            if (iM27796k4 == 0 || iM27796k4 == 1) {
                i2 = iM27790c5;
                i3 = iM27796k4;
            }
            if (i2 <= 1) {
                int iM67507x1 = C14116yg.m67507x1(c7187kk2.m27796k4(C7182dy.f19449he, 1), 32);
                int iM27796k42 = c7187kk2.m27796k4(C7182dy.f19366c6, 8);
                int iM27796k43 = c7187kk2.m27796k4(C7182dy.f19713y2, 1);
                C3152yj c3152yj = new C3152yj();
                m15095k4(abstractC3150x6, c3152yj, i3);
                C3152yj c3152yj2 = new C3152yj(C6221x1.m25205k4(c3152yj));
                C3775up.m15099k4(i2, iM67507x1, iM27796k42, iM27796k43, c3152yj2, abstractC3150x62, 4096);
                abstractC3150x62.flush();
                c3152yj.dispose();
                c3152yj2.dispose();
            } else {
                m15095k4(abstractC3150x6, abstractC3150x62, i3);
            }
            return new C3769h4(c7187kk);
        }
        iM27790c5 = -1;
        i2 = iM27790c5;
        i3 = 1;
        if (i2 <= 1) {
        }
        return new C3769h4(c7187kk);
    }

    /* JADX INFO: renamed from: k4 */
    private void m15095k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i) {
        this.f10285to = 0;
        this.f10286x1 = 0;
        this.f10284kk = 0;
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13447k4.m62556k4(abstractC3150x6, c3152yj);
                this.f10283k4 = c3152yj.toArray();
                c3152yj.dispose();
                List<byte[]> listM15094k4 = null;
                loop0: while (true) {
                    int iM15093k4 = 9;
                    long j = -1;
                    while (true) {
                        long jM15092k4 = m15092k4(iM15093k4);
                        if (jM15092k4 == 257) {
                            break loop0;
                        }
                        if (jM15092k4 == 256) {
                            break;
                        }
                        if (jM15092k4 < listM15094k4.size()) {
                            byte[] bArr = listM15094k4.get_Item((int) jM15092k4);
                            byte b = bArr[0];
                            abstractC3150x62.write(bArr, 0, bArr.length);
                            if (j != -1) {
                                byte[] bArr2 = listM15094k4.get_Item((int) j);
                                byte[] bArr3 = new byte[bArr2.length + 1];
                                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                                bArr3[bArr2.length] = b;
                                listM15094k4.addItem(bArr3);
                            }
                        } else {
                            byte[] bArr4 = listM15094k4.get_Item((int) j);
                            int length = bArr4.length + 1;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                            bArr5[bArr4.length] = bArr4[0];
                            abstractC3150x62.write(bArr5, 0, length);
                            listM15094k4.addItem(bArr5);
                        }
                        iM15093k4 = m15093k4(listM15094k4.size(), i);
                        j = jM15092k4;
                    }
                    listM15094k4 = m15094k4();
                }
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } catch (RuntimeException unused) {
        }
        abstractC3150x62.flush();
    }
}
