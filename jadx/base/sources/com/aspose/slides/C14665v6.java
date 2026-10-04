package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11831uw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.v6 */
/* JADX INFO: loaded from: classes3.dex */
class C14665v6 extends ywb {

    /* JADX INFO: renamed from: k4 */
    private bjs f49476k4;

    /* JADX INFO: renamed from: x1 */
    private sdp f49477x1;

    public C14665v6(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
        this.f49476k4 = new bjs(gnbVar, mo3467du());
    }

    /* JADX INFO: renamed from: k4 */
    public final bjs m72077k4() {
        return this.f49476k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final sdp m72080x1() {
        return this.f49477x1;
    }

    public C14665v6(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar);
        this.f49477x1 = new sdp(iBaseSlide, u8sVar, mo3467du());
        ykd.m73921k4(c11791os, ((Presentation) u8sVar.m71526c5()).m2351fa().m68384ne(), ((BaseSlide) iBaseSlide).mo400kk().m5308m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72078k4(IMasterThemeManager iMasterThemeManager) {
        iMasterThemeManager.setOverrideThemeEnabled(false);
        C11709bg[] c11709bgArrM55309k4 = mo3471m9().m55338u4().m55309k4(C11831uw.f39896k4);
        if (c11709bgArrM55309k4.length > 0) {
            new np9(c11709bgArrM55309k4[0].m55296x1(), mo3471m9()).m68154k4(iMasterThemeManager);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m72079k4(IShapeCollection iShapeCollection, sdp sdpVar) {
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (!shape.m2585wy()) {
                    sdpVar.m70581k4(shape, shape.mo272to().m69039ix());
                }
                if (C7019kk.m27469x1(shape, IGroupShape.class)) {
                    m72079k4(((IGroupShape) shape).getShapes(), sdpVar);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }
}
