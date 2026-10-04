package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY43 extends zzYBS {
    private StringBuilder zzX0O;
    private boolean zzX0P;
    private boolean zzX0Q;
    private zzYE9 zzX0R;

    public zzY43(zzYE8 zzye8, zzYE9 zzye9) {
        super(zzye8);
        this.zzX0O = new StringBuilder();
        this.zzX0R = zzye9;
        this.zzX0Q = true;
    }

    private void zzXUc() {
        int i = 0;
        char c = this.zzXeJ.get(0);
        int iZza = com.aspose.words.internal.zzZVU.zza(c);
        if (iZza != 0) {
            iZza = 256;
        }
        int i2 = 1;
        for (int i3 = 1; i3 < this.zzXeJ.getLength(); i3++) {
            char c2 = this.zzXeJ.get(i3);
            int iZza2 = com.aspose.words.internal.zzZVU.zza(c2);
            char cZzX = com.aspose.words.internal.zzZVU.zzX(c, c2);
            if (com.aspose.words.internal.zzZVU.zz9(cZzX) != 0 || cZzX == 65535 || (iZza >= iZza2 && iZza != 0)) {
                if (iZza2 == 0) {
                    i = i2;
                    c = c2;
                }
                this.zzXeJ.zzV(i2, c2);
                i2++;
                iZza = iZza2;
            } else {
                zzL(cZzX, i);
                c = cZzX;
            }
        }
        this.zzXeJ.zzYdp();
    }

    private void zzXUd() {
        for (int i = 0; i < this.zzXpP.getLength(); i++) {
            this.zzX0O.setLength(0);
            zzZ(this.zzX0Q, this.zzXpP.get(i), this.zzX0O);
            for (int i2 = 0; i2 < this.zzX0O.length(); i2++) {
                char cCharAt = this.zzX0O.charAt(i2);
                this.zzX0R.zzXQ(cCharAt);
                int iZza = com.aspose.words.internal.zzZVU.zza(cCharAt);
                if (iZza != 0) {
                    this.zzX0P = true;
                }
                int length = this.zzXeJ.getLength();
                if (iZza != 0) {
                    while (length > 0 && com.aspose.words.internal.zzZVU.zza(this.zzXeJ.get(length - 1)) > iZza) {
                        length--;
                    }
                }
                this.zzXeJ.zzX(length, cCharAt, i);
            }
        }
    }

    private static void zzZ(boolean z, char c, StringBuilder sb) {
        String strZz5 = com.aspose.words.internal.zzZVU.zz5(c);
        if (strZz5 == null || (z && com.aspose.words.internal.zzZVU.zz9(c) != 0)) {
            sb.append(c);
            return;
        }
        for (int i = 0; i < strZz5.length(); i++) {
            zzZ(z, strZz5.charAt(i), sb);
        }
    }

    @Override // com.aspose.words.zzYBS
    public final void apply() {
        zzXUd();
        if (!this.zzX0P || this.zzXeJ.getLength() == 0) {
            return;
        }
        zzXUc();
    }
}
