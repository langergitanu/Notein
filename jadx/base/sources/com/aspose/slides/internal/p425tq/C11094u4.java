package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11094u4 {

    /* JADX INFO: renamed from: k4 */
    private int f38425k4;

    /* JADX INFO: renamed from: x1 */
    private Stack<Integer> f38426x1;

    public C11094u4() {
        this(0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m53612k4() {
        return this.f38425k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53614kk() {
        this.f38425k4 = this.f38426x1.pop().intValue();
    }

    /* JADX INFO: renamed from: to */
    public final int[] m53615to() {
        int[] iArr = new int[this.f38426x1.size()];
        this.f38426x1.copyTo(AbstractC14092to.m67208k4((Object) iArr), 0);
        return iArr;
    }

    public String toString() {
        return C14057f9.m66591x1(this.f38425k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53616x1() {
        this.f38426x1.push(Integer.valueOf(this.f38425k4));
    }

    public C11094u4(int i) {
        this.f38425k4 = i;
        this.f38426x1 = new Stack<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53613k4(int i) {
        this.f38425k4 = i;
    }
}
