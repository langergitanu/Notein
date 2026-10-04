package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12522wl extends C3023to {

    /* JADX INFO: renamed from: du */
    private short f41931du;

    /* JADX INFO: renamed from: dy */
    private C12515qq[] f41932dy;

    /* JADX INFO: renamed from: h4 */
    private short f41933h4;

    /* JADX INFO: renamed from: k4 */
    private short f41934k4;

    /* JADX INFO: renamed from: kk */
    private int f41935kk;

    /* JADX INFO: renamed from: m9 */
    private C12518u4 f41936m9;

    /* JADX INFO: renamed from: to */
    private short f41937to;

    /* JADX INFO: renamed from: x1 */
    private short f41938x1;

    /* JADX INFO: renamed from: du */
    public final void m58261du(short s) {
        this.f41933h4 = s;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12018u4 m58262h4() {
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56764to();
        for (C12515qq c12515qq : m58271to()) {
            for (int iM58209x1 = c12515qq.m58209x1() & 65535; iM58209x1 < (c12515qq.m58205kk() & 65535); iM58209x1++) {
                for (C12501ar c12501ar : c12515qq.m58208to()) {
                    c12018u4.m56760kk(new C12014ne(c12501ar.m58064k4() & 65535, iM58209x1, c12501ar.m58066x1() & 65535, iM58209x1 + 1));
                }
            }
        }
        return c12018u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m58263k4() {
        return this.f41938x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C12518u4 m58268kk() {
        return this.f41936m9;
    }

    /* JADX INFO: renamed from: to */
    public final void m58270to(short s) {
        this.f41931du = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m58272x1() {
        return this.f41931du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58264k4(int i) {
        this.f41935kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58269kk(short s) {
        this.f41937to = s;
    }

    /* JADX INFO: renamed from: to */
    public final C12515qq[] m58271to() {
        return this.f41932dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58273x1(short s) {
        this.f41938x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58265k4(C12518u4 c12518u4) {
        this.f41936m9 = c12518u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58266k4(short s) {
        this.f41934k4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58267k4(C12515qq[] c12515qqArr) {
        this.f41932dy = c12515qqArr;
    }
}
