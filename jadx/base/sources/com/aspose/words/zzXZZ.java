package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZZ extends zzZ1H {
    private zzYU6 zzXSu;
    private zzZ1C zzYlo;

    public zzXZZ(zzYU6 zzyu6, zzZ1C zzz1c) {
        this.zzXSu = zzyu6;
        this.zzYlo = zzz1c;
    }

    @Override // com.aspose.words.zzZ1H
    public final String zzKR(String str) {
        return str;
    }

    @Override // com.aspose.words.zzZ1H
    public final void zzY(String str, String str2, String str3, boolean z) {
        this.zzXSu.zzY("Hyperlink");
        this.zzXSu.zz0("NavigateUri", str);
    }

    @Override // com.aspose.words.zzZ1H
    public final void zzZ1E() {
        this.zzXSu.zzp();
    }

    @Override // com.aspose.words.zzZ1H
    public final boolean zzr(String str, boolean z) {
        boolean zZzS = com.aspose.words.internal.zzZKN.zzS(str, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
        boolean z2 = !zZzS;
        if (zZzS) {
            this.zzYlo.zzT(1, "Bookmarks are not supported in XAML, so hyperlinks to bookmarks will not be exported.");
            return z2;
        }
        boolean z3 = com.aspose.words.internal.zzZVR.zzWo(str) != null;
        if (!z3) {
            this.zzYlo.zzT(1, com.aspose.words.internal.zzZKN.format("Uri {0} is not valid and hyperlink will not be exported.", str));
        }
        return z3;
    }
}
