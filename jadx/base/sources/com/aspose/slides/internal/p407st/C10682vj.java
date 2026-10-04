package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.vj */
/* JADX INFO: loaded from: classes4.dex */
public class C10682vj {

    /* JADX INFO: renamed from: c5 */
    private String f37445c5;

    /* JADX INFO: renamed from: du */
    private long f37446du;

    /* JADX INFO: renamed from: dy */
    private long f37447dy;

    /* JADX INFO: renamed from: h4 */
    private long f37448h4;

    /* JADX INFO: renamed from: jd */
    private long f37449jd;

    /* JADX INFO: renamed from: k4 */
    private C10681vh f37450k4;

    /* JADX INFO: renamed from: kk */
    private int f37451kk;

    /* JADX INFO: renamed from: m9 */
    private long f37452m9;

    /* JADX INFO: renamed from: to */
    private int f37453to;

    /* JADX INFO: renamed from: x1 */
    private long f37454x1;

    public C10682vj() {
        m51870k4(new C10681vh());
        m51866k4().m51851k4(true);
        m51868k4(0L);
        m51867k4(26625);
        m51878x1(32772);
        m51879x1(40L);
        m51873kk(1L);
        m51876to(0L);
        m51860du(0L);
        m51871k4("Microsoft Base Cryptographic Provider v1.0");
        m51864h4(118L);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m51857c5() {
        return this.f37445c5;
    }

    /* JADX INFO: renamed from: ck */
    public final int m51858ck() {
        return new C6773ss().m26683x1(C14113y2.m67365dy(m51857c5())).length + 34;
    }

    /* JADX INFO: renamed from: du */
    public final long m51859du() {
        return this.f37446du;
    }

    /* JADX INFO: renamed from: dy */
    public final long m51861dy() {
        return this.f37447dy;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m51862fa() {
        if (m51866k4().m51855x1()) {
            return false;
        }
        int iM51875to = m51875to();
        return iM51875to == 0 || iM51875to == 32772;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m51863h4() {
        return this.f37448h4;
    }

    /* JADX INFO: renamed from: jd */
    public final long m51865jd() {
        return this.f37449jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10681vh m51866k4() {
        return this.f37450k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51872kk() {
        return this.f37451kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m51874m9() {
        return this.f37452m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m51875to() {
        return this.f37453to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51877x1() {
        return this.f37454x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10682vj m51856k4(AbstractC3150x6 abstractC3150x6, long j) {
        C10682vj c10682vj = new C10682vj();
        c10682vj.m51870k4(C10681vh.m51849k4(abstractC3150x6));
        c10682vj.m51868k4(((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L);
        c10682vj.m51867k4(C3110yd.m13255x1(abstractC3150x6));
        c10682vj.m51878x1(C3110yd.m13255x1(abstractC3150x6));
        c10682vj.m51879x1(((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L);
        if ((c10682vj.m51859du() & 4294967295L) == 0) {
            c10682vj.m51879x1(40L);
        }
        c10682vj.m51873kk(((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L);
        c10682vj.m51876to(((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L);
        c10682vj.m51860du(((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L);
        int i = ((int) ((((((j & 4294967295L) - 32) & 4294967295L) / 2) & 4294967295L) - 1)) * 2;
        char[] cArrM26672kk = new C6773ss().m26672kk(C3110yd.m13260x1(abstractC3150x6, i), 0, i);
        C3110yd.m13260x1(abstractC3150x6, 2);
        c10682vj.m51871k4(C14113y2.m67405k4(cArrM26672kk));
        return c10682vj;
    }

    /* JADX INFO: renamed from: du */
    public final void m51860du(long j) {
        this.f37447dy = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51864h4(long j) {
        this.f37449jd = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51873kk(long j) {
        this.f37448h4 = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m51876to(long j) {
        this.f37452m9 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51878x1(int i) {
        this.f37453to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51867k4(int i) {
        this.f37451kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51879x1(long j) {
        this.f37446du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51868k4(long j) {
        this.f37454x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51869k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m51866k4().m51853kk() & 4294967295L);
        c3149x1.m13447k4(m51877x1() & 4294967295L);
        c3149x1.m13455x1(m51872kk());
        c3149x1.m13455x1(m51875to());
        c3149x1.m13447k4(m51859du() & 4294967295L);
        c3149x1.m13447k4(m51863h4() & 4294967295L);
        c3149x1.m13447k4(m51874m9() & 4294967295L);
        c3149x1.m13447k4(m51861dy() & 4294967295L);
        c3149x1.m13450k4(new C6773ss().m26683x1(C14113y2.m67365dy(m51857c5())));
        c3149x1.m13448k4((short) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51870k4(C10681vh c10681vh) {
        this.f37450k4 = c10681vh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51871k4(String str) {
        this.f37445c5 = str;
    }
}
