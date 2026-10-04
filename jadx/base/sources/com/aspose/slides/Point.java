package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class Point implements IPoint {

    /* JADX INFO: renamed from: k4 */
    private float f3042k4;

    /* JADX INFO: renamed from: kk */
    private String f3043kk;

    /* JADX INFO: renamed from: x1 */
    private Object f3044x1;

    public Point() {
        this.f3042k4 = Float.NaN;
        this.f3043kk = "";
    }

    @Override // com.aspose.slides.IPoint
    public final String getFormula() {
        return this.f3043kk;
    }

    @Override // com.aspose.slides.IPoint
    public final float getTime() {
        return this.f3042k4;
    }

    @Override // com.aspose.slides.IPoint
    public final Object getValue() {
        return this.f3044x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2274k4(Object obj) {
        if (C7019kk.m27469x1(obj, Boolean.class) || C7019kk.m27469x1(obj, ColorFormat.class) || C7019kk.m27469x1(obj, Float.class) || C7019kk.m27469x1(obj, Integer.class) || C7019kk.m27469x1(obj, String.class)) {
            return true;
        }
        throw new PptxException("Animation.Point, invalid property value type");
    }

    @Override // com.aspose.slides.IPoint
    public final void setFormula(String str) {
        this.f3043kk = str;
    }

    @Override // com.aspose.slides.IPoint
    public final void setTime(float f) {
        this.f3042k4 = f;
    }

    @Override // com.aspose.slides.IPoint
    public final void setValue(Object obj) {
        m2274k4(obj);
        this.f3044x1 = obj;
    }

    public Point(float f, Object obj, String str) {
        this.f3042k4 = f;
        this.f3044x1 = obj;
        this.f3043kk = str;
    }
}
