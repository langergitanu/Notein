package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.uz */
/* JADX INFO: loaded from: classes.dex */
public final class C3831uz implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    static byte[] f10443k4 = new byte[0];

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f10444kk = new C7017h4("2.5.29.14", "2.5.29.15", "2.5.29.19", "2.5.29.37");

    /* JADX INFO: renamed from: x1 */
    private ArrayList f10445x1;

    public C3831uz() {
        this.f10445x1 = new ArrayList();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("negative index");
        }
        if (i >= abstractC14092to.m67265du()) {
            throw new ArgumentOutOfRangeException("index >= array.Length");
        }
        this.f10445x1.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return this.f10445x1.isSynchronized();
    }

    /* JADX INFO: renamed from: k4 */
    public C3828u4 m15356k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("oid");
        }
        if (this.f10445x1.size() != 0 && str.length() != 0) {
            for (C3828u4 c3828u4 : this.f10445x1) {
                if (C14113y2.m67363du(c3828u4.m19730k4().m19795x1(), str)) {
                    return c3828u4;
                }
            }
        }
        return null;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f10445x1.size();
    }

    public C3831uz(C10945x1 c10945x1) {
        this.f10445x1 = new ArrayList(c10945x1.m52845x1().size());
        if (c10945x1.m52845x1().size() == 0) {
            return;
        }
        for (C10934du c10934du : c10945x1.m52845x1()) {
            boolean zM52723to = c10934du.m52723to();
            String strM52722kk = c10934du.m52722kk();
            C12842x1 c12842x1M52721du = c10934du.m52721du();
            C3828u4 c3829um = null;
            byte[] bArrM59708du = (C7019kk.m27462to(Byte.valueOf(c12842x1M52721du.m59718x1()), 6) != 4 || c12842x1M52721du.m59709k4() <= 0) ? null : c12842x1M52721du.m59710k4(0).m59708du();
            int iM27428k4 = f10444kk.m27428k4(strM52722kk);
            if (iM27428k4 == 0) {
                c3829um = new C3829um(new C4750to(strM52722kk, bArrM59708du), zM52723to);
            } else if (iM27428k4 == 1) {
                c3829um = new C3825qq(new C4750to(strM52722kk, bArrM59708du), zM52723to);
            } else if (iM27428k4 == 2) {
                c3829um = new C3814du(new C4750to(strM52722kk, bArrM59708du), zM52723to);
            } else if (iM27428k4 == 3) {
                c3829um = new C3818ix(new C4750to(strM52722kk, bArrM59708du), zM52723to);
            }
            if (c3829um == null) {
                c3829um = new C3828u4(strM52722kk, bArrM59708du == null ? f10443k4 : bArrM59708du, zM52723to);
            }
            this.f10445x1.addItem(c3829um);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3832wl iterator() {
        return new C3832wl(this.f10445x1);
    }
}
