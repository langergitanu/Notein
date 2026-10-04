package com.aspose.slides.internal.p264m3;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m3.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6312k4 implements InterfaceC6313x1 {

    /* JADX INFO: renamed from: k4 */
    private List<Object> f17963k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private int f17964x1 = -1;

    public C6312k4(IGenericCollection iGenericCollection) {
        IGenericEnumerator<T> it = iGenericCollection.iterator();
        while (it.hasNext()) {
            try {
                this.f17963k4.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p264m3.InterfaceC6313x1
    /* JADX INFO: renamed from: k4 */
    public final boolean mo14953k4() {
        return this.f17963k4.size() != 0 && this.f17964x1 + 1 < this.f17963k4.size();
    }

    @Override // com.aspose.slides.internal.p264m3.InterfaceC6313x1
    /* JADX INFO: renamed from: x1 */
    public final Object mo14954x1() {
        if (!mo14953k4()) {
            throw new InvalidOperationException();
        }
        List<Object> list = this.f17963k4;
        int i = this.f17964x1 + 1;
        this.f17964x1 = i;
        return list.get_Item(i);
    }
}
