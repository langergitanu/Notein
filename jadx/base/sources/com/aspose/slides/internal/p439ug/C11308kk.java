package com.aspose.slides.internal.p439ug;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p550zi.C13598dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11308kk {

    /* JADX INFO: renamed from: du */
    private final int[] f38898du;

    /* JADX INFO: renamed from: k4 */
    protected final int[] f38899k4;

    /* JADX INFO: renamed from: kk */
    protected int f38900kk;

    /* JADX INFO: renamed from: to */
    protected int f38901to;

    /* JADX INFO: renamed from: x1 */
    protected int[] f38902x1;

    public C11308kk(int i, boolean z) {
        if (z) {
            this.f38899k4 = new int[]{C13598dy.m62724k4(C12003du.m56385i5()), C13598dy.m62724k4(C12003du.m56460uz())};
            this.f38898du = new int[]{25500, 0};
        } else {
            this.f38899k4 = new int[]{C13598dy.m62724k4(C12003du.m56460uz()), C13598dy.m62724k4(C12003du.m56385i5())};
            this.f38898du = new int[]{0, 25500};
        }
        this.f38902x1 = new int[i + 1];
    }

    /* JADX INFO: renamed from: du */
    public void m54313du() {
        this.f38901to = 0;
    }

    /* JADX INFO: renamed from: h4 */
    public void m54314h4() {
        this.f38900kk++;
        int i = this.f38901to + 1;
        this.f38901to = i;
        if (i == 2) {
            this.f38901to = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int m54315k4() {
        return this.f38898du[this.f38901to];
    }

    /* JADX INFO: renamed from: kk */
    public int m54316kk() {
        return this.f38901to;
    }

    /* JADX INFO: renamed from: to */
    public int[] m54317to() {
        return this.f38902x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m54318x1() {
        int i = this.f38901to + 1;
        if (i > 1) {
            return 0;
        }
        return i;
    }
}
