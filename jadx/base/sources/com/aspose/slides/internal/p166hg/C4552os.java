package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.os */
/* JADX INFO: loaded from: classes.dex */
class C4552os implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private static final int f12713k4 = 180;

    /* JADX INFO: renamed from: du */
    private byte[] f12714du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f12715h4;

    /* JADX INFO: renamed from: kk */
    private C14084qq f12716kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private String f12717to;

    /* JADX INFO: renamed from: x1 */
    private boolean f12718x1;

    public C4552os(String str, byte[] bArr) {
        this.f12717to = str;
        this.f12714du = bArr;
        m18827to();
    }

    /* JADX INFO: renamed from: du */
    private void m18822du() {
        if (this.f12718x1) {
            throw new ObjectDisposedException("Cache session information were disposed.");
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m18823k4(true);
        C14094ts.m67303k4(this);
    }

    public void finalize() throws Throwable {
        m18823k4(false);
        super.finalize();
    }

    /* JADX INFO: renamed from: k4 */
    public String m18824k4() {
        return this.f12717to;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m18826kk() {
        return this.f12715h4 != null && C14084qq.m67094k4(this.f12716kk, C14084qq.m67074c5());
    }

    /* JADX INFO: renamed from: to */
    public void m18827to() {
        m18822du();
        C14084qq.m67074c5().m67128du(f12713k4).CloneTo(this.f12716kk);
    }

    /* JADX INFO: renamed from: x1 */
    public void m18828x1(AbstractC4523ai abstractC4523ai) {
        m18822du();
        byte[] bArr = this.f12715h4;
        if (bArr != null) {
            abstractC4523ai.m18642h4((byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArr).deepClone(), byte[].class));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m18825k4(AbstractC4523ai abstractC4523ai) {
        m18822du();
        if (abstractC4523ai.m18672um() != null) {
            this.f12715h4 = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) abstractC4523ai.m18672um()).deepClone(), byte[].class);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m18829x1() {
        return this.f12714du;
    }

    /* JADX INFO: renamed from: k4 */
    private void m18823k4(boolean z) {
        if (!this.f12718x1) {
            C14084qq.f47299x1.CloneTo(this.f12716kk);
            this.f12717to = null;
            this.f12714du = null;
            byte[] bArr = this.f12715h4;
            if (bArr != null) {
                AbstractC14092to.m67225k4(bArr, 0, bArr.length);
                this.f12715h4 = null;
            }
        }
        this.f12718x1 = true;
    }
}
