package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.du */
/* JADX INFO: loaded from: classes3.dex */
class C3606du extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f10016k4;

    /* JADX INFO: renamed from: kk */
    private List<C3616he> f10017kk = new List<>();

    /* JADX INFO: renamed from: to */
    private final boolean f10018to;

    /* JADX INFO: renamed from: x1 */
    private final long f10019x1;

    public C3606du(long j, boolean z) {
        this.f10019x1 = j;
        this.f10018to = z;
    }

    /* JADX INFO: renamed from: kk */
    private void m14715kk() {
        C3152yj c3152yj = new C3152yj(this.f10016k4);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            while (c3134k4.m13371ck().getPosition() != c3134k4.m13371ck().getLength()) {
                try {
                    C3616he c3616he = new C3616he();
                    c3616he.mo14692k4(c3134k4);
                    this.f10017kk.addItem(c3616he);
                } finally {
                    c3134k4.dispose();
                }
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14716k4(List<C3616he> list) {
        if (!this.f10018to) {
            throw new InvalidOperationException();
        }
        this.f10017kk = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C3616he> m14718x1() {
        if (this.f10018to) {
            return this.f10017kk;
        }
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f10016k4 = c3134k4.m13372dy(((int) this.f10019x1) - 2);
        if (this.f10018to) {
            m14715kk();
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        if (!this.f10018to) {
            c3149x1.m13450k4(this.f10016k4);
            return;
        }
        List.Enumerator<C3616he> it = this.f10017kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo14697k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m14717k4() {
        return this.f10016k4;
    }
}
