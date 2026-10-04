package com.aspose.words.net.System.Data;

/* JADX INFO: loaded from: classes5.dex */
public class DataColumn {
    private int mColumnIndex;
    private Class zz8a;
    private boolean zzWRK;
    private boolean zzWRL;
    private boolean zzWRM;
    private long zzWRN;
    private long zzWRO;
    private boolean zzWRP;
    private int zzWRQ;
    private String zzWRR;
    private String zzX6Z;
    private DataTable zzY61;
    private int zzYa;
    private String zzYr0;
    private String zzZpC;
    private Object zza;

    public DataColumn() {
        this((String) null, (DataTable) null, -1);
    }

    public static boolean areColumnSetsTheSame(DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2) {
        if (dataColumnArr == null && dataColumnArr2 == null) {
            return true;
        }
        if (dataColumnArr == null || dataColumnArr2 == null || dataColumnArr.length != dataColumnArr2.length) {
            return false;
        }
        for (DataColumn dataColumn : dataColumnArr) {
            boolean z = false;
            for (DataColumn dataColumn2 : dataColumnArr2) {
                if (dataColumn == dataColumn2) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public boolean getAllowDBNull() {
        return this.zzWRK;
    }

    public boolean getAutoIncrement() {
        return this.zzWRP;
    }

    public long getAutoIncrementSeed() {
        return this.zzWRO;
    }

    public long getAutoIncrementStep() {
        return this.zzWRN;
    }

    public String getCaption() {
        String str = this.zzX6Z;
        return (str == null || "".equals(str)) ? this.zzWRR : this.zzX6Z;
    }

    public int getColumnMapping() {
        return this.zzWRQ;
    }

    public String getColumnName() {
        return this.zzWRR;
    }

    public Class getDataType() {
        return this.zz8a;
    }

    public Object getDefaultValue() {
        return this.zza;
    }

    public String getExpression() {
        return null;
    }

    public int getMaxLength() {
        return this.zzYa;
    }

    public String getNamespace() {
        return this.zzYr0;
    }

    public int getOrdinal() {
        return this.mColumnIndex;
    }

    public String getPrefix() {
        return this.zzZpC;
    }

    public boolean getReadOnly() {
        return isReadOnly();
    }

    public DataTable getTable() {
        return this.zzY61;
    }

    public boolean getUnique() {
        return isUnique();
    }

    public boolean isReadOnly() {
        return this.zzWRM;
    }

    public boolean isUnique() {
        return this.zzWRL;
    }

    public void setAllowDBNull(boolean z) {
        this.zzWRK = z;
    }

    public void setAutoIncrement(boolean z) {
        this.zzWRP = z;
    }

    public void setAutoIncrementSeed(long j) {
        this.zzWRO = j;
    }

    public void setAutoIncrementStep(long j) {
        this.zzWRN = j;
    }

    public void setCaption(String str) {
        if (str == null) {
            this.zzX6Z = "";
        } else {
            this.zzX6Z = str;
        }
    }

    public void setColumnMapping(int i) {
        this.zzWRQ = i;
    }

    public void setColumnName(String str) {
        DataColumnCollection columns = (getTable() == null || getTable().getColumns() == null) ? null : getTable().getColumns();
        if (columns != null) {
            columns.zzZ(str, this);
        }
        this.zzWRR = str;
    }

    public void setDataType(Class cls) {
        this.zz8a = cls;
    }

    public void setDefaultValue(Object obj) {
        this.zza = obj;
    }

    public void setMaxLength(int i) {
        this.zzYa = i;
    }

    public void setNamespace(String str) {
        this.zzYr0 = str;
    }

    public void setOrdinal(int i) {
        this.mColumnIndex = i;
    }

    public void setPrefix(String str) {
        this.zzZpC = str;
    }

    public void setReadOnly(boolean z) {
        this.zzWRM = z;
    }

    public void setUnique(boolean z) {
        this.zzWRL = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getTable() != null) {
            sb.append(getTable().getTableName());
            sb.append(": ");
        }
        sb.append(getColumnName());
        sb.append("(");
        sb.append(getDataType());
        sb.append(")");
        return sb.toString();
    }

    public final void zzW(DataTable dataTable) {
        this.zzY61 = dataTable;
    }

    public final boolean zzX(DataColumn dataColumn) {
        return getDataType() == dataColumn.getDataType();
    }

    public DataColumn(String str) {
        this(str, (DataTable) null, -1);
    }

    public DataColumn(String str, DataTable dataTable) {
        this(str, dataTable, -1);
    }

    public DataColumn(String str, Class cls) {
        this(str, (DataTable) null, -1);
        this.zz8a = cls;
    }

    public DataColumn(String str, Class cls, DataTable dataTable) {
        this(str, dataTable, -1);
        this.zz8a = cls;
    }

    public DataColumn(String str, DataTable dataTable, int i) {
        this.zz8a = String.class;
        this.zzWRQ = 1;
        this.zzYr0 = "";
        this.zzZpC = "";
        this.zzYa = -1;
        this.zzX6Z = "";
        this.zzWRO = 0L;
        this.zzWRN = 1L;
        this.zzWRK = true;
        this.zzWRR = str;
        this.zzY61 = dataTable;
        this.mColumnIndex = i;
    }
}
