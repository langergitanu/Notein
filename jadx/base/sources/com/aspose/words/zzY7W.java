package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7W {
    private static String zzAu(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&quot;");
            } else if (cCharAt == '<') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&lt;");
            } else if (cCharAt == '>') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&gt;");
            } else if (cCharAt == '&') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&amp;");
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, "&apos;");
            }
        }
        return sb.toString();
    }

    private static String zzAv(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = true;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t' && (!z || cCharAt != ' ')) {
                if (cCharAt == ' ') {
                    i++;
                } else {
                    if ((((long) i) & 4294967295L) > 0) {
                        sb.append(ControlChar.SPACE_CHAR);
                    }
                    sb.append(cCharAt);
                    z = false;
                    i = 0;
                }
            }
        }
        return sb.toString();
    }

    private static String zzAw(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        StringBuilder sb2 = new StringBuilder(length);
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
        int i = 0;
        boolean z = true;
        for (int i2 = 0; i2 < strZzTX.length(); i2++) {
            char cCharAt = strZzTX.charAt(i2);
            if (z && cCharAt == ' ') {
                i++;
            } else {
                sb2.append(cCharAt);
                if (cCharAt == '\n') {
                    if (sb2.length() > 0) {
                        int i3 = i / 4;
                        if (i3 > 0) {
                            com.aspose.words.internal.zzZNH.zzZ(sb, '\t', i3);
                        }
                        int i4 = i % 4;
                        if (i4 > 0) {
                            com.aspose.words.internal.zzZNH.zzZ(sb, ControlChar.SPACE_CHAR, i4);
                        }
                        com.aspose.words.internal.zzZNH.zzZ(sb, sb2);
                    }
                    sb2.setLength(0);
                    i = 0;
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (sb2.length() > 0) {
            com.aspose.words.internal.zzZNH.zzZ(sb, sb2);
        }
        return sb.toString();
    }

    private static void zzV(zzY7X zzy7x, com.aspose.words.internal.zzP zzp) {
        String strZzAu = zzAu(zzy7x.getValue());
        boolean z = zzy7x.isText() && zzy7x.zzY1C() != null && ("text".equals(zzy7x.zzY1C().zzZTQ()) || "tspan".equals(zzy7x.zzY1C().zzZTQ()));
        if (zzY7B.zzF(zzy7x) || z) {
            zzp.zzX(strZzAu);
        } else {
            String strZzAw = zzp.getPrettyFormat() ? zzAw(strZzAu) : zzAv(strZzAu);
            zzp.zzY(strZzAw, strZzAw.contains(IOUtils.LINE_SEPARATOR_UNIX));
        }
    }

    private static void zzW(zzY7X zzy7x, com.aspose.words.internal.zzP zzp) {
        if (zzy7x.zzY1n() == null) {
            return;
        }
        ArrayList<String> arrayListZzY = com.aspose.words.internal.zzZQG.zzY(zzy7x.zzY1n().keySet());
        Collections.sort(arrayListZzY);
        for (String str : arrayListZzY) {
            if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
                String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("xmlns:", str);
                String str2 = zzy7x.zzY1n().get(str);
                if (zzy7x.zzY1w() || !"http://www.w3.org/2000/svg".equals(str2)) {
                    zzp.zzX(strOooO00o, str2);
                }
            }
        }
    }

    private static void zzX(zzY7X zzy7x, com.aspose.words.internal.zzP zzp) {
        zzPS zzpsZzZWe = ((zzy7x.hasAttribute("style") || (zzy7x.zzY1w() && !zzy7x.zzY1v())) && zzy7x.zzZWe().getCount() > 0) ? zzy7x.zzZWe() : (zzy7x.hasAttribute("style") || zzy7x.zzZVr().getCount() <= 0) ? null : zzy7x.zzZVr();
        if (zzpsZzZWe != null) {
            zzp.zzX("style", zzpsZzZWe.zzZXu());
        }
    }

    private static void zzY(zzY7X zzy7x, com.aspose.words.internal.zzP zzp) throws Exception {
        zzY7Z zzy7zZzAx;
        ArrayList<String> arrayListZzT = com.aspose.words.internal.zzZQG.zzT(zzy7x.zzY1p());
        Collections.sort(arrayListZzT);
        for (String str : arrayListZzT) {
            if (!"style".equals(str) && (zzy7zZzAx = zzy7x.zzAx(str)) != null) {
                if (zzy7x.zzY1m() != null && "image".equals(zzy7x.zzZTQ()) && "href".equals(str) && zzy7x.zzY1m().containsKey(zzy7zZzAx.getValue())) {
                    byte[] bArr = zzy7x.zzY1m().get(zzy7zZzAx.getValue());
                    zzp.zzX(zzy7zZzAx.getName(), com.aspose.words.internal.zzZKN.format("data:{0};base64,{1}", com.aspose.words.internal.zzKE.zzWY(com.aspose.words.internal.zzEF.zzZU(bArr)), com.aspose.words.internal.zzZQB.zzYT(bArr)));
                } else {
                    zzp.zzX(zzy7zZzAx.getName(), zzy7zZzAx.getValue());
                }
            }
        }
        zzX(zzy7x, zzp);
        zzW(zzy7x, zzp);
    }

    public static byte[] zzZ(zzY7X zzy7x, com.aspose.words.internal.zzZO0 zzzo0, boolean z) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, zzzo0, z);
            zzZ(zzy7x, zzp);
            zzp.flush();
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    private static void zzZ(zzY7X zzy7x, com.aspose.words.internal.zzP zzp) throws Exception {
        if (zzy7x.isText()) {
            zzV(zzy7x, zzp);
            return;
        }
        zzp.zzY(zzy7x.zzZTQ());
        zzY(zzy7x, zzp);
        if ("svg".equals(zzy7x.zzZTQ()) && !zzy7x.hasAttribute("xmlns")) {
            zzp.zzX("xmlns", zzy7x.zzZ2G());
        }
        boolean prettyFormat = zzp.getPrettyFormat();
        if ("text".equals(zzy7x.zzZTQ())) {
            zzp.setPrettyFormat(false);
        }
        Iterator<zzY7X> it = zzy7x.zzQw().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzp);
        }
        zzp.zzp();
        zzp.setPrettyFormat(prettyFormat);
    }
}
