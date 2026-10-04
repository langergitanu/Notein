package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12705jd extends AbstractC12725sv {

    /* JADX INFO: renamed from: k4 */
    private boolean f42270k4;

    public C12705jd() {
        this.f42270k4 = false;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: dy */
    public boolean mo58835dy() {
        return false;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: k4 */
    public boolean mo58836k4(AbstractC12725sv abstractC12725sv) {
        return (abstractC12725sv.mo58835dy() || this.f42270k4) ? false : true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: m9 */
    public AbstractC12725sv mo55023m9() {
        this.f42270k4 = true;
        return this;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: x1 */
    public boolean mo58838x1(AbstractC12725sv abstractC12725sv) {
        return false;
    }

    public C12705jd(List<InterfaceC1861h4> list) {
        super(list);
        this.f42270k4 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[LOOP:0: B:12:0x0025->B:14:0x002b, LOOP_END] */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo58837k4(AbstractC12725sv abstractC12725sv, boolean z, C12722rv c12722rv) {
        Iterator<InterfaceC1861h4> it;
        if (!mo58836k4(abstractC12725sv)) {
            return false;
        }
        if (!z) {
            if (!m59197jd().mo58932x_()) {
                c12722rv.m59129k4(0);
            }
            it = abstractC12725sv.iterator();
            while (it.hasNext()) {
                addItem(it.next());
            }
            return true;
        }
        c12722rv.m59129k4(1000);
        addItem(c12722rv);
        it = abstractC12725sv.iterator();
        while (it.hasNext()) {
        }
        return true;
    }
}
