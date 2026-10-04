package com.aspose.words.net.System.Data;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Constraint {
    private String name;
    private ConstraintCollection zzWRU;

    public abstract void addToConstraintCollectionSetup(ConstraintCollection constraintCollection) throws DataException, InvalidConstraintException;

    public String getConstraintName() {
        return this.name;
    }

    public void setConstraintName(String str) {
        this.name = str;
    }

    public final ConstraintCollection zzXQv() {
        return this.zzWRU;
    }

    public final void zzZ(ConstraintCollection constraintCollection) {
        this.zzWRU = constraintCollection;
    }
}
