package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDV {
    private zzZFF zzYpP;
    private DocumentBuilder zzZwh;
    private HashMap<String, String> zzYkm = new HashMap<>();
    private HashMap<String, zzYC3> zzYkl = new HashMap<>();

    public zzZDV(DocumentBuilder documentBuilder, zzZFF zzzff) {
        this.zzZwh = documentBuilder;
        this.zzYpP = zzzff;
    }

    public final int zz8(zzZIG zzzig) throws Exception {
        try {
            ShapeBase shapeBaseZzT = zzY2D.zzT(new zzZDU(this.zzZwh, this.zzYkm, this.zzYkl, this.zzYpP, zzzig.zzZ0g()));
            if (shapeBaseZzT != null && shapeBaseZzT.getParentNode() == null) {
                this.zzZwh.insertNode(shapeBaseZzT);
            }
            return 2;
        } catch (Exception unused) {
            if (this.zzZwh.getDocument().getWarningCallback() != null) {
                OooO00o.OooO0O0(this.zzZwh.getDocument().getWarningCallback(), 1, 16, "Malformed VML shape is ignored");
            }
            return 2;
        }
    }

    public final void zz9(zzZIG zzzig) {
        zzzig.getName();
        for (zzZK9 zzzk9 : zzzig.zzZ2B()) {
            if ("urn:schemas-microsoft-com:office:office".equals(zzzk9.getValue()) || "urn:schemas-microsoft-com:vml".equals(zzzk9.getValue()) || "urn:schemas-microsoft-com:office:word".equals(zzzk9.getValue())) {
                if (com.aspose.words.internal.zzZKN.zzS(zzzk9.getName(), "xmlns:", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    String strSubstring = zzzk9.getName().substring(6);
                    if (com.aspose.words.internal.zzZYD.zzXk(strSubstring) && strSubstring.indexOf(58) < 0) {
                        com.aspose.words.internal.zzZQF.zzY(this.zzYkm, strSubstring, zzzk9.getValue());
                    }
                }
            }
        }
    }
}
