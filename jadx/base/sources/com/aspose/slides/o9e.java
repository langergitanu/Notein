package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class o9e {

    /* JADX INFO: renamed from: k4 */
    private String f47723k4;

    /* JADX INFO: renamed from: kk */
    private List<KeyValuePair<String, String>> f47724kk;

    /* JADX INFO: renamed from: x1 */
    private String f47725x1;

    public o9e(String str, String str2) {
        this(str, str2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m68408k4() {
        return this.f47723k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<KeyValuePair<String, String>> m68412kk() {
        return this.f47724kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m68413x1() {
        return this.f47725x1;
    }

    public o9e(String str, String str2, int i) {
        m68410k4(str);
        m68414x1(str2);
        m68409k4(new List<>(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68409k4(List<KeyValuePair<String, String>> list) {
        this.f47724kk = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68414x1(String str) {
        this.f47725x1 = str;
    }

    public o9e(String str, String str2, IGenericEnumerable<KeyValuePair<String, String>> iGenericEnumerable) {
        m68410k4(str);
        m68414x1(str2);
        m68409k4(new List<>(iGenericEnumerable));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68410k4(String str) {
        this.f47723k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68411k4(String str, String str2) {
        m68412kk().addItem(new KeyValuePair<>(str, str2));
    }
}
