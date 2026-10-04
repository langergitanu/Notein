package com.aspose.slides.internal.p472w8;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p531yq.InterfaceC12886x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C11903ks implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private C12025x6[] f40087k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f40088x1;

    public C11903ks() {
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C12025x6[] c12025x6Arr;
        C11903ks c11903ks = new C11903ks();
        byte[] bArr = this.f40088x1;
        if (bArr != null && (c12025x6Arr = this.f40087k4) != null) {
            if (bArr.length != 0 && c12025x6Arr.length != 0) {
                byte[] bArr2 = new byte[bArr.length];
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, this.f40088x1.length);
                C12025x6[] c12025x6Arr2 = new C12025x6[this.f40087k4.length];
                for (int i = 0; i < this.f40087k4.length; i++) {
                    c12025x6Arr2[i] = new C12025x6(this.f40087k4[i].m56897x1(), this.f40087k4[i].m56895kk());
                }
                c11903ks.m55671k4(c12025x6Arr2);
                c11903ks.m55670k4(bArr2);
                return c11903ks;
            }
            c11903ks.m55671k4(new C12025x6[0]);
            c11903ks.m55670k4(new byte[0]);
        }
        return c11903ks;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55670k4(byte[] bArr) {
        this.f40088x1 = bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m55673x1() {
        return this.f40088x1;
    }

    public C11903ks(InterfaceC12886x1 interfaceC12886x1) {
        Set<Integer> setMo59952du = interfaceC12886x1.mo59952du();
        byte[] bArrCopyOf = new byte[20];
        float[] fArr = new float[6];
        C12025x6[] c12025x6Arr = new C12025x6[20];
        InterfaceC4413v4 interfaceC4413v4Mo8359kk = interfaceC12886x1.mo59973x1().mo8359kk(null);
        int i = 0;
        int i2 = 0;
        while (!interfaceC4413v4Mo8359kk.mo17821x1()) {
            byte bMo17818k4 = (byte) interfaceC4413v4Mo8359kk.mo17818k4(fArr);
            if (i + 3 >= bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (length > 500 ? 500 : length));
            }
            if (i2 + 6 >= c12025x6Arr.length) {
                int length2 = c12025x6Arr.length;
                c12025x6Arr = (C12025x6[]) Arrays.copyOf(c12025x6Arr, c12025x6Arr.length + (length2 <= 500 ? length2 : 500));
            }
            if (bMo17818k4 == 0 || bMo17818k4 == 1) {
                int i3 = i + 1;
                bArrCopyOf[i] = bMo17818k4;
                int i4 = i2 + 1;
                c12025x6Arr[i2] = new C12025x6(fArr[0], fArr[1]);
                i2 = i4;
                i = i3;
                interfaceC4413v4Mo8359kk.mo17820kk();
            } else {
                if (bMo17818k4 == 2) {
                    int i5 = i + 1;
                    bArrCopyOf[i] = bMo17818k4;
                    i += 2;
                    bArrCopyOf[i5] = bMo17818k4;
                    int i6 = i2 + 1;
                    c12025x6Arr[i2] = new C12025x6(fArr[0], fArr[1]);
                    i2 += 2;
                    c12025x6Arr[i6] = new C12025x6(fArr[2], fArr[3]);
                } else if (bMo17818k4 == 3) {
                    bArrCopyOf[i] = bMo17818k4;
                    int i7 = i + 2;
                    bArrCopyOf[i + 1] = bMo17818k4;
                    i += 3;
                    bArrCopyOf[i7] = bMo17818k4;
                    c12025x6Arr[i2] = new C12025x6(fArr[0], fArr[1]);
                    int i8 = i2 + 2;
                    c12025x6Arr[i2 + 1] = new C12025x6(fArr[2], fArr[3]);
                    i2 += 3;
                    c12025x6Arr[i8] = new C12025x6(fArr[4], fArr[5]);
                } else if (bMo17818k4 == 4) {
                    int i9 = i - 1;
                    bArrCopyOf[i9] = (byte) (bArrCopyOf[i9] | UnsignedBytes.MAX_POWER_OF_TWO);
                }
                interfaceC4413v4Mo8359kk.mo17820kk();
            }
        }
        Iterator<Integer> it = setMo59952du.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            bArrCopyOf[iIntValue] = (byte) (bArrCopyOf[iIntValue] | 32);
        }
        m55670k4(Arrays.copyOf(bArrCopyOf, i));
        m55671k4((C12025x6[]) Arrays.copyOf(c12025x6Arr, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public void m55671k4(C12025x6[] c12025x6Arr) {
        this.f40087k4 = c12025x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6[] m55672k4() {
        return this.f40087k4;
    }
}
