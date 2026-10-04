package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.js */
/* JADX INFO: loaded from: classes3.dex */
class C13700js implements IGenericCloneable<C13700js>, Cloneable {

    /* JADX INFO: renamed from: k4 */
    public boolean f45570k4;

    /* JADX INFO: renamed from: to */
    public IWarningCallback f45575to;

    /* JADX INFO: renamed from: x1 */
    public boolean f45577x1 = false;

    /* JADX INFO: renamed from: kk */
    public float f45571kk = 3000000.0f;

    /* JADX INFO: renamed from: du */
    public byte f45565du = 85;

    /* JADX INFO: renamed from: h4 */
    public float f45568h4 = 96.0f;

    /* JADX INFO: renamed from: m9 */
    public boolean f45573m9 = false;

    /* JADX INFO: renamed from: dy */
    public boolean f45566dy = false;

    /* JADX INFO: renamed from: c5 */
    public int f45563c5 = 72;

    /* JADX INFO: renamed from: jd */
    public boolean f45569jd = true;

    /* JADX INFO: renamed from: ck */
    public boolean f45564ck = true;

    /* JADX INFO: renamed from: fa */
    public boolean f45567fa = true;

    /* JADX INFO: renamed from: up */
    public IPdfOptions f45576up = null;

    /* JADX INFO: renamed from: yj */
    public InkOptions f45578yj = new InkOptions();

    /* JADX INFO: renamed from: ks */
    public float f45572ks = 4.0f;

    /* JADX INFO: renamed from: rv */
    public int f45574rv = 0;

    /* JADX INFO: renamed from: k4 */
    public static int m63539k4(C12023wl c12023wl) {
        return C7019kk.m27462to(Float.valueOf(C14116yg.m67481k4(C14116yg.m67481k4(c12023wl.m56865x1() / 10.0f, c12023wl.m56862kk() / 10.0f), 96.0f)), 13);
    }

    /* JADX INFO: renamed from: kk */
    public Object m63541kk() {
        try {
            return (C13700js) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C13700js cloneT() {
        return (C13700js) m63541kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63540k4() {
        return this.f45576up != null;
    }
}
