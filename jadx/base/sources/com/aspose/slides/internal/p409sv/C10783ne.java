package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3531ts;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C10783ne extends AbstractC10778k4 {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC1984kk f37781c5;

    /* JADX INFO: renamed from: dy */
    private String f37782dy;

    /* JADX INFO: renamed from: h4 */
    private C12025x6 f37783h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f37784m9;

    public C10783ne(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37783h4 = C12025x6.f40591k4.Clone();
    }

    /* JADX INFO: renamed from: t6 */
    private void m52325t6() {
        if (this.f37784m9) {
            return;
        }
        AbstractC3531ts abstractC3531ts = (AbstractC3531ts) this.f9851to;
        abstractC3531ts.mo14369k4(C12016rv.f40556k4.Clone().Clone(), this.f37782dy).CloneTo(this.f37783h4);
        this.f37781c5 = abstractC3531ts.m14368ar();
        this.f37784m9 = true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1("one (1) non-XSL namespace child");
        }
        mo14107n_().mo14209x1(this);
    }

    /* JADX INFO: renamed from: f9 */
    public final AbstractC3531ts m52326f9() {
        return (AbstractC3531ts) this.f9851to;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4
    /* JADX INFO: renamed from: gi */
    public int mo52261gi() {
        m52325t6();
        if (this.f37783h4.m56894k4()) {
            return 0;
        }
        return C7019kk.m27462to(Float.valueOf(this.f37783h4.m56895kk() * 1000.0f), 13);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14183k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 37;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        super.mo14089k4(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4
    /* JADX INFO: renamed from: kp */
    public int mo52262kp() {
        m52325t6();
        if (this.f37783h4.m56894k4()) {
            return 0;
        }
        return C7019kk.m27462to(Float.valueOf(this.f37783h4.m56897x1() * 1000.0f), 13);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "instream-foreign-object";
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4
    /* JADX INFO: renamed from: s7 */
    public InterfaceC1984kk mo52263s7() {
        m52325t6();
        return this.f37781c5;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f37782dy = abstractC3533um.m14385du(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3).mo9926j_();
        super.mo14090k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        } else if (this.f9851to != null) {
            m14092k4(interfaceC3757h4, new C9892x1(str, null, str2));
        }
    }
}
