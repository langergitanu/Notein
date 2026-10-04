package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.uu */
/* JADX INFO: loaded from: classes4.dex */
public class C10672uu {

    /* JADX INFO: renamed from: k4 */
    private long f37432k4;

    /* JADX INFO: renamed from: x1 */
    private int f37434x1 = 0;

    /* JADX INFO: renamed from: kk */
    private C10546mr f37433kk = new C10546mr();

    /* JADX INFO: renamed from: k4 */
    public long m51819k4() {
        return this.f37432k4;
    }

    /* JADX INFO: renamed from: kk */
    public C10546mr m51825kk() {
        return this.f37433kk;
    }

    /* JADX INFO: renamed from: to */
    public int m51826to() {
        return this.f37433kk.m50945qq() + 6;
    }

    /* JADX INFO: renamed from: x1 */
    public int m51827x1() {
        return this.f37434x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51820k4(int i) {
        this.f37434x1 = i;
        if ((i & 65535) > 4) {
            this.f37434x1 = 4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m51821k4(long j) {
        this.f37432k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51822k4(C3134k4 c3134k4) {
        this.f37432k4 = c3134k4.m13384uz();
        this.f37434x1 = c3134k4.m13382u4();
        C10546mr c10546mr = new C10546mr();
        this.f37433kk = c10546mr;
        c10546mr.m50938k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m51823k4(C3149x1 c3149x1) {
        if (this.f37433kk.m50946um()) {
            throw new Exception("Wrong serialized data!!!\nTextPFException within TextPFRun can't have LeftMargin, Indent, DefaultTabSize or TabStops!!!");
        }
        c3149x1.m13447k4(this.f37432k4);
        c3149x1.m13446k4(C3085sv.m13071k4(this.f37434x1));
        this.f37433kk.m50939k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m51824k4(C10672uu c10672uu) {
        return C7019kk.m27457kk(Integer.valueOf(this.f37434x1), 8) == C7019kk.m27457kk(Integer.valueOf(c10672uu.f37434x1), 8) && this.f37433kk.m50944kk(c10672uu.f37433kk);
    }
}
