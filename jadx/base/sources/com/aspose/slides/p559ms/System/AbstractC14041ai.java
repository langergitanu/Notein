package com.aspose.slides.p559ms.System;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p395sa.C10167k4;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ai */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14041ai<T> extends AbstractC14085qw {
    public final InterfaceC14083qm beginInvoke(T t, AbstractC14078m9 abstractC14078m9, Object obj) {
        return C10167k4.m50006k4(new C14086ri(this, this, abstractC14078m9, obj, t));
    }

    public final boolean endInvoke(InterfaceC14083qm interfaceC14083qm) {
        C10167k4.m50008k4(this, interfaceC14083qm);
        return ((Boolean) C7019kk.m27464to(peekResult(), Boolean.TYPE)).booleanValue();
    }

    public abstract boolean invoke(T t);
}
