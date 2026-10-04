package com.aspose.slides.internal.p329p4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p348q1.C9611to;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C7183fa extends C7180ck {

    /* JADX INFO: renamed from: k4 */
    private final C7186k4 f19749k4;

    /* JADX INFO: renamed from: x1 */
    private C7180ck f19750x1;

    public C7183fa(C7186k4 c7186k4) {
        super(new C7187kk(), new C3152yj());
        this.f19749k4 = c7186k4;
        if (c7186k4.m27778k4() > 0) {
            this.f19750x1 = (C7180ck) c7186k4.m27787x1(0);
        }
    }

    @Override // com.aspose.slides.internal.p329p4.C7187kk
    /* JADX INFO: renamed from: fa */
    public C7185jd mo27767fa(C7182dy c7182dy) {
        return this.f19750x1.mo27767fa(c7182dy);
    }

    @Override // com.aspose.slides.internal.p329p4.C7187kk
    /* JADX INFO: renamed from: h4 */
    public C7185jd mo27768h4(C7182dy c7182dy) {
        return this.f19750x1.mo27768h4(c7182dy);
    }

    @Override // com.aspose.slides.internal.p329p4.C7180ck
    /* JADX INFO: renamed from: kk */
    public AbstractC3150x6 mo27760kk() {
        List list = new List();
        byte[] bArrMo26677to = AbstractC6747ar.m26640kk("ISO-8859-1").mo26677to(IOUtils.LINE_SEPARATOR_UNIX);
        for (int i = 0; i < this.f19749k4.m27778k4(); i++) {
            list.addItem(((C7180ck) this.f19749k4.m27787x1(i)).mo27760kk());
            list.addItem(new C3152yj(bArrMo26677to));
        }
        return new C9611to(list);
    }

    @Override // com.aspose.slides.internal.p329p4.C7180ck
    /* JADX INFO: renamed from: to */
    public C7185jd mo27761to() {
        return this.f19750x1.mo27761to();
    }
}
