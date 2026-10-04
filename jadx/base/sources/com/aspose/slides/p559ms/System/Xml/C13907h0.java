package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13907h0 implements Cloneable {

    /* JADX INFO: renamed from: c5 */
    private int f46546c5;

    /* JADX INFO: renamed from: ck */
    private boolean f46547ck;

    /* JADX INFO: renamed from: du */
    private int f46548du;

    /* JADX INFO: renamed from: dy */
    private boolean f46549dy;

    /* JADX INFO: renamed from: fa */
    private boolean f46550fa;

    /* JADX INFO: renamed from: h4 */
    private String f46551h4;

    /* JADX INFO: renamed from: ix */
    private String f46552ix;

    /* JADX INFO: renamed from: jd */
    private int f46553jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC6747ar f46554k4;

    /* JADX INFO: renamed from: kk */
    private int f46555kk;

    /* JADX INFO: renamed from: ks */
    private boolean f46556ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f46557m9;

    /* JADX INFO: renamed from: ne */
    private String f46558ne;

    /* JADX INFO: renamed from: rv */
    private boolean f46559rv;

    /* JADX INFO: renamed from: to */
    private String f46560to;

    /* JADX INFO: renamed from: u4 */
    private int f46561u4;

    /* JADX INFO: renamed from: up */
    private int f46562up;

    /* JADX INFO: renamed from: uz */
    private boolean f46563uz;

    /* JADX INFO: renamed from: wl */
    private boolean f46564wl;

    /* JADX INFO: renamed from: x1 */
    private boolean f46565x1;

    /* JADX INFO: renamed from: x6 */
    private String f46566x6;

    /* JADX INFO: renamed from: yj */
    private List<C13890ei> f46567yj = new List<>();

    public C13907h0() {
        m65413bv();
    }

    /* JADX INFO: renamed from: bv */
    private void m65413bv() {
        this.f46554k4 = AbstractC6747ar.m26635ix();
        this.f46565x1 = false;
        this.f46555kk = 0;
        this.f46560to = C14052dq.m66570kk();
        this.f46548du = -1;
        this.f46551h4 = "  ";
        this.f46557m9 = false;
        this.f46549dy = false;
        this.f46546c5 = 0;
        this.f46553jd = 2;
        this.f46547ck = true;
        this.f46550fa = true;
        this.f46562up = 0;
        this.f46567yj.clear();
        this.f46559rv = false;
        this.f46566x6 = null;
        this.f46558ne = null;
        this.f46552ix = null;
        this.f46561u4 = 0;
        this.f46556ks = false;
        this.f46564wl = false;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65414x1(String str) {
        if (this.f46564wl) {
            throw new XmlException("The '{0}' property is read only and cannot be set.", C14113y2.m67407k4(C14067j2.m66727k4(this).mo48540du(), Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), str));
        }
    }

    /* JADX INFO: renamed from: ar */
    public final boolean m65415ar() {
        return (this.f46567yj.size() == 0 && this.f46552ix == null && this.f46558ne == null && this.f46561u4 != 1) ? false : true;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m65416c5() {
        return this.f46553jd;
    }

    /* JADX INFO: renamed from: ck */
    public final int m65417ck() {
        return this.f46546c5;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m65418du() {
        return this.f46548du == 1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m65419dy() {
        return this.f46549dy;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m65420fa() {
        return this.f46550fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m65421h4() {
        return this.f46551h4;
    }

    /* JADX INFO: renamed from: ix */
    public final String m65422ix() {
        return this.f46558ne;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m65423jd() {
        return this.f46547ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6747ar m65424k4() {
        return this.f46554k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m65431kk() {
        return this.f46555kk;
    }

    /* JADX INFO: renamed from: ks */
    public final List<C13890ei> m65433ks() {
        return this.f46567yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m65434m9() {
        return this.f46557m9;
    }

    /* JADX INFO: renamed from: ne */
    public final String m65435ne() {
        return this.f46566x6;
    }

    /* JADX INFO: renamed from: qq */
    public final int m65436qq() {
        return this.f46548du;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m65437rv() {
        return this.f46556ks;
    }

    /* JADX INFO: renamed from: to */
    public final String m65438to() {
        return this.f46560to;
    }

    /* JADX INFO: renamed from: u4 */
    public final String m65439u4() {
        return this.f46552ix;
    }

    /* JADX INFO: renamed from: um */
    public Object m65440um() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: up */
    public final int m65441up() {
        return this.f46562up;
    }

    /* JADX INFO: renamed from: uz */
    public final int m65442uz() {
        return this.f46561u4;
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m65443wl() {
        return this.f46563uz;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m65446x6() {
        return this.f46559rv;
    }

    /* JADX INFO: renamed from: yj */
    public final C13907h0 m65447yj() {
        C13907h0 c13907h0 = (C13907h0) C7019kk.m27452k4(m65440um(), C13907h0.class);
        c13907h0.f46567yj = new List<>(this.f46567yj);
        c13907h0.f46564wl = false;
        return c13907h0;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13958qb m65425k4(AbstractC3124b3 abstractC3124b3) {
        AbstractC13965r5 c13859b5;
        if (abstractC3124b3 == null) {
            throw new ArgumentNullException("output");
        }
        int iM65441up = m65441up();
        if (iM65441up == 0) {
            c13859b5 = m65418du() ? new C13859b5(abstractC3124b3, this) : new C13893ew(abstractC3124b3, this);
        } else if (iM65441up == 1) {
            c13859b5 = m65418du() ? new C13852ak(abstractC3124b3, this) : new C14008wy(abstractC3124b3, this);
        } else if (iM65441up == 2) {
            c13859b5 = new C14021y2(abstractC3124b3, this);
        } else {
            if (iM65441up != 3) {
                return null;
            }
            c13859b5 = new C14030yw(abstractC3124b3, this);
        }
        if (m65441up() != 3 && m65415ar()) {
            c13859b5 = new C13952os(c13859b5, this);
        }
        return new C13955pt(c13859b5, this);
    }

    /* JADX INFO: renamed from: kk */
    public final void m65432kk(boolean z) {
        this.f46564wl = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65444x1(boolean z) {
        m65414x1("Indent");
        this.f46548du = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13958qb m65426k4(AbstractC3150x6 abstractC3150x6) {
        AbstractC13965r5 c13859b5;
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("output");
        }
        if ("utf-8".equals(m65424k4().mo26657jd())) {
            int iM65441up = m65441up();
            if (iM65441up == 0) {
                c13859b5 = m65418du() ? new C13993uo(abstractC3150x6, this) : new C13891ek(abstractC3150x6, this);
            } else if (iM65441up == 1) {
                c13859b5 = m65418du() ? new C13870c6(abstractC3150x6, this) : new C14017xk(abstractC3150x6, this);
            } else if (iM65441up == 2) {
                c13859b5 = new C13935m4(abstractC3150x6, this);
            } else {
                if (iM65441up != 3) {
                    return null;
                }
                c13859b5 = new C14030yw(abstractC3150x6, this);
            }
        } else {
            int iM65441up2 = m65441up();
            if (iM65441up2 == 0) {
                c13859b5 = m65418du() ? new C13859b5(abstractC3150x6, this) : new C13893ew(abstractC3150x6, this);
            } else if (iM65441up2 == 1) {
                c13859b5 = m65418du() ? new C13852ak(abstractC3150x6, this) : new C14008wy(abstractC3150x6, this);
            } else if (iM65441up2 == 2) {
                c13859b5 = new C14021y2(abstractC3150x6, this);
            } else {
                if (iM65441up2 != 3) {
                    return null;
                }
                c13859b5 = new C14030yw(abstractC3150x6, this);
            }
        }
        if (m65441up() != 3 && m65415ar()) {
            c13859b5 = new C13952os(c13859b5, this);
        }
        return new C13955pt(c13859b5, this);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m65445x1() {
        return this.f46565x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65427k4(int i) {
        this.f46562up = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65428k4(AbstractC6747ar abstractC6747ar) {
        m65414x1("Encoding");
        this.f46554k4 = abstractC6747ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65429k4(String str) {
        m65414x1("IndentChars");
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        this.f46551h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65430k4(boolean z) {
        m65414x1("OmitXmlDeclaration");
        this.f46565x1 = z;
    }
}
