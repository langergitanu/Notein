package com.aspose.words.internal;

import com.aspose.words.internal.zzZNC;
import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataException;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.net.System.Data.ForeignKeyConstraint;
import com.aspose.words.net.System.Data.InvalidConstraintException;
import com.aspose.words.net.System.Data.UniqueConstraint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZL9 {
    static zzZMQ zzZQ1;
    private zzZML zzZQ6;
    private zzZLR zzZQ7;
    private DataSet zzZQ8;
    private zzZNC.zzX zzZQ9;
    private zzZN3 zzZUG;
    private List<zzZLZ> zzZQ5 = new ArrayList();
    private List<zzZNC.zzY> zzZQ4 = new ArrayList();
    private Map<zzZMC, zzZNC.zzZ> zzZQ3 = new HashMap();
    private List<zzZLZ> zzZQ2 = new ArrayList();

    public zzZL9() {
        zzZN3 zzzn3 = new zzZN3();
        zzZMX zzzmx = new zzZMX();
        zzzmx.setName("testFoo");
        zzzmx.zzV(new zzZN4("integer", "http://www.w3.org/2001/XMLSchema"));
        zzzn3.zzgc().zzW(zzzmx);
        zzZMX zzzmx2 = new zzZMX();
        zzzmx2.setName("testBar");
        zzzmx2.zzV(new zzZN4("decimal", "http://www.w3.org/2001/XMLSchema"));
        zzzn3.zzgc().zzW(zzzmx2);
        zzZML zzzml = new zzZML();
        zzzml.setName("testBar");
        zzzn3.zzgc().zzW(zzzml);
        zzzn3.zzZ((zzZN3) null);
        zzZQ1 = (zzZMQ) zzzml.zzgo();
    }

    private void zzX(zzZML zzzml) throws DataException {
        String strDecode = zzZN8.decode(zzzml.zzgQ().getName());
        if (this.zzZQ8.getTables().contains(strDecode)) {
            return;
        }
        DataTable dataTable = new DataTable(strDecode);
        dataTable.setNamespace(zzzml.zzgQ().getNamespace());
        zzZNC.zzX zzx = this.zzZQ9;
        this.zzZQ9 = new zzZNC.zzX(dataTable);
        this.zzZQ8.getTables().add(dataTable);
        zzZMQ zzzmq = (zzZMQ) zzzml.zzgo();
        Iterator<zzZLZ> it = zzzmq.zzgG().values().iterator();
        while (it.hasNext()) {
            zzZ((zzZMX) it.next());
        }
        if (zzzmq.zzgA() instanceof zzZML) {
            zzZ(zzzml, (zzZML) zzzmq.zzgA());
        } else if (zzzmq.zzgA() instanceof zzZME) {
            zzZ(zzzml, (zzZME) zzzmq.zzgA());
        }
        if (zzzmq.getContentType() == 0) {
            DataColumn dataColumn = new DataColumn(zzzml.zzgQ().getName() + "_text");
            dataColumn.setAllowDBNull(zzzml.zzZSn.intValue() == 0);
            dataColumn.setDataType(zzZLF.zzZ(zzzmq.zzZQM));
            this.zzZQ9.zzhg().add(dataColumn);
        }
        zzZQH zzzqh = new zzZQH();
        for (Map.Entry<DataColumn, Integer> entry : this.zzZQ9.zzhh().entrySet()) {
            zzzqh.zzB(entry.getValue(), entry.getKey());
        }
        Iterator it2 = zzzqh.zzl9().iterator();
        while (it2.hasNext()) {
            dataTable.getColumns().add((DataColumn) it2.next());
        }
        Iterator<DataColumn> it3 = this.zzZQ9.zzhg().iterator();
        while (it3.hasNext()) {
            dataTable.getColumns().add(it3.next());
        }
        this.zzZQ9 = zzx;
    }

    private void zzY(zzZML zzzml) throws DataException {
        this.zzZQ8.setDataSetName(zzzml.getName());
        this.zzZQ6 = zzzml;
        boolean z = false;
        if (!zzzml.zzgb().isEmpty()) {
            for (Map.Entry<String, String> entry : zzzml.zzgb().entrySet()) {
                if ("UseCurrentLocale".equals(entry.getKey())) {
                    z = true;
                }
                if ("Locale".equals(entry.getKey())) {
                    this.zzZQ8.setLocale(new zzZP1(entry.getValue()).getLocale());
                }
            }
        }
        if (!z && !this.zzZQ8.isLocaleSpecified()) {
            this.zzZQ8.setLocale(zzZP1.zzpZ().getLocale());
        }
        zzZMQ zzzmq = (zzZMQ) zzzml.zzgo();
        zzZLW zzzlwZzgA = zzzmq != null ? zzzmq.zzgA() : null;
        if (zzzlwZzgA != null) {
            zzX(zzzlwZzgA);
        }
    }

    public final void zzZ(zzZLR zzzlr, DataSet dataSet) throws DataException, InvalidConstraintException {
        zzZLW zzzlwZzgB;
        if (zzzlr.zzfR().isEmpty()) {
            throw new IllegalArgumentException("SchemaSet cannot be empty.");
        }
        this.zzZQ7 = zzzlr;
        this.zzZQ8 = dataSet;
        zzZN3 zzzn3 = zzzlr.zzfR().get(0);
        this.zzZUG = zzzn3;
        this.zzZQ6 = null;
        for (zzZLZ zzzlz : zzzn3.zzgc()) {
            zzZML zzzml = zzzlz instanceof zzZML ? (zzZML) zzzlz : null;
            if (zzzml != null) {
                if (this.zzZQ6 == null && zzZL8.zzZ(zzzml, this.zzZUG)) {
                    this.zzZQ6 = zzzml;
                }
                if ((zzzml.zzgo() instanceof zzZMQ) && zzzml.zzgo() != zzZQ1 && !this.zzZQ5.contains(zzzlz)) {
                    this.zzZQ5.add(zzzlz);
                }
            }
        }
        zzZML zzzml2 = this.zzZQ6;
        if (zzzml2 != null) {
            for (zzZLZ zzzlz2 : zzzml2.zzgt()) {
                if (!(zzzlz2 instanceof zzZM8)) {
                    zzZL8.zzZ((zzZMC) zzzlz2, this.zzZQ3);
                }
            }
            for (zzZLZ zzzlz3 : this.zzZQ6.zzgt()) {
                if (zzzlz3 instanceof zzZM8) {
                    zzZL8.zzZ((zzZM8) zzzlz3, this.zzZQ3);
                }
            }
        }
        for (zzZLZ zzzlz4 : this.zzZUG.zzgc()) {
            if (zzzlz4 instanceof zzZML) {
                zzZML zzzml3 = (zzZML) zzzlz4;
                if ((zzzml3.zzgo() instanceof zzZMQ) && zzzml3.zzgo() != zzZQ1 && !this.zzZQ5.contains(zzzlz4)) {
                    this.zzZQ5.add(zzzlz4);
                }
            }
        }
        for (zzZLZ zzzlz5 : this.zzZUG.zzgc()) {
            if ((zzzlz5 instanceof zzZMQ) && (zzzlwZzgB = ((zzZMQ) zzzlz5).zzgB()) != null) {
                for (zzZLZ zzzlz6 : zzzlwZzgB.zzgc()) {
                    if (zzzlz6 instanceof zzZML) {
                        zzZML zzzml4 = (zzZML) zzzlz6;
                        if ((zzzml4.zzgo() instanceof zzZMQ) && zzzml4.zzgo() != zzZQ1 && !this.zzZQ5.contains(zzzml4)) {
                            this.zzZQ5.add(zzzml4);
                        }
                    }
                }
            }
        }
        int size = this.zzZQ5.size();
        for (int i = 0; i < size; i++) {
            zzZ((zzZML) this.zzZQ5.get(i));
        }
        while (size < this.zzZQ5.size()) {
            zzX((zzZML) this.zzZQ5.get(size));
            size++;
        }
        for (zzZLZ zzzlz7 : this.zzZUG.zzgc()) {
            if (zzzlz7 instanceof zzZN1) {
                zzX((zzZN1) zzzlz7);
            }
        }
        zzZML zzzml5 = this.zzZQ6;
        if (zzzml5 != null) {
            for (zzZLZ zzzlz8 : zzzml5.zzgt()) {
                if (!(zzzlz8 instanceof zzZM8)) {
                    zzZ(this.zzZQ3.get(zzzlz8));
                }
            }
            for (zzZLZ zzzlz9 : this.zzZQ6.zzgt()) {
                if (zzzlz9 instanceof zzZM8) {
                    zzZ(this.zzZQ6, this.zzZQ3.get(zzzlz9));
                }
            }
        }
        Iterator<zzZNC.zzY> it = this.zzZQ4.iterator();
        while (it.hasNext()) {
            this.zzZQ8.getRelations().add(zzZL8.zzZ(it.next(), this.zzZQ8, this.zzZQ6));
        }
    }

    private void zzY(zzZML zzzml, zzZML zzzml2, DataColumn dataColumn) throws DataException {
        if (this.zzZQ5.contains(zzzml2)) {
            return;
        }
        String strDecode = zzZN8.decode(zzzml2.zzgQ().getName());
        if (!strDecode.equals(this.zzZQ8.getDataSetName())) {
            if (zzzml2.zzg8() != null && zzY(zzzml2.zzg8())) {
                zzX(zzzml2.zzg8());
            } else if (!zzZL8.zzY(strDecode, this.zzZQ3)) {
                zzX(zzzml, zzzml2, dataColumn);
                zzZNC.zzY zzy = new zzZNC.zzY();
                zzy.zzUO(zzZN8.decode(zzzml.zzgQ().getName()));
                zzy.zzUN(strDecode);
                zzy.zzUM(dataColumn.getColumnName());
                zzy.zzUL(dataColumn.getColumnName());
                zzy.zzhj();
                zzy.zzhl();
                this.zzZQ4.add(zzy);
            }
            if (zzzml2.zzgO() == zzZN4.zzZV6) {
                zzX(zzzml2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Nested element must not have the same name as DataSet's name.");
    }

    private void zzX(zzZLW zzzlw) throws DataException {
        if (zzzlw instanceof zzZML) {
            zzZML zzzml = (zzZML) zzzlw;
            if (!(zzzml.zzgo() instanceof zzZMQ) || zzzml.zzgO() == zzzml.zzgQ()) {
                return;
            }
            zzX(zzzml);
            return;
        }
        if (zzzlw instanceof zzZME) {
            Iterator<zzZLZ> it = ((zzZME) zzzlw).zzgc().iterator();
            while (it.hasNext()) {
                zzX((zzZLW) it.next());
            }
        }
    }

    private void zzY(DataColumn dataColumn) {
        if (dataColumn.getOrdinal() < 0) {
            this.zzZQ9.zzhg().add(dataColumn);
        } else {
            this.zzZQ9.zzhh().put(dataColumn, Integer.valueOf(dataColumn.getOrdinal()));
        }
    }

    private static boolean zzY(zzZN1 zzzn1) {
        if (zzzn1 == null) {
            return false;
        }
        Iterator<zzZLZ> it = zzzn1.zzgc().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof zzZMY) {
                return true;
            }
        }
        return false;
    }

    private void zzX(zzZML zzzml, zzZML zzzml2, DataColumn dataColumn) throws DataException {
        if (this.zzZQ9.getTable().getPrimaryKey().length <= 0) {
            if (this.zzZQ9.zzhf() != null) {
                dataColumn.setColumnName(this.zzZQ9.zzhf().getColumnName());
                dataColumn.setColumnMapping(this.zzZQ9.zzhf().getColumnMapping());
                dataColumn.setNamespace(this.zzZQ9.zzhf().getNamespace());
                dataColumn.setDataType(this.zzZQ9.zzhf().getDataType());
                dataColumn.setAutoIncrement(this.zzZQ9.zzhf().getAutoIncrement());
                dataColumn.setAllowDBNull(this.zzZQ9.zzhf().getAllowDBNull());
                zzzml2.zzgQ();
                zzZ((zzZLZ) zzzml2, dataColumn);
                return;
            }
            String str = zzZN8.decode(zzzml.zzgQ().getName()) + "_Id";
            int i = 0;
            while (this.zzZQ9.containsColumn(str)) {
                str = zzZKN.format("{0}_{1}", str, Integer.valueOf(i));
                i++;
            }
            dataColumn.setColumnName(str);
            dataColumn.setColumnMapping(4);
            dataColumn.setNamespace(zzzml.zzgQ().getNamespace());
            dataColumn.setDataType(Integer.TYPE);
            dataColumn.setAutoIncrement(true);
            dataColumn.setAllowDBNull(false);
            zzzml2.zzgQ();
            zzZ((zzZLZ) zzzml2, dataColumn);
            zzY(dataColumn);
            this.zzZQ9.zzZ(dataColumn);
            return;
        }
        throw new DataException(zzZKN.format("There is already primary key columns in the table \"{0}\".", this.zzZQ9.getTable().getTableName()));
    }

    private void zzZ(zzZML zzzml, zzZNC.zzZ zzz) throws DataException, InvalidConstraintException {
        String str = zzz.zzZVK;
        DataTable dataTable = this.zzZQ8.getTables().get(str);
        if (dataTable != null) {
            int length = zzz.zzZVJ.length;
            DataColumn[] dataColumnArr = new DataColumn[length];
            for (int i = 0; i < length; i++) {
                String str2 = zzz.zzZVJ[i];
                boolean z = zzz.zzZVI[i];
                DataColumn dataColumn = dataTable.getColumns().get(str2);
                if (z && dataColumn.getColumnMapping() != 2) {
                    throw new IllegalStateException("The XPath specified attribute field, but mapping type is not attribute.");
                }
                if (!z && dataColumn.getColumnMapping() != 1) {
                    throw new IllegalStateException("The XPath specified simple element field, but mapping type is not simple element.");
                }
                dataColumnArr[i] = dataColumn;
            }
            UniqueConstraint uniqueConstraintZzZ = zzZ(zzz.zzZVF, zzzml);
            ForeignKeyConstraint foreignKeyConstraint = new ForeignKeyConstraint(zzz.zzZVH, uniqueConstraintZzZ.getColumns(), dataColumnArr);
            dataTable.getConstraints().add(foreignKeyConstraint);
            if (zzz.zzZVD) {
                return;
            }
            DataRelation dataRelation = new DataRelation(zzz.zzZVH, uniqueConstraintZzZ.getColumns(), dataColumnArr, true);
            dataRelation.setNested(zzz.zzZVE);
            dataRelation.setParentKeyConstraint(uniqueConstraintZzZ);
            dataRelation.setChildKeyConstraint(foreignKeyConstraint);
            this.zzZQ8.getRelations().add(dataRelation);
            return;
        }
        throw new IllegalStateException(zzZKN.format("Invalid XPath selection inside selector. Cannot find: {0}", str));
    }

    private static void zzX(zzZN1 zzzn1) {
        for (zzZLZ zzzlz : zzzn1.zzgc()) {
            zzZMY zzzmy = zzzlz instanceof zzZMY ? (zzZMY) zzzlz : null;
            if (zzzmy != null) {
                Iterator<zzZN5> it = zzzmy.zzgR().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private void zzZ(zzZNC.zzZ zzz) throws DataException, InvalidConstraintException {
        String str = zzz.zzZVK;
        DataTable dataTable = this.zzZQ8.getTables().get(str);
        if (dataTable == null) {
            return;
        }
        int length = zzz.zzZVJ.length;
        DataColumn[] dataColumnArr = new DataColumn[length];
        for (int i = 0; i < length; i++) {
            String str2 = zzz.zzZVJ[i];
            boolean z = zzz.zzZVI[i];
            DataColumn dataColumn = dataTable.getColumns().get(str2);
            if (dataColumn != null) {
                if (z && dataColumn.getColumnMapping() != 2) {
                    throw new IllegalStateException("The XPath specified attribute field, but mapping type is not attribute.");
                }
                if (!z && dataColumn.getColumnMapping() != 1) {
                    throw new IllegalStateException("The XPath specified simple element field, but mapping type is not simple element.");
                }
                dataColumnArr[i] = dataTable.getColumns().get(str2);
            } else {
                throw new IllegalStateException(zzZKN.format("Invalid XPath selection inside field. Cannot find: {0}", str));
            }
        }
        boolean z2 = zzz.zzZVG;
        dataTable.getConstraints().add(new UniqueConstraint(zzz.zzZVH, dataColumnArr, z2));
    }

    private void zzZ(zzZML zzzml) throws DataException {
        if (!this.zzZQ8.getTables().contains(zzzml.zzgQ().getName()) && (zzzml.zzgo() instanceof zzZMQ)) {
            if (zzZL8.zzZ(zzzml, this.zzZUG)) {
                zzY(zzzml);
                return;
            }
            this.zzZQ8.setLocale(zzZP1.zzpZ().getLocale());
            this.zzZQ2.add(zzzml);
            zzX(zzzml);
        }
    }

    private void zzZ(zzZMX zzzmx) {
        DataColumn dataColumn = new DataColumn();
        dataColumn.setColumnName(zzzmx.zzgQ().getName());
        dataColumn.setDataType(zzZLF.zzZ(zzZL8.zzZZ(zzzmx.zzgK().zzZQM)));
        if (dataColumn.getDataType() == Object.class) {
            dataColumn.setDataType(String.class);
        }
        if (zzzmx.zzgP() == 2) {
            dataColumn.setColumnMapping(4);
        } else {
            dataColumn.setColumnMapping(2);
            dataColumn.setDefaultValue(zzZL8.zzZ(this.zzZUG, zzzmx));
        }
        if (zzzmx.zzgP() == 3) {
            dataColumn.setAllowDBNull(false);
        }
        try {
            zzZ(dataColumn, zzzmx.zzgK());
        } catch (Exception e) {
            zzZHV.zzY(e);
        }
        zzzmx.zzgQ();
        zzZ(zzzmx, dataColumn);
        zzY(dataColumn);
    }

    private void zzZ(zzZML zzzml, zzZME zzzme) throws DataException {
        for (zzZLZ zzzlz : zzzme.zzgc()) {
            if (zzzlz instanceof zzZML) {
                zzZ(zzzml, (zzZML) zzzlz);
            } else if (zzzlz instanceof zzZME) {
                zzZ(zzzml, (zzZME) zzzlz);
            }
        }
    }

    private void zzZ(zzZML zzzml, zzZML zzzml2) throws DataException {
        DataColumn dataColumn = new DataColumn();
        dataColumn.setDefaultValue(zzZL8.zzY(zzzml2, this.zzZUG));
        dataColumn.setAllowDBNull(zzzml2.zzZSn.intValue() == 0);
        if ((zzzml2.zzgo() instanceof zzZMQ) && zzzml2.zzgo() != zzZQ1) {
            zzY(zzzml, zzzml2, dataColumn);
        } else if (zzzml2.zzZSm.intValue() != 1) {
            zzZ(zzzml, zzzml2, dataColumn);
        } else {
            zzZ(zzzml2, dataColumn);
        }
    }

    private static void zzZ(zzZLZ zzzlz, DataColumn dataColumn) {
        if (zzzlz.zzgb().isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : zzzlz.zzgb().entrySet()) {
            if ("Caption".equals(entry.getKey())) {
                dataColumn.setCaption(entry.getValue());
            } else if ("DataType".equals(entry.getKey())) {
                dataColumn.setDataType(zzZN9.zzUE(entry.getValue()));
            } else if ("AutoIncrement".equals(entry.getKey())) {
                dataColumn.setAutoIncrement(Boolean.parseBoolean(entry.getValue()));
            } else if ("AutoIncrementSeed".equals(entry.getKey())) {
                dataColumn.setAutoIncrementSeed(Integer.parseInt(entry.getValue()));
            } else if ("AutoIncrementStep".equals(entry.getKey())) {
                dataColumn.setAutoIncrementStep(Integer.parseInt(entry.getValue()));
            } else if ("ReadOnly".equals(entry.getKey())) {
                dataColumn.setReadOnly(zzZN9.zzUI(entry.getValue()));
            } else {
                entry.getKey();
            }
        }
    }

    private static void zzZ(DataColumn dataColumn, zzZLN zzzln) throws DataException {
        String value;
        if (zzzln == null || zzzln.zzfP() == null) {
            return;
        }
        zzZLK zzzlk = zzzln.zzfP() instanceof zzZLK ? (zzZLK) zzzln.zzfP() : null;
        if (zzzlk != null) {
            for (zzZLZ zzzlz : zzzlk.zzfM()) {
                if ((zzzlz instanceof zzZM4) && (value = ((zzZMH) zzzlz).getValue()) != null) {
                    dataColumn.setMaxLength(Integer.parseInt(value));
                }
            }
            return;
        }
        throw new DataException("DataSet does not support 'list' nor 'union' simple type.");
    }

    private void zzZ(zzZML zzzml, zzZML zzzml2, DataColumn dataColumn) throws DataException {
        if (this.zzZQ5.contains(zzzml2)) {
            return;
        }
        zzX(zzzml, zzzml2, dataColumn);
        DataColumn dataColumnZzhf = this.zzZQ9.zzhf();
        String strDecode = zzZN8.decode(zzzml2.zzgQ().getName());
        String strDecode2 = zzZN8.decode(zzzml.zzgQ().getName());
        DataTable dataTable = new DataTable();
        dataTable.setTableName(strDecode);
        dataTable.setNamespace(zzzml2.zzgQ().getNamespace());
        DataColumn dataColumn2 = new DataColumn();
        dataColumn2.setColumnName(strDecode2 + "_Id");
        dataColumn2.setNamespace(zzzml.zzgQ().getNamespace());
        dataColumn2.setColumnMapping(4);
        dataColumn2.setDataType(Integer.TYPE);
        DataColumn dataColumn3 = new DataColumn();
        dataColumn3.setColumnName(strDecode + "_Column");
        dataColumn3.setNamespace(zzzml2.zzgQ().getNamespace());
        dataColumn3.setColumnMapping(3);
        dataColumn3.setAllowDBNull(false);
        dataColumn3.setDataType(zzZLF.zzZ(zzZL8.zzZZ(zzzml2.zzgo())));
        dataTable.getColumns().add(dataColumn3);
        dataTable.getColumns().add(dataColumn2);
        this.zzZQ8.getTables().add(dataTable);
        zzZNC.zzY zzy = new zzZNC.zzY();
        zzy.zzUO(strDecode2);
        zzy.zzUN(dataTable.getTableName());
        zzy.zzUM(dataColumnZzhf.getColumnName());
        zzy.zzUL(dataColumn2.getColumnName());
        zzy.zzhl();
        zzy.zzhj();
        this.zzZQ4.add(zzy);
    }

    private void zzZ(zzZML zzzml, DataColumn dataColumn) throws DataException {
        dataColumn.setColumnName(zzZN8.decode(zzzml.zzgQ().getName()));
        dataColumn.setNamespace(zzzml.zzgQ().getNamespace());
        dataColumn.setColumnMapping(1);
        dataColumn.setDataType(zzZLF.zzZ(zzZL8.zzZZ(zzzml.zzgo())));
        zzZ(dataColumn, zzzml.zzgo() instanceof zzZLN ? (zzZLN) zzzml.zzgo() : null);
        zzzml.zzgQ();
        zzZ((zzZLZ) zzzml, dataColumn);
        zzY(dataColumn);
    }

    private UniqueConstraint zzZ(String str, zzZML zzzml) {
        for (zzZMC zzzmc : zzzml.zzgt()) {
            if (!(zzzmc instanceof zzZM8) && zzzmc.getName().equals(str)) {
                DataTable dataTable = this.zzZQ8.getTables().get(zzZL8.zzUh(zzzmc.zzgf().getXPath()));
                String name = zzzmc.getName();
                if (zzzmc.zzgb() != null) {
                    for (Map.Entry<String, String> entry : zzzmc.zzgb().entrySet()) {
                        if ("ConstraintName".equals(entry.getKey())) {
                            name = entry.getValue();
                        }
                    }
                }
                return (UniqueConstraint) dataTable.getConstraints().get(name);
            }
        }
        throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Target identity constraint was not found: ", str));
    }
}
