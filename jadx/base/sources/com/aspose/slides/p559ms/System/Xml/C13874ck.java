package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p294n9.AbstractC6761ix;
import com.aspose.slides.internal.p294n9.C6772rv;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C13874ck extends AbstractC6761ix {

    /* JADX INFO: renamed from: dy */
    private C13918jd f46378dy;

    /* JADX INFO: renamed from: c5 */
    private String f46377c5 = C14113y2.f47374k4;

    /* JADX INFO: renamed from: jd */
    private int f46379jd = -1;

    public C13874ck(C13918jd c13918jd) {
        this.f46378dy = c13918jd;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public char mo26756k4() {
        if (this.f46379jd == this.f46377c5.length()) {
            this.f46379jd = -1;
        }
        int i = this.f46379jd;
        if (i == -1) {
            return (char) 0;
        }
        String str = this.f46377c5;
        this.f46379jd = i + 1;
        return str.charAt(i);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: kk */
    public int mo26762kk() {
        if (this.f46379jd == -1) {
            return 0;
        }
        return this.f46377c5.length() - this.f46379jd;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: to */
    public void mo26763to() {
        this.f46379jd = -1;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: x1 */
    public boolean mo26764x1() {
        int i = this.f46379jd;
        if (i == -1 || i <= 0) {
            return false;
        }
        this.f46379jd = i - 1;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private int m65219k4(char c, char c2) {
        return C14022y4.m66317k4(c2, c);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26759k4(char c, char c2, int i) {
        if (!C14117yj.m67532kk(c, c2)) {
            throw C13850af.m65078k4(c, c2);
        }
        if (this.f46379jd >= 0) {
            new C6772rv().mo26736k4().mo26759k4(c, c2, i);
        }
        if (!this.f46378dy.m65491x1(i)) {
            new C6772rv().mo26736k4().mo26759k4(c, c2, i);
            return false;
        }
        this.f46377c5 = C14113y2.m67391k4(C11697x1.m55250kk(), "&#x{0:X};", Integer.valueOf(m65219k4(c, c2)));
        this.f46379jd = 0;
        return true;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26760k4(char c, int i) {
        if (this.f46379jd >= 0) {
            new C6772rv().mo26736k4().mo26760k4(c, i);
        }
        if (!this.f46378dy.m65491x1(i)) {
            new C6772rv().mo26736k4().mo26760k4(c, i);
            return false;
        }
        this.f46377c5 = C14113y2.m67391k4(C11697x1.m55250kk(), "&#x{0:X};", Integer.valueOf(c));
        this.f46379jd = 0;
        return true;
    }
}
