package com.aspose.words.internal;

import com.aspose.words.C22241OooO0Oo;
import com.aspose.words.ref.Ref;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz78 {
    private zz76 zzmW;
    private zz74 zzmX;
    private static String zzmV = zzZKN.format(".{0}", "rels");
    private static String zzmU = zzZKN.format("{0}_{1}", "/", "rels");
    private static String zzmT = zzZKN.format("_{0}{1}", "rels", "/");
    private static final zzZHW zzUR = new zzZHW("Relationship", "Id", "Type", "Target", "TargetMode");

    public zz78() {
        this.zzmX = new zz74("/");
        this.zzmW = new zz76();
    }

    private static String zzYa(String str) {
        if (!zzZYD.zzXk(str) || "/".equals(str)) {
            return str;
        }
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--) {
            if (str.charAt(i) == '/' && i < length) {
                return str.substring(0, i + 1);
            }
        }
        return "";
    }

    private static void zzZ(zz77 zz77Var, zz74 zz74Var) throws Exception {
        zzO zzo = new zzO(zz77Var.zzR1());
        while (zzo.zzQ("Relationships")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 0) {
                zzo.zzk();
            } else {
                String value = null;
                String value2 = null;
                boolean zEquals = false;
                String value3 = null;
                while (zzo.zzi()) {
                    int iZzTP = zzUR.zzTP(zzo.getLocalName());
                    if (iZzTP == 1) {
                        value3 = zzo.getValue();
                    } else if (iZzTP == 2) {
                        value2 = zzo.getValue();
                    } else if (iZzTP == 3) {
                        value = zzo.getValue();
                    } else if (iZzTP == 4) {
                        zEquals = "External".equals(zzo.getValue());
                    }
                }
                if (zzZYD.zzXk(value)) {
                    zz74Var.zzZ(value3, value2, value, zEquals);
                }
            }
        }
    }

    public static String zzs(String str, String str2) {
        if (zzZKN.zzS(str2, "/", zzZOF.ORDINAL$4894b8c8)) {
            return str2;
        }
        if (zzZYD.zzi(str2, "NULL")) {
            return "";
        }
        String strZzYa = zzYa(str);
        int i = 0;
        while (true) {
            int iZzW = zzZKN.zzW(str2, "../", i, zzZOF.ORDINAL$4894b8c8);
            if (iZzW < i) {
                return zzZKN.zzZI(strZzYa, str2.substring(i, (str2.length() - i) + i));
            }
            if (iZzW > i) {
                strZzYa = zzZKN.zzZI(strZzYa, C22241OooO0Oo.OooO00o(iZzW, i, i, i, str2));
            }
            strZzYa = zzYa(strZzYa);
            i = iZzW + 3;
        }
    }

    public static String zzt(String str, String str2) {
        if (!zzZKN.zzS(str2, "/", zzZOF.ORDINAL$4894b8c8)) {
            return str2;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i = 0;
        for (int i2 = 0; i2 < iMin; i2++) {
            if (str.charAt(i2) == '/') {
                i = i2;
            }
            if (str.charAt(i2) != str2.charAt(i2)) {
                break;
            }
        }
        int i3 = i + 1;
        StringBuilder sb = new StringBuilder();
        for (int i4 = i3; i4 < str.length(); i4++) {
            if (str.charAt(i4) == '/') {
                zzZNH.zzU(sb, "../");
            }
        }
        sb.append((CharSequence) str2, i3, (str2.length() - i3) + i3);
        return sb.toString();
    }

    public void zzL(zzZOP zzzop) throws Exception {
    }

    public final boolean zzYb(String str) {
        return this.zzmX.zzY6(str) != null;
    }

    public final zz77 zzYc(String str) {
        zz77 zz77VarZzZ = zzZ((zz77) null, str);
        if (zz77VarZzZ != null) {
            return zz77VarZzZ;
        }
        throw new IllegalStateException(zzZKN.format("Cannot find target of relationship '{0}'", str));
    }

    public final zz77 zzYd(String str) {
        zz77 zz77VarZzYe = zzYe(str);
        if (zz77VarZzYe != null) {
            return zz77VarZzYe;
        }
        throw new IllegalStateException(zzZKN.format("Cannot find part '{0}'.", str));
    }

    public final zz77 zzYe(String str) {
        return this.zzmW.zzY8(str);
    }

    public final zz74 zzxn() {
        return this.zzmX;
    }

    public final zz76 zzxo() {
        return this.zzmW;
    }

    public final void zzxp() throws Exception {
        for (zz77 zz77Var : this.zzmW) {
            String strZzVh = zzZOQ.zzVh(zz77Var.getName());
            if ("rels".equals(zz77Var.zzxl())) {
                if ("/".equals(zz77Var.getName().replace(zzmU, "").replace(zzmV, ""))) {
                    zzZ(zz77Var, this.zzmX);
                }
            } else if (zzZYD.zzXk(strZzVh)) {
                String strReplace = zz77Var.getName().replace(strZzVh, zzmT + strZzVh + zzmV);
                if (this.zzmW.contains(strReplace)) {
                    zzZ(zzYd(strReplace), zz77Var.zzxn());
                }
            }
        }
    }

    public zz78(Comparator<String> comparator) {
        this.zzmX = new zz74("/");
        this.zzmW = new zz76(comparator);
    }

    public final zz77 zzZ(zz77 zz77Var, String str) {
        String name;
        zz74 zz74Var;
        if (zz77Var == null) {
            zz74Var = this.zzmX;
            name = "/";
        } else {
            zz74 zz74VarZzxn = zz77Var.zzxn();
            name = zz77Var.getName();
            zz74Var = zz74VarZzxn;
        }
        zz75 zz75VarZzY6 = zz74Var.zzY6(str);
        if (zz75VarZzY6 != null) {
            return zzYe(zzs(name, zz75VarZzY6.getTarget()));
        }
        return null;
    }

    public final zz77 zzZ(zz77 zz77Var, String str, String str2, String str3) throws Exception {
        Ref<String> ref = new Ref<>(null);
        zz77 zz77VarZzZ = zzZ(zz77Var, str, str2, str3, ref);
        ref.get();
        return zz77VarZzZ;
    }

    public final zz77 zzZ(zz77 zz77Var, String str, String str2, String str3, Ref<String> ref) throws Exception {
        if (zz77Var != null) {
            str = zzs(zz77Var.getName(), str);
        }
        zz77 zz77Var2 = new zz77(str, str2);
        this.zzmW.zzY(zz77Var2);
        ref.set((zz77Var != null ? zz77Var.zzxn() : this.zzmX).zzZ(str3, zz77Var2.getName(), false));
        return zz77Var2;
    }
}
