package com.aspose.slides.internal.p144g6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p060ca.InterfaceC2201mt;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p508xq.C12596h4;
import com.aspose.slides.internal.p508xq.C12601to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4216kk extends AbstractC4221to {

    /* JADX INFO: renamed from: k4 */
    private final C12601to f11501k4;

    /* JADX INFO: renamed from: kk */
    private C4211fa f11502kk;

    /* JADX INFO: renamed from: x1 */
    private C12596h4 f11503x1;

    public C4216kk(C12601to c12601to) {
        super("/Resources");
        this.f11501k4 = c12601to;
    }

    @Override // com.aspose.slides.internal.p144g6.AbstractC4221to
    /* JADX INFO: renamed from: k4 */
    public C4214jd mo16956k4(byte[] bArr, C6921dy c6921dy) throws Throwable {
        C4214jd c4214jdMo16956k4 = super.mo16956k4(bArr, c6921dy);
        this.f11503x1.m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/required-resource", c4214jdMo16956k4.m16939k4(), false);
        return c4214jdMo16956k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4211fa m16961kk() {
        return this.f11502kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12596h4 m16962x1() {
        return this.f11503x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12596h4 m16954k4(C4214jd c4214jd) {
        C12596h4 c12596h4 = new C12596h4(c4214jd.m16939k4(), m16955x1(C12549du.m58515x1(c4214jd.m16940kk())));
        c12596h4.m58803to().write(c4214jd.m16940kk(), 0, c4214jd.m16940kk().length);
        return c12596h4;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m16955x1(int i) {
        if (i == 4) {
            return "image/jpeg";
        }
        if (i == 5) {
            return "image/png";
        }
        if (i == 8) {
            return "image/tiff";
        }
        throw new InvalidOperationException("Unexpected image type.");
    }

    @Override // com.aspose.slides.internal.p144g6.AbstractC4221to
    /* JADX INFO: renamed from: k4 */
    public String mo16957k4(C9790ts c9790ts) {
        String strMo16957k4 = super.mo16957k4(c9790ts);
        this.f11503x1.m58799h4().m58784k4("http://schemas.microsoft.com/xps/2005/06/required-resource", strMo16957k4, false);
        return strMo16957k4;
    }

    @Override // com.aspose.slides.internal.p144g6.AbstractC4221to
    /* JADX INFO: renamed from: k4 */
    public void mo16958k4() {
        Iterator<KeyValuePair<TKey, TValue>> it = m16990du().iterator();
        while (it.hasNext()) {
            KeyValuePair keyValuePair = (KeyValuePair) it.next();
            this.f11501k4.m58793x1().m58814k4(C4207c5.m16883k4((InterfaceC2201mt) keyValuePair.getValue(), (String) keyValuePair.getKey()));
        }
        Dictionary.ValueCollection.Enumerator<Integer, C4214jd> it2 = m16991h4().getValues().iterator();
        while (it2.hasNext()) {
            try {
                this.f11501k4.m58793x1().m58814k4(m16954k4(it2.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16959k4(int i) {
        C12596h4 c12596h4 = new C12596h4(C14113y2.m67402k4("/Documents/1/Pages/{0}.fpage", Integer.valueOf(i)), "application/vnd.ms-package.xps-fixedpage+xml");
        this.f11501k4.m58793x1().m58814k4(c12596h4);
        this.f11503x1 = c12596h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16960k4(C4211fa c4211fa) {
        this.f11502kk = c4211fa;
    }
}
