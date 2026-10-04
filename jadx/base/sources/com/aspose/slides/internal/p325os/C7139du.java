package com.aspose.slides.internal.p325os;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.os.du */
/* JADX INFO: loaded from: classes4.dex */
public class C7139du extends AbstractC7140k4 {

    /* JADX INFO: renamed from: k4 */
    private String f19253k4;

    /* JADX INFO: renamed from: kk */
    private boolean f19254kk;

    /* JADX INFO: renamed from: x1 */
    private String f19255x1;

    public C7139du(String str, boolean z) {
        if (str == null) {
            throw new NullReferenceException("uri must not be null");
        }
        this.f19255x1 = str;
        this.f19254kk = z;
    }

    /* JADX INFO: renamed from: du */
    public final String m27687du() {
        return this.f19255x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m27688h4() {
        return this.f19254kk;
    }

    @Override // com.aspose.slides.internal.p325os.AbstractC7140k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo27689k4(AbstractC7140k4 abstractC7140k4) {
        if (abstractC7140k4 == null) {
            throw new NullReferenceException("other must not be null");
        }
        if (!C7019kk.m27469x1(abstractC7140k4, C7139du.class)) {
            return false;
        }
        C7139du c7139du = (C7139du) abstractC7140k4;
        return C14113y2.m67363du(m27691to(), c7139du.m27691to()) && C14113y2.m67363du(m27687du(), c7139du.m27687du()) && m27688h4() == c7139du.m27688h4();
    }

    @Override // com.aspose.slides.internal.p325os.AbstractC7140k4
    /* JADX INFO: renamed from: kk */
    public String mo27690kk() {
        return C14113y2.m67408k4("aps-", C7141kk.f19259h4.m48711k4());
    }

    /* JADX INFO: renamed from: to */
    public final String m27691to() {
        return this.f19253k4;
    }
}
