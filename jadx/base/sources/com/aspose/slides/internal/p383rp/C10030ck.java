package com.aspose.slides.internal.p383rp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p262m1.C6302k4;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p483ws.C12294yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10030ck {

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC10031du> f36076k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.rp.ck$k4 */
    public static class k4 extends AbstractC10031du {

        /* JADX INFO: renamed from: k4 */
        private final AbstractC10031du[] f36077k4;

        /* JADX INFO: renamed from: x1 */
        private final long f36078x1;

        public k4(AbstractC10031du[] abstractC10031duArr, int i) {
            super(i);
            this.f36077k4 = abstractC10031duArr;
            long jM27435du = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(abstractC10031duArr.length), 9)), 10) * C7019kk.m27435du((Object) 12, 9);
            for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
                jM27435du = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(abstractC10031du.m49293du()), 10) + C7019kk.m27435du(Long.valueOf(jM27435du), 10)), 10);
            }
            this.f36078x1 = C7019kk.m27435du(Long.valueOf(jM27435du), 10) > 0 ? C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du), 10) + 4), 10) : jM27435du;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: h4 */
        public long mo49282h4() {
            return this.f36078x1;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: jd */
        public AbstractC10031du mo49283jd() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: k4 */
        public long mo49284k4() {
            return 1L;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: kk */
        public void mo49286kk(C6304x1 c6304x1, long j) {
            c6304x1.m25855up(j);
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: m9 */
        public Object mo49287m9() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: to */
        public int mo49288to() {
            return 4;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: x1 */
        public long mo49289x1(C6304x1 c6304x1) {
            c6304x1.m25836h4(C7019kk.m27457kk(Integer.valueOf(this.f36077k4.length), 9));
            C10030ck.m49276x1(c6304x1, this.f36077k4, C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(this.f36077k4.length), 9)), 10) * C7019kk.m27435du((Object) 12, 9)), 10) + C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c6304x1.m62853k4()), 11)), 10)), 10) + 2), 10));
            c6304x1.m25839k4((short) 0);
            C10030ck.m49277x1(c6304x1, this.f36077k4);
            long jM49293du = m49293du();
            long jM27435du = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM49293du), 10) - C7019kk.m27435du(Long.valueOf(this.f36078x1), 10)), 10);
            if (C7019kk.m27435du(Long.valueOf(jM27435du), 10) > 0) {
                c6304x1.m62857k4(new byte[(int) C7019kk.m27435du(Long.valueOf(jM27435du), 10)]);
            }
            return jM49293du;
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: k4 */
        public void mo49285k4(Object obj) {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.internal.p383rp.AbstractC10031du
        /* JADX INFO: renamed from: x1 */
        public void mo49290x1(C6304x1 c6304x1, long j) {
            throw new NotImplementedException();
        }
    }

    public C10030ck(AbstractC10031du[] abstractC10031duArr, AbstractC10031du[] abstractC10031duArr2, AbstractC10031du[] abstractC10031duArr3) {
        this.f36076k4 = new List<>(AbstractC14092to.m67204k4((Object[]) abstractC10031duArr));
        for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
            if (C7019kk.m27457kk(Integer.valueOf(abstractC10031du.m49298x1()), 8) == 34665 || C7019kk.m27457kk(Integer.valueOf(abstractC10031du.m49298x1()), 8) == 34853) {
                this.f36076k4.removeItem(abstractC10031du);
            }
        }
        if (abstractC10031duArr2 != null && abstractC10031duArr2.length > 0) {
            this.f36076k4.addItem(new k4(abstractC10031duArr2, C7019kk.m27457kk((Object) 34665, 9)));
        }
        if (abstractC10031duArr3 != null && abstractC10031duArr3.length > 0) {
            this.f36076k4.addItem(new k4(abstractC10031duArr3, C7019kk.m27457kk((Object) 34853, 9)));
        }
        this.f36076k4.sort();
    }

    /* JADX INFO: renamed from: k4 */
    public int m49278k4() {
        return C6740x1.m26541k4(this.f36076k4.toArray(new AbstractC10031du[0]));
    }

    /* JADX INFO: renamed from: x1 */
    public long m49281x1() {
        return C7019kk.m27435du(Long.valueOf(((long) ((m49278k4() * 12) + 2)) + 4), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static long m49276x1(C6304x1 c6304x1, AbstractC10031du[] abstractC10031duArr, long j) {
        for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
            if (abstractC10031du != null && abstractC10031du.m49294dy() && !C7019kk.m27469x1(abstractC10031du, C12294yj.class)) {
                abstractC10031du.m49295k4(c6304x1, j);
                j = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(abstractC10031du.m49293du()), 10) + C7019kk.m27435du(Long.valueOf(j), 10)), 10);
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49274k4(C6304x1 c6304x1) {
        c6304x1.m25839k4((short) (C7019kk.m27469x1(c6304x1, C6302k4.class) ? 19789 : 18761));
        c6304x1.m25839k4((short) 42);
        c6304x1.m25855up(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c6304x1.m62853k4()), 11)), 10) + 4), 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static void m49277x1(C6304x1 c6304x1, AbstractC10031du[] abstractC10031duArr) {
        for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
            if (abstractC10031du != null && abstractC10031du.m49294dy() && !C7019kk.m27469x1(abstractC10031du, C12294yj.class)) {
                long jM27435du = 4 - C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(abstractC10031du.mo49289x1(c6304x1)), 10) % 4), 10);
                if (C7019kk.m27435du(Long.valueOf(jM27435du), 10) != 4) {
                    c6304x1.m62857k4(new byte[(int) C7019kk.m27435du(Long.valueOf(jM27435du), 10)]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m49279k4(C6304x1 c6304x1, long j, boolean z) {
        long jM27435du = 4 - C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) % 4), 10);
        if (C7019kk.m27435du(Long.valueOf(jM27435du), 10) != 4) {
            j = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du), 10) + C7019kk.m27435du(Long.valueOf(j), 10)), 10);
        }
        c6304x1.m25836h4(C7019kk.m27457kk(Integer.valueOf(m49278k4()), 9));
        AbstractC10031du[] array = this.f36076k4.toArray(new AbstractC10031du[0]);
        long jM49276x1 = m49276x1(c6304x1, array, j);
        if (z) {
            jM49276x1 = 0;
        }
        c6304x1.m25855up(jM49276x1);
        c6304x1.m62854k4(C7019kk.m27438h4(Long.valueOf(j), 10), 0);
        m49277x1(c6304x1, array);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49280k4(AbstractC10031du[] abstractC10031duArr) {
        for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
            int i = 0;
            while (true) {
                if (i >= this.f36076k4.size()) {
                    break;
                }
                if (C7019kk.m27457kk(Integer.valueOf(this.f36076k4.get_Item(i).m49298x1()), 8) == C7019kk.m27457kk(Integer.valueOf(abstractC10031du.m49298x1()), 8)) {
                    this.f36076k4.set_Item(i, abstractC10031du);
                    break;
                }
                i++;
            }
        }
    }
}
