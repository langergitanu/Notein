package com.aspose.words.net.System.Data;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class UniqueConstraint extends Constraint {
    private final DataTable zzMz;
    private ForeignKeyConstraint zzWQD;
    private DataColumn[] zzWQE;
    private boolean zzWQF;
    private final zzU zzWQG;

    public UniqueConstraint(String str, DataColumn[] dataColumnArr, boolean z) {
        if (dataColumnArr == null || dataColumnArr.length == 0) {
            throw new IllegalArgumentException("Columns");
        }
        setConstraintName(str);
        DataColumn[] dataColumnArr2 = new DataColumn[dataColumnArr.length];
        this.zzWQE = dataColumnArr2;
        System.arraycopy(dataColumnArr, 0, dataColumnArr2, 0, dataColumnArr.length);
        this.zzWQF = z;
        DataTable table = this.zzWQE[0].getTable();
        this.zzMz = table;
        this.zzWQG = table.zzXQj().zzX(this.zzWQE);
    }

    private static void zzT(DataColumn[] dataColumnArr) throws InvalidConstraintException {
        if (dataColumnArr == null) {
            throw new IllegalArgumentException();
        }
        if (dataColumnArr.length <= 0) {
            throw new InvalidConstraintException("Must be at least one column.");
        }
        DataTable table = dataColumnArr[0].getTable();
        for (DataColumn dataColumn : dataColumnArr) {
            zzW(dataColumn);
            if (table != dataColumn.getTable()) {
                throw new InvalidConstraintException("Columns must be from the same table.");
            }
        }
    }

    private static void zzW(DataColumn dataColumn) {
        if (dataColumn == null) {
            throw new NullPointerException("Object reference not set to an instance of an object.");
        }
        if (dataColumn.getTable() == null) {
            throw new IllegalArgumentException("Column must belong to a table.");
        }
    }

    private boolean zzXQ6() {
        if (this.zzWQG.zzXQ4()) {
            throw null;
        }
        return false;
    }

    @Override // com.aspose.words.net.System.Data.Constraint
    public void addToConstraintCollectionSetup(ConstraintCollection constraintCollection) throws InvalidConstraintException {
        UniqueConstraint uniqueConstraintZzW;
        for (int i = 0; i < getColumns().length; i++) {
            if (getColumns()[i].getTable() != constraintCollection.getTable()) {
                throw new IllegalArgumentException("These mDataColumns don't point to this table.");
            }
        }
        zzT(this.zzWQE);
        UniqueConstraint uniqueConstraintZzZ = zzZ(constraintCollection, getColumns());
        if (uniqueConstraintZzZ != null) {
            throw new IllegalArgumentException("Unique constraint already exists for these mDataColumns. Existing ConstraintName is " + uniqueConstraintZzZ.getConstraintName());
        }
        if (isPrimaryKey() && (uniqueConstraintZzW = zzW(constraintCollection)) != null) {
            uniqueConstraintZzW.zzWQF = false;
        }
        DataColumn[] dataColumnArr = this.zzWQE;
        if (dataColumnArr.length == 1) {
            dataColumnArr[0].setUnique(true);
        }
        if (zzXQ6()) {
            throw new IllegalArgumentException("These mDataColumns don't currently have unique values.");
        }
    }

    public boolean equals(Object obj) {
        UniqueConstraint uniqueConstraint = obj instanceof UniqueConstraint ? (UniqueConstraint) obj : null;
        if (uniqueConstraint == null) {
            return false;
        }
        return DataColumn.areColumnSetsTheSame(uniqueConstraint.getColumns(), getColumns());
    }

    public DataColumn[] getColumns() {
        return this.zzWQE;
    }

    public DataTable getTable() {
        return this.zzMz;
    }

    public int hashCode() {
        int iHashCode = getColumns().length > 0 ? 42 ^ getColumns()[0].hashCode() : 42;
        for (int i = 1; i < getColumns().length; i++) {
            iHashCode ^= getColumns()[1].hashCode();
        }
        return iHashCode;
    }

    public boolean isPrimaryKey() {
        return this.zzWQF;
    }

    public final void zzXQ0() {
        this.zzWQF = false;
    }

    public final void zzZ(ForeignKeyConstraint foreignKeyConstraint) {
        this.zzWQD = foreignKeyConstraint;
    }

    public static UniqueConstraint zzZ(ConstraintCollection constraintCollection, DataColumn[] dataColumnArr) {
        if (constraintCollection == null) {
            throw new IllegalArgumentException("Collection can't be null.");
        }
        if (dataColumnArr == null) {
            return null;
        }
        Iterator<Constraint> it = constraintCollection.iterator();
        while (it.hasNext()) {
            Constraint next = it.next();
            if (next instanceof UniqueConstraint) {
                UniqueConstraint uniqueConstraint = next != null ? (UniqueConstraint) next : null;
                if (DataColumn.areColumnSetsTheSame(uniqueConstraint.getColumns(), dataColumnArr)) {
                    return uniqueConstraint;
                }
            }
        }
        return null;
    }

    private static UniqueConstraint zzW(ConstraintCollection constraintCollection) {
        UniqueConstraint uniqueConstraint;
        if (constraintCollection != null) {
            Iterator<Constraint> it = constraintCollection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Constraint next = it.next();
                uniqueConstraint = next instanceof UniqueConstraint ? (UniqueConstraint) next : null;
                if (uniqueConstraint != null && uniqueConstraint.isPrimaryKey()) {
                    break;
                }
            }
            return uniqueConstraint;
        }
        throw new IllegalArgumentException("Collection can't be null.");
    }

    public static void zzZ(ConstraintCollection constraintCollection, UniqueConstraint uniqueConstraint) {
        if (constraintCollection != null) {
            if (constraintCollection.contains(uniqueConstraint) && uniqueConstraint != null) {
                throw new IllegalArgumentException("newPrimaryKey must belong to collection.");
            }
            UniqueConstraint uniqueConstraintZzW = zzW(constraintCollection);
            if (uniqueConstraintZzW != null) {
                uniqueConstraintZzW.zzWQF = false;
            }
            if (uniqueConstraint != null) {
                uniqueConstraint.zzWQF = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ConstraintCollection can't be null.");
    }

    public UniqueConstraint(DataColumn[] dataColumnArr, boolean z) {
        if (dataColumnArr != null && dataColumnArr.length != 0) {
            DataColumn[] dataColumnArr2 = new DataColumn[dataColumnArr.length];
            this.zzWQE = dataColumnArr2;
            System.arraycopy(dataColumnArr, 0, dataColumnArr2, 0, dataColumnArr.length);
            this.zzWQF = z;
            DataTable table = this.zzWQE[0].getTable();
            this.zzMz = table;
            this.zzWQG = table.zzXQj().zzX(this.zzWQE);
            return;
        }
        throw new IllegalArgumentException("Columns");
    }

    public UniqueConstraint(DataColumn[] dataColumnArr) {
        this(dataColumnArr, false);
    }

    public UniqueConstraint(DataColumn dataColumn) {
        this(new DataColumn[]{dataColumn}, false);
    }
}
