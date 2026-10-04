package com.aspose.slides.internal.p055c4;

import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6116bs;
import com.aspose.slides.internal.p253lm.C6149jw;
import com.aspose.slides.internal.p253lm.C6218zm;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.c4.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1942du extends AbstractC1946kk {

    /* JADX INFO: renamed from: k4 */
    private Object f6909k4;

    /* JADX INFO: renamed from: kk */
    private String f6910kk;

    /* JADX INFO: renamed from: x1 */
    private String f6911x1;

    public C1942du(String str) {
        this.f6911x1 = str;
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: du */
    public String mo10025du() {
        return this.f6911x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10026k4(AbstractC6123ca abstractC6123ca) {
        m10089to().mo25037k4(mo10025du(), abstractC6123ca);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        AbstractC6123ca abstractC6123caM10036x1 = this.f6909k4 != null ? m10089to().m24993k4(C14067j2.m66727k4(this.f6909k4)).m10036x1(this.f6909k4) : m10089to().mo24967fa().m24759jd();
        m10026k4(abstractC6123caM10036x1);
        if (C14113y2.m67411k4(this.f6910kk)) {
            return;
        }
        try {
            C6218zm c6218zmM24870k4 = C6149jw.m24870k4(this.f6910kk);
            if (c6218zmM24870k4 != null) {
                c6218zmM24870k4.mo24749k4(new C1945k4((C6116bs) abstractC6123caM10036x1, m10089to()));
            }
        } catch (RuntimeException unused) {
        }
    }

    public C1942du(String str, Object obj) {
        this(str);
        this.f6909k4 = obj;
    }
}
