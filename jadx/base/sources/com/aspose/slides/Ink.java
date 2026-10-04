package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7488dk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Ink extends GraphicalObject implements IInk {

    /* JADX INFO: renamed from: du */
    private List<ee1> f2520du;

    /* JADX INFO: renamed from: h4 */
    private List<los> f2521h4;

    /* JADX INFO: renamed from: k4 */
    private List<vkh> f2522k4;

    /* JADX INFO: renamed from: kk */
    private List<InkTrace> f2523kk;

    /* JADX INFO: renamed from: m9 */
    private List<d7i> f2524m9;

    /* JADX INFO: renamed from: to */
    private List<oxb> f2525to;

    /* JADX INFO: renamed from: x1 */
    private bfl f2526x1;

    /* JADX INFO: renamed from: yj */
    private C7488dk f2527yj;

    public Ink(ShapeCollection shapeCollection) {
        super(shapeCollection);
        this.f2522k4 = new List<>();
        this.f2525to = new List<>();
        this.f2520du = new List<>();
        this.f2523kk = new List<>();
        this.f2521h4 = new List<>();
        this.f2524m9 = new List<>();
        m2560k4(new wh5(this));
    }

    /* JADX INFO: renamed from: ck */
    public final List<vkh> m1770ck() {
        return this.f2522k4;
    }

    @Override // com.aspose.slides.IInk
    public final IInkTrace[] getTraces() {
        return m1769k4(m1771k4(), m1773kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final List<InkTrace> m1771k4() {
        return this.f2523kk;
    }

    /* JADX INFO: renamed from: kk */
    public final List<oxb> m1773kk() {
        return this.f2525to;
    }

    /* JADX INFO: renamed from: rv */
    public final List<los> m1774rv() {
        return this.f2521h4;
    }

    /* JADX INFO: renamed from: to */
    public final C7488dk m1775to() {
        return this.f2527yj;
    }

    /* JADX INFO: renamed from: up */
    public final bfl m1776up() {
        return this.f2526x1;
    }

    /* JADX INFO: renamed from: wl */
    public final List<d7i> m1777wl() {
        return this.f2524m9;
    }

    /* JADX INFO: renamed from: yj */
    public final List<ee1> m1778yj() {
        return this.f2520du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1772k4(C7488dk c7488dk) {
        this.f2527yj = c7488dk;
    }

    /* JADX INFO: renamed from: k4 */
    private IInkTrace[] m1769k4(List<InkTrace> list, List<oxb> list2) {
        List list3 = new List();
        List.Enumerator<oxb> it = list.iterator();
        while (it.hasNext()) {
            try {
                list3.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = list2.iterator();
        while (it.hasNext()) {
            try {
                oxb next = it.next();
                list3.addRange(AbstractC14092to.m67204k4((Object[]) m1769k4(next.m68891k4(), next.m68897x1())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (IInkTrace[]) list3.toArray(new IInkTrace[0]);
    }
}
