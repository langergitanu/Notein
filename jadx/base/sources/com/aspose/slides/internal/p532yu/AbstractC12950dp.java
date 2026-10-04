package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.dp */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12950dp extends C13126nm {

    /* JADX INFO: renamed from: k4 */
    public static final AbstractC12950dp f43531k4 = new k4();

    /* JADX INFO: renamed from: kk */
    private C14046bv f43532kk;

    /* JADX INFO: renamed from: to */
    private int f43533to;

    /* JADX INFO: renamed from: x1 */
    private C14046bv f43534x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.dp$k4 */
    public static class k4 extends AbstractC12950dp {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p532yu.AbstractC12950dp
        /* JADX INFO: renamed from: x1 */
        public boolean mo60251x1() {
            return true;
        }
    }

    public AbstractC12950dp() {
        C14046bv c14046bv = C14046bv.f47169to;
        this.f43534x1 = c14046bv.Clone();
        this.f43532kk = c14046bv.Clone();
        this.f43533to = 0;
    }

    /* JADX INFO: renamed from: bz */
    public final String m60241bz() {
        if ((this.f43533to & 1) == 0) {
            return null;
        }
        return C13850af.m65105k4(this.f43534x1.Clone());
    }

    /* JADX INFO: renamed from: c5 */
    public String mo60242c5() {
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: dy */
    public final void m60244dy(String str) {
        int i;
        if (str == null) {
            C14046bv.f47169to.CloneTo(this.f43534x1);
            i = this.f43533to & (-2);
        } else {
            C13850af.m65072fa(str).CloneTo(this.f43534x1);
            if (C14046bv.m66448ck(this.f43534x1, C14046bv.f47165du)) {
                throw new XmlSchemaException("The value for the 'minOccurs' attribute must be xsd:nonNegativeInteger.", C14113y2.f47374k4);
            }
            i = this.f43533to | 1;
        }
        this.f43533to = i;
    }

    /* JADX INFO: renamed from: g8 */
    public final C14046bv m60245g8() {
        return this.f43534x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60246k4(C14046bv c14046bv) {
        if (C14046bv.m66448ck(c14046bv, C14046bv.f47165du) || C14046bv.m66484m9(c14046bv, C14046bv.m66446c5(c14046bv.Clone()))) {
            throw new XmlSchemaException("The value for the 'minOccurs' attribute must be xsd:nonNegativeInteger.", C14113y2.f47374k4);
        }
        c14046bv.CloneTo(this.f43534x1);
        this.f43533to |= 1;
    }

    /* JADX INFO: renamed from: qm */
    public final String m60247qm() {
        if ((this.f43533to & 2) == 0) {
            return null;
        }
        return C14046bv.m66453dy(this.f43532kk, C14046bv.f47170x1) ? "unbounded" : C13850af.m65105k4(this.f43532kk.Clone());
    }

    /* JADX INFO: renamed from: sv */
    public final C14046bv m60248sv() {
        return this.f43532kk;
    }

    /* JADX INFO: renamed from: wp */
    public final C13890ei m60249wp() {
        C13021hu c13021hu = (C13021hu) C7019kk.m27452k4((Object) this, C13021hu.class);
        if (c13021hu != null) {
            return c13021hu.m60721qq();
        }
        C12989fu c12989fu = (C12989fu) C7019kk.m27452k4((Object) this, C12989fu.class);
        if (c12989fu == null) {
            return C13890ei.f46456k4;
        }
        String strM60628k4 = c12989fu.m60628k4();
        String strM67440x1 = strM60628k4 != null ? C14113y2.m67440x1(strM60628k4) : C14113y2.f47374k4;
        if (strM67440x1.length() == 0) {
            strM67440x1 = "##any";
        }
        return new C13890ei(C18358t1.g.f56183c, strM67440x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60250x1(C14046bv c14046bv) {
        C14046bv c14046bv2 = C14046bv.f47165du;
        if (C14046bv.m66448ck(c14046bv, c14046bv2) || C14046bv.m66484m9(c14046bv, C14046bv.m66446c5(c14046bv.Clone()))) {
            throw new XmlSchemaException("The value for the 'maxOccurs' attribute must be xsd:nonNegativeInteger or 'unbounded'.", C14113y2.f47374k4);
        }
        c14046bv.CloneTo(this.f43532kk);
        if (C14046bv.m66453dy(this.f43532kk, c14046bv2) && (this.f43533to & 1) == 0) {
            c14046bv2.CloneTo(this.f43534x1);
        }
        this.f43533to |= 2;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m60243c5(String str) {
        int i;
        if (str == null) {
            C14046bv.f47169to.CloneTo(this.f43532kk);
            i = this.f43533to & (-3);
        } else {
            if ("unbounded".equals(str)) {
                C14046bv.f47170x1.CloneTo(this.f43532kk);
            } else {
                C13850af.m65072fa(str).CloneTo(this.f43532kk);
                C14046bv c14046bv = this.f43532kk;
                C14046bv c14046bv2 = C14046bv.f47165du;
                if (C14046bv.m66448ck(c14046bv, c14046bv2)) {
                    throw new XmlSchemaException("The value for the 'maxOccurs' attribute must be xsd:nonNegativeInteger or 'unbounded'.", C14113y2.f47374k4);
                }
                if (C14046bv.m66453dy(this.f43532kk, c14046bv2) && (this.f43533to & 1) == 0) {
                    c14046bv2.CloneTo(this.f43534x1);
                }
            }
            i = this.f43533to | 2;
        }
        this.f43533to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo60251x1() {
        return C14046bv.m66453dy(this.f43532kk, C14046bv.f47165du);
    }
}
