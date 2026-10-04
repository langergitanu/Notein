package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class hgg extends AbstractC14213o3 implements InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private final int f5496du;

    /* JADX INFO: renamed from: h4 */
    private final List<C12003du> f5497h4;

    /* JADX INFO: renamed from: kk */
    private final IAutoShape f5498kk;

    /* JADX INFO: renamed from: to */
    private final int f5499to;

    /* JADX INFO: renamed from: x1 */
    private boolean f5500x1;

    public hgg(int i, int i2, IAutoShape iAutoShape, ColorEffect colorEffect) {
        super(colorEffect, iAutoShape.getSlide());
        this.f5500x1 = true;
        this.f5497h4 = new List<>();
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startParIndex");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("endParIndex");
        }
        this.f5498kk = iAutoShape;
        this.f5499to = i;
        this.f5496du = i2;
        if (!"style.color".equals(colorEffect.getProperties().get_Item(0).getValue())) {
            throw new NotSupportedException();
        }
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        mo2024k4(1.0f);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        IGenericEnumerator<IPortion> it;
        IParagraphCollection paragraphs = this.f5498kk.getTextFrame().getParagraphs();
        int i = 0;
        if (this.f5500x1) {
            this.f5500x1 = false;
            this.f5497h4.clear();
            for (int i2 = this.f5499to; i2 <= this.f5496du; i2++) {
                it = paragraphs.get_Item(i2).getPortions().iterator();
                while (it.hasNext()) {
                    try {
                        IPortion next = it.next();
                        this.f5497h4.addItem(((ColorFormat) next.getPortionFormat().getFillFormat().getSolidFillColor()).m1084to().Clone().Clone());
                        next.getPortionFormat().getFillFormat().setFillType((byte) 1);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        for (int i3 = this.f5499to; i3 <= this.f5496du; i3++) {
            it = paragraphs.get_Item(i3).getPortions().iterator();
            while (it.hasNext()) {
                try {
                    IPortion next2 = it.next();
                    if (i < this.f5497h4.size()) {
                        ((ColorFormat) next2.getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(AbstractC14213o3.m68325k4(this.f5497h4.get_Item(i).Clone(), this.f47666k4.Clone(), f).Clone().Clone());
                        i++;
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7139k4(ColorEffect colorEffect) {
        if (colorEffect.getProperties().size() == 1) {
            return "style.color".equals(colorEffect.getProperties().get_Item(0).getValue());
        }
        return false;
    }
}
