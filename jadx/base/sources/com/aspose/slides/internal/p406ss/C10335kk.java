package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p513xw.C12697fa;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10335kk extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private int f36797c5;

    /* JADX INFO: renamed from: dy */
    private int f36798dy;

    /* JADX INFO: renamed from: h4 */
    private String f36799h4;

    /* JADX INFO: renamed from: jd */
    private int f36800jd;

    /* JADX INFO: renamed from: m9 */
    private C10339qq f36801m9;

    public C10335kk(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: bz */
    private C10332ix m50363bz() {
        return (C10332ix) this.f9752k4;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m50364e0() {
        return this.f36798dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        m50363bz().m50349k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 12;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f36799h4 = abstractC3533um.m14385du(154).mo9926j_();
        this.f36798dy = abstractC3533um.m14385du(185).mo17251du();
        this.f36797c5 = abstractC3533um.m14385du(167).mo17251du();
        this.f36800jd = abstractC3533um.m14385du(16).mo17251du();
        if (C14113y2.m67411k4(this.f36799h4)) {
            m14104kk("master-reference");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "conditional-page-master-reference";
    }

    /* JADX INFO: renamed from: ts */
    public final C10339qq m50367ts() {
        return this.f36801m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        m14103kk(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50365k4(C10337m9 c10337m9) {
        C10339qq c10339qqM50373du = c10337m9.m50373du(this.f36799h4);
        this.f36801m9 = c10339qqM50373du;
        if (c10339qqM50373du == null) {
            C12697fa.m58940k4(m14111q_().m59580u4()).mo53635k4(this, this.f9752k4.m14105ks(), this.f36799h4, m14106m_());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50366k4(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = this.f36798dy;
        if (i != 8 && ((i != 50 || !z2) && ((i != 72 || !z3) && ((i != 186 || !z2 || !z3) && (i != 117 || z2 || z3))))) {
            return false;
        }
        int i2 = this.f36797c5;
        if (i2 != 8 && ((i2 != 99 || !z) && (i2 != 43 || z))) {
            return false;
        }
        int i3 = this.f36800jd;
        if (i3 == 8) {
            return true;
        }
        if (i3 == 16 && z4) {
            return true;
        }
        return i3 == 98 && !z4;
    }
}
