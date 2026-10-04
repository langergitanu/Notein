package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class btk implements vbl {

    /* JADX INFO: renamed from: k4 */
    private final List<vbl> f4247k4;

    /* JADX INFO: renamed from: kk */
    private double f4248kk;

    /* JADX INFO: renamed from: x1 */
    private final List<vbl> f4249x1;

    public btk() {
        this.f4247k4 = new List<>();
        this.f4249x1 = new List<>();
        this.f4248kk = 0.0d;
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: I_ */
    public final void mo4311I_() {
        if (this.f4249x1.size() == 0) {
            return;
        }
        List.Enumerator<vbl> it = this.f4249x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo4311I_();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        for (int size = this.f4247k4.size() - 1; size >= 0; size--) {
            this.f4247k4.get_Item(size).dispose();
        }
        this.f4247k4.clear();
        this.f4249x1.clear();
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: k4 */
    public final void mo4312k4(double d) {
        if (this.f4249x1.size() == 0) {
            return;
        }
        int i = 0;
        while (i < this.f4249x1.size()) {
            vbl vblVar = this.f4249x1.get_Item(i);
            if (d < vblVar.mo4315kk()) {
                vblVar.mo4312k4(d);
                i++;
            } else {
                vblVar.mo4311I_();
                this.f4249x1.removeAt(i);
            }
        }
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: kk */
    public final double mo4315kk() {
        return this.f4248kk;
    }

    public btk(IGenericEnumerable<vbl> iGenericEnumerable) {
        this();
        m4313k4(iGenericEnumerable);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4313k4(IGenericEnumerable<vbl> iGenericEnumerable) {
        IGenericEnumerator<vbl> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                m4314k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4314k4(vbl vblVar) {
        if (vblVar == null) {
            throw new ArgumentNullException("player");
        }
        this.f4247k4.addItem(vblVar);
        this.f4249x1.addItem(vblVar);
        this.f4248kk = C14116yg.m67502x1(this.f4248kk, vblVar.mo4315kk());
    }
}
