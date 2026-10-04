package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.qk */
/* JADX INFO: loaded from: classes5.dex */
public class C13172qk {

    /* JADX INFO: renamed from: du */
    private int f44233du;

    /* JADX INFO: renamed from: k4 */
    private C13211sz[] f44234k4;

    /* JADX INFO: renamed from: kk */
    private int f44235kk = -1;

    /* JADX INFO: renamed from: to */
    private int f44236to;

    /* JADX INFO: renamed from: x1 */
    private int f44237x1;

    public C13172qk(int i, int i2, int i3) {
        this.f44237x1 = i;
        this.f44234k4 = new C13211sz[i];
        this.f44236to = i2;
        this.f44233du = i3;
    }

    public boolean equals(Object obj) {
        C13172qk c13172qk = (C13172qk) obj;
        int i = 0;
        while (true) {
            C13211sz[] c13211szArr = this.f44234k4;
            if (i >= c13211szArr.length) {
                return true;
            }
            if (!c13211szArr[i].m61602k4(c13172qk.f44234k4[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = this.f44235kk;
        if (i != -1) {
            return i;
        }
        this.f44235kk = 0;
        int i2 = 0;
        while (true) {
            C13211sz[] c13211szArr = this.f44234k4;
            if (i2 >= c13211szArr.length) {
                return this.f44235kk;
            }
            c13211szArr[i2].m61604m9();
            if (this.f44234k4[i2].m61603kk()) {
                for (int i3 = 0; i3 < this.f44234k4[i2].m61601k4(); i3++) {
                    this.f44235kk = this.f44234k4[i2].m61605to()[i3].hashCode() + this.f44235kk;
                }
            } else {
                AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27452k4(this.f44234k4[i2].m61599du(), AbstractC14092to.class);
                if (abstractC14092to != null) {
                    C12965eg[] c12965egArr = (C12965eg[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to), C12965eg[].class);
                    if (c12965egArr != null) {
                        for (int i4 = 0; i4 < c12965egArr.length; i4++) {
                            this.f44235kk = ((C12965eg) AbstractC14092to.m67208k4((Object) c12965egArr).m67275kk(i4)).m60389to().hashCode() + this.f44235kk;
                        }
                    } else {
                        for (int i5 = 0; i5 < ((AbstractC14092to) C7019kk.m27458kk(this.f44234k4[i2].m61599du(), AbstractC14092to.class)).m67265du(); i5++) {
                            this.f44235kk = ((AbstractC14092to) C7019kk.m27458kk(this.f44234k4[i2].m61599du(), AbstractC14092to.class)).m67275kk(i5).hashCode() + this.f44235kk;
                        }
                    }
                } else {
                    this.f44235kk = this.f44234k4[i2].m61599du().hashCode() + this.f44235kk;
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61422k4() {
        return this.f44236to;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61425kk() {
        int i = 0;
        while (true) {
            C13211sz[] c13211szArr = this.f44234k4;
            if (i >= c13211szArr.length) {
                return true;
            }
            C13211sz c13211sz = c13211szArr[i];
            if (c13211sz == null || c13211sz.m61599du() == null) {
                break;
            }
            i++;
        }
        return false;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(this.f44234k4[0].toString());
        for (int i = 1; i < this.f44234k4.length; i++) {
            c6765kp.m26792k4(" ");
            c6765kp.m26792k4(this.f44234k4[i].toString());
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m61426x1() {
        return this.f44233du;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m61423k4(int i) {
        return this.f44234k4[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61424k4(int i, Object obj) {
        this.f44234k4[i] = (C13211sz) obj;
    }
}
