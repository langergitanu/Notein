package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes3.dex */
public class VideoPlayerHtmlController implements IVideoPlayerHtmlController {

    /* JADX INFO: renamed from: ck */
    private static final String f3671ck = C14113y2.m67408k4("<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">", "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" />\n<title>");

    /* JADX INFO: renamed from: fa */
    private static final String f3672fa = C14113y2.m67408k4("</title>\n<style type=\"text/css\"></style>\n<script type=\"text/javascript\">\n", "function playPause(id)\n{\n  var media = document.getElementById(id);\n", "  if (media.paused || media.ended || media.seeking || media.readyState < media.HAVE_FUTURE_DATA)\n", "    media.play();\n  else\n    media.pause();\n}\n</script>\n</head>\n<body>");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f3673up = new C7017h4("image/svg+xml", "video/mp4", "video/ogg", "video/webm", "video/x-msvideo", "video/quicktime", "audio/mpeg", "audio/wav", "audio/ogg", "audio/mp4");

    /* JADX INFO: renamed from: dy */
    private final String f3676dy;

    /* JADX INFO: renamed from: h4 */
    private final C14062gk f3677h4;

    /* JADX INFO: renamed from: jd */
    private int f3678jd;

    /* JADX INFO: renamed from: m9 */
    private final String f3681m9;

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, String> f3679k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<IAudio, String> f3683x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<IVideo, String> f3680kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private final Dictionary<String, String> f3682to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private final List<IAudio> f3675du = new List<>();

    /* JADX INFO: renamed from: c5 */
    private int f3674c5 = 1;

    /* JADX INFO: renamed from: com.aspose.slides.VideoPlayerHtmlController$k4 */
    public static class C0692k4 {

        /* JADX INFO: renamed from: k4 */
        private final String f3684k4;

        /* JADX INFO: renamed from: kk */
        private final String f3685kk;

        /* JADX INFO: renamed from: to */
        private final String f3686to;

        /* JADX INFO: renamed from: x1 */
        private final String f3687x1;

        public C0692k4(String str, String str2, String str3, String str4) {
            this.f3684k4 = str;
            this.f3687x1 = str2;
            this.f3685kk = str3;
            this.f3686to = str4;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m3085k4() {
            return this.f3684k4;
        }

        /* JADX INFO: renamed from: kk */
        public final String m3086kk() {
            return this.f3685kk;
        }

        /* JADX INFO: renamed from: to */
        public final String m3087to() {
            return this.f3686to;
        }

        /* JADX INFO: renamed from: x1 */
        public final String m3088x1() {
            return this.f3687x1;
        }
    }

    public VideoPlayerHtmlController(String str, String str2, String str3) {
        this.f3676dy = str;
        this.f3681m9 = str2;
        this.f3677h4 = new C14062gk(str3);
    }

