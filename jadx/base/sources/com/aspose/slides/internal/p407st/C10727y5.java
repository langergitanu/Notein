package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.y5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10727y5 {

    /* JADX INFO: renamed from: h4 */
    private C10495ji f37533h4;

    /* JADX INFO: renamed from: k4 */
    private int f37534k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC10376bv f37535kk;

    /* JADX INFO: renamed from: to */
    private List<C10395d2> f37537to;

    /* JADX INFO: renamed from: x1 */
    private boolean f37538x1;

    /* JADX INFO: renamed from: du */
    private C10395d2 f37532du = null;

    /* JADX INFO: renamed from: m9 */
    private short f37536m9 = 0;

    public C10727y5(AbstractC10376bv abstractC10376bv) {
        m52053k4(abstractC10376bv);
        this.f37537to = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final int m52055du() {
        int iM50582ak = 0;
        for (int i = 0; i < this.f37537to.size(); i++) {
            iM50582ak += this.f37537to.get_Item(i).m50582ak();
        }
        return iM50582ak;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<C10495ji> m52056h4() {
        List<C10495ji> list = new List<>();
        for (int i = 0; i < this.f37537to.size(); i++) {
            C10395d2 c10395d2 = this.f37537to.get_Item(i);
            if (c10395d2.m50599kk()) {
                list.addItem(c10395d2.m50592ix());
            }
        }
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C10395d2> m52057k4(long j) {
        for (int i = 0; i < this.f37537to.size(); i++) {
            C10395d2 c10395d2 = this.f37537to.get_Item(i);
            if (c10395d2.m50599kk()) {
                C10495ji c10495jiM50592ix = c10395d2.m50592ix();
                if (c10495jiM50592ix.m51012x1() == j) {
                    List<C10395d2> list = new List<>();
                    list.addItem(c10395d2);
                    int iM51010kk = c10495jiM50592ix.m51010kk();
                    if (iM51010kk > 1) {
                        for (int i2 = 1; i2 < iM51010kk; i2++) {
                            int i3 = i + i2;
                            if (i3 < this.f37537to.size()) {
                                list.addItem(this.f37537to.get_Item(i3));
                            }
                        }
                    }
                    return list;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final C10395d2 m52062kk() {
        C10395d2 c10395d2;
        if (this.f37538x1) {
            C10395d2 c10395d22 = this.f37532du;
            if (c10395d22 == null || !c10395d22.m50615x1()) {
                c10395d2 = new C10395d2(this);
                this.f37532du = c10395d2;
                this.f37537to.addItem(c10395d2);
            }
        } else if (this.f37537to.size() == 0) {
            c10395d2 = new C10395d2(this);
            this.f37532du = c10395d2;
            this.f37537to.addItem(c10395d2);
        }
        return this.f37532du;
    }

    /* JADX INFO: renamed from: to */
    public final C10495ji m52063to() {
        return this.f37533h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10376bv m52064x1() {
        return this.f37535kk;
    }

    public C10727y5(AbstractC10376bv abstractC10376bv, List<C10395d2> list) {
        m52053k4(abstractC10376bv);
        this.f37537to = list == null ? new List<>() : list;
    }

    /* JADX INFO: renamed from: x1 */
    private void m52054x1(AbstractC10571o4 abstractC10571o4) {
        if (abstractC10571o4 instanceof C10495ji) {
            this.f37536m9 = (short) 0;
            this.f37533h4 = (C10495ji) abstractC10571o4;
        }
        if (abstractC10571o4 instanceof C10587pa) {
            C10695wm c10695wmM51409um = abstractC10571o4.m51409um();
            short s = this.f37536m9;
            this.f37536m9 = (short) (s + 1);
            c10695wmM51409um.m51920k4(s);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C10395d2 m52058k4() {
        return this.f37532du;
    }

    /* JADX INFO: renamed from: k4 */
    private void m52052k4(int i) {
        int i2 = this.f37534k4;
        if (i2 == 0) {
            if (i == 3998) {
                throw new Exception(C14113y2.m67402k4("SlideListWithText can't contain {0} ({1})", AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10400dg.class), Integer.valueOf(i)), Integer.valueOf(i)));
            }
        } else if (i2 == 1 && i == 1011) {
            throw new Exception(C14113y2.m67402k4("ClientTextBox can't contain {0} ({1})", AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10400dg.class), Integer.valueOf(i)), Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52059k4(C3134k4 c3134k4, int i) {
        if (this.f37538x1) {
            this.f37537to.clear();
            this.f37532du = null;
        } else {
            this.f37532du.m50597k4(true);
        }
        int iM51914du = 0;
        while (iM51914du + 4 < i) {
            C10695wm c10695wm = new C10695wm(c3134k4);
            AbstractC10571o4 abstractC10571o4M51432k4 = C10576og.m51432k4(c10695wm, null, this.f37535kk, c3134k4);
            m52061k4(abstractC10571o4M51432k4);
            abstractC10571o4M51432k4.m51405k4(c3134k4, c10695wm);
            iM51914du += abstractC10571o4M51432k4.m51409um().m51914du() + 8;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52060k4(C3149x1 c3149x1) {
        for (int i = 0; i < this.f37537to.size(); i++) {
            this.f37537to.get_Item(i).m50595k4(c3149x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m52053k4(AbstractC10376bv abstractC10376bv) {
        this.f37535kk = abstractC10376bv;
        if (abstractC10376bv.m51409um().m51923to() != 4080) {
            this.f37534k4 = 1;
            this.f37538x1 = false;
        } else {
            this.f37534k4 = 0;
            this.f37538x1 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m52061k4(AbstractC10571o4 abstractC10571o4) {
        m52052k4(abstractC10571o4.m51409um().m51923to());
        if (C7019kk.m27469x1(abstractC10571o4, InterfaceC10710xb.class)) {
            C10395d2 c10395d2 = this.f37532du;
            if (c10395d2 == null || !c10395d2.m50598k4(abstractC10571o4.m51409um().m51923to())) {
                m52062kk();
            }
            this.f37532du.m50596k4((InterfaceC10710xb) abstractC10571o4);
            m52054x1(abstractC10571o4);
        }
    }
}
