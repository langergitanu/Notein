package com.aspose.slides.internal.p388rv;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p237ks.C5906k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.rv.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10113kk {

    /* JADX INFO: renamed from: k4 */
    private C5906k4 f36248k4;

    public AbstractC10113kk(C5906k4 c5906k4) {
        this.f36248k4 = c5906k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5906k4 m49693k4() {
        return this.f36248k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo49689k4(int i);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10113kk m49692k4(C5906k4 c5906k4) {
        int iM23791x1 = c5906k4.m23791x1();
        if (iM23791x1 == 0) {
            return new C10111h4(c5906k4);
        }
        if (iM23791x1 == 1) {
            return new C10110du(c5906k4);
        }
        if (iM23791x1 == 2) {
            return new C10116x1(c5906k4);
        }
        if (iM23791x1 == 3) {
            return new C10114m9(c5906k4);
        }
        if (iM23791x1 == 4) {
            return new C10112k4(c5906k4);
        }
        if (iM23791x1 == 5) {
            return new C10115to(c5906k4);
        }
        throw new NotSupportedException();
    }
}
