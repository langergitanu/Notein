package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAF extends zzYAG {
    private zzYAH zzXcb;
    private zzYN8 zzYBS;
    private HashMap<FieldChar, zzYAH> zzYRu;

    public zzYAF(zzYAH zzyah, zzZOR zzzor) {
        super(zzzor);
        this.zzXcb = zzyah;
        this.zzYRu = new HashMap<>();
        this.zzYBS = zzyah.zzZ8m();
        zzYAH zzyahZzY5C = zzyah.zzY5C();
        zzY(zzyahZzY5C.zzaa(), zzyahZzY5C, zzyah.zzY5A());
    }

    private void zzY(zzY9C zzy9c, zzYAU zzyau, zzYAU zzyau2) {
        zzYBY zzybyZzQJ;
        zzZ4N zzz4nZzYPe = zzy9c.zzY4s().zzYPe();
        if (zzyau != null) {
            zzz4nZzYPe.zzX(zzyau);
        } else {
            zzz4nZzYPe.zz0Z();
        }
        do {
            zzYAU zzyau3 = (zzYAU) zzz4nZzYPe.zzYPi();
            if (zzz4nZzYPe.zzYPi() == zzyau2) {
                break;
            }
            zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyau3, zzYAH.class);
            if (zzyah != null && zzyau3.zzZ1s() == 2) {
                this.zzYRu.put(zzyah.zzY5z(), zzyah);
            }
            if ((zzyau3 instanceof zzY9X) && (zzybyZzQJ = zzyau3.zzQJ(false)) != null) {
                zzY(zzybyZzQJ, null, null);
            }
        } while (zzz4nZzYPe.moveNext());
        if (zzyau2 != null) {
            zzz4nZzYPe.zzYPi();
        }
    }

    @Override // com.aspose.words.zzYAG
    public final zzYAH zzI(FieldStart fieldStart) {
        return (zzYAH) com.aspose.words.internal.zzQW.zzZ(this.zzYRu, fieldStart);
    }

    @Override // com.aspose.words.zzZQJ
    public final zzYAD zzX(Footnote footnote) {
        return this.zzXcb.zzab().zzY(footnote);
    }

    @Override // com.aspose.words.zzYAG
    public final boolean zzY5w() {
        return true;
    }

    @Override // com.aspose.words.zzYAG
    public final zzYN8 zzZ8m() {
        return this.zzYBS;
    }

    @Override // com.aspose.words.zzYAG
    public final void zzZp(zzYAU zzyau) {
        zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAH.class);
        if (zzyah == null || zzyau.zzZ1s() != 2) {
            return;
        }
        this.zzYRu.put(zzyah.zzY5z(), zzyah);
    }
}
