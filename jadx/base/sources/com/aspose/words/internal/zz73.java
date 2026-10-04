package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz73 {
    public static String zzY5(String str) {
        int iLastIndexOf = str.lastIndexOf(47) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        return zzZKN.format("{0}{1}_rels/{2}.rels", zzZKN.zzS(strSubstring, "/", zzZOF.ORDINAL$4894b8c8) ? "" : "/", strSubstring, str.substring(iLastIndexOf));
    }

    public static void zzZ(zz78 zz78Var, boolean z) throws Exception {
        zzZ(zz78Var, zz78Var.zzxn(), "", z);
        ArrayList<zz77> arrayList = new ArrayList();
        for (zz77 zz77Var : zz78Var.zzxo()) {
            if (zz77Var.zzxn().getCount() > 0) {
                zzZQG.zzZ((ArrayList<zz77>) arrayList, zz77Var);
            }
        }
        for (zz77 zz77Var2 : arrayList) {
            zzZ(zz78Var, zz77Var2.zzxn(), zz77Var2.getName(), z);
        }
    }

    private static void zzZ(zz78 zz78Var, zz74 zz74Var, String str, boolean z) throws Exception {
        zz77 zz77Var = new zz77(zzY5(str), "application/vnd.openxmlformats-package.relationships+xml");
        zzP zzp = new zzP(zz77Var.zzR1(), z);
        zzp.zzZ("Relationships");
        zzp.zzX("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
        for (zz75 zz75Var : zz74Var) {
            zzp.zzY("Relationship");
            zzp.zzX("Id", zz75Var.getId());
            zzp.zzX("Type", zz75Var.getType());
            zzp.zzX("Target", zz75Var.getTarget());
            if (zz75Var.isExternal()) {
                zzp.zzX("TargetMode", "External");
            }
            zzp.zzp();
        }
        zzp.endDocument();
        zz78Var.zzxo().zzY(zz77Var);
    }
}
