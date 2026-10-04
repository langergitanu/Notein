package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNX extends zzYNY {
    private static ArrayList<String> zzXIp;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        zzXIp = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, "/[Content_Types].xml");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "/docProps/app.xml");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "/docProps/core.xml");
    }

    public zzYNX(com.aspose.words.internal.zz79 zz79Var) {
        super(zz79Var, true);
    }

    @Override // com.aspose.words.zzYNY
    public final boolean zzR(com.aspose.words.internal.zz77 zz77Var) {
        return zzXIp.contains(zz77Var.getName()) || "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml".equals(zz77Var.getContentType()) || "application/vnd.openxmlformats-package.digital-signature-origin".equals(zz77Var.getContentType());
    }

    @Override // com.aspose.words.zzYNY
    public final String zzY(com.aspose.words.internal.zz79 zz79Var) {
        throw new UnsupportedOperationException("Should not be called.");
    }

    @Override // com.aspose.words.zzYNY
    public final String zzYqT() {
        return "/_xmlsignatures/origin.sigs";
    }

    @Override // com.aspose.words.zzYNY
    public final void zzZ(com.aspose.words.internal.zz79 zz79Var, com.aspose.words.internal.zz77 zz77Var, zzYJU zzyju) {
        zzYJW zzyjw = new zzYJW(com.aspose.words.internal.zz73.zzY5(zz77Var == null ? "" : zz77Var.getName()), "application/vnd.openxmlformats-package.relationships+xml");
        zzyju.zzY(zzyjw);
        zzYJO zzyjo = (zzYJO) zzY4X.zzAa("http://schemas.openxmlformats.org/package/2006/RelationshipTransform");
        zzyjw.zzYm7().zzZ(zzyjo);
        for (com.aspose.words.internal.zz75 zz75Var : zz77Var == null ? zz79Var.zzxn() : zz77Var.zzxn()) {
            if (!zz75Var.isExternal()) {
                if (!zzR(zz77Var == null ? zz79Var.zzYe(com.aspose.words.internal.zzZKN.format("/{0}", zz75Var.getTarget())) : zz79Var.zzYe(zz77Var.zzZ(zz75Var)))) {
                    zzyjo.zzCQ(zz75Var.getId());
                }
            }
        }
        zzyjw.zzYm7().zzZ(zzY4X.zzAa("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    }

    @Override // com.aspose.words.zzYNY
    public final String zzZ(com.aspose.words.internal.zz79 zz79Var) {
        int i = 1;
        while (zz79Var.zzYe(com.aspose.words.internal.zzZKN.format("/_xmlsignatures/sig{0}.xml", Integer.valueOf(i))) != null) {
            i++;
        }
        return com.aspose.words.internal.zzZKN.format("sig{0}.xml", Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzYNY
    public final com.aspose.words.internal.zzZOR zzZ(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        return new zzXYZ().zzY(zzyju, digitalSignature);
    }
}
