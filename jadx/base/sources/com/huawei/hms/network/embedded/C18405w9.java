package com.huawei.hms.network.embedded;

import com.aspose.words.ControlChar;
import java.net.Proxy;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18405w9 {
    /* JADX INFO: renamed from: a */
    public static String m79836a(C18160e8 c18160e8, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(c18160e8.m78307h());
        sb.append(ControlChar.SPACE_CHAR);
        boolean zM79838b = m79838b(c18160e8, type);
        C18416x7 c18416x7M78310k = c18160e8.m78310k();
        if (zM79838b) {
            sb.append(c18416x7M78310k);
        } else {
            sb.append(m79837a(c18416x7M78310k));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79838b(C18160e8 c18160e8, Proxy.Type type) {
        return !c18160e8.m78306g() && type == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: a */
    public static String m79837a(C18416x7 c18416x7) {
        String strM79922c = c18416x7.m79922c();
        String strM79926e = c18416x7.m79926e();
        if (strM79926e == null) {
            return strM79922c;
        }
        return strM79922c + '?' + strM79926e;
    }
}
