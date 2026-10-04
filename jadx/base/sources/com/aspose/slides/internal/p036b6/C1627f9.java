package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.f9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1627f9 {

    /* JADX INFO: renamed from: du */
    private int f6263du;

    /* JADX INFO: renamed from: dy */
    private Dictionary<String, Dictionary<String, Object>> f6264dy = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private Dictionary<String, C1634k4> f6265h4;

    /* JADX INFO: renamed from: k4 */
    private double f6266k4;

    /* JADX INFO: renamed from: kk */
    private int f6267kk;

    /* JADX INFO: renamed from: m9 */
    private C1625dy[] f6268m9;

    /* JADX INFO: renamed from: to */
    private int f6269to;

    /* JADX INFO: renamed from: x1 */
    private int f6270x1;

    /* JADX INFO: renamed from: du */
    public final int m8774du() {
        return this.f6263du;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<String, C1634k4> m8775h4() {
        return this.f6265h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m8776k4() {
        return this.f6266k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m8783kk() {
        return this.f6267kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C1625dy[] m8785m9() {
        return this.f6268m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m8786to() {
        return this.f6269to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8788x1() {
        return this.f6270x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, Object> m8777k4(String str) {
        if (this.f6264dy.containsKey(str)) {
            return this.f6264dy.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8784kk(int i) {
        this.f6269to = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m8787to(int i) {
        this.f6263du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8789x1(int i) {
        this.f6267kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8778k4(double d) {
        this.f6266k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8779k4(int i) {
        this.f6270x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8780k4(Dictionary<String, C1634k4> dictionary) {
        this.f6265h4 = dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8781k4(String str, Dictionary<String, Object> dictionary) {
        if (!this.f6264dy.containsKey(str)) {
            this.f6264dy.addItem(str, null);
        }
        this.f6264dy.set_Item(str, dictionary);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8782k4(C1625dy[] c1625dyArr) {
        this.f6268m9 = c1625dyArr;
    }
}
