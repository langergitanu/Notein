package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: loaded from: classes3.dex */
class nci {
    /* JADX INFO: renamed from: k4 */
    public static <T> String m67958k4(Class<T> cls, AbstractC3124b3 abstractC3124b3, String str, TemplateContext<T> templateContext) {
        return m67959k4(cls, str, templateContext, abstractC3124b3);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> String m67959k4(Class<T> cls, String str, TemplateContext<T> templateContext, AbstractC3124b3 abstractC3124b3) throws Throwable {
        AbstractC14068j5 abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) cls);
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) Presentation.class)) {
            if ("styles-pres".equals(str)) {
                new n0k((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
                return "";
            }
            if ("scripts-animation".equals(str)) {
                new rg7((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
                return "";
            }
            if ("scripts-effects".equals(str)) {
                new tx8((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
                return "";
            }
            if (!"scripts-navigation".equals(str)) {
                return "";
            }
            new wyh((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) Paragraph.class)) {
            if ("bullet".equals(str)) {
                new C14721w2((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
                return "";
            }
            if (!"paragraph".equals(str)) {
                return "";
            }
            new ozy((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) AutoShape.class)) {
            new C14829y4((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) MasterSlide.class)) {
            new mok((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) PictureFrame.class)) {
            new htx((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) Portion.class)) {
            new u6l((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) Shape.class)) {
            new xk2((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) Slide.class)) {
            new u9b((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) Table.class)) {
            new t9l((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 == C7019kk.m27443k4((Class<?>) TextFrame.class)) {
            new rqx((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
            return "";
        }
        if (abstractC14068j5M27443k4 != C7019kk.m27443k4((Class<?>) VideoFrame.class)) {
            throw new NotImplementedException("Unknown template type");
        }
        new xhk((TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class), abstractC3124b3).mo6644k4();
        return "";
    }
}
