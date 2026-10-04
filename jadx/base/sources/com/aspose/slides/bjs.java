package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p332p7.C7971j0;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: loaded from: classes3.dex */
class bjs {

    /* JADX INFO: renamed from: k4 */
    private gnb f4211k4;

    /* JADX INFO: renamed from: x1 */
    private C11791os f4215x1;

    /* JADX INFO: renamed from: kk */
    private final SortedList<String, ISlideComponent> f4212kk = new SortedList<>(AbstractC14070jw.m66790x1());

    /* JADX INFO: renamed from: to */
    private final List<ISlideComponent> f4214to = new List<>();

    /* JADX INFO: renamed from: du */
    private final Dictionary<IConnector, C7971j0> f4209du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private final SortedList<Long, IPlaceholder> f4210h4 = new SortedList<>();

    /* JADX INFO: renamed from: m9 */
    private final List<IPlaceholder> f4213m9 = new List<>();

    public bjs(gnb gnbVar, C11791os c11791os) {
        this.f4211k4 = gnbVar;
        this.f4215x1 = c11791os;
    }

    /* JADX INFO: renamed from: du */
    public final List<ISlideComponent> m4226du() {
        return this.f4214to;
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<IConnector, C7971j0> m4227dy() {
        return this.f4209du;
    }

    /* JADX INFO: renamed from: h4 */
    public final SortedList<Long, IPlaceholder> m4228h4() {
        return this.f4210h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final gnb m4229k4() {
        return this.f4211k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C11723d3 m4235kk() {
        int iM6775du = this.f4211k4.m6775du();
        if (iM6775du == 0 || iM6775du == 1 || iM6775du == 2) {
            return this.f4215x1.m55377up();
        }
        if (iM6775du != 3) {
            throw new ArgumentOutOfRangeException();
        }
        C11791os c11791os = this.f4215x1;
        if (c11791os == null) {
            return null;
        }
        return c11791os.m55377up();
    }

    /* JADX INFO: renamed from: m9 */
    public final List<IPlaceholder> m4236m9() {
        return this.f4213m9;
    }

    /* JADX INFO: renamed from: to */
    public final SortedList<String, ISlideComponent> m4237to() {
        return this.f4212kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11791os m4238x1() {
        return this.f4215x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4230k4(IShape iShape) {
        String strM67465x1 = C14114y9.m67465x1(((Shape) iShape).m2584wp());
        if (m4237to().containsKey(strM67465x1)) {
            m4237to().set_Item(strM67465x1, iShape);
        } else {
            m4237to().addItem(strM67465x1, iShape);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4231k4(C11791os c11791os) {
        if (c11791os != null) {
            this.f4215x1 = c11791os;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m4232k4(long j, IPlaceholder iPlaceholder) {
        return m4233k4(j, iPlaceholder, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m4233k4(long j, IPlaceholder iPlaceholder, boolean z) {
        if (this.f4211k4.m6800x6()) {
            return true;
        }
        if (!m4228h4().containsKey(Long.valueOf(j))) {
            m4228h4().addItem(Long.valueOf(j), iPlaceholder);
            return true;
        }
        if (z) {
            m4236m9().addItem(iPlaceholder);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m4234k4(String str, ISlideComponent iSlideComponent) {
        if (this.f4211k4.m6800x6()) {
            return true;
        }
        if (m4237to().containsKey(str) || "0".equals(str)) {
            m4226du().addItem(iSlideComponent);
            return false;
        }
        m4237to().addItem(str, iSlideComponent);
        return true;
    }
}
