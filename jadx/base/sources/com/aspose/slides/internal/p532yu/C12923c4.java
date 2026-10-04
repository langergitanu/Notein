package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.c4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12923c4 extends AbstractC12998ga {

    /* JADX INFO: renamed from: k4 */
    protected C13086lm f43480k4;

    /* JADX INFO: renamed from: x1 */
    protected Object f43481x1;

    public C12923c4(C13086lm c13086lm, Object obj) {
        this.f43480k4 = c13086lm;
        this.f43481x1 = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public ICollection m60124k4(C12930cj c12930cj) {
        return c12930cj.m60137k4(this.f43480k4);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60125k4(C13047jd c13047jd, C13047jd c13047jd2, C13047jd[] c13047jdArr) {
        throw new InvalidOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.aspose.slides.internal.yu.ga] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.aspose.slides.internal.yu.fa, com.aspose.slides.internal.yu.vt] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.aspose.slides.internal.yu.vt] */
    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60040k4(AbstractC13255vt abstractC13255vt, C12930cj c12930cj, C12979f7 c12979f7) {
        Iterator it = m60124k4(c12930cj).iterator();
        ?? r2 = 0;
        while (it.hasNext()) {
            try {
                int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                if (c12930cj.m60138k4(iIntValue) != this.f43481x1) {
                    c12930cj.m60140k4(false);
                }
                C13188rq c13188rq = new C13188rq(c12979f7.m60615k4(iIntValue, this.f43481x1));
                if (r2 == 0) {
                    r2 = c13188rq;
                } else {
                    ?? c12981fa = new C12981fa();
                    c12981fa.m61639k4(r2);
                    c12981fa.m61642x1(c13188rq);
                    r2 = c12981fa;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        if (abstractC13255vt.m61641x1() == this) {
            abstractC13255vt.m61639k4(r2);
        } else {
            abstractC13255vt.m61642x1(r2);
        }
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public boolean mo60126k4() {
        throw new InvalidOperationException();
    }
}
