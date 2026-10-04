package com.aspose.slides.internal.p450uu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.internal.p483ws.C12285fa;
import com.aspose.slides.internal.p483ws.C12290m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.uu.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11559to {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, k4> f39068k4 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.uu.to$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f39069k4;

        /* JADX INFO: renamed from: x1 */
        private AbstractC10031du f39070x1;

        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public int m54559k4() {
            return this.f39069k4;
        }

        /* JADX INFO: renamed from: kk */
        public Object m54560kk() {
            if (m54561x1() != null) {
                return m54561x1().mo49287m9();
            }
            return null;
        }

        public String toString() {
            return (String) C7019kk.m27452k4(m54560kk(), String.class);
        }

        /* JADX INFO: renamed from: x1 */
        public AbstractC10031du m54561x1() {
            return this.f39070x1;
        }

        /* JADX INFO: renamed from: k4 */
        private void m54556k4(int i) {
            this.f39069k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public static void m54557k4(Dictionary<Integer, k4> dictionary, AbstractC10031du abstractC10031du, int i) {
            if (abstractC10031du == null) {
                throw new ArgumentNullException("value");
            }
            int iM49298x1 = abstractC10031du.m49298x1();
            if (i == -1) {
                i = dictionary.containsKey(Integer.valueOf(iM49298x1)) ? dictionary.get_Item(Integer.valueOf(iM49298x1)).m54559k4() : C11558kk.f39063k4.containsKey(Integer.valueOf(iM49298x1)) ? C11558kk.f39063k4.get_Item(Integer.valueOf(iM49298x1)).intValue() : 0;
            }
            k4 k4Var = new k4();
            k4Var.m54558k4(abstractC10031du);
            k4Var.m54556k4(i);
            dictionary.set_Item(Integer.valueOf(abstractC10031du.m49298x1()), k4Var);
        }

        /* JADX INFO: renamed from: k4 */
        private void m54558k4(AbstractC10031du abstractC10031du) {
            this.f39070x1 = abstractC10031du;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m54551k4(int i, int i2, int i3) {
        C12285fa c12285fa = new C12285fa(i);
        c12285fa.m57545k4(new int[]{i2});
        k4.m54557k4(this.f39068k4, c12285fa, i3);
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC10031du[] m54554kk(int i) {
        List list = new List();
        Dictionary.ValueCollection.Enumerator<Integer, k4> it = this.f39068k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                k4 next = it.next();
                if (i == -1 || next.m54559k4() == i) {
                    list.addItem(next.m54561x1());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return (AbstractC10031du[]) list.toArray(new AbstractC10031du[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m54555x1(int i) {
        return this.f39068k4.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    public void m54552k4(int i, C10029c5 c10029c5, int i2) {
        C12290m9 c12290m9 = new C12290m9(i);
        c12290m9.m57553k4(new C10029c5[]{c10029c5});
        k4.m54557k4(this.f39068k4, c12290m9, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m54553k4(int i, AbstractC10031du[] abstractC10031duArr) {
        if (i == -1) {
            this.f39068k4.clear();
        }
        if (abstractC10031duArr != null) {
            for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
                k4.m54557k4(this.f39068k4, abstractC10031du, i);
            }
        }
    }
}
