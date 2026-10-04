package com.aspose.slides.internal.p077d8;

import com.aspose.slides.IWarningCallback;
import com.aspose.slides.IWarningInfo;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.b1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3035b1 implements IWarningInfo {

    /* JADX INFO: renamed from: k4 */
    String f8900k4;

    public AbstractC3035b1(String str) {
        this.f8900k4 = str;
    }

    @Override // com.aspose.slides.IWarningInfo
    public final String getDescription() {
        return this.f8900k4;
    }

    @Override // com.aspose.slides.IWarningInfo
    public final void sendWarning(IWarningCallback iWarningCallback) {
        if (iWarningCallback != null) {
            try {
                if (iWarningCallback.warning(this) == 1) {
                    throw new C3065k4(this);
                }
            } catch (AssertionError | RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
    }
}
