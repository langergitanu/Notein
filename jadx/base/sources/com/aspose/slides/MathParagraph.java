package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class MathParagraph implements IMathParagraph, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private int f2788k4;

    /* JADX INFO: renamed from: kk */
    private MathPortion f2789kk;

    /* JADX INFO: renamed from: to */
    private final List<IMathBlock> f2790to;

    /* JADX INFO: renamed from: x1 */
    private boolean f2791x1;

    public MathParagraph() {
        this.f2790to = new List<>();
        setJustification(4);
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final void add(IMathBlock iMathBlock) {
        ((MathBlock) iMathBlock).m1972k4(this);
        this.f2790to.addItem(iMathBlock);
        m2000kk();
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final void clear() {
        List.Enumerator<IMathBlock> it = this.f2790to.iterator();
        while (it.hasNext()) {
            try {
                ((MathBlock) it.next()).m1975x1();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f2790to.clear();
        m2000kk();
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final boolean contains(IMathBlock iMathBlock) {
        return this.f2790to.containsItem(iMathBlock);
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final int getCount() {
        return this.f2790to.size();
    }

    @Override // com.aspose.slides.IMathParagraph
    public final int getJustification() {
        return this.f2788k4;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2789kk;
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final IMathBlock get_Item(int i) {
        return this.f2790to.get_Item(i);
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final int indexOf(IMathBlock iMathBlock) {
        return this.f2790to.indexOf(iMathBlock);
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final void insert(int i, IMathBlock iMathBlock) {
        this.f2790to.insertItem(i, iMathBlock);
        try {
            ((MathBlock) iMathBlock).m1972k4(this);
            m2000kk();
        } catch (RuntimeException e) {
            this.f2790to.removeAt(i);
            throw e;
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IMathBlock> iterator() {
        return this.f2790to.iterator();
    }

    public final IEnumerator iteratorJava() {
        return this.f2790to.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1996k4(MathPortion mathPortion) {
        this.f2789kk = mathPortion;
    }

    /* JADX INFO: renamed from: kk */
    public final void m2000kk() {
        MathPortion mathPortion = (MathPortion) C7019kk.m27452k4((Object) getParent_Immediate(), MathPortion.class);
        if (mathPortion != null) {
            mathPortion.m2002k4();
        }
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final boolean remove(IMathBlock iMathBlock) {
        boolean zRemoveItem = this.f2790to.removeItem(iMathBlock);
        if (zRemoveItem) {
            ((MathBlock) iMathBlock).m1975x1();
            m2000kk();
        }
        return zRemoveItem;
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final void removeAt(int i) {
        IMathBlock iMathBlock = this.f2790to.get_Item(i);
        this.f2790to.removeAt(i);
        ((MathBlock) iMathBlock).m1975x1();
        m2000kk();
    }

    @Override // com.aspose.slides.IMathParagraph
    public final void setJustification(int i) {
        this.f2788k4 = i;
    }

    @Override // com.aspose.slides.IMathBlockCollection
    public final void set_Item(int i, IMathBlock iMathBlock) {
        if (C14067j2.m66729x1(this.f2790to.get_Item(i), iMathBlock)) {
            return;
        }
        ((MathBlock) iMathBlock).m1972k4(this);
        ((MathBlock) this.f2790to.get_Item(i)).m1975x1();
        this.f2790to.set_Item(i, iMathBlock);
        m2000kk();
    }

    @Override // com.aspose.slides.IMathParagraph
    public final String toLatex() {
        return new xlu().m73491k4(this);
    }

    @Override // com.aspose.slides.IMathParagraph
    public final void writeAsMathMl(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.MathParagraph.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                MathParagraph.this.m1997k4(abstractC3150x6);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2001x1() {
        setJustification(4);
        clear();
    }

    public MathParagraph(IMathBlock iMathBlock) {
        if (iMathBlock == null) {
            throw new ArgumentNullException(C14113y2.m67402k4("'{0}' value cannot be null", "mathBlock"));
        }
        ((MathBlock) iMathBlock).m1972k4(this);
        List<IMathBlock> list = new List<>();
        this.f2790to = list;
        list.addItem(iMathBlock);
        setJustification(4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1997k4(AbstractC3150x6 abstractC3150x6) {
        new xgo().m73351k4(this, abstractC3150x6);
    }

    public MathParagraph(MathPortion mathPortion) {
        if (mathPortion == null) {
            throw new ArgumentNullException("parent");
        }
        this.f2790to = new List<>();
        setJustification(4);
        this.f2789kk = mathPortion;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1998k4(boolean z) {
        this.f2791x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1999k4() {
        return this.f2791x1;
    }
}
