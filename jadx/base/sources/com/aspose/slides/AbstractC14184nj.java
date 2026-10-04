package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p021af.C1369x1;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.nj */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14184nj {

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f47551k4 = new C12025x6();

    /* JADX INFO: renamed from: kk */
    private final C12804k4 f47552kk;

    /* JADX INFO: renamed from: x1 */
    private final C14247oq f47553x1;

    public AbstractC14184nj(C14247oq c14247oq, C12804k4 c12804k4) {
        this.f47553x1 = c14247oq;
        this.f47552kk = c12804k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m68058k4(AbstractC10973uz abstractC10973uz) {
        C12025x6 c12025x6Clone = m68061x1().Clone();
        C10951c5 c10951c5 = abstractC10973uz != null ? (C10951c5) C7019kk.m27452k4((Object) abstractC10973uz.m53116um(), C10951c5.class) : null;
        if (c10951c5 == null) {
            C1369x1 c1369x1Mo8118x1 = m68059k4().m68752x1().mo8118x1(m68060kk());
            return c1369x1Mo8118x1 != null ? c1369x1Mo8118x1.m8124kk().m56552du() : c12025x6Clone;
        }
        List list = new List();
        C10963ks c10963ks = (C10963ks) C7019kk.m27452k4((Object) abstractC10973uz, C10963ks.class);
        if (c10963ks != null) {
            c10963ks.m52979fa().CloneTo(c12025x6Clone);
            if (c10963ks.mo52909to() != null) {
                list.addItem(c10963ks.mo52909to());
            }
        } else {
            C10970u4 c10970u4 = (C10970u4) C7019kk.m27452k4((Object) abstractC10973uz, C10970u4.class);
            if (c10970u4 != null) {
                c10970u4.m53072k4().CloneTo(c12025x6Clone);
            }
        }
        do {
            if (c10951c5.mo52909to() != null) {
                list.addItem(c10951c5.mo52909to());
            }
            c10951c5 = (C10951c5) C7019kk.m27452k4((Object) c10951c5.m53116um(), C10951c5.class);
        } while (c10951c5 != null);
        C4317dy c4317dy = new C4317dy();
        list.reverse();
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                c4317dy.m17340k4((C4317dy) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c4317dy.m17333k4(c12025x6Clone.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public final C12804k4 m68060kk() {
        return this.f47552kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m68061x1() {
        return this.f47551k4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14247oq m68059k4() {
        return this.f47553x1;
    }
}
