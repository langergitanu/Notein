package com.aspose.slides.internal.p050by;

import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6907kk;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p439ug.C11306h4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13604kk;
import com.aspose.slides.internal.p550zi.C13620x6;
import com.aspose.slides.internal.p550zi.C13621xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.by.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1898h4 extends AbstractC1901m9 {

    /* JADX INFO: renamed from: k4 */
    private k4 f6777k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.by.h4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private InterfaceC6907kk f6778k4;

        public k4(InterfaceC6907kk interfaceC6907kk) {
            this.f6778k4 = interfaceC6907kk;
        }

        /* JADX INFO: renamed from: k4 */
        private static int m9828k4(byte[] bArr, int i, byte[] bArr2, int i2) {
            int length = bArr2.length;
            int length2 = bArr.length;
            int i3 = i2;
            while (i3 < length && i < length2) {
                int i4 = i + 1;
                byte b = bArr[i];
                int i5 = 0;
                if (b >= 0 && b <= 127) {
                    while (i5 < b + 1 && i3 < length && i4 < length2) {
                        bArr2[i3] = bArr[i4];
                        i5++;
                        i3++;
                        i4++;
                    }
                    i = i4;
                } else if (b > -1 || b < -127) {
                    i += 2;
                } else {
                    i += 2;
                    byte b2 = bArr[i4];
                    while (i5 < (-b) + 1) {
                        bArr2[i3] = b2;
                        i5++;
                        i3++;
                    }
                }
            }
            return i3 - i2;
        }

        /* JADX INFO: renamed from: k4 */
        public C13621xk m9829k4(byte[] bArr) {
            new C13621xk();
            C13604kk c13604kkClone = this.f6778k4.mo27039h4().Clone();
            if (c13604kkClone.f45170kk != 0) {
                C13621xk c13621xk = new C13621xk();
                c13621xk.f45228k4 = false;
                c13621xk.f45229kk = c13604kkClone.f45171to;
                return c13621xk;
            }
            int iM9828k4 = m9828k4(c13604kkClone.f45169k4, 0, bArr, 0);
            C13621xk c13621xk2 = new C13621xk();
            c13621xk2.f45228k4 = true;
            c13621xk2.f45230x1 = iM9828k4;
            return c13621xk2;
        }
    }

    public C1898h4(C6740x1 c6740x1, int i, int i2, C13620x6 c13620x6) {
        super(c6740x1, i, i2, c13620x6);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9
    /* JADX INFO: renamed from: k4 */
    public C13621xk mo9822k4(byte[] bArr, int i) {
        return this.f6777k4.m9829k4(bArr);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9
    /* JADX INFO: renamed from: kk */
    public /* bridge */ /* synthetic */ void mo9825kk(int i) {
        super.mo9825kk(i);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9
    /* JADX INFO: renamed from: to */
    public /* bridge */ /* synthetic */ void mo9826to(int i) {
        super.mo9826to(i);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9
    /* JADX INFO: renamed from: x1 */
    public /* bridge */ /* synthetic */ void mo9827x1(int i) {
        super.mo9827x1(i);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo9823k4(int i) {
        super.mo9823k4(i);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9, com.aspose.slides.internal.p383rp.AbstractC10039x1
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        super.mo9816k4(c6304x1, c12014ne, interfaceC6908m9);
    }

    @Override // com.aspose.slides.internal.p050by.AbstractC1901m9
    /* JADX INFO: renamed from: k4 */
    public void mo9824k4(C11306h4 c11306h4) {
        this.f6777k4 = new k4(c11306h4);
    }
}
