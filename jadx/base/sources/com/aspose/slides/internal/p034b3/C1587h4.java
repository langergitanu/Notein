package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p513xw.C12737w6;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1587h4 {

    /* JADX INFO: renamed from: k4 */
    protected C1603v4 f6156k4;

    /* JADX INFO: renamed from: kk */
    private int f6157kk = 0;

    /* JADX INFO: renamed from: x1 */
    private List<C1603v4> f6158x1;

    public C1587h4() {
        this.f6158x1 = null;
        this.f6158x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8572k4(int i) {
        return this.f6158x1.get_Item(i - 1).m8642k4();
    }

    /* JADX INFO: renamed from: kk */
    public final int m8574kk() {
        return this.f6158x1.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final C1603v4 m8575x1() {
        return this.f6156k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12737w6 m8573k4(int i, int i2) {
        return this.f6158x1.get_Item(i - 1).m8643k4(i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8485k4() {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8486k4(InterfaceC1588ix interfaceC1588ix) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8487k4(C1603v4 c1603v4) {
        if (c1603v4 == null) {
            throw new NullReferenceException("pageSequence must not be null");
        }
        C1603v4 c1603v42 = this.f6156k4;
        if (c1603v42 != null) {
            this.f6157kk = c1603v42.m8642k4() + this.f6157kk;
        }
        this.f6156k4 = c1603v4;
        this.f6158x1.addItem(c1603v4);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8488k4(C11697x1 c11697x1) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8489k4(C12737w6 c12737w6) {
        this.f6156k4.m8645k4(c12737w6);
        c12737w6.m59343k4((this.f6156k4.m8642k4() + this.f6157kk) - 1);
        c12737w6.m59346k4(this.f6156k4);
    }
}
