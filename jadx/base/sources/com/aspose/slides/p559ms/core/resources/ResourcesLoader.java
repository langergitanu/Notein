package com.aspose.slides.p559ms.core.resources;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import androidx.core.content.OooO0O0;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourcesLoader {
    /* JADX INFO: renamed from: k4 */
    private static String m67699k4(String str, String str2) {
        if (str == null) {
            throw new IllegalStateException("packageName is null");
        }
        if (str2 == null) {
            throw new IllegalStateException("fileName is null");
        }
        if (str2.length() == 0) {
            throw new IllegalStateException("fileName is empty");
        }
        if (str.length() == 0) {
            return str2;
        }
        String strReplace = str.replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
        if (OooO0O0.OooO00o(1, strReplace) != '/') {
            strReplace = strReplace.concat("/");
        }
        return C21111o0ooOoO.OooO0Oo(strReplace, str2);
    }

    public static AbstractC3150x6 loadResource(String str, String str2) {
        String strM67699k4 = m67699k4(str, str2);
        InputStream resourceAsStream = ResourcesLoader.class.getResourceAsStream(strM67699k4);
        if (resourceAsStream != null) {
            return AbstractC3150x6.fromJava(resourceAsStream);
        }
        throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Resource file ", strM67699k4, " not found in assembly"));
    }
}
