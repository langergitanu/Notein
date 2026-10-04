package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p409sv.AbstractC10795x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C10325bv extends AbstractC10795x6 {
    public C10325bv(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 80;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || m14324kk(str, str2)) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return NoteMeta.PROPERTY_TITLE;
    }
}
