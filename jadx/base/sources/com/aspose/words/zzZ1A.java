package com.aspose.words;

import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1A extends zzYZP {
    private float zzHi;
    private int zzY2u;
    private char zzY2v;

    public zzZ1A(zzZ14 zzz14, char c, zzYEF zzyef) {
        super(zzz14, Character.toString(c), zzyef);
        this.zzY2v = c;
        this.zzY2u = zzYw(c);
    }

    private com.aspose.words.internal.zzZG zzYHf() throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzUW(zzYGf(), zzZr().zzPg(), new String(new char[]{this.zzY2v})).zzZ9(this.zzY2v));
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzZy()));
        return zzzg;
    }

    private static int zzYw(char c) {
        if (c == 780) {
            return 2;
        }
        if (c == 8417 || c == 8400 || c == 8401 || c == 8406 || c == 8407) {
            return 3;
        }
        if (c == 8411 || c == 8412) {
            return 0;
        }
        switch (c) {
            case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
            case 769:
                return 0;
            case 770:
            case 771:
                return 2;
            default:
                switch (c) {
                    case 774:
                        return 2;
                    case 775:
                    case 776:
                        return 0;
                    default:
                        return 1;
                }
        }
    }

    private void zzZ(float f, com.aspose.words.internal.zzZG zzzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzYGj().zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzg);
        if (com.aspose.words.internal.zzAN.zzP(zzzq4ZzZ.getWidth(), f)) {
            return;
        }
        float width = f / zzzq4ZzZ.getWidth();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(width, 1.0f, 1);
        zzzg.zzY(zzp9);
    }

    public final void setWidth(float f) {
        this.zzHi = f;
    }

    @Override // com.aspose.words.zzYZP, com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        com.aspose.words.internal.zzZG zzzgZzYHf = zzYHf();
        zzYGn().zzX(zzzgZzYHf);
        int i = this.zzY2u;
        if (i == 1) {
            zzZ(this.zzHi, zzzgZzYHf);
        } else if (i == 2) {
            zzZ(this.zzHi / 2.0f, zzzgZzYHf);
        } else if (i == 3) {
            zzY9M.zzW(zzzgZzYHf, this.zzHi);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzYGj().zzZMR().zzZ((com.aspose.words.internal.zzZL) zzzgZzYHf);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-zzzq4ZzZ.getX(), -zzzq4ZzZ.getY(), 1);
        zzzgZzYHf.zzY(zzp9);
        zzI(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight()));
    }
}
