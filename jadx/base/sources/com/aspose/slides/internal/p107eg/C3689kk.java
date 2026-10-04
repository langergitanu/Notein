package com.aspose.slides.internal.p107eg;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p107eg.AbstractC3688k4;
import com.aspose.slides.internal.p275mi.AbstractC6390h4;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3689kk extends AbstractC6390h4 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.kk$k4 */
    public static class k4 extends AbstractC6390h4.k4 {

        /* JADX INFO: renamed from: k4 */
        private int f10250k4;

        /* JADX INFO: renamed from: x1 */
        private Dictionary<C3692x1, AbstractC3688k4.k4> f10251x1;

        public k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
            this.f10250k4 = 0;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: ck */
        public int mo14943ck() {
            Dictionary<C3692x1, AbstractC3688k4.k4> dictionary = this.f10251x1;
            if (dictionary == null || dictionary.size() == 0) {
                return 0;
            }
            int size = (this.f10251x1.size() * 8) + 4;
            Dictionary.ValueCollection.Enumerator<C3692x1, AbstractC3688k4.k4> it = this.f10251x1.getValues().iterator();
            boolean z = false;
            while (it.hasNext()) {
                try {
                    int iMo14943ck = it.next().mo14943ck();
                    size += C14116yg.m67482k4(iMo14943ck);
                    z |= iMo14943ck <= 0;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return z ? -size : size;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: fa */
        public void mo14944fa() {
            this.f10251x1 = null;
            m26246k4(false);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: jd */
        public boolean mo14945jd() {
            Dictionary<C3692x1, AbstractC3688k4.k4> dictionary = this.f10251x1;
            if (dictionary == null) {
                return false;
            }
            Dictionary.ValueCollection.Enumerator<C3692x1, AbstractC3688k4.k4> it = dictionary.getValues().iterator();
            while (it.hasNext()) {
                try {
                    if (!it.next().mo14945jd()) {
                        return false;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return true;
            }
            it.dispose();
            return true;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public int mo14946k4(C13637dy c13637dy) {
            int iM62968to = c13637dy.m62968to(2, this.f10251x1.size()) + c13637dy.m62968to(0, m14989yj());
            int size = (this.f10251x1.size() * 8) + iM62968to;
            Dictionary.ValueCollection.Enumerator<C3692x1, AbstractC3688k4.k4> it = this.f10251x1.getValues().iterator();
            while (it.hasNext()) {
                try {
                    AbstractC3688k4.k4 next = it.next();
                    int iM62968to2 = iM62968to + c13637dy.m62968to(iM62968to, next.m14984ks());
                    int iM62968to3 = iM62968to2 + c13637dy.m62968to(iM62968to2, next.m14987yj());
                    iM62968to = iM62968to3 + c13637dy.m62962k4(iM62968to3, size);
                    size += next.mo14946k4((C13637dy) c13637dy.mo62971x1(size));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return size;
        }

        /* JADX INFO: renamed from: yj */
        public final int m14989yj() {
            return this.f10250k4;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m14988k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3689kk(m26228up(), c13641m9);
        }
    }

    private C3689kk(C6394to c6394to, C13641m9 c13641m9) {
        super(c6394to, c13641m9);
    }
}
