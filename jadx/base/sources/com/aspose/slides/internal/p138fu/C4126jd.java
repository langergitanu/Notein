package com.aspose.slides.internal.p138fu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.p131fi.C3998x1;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.AbstractC9784rv;
import com.aspose.slides.internal.p353q7.C9758b3;
import com.aspose.slides.internal.p353q7.C9793up;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4126jd implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private boolean f11291k4 = false;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, C3998x1> f11294x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final C3998x1 f11292kk = new C3998x1();

    /* JADX INFO: renamed from: to */
    private final Dictionary<AbstractC9784rv, Integer> f11293to = new Dictionary<>();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m16508k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12004dy m16507k4(C5659x1 c5659x1) {
        m16506k4(c5659x1.m23120k4().m48233um());
        return m16504k4(c5659x1.m23123m9(), c5659x1.m23120k4().m48187h4());
    }

    /* JADX INFO: renamed from: k4 */
    private C12004dy m16503k4(String str) {
        Dictionary.ValueCollection.Enumerator<String, C3998x1> it = this.f11294x1.getValues().iterator();
        while (true) {
            try {
                int i = 0;
                if (!it.hasNext()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    C12004dy[] c12004dyArrM15799k4 = this.f11292kk.m15799k4();
                    int length = c12004dyArrM15799k4.length;
                    while (i < length) {
                        C12004dy c12004dy = c12004dyArrM15799k4[i];
                        if (C12565ks.m58631x1(c12004dy.m56527du(), str)) {
                            return c12004dy;
                        }
                        i++;
                    }
                    return null;
                }
                C12004dy[] c12004dyArrM15799k42 = it.next().m15799k4();
                int length2 = c12004dyArrM15799k42.length;
                while (i < length2) {
                    C12004dy c12004dy2 = c12004dyArrM15799k42[i];
                    if (C12565ks.m58631x1(c12004dy2.m56527du(), str)) {
                        return c12004dy2;
                    }
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12004dy m16504k4(String str, String str2) {
        if (C14113y2.m67411k4(str2) || !this.f11294x1.containsKey(str2)) {
            return m16503k4(str);
        }
        for (C12004dy c12004dy : this.f11294x1.get_Item(str2).m15799k4()) {
            if (C12565ks.m58631x1(c12004dy.m56527du(), str)) {
                return c12004dy;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m16505k4(C9758b3 c9758b3) {
        byte[] bArrM47982k4 = c9758b3.m47982k4();
        AbstractC4786k4 abstractC4786k4M19846k4 = AbstractC4786k4.m19846k4(bArrM47982k4);
        this.f11292kk.m15797k4(abstractC4786k4M19846k4.m19848du(), bArrM47982k4.length);
        abstractC4786k4M19846k4.m19849h4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m16506k4(AbstractC9784rv abstractC9784rv) {
        if (this.f11293to.containsKey(abstractC9784rv)) {
            return;
        }
        C9793up c9793up = (C9793up) C7019kk.m27452k4((Object) abstractC9784rv, C9793up.class);
        if (c9793up == null) {
            C9758b3 c9758b3 = (C9758b3) C7019kk.m27452k4((Object) abstractC9784rv, C9758b3.class);
            if (c9758b3 != null) {
                m16505k4(c9758b3);
                return;
            }
            return;
        }
        if (this.f11294x1.containsKey(c9793up.m48254k4())) {
            return;
        }
        C3998x1 c3998x1 = new C3998x1();
        try {
            c3998x1.m15798k4(c9793up.m48254k4());
            this.f11294x1.addItem(c9793up.m48254k4(), c3998x1);
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m16508k4(boolean z) {
        if (this.f11291k4) {
            return;
        }
        Dictionary.ValueCollection.Enumerator<String, C3998x1> it = this.f11294x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f11294x1.clear();
        this.f11293to.clear();
        this.f11292kk.dispose();
        this.f11291k4 = true;
    }
}
