package com.aspose.slides.internal.p270m9;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.InterfaceC5781ck;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6341kk extends AbstractC6340k4 implements InterfaceC5781ck {

    /* JADX INFO: renamed from: k4 */
    private String f18029k4;

    public C6341kk(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 2);
        this.f18029k4 = C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5781ck
    /* JADX INFO: renamed from: k4 */
    public final void mo23396k4(String str) {
        this.f18029k4 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5781ck
    /* JADX INFO: renamed from: kk */
    public final String mo23397kk() {
        return this.f18029k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        return C14113y2.m67402k4("@charset \"{0}\";", this.f18029k4);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        throw new NotImplementedException();
    }
}
