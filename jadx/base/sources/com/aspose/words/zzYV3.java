package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYV3 {
    private static void zzY(zzYU6 zzyu6, Frameset frameset) {
        String str = com.aspose.words.internal.zzZKN.format("{0}{1}", Integer.valueOf(frameset.zzZ5C()), frameset.zzZ5D() == 2 ? "%" : frameset.zzZ5D() == 3 ? C18358t1.g.f56183c : "");
        if ("1*".equals(str)) {
            return;
        }
        zzyu6.zzYz("w:sz", str);
    }

    public static void zzZ(Document document, zzYU6 zzyu6, boolean z, String str) {
        if (document.getFrameset() == null || document.getFrameset().getChildFramesets().getCount() == 0) {
            return;
        }
        zzZ(zzyu6, document.getFrameset(), z, true, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[LOOP:0: B:28:0x00af->B:30:0x00b5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzYU6 zzyu6, Frameset frameset, boolean z, boolean z2, String str) {
        String strZzkU;
        String str2;
        Iterator<Frameset> it;
        zzyu6.zzY(frameset.zzZ5x() ? "w:frameset" : "w:frame");
        if (z2) {
            zzZ(zzyu6, frameset);
        } else {
            zzY(zzyu6, frameset);
        }
        if (frameset.zzZ5x()) {
            strZzkU = zzY8T.zzkU(frameset.zz6y());
            str2 = "w:frameLayout";
        } else {
            zzyu6.zzZk("w:MarH", frameset.zzZ5B());
            zzyu6.zzZk("w:MarV", frameset.zzZ5A());
            zzyu6.zzYz("w:name", frameset.getName());
            if (frameset.getFrameDefaultUrl() != null) {
                if (!z) {
                    zzyu6.zzYz("w:sourceFileName", frameset.getFrameDefaultUrl());
                } else {
                    String strZzZ = ((zzZYD) zzyu6).zzZmN().zzxn().zzZ(str, frameset.getFrameDefaultUrl(), true);
                    zzyu6.zzY("w:sourceFileName");
                    zzyu6.zzX("r:id", strZzZ);
                    zzyu6.zzp();
                }
            }
            if (frameset.zzZ5z() != 0) {
                strZzkU = frameset.zzZ5z() == 1 ? "on" : "off";
                str2 = "w:scrollbar";
            }
            zzyu6.zze("w:noResizeAllowed", frameset.zzZ5y());
            zzyu6.zze("w:linkedToFile", frameset.isFrameLinkToFile());
            zzyu6.zzYz("w:title", frameset.getTitle());
            it = frameset.getChildFramesets().iterator();
            while (it.hasNext()) {
                zzZ(zzyu6, it.next(), z, false, str);
            }
            zzyu6.zzp();
        }
        zzyu6.zzYz(str2, strZzkU);
        zzyu6.zze("w:noResizeAllowed", frameset.zzZ5y());
        zzyu6.zze("w:linkedToFile", frameset.isFrameLinkToFile());
        zzyu6.zzYz("w:title", frameset.getTitle());
        it = frameset.getChildFramesets().iterator();
        while (it.hasNext()) {
        }
        zzyu6.zzp();
    }

    private static void zzZ(zzYU6 zzyu6, Frameset frameset) {
        zzyu6.zzY("w:framesetSplitbar");
        zzyu6.zzv("w:w", frameset.zzZ5u(), 0);
        zzyu6.zzX("w:color", frameset.zzZ5v());
        String strZzkV = zzY8T.zzkV(frameset.zzZ5w());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzkV)) {
            zzyu6.zzy(com.aspose.words.internal.zzZKN.format("w:{0}", strZzkV), true);
        }
        zzyu6.zzp();
    }
}
