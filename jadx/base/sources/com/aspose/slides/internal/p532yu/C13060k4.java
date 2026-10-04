package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13060k4 {

    /* JADX INFO: renamed from: k4 */
    private int f44031k4 = -1;

    /* JADX INFO: renamed from: kk */
    private C13068kk f44032kk;

    /* JADX INFO: renamed from: to */
    private ArrayList f44033to;

    /* JADX INFO: renamed from: x1 */
    private boolean f44034x1;

    public C13060k4(C13068kk c13068kk) {
        this.f44032kk = c13068kk;
        this.f44033to = new ArrayList(c13068kk.m61059k4().size());
        for (int i = 0; i < c13068kk.m61059k4().size(); i++) {
            this.f44033to.addItem(new C13009h4((C12939d4) c13068kk.m61059k4().get_Item(i), this));
        }
        this.f44034x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61018k4() {
        return this.f44031k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61020kk(String str, String str2) {
        if (!this.f44034x1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f44033to.size(); i++) {
            if (((C13009h4) this.f44033to.get_Item(i)).m60665kk(str, str2, this.f44031k4 + 1)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61021x1() {
        this.f44034x1 = true;
        this.f44031k4 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m61019k4(String str, String str2) {
        if (!this.f44034x1) {
            return false;
        }
        this.f44031k4++;
        boolean z = false;
        for (int i = 0; i < this.f44033to.size(); i++) {
            C13009h4 c13009h4 = (C13009h4) this.f44033to.get_Item(i);
            if (c13009h4.m60661k4().m60156du()) {
                if (c13009h4.m60661k4().m60159to() || m61018k4() == 0) {
                    z = true;
                }
            } else if (m61018k4() != 0 && c13009h4.m60667x1(str, str2, this.f44031k4)) {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo61022x1(String str, String str2) {
        int i = this.f44031k4;
        if (i == 0) {
            this.f44034x1 = false;
            this.f44031k4 = i - 1;
        }
        if (!this.f44034x1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f44033to.size(); i2++) {
            ((C13009h4) this.f44033to.get_Item(i2)).m60663k4(str, str2, this.f44031k4);
        }
        this.f44031k4--;
        return false;
    }
}
