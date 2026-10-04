package com.aspose.slides.internal.p205ji;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.ne */
/* JADX INFO: loaded from: classes.dex */
final class C5462ne extends AbstractC5466u4 {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        com.aspose.slides.internal.p205ji.C5464rv.f15030du.shutdown();
        r0 = com.aspose.slides.internal.p205ji.C5464rv.f15030du = null;
     */
    @Override // com.aspose.slides.internal.p205ji.AbstractC5466u4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void invoke() {
        while (true) {
            if (C5464rv.f15035m9.size() <= 0) {
                break;
            }
            synchronized (C5464rv.f15029c5) {
                try {
                    C5464rv.f15035m9.removeAll(new C5455ix(this));
                    if (C5464rv.f15035m9.size() == 0) {
                        break;
                    }
                } finally {
                }
            }
            C5449c5.m22527x1(100);
        }
        C5464rv.f15031dy.set(false);
    }
}
