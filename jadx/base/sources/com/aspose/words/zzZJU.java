package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJU extends zzZ1L {
    private HtmlSaveOptions zzYt2;
    private com.aspose.words.internal.zzZYG<String> zzYt3;
    private zzZAO zzYt4;
    private String zzYt1 = "";
    private boolean zzYsZ = false;
    private ArrayList<String> zzYsY = new ArrayList<>();
    private ArrayList<String> zzYt0 = new ArrayList<>();

    public zzZJU(com.aspose.words.internal.zzZYG<String> zzzyg, HtmlSaveOptions htmlSaveOptions, zzZAO zzzao) {
        this.zzYt3 = zzzyg;
        this.zzYt2 = htmlSaveOptions;
        this.zzYt4 = zzzao;
    }

    private String zzKZ(String str) {
        String str2;
        com.aspose.words.internal.zzZYG<String> zzzyg = this.zzYt3;
        return (zzzyg == null || (str2 = zzzyg.get(str)) == null) ? str : str2;
    }

    public static boolean zzL0(String str) {
        return com.aspose.words.internal.zzZKN.zzX(str, "_goback", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) || com.aspose.words.internal.zzZKN.zzS(str, "_Hlt", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    public final void zzL1(String str) {
        zzZP(str, 20);
        zzZO(str, 20);
    }

    @Override // com.aspose.words.zzZ1L
    public final void zzW(BookmarkStart bookmarkStart) {
        zzZP(bookmarkStart.getName(), bookmarkStart.getNodeType());
    }

    @Override // com.aspose.words.zzZ1L
    public final boolean zzZ3Z() {
        return false;
    }

    public final void zzZ40() {
        if (com.aspose.words.internal.zzZKN.equals(this.zzYt1, "")) {
            return;
        }
        this.zzYt4.zzZ3E().endElement("a");
        this.zzYt1 = "";
    }

    public final void zzZ41() {
        this.zzYsZ = false;
        for (String str : this.zzYsY) {
            zzZP(str, 9);
            zzZO(str, 10);
        }
        this.zzYsY.clear();
    }

    public final void zzZ42() {
        this.zzYsZ = true;
        zzZ40();
    }

    public final void zzZO(String str, int i) {
        if (zzL0(str)) {
            return;
        }
        String strZzKZ = zzKZ(str);
        String str2 = "";
        if (com.aspose.words.internal.zzZKN.equals(this.zzYt1, strZzKZ)) {
            this.zzYt4.zzZ3E().endElement("a");
            this.zzYt1 = "";
            return;
        }
        if (this.zzYt2.getExportRoundtripInformation() && this.zzYt0.contains(strZzKZ)) {
            if (i == 10) {
                str2 = "-aw-bookmark-end";
            } else if (i == 34) {
                str2 = "-aw-comment-end";
            }
            if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                this.zzYt4.zzZ3E().zzZN("span", 0);
                zzLU zzlu = new zzLU();
                zzlu.zzZs(str2, strZzKZ);
                this.zzYt4.zzZ3C().zzV(zzlu);
                this.zzYt4.zzZ3E().endElement("span");
            }
        }
    }

    public final void zzZP(String str, int i) {
        if (zzL0(str)) {
            return;
        }
        String strZzKZ = zzKZ(str);
        String str2 = "";
        if (!this.zzYsZ) {
            if (!com.aspose.words.internal.zzZKN.equals(this.zzYt1, "")) {
                this.zzYt4.zzZ3E().endElement("a");
            }
            this.zzYt1 = strZzKZ;
            com.aspose.words.internal.zzZQG.zzZ(this.zzYt0, strZzKZ);
            this.zzYt4.zzZ3E().zzZN("a", 0);
            this.zzYt4.zzZ3E().zzX(this.zzYt2.zzYZa() ? "id" : "name", strZzKZ);
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYsY, strZzKZ);
        if (this.zzYt2.getExportRoundtripInformation()) {
            if (i == 9) {
                str2 = "-aw-bookmark-start";
            } else if (i == 33) {
                str2 = "-aw-comment-start";
            }
            if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                this.zzYt4.zzZ3E().zzZN("span", 0);
                zzLU zzlu = new zzLU();
                zzlu.zzZs(str2, strZzKZ);
                this.zzYt4.zzZ3C().zzV(zzlu);
                this.zzYt4.zzZ3E().endElement("span");
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYt0, strZzKZ);
        }
    }

    @Override // com.aspose.words.zzZ1L
    public final void zzW(BookmarkEnd bookmarkEnd) {
        zzZO(bookmarkEnd.getName(), bookmarkEnd.getNodeType());
    }
}
