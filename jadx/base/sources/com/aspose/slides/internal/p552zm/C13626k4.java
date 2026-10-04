package com.aspose.slides.internal.p552zm;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p182ii.C4885ak;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5780c6;
import com.aspose.slides.internal.p231kk.InterfaceC5804ts;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p231kk.InterfaceC5806um;
import com.aspose.slides.internal.p270m9.InterfaceC6346qq;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.zm.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13626k4 implements InterfaceC5804ts {

    /* JADX INFO: renamed from: k4 */
    private List<InterfaceC5780c6> f45247k4;

    /* JADX INFO: renamed from: x1 */
    private static final String[] f45246x1 = {"STYLE", "LINK"};

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f45245kk = new C7017h4("STYLE", "LINK");

    /* JADX WARN: Multi-variable type inference failed */
    public C13626k4(C5552rv c5552rv) {
        InterfaceC5775ar interfaceC5775arMo25990k4;
        List<InterfaceC5780c6> list;
        InterfaceC6346qq interfaceC6346qqMo20431k4 = ((InterfaceC5805u4) c5552rv).mo20431k4();
        AbstractC5558v4 abstractC5558v4M22785k4 = c5552rv.m22785k4(AbstractC14092to.m67204k4((Object[]) f45246x1));
        this.f45247k4 = new List<>();
        IGenericEnumerator<InterfaceC12777qq> it = abstractC5558v4M22785k4.iterator();
        while (it.hasNext()) {
            int iM27428k4 = f45245kk.m27428k4(((C5543ix) it.next()).mo22700du());
            if (iM27428k4 != 0) {
                if (iM27428k4 == 1) {
                    C4885ak c4885ak = (C4885ak) it.next();
                    if (c4885ak.m20213em() != null && C14113y2.m67432to(c4885ak.m20213em(), "stylesheet", (short) 5)) {
                        String strM20214j2 = c4885ak.m20214j2();
                        if (!C14113y2.m67411k4(strM20214j2)) {
                            C14062gk[] c14062gkArr = {null};
                            if ((!C14062gk.m66650k4(strM20214j2, 0, c14062gkArr) || c14062gkArr[0].m66683ix() || C14113y2.m67411k4(c5552rv.m22771bv().m22747dy().mo9639k4())) ? false : true) {
                                C14062gk[] c14062gkArr2 = {null};
                                boolean z = C14062gk.m66650k4(C3141rv.m13412x1(c5552rv.m22771bv().m22747dy().mo9639k4(), strM20214j2), 0, c14062gkArr2) && c14062gkArr2[0].m66683ix();
                                C14062gk c14062gk = c14062gkArr2[0];
                                if (z) {
                                    strM20214j2 = c14062gk.m66677ck();
                                }
                            }
                            interfaceC5775arMo25990k4 = interfaceC6346qqMo20431k4.mo25990k4(strM20214j2, c4885ak);
                            if (interfaceC5775arMo25990k4 != null) {
                                list = this.f45247k4;
                                list.addItem(interfaceC5775arMo25990k4);
                            }
                        }
                    }
                }
            } else {
                InterfaceC5806um interfaceC5806um = (InterfaceC5806um) it.next();
                if (interfaceC5806um.mo20674k4() != null) {
                    list = this.f45247k4;
                    interfaceC5775arMo25990k4 = interfaceC5806um.mo20674k4();
                    list.addItem(interfaceC5775arMo25990k4);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<InterfaceC5780c6> iterator() {
        return this.f45247k4.iterator();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5804ts
    /* JADX INFO: renamed from: k4 */
    public final long mo23707k4() {
        return this.f45247k4.size();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5804ts
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5775ar mo23708k4(int i) {
        return (InterfaceC5775ar) this.f45247k4.get_Item(i);
    }
}
