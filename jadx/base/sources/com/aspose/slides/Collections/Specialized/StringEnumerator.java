package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: loaded from: classes3.dex */
public class StringEnumerator {

    /* JADX INFO: renamed from: k4 */
    private IEnumerator f1915k4;

    public boolean hasNext() {
        return this.f1915k4.hasNext();
    }

    public String next() {
        return (String) this.f1915k4.next();
    }

    public void remove() {
        throw new NotImplementedException();
    }

    public void reset() {
        this.f1915k4.reset();
    }
}
