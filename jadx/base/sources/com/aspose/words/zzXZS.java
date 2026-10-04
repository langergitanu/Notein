package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZS {
    private zzZIG zzYkz;
    private zzZFX zzYkw = new zzZFX();
    private String[] zzWTt = {"area", "base", "br", "col", "embed", TranslateLanguage.CROATIAN, "img", "input", "link", "meta", "param", "source", "track", "wbr", "script", "command", "keygen", "menuitem"};

    private void zzNZ(String str) {
        if (this.zzYkw.isEmpty() || "html".equals(this.zzYkw.zzZ0a().getName())) {
            return;
        }
        zzQ(new zzZEC(str));
    }

    private void zzQ(zzZG4 zzzg4) {
        this.zzYkw.zzZ0a().zzZ2C().zzX(zzzg4);
    }

    private void zzXV(String str, String str2) {
        this.zzYkw.isEmpty();
        zzZIG zzzigZzZ0a = this.zzYkw.zzZ0a();
        com.aspose.words.internal.zzZKN.equals(zzzigZzZ0a.getName(), str);
        com.aspose.words.internal.zzZKN.equals(zzzigZzZ0a.getNamespace(), str2);
        this.zzYkw.zzZ09();
    }

    private static zzZIG zzY(String str, String str2, zzZK8 zzzk8) {
        return new zzZIG(str, str2, zzzk8);
    }

    private void zzYH(com.aspose.words.internal.zzZOP zzzop) {
        zzXZR zzxzr = new zzXZR();
        com.aspose.words.internal.zzZL1 zzzl1ZzZ = com.aspose.words.internal.zzZSN.zzZ(zzzop, zzxzr);
        while (zzzl1ZzZ.read()) {
            zzxzr.zzht(zzzl1ZzZ.getNodeType());
            int nodeType = zzzl1ZzZ.getNodeType();
            if (nodeType == 1) {
                zzZK8 zzzk8 = new zzZK8();
                if (zzzl1ZzZ.hasAttributes()) {
                    while (zzzl1ZzZ.zzi()) {
                        zzzk8.zzY(new zzZK9(zzzl1ZzZ.getName(), zzzl1ZzZ.getValue()));
                    }
                }
                zzzl1ZzZ.zzj();
                zzZ(zzzl1ZzZ.getName(), zzzl1ZzZ.getNamespaceURI(), zzzl1ZzZ.zzc(), zzzk8);
            } else if (nodeType != 2) {
                if (nodeType == 4 || nodeType == 6 || nodeType == 12 || nodeType == 24) {
                    zzNZ(zzzl1ZzZ.getValue().replace(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replace("\r", IOUtils.LINE_SEPARATOR_UNIX));
                }
            } else if (!zzyp(zzzl1ZzZ.getName())) {
                zzXV(zzzl1ZzZ.getName(), zzzl1ZzZ.getNamespaceURI());
            }
        }
    }

    public static zzZIR zzYI(com.aspose.words.internal.zzZOP zzzop) {
        zzXZS zzxzs = new zzXZS();
        zzxzs.zzYH(zzzop);
        return new zzZIR(zzxzs.zzYkz, 0);
    }

    private void zzZ(String str, String str2, boolean z, zzZK8 zzzk8) {
        if (this.zzYkz == null) {
            zzZIG zzzigZzY = zzY(str, str2, zzzk8);
            this.zzYkz = zzzigZzY;
            this.zzYkw.zzZ(zzzigZzY);
        } else if (!this.zzYkw.isEmpty()) {
            zzZ(str, str2, zzzk8);
        }
        if (z) {
            zzXV(str, str2);
        }
    }

    private boolean zzyp(String str) {
        int i = 0;
        while (true) {
            String[] strArr = this.zzWTt;
            if (i >= strArr.length) {
                return false;
            }
            if (com.aspose.words.internal.zzZKN.zzX(str, strArr[i], com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                return true;
            }
            i++;
        }
    }

    private void zzZ(String str, String str2, zzZK8 zzzk8) {
        zzZIG zzzigZzY = zzY(str, str2, zzzk8);
        zzQ(zzzigZzY);
        this.zzYkw.zzZ(zzzigZzY);
    }
}
