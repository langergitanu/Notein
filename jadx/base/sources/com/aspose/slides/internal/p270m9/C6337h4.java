package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.InterfaceC5786fa;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6337h4 extends AbstractC6340k4 implements InterfaceC5786fa {

    /* JADX INFO: renamed from: du */
    private String f18019du;

    /* JADX INFO: renamed from: h4 */
    private List<String> f18020h4;

    /* JADX INFO: renamed from: k4 */
    private String f18021k4;

    /* JADX INFO: renamed from: kk */
    private String f18022kk;

    /* JADX INFO: renamed from: to */
    private String f18023to;

    /* JADX INFO: renamed from: x1 */
    private String f18024x1;

    public C6337h4(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 11);
        this.f18020h4 = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final String m25939c5() {
        return this.f18022kk;
    }

    /* JADX INFO: renamed from: ck */
    public final String m25940ck() {
        return this.f18019du;
    }

    /* JADX INFO: renamed from: du */
    public final void m25941du(String str) {
        this.f18023to = str;
    }

    /* JADX INFO: renamed from: dy */
    public final String m25942dy() {
        if (this.f18020h4.size() == 0) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<String> it = this.f18020h4.iterator();
        it.hasNext();
        c6765kp.m26796k4("'{0}'", it.next());
        while (it.hasNext()) {
            c6765kp.m26796k4(" '{0}'", it.next());
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: fa */
    public final List<String> m25943fa() {
        return this.f18020h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m25944h4() {
        return this.f18021k4;
    }

    /* JADX INFO: renamed from: jd */
    public final String m25946jd() {
        return this.f18023to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25947k4(String str) {
        this.f18021k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25948kk(String str) {
        this.f18024x1 = str;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m25949m9() {
        return this.f18024x1;
    }

    /* JADX INFO: renamed from: to */
    public final void m25950to(String str) {
        this.f18022kk = str;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("{0} {1} {{", "@counter-style", m25944h4());
        if (!C14113y2.m67411k4(m25949m9())) {
            c6765kp.m26796k4(" type: {0};", m25949m9());
        }
        if (m25943fa().size() != 0) {
            c6765kp.m26796k4(" glyphs: {0};", m25942dy());
        }
        if (!C14113y2.m67411k4(m25939c5())) {
            c6765kp.m26796k4(" prefix: {0};", m25939c5());
        }
        if (!C14113y2.m67411k4(m25946jd())) {
            c6765kp.m26796k4(" suffix: {0};", m25946jd());
        }
        if (!C14113y2.m67411k4(m25940ck())) {
            c6765kp.m26796k4(" fallback: {0};", m25940ck());
        }
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m25945h4(String str) {
        this.f18019du = str;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        throw new NotImplementedException();
    }
}
