package com.aspose.slides.internal.p270m9;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p160h4.InterfaceC4490k4;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6332c5 extends AbstractC6340k4 implements InterfaceC4490k4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC6355x1 f18004k4;

    public C6332c5(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 5);
        this.f18004k4 = new C6353v4(this);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5817yj
    /* JADX INFO: renamed from: kk */
    public final InterfaceC5810wl mo23713kk() {
        return this.f18004k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        return C14113y2.m67402k4("@font-face {{ {0} }}", this.f18004k4.mo23670tw());
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        throw new NotImplementedException();
    }
}
