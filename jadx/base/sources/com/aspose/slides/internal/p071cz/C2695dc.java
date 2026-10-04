package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.dc */
/* JADX INFO: loaded from: classes3.dex */
public class C2695dc extends AbstractC2707dx implements IGenericCloneable<C2695dc> {

    /* JADX INFO: renamed from: k4 */
    private final List<C2773j5> f8554k4;

    /* JADX INFO: renamed from: x1 */
    private C2910tl f8555x1;

    public C2695dc(C2891s1 c2891s1) {
        super(c2891s1);
        this.f8554k4 = new List<>();
    }

    /* JADX INFO: renamed from: m9 */
    private C2773j5 m12188m9() {
        if (this.f8554k4.size() != 0) {
            return (C2773j5) OooO0O0.OooO00o(this.f8554k4, 1);
        }
        throw new ApplicationException("A Path object has not been added.");
    }

    /* JADX INFO: renamed from: du */
    public void m12189du() {
        m12188m9().m12348to();
    }

    /* JADX INFO: renamed from: h4 */
    public void m12191h4(double d, double d2) {
        m12188m9().m12343k4(d, d2);
    }

    /* JADX INFO: renamed from: k4 */
    public C2910tl m12192k4() {
        C2910tl c2910tl = this.f8555x1;
        return c2910tl == null ? new C2910tl(m12213h4().m12516k4(), m12213h4().m12521x1()) : c2910tl;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public C2695dc cloneT() {
        C2695dc c2695dc = new C2695dc(m12213h4());
        c2695dc.f8555x1 = this.f8555x1.cloneT();
        List.Enumerator<C2773j5> it = this.f8554k4.iterator();
        while (it.hasNext()) {
            try {
                c2695dc.f8554k4.addItem(it.next().cloneT());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c2695dc;
    }

    /* JADX INFO: renamed from: du */
    public void m12190du(double d, double d2) {
        m12188m9().m12351x1(d, d2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12193k4(double d, double d2, double d3, double d4) {
        m12188m9().m12344k4(d, d2, d3, d4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12194k4(double d, double d2, int i, boolean z, boolean z2) {
        this.f8554k4.addItem(new C2773j5(d, d2, i, z, z2));
    }

    /* JADX INFO: renamed from: k4 */
    public void m12195k4(C2865q1 c2865q1, C2865q1 c2865q12) {
        m12188m9().m12345k4(c2865q1.Clone(), c2865q12.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void m12196k4(C2865q1 c2865q1, C2865q1 c2865q12, C2865q1 c2865q13) {
        m12188m9().m12346k4(c2865q1.Clone(), c2865q12.Clone(), c2865q13.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void m12197k4(C2910tl c2910tl) {
        if (c2910tl == null) {
            throw new ArgumentNullException("value");
        }
        this.f8555x1 = c2910tl.cloneT();
    }
}
