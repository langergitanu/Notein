package com.aspose.slides.internal.p270m9;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p231kk.InterfaceC5814x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C6336fa extends AbstractC6340k4 implements InterfaceC5814x6 {

    /* JADX INFO: renamed from: k4 */
    private C6342ks f18017k4;

    /* JADX INFO: renamed from: x1 */
    private C6353v4 f18018x1;

    public C6336fa(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 6);
        this.f18017k4 = new C6342ks(this);
        this.f18018x1 = new C6353v4(this);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5814x6
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC5810wl mo23711h4() {
        return this.f18018x1;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5814x6
    /* JADX INFO: renamed from: kk */
    public final String mo23712kk() {
        return this.f18017k4.m25954k4() == 0 ? "@page" : C14113y2.m67402k4("{0} {1}", "@page", m25938m9());
    }

    /* JADX INFO: renamed from: m9 */
    public final C6342ks m25938m9() {
        return this.f18017k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        return C14113y2.m67402k4("{0} {{{1}}}", mo23712kk(), mo23711h4());
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        throw new NotImplementedException();
    }
}
