package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p513xw.InterfaceC12731um;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10333jd extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC10331h4 f36779c5;

    /* JADX INFO: renamed from: ck */
    private InterfaceC12731um f36780ck;

    /* JADX INFO: renamed from: dy */
    private List<InterfaceC10331h4> f36781dy;

    /* JADX INFO: renamed from: h4 */
    private String f36782h4;

    /* JADX INFO: renamed from: jd */
    private int f36783jd;

    /* JADX INFO: renamed from: m9 */
    private C10337m9 f36784m9;

    public C10333jd(AbstractC3511c5 abstractC3511c5, InterfaceC12731um interfaceC12731um) {
        super(abstractC3511c5);
        this.f36783jd = -1;
        this.f36780ck = interfaceC12731um;
    }

    /* JADX INFO: renamed from: g8 */
    private InterfaceC10331h4 m50351g8() {
        int i = this.f36783jd + 1;
        this.f36783jd = i;
        if (i < 0 || i >= this.f36781dy.size()) {
            return null;
        }
        return this.f36781dy.get_Item(this.f36783jd);
    }

    /* JADX INFO: renamed from: bz */
    public final boolean m50352bz() {
        InterfaceC10331h4 interfaceC10331h4;
        InterfaceC10331h4 interfaceC10331h42 = this.f36779c5;
        if (interfaceC10331h42 != null && !interfaceC10331h42.mo50321x1()) {
            int i = this.f36783jd;
            if (i > 0) {
                int i2 = i - 1;
                this.f36783jd = i2;
                interfaceC10331h4 = this.f36781dy.get_Item(i2);
            } else {
                interfaceC10331h4 = null;
            }
            this.f36779c5 = interfaceC10331h4;
        }
        return this.f36779c5 != null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1(C14113y2.m67408k4("(single-page-master-reference|", "repeatable-page-master-reference|repeatable-page-master-alternatives)+"));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m50353e0() {
        this.f36783jd = -1;
        this.f36779c5 = null;
        List<InterfaceC10331h4> list = this.f36781dy;
        if (list != null) {
            List.Enumerator<InterfaceC10331h4> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo50316k4();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        this.f36781dy = new List<>();
        C10337m9 c10337m9M50396bz = this.f9752k4.mo14126yj().m50396bz();
        this.f36784m9 = c10337m9M50396bz;
        c10337m9M50396bz.m50376k4(this.f36782h4, this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 54;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10339qq m50354k4(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        if (this.f36779c5 == null) {
            InterfaceC10331h4 interfaceC10331h4M50351g8 = m50351g8();
            this.f36779c5 = interfaceC10331h4M50351g8;
            if (interfaceC10331h4M50351g8 == null) {
                this.f36780ck.mo53633k4(this, this.f36782h4, m14106m_());
            }
            if (this.f36779c5.mo50320to() && !this.f36779c5.mo50318k4(str)) {
                throw new Exception("The current sub-sequence will not terminate whilst processing then main flow");
            }
        }
        C10339qq c10339qqMo50315k4 = this.f36779c5.mo50315k4(z, z2, z3, z4);
        boolean z5 = true;
        while (c10339qqMo50315k4 == null) {
            InterfaceC10331h4 interfaceC10331h4M50351g82 = m50351g8();
            if (interfaceC10331h4M50351g82 == null) {
                this.f36780ck.mo53636k4(this, this.f36782h4, z5 & this.f36779c5.mo50314du(), m14106m_());
                this.f36779c5.mo50316k4();
                if (!this.f36779c5.mo50318k4(str)) {
                    throw new Exception("The last simple-page-master does not reference the main flow");
                }
                z5 = false;
            } else {
                this.f36779c5 = interfaceC10331h4M50351g82;
            }
            c10339qqMo50315k4 = this.f36779c5.mo50315k4(z, z2, z3, z4);
            if (c10339qqMo50315k4 == null && !z5) {
                throw new Exception("The current sub-sequence will not terminate whilst processing then main flow");
            }
        }
        return c10339qqMo50315k4;
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m50356qm() {
        InterfaceC10331h4 interfaceC10331h4 = this.f36779c5;
        return interfaceC10331h4 != null && interfaceC10331h4.mo50319kk();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "page-sequence-master";
    }

    /* JADX INFO: renamed from: ts */
    public final List<InterfaceC10331h4> m50357ts() {
        return this.f36781dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        String strMo9926j_ = abstractC3533um.m14402to(153).mo9926j_();
        this.f36782h4 = strMo9926j_;
        if (C14113y2.m67411k4(strMo9926j_)) {
            m14104kk("master-name");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || C14113y2.m67363du(str2, "single-page-master-reference") || C14113y2.m67363du(str2, "repeatable-page-master-reference") || C14113y2.m67363du(str2, "repeatable-page-master-alternatives")) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50355k4(InterfaceC10331h4 interfaceC10331h4) {
        this.f36781dy.addItem(interfaceC10331h4);
    }
}
