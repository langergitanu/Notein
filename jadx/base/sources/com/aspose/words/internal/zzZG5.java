package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG5 extends zzZH4 {
    static final zzZG5 zzWN4 = new zzZG5(ControlChar.SPACE_CHAR, new zzZDZ(C18358t1.g.f56183c, C18358t1.g.f56183c));
    final zzZDZ zzWN3;

    public static final class zzZ extends zzZG6 {
        final zzZDZ zzWN3;
        final char zzWOS;
        int zzZF = 0;

        public zzZ(char c, zzZDZ zzzdz) {
            this.zzWOS = c;
            this.zzWN3 = zzzdz;
        }

        @Override // com.aspose.words.internal.zzZG6
        public final String zzXOZ() {
            char c = this.zzWOS;
            if (c != ' ') {
                if (c == '?' || c == '*') {
                    return null;
                }
                if (c != '+') {
                    throw new IllegalStateException(zzZH9.zzWPK);
                }
            }
            if (this.zzZF > 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(this.zzWOS == '+' ? "at least one" : "");
            sb.append(" element <");
            sb.append(this.zzWN3);
            sb.append(">");
            return sb.toString();
        }

        @Override // com.aspose.words.internal.zzZG6
        public final zzZG6 zzXP0() {
            char c = this.zzWOS;
            return c == '*' ? this : new zzZ(c, this.zzWN3);
        }

        @Override // com.aspose.words.internal.zzZG6
        public final String zzZ(zzZDZ zzzdz) {
            if (!zzzdz.equals(this.zzWN3)) {
                return "Expected element <" + this.zzWN3 + ">";
            }
            int i = this.zzZF + 1;
            this.zzZF = i;
            if (i <= 1) {
                return null;
            }
            char c = this.zzWOS;
            if (c != '?' && c != ' ') {
                return null;
            }
            return "More than one instance of element <" + this.zzWN3 + ">";
        }
    }

    private zzZG5(char c, zzZDZ zzzdz) {
        super(c);
        this.zzWN3 = zzzdz;
    }

    public static zzZG5 zzXNO() {
        return zzWN4;
    }

    public static zzZG5 zzZ(char c, zzZDZ zzzdz) {
        return new zzZG5(c, zzzdz);
    }

    public final String toString() {
        if (this.zzWOS == ' ') {
            return this.zzWN3.toString();
        }
        return this.zzWN3.toString() + this.zzWOS;
    }

    @Override // com.aspose.words.internal.zzZH4
    public final boolean zzFN() {
        return this.zzWOS == ' ';
    }

    @Override // com.aspose.words.internal.zzZH4
    public final zzZGC zzXP1() {
        zzZG4 zzzg4 = new zzZG4(this.zzWN3);
        char c = this.zzWOS;
        return c == '*' ? new zzZG7(zzzg4) : c == '?' ? new zzZGB(zzzg4) : c == '+' ? new zzZH5(zzzg4, new zzZG7(new zzZG4(this.zzWN3))) : zzzg4;
    }

    @Override // com.aspose.words.internal.zzZH4
    public final zzZG6 zzXP2() {
        return new zzZ(this.zzWOS, this.zzWN3);
    }
}
