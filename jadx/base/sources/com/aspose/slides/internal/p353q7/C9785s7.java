package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p505xn.C12566m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9785s7 implements IGenericEnumerable<C9771gi> {

    /* JADX INFO: renamed from: k4 */
    private int f35367k4;

    /* JADX INFO: renamed from: kk */
    private final List<C9771gi> f35368kk;

    /* JADX INFO: renamed from: to */
    private final float f35369to;

    /* JADX INFO: renamed from: x1 */
    private int f35370x1;

    public C9785s7() {
        this(1.0f);
    }

    /* JADX INFO: renamed from: x1 */
    private C9771gi m48133x1() {
        return m48135k4(this.f35368kk.size() - 1);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C9771gi> iterator() {
        return this.f35368kk.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48134k4() {
        return this.f35368kk.size();
    }

    public C9785s7(float f) {
        this.f35368kk = new List<>();
        this.f35369to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9771gi m48135k4(int i) {
        if (i < 0 || i >= this.f35368kk.size()) {
            return null;
        }
        return this.f35368kk.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48136k4(int i, int i2) {
        this.f35367k4 = i;
        this.f35370x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48137k4(int i, int i2, boolean z, boolean z2) {
        int iM58636c5 = C12566m9.m58636c5(i * this.f35369to);
        int iM58636c52 = C12566m9.m58636c5(i2 * this.f35369to);
        int i3 = this.f35367k4 + iM58636c5;
        this.f35367k4 = i3;
        int i4 = this.f35370x1 + iM58636c52;
        this.f35370x1 = i4;
        C9771gi c9771gi = new C9771gi(iM58636c5, iM58636c52, i3, i4, z, z2);
        if (m48133x1() != null && m48133x1().m48082to() && c9771gi.m48082to()) {
            return;
        }
        this.f35368kk.addItem(c9771gi);
    }
}
