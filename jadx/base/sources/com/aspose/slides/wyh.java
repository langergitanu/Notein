package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class wyh extends C14367qz<Presentation> {
    public wyh(TemplateContext<Presentation> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        Presentation object = m69966kk().getObject();
        String strM67368h4 = C14113y2.m67368h4(C14051ck.m66557x1(((Boolean) m69966kk().getGlobal().get("navigationEnabled")).booleanValue()));
        String strM67368h42 = C14113y2.m67368h4(C14051ck.m66557x1(((Boolean) m69966kk().getGlobal().get("animateTransitions")).booleanValue()));
        String strM67368h43 = C14113y2.m67368h4(C14051ck.m66557x1(((Boolean) m69966kk().getGlobal().get("animateShapes")).booleanValue()));
        int size = object.getSlides().size();
        m69969x1("\r\n\r\nvar currentVisiblePage = 0;\r\nvar maxVisiblePage = ");
        m69963k4(size);
        m69969x1(";\r\n\r\n$(document).ready(function(){\r\n      \r\n    if (");
        m69967kk(strM67368h4);
        m69969x1(")\r\n        InitNavigation();\r\n    \r\n    if (!");
        m69967kk(strM67368h42);
        m69969x1(")\r\n        ShowSlide(1);\r\n    else\r\n        currentVisiblePage = 1;\r\n    ChangeThumbSelection(1);\r\n});\r\n\r\nfunction InitNavigation() {\r\n      \r\n    if ($(\".navigationArea\")[0].scrollHeight <= $(\".navigationArea\")[0].clientHeight) {\r\n        $(\".navigationArea\").css('width', '222');    \r\n        $('.navigationArea').addClass('navigationAreaBorder');\r\n    }\r\n    else {\r\n        $(\".navigationArea\").css('width', '');    \r\n        $('.navigationArea').removeClass('navigationAreaBorder');\r\n    }\r\n    \r\n    SetThumbnailClickHandler();\r\n}\r\n\r\nfunction RemoveThumbnailClickHandler() {\r\n    $(\".slideThumb\").unbind();\r\n}\r\n\r\nfunction SetThumbnailClickHandler() {\r\n    RemoveThumbnailClickHandler();\r\n    $(\".slideThumb\").click(function(){ ShowSlide($(this).data('number')); });\r\n}\r\n\r\nfunction ShowSlide(nextVisiblePage) {\r\n    \r\n    if (nextVisiblePage != currentVisiblePage) {         \r\n        ChangeThumbSelection(nextVisiblePage);\r\n        var prevSlideId = '#slide-' + currentVisiblePage;\r\n        var slideId = '#slide-' + nextVisiblePage;\r\n        currentVisiblePage = nextVisiblePage;\r\n        \r\n        if (");
        m69967kk(strM67368h42);
        m69969x1(") {\r\n            if (");
        m69967kk(strM67368h43);
        m69969x1(")\r\n                PauseAllEffects(animations);\r\n            \r\n            PrepareAndPlayTransition(slideId, prevSlideId);\r\n        }\r\n        else {\r\n            StackSlides(slideId, prevSlideId);\r\n            $(prevSlideId).hide();\r\n            $(slideId).show();\r\n            \r\n            if (");
        m69967kk(strM67368h43);
        m69969x1(") {\r\n                PauseAllEffects(prevAnimations);\r\n                RestoreAllEffects(prevAnimations);\r\n                AnimateShapes(slideId);\r\n                PlayNextAnimationsForTarget('slide');\r\n            }\r\n        }\r\n    }\r\n    else {\r\n        \r\n        if (");
        m69967kk(strM67368h43);
        m69969x1(") {\r\n            PauseAllEffects(animations);\r\n            RestoreAllEffects(animations);\r\n            PrepareAllEffects(animations);\r\n            ResetAnimationIndicies();\r\n            PlayNextAnimationsForTarget('slide');\r\n        }\r\n    }\r\n}\r\n\r\nfunction ChangeThumbSelection(nextVisiblePage) {\r\n    $('.slideThumb').removeClass('navigationSelected');\r\n    $('#slideThumb-' + nextVisiblePage).addClass('navigationSelected');\r\n}");
    }
}
