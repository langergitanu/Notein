package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p233kn.C5888k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class b3h extends AbstractC14206nx implements InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f4115du = new C7017h4("style.visibility", "fill.type", "hidden", "visible", "solid", "style.fontWeight");

    /* JADX INFO: renamed from: kk */
    private final String f4116kk;

    /* JADX INFO: renamed from: to */
    private final C5888k4<Integer> f4117to;

    /* JADX INFO: renamed from: x1 */
    public final SetEffect f4118x1;

    private b3h(IShape iShape, C5888k4<Integer> c5888k4, SetEffect setEffect, String str) {
        super(iShape);
        C5888k4<Integer> c5888k42 = new C5888k4<>();
        this.f4117to = c5888k42;
        c5888k4.CloneTo(c5888k42);
        this.f4118x1 = setEffect;
        this.f4116kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static b3h m3985k4(IShape iShape, SetEffect setEffect) {
        if (setEffect.getProperties().size() != 1) {
            return null;
        }
        return new b3h(iShape, new C5888k4(-1, -1), setEffect, setEffect.getProperties().get_Item(0).getValue());
    }

    /* JADX INFO: renamed from: x1 */
    private void m3989x1() {
        if (this.f4117to.f16593k4.intValue() < 0) {
            m3987k4(this.f47636k4);
        } else {
            m3988k4(this.f4117to.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static b3h m3986k4(IShape iShape, C5888k4<Integer> c5888k4, SetEffect setEffect) {
        if (setEffect.getProperties().size() != 1) {
            return null;
        }
        return new b3h(iShape, c5888k4.Clone(), setEffect, setEffect.getProperties().get_Item(0).getValue());
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        m3989x1();
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        m3989x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m3987k4(IShape iShape) {
        C7017h4 c7017h4 = f4115du;
        int iM27428k4 = c7017h4.m27428k4(this.f4116kk);
        if (iM27428k4 != 0) {
            if (iM27428k4 == 1 && c7017h4.m27428k4((String) C7019kk.m27452k4(this.f4118x1.getTo(), String.class)) == 4) {
                iShape.getFillFormat().setFillType((byte) 1);
                return;
            }
            return;
        }
        int iM27428k42 = c7017h4.m27428k4((String) C7019kk.m27452k4(this.f4118x1.getTo(), String.class));
        if (iM27428k42 == 2) {
            iShape.setHidden(true);
        } else {
            if (iM27428k42 != 3) {
                return;
            }
            iShape.setHidden(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m3988k4(C5888k4<Integer> c5888k4) {
        C7017h4 c7017h4 = f4115du;
        int iM27428k4 = c7017h4.m27428k4(this.f4116kk);
        if (iM27428k4 == 0) {
            if (C7019kk.m27469x1(this.f47636k4, AutoShape.class)) {
                InterfaceC13762l4 interfaceC13762l4 = ((AutoShape) C7019kk.m27452k4((Object) this.f47636k4, AutoShape.class)).m288x1().f3523to;
                int iM27428k42 = c7017h4.m27428k4((String) C7019kk.m27452k4(this.f4118x1.getTo(), String.class));
                if (iM27428k42 == 2) {
                    interfaceC13762l4.mo64293k4(c5888k4.f16593k4.intValue(), c5888k4.f16594x1.intValue(), true);
                    return;
                } else {
                    if (iM27428k42 != 3) {
                        return;
                    }
                    interfaceC13762l4.mo64293k4(c5888k4.f16593k4.intValue(), c5888k4.f16594x1.intValue(), false);
                    return;
                }
            }
            return;
        }
        if (iM27428k4 == 5 && C7019kk.m27469x1(this.f47636k4, AutoShape.class) && "bold".equals(C7019kk.m27452k4(this.f4118x1.getTo(), String.class))) {
            IGenericEnumerator<IParagraph> it = ((AutoShape) C7019kk.m27452k4((Object) this.f47636k4, AutoShape.class)).m288x1().getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    it.next().getParagraphFormat().getDefaultPortionFormat().setFontBold((byte) 1);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }
}
