package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9815c5 extends AbstractC9818dy {

    /* JADX INFO: renamed from: ck */
    private final List<AbstractC9818dy> f35554ck = new List<>();

    public C9815c5() {
        this.f35579x1 = C7019kk.m27468x1((Object) (byte) 1, 6);
    }

    /* JADX INFO: renamed from: du */
    public boolean m48340du(AbstractC9818dy abstractC9818dy) {
        this.f35554ck.addItem(abstractC9818dy);
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m48341h4(AbstractC9818dy abstractC9818dy) {
        this.f35554ck.removeItem(abstractC9818dy);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public List<AbstractC9818dy> m48342k4() {
        return this.f35554ck;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m48343kk(String str) {
        this.f35554ck.removeItem(m48344to(str));
        return true;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC9818dy m48344to(String str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < this.f35554ck.size(); i++) {
            AbstractC9818dy abstractC9818dy = this.f35554ck.get_Item(i);
            if (C14113y2.m67363du(abstractC9818dy.m48372ck(), str)) {
                return abstractC9818dy;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m48345x1(String str) {
        if (str != null) {
            for (int i = 0; i < this.f35554ck.size(); i++) {
                if (C14113y2.m67363du(this.f35554ck.get_Item(i).m48372ck(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C9815c5(String str) {
        this.f35579x1 = C7019kk.m27468x1((Object) (byte) 1, 6);
        m48380k4(str);
    }
}
