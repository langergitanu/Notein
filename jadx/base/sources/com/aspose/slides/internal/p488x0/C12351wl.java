package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12351wl extends C12535to {

    /* JADX INFO: renamed from: du */
    private short f41307du;

    /* JADX INFO: renamed from: dy */
    private C12344qq[] f41308dy;

    /* JADX INFO: renamed from: h4 */
    private short f41309h4;

    /* JADX INFO: renamed from: k4 */
    private short f41310k4;

    /* JADX INFO: renamed from: kk */
    private int f41311kk;

    /* JADX INFO: renamed from: m9 */
    private C12347u4 f41312m9;

    /* JADX INFO: renamed from: to */
    private short f41313to;

    /* JADX INFO: renamed from: x1 */
    private short f41314x1;

    /* JADX INFO: renamed from: c5 */
    public final C12344qq[] m57854c5() {
        return this.f41308dy;
    }

    /* JADX INFO: renamed from: du */
    public final void m57855du(short s) {
        this.f41309h4 = s;
    }

    /* JADX INFO: renamed from: dy */
    public final C12347u4 m57856dy() {
        return this.f41312m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final short m57857h4() {
        return this.f41307du;
    }

    /* JADX INFO: renamed from: jd */
    public final C12018u4 m57858jd() {
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56764to();
        for (C12344qq c12344qq : m57854c5()) {
            for (int iM57793x1 = c12344qq.m57793x1() & 65535; iM57793x1 < (c12344qq.m57789kk() & 65535); iM57793x1++) {
                for (C12330ar c12330ar : c12344qq.m57792to()) {
                    c12018u4.m56760kk(new C12014ne(c12330ar.m57625k4() & 65535, iM57793x1, c12330ar.m57627x1() & 65535, iM57793x1 + 1));
                }
            }
        }
        return c12018u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m57859k4() {
        return this.f41310k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57864kk() {
        return this.f41311kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final short m57866m9() {
        return this.f41309h4;
    }

    /* JADX INFO: renamed from: to */
    public final short m57867to() {
        return this.f41313to;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m57869x1() {
        return this.f41314x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57860k4(int i) {
        this.f41311kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m57865kk(short s) {
        this.f41313to = s;
    }

    /* JADX INFO: renamed from: to */
    public final void m57868to(short s) {
        this.f41307du = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57870x1(short s) {
        this.f41314x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57861k4(C12347u4 c12347u4) {
        this.f41312m9 = c12347u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57862k4(short s) {
        this.f41310k4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57863k4(C12344qq[] c12344qqArr) {
        this.f41308dy = c12344qqArr;
    }
}
