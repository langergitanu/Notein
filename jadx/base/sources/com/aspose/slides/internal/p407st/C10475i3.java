package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.PptEditException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.i3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10475i3 implements IGenericEnumerable<C10751zg>, IGenericCloneable<C10475i3>, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private SortedList<Short, C10751zg> f37054k4 = new SortedList<>();

    public C10475i3() {
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C10751zg> iterator() {
        return this.f37054k4.getValues().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m50902k4() {
        return (this.f37054k4.size() * 4) + 2;
    }

    /* JADX INFO: renamed from: kk */
    public Object m50907kk() {
        try {
            C10475i3 c10475i3 = (C10475i3) clone();
            SortedList<Short, C10751zg> sortedList = new SortedList<>();
            IGenericEnumerator<KeyValuePair<Short, C10751zg>> it = this.f37054k4.iterator();
            while (it.hasNext()) {
                sortedList.addItem(it.next());
            }
            it.dispose();
            c10475i3.f37054k4 = sortedList;
            return c10475i3;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C10475i3 cloneT() {
        return (C10475i3) m50907kk();
    }

    public C10475i3(C3134k4 c3134k4) {
        m50904k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m50903k4(C10751zg c10751zg) {
        if (c10751zg.m52144x1() != null) {
            throw new PptEditException("Can't add already used tab");
        }
        c10751zg.m52142k4(this);
        if (!this.f37054k4.containsKey(Short.valueOf(c10751zg.m52139k4())) || this.f37054k4.get_Item(Short.valueOf(c10751zg.m52139k4())).m52143kk() == 0) {
            this.f37054k4.set_Item(Short.valueOf(c10751zg.m52139k4()), c10751zg);
        }
        return this.f37054k4.indexOfKey(Short.valueOf(c10751zg.m52139k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50904k4(C3134k4 c3134k4) {
        int iM13382u4 = c3134k4.m13382u4();
        this.f37054k4.clear();
        for (int i = 0; i < (65535 & iM13382u4); i++) {
            m50903k4(new C10751zg(c3134k4));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50905k4(C3149x1 c3149x1) {
        c3149x1.m13442k4().getPosition();
        c3149x1.m13446k4(this.f37054k4.size() & 65535);
        IGenericEnumerator<C10751zg> it = this.f37054k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                it.next().m52141k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50906k4(C10475i3 c10475i3) {
        if (this.f37054k4.size() != c10475i3.f37054k4.size()) {
            return false;
        }
        for (int i = 0; i < this.f37054k4.size(); i++) {
            C10751zg c10751zg = this.f37054k4.getValues().get_Item(i);
            C10751zg c10751zg2 = c10475i3.f37054k4.getValues().get_Item(i);
            if (c10751zg.m52139k4() != c10751zg2.m52139k4() || c10751zg.m52143kk() != c10751zg2.m52143kk()) {
                return false;
            }
        }
        return true;
    }
}
