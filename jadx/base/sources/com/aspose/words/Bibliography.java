package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Bibliography {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzIM<String> zzZDd;
    private boolean zzZDe;
    private com.aspose.words.internal.zzZS0 zzZDf;
    private Map<String, Source> zzZDg = new HashMap();
    private String zzZDh;
    private Document zzZEY;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ieee2006officeonline.xsl");
        zzZDd = new com.aspose.words.internal.zzIM<>(arrayList);
        zzUR = new com.aspose.words.internal.zzZHW("SelectedStyle", "Source");
    }

    public Bibliography(Document document) throws Exception {
        this.zzZEY = document;
        zzZ.zzZ(this, document);
    }

    private static com.aspose.words.internal.zzZOP zzTo(String str) {
        String lowerCase = com.aspose.words.internal.zzZKN.zzU(str, IOUtils.DIR_SEPARATOR_WINDOWS).toLowerCase();
        if (!zzZDd.contains(lowerCase)) {
            return null;
        }
        return com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.Bibliography." + lowerCase, Document.class);
    }

    private static com.aspose.words.internal.zzZOP zzY(String str, Document document) throws Exception {
        IBibliographyStylesProvider bibliographyStylesProvider = document.getFieldOptions().getBibliographyStylesProvider();
        if (bibliographyStylesProvider != null) {
            return com.aspose.words.internal.zzZOP.zzY(bibliographyStylesProvider.getStyle(str));
        }
        return null;
    }

    private static com.aspose.words.internal.zzZOP zzZ(String str, Document document) throws Exception {
        return zzY(str, document) != null ? zzY(str, document) : zzTo(str);
    }

    private com.aspose.words.internal.zzZOP zzZC(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        try {
            return this.zzZDf.zzZR(zzzop);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getBibliographyStyle() {
        return this.zzZDh;
    }

    public final Collection<Source> getSources() {
        return this.zzZDg.values();
    }

    public final Map<String, Source> zz9U() {
        return this.zzZDg;
    }

    public final boolean zz9V() throws Exception {
        if (this.zzZDe) {
            return this.zzZDf != null;
        }
        this.zzZDe = true;
        if (com.aspose.words.internal.zzZKN.zzU3(getBibliographyStyle())) {
            return false;
        }
        com.aspose.words.internal.zzZOP zzzopZzZ = zzZ(getBibliographyStyle(), this.zzZEY);
        if (zzzopZzZ == null) {
            if (zzzopZzZ != null) {
            }
            return false;
        }
        try {
            com.aspose.words.internal.zzZS0 zzzs0 = new com.aspose.words.internal.zzZS0();
            this.zzZDf = zzzs0;
            zzzs0.zzR(zzzopZzZ);
            return true;
        } finally {
            zzzopZzZ.close();
        }
    }

    public final com.aspose.words.internal.zzZOP zzZR(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zz9V()) {
            return zzZC(zzzop);
        }
        throw new IllegalStateException();
    }

    public static class zzZ {
        private static void zzX(Bibliography bibliography, com.aspose.words.internal.zzO zzo) {
            bibliography.zz9U().clear();
            if (zzo.zzQ("Sources")) {
                while (!zzo.zzP("Sources")) {
                    if (Bibliography.zzUR.zzTP(zzo.getLocalName()) == 1) {
                        Source source = new Source(zzo.zzf());
                        bibliography.zz9U().put(source.getTag(), source);
                    }
                }
            }
        }

        private static void zzY(Bibliography bibliography, com.aspose.words.internal.zzO zzo) {
            while (zzo.zzi()) {
                if (Bibliography.zzUR.zzTP(zzo.getLocalName()) == 0) {
                    bibliography.zzZDh = zzo.getValue();
                }
            }
        }

        public static void zzZ(Bibliography bibliography, Document document) throws Exception {
            for (CustomXmlPart customXmlPart : document.getCustomXmlParts()) {
                if (customXmlPart.getData().length != 0) {
                    zzZ(bibliography, customXmlPart);
                }
            }
        }

        private static void zzZ(Bibliography bibliography, CustomXmlPart customXmlPart) throws Exception {
            try {
                zzZ(bibliography, customXmlPart.getData());
            } catch (Exception unused) {
            }
        }

        private static void zzZ(Bibliography bibliography, byte[] bArr) throws Exception {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
            try {
                zzZ(bibliography, new com.aspose.words.internal.zzO((com.aspose.words.internal.zzZOP) zzzor, true));
            } finally {
                zzzor.close();
            }
        }

        private static void zzZ(Bibliography bibliography, com.aspose.words.internal.zzO zzo) {
            if ("Sources".equals(zzo.getLocalName())) {
                zzY(bibliography, zzo);
                zzX(bibliography, zzo);
            }
        }
    }
}
