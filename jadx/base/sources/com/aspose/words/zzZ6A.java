package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6A extends zzZ6C {
    public zzZ6A(zzYMD zzymd) throws Exception {
        super(zzymd);
    }

    private boolean zzYRE() throws Exception {
        zzZcg().getResult();
        return zzZcg().zzZ6R() == 0 && zzZcg().getResult().contains("\r");
    }

    private static int zzZ(zzYAH zzyah) throws Exception {
        zzYAU zzyau = (zzYAU) zzyah.zzY5B().zzYo1();
        zzYAH zzyahZzY5A = zzyah.zzY5A();
        zzYAU zzyau2 = zzyau;
        while (true) {
            zzYAU zzyau3 = (zzYAU) zzyau2.zz5Z();
            if (zzyau3 == null || zzyau3 == zzyahZzY5A) {
                break;
            }
            zzyau2 = zzyau3;
        }
        return zzyau2.getRight() - zzyau.getX();
    }

    private FormField zzZcg() {
        return ((zzYAC) this.zzYgm).zzY5r();
    }

    @Override // com.aspose.words.zzZ6C
    public final int getMaxLength() {
        return zzZcg().getMaxLength();
    }

    @Override // com.aspose.words.zzZ6C
    public final String getName() {
        return zzZcg().getName();
    }

    @Override // com.aspose.words.zzZ6C
    public final int getSelectedIndex() {
        return zzZcg().getDropDownSelectedIndex();
    }

    @Override // com.aspose.words.zzZ6C
    public final long getSize() throws Exception {
        int iZzZ6R = zzZcg().zzZ6R();
        if (iZzZ6R != 0) {
            if (iZzZ6R == 1) {
                int size = ((zzYAU) this.zzYgm).zzY6N().getSize();
                return com.aspose.words.internal.zzSA.zzE(com.aspose.words.internal.zzZPX.zzZm(size, size));
            }
            if (iZzZ6R != 2) {
                throw new IllegalStateException("Unknown form field type.");
            }
        }
        zzZ55 zzz55 = (zzZ55) this.zzYgm.zzZZJ();
        return com.aspose.words.internal.zzSA.zzE(com.aspose.words.internal.zzZPX.zzZm(zzZ(((zzYAC) this.zzYgm).zzY5q()), zzYRE() ? zzz55.getHeight() : zzz55.getContentHeight()));
    }

    @Override // com.aspose.words.zzZ6C
    public final boolean isEnabled() {
        return zzZcg().getEnabled();
    }

    @Override // com.aspose.words.zzZ6C
    public final String zzYQ() {
        return "";
    }

    @Override // com.aspose.words.zzZ6C
    public final String zzYR() {
        return zzZcg().getResult();
    }

    @Override // com.aspose.words.zzZ6C
    public final int zzYRH() {
        return zzZcg().zzZ6R();
    }

    @Override // com.aspose.words.zzZ6C
    public final float zzYS() throws Exception {
        return zzYRE() ? com.aspose.words.internal.zzZPW.zzYz(getSize()) - zzYRY().getDescentPoints() : super.zzYS();
    }

    @Override // com.aspose.words.zzZ6H
    public final com.aspose.words.internal.zzZQ4 zzYTP() throws Exception {
        return zzZcg().zzZ6R() == 0 ? new com.aspose.words.internal.zzZQ4(super.zzYTP().getX(), super.zzYTP().getY(), Float.intBitsToFloat((int) getSize()), super.zzYTP().getHeight()) : super.zzYTP();
    }

    @Override // com.aspose.words.zzZ6C
    public final ArrayList<String> zzZA() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < zzZcg().getDropDownItems().getCount(); i++) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzZcg().getDropDownItems().get(i));
        }
        return arrayList;
    }
}
