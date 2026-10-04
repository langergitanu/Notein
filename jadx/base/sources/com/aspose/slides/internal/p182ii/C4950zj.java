package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.zj */
/* JADX INFO: loaded from: classes.dex */
public class C4950zj extends AbstractC4908jd {

    /* JADX INFO: renamed from: k4 */
    private List<C4884ai> f13521k4 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.ii.zj$k4 */
    public static class k4 implements IGenericEnumerator<InterfaceC12777qq> {

        /* JADX INFO: renamed from: k4 */
        private IGenericEnumerator<C4884ai> f13522k4;

        public k4(List<C4884ai> list) {
            this.f13522k4 = list.iterator();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public final void dispose() {
            this.f13522k4.dispose();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public final boolean hasNext() {
            return this.f13522k4.hasNext();
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final InterfaceC12777qq next() {
            return this.f13522k4.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public final void reset() {
            this.f13522k4.reset();
        }
    }

    public C4950zj(C4939w6 c4939w6, String str) {
        for (InterfaceC12769ix interfaceC12769ixM22725x6 = c4939w6.m22725x6(); interfaceC12769ixM22725x6 != null; interfaceC12769ixM22725x6 = interfaceC12769ixM22725x6.mo22195u4()) {
            if (C14113y2.m67363du(interfaceC12769ixM22725x6.mo22700du(), str)) {
                this.f13521k4.addItem((C4884ai) interfaceC12769ixM22725x6);
            }
        }
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, java.lang.Iterable
    public IGenericEnumerator<InterfaceC12777qq> iterator() {
        return new k4(this.f13521k4);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5558v4, com.aspose.slides.internal.p517y2.InterfaceC12760ar
    /* JADX INFO: renamed from: k4 */
    public int mo20312k4() {
        return this.f13521k4.size();
    }

    @Override // com.aspose.slides.internal.p182ii.AbstractC4908jd
    /* JADX INFO: renamed from: k4 */
    public AbstractC5535bv mo20313k4(String str) {
        List.Enumerator<C4884ai> it = this.f13521k4.iterator();
        while (it.hasNext()) {
            try {
                C4884ai next = it.next();
                String strMo22721to = next.mo22721to("ID");
                if (strMo22721to != null && C14113y2.m67432to(strMo22721to, str, (short) 5)) {
                    return next;
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
        it = this.f13521k4.iterator();
        while (it.hasNext()) {
            try {
                C4884ai next2 = it.next();
                String strMo22721to2 = next2.mo22721to("NAME");
                if (strMo22721to2 != null && C14113y2.m67432to(strMo22721to2, str, (short) 5)) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return next2;
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
        return this.f13521k4.get_Item(i);
    }
}
