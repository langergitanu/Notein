package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.k4 */
/* JADX INFO: loaded from: classes.dex */
class C4452k4 {

    /* JADX INFO: renamed from: kk */
    private C4439dq f12236kk;

    /* JADX INFO: renamed from: k4 */
    private List<C4483x1> f12235k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private List<C4469to> f12237x1 = new List<>();

    public C4452k4(C4439dq c4439dq, float f) {
        this.f12236kk = c4439dq;
        long j = 0;
        int i = 1;
        while (i < c4439dq.m18138h4()) {
            int iM18138h4 = i % (c4439dq.m18138h4() - 1);
            C4459os c4459osClone = C4459os.m18282x1(c4439dq.m18149x1(iM18138h4).m18108k4(), c4439dq.m18149x1(i - 1).m18108k4()).m18289to().Clone();
            C4459os c4459osClone2 = C4459os.m18282x1(c4439dq.m18149x1(iM18138h4 + 1).m18108k4(), c4439dq.m18149x1(iM18138h4).m18108k4()).m18289to().Clone();
            C4459os c4459osClone3 = C4459os.m18279k4(c4459osClone, c4459osClone2).m18289to().Clone();
            C4459os c4459os = new C4459os(-c4459osClone3.m18290x1(), c4459osClone3.m18285k4());
            float fM18290x1 = (c4459osClone2.m18290x1() * (-c4459osClone.m18290x1())) + (c4459osClone2.m18285k4() * (-c4459osClone.m18285k4()));
            if (fM18290x1 == 1.0d) {
                fM18290x1 = 0.0f;
            }
            C4483x1 c4483x1 = new C4483x1(j, c4439dq.m18149x1(iM18138h4).m18108k4().Clone(), C4459os.m18279k4(c4439dq.m18149x1(iM18138h4).m18108k4(), C4459os.m18278k4(C4459os.m18278k4(c4459os, f), 1.0f / ((float) C14116yg.m67496rv(((double) (1.0f - fM18290x1)) / 2.0d)))).Clone(), c4439dq.m18149x1(iM18138h4).m18112kk());
            this.f12235k4.addItem(c4483x1);
            C4469to c4469to = new C4469to();
            this.f12237x1.addItem(c4469to);
            c4483x1.m18447k4(c4469to);
            i++;
            j = 1 + j;
        }
        if (((C4483x1) OooO0O0.OooO00o(this.f12235k4, 1)).m18451to() == 0) {
            ((C4483x1) OooO0O0.OooO00o(this.f12235k4, 1)).m18445k4(c4439dq.m18149x1(c4439dq.m18138h4() - 1).m18112kk());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m18223k4() {
        boolean z;
        List.Enumerator it;
        do {
            int size = this.f12235k4.size();
            int i = 0;
            z = false;
            while (i < size) {
                C4483x1 c4483x1 = this.f12235k4.get_Item(i);
                i++;
                C4483x1 c4483x12 = this.f12235k4.get_Item(i % size);
                if (c4483x1.m18441dy() != c4483x12.m18441dy()) {
                    C4459os c4459os = new C4459os();
                    C4459os[] c4459osArr = {c4459os};
                    boolean zM18448k4 = c4483x1.m18448k4(c4483x12, c4459osArr);
                    c4459osArr[0].CloneTo(c4459os);
                    if (zM18448k4) {
                        c4483x1.m18441dy().m18334k4(c4483x12.m18441dy());
                        z = true;
                    }
                }
            }
            it = this.f12237x1.iterator();
            while (it.hasNext()) {
                try {
                    it.next().m18332k4();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        } while (z);
        List list = new List();
        List.Enumerator<C4469to> it2 = this.f12237x1.iterator();
        while (it2.hasNext()) {
            try {
                C4469to next = it2.next();
                if (!next.m18339kk()) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                this.f12237x1.removeItem((C4469to) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final List<C4469to> m18224kk() {
        return this.f12237x1;
    }

    /* JADX INFO: renamed from: to */
    public final C4439dq m18225to() {
        return this.f12236kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C4483x1> m18226x1() {
        return this.f12235k4;
    }
}
