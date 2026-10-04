package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p419tg.C10941ks;
import com.aspose.slides.internal.p419tg.C10942m9;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.internal.p419tg.C10946yj;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.ar */
/* JADX INFO: loaded from: classes.dex */
public final class C3811ar {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f10363h4 = new C7017h4("Root");

    /* JADX INFO: renamed from: du */
    private C10946yj f10364du;

    /* JADX INFO: renamed from: k4 */
    private String f10365k4;

    /* JADX INFO: renamed from: kk */
    private C3815dy f10366kk;

    /* JADX INFO: renamed from: to */
    private int f10367to;

    /* JADX INFO: renamed from: x1 */
    private int f10368x1;

    public C3811ar() {
        this("My", 1);
    }

    /* JADX INFO: renamed from: to */
    private C10941ks m15218to() {
        return this.f10368x1 == 1 ? C10942m9.m52794kk() : C10942m9.m52795to();
    }

    /* JADX INFO: renamed from: k4 */
    public C3815dy m15219k4() {
        C3815dy c3815dy = this.f10366kk;
        if (c3815dy == null) {
            this.f10366kk = new C3815dy();
        } else if (this.f10364du == null) {
            c3815dy.clear();
        }
        return this.f10366kk;
    }

    /* JADX INFO: renamed from: kk */
    public void m15221kk() {
        this.f10364du = null;
        C3815dy c3815dy = this.f10366kk;
        if (c3815dy != null) {
            c3815dy.clear();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public C10946yj m15222x1() {
        return this.f10364du;
    }

    public C3811ar(String str, int i) {
        if (i < 1 || i > 2) {
            throw new ArgumentException("storeLocation");
        }
        this.f10365k4 = str;
        this.f10368x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15220k4(int i) {
        if (C14113y2.m67411k4(this.f10365k4)) {
            throw new CryptographicException(C14113y2.m67402k4("Invalid store name (null or empty).", new Object[0]));
        }
        C10946yj c10946yjM52791k4 = m15218to().m52791k4(f10363h4.m27428k4(this.f10365k4) != 0 ? this.f10365k4 : "Trust", (i & 4) != 4);
        this.f10364du = c10946yjM52791k4;
        if (c10946yjM52791k4 == null) {
            throw new CryptographicException(C14113y2.m67402k4("Store {0} doesn't exists.", this.f10365k4));
        }
        this.f10367to = i;
        for (C10945x1 c10945x1 : c10946yjM52791k4.m52856k4()) {
            C3823m9 c3823m9 = new C3823m9(c10945x1.m52823c5());
            c3823m9.m15317k4(c10945x1.m52826dy());
            m15219k4().m15262k4(c3823m9);
        }
    }

    public C3811ar(short s, int i) {
        if (s < 1 || s > 8) {
            throw new ArgumentException("storeName");
        }
        if (i < 1 || i > 2) {
            throw new ArgumentException("storeLocation");
        }
        this.f10365k4 = s != 3 ? C14042ak.m66410k4(C3833x1.class, s) : "CA";
        this.f10368x1 = i;
    }
}
