package com.aspose.slides.internal.p055c4;

import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.AbstractC6211yd;
import com.aspose.slides.internal.p253lm.C6116bs;
import com.aspose.slides.internal.p253lm.C6198wp;
import com.aspose.slides.internal.p253lm.InterfaceC6132em;
import com.aspose.slides.internal.p253lm.InterfaceC6173qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.c4.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1944h4 extends C6198wp {

    /* JADX INFO: renamed from: du */
    private AbstractC1949x1 f6915du;

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f6916to;

    public C1944h4(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs, AbstractC1949x1 abstractC1949x1) {
        super(c6116bs);
        this.f6916to = interfaceC6173qw;
        ((C6198wp) this).f17519k4 = str;
        this.f6915du = abstractC1949x1;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caMo10024k4 = this.f6915du.mo10024k4(((C6198wp) this).f17519k4, abstractC6211yd, abstractC6123caArr);
        interfaceC6132em.mo10079x1(abstractC6123caMo10024k4);
        return abstractC6123caMo10024k4;
    }
}
