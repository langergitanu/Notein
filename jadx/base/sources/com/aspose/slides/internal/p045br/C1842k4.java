package com.aspose.slides.internal.p045br;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.br.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1842k4 extends AbstractC1846x1 {

    /* JADX INFO: renamed from: kk */
    private C7187kk f6681kk;

    public C1842k4(C7187kk c7187kk) {
        this.f6681kk = c7187kk;
        AbstractC1846x1 abstractC1846x1M9623k4 = C1841h4.f6680kk;
        C7182dy c7182dy = (C7182dy) c7187kk.mo27768h4(C7182dy.f19665v4);
        abstractC1846x1M9623k4 = c7182dy != null ? C1843kk.f6682k4.m9623k4(c7182dy) : abstractC1846x1M9623k4;
        Dictionary.Enumerator<String, Integer> it = abstractC1846x1M9623k4.f6688x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (this.f6688x1.containsKey((String) next.getKey())) {
                    this.f6688x1.set_Item((String) next.getKey(), (Integer) next.getValue());
                } else {
                    this.f6688x1.addItem((String) next.getKey(), (Integer) next.getValue());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        Dictionary.Enumerator<Integer, String> it2 = abstractC1846x1M9623k4.f6687k4.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next2 = it2.next();
                if (this.f6687k4.containsKey((Integer) next2.getKey())) {
                    this.f6687k4.set_Item((Integer) next2.getKey(), (String) next2.getValue());
                } else {
                    this.f6687k4.addItem((Integer) next2.getKey(), (String) next2.getValue());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        C7186k4 c7186k4 = (C7186k4) this.f6681kk.mo27768h4(C7182dy.f19513lm);
        int iM27752kk = -1;
        for (int i = 0; c7186k4 != null && i < c7186k4.m27778k4(); i++) {
            C7185jd c7185jdM27787x1 = c7186k4.m27787x1(i);
            if (C7019kk.m27469x1(c7185jdM27787x1, C7179c5.class)) {
                iM27752kk = ((C7179c5) c7185jdM27787x1).m27752kk();
            } else if (C7019kk.m27469x1(c7185jdM27787x1, C7182dy.class)) {
                m9633x1(iM27752kk, ((C7182dy) c7185jdM27787x1).m27766k4());
                iM27752kk++;
            }
        }
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public C7185jd mo8461c5() {
        return this.f6681kk;
    }
}
