package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzK6 {
    private static HashMap<String, String> zzZjw = new HashMap<>();

    static {
        zzZTp();
    }

    public static String getTitle() {
        String str = (String) com.aspose.words.internal.zzQW.zzZ(zzZjw, com.aspose.words.internal.zzZXR.zzq0());
        return str != null ? str : "Chart Title";
    }

    private static void zzZTp() {
        zzZjw.put(TranslateLanguage.ENGLISH, "Chart Title");
        zzZjw.put("en-AU", "Chart Title");
        zzZjw.put("en-BZ", "Chart Title");
        zzZjw.put("en-CA", "Chart Title");
        zzZjw.put("en-IN", "Chart Title");
        zzZjw.put("en-IE", "Chart Title");
        zzZjw.put("en-JM", "Chart Title");
        zzZjw.put("en-MY", "Chart Title");
        zzZjw.put("en-NZ", "Chart Title");
        zzZjw.put("en-PH", "Chart Title");
        zzZjw.put("en-SG", "Chart Title");
        zzZjw.put("en-ZA", "Chart Title");
        zzZjw.put("en-TT", "Chart Title");
        zzZjw.put("en-GB", "Chart Title");
        zzZjw.put("en-US", "Chart Title");
        zzZjw.put("en-ZW", "Chart Title");
        zzZjw.put(TranslateLanguage.JAPANESE, "グラフ タイトル");
        zzZjw.put("ja-JP", "グラフ タイトル");
        zzZjw.put(TranslateLanguage.RUSSIAN, "Название диаграммы");
        zzZjw.put("ru-RU", "Название диаграммы");
    }
}
