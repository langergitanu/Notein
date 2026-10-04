package com.aspose.words.internal;

import com.aspose.words.C22241OooO0Oo;
import com.aspose.words.EditingLanguage;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWN extends zz0V {
    private boolean zz8R;
    private boolean zz8S;
    private Object zz8T;
    private int zzPl;
    private int zzPm;
    private zzH0 zzXQ;

    public zzZWN(zzZZR zzzzr, zzH0 zzh0, String str, int i, int i2, boolean z) {
        super(zzzzr);
        this.zzXQ = zzh0;
        this.zz8T = zz7S.zzYj(str);
        this.zzPm = i;
        this.zzPl = i2;
        this.zz8S = z;
    }

    private static String zzB(String str, int i) {
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '<') {
                if (i3 == 0) {
                    String strOooO00o = C22241OooO0Oo.OooO00o(i4, i2, i2, i2, str);
                    String strZzD = zzZYD.zzD(strOooO00o, i);
                    zzZNH.zzU(sb, strZzD);
                    if (zzSh(i) && !zzZKN.equals(strZzD, strOooO00o)) {
                        sb.append((CharSequence) str, i4, (str.length() - i4) + i4);
                        return sb.toString();
                    }
                    i2 = i4;
                }
                i3++;
            } else if (cCharAt == '>' && i3 > 0 && i3 - 1 == 0) {
                sb.append((CharSequence) str, i2, (i4 - i2) + 1 + i2);
                i2 = i4 + 1;
            }
        }
        String strSubstring = str.substring(i2, (str.length() - i2) + i2);
        if (i3 == 0) {
            strSubstring = zzZYD.zzD(strSubstring, i);
        }
        zzZNH.zzU(sb, strSubstring);
        return sb.toString();
    }

    private static boolean zzSh(int i) {
        return i == 4;
    }

    private String zzc(Object obj) {
        return this.zzPm != -1 ? zz7H.zzZ(zzZQB.zz2(obj), this.zzPm, true, EditingLanguage.ENGLISH_US) : zzZWK.zzV(zzZQB.zz3(obj), EditingLanguage.ENGLISH_US);
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzXQ.zzx();
        if (this.zzPm != 0) {
            objZzx = zzc(objZzx);
        } else {
            Object obj = this.zz8T;
            if (obj != null) {
                objZzx = zz7S.zzE(objZzx, obj);
            }
        }
        if (this.zzPl != 0 && objZzx != null) {
            String string = objZzx.toString();
            if (zzZYD.zzXk(string)) {
                objZzx = this.zz8S ? zzB(string, this.zzPl) : zzZYD.zzD(string, this.zzPl);
            }
        }
        zzfs.zzZ(zzzzr.zzEW(), objZzx, this.zz8S, this.zz8R);
        return 3;
    }

    public zzZWN(zzZZR zzzzr, zzH0 zzh0, boolean z) {
        super(zzzzr);
        this.zzXQ = zzh0;
        this.zz8S = true;
        this.zz8R = z;
    }
}
