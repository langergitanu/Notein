package com.aspose.slides.internal.p257ls;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ls.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6227k4 extends C10934du {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f17650du = new C7017h4("1.3.6.1.5.5.7.3.1", "1.3.6.1.5.5.7.3.2", "1.3.6.1.5.5.7.3.3", "1.3.6.1.5.5.7.3.4", "1.3.6.1.5.5.7.3.8", "1.3.6.1.5.5.7.3.9");

    /* JADX INFO: renamed from: to */
    private ArrayList f17651to;

    public C6227k4() {
        this.f38027k4 = "2.5.29.37";
        this.f17651to = new ArrayList();
    }

    /* JADX INFO: renamed from: h4 */
    public ArrayList m25221h4() {
        return this.f17651to;
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
        this.f17651to = new ArrayList();
        C12842x1 c12842x1 = new C12842x1(this.f38028kk.m59717to());
        if (C7019kk.m27462to(Byte.valueOf(c12842x1.m59718x1()), 6) != 48) {
            throw new ArgumentException("Invalid ExtendedKeyUsage extension");
        }
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            this.f17651to.addItem(C12828kk.m59652x1(c12842x1.m59710k4(i)));
        }
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (String str : this.f17651to) {
            int iM27428k4 = f17650du.m27428k4(str);
            c6765kp.m26792k4(iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? iM27428k4 != 5 ? "unknown" : "OCSP Signing" : "Time Stamping" : "Email Protection" : "Code Signing" : "Client Authentication" : "Server Authentication");
            c6765kp.m26796k4(" ({0}){1}", str, C14052dq.m66570kk());
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: x1 */
    public void mo25218x1() {
        C12842x1 c12842x1 = new C12842x1(PatternStyle.Wave);
        Iterator<E> it = this.f17651to.iterator();
        while (it.hasNext()) {
            c12842x1.m59712k4(C12828kk.m59650k4((String) it.next()));
        }
        C12842x1 c12842x12 = new C12842x1((byte) 4);
        this.f38028kk = c12842x12;
        c12842x12.m59712k4(c12842x1);
    }

    public C6227k4(C10934du c10934du) {
        super(c10934du);
    }
}
