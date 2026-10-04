package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUR extends zzZ28 {
    private boolean zzYLq;
    private boolean zzYLr;
    private boolean zzYLs;
    private boolean zzYLt;

    private void reset() {
        this.zzYLt = false;
        this.zzYLs = false;
        this.zzYLr = false;
        this.zzYLq = false;
    }

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 2;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) {
        int i;
        if (zzz27.zzYIS()) {
            reset();
        }
        int i2 = 0;
        char c = 0;
        while (true) {
            if (i2 >= zzz27.zzYIT().length()) {
                break;
            }
            char cCharAt = zzz27.zzYIT().charAt(i2);
            if (cCharAt != c) {
                if (cCharAt != '*') {
                    if (cCharAt == '~') {
                        if (this.zzYLq) {
                            setCount(getCount() + 1);
                        }
                        this.zzYLq = !this.zzYLq;
                    } else if (cCharAt == '_') {
                        int iZzZ = com.aspose.words.internal.zzZYD.zzZ(zzz27.zzYIT(), '_', i2 + 1);
                        if (!zzZ1N.zzS(c, iZzZ == -1 ? (char) 0 : zzz27.zzYIT().charAt(iZzZ))) {
                            if (this.zzYLs) {
                                if (iZzZ == -1) {
                                    iZzZ = zzz27.zzYIT().length();
                                }
                                setCount(getCount() + (iZzZ - i2 <= 2 ? 1 : 2));
                            }
                            this.zzYLs = !this.zzYLs;
                        }
                    } else if (cCharAt == '`') {
                        if (this.zzYLr) {
                            setCount(getCount() + 1);
                        }
                        this.zzYLr = !this.zzYLr;
                    }
                } else if ((c != '\\' && c != '/') || (i = i2 + 1) >= zzz27.zzYIT().length() || zzz27.zzYIT().charAt(i) != '.') {
                    if (!this.zzYLt) {
                        int i3 = i2 + 1;
                        if (i3 < zzz27.zzYIT().length() && !com.aspose.words.internal.zzZKU.zzG(zzz27.zzYIT().charAt(i3))) {
                            this.zzYLt = true;
                        }
                    } else if (!com.aspose.words.internal.zzZKU.zzG(c)) {
                        int i4 = i2;
                        while (i4 < zzz27.zzYIT().length() && zzz27.zzYIT().charAt(i4) == '*') {
                            i4++;
                        }
                        setCount(getCount() + (i4 - i2 > 2 ? 2 : 1));
                        this.zzYLt = false;
                    }
                }
                c = cCharAt;
            }
            i2++;
        }
        return getCount() > 0;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 1;
    }
}
