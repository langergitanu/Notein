package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9T extends zzY9U {
    private int zzXbo;
    private int zzZGF;

    private zzY9T(int i, int i2) {
        this.zzXbo = i;
        this.zzZGF = i2;
    }

    public static zzY9T zzY(AbsolutePositionTab absolutePositionTab) {
        zzY9T zzy9t = new zzY9T(zzrt(absolutePositionTab.getAlignment()), absolutePositionTab.zzc1());
        zzy9t.setLeader(zzru(absolutePositionTab.zzc0()));
        return zzy9t;
    }

    private static int zzrt(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalStateException("Unexpected alignment value.");
    }

    private static int zzru(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Unexpected leader character value.");
    }

    public final int getAlignment() {
        return this.zzXbo;
    }

    @Override // com.aspose.words.zzY9U
    public final boolean isAbsolute() {
        return true;
    }

    @Override // com.aspose.words.zzY9U, com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9T zzy9t = new zzY9T(this.zzXbo, this.zzZGF);
        zzy9t.setLeader(getLeader());
        zzZB(zzy9t);
        return zzy9t;
    }

    public final int zzc1() {
        return this.zzZGF;
    }
}
