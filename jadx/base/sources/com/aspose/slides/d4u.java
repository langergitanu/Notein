package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
class d4u {

    /* JADX INFO: renamed from: k4 */
    private final IPortion f4537k4;

    /* JADX INFO: renamed from: x1 */
    private String f4538x1;

    public d4u(IPortion iPortion, char c) {
        if (iPortion == null) {
            throw new ArgumentNullException("portion");
        }
        this.f4537k4 = iPortion;
        this.f4538x1 = C14117yj.m67537ne(c);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m4945k4() {
        return this.f4538x1;
    }

    /* JADX INFO: renamed from: kk */
    public final Portion m4947kk() {
        Portion portion = new Portion((Portion) this.f4537k4);
        portion.setText(this.f4538x1);
        return portion;
    }

    /* JADX INFO: renamed from: x1 */
    public final IPortion m4948x1() {
        return this.f4537k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4946k4(d4u d4uVar) {
        if (d4uVar == null) {
            throw new ArgumentNullException("replacement");
        }
        this.f4538x1 = C14113y2.m67400k4(this.f4538x1, d4uVar.f4538x1);
    }
}
