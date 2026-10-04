package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ27 {
    private int zzY4g;
    private com.aspose.words.internal.zzIM<Integer> zzY4h;
    private com.aspose.words.internal.zzIM<Integer> zzY4i;
    private String zzY4j;
    private String zzY4k;
    private com.aspose.words.internal.zzRK zzY4l;

    public zzZ27(com.aspose.words.internal.zzRK zzrk) {
        this.zzY4l = zzrk;
    }

    private boolean canRead() throws Exception {
        if (this.zzY4l.zzQY() >= 1024) {
            return false;
        }
        if (this.zzY4l.zzR2()) {
            return true;
        }
        this.zzY4l.zzR6();
        return this.zzY4l.zzR2();
    }

    public static boolean zzY(com.aspose.words.internal.zzIM<Integer> zzim) {
        Iterator<Integer> it = zzim.iterator();
        while (it.hasNext()) {
            if (zzv4(it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    private void zzYIU() throws Exception {
        if (!canRead() || '\n' == this.zzY4l.readChar()) {
            return;
        }
        this.zzY4l.zzR4();
    }

    private static boolean zzv4(int i) {
        return i == 3 || i == 6;
    }

    public final long getLength() throws Exception {
        return Math.min(this.zzY4l.zzR1().getLength(), 1024L);
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzY4l.zzQZ();
    }

    public final int zzYIO() {
        return this.zzY4g;
    }

    public final com.aspose.words.internal.zzIM<Integer> zzYIP() {
        return this.zzY4h;
    }

    public final com.aspose.words.internal.zzIM<Integer> zzYIQ() {
        return this.zzY4i;
    }

    public final boolean zzYIR() throws Exception {
        return !this.zzY4l.zzR2();
    }

    public final boolean zzYIS() {
        return com.aspose.words.internal.zzZYD.zzXh(this.zzY4k) || zzY(this.zzY4h);
    }

    public final String zzYIT() {
        return this.zzY4j;
    }

    public final boolean zzYIV() throws Exception {
        this.zzY4k = this.zzY4j;
        this.zzY4h = this.zzY4i;
        this.zzY4i = new com.aspose.words.internal.zzIM<>();
        StringBuilder sb = new StringBuilder();
        while (canRead()) {
            char c = this.zzY4l.readChar();
            if (zzY4Q.zzZ(c) && !zzY4Q.zzK(c, this.zzY4l.zzQZ().getCodePage())) {
                this.zzY4g++;
            }
            if (c == '\t') {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, 4));
            } else {
                if (c == '\n') {
                    sb.append('\n');
                    this.zzY4j = sb.toString();
                    return true;
                }
                if (c == '\r') {
                    sb.append('\n');
                    zzYIU();
                    this.zzY4j = sb.toString();
                    return true;
                }
                sb.append(c);
            }
        }
        String string = sb.toString();
        this.zzY4j = string;
        return string.length() > 0;
    }
}
