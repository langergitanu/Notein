package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p294n9.AbstractC6761ix;
import com.aspose.slides.internal.p294n9.AbstractC6769ne;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C13918jd extends AbstractC6769ne {

    /* JADX INFO: renamed from: du */
    private int f46580du;

    /* JADX INFO: renamed from: k4 */
    private C13874ck f46581k4;

    /* JADX INFO: renamed from: kk */
    private int f46582kk;

    /* JADX INFO: renamed from: to */
    private int f46583to;

    /* JADX INFO: renamed from: x1 */
    private int[] f46584x1;

    @Override // com.aspose.slides.internal.p294n9.AbstractC6769ne
    /* JADX INFO: renamed from: k4 */
    public AbstractC6761ix mo26736k4() {
        if (this.f46581k4 == null) {
            this.f46581k4 = new C13874ck(this);
        }
        return this.f46581k4;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6769ne
    /* JADX INFO: renamed from: x1 */
    public int mo26737x1() {
        return 12;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65489k4(int i) {
        this.f46580du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m65491x1(int i) {
        int i2 = this.f46583to;
        int i3 = this.f46580du + i;
        while (i2 < this.f46582kk) {
            int i4 = i2 + 1;
            if (i3 < this.f46584x1[i4]) {
                break;
            }
            i2 = i4;
        }
        this.f46583to = i2;
        return (i2 & 1) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65490k4(int[] iArr, int i) {
        this.f46584x1 = iArr;
        this.f46582kk = i;
        this.f46583to = 0;
    }
}
