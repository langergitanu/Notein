package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1373dy;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.he */
/* JADX INFO: loaded from: classes5.dex */
public class C12701he {

    /* JADX INFO: renamed from: k4 */
    private boolean f42244k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f42246x1 = false;

    /* JADX INFO: renamed from: kk */
    private List<C1373dy> f42245kk = new List<>();

    public C12701he(boolean z) {
        this.f42244k4 = z;
    }

    public final Object clone() {
        C12701he c12701he = new C12701he(this.f42244k4);
        c12701he.f42246x1 = this.f42246x1;
        c12701he.f42245kk = new List<>();
        c12701he.f42245kk = new List<>(this.f42245kk);
        return c12701he;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1375h4 m58942k4(boolean z) {
        int size = this.f42245kk.size();
        if (z) {
            while (size > 0 && this.f42245kk.get_Item(size - 1).m8138k4()) {
                size--;
            }
        }
        C1375h4 c1375h4M8146k4 = C1375h4.f5962k4;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            C1373dy c1373dy = this.f42245kk.get_Item(i2);
            C1375h4 c1375h4M8140to = c1373dy.m8140to();
            if (this.f42246x1) {
                c1375h4M8146k4 = c1375h4M8146k4.m8156k4(c1375h4M8140to);
            } else {
                int iM8139kk = c1373dy.m8139kk();
                if (iM8139kk > i) {
                    i = iM8139kk;
                } else if (iM8139kk == i) {
                    if (c1375h4M8140to.m8163x1() <= c1375h4M8146k4.m8163x1()) {
                        if (c1375h4M8140to.m8163x1() == c1375h4M8146k4.m8163x1()) {
                            if (c1375h4M8146k4.m8155k4() < c1375h4M8140to.m8155k4()) {
                                c1375h4M8146k4 = C1375h4.m8146k4(c1375h4M8140to.m8155k4(), c1375h4M8146k4.m8163x1(), c1375h4M8146k4.m8157kk());
                            }
                            if (c1375h4M8146k4.m8157kk() > c1375h4M8140to.m8157kk()) {
                                c1375h4M8146k4 = C1375h4.m8146k4(c1375h4M8146k4.m8155k4(), c1375h4M8146k4.m8163x1(), c1375h4M8140to.m8157kk());
                            }
                        }
                    }
                }
                c1375h4M8146k4 = c1375h4M8140to;
            }
        }
        return c1375h4M8146k4;
    }

    public String toString() {
        return C14113y2.m67407k4("Space Specifier (resolved at begin/end of ref. area:):\n", m58942k4(false), IOUtils.LINE_SEPARATOR_UNIX) + m58942k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58943k4(C1373dy c1373dy) {
        if (this.f42244k4 && c1373dy.m8138k4() && !m58944k4()) {
            return;
        }
        if (c1373dy.m8141x1()) {
            if (!this.f42246x1) {
                this.f42245kk.clear();
                this.f42246x1 = true;
            }
        } else if (this.f42246x1 || !c1373dy.m8140to().m8154h4()) {
            return;
        }
        this.f42245kk.addItem(c1373dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58944k4() {
        return this.f42245kk.size() != 0;
    }
}
