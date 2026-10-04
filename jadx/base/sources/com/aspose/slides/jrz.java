package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class jrz extends hzm {

    /* JADX INFO: renamed from: c5 */
    private long f45552c5;

    /* JADX INFO: renamed from: ck */
    private long f45553ck;

    /* JADX INFO: renamed from: du */
    private String f45554du;

    /* JADX INFO: renamed from: dy */
    private final List<String> f45555dy;

    /* JADX INFO: renamed from: h4 */
    private String f45556h4;

    /* JADX INFO: renamed from: jd */
    private long f45557jd;

    /* JADX INFO: renamed from: k4 */
    private long f45558k4;

    /* JADX INFO: renamed from: kk */
    private long f45559kk;

    /* JADX INFO: renamed from: m9 */
    private final List<hzm> f45560m9;

    /* JADX INFO: renamed from: to */
    private long f45561to;

    /* JADX INFO: renamed from: x1 */
    private long f45562x1;

    public jrz(int i) {
        super(i);
        this.f45558k4 = Long.MIN_VALUE;
        this.f45562x1 = Long.MIN_VALUE;
        this.f45559kk = Long.MIN_VALUE;
        this.f45561to = Long.MIN_VALUE;
        this.f45560m9 = new List<>();
        this.f45555dy = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final long m63515c5() {
        return this.f45553ck;
    }

    /* JADX INFO: renamed from: ck */
    public final String m63516ck() {
        return this.f45556h4;
    }

    /* JADX INFO: renamed from: du */
    public final long m63517du() {
        return this.f45559kk;
    }

    /* JADX INFO: renamed from: dy */
    public final long m63519dy() {
        return this.f45557jd;
    }

    /* JADX INFO: renamed from: fa */
    public final List<hzm> m63520fa() {
        return this.f45560m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m63521h4() {
        return this.f45561to;
    }

    /* JADX INFO: renamed from: jd */
    public final String m63523jd() {
        return this.f45554du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63524k4(long j) {
        this.f45558k4 = j;
        m63518du(j / 101600);
    }

    /* JADX INFO: renamed from: kk */
    public final long m63529kk() {
        return this.f45558k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m63531m9() {
        return this.f45552c5;
    }

    /* JADX INFO: renamed from: to */
    public final long m63533to() {
        return this.f45562x1;
    }

    /* JADX INFO: renamed from: up */
    public final List<String> m63535up() {
        return this.f45555dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63536x1(long j) {
        this.f45562x1 = j;
        m63522h4(j / 203200);
    }

    /* JADX INFO: renamed from: du */
    public final void m63518du(long j) {
        this.f45552c5 = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m63522h4(long j) {
        this.f45557jd = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63525k4(C12385to c12385to) {
        String strMo57995kk = c12385to.mo57995kk();
        C6765kp c6765kp = new C6765kp();
        for (C12385to c12385toM57989x1 = pe5.f48040dy.m57989x1(strMo57995kk); c12385toM57989x1.mo58006to(); c12385toM57989x1 = c12385toM57989x1.m58005h4()) {
            if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 1)) {
                c6765kp.m26792k4(c12385toM57989x1.m58004du().m58000k4(2).mo57995kk());
            }
            if (androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57989x1, 3)) {
                this.f45555dy.addItem(c6765kp.toString());
                if (m63515c5() < c6765kp.m26807x1()) {
                    m63532m9(c6765kp.m26807x1());
                }
                c6765kp = new C6765kp();
            }
        }
        this.f45555dy.addItem(c6765kp.toString());
        if (m63515c5() < c6765kp.m26807x1()) {
            m63532m9(c6765kp.m26807x1());
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m63530kk(long j) {
        this.f45559kk = j;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m63532m9(long j) {
        this.f45553ck = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m63534to(long j) {
        this.f45561to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63537x1(String str) {
        this.f45556h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m63538x1() {
        return this.f45558k4 == Long.MIN_VALUE && this.f45562x1 == Long.MIN_VALUE && this.f45559kk == Long.MIN_VALUE && this.f45561to == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63526k4(jrz jrzVar) {
        m63524k4(jrzVar.m63529kk());
        m63536x1(jrzVar.m63533to());
        m63530kk(jrzVar.m63517du());
        m63534to(jrzVar.m63521h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63527k4(String str) {
        this.f45554du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63528k4() {
        return (C14113y2.m67411k4(this.f45554du) && C14113y2.m67411k4(this.f45556h4)) ? false : true;
    }
}
