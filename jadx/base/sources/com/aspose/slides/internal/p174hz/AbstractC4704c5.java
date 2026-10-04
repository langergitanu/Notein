package com.aspose.slides.internal.p174hz;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.c5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4704c5 {
    /* JADX INFO: renamed from: k4 */
    public abstract void mo19578k4(AbstractC4709du abstractC4709du);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo19579k4(String str);

    /* JADX INFO: renamed from: k4 */
    public byte[] m19580k4(AbstractC4705c6 abstractC4705c6) {
        if (abstractC4705c6 == null) {
            throw new ArgumentNullException("hash");
        }
        mo19579k4(abstractC4705c6.toString());
        return mo19581k4(abstractC4705c6.m19584fa());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract byte[] mo19581k4(byte[] bArr);

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }
}
