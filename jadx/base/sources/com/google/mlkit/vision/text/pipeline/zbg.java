package com.google.mlkit.vision.text.pipeline;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw;
import com.google.mlkit.p567nl.languageid.LanguageIdentifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zbg {
    public static String zba(List list) {
        Iterator it = list.iterator();
        float fZbc = 0.0f;
        String strZbf = LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
        while (it.hasNext()) {
            zbaaw zbaawVar = (zbaaw) it.next();
            if (fZbc < zbaawVar.zbc()) {
                fZbc = zbaawVar.zbc();
                strZbf = zbaawVar.zbf();
            }
        }
        return strZbf;
    }
}
