package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class SetEffect extends Behavior implements ISetEffect {

    /* JADX INFO: renamed from: du */
    Object f3294du;

    @Override // com.aspose.slides.ISetEffect
    public final Object getTo() {
        return this.f3294du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2532k4(Object obj) {
        if (C7019kk.m27469x1(obj, String.class) || C7019kk.m27469x1(obj, ColorFormat.class) || C7019kk.m27469x1(obj, Float.class) || C7019kk.m27469x1(obj, Integer.class) || C7019kk.m27469x1(obj, Long.class) || C7019kk.m27469x1(obj, Boolean.class)) {
            return true;
        }
        throw new PptxException("invalid property value type");
    }

    @Override // com.aspose.slides.ISetEffect
    public final void setTo(Object obj) {
        m2532k4(obj);
        this.f3294du = obj;
    }
}
