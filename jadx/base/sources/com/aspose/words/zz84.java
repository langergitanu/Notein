package com.aspose.words;

import androidx.core.text.util.LocalePreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zz84 {
    private static com.aspose.words.internal.zzD4 zzZ4V = new com.aspose.words.internal.zzD4();
    private static com.aspose.words.internal.zzD3<String> zzZ4U = new com.aspose.words.internal.zzD3<>();
    private static com.aspose.words.internal.zzZYI zzZ4T = new com.aspose.words.internal.zzZYI();
    private static com.aspose.words.internal.zzZYJ zzZ4S = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4R = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4Q = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4P = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4O = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4N = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4M = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4L = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ6C = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4K = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4J = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4I = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4H = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4G = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4F = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4E = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4D = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4C = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4B = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4A = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4z = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4y = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4x = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4w = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4v = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4u = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4t = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4s = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4r = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4q = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4p = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4o = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4n = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4m = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4l = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4k = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4j = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4i = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4h = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4g = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4f = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4e = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4d = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4c = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4b = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4a = new com.aspose.words.internal.zzZYJ();

    static {
        zzZ4S.zzH("auto", 1);
        zzZ4S.zzH("black", 8);
        zzZ4S.zzH("blackGray", 6);
        zzZ4S.zzH("blackWhite", 7);
        zzZ4S.zzH("clr", 0);
        zzZ4S.zzH("gray", 2);
        zzZ4S.zzH("grayWhite", 5);
        zzZ4S.zzH("hidden", 10);
        zzZ4S.zzH("invGray", 4);
        zzZ4S.zzH("ltGray", 3);
        zzZ4S.zzH("white", 9);
        zzZ4R.zzH("sng", 0);
        zzZ4R.zzH("dbl", 1);
        zzZ4R.zzH("thinThick", 3);
        zzZ4R.zzH("thickThin", 2);
        zzZ4R.zzH("tri", 4);
        zzZ4Q.zzH("flat", 2);
        zzZ4Q.zzH(TranslateLanguage.ALBANIAN, 1);
        zzZ4Q.zzH("rnd", 0);
        zzZ4P.zzH("insideMargin", 4);
        zzZ4P.zzH("leftMargin", 2);
        zzZ4P.zzH("margin", 0);
        zzZ4P.zzH("outsideMargin", 5);
        zzZ4P.zzH("page", 1);
        zzZ4P.zzH("rightMargin", 3);
        zzZ4O.zzH("bottomMargin", 3);
        zzZ4O.zzH("insideMargin", 4);
        zzZ4O.zzH("margin", 0);
        zzZ4O.zzH("outsideMargin", 5);
        zzZ4O.zzH("page", 1);
        zzZ4O.zzH("topMargin", 2);
        zzZ4N.zzH(FirebaseAnalytics.Param.CHARACTER, 3);
        zzZ4N.zzH("column", 2);
        zzZ4N.zzH("insideMargin", 6);
        zzZ4N.zzH("leftMargin", 4);
        zzZ4N.zzH("margin", 0);
        zzZ4N.zzH("outsideMargin", 7);
        zzZ4N.zzH("page", 1);
        zzZ4N.zzH("rightMargin", 5);
        zzZ4M.zzH("bottomMargin", 5);
        zzZ4M.zzH("insideMargin", 6);
        zzZ4M.zzH("line", 3);
        zzZ4M.zzH("margin", 0);
        zzZ4M.zzH("outsideMargin", 7);
        zzZ4M.zzH("page", 1);
        zzZ4M.zzH("paragraph", 2);
        zzZ4M.zzH("topMargin", 4);
        zzZ4L.zzH("center", 2);
        zzZ4L.zzH("inside", 4);
        zzZ4L.zzH("left", 1);
        zzZ4L.zzH("outside", 5);
        zzZ4L.zzH("right", 3);
        zzZ6C.zzH("bottom", 3);
        zzZ6C.zzH("center", 2);
        zzZ6C.zzH("inside", 4);
        zzZ6C.zzH("outside", 5);
        zzZ6C.zzH("top", 1);
        zzZ4K.zzH("bothSides", 0);
        zzZ4K.zzH("largest", 3);
        zzZ4K.zzH("left", 1);
        zzZ4K.zzH("right", 2);
        zzZ4J.zzH("accent1", 0);
        zzZ4J.zzH("accent2", 1);
        zzZ4J.zzH("accent3", 2);
        zzZ4J.zzH("accent4", 3);
        zzZ4J.zzH("accent5", 4);
        zzZ4J.zzH("accent6", 5);
        zzZ4J.zzH("bg1", 6);
        zzZ4J.zzH("bg2", 7);
        zzZ4J.zzH("dk1", 8);
        zzZ4J.zzH("dk2", 9);
        zzZ4J.zzH("folHlink", 10);
        zzZ4J.zzH("hlink", 11);
        zzZ4J.zzH("lt1", 12);
        zzZ4J.zzH("lt2", 13);
        zzZ4J.zzH("phClr", 14);
        zzZ4J.zzH("tx1", 15);
        zzZ4J.zzH("tx2", 16);
        zzZ4I.zzH("dash", 6);
        zzZ4I.zzH("dashDot", 8);
        zzZ4I.zzH("dot", 5);
        zzZ4I.zzH("lgDash", 7);
        zzZ4I.zzH("lgDashDot", 9);
        zzZ4I.zzH("lgDashDotDot", 10);
        zzZ4I.zzH("solid", 0);
        zzZ4I.zzH("sysDash", 1);
        zzZ4I.zzH("sysDashDot", 3);
        zzZ4I.zzH("sysDashDotDot", 4);
        zzZ4I.zzH("sysDot", 2);
        zzZ4F.zzH("arrow", 5);
        zzZ4F.zzH("diamond", 3);
        zzZ4F.zzH("none", 0);
        zzZ4F.zzH("oval", 4);
        zzZ4F.zzH("stealth", 2);
        zzZ4F.zzH("triangle", 1);
        zzZ4G.zzH("lg", 2);
        zzZ4G.zzH("med", 1);
        zzZ4G.zzH("sm", 0);
        zzZ4H.zzH("lg", 2);
        zzZ4H.zzH("med", 1);
        zzZ4H.zzH("sm", 0);
        zzZ4E.zzH("none", 0);
        zzZ4E.zzH("x", 1);
        zzZ4E.zzH("y", 2);
        zzZ4E.zzH("xy", 3);
        zzZ4D.zzH("circle", 1);
        zzZ4D.zzH(DrawToolFactory.LASSO_TYPE_RECT, 2);
        zzZ4D.zzH("shape", 0);
        zzZ4C.zzH("flat", 2);
        zzZ4C.zzH("rnd", 0);
        zzZ4C.zzH(TranslateLanguage.ALBANIAN, 1);
        zzZ4B.zzH("sng", 0);
        zzZ4B.zzH("dbl", 1);
        zzZ4B.zzH("thickThin", 2);
        zzZ4B.zzH("thinThick", 3);
        zzZ4B.zzH("tri", 4);
        zzZ4A.zzH("solid", 0);
        zzZ4A.zzH("dot", 5);
        zzZ4A.zzH("dash", 6);
        zzZ4A.zzH("lgDash", 7);
        zzZ4A.zzH("dashDot", 8);
        zzZ4A.zzH("lgDashDot", 9);
        zzZ4A.zzH("lgDashDotDot", 10);
        zzZ4A.zzH("sysDash", 1);
        zzZ4A.zzH("sysDot", 2);
        zzZ4A.zzH("sysDashDot", 3);
        zzZ4A.zzH("sysDashDotDot", 4);
        zzZ4z.zzH("eaVert", 4);
        zzZ4z.zzH("horz", 0);
        zzZ4z.zzH("mongolianVert", 5);
        zzZ4z.zzH("vert", 1);
        zzZ4z.zzH("vert270", 2);
        zzZ4z.zzH("wordArtVert", 3);
        zzZ4z.zzH("wordArtVertRtl", 6);
        zzZ4x.zzH("overflow", 0);
        zzZ4x.zzH("clip", 1);
        zzZ4y.zzH("overflow", 0);
        zzZ4y.zzH("ellipsis", 1);
        zzZ4y.zzH("clip", 2);
        zzZ4w.zzH("b", 2);
        zzZ4w.zzH("ctr", 1);
        zzZ4w.zzH("dist", 4);
        zzZ4w.zzH("just", 3);
        zzZ4w.zzH("t", 0);
        zzZ4v.zzH("none", 2);
        zzZ4v.zzH("square", 0);
        zzZ4u.zzH("ctr", 1);
        zzZ4u.zzH("dist", 4);
        zzZ4u.zzH("just", 3);
        zzZ4u.zzH("justLow", 8);
        zzZ4u.zzH("l", 0);
        zzZ4u.zzH("r", 2);
        zzZ4u.zzH("thaiDist", 9);
        zzZ4t.zzH("auto", 0);
        zzZ4t.zzH("base", 3);
        zzZ4t.zzH("b", 4);
        zzZ4t.zzH("ctr", 2);
        zzZ4t.zzH("t", 1);
        zzZ4s.zzH("all", 2);
        zzZ4s.zzH("none", 0);
        zzZ4s.zzH("small", 1);
        zzZ4r.zzH("dblStrike", 2);
        zzZ4r.zzH("noStrike", 0);
        zzZ4r.zzH("sngStrike", 1);
        zzZ4q.zzH("none", 0);
        zzZ4q.zzH("words", 2);
        zzZ4q.zzH("sng", 1);
        zzZ4q.zzH("dbl", 3);
        zzZ4q.zzH("heavy", 6);
        zzZ4q.zzH("dotted", 4);
        zzZ4q.zzH("dottedHeavy", 20);
        zzZ4q.zzH("dash", 7);
        zzZ4q.zzH("dashHeavy", 23);
        zzZ4q.zzH("dashLong", 39);
        zzZ4q.zzH("dashLongHeavy", 55);
        zzZ4q.zzH("dotDash", 9);
        zzZ4q.zzH("dotDashHeavy", 25);
        zzZ4q.zzH("dotDotDash", 10);
        zzZ4q.zzH("dotDotDashHeavy", 26);
        zzZ4q.zzH("wavy", 11);
        zzZ4q.zzH("wavyHeavy", 27);
        zzZ4q.zzH("wavyDbl", 43);
        zzZ4p.zzH("pct5", 7);
        zzZ4p.zzH("pct10", 1);
        zzZ4p.zzH("pct20", 2);
        zzZ4p.zzH("pct25", 3);
        zzZ4p.zzH("pct30", 4);
        zzZ4p.zzH("pct40", 5);
        zzZ4p.zzH("pct50", 6);
        zzZ4p.zzH("pct60", 8);
        zzZ4p.zzH("pct70", 9);
        zzZ4p.zzH("pct75", 10);
        zzZ4p.zzH("pct80", 11);
        zzZ4p.zzH("pct90", 12);
        zzZ4p.zzH("horz", 28);
        zzZ4p.zzH("vert", 50);
        zzZ4p.zzH("ltHorz", 34);
        zzZ4p.zzH("ltVert", 37);
        zzZ4p.zzH("dkHorz", 15);
        zzZ4p.zzH("dkVert", 17);
        zzZ4p.zzH("narHorz", 38);
        zzZ4p.zzH("narVert", 39);
        zzZ4p.zzH("dashHorz", 19);
        zzZ4p.zzH("dashVert", 21);
        zzZ4p.zzH("cross", 13);
        zzZ4p.zzH("dnDiag", 27);
        zzZ4p.zzH("upDiag", 49);
        zzZ4p.zzH("ltDnDiag", 33);
        zzZ4p.zzH("ltUpDiag", 36);
        zzZ4p.zzH("dkDnDiag", 14);
        zzZ4p.zzH("dkUpDiag", 16);
        zzZ4p.zzH("wdDnDiag", 53);
        zzZ4p.zzH("wdUpDiag", 54);
        zzZ4p.zzH("dashDnDiag", 18);
        zzZ4p.zzH("dashUpDiag", 20);
        zzZ4p.zzH("diagCross", 23);
        zzZ4p.zzH("smCheck", 43);
        zzZ4p.zzH("lgCheck", 30);
        zzZ4p.zzH("smGrid", 45);
        zzZ4p.zzH("lgGrid", 32);
        zzZ4p.zzH("dotGrid", 26);
        zzZ4p.zzH("smConfetti", 44);
        zzZ4p.zzH("lgConfetti", 31);
        zzZ4p.zzH("horzBrick", 29);
        zzZ4p.zzH("diagBrick", 22);
        zzZ4p.zzH("solidDmnd", 46);
        zzZ4p.zzH("openDmnd", 40);
        zzZ4p.zzH("dotDmnd", 25);
        zzZ4p.zzH("plaid", 41);
        zzZ4p.zzH("sphere", 47);
        zzZ4p.zzH("weave", 52);
        zzZ4p.zzH("divot", 24);
        zzZ4p.zzH("shingle", 42);
        zzZ4p.zzH("wave", 51);
        zzZ4p.zzH("trellis", 48);
        zzZ4p.zzH("zigZag", 55);
        zzZ4o.zzH(TranslateLanguage.TAGALOG, 0);
        zzZ4o.zzH("t", 1);
        zzZ4o.zzH(TranslateLanguage.TURKISH, 2);
        zzZ4o.zzH("l", 3);
        zzZ4o.zzH("ctr", 4);
        zzZ4o.zzH("r", 5);
        zzZ4o.zzH("bl", 6);
        zzZ4o.zzH("b", 7);
        zzZ4o.zzH("br", 8);
        zzZ4o.zzH("none", 9);
        zzZ4n.zzH("email", 0);
        zzZ4n.zzH("screen", 1);
        zzZ4n.zzH("print", 2);
        zzZ4n.zzH("hqprint", 3);
        zzZ4n.zzH("none", 4);
        zzZ4m.zzH("darken", 0);
        zzZ4m.zzH("lighten", 1);
        zzZ4m.zzH("mult", 2);
        zzZ4m.zzH("over", 3);
        zzZ4m.zzH("screen", 4);
        zzZ4l.zzH("darken", 0);
        zzZ4l.zzH("darkenLess", 1);
        zzZ4l.zzH("lighten", 2);
        zzZ4l.zzH("lightenLess", 3);
        zzZ4l.zzH("norm", 5);
        zzZ4l.zzH("none", 4);
        zzZ4k.zzH("shdw1", 0);
        zzZ4k.zzH("shdw10", 1);
        zzZ4k.zzH("shdw11", 2);
        zzZ4k.zzH("shdw12", 3);
        zzZ4k.zzH("shdw13", 4);
        zzZ4k.zzH("shdw14", 5);
        zzZ4k.zzH("shdw15", 6);
        zzZ4k.zzH("shdw16", 7);
        zzZ4k.zzH("shdw17", 8);
        zzZ4k.zzH("shdw18", 9);
        zzZ4k.zzH("shdw19", 10);
        zzZ4k.zzH("shdw2", 11);
        zzZ4k.zzH("shdw20", 12);
        zzZ4k.zzH("shdw3", 13);
        zzZ4k.zzH("shdw4", 14);
        zzZ4k.zzH("shdw5", 15);
        zzZ4k.zzH("shdw6", 16);
        zzZ4k.zzH("shdw7", 17);
        zzZ4k.zzH("shdw8", 18);
        zzZ4k.zzH("shdw9", 19);
        zzZ4j.zzH("major", 0);
        zzZ4j.zzH("minor", 1);
        zzZ4j.zzH("none", 2);
        zzZ4i.zzH("textArchDown", 11);
        zzZ4i.zzH("textArchDownPour", 15);
        zzZ4i.zzH("textArchUp", 10);
        zzZ4i.zzH("textArchUpPour", 14);
        zzZ4i.zzH("textButton", 13);
        zzZ4i.zzH("textButtonPour", 17);
        zzZ4i.zzH("textCascadeDown", 21);
        zzZ4i.zzH("textCanUp", 20);
        zzZ4i.zzH("textCanDown", 41);
        zzZ4i.zzH("textCascadeUp", 40);
        zzZ4i.zzH("textChevron", 6);
        zzZ4i.zzH("textChevronInverted", 7);
        zzZ4i.zzH("textCircle", 12);
        zzZ4i.zzH("textCirclePour", 16);
        zzZ4i.zzH("textCurveDown", 19);
        zzZ4i.zzH("textCurveUp", 18);
        zzZ4i.zzH("textDeflate", 27);
        zzZ4i.zzH("textDeflateBottom", 29);
        zzZ4i.zzH("textDeflateInflate", 32);
        zzZ4i.zzH("textDeflateInflateDeflate", 33);
        zzZ4i.zzH("textDeflateTop", 31);
        zzZ4i.zzH("textDoubleWave1", 24);
        zzZ4i.zzH("textFadeDown", 37);
        zzZ4i.zzH("textFadeLeft", 35);
        zzZ4i.zzH("textFadeRight", 34);
        zzZ4i.zzH("textFadeUp", 36);
        zzZ4i.zzH("textInflate", 26);
        zzZ4i.zzH("textInflateBottom", 28);
        zzZ4i.zzH("textInflateTop", 30);
        zzZ4i.zzH("textNoShape", 1);
        zzZ4i.zzH("textPlain", 2);
        zzZ4i.zzH("textRingInside", 8);
        zzZ4i.zzH("textRingOutside", 9);
        zzZ4i.zzH("textSlantDown", 39);
        zzZ4i.zzH("textSlantUp", 38);
        zzZ4i.zzH("textStop", 3);
        zzZ4i.zzH("textTriangle", 4);
        zzZ4i.zzH("textTriangleInverted", 5);
        zzZ4i.zzH("textWave1", 22);
        zzZ4i.zzH("textWave2", 23);
        zzZ4i.zzH("textWave4", 25);
        zzZ4h.zzH("legacyObliqueTopLeft", 0);
        zzZ4h.zzH("legacyObliqueTop", 1);
        zzZ4h.zzH("legacyObliqueTopRight", 2);
        zzZ4h.zzH("legacyObliqueLeft", 3);
        zzZ4h.zzH("legacyObliqueFront", 4);
        zzZ4h.zzH("legacyObliqueRight", 5);
        zzZ4h.zzH("legacyObliqueBottomLeft", 6);
        zzZ4h.zzH("legacyObliqueBottom", 7);
        zzZ4h.zzH("legacyObliqueBottomRight", 8);
        zzZ4h.zzH("legacyPerspectiveTopLeft", 9);
        zzZ4h.zzH("legacyPerspectiveTop", 10);
        zzZ4h.zzH("legacyPerspectiveTopRight", 11);
        zzZ4h.zzH("legacyPerspectiveLeft", 12);
        zzZ4h.zzH("legacyPerspectiveFront", 13);
        zzZ4h.zzH("legacyPerspectiveRight", 14);
        zzZ4h.zzH("legacyPerspectiveBottomLeft", 15);
        zzZ4h.zzH("legacyPerspectiveBottom", 16);
        zzZ4h.zzH("legacyPerspectiveBottomRight", 17);
        zzZ4h.zzH("orthographicFront", 18);
        zzZ4h.zzH("isometricTopUp", 19);
        zzZ4h.zzH("isometricTopDown", 20);
        zzZ4h.zzH("isometricBottomUp", 21);
        zzZ4h.zzH("isometricBottomDown", 22);
        zzZ4h.zzH("isometricLeftUp", 23);
        zzZ4h.zzH("isometricLeftDown", 24);
        zzZ4h.zzH("isometricRightUp", 25);
        zzZ4h.zzH("isometricRightDown", 26);
        zzZ4h.zzH("isometricOffAxis1Left", 27);
        zzZ4h.zzH("isometricOffAxis1Right", 28);
        zzZ4h.zzH("isometricOffAxis1Top", 29);
        zzZ4h.zzH("isometricOffAxis2Left", 30);
        zzZ4h.zzH("isometricOffAxis2Right", 31);
        zzZ4h.zzH("isometricOffAxis2Top", 32);
        zzZ4h.zzH("isometricOffAxis3Left", 33);
        zzZ4h.zzH("isometricOffAxis3Right", 34);
        zzZ4h.zzH("isometricOffAxis3Bottom", 35);
        zzZ4h.zzH("isometricOffAxis4Left", 36);
        zzZ4h.zzH("isometricOffAxis4Right", 37);
        zzZ4h.zzH("isometricOffAxis4Bottom", 38);
        zzZ4h.zzH("obliqueTopLeft", 39);
        zzZ4h.zzH("obliqueTop", 40);
        zzZ4h.zzH("obliqueTopRight", 41);
        zzZ4h.zzH("obliqueLeft", 42);
        zzZ4h.zzH("obliqueRight", 43);
        zzZ4h.zzH("obliqueBottomLeft", 44);
        zzZ4h.zzH("obliqueBottom", 45);
        zzZ4h.zzH("obliqueBottomRight", 46);
        zzZ4h.zzH("perspectiveFront", 47);
        zzZ4h.zzH("perspectiveLeft", 48);
        zzZ4h.zzH("perspectiveRight", 49);
        zzZ4h.zzH("perspectiveAbove", 50);
        zzZ4h.zzH("perspectiveBelow", 51);
        zzZ4h.zzH("perspectiveAboveLeftFacing", 52);
        zzZ4h.zzH("perspectiveAboveRightFacing", 53);
        zzZ4h.zzH("perspectiveContrastingLeftFacing", 54);
        zzZ4h.zzH("perspectiveContrastingRightFacing", 55);
        zzZ4h.zzH("perspectiveHeroicLeftFacing", 56);
        zzZ4h.zzH("perspectiveHeroicRightFacing", 57);
        zzZ4h.zzH("perspectiveHeroicExtremeLeftFacing", 58);
        zzZ4h.zzH("perspectiveHeroicExtremeRightFacing", 59);
        zzZ4h.zzH("perspectiveRelaxed", 60);
        zzZ4h.zzH("perspectiveRelaxedModerately", 61);
        zzZ4g.zzH(TranslateLanguage.TAGALOG, 0);
        zzZ4g.zzH("t", 1);
        zzZ4g.zzH(TranslateLanguage.TURKISH, 2);
        zzZ4g.zzH("l", 3);
        zzZ4g.zzH("r", 4);
        zzZ4g.zzH("bl", 5);
        zzZ4g.zzH("b", 6);
        zzZ4g.zzH("br", 7);
        zzZ4f.zzH("legacyFlat1", 0);
        zzZ4f.zzH("legacyFlat2", 1);
        zzZ4f.zzH("legacyFlat3", 2);
        zzZ4f.zzH("legacyFlat4", 3);
        zzZ4f.zzH("legacyNormal1", 4);
        zzZ4f.zzH("legacyNormal2", 5);
        zzZ4f.zzH("legacyNormal3", 6);
        zzZ4f.zzH("legacyNormal4", 7);
        zzZ4f.zzH("legacyHarsh1", 8);
        zzZ4f.zzH("legacyHarsh2", 9);
        zzZ4f.zzH("legacyHarsh3", 10);
        zzZ4f.zzH("legacyHarsh4", 11);
        zzZ4f.zzH("threePt", 12);
        zzZ4f.zzH("balanced", 13);
        zzZ4f.zzH("soft", 14);
        zzZ4f.zzH("harsh", 15);
        zzZ4f.zzH("flood", 16);
        zzZ4f.zzH("contrasting", 17);
        zzZ4f.zzH("morning", 18);
        zzZ4f.zzH("sunrise", 19);
        zzZ4f.zzH("sunset", 20);
        zzZ4f.zzH("chilly", 21);
        zzZ4f.zzH("freezing", 22);
        zzZ4f.zzH("flat", 23);
        zzZ4f.zzH("twoPt", 24);
        zzZ4f.zzH("glow", 25);
        zzZ4f.zzH("brightRoom", 26);
        zzZ4e.zzH("legacyMatte", 0);
        zzZ4e.zzH("legacyPlastic", 1);
        zzZ4e.zzH("legacyMetal", 2);
        zzZ4e.zzH("legacyWireframe", 3);
        zzZ4e.zzH("matte", 4);
        zzZ4e.zzH("plastic", 5);
        zzZ4e.zzH("metal", 6);
        zzZ4e.zzH("warmMatte", 7);
        zzZ4e.zzH("translucentPowder", 8);
        zzZ4e.zzH("powder", 9);
        zzZ4e.zzH("dkEdge", 10);
        zzZ4e.zzH("softEdge", 11);
        zzZ4e.zzH("clear", 12);
        zzZ4e.zzH("flat", 13);
        zzZ4e.zzH("softmetal", 14);
        zzZ4d.zzH("relaxedInset", 0);
        zzZ4d.zzH("circle", 1);
        zzZ4d.zzH("slope", 2);
        zzZ4d.zzH("cross", 3);
        zzZ4d.zzH("angle", 4);
        zzZ4d.zzH("softRound", 5);
        zzZ4d.zzH("convex", 6);
        zzZ4d.zzH("coolSlant", 7);
        zzZ4d.zzH("divot", 8);
        zzZ4d.zzH("riblet", 9);
        zzZ4d.zzH("hardEdge", 10);
        zzZ4d.zzH("artDeco", 11);
        zzZ4c.zzH("alphaLcParenBoth", 3);
        zzZ4c.zzH("alphaUcParenBoth", 4);
        zzZ4c.zzH("alphaLcParenR", 5);
        zzZ4c.zzH("alphaUcParenR", 6);
        zzZ4c.zzH("alphaLcPeriod", 7);
        zzZ4c.zzH("alphaUcPeriod", 8);
        zzZ4c.zzH("arabicParenBoth", 9);
        zzZ4c.zzH("arabicParenR", 10);
        zzZ4c.zzH("arabicPeriod", 11);
        zzZ4c.zzH("arabicPlain", 12);
        zzZ4c.zzH("romanLcParenBoth", 13);
        zzZ4c.zzH("romanUcParenBoth", 14);
        zzZ4c.zzH("romanLcParenR", 15);
        zzZ4c.zzH("romanUcParenR", 16);
        zzZ4c.zzH("romanLcPeriod", 17);
        zzZ4c.zzH("romanUcPeriod", 18);
        zzZ4c.zzH("circleNumDbPlain", 19);
        zzZ4c.zzH("circleNumWdBlackPlain", 20);
        zzZ4c.zzH("circleNumWdWhitePlain", 21);
        zzZ4c.zzH("arabicDbPeriod", 22);
        zzZ4c.zzH("arabicDbPlain", 23);
        zzZ4c.zzH("ea1ChsPeriod", 24);
        zzZ4c.zzH("ea1ChsPlain", 25);
        zzZ4c.zzH("ea1ChtPeriod", 26);
        zzZ4c.zzH("ea1ChtPlain", 27);
        zzZ4c.zzH("ea1JpnChsDbPeriod", 28);
        zzZ4c.zzH("ea1JpnKorPlain", 29);
        zzZ4c.zzH("ea1JpnKorPeriod", 30);
        zzZ4c.zzH("arabic1Minus", 31);
        zzZ4c.zzH("arabic2Minus", 32);
        zzZ4c.zzH("hebrew2Minus", 33);
        zzZ4c.zzH("thaiAlphaPeriod", 34);
        zzZ4c.zzH("thaiAlphaParenR", 35);
        zzZ4c.zzH("thaiAlphaParenBoth", 36);
        zzZ4c.zzH("thaiNumPeriod", 37);
        zzZ4c.zzH("thaiNumParenR", 38);
        zzZ4c.zzH("thaiNumParenBoth", 39);
        zzZ4c.zzH("hindiAlphaPeriod", 40);
        zzZ4c.zzH("hindiNumPeriod", 41);
        zzZ4c.zzH("hindiNumParenR", 42);
        zzZ4c.zzH("hindiAlpha1Period", 43);
        zzZ4b.zzH("ctr", 1);
        zzZ4b.zzH("dec", 3);
        zzZ4b.zzH("l", 0);
        zzZ4b.zzH("r", 2);
        zzZ4T.add("accentBorderCallout1", 50);
        zzZ4T.add("accentBorderCallout2", 51);
        zzZ4T.add("accentBorderCallout3", 52);
        zzZ4a.zzH("sib", 0);
        zzZ4a.zzH(BackupFile.EXTENSION_FOLDER_TREE_FILE, 1);
        zzZ4T.add("accentCallout1", 44);
        zzZ4T.add("accentCallout2", 45);
        zzZ4T.add("accentCallout3", 46);
        zzZ4T.add("actionButtonBackPrevious", 194);
        zzZ4T.add("actionButtonBeginning", 196);
        zzZ4T.add("actionButtonBlank", 189);
        zzZ4T.add("actionButtonDocument", 198);
        zzZ4T.add("actionButtonEnd", 195);
        zzZ4T.add("actionButtonForwardNext", 193);
        zzZ4T.add("actionButtonHelp", 191);
        zzZ4T.add("actionButtonHome", 190);
        zzZ4T.add("actionButtonInformation", 192);
        zzZ4T.add("actionButtonMovie", 200);
        zzZ4T.add("actionButtonReturn", 197);
        zzZ4T.add("actionButtonSound", 199);
        zzZ4T.add("bentConnector2", 33);
        zzZ4T.add("bentConnector3", 34);
        zzZ4T.add("bentConnector4", 35);
        zzZ4T.add("bentConnector5", 36);
        zzZ4T.add("bevel", 84);
        zzZ4T.add("borderCallout1", 47);
        zzZ4T.add("borderCallout2", 48);
        zzZ4T.add("borderCallout3", 49);
        zzZ4T.add("bracePair", 186);
        zzZ4T.add("bracketPair", 185);
        zzZ4T.add("callout1", 41);
        zzZ4T.add("callout2", 42);
        zzZ4T.add("callout3", 43);
        zzZ4T.add("can", 22);
        zzZ4T.add("chevron", 55);
        zzZ4T.add("cloudCallout", 106);
        zzZ4T.add("cube", 16);
        zzZ4T.add("curvedConnector2", 37);
        zzZ4T.add("curvedConnector3", 38);
        zzZ4T.add("curvedConnector4", 39);
        zzZ4T.add("curvedConnector5", 40);
        zzZ4T.add("curvedDownArrow", 105);
        zzZ4T.add("curvedLeftArrow", 103);
        zzZ4T.add("curvedRightArrow", 102);
        zzZ4T.add("curvedUpArrow", 104);
        zzZ4T.add("diamond", 4);
        zzZ4T.add("donut", 23);
        zzZ4T.add("doubleWave", 188);
        zzZ4T.add("downArrow", 67);
        zzZ4T.add("downArrowCallout", 80);
        zzZ4T.add("ellipse", 3);
        zzZ4T.add("ellipseRibbon", 107);
        zzZ4T.add("ellipseRibbon2", 108);
        zzZ4T.add("flowChartAlternateProcess", 176);
        zzZ4T.add("flowChartCollate", 125);
        zzZ4T.add("flowChartConnector", 120);
        zzZ4T.add("flowChartDecision", 110);
        zzZ4T.add("flowChartDelay", 135);
        zzZ4T.add("flowChartDisplay", 134);
        zzZ4T.add("flowChartDocument", 114);
        zzZ4T.add("flowChartExtract", 127);
        zzZ4T.add("flowChartInputOutput", 111);
        zzZ4T.add("flowChartInternalStorage", 113);
        zzZ4T.add("flowChartMagneticDisk", 132);
        zzZ4T.add("flowChartMagneticDrum", 133);
        zzZ4T.add("flowChartMagneticTape", 131);
        zzZ4T.add("flowChartManualInput", 118);
        zzZ4T.add("flowChartManualOperation", 119);
        zzZ4T.add("flowChartMerge", 128);
        zzZ4T.add("flowChartMultidocument", 115);
        zzZ4T.add("flowChartOfflineStorage", 129);
        zzZ4T.add("flowChartOffpageConnector", 177);
        zzZ4T.add("flowChartOnlineStorage", 130);
        zzZ4T.add("flowChartOr", 124);
        zzZ4T.add("flowChartPredefinedProcess", 112);
        zzZ4T.add("flowChartPreparation", 117);
        zzZ4T.add("flowChartProcess", 109);
        zzZ4T.add("flowChartPunchedCard", 121);
        zzZ4T.add("flowChartPunchedTape", 122);
        zzZ4T.add("flowChartSort", 126);
        zzZ4T.add("flowChartSummingJunction", 123);
        zzZ4T.add("flowChartTerminator", 116);
        zzZ4T.add("foldedCorner", 65);
        zzZ4T.add("hexagon", 9);
        zzZ4T.add("homePlate", 15);
        zzZ4T.add("horizontalScroll", 98);
        zzZ4T.add("irregularSeal1", 71);
        zzZ4T.add("irregularSeal2", 72);
        zzZ4T.add("leftArrow", 66);
        zzZ4T.add("leftArrowCallout", 77);
        zzZ4T.add("leftBrace", 87);
        zzZ4T.add("leftBracket", 85);
        zzZ4T.add("leftRightArrow", 69);
        zzZ4T.add("leftRightArrowCallout", 81);
        zzZ4T.add("lightningBolt", 73);
        zzZ4T.add("line", 20);
        zzZ4T.add("moon", 184);
        zzZ4T.add("noSmoking", 57);
        zzZ4T.add("notchedRightArrow", 94);
        zzZ4T.add("octagon", 10);
        zzZ4T.add("parallelogram", 7);
        zzZ4T.add("pentagon", 56);
        zzZ4T.add("plaque", 21);
        zzZ4T.add("plus", 11);
        zzZ4T.add(DrawToolFactory.LASSO_TYPE_RECT, 1);
        zzZ4T.add("ribbon", 53);
        zzZ4T.add("ribbon2", 54);
        zzZ4T.add("rightArrow", 13);
        zzZ4T.add("rightArrowCallout", 78);
        zzZ4T.add("rightBrace", 88);
        zzZ4T.add("rightBracket", 86);
        zzZ4T.add("smileyFace", 96);
        zzZ4T.add("star16", 59);
        zzZ4T.add("star32", 60);
        zzZ4T.add("star4", 187);
        zzZ4T.add("star8", 58);
        zzZ4T.add("straightConnector1", 32);
        zzZ4T.add("stripedRightArrow", 93);
        zzZ4T.add(LocalePreferences.FirstDayOfWeek.SUNDAY, 183);
        zzZ4T.add("triangle", 5);
        zzZ4T.add("upArrow", 68);
        zzZ4T.add("upArrowCallout", 79);
        zzZ4T.add("upDownArrow", 70);
        zzZ4T.add("upDownArrowCallout", 82);
        zzZ4T.add("verticalScroll", 97);
        zzZ4T.add("wave", 64);
        zzZ4T.add("wedgeEllipseCallout", 63);
        zzZ4T.add("wedgeRectCallout", 61);
        zzZ4T.add("wedgeRoundRectCallout", 62);
        zzZ4T.add("roundRect", 2);
        zzZ4T.add("rtTriangle", 6);
        zzZ4T.add("quadArrowCallout", 83);
        zzZ4T.add("quadArrow", 76);
        zzZ4T.add("leftUpArrow", 89);
        zzZ4T.add("bentArrow", 91);
        zzZ4T.add("bentUpArrow", 90);
        zzZ4T.add("star5", 12);
        zzZ4T.add("uturnArrow", 101);
        zzZ4T.add("trapezoid", 8);
        zzZ4T.add("leftRightUpArrow", 182);
        zzZ4T.add("heart", 74);
        zzZ4T.add("circularArrow", 99);
        zzZ4T.add("blockArc", 95);
        zzZ4T.add("arc", 19);
        zzZ4T.add("heptagon", 210);
        zzZ4T.add("cloud", 211);
        zzZ4T.add("star6", 212);
        zzZ4T.add("star7", 213);
        zzZ4T.add("star10", 214);
        zzZ4T.add("star12", 215);
        zzZ4T.add("star24", 92);
        zzZ4T.add("swooshArrow", 216);
        zzZ4T.add("teardrop", 217);
        zzZ4T.add("squareTabs", 218);
        zzZ4T.add("plaqueTabs", 219);
        zzZ4T.add("pie", 220);
        zzZ4T.add("pieWedge", 221);
        zzZ4T.add("lineInv", 222);
        zzZ4T.add("mathDivide", 226);
        zzZ4T.add("mathEqual", 227);
        zzZ4T.add("mathMinus", 224);
        zzZ4T.add("mathMultiply", 225);
        zzZ4T.add("mathNotEqual", 228);
        zzZ4T.add("mathPlus", 223);
        zzZ4T.add("nonIsoscelesTrapezoid", 229);
        zzZ4T.add("leftRightCircularArrow", 230);
        zzZ4T.add("leftRightRibbon", 231);
        zzZ4T.add("leftCircularArrow", 232);
        zzZ4T.add("frame", 233);
        zzZ4T.add("funnel", 235);
        zzZ4T.add("gear6", 236);
        zzZ4T.add("gear9", 237);
        zzZ4T.add("halfFrame", 234);
        zzZ4T.add("decagon", 238);
        zzZ4T.add("diagStripe", 240);
        zzZ4T.add("dodecagon", 239);
        zzZ4T.add("corner", 241);
        zzZ4T.add("cornerTabs", 242);
        zzZ4T.add("chord", 243);
        zzZ4T.add("chartPlus", 244);
        zzZ4T.add("chartStar", 245);
        zzZ4T.add("chartX", 246);
        zzZ4T.add("snip1Rect", 203);
        zzZ4T.add("snip2DiagRect", 205);
        zzZ4T.add("snip2SameRect", 204);
        zzZ4T.add("snipRoundRect", 206);
        zzZ4T.add("round1Rect", 207);
        zzZ4T.add("round2DiagRect", 209);
        zzZ4T.add("round2SameRect", 208);
        zzZ4U.add(50, "accentBorderCallout1");
        zzZ4U.add(51, "accentBorderCallout2");
        zzZ4U.add(52, "accentBorderCallout3");
        zzZ4U.add(44, "accentCallout1");
        zzZ4U.add(45, "accentCallout2");
        zzZ4U.add(46, "accentCallout3");
        zzZ4U.add(194, "actionButtonBackPrevious");
        zzZ4U.add(196, "actionButtonBeginning");
        zzZ4U.add(189, "actionButtonBlank");
        zzZ4U.add(198, "actionButtonDocument");
        zzZ4U.add(195, "actionButtonEnd");
        zzZ4U.add(193, "actionButtonForwardNext");
        zzZ4U.add(191, "actionButtonHelp");
        zzZ4U.add(190, "actionButtonHome");
        zzZ4U.add(192, "actionButtonInformation");
        zzZ4U.add(200, "actionButtonMovie");
        zzZ4U.add(197, "actionButtonReturn");
        zzZ4U.add(199, "actionButtonSound");
        zzZ4U.add(19, "arc");
        zzZ4U.add(14, "rightArrow");
        zzZ4U.add(13, "rightArrow");
        zzZ4U.add(91, "bentArrow");
        zzZ4U.add(33, "bentConnector2");
        zzZ4U.add(34, "bentConnector3");
        zzZ4U.add(35, "bentConnector4");
        zzZ4U.add(36, "bentConnector5");
        zzZ4U.add(90, "bentUpArrow");
        zzZ4U.add(84, "bevel");
        zzZ4U.add(95, "blockArc");
        zzZ4U.add(47, "borderCallout1");
        zzZ4U.add(180, "borderCallout1");
        zzZ4U.add(181, "borderCallout1");
        zzZ4U.add(48, "borderCallout2");
        zzZ4U.add(49, "borderCallout3");
        zzZ4U.add(186, "bracePair");
        zzZ4U.add(185, "bracketPair");
        zzZ4U.add(41, "callout1");
        zzZ4U.add(178, "callout1");
        zzZ4U.add(179, "callout1");
        zzZ4U.add(42, "callout2");
        zzZ4U.add(43, "callout3");
        zzZ4U.add(22, "can");
        zzZ4U.add(55, "chevron");
        zzZ4U.add(99, "circularArrow");
        zzZ4U.add(106, "cloudCallout");
        zzZ4U.add(16, "cube");
        zzZ4U.add(37, "curvedConnector2");
        zzZ4U.add(38, "curvedConnector3");
        zzZ4U.add(39, "curvedConnector4");
        zzZ4U.add(40, "curvedConnector5");
        zzZ4U.add(105, "curvedDownArrow");
        zzZ4U.add(103, "curvedLeftArrow");
        zzZ4U.add(102, "curvedRightArrow");
        zzZ4U.add(104, "curvedUpArrow");
        zzZ4U.add(4, "diamond");
        zzZ4U.add(23, "donut");
        zzZ4U.add(188, "doubleWave");
        zzZ4U.add(67, "downArrow");
        zzZ4U.add(80, "downArrowCallout");
        zzZ4U.add(3, "ellipse");
        zzZ4U.add(107, "ellipseRibbon");
        zzZ4U.add(108, "ellipseRibbon2");
        zzZ4U.add(176, "flowChartAlternateProcess");
        zzZ4U.add(125, "flowChartCollate");
        zzZ4U.add(120, "flowChartConnector");
        zzZ4U.add(110, "flowChartDecision");
        zzZ4U.add(135, "flowChartDelay");
        zzZ4U.add(134, "flowChartDisplay");
        zzZ4U.add(114, "flowChartDocument");
        zzZ4U.add(127, "flowChartExtract");
        zzZ4U.add(111, "flowChartInputOutput");
        zzZ4U.add(113, "flowChartInternalStorage");
        zzZ4U.add(132, "flowChartMagneticDisk");
        zzZ4U.add(133, "flowChartMagneticDrum");
        zzZ4U.add(131, "flowChartMagneticTape");
        zzZ4U.add(118, "flowChartManualInput");
        zzZ4U.add(119, "flowChartManualOperation");
        zzZ4U.add(128, "flowChartMerge");
        zzZ4U.add(115, "flowChartMultidocument");
        zzZ4U.add(129, "flowChartOfflineStorage");
        zzZ4U.add(177, "flowChartOffpageConnector");
        zzZ4U.add(130, "flowChartOnlineStorage");
        zzZ4U.add(124, "flowChartOr");
        zzZ4U.add(112, "flowChartPredefinedProcess");
        zzZ4U.add(117, "flowChartPreparation");
        zzZ4U.add(109, "flowChartProcess");
        zzZ4U.add(121, "flowChartPunchedCard");
        zzZ4U.add(122, "flowChartPunchedTape");
        zzZ4U.add(126, "flowChartSort");
        zzZ4U.add(123, "flowChartSummingJunction");
        zzZ4U.add(116, "flowChartTerminator");
        zzZ4U.add(65, "foldedCorner");
        zzZ4U.add(74, "heart");
        zzZ4U.add(9, "hexagon");
        zzZ4U.add(15, "homePlate");
        zzZ4U.add(98, "horizontalScroll");
        zzZ4U.add(71, "irregularSeal1");
        zzZ4U.add(72, "irregularSeal2");
        zzZ4U.add(66, "leftArrow");
        zzZ4U.add(77, "leftArrowCallout");
        zzZ4U.add(87, "leftBrace");
        zzZ4U.add(85, "leftBracket");
        zzZ4U.add(69, "leftRightArrow");
        zzZ4U.add(81, "leftRightArrowCallout");
        zzZ4U.add(182, "leftRightUpArrow");
        zzZ4U.add(89, "leftUpArrow");
        zzZ4U.add(73, "lightningBolt");
        zzZ4U.add(20, "line");
        zzZ4U.add(184, "moon");
        zzZ4U.add(57, "noSmoking");
        zzZ4U.add(94, "notchedRightArrow");
        zzZ4U.add(10, "octagon");
        zzZ4U.add(7, "parallelogram");
        zzZ4U.add(56, "pentagon");
        zzZ4U.add(21, "plaque");
        zzZ4U.add(11, "plus");
        zzZ4U.add(76, "quadArrow");
        zzZ4U.add(83, "quadArrowCallout");
        zzZ4U.add(1, DrawToolFactory.LASSO_TYPE_RECT);
        zzZ4U.add(53, "ribbon");
        zzZ4U.add(54, "ribbon2");
        zzZ4U.add(78, "rightArrowCallout");
        zzZ4U.add(88, "rightBrace");
        zzZ4U.add(86, "rightBracket");
        zzZ4U.add(2, "roundRect");
        zzZ4U.add(6, "rtTriangle");
        zzZ4U.add(96, "smileyFace");
        zzZ4U.add(12, "star5");
        zzZ4U.add(32, "straightConnector1");
        zzZ4U.add(93, "stripedRightArrow");
        zzZ4U.add(183, LocalePreferences.FirstDayOfWeek.SUNDAY);
        zzZ4U.add(18, "star16");
        zzZ4U.add(187, "star4");
        zzZ4U.add(58, "star8");
        zzZ4U.add(59, "star16");
        zzZ4U.add(92, "star24");
        zzZ4U.add(60, "star32");
        zzZ4U.add(8, "trapezoid");
        zzZ4U.add(5, "triangle");
        zzZ4U.add(68, "upArrow");
        zzZ4U.add(79, "upArrowCallout");
        zzZ4U.add(70, "upDownArrow");
        zzZ4U.add(82, "upDownArrowCallout");
        zzZ4U.add(101, "uturnArrow");
        zzZ4U.add(97, "verticalScroll");
        zzZ4U.add(64, "wave");
        zzZ4U.add(63, "wedgeEllipseCallout");
        zzZ4U.add(61, "wedgeRectCallout");
        zzZ4U.add(62, "wedgeRoundRectCallout");
        zzZ4U.add(17, "wedgeRoundRectCallout");
        zzZ4U.add(210, "heptagon");
        zzZ4U.add(211, "cloud");
        zzZ4U.add(212, "star6");
        zzZ4U.add(213, "star7");
        zzZ4U.add(214, "star10");
        zzZ4U.add(215, "star12");
        zzZ4U.add(216, "swooshArrow");
        zzZ4U.add(217, "teardrop");
        zzZ4U.add(218, "squareTabs");
        zzZ4U.add(219, "plaqueTabs");
        zzZ4U.add(220, "pie");
        zzZ4U.add(221, "pieWedge");
        zzZ4U.add(222, "lineInv");
        zzZ4U.add(226, "mathDivide");
        zzZ4U.add(227, "mathEqual");
        zzZ4U.add(224, "mathMinus");
        zzZ4U.add(225, "mathMultiply");
        zzZ4U.add(228, "mathNotEqual");
        zzZ4U.add(223, "mathPlus");
        zzZ4U.add(229, "nonIsoscelesTrapezoid");
        zzZ4U.add(230, "leftRightCircularArrow");
        zzZ4U.add(231, "leftRightRibbon");
        zzZ4U.add(232, "leftCircularArrow");
        zzZ4U.add(233, "frame");
        zzZ4U.add(235, "funnel");
        zzZ4U.add(236, "gear6");
        zzZ4U.add(237, "gear9");
        zzZ4U.add(234, "halfFrame");
        zzZ4U.add(238, "decagon");
        zzZ4U.add(240, "diagStripe");
        zzZ4U.add(239, "dodecagon");
        zzZ4U.add(241, "corner");
        zzZ4U.add(242, "cornerTabs");
        zzZ4U.add(243, "chord");
        zzZ4U.add(244, "chartPlus");
        zzZ4U.add(245, "chartStar");
        zzZ4U.add(246, "chartX");
        zzZ4U.add(203, "snip1Rect");
        zzZ4U.add(204, "snip2SameRect");
        zzZ4U.add(205, "snip2DiagRect");
        zzZ4U.add(206, "snipRoundRect");
        zzZ4U.add(207, "round1Rect");
        zzZ4U.add(208, "round2SameRect");
        zzZ4U.add(209, "round2DiagRect");
        zzZ4V.add(24, 2);
        zzZ4V.add(25, 3);
        zzZ4V.add(26, 4);
        zzZ4V.add(27, 41);
        zzZ4V.add(28, 22);
        zzZ4V.add(29, 14);
        zzZ4V.add(30, 41);
        zzZ4V.add(31, 10);
        zzZ4V.add(136, 2);
        zzZ4V.add(137, 3);
        zzZ4V.add(138, 4);
        zzZ4V.add(139, 5);
        zzZ4V.add(140, 6);
        zzZ4V.add(141, 7);
        zzZ4V.add(142, 8);
        zzZ4V.add(143, 9);
        zzZ4V.add(144, 10);
        zzZ4V.add(145, 11);
        zzZ4V.add(146, 12);
        zzZ4V.add(147, 13);
        zzZ4V.add(148, 14);
        zzZ4V.add(149, 15);
        zzZ4V.add(150, 16);
        zzZ4V.add(151, 17);
        zzZ4V.add(152, 18);
        zzZ4V.add(153, 19);
        zzZ4V.add(154, 40);
        zzZ4V.add(155, 21);
        zzZ4V.add(156, 22);
        zzZ4V.add(157, 23);
        zzZ4V.add(158, 24);
        zzZ4V.add(159, 25);
        zzZ4V.add(160, 26);
        zzZ4V.add(161, 27);
        zzZ4V.add(162, 28);
        zzZ4V.add(163, 29);
        zzZ4V.add(164, 30);
        zzZ4V.add(165, 31);
        zzZ4V.add(166, 32);
        zzZ4V.add(167, 33);
        zzZ4V.add(168, 34);
        zzZ4V.add(169, 35);
        zzZ4V.add(170, 36);
        zzZ4V.add(171, 37);
        zzZ4V.add(172, 38);
        zzZ4V.add(173, 39);
        zzZ4V.add(174, 20);
        zzZ4V.add(175, 41);
    }

    public static String zzIA(int i) {
        return zzZ4s.zzO(i, "");
    }

    public static String zzIB(int i) {
        return zzZ4t.zzO(i, "");
    }

    public static int zzIC(int i) {
        if (i == 5 || i == 7) {
            return 3;
        }
        return i;
    }

    public static boolean zzID(int i) {
        return zzIC(i) != i;
    }

    public static String zzIE(int i) {
        return zzZ4u.zzO(zzIC(i), "");
    }

    public static String zzIF(int i) {
        return zzZ4v.zzO(i, "");
    }

    public static String zzIG(int i) {
        return zzZ4w.zzO(i, "");
    }

    public static String zzIH(int i) {
        return zzZ4y.zzO(i, "");
    }

    public static String zzII(int i) {
        return zzZ4x.zzO(i, "");
    }

    public static String zzIJ(int i) {
        return zzZ4z.zzO(i, "");
    }

    public static String zzIK(int i) {
        return zzZ4A.zzO(i, "");
    }

    public static String zzIL(int i) {
        return zzZ4B.zzO(i, "");
    }

    public static String zzIM(int i) {
        return zzZ4C.zzO(i, "");
    }

    public static String zzIN(int i) {
        return zzZ4D.zzO(i, "");
    }

    public static String zzIO(int i) {
        return zzZ4E.zzO(i, "");
    }

    public static String zzIP(int i) {
        return zzZ4F.zzO(i, "");
    }

    public static String zzIQ(int i) {
        return zzZ4G.zzO(i, "");
    }

    public static String zzIR(int i) {
        return zzZ4H.zzO(i, "");
    }

    public static String zzIS(int i) {
        return zzZ4K.zzO(i, "");
    }

    public static String zzIT(int i) {
        return zzZ4S.zzO(i, "");
    }

    public static boolean zzIf(int i) {
        if (i != 8 && i != 12 && i != 19 && i != 74 && i != 76 && i != 83 && i != 95 && i != 99 && i != 101 && i != 182) {
            switch (i) {
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    if (!zzIg(i)) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }

    public static boolean zzIg(int i) {
        if (i == -2 || i == 0 || i == 100 || i == 201) {
            return false;
        }
        switch (i) {
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
                return false;
            default:
                return true;
        }
    }

    public static String zzIh(int i) {
        return zzZ4a.zzO(i, "sib");
    }

    public static String zzIi(int i) {
        return !zzZ4U.zzVE(i) ? DrawToolFactory.LASSO_TYPE_RECT : zzZ4U.get(i);
    }

    public static String zzIj(int i) {
        return zzZ4b.zzO(i, "");
    }

    public static String zzIk(int i) {
        return zzZ4c.zzO(i, "");
    }

    public static String zzIl(int i) {
        return zzZ4d.zzO(i, "");
    }

    public static String zzIm(int i) {
        return zzZ4e.zzO(i, "");
    }

    public static String zzIn(int i) {
        return zzZ4g.zzO(i, "");
    }

    public static String zzIo(int i) {
        return zzZ4f.zzO(i, "");
    }

    public static String zzIp(int i) {
        return zzZ4h.zzO(i, "");
    }

    public static String zzIq(int i) {
        return zzZ4i.zzO(i, "");
    }

    public static String zzIr(int i) {
        return zzZ4j.zzO(i, "");
    }

    public static String zzIs(int i) {
        return zzZ4k.zzO(i, "");
    }

    public static String zzIt(int i) {
        return zzZ4l.zzO(i, "");
    }

    public static String zzIu(int i) {
        return zzZ4m.zzO(i, "");
    }

    public static String zzIv(int i) {
        return zzZ4n.zzO(i, "");
    }

    public static String zzIw(int i) {
        return zzZ4o.zzO(i, "");
    }

    public static String zzIx(int i) {
        return zzZ4p.zzO(i, "");
    }

    public static String zzIy(int i) {
        return zzZ4q.zzO(i, "");
    }

    public static String zzIz(int i) {
        return zzZ4r.zzO(i, "");
    }

    public static int zzOK(String str) {
        return zzZ4a.zzG(str, 0);
    }

    public static int zzOL(String str) {
        if (zzZ4T.containsKey(str)) {
            return zzZ4T.get(str);
        }
        return 100;
    }

    public static int zzOM(String str) {
        return zzZ4c.zzG(str, 11);
    }

    public static int zzON(String str) {
        return zzZ4d.zzG(str, 1);
    }

    public static int zzOO(String str) {
        return zzZ4e.zzG(str, 7);
    }

    public static int zzOP(String str) {
        return zzZ4g.zzG(str, 1);
    }

    public static int zzOQ(String str) {
        return zzZ4f.zzG(str, 13);
    }

    public static int zzOR(String str) {
        return zzZ4h.zzG(str, 18);
    }

    public static int zzOS(String str) {
        return zzZ4i.zzG(str, 1);
    }

    public static int zzOT(String str) {
        return zzZ4j.zzG(str, 0);
    }

    public static int zzOU(String str) {
        return zzZ4k.zzG(str, 0);
    }

    public static int zzOV(String str) {
        return zzZ4l.zzG(str, 5);
    }

    public static int zzOW(String str) {
        return zzZ4m.zzG(str, 3);
    }

    public static int zzOX(String str) {
        return zzZ4n.zzG(str, 0);
    }

    public static int zzOY(String str) {
        return zzZ4o.zzG(str, 0);
    }

    public static int zzOZ(String str) {
        return zzZ4p.zzG(str, 0);
    }

    public static int zzP0(String str) {
        return zzZ4q.zzG(str, 0);
    }

    public static int zzP1(String str) {
        return zzZ4r.zzG(str, 0);
    }

    public static int zzP2(String str) {
        return zzZ4s.zzG(str, 0);
    }

    public static int zzP3(String str) {
        return zzZ4t.zzG(str, 3);
    }

    public static int zzP4(String str) {
        return zzZ4u.zzG(str, 0);
    }

    public static int zzP5(String str) {
        return zzZ4v.zzG(str, 0);
    }

    public static int zzP6(String str) {
        return zzZ4w.zzG(str, 0);
    }

    public static int zzP7(String str) {
        return zzZ4y.zzG(str, 0);
    }

    public static int zzP8(String str) {
        return zzZ4x.zzG(str, 0);
    }

    public static int zzP9(String str) {
        return zzZ4z.zzG(str, 0);
    }

    public static int zzPX(String str) {
        return zzZ6C.zzG(str, 0);
    }

    public static int zzPa(String str) {
        return zzZ4A.zzXp(str);
    }

    public static int zzPb(String str) {
        return zzZ4B.zzG(str, 0);
    }

    public static int zzPc(String str) {
        return zzZ4C.zzG(str, 2);
    }

    public static int zzPd(String str) {
        return zzZ4D.zzG(str, 0);
    }

    public static int zzPe(String str) {
        return zzZ4E.zzG(str, 0);
    }

    public static int zzPf(String str) {
        return zzZ4F.zzG(str, 0);
    }

    public static int zzPg(String str) {
        return zzZ4G.zzG(str, 1);
    }

    public static int zzPh(String str) {
        return zzZ4H.zzG(str, 1);
    }

    public static int zzPi(String str) {
        return zzZ4K.zzG(str, 0);
    }

    public static int zzPj(String str) {
        return zzZ4L.zzG(str, 0);
    }

    public static int zzPk(String str) {
        return zzZ4O.zzG(str, 1);
    }

    public static int zzPl(String str) {
        return zzZ4P.zzG(str, 1);
    }

    public static int zzPm(String str) {
        return zzZ4M.zzG(str, 2);
    }

    public static int zzPn(String str) {
        return zzZ4N.zzG(str, 2);
    }

    public static int zzPo(String str) {
        return zzZ4S.zzG(str, 1);
    }

    public static String zzZD(Object obj) {
        return zzZ6C.getValue(obj != null ? ((Integer) obj).intValue() : 0);
    }

    public static String zzZE(Object obj) {
        return zzZ4L.getValue(obj != null ? ((Integer) obj).intValue() : 0);
    }

    public static String zzZF(Object obj) {
        return zzZ4O.getValue(obj != null ? ((Integer) obj).intValue() : 1);
    }

    public static String zzZG(Object obj) {
        return zzZ4P.getValue(obj != null ? ((Integer) obj).intValue() : 1);
    }

    public static String zzZH(Object obj) {
        return zzZ4M.getValue(obj != null ? ((Integer) obj).intValue() : 2);
    }

    public static String zzZI(Object obj) {
        return zzZ4N.getValue(obj != null ? ((Integer) obj).intValue() : 2);
    }
}
