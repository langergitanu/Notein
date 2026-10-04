package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.s0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2282s0 {

    /* JADX INFO: renamed from: k4 */
    protected long f7845k4;

    public AbstractC2282s0(long j) {
        this.f7845k4 = C7019kk.m27435du(Long.valueOf(j), 11);
    }

    /* JADX INFO: renamed from: x1 */
    public static List<Integer> m11354x1(C2212n9 c2212n9) {
        int iM11151fa = c2212n9.m11151fa();
        List<Integer> list = new List<>(C7019kk.m27462to(Integer.valueOf(iM11151fa), 8));
        for (int i = 0; i < C7019kk.m27457kk(Integer.valueOf(iM11151fa), 8); i++) {
            list.addItem(Integer.valueOf(c2212n9.m11151fa()));
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m11355k4() {
        return this.f7845k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10153k4(C2212n9 c2212n9);

    public AbstractC2282s0(long j, long j2) {
        if (j2 == 0) {
            throw new C2243pd("Trying to load table with zero offset");
        }
        this.f7845k4 = C7019kk.m27435du(Long.valueOf(j + j2), 11);
    }

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<String, Long> m11352k4(int i, C2212n9 c2212n9) {
        Dictionary<String, Long> dictionary = new Dictionary<>();
        for (int i2 = 0; i2 < i; i2++) {
            dictionary.addItem(c2212n9.m11166x1(4), Long.valueOf(C7019kk.m27438h4(Integer.valueOf(c2212n9.m11151fa()), 8)));
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T extends AbstractC2282s0> T m11353k4(T t, C2212n9 c2212n9) {
        if (C7019kk.m27435du(Long.valueOf(t.m11355k4()), 10) == 0) {
            throw new C2243pd("Trying to load table with zero offset");
        }
        t.mo10153k4(c2212n9);
        return t;
    }
}
