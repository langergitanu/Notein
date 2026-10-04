package com.aspose.slides.internal.p048bv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.internal.bv.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1869to<T> implements InterfaceC1866m9<T>, InterfaceC1870up<T> {

    /* JADX INFO: renamed from: k4 */
    private List<T> f6744k4;

    /* JADX INFO: renamed from: kk */
    private int f6745kk;

    /* JADX INFO: renamed from: x1 */
    private int f6746x1;

    public C1869to(List<T> list) {
        this.f6746x1 = 0;
        this.f6745kk = -1;
        this.f6744k4 = list;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: du */
    public final T mo9756du() {
        int i = this.f6746x1;
        if (i <= 0) {
            throw new InvalidOperationException();
        }
        this.f6745kk = i - 1;
        List<T> list = this.f6744k4;
        int i2 = i - 1;
        this.f6746x1 = i2;
        return list.get_Item(i2);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: h4 */
    public final int mo9757h4() {
        return this.f6746x1;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: k4 */
    public final void mo9758k4() {
        if (this.f6746x1 <= 0) {
            throw new InvalidOperationException();
        }
        this.f6744k4.removeAt(this.f6745kk);
        this.f6745kk = -1;
        this.f6746x1--;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: kk */
    public final T mo9760kk() {
        if (this.f6746x1 >= this.f6744k4.size()) {
            throw new InvalidOperationException();
        }
        int i = this.f6746x1;
        this.f6745kk = i;
        List<T> list = this.f6744k4;
        this.f6746x1 = i + 1;
        return list.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: m9 */
    public final int mo9761m9() {
        return this.f6746x1 - 1;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: to */
    public final boolean mo9762to() {
        return this.f6746x1 > 0;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: x1 */
    public final void mo9763x1(T t) {
        List<T> list = this.f6744k4;
        int i = this.f6746x1;
        this.f6746x1 = i + 1;
        list.insertItem(i, t);
    }

    public C1869to(List<T> list, int i) {
        this.f6745kk = -1;
        this.f6744k4 = list;
        this.f6746x1 = i;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
    /* JADX INFO: renamed from: k4 */
    public final void mo9759k4(T t) {
        this.f6744k4.set_Item(this.f6746x1 - 1, t);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: x1 */
    public final boolean mo9764x1() {
        List<T> list = this.f6744k4;
        return list != null && this.f6746x1 < list.size();
    }
}