    /* JADX INFO: renamed from: k4 */
    private String m3075k4(IAudio iAudio) {
        String[] strArr = {null};
        boolean zTryGetValue = this.f3683x1.tryGetValue(iAudio, strArr);
        String str = strArr[0];
        if (zTryGetValue) {
            return str;
        }
        String strM3078k4 = m3078k4("audio", m3083x1(iAudio.getContentType()));
        this.f3683x1.set_Item(iAudio, strM3078k4);
        C3130fa c3130fa = new C3130fa(C3141rv.m13412x1(this.f3676dy, strM3078k4), 2);
        try {
            byte[] binaryData = iAudio.getBinaryData();
            c3130fa.write(binaryData, 0, binaryData.length);
            c3130fa.close();
            return strM3078k4;
        } finally {
            c3130fa.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    private C0692k4 m3081kk(IVideoFrame iVideoFrame, IHtmlGenerator iHtmlGenerator) {
        HtmlGenerator htmlGenerator = (HtmlGenerator) iHtmlGenerator;
        float fM56699x1 = htmlGenerator.m1678to().m56699x1() / ((SlideSize) iVideoFrame.getPresentation().getSlideSize()).m2755k4().m56699x1();
        float fM56697kk = htmlGenerator.m1678to().m56697kk() / ((SlideSize) iVideoFrame.getPresentation().getSlideSize()).m2755k4().m56697kk();
        IShapeFrame frame = iVideoFrame.getFrame();
        return new C0692k4(C14113y2.m67408k4(C13850af.m65102k4(frame.getX() * fM56699x1), iHtmlGenerator.getSlideImageSizeUnitCode()), C14113y2.m67408k4(C13850af.m65102k4(frame.getY() * fM56697kk), iHtmlGenerator.getSlideImageSizeUnitCode()), C14113y2.m67408k4(C13850af.m65102k4(frame.getWidth() * fM56699x1), iHtmlGenerator.getSlideImageSizeUnitCode()), C14113y2.m67408k4(C13850af.m65102k4(frame.getHeight() * fM56697kk), iHtmlGenerator.getSlideImageSizeUnitCode()));
    }

    /* JADX INFO: renamed from: x1 */
    private String m3082x1(IAudio iAudio) {
        int iIndexOf = this.f3675du.indexOf(iAudio);
        if (iIndexOf >= 0) {
            return C14113y2.m67408k4("audio", C14057f9.m66591x1(iIndexOf));
        }
        this.f3675du.addItem(iAudio);
        return C14113y2.m67408k4("audio", C14057f9.m66591x1(this.f3675du.size() - 1));
    }

    @Override // com.aspose.slides.ISvgShapeFormattingController
    public final void formatShape(ISvgShape iSvgShape, IShape iShape) {
        String strM67402k4;
        if (C7019kk.m27469x1(iShape, OleObjectFrame.class)) {
            OleObjectFrame oleObjectFrame = (OleObjectFrame) iShape;
            if (oleObjectFrame.m2090yj() == null) {
                return;
            } else {
                strM67402k4 = C14113y2.m67402k4("document.location.assign('{0}')", m3079k4("object", "bin", oleObjectFrame.m2090yj()));
            }
        } else {
            if (!C7019kk.m27469x1(iShape, IAudioFrame.class)) {
                return;
            }
            IAudioFrame iAudioFrame = (IAudioFrame) iShape;
            if (iAudioFrame.getEmbeddedAudio() == null) {
                return;
            }
            IAudio embeddedAudio = iAudioFrame.getEmbeddedAudio();
            strM67402k4 = ("audio/mpeg".equals(embeddedAudio.getContentType()) || "audio/wav".equals(embeddedAudio.getContentType()) || "audio/ogg".equals(embeddedAudio.getContentType()) || "audio/mp4".equals(embeddedAudio.getContentType())) ? C14113y2.m67402k4("playPause('{0}')", m3082x1(iAudioFrame.getEmbeddedAudio())) : C14113y2.m67402k4("document.location.assign('{0}')", m3075k4(iAudioFrame.getEmbeddedAudio()));
        }
        iSvgShape.setEventHandler(3, strM67402k4);
    }

    @Override // com.aspose.slides.ILinkEmbedController
    public final int getObjectStoringLocation(int i, byte[] bArr, String str, String str2, String str3) {
        if (f3673up.m27428k4(str2) == 0) {
            return 1;
        }
        if (str3 == null) {
            str3 = "bin";
        }
        String strM3078k4 = m3078k4(str, str3);
        if (this.f3679k4.containsKey(Integer.valueOf(i))) {
            return 0;
        }
        this.f3679k4.addItem(Integer.valueOf(i), strM3078k4);
        return 0;
    }

    @Override // com.aspose.slides.ILinkEmbedController
    public final String getUrl(int i, int i2) {
        C14062gk c14062gk;
        String[] strArr = {null};
        boolean zTryGetValue = this.f3679k4.tryGetValue(Integer.valueOf(i), strArr);
        String str = strArr[0];
        if (!zTryGetValue) {
            return null;
        }
        if (i == 0) {
            c14062gk = new C14062gk(this.f3677h4, this.f3681m9);
        } else {
            String[] strArr2 = {null};
            this.f3679k4.tryGetValue(Integer.valueOf(i2), strArr2);
            c14062gk = new C14062gk(this.f3677h4, strArr2[0]);
        }
        return c14062gk.m66685k4(new C14062gk(this.f3677h4, str)).toString();
    }

    @Override // com.aspose.slides.ILinkEmbedController
    public final void saveExternal(int i, byte[] bArr) {
        String[] strArr = {null};
        this.f3679k4.tryGetValue(Integer.valueOf(i), strArr);
        C3130fa c3130fa = new C3130fa(m3077k4(strArr[0]), 2);
        try {
            c3130fa.write(bArr, 0, bArr.length);
        } finally {
            c3130fa.dispose();
        }
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentEnd(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        for (int i = 0; i < this.f3675du.size(); i++) {
            iHtmlGenerator.addHtml(C14113y2.m67402k4("<audio id=\"audio{0}\" style=\"display:none\">\n", Integer.valueOf(i)));
            IAudio iAudio = this.f3675du.get_Item(i);
            iHtmlGenerator.addHtml(C14113y2.m67402k4("<source src=\"{0}\" type=\"{1}\">\n</audio>", m3075k4(iAudio), iAudio.getContentType()));
        }
        iHtmlGenerator.addHtml("</body></html>");
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentStart(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        iHtmlGenerator.addHtml(f3671ck);
        iHtmlGenerator.addText(iPresentation.getDocumentProperties().getTitle());
        iHtmlGenerator.addHtml(f3672fa);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeEnd(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        if (C7019kk.m27469x1(iShape, VideoFrame.class)) {
            IVideoFrame iVideoFrame = (IVideoFrame) iShape;
            if (iVideoFrame.getEmbeddedVideo() != null) {
                IVideo embeddedVideo = iVideoFrame.getEmbeddedVideo();
                if ("video/mp4".equals(embeddedVideo.getContentType()) || "video/webm".equals(embeddedVideo.getContentType()) || "video/ogg".equals(embeddedVideo.getContentType())) {
                    m3080k4(iVideoFrame, iHtmlGenerator);
                } else {
                    m3084x1(iVideoFrame, iHtmlGenerator);
                }
            }
        }
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeStart(IHtmlGenerator iHtmlGenerator, IShape iShape) {
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideEnd(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        iHtmlGenerator.addHtml("</div></div>\n");
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideStart(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        iHtmlGenerator.addHtml(C14113y2.m67402k4("<div class=\"slideImage\" style=\"position: relative; width:{0}; height:{1}\">\n<div style=\"position: absolute; left:0; right:0; z-index:0\">\n", C14113y2.m67408k4(C13850af.m65102k4(((HtmlGenerator) iHtmlGenerator).m1678to().m56699x1()), iHtmlGenerator.getSlideImageSizeUnitCode()), C14113y2.m67408k4(C13850af.m65102k4(((HtmlGenerator) iHtmlGenerator).m1678to().m56697kk()), iHtmlGenerator.getSlideImageSizeUnitCode())));
        this.f3674c5 = 1;
    }

    /* JADX INFO: renamed from: k4 */
    private String m3076k4(IVideo iVideo) {
        String[] strArr = {null};
        boolean zTryGetValue = this.f3680kk.tryGetValue(iVideo, strArr);
        String str = strArr[0];
        if (zTryGetValue) {
            return str;
        }
        String strM3078k4 = m3078k4("video", m3083x1(iVideo.getContentType()));
        this.f3680kk.set_Item(iVideo, strM3078k4);
        C3130fa c3130fa = new C3130fa(C3141rv.m13412x1(this.f3676dy, strM3078k4), 2);
        try {
            byte[] binaryData = iVideo.getBinaryData();
            c3130fa.write(binaryData, 0, binaryData.length);
            c3130fa.close();
            return strM3078k4;
        } finally {
            c3130fa.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static String m3083x1(String str) {
        switch (f3673up.m27428k4(str)) {
            case 1:
                return "mp4";
            case 2:
                return "ogv";
            case 3:
                return "webm";
            case 4:
                return "avi";
            case 5:
                return "mov";
            case 6:
                return "mp3";
            case 7:
                return "wav";
            case 8:
                return "ogg";
            case 9:
                return "m4a";
            default:
                return "bin";
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m3077k4(String str) {
        return C3141rv.m13412x1(this.f3676dy, str);
    }

    /* JADX INFO: renamed from: x1 */
    private void m3084x1(IVideoFrame iVideoFrame, IHtmlGenerator iHtmlGenerator) {
        C0692k4 c0692k4M3081kk = m3081kk(iVideoFrame, iHtmlGenerator);
        C6765kp c6765kp = new C6765kp();
        Integer numValueOf = Integer.valueOf(this.f3678jd);
        String strM3085k4 = c0692k4M3081kk.m3085k4();
        String strM3088x1 = c0692k4M3081kk.m3088x1();
        int i = this.f3674c5 + 1;
        this.f3674c5 = i;
        c6765kp.m26796k4("</div><div id=\"video{0}\" style=\"position:absolute; left:{1}; top:{2}; z-index:{3}\">\n", numValueOf, strM3085k4, strM3088x1, Integer.valueOf(i));
        c6765kp.m26796k4(C14113y2.m67408k4("<object id=\"video{0}\" classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" ", "codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0\" ", "width=\"{1}\" height=\"{2}\" >\n"), Integer.valueOf(this.f3678jd), c0692k4M3081kk.m3086kk(), c0692k4M3081kk.m3087to());
        String strM3076k4 = m3076k4(iVideoFrame.getEmbeddedVideo());
        c6765kp.m26796k4("<param name=\"movie\" value=\"{0}\">", strM3076k4);
        c6765kp.m26792k4("<param name=\"quality\" value=\"high\" >");
        c6765kp.m26792k4("<param name=\"LOOP\" value=\"false\">");
        c6765kp.m26792k4("<param name=\"ShowControls\" value=\"true\">");
        c6765kp.m26792k4("<param name=\"autostart\" value=\"false\">");
        c6765kp.m26792k4("<param name=\"ShowStatusBar\" value=\"false\">");
        HtmlGenerator htmlGenerator = (HtmlGenerator) iHtmlGenerator;
        c6765kp.m26796k4(C14113y2.m67408k4("<embed src=\"{0}\" width=\"{1}\" height=\"{2}\" ", "loop=\"false\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" ", "type=\"application/x-shockwave-flash\"></embed>"), strM3076k4, Integer.valueOf(C7019kk.m27462to(Float.valueOf(iVideoFrame.getFrame().getWidth() * (htmlGenerator.m1678to().m56699x1() / ((SlideSize) iVideoFrame.getPresentation().getSlideSize()).m2755k4().m56699x1()) * 100.0f), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(iVideoFrame.getFrame().getHeight() * (htmlGenerator.m1678to().m56697kk() / ((SlideSize) iVideoFrame.getPresentation().getSlideSize()).m2755k4().m56697kk()) * 100.0f), 13)));
        c6765kp.m26792k4("</object>\n");
        this.f3678jd++;
        int i2 = this.f3674c5 + 1;
        this.f3674c5 = i2;
        c6765kp.m26796k4("</div>\n<div style=\"position: absolute; left:0; right:0; z-index:{0}; pointer-events:none\">", Integer.valueOf(i2));
        iHtmlGenerator.addHtml(c6765kp.toString());
    }

    /* JADX INFO: renamed from: k4 */
    private String m3078k4(String str, String str2) {
        int i = 0;
        while (true) {
            String strM3077k4 = m3077k4(C14113y2.m67402k4("{0}{1}.{2}", str, Integer.valueOf(i), str2));
            if (!C3131h4.m13361kk(strM3077k4)) {
                return C3141rv.m13403k4(strM3077k4);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m3079k4(String str, String str2, byte[] bArr) {
        C4772y9 c4772y9 = new C4772y9();
        try {
            c4772y9.m19588x1(bArr);
            String strM67408k4 = C14113y2.m67408k4(C14069jd.m66770k4(c4772y9.m19584fa()), str2);
            String[] strArr = {null};
            boolean zTryGetValue = this.f3682to.tryGetValue(strM67408k4, strArr);
            String str3 = strArr[0];
            if (zTryGetValue) {
                return str3;
            }
            String strM3078k4 = m3078k4(str, str2);
            C3130fa c3130fa = new C3130fa(m3077k4(strM3078k4), 2);
            try {
                c3130fa.write(bArr, 0, bArr.length);
                c3130fa.close();
                this.f3682to.set_Item(strM67408k4, strM3078k4);
                return strM3078k4;
            } finally {
                c3130fa.dispose();
            }
        } finally {
            c4772y9.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m3080k4(IVideoFrame iVideoFrame, IHtmlGenerator iHtmlGenerator) {
        C0692k4 c0692k4M3081kk = m3081kk(iVideoFrame, iHtmlGenerator);
        C6765kp c6765kp = new C6765kp();
        Integer numValueOf = Integer.valueOf(this.f3678jd);
        String strM3085k4 = c0692k4M3081kk.m3085k4();
        String strM3088x1 = c0692k4M3081kk.m3088x1();
        int i = this.f3674c5 + 1;
        this.f3674c5 = i;
        c6765kp.m26796k4("</div><div id=\"video{0}\" style=\"position:absolute; left:{1}; top:{2}; z-index:{3}\">\n", numValueOf, strM3085k4, strM3088x1, Integer.valueOf(i));
        c6765kp.m26796k4("<video id=\"video{0}video\" style=\"width:{1}; height:{2}\" controls=\"controls\">\n", Integer.valueOf(this.f3678jd), c0692k4M3081kk.m3086kk(), c0692k4M3081kk.m3087to());
        c6765kp.m26796k4("<source src=\"{0}\" type=\"{1}\">\n", m3076k4(iVideoFrame.getEmbeddedVideo()), iVideoFrame.getEmbeddedVideo().getContentType());
        this.f3678jd++;
        int i2 = this.f3674c5 + 1;
        this.f3674c5 = i2;
        c6765kp.m26796k4("</video>\n</div>\n<div style=\"position: absolute; left:0; right:0; z-index:{0}; pointer-events:none\">", Integer.valueOf(i2));
        iHtmlGenerator.addHtml(c6765kp.toString());
    }
}
