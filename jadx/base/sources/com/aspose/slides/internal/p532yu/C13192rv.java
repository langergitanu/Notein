package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C13192rv {

    /* JADX INFO: renamed from: du */
    private int f44276du;

    /* JADX INFO: renamed from: h4 */
    private boolean f44277h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f44278m9;

    /* JADX INFO: renamed from: k4 */
    public static final C13192rv f44272k4 = new C13192rv(1);

    /* JADX INFO: renamed from: x1 */
    public static final C13192rv f44275x1 = new C13192rv(0, false, false);

    /* JADX INFO: renamed from: kk */
    public static final C13192rv f44273kk = new C13192rv(3);

    /* JADX INFO: renamed from: to */
    public static final C13192rv f44274to = new C13192rv(3, true, true);

    public C13192rv(int i) {
        this.f44276du = i;
        this.f44278m9 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60049k4(C13190rs c13190rs, boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61458kk() {
        int i = this.f44276du;
        return i == 0 || i == 3;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m61459to() {
        int i = this.f44276du;
        if (i == 0 || i == 1) {
            return false;
        }
        return this.f44277h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m61460x1() {
        return this.f44276du;
    }

    public C13192rv(int i, boolean z, boolean z2) {
        this.f44276du = i;
        this.f44277h4 = z;
        this.f44278m9 = z2;
    }

    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60050k4(C13190rs c13190rs, boolean z, C13129ny c13129ny) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo60053x1(C13190rs c13190rs) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo60051k4(C13890ei c13890ei, C13190rs c13190rs, int[] iArr) {
        int i = this.f44276du;
        if (i == 0 || i == 1) {
            c13190rs.f44261kk = false;
        }
        iArr[0] = -1;
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m61454k4(AbstractC12950dp abstractC12950dp, C13129ny c13129ny, ArrayList arrayList) {
        m61455k4(abstractC12950dp, c13129ny, arrayList, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m61455k4(AbstractC12950dp abstractC12950dp, C13129ny c13129ny, ArrayList arrayList, boolean z) {
        C13078l0 c13078l0;
        if (!arrayList.contains(abstractC12950dp)) {
            arrayList.addItem(abstractC12950dp);
        }
        C13021hu c13021hu = (C13021hu) C7019kk.m27452k4((Object) abstractC12950dp, C13021hu.class);
        if (c13021hu != null) {
            if ((z || !c13021hu.m60720ne().m65287kk()) && (c13078l0 = (C13078l0) c13129ny.m61314dy().m60649kk(c13021hu.m60721qq())) != null) {
                for (int i = 0; i < c13078l0.m61097k4().size(); i++) {
                    C13021hu c13021hu2 = (C13021hu) c13078l0.m61097k4().get_Item(i);
                    if (!c13021hu.m60721qq().equals(c13021hu2.m60721qq()) && !arrayList.contains(c13021hu2)) {
                        arrayList.addItem(c13021hu2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo60052k4(C13190rs c13190rs) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61456k4(boolean z) {
        this.f44277h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo61457k4() {
        return this.f44278m9;
    }
}
