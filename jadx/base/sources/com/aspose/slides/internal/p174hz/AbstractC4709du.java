package com.aspose.slides.internal.p174hz;

import OooOoo.C20593OooO0Oo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4709du implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    protected int f13133k4;

    /* JADX INFO: renamed from: x1 */
    protected C4711e0[] f13134x1;

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo19593k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public int mo19591k4() {
        return this.f13133k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo19593k4(boolean z);

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    /* JADX INFO: renamed from: x1 */
    public void m19594x1() {
        mo19593k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m19592k4(int i) {
        if (!C4711e0.m19598k4(this.f13134x1, i)) {
            throw new CryptographicException(C12825ix.m59623k4("Key size not supported by algorithm."));
        }
        this.f13133k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m19590k4(String str, String str2) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("<", str2, ">");
        int iIndexOf = str.indexOf(strOooO0O0);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf("</" + str2 + ">");
        if (iIndexOf2 == -1 || iIndexOf2 <= iIndexOf) {
            return null;
        }
        int length = strOooO0O0.length() + iIndexOf;
        return C14080ne.m66934jd(str.substring(length, (iIndexOf2 - length) + length));
    }
}
