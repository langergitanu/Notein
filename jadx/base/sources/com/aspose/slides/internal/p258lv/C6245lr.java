package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C6245lr extends C6257wy {

    /* JADX INFO: renamed from: k4 */
    private short f17702k4;

    /* JADX INFO: renamed from: kk */
    private short f17703kk;

    /* JADX INFO: renamed from: x1 */
    private List<C6256wl> f17704x1;

    public C6245lr(C6258x1 c6258x1, short s) {
        super(c6258x1);
        this.f17702k4 = (short) 1;
        this.f17704x1 = new List<>();
        this.f17703kk = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25343k4() {
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25293x1(this.f17703kk);
        m25384h4().m25293x1(1);
        C6248qq c6248qq = new C6248qq(m25385m9());
        List.Enumerator<C6256wl> it = this.f17704x1.iterator();
        while (it.hasNext()) {
            try {
                c6248qq.m25360k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m25384h4().m25283k4(1, 0);
        m25384h4().m25283k4(0, 0);
        c6260yd.m25414k4(39);
    }

    /* JADX INFO: renamed from: x1 */
    public final short m25346x1() {
        return this.f17703kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25344k4(short s, C4317dy c4317dy, String str) {
        m25345k4(s, c4317dy, str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25345k4(short s, C4317dy c4317dy, String str, boolean z) {
        short s2 = this.f17702k4;
        this.f17702k4 = (short) (s2 + 1);
        this.f17704x1.addItem(new C6256wl(s, c4317dy, s2, str, z));
    }
}
