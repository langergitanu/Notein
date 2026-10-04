package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.um */
/* JADX INFO: loaded from: classes.dex */
public class C4299um extends C4274g8 {

    /* JADX INFO: renamed from: x1 */
    private int f11721x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gi.um$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            int i;
            boolean z;
            String strM49139k4;
            if (C14113y2.m67363du(str, "inherit")) {
                return super.mo14415k4(abstractC3533um, str, abstractC3524ks);
            }
            C4299um c4299um = new C4299um();
            if (C14067j2.m66729x1(this.f11669x1, str) && !C14113y2.m67411k4(abstractC3524ks.m14111q_().m59553ar())) {
                c4299um.mo17207k4(C4304vj.m17277x1(abstractC3524ks.m14111q_().m59553ar()));
            }
            int iM67429to = C14113y2.m67429to(str, ',');
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                if (iM67429to == -1) {
                    strM49139k4 = C14113y2.m67440x1(C14113y2.m67422kk(str, i2));
                    i = i2;
                    z = true;
                } else {
                    String strM67440x1 = C14113y2.m67440x1(C10009ck.m49139k4(str, i2, iM67429to));
                    int i3 = iM67429to + 1;
                    i = i3;
                    iM67429to = C14113y2.m67434x1(str, ',', i3);
                    z = z2;
                    strM49139k4 = strM67440x1;
                }
                int iM67429to2 = C14113y2.m67429to(strM49139k4, '\'');
                int iM67429to3 = C14113y2.m67429to(strM49139k4, '\"');
                if (iM67429to2 != -1 || iM67429to3 != -1) {
                    strM49139k4 = (strM49139k4.length() < 3 || C14113y2.m67418kk(strM49139k4, iM67429to2 == -1 ? '\"' : '\'') != strM49139k4.length() - 1) ? C14113y2.f47374k4 : C10009ck.m49139k4(strM49139k4, 1, strM49139k4.length() - 1);
                }
                if (!C14113y2.m67411k4(strM49139k4)) {
                    while (true) {
                        int iM67364dy = C14113y2.m67364dy(strM49139k4, "  ");
                        if (iM67364dy == -1) {
                            break;
                        }
                        strM49139k4 = C14113y2.m67408k4(C10009ck.m49139k4(strM49139k4, 0, iM67364dy), C14113y2.m67422kk(strM49139k4, iM67364dy + 1));
                    }
                    c4299um.mo17207k4(C4304vj.m17277x1(strM49139k4));
                }
                z2 = z;
                i2 = i;
            }
            return c4299um;
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            return C7019kk.m27469x1(abstractC4282kp, C4299um.class) ? abstractC4282kp : new C4299um(abstractC4282kp);
        }
    }

    private C4299um() {
        this.f11721x1 = 0;
    }

    @Override // com.aspose.slides.internal.p150gi.C4274g8
    public boolean equals(Object obj) {
        List<AbstractC4282kp> list;
        if (this == obj) {
            return true;
        }
        C4299um c4299um = (C4299um) C7019kk.m27452k4(obj, C4299um.class);
        return (c4299um == null || (list = ((C4274g8) this).f11657k4) == null || !list.equals(((C4274g8) c4299um).f11657k4)) ? false : true;
    }

    @Override // com.aspose.slides.internal.p150gi.C4274g8
    public int hashCode() {
        if (this.f11721x1 == 0) {
            List.Enumerator<AbstractC4282kp> it = ((C4274g8) this).f11657k4.iterator();
            int iHashCode = 17;
            while (it.hasNext()) {
                try {
                    AbstractC4282kp next = it.next();
                    iHashCode = (iHashCode * 37) + (next == null ? 0 : next.hashCode());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f11721x1 = iHashCode;
        }
        return this.f11721x1;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4282kp
    /* JADX INFO: renamed from: j_ */
    public String mo9926j_() {
        return ((C4274g8) this).f11657k4.size() > 0 ? ((C4274g8) this).f11657k4.get_Item(0).mo9926j_() : super.mo9926j_();
    }

    @Override // com.aspose.slides.internal.p150gi.C4274g8
    /* JADX INFO: renamed from: k4 */
    public void mo17207k4(AbstractC4282kp abstractC4282kp) {
        if (abstractC4282kp.mo17208t_() == null) {
            super.mo17207k4(abstractC4282kp);
            return;
        }
        List.Enumerator<AbstractC4282kp> it = abstractC4282kp.mo17208t_().iterator();
        while (it.hasNext()) {
            try {
                ((C4274g8) this).f11657k4.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    private C4299um(AbstractC4282kp abstractC4282kp) {
        this.f11721x1 = 0;
        mo17207k4(abstractC4282kp);
    }
}
