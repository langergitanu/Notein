package com.aspose.slides.internal.p523yd;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yd.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12815x1 extends Exception {

    /* JADX INFO: renamed from: k4 */
    private String f42633k4;

    /* JADX INFO: renamed from: kk */
    private int f42634kk;

    /* JADX INFO: renamed from: to */
    private String f42635to;

    /* JADX INFO: renamed from: x1 */
    private int f42636x1;

    public C12815x1(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        String str = this.f42635to;
        return str != null ? str : super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return m59591k4() ? C14113y2.m67408k4(this.f42633k4, C18241k5.f55433h, C14057f9.m66591x1(this.f42636x1), C18241k5.f55433h, C14057f9.m66591x1(this.f42634kk), ": ", super.getMessage()) : super.getMessage();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59590k4(InterfaceC3757h4 interfaceC3757h4) {
        if (interfaceC3757h4 != null) {
            this.f42633k4 = interfaceC3757h4.mo15071kk();
            this.f42636x1 = interfaceC3757h4.mo15070k4();
            this.f42634kk = interfaceC3757h4.mo15072x1();
        }
    }

    public C12815x1(String str, InterfaceC3757h4 interfaceC3757h4) {
        super(str);
        m59590k4(interfaceC3757h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m59591k4() {
        return this.f42636x1 > 0;
    }
}
