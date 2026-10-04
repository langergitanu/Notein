package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI0 {
    private com.aspose.words.internal.zzZQC<zzZ> zzYqF = new com.aspose.words.internal.zzZQC<>();
    private zzYU6 zzYqG;
    private HtmlSaveOptions zzYt2;

    public static class zzZ {
        private boolean zzYqD;
        private int zzYqE;

        public zzZ(int i, boolean z) {
            this.zzYqE = i;
            this.zzYqD = z;
        }

        public final boolean zzZ2p() {
            return this.zzYqD;
        }

        public final int zzZ2q() {
            return this.zzYqE;
        }
    }

    public zzZI0(com.aspose.words.internal.zzZOP zzzop, HtmlSaveOptions htmlSaveOptions) throws Exception {
        this.zzYt2 = htmlSaveOptions;
        this.zzYqG = new zzYU6(zzzop, com.aspose.words.internal.zzHZ.zzY(htmlSaveOptions.zzZ9Y()), htmlSaveOptions.getPrettyFormat(), true);
    }

    private static boolean zzKJ(String str) {
        return ("ol".equals(str) || "ul".equals(str)) ? false : true;
    }

    public final void endDocument() {
        while (this.zzYqF.size() != 0) {
            endElement(null);
        }
        int iZzYZ1 = this.zzYt2.zzYZ1();
        if (iZzYZ1 == 1 || iZzYZ1 == 3) {
            this.zzYqG.endDocument();
        } else {
            this.zzYqG.flush();
        }
    }

    public final void endElement(String str) {
        zzZ zzzPop = this.zzYqF.pop();
        if (this.zzYt2.getPrettyFormat()) {
            this.zzYqG.setPrettyFormat(!zzzPop.zzZ2p());
        }
        if (zzzPop.zzZ2q() == 1) {
            this.zzYqG.zzo();
        } else {
            this.zzYqG.zzm();
        }
    }

    public final void flush() {
        this.zzYqG.flush();
    }

    public final void writeString(String str) {
        this.zzYqG.writeString(str);
    }

    public final void zzKK(String str) {
        this.zzYqG.zzY(com.aspose.words.internal.zzZKN.format("<!--[if {0}]>", str), true);
    }

    public final void zzX(String str, String str2) {
        this.zzYqG.zzX(str, str2);
    }

    public final void zzY(String str, boolean z) {
        this.zzYqG.zzY(str, z);
    }

    public final void zzZ(String str) {
        int iZzYZ1 = this.zzYt2.zzYZ1();
        if (iZzYZ1 == 0) {
            zzZN(str, 0);
            if (this.zzYt2.getExportDocumentProperties()) {
                this.zzYqG.zzX("xmlns:o", "urn:schemas-microsoft-com:office:office");
                return;
            }
            return;
        }
        if (iZzYZ1 != 1) {
            if (iZzYZ1 == 2) {
                this.zzYqG.zzY(str, (String) null, (String) null);
                zzZN(str, 0);
                return;
            } else if (iZzYZ1 != 3) {
                return;
            }
        }
        this.zzYqG.zzV(false);
        this.zzYqG.zzY(str, this.zzYt2.zzYZc() ? "-//W3C//DTD XHTML 1.1//EN" : "-//W3C//DTD XHTML 1.0 Transitional//EN", this.zzYt2.zzYZc() ? "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" : "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd");
        zzZN(str, 0);
        this.zzYqG.zzX("xmlns", "http://www.w3.org/1999/xhtml");
        if (this.zzYt2.getExportDocumentProperties()) {
            this.zzYqG.zzX("xmlns:o", "urn:schemas-microsoft-com:office:office");
        }
    }

    public final void zzZ2r() {
        this.zzYqG.zzY("<![endif]-->", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZN(String str, int i) {
        boolean z = true;
        if (this.zzYt2.getPrettyFormat() && !zzKJ(str)) {
            this.zzYqG.setPrettyFormat(true);
        }
        if (this.zzYt2.getPrettyFormat() && this.zzYqF.size() > 0 && zzKJ(str)) {
            zzZ zzzPeek = this.zzYqF.peek();
            if (!zzzPeek.zzZ2p() && zzzPeek.zzZ2q() != 2) {
            }
        } else {
            z = false;
        }
        this.zzYqG.zzZ(str, z);
        if (this.zzYt2.getPrettyFormat()) {
            this.zzYqG.setPrettyFormat(!z);
        }
        this.zzYqF.push(new zzZ(i, z));
    }

    public final void zzp() {
        endElement(null);
    }

    public final void zzZ(String str, String str2) {
        zzZN(str, 0);
        writeString(str2);
        endElement(null);
    }
}
