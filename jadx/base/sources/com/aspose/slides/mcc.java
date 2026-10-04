package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: loaded from: classes3.dex */
class mcc {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Integer, eng> f46207k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<Integer, C6765kp> f46211x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private Dictionary<Integer, eng> f46208kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private final Dictionary<Integer, C6765kp> f46210to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private Dictionary<Integer, eng> f46203du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private final Dictionary<Integer, kup> f46205h4 = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private Dictionary<Integer, eng> f46209m9 = new Dictionary<>();

    /* JADX INFO: renamed from: dy */
    private final Dictionary<Integer, kup> f46204dy = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    private Dictionary<Integer, eng> f46202c5 = new Dictionary<>();

    /* JADX INFO: renamed from: jd */
    private final Dictionary<Integer, C6765kp> f46206jd = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    public final Dictionary<Integer, eng> m64824du() {
        return this.f46209m9;
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<Integer, C6765kp> m64825dy() {
        return this.f46206jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<Integer, kup> m64826h4() {
        return this.f46204dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, eng> m64827k4() {
        return this.f46207k4;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<Integer, eng> m64831kk() {
        return this.f46203du;
    }

    /* JADX INFO: renamed from: m9 */
    public final Dictionary<Integer, eng> m64833m9() {
        return this.f46202c5;
    }

    /* JADX INFO: renamed from: to */
    public final Dictionary<Integer, kup> m64834to() {
        return this.f46205h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<Integer, C6765kp> m64835x1() {
        return this.f46211x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64828k4(int i, List<jrz> list) {
        this.f46204dy.get_Item(Integer.valueOf(i)).m64182k4(list);
    }

    /* JADX INFO: renamed from: kk */
    public final void m64832kk(int i, C6765kp c6765kp) {
        if (this.f46206jd.containsKey(Integer.valueOf(i))) {
            this.f46206jd.get_Item(Integer.valueOf(i)).m26791k4((Object) c6765kp);
        } else {
            this.f46206jd.addItem(Integer.valueOf(i), c6765kp);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64836x1(int i, List<jrz> list) {
        this.f46205h4.get_Item(Integer.valueOf(i)).m64182k4(list);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64829k4(int i, C6765kp c6765kp) {
        if (this.f46211x1.containsKey(Integer.valueOf(i))) {
            this.f46211x1.get_Item(Integer.valueOf(i)).m26791k4((Object) c6765kp);
        } else {
            this.f46211x1.addItem(Integer.valueOf(i), c6765kp);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64837x1(int i, C6765kp c6765kp) {
        if (this.f46210to.containsKey(Integer.valueOf(i))) {
            this.f46210to.get_Item(Integer.valueOf(i)).m26791k4((Object) c6765kp);
        } else {
            this.f46210to.addItem(Integer.valueOf(i), c6765kp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64830k4(int i, kup kupVar) {
        if (this.f46205h4.containsKey(Integer.valueOf(i))) {
            this.f46205h4.get_Item(Integer.valueOf(i)).m64181k4().m72172k4().m26791k4((Object) kupVar.m64181k4().m72172k4());
        } else {
            this.f46205h4.addItem(Integer.valueOf(i), kupVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64838x1(int i, kup kupVar) {
        if (this.f46204dy.containsKey(Integer.valueOf(i))) {
            this.f46204dy.get_Item(Integer.valueOf(i)).m64181k4().m72172k4().m26791k4((Object) kupVar.m64181k4().m72172k4());
        } else {
            this.f46204dy.addItem(Integer.valueOf(i), kupVar);
        }
    }
}
