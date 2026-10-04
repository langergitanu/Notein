package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p356qb.AbstractC9818dy;
import com.aspose.slides.internal.p356qb.C9815c5;
import com.aspose.slides.internal.p356qb.C9820h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C3621jd {

    /* JADX INFO: renamed from: k4 */
    private final int f10055k4;

    /* JADX INFO: renamed from: kk */
    private String f10056kk;

    /* JADX INFO: renamed from: x1 */
    private final C9815c5 f10057x1;

    public C3621jd(C9815c5 c9815c5, int i) {
        if (c9815c5 == null) {
            throw new ArgumentNullException();
        }
        this.f10055k4 = i;
        this.f10057x1 = c9815c5;
        m14761k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m14761k4() {
        AbstractC9818dy abstractC9818dyM48344to = this.f10057x1.m48344to("\u0003VBFrame");
        C9820h4 c9820h4 = abstractC9818dyM48344to instanceof C9820h4 ? (C9820h4) abstractC9818dyM48344to : null;
        if (c9820h4 == null) {
            throw new InvalidOperationException();
        }
        this.f10056kk = C3624kk.m14768k4(c9820h4.m48410k4(), this.f10055k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m14762k4(C9815c5 c9815c5) {
        c9815c5.m48340du(this.f10057x1);
    }
}
