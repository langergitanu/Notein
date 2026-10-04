package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.zr */
/* JADX INFO: loaded from: classes3.dex */
public class C2415zr extends AbstractC2166kq {

    /* JADX INFO: renamed from: du */
    private List<C2293sn> f8366du;

    /* JADX INFO: renamed from: kk */
    private List<C2330uy> f8367kk;

    /* JADX INFO: renamed from: to */
    private List<C2330uy> f8368to;

    /* JADX INFO: renamed from: x1 */
    private List<C2330uy> f8369x1;

    public C2415zr(long j, int i) {
        super(j, i);
        this.f8369x1 = new List<>();
        this.f8367kk = new List<>();
        this.f8368to = new List<>();
        this.f8366du = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        Class cls;
        long jM11154k4 = c2212n9.m11154k4();
        long j = this.f7845k4;
        if (jM11154k4 != (((j & 4294967295L) + 2) & 4294967295L)) {
            c2212n9.m11159k4(((j & 4294967295L) + 2) & 4294967295L);
        }
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        List<Integer> listM11354x12 = AbstractC2282s0.m11354x1(c2212n9);
        List<Integer> listM11354x13 = AbstractC2282s0.m11354x1(c2212n9);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        for (int i = 0; i < iM11151fa; i++) {
            this.f8366du.addItem(new C2293sn(c2212n9.m11151fa(), c2212n9.m11151fa()));
        }
        List.Enumerator<Integer> it = listM11354x1.iterator();
        while (true) {
            try {
                boolean zHasNext = it.hasNext();
                cls = Integer.TYPE;
                if (!zHasNext) {
                    break;
                }
                C2330uy c2330uy = new C2330uy(this.f7845k4 & 4294967295L, ((Integer) C7019kk.m27464to(it.next(), cls)).intValue() & 65535);
                AbstractC2282s0.m11353k4(c2330uy, c2212n9);
                this.f8369x1.addItem(c2330uy);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<Integer> it2 = listM11354x12.iterator();
        while (it2.hasNext()) {
            try {
                C2330uy c2330uy2 = new C2330uy(this.f7845k4 & 4294967295L, ((Integer) C7019kk.m27464to(it2.next(), cls)).intValue() & 65535);
                AbstractC2282s0.m11353k4(c2330uy2, c2212n9);
                this.f8367kk.addItem(c2330uy2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = listM11354x13.iterator();
        while (it2.hasNext()) {
            try {
                C2330uy c2330uy3 = new C2330uy(this.f7845k4 & 4294967295L, ((Integer) C7019kk.m27464to(it2.next(), cls)).intValue() & 65535);
                AbstractC2282s0.m11353k4(c2330uy3, c2212n9);
                this.f8368to.addItem(c2330uy3);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }
}
