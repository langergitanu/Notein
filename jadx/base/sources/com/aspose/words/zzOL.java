package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzOL {
    private zzLH zzZpQ;
    private ArrayList<zzLH> zzZpR;
    private int zzZpS;

    private zzOL(ArrayList<zzLH> arrayList) {
        this.zzZpR = arrayList;
    }

    private void advance() {
        if (this.zzZpS < this.zzZpR.size()) {
            int i = this.zzZpS + 1;
            this.zzZpS = i;
            this.zzZpQ = i < this.zzZpR.size() ? this.zzZpR.get(this.zzZpS) : zzLH.zzZo4;
        }
    }

    private void zzZVY() {
        if (this.zzZpQ.isWhitespace()) {
            advance();
        }
    }

    private String zzZVZ() {
        this.zzZpS = 0;
        ArrayList<zzLH> arrayList = this.zzZpR;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        this.zzZpQ = this.zzZpS < this.zzZpR.size() ? this.zzZpR.get(this.zzZpS) : zzLH.zzZo4;
        zzZVY();
        if (this.zzZpQ.getType() != 0) {
            return null;
        }
        String text = ((zzLJ) this.zzZpQ).getText();
        if (text.length() == 0) {
            return null;
        }
        advance();
        zzZVY();
        if (this.zzZpQ.zzYC()) {
            return text;
        }
        return null;
    }

    public static String zzs(ArrayList<zzLH> arrayList) {
        return new zzOL(arrayList).zzZVZ();
    }
}
