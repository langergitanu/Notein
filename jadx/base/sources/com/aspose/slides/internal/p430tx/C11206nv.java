package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.nv */
/* JADX INFO: loaded from: classes4.dex */
public class C11206nv extends C11194j5 {
    public C11206nv() {
        super(4);
    }

    @Override // com.aspose.slides.internal.p430tx.C11194j5, com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 1) {
                C6005k4.m24259k4("Invalid execution state inside VariableAction.Execute");
                return;
            }
            c11234xw.m54186k4(this.f38578to, ((C11215sv) c11234xw.m54198ks()).m54015k4());
            c11231x1.m54091jd();
            return;
        }
        int i = this.f38577m9;
        if (i != -1) {
            c11234xw.m54186k4(this.f38578to, c11234xw.m54195kk(c11231x1, i));
            c11231x1.m54091jd();
        } else if (this.f38758x1 == null) {
            c11234xw.m54186k4(this.f38578to, C14113y2.f47374k4);
            c11231x1.m54091jd();
        } else {
            c11234xw.m54183k4(new C11215sv(this.f38575h4));
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11194j5, com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53851k4(c11212rv, this.f38578to, "name");
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
            if (this.f38577m9 != -1 && this.f38758x1 != null) {
                throw XsltException.create("The variable or parameter '{0}' cannot have both a 'select' attribute and non-empty content.", this.f38573du);
            }
        }
    }
}
