package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5776b3;
import com.aspose.slides.internal.p231kk.InterfaceC5804ts;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12876u4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43375k4 = C7019kk.m27443k4((Class<?>) InterfaceC5776b3.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43376x1 = new C7017h4("get_stylesheets");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5776b3 interfaceC5776b3 = (InterfaceC5776b3) abstractC6123ca.mo24769C_();
        if (f43376x1.m27428k4(str) == 0) {
            return m10084k4(interfaceC5776b3.mo20448x1(), C7019kk.m27443k4((Class<?>) InterfaceC5804ts.class));
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("stylesheets", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43375k4;
    }
}
