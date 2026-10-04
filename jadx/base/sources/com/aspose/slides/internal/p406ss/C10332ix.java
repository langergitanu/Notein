package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C10332ix extends AbstractC3524ks implements InterfaceC10331h4 {

    /* JADX INFO: renamed from: c5 */
    private boolean f36774c5;

    /* JADX INFO: renamed from: dy */
    private List<C10335kk> f36775dy;

    /* JADX INFO: renamed from: h4 */
    private AbstractC4282kp f36776h4;

    /* JADX INFO: renamed from: jd */
    private boolean f36777jd;

    /* JADX INFO: renamed from: m9 */
    private int f36778m9;

    public C10332ix(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36778m9 = 0;
        this.f36774c5 = false;
        this.f36777jd = false;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: du */
    public final boolean mo50314du() {
        return false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1("(conditional-page-master-reference+)");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        this.f36775dy = new List<>();
        ((C10333jd) this.f9752k4).m50355k4((InterfaceC10331h4) this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 62;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final C10339qq mo50315k4(boolean z, boolean z2, boolean z3, boolean z4) {
        if (!mo50320to() && this.f36778m9 >= m50350ts()) {
            return null;
        }
        this.f36778m9++;
        List.Enumerator<C10335kk> it = this.f36775dy.iterator();
        while (it.hasNext()) {
            try {
                C10335kk next = it.next();
                if (next.m50366k4(z, z2, z3, z4)) {
                    return next.m50367ts();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: kk */
    public final boolean mo50319kk() {
        return this.f36774c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "repeatable-page-master-alternatives";
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: to */
    public final boolean mo50320to() {
        return m50350ts() == -1;
    }

    /* JADX INFO: renamed from: ts */
    public final int m50350ts() {
        if (this.f36776h4.mo17251du() == 89) {
            return -1;
        }
        int iMo9884to = this.f36776h4.mo9878h4().mo9884to();
        if (iMo9884to < 0) {
            return 0;
        }
        return iMo9884to;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: x1 */
    public final boolean mo50321x1() {
        int i = this.f36778m9;
        if (i == 0) {
            return false;
        }
        this.f36778m9 = i - 1;
        return true;
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final void mo50316k4() {
        this.f36778m9 = 0;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f36776h4 = abstractC3533um.m14385du(156);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || C14113y2.m67363du(str2, "conditional-page-master-reference")) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50349k4(C10335kk c10335kk) {
        this.f36775dy.addItem(c10335kk);
        if (c10335kk.m50364e0() == 72) {
            this.f36774c5 = true;
        }
        if (c10335kk.m50364e0() == 186) {
            this.f36777jd = true;
        }
    }

    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final void mo50317k4(C10337m9 c10337m9) {
        List.Enumerator<C10335kk> it = this.f36775dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().m50365k4(c10337m9);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p406ss.InterfaceC10331h4
    /* JADX INFO: renamed from: k4 */
    public final boolean mo50318k4(String str) {
        boolean zM67363du;
        List list = new List();
        List.Enumerator<C10335kk> it = this.f36775dy.iterator();
        while (true) {
            try {
                zM67363du = false;
                if (!it.hasNext()) {
                    break;
                }
                C10335kk next = it.next();
                if (next.m50366k4(true, false, false, false) || next.m50366k4(false, false, false, false)) {
                    list.addItem(next);
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
        if (list.size() == 0) {
            return true;
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                C10339qq c10339qqM50367ts = ((C10335kk) it2.next()).m50367ts();
                zM67363du = c10339qqM50367ts == null ? true : zM67363du | C14113y2.m67363du(c10339qqM50367ts.m50385m9(58).m50335bz(), str);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return zM67363du;
    }
}
