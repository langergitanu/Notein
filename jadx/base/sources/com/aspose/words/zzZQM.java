package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQM {
    private Field zzZz7;

    public zzZQM(Field field) {
        this.zzZz7 = field;
    }

    public final Field getField() {
        return this.zzZz7;
    }

    public final Table getParentTable() {
        if (zzZex() != null) {
            return zzZex().getParentRow().getParentTable();
        }
        return null;
    }

    public final boolean zzLZ(String str) throws Exception {
        return zzZOO.zzT(this.zzZz7, str) != null;
    }

    public final Cell zzZex() {
        return (Cell) this.zzZz7.getStart().getAncestor(7);
    }
}
