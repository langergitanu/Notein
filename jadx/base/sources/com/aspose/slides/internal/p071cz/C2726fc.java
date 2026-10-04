package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.fc */
/* JADX INFO: loaded from: classes3.dex */
public class C2726fc extends AbstractC2701dn {

    /* JADX INFO: renamed from: k4 */
    private String f8576k4;

    public C2726fc(C2726fc c2726fc) {
        super(c2726fc);
        m12239k4(c2726fc.f8576k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m12238k4() {
        return this.f8576k4;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2701dn, com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1 */
    public AbstractC2701dn cloneT() {
        return new C2726fc(this);
    }

    public C2726fc(String str) {
        m12239k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12239k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        this.f8576k4 = str;
    }
}
