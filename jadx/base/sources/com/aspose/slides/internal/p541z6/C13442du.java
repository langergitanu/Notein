package com.aspose.slides.internal.p541z6;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.du */
/* JADX INFO: loaded from: classes5.dex */
public class C13442du implements InterfaceC13446jd {

    /* JADX INFO: renamed from: k4 */
    private final String f45015k4;

    /* JADX INFO: renamed from: kk */
    private final String f45016kk;

    /* JADX INFO: renamed from: x1 */
    private final String f45017x1;

    public C13442du() {
        String strM66538k4 = C14047bz.m66536x1().m66538k4("N");
        this.f45016kk = strM66538k4;
        this.f45015k4 = C3141rv.m13402k4();
        this.f45017x1 = C3141rv.m13412x1(mo62547x1(), m62544k4(strM66538k4));
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13446jd
    /* JADX INFO: renamed from: k4 */
    public final String mo62545k4() {
        return this.f45017x1;
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13446jd
    /* JADX INFO: renamed from: kk */
    public final String mo62546kk() {
        return "slides_";
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13446jd
    /* JADX INFO: renamed from: x1 */
    public final String mo62547x1() {
        return this.f45015k4;
    }

    public C13442du(String str) {
        String strM66538k4 = C14047bz.m66536x1().m66538k4("N");
        this.f45016kk = strM66538k4;
        if (str == null) {
            throw new ArgumentNullException("rootPath");
        }
        if (!C3142to.m13421kk(str)) {
            throw new ArgumentException(C14113y2.m67402k4("Directory \"{0}\" does not exist", str), "rootPath");
        }
        this.f45015k4 = str;
        this.f45017x1 = C3141rv.m13412x1(mo62547x1(), m62544k4(strM66538k4));
    }

    /* JADX INFO: renamed from: k4 */
    private String m62544k4(String str) {
        return C14113y2.m67402k4(C14113y2.m67408k4("slides_", "{0}"), str);
    }
}
