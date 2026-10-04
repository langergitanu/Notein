package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.ri */
/* JADX INFO: loaded from: classes.dex */
public class C4923ri extends AbstractC4908jd {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC12760ar f13505k4;

    public C4923ri(C4884ai c4884ai, InterfaceC12760ar interfaceC12760ar) {
        this.f13505k4 = interfaceC12760ar;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, java.lang.Iterable
    public IGenericEnumerator<InterfaceC12777qq> iterator() {
        return this.f13505k4.iterator();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public int mo20312k4() {
        return this.f13505k4.mo20312k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5535bv m20515k4(InterfaceC12760ar interfaceC12760ar, String str) {
        if (interfaceC12760ar == null) {
            return null;
        }
        IGenericEnumerator<InterfaceC12777qq> it = interfaceC12760ar.iterator();
        while (it.hasNext()) {
            try {
                C4899em c4899em = (C4899em) it.next();
                String strMo22721to = c4899em.mo22721to("ID");
                if (strMo22721to != null && C14113y2.m67432to(strMo22721to, str, (short) 5)) {
                    return c4899em;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = interfaceC12760ar.iterator();
        while (it.hasNext()) {
            try {
                C4899em c4899em2 = (C4899em) it.next();
                String strMo22721to2 = c4899em2.mo22721to("NAME");
                if (strMo22721to2 != null && C14113y2.m67432to(strMo22721to2, str, (short) 5)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return c4899em2;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p182ii.AbstractC4908jd
    /* JADX INFO: renamed from: k4 */
    public AbstractC5535bv mo20313k4(String str) {
        return m20515k4(this.f13505k4, str);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public InterfaceC12777qq mo20314k4(int i) {
        return this.f13505k4.mo20314k4(i);
    }
}
