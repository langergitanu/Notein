package com.aspose.slides.internal.p384rq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;

/* JADX INFO: renamed from: com.aspose.slides.internal.rq.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10050to implements InterfaceC10045h4 {

    /* JADX INFO: renamed from: k4 */
    private C10041ck f36226k4;

    /* JADX INFO: renamed from: kk */
    private List<String> f36227kk = new List<>();

    /* JADX INFO: renamed from: to */
    private boolean f36228to;

    /* JADX INFO: renamed from: x1 */
    private int f36229x1;

    public C10050to(C10041ck c10041ck) {
        this.f36226k4 = c10041ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49669k4() {
        return this.f36229x1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // com.aspose.slides.internal.p384rq.InterfaceC10045h4
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo49647x1() {
        String str = (String) OooO0O0.OooO00o(this.f36227kk, 1);
        List<String> list = this.f36227kk;
        list.removeAt(list.size() - 1);
        if ("float".equals(str)) {
            int i = this.f36229x1;
            if (i >= 3) {
                this.f36228to = true;
            }
            int i2 = i - 1;
            this.f36229x1 = i2;
            if (this.f36228to && i2 == 0) {
                if (this.f36227kk.size() > 2) {
                    List<String> list2 = this.f36227kk;
                    if (!"inline".equals(list2.get_Item(list2.size() - 3))) {
                        this.f36226k4.m49573k4("&nbsp;");
                    }
                }
                this.f36228to = false;
            }
        }
    }

    @Override // com.aspose.slides.internal.p384rq.InterfaceC10045h4
    /* JADX INFO: renamed from: k4 */
    public final void mo49646k4(String str) {
        if ("float".equals(str)) {
            this.f36229x1++;
        }
        this.f36227kk.addItem(str);
    }
}
