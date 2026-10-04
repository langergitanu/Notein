package com.aspose.slides.internal.p119f0;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p353q7.AbstractC9768f9;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9792um;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.f0.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C3837h4 {

    /* JADX INFO: renamed from: k4 */
    private int f10451k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC9768f9 f10452kk;

    /* JADX INFO: renamed from: x1 */
    private int f10453x1;

    public C3837h4(int i, int i2, AbstractC9768f9 abstractC9768f9) {
        this(abstractC9768f9);
        this.f10451k4 = i;
        this.f10453x1 = i2;
    }

    /* JADX INFO: renamed from: du */
    public final int m15363du() {
        return this.f10451k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m15364h4() {
        return this.f10453x1;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo15360k4(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m15366m9() {
        return ((this.f10451k4 & 65535) == 3 && (this.f10453x1 & 65535) == 4) ? false : true;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC9768f9 m15367to() {
        return this.f10452kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m15368x1(int i) {
        return ((this.f10451k4 & 65535) == 3 && (this.f10453x1 & 65535) == 4) ? AbstractC6747ar.m26638k4(AbstractC6747ar.m26643rv(), C12555c5.m58553k4("big5"), AbstractC6747ar.m26643rv().m26683x1(new char[]{(char) (i & 65535)})) : C14069jd.m66778k4((short) i);
    }

    public C3837h4(AbstractC9768f9 abstractC9768f9) {
        this.f10452kk = abstractC9768f9;
    }

    /* JADX INFO: renamed from: k4 */
    public C9777kp mo15361k4(C9792um c9792um) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo15362k4(C12564kk c12564kk) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo15365k4(C12570to c12570to) {
    }
}
