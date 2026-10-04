package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.bz */
/* JADX INFO: loaded from: classes3.dex */
public class C3600bz extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private final int f9999k4;

    /* JADX INFO: renamed from: kk */
    private int f10000kk;

    /* JADX INFO: renamed from: x1 */
    private long f10002x1;

    /* JADX INFO: renamed from: to */
    private C3597b3 f10001to = new C3597b3();

    /* JADX INFO: renamed from: du */
    private final List<C3664yj> f9998du = new List<>();

    public C3600bz(int i) {
        this.f9999k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 15;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C3664yj> m14700x1() {
        return this.f9998du;
    }

    /* JADX INFO: renamed from: x1 */
    private C3664yj m14698x1(final String str) {
        return this.f9998du.find(new AbstractC14041ai<C3664yj>() { // from class: com.aspose.slides.internal.ec.bz.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C3664yj c3664yj) {
                return C14113y2.m67363du(c3664yj.m14860k4().m14786x1(), str);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14699k4(String str) {
        C3664yj c3664yjM14698x1 = m14698x1(str);
        if (c3664yjM14698x1 == null) {
            throw new ArgumentException(C14113y2.m67402k4("Module with name {0} is not exists", str));
        }
        this.f9998du.removeItem(c3664yjM14698x1);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        this.f10002x1 = c3134k4.m13384uz();
        this.f10000kk = c3134k4.m13382u4();
        this.f10001to.mo14692k4(c3134k4);
        while ((C3623k4.m14763k4(c3134k4) & 65535) == 25) {
            C3664yj c3664yj = new C3664yj(this.f9999k4);
            c3664yj.mo14692k4(c3134k4);
            this.f9998du.addItem(c3664yj);
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        c3149x1.m13447k4(2L);
        c3149x1.m13446k4(this.f9998du.size() & 65535);
        this.f10001to.mo14697k4(c3149x1);
        List.Enumerator<C3664yj> it = this.f9998du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo14697k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
