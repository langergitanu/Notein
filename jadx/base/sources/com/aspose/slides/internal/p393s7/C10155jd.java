package com.aspose.slides.internal.p393s7;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10155jd {

    /* JADX INFO: renamed from: du */
    private int f36535du;

    /* JADX INFO: renamed from: dy */
    private int f36536dy;

    /* JADX INFO: renamed from: h4 */
    private String f36537h4;

    /* JADX INFO: renamed from: k4 */
    private String f36538k4;

    /* JADX INFO: renamed from: kk */
    private int f36539kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f36540m9;

    /* JADX INFO: renamed from: to */
    private int f36541to;

    /* JADX INFO: renamed from: x1 */
    private String f36542x1;

    public C10155jd(String str) {
        this.f36538k4 = str;
    }

    /* JADX INFO: renamed from: h4 */
    private String m49935h4() {
        if (this.f36537h4 == null) {
            this.f36537h4 = C14113y2.m67402k4("{0},{1},{2},{3}", m49937k4(), m49940x1(), Integer.valueOf(m49938kk()), Integer.valueOf(m49936du()));
        }
        return this.f36537h4;
    }

    /* JADX INFO: renamed from: du */
    public final int m49936du() {
        return this.f36541to;
    }

    public boolean equals(Object obj) {
        C10155jd c10155jd = (C10155jd) C7019kk.m27452k4(obj, C10155jd.class);
        if (C14067j2.m66729x1(null, c10155jd)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c10155jd)) {
            return true;
        }
        return C14057f9.m66592x1(hashCode(), c10155jd.hashCode());
    }

    public int hashCode() {
        if (!this.f36540m9) {
            this.f36536dy = m49935h4().hashCode();
            this.f36540m9 = true;
        }
        return this.f36536dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m49937k4() {
        return this.f36538k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m49938kk() {
        return this.f36539kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m49939to() {
        return this.f36535du;
    }

    public String toString() {
        return m49935h4();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m49940x1() {
        return this.f36542x1;
    }

    public C10155jd(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, 0);
    }

    public C10155jd(String str, String str2, int i, int i2, int i3) {
        this(str);
        this.f36542x1 = str2;
        this.f36539kk = i;
        this.f36541to = i2;
        this.f36535du = i3;
    }
}
