package com.aspose.slides.internal.p221k8;

import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p196j0.C5140x1;
import com.aspose.slides.internal.p221k8.C5648x1;
import java.util.Stack;

/* JADX INFO: renamed from: com.aspose.slides.internal.k8.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5645k4 extends C5648x1 implements C5648x1.kk {

    /* JADX INFO: renamed from: k4 */
    private C5140x1 f15449k4;

    /* JADX INFO: renamed from: kk */
    private Stack f15450kk = new Stack();

    /* JADX INFO: renamed from: x1 */
    private C5140x1 f15451x1;

    /* JADX INFO: renamed from: k4 */
    public C5140x1 m23042k4() {
        return this.f15449k4;
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: kk */
    public void mo23047kk(String str) {
        this.f15451x1 = (C5140x1) this.f15450kk.pop();
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: to */
    public void mo23048to(String str) {
        this.f15451x1.m22017k4(C5140x1.m22013x1(str));
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: x1 */
    public void mo23049x1(C5648x1 c5648x1) {
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: k4 */
    public void mo23043k4(C5648x1 c5648x1) {
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: x1 */
    public void mo23050x1(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public void m23044k4(String str) {
        this.f15449k4 = null;
        this.f15450kk.clear();
        m23068k4(new C3144um(str), this);
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: k4 */
    public void mo23045k4(String str, C5648x1.x1 x1Var) {
        C5140x1 c5140x1 = new C5140x1(str);
        if (this.f15449k4 == null) {
            this.f15449k4 = c5140x1;
            this.f15451x1 = c5140x1;
        } else {
            ((C5140x1) this.f15450kk.peek()).m22016k4(c5140x1);
        }
        this.f15450kk.push(c5140x1);
        this.f15451x1 = c5140x1;
        int iMo23073k4 = x1Var.mo23073k4();
        for (int i = 0; i < iMo23073k4; i++) {
            this.f15451x1.m22018k4(x1Var.mo23074k4(i), C5140x1.m22013x1(x1Var.mo23076x1(i)));
        }
    }

    @Override // com.aspose.slides.internal.p221k8.C5648x1.kk
    /* JADX INFO: renamed from: k4 */
    public void mo23046k4(String str, String str2) {
    }
}
