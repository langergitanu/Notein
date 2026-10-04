package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.u4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8917u4 extends AbstractC7361bz {
    /* JADX INFO: renamed from: c5 */
    public abstract List<C7394ca> mo29877c5();

    /* JADX INFO: renamed from: c5 */
    public void mo29878c5(String str) {
    }

    /* JADX INFO: renamed from: ck */
    public int mo29879ck() {
        return 0;
    }

    /* JADX INFO: renamed from: du */
    public abstract int mo29880du();

    /* JADX INFO: renamed from: du */
    public void mo29881du(int i) {
    }

    /* JADX INFO: renamed from: du */
    public abstract void mo29882du(String str);

    /* JADX INFO: renamed from: dy */
    public abstract String mo29883dy();

    /* JADX INFO: renamed from: dy */
    public void mo29884dy(String str) {
    }

    /* JADX INFO: renamed from: fa */
    public String mo29885fa() {
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract int mo29886h4();

    /* JADX INFO: renamed from: h4 */
    public abstract C7394ca mo29887h4(String str);

    /* JADX INFO: renamed from: h4 */
    public void mo29888h4(int i) {
    }

    /* JADX INFO: renamed from: ix */
    public String mo30636ix() {
        return null;
    }

    /* JADX INFO: renamed from: jd */
    public int mo35889jd() {
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7361bz m42084k4(String str) {
        List.Enumerator<C7394ca> it = mo29877c5().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (C14113y2.m67363du(next.m29539k4(), str)) {
                    return next.m29542x1();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo29890k4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo29892k4(int i);

    /* JADX INFO: renamed from: kk */
    public abstract String mo29893kk();

    /* JADX INFO: renamed from: kk */
    public abstract void mo29894kk(int i);

    /* JADX INFO: renamed from: kk */
    public abstract void mo29895kk(String str);

    /* JADX INFO: renamed from: ks */
    public String mo29896ks() {
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract int mo29897m9();

    /* JADX INFO: renamed from: m9 */
    public void mo29898m9(int i) {
    }

    /* JADX INFO: renamed from: ne */
    public String mo30638ne() {
        return null;
    }

    /* JADX INFO: renamed from: rv */
    public String mo29900rv() {
        return null;
    }

    /* JADX INFO: renamed from: to */
    public abstract String mo29901to();

    /* JADX INFO: renamed from: to */
    public void mo35890to(int i) {
    }

    /* JADX INFO: renamed from: to */
    public abstract void mo29902to(String str);

    /* JADX INFO: renamed from: up */
    public String mo29903up() {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract String mo29904x1();

    /* JADX INFO: renamed from: x1 */
    public abstract void mo29905x1(int i);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo29906x1(String str);

    /* JADX INFO: renamed from: x6 */
    public String mo30641x6() {
        return null;
    }

    /* JADX INFO: renamed from: yj */
    public float mo29907yj() {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: ck */
    public void mo30634ck(String str) {
    }

    /* JADX INFO: renamed from: fa */
    public void mo30635fa(String str) {
    }

    /* JADX INFO: renamed from: jd */
    public void mo29889jd(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo29891k4(float f) {
    }

    /* JADX INFO: renamed from: m9 */
    public void mo29899m9(String str) {
    }

    /* JADX INFO: renamed from: up */
    public void mo30640up(String str) {
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m42083k4(int i, boolean z) {
        return i == 0 ? z : i == 1 || i == 3;
    }
}
