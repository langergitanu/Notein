package com.aspose.words.net.System.Data;

import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.words.internal.zzZKN;

/* JADX INFO: loaded from: classes5.dex */
public class DataRelation {
    private DataColumn[] zzWRA;
    private String[] zzWRB;
    private String[] zzWRC;
    private DataTable zzWRD;
    private DataTable zzWRE;
    private String zzWRF;
    private DataKey zzWRG;
    private DataKey zzWRH;
    private boolean zzWRv;
    private ForeignKeyConstraint zzWRw;
    private UniqueConstraint zzWRx;
    private boolean zzWRy;
    private DataColumn[] zzWRz;
    private DataSet zzZQ8;
    private String zzZVA;
    private String zzZVB;

    public DataRelation(String str, DataTable dataTable, DataTable dataTable2, String[] strArr, String[] strArr2) {
        this.zzWRv = true;
        zzZ(str, zzY(dataTable, strArr), zzY(dataTable2, strArr2), true);
    }

    private static boolean zzP(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (!zzYJ(obj)) {
                return false;
            }
        }
        return true;
    }

    private ForeignKeyConstraint zzX(ConstraintCollection constraintCollection) {
        for (Constraint constraint : constraintCollection) {
            if (constraint instanceof ForeignKeyConstraint) {
                ForeignKeyConstraint foreignKeyConstraint = (ForeignKeyConstraint) constraint;
                if (zzZ(getChildColumns(), foreignKeyConstraint.getColumns()) && zzZ(getParentColumns(), foreignKeyConstraint.getRelatedColumns())) {
                    return foreignKeyConstraint;
                }
            }
        }
        return null;
    }

    private static DataColumn[] zzY(DataTable dataTable, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("Column names need to have at least one column name.");
        }
        if (dataTable == null) {
            throw new IllegalArgumentException("Table cannot be null");
        }
        DataColumn[] dataColumnArr = new DataColumn[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            DataColumn dataColumn = dataTable.getColumns().get(strArr[i]);
            if (dataColumn == null) {
                throw new IllegalArgumentException(zzZKN.format("The given column {0} does not exist in {1}", strArr[i], dataTable.getTableName()));
            }
            dataColumnArr[i] = dataColumn;
        }
        return dataColumnArr;
    }

    private static boolean zzYJ(Object obj) {
        return obj == null || DBNull.Value == obj;
    }

    private void zzZ(String str, DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2, boolean z) {
        if (dataColumnArr == null) {
            throw new IllegalArgumentException("parentColumns");
        }
        if (dataColumnArr2 == null) {
            throw new IllegalArgumentException("childColumns");
        }
        if (dataColumnArr.length != dataColumnArr2.length) {
            throw new IllegalArgumentException("Key Length mismatch");
        }
        int i = 0;
        DataTable table = dataColumnArr[0].getTable();
        DataTable table2 = dataColumnArr2[0].getTable();
        if (table.getDataSet() != table2.getDataSet()) {
            throw new IllegalStateException();
        }
        for (int i2 = 0; i2 < dataColumnArr.length; i2++) {
            if (dataColumnArr[i2].getTable().getDataSet() == null || dataColumnArr2[i2].getTable().getDataSet() == null) {
                throw new IllegalArgumentException("Parent or Child columns do not have DataSet");
            }
        }
        for (DataColumn dataColumn : dataColumnArr) {
            if (dataColumn.getTable() != table) {
                throw new IllegalStateException();
            }
        }
        for (DataColumn dataColumn2 : dataColumnArr2) {
            if (dataColumn2.getTable() != table2) {
                throw new IllegalStateException();
            }
        }
        for (int i3 = 0; i3 < dataColumnArr2.length; i3++) {
            if (!dataColumnArr[i3].zzX(dataColumnArr2[i3])) {
                throw new IllegalStateException("Parent Columns and Child Columns don't have matching column types");
            }
        }
        this.zzWRA = dataColumnArr;
        this.zzWRz = dataColumnArr2;
        this.zzWRE = table;
        this.zzWRD = table2;
        if (str == null) {
            str = "";
        }
        this.zzWRF = str;
        this.zzWRv = z;
        this.zzWRG = new DataKey(dataColumnArr);
        this.zzWRH = new DataKey(dataColumnArr2);
        this.zzZQ8 = table.getDataSet();
        this.zzWRC = new String[this.zzWRA.length];
        int i4 = 0;
        while (true) {
            DataColumn[] dataColumnArr3 = this.zzWRA;
            if (i4 >= dataColumnArr3.length) {
                break;
            }
            this.zzWRC[i4] = dataColumnArr3[i4].getColumnName();
            i4++;
        }
        this.zzWRB = new String[this.zzWRz.length];
        while (true) {
            DataColumn[] dataColumnArr4 = this.zzWRz;
            if (i >= dataColumnArr4.length) {
                return;
            }
            this.zzWRB[i] = dataColumnArr4[i].getColumnName();
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataRelation)) {
            return false;
        }
        DataRelation dataRelation = (DataRelation) obj;
        if (!getRelationName().equals(dataRelation.getRelationName()) || !getParentTableName().equals(dataRelation.getParentTableName()) || !getChildTableName().equals(dataRelation.getChildTableName()) || getParentColumnNames().length != dataRelation.getParentColumnNames().length || getChildColumnNames().length != dataRelation.getChildColumnNames().length) {
            return false;
        }
        for (int i = 0; i < getParentColumnNames().length; i++) {
            if (!getParentColumnNames()[i].equals(dataRelation.getParentColumnNames()[i]) || !getChildColumnNames()[i].equals(dataRelation.getChildColumnNames()[i])) {
                return false;
            }
        }
        return true;
    }

    public String[] getChildColumnNames() {
        return this.zzWRB;
    }

    public DataColumn[] getChildColumns() {
        return this.zzWRz;
    }

    public DataKey getChildKey() {
        return this.zzWRH;
    }

    public ForeignKeyConstraint getChildKeyConstraint() {
        return this.zzWRw;
    }

    public DataTable getChildTable() {
        return getChildKey().getTable();
    }

    public String getChildTableName() {
        DataTable childTable = getChildTable();
        if (childTable != null) {
            return childTable.getTableName();
        }
        return null;
    }

    public DataSet getDataSet() {
        return this.zzZQ8;
    }

    public String[] getParentColumnNames() {
        return this.zzWRC;
    }

    public DataColumn[] getParentColumns() {
        return this.zzWRA;
    }

    public DataKey getParentKey() {
        return this.zzWRG;
    }

    public UniqueConstraint getParentKeyConstraint() {
        return this.zzWRx;
    }

    public DataTable getParentTable() {
        return getParentKey().getTable();
    }

    public String getParentTableName() {
        DataTable parentTable = getParentTable();
        if (parentTable != null) {
            return parentTable.getTableName();
        }
        return null;
    }

    public String getRelationName() {
        return this.zzWRF;
    }

    public int hashCode() {
        int iHashCode = this.zzZVA.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(31, 31, this.zzWRF), 31, this.zzZVB);
        int i = 0;
        while (true) {
            String[] strArr = this.zzWRC;
            if (i >= strArr.length) {
                return iHashCode;
            }
            iHashCode = OooO00o.OooO0O0(iHashCode * 31, 31, strArr[i]) + this.zzWRB[i].hashCode();
            i++;
        }
    }

    public void setChildKeyConstraint(ForeignKeyConstraint foreignKeyConstraint) {
        this.zzWRw = foreignKeyConstraint;
    }

    public void setNested(boolean z) {
        this.zzWRy = z;
    }

    public void setParentKeyConstraint(UniqueConstraint uniqueConstraint) {
        this.zzWRx = uniqueConstraint;
    }

    public final void zzXQq() throws DataException, InvalidConstraintException {
        if (this.zzWRv) {
            ForeignKeyConstraint foreignKeyConstraintZzX = zzX(getChildTable().getConstraints());
            UniqueConstraint uniqueConstraintZzY = zzY(getParentTable().getConstraints());
            if (uniqueConstraintZzY == null) {
                uniqueConstraintZzY = new UniqueConstraint(getParentColumns(), false);
                getParentTable().getConstraints().add(uniqueConstraintZzY);
            }
            if (foreignKeyConstraintZzX == null) {
                foreignKeyConstraintZzX = new ForeignKeyConstraint(getRelationName(), getParentColumns(), getChildColumns());
                getChildTable().getConstraints().add(foreignKeyConstraintZzX);
            }
            setParentKeyConstraint(uniqueConstraintZzY);
            setChildKeyConstraint(foreignKeyConstraintZzX);
        }
    }

    public DataRelation(String str, DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2, boolean z) {
        this.zzWRv = true;
        zzZ(str, dataColumnArr, dataColumnArr2, z);
    }

    public DataRelation(String str, DataColumn dataColumn, DataColumn dataColumn2, boolean z) {
        this(str, new DataColumn[]{dataColumn}, new DataColumn[]{dataColumn2}, z);
    }

    private UniqueConstraint zzY(ConstraintCollection constraintCollection) {
        for (Constraint constraint : constraintCollection) {
            if (constraint instanceof UniqueConstraint) {
                UniqueConstraint uniqueConstraint = (UniqueConstraint) constraint;
                if (zzZ(getParentColumns(), uniqueConstraint.getColumns())) {
                    return uniqueConstraint;
                }
            }
        }
        return null;
    }

    public DataRelation(String str, DataColumn dataColumn, DataColumn dataColumn2) {
        this(str, new DataColumn[]{dataColumn}, new DataColumn[]{dataColumn2}, true);
    }

    public static DataRow[] zzZ(DataKey dataKey, DataKey dataKey2, DataRow dataRow) {
        Object[] keyValues = dataRow.getKeyValues(dataKey2);
        if (zzP(keyValues)) {
            return new DataRow[0];
        }
        return dataKey.getSortIndex().zzO(keyValues);
    }

    private static boolean zzZ(DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2) {
        if (dataColumnArr.length != dataColumnArr2.length) {
            return false;
        }
        for (int i = 0; i < dataColumnArr.length; i++) {
            DataColumn dataColumn = dataColumnArr[i];
            DataColumn dataColumn2 = dataColumnArr2[i];
            if (!dataColumn.getColumnName().equals(dataColumn2.getColumnName()) || dataColumn.getDataType() != dataColumn2.getDataType() || !dataColumn.getTable().getTableName().equals(dataColumn2.getTable().getTableName())) {
                return false;
            }
        }
        return true;
    }
}
