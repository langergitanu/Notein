package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzTG extends zzZ6T {
    private zzZ6T zzZsw;
    private zzZ6T zzZsx;

    @Override // com.aspose.words.zzZ6T
    public void merge() throws Exception {
        zza9();
        if (zzYTp() == null) {
            return;
        }
        zzZ(zzYTp().zzYTt());
        ArrayList<zzZ6T> arrayListZzX = zzYTp().zzX((zzZ6T) null);
        for (int i = 0; i < arrayListZzX.size(); i++) {
            arrayListZzX.get(i).zzY((zzTG) null);
        }
    }

    @Override // com.aspose.words.zzZ6T
    public void zzW(zzZ6T zzz6t) throws Exception {
        zza9();
        zzz6t.zza9();
        zza9().zzZ(this, null, zz6u());
        if (zzz6t.zzYTp() == null) {
            return;
        }
        ArrayList<zzZ6T> arrayListZzX = zzX(zzz6t.zzYTp());
        for (int size = arrayListZzX.size() - 1; size >= 0; size--) {
            arrayListZzX.get(size).zzZ((zzTG) null);
        }
    }

    @Override // com.aspose.words.zzZ6T
    public final ArrayList<zzZ6T> zzX(zzZ6T zzz6t) {
        if (zzz6t == null) {
            zzz6t = this.zzZsx;
        }
        zzz6t.zza9();
        ArrayList<zzZ6T> arrayList = new ArrayList<>();
        while (zzz6t != null) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz6t);
            zzz6t = zzz6t.zzYTp();
        }
        return arrayList;
    }

    @Override // com.aspose.words.zzZ6T
    public void zzY(zzZ6T zzz6t) throws Exception {
        zzZ6T zzz6t2 = this.zzZsx;
        if (zzz6t2 == zzz6t) {
            this.zzZsx = zzz6t2.zzYTp();
        }
        zzZ6T zzz6t3 = this.zzZsw;
        if (zzz6t3 == zzz6t) {
            this.zzZsw = zzz6t3.zzYTo();
        }
        if (zzz6t.zzYTo() != null) {
            zzz6t.zzYTo().zzU(zzz6t.zzYTp());
        }
        if (zzz6t.zzYTp() != null) {
            zzz6t.zzYTp().zzT(zzz6t.zzYTo());
        }
        zzz6t.zzT(null);
        zzz6t.zzU(null);
        zzz6t.zzZ((zzZ6T) null);
        if (this.zzZsx == null) {
            remove();
        }
    }

    @Override // com.aspose.words.zzZ6T
    public void zzZ(zzZ6T zzz6t, zzZ6T zzz6t2, zzZ6T zzz6t3) throws Exception {
        zzZ6T zzz6t4;
        zzz6t3.zza9();
        if (zzz6t != null) {
            zzz6t.zza9();
        }
        if (zzz6t2 != null) {
            zzz6t2.zza9();
        }
        if (zzz6t2 == null && zzz6t == null && (zzz6t4 = this.zzZsx) != null) {
            zzz6t2 = zzz6t4;
        }
        if (zzz6t2 != null) {
            zzz6t3.zzT(zzz6t2.zzYTo());
            zzz6t3.zzU(zzz6t2);
        } else if (zzz6t != null) {
            zzz6t3.zzT(zzz6t);
            zzz6t3.zzU(zzz6t.zzYTp());
        }
        if (zzz6t3.zzYTp() != null) {
            zzz6t3.zzYTp().zzT(zzz6t3);
        }
        if (zzz6t3.zzYTo() != null) {
            zzz6t3.zzYTo().zzU(zzz6t3);
        }
        zzZ6T zzz6t5 = this.zzZsx;
        if (zzz6t5 == null || zzz6t5.zzYTo() == zzz6t3) {
            this.zzZsx = zzz6t3;
        }
        zzZ6T zzz6t6 = this.zzZsw;
        if (zzz6t6 == null || zzz6t6.zzYTp() == zzz6t3) {
            this.zzZsw = zzz6t3;
        }
        zzz6t3.zzZ((zzZ6T) this);
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYAU zzZXV() {
        zzZ6T zzz6t = this.zzZsw;
        if (zzz6t == null) {
            return null;
        }
        return zzz6t.zzZXV();
    }

    public final zzTC zzZXW() {
        return zzTC.zzZ(this.zzZsx, true);
    }

    public final boolean zzZXX() {
        return this.zzZsx == null;
    }

    public final zzZ6T zzZXY() {
        return this.zzZsw;
    }

    public final zzZ6T zzZXZ() {
        return this.zzZsx;
    }

    @Override // com.aspose.words.zzZ6T
    public void zzZY0() throws Exception {
        for (zzZ6T zzz6tZzYTo = this.zzZsw; zzz6tZzYTo != null; zzz6tZzYTo = zzz6tZzYTo.zzYTo()) {
            zzz6tZzYTo.zzYTr();
        }
        for (zzZ6T zzz6tZzYTo2 = this.zzZsw; zzz6tZzYTo2 != null; zzz6tZzYTo2 = zzz6tZzYTo2.zzYTo()) {
            zzz6tZzYTo2.zzYTq();
        }
    }
}
