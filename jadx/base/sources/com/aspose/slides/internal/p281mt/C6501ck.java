package com.aspose.slides.internal.p281mt;

import com.aspose.slides.internal.p059c9.C1991to;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13469fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.mt.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C6501ck extends AbstractC6515ks {
    @Override // com.aspose.slides.internal.p281mt.AbstractC6515ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo26337k4(C4037ne c4037ne, C3149x1 c3149x1) {
        C13469fa c13469fa = (C13469fa) c4037ne;
        c3149x1.m13447k4(c13469fa.m62648kk() & 4294967295L);
        if ((c13469fa.m62648kk() & 4294967295L) > (c13469fa.m16027x1() & 65535)) {
            C6005k4.m24264to("ByteCount SHOULD be greater than or equal to the value of the Size field");
            return false;
        }
        c3149x1.m13447k4(c13469fa.m62650to() & 4294967295L);
        C1991to.m10125k4(c3149x1, c13469fa.m62644h4());
        c3149x1.m13450k4(c13469fa.m62649m9());
        return true;
    }
}
