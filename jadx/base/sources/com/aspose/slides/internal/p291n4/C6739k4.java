package com.aspose.slides.internal.p291n4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p101e6.C3583k4;
import com.aspose.slides.internal.p135fp.C4091dy;
import com.aspose.slides.internal.p450uu.C11560x1;
import com.aspose.slides.internal.p550zi.AbstractC13610rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.n4.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6739k4 extends AbstractC13610rv {

    /* JADX INFO: renamed from: c5 */
    private C4091dy f18566c5;

    /* JADX INFO: renamed from: du */
    private C3583k4 f18567du;

    /* JADX INFO: renamed from: dy */
    private C11560x1 f18568dy;

    /* JADX INFO: renamed from: k4 */
    private int f18570k4;

    /* JADX INFO: renamed from: m9 */
    private String f18572m9;

    /* JADX INFO: renamed from: to */
    private C3583k4 f18573to;

    /* JADX INFO: renamed from: x1 */
    private int f18574x1;

    /* JADX INFO: renamed from: kk */
    private int f18571kk = 0;

    /* JADX INFO: renamed from: h4 */
    private int f18569h4 = 1;

    public C6739k4() {
        m26534x1(75);
    }

    /* JADX INFO: renamed from: kk */
    private static int m26520kk(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i > 100) {
            i = 100;
        }
        return i < 50 ? 5000 / i : 200 - (i * 2);
    }

    /* JADX INFO: renamed from: c5 */
    public C3583k4 m26521c5() {
        return this.f18573to;
    }

    /* JADX INFO: renamed from: du */
    public C11560x1 m26522du() {
        return this.f18568dy;
    }

    /* JADX INFO: renamed from: dy */
    public int m26523dy() {
        return this.f18570k4;
    }

    /* JADX INFO: renamed from: h4 */
    public int m26524h4() {
        return this.f18571kk;
    }

    /* JADX INFO: renamed from: jd */
    public C3583k4 m26525jd() {
        return this.f18567du;
    }

    /* JADX INFO: renamed from: k4 */
    public void m26526k4(int i) {
        this.f18569h4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public int m26532m9() {
        return this.f18569h4;
    }

    /* JADX INFO: renamed from: to */
    public String m26533to() {
        return this.f18572m9;
    }

    /* JADX INFO: renamed from: x1 */
    public void m26534x1(int i) {
        if (i > 100 || i < 1) {
            throw new ArgumentOutOfRangeException("Quality must be between 1 and 100.");
        }
        this.f18574x1 = i;
        this.f18570k4 = m26520kk(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26527k4(C3583k4 c3583k4) {
        this.f18573to = c3583k4;
    }

    /* JADX INFO: renamed from: kk */
    public C4091dy m26531kk() {
        return this.f18566c5;
    }

    /* JADX INFO: renamed from: x1 */
    public void m26535x1(C3583k4 c3583k4) {
        this.f18567du = c3583k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m26528k4(C4091dy c4091dy) {
        this.f18566c5 = c4091dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m26529k4(C11560x1 c11560x1) {
        this.f18568dy = c11560x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m26530k4(String str) {
        this.f18572m9 = str;
    }
}
