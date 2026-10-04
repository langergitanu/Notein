package com.aspose.words;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY59 extends zzZQF {
    private boolean zzX2v;
    private zzZ zzX2w;
    private zzZPF zzX2x;
    private String zzX2y;
    private com.aspose.words.internal.zzZQH<String, zzY5B> zzX2z = new com.aspose.words.internal.zzZQH<>();
    private Bookmark zzYDu;
    private String zzYFr;
    private boolean zzYia;
    private FieldSeq zzYig;
    private Document zzZEY;

    public static class zzZ extends zzZQF {
        private com.aspose.words.internal.zzZYI zzX2u = new com.aspose.words.internal.zzZYI(false);
        private zzZPF zzX2x;
        private String zzYFr;
        private FieldSeq zzYig;

        private zzZ(String str, zzZPF zzzpf) {
            this.zzYFr = str;
            this.zzX2x = zzzpf;
        }

        public static zzZ zzZ(Document document, String str, zzZPF zzzpf) {
            if (str == null) {
                return null;
            }
            zzZ zzz = new zzZ(str, zzzpf);
            zzz.zzZQ(document);
            return zzz;
        }

        @Override // com.aspose.words.DocumentVisitor
        public final int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
            this.zzX2u.set(bookmarkStart.getName(), zzY59.zzZ(this.zzYFr, this.zzYig, this.zzX2x));
            return super.visitBookmarkStart(bookmarkStart);
        }

        public final int zzAd(String str) {
            int i = this.zzX2u.get(str);
            if (com.aspose.words.internal.zzZYI.zzWm(i)) {
                return 0;
            }
            return i;
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() {
            if (zzZe6() != 12) {
                return;
            }
            FieldSeq fieldSeq = (FieldSeq) zzZe7();
            if (com.aspose.words.internal.zzZKN.equals(fieldSeq.getSequenceIdentifier(), this.zzYFr)) {
                this.zzYig = fieldSeq;
            }
        }
    }

    private zzY59(Document document, String str, Bookmark bookmark, String str2, boolean z, zzZPF zzzpf) {
        this.zzZEY = document;
        this.zzX2y = str;
        this.zzYDu = bookmark;
        this.zzYFr = str2;
        this.zzX2x = zzzpf;
        this.zzX2v = bookmark == null;
        this.zzYia = z;
        this.zzX2w = zzZ.zzZ(document, str2, zzzpf);
    }

    private int getSequenceNumber() throws Exception {
        return zzZ(this.zzYFr, this.zzYig, this.zzX2x);
    }

    private int zzAe(String str) {
        zzZ zzz = this.zzX2w;
        if (zzz == null) {
            return Integer.MIN_VALUE;
        }
        return zzz.zzAd(str);
    }

    private void zzU(FieldSeq fieldSeq) {
        if (this.zzYFr != null && com.aspose.words.internal.zzZKN.equals(fieldSeq.getSequenceIdentifier(), this.zzYFr)) {
            this.zzYig = fieldSeq;
        }
    }

    private boolean zzWe(Node node) throws Exception {
        Bookmark bookmark = this.zzYDu;
        return bookmark != null && node == bookmark.getBookmarkEnd();
    }

    private boolean zzWf(Node node) {
        Bookmark bookmark = this.zzYDu;
        return bookmark != null && node == bookmark.getBookmarkStart();
    }

    private void zzX(FieldRD fieldRD) throws Exception {
        Document documentZzZ;
        if (this.zzYia && (documentZzZ = zzZQ3.zzZ(fieldRD)) != null) {
            com.aspose.words.internal.zzZQH<String, zzY5B> zzzqhZzZ = zzZ(documentZzZ, this.zzX2y, null, this.zzYFr, false, this.zzX2x != null ? new zzZPF(documentZzZ) : null);
            if (zzzqhZzZ.getCount() == 0) {
                return;
            }
            for (Map.Entry<String, zzY5B> entry : zzzqhZzZ) {
                zzY5B zzy5b = (zzY5B) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<String, TValue>) this.zzX2z, entry.getKey());
                if (zzy5b == null) {
                    this.zzX2z.set(entry.getKey(), entry.getValue());
                } else {
                    zzy5b.zzZ(entry.getValue());
                }
            }
        }
    }

    public static ArrayList<zzY5B> zzZ(Document document, String str, Bookmark bookmark, String str2, zzZPF zzzpf) {
        return zzZ(document, str, bookmark, str2, true, zzzpf).zzl9();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) throws Exception {
        return zzWe(bookmarkEnd) ? 2 : 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        this.zzX2v = this.zzX2v || zzWf(bookmarkStart);
        return 0;
    }

    @Override // com.aspose.words.zzZQF
    public final void zzZe8() throws Exception {
        int iZzZe6 = zzZe6();
        if (iZzZe6 == 11) {
            zzX((FieldRD) zzZe7());
        } else if (iZzZe6 == 12) {
            zzU((FieldSeq) zzZe7());
        } else {
            if (iZzZe6 != 74) {
                return;
            }
            zzZ((FieldTA) zzZe7());
        }
    }

    private int zzY(FieldTA fieldTA) throws Exception {
        return zzYAH.zzZt(this.zzZEY.zzZqh().zzJ(fieldTA.getStart()));
    }

    private static com.aspose.words.internal.zzZQH<String, zzY5B> zzZ(Document document, String str, Bookmark bookmark, String str2, boolean z, zzZPF zzzpf) {
        zzY59 zzy59 = new zzY59(document, str, bookmark, str2, z, zzzpf);
        zzy59.zzZQ(document);
        return zzy59.zzX2z;
    }

    private void zzZ(FieldTA fieldTA) throws Exception {
        if (this.zzX2v) {
            String longCitation = fieldTA.getLongCitation();
            if (!com.aspose.words.internal.zzZKN.zzU3(longCitation) && com.aspose.words.internal.zzZKN.equals(fieldTA.getEntryCategory(), this.zzX2y)) {
                zzZ(zzZ(longCitation, fieldTA), fieldTA);
            }
        }
    }

    private zzY5B zzZ(String str, FieldTA fieldTA) {
        zzY5B zzy5b = (zzY5B) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZQH<String, TValue>) this.zzX2z, str);
        if (zzy5b != null) {
            return zzy5b;
        }
        zzY5B zzy5b2 = new zzY5B(fieldTA.zzZc3());
        this.zzX2z.set(str, zzy5b2);
        return zzy5b2;
    }

    private void zzZ(zzY5B zzy5b, FieldTA fieldTA) throws Exception {
        boolean zIsBold = fieldTA.isBold();
        boolean zIsItalic = fieldTA.isItalic();
        if (fieldTA.zzZc4()) {
            String pageRangeBookmarkName = fieldTA.getPageRangeBookmarkName();
            zzYAT zzyatZzCY = !com.aspose.words.internal.zzZKN.zzU3(pageRangeBookmarkName) ? this.zzZEY.zzZqh().zzCY(pageRangeBookmarkName) : null;
            if (zzyatZzCY != null) {
                zzYAT zzyat = zzyatZzCY;
                int iZzZt = zzYAH.zzZt(zzyat);
                int iZzZt2 = zzYAH.zzZt(zzyat.zzY7o());
                int iZzAe = zzAe(pageRangeBookmarkName);
                if (iZzZt != iZzZt2) {
                    zzy5b.zzZ(zIsBold, zIsItalic, iZzZt, iZzZt2, iZzAe);
                    return;
                } else {
                    zzy5b.zzZ(zIsBold, zIsItalic, iZzZt, iZzAe);
                    return;
                }
            }
            zzy5b.zzY(zIsBold, zIsItalic, zzY(fieldTA), getSequenceNumber());
            return;
        }
        zzy5b.zzZ(zIsBold, zIsItalic, zzY(fieldTA), getSequenceNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzZ(String str, FieldSeq fieldSeq, zzZAY zzzay) throws Exception {
        zzTL zztlZzz;
        if (str == null) {
            return Integer.MIN_VALUE;
        }
        if (fieldSeq == null || (zztlZzz = zzzay.zzz(fieldSeq)) == null) {
            return 0;
        }
        return (int) zztlZzz.zz8Y();
    }
}
