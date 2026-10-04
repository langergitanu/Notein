package com.aspose.slides.internal.p474wg;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14107wz;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.he */
/* JADX INFO: loaded from: classes5.dex */
class C11941he {

    /* JADX INFO: renamed from: c5 */
    private int f40246c5;

    /* JADX INFO: renamed from: du */
    public C14107wz f40247du;

    /* JADX INFO: renamed from: dy */
    private C11975um f40248dy;

    /* JADX INFO: renamed from: h4 */
    public AbstractC3150x6 f40249h4;

    /* JADX INFO: renamed from: k4 */
    public int f40250k4;

    /* JADX INFO: renamed from: kk */
    public C11973u1 f40251kk;

    /* JADX INFO: renamed from: m9 */
    public String[] f40252m9;

    /* JADX INFO: renamed from: to */
    public C14107wz f40253to;

    /* JADX INFO: renamed from: x1 */
    public String f40254x1;

    public C11941he() {
        this.f40246c5 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public C11975um m55975k4() {
        return this.f40248dy;
    }

    /* JADX INFO: renamed from: x1 */
    public int m55978x1() {
        return this.f40246c5;
    }

    public C11941he(C11975um c11975um) {
        this.f40248dy = c11975um;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55976k4(int i) {
        synchronized (this) {
            try {
                if (this.f40246c5 == 4 && i != 4) {
                    throw new C11997yo("Aborted", 6);
                }
                this.f40246c5 = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55977k4(C11975um c11975um) {
        this.f40248dy = c11975um;
    }
}
