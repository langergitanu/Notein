package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.vj */
/* JADX INFO: loaded from: classes3.dex */
class C3652vj {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f10119x1 = new C7017h4("ID", "Module", "Name", "HelpContextID", "CMG", "DPB", "GC");

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC3610f9> f10120k4 = new List<>();

    /* JADX INFO: renamed from: du */
    private boolean m14816du(String str) {
        return "GC".equals(str);
    }

    /* JADX INFO: renamed from: k4 */
    private int m14817k4() {
        AbstractC3610f9 abstractC3610f9FindLast = this.f10120k4.findLast(new AbstractC14041ai<AbstractC3610f9>() { // from class: com.aspose.slides.internal.ec.vj.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(AbstractC3610f9 abstractC3610f9) {
                return "Module".equals(abstractC3610f9.mo14724k4());
            }
        });
        if (abstractC3610f9FindLast != null) {
            this.f10120k4.indexOf(abstractC3610f9FindLast);
        } else {
            abstractC3610f9FindLast = this.f10120k4.findLast(new AbstractC14041ai<AbstractC3610f9>() { // from class: com.aspose.slides.internal.ec.vj.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public boolean invoke(AbstractC3610f9 abstractC3610f9) {
                    return "ID".equals(abstractC3610f9.mo14724k4());
                }
            });
            if (abstractC3610f9FindLast == null) {
                throw new InvalidOperationException();
            }
        }
        return this.f10120k4.indexOf(abstractC3610f9FindLast) + 1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m14821kk(final String str) {
        AbstractC3610f9 abstractC3610f9Find = this.f10120k4.find(new AbstractC14041ai<AbstractC3610f9>() { // from class: com.aspose.slides.internal.ec.vj.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(AbstractC3610f9 abstractC3610f9) {
                return "Module".equals(abstractC3610f9.mo14724k4()) && C14113y2.m67363du(abstractC3610f9.m14726x1(), str);
            }
        });
        if (abstractC3610f9Find == null) {
            throw new ArgumentException(C14113y2.m67402k4("Property for module with name {0} is not exists", str));
        }
        this.f10120k4.removeItem(abstractC3610f9Find);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC3610f9 m14822to(final String str) {
        return this.f10120k4.find(new AbstractC14041ai<AbstractC3610f9>() { // from class: com.aspose.slides.internal.ec.vj.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(AbstractC3610f9 abstractC3610f9) {
                return C14113y2.m67363du(abstractC3610f9.mo14724k4(), str);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14823x1(String str) {
        this.f10120k4.insertItem(m14817k4(), new C3636qw(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14818k4(C3125bv c3125bv) {
        List.Enumerator<AbstractC3610f9> it = this.f10120k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m14725k4(c3125bv);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14819k4(C3144um c3144um) {
        AbstractC3610f9 c3614gi;
        KeyValuePair keyValuePairClone = C3603ca.m14703k4(c3144um).Clone();
        if (!"ID".equals(keyValuePairClone.getKey())) {
            throw new C3620j5();
        }
        this.f10120k4.addItem(new C3614gi(C14113y2.m67401k4((String) keyValuePairClone.getValue(), "\"", "")));
        do {
            C3603ca.m14703k4(c3144um).CloneTo(keyValuePairClone);
            switch (f10119x1.m27428k4((String) keyValuePairClone.getKey())) {
                case 0:
                    c3614gi = new C3614gi((String) keyValuePairClone.getValue());
                    break;
                case 1:
                    c3614gi = new C3636qw((String) keyValuePairClone.getValue());
                    break;
                case 2:
                    c3614gi = new C3642t6((String) keyValuePairClone.getValue());
                    break;
                case 3:
                    c3614gi = new C3625kp((String) keyValuePairClone.getValue());
                    break;
                case 4:
                    c3614gi = new C3651vh((String) keyValuePairClone.getValue());
                    break;
                case 5:
                    c3614gi = new C3660xw((String) keyValuePairClone.getValue());
                    break;
                case 6:
                    c3614gi = new C3619j2((String) keyValuePairClone.getValue());
                    break;
                default:
                    c3614gi = new C3622jw((String) keyValuePairClone.getValue(), (String) keyValuePairClone.getKey());
                    break;
            }
            this.f10120k4.addItem(c3614gi);
        } while (!m14816du((String) keyValuePairClone.getKey()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14820k4(String str) {
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        this.f10120k4.addItem(new C3614gi(C14113y2.m67358c5(c14047bzClone.m66538k4("B"))));
        this.f10120k4.addItem(new C3642t6(str));
        this.f10120k4.addItem(new C3625kp("0"));
        this.f10120k4.addItem(new C3651vh(new C3611fa(c14047bzClone.Clone(), 4L, new byte[]{0, 0, 0, 0}).toString()));
        this.f10120k4.addItem(new C3660xw(new C3611fa(c14047bzClone.Clone(), 1L, new byte[]{0}).toString()));
        this.f10120k4.addItem(new C3619j2(new C3611fa(c14047bzClone.Clone(), 1L, new byte[]{-1}).toString()));
    }
}
