package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p097e0.AbstractC3515du;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3525lr extends AbstractC3515du {

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.lr$k4 */
    public static class k4 extends AbstractC3515du.k4 {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3515du.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC3511c5 mo14166k4(AbstractC3511c5 abstractC3511c5) {
            return new C3536v4(abstractC3511c5);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.lr$x1 */
    public static class x1 extends AbstractC3515du.k4 {
        private x1() {
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3515du.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC3511c5 mo14166k4(AbstractC3511c5 abstractC3511c5) {
            return new C3542yd(abstractC3511c5);
        }
    }

    public C3525lr() {
        this.f9789x1 = "http://www.w3.org/2000/svg";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3515du
    /* JADX INFO: renamed from: kk */
    public String mo14163kk() {
        return "svg";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3515du
    /* JADX INFO: renamed from: to */
    public void mo14164to() {
        if (this.f9788k4 == null) {
            Dictionary<String, AbstractC3515du.k4> dictionary = new Dictionary<>();
            this.f9788k4 = dictionary;
            dictionary.addItem("svg", new k4());
            this.f9788k4.addItem("<default>", new x1());
        }
    }
}
