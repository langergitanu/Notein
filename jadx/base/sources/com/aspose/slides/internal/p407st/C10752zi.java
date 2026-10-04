package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.zi */
/* JADX INFO: loaded from: classes4.dex */
public class C10752zi {

    /* JADX INFO: renamed from: k4 */
    private int f37571k4;

    /* JADX INFO: renamed from: kk */
    private final C10597pu f37572kk;

    /* JADX INFO: renamed from: x1 */
    private final C10546mr f37573x1;

    public C10752zi() {
        m52147k4(0);
        this.f37573x1 = new C10546mr();
        this.f37572kk = new C10597pu();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52145k4(short s) {
        return this.f37572kk.m50797ne() + this.f37573x1.m50945qq() + (s >= 5 ? 2 : 0);
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1("TextMasterStyleLevel: ");
        c6765kp.m26810x1(this.f37573x1.toString());
        c6765kp.m26791k4(this.f37572kk);
        return C14113y2.m67401k4(c6765kp.toString(), IOUtils.LINE_SEPARATOR_UNIX, "\n  ");
    }

    /* JADX INFO: renamed from: x1 */
    public final C10597pu m52151x1() {
        return this.f37572kk;
    }

    public C10752zi(int i) {
        m52147k4(i);
        this.f37573x1 = new C10546mr();
        this.f37572kk = new C10597pu();
    }

    /* JADX INFO: renamed from: k4 */
    public final C10546mr m52146k4() {
        return this.f37573x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52152x1(C10752zi c10752zi) {
        this.f37573x1.mo50940k4(c10752zi.f37573x1);
        this.f37572kk.mo50793k4((C10441fk) c10752zi.f37572kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52147k4(int i) {
        if ((65535 & i) >= 5) {
            throw new ArgumentOutOfRangeException("2.9.36 TextMasterStyleLevel.level can't be more than 0x5.");
        }
        this.f37571k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52148k4(C3134k4 c3134k4, short s) {
        if (s >= 5) {
            this.f37571k4 = c3134k4.m13382u4();
        }
        this.f37573x1.m50938k4(c3134k4);
        this.f37572kk.m50791k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52149k4(C3149x1 c3149x1, int i, short s) {
        if (s >= 5) {
            c3149x1.m13446k4(this.f37571k4);
        }
        this.f37573x1.m50939k4(c3149x1);
        this.f37572kk.m50792k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52150k4(C10752zi c10752zi) {
        this.f37573x1.m50949x1(c10752zi.f37573x1);
        this.f37572kk.m50799x1(c10752zi.f37572kk);
    }
}
