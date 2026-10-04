package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZHV;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class DataTable implements DataTableEventListener {
    private DataRelationCollection zzWR9;
    private final Set<DataRow> zzWRa;
    private final List<DataTableEventListener> zzWRb;
    private UniqueConstraint zzWRc;
    private ResultSet zzWRd;
    private final zzT zzWRe;
    private final ConstraintCollection zzWRf;
    private final DataColumnCollection zzWRg;
    private final DataRowCollection zzWRh;
    private boolean zzWRp;
    private String zzYDj;
    private String zzYr0;
    private DataSet zzZQ8;

    public DataTable() {
        this.zzWRh = new DataRowCollection(this);
        this.zzWRg = new DataColumnCollection(this);
        this.zzWRf = new ConstraintCollection(this);
        this.zzWRe = new zzT(this);
        this.zzYr0 = "";
        this.zzWRp = true;
        this.zzWRb = new ArrayList();
        this.zzWRa = new HashSet();
        this.zzWR9 = new DataRelationCollection();
    }

    public void acceptChanges() throws SQLException {
        zzY.zzV(this);
    }

    public synchronized void addEventListener(DataTableEventListener dataTableEventListener) {
        if (!this.zzWRb.contains(dataTableEventListener)) {
            this.zzWRb.add(dataTableEventListener);
        }
    }

    public synchronized void clearEventListneers() {
        this.zzWRb.clear();
    }

    public void close() throws Exception {
        ResultSet resultSet = this.zzWRd;
        if (resultSet != null) {
            if (resultSet.getStatement() != null) {
                this.zzWRd.getStatement().getConnection().close();
            }
            this.zzWRd = null;
            clearEventListneers();
        }
    }

    @Deprecated
    public boolean containsColumn(String str) {
        return getColumns().contains(str);
    }

    public DataRelationCollection getChildRelations() {
        for (DataRelation dataRelation : this.zzZQ8.getRelations()) {
            if (dataRelation.getParentTable() == this) {
                this.zzWR9.add(dataRelation);
            }
        }
        return this.zzWR9;
    }

    public String getColumnName(int i) {
        return this.zzWRg.get(i).getColumnName();
    }

    public DataColumnCollection getColumns() {
        return this.zzWRg;
    }

    public int getColumnsCount() {
        return this.zzWRg.getCount();
    }

    public ConstraintCollection getConstraints() {
        return this.zzWRf;
    }

    public DataSet getDataSet() {
        return this.zzZQ8;
    }

    public boolean getEnforceConstraints() {
        return this.zzWRp;
    }

    public String getNamespace() {
        return this.zzYr0;
    }

    public DataRelationCollection getParentRelations() {
        DataRelationCollection dataRelationCollection = new DataRelationCollection();
        for (DataRelation dataRelation : this.zzZQ8.getRelations()) {
            if (dataRelation.getChildTable() == this) {
                dataRelationCollection.add(dataRelation);
            }
        }
        return dataRelationCollection;
    }

    public DataColumn[] getPrimaryKey() {
        UniqueConstraint uniqueConstraint = this.zzWRc;
        return uniqueConstraint == null ? new DataColumn[0] : uniqueConstraint.getColumns();
    }

    public ResultSet getResultSet() {
        return this.zzWRd;
    }

    public DataRowCollection getRows() {
        return this.zzWRh;
    }

    public String getTableName() {
        return this.zzYDj;
    }

    public DataRow newRow() {
        return new DataRow(this);
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public void onDataColumnDeleted(DataColumn dataColumn) {
        Iterator<DataTableEventListener> it = this.zzWRb.iterator();
        while (it.hasNext()) {
            it.next().onDataColumnDeleted(dataColumn);
        }
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public void onDataColumnInserted(DataColumn dataColumn) {
        Iterator<DataTableEventListener> it = this.zzWRb.iterator();
        while (it.hasNext()) {
            it.next().onDataColumnInserted(dataColumn);
        }
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public void onDataRowChanged(DataRow dataRow) {
        dataRow.setRowState(16);
        this.zzWRa.add(dataRow);
        Iterator<DataTableEventListener> it = this.zzWRb.iterator();
        while (it.hasNext()) {
            it.next().onDataRowChanged(dataRow);
        }
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public void onDataRowDeleted(DataRow dataRow) {
        dataRow.setRowState(8);
        this.zzWRa.add(dataRow);
        Iterator<DataTableEventListener> it = this.zzWRb.iterator();
        while (it.hasNext()) {
            it.next().onDataRowDeleted(dataRow);
        }
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public void onDataRowInserted(DataRow dataRow) {
        if (dataRow.getRowState() == 4) {
            return;
        }
        dataRow.setRowState(1);
        this.zzWRa.add(dataRow);
        Iterator<DataTableEventListener> it = this.zzWRb.iterator();
        while (it.hasNext()) {
            it.next().onDataRowInserted(dataRow);
        }
    }

    public void refresh() {
        if (getResultSet() == null) {
            return;
        }
        try {
            this.zzWRa.clear();
            getRows().clear();
            getColumns().clear();
            zzY.zzZ(getResultSet(), this);
            zzY.zzY(getResultSet(), this);
        } catch (SQLException e) {
            zzZHV.zzY(e);
        }
    }

    public void removeEventListener(zzX zzx) {
        if (this.zzWRb.contains(zzx)) {
            this.zzWRb.remove(zzx);
        }
    }

    public void setEnforceConstraints(boolean z) {
        this.zzWRp = z;
    }

    public void setNamespace(String str) {
        this.zzYr0 = str;
    }

    public void setPrimaryKey(DataColumn[] dataColumnArr) throws DataException, InvalidConstraintException {
        if (dataColumnArr == null || dataColumnArr.length == 0) {
            UniqueConstraint uniqueConstraint = this.zzWRc;
            if (uniqueConstraint != null) {
                uniqueConstraint.zzXQ0();
                getConstraints().remove(this.zzWRc);
                this.zzWRc = null;
                return;
            }
            return;
        }
        UniqueConstraint uniqueConstraint2 = this.zzWRc;
        if (uniqueConstraint2 == null || !DataColumn.areColumnSetsTheSame(dataColumnArr, uniqueConstraint2.getColumns())) {
            UniqueConstraint uniqueConstraintZzZ = UniqueConstraint.zzZ(getConstraints(), dataColumnArr);
            if (uniqueConstraintZzZ == null) {
                for (DataColumn dataColumn : dataColumnArr) {
                    if (dataColumn.getTable() == null) {
                        break;
                    } else {
                        if (getColumns().indexOf(dataColumn) < 0) {
                            throw new IllegalArgumentException("PrimaryKey columns do not belong to this table.");
                        }
                    }
                }
                uniqueConstraintZzZ = new UniqueConstraint(dataColumnArr, false);
                getConstraints().add(uniqueConstraintZzZ);
            }
            UniqueConstraint uniqueConstraint3 = this.zzWRc;
            if (uniqueConstraint3 != null) {
                uniqueConstraint3.zzXQ0();
                getConstraints().remove(this.zzWRc);
                this.zzWRc = null;
            }
            UniqueConstraint.zzZ(getConstraints(), uniqueConstraintZzZ);
            this.zzWRc = uniqueConstraintZzZ;
            for (int i = 0; i < uniqueConstraintZzZ.getColumns().length; i++) {
                uniqueConstraintZzZ.getColumns()[i].setAllowDBNull(false);
            }
        }
    }

    public void setTableName(String str) {
        this.zzYDj = str;
    }

    public final void zzW(DataSet dataSet) {
        this.zzZQ8 = dataSet;
    }

    public final Set<DataRow> zzXQi() {
        return this.zzWRa;
    }

    public final zzT zzXQj() {
        return this.zzWRe;
    }

    public final zzU zzZ(zzS[] zzsArr) {
        DataColumn[] dataColumnArr = new DataColumn[zzsArr.length];
        for (int i = 0; i < zzsArr.length; i++) {
            dataColumnArr[i] = zzsArr[i].zzXQ1();
        }
        zzU zzuZzW = this.zzWRe.zzW(dataColumnArr);
        if (zzuZzW != null) {
            return zzuZzW;
        }
        throw new IllegalStateException("Index not found");
    }

    public final void zzW(List<String> list) {
        int size = list.size();
        DataColumn[] dataColumnArr = new DataColumn[size];
        for (int i = 0; i < size; i++) {
            dataColumnArr[i] = getColumns().get(list.get(i));
        }
        setPrimaryKey(dataColumnArr);
    }

    public DataTable(String str) {
        this.zzWRh = new DataRowCollection(this);
        this.zzWRg = new DataColumnCollection(this);
        this.zzWRf = new ConstraintCollection(this);
        this.zzWRe = new zzT(this);
        this.zzYr0 = "";
        this.zzWRp = true;
        this.zzWRb = new ArrayList();
        this.zzWRa = new HashSet();
        this.zzWR9 = new DataRelationCollection();
        this.zzYDj = str;
    }

    public DataTable(ResultSet resultSet) throws SQLException {
        this(resultSet, zzY.zzZ(resultSet));
    }

    public DataTable(ResultSet resultSet, String str) throws SQLException {
        this.zzWRh = new DataRowCollection(this);
        this.zzWRg = new DataColumnCollection(this);
        this.zzWRf = new ConstraintCollection(this);
        this.zzWRe = new zzT(this);
        this.zzYr0 = "";
        this.zzWRp = true;
        this.zzWRb = new ArrayList();
        this.zzWRa = new HashSet();
        this.zzWR9 = new DataRelationCollection();
        if (resultSet == null) {
            throw new IllegalArgumentException("resultSet");
        }
        if (str != null) {
            this.zzWRd = resultSet;
            this.zzYDj = str;
            refresh();
            return;
        }
        throw new IllegalArgumentException("tableName");
    }
}
