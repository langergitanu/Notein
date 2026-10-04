package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.yo */
/* JADX INFO: loaded from: classes5.dex */
public class C11997yo extends InvalidOperationException {

    /* JADX INFO: renamed from: k4 */
    private AbstractC11956my f40486k4;

    /* JADX INFO: renamed from: x1 */
    private int f40487x1;

    public C11997yo() {
        this.f40487x1 = 16;
    }

    /* JADX INFO: renamed from: k4 */
    public int m56291k4() {
        return this.f40487x1;
    }

    public C11997yo(String str) {
        super(str);
        this.f40487x1 = 16;
    }

    public C11997yo(String str, int i) {
        super(str);
        this.f40487x1 = i;
    }

    public C11997yo(String str, Exception exception, int i, AbstractC11956my abstractC11956my) {
        super(str, exception);
        this.f40487x1 = i;
        this.f40486k4 = abstractC11956my;
    }

    public C11997yo(String str, RuntimeException runtimeException, int i) {
        super(str, runtimeException);
        this.f40487x1 = i;
    }
}
