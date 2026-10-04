package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.bp */
/* JADX INFO: loaded from: classes4.dex */
public class C10371bp extends AbstractC10620rm {

    /* JADX INFO: renamed from: k4 */
    private List<C10359aq> f36863k4;

    public C10371bp(C10395d2 c10395d2) {
        super(c10395d2);
        this.f36863k4 = new List<>();
        m51409um().m51917k4(4002);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f36863k4.size() * 6;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50468kk() {
        List<C10359aq> list = this.f36863k4;
        return list == null || list.size() < 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C10359aq> m50469x1() {
        return this.f36863k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50467k4(List<C10359aq> list) {
        this.f36863k4 = list;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        for (int iM51914du = m51409um().m51914du(); iM51914du > 5; iM51914du -= 6) {
            this.f36863k4.addItem(new C10359aq(c3134k4));
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        List.Enumerator<C10359aq> it = this.f36863k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m50438k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
