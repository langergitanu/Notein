package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p085dk.C3169ck;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12593c5 implements IGenericEnumerable<C12595dy> {

    /* JADX INFO: renamed from: k4 */
    private final String f42130k4;

    /* JADX INFO: renamed from: to */
    private int f42132to = 1;

    /* JADX INFO: renamed from: x1 */
    private final C12571u4<C12595dy> f42133x1 = new C12571u4<>(true);

    /* JADX INFO: renamed from: kk */
    private final C12571u4<C12595dy> f42131kk = new C12571u4<>(false);

    public C12593c5(String str) {
        this.f42130k4 = str;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C12595dy> iterator() {
        return this.f42133x1.getValues().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m58783k4() {
        return this.f42133x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m58784k4(String str, String str2, boolean z) {
        if (!z) {
            str2 = AbstractC12594du.m58786k4(this.f42130k4, str2);
        } else if (C3169ck.m13544k4(str2)) {
            str2 = C3169ck.m13538du(C14113y2.m67408k4("file:///", str2));
        }
        C12595dy[] c12595dyArr = {null};
        boolean zTryGetValue = this.f42131kk.tryGetValue(str2, c12595dyArr);
        C12595dy c12595dy = c12595dyArr[0];
        if (zTryGetValue) {
            return c12595dy.m58794k4();
        }
        String strM67402k4 = C14113y2.m67402k4("rId{0}", Integer.valueOf(this.f42132to));
        this.f42132to++;
        m58785k4(strM67402k4, str, str2, z);
        return strM67402k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58785k4(String str, String str2, String str3, boolean z) {
        C12595dy c12595dy = new C12595dy(str, str2, str3, z);
        this.f42133x1.set_Item(str, c12595dy);
        this.f42131kk.set_Item(str3, c12595dy);
    }
}
