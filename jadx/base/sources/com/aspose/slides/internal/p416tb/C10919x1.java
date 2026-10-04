package com.aspose.slides.internal.p416tb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10919x1 {

    /* JADX INFO: renamed from: k4 */
    private List<k4> f37972k4 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.tb.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f37973k4;

        /* JADX INFO: renamed from: kk */
        private int f37974kk;

        /* JADX INFO: renamed from: x1 */
        private final String f37975x1;

        public k4(String str, int i) {
            this.f37974kk = -1;
            this.f37973k4 = i;
            this.f37975x1 = str;
            this.f37974kk = C14113y2.m67358c5(str).hashCode();
        }

        public boolean equals(Object obj) {
            k4 k4Var = (k4) C7019kk.m27452k4(obj, k4.class);
            if (C14067j2.m66729x1(null, k4Var)) {
                return false;
            }
            return C14067j2.m66729x1(this, k4Var) || hashCode() == k4Var.hashCode();
        }

        public int hashCode() {
            if (this.f37974kk == -1) {
                this.f37974kk = C14113y2.m67358c5(m52599k4()).hashCode();
            }
            return this.f37974kk;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m52599k4() {
            return this.f37975x1;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m52602x1() {
            return this.f37973k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m52600k4(int i) {
            this.f37973k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m52601k4(String str) {
            return hashCode() == C14113y2.m67358c5(str).hashCode();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m52592k4(k4 k4Var) {
        this.f37972k4.addItem(k4Var);
    }

    /* JADX INFO: renamed from: kk */
    private k4 m52593kk(String str) {
        List.Enumerator<k4> it = this.f37972k4.iterator();
        while (it.hasNext()) {
            try {
                k4 next = it.next();
                if (next.m52601k4(str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m52597x1(String str) {
        return m52593kk(str).m52602x1();
    }

    /* JADX INFO: renamed from: kk */
    private void m52594kk(String str, int i) {
        k4 k4VarM52593kk = m52593kk(str);
        if (k4VarM52593kk == null) {
            m52595k4(str, i);
        } else {
            k4VarM52593kk.m52600k4(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52595k4(String str, int i) {
        m52592k4(new k4(str, i));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52598x1(String str, int i) {
        m52594kk(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52596k4(String str) {
        return m52593kk(str) != null;
    }
}
