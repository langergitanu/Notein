package com.aspose.slides.internal.p172hu;

import com.aspose.slides.internal.p395sa.AbstractC10169x1;
import com.aspose.slides.internal.p395sa.C10167k4;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.hu.kk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4685kk<TResult> extends AbstractC14085qw {
    public final InterfaceC14083qm beginInvoke(AbstractC14078m9 abstractC14078m9, Object obj) {
        return C10167k4.m50006k4(new AbstractC10169x1(this, abstractC14078m9, obj) { // from class: com.aspose.slides.internal.hu.kk.1
            @Override // com.aspose.slides.internal.p395sa.AbstractC10169x1
            public void beginInvoke() {
                AbstractC4685kk abstractC4685kk = AbstractC4685kk.this;
                abstractC4685kk.pushResult(abstractC4685kk.invoke());
            }
        });
    }

    public final TResult endInvoke(InterfaceC14083qm interfaceC14083qm) {
        C10167k4.m50008k4(this, interfaceC14083qm);
        return (TResult) peekResult();
    }

    public abstract TResult invoke();
}
