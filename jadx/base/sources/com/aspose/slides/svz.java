package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10665uh;
import com.aspose.slides.internal.p407st.C10695wm;
import com.aspose.slides.internal.p407st.C10712xh;

/* JADX INFO: loaded from: classes3.dex */
class svz {

    /* JADX INFO: renamed from: k4 */
    private rtn f48933k4;

    /* JADX INFO: renamed from: kk */
    private tif[] f48934kk;

    /* JADX INFO: renamed from: x1 */
    private List<Integer> f48936x1 = new List<>();

    /* JADX INFO: renamed from: to */
    private SortedList<Long, Integer> f48935to = new SortedList<>();

    /* JADX INFO: renamed from: du */
    private List<AbstractC10571o4> f48932du = new List<>();

    public svz(C10695wm c10695wm, rtn rtnVar) {
        this.f48933k4 = rtnVar;
        if (c10695wm.m51922kk() == 2 && C7019kk.m27435du(Long.valueOf(rtnVar.m70350to().m51928du()), 10) > 0) {
            C10495ji c10495ji = new C10495ji(null);
            c10495ji.m51008k4(rtnVar.m70350to().m51928du());
            c10495ji.m51013x1(0L);
            this.f48932du.addItem(c10495ji);
        }
        m70804k4(c10695wm);
        this.f48934kk = new tif[m70805kk()];
    }

    /* JADX INFO: renamed from: du */
    public final boolean m70800du() {
        return this.f48933k4.m70348kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final rtn m70801k4() {
        return this.f48933k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m70805kk() {
        return this.f48936x1.size();
    }

    /* JADX INFO: renamed from: to */
    public final List<AbstractC10571o4> m70806to() {
        return this.f48932du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3134k4 m70807x1() {
        return this.f48933k4.m70346k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final tif m70802k4(int i) {
        if (this.f48934kk[i] == null) {
            int iIntValue = this.f48936x1.get_Item(i).intValue();
            C10495ji c10495ji = (C10495ji) this.f48932du.get_Item(iIntValue);
            tif tifVar = new tif(c10495ji, this);
            int size = m70806to().size();
            for (int i2 = iIntValue + 1; i2 < size && C7019kk.m27457kk(Integer.valueOf(m70806to().get_Item(i2).m51404bv()), 8) != C7019kk.m27457kk(Integer.valueOf(c10495ji.m51404bv()), 8); i2++) {
                tifVar.m71222k4(m70806to().get_Item(i2));
            }
            this.f48934kk[i] = tifVar;
        }
        return this.f48934kk[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final tif m70803k4(long j) {
        if (this.f48935to.containsKey(Long.valueOf(j))) {
            return m70802k4(this.f48935to.get_Item(Long.valueOf(j)).intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70804k4(C10695wm c10695wm) {
        List<AbstractC10571o4> list;
        AbstractC10571o4 abstractC10571o4;
        C3134k4 c3134k4M70346k4 = this.f48933k4.m70346k4();
        ofi ofiVar = new ofi(c10695wm, c3134k4M70346k4);
        try {
            boolean z = false;
            for (C10695wm c10695wmM68513x1 = ofiVar.m68513x1(); c10695wmM68513x1 != null; c10695wmM68513x1 = ofiVar.m68513x1()) {
                int iM51923to = c10695wmM68513x1.m51923to();
                if (iM51923to == 1011) {
                    if (z) {
                        this.f48932du.addItem(new C10712xh(null));
                    }
                    C10495ji c10495ji = new C10495ji(null);
                    c10495ji.m51405k4(c3134k4M70346k4, c10695wmM68513x1);
                    this.f48935to.addItem(Long.valueOf(c10495ji.m51011to()), Integer.valueOf(this.f48936x1.size()));
                    this.f48936x1.addItem(Integer.valueOf(this.f48932du.size()));
                    list = this.f48932du;
                    abstractC10571o4 = c10495ji;
                } else if (iM51923to != 4008) {
                    if (iM51923to == 3999) {
                        if (z) {
                            this.f48932du.addItem(new C10712xh(null));
                        }
                        z = true;
                    } else if (iM51923to == 4000) {
                        C10665uh c10665uh = new C10665uh(null);
                        c10665uh.m51405k4(c3134k4M70346k4, c10695wmM68513x1);
                        list = this.f48932du;
                        abstractC10571o4 = c10665uh;
                    }
                } else {
                    C10712xh c10712xh = new C10712xh(null);
                    c10712xh.m51405k4(c3134k4M70346k4, c10695wmM68513x1);
                    list = this.f48932du;
                    abstractC10571o4 = c10712xh;
                }
                list.addItem(abstractC10571o4);
                z = false;
            }
            ofiVar.dispose();
        } catch (Throwable th) {
            ofiVar.dispose();
            throw th;
        }
    }
}
