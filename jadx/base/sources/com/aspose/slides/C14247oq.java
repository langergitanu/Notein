package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p021af.InterfaceC1368kk;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p521y9.C12804k4;

/* JADX INFO: renamed from: com.aspose.slides.oq */
/* JADX INFO: loaded from: classes3.dex */
class C14247oq {

    /* JADX INFO: renamed from: du */
    private final IShapeCollection f47887du;

    /* JADX INFO: renamed from: h4 */
    private final IImageCollection f47888h4;

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<C12804k4, Integer> f47889k4;

    /* JADX INFO: renamed from: kk */
    private final C13845mp f47890kk;

    /* JADX INFO: renamed from: m9 */
    private KeyValuePair<Integer, C10948ar> f47891m9;

    /* JADX INFO: renamed from: to */
    private final String f47892to;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC1368kk f47893x1;

    public C14247oq(Dictionary<C12804k4, Integer> dictionary, InterfaceC1368kk interfaceC1368kk, C13845mp c13845mp, String str, IShapeCollection iShapeCollection, IImageCollection iImageCollection, int i, C10948ar c10948ar) {
        this.f47891m9 = new KeyValuePair<>();
        this.f47889k4 = dictionary;
        this.f47893x1 = interfaceC1368kk;
        this.f47890kk = c13845mp;
        this.f47892to = str;
        this.f47887du = iShapeCollection;
        this.f47888h4 = iImageCollection;
        this.f47891m9 = new KeyValuePair<>(Integer.valueOf(i), c10948ar);
    }

    /* JADX INFO: renamed from: du */
    public final IShapeCollection m68747du() {
        return this.f47887du;
    }

    /* JADX INFO: renamed from: h4 */
    public final IImageCollection m68748h4() {
        return this.f47888h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<C12804k4, Integer> m68749k4() {
        return this.f47889k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13845mp m68750kk() {
        return this.f47890kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m68751to() {
        return this.f47892to;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1368kk m68752x1() {
        return this.f47893x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14247oq m68746k4(C14915zu c14915zu) {
        return new C14247oq(c14915zu.m74840x1(), c14915zu.m74828du(), c14915zu.m74837kk(), c14915zu.m74839to(), c14915zu.m74838m9().getShapes(), c14915zu.m74831h4().getImages(), c14915zu.m74829dy(), c14915zu.m74826c5());
    }
}
