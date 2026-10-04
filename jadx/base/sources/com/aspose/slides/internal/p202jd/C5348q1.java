package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.User;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.q1 */
/* JADX INFO: loaded from: classes.dex */
public class C5348q1 extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14340k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14340k4 = c11068dy;
        c11068dy.m53499k4(User.MALE, C5813x1.k4.f16286p8);
        c11068dy.m53499k4(User.FEMALE, C5813x1.k4.f16308q1);
        c11068dy.m53499k4("child", C5813x1.k4.f16255o2);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14340k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        IGenericList<InterfaceC9933up> iGenericListM48835k4 = AbstractC9922k4.m48835k4(interfaceC9933up);
        List list = new List();
        IGenericEnumerator<InterfaceC9933up> it = iGenericListM48835k4.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC9933up next = it.next();
                short sMo48850k4 = next.mo48850k4();
                if (sMo48850k4 != 0) {
                    if (sMo48850k4 == 12) {
                        if (list.size() != 0) {
                            list.clear();
                        }
                        list.addItem(C5813x1.k4.f16146k4);
                        C5796m9 c5796m9 = new C5796m9(list);
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return c5796m9;
                    }
                    if (sMo48850k4 != 35 && sMo48850k4 != 36) {
                        throw m15602k4(next.mo48850k4());
                    }
                    Object objM54524x1 = (AbstractC5788h4) mo15596du().m53498k4(next.mo48784c5());
                    if (objM54524x1 == null) {
                        objM54524x1 = C11537ks.m54524x1(next.mo48784c5());
                    }
                    list.addItem(objM54524x1);
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
        return new C5796m9(list);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9();
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.GRID_TABLE_4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "voice-family";
    }
}
