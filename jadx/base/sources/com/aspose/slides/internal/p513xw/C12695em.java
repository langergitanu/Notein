package com.aspose.slides.internal.p513xw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.em */
/* JADX INFO: loaded from: classes5.dex */
public class C12695em<TParentElement> implements InterfaceC1870up<C12717os> {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1870up<TParentElement> f42231k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC12711lr f42232kk;

    /* JADX INFO: renamed from: to */
    private boolean f42233to;

    /* JADX INFO: renamed from: x1 */
    private TParentElement f42234x1;

    public C12695em(InterfaceC1870up<TParentElement> interfaceC1870up) {
        this.f42231k4 = interfaceC1870up;
        m58933dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m58933dy() {
        if (!this.f42231k4.mo9764x1()) {
            m58937m9();
        } else {
            this.f42233to = true;
            this.f42234x1 = this.f42231k4.mo9760kk();
        }
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C12717os mo9760kk() {
        if (!this.f42233to) {
            throw new InvalidOperationException("PosIter");
        }
        C12717os c12717osMo58939x1 = mo58939x1(this.f42234x1);
        m58933dy();
        return c12717osMo58939x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final InterfaceC12711lr m58935h4() {
        TParentElement tparentelement;
        if (this.f42232kk == null && (tparentelement = this.f42234x1) != null) {
            this.f42232kk = mo58936k4(tparentelement);
            this.f42233to = true;
        }
        return this.f42232kk;
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC12711lr mo58936k4(Object obj) {
        return mo58939x1(obj).m59077to();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m58937m9() {
        this.f42233to = false;
        this.f42234x1 = null;
        this.f42232kk = null;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo58938to() {
        InterfaceC12711lr interfaceC12711lrMo58936k4 = mo58936k4(this.f42234x1);
        InterfaceC12711lr interfaceC12711lr = this.f42232kk;
        if (interfaceC12711lr == null) {
            this.f42232kk = interfaceC12711lrMo58936k4;
            return true;
        }
        if (interfaceC12711lr == interfaceC12711lrMo58936k4 || interfaceC12711lrMo58936k4 == null) {
            return true;
        }
        this.f42233to = false;
        this.f42232kk = null;
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public C12717os mo58939x1(Object obj) {
        C12717os c12717os = (C12717os) C7019kk.m27452k4(obj, C12717os.class);
        if (c12717os != null) {
            return c12717os;
        }
        throw new ArgumentException("Cannot obtain Position from the given object.");
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: k4 */
    public final void mo9758k4() {
        throw new NotSupportedException("PositionIterator doesn't support remove");
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: x1 */
    public final boolean mo9764x1() {
        return this.f42233to && mo58938to();
    }
}
