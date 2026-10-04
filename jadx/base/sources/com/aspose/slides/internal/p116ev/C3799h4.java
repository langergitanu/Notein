package com.aspose.slides.internal.p116ev;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p275mi.AbstractC6390h4;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ev.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C3799h4 extends AbstractC6390h4 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ev.h4$k4 */
    public static class k4 extends AbstractC6390h4.k4 {

        /* JADX INFO: renamed from: k4 */
        private List<AbstractC3797du> f10348k4;

        public k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: ck */
        public int mo14943ck() {
            List<AbstractC3797du> list = this.f10348k4;
            if (list == null || list.size() == 0) {
                return 0;
            }
            List.Enumerator<AbstractC3797du> it = this.f10348k4.iterator();
            boolean z = false;
            int iM67482k4 = 0;
            while (it.hasNext()) {
                try {
                    int iMo14943ck = it.next().mo14943ck();
                    iM67482k4 += C14116yg.m67482k4(iMo14943ck);
                    z |= iMo14943ck <= 0;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return z ? -iM67482k4 : iM67482k4;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: fa */
        public void mo14944fa() {
            this.f10348k4 = null;
            m26246k4(false);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: jd */
        public boolean mo14945jd() {
            return this.f10348k4 != null;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public int mo14946k4(C13637dy c13637dy) {
            List.Enumerator<AbstractC3797du> it = this.f10348k4.iterator();
            int iMo14946k4 = 0;
            while (it.hasNext()) {
                try {
                    iMo14946k4 += it.next().mo14946k4((C13637dy) c13637dy.mo62971x1(iMo14946k4));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return iMo14946k4;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m15183k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3799h4(m26228up(), c13641m9);
        }
    }

    private C3799h4(C6394to c6394to, C13641m9 c13641m9) {
        super(c6394to, c13641m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3803to m15182k4(int i, int i2) {
        return AbstractC3803to.m15206k4(this, this.f18176k4, i, i2);
    }
}
