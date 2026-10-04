package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.bz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4703bz extends AbstractC4705c6 {

    /* JADX INFO: renamed from: du */
    protected byte[] f13124du;

    /* JADX INFO: renamed from: du */
    private void m19574du() {
        byte[] bArr = this.f13124du;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public byte[] mo19575h4() {
        return (byte[]) this.f13124du.clone();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: k4 */
    public void mo19576k4(boolean z) {
        m19574du();
        super.mo19576k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo19577k4(byte[] bArr) {
        if (this.f13127to != 0) {
            throw new CryptographicException(C12825ix.m59623k4("Key can't be changed at this state."));
        }
        m19574du();
        this.f13124du = (byte[]) bArr.clone();
    }
}
