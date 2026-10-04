package com.aspose.slides.internal.p463vm;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11687fa implements IEnumerator {

    /* JADX INFO: renamed from: kk */
    private int f39542kk;

    /* JADX INFO: renamed from: to */
    private String f39543to;

    /* JADX INFO: renamed from: x1 */
    private int f39544x1;

    /* JADX INFO: renamed from: k4 */
    private int f39541k4 = -1;

    /* JADX INFO: renamed from: du */
    private String f39540du = null;

    public C11687fa(String str, int i) {
        this.f39542kk = i;
        this.f39543to = C14113y2.m67422kk(str, i);
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        int i = this.f39541k4 + 1;
        this.f39544x1 = i;
        if (i >= this.f39543to.length()) {
            this.f39540du = null;
            return false;
        }
        String strM55120k4 = C11689jd.m55120k4(this.f39543to, this.f39544x1);
        this.f39540du = strM55120k4;
        this.f39541k4 = strM55120k4.length() + this.f39541k4;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public String m55107k4() {
        String str = this.f39540du;
        if (str != null) {
            return str;
        }
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public Object next() {
        String str = this.f39540du;
        if (str != null) {
            return str;
        }
        throw new InvalidOperationException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f39540du = null;
        this.f39541k4 = -1;
    }
}
