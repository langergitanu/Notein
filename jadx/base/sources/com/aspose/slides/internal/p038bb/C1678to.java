package com.aspose.slides.internal.p038bb;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p135fp.AbstractC4092fa;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p313oa.C6986dy;
import com.aspose.slides.internal.p313oa.C7004up;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.internal.p550zi.C13623yj;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.bb.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1678to extends AbstractC4092fa {

    /* JADX INFO: renamed from: kk */
    private final C6986dy f6384kk;

    public C1678to(InterfaceC6899c5 interfaceC6899c5, AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        this.f11178k4 = interfaceC6899c5;
        this.f11179x1 = C13609qq.m62781dy();
        C6986dy c6986dy = new C6986dy();
        this.f6384kk = c6986dy;
        try {
            c6986dy.m27336k4(abstractC3150x6);
        } catch (C7004up unused) {
            this.f6384kk.m27336k4(C13623yj.m62876x1().m14472k4());
        }
        try {
            this.f6384kk.m27336k4(abstractC3150x62);
        } catch (C7004up unused2) {
            this.f6384kk.m27336k4(C13623yj.m62875k4().m14472k4());
        }
    }

    @Override // com.aspose.slides.internal.p135fp.AbstractC4092fa
    /* JADX INFO: renamed from: k4 */
    public void mo9080k4(int[] iArr, byte[] bArr) {
        char c = 2;
        int i = 3;
        char c2 = 1;
        char c3 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            int i4 = iArr[i2];
            byte b = (byte) ((i4 >> 8) & 255);
            double d = ((double) (((byte) ((i4 >> 16) & 255)) & 255)) / 255.0d;
            double d2 = ((double) (((byte) (i4 & 255)) & 255)) / 255.0d;
            double[] dArr = new double[i];
            dArr[c3] = d;
            dArr[c2] = ((double) (b & 255)) / 255.0d;
            dArr[c] = d2;
            double[] dArr2 = new double[4];
            this.f6384kk.mo27338k4(dArr, dArr2);
            double d3 = dArr2[i] * 255.0d;
            char c4 = c;
            int i5 = i;
            char c5 = c2;
            double dM67491kk = 255 - ((int) C14116yg.m67491kk(255.0d, C14116yg.m67502x1(0.0d, dArr2[c3] * 255.0d)));
            double dM67491kk2 = 255 - ((int) C14116yg.m67491kk(255.0d, C14116yg.m67502x1(0.0d, dArr2[c5] * 255.0d)));
            double dM67491kk3 = 255 - ((int) C14116yg.m67491kk(255.0d, C14116yg.m67502x1(0.0d, dArr2[c4] * 255.0d)));
            bArr[i3] = (byte) (255.0d - C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, (0.114d * dM67491kk3) + ((0.587d * dM67491kk2) + (0.299d * dM67491kk)))));
            bArr[i3 + 1] = (byte) (255.0d - C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, (dM67491kk3 * 0.5d) + ((128.0d - (0.16874d * dM67491kk)) - (0.33126d * dM67491kk2)))));
            bArr[i3 + 2] = (byte) (255.0d - C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, (((dM67491kk * 0.5d) + 128.0d) - (dM67491kk2 * 0.41869d)) - (dM67491kk3 * 0.08131d))));
            bArr[i3 + 3] = (byte) C14116yg.m67502x1(C14116yg.m67491kk(255.0d - d3, 255.0d), 0.0d);
            i3 += 4;
            i2++;
            i = i5;
            c2 = c5;
            c = c4;
            c3 = 0;
        }
    }
}
