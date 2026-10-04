package com.aspose.slides.internal.p416tb;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p085dk.C3177m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10896ck {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, String> f37872k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<Integer, String> f37875x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<Integer, String> f37873kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private static final Dictionary<Integer, String> f37874to = new Dictionary<>();

    static {
        m52439k4();
        m52445x1();
        m52441kk();
        m52443to();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m52438k4(int i) {
        return (String) C3177m9.m13597k4(f37872k4, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: kk */
    public static String m52440kk(int i) {
        return (String) C3177m9.m13597k4(f37873kk, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: to */
    public static String m52442to(int i) {
        return (String) C3177m9.m13597k4(f37874to, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m52444x1(int i) {
        return (String) C3177m9.m13597k4(f37875x1, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m52439k4() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem(0, "/MediaBox");
        dictionary.addItem(1, "/CropBox");
        dictionary.addItem(2, "/BleedBox");
        dictionary.addItem(4, "/ArtBox");
        dictionary.addItem(3, "/TrimBox");
        C3177m9.m13598k4(dictionary, f37872k4, null);
    }

    /* JADX INFO: renamed from: kk */
    private static void m52441kk() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem(1, "/OneColumn");
        dictionary.addItem(0, "/SinglePage");
        dictionary.addItem(2, "/TwoColumnLeft");
        dictionary.addItem(3, "/TwoColumnRight");
        dictionary.addItem(4, "/TwoPageLeft");
        dictionary.addItem(5, "/TwoPageRight");
        C3177m9.m13598k4(dictionary, f37873kk, null);
    }

    /* JADX INFO: renamed from: to */
    private static void m52443to() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem(0, "/Btn");
        dictionary.addItem(2, "/Ch");
        dictionary.addItem(3, "/Sig");
        dictionary.addItem(1, "/Tx");
        C3177m9.m13598k4(dictionary, f37874to, null);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m52445x1() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem(3, "/FullScreen");
        dictionary.addItem(0, "/UseNone");
        dictionary.addItem(4, "/UseOC");
        dictionary.addItem(1, "/UseOutlines");
        dictionary.addItem(2, "/UseThumbs");
        C3177m9.m13598k4(dictionary, f37875x1, null);
    }
}
