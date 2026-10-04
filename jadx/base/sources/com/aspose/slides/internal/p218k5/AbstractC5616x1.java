package com.aspose.slides.internal.p218k5;

import OooOO0.OooO0OO;
import com.aspose.slides.C22221Oooo0O0;
import com.aspose.slides.OooO0o;
import com.aspose.slides.internal.p040bg.AbstractC1697k4;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9666k4;
import com.aspose.slides.internal.p349q3.C9676m9;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.k5.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5616x1 extends AbstractC1697k4 {
    public AbstractC5616x1(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1697k4
    /* JADX INFO: renamed from: h4 */
    public void mo9143h4(C9723vw c9723vw, C3585h4 c3585h4) {
        mo12687k4((C9666k4) c9723vw, c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m22997k4(long j, long j2, C9676m9 c9676m9, boolean z) {
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        byte bOooO00o;
        long j3;
        long j4 = j & 4294967295L;
        byte b = (byte) ((j4 >> 24) & 4294967295L);
        long j5 = j2 & 4294967295L;
        byte b2 = (byte) ((j5 >> 24) & 4294967295L);
        byte b3 = (byte) ((j4 >> 16) & 4294967295L);
        byte b4 = (byte) ((j5 >> 16) & 4294967295L);
        byte b5 = (byte) ((j4 >> 8) & 4294967295L);
        byte b6 = (byte) ((j5 >> 8) & 4294967295L);
        byte b7 = (byte) (j & 4294967295L);
        byte b8 = (byte) (j2 & 4294967295L);
        float fM47449to = (c9676m9.m47449to() & 255) / 255.0f;
        if (c9676m9.m47443du() == 0) {
            float f = (b3 & 255) * fM47449to;
            float f2 = b4 & 255;
            float f3 = 1.0f - fM47449to;
            iOooO0O0 = C22221Oooo0O0.OooO0O0(f2, f3, f, 13);
            iOooO0O02 = C22221Oooo0O0.OooO0O0(b6 & 255, f3, (b5 & 255) * fM47449to, 13);
            iOooO0O03 = C22221Oooo0O0.OooO0O0(b8 & 255, f3, (b7 & 255) * fM47449to, 13);
            if (z) {
                bOooO00o = OooO0o.OooO00o(b2 & 255, f3, (b & 255) * fM47449to, 13);
                j3 = ((bOooO00o & 255) << 24) | (iOooO0O0 << 16) | (iOooO0O02 << 8) | iOooO0O03;
            }
            j3 = ((long) (iOooO0O0 << 16)) | 4278190080L | ((long) (iOooO0O02 << 8)) | ((long) iOooO0O03);
        } else {
            float f4 = (b3 & 255) * fM47449to;
            float f5 = b & 255;
            float f6 = 1.0f - (f5 / 255.0f);
            iOooO0O0 = C22221Oooo0O0.OooO0O0(f6, b4 & 255, f4, 13);
            iOooO0O02 = C22221Oooo0O0.OooO0O0(f6, b6 & 255, (b5 & 255) * fM47449to, 13);
            iOooO0O03 = C22221Oooo0O0.OooO0O0(f6, b8 & 255, (b7 & 255) * fM47449to, 13);
            if (z) {
                float fOooO0OO = OooO0OO.OooO0OO(f5, fM47449to, 13);
                bOooO00o = OooO0o.OooO00o(1.0f - (fOooO0OO / 255.0f), b2 & 255, fOooO0OO, 13);
                j3 = ((bOooO00o & 255) << 24) | (iOooO0O0 << 16) | (iOooO0O02 << 8) | iOooO0O03;
            }
            j3 = ((long) (iOooO0O0 << 16)) | 4278190080L | ((long) (iOooO0O02 << 8)) | ((long) iOooO0O03);
        }
        return j3 & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo12687k4(C9666k4 c9666k4, C3585h4 c3585h4);
}
