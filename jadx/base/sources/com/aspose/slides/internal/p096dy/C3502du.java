package com.aspose.slides.internal.p096dy;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p423to.C11074x1;
import com.aspose.slides.internal.p478wl.C12200y9;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.dy.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3502du extends AbstractC3504kk {

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Integer> f9739k4;

    /* JADX INFO: renamed from: x1 */
    private String f9740x1;

    public C3502du(String str) {
        this.f9739k4 = new C14093tq<>();
        this.f9740x1 = str;
        int[] iArr = {0};
        boolean zMo13930k4 = C11071kk.m53503k4(C7019kk.m27443k4((Class<?>) C12200y9.class)).mo13930k4(str, iArr);
        int i = iArr[0];
        if (zMo13930k4) {
            this.f9739k4 = new C14093tq<>(Integer.valueOf(i));
        }
    }

    @Override // com.aspose.slides.internal.p096dy.InterfaceC3506x1
    /* JADX INFO: renamed from: k4 */
    public String mo14058k4() {
        return this.f9740x1;
    }

    @Override // com.aspose.slides.internal.p096dy.InterfaceC3506x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo10096k4(C11074x1 c11074x1) {
        if (C14093tq.m67295k4(this.f9739k4, null)) {
            return false;
        }
        if (C14093tq.m67295k4(new C14093tq(1), this.f9739k4)) {
            return true;
        }
        return C14093tq.m67295k4(new C14093tq(Integer.valueOf(c11074x1.m53522x1())), this.f9739k4);
    }
}
