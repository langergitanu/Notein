package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMV extends zzTI {
    private static char[] zzYws = {'~', '`', '!', ':', '&', '*', '_', '<', IOUtils.DIR_SEPARATOR_WINDOWS, '[', ']', '{', '}'};
    private zzZMZ zzYwt;

    public static boolean zzS(String str, int i, int i2) {
        if ((i2 - i) + 1 <= 0) {
            return false;
        }
        while (i <= i2) {
            if (com.aspose.words.internal.zzZKU.zzG(str.charAt(i)) || com.aspose.words.internal.zzZ1.zzZ(zzYws, str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final String getText() {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", "[^", super.getText(), "]");
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzY(zzyi);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 11;
    }

    public static boolean zzZ(zzZMX zzzmx, zzJZ zzjz) {
        return zzzmx.zzZ6T() != null && zzS(zzzmx.getText(), zzzmx.getEnd() + 1, zzjz.getStart() - 1);
    }

    public final void zzZ(com.aspose.words.internal.zzIM<zzZMZ> zzim) {
        Iterator<zzZMZ> it = zzim.iterator();
        while (it.hasNext() && !zzZ(it.next())) {
        }
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) throws Exception {
        if (this.zzYwt == null) {
            zzz1t.zzZ3K().write(getText());
            return;
        }
        zzz1t.zzT(this);
        Iterator<zzYI> it = this.zzYwt.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzz1t);
        }
        zzz1t.zzS(this);
    }

    private boolean zzZ(zzZMZ zzzmz) {
        if (!com.aspose.words.internal.zzZKN.equals(zzzmz.zz9A(), super.getText())) {
            return false;
        }
        this.zzYwt = zzzmz;
        return true;
    }
}
