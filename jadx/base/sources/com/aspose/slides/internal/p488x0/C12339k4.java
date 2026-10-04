package com.aspose.slides.internal.p488x0;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12339k4 {

    /* JADX INFO: renamed from: du */
    private int f41260du;

    /* JADX INFO: renamed from: k4 */
    private short f41261k4;

    /* JADX INFO: renamed from: kk */
    private short f41262kk;

    /* JADX INFO: renamed from: to */
    private short f41263to;

    /* JADX INFO: renamed from: x1 */
    private int f41264x1;

    public C12339k4() {
        m57750k4((short) 19778);
    }

    /* JADX INFO: renamed from: du */
    public final int m57746du() {
        return this.f41260du;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m57751k4((C12339k4) obj);
    }

    public int hashCode() {
        return (((((((C14088s7.m67172k4(m57747k4()) * 397) ^ m57754x1()) * 397) ^ C14088s7.m67172k4(m57752kk())) * 397) ^ C14088s7.m67172k4(m57753to())) * 397) ^ m57746du();
    }

    /* JADX INFO: renamed from: k4 */
    public final short m57747k4() {
        return this.f41261k4;
    }

    /* JADX INFO: renamed from: kk */
    public final short m57752kk() {
        return this.f41262kk;
    }

    /* JADX INFO: renamed from: to */
    public final short m57753to() {
        return this.f41263to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57754x1() {
        return this.f41264x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57748k4(int i) {
        this.f41264x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57755x1(int i) {
        this.f41260du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57749k4(C3149x1 c3149x1) {
        c3149x1.m13448k4(m57747k4());
        c3149x1.m13455x1(m57754x1());
        c3149x1.m13448k4(m57752kk());
        c3149x1.m13448k4(m57753to());
        c3149x1.m13455x1(m57746du());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57750k4(short s) {
        this.f41261k4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57751k4(C12339k4 c12339k4) {
        return m57747k4() == c12339k4.m57747k4() && m57754x1() == c12339k4.m57754x1() && m57752kk() == c12339k4.m57752kk() && m57753to() == c12339k4.m57753to() && m57746du() == c12339k4.m57746du();
    }
}
