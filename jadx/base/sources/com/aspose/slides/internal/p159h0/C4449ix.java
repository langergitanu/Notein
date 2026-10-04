package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ix */
/* JADX INFO: loaded from: classes.dex */
public final class C4449ix extends AbstractC4434bz {

    /* JADX INFO: renamed from: du */
    private C4473um f12231du;

    /* JADX INFO: renamed from: h4 */
    private C4489zj f12232h4;

    public C4449ix(InterfaceC4472u4 interfaceC4472u4, C4442e0 c4442e0, List<C4430ar> list, int i) {
        super(interfaceC4472u4, c4442e0, list, i);
        this.f12231du = new C4473um();
        this.f12232h4 = new C4489zj();
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public C4428ai mo18091k4(AbstractC4434bz.kk kkVar) {
        C4428ai c4428ai = new C4428ai();
        C4428ai[] c4428aiArr = {c4428ai};
        this.f12174k4.mo18194k4(kkVar.f12182kk.m18285k4(), kkVar.f12182kk.m18290x1(), c4428aiArr);
        c4428aiArr[0].CloneTo(c4428ai);
        C4489zj c4489zj = new C4489zj(0.0f);
        List.Enumerator<C4430ar> it = this.f12175kk.iterator();
        while (it.hasNext()) {
            try {
                C4489zj.m18499k4(c4489zj, it.next().m18060k4()).CloneTo(c4489zj);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (this.f12175kk.size() > 1) {
            C4489zj.m18503x1(c4489zj, this.f12175kk.size()).CloneTo(c4489zj);
        }
        C4489zj c4489zj2 = new C4489zj(0.0f);
        it = this.f12175kk.iterator();
        while (it.hasNext()) {
            try {
                C4430ar next = it.next();
                float fM18418x1 = C4479w6.m18418x1(C4489zj.m18500kk(kkVar.f12184x1.Clone(), C4489zj.m18497k4(next.m18063kk()).Clone().Clone()));
                if (fM18418x1 > 0.0f) {
                    C4489zj.m18499k4(c4489zj, C4489zj.m18498k4(next.m18067x1(), fM18418x1)).CloneTo(c4489zj);
                    C4479w6.m18407k4(c4489zj.Clone()).CloneTo(c4489zj);
                    C4489zj.m18499k4(c4489zj2, C4489zj.m18498k4(next.m18065to(), (float) C14116yg.m67469du(C4479w6.m18418x1(C4489zj.m18500kk(C4489zj.m18504x1(C4489zj.m18496k4(fM18418x1 * 2.0f, kkVar.f12184x1), r7).m18510to().Clone().Clone(), kkVar.f12183to.Clone())), next.m18056du()))).CloneTo(c4489zj2);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return C4428ai.m18038k4(C4428ai.m18041x1(c4428ai, c4489zj), c4489zj2).Clone();
    }

    public C4449ix(InterfaceC4472u4 interfaceC4472u4, C4442e0 c4442e0, C4430ar c4430ar, int i) {
        super(interfaceC4472u4, c4442e0, c4430ar, i);
        this.f12231du = new C4473um();
        this.f12232h4 = new C4489zj();
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public AbstractC4434bz.kk mo18092k4(AbstractC4434bz.x1 x1Var) {
        AbstractC4434bz.kk kkVar = new AbstractC4434bz.kk();
        this.f12231du.m18373kk(x1Var.f12185k4.Clone()).CloneTo(kkVar.f12181k4);
        this.f12177x1.m18165kk().m18377x1(x1Var.f12187x1.Clone()).CloneTo(kkVar.f12184x1);
        x1Var.f12186kk.CloneTo(kkVar.f12182kk);
        C4489zj.m18504x1(this.f12232h4, this.f12177x1.m18165kk().m18370k4(x1Var.f12185k4.Clone()).Clone()).m18510to().CloneTo(kkVar.f12183to);
        return kkVar;
    }

    @Override // com.aspose.slides.internal.p159h0.AbstractC4434bz
    /* JADX INFO: renamed from: k4 */
    public void mo18093k4() {
        C4473um.m18361k4(C4473um.m18361k4(this.f12177x1.m18165kk(), this.f12177x1.m18162k4()), this.f12177x1.m18168x1()).CloneTo(this.f12231du);
        this.f12177x1.m18162k4().m18375to().m18376x1().CloneTo(this.f12232h4);
    }
}
