package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13849aa;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13972s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13220to extends C12957dy {
    public C13220to(C13849aa c13849aa, C13287xo c13287xo, InterfaceC13972s7 interfaceC13972s7) {
        super(c13849aa, c13287xo, interfaceC13972s7);
        this.f43548k4 = new C13322zd();
    }

    /* JADX INFO: renamed from: ks */
    private int m61620ks() {
        if (this.f43554x1.m65044ss() != null && this.f43554x1.m65044ss().size() > 0) {
            C13045j6 it = this.f43554x1.m65044ss().iterator();
            while (it.hasNext()) {
                C13322zd c13322zdM61464k4 = it.m60994k4().m61464k4();
                if (c13322zdM61464k4.m61869ck() == 3) {
                    return 4;
                }
                if (c13322zdM61464k4.m61869ck() == 2) {
                    return 3;
                }
            }
        }
        if (this.f43554x1.mo65028jd() == 1) {
            int iM61014k4 = m60279m9().m61014k4(this.f43554x1.mo65023fa(), this.f43554x1.mo65050up());
            if (iM61014k4 == 3) {
                return 4;
            }
            if (iM61014k4 == 2) {
                return 3;
            }
            int iMo65041qq = this.f43554x1.mo65041qq();
            for (int i = 0; i < iMo65041qq; i++) {
                this.f43554x1.mo65055x1(i);
                String strMo65050up = this.f43554x1.mo65050up();
                String strMo65023fa = this.f43554x1.mo65023fa();
                if (C13851ai.m65152k4(strMo65050up, m60279m9().f43916du)) {
                    if (C13206so.m61582x1(this.f43554x1.mo65042rv())) {
                        this.f43554x1.mo65020du();
                        return 3;
                    }
                } else {
                    if (C13851ai.m65152k4(strMo65050up, m60279m9().f43904c5)) {
                        this.f43554x1.mo65020du();
                        return 4;
                    }
                    if (C13851ai.m65152k4(strMo65050up, m60279m9().f43936ix.m65284k4()) && C13851ai.m65152k4(strMo65023fa, m60279m9().f43936ix.m65289x1())) {
                        C13849aa c13849aa = this.f43554x1;
                        c13849aa.m65032k4(AbstractC12892ae.m60013x1(c13849aa.mo65042rv()));
                        this.f43554x1.mo65020du();
                        return 3;
                    }
                }
            }
            if (iMo65041qq > 0) {
                this.f43554x1.mo65020du();
            }
        }
        return 1;
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public Object mo60267k4(String str) {
        return null;
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: kk */
    public void mo60278kk() {
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: x1 */
    public void mo60282x1() {
        C13849aa c13849aa;
        C12957dy c13334zz;
        int iM61620ks = m61620ks();
        if (iM61620ks == 3) {
            c13849aa = this.f43554x1;
            c13334zz = new C13334zz(this);
        } else {
            if (iM61620ks != 4) {
                return;
            }
            c13849aa = this.f43554x1;
            c13334zz = new C13075ku(this);
        }
        c13849aa.m65030k4(c13334zz);
        this.f43554x1.m65025gi().mo60282x1();
    }

    @Override // com.aspose.slides.internal.p532yu.C12957dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo60277k4() {
        return false;
    }
}
