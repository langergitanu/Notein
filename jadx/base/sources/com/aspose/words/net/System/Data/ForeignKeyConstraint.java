package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZKN;

/* JADX INFO: loaded from: classes5.dex */
public class ForeignKeyConstraint extends Constraint {
    private int zzWQO;
    private UniqueConstraint zzWQP;
    private Rule zzWQQ;
    private Rule zzWQR;
    private DataColumn[] zzWRA;
    private DataColumn[] zzWRz;

    public ForeignKeyConstraint(String str, DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2) {
        Rule rule = Rule.CASCADE;
        this.zzWQR = rule;
        this.zzWQQ = rule;
        this.zzWQO = zzZ.NONE$380b9eb7;
        setConstraintName(str);
        DataColumn[] dataColumnArr3 = new DataColumn[dataColumnArr.length];
        this.zzWRA = dataColumnArr3;
        System.arraycopy(dataColumnArr, 0, dataColumnArr3, 0, dataColumnArr.length);
        DataColumn[] dataColumnArr4 = new DataColumn[dataColumnArr2.length];
        this.zzWRz = dataColumnArr4;
        System.arraycopy(dataColumnArr2, 0, dataColumnArr4, 0, dataColumnArr2.length);
    }

    private boolean zzXQ6() {
        if (getTable().getDataSet() != null && getRelatedTable().getDataSet() != null) {
            boolean z = false;
            for (DataRow dataRow : getTable().getRows()) {
                if (dataRow.getRowState() != 8 && !DataRow.zzZ(this.zzWRz) && !zzW.zzZ(getRelatedTable(), this.zzWRA, this.zzWRz, dataRow)) {
                    String[] strArr = new String[this.zzWRz.length];
                    int i = 0;
                    while (true) {
                        DataColumn[] dataColumnArr = this.zzWRz;
                        if (i >= dataColumnArr.length) {
                            break;
                        }
                        strArr[i] = dataRow.get(dataColumnArr[i]).toString();
                        i++;
                    }
                    dataRow.zzXT(zzZKN.format("ForeignKeyConstraint {0} requires the child key values ({1}) to exist in the parent table.", getConstraintName()), zzZKN.zzY(",", strArr));
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static void zzY(DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2) throws DataException {
        if (dataColumnArr == null || dataColumnArr2 == null) {
            throw new IllegalArgumentException();
        }
        if (dataColumnArr.length <= 0 || dataColumnArr2.length <= 0) {
            throw new IllegalArgumentException("Neither ParentColumns or ChildColumns can't be zero length.");
        }
        if (dataColumnArr.length != dataColumnArr2.length) {
            throw new IllegalArgumentException("Parent columns and child columns must be the same length.");
        }
        DataTable table = dataColumnArr[0].getTable();
        DataTable table2 = dataColumnArr2[0].getTable();
        for (int i = 0; i < dataColumnArr.length; i++) {
            DataColumn dataColumn = dataColumnArr[i];
            DataColumn dataColumn2 = dataColumnArr2[i];
            if (dataColumn.getTable() == null) {
                throw new IllegalArgumentException("All columns must belong to a table. ColumnName: " + dataColumn.getColumnName() + " does not belong to a table.");
            }
            if (table != dataColumn.getTable()) {
                throw new DataException("Parent columns must all belong to the same table.");
            }
            if (dataColumn2.getTable() == null) {
                throw new IllegalArgumentException("All columns must belong to a table. ColumnName: " + dataColumn.getColumnName() + " does not belong to a table.");
            }
            if (table2 != dataColumn2.getTable()) {
                throw new DataException("Child columns must all belong to the same table.");
            }
        }
    }

    @Override // com.aspose.words.net.System.Data.Constraint
    public void addToConstraintCollectionSetup(ConstraintCollection constraintCollection) throws DataException, InvalidConstraintException {
        if (constraintCollection.getTable() != getTable()) {
            throw new DataException("This constraint cannot be added since ForeignKey doesn't belong to table " + getRelatedTable().getTableName() + ".");
        }
        zzY(this.zzWRA, this.zzWRz);
        zzY(this.zzWRA);
        if (((getTable().getDataSet() != null && getTable().getDataSet().getEnforceConstraints()) || (getTable().getDataSet() == null && getTable().getEnforceConstraints())) && zzXQ6()) {
            throw new IllegalArgumentException("This constraint cannot be enabled as not all values have corresponding parent values.");
        }
    }

    public boolean equals(Object obj) {
        ForeignKeyConstraint foreignKeyConstraint = obj instanceof ForeignKeyConstraint ? (ForeignKeyConstraint) obj : null;
        return foreignKeyConstraint != null && DataColumn.areColumnSetsTheSame(getRelatedColumns(), foreignKeyConstraint.getRelatedColumns()) && DataColumn.areColumnSetsTheSame(getColumns(), foreignKeyConstraint.getColumns());
    }

    public int getAcceptRejectRule$30d0d6a8() {
        return this.zzWQO;
    }

    public DataColumn[] getColumns() {
        return this.zzWRz;
    }

    public Rule getDeleteRule() {
        return this.zzWQR;
    }

    public DataColumn[] getRelatedColumns() {
        return this.zzWRA;
    }

    public DataTable getRelatedTable() {
        DataColumn[] dataColumnArr = this.zzWRA;
        if (dataColumnArr == null || dataColumnArr.length <= 0) {
            throw new UnsupportedOperationException("Property not accessible because 'Object reference not set to an instance of an object'");
        }
        return dataColumnArr[0].getTable();
    }

    public DataTable getTable() {
        DataColumn[] dataColumnArr = this.zzWRz;
        if (dataColumnArr == null || dataColumnArr.length <= 0) {
            throw new UnsupportedOperationException("Property not accessible because 'Object reference not set to an instance of an object'");
        }
        return dataColumnArr[0].getTable();
    }

    public Rule getUpdateRule() {
        return this.zzWQQ;
    }

    public int hashCode() {
        int iHashCode = getColumns().length > 0 ? 32 ^ getColumns()[0].hashCode() : 32;
        for (int i = 1; i < getColumns().length; i++) {
            iHashCode ^= getColumns()[1].hashCode();
        }
        int iHashCode2 = getRelatedColumns().length > 0 ? 88 ^ getColumns()[0].hashCode() : 88;
        for (int i2 = 1; i2 < getRelatedColumns().length; i2++) {
            iHashCode2 ^= getRelatedColumns()[1].hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    public ForeignKeyConstraint(DataColumn dataColumn, DataColumn dataColumn2) {
        Rule rule = Rule.CASCADE;
        this.zzWQR = rule;
        this.zzWQQ = rule;
        this.zzWQO = zzZ.NONE$380b9eb7;
        this.zzWRA = new DataColumn[]{dataColumn};
        this.zzWRz = new DataColumn[]{dataColumn2};
    }

    public ForeignKeyConstraint(String str, DataColumn dataColumn, DataColumn dataColumn2) {
        this(str, new DataColumn[]{dataColumn}, new DataColumn[]{dataColumn2});
    }

    private void zzY(DataColumn[] dataColumnArr) throws DataException, InvalidConstraintException {
        if (dataColumnArr != null) {
            DataColumn dataColumn = dataColumnArr[0];
            UniqueConstraint uniqueConstraintZzZ = dataColumn != null ? UniqueConstraint.zzZ(dataColumn.getTable().getConstraints(), dataColumnArr) : null;
            if (uniqueConstraintZzZ == null) {
                uniqueConstraintZzZ = new UniqueConstraint(dataColumnArr, false);
                dataColumnArr[0].getTable().getConstraints().add(uniqueConstraintZzZ);
            }
            this.zzWQP = uniqueConstraintZzZ;
            uniqueConstraintZzZ.zzZ(this);
            return;
        }
        throw new IllegalArgumentException("ParentColumns can't be null");
    }
}
