package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class mhp extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26871du = new C7017h4("t", "r", "rPh", "phoneticPr");

    /* JADX INFO: renamed from: k4 */
    private String f26872k4;

    /* JADX INFO: renamed from: kk */
    private List<t8o> f26873kk;

    /* JADX INFO: renamed from: to */
    private tc4 f26874to;

    /* JADX INFO: renamed from: x1 */
    private List<xf2> f26875x1;

    public mhp() {
        m36961to();
    }

    /* JADX INFO: renamed from: to */
    private void m36961to() {
        this.f26875x1 = new List<>();
        this.f26873kk = new List<>();
    }

    public mhp(final AbstractC13912i5 abstractC13912i5) {
        m36961to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mhp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz xf2Var;
                List list;
                int iM27428k4 = mhp.f26871du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 0) {
                    if (iM27428k4 == 1) {
                        xf2Var = new xf2(abstractC13912i5);
                        list = mhp.this.f26875x1;
                    } else if (iM27428k4 == 2) {
                        xf2Var = new t8o(abstractC13912i5);
                        list = mhp.this.f26873kk;
                    } else {
                        if (iM27428k4 != 3) {
                            return false;
                        }
                        mhp.this.f26874to = new tc4(abstractC13912i5);
                    }
                    list.addItem(xf2Var);
                } else {
                    mhp.this.f26872k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            mhp mhpVar = mhp.this;
                            mhpVar.f26872k4 = C14113y2.m67400k4(mhpVar.f26872k4, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36963k4() {
        return this.f26872k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final xf2[] m36965x1() {
        return this.f26875x1.toArray(new xf2[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36964k4(String str) {
        this.f26872k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        mhp mhpVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26872k4;
        if (str3 != null) {
            mhpVar = this;
            c3059ii2 = c3059ii;
            mhpVar.m29301k4("ssml", c3059ii2, "t", str3, true);
        } else {
            mhpVar = this;
            c3059ii2 = c3059ii;
        }
        List.Enumerator<t8o> it = mhpVar.f26875x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii2, "r");
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = mhpVar.f26873kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii2, "rPh");
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        tc4 tc4Var = mhpVar.f26874to;
        if (tc4Var != null) {
            tc4Var.mo6846k4("ssml", c3059ii2, "phoneticPr");
        }
        c3059ii2.mo21898jd();
    }
}
