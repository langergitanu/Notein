package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
class flm implements IGenericEnumerator<jua> {

    /* JADX INFO: renamed from: k4 */
    public final String f5058k4;

    /* JADX INFO: renamed from: kk */
    private jua f5059kk = new jua();

    /* JADX INFO: renamed from: x1 */
    private int f5060x1;

    public flm(String str) {
        if (str == null) {
            throw new ArgumentNullException("str");
        }
        this.f5058k4 = str;
        reset();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        jua juaVar;
        if (this.f5060x1 + 1 >= this.f5058k4.length()) {
            return false;
        }
        int i = this.f5060x1 + 1;
        this.f5060x1 = i;
        char cCharAt = this.f5058k4.charAt(i);
        if (!C14117yj.m67514du(cCharAt) || this.f5060x1 + 1 >= this.f5058k4.length()) {
            juaVar = new jua(cCharAt);
        } else {
            this.f5060x1++;
            juaVar = new jua(cCharAt, this.f5058k4.charAt(this.f5060x1));
        }
        this.f5059kk = juaVar;
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final jua next() {
        return this.f5059kk;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f5060x1 = -1;
        jua.f45581k4.CloneTo(this.f5059kk);
    }
}
