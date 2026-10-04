package com.aspose.slides.internal.p270m9;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.InterfaceC5774ak;
import com.aspose.slides.internal.p231kk.InterfaceC5789ix;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5800rv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C6333ck extends AbstractC6340k4 implements InterfaceC5800rv {

    /* JADX INFO: renamed from: k4 */
    private C6358yj f18005k4;

    /* JADX INFO: renamed from: x1 */
    private C6350um f18006x1;

    public C6333ck(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 4);
        this.f18005k4 = new C6358yj(c6345ne);
        this.f18006x1 = new C6350um();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5800rv
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC5789ix mo23688h4() {
        return this.f18005k4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5800rv
    /* JADX INFO: renamed from: k4 */
    public final long mo23689k4(String str, long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5800rv
    /* JADX INFO: renamed from: kk */
    public final InterfaceC5774ak mo23691kk() {
        return this.f18006x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6350um m25918m9() {
        return this.f18006x1;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        return C14113y2.m67402k4("@media {0} {{ {1} }}", m25918m9().m26028k4(), mo23688h4());
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5800rv
    /* JADX INFO: renamed from: k4 */
    public final void mo23690k4(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        throw new NotImplementedException();
    }
}
