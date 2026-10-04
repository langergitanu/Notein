package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p513xw.C12697fa;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C10324ar extends AbstractC3524ks implements InterfaceC10331h4 {

    /* JADX INFO: renamed from: dy */
    private int f36751dy;

    /* JADX INFO: renamed from: h4 */
    private String f36752h4;

    /* JADX INFO: renamed from: m9 */
    private C10339qq f36753m9;

    public C10324ar(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36751dy = 0;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: du */
    public final boolean mo50314du() {
        return true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        ((C10333jd) this.f9752k4).m50355k4((InterfaceC10331h4) this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 69;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final C10339qq mo50315k4(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f36751dy != 0) {
            return null;
        }
        this.f36751dy = 1;
        return this.f36753m9;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: kk */
    public final boolean mo50319kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "single-page-master-reference";
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: to */
    public final boolean mo50320to() {
        return false;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: x1 */
    public final boolean mo50321x1() {
        if (this.f36751dy == 0) {
            return false;
        }
        this.f36751dy = 0;
        return true;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final void mo50316k4() {
        this.f36751dy = 0;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        String strMo9926j_ = abstractC3533um.m14385du(154).mo9926j_();
        this.f36752h4 = strMo9926j_;
        if (C14113y2.m67411k4(strMo9926j_)) {
            m14104kk("master-reference");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final void mo50317k4(C10337m9 c10337m9) {
        C10339qq c10339qqM50373du = c10337m9.m50373du(this.f36752h4);
        this.f36753m9 = c10339qqM50373du;
        if (c10339qqM50373du == null) {
            C12697fa.m58940k4(m14111q_().m59580u4()).mo53635k4(this, this.f9752k4.m14105ks(), this.f36752h4, m14106m_());
        }
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final boolean mo50318k4(String str) {
        return C14113y2.m67363du(this.f36753m9.m50385m9(58).m50335bz(), str);
    }
}
