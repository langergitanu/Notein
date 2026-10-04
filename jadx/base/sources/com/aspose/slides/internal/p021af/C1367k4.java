package com.aspose.slides.internal.p021af;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p435u5.C11284k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p491x3.InterfaceC12377k4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.af.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1367k4 implements InterfaceC1368kk {

    /* JADX INFO: renamed from: du */
    private Dictionary<InterfaceC12769ix, k4> f5933du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private Dictionary<String, k4> f5934h4 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12377k4 f5935k4;

    /* JADX INFO: renamed from: kk */
    private C10948ar[] f5936kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<String, C12007ix> f5937to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12778rv f5938x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.af.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private String f5939k4;

        /* JADX INFO: renamed from: kk */
        private List<AbstractC10973uz> f5940kk = new List<>();

        /* JADX INFO: renamed from: x1 */
        private InterfaceC12769ix f5941x1;

        public k4(String str, InterfaceC12769ix interfaceC12769ix) {
            this.f5939k4 = str;
            this.f5941x1 = interfaceC12769ix;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m8120k4() {
            return this.f5939k4;
        }

        /* JADX INFO: renamed from: kk */
        public final List<AbstractC10973uz> m8121kk() {
            return this.f5940kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final InterfaceC12769ix m8122x1() {
            return this.f5941x1;
        }
    }

    public C1367k4(InterfaceC12778rv interfaceC12778rv, InterfaceC12377k4 interfaceC12377k4) {
        this.f5938x1 = interfaceC12778rv;
        this.f5935k4 = interfaceC12377k4;
    }

    /* JADX INFO: renamed from: k4 */
    private k4 m8107k4(String str) {
        if (this.f5934h4.containsKey(str)) {
            return this.f5934h4.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    private k4 m8109kk(InterfaceC12769ix interfaceC12769ix) {
        if (this.f5933du.containsKey(interfaceC12769ix)) {
            return this.f5933du.get_Item(interfaceC12769ix);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p021af.InterfaceC1368kk
    /* JADX INFO: renamed from: x1 */
    public final C1369x1 mo8117x1(AbstractC10973uz abstractC10973uz) {
        C11284k4.m54244k4(abstractC10973uz, "node");
        InterfaceC12769ix interfaceC12769ixM8111k4 = m8111k4(abstractC10973uz);
        if (interfaceC12769ixM8111k4 == null) {
            return null;
        }
        return mo8118x1(interfaceC12769ixM8111k4);
    }

    /* JADX INFO: renamed from: kk */
    private void m8110kk(AbstractC10973uz abstractC10973uz) {
        k4 k4VarM8107k4;
        if (!C14113y2.m67411k4(abstractC10973uz.m53113ar()) && (k4VarM8107k4 = m8107k4(C14113y2.m67358c5(abstractC10973uz.m53113ar()))) != null) {
            k4VarM8107k4.m8121kk().addItem(abstractC10973uz);
        }
        AbstractC10957fa abstractC10957fa = (AbstractC10957fa) C7019kk.m27452k4((Object) abstractC10973uz, AbstractC10957fa.class);
        if (abstractC10957fa != null) {
            for (int i = 0; i < abstractC10957fa.m52927c5(); i++) {
                m8110kk(abstractC10957fa.m52931k4(i));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12769ix m8111k4(AbstractC10973uz abstractC10973uz) {
        k4 k4VarM8107k4;
        if (C14113y2.m67411k4(abstractC10973uz.m53113ar()) || (k4VarM8107k4 = m8107k4(C14113y2.m67358c5(abstractC10973uz.m53113ar()))) == null) {
            return null;
        }
        return k4VarM8107k4.m8122x1();
    }

    @Override // com.aspose.slides.internal.p021af.InterfaceC1368kk
    /* JADX INFO: renamed from: x1 */
    public final C1369x1 mo8118x1(InterfaceC12769ix interfaceC12769ix) {
        C11284k4.m54244k4(interfaceC12769ix, "element");
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        C12007ix[] c12007ixArr = {c12007ixClone};
        m8116k4(interfaceC12769ix, c12007ixArr);
        c12007ixArr[0].CloneTo(c12007ixClone);
        return new C1369x1(interfaceC12769ix, c12007ixClone.Clone(), this);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12778rv m8112k4() {
        return this.f5938x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10948ar[] m8119x1() {
        return this.f5936kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m8113k4(InterfaceC12769ix interfaceC12769ix) {
        if (this.f5933du.containsKey(interfaceC12769ix)) {
            return m8109kk(interfaceC12769ix).m8120k4();
        }
        String strMo57966k4 = this.f5935k4.mo57966k4(interfaceC12769ix);
        if (strMo57966k4 == null || strMo57966k4.length() == 0) {
            return strMo57966k4;
        }
        String strM67358c5 = C14113y2.m67358c5(strMo57966k4);
        m8108k4(new k4(strM67358c5, interfaceC12769ix));
        return strM67358c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8114k4(Dictionary<String, C12007ix> dictionary) {
        this.f5937to = dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8108k4(k4 k4Var) {
        this.f5933du.addItem(k4Var.m8122x1(), k4Var);
        this.f5934h4.addItem(k4Var.m8120k4(), k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8115k4(C10948ar[] c10948arArr) {
        this.f5936kk = c10948arArr;
        for (C10948ar c10948ar : c10948arArr) {
            m8110kk(c10948ar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8116k4(InterfaceC12769ix interfaceC12769ix, C12007ix[] c12007ixArr) {
        k4 k4VarM8109kk = m8109kk(interfaceC12769ix);
        if (k4VarM8109kk == null) {
            return false;
        }
        String strM67368h4 = C14113y2.m67368h4(k4VarM8109kk.m8120k4());
        if (!this.f5937to.containsKey(strM67368h4)) {
            return false;
        }
        this.f5937to.get_Item(strM67368h4).CloneTo(c12007ixArr[0]);
        return true;
    }
}
