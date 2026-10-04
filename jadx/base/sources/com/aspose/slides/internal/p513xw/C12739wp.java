package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p048bv.InterfaceC1866m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.wp */
/* JADX INFO: loaded from: classes5.dex */
public class C12739wp implements InterfaceC1866m9<InterfaceC12711lr> {

    /* JADX INFO: renamed from: k4 */
    protected List<InterfaceC12711lr> f42458k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC12711lr f42459kk;

    /* JADX INFO: renamed from: x1 */
    protected int f42460x1 = 0;

    public C12739wp(InterfaceC12711lr interfaceC12711lr) {
        this.f42459kk = interfaceC12711lr;
        this.f42458k4 = interfaceC12711lr.mo54971bv();
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public final InterfaceC12711lr mo9760kk() {
        if (this.f42460x1 >= this.f42458k4.size()) {
            throw new InvalidOperationException();
        }
        List<InterfaceC12711lr> list = this.f42458k4;
        int i = this.f42460x1;
        this.f42460x1 = i + 1;
        return list.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: dy, reason: merged with bridge method [inline-methods] */
    public final InterfaceC12711lr mo9756du() {
        int i = this.f42460x1;
        if (i <= 0) {
            throw new InvalidOperationException();
        }
        List<InterfaceC12711lr> list = this.f42458k4;
        int i2 = i - 1;
        this.f42460x1 = i2;
        return list.get_Item(i2);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: h4 */
    public final int mo9757h4() {
        return this.f42460x1;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: k4 */
    public final void mo9758k4() {
        int i = this.f42460x1;
        if (i <= 0) {
            throw new InvalidOperationException();
        }
        List<InterfaceC12711lr> list = this.f42458k4;
        int i2 = i - 1;
        this.f42460x1 = i2;
        list.removeAt(i2);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: m9 */
    public final int mo9761m9() {
        return this.f42460x1 - 1;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: to */
    public final boolean mo9762to() {
        return this.f42460x1 > 0;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: x1, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void mo9759k4(InterfaceC12711lr interfaceC12711lr) {
        throw new InvalidOperationException("LMiter doesn't support set");
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void mo9763x1(InterfaceC12711lr interfaceC12711lr) {
        throw new InvalidOperationException("LMiter doesn't support add");
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: x1 */
    public boolean mo9764x1() {
        return this.f42460x1 < this.f42458k4.size() || this.f42459kk.mo54981x1(this.f42460x1);
    }
}
