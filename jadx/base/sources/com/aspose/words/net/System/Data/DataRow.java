package com.aspose.words.net.System.Data;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.words.internal.zzZHV;
import com.aspose.words.internal.zzZKB;
import com.aspose.words.internal.zzZKN;
import com.aspose.words.internal.zzZP0;
import com.aspose.words.internal.zzZQ9;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DataRow {
    private String zzWRs;
    private int zzWRt;
    private Object[] zzY5X;
    private final DataTable zzY61;
    private int zzWRu = 1;
    private Map<String, Object> zzWRr = new HashMap();
    private Map<String, String> zzWRq = new HashMap();

    public DataRow(DataTable dataTable) {
        this.zzY61 = dataTable;
        Object[] objArr = new Object[dataTable.getColumns().getCount()];
        this.zzY5X = objArr;
        Arrays.fill(objArr, DBNull.Value);
    }

    private Object getValue(int i) {
        if (zzhg(i)) {
            return this.zzY5X[i];
        }
        return null;
    }

    private void zzXQm() {
        DataTable dataTable = this.zzY61;
        if (dataTable == null || dataTable.getColumns() == null || this.zzY5X == null) {
            return;
        }
        int count = this.zzY61.getColumns().getCount();
        Object[] objArr = this.zzY5X;
        if (objArr.length == count) {
            return;
        }
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[] objArr3 = new Object[count];
        this.zzY5X = objArr3;
        int iMin = Math.min(length, objArr3.length);
        System.arraycopy(objArr2, 0, this.zzY5X, 0, iMin);
        while (true) {
            Object[] objArr4 = this.zzY5X;
            if (iMin >= objArr4.length) {
                return;
            }
            objArr4[iMin] = DBNull.Value;
            iMin++;
        }
    }

    public static boolean zzZ(DataColumn[] dataColumnArr) {
        int i = 0;
        while (i < dataColumnArr.length) {
            DataColumn dataColumn = dataColumnArr[i];
            if (dataColumn == null || dataColumn == DBNull.Value) {
                return true;
            }
            i++;
        }
        return i == dataColumnArr.length;
    }

    private void zzZO(int i, Object obj) throws Throwable {
        if (zzhg(i)) {
            Class dataType = getTable().getColumns().get(i).getDataType();
            if (obj == null) {
                obj = dataType == String.class ? "" : null;
            } else if (!(obj instanceof DBNull)) {
                if (obj instanceof Clob) {
                    obj = zzZ((Clob) obj);
                } else if (obj instanceof Blob) {
                    obj = zzZ((Blob) obj);
                } else if (!dataType.isAssignableFrom(obj.getClass())) {
                    obj = zzZ(dataType, obj);
                }
            }
            this.zzY5X[i] = obj;
        }
    }

    private boolean zzhg(int i) {
        zzXQm();
        Object[] objArr = this.zzY5X;
        return objArr != null && i >= 0 && i < objArr.length;
    }

    public void delete() {
        zzW.zzY(getTable(), this);
    }

    public Object get(int i) {
        return getValue(i);
    }

    public DataRow[] getChildRows(DataRelation dataRelation) {
        if (this.zzY61.getDataSet() == null) {
            return new DataRow[0];
        }
        if (!dataRelation.getParentTable().getTableName().equalsIgnoreCase(this.zzY61.getTableName())) {
            return new DataRow[0];
        }
        String[] parentColumnNames = dataRelation.getParentColumnNames();
        String[] childColumnNames = dataRelation.getChildColumnNames();
        if (parentColumnNames == null || childColumnNames == null || parentColumnNames.length != childColumnNames.length) {
            return new DataRow[0];
        }
        Object[] objArr = new Object[parentColumnNames.length];
        for (int i = 0; i < parentColumnNames.length; i++) {
            objArr[i] = get(parentColumnNames[i]);
        }
        DataTable dataTable = this.zzY61.getDataSet().getTables().get(dataRelation.getChildTable().getTableName());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < dataTable.getRows().getCount(); i2++) {
            DataRow dataRow = dataTable.getRows().get(i2);
            int i3 = 0;
            boolean z = false;
            while (i3 < childColumnNames.length) {
                Object obj = objArr[i3];
                Object obj2 = dataRow.get(childColumnNames[i3]);
                if (obj == null || !obj.equals(obj2)) {
                    z = false;
                    break;
                }
                i3++;
                z = true;
            }
            if (z) {
                arrayList.add(dataRow);
            }
        }
        return (DataRow[]) arrayList.toArray(new DataRow[arrayList.size()]);
    }

    public Object[] getItemArray() {
        Object[] objArr = this.zzY5X;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    public Object[] getKeyValues(DataKey dataKey) {
        if (dataKey == null) {
            return null;
        }
        return dataKey.getKeyValues(this);
    }

    public Object getOriginalValue(String str) {
        if (str == null) {
            return null;
        }
        return this.zzWRr.get(str);
    }

    public DataRow getParentRow(DataRelation dataRelation) {
        if (this.zzY61.getDataSet() == null) {
            return null;
        }
        String[] parentColumnNames = dataRelation.getParentColumnNames();
        String[] childColumnNames = dataRelation.getChildColumnNames();
        if (parentColumnNames.length != 0 && childColumnNames.length != 0) {
            String str = parentColumnNames[0];
            Object obj = get(childColumnNames[0]);
            for (DataRow dataRow : dataRelation.getParentTable().getRows()) {
                Object obj2 = dataRow.get(str);
                if ((obj == null && obj2 == null) || obj.equals(obj2)) {
                    return dataRow;
                }
            }
        }
        return null;
    }

    public DataRow[] getParentRows(DataRelation dataRelation) {
        if (this.zzY61.getDataSet() == null) {
            return new DataRow[0];
        }
        if (dataRelation.getDataSet() != this.zzY61.getDataSet()) {
            throw new IllegalStateException("Row not in the DataSet");
        }
        if (dataRelation.getChildKey().getTable() == this.zzY61) {
            return DataRelation.zzZ(dataRelation.getParentKey(), dataRelation.getChildKey(), this);
        }
        throw new IllegalStateException(zzZKN.format("Table {0} is not the child table in the relation {1}", this.zzY61.getTableName(), dataRelation.getRelationName()));
    }

    public int getRowState() {
        return this.zzWRu;
    }

    public DataTable getTable() {
        return this.zzY61;
    }

    public boolean readFrom(ResultSet resultSet) throws Throwable {
        Object[] objArrZzX = zzY.zzX(resultSet, getTable());
        if (objArrZzX == null) {
            return false;
        }
        int count = getTable().getColumns().getCount();
        for (int i = 0; i < count; i++) {
            set(i, objArrZzX[i]);
        }
        return true;
    }

    public void remove(int i) {
        int count = this.zzY61.getColumns().getCount();
        Object[] objArr = this.zzY5X;
        if (objArr.length == count) {
            return;
        }
        Object[] objArr2 = new Object[objArr.length - 1];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        System.arraycopy(this.zzY5X, i + 1, objArr2, i, (r1.length - i) - 1);
        this.zzY5X = objArr2;
    }

    public void set(int i, Object obj) throws Throwable {
        zzZO(i, obj);
        this.zzY61.onDataRowChanged(this);
    }

    public void setItemArray(Object[] objArr) throws Throwable {
        if (objArr == null) {
            return;
        }
        if (objArr.length != this.zzY5X.length) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(") and ordering as the column collection.", this.zzY5X.length, new StringBuilder("The array must have the same size (")));
        }
        for (int i = 0; i < objArr.length; i++) {
            zzZO(i, objArr[i]);
        }
        this.zzY61.onDataRowChanged(this);
    }

    public void setOriginalValue(String str, Object obj) {
        this.zzWRr.put(str, obj);
    }

    public void setRowState(int i) {
        this.zzWRu = i;
    }

    public String toString() {
        if (getTable().getTableName() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(getTable().getTableName());
        sb.append(": ");
        for (Object obj : this.zzY5X) {
            sb.append(obj);
            sb.append("; ");
        }
        return sb.toString();
    }

    public final Object[] zzXQn() {
        return this.zzY5X;
    }

    public final String zzXQo() {
        return this.zzWRs;
    }

    public final int zzXQp() {
        return this.zzWRt;
    }

    public final void zzXT(String str, String str2) {
        this.zzWRs = zzZKN.format(str, str2);
    }

    public final void zzXU(String str, String str2) {
        this.zzWRq.put(str, str2);
    }

    public final void zzhh(int i) {
        this.zzWRt = i;
    }

    public Object get(String str) {
        return getValue(this.zzY61.getColumns().indexOf(str));
    }

    public Object get(DataColumn dataColumn) {
        return getValue(this.zzY61.getColumns().indexOf(dataColumn));
    }

    public void set(String str, Object obj) throws Throwable {
        set(this.zzY61.getColumns().indexOf(str), obj);
    }

    public void set(DataColumn dataColumn, Object obj) throws Throwable {
        set(dataColumn.getColumnName(), obj);
    }

    private static Object zzZ(Class cls, Object obj) {
        if (obj == null) {
            return null;
        }
        String strTrim = obj.toString().trim();
        if (!strTrim.isEmpty()) {
            if (cls == String.class) {
                return strTrim;
            }
            try {
                if (cls != Byte.TYPE && cls != Byte.class) {
                    if (cls != Short.TYPE && cls != Short.class) {
                        if (cls != Integer.TYPE && cls != Integer.class) {
                            if (cls != Long.TYPE && cls != Long.class) {
                                if (cls != Float.TYPE && cls != Float.class) {
                                    if (cls != Double.TYPE && cls != Double.class) {
                                        if (cls != Boolean.TYPE && cls != Boolean.class) {
                                            if (cls != Character.TYPE && cls != Character.class) {
                                                if (cls != Date.class && cls != zzZQ9.class) {
                                                    if (cls == BigDecimal.class) {
                                                        return Double.valueOf(new BigDecimal(strTrim).doubleValue());
                                                    }
                                                }
                                                return zzZQ9.zzZ(strTrim, zzZP0.zzj3(), 128).zzkH();
                                            }
                                            return Character.valueOf(strTrim.charAt(0));
                                        }
                                        return Boolean.valueOf(Boolean.parseBoolean(strTrim));
                                    }
                                    return Double.valueOf(Double.parseDouble(strTrim));
                                }
                                return Float.valueOf(Float.parseFloat(strTrim));
                            }
                            return Long.valueOf(Long.parseLong(strTrim));
                        }
                        return Integer.valueOf((int) Long.parseLong(strTrim));
                    }
                    return Short.valueOf((short) Integer.parseInt(strTrim));
                }
                return Byte.valueOf((byte) Integer.parseInt(strTrim));
            } catch (Exception e) {
                zzZHV.zzZ(e);
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[Catch: IOException -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0024, blocks: (B:10:0x0020, B:24:0x0039), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] zzZ(Blob blob) throws Throwable {
        Throwable th;
        InputStream binaryStream;
        byte[] byteArray = null;
        try {
        } catch (IOException e) {
            zzZHV.zzZ(e);
        }
        if (blob != null) {
            try {
            } catch (Exception e2) {
                e = e2;
                binaryStream = null;
            } catch (Throwable th2) {
                th = th2;
                binaryStream = null;
                if (binaryStream != null) {
                }
                throw th;
            }
            if (blob.length() != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                binaryStream = blob.getBinaryStream();
                try {
                    try {
                        zzZKB.zzZ(binaryStream, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (Exception e3) {
                        e = e3;
                        zzZHV.zzZ(e);
                        if (binaryStream != null) {
                        }
                        return byteArray;
                    }
                    if (binaryStream != null) {
                        binaryStream.close();
                    }
                    return byteArray;
                } catch (Throwable th3) {
                    th = th3;
                    if (binaryStream != null) {
                        try {
                            binaryStream.close();
                        } catch (IOException e4) {
                            zzZHV.zzZ(e4);
                        }
                    }
                    throw th;
                }
            }
            zzZHV.zzZ(e);
            if (binaryStream != null) {
                binaryStream.close();
            }
            return byteArray;
        }
        return null;
    }

    private static String zzZ(Clob clob) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        if (clob != null) {
            try {
            } catch (Exception e) {
                e = e;
            }
            if (clob.length() != 0) {
                BufferedReader bufferedReader2 = new BufferedReader(clob.getCharacterStream());
                try {
                    char[] cArr = new char[8192];
                    while (true) {
                        int i = bufferedReader2.read(cArr, 0, 8192);
                        if (i <= 0) {
                            break;
                        }
                        sb.append(cArr, 0, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    zzZHV.zzZ(e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            zzZHV.zzZ(e3);
                        }
                    }
                }
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
