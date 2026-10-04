package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class srb implements IDisposable {

    /* JADX INFO: renamed from: du */
    private final int f48906du;

    /* JADX INFO: renamed from: k4 */
    private final C12275wy f48907k4;

    /* JADX INFO: renamed from: kk */
    private final List<C3148wl> f48908kk;

    /* JADX INFO: renamed from: to */
    private final int f48909to;

    /* JADX INFO: renamed from: x1 */
    private final C3152yj[] f48910x1;

    public srb(C12275wy c12275wy, int i, int i2) {
        if (i2 <= i) {
            throw new ArgumentException();
        }
        this.f48907k4 = c12275wy;
        this.f48909to = i;
        this.f48906du = i2;
        int i3 = i2 - i;
        this.f48910x1 = new C3152yj[i3];
        this.f48908kk = new List<>(i3);
        m70744kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m70744kk() {
        int i = 0;
        while (true) {
            C3152yj[] c3152yjArr = this.f48910x1;
            if (i >= c3152yjArr.length) {
                return;
            }
            c3152yjArr[i] = new C3152yj();
            i++;
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        for (C3152yj c3152yj : this.f48910x1) {
            c3152yj.dispose();
        }
        List.Enumerator<C3148wl> it = this.f48908kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f48907k4.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m70745k4(int i) {
        return this.f48910x1[i - this.f48909to];
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C3148wl> m70747x1() {
        return this.f48908kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12275wy m70746k4() {
        return this.f48907k4;
    }
}
