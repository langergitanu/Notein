package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzK7 {
    private static HashMap<String, String> zzZjw = new HashMap<>();

    static {
        zzZTp();
    }

    public static String getTitle() {
        String str = (String) com.aspose.words.internal.zzQW.zzZ(zzZjw, com.aspose.words.internal.zzZXR.zzq0());
        return str != null ? str : "Axis Title";
    }

    private static void zzZTp() {
        zzZjw.put(TranslateLanguage.ENGLISH, "Axis Title");
        zzZjw.put("en-AU", "Axis Title");
        zzZjw.put("en-BZ", "Axis Title");
        zzZjw.put("en-CA", "Axis Title");
        zzZjw.put("en-IN", "Axis Title");
        zzZjw.put("en-IE", "Axis Title");
        zzZjw.put("en-JM", "Axis Title");
        zzZjw.put("en-MY", "Axis Title");
        zzZjw.put("en-NZ", "Axis Title");
        zzZjw.put("en-PH", "Axis Title");
        zzZjw.put("en-SG", "Axis Title");
        zzZjw.put("en-ZA", "Axis Title");
        zzZjw.put("en-TT", "Axis Title");
        zzZjw.put("en-GB", "Axis Title");
        zzZjw.put("en-US", "Axis Title");
        zzZjw.put("en-ZW", "Axis Title");
        zzZjw.put(TranslateLanguage.JAPANESE, "軸ラベル");
        zzZjw.put("ja-JP", "軸ラベル");
        zzZjw.put(TranslateLanguage.RUSSIAN, "Название оси");
        zzZjw.put("ru-RU", "Название оси");
    }
}
