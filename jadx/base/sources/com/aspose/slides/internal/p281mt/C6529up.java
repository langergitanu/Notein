package com.aspose.slides.internal.p281mt;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.mt.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6529up extends AbstractC6515ks {
    @Override // com.aspose.slides.internal.p281mt.AbstractC6515ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo26337k4(C4037ne c4037ne, C3149x1 c3149x1) {
        if ((c4037ne.m16027x1() & 65535) != 0) {
            C6005k4.m24264to("Warning: Invalid ByteCount for WmfEndPathEscape record. MUST be 0x0000");
            c3149x1.m13442k4().seek(c4037ne.m16027x1() & 65535, 1);
        }
        return true;
    }
}
