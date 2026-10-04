package com.aspose.words.net.System.Data;

import OooO0O0.OooO0o;
import com.aspose.words.internal.zzZKV;
import com.aspose.words.net.System.Data.Common.DbDataReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class DataTableReader extends DbDataReader {
    private final DataTable[] zzWR7;
    private boolean zzWR6 = true;
    private DataTable zzWR5 = null;
    private int zzWR4 = -1;
    private int zzWR3 = -1;
    private DataTable zzWR2 = null;
    private DataRow zzWR1 = null;
    private boolean zzWR0 = true;
    private boolean zzWQZ = false;
    private boolean zzWQY = false;
    private boolean started = false;
    private boolean zzWQX = false;
    private zzX zzWQW = null;
    private boolean zzWQV = false;

    public DataTableReader(DataTable dataTable) {
        if (dataTable == null) {
            throw new IllegalArgumentException("DataTable cannot be null");
        }
        this.zzWR7 = new DataTable[]{dataTable};
        zzra();
    }

    private DataTable zzU(DataTable dataTable) throws Throwable {
        if (dataTable == null) {
            throw new IllegalArgumentException("DataTable cannot be null");
        }
        DataTable dataTable2 = new DataTable("SchemaTable");
        String str = "ColumnName";
        dataTable2.getColumns().add("ColumnName", String.class);
        DataColumnCollection columns = dataTable2.getColumns();
        Class cls = Integer.TYPE;
        columns.add("ColumnOrdinal", cls);
        dataTable2.getColumns().add("ColumnSize", cls);
        DataColumnCollection columns2 = dataTable2.getColumns();
        Class cls2 = Short.TYPE;
        columns2.add("NumericPrecision", cls2);
        dataTable2.getColumns().add("NumericScale", cls2);
        dataTable2.getColumns().add("DataType", Class.class);
        dataTable2.getColumns().add("ProviderType", cls);
        DataColumnCollection columns3 = dataTable2.getColumns();
        Class cls3 = Boolean.TYPE;
        columns3.add("IsLong", cls3);
        dataTable2.getColumns().add("AllowDBNull", cls3);
        dataTable2.getColumns().add("IsReadOnly", cls3);
        dataTable2.getColumns().add("IsRowVersion", cls3);
        dataTable2.getColumns().add("IsUnique", cls3);
        dataTable2.getColumns().add("IsKey", cls3);
        dataTable2.getColumns().add("IsAutoIncrement", cls3);
        dataTable2.getColumns().add("BaseCatalogName", String.class);
        String str2 = "BaseCatalogName";
        dataTable2.getColumns().add("BaseSchemaName", String.class);
        dataTable2.getColumns().add("BaseTableName", String.class);
        dataTable2.getColumns().add("BaseColumnName", String.class);
        DataColumnCollection columns4 = dataTable2.getColumns();
        String str3 = "IsRowVersion";
        Class cls4 = Long.TYPE;
        columns4.add("AutoIncrementSeed", cls4);
        dataTable2.getColumns().add("AutoIncrementStep", cls4);
        String str4 = "AutoIncrementStep";
        dataTable2.getColumns().add("DefaultValue", Object.class);
        dataTable2.getColumns().add("Expression", String.class);
        dataTable2.getColumns().add("ColumnMapping", MappingType.class);
        dataTable2.getColumns().add("BaseTableNamespace", String.class);
        dataTable2.getColumns().add("BaseColumnNamespace", String.class);
        int i = 0;
        while (i < this.zzWR2.getColumns().getCount()) {
            DataRow dataRowNewRow = dataTable2.newRow();
            DataColumn dataColumn = this.zzWR2.getColumns().get(i);
            dataRowNewRow.set(str, dataColumn.getColumnName());
            dataRowNewRow.set("BaseColumnName", dataColumn.getColumnName());
            dataRowNewRow.set("ColumnOrdinal", Integer.valueOf(dataColumn.getOrdinal()));
            dataRowNewRow.set("ColumnSize", Integer.valueOf(dataColumn.getMaxLength()));
            dataRowNewRow.set("NumericPrecision", (Object) null);
            dataRowNewRow.set("NumericScale", (Object) null);
            int i2 = i;
            dataRowNewRow.set("DataType", dataColumn.getDataType());
            dataRowNewRow.set("ProviderType", (Object) null);
            Boolean bool = Boolean.FALSE;
            dataRowNewRow.set("IsLong", bool);
            dataRowNewRow.set("AllowDBNull", Boolean.valueOf(dataColumn.getAllowDBNull()));
            dataRowNewRow.set("IsReadOnly", Boolean.valueOf(dataColumn.isReadOnly()));
            String str5 = str3;
            dataRowNewRow.set(str5, bool);
            String str6 = str;
            dataRowNewRow.set("IsUnique", Boolean.valueOf(dataColumn.isUnique()));
            dataRowNewRow.set("IsKey", Boolean.valueOf(zzZKV.zzZ(this.zzWR2.getPrimaryKey(), dataColumn) != -1));
            dataRowNewRow.set("IsAutoIncrement", Boolean.valueOf(dataColumn.getAutoIncrement()));
            dataRowNewRow.set("AutoIncrementSeed", Long.valueOf(dataColumn.getAutoIncrementSeed()));
            String str7 = str4;
            dataRowNewRow.set(str7, Long.valueOf(dataColumn.getAutoIncrementStep()));
            str4 = str7;
            String str8 = str2;
            dataRowNewRow.set(str8, this.zzWR2.getDataSet() != null ? this.zzWR2.getDataSet().getDataSetName() : null);
            str2 = str8;
            dataRowNewRow.set("BaseSchemaName", (Object) null);
            dataRowNewRow.set("BaseTableName", this.zzWR2.getTableName());
            dataRowNewRow.set("DefaultValue", dataColumn.getDefaultValue());
            dataRowNewRow.set("Expression", DBNull.Value);
            dataRowNewRow.set("ColumnMapping", Integer.valueOf(dataColumn.getColumnMapping()));
            dataRowNewRow.set("BaseTableNamespace", this.zzWR2.getNamespace());
            dataRowNewRow.set("BaseColumnNamespace", dataColumn.getNamespace());
            dataTable2.getRows().add(dataRowNewRow);
            i = i2 + 1;
            str = str6;
            str3 = str5;
        }
        this.zzWR5 = dataTable2;
        return dataTable2;
    }

    private void zzXQg() {
        if (this.zzWQX) {
            throw new IllegalStateException("Invalid DataTableReader state " + this.zzWR2.getTableName());
        }
        if (this.zzWQV) {
            throw new IllegalStateException("DataTableReader schema is invalid " + this.zzWR2.getTableName());
        }
    }

    private void zzXQh() {
        if (isClosed()) {
            throw new IllegalStateException("DataReader is closed.");
        }
    }

    private void zzY(DataRow dataRow) {
        if (dataRow == null || dataRow.getRowState() == 8) {
            this.zzWQX = true;
            throw new IllegalStateException("Invalid DataTableReader state " + this.zzWR2.getTableName());
        }
    }

    private void zzhe(int i) {
        if (this.zzWQX) {
            throw new IllegalStateException("Invalid DataTableReader state " + this.zzWR2.getTableName());
        }
        if (i < 0 || this.zzWR2.getRows().getCount() <= i) {
            this.zzWQX = true;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Row position '", "' is invalid. Rows count is '");
            sbOooO0OO.append(this.zzWR2.getRows().getCount());
            sbOooO0OO.append("'. Table ");
            sbOooO0OO.append(this.zzWR2.getTableName());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    private void zzhf(int i) {
        if (i < 0 || i >= this.zzWR2.getColumns().getCount()) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Index '", "' is out of range. There are '");
            sbOooO0OO.append(this.zzWR2.getColumns().getCount());
            sbOooO0OO.append("' columns exist.");
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    private void zzra() {
        this.zzWR4 = 0;
        this.zzWQZ = false;
        this.zzWQV = false;
        DataTable dataTable = this.zzWR7[0];
        this.zzWR2 = dataTable;
        this.zzWR0 = dataTable.getRows().getCount() > 0;
        this.zzWQX = false;
        this.zzWQW = new zzX(this);
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public void close() {
        if (this.zzWR6) {
            zzX zzx = this.zzWQW;
            if (zzx != null) {
                zzx.zzXQ8();
            }
            this.zzWQW = null;
            this.zzWR5 = null;
            this.zzWR6 = false;
        }
    }

    @Override // com.aspose.words.net.System.Data.IDataRecord
    public Object get(int i) {
        zzXQh();
        zzXQg();
        zzY(this.zzWR1);
        zzhf(i);
        return this.zzWR1.get(i);
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public int getDepth() {
        zzXQh();
        zzXQg();
        return 0;
    }

    @Override // com.aspose.words.net.System.Data.IDataRecord
    public int getFieldCount() {
        zzXQh();
        zzXQg();
        return this.zzWR2.getColumns().getCount();
    }

    @Override // com.aspose.words.net.System.Data.IDataRecord
    public Class getFieldType(int i) {
        zzXQh();
        if (this.zzWR3 != -1) {
            zzY(this.zzWR1);
        }
        zzhf(i);
        return this.zzWR2.getColumns().get(i).getDataType();
    }

    @Override // com.aspose.words.net.System.Data.IDataRecord
    public String getName(int i) {
        zzXQh();
        zzhf(i);
        return this.zzWR2.getColumns().get(i).getColumnName();
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public int getRecordsAffected() {
        zzXQg();
        return 0;
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public DataTable getSchemaTable() {
        zzXQh();
        zzXQg();
        if (this.zzWR5 == null) {
            this.zzWR5 = zzU(this.zzWR2);
        }
        return this.zzWR5;
    }

    @Override // com.aspose.words.net.System.Data.IDataRecord
    public Object getValue(int i) {
        zzY(this.zzWR1);
        zzhf(i);
        return this.zzWR1.get(i);
    }

    public boolean hasRows() {
        zzXQh();
        zzXQg();
        return this.zzWR0;
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public boolean isClosed() {
        return !this.zzWR6;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        zzXQh();
        return this.zzWR2.getRows().iterator();
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public boolean nextResult() {
        zzXQh();
        int i = this.zzWR4;
        DataTable[] dataTableArr = this.zzWR7;
        if (i == dataTableArr.length - 1) {
            return false;
        }
        int i2 = i + 1;
        this.zzWR4 = i2;
        DataTable dataTable = dataTableArr[i2];
        this.zzWR2 = dataTable;
        zzX zzx = this.zzWQW;
        if (zzx != null) {
            zzx.zzT(dataTable);
        }
        this.zzWR5 = null;
        this.zzWR3 = -1;
        this.zzWQY = false;
        this.zzWQZ = false;
        this.started = false;
        this.zzWQX = false;
        this.zzWQV = false;
        this.zzWR0 = this.zzWR2.getRows().getCount() > 0;
        return true;
    }

    @Override // com.aspose.words.net.System.Data.IDataReader
    public boolean read() {
        if (!this.started) {
            this.started = true;
        }
        zzXQh();
        zzXQg();
        if (this.zzWQZ) {
            return false;
        }
        if (this.zzWR3 >= this.zzWR2.getRows().getCount() - 1) {
            this.zzWQZ = true;
            zzX zzx = this.zzWQW;
            if (zzx != null) {
                zzx.zzXQ8();
            }
            return false;
        }
        int i = this.zzWR3 + 1;
        this.zzWR3 = i;
        zzhe(i);
        this.zzWR1 = this.zzWR2.getRows().get(this.zzWR3);
        while (this.zzWR1.getRowState() == 8) {
            int i2 = this.zzWR3 + 1;
            this.zzWR3 = i2;
            if (i2 == this.zzWR2.getRows().getCount()) {
                this.zzWQZ = true;
                zzX zzx2 = this.zzWQW;
                if (zzx2 != null) {
                    zzx2.zzXQ8();
                }
                return false;
            }
            zzhe(this.zzWR3);
            this.zzWR1 = this.zzWR2.getRows().get(this.zzWR3);
        }
        if (this.zzWQY) {
            this.zzWQY = false;
        }
        return true;
    }

    public final void zzX(DataRow dataRow) {
        if (dataRow != this.zzWR1) {
            int i = this.zzWR3;
            if (i == 0) {
                return;
            }
            zzhe(i - 1);
            if (this.zzWR1 == this.zzWR2.getRows().get(this.zzWR3 - 1)) {
                this.zzWR3--;
                return;
            }
            return;
        }
        this.zzWQY = true;
        int i2 = this.zzWR3;
        if (i2 > 0) {
            this.zzWR3 = i2 - 1;
            this.zzWR1 = this.zzWR2.getRows().get(this.zzWR3);
        } else {
            this.zzWR3 = -1;
            this.zzWR1 = null;
        }
    }

    public final DataTable zzXQc() {
        return this.zzWR2;
    }

    public final void zzXQd() {
        if (this.started) {
            this.zzWR3 = -1;
            if (this.zzWQZ) {
                return;
            }
            this.zzWQY = true;
        }
    }

    public final void zzXQe() {
        this.zzWQV = true;
    }

    public final void zzXQf() {
        zzhe(this.zzWR3 + 1);
        if (this.zzWR1 == this.zzWR2.getRows().get(this.zzWR3 + 1)) {
            this.zzWR3++;
        }
    }

    @Override // com.aspose.words.net.System.Data.Common.DbDataReader
    public Object get(String str) {
        zzXQh();
        zzXQg();
        zzY(this.zzWR1);
        return this.zzWR1.get(str);
    }

    public DataTableReader(DataTable[] dataTableArr) {
        if (dataTableArr != null) {
            if (dataTableArr.length != 0) {
                this.zzWR7 = new DataTable[dataTableArr.length];
                for (int i = 0; i < dataTableArr.length; i++) {
                    DataTable dataTable = dataTableArr[i];
                    if (dataTable != null) {
                        this.zzWR7[i] = dataTable;
                    } else {
                        throw new IllegalArgumentException("DataTable cannot be null");
                    }
                }
                zzra();
                return;
            }
            throw new IllegalArgumentException("DataTables cannot be empty");
        }
        throw new IllegalArgumentException("DataTables cannot be null");
    }
}
