package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C11179dq extends C11221um {

    /* JADX INFO: renamed from: du */
    private Hashtable f38484du;

    /* JADX INFO: renamed from: h4 */
    private Hashtable f38485h4;

    /* JADX INFO: renamed from: kk */
    private boolean f38486kk;

    /* JADX INFO: renamed from: m9 */
    private Hashtable f38487m9;

    /* JADX INFO: renamed from: to */
    private boolean f38488to;

    /* JADX INFO: renamed from: x1 */
    private C11179dq f38489x1;

    public C11179dq(C11179dq c11179dq) {
        m53696k4(c11179dq);
    }

    /* JADX INFO: renamed from: du */
    public final void m53691du(String str) {
        if (this.f38487m9 == null) {
            this.f38487m9 = new Hashtable();
        }
        this.f38487m9.set_Item(str, null);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m53693h4() {
        Hashtable hashtable = this.f38484du;
        if (hashtable == null) {
            return 0;
        }
        return hashtable.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11194j5 m53695k4(C13890ei c13890ei) {
        C11194j5 c11194j5;
        for (C11179dq c11179dqM53703x1 = this; c11179dqM53703x1 != null; c11179dqM53703x1 = c11179dqM53703x1.m53703x1()) {
            if (c11179dqM53703x1.m53699kk() != null && (c11194j5 = (C11194j5) c11179dqM53703x1.m53699kk().get_Item(c13890ei)) != null) {
                return c11194j5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final Hashtable m53699kk() {
        return this.f38484du;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53701to() {
        return this.f38486kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11179dq m53703x1() {
        return this.f38489x1;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m53692du() {
        return this.f38488to;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m53694h4(String str) {
        Hashtable hashtable = this.f38487m9;
        if (hashtable == null) {
            return false;
        }
        return hashtable.contains(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53696k4(C11179dq c11179dq) {
        this.f38711k4 = null;
        this.f38489x1 = c11179dq;
        if (c11179dq != null) {
            this.f38486kk = c11179dq.f38486kk;
            this.f38488to = c11179dq.f38488to;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m53700kk(String str) {
        if (this.f38485h4 == null) {
            this.f38485h4 = new Hashtable();
        }
        this.f38485h4.set_Item(str, null);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53702to(String str) {
        Hashtable hashtable = this.f38485h4;
        if (hashtable == null) {
            return false;
        }
        return hashtable.contains(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final C11194j5 m53704x1(C13890ei c13890ei) {
        C11179dq c11179dq = null;
        for (C11179dq c11179dqM53703x1 = this; c11179dqM53703x1 != null; c11179dqM53703x1 = c11179dqM53703x1.m53703x1()) {
            c11179dq = c11179dqM53703x1;
        }
        return c11179dq.m53695k4(c13890ei);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53697k4(C11194j5 c11194j5) {
        if (this.f38484du == null) {
            this.f38484du = new Hashtable();
        }
        this.f38484du.set_Item(c11194j5.m53816kk(), c11194j5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53705x1(boolean z) {
        this.f38488to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53698k4(boolean z) {
        this.f38486kk = z;
    }
}
