package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.x2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2957x2 implements IGenericCloneable<C2957x2> {

    /* JADX INFO: renamed from: k4 */
    private C2778ji f8793k4;

    /* JADX INFO: renamed from: kk */
    private final List<AbstractC2701dn> f8794kk;

    /* JADX INFO: renamed from: x1 */
    private C2728fh f8795x1;

    public C2957x2() {
        this.f8794kk = new List<>();
        this.f8795x1 = new C2728fh();
    }

    /* JADX INFO: renamed from: k4 */
    public C2728fh m12587k4() {
        return this.f8795x1;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C2957x2 cloneT() {
        return new C2957x2(this);
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC2701dn[] m12592x1() {
        return this.f8794kk.toArray(new AbstractC2701dn[0]);
    }

    private C2957x2(C2957x2 c2957x2) {
        this.f8794kk = new List<>();
        m12589k4(c2957x2.f8795x1);
        m12590k4(c2957x2.f8793k4);
        List.Enumerator<AbstractC2701dn> it = c2957x2.f8794kk.iterator();
        while (it.hasNext()) {
            try {
                this.f8794kk.addItem(it.next().cloneT());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12588k4(AbstractC2701dn abstractC2701dn) {
        if (abstractC2701dn == null) {
            throw new ArgumentNullException("textRun");
        }
        this.f8794kk.addItem(abstractC2701dn.cloneT());
    }

    /* JADX INFO: renamed from: k4 */
    public void m12589k4(C2728fh c2728fh) {
        if (c2728fh == this.f8795x1) {
            return;
        }
        this.f8795x1 = c2728fh != null ? c2728fh.cloneT() : null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12590k4(C2778ji c2778ji) {
        if (c2778ji == this.f8793k4) {
            return;
        }
        this.f8793k4 = c2778ji != null ? c2778ji.cloneT() : null;
    }
}
