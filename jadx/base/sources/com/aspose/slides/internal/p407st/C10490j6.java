package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.j6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10490j6 extends AbstractC10716xo {

    /* JADX INFO: renamed from: k4 */
    private final C14047bz f37093k4;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f37094x1;

    public C10490j6(C14047bz c14047bz, byte[] bArr) {
        C14047bz c14047bz2 = new C14047bz();
        this.f37093k4 = c14047bz2;
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        c14047bz.CloneTo(c14047bz2);
        this.f37094x1 = bArr;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public C14047bz mo50989k4() {
        return this.f37093k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: kk */
    public long mo50992kk() {
        return ((((long) this.f37094x1.length) & 4294967295L) + 16) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: to */
    public String mo50993to() {
        return "";
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50990k4(C3134k4 c3134k4) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50991k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(this.f37093k4.m66539k4());
        c3149x1.m13450k4(this.f37094x1);
    }
}
