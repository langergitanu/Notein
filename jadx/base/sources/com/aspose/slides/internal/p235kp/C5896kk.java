package com.aspose.slides.internal.p235kp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.C10345uz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kp.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5896kk extends AbstractC3524ks {

    /* JADX INFO: renamed from: h4 */
    private List<C5895k4> f16684h4;

    public C5896kk(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f16684h4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f16684h4 == null) {
            m14123x1("(fo:bookmark+)");
        }
        ((C10345uz) this.f9752k4).m50403k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (C7019kk.m27469x1(abstractC3511c5, C5895k4.class)) {
            this.f16684h4.addItem((C5895k4) C7019kk.m27452k4((Object) abstractC3511c5, C5895k4.class));
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "bookmark-tree";
    }

    /* JADX INFO: renamed from: ts */
    public final List<C5895k4> m23749ts() {
        return this.f16684h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || C14113y2.m67363du(str2, "bookmark")) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }
}
