package com.aspose.slides.internal.p155gv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4322kk;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4381dy {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<x1, k4> f11906k4 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.gv.dy$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private x1 f11907k4;

        /* JADX INFO: renamed from: x1 */
        private AbstractC4385m9 f11908x1;

        public k4(x1 x1Var, AbstractC4385m9 abstractC4385m9) {
            this.f11907k4 = x1Var;
            this.f11908x1 = abstractC4385m9;
        }

        public boolean equals(Object obj) {
            x1 x1Var = (x1) C7019kk.m27452k4(obj, x1.class);
            if (!C14067j2.m66729x1(null, x1Var)) {
                return m17709x1().equals(x1Var);
            }
            k4 k4Var = (k4) C7019kk.m27452k4(obj, k4.class);
            if (C14067j2.m66729x1(null, k4Var)) {
                return false;
            }
            return m17709x1().equals(k4Var.m17709x1());
        }

        public int hashCode() {
            return this.f11907k4.hashCode();
        }

        /* JADX INFO: renamed from: k4 */
        public final AbstractC4385m9 m17708k4() {
            return this.f11908x1;
        }

        /* JADX INFO: renamed from: x1 */
        public final x1 m17709x1() {
            return this.f11907k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gv.dy$kk */
    public static class kk extends x1 {

        /* JADX INFO: renamed from: k4 */
        private C4327up f11909k4;

        /* JADX INFO: renamed from: x1 */
        private int f11910x1;

        public kk(C4327up c4327up, C4317dy c4317dy) {
            super();
            this.f11909k4 = c4327up;
            int iHashCode = c4327up.m17410du().hashCode();
            C4772y9 c4772y9 = new C4772y9();
            try {
                int iHashCode2 = 137;
                int iM67317k4 = 137;
                for (byte b : c4772y9.m19588x1(c4327up.m17416x1())) {
                    iM67317k4 = (iM67317k4 * 13) ^ C14098up.m67317k4(b);
                }
                c4772y9.dispose();
                int iM66708k4 = C14064he.m66708k4(c4327up.m17414kk());
                int iHashCode3 = c4327up.m17385fa().hashCode();
                int iHashCode4 = c4317dy.hashCode();
                int iM66409k4 = C14042ak.m66409k4(c4327up.m17388up());
                if (c4327up.m17415to() != null) {
                    for (C5656k4 c5656k4 : c4327up.m17415to()) {
                        iHashCode2 = (iHashCode2 * 13) ^ c5656k4.hashCode();
                    }
                } else {
                    iHashCode2 = -1;
                }
                this.f11910x1 = (((((((((((((137 * 13) ^ iHashCode) * 13) ^ iM67317k4) * 13) ^ iM66708k4) * 13) ^ iHashCode3) * 13) ^ iHashCode4) * 13) ^ iM66409k4) * 13) ^ iHashCode2;
            } catch (Throwable th) {
                c4772y9.dispose();
                throw th;
            }
        }

        public int hashCode() {
            return this.f11910x1;
        }

        @Override // com.aspose.slides.internal.p155gv.C4381dy.x1
        /* JADX INFO: renamed from: k4 */
        public boolean mo17710k4(x1 x1Var) {
            kk kkVar = (kk) C7019kk.m27452k4((Object) x1Var, kk.class);
            if (C14067j2.m66729x1(null, kkVar)) {
                return false;
            }
            return C14057f9.m66592x1(this.f11910x1, kkVar.f11910x1);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gv.dy$x1 */
    public static abstract class x1 {
        private x1() {
        }

        public boolean equals(Object obj) {
            return mo17710k4((x1) C7019kk.m27452k4(obj, x1.class));
        }

        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo17710k4(x1 x1Var);
    }

    /* JADX INFO: renamed from: kk */
    private static x1 m17703kk(C4328x1 c4328x1, C4317dy c4317dy) {
        if (2 == c4328x1.m17417k4()) {
            return new kk((C4327up) c4328x1, c4317dy);
        }
        throw new NotSupportedException(C14113y2.m67402k4("{0} is not supported for caching.", C14042ak.m66410k4(C4322kk.class, c4328x1.m17417k4())));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17704k4() {
        this.f11906k4.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC4385m9 m17707x1(C4328x1 c4328x1, C4317dy c4317dy) {
        k4[] k4VarArr = {null};
        boolean zTryGetValue = this.f11906k4.tryGetValue(m17703kk(c4328x1, c4317dy), k4VarArr);
        k4 k4Var = k4VarArr[0];
        if (zTryGetValue) {
            return k4Var.m17708k4();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17705k4(C4328x1 c4328x1, AbstractC4385m9 abstractC4385m9, C4317dy c4317dy) {
        if (2 != c4328x1.m17417k4()) {
            throw new NotSupportedException(C14113y2.m67402k4("{0} is not supported for caching.", C14042ak.m66410k4(C4322kk.class, c4328x1.m17417k4())));
        }
        x1 x1VarM17703kk = m17703kk(c4328x1, c4317dy);
        if (this.f11906k4.containsKey(x1VarM17703kk)) {
            throw new ArgumentException("An element with the same key already exists.");
        }
        this.f11906k4.addItem(x1VarM17703kk, new k4(x1VarM17703kk, abstractC4385m9));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17702k4(C4328x1 c4328x1) {
        return 2 == c4328x1.m17417k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m17706k4(C4328x1 c4328x1, C4317dy c4317dy) {
        return this.f11906k4.containsKey(m17703kk(c4328x1, c4317dy));
    }
}
