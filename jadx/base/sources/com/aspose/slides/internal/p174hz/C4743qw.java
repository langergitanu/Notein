package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.google.firebase.messaging.Constants;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.qw */
/* JADX INFO: loaded from: classes.dex */
public final class C4743qw extends AbstractC4720he {

    /* JADX INFO: renamed from: k4 */
    private Random f13247k4 = new SecureRandom();

    public C4743qw() {
        m19715x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m19715x1() {
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4720he
    /* JADX INFO: renamed from: k4 */
    public void mo19624k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        this.f13247k4.nextBytes(bArr);
        m19715x1();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4720he
    /* JADX INFO: renamed from: x1 */
    public void mo19625x1(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (i < bArr.length) {
            this.f13247k4.nextBytes(bArr2);
            m19715x1();
            for (int i2 = 0; i2 < length && i != bArr.length; i2++) {
                byte b = bArr2[i2];
                if (b != 0) {
                    bArr[i] = b;
                    i++;
                }
            }
        }
    }
}
