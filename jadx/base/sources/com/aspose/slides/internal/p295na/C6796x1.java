package com.aspose.slides.internal.p295na;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p199j5.InterfaceC5195kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.na.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6796x1 implements InterfaceC5195kk {

    /* JADX INFO: renamed from: k4 */
    private String f18821k4;

    public C6796x1(String str) {
        this.f18821k4 = str;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5195kk
    /* JADX INFO: renamed from: k4 */
    public final short mo22191k4(InterfaceC12777qq interfaceC12777qq) {
        IEnumerator it = interfaceC12777qq.mo22620A_().iterator();
        while (it.hasNext()) {
            try {
                InterfaceC12772kk interfaceC12772kk = (InterfaceC12772kk) it.next();
                if (interfaceC12772kk.mo22737h4() && C14113y2.m67363du(interfaceC12772kk.mo22741kk(), this.f18821k4)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    return (short) 1;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }
}
