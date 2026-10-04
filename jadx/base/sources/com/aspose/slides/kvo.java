package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kvo extends AbstractC0753ak {
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3646k4(bay bayVar) {
        bayVar.m4074dy().m74259kk(bayVar.m4072du(61));
        if (bayVar.m4112x1(61) && bayVar.m4112x1(63)) {
            bayVar.m4074dy().m74259kk(bayVar.m4074dy().m74233dy() + bayVar.m4072du(63));
        }
        bayVar.m4074dy().m74239h4(bayVar.m4072du(15));
        if (bayVar.m4112x1(15) && bayVar.m4112x1(17)) {
            bayVar.m4074dy().m74239h4(bayVar.m4074dy().m74236fa() + bayVar.m4072du(17));
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                z2c z2cVarM4074dy = next.m4074dy();
                z2cVarM4074dy.m74259kk(bayVar.m4074dy().m74233dy());
                z2cVarM4074dy.m74239h4(bayVar.m4074dy().m74236fa());
                if (next.m4066ar().f49090k4 > bayVar.m4066ar().f49090k4) {
                    bayVar.m4092k4(new tbp(next.m4066ar().f49090k4, bayVar.m4066ar().f49091x1));
                }
                if (next.m4066ar().f49091x1 > bayVar.m4066ar().f49091x1) {
                    bayVar.m4092k4(new tbp(bayVar.m4066ar().f49090k4, next.m4066ar().f49091x1));
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return true;
        }
        it.dispose();
        return true;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: to */
    public boolean mo3651to() {
        return true;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: x1 */
    public boolean mo3654x1() {
        return true;
    }
}
