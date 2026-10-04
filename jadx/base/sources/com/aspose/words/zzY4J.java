package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4J {
    private boolean zzX1Q;
    private zzY4N zzX1R;
    private int zzY99;
    private int zzY9a;
    private StringBuilder zz8Y = new StringBuilder();
    private int zzX1z = 0;

    public final void zzID(String str) {
        if (this.zz8Y.length() != 0) {
            com.aspose.words.internal.zzZNH.zzU(this.zz8Y, " ");
        }
        com.aspose.words.internal.zzZNH.zzU(this.zz8Y, str);
        this.zzX1z++;
    }

    public final void zzPA(boolean z) {
        this.zzX1Q = z;
    }

    public final zzY4N zzXUL() {
        return this.zzX1R;
    }

    public final boolean zzXUN() {
        return this.zzX1Q;
    }

    public final int zzYM7() {
        return this.zzY99;
    }

    public final int zzYMa() {
        return this.zzY9a;
    }

    public final void zzZ(zzY4N zzy4n) {
        this.zzX1R = zzy4n;
    }

    public final void zzwb(int i) {
        this.zzY9a = i;
    }

    public final void zzZ(DocumentBuilder documentBuilder, TxtLoadOptions txtLoadOptions) {
        String string = this.zz8Y.toString();
        int i = 0;
        if (txtLoadOptions.getDetectHyperlinks()) {
            Ref ref = new Ref(null);
            int iZzY = com.aspose.words.internal.zzZVR.zzY(string, ref);
            String str = (String) ref.get();
            int length = 0;
            while (iZzY != -1) {
                if (length < iZzY) {
                    documentBuilder.write(C22241OooO0Oo.OooO00o(iZzY, length, length, length, string));
                }
                Ref ref2 = new Ref(null);
                com.aspose.words.internal.zzZVR.zzZ(str, 0, ref2);
                String strZzY = com.aspose.words.internal.zzZKN.zzY((String) ref2.get(), com.aspose.words.internal.zzZP1.zzj8());
                if ("http".equals(strZzY) || AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(strZzY) || "ftp".equals(strZzY)) {
                    documentBuilder.pushFont();
                    documentBuilder.getFont().setColor(txtLoadOptions.zzXUJ());
                    documentBuilder.getFont().setUnderline(txtLoadOptions.zzXUI());
                    documentBuilder.insertHyperlink(str, str, false);
                    documentBuilder.popFont();
                } else {
                    documentBuilder.write(str);
                }
                length = str.length() + iZzY;
                ref.set(str);
                iZzY = com.aspose.words.internal.zzZVR.zzY(string, length, ref);
                str = (String) ref.get();
            }
            i = length;
        }
        if (i < string.length()) {
            if (i != 0) {
                string = string.substring(i, (string.length() - i) + i);
            }
            documentBuilder.write(string);
        }
        documentBuilder.writeln();
    }
}
