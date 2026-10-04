package com.huawei.hms.drive;

import com.aspose.words.ControlChar;
import java.net.Proxy;

/* JADX INFO: renamed from: com.huawei.hms.drive.cn */
/* JADX INFO: loaded from: classes6.dex */
public final class C17831cn {
    /* JADX INFO: renamed from: a */
    public static String m76502a(C17798bh c17798bh, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(c17798bh.m76263b());
        sb.append(ControlChar.SPACE_CHAR);
        if (m76503b(c17798bh, type)) {
            sb.append(c17798bh.m76261a());
        } else {
            sb.append(m76501a(c17798bh.m76261a()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m76503b(C17798bh c17798bh, Proxy.Type type) {
        return !c17798bh.m76270i() && type == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: a */
    public static String m76501a(C17792bb c17792bb) {
        String strM76153h = c17792bb.m76153h();
        String strM76155j = c17792bb.m76155j();
        if (strM76155j == null) {
            return strM76153h;
        }
        return strM76153h + '?' + strM76155j;
    }
}
