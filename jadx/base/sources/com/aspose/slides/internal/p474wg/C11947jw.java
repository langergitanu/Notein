package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.Generic.LinkedList;
import com.aspose.slides.Collections.Generic.LinkedListNode;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.jw */
/* JADX INFO: loaded from: classes5.dex */
class C11947jw {

    /* JADX INFO: renamed from: h4 */
    private boolean f40261h4;

    /* JADX INFO: renamed from: kk */
    private String f40263kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC14049c6 f40264m9;

    /* JADX INFO: renamed from: x1 */
    private C11934f9 f40266x1;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7018k4<AbstractC14049c6> f40262k4 = new C11991y2(this);

    /* JADX INFO: renamed from: to */
    private LinkedList<k4> f40265to = new LinkedList<>();

    /* JADX INFO: renamed from: du */
    private Queue f40260du = new Queue();

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.jw$k4 */
    public static class k4 implements InterfaceC11936g8 {

        /* JADX INFO: renamed from: k4 */
        private C11917ai f40267k4;

        /* JADX INFO: renamed from: kk */
        private boolean f40268kk;

        /* JADX INFO: renamed from: to */
        private C14084qq f40269to = new C14084qq();

        /* JADX INFO: renamed from: x1 */
        private C11947jw f40270x1;

        public k4(C11947jw c11947jw) {
            m55990k4(c11947jw);
            C14084qq.m67074c5().CloneTo(this.f40269to);
            m55989k4(new C11917ai(this, c11947jw.f40266x1));
        }

        /* JADX INFO: renamed from: du */
        public C11934f9 m55991du() {
            return mo55970k4().f40266x1;
        }

        /* JADX INFO: renamed from: h4 */
        public boolean m55992h4() {
            return this.f40268kk;
        }

        @Override // com.aspose.slides.internal.p474wg.InterfaceC11936g8
        /* JADX INFO: renamed from: k4 */
        public C11947jw mo55970k4() {
            return this.f40270x1;
        }

        @Override // com.aspose.slides.internal.p474wg.InterfaceC11936g8
        /* JADX INFO: renamed from: kk */
        public void mo55971kk() {
            synchronized (m55991du()) {
                this.f40268kk = false;
                C14084qq.m67074c5().CloneTo(this.f40269to);
            }
        }

        /* JADX INFO: renamed from: m9 */
        public C14084qq m55993m9() {
            return this.f40269to;
        }

        /* JADX INFO: renamed from: to */
        public C11917ai m55994to() {
            return this.f40267k4;
        }

