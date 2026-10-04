package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class PortionFactory implements IPortionFactory {
    @Override // com.aspose.slides.IPortionFactory
    public final IPortion createPortion() {
        return new Portion();
    }

    @Override // com.aspose.slides.IPortionFactory
    public final IPortion createPortion(IPortion iPortion) {
        return new Portion((Portion) C7019kk.m27452k4((Object) iPortion, Portion.class));
    }

    @Override // com.aspose.slides.IPortionFactory
    public final IPortion createPortion(String str) {
        return new Portion(str);
    }
}
