package com.aspose.slides.internal.p223ka;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ka.to */
/* JADX INFO: loaded from: classes.dex */
public class C5658to implements IGenericEnumerator<C5657kk> {

    /* JADX INFO: renamed from: k4 */
    private String f15635k4;

    /* JADX INFO: renamed from: kk */
    private int f15636kk;

    /* JADX INFO: renamed from: to */
    private C5657kk f15637to;

    /* JADX INFO: renamed from: x1 */
    private int f15638x1 = -1;

    public C5658to(String str) {
        this.f15635k4 = str;
        this.f15636kk = str.length();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f15635k4 = null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f15638x1;
        if (i == this.f15636kk - 1) {
            return false;
        }
        int i2 = i + 1;
        this.f15638x1 = i2;
        char cCharAt = this.f15635k4.charAt(i2);
        C5657kk c5657kk = new C5657kk(C14117yj.m67517dy(cCharAt));
        this.f15637to = c5657kk;
        c5657kk.m23106k4(cCharAt);
        char[] cArr = {0};
        while (m23109k4(cArr)) {
            char c = cArr[0];
            boolean zM67517dy = C14117yj.m67517dy(c);
            if (!(this.f15637to.m23107k4() && zM67517dy) && (this.f15637to.m23107k4() || zM67517dy)) {
                break;
            }
            this.f15638x1++;
            this.f15637to.m23106k4(c);
        }
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C5657kk next() {
        return this.f15637to;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f15638x1 = -1;
        this.f15637to = null;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m23109k4(char[] cArr) {
        int i = this.f15638x1 + 1;
        if (i < this.f15636kk) {
            cArr[0] = this.f15635k4.charAt(i);
            return true;
        }
        cArr[0] = 0;
        return false;
    }
}
