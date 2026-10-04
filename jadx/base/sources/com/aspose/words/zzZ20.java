package com.aspose.words;

import androidx.core.net.MailTo;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ20 extends zzZ23 {
    private int zzY3T;
    private zzZ1W zzY3U;
    private zzZQX zzY3V;
    private int zzYGc;

    public zzZ20(FieldStart fieldStart, zzZ1W zzz1w, zzZ1M zzz1m) {
        super(fieldStart, zzz1m);
        this.zzY3U = zzz1w;
        this.zzY3T = zzz1m.zzYHF().zzYHQ();
        this.zzYGc = fieldStart.getFieldType();
    }

    private boolean zzYIu() {
        String string = zzYIy().toString();
        String hRef = this.zzY3V.getHRef();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzX(hRef, string, i) || (com.aspose.words.internal.zzZKN.zzS(hRef, MailTo.MAILTO_SCHEME, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE_IGNORE_CASE$4894b8c8) && com.aspose.words.internal.zzZKN.zzX(hRef.substring(7), string, i))) {
            return zzZH.zzS(hRef, 0, hRef.length() - 1);
        }
        return false;
    }

    @Override // com.aspose.words.zzZ23
    public final String getText() {
        if (this.zzY3V == null) {
            return "";
        }
        if (zzYIu()) {
            return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", '<', zzYIy(), '>');
        }
        String strZzIs = zzZ1N.zzIs(zzYIy().toString());
        String strZzX = zzZ1W.zzX(this.zzY3V);
        String strZzIu = zzZ1N.zzIu(this.zzY3V.getHRef());
        String str = this.zzY3V.getScreenTip().length() > 0 ? com.aspose.words.internal.zzZKN.format(" \"{0}\"", zzZ1N.zzIw(this.zzY3V.getScreenTip())) : "";
        if (com.aspose.words.internal.zzZYD.zzXk(strZzIu) && com.aspose.words.internal.zzZKN.zzS(strZzIu, "#", com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8)) {
            strZzIu = com.aspose.words.internal.zzZKN.zzU2(strZzIu);
        }
        String str2 = strZzIu;
        if (!this.zzY3U.zzE(strZzX, this.zzY3V.getHRef(), this.zzY3V.getScreenTip())) {
            this.zzY3U.zzD(com.aspose.words.internal.zzZKN.format("{0}{1}{2}", '[', strZzIs, ']'), this.zzY3V.getHRef(), this.zzY3V.getScreenTip());
        }
        return this.zzY3T == 1 || !this.zzY3U.zzYO(this.zzY3V.getHRef(), this.zzY3V.getScreenTip()) ? com.aspose.words.internal.zzZKN.format("{0}{1}{2}{3}{4}{5}{6}", '[', strZzIs, ']', '(', str2, str, ')') : com.aspose.words.internal.zzZKN.equals(strZzX, "") || com.aspose.words.internal.zzZKN.equals(strZzX.substring(1, strZzX.length() - 1), strZzIs) ? com.aspose.words.internal.zzZKN.format("{0}{1}{2}", '[', strZzIs, ']') : com.aspose.words.internal.zzZKN.format("{0}{1}{2}{3}", '[', strZzIs, ']', strZzX);
    }

    @Override // com.aspose.words.zzZ23
    public final void zzQ(Run run) {
        if (zzYIx()) {
            super.zzQ(run);
            return;
        }
        zzZQX zzzqxZzM7 = zzZQX.zzM7(zzY4E.zzr(run));
        this.zzY3V = zzzqxZzM7;
        if (this.zzYGc == 3) {
            zzzqxZzM7.setSubAddress(zzzqxZzM7.getAddress());
            this.zzY3V.setAddress("");
        }
        this.zzY3U.zzY(this.zzY3V);
    }
}
