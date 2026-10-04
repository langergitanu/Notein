package com.aspose.slides.internal.p132fj;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p488x0.C12347u4;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.fj.ts */
/* JADX INFO: loaded from: classes.dex */
public class C4051ts extends C12535to {

    /* JADX INFO: renamed from: du */
    private int f11063du;

    /* JADX INFO: renamed from: h4 */
    private short f11064h4;

    /* JADX INFO: renamed from: k4 */
    private long f11065k4;

    /* JADX INFO: renamed from: kk */
    private C12347u4 f11066kk;

    /* JADX INFO: renamed from: to */
    private int f11067to;

    /* JADX INFO: renamed from: x1 */
    private short f11068x1;

    /* JADX INFO: renamed from: h4 */
    public final int m16090h4() {
        return 22;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m16091k4() {
        return this.f11068x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m16096kk() {
        return this.f11067to;
    }

    /* JADX INFO: renamed from: to */
    public final short m16097to() {
        return this.f11064h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12347u4 m16098x1() {
        return this.f11066kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16092k4(int i) {
        this.f11067to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16099x1(int i) {
        if (i != 0) {
            throw new ArgumentException("MUST be 0x00000000");
        }
        this.f11063du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16093k4(long j) {
        if ((4294967295L & j) != 2596720087L) {
            throw new ArgumentException("This value MUST be 0x9AC6CDD7");
        }
        this.f11065k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m16100x1(short s) {
        this.f11064h4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16094k4(C12347u4 c12347u4) {
        this.f11066kk = c12347u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16095k4(short s) {
        this.f11068x1 = s;
    }
}
