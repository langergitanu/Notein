package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.DecoderFallbackException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14098up;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.dy */
/* JADX INFO: loaded from: classes4.dex */
public final class C6756dy extends AbstractC6762jd {
    /* JADX INFO: renamed from: kk */
    private void m26743kk(byte[] bArr, int i) {
        C6765kp c6765kp = new C6765kp(bArr.length * 3);
        int i2 = 0;
        while (i2 < bArr.length && i2 < 20) {
            c6765kp.m26780k4('[');
            c6765kp.m26792k4(C14098up.m67321k4(bArr[i2], "X2", C11697x1.m55250kk()));
            c6765kp.m26780k4(']');
            i2++;
        }
        if (i2 == 20) {
            c6765kp.m26792k4(" ...");
        }
        throw new DecoderFallbackException(C6770qm.m26824k4("Unable to translate bytes {0} at index {1} from specified code page to Unicode.", c6765kp, Integer.valueOf(i)), bArr, i);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: k4 */
    public char mo26744k4() {
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: x1 */
    public int mo26746x1() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
    /* JADX INFO: renamed from: k4 */
    public boolean mo26745k4(byte[] bArr, int i) {
        m26743kk(bArr, i);
        return true;
    }
}
