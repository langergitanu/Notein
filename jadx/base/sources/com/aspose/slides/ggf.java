package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ggf extends C14367qz<Presentation> {
    public ggf(TemplateContext<Presentation> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() {
        Presentation object = m69966kk().getObject();
        if (!((Boolean) m69966kk().getGlobal().get("animateTransitions")).booleanValue()) {
            m69966kk().getGlobal().put("animateShapes", Boolean.FALSE);
        }
        float fM56699x1 = ((SlideSize) object.getSlideSize()).m2755k4().m56699x1();
        float fM56697kk = ((SlideSize) object.getSlideSize()).m2755k4().m56697kk();
        m69969x1("\r\n    \r\n<!DOCTYPE html>    \r\n    \r\n<html");
        m69969x1("     \r\n    xmlns=\"http://www.w3.org/1999/xhtml\"");
        m69969x1("    \r\n    xmlns:svg=\"http://www.w3.org/2000/svg\"");
        m69969x1("    \r\n    xmlns:xlink=\"http://www.w3.org/1999/xlink\"");
        m69969x1(">    \r\n<head>    \r\n    <meta");
        m69969x1(" charset=\"utf-8\"");
        m69969x1(" />    \r\n    <title>");
        m69967kk(object.getDocumentProperties().getTitle());
        m69969x1("</title>    \r\n    <link");
        m69969x1(" rel=\"stylesheet\"");
        m69969x1(" type=\"text/css\"");
        m69969x1(" href=\"pres.css\"");
        m69969x1(" />    \r\n    <link");
        m69969x1(" rel=\"stylesheet\"");
        m69969x1(" type=\"text/css\"");
        m69969x1(" href=\"master.css\"");
        m69969x1(" />    \r\n    <script");
        m69969x1(" src=\"https://code.jquery.com/jquery-3.6.0.min.js\"");
        m69969x1(">\r\n    </script>\r\n    <script");
        m69969x1(" src=\"https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js\"");
        m69969x1(">\r\n    </script>\r\n    <script");
        m69969x1(" src=\"animation.js\"");
        m69969x1("></script>\r\n    <script");
        m69969x1(" src=\"effects.js\"");
        m69969x1("></script>\r\n    <script");
        m69969x1(" src=\"navigation.js\"");
        m69969x1("></script>\r\n</head>    \r\n<body>    \r\n    <div");
        m69969x1(" class=\"bg\"");
        m69969x1(">\r\n        <div");
        m69969x1(" id=\"flash\"");
        m69969x1(" class=\"slide\"");
        m69969x1(" style=\"background-color: #FFFFFF; outline: 0; display: none;\"");
        m69969x1(">\r\n        </div>\r\n        <div");
        m69969x1(" id=\"blackboard\"");
        m69969x1(" class=\"slide\"");
        m69969x1(" style=\"background-color: #000000; outline: 0; display: none;\"");
        m69969x1(">\r\n        </div>\r\n        \r\n");
        IGenericEnumerator<ISlide> it = object.getSlides().iterator();
        while (it.hasNext()) {
            try {
                Slide slide = (Slide) it.next();
                if (!slide.getHidden()) {
                    m69967kk(nci.m67958k4(Slide.class, this.f50311k4, "slide", m69966kk().subModel(slide)));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m69969x1("        \r\n        <div");
        m69969x1(" id=\"svgdiv\"");
        m69969x1(">\r\n            <svg");
        m69969x1(" width=\"0\"");
        m69969x1(" height=\"0\"");
        m69969x1(" xmlns=\"http://www.w3.org/2000/svg\"");
        m69969x1(" style=\"width: 100%; height: auto;\"");
        m69969x1(">\r\n                <defs>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip\"");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4("  viewbox=\"", 1924);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 2065);
        t8o t8oVarM63325k43 = jii.m63325k4("", 1935);
        t8o t8oVarM63325k44 = jii.m63325k4("0", 1935);
        Boolean bool = Boolean.TRUE;
        omh omhVarM63324k4 = jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool);
        omh omhVarM63324k42 = jii.m63324k4(jii.m63325k4(" ", 1936), jii.m63325k4("0", 1937), bool);
        t8o t8oVarM63325k45 = jii.m63325k4(" ", 1938);
        t8o t8oVarM63325k46 = jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 1939);
        Boolean bool2 = Boolean.FALSE;
        m69965k4("viewbox", t8oVarM63325k4, t8oVarM63325k42, omhVarM63324k4, omhVarM63324k42, jii.m63324k4(t8oVarM63325k45, t8oVarM63325k46, bool2), jii.m63324k4(jii.m63325k4(" ", 2001), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 2002), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip1\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 2127), jii.m63325k4("\"", 2267), jii.m63324k4(jii.m63325k4("", Integer.valueOf(EditingLanguage.SINDHI)), jii.m63325k4("0", Integer.valueOf(EditingLanguage.SINDHI)), bool), jii.m63324k4(jii.m63325k4(" ", 2138), jii.m63325k4("0", 2139), bool), jii.m63324k4(jii.m63325k4(" ", 2140), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 2141), bool2), jii.m63324k4(jii.m63325k4(" ", 2203), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 2204), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip2\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 2329), jii.m63325k4("\"", 2469), jii.m63324k4(jii.m63325k4("", 2339), jii.m63325k4("0", 2339), bool), jii.m63324k4(jii.m63325k4(" ", 2340), jii.m63325k4("0", 2341), bool), jii.m63324k4(jii.m63325k4(" ", 2342), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 2343), bool2), jii.m63324k4(jii.m63325k4(" ", 2405), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 2406), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip3\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 2531), jii.m63325k4("\"", 2671), jii.m63324k4(jii.m63325k4("", 2541), jii.m63325k4("0", 2541), bool), jii.m63324k4(jii.m63325k4(" ", 2542), jii.m63325k4("0", 2543), bool), jii.m63324k4(jii.m63325k4(" ", 2544), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 2545), bool2), jii.m63324k4(jii.m63325k4(" ", 2607), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 2608), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip4\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 2733), jii.m63325k4("\"", 2873), jii.m63324k4(jii.m63325k4("", 2743), jii.m63325k4("0", 2743), bool), jii.m63324k4(jii.m63325k4(" ", 2744), jii.m63325k4("0", 2745), bool), jii.m63324k4(jii.m63325k4(" ", 2746), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 2747), bool2), jii.m63324k4(jii.m63325k4(" ", 2809), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 2810), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip5\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 2935), jii.m63325k4("\"", 3075), jii.m63324k4(jii.m63325k4("", 2945), jii.m63325k4("0", 2945), bool), jii.m63324k4(jii.m63325k4(" ", 2946), jii.m63325k4("0", 2947), bool), jii.m63324k4(jii.m63325k4(" ", 2948), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 2949), bool2), jii.m63324k4(jii.m63325k4(" ", 3011), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 3012), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip6\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 3137), jii.m63325k4("\"", 3277), jii.m63324k4(jii.m63325k4("", 3147), jii.m63325k4("0", 3147), bool), jii.m63324k4(jii.m63325k4(" ", 3148), jii.m63325k4("0", 3149), bool), jii.m63324k4(jii.m63325k4(" ", 3150), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 3151), bool2), jii.m63324k4(jii.m63325k4(" ", 3213), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 3214), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip7\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 3339), jii.m63325k4("\"", 3479), jii.m63324k4(jii.m63325k4("", 3349), jii.m63325k4("0", 3349), bool), jii.m63324k4(jii.m63325k4(" ", 3350), jii.m63325k4("0", 3351), bool), jii.m63324k4(jii.m63325k4(" ", 3352), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 3353), bool2), jii.m63324k4(jii.m63325k4(" ", 3415), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 3416), bool2));
        m69969x1("></clipPath>\r\n                    <clipPath");
        m69969x1(" id=\"effectsclip8\"");
        m69965k4("viewbox", jii.m63325k4(" viewbox=\"", 3541), jii.m63325k4("\"", 3681), jii.m63324k4(jii.m63325k4("", 3551), jii.m63325k4("0", 3551), bool), jii.m63324k4(jii.m63325k4(" ", 3552), jii.m63325k4("0", 3553), bool), jii.m63324k4(jii.m63325k4(" ", 3554), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1()), 3555), bool2), jii.m63324k4(jii.m63325k4(" ", 3617), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk()), 3618), bool2));
        m69969x1(C14113y2.m67408k4("></clipPath>\r\n                </defs>\r\n            </svg>\r\n        </div>\r\n      ", "  <div"));
        m69969x1(" id=\"svgdivpaths\"");
        m69969x1(">\r\n            <svg");
        m69969x1(" id=\"patheffects\"");
        m69965k4("width", jii.m63325k4(" width=\"", 3822), jii.m63325k4("\"", 3867), jii.m63324k4(jii.m63325k4("", 3830), jii.m63325k4(dh2.m5103k4(fM56699x1), 3830), bool2));
        m69965k4("height", jii.m63325k4(" height=\"", 3868), jii.m63325k4("\"", 3915), jii.m63324k4(jii.m63325k4("", 3877), jii.m63325k4(dh2.m5103k4(fM56697kk), 3877), bool2));
        m69965k4("viewBox", jii.m63325k4(" viewBox=\"", 3916), jii.m63325k4("\"", 4006), jii.m63324k4(jii.m63325k4("", 3926), jii.m63325k4("0", 3926), bool), jii.m63324k4(jii.m63325k4(" ", 3927), jii.m63325k4("0", 3928), bool), jii.m63324k4(jii.m63325k4(" ", 3929), jii.m63325k4(dh2.m5103k4(fM56699x1), 3930), bool2), jii.m63324k4(jii.m63325k4(" ", 3967), jii.m63325k4(dh2.m5103k4(fM56697kk), 3968), bool2));
        m69969x1(">\r\n                <path");
        m69969x1(" id=\"entranceBouncePath\"");
        m69969x1(C14113y2.m67408k4(" d=\"M -310 -150 Q -200 -330 -110 -20 Q -80 -80 -60 -10 Q -40 -50 -20 0 Q -10 -30 ", "0 0\""));
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"exitBouncePath\"");
        m69969x1(C14113y2.m67408k4(" d=\"M 0 0 Q 110 -180 200 130 Q 230 70 250 140 Q 270 100 290 150 Q 300 120 310 150", "\""));
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"entranceSpiralPath\"");
        m69969x1(C14113y2.m67408k4(" d=\"M -430 -210 C -310 -380 90 -380 200 -300 C 400 -200 350 60 110 130 C -130 150", " -200 -70 20 -80 C 140 -70 70 50 0 0\""));
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"exitSpiralPath\"");
        m69969x1(C14113y2.m67408k4(" d=\"M 0 0 C -50 -10 0 -90 70 -40 C 150 40 -20 150 -110 30 C -160 -50 -70 -200 160", " -150 C 370 -100 430 380 -350 400\""));
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"entranceCenterRevolvePath\"");
        m69969x1(" d=\"M 0 230 A 40 40 0 0 0 0 0\"");
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"exitCenterRevolvePath\"");
        m69969x1(" d=\"M 0 0 A 40 40 0 1 1 0 230\"");
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"entranceCurveUpDownPath\"");
        m69969x1(" d=\"M -70 240 C 40 260 140 180 140 70 C 140 -20 30 -70 0 0\"");
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n                <path");
        m69969x1(" id=\"exitCurveUpDownPath\"");
        m69969x1(" d=\"M 0 0 C 10 -40 120 -40 130 70 C 120 160 90 220 -70 240\"");
        m69969x1(" fill=\"none\"");
        m69969x1("></path>\r\n            </svg>\r\n        </div>\r\n    </div>\r\n        \r\n    <button");
        m69969x1(" class=\"navigationButton\"");
        m69969x1(" id=\"PrevSlide\"");
        m69965k4("style", jii.m63325k4(" style=\"", 5241), jii.m63325k4("\"", 5412), jii.m63324k4(jii.m63325k4("", 5249), jii.m63325k4("left:", 5249), bool), jii.m63324k4(jii.m63325k4(" ", 5254), jii.m63325k4(dh2.m5103k4(((((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1() / 2.0f) - 100.0f) - 5.0f), 5255), bool2), jii.m63324k4(jii.m63325k4("", 5331), jii.m63325k4("px;", 5331), bool), jii.m63324k4(jii.m63325k4(" ", 5334), jii.m63325k4("top:", 5335), bool), jii.m63324k4(jii.m63325k4(" ", 5339), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk() + 40.0f), 5340), bool2), jii.m63324k4(jii.m63325k4("", 5408), jii.m63325k4("px;", 5408), bool), jii.m63324k4(jii.m63325k4(" ", 5411), jii.m63325k4("", 5411), bool));
        m69969x1(">Prev Slide</button>    \r\n    <button");
        m69969x1(" class=\"navigationButton\"");
        m69969x1(" id=\"NextSlide\"");
        m69965k4("style", jii.m63325k4(" style=\"", 5490), jii.m63325k4("\"", 5655), jii.m63324k4(jii.m63325k4("", 5498), jii.m63325k4("left:", 5498), bool), jii.m63324k4(jii.m63325k4(" ", 5503), jii.m63325k4(dh2.m5103k4((((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56699x1() / 2.0f) + 5.0f), 5504), bool2), jii.m63324k4(jii.m63325k4("", 5574), jii.m63325k4("px;", 5574), bool), jii.m63324k4(jii.m63325k4(" ", 5577), jii.m63325k4("top:", 5578), bool), jii.m63324k4(jii.m63325k4(" ", 5582), jii.m63325k4(dh2.m5103k4(((SlideSize) m69966kk().getObject().getSlideSize()).m2755k4().m56697kk() + 40.0f), 5583), bool2), jii.m63324k4(jii.m63325k4("", 5651), jii.m63325k4("px;", 5651), bool), jii.m63324k4(jii.m63325k4(" ", 5654), jii.m63325k4("", 5654), bool));
        m69969x1(">Next Slide</button>\r\n</body>\r\n</html>");
    }
}
