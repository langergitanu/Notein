package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.wn */
/* JADX INFO: loaded from: classes3.dex */
class C14744wn {

    /* JADX INFO: renamed from: k4 */
    private boolean f49819k4;

    /* JADX INFO: renamed from: kk */
    private C1205hi f49820kk;

    /* JADX INFO: renamed from: to */
    private SortedList<Long, Long> f49821to;

    /* JADX INFO: renamed from: x1 */
    private String f49822x1;

    public C14744wn(String str) {
        this.f49820kk = null;
        if (str == null) {
            throw new ArgumentNullException("Font's name doesn't specified!");
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        this.f49822x1 = strM67440x1;
        if (C14113y2.m67411k4(strM67440x1)) {
            throw new ArgumentException("Input font-name can't be empty!");
        }
        if (C14113y2.m67429to(this.f49822x1, ',') >= 0) {
            throw new ArgumentException("Single font name can't contains a comma delimiter!");
        }
        m72836k4(false);
        this.f49820kk = new C1205hi();
        this.f49821to = new SortedList<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m72835k4() {
        return this.f49822x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m72837kk() {
        return this.f49819k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1205hi m72838x1() {
        return this.f49820kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72836k4(boolean z) {
        this.f49819k4 = z;
    }
}
