package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.fu */
/* JADX INFO: loaded from: classes5.dex */
public class C12989fu extends AbstractC12950dp {

    /* JADX INFO: renamed from: kk */
    private int f43677kk = 0;

    /* JADX INFO: renamed from: to */
    private C13086lm f43678to;

    /* JADX INFO: renamed from: x1 */
    private String f43679x1;

    @Override // com.aspose.slides.internal.p532yu.AbstractC12950dp
    /* JADX INFO: renamed from: c5 */
    public String mo60242c5() {
        int iM61110x1 = this.f43678to.m61110x1();
        if (iM61110x1 == 0) {
            return "##any:*";
        }
        int i = 1;
        if (iM61110x1 == 1) {
            return "##other:*";
        }
        if (iM61110x1 != 2) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        Iterator it = this.f43678to.m61109to().iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(C14113y2.m67408k4((String) it.next(), ":*"));
                if (i < this.f43678to.m61109to().size()) {
                    c6765kp.m26792k4(" ");
                }
                i++;
            } finally {
                if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: du */
    public final void m60625du(String str) {
        String str2 = this.f43679x1;
        if (str2 != null) {
            this.f43678to = new C13049jf(str2, str);
        } else {
            this.f43678to = new C13086lm();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final int m60626dy() {
        int i = this.f43677kk;
        if (i == 0) {
            return 3;
        }
        return i;
    }

    /* JADX INFO: renamed from: h4 */
    public final C13086lm m60627h4() {
        return this.f43678to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m60628k4() {
        return this.f43679x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m60631kk(String str) {
        String str2 = this.f43679x1;
        if (str2 != null) {
            this.f43678to = new C13086lm(str2, str);
        } else {
            this.f43678to = new C13086lm();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final String m60632m9() {
        String str = this.f43679x1;
        return (str == null || str.length() == 0) ? "##any" : this.f43679x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60633x1(String str) {
        this.f43679x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60629k4(int i) {
        this.f43677kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m60630k4(C13890ei c13890ei) {
        return this.f43678to.mo61008k4(c13890ei.m65284k4());
    }
}
