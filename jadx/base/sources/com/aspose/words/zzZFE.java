package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFE {
    private boolean zzYmx;
    private boolean zzYmy;
    private RevisionOptions zzYmz;
    private zzZAO zzYt4;
    private HashMap<String, com.aspose.words.internal.zzPV> zzZvf = new HashMap<>();

    public zzZFE(RevisionOptions revisionOptions, zzZAO zzzao) {
        this.zzYmz = revisionOptions;
        this.zzYt4 = zzzao;
    }

    private com.aspose.words.internal.zzPV zzKe(String str) {
        return this.zzYmz.getDeletedTextColor() != 20 ? zzYJB.zzpx(this.zzYmz.getDeletedTextColor()) : zzSX(str);
    }

    private com.aspose.words.internal.zzPV zzKf(String str) {
        return this.zzYmz.getInsertedTextColor() != 20 ? zzYJB.zzpx(this.zzYmz.getInsertedTextColor()) : zzSX(str);
    }

    private com.aspose.words.internal.zzPV zzSX(String str) {
        if (this.zzZvf.containsKey(str)) {
            return this.zzZvf.get(str);
        }
        com.aspose.words.internal.zzPV zzpvZzpw = zzYJB.zzpw(this.zzZvf.size());
        this.zzZvf.put(str, zzpvZzpw);
        return zzpvZzpw;
    }

    public final void zzY(boolean z, boolean z2, String str, com.aspose.words.internal.zzZQ9 zzzq9, boolean z3) {
        this.zzYmx = true;
        this.zzYt4.zzZ3E().zzZN("del", 0);
        zzLU zzlu = new zzLU();
        if (z) {
            zzY(zzlu, str, z3);
        }
        if (z2) {
            zzZ(zzlu, str, zzzq9);
        }
        if (zzlu.getCount() != 0) {
            this.zzYt4.zzZ3C().zzV(zzlu);
        }
    }

    public final void zzYZp() {
        if (this.zzYmx) {
            this.zzYmx = false;
            this.zzYt4.zzZ3E().endElement("del");
        }
        if (this.zzYmy) {
            this.zzYmy = false;
            this.zzYt4.zzZ3E().endElement("ins");
        }
    }

    public final void zzZ(boolean z, boolean z2, String str, com.aspose.words.internal.zzZQ9 zzzq9, boolean z3) {
        this.zzYmy = true;
        this.zzYt4.zzZ3E().zzZN("ins", 0);
        zzLU zzlu = new zzLU();
        if (z) {
            zzZ(zzlu, str, z3);
        }
        if (z2) {
            zzZ(zzlu, str, zzzq9);
        }
        if (zzlu.getCount() != 0) {
            this.zzYt4.zzZ3C().zzV(zzlu);
        }
    }

    public final void zzY(Font font, String str, boolean z) {
        com.aspose.words.internal.zzPV zzpvZzKe;
        if (this.zzYmz.getDeletedTextEffect() == 1 || this.zzYmz.getDeletedTextEffect() == 2 || this.zzYmz.getDeletedTextEffect() == 3 || this.zzYmz.getDeletedTextEffect() == 4 || this.zzYmz.getDeletedTextEffect() == 5 || this.zzYmz.getDeletedTextEffect() == 6 || this.zzYmz.getDeletedTextEffect() == 7) {
            if (z) {
                zzpvZzKe = zzYJB.zzXBw;
            } else {
                zzpvZzKe = zzKe(str);
            }
            font.zzm(zzpvZzKe);
        }
        int deletedTextEffect = this.zzYmz.getDeletedTextEffect();
        if (deletedTextEffect == 2) {
            font.setBold(true);
            font.setBoldBi(true);
        } else if (deletedTextEffect == 3) {
            font.setItalic(true);
            font.setItalicBi(true);
        } else {
            if (deletedTextEffect != 8) {
                return;
            }
            font.setHidden(true);
        }
    }

    public final void zzZ(Font font, String str, boolean z) {
        com.aspose.words.internal.zzPV zzpvZzKf;
        if (this.zzYmz.getInsertedTextEffect() == 1 || this.zzYmz.getInsertedTextEffect() == 2 || this.zzYmz.getInsertedTextEffect() == 3 || this.zzYmz.getInsertedTextEffect() == 4 || this.zzYmz.getInsertedTextEffect() == 5 || this.zzYmz.getInsertedTextEffect() == 6) {
            if (z) {
                zzpvZzKf = zzYJB.zzXBw;
            } else {
                zzpvZzKf = zzKf(str);
            }
            font.zzm(zzpvZzKf);
        }
        int insertedTextEffect = this.zzYmz.getInsertedTextEffect();
        if (insertedTextEffect == 2) {
            font.setBold(true);
            font.setBoldBi(true);
        } else {
            if (insertedTextEffect != 3) {
                return;
            }
            font.setItalic(true);
            font.setItalicBi(true);
        }
    }

    private void zzZ(zzLU zzlu, String str, boolean z) {
        com.aspose.words.internal.zzPV zzpvZzKf;
        int insertedTextEffect = this.zzYmz.getInsertedTextEffect();
        if (insertedTextEffect == 0 || insertedTextEffect == 1 || insertedTextEffect == 2 || insertedTextEffect == 3) {
            zzlu.zzSe("none");
        } else if (insertedTextEffect == 6) {
            zzlu.zzSe("line-through");
        }
        if (this.zzYmz.getInsertedTextEffect() == 1 || this.zzYmz.getInsertedTextEffect() == 4 || this.zzYmz.getInsertedTextEffect() == 5 || this.zzYmz.getInsertedTextEffect() == 6) {
            if (z) {
                zzpvZzKf = zzYJB.zzXBw;
            } else {
                zzpvZzKf = zzKf(str);
            }
            zzlu.zzY("color", zzpvZzKf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzY(zzLU zzlu, String str, boolean z) {
        com.aspose.words.internal.zzPV zzpvZzKe;
        int deletedTextEffect = this.zzYmz.getDeletedTextEffect();
        if (deletedTextEffect == 0 || deletedTextEffect == 1 || deletedTextEffect == 2 || deletedTextEffect == 3) {
            zzlu.zzSe("none");
        } else if (deletedTextEffect == 4 || deletedTextEffect == 5) {
            zzlu.zzSe("underline");
        } else if (deletedTextEffect == 8) {
        }
        if (this.zzYmz.getDeletedTextEffect() == 1 || this.zzYmz.getDeletedTextEffect() == 4 || this.zzYmz.getDeletedTextEffect() == 5 || this.zzYmz.getDeletedTextEffect() == 6 || this.zzYmz.getDeletedTextEffect() == 7) {
            if (z) {
                zzpvZzKe = zzYJB.zzXBw;
            } else {
                zzpvZzKe = zzKe(str);
            }
            zzlu.zzY("color", zzpvZzKe);
        }
    }

    private static void zzZ(zzLU zzlu, String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzlu.setString("-aw-revision-author", str);
        }
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9, com.aspose.words.internal.zzZQ9.zz35)) {
            return;
        }
        zzlu.setString("-aw-revision-datetime", com.aspose.words.internal.zzJB.zzQ(zzzq9));
    }
}
