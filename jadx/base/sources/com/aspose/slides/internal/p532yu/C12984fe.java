package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.fe */
/* JADX INFO: loaded from: classes5.dex */
public class C12984fe extends AbstractC13079l6 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private C12908be f43674k4 = new C12908be();

    /* JADX INFO: renamed from: kk */
    private C13164q9[] f43675kk;

    /* JADX INFO: renamed from: x1 */
    private C13890ei[] f43676x1;

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final C13164q9[] m60618h4() {
        return this.f43675kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12908be m60619k4() {
        return this.f43674k4;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        C13890ei[] c13890eiArr = this.f43676x1;
        if (c13890eiArr == null || c13890eiArr.length <= 0) {
            return this;
        }
        C12984fe c12984fe = (C12984fe) af_();
        C13890ei[] c13890eiArr2 = new C13890ei[this.f43676x1.length];
        int i = 0;
        while (true) {
            C13890ei[] c13890eiArr3 = this.f43676x1;
            if (i >= c13890eiArr3.length) {
                c12984fe.m60621k4(c13890eiArr2);
                return c12984fe;
            }
            c13890eiArr2[i] = c13890eiArr3[i].m65282du();
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C13890ei[] m60622x1() {
        return this.f43676x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60620k4(C13164q9[] c13164q9Arr) {
        this.f43675kk = c13164q9Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60621k4(C13890ei[] c13890eiArr) {
        this.f43676x1 = c13890eiArr;
    }
}
