package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p033b2.C1573k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.lr */
/* JADX INFO: loaded from: classes.dex */
public class C3942lr implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10691k4;

    public C3942lr(InterfaceC9477x1 interfaceC9477x1) {
        this.f10691k4 = interfaceC9477x1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r1 = new com.aspose.slides.internal.p329p4.C7186k4();
     */
    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        C7179c5 c7179c5;
        if (list == null || list.size() < 2) {
            throw new ArgumentException("Arguments should has 2 operands!");
        }
        C7186k4 c7186k4 = (C7186k4) C7019kk.m27452k4((Object) list.get_Item(0), C7186k4.class);
        if (c7186k4 == null || (c7179c5 = (C7179c5) C7019kk.m27452k4((Object) list.get_Item(1), C7179c5.class)) == null) {
            return;
        }
        C9470du c9470duMo46638k4 = this.f10691k4.mo46638k4();
        int iM27778k4 = c7186k4.m27778k4();
        float[] fArr = new float[iM27778k4];
        for (int i = 0; i < iM27778k4; i++) {
            fArr[i] = c7186k4.m27786to(i) / c9470duMo46638k4.m46564jd();
        }
        IGenericEnumerator<C7185jd> it = c7186k4.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                C7185jd next = it.next();
                if (!C7019kk.m27469x1(next, C7179c5.class)) {
                    break;
                } else if (((C7179c5) next).m27753to() != 0.0f) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int iM27752kk = c7179c5.m27752kk();
        int i2 = iM27752kk >= 0 ? iM27752kk : 0;
        c9470duMo46638k4.m46569k4(new C1573k4(c7186k4, i2));
        c9470duMo46638k4.m46567k4(i2);
        c9470duMo46638k4.m46584k4(fArr);
        this.f10691k4.mo46639k4(c9470duMo46638k4);
    }
}