        @Override // com.aspose.slides.internal.p474wg.InterfaceC11936g8
        /* JADX INFO: renamed from: x1 */
        public boolean mo55972x1() {
            synchronized (m55991du()) {
                try {
                    if (this.f40268kk) {
                        return false;
                    }
                    this.f40268kk = true;
                    C14084qq.m67088k4(C14084qq.m67074c5(), C14077m4.m66799k4(C7019kk.m27433c5(3650, 9))).CloneTo(this.f40269to);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m55989k4(C11917ai c11917ai) {
            this.f40267k4 = c11917ai;
        }

        /* JADX INFO: renamed from: k4 */
        private void m55990k4(C11947jw c11947jw) {
            this.f40270x1 = c11947jw;
        }
    }

    public C11947jw(C11934f9 c11934f9, String str) {
        this.f40266x1 = c11934f9;
        this.f40263kk = str;
    }

    /* JADX INFO: renamed from: kk */
    private k4 m55983kk() {
        for (k4 k4Var : this.f40265to) {
            if (!k4Var.m55992h4()) {
                this.f40265to.removeItem(k4Var);
                this.f40265to.addFirst(k4Var);
                return k4Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public C11917ai m55985k4(C11975um c11975um, boolean[] zArr) {
        C11917ai c11917aiM55984x1;
        synchronized (this.f40266x1) {
            c11917aiM55984x1 = m55984x1(c11975um, zArr);
        }
        return c11917aiM55984x1;
    }

    /* JADX INFO: renamed from: x1 */
    public Queue m55988x1() {
        return this.f40260du;
    }

    /* JADX INFO: renamed from: x1 */
    private C11917ai m55984x1(C11975um c11975um, boolean[] zArr) {
        k4 k4VarM55983kk = m55983kk();
        if (k4VarM55983kk != null) {
            zArr[0] = false;
            m55982k4(k4VarM55983kk.m55994to(), c11975um);
            return k4VarM55983kk.m55994to();
        }
        if (this.f40266x1.m55963x1() > this.f40265to.size() || this.f40265to.size() == 0) {
            zArr[0] = true;
            k4 k4Var = new k4(this);
            this.f40265to.addFirst(k4Var);
            return k4Var.m55994to();
        }
        zArr[0] = false;
        k4 value = this.f40265to.getLast().getValue();
        this.f40265to.removeItem(value);
        this.f40265to.addFirst(value);
        return value.m55994to();
    }

    /* JADX INFO: renamed from: k4 */
    public String m55986k4() {
        return this.f40263kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55982k4(C11917ai c11917ai, C11975um c11975um) {
        if (c11917ai.m55861to()) {
            C11950kp c11950kpM55848du = c11917ai.m55848du();
            InterfaceC11926c6 interfaceC11926c6Mo56225m9 = (c11975um.mo56233up() == null || c11975um.mo56233up().mo56113x1(c11975um.mo56240yj())) ? c11975um.mo56225m9() : c11975um.mo56233up().mo56111k4();
            C11950kp c11950kpMo55894k4 = interfaceC11926c6Mo56225m9 != null ? interfaceC11926c6Mo56225m9.mo55894k4(c11975um.mo56240yj(), "NTLM") : null;
            boolean z = true;
            boolean z2 = (c11950kpM55848du != null && c11950kpMo55894k4 != null && C14113y2.m67363du(c11950kpM55848du.m56001k4(), c11950kpMo55894k4.m56001k4()) && C14113y2.m67363du(c11950kpM55848du.m56003x1(), c11950kpMo55894k4.m56003x1()) && C14113y2.m67363du(c11950kpM55848du.m56002kk(), c11950kpMo55894k4.m56002kk())) ? false : true;
            if (!z2) {
                boolean zM56226ne = c11975um.m56226ne();
                boolean zM55849h4 = c11917ai.m55849h4();
                if (zM56226ne && zM56226ne == zM55849h4) {
                    z = false;
                }
                z2 = z;
            }
            if (z2) {
                c11917ai.m55856k4(false);
                c11917ai.m55859kk();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55987k4(C14077m4 c14077m4, C14084qq[] c14084qqArr) {
        C14084qq c14084qqM67152wl = C14084qq.m67074c5().Clone();
        while (true) {
            synchronized (this.f40266x1) {
                try {
                    boolean z = true;
                    if (this.f40261h4) {
                        C14084qq.f47299x1.CloneTo(c14084qqArr[0]);
                        return true;
                    }
                    LinkedListNode<k4> first = this.f40265to.getFirst();
                    List list = null;
                    int i = 0;
                    while (first != null) {
                        k4 value = first.getValue();
                        LinkedListNode<k4> next = first.getNext();
                        i++;
                        if (!value.m55992h4()) {
                            if (i > this.f40266x1.m55963x1() || !C14077m4.m66797h4(C14084qq.m67073c5(c14084qqM67152wl, value.m55993m9()), c14077m4)) {
                                if (list == null) {
                                    list = new List();
                                }
                                list.addItem(value.m55994to());
                                this.f40265to.remove(first);
                            } else if (C14084qq.m67094k4(value.m55993m9(), c14084qqArr[0])) {
                                value.m55993m9().CloneTo(c14084qqArr[0]);
                            }
                        }
                        first = next;
                    }
                    if (this.f40265to.size() != 0) {
                        z = false;
                    }
                    if (list == null) {
                        return z;
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((C11917ai) it.next()).m55856k4(false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
