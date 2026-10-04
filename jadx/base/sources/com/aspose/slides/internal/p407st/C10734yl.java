package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.yl */
/* JADX INFO: loaded from: classes4.dex */
public final class C10734yl {

    /* JADX INFO: renamed from: k4 */
    private long f37542k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC10673uw f37543kk;

    /* JADX INFO: renamed from: x1 */
    private long f37544x1;

    public C10734yl(long j, long j2) {
        this.f37542k4 = j;
        this.f37544x1 = j2;
    }

    /* JADX INFO: renamed from: k4 */
    public long m52077k4() {
        return this.f37542k4;
    }

    /* JADX INFO: renamed from: x1 */
    public long m52079x1() {
        return this.f37544x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m52078k4(InterfaceC10673uw interfaceC10673uw) {
        if (this.f37543kk != null) {
            throw new Exception("m_referencedRecord is assigned already.");
        }
        this.f37543kk = interfaceC10673uw;
    }
}
