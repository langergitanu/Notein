package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C5549m9 implements IGenericEnumerator<InterfaceC12777qq> {

    /* JADX INFO: renamed from: k4 */
    public InterfaceC12777qq f15256k4;

    /* JADX INFO: renamed from: kk */
    public boolean f15257kk = true;

    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq f15258x1;

    public C5549m9(InterfaceC12777qq interfaceC12777qq) {
        this.f15258x1 = interfaceC12777qq;
        this.f15256k4 = interfaceC12777qq.mo22653ss();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f15258x1 = null;
        this.f15256k4 = null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f15257kk) {
            this.f15256k4 = this.f15258x1.mo22653ss();
            this.f15257kk = false;
        } else {
            InterfaceC12777qq interfaceC12777qq = this.f15256k4;
            if (interfaceC12777qq != null) {
                this.f15256k4 = interfaceC12777qq.mo22631g8();
            }
        }
        return this.f15256k4 != null;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final InterfaceC12777qq next() {
        InterfaceC12777qq interfaceC12777qq;
        if (this.f15257kk || (interfaceC12777qq = this.f15256k4) == null) {
            throw new InvalidOperationException();
        }
        return interfaceC12777qq;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f15257kk = true;
        this.f15256k4 = this.f15258x1.mo22653ss();
    }
}
