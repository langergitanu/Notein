package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4894ck extends AbstractC4908jd {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12760ar f13489k4;

    public C4894ck(InterfaceC12760ar interfaceC12760ar) {
        this.f13489k4 = interfaceC12760ar;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, java.lang.Iterable
    public IGenericEnumerator<InterfaceC12777qq> iterator() {
        return this.f13489k4.iterator();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public int mo20312k4() {
        return this.f13489k4.mo20312k4();
    }

    @Override // com.aspose.slides.internal.p182ii.AbstractC4908jd
    /* JADX INFO: renamed from: k4 */
    public AbstractC5535bv mo20313k4(String str) {
        return m20311k4(str, this.f13489k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5535bv m20311k4(String str, InterfaceC12760ar interfaceC12760ar) {
        IGenericEnumerator<InterfaceC12777qq> it = interfaceC12760ar.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC12777qq next = it.next();
                InterfaceC12772kk interfaceC12772kkMo22861x1 = next.mo22620A_().mo22861x1("ID");
                if (interfaceC12772kkMo22861x1 != null && interfaceC12772kkMo22861x1.mo22741kk() != null && C14113y2.m67432to(interfaceC12772kkMo22861x1.mo22741kk(), str, (short) 5)) {
                    return (AbstractC5535bv) next;
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
                InterfaceC12777qq next2 = it.next();
                InterfaceC12772kk interfaceC12772kkMo22861x12 = next2.mo22620A_().mo22861x1("NAME");
                if (interfaceC12772kkMo22861x12 != null && interfaceC12772kkMo22861x12.mo22741kk() != null && C14113y2.m67432to(interfaceC12772kkMo22861x12.mo22741kk(), str, (short) 5)) {
                    AbstractC5535bv abstractC5535bv = (AbstractC5535bv) next2;
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return abstractC5535bv;
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

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public InterfaceC12777qq mo20314k4(int i) {
        return this.f13489k4.mo20314k4(i);
    }
}
