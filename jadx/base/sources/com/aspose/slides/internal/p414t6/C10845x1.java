package com.aspose.slides.internal.p414t6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.C10150ck;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.t6.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10845x1 {

    /* JADX INFO: renamed from: k4 */
    private C10842k4 f37860k4;

    /* JADX INFO: renamed from: kk */
    private C10842k4 f37861kk;

    /* JADX INFO: renamed from: x1 */
    private C10842k4 f37862x1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final List<C10155jd> m52411k4(C10159m9 c10159m9) {
        C10842k4 c10842k4M52412k4 = m52412k4();
        C10842k4 c10842k4M52413kk = m52413kk();
        C10842k4 c10842k4M52416x1 = m52416x1();
        List<C10155jd> list = new List<>();
        C1869to c1869to = new C1869to(c10842k4M52412k4);
        while (c1869to.mo9764x1()) {
            String str = (String) c1869to.mo9760kk();
            Dictionary<C10155jd, String> dictionaryM49964kk = c10159m9.m49964kk();
            if (dictionaryM49964kk != null) {
                Dictionary.KeyCollection.Enumerator<C10155jd, String> it = dictionaryM49964kk.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        C10155jd next = it.next();
                        if (C14113y2.m67363du(C14113y2.m67368h4(str), C14113y2.m67368h4(next.m49937k4()))) {
                            int iM49938kk = next.m49938kk();
                            C1869to c1869to2 = new C1869to(c10842k4M52413kk);
                            boolean z = false;
                            boolean z2 = false;
                            while (c1869to2.mo9764x1()) {
                                T tMo9760kk = c1869to2.mo9760kk();
                                if (C7019kk.m27469x1(tMo9760kk, C10841du.class)) {
                                    if (((C10841du) tMo9760kk).m52405k4(iM49938kk)) {
                                        z2 = true;
                                    }
                                } else if (C7019kk.m27469x1(tMo9760kk, String.class)) {
                                    if (C10150ck.m49926k4((String) tMo9760kk) == iM49938kk) {
                                        z2 = true;
                                    }
                                } else if (C7019kk.m27469x1(tMo9760kk, Integer.class) && ((Integer) C7019kk.m27464to(tMo9760kk, Integer.TYPE)).intValue() == iM49938kk) {
                                    z2 = true;
                                }
                            }
                            String strM49940x1 = next.m49940x1();
                            C1869to c1869to3 = new C1869to(c10842k4M52416x1);
                            while (c1869to3.mo9764x1()) {
                                if (C14113y2.m67363du(strM49940x1, (String) c1869to3.mo9760kk())) {
                                    z = true;
                                }
                            }
                            if (z2 && z) {
                                list.addItem(next);
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final C10842k4 m52413kk() {
        C10842k4 c10842k4 = this.f37861kk;
        return c10842k4 == null ? C10842k4.m52407k4(C14057f9.m66591x1(400)) : c10842k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final List<C10155jd> m52414to() {
        C10155jd c10155jd;
        List<C10155jd> list = new List<>();
        C1869to c1869to = new C1869to(m52412k4());
        while (c1869to.mo9764x1()) {
            String str = (String) c1869to.mo9760kk();
            C1869to c1869to2 = new C1869to(m52416x1());
            while (c1869to2.mo9764x1()) {
                String str2 = (String) c1869to2.mo9760kk();
                C1869to c1869to3 = new C1869to(m52413kk());
                while (c1869to3.mo9764x1()) {
                    T tMo9760kk = c1869to3.mo9760kk();
                    if (C7019kk.m27469x1(tMo9760kk, C10841du.class)) {
                        for (int i : ((C10841du) tMo9760kk).m52406k4()) {
                            list.addItem(new C10155jd(str, str2, i, 97));
                        }
                    } else {
                        if (C7019kk.m27469x1(tMo9760kk, String.class)) {
                            c10155jd = new C10155jd(str, str2, C10150ck.m49926k4((String) tMo9760kk), 97);
                        } else if (C7019kk.m27469x1(tMo9760kk, Integer.class)) {
                            c10155jd = new C10155jd(str, str2, ((Integer) C7019kk.m27464to(tMo9760kk, Integer.TYPE)).intValue(), 97);
                        }
                        list.addItem(c10155jd);
                    }
                }
            }
        }
        return list;
    }

    public String toString() {
        String strM67400k4 = C14113y2.f47374k4;
        if (this.f37860k4 != null) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, "font-family=" + this.f37860k4);
        }
        if (this.f37862x1 != null) {
            if (strM67400k4.length() > 0) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, ", ");
            }
            strM67400k4 = C14113y2.m67400k4(strM67400k4, "font-style=" + this.f37862x1);
        }
        if (this.f37861kk == null) {
            return strM67400k4;
        }
        if (strM67400k4.length() > 0) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, ", ");
        }
        return C14113y2.m67400k4(strM67400k4, "font-weight=" + this.f37861kk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final C10155jd m52415x1(C10159m9 c10159m9) {
        List<C10155jd> listM52411k4 = m52411k4(c10159m9);
        if (listM52411k4.size() == 1) {
            return listM52411k4.get_Item(0);
        }
        C1869to c1869to = new C1869to(listM52411k4);
        C10155jd c10155jd = null;
        while (c1869to.mo9764x1()) {
            C10155jd c10155jd2 = (C10155jd) c1869to.mo9760kk();
            if (c10155jd == null || c10155jd2.m49939to() < c10155jd.m49939to()) {
                c10155jd = c10155jd2;
            }
        }
        return c10155jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10842k4 m52412k4() {
        return this.f37860k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10842k4 m52416x1() {
        C10842k4 c10842k4 = this.f37862x1;
        return c10842k4 == null ? C10842k4.m52407k4("normal") : c10842k4;
    }
}
