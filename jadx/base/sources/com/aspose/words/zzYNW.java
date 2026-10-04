package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNW extends zzYNY {
    private static ArrayList<String> zzXIp;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        zzXIp = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, "/[Content_Types].xml");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "/docProps/app.xml");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "/docProps/core.xml");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "/Annotations.xml");
    }

    public zzYNW(com.aspose.words.internal.zz79 zz79Var) {
        super(zz79Var, false);
    }

    @Override // com.aspose.words.zzYNY
    public final boolean zzR(com.aspose.words.internal.zz77 zz77Var) {
        return zz77Var == null || zzXIp.contains(zz77Var.getName()) || "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml".equals(zz77Var.getContentType()) || "application/vnd.openxmlformats-package.digital-signature-origin".equals(zz77Var.getContentType()) || "application/vnd.openxmlformats-package.digital-signature-certificate".equals(zz77Var.getContentType());
    }

    @Override // com.aspose.words.zzYNY
    public final String zzY(com.aspose.words.internal.zz79 zz79Var) {
        int i = 1;
        while (zz79Var.zzYe(com.aspose.words.internal.zzZKN.format("/package/services/digital-signature/certificate/sig{0}.cer", Integer.valueOf(i))) != null) {
            i++;
        }
        return com.aspose.words.internal.zzZKN.format("/package/services/digital-signature/certificate/sig{0}.cer", Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzYNY
    public final String zzYqT() {
        return "/package/services/digital-signature/origin.psdsor";
    }

    @Override // com.aspose.words.zzYNY
    public final void zzZ(com.aspose.words.internal.zz79 zz79Var, com.aspose.words.internal.zz77 zz77Var, zzYJU zzyju) {
        zzYJW zzyjw = new zzYJW(com.aspose.words.internal.zz73.zzY5(zz77Var == null ? "" : zz77Var.getName()), "application/vnd.openxmlformats-package.relationships+xml");
        zzYJO zzyjo = (zzYJO) zzY4X.zzAa("http://schemas.openxmlformats.org/package/2006/RelationshipTransform");
        zzyjw.zzYm7().zzZ(zzyjo);
        int i = 0;
        for (com.aspose.words.internal.zz75 zz75Var : zz77Var == null ? zz79Var.zzxn() : zz77Var.zzxn()) {
            if (!zz75Var.isExternal()) {
                if (!zzR(zz77Var == null ? zz79Var.zzYe(com.aspose.words.internal.zzZKN.format("/{0}", zz75Var.getTarget())) : zz79Var.zzYe(zz77Var.zzZ(zz75Var)))) {
                    zzyjo.zzCP(zz75Var.getType());
                    i++;
                }
            }
        }
        com.aspose.words.internal.zzZSF zzzsfZzZc = com.aspose.words.internal.zzZSF.zzZc(false);
        zzZWV zzzwv = new zzZWV(false);
        if (zz77Var != null) {
            if ("application/vnd.ms-package.xps-fixeddocument+xml".equals(zz77Var.getContentType())) {
                zzyjo.zzCP(zzzsfZzZc.zzmd());
                zzyjo.zzCP(zzzsfZzZc.zzma());
            } else if ("application/vnd.ms-package.xps-fixedpage+xml".equals(zz77Var.getContentType())) {
                zzyjo.zzCP(zzzwv.zzZkU());
            }
        }
        zzyjw.zzYm7().zzZ(zzY4X.zzAa("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
        if (i > 0) {
            zzyju.zzY(zzyjw);
        }
    }

    @Override // com.aspose.words.zzYNY
    public final String zzZ(com.aspose.words.internal.zz79 zz79Var) {
        int i = 1;
        while (zz79Var.zzYe(com.aspose.words.internal.zzZKN.format("/package/services/digital-signature/xml-signature/sig{0}.psdsxs", Integer.valueOf(i))) != null) {
            i++;
        }
        return com.aspose.words.internal.zzZKN.format("/package/services/digital-signature/xml-signature/sig{0}.psdsxs", Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzYNY
    public final com.aspose.words.internal.zzZOR zzZ(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        return new zzXYY().zzY(zzyju, digitalSignature);
    }
}
