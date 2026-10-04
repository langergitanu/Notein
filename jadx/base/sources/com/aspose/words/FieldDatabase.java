package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDatabase extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static Map<Integer, Integer> zzYEM;

    static {
        HashMap map = new HashMap();
        zzYEM = map;
        map.put(1, 111);
        zzYEM.put(2, 112);
        zzYEM.put(3, 113);
        zzYEM.put(4, 114);
        zzYEM.put(5, 115);
        zzYEM.put(6, 116);
        zzYEM.put(7, 117);
        zzYEM.put(8, 118);
        zzYEM.put(9, 119);
        zzYEM.put(10, 120);
        zzYEM.put(11, 121);
        zzYEM.put(12, 122);
        zzYEM.put(13, 123);
        zzYEM.put(14, 124);
        zzYEM.put(15, 125);
        zzYEM.put(16, 126);
        zzYEM.put(17, 127);
        zzYEM.put(18, 128);
        zzYEM.put(19, 129);
        zzYEM.put(20, 130);
        zzYEM.put(21, 131);
        zzYEM.put(22, 132);
        zzYEM.put(23, 133);
        zzYEM.put(24, 134);
        zzYEM.put(25, 135);
        zzYEM.put(26, 136);
        zzYEM.put(27, 137);
        zzYEM.put(28, 138);
        zzYEM.put(29, 139);
        zzYEM.put(30, 140);
        zzYEM.put(31, 141);
        zzYEM.put(32, 142);
        zzYEM.put(33, 143);
        zzYEM.put(34, 144);
        zzYEM.put(35, 145);
        zzYEM.put(36, 146);
        zzYEM.put(37, 147);
        zzYEM.put(38, 148);
        zzYEM.put(39, 149);
        zzYEM.put(40, 150);
        zzYEM.put(41, 151);
        zzYEM.put(42, 152);
        zzUR = new com.aspose.words.internal.zzZHW("\\h", "\\o", "\\b", "\\c", "\\d", "\\f", "\\l", "\\s", "\\t");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzN(Table table) throws Exception {
        TableStyle tableStyle;
        int iZzZeq = zzZeq();
        int iZzZer = zzZer();
        if (iZzZer != 0) {
            RefInt refInt = new RefInt(0);
            tableStyle = com.aspose.words.internal.zzZQF.zzZ(zzYEM, Integer.valueOf(iZzZeq), refInt) ? (TableStyle) getStart().getDocument().getStyles().zzZ7(refInt.get(), true) : null;
        }
        zzZ.zzZ(table, tableStyle, iZzZeq, iZzZer);
    }

    private FieldDatabaseDataTable zzY(FieldDatabaseDataTable fieldDatabaseDataTable) {
        return zzZQK.zzZ(fieldDatabaseDataTable, com.aspose.words.internal.zzJB.zzZo(getFirstRecord()), com.aspose.words.internal.zzJB.zzZo(getLastRecord()));
    }

    private Table zzZ(FieldDatabaseDataTable fieldDatabaseDataTable) throws Exception {
        FieldDatabaseDataTable fieldDatabaseDataTableZzY = zzY(fieldDatabaseDataTable);
        if (fieldDatabaseDataTableZzY.getRows().size() == 0) {
            return null;
        }
        Table table = new Table(getStart().getDocument());
        if (getInsertHeadings()) {
            zzZ(fieldDatabaseDataTableZzY, table);
        }
        Iterator<FieldDatabaseDataRow> it = fieldDatabaseDataTableZzY.getRows().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), table);
        }
        zzN(table);
        return table;
    }

    private int zzZeq() {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(getTableFormat());
        if (iZzZo == Integer.MIN_VALUE) {
            return 0;
        }
        return iZzZo;
    }

    private int zzZer() {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(getFormatAttributes());
        if (iZzZo == Integer.MIN_VALUE) {
            return 0;
        }
        return iZzZo;
    }

    public String getConnection() {
        return zzZgq().zzt("\\c", false);
    }

    public String getFileName() {
        return zzZgq().zzt("\\d", false);
    }

    public String getFirstRecord() {
        return zzZgq().zzt("\\f", false);
    }

    public String getFormatAttributes() {
        return zzZgq().zzt("\\b", false);
    }

    public boolean getInsertHeadings() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getInsertOnceOnMailMerge() {
        return zzZgq().zzMj("\\o");
    }

    public String getLastRecord() {
        return zzZgq().zzt("\\t", false);
    }

    public String getQuery() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 2;
            default:
                return 0;
        }
    }

    public String getTableFormat() {
        return zzZgq().zzt("\\l", false);
    }

    public void setConnection(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    public void setFileName(String str) throws Exception {
        zzZgq().zzZf("\\d", str);
    }

    public void setFirstRecord(String str) throws Exception {
        zzZgq().zzZe("\\f", str);
    }

    public void setFormatAttributes(String str) throws Exception {
        zzZgq().zzZe("\\b", str);
    }

    public void setInsertHeadings(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setInsertOnceOnMailMerge(boolean z) throws Exception {
        zzZgq().zzs("\\o", z);
    }

    public void setLastRecord(String str) throws Exception {
        zzZgq().zzZe("\\t", str);
    }

    public void setQuery(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setTableFormat(String str) throws Exception {
        zzZgq().zzZe("\\l", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        IFieldDatabaseProvider fieldDatabaseProvider = getStart().zzYBb().getFieldOptions().getFieldDatabaseProvider();
        if (fieldDatabaseProvider == null) {
            return null;
        }
        FieldDatabaseDataTable queryResult = fieldDatabaseProvider.getQueryResult(getFileName(), getConnection(), getQuery(), this);
        if (queryResult == null) {
            return new zzZP2(this, "Error! Cannot open data source.");
        }
        Table tableZzZ = zzZ(queryResult);
        return tableZzZ != null ? new zzZP5((Field) this, (zzZB2) new zzYW7(new zzYWB(tableZzZ, tableZzZ)), false) : new zzZP5(this, "");
    }

    public static class zzZ {
        private static int[] zzYEJ;
        private static int[] zzYEK;
        private static zzX zzYEL;

        public static class zzW implements zzY {
            private TableStyle zzYED;

            public zzW(TableStyle tableStyle) {
                this.zzYED = tableStyle;
            }

            @Override // com.aspose.words.FieldDatabase.zzZ.zzY
            public final zzZS zzDu(int i) {
                if (i == 0) {
                    return this.zzYED.zzZYf();
                }
                if (i == 1) {
                    return this.zzYED.zz6G();
                }
                if (i == 2) {
                    return this.zzYED.zzZYh();
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: attrPrSource");
            }
        }

        public interface zzY {
            zzZS zzDu(int i);
        }

        /* JADX INFO: renamed from: com.aspose.words.FieldDatabase$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19077zzZ implements zzY {
            private ConditionalStyle zzYEI;

            public C19077zzZ(ConditionalStyle conditionalStyle) {
                this.zzYEI = conditionalStyle;
            }

            @Override // com.aspose.words.FieldDatabase.zzZ.zzY
            public final zzZS zzDu(int i) {
                if (i == 0) {
                    return this.zzYEI.zzZYf();
                }
                if (i == 1) {
                    return this.zzYEI.zz6G();
                }
                if (i == 2) {
                    return this.zzYEI.zzZYh();
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: attrPrSource");
            }
        }

        static {
            zzX zzx = new zzX((byte) 0);
            zzYEL = zzx;
            zzx.zzp(1).zzo(4050, 4060, 4070, 4080, 4090, EditingLanguage.CHINESE_SINGAPORE).zzo(4020, 4300, 4310, 4320).zzo(4340).zzo(4290).zzn(3110, 3120, 3130, 3140, 3200, 3210).zzn(3150, 3160);
            zzYEL.zzp(2).zzn(3170);
            zzYEL.zzp(4).zzm(60, 70, 250, StyleIdentifier.SUBTLE_EMPHASIS, 120);
            zzYEL.zzp(2, 4).zzm(160);
            zzYEK = new int[]{4, 6, 5, 7, 0, 2, 1, 3, 8, 9, 10, 11};
            zzYEJ = new int[]{4, 6, 5, 7, 1, 3, 0, 2, 8, 9, 10, 11};
        }

        private static Border zzD(Border border) {
            if (border == null) {
                return null;
            }
            if (border.zz8Q().zzPz()) {
                return border;
            }
            Border borderZz8H = border.zz8H();
            borderZz8H.zzm(zzc(borderZz8H.zz8Q()));
            return borderZz8H;
        }

        private static int zzDv(int i) {
            switch (i) {
                case 8:
                    return 32;
                case 9:
                    return 256;
                case 10:
                    return 64;
                case 11:
                    return 0;
                default:
                    throw new IllegalArgumentException();
            }
        }

        private static int zzDw(int i) {
            switch (i) {
                case 8:
                case 9:
                    return 32;
                case 10:
                case 11:
                    return 64;
                default:
                    throw new IllegalArgumentException();
            }
        }

        private static int zzDx(int i) {
            switch (i) {
                case 8:
                case 10:
                    return 128;
                case 9:
                case 11:
                    return 256;
                default:
                    throw new IllegalArgumentException();
            }
        }

        private static int[] zzDy(int i) {
            return (i == 9 || i == 39) ? zzYEJ : zzYEK;
        }

        private static boolean zzDz(int i) {
            return i == 33 || i == 34;
        }

        private static void zzM(Table table) {
            table.zzZYf().clear();
            for (Row row : table.getRows()) {
                row.zzZYf().clear();
                for (Cell cell : row.getCells()) {
                    cell.zz6G().clear();
                    for (Paragraph paragraph : cell.getParagraphs()) {
                        paragraph.zzZYj().clear();
                        Iterator<T> it = paragraph.getRuns().iterator();
                        while (it.hasNext()) {
                            ((Run) it.next()).zzZYh().clear();
                        }
                    }
                }
            }
        }

        private static Shading zzV(Shading shading) {
            if (shading == null) {
                return null;
            }
            if (shading.getTexture() == 1) {
                if (!zzb(shading.zzYbK()) || !zzb(shading.zzYbJ())) {
                    Shading shadingZzYbE = shading.zzYbE();
                    shadingZzYbE.setTexture((zza(shadingZzYbE.zzYbK()) && zza(shadingZzYbE.zzYbJ())) ? 6 : 9);
                    if (!zzb(shadingZzYbE.zzYbK())) {
                        shadingZzYbE.zzZK(com.aspose.words.internal.zzPV.zzKa);
                    }
                    if (!zzb(shadingZzYbE.zzYbJ())) {
                        shadingZzYbE.zzZJ(com.aspose.words.internal.zzPV.zzKa);
                    }
                    return shadingZzYbE;
                }
            } else if (!shading.zzYbK().zzPz() || !shading.zzYbJ().zzPz()) {
                Shading shadingZzYbE2 = shading.zzYbE();
                shadingZzYbE2.zzZK(zzc(shadingZzYbE2.zzYbK()));
                shadingZzYbE2.zzZJ(zzc(shadingZzYbE2.zzYbJ()));
                return shadingZzYbE2;
            }
            return shading;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean zzX(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (!zzXJ(i, i2)) {
                    return false;
                }
            }
            return true;
        }

        private static boolean zzXJ(int i, int i2) {
            return (i & i2) == i2;
        }

        private static int zzXK(int i, int i2) {
            if (i == 4 || i == 5) {
                return zzDv(i2);
            }
            if (i != 39) {
                switch (i) {
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        switch (i) {
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i) {
                                    case 32:
                                    case 33:
                                    case 34:
                                        break;
                                    default:
                                        return zzDw(i2);
                                }
                                break;
                        }
                        break;
                }
            }
            return zzDx(i2);
        }

        private static void zzY(Table table, TableStyle tableStyle, int i, int i2) {
            zzZ(new zzW(tableStyle), table, i2, new int[0]);
            for (int i3 : zzDy(i)) {
                ConditionalStyle byConditionalStyleType = tableStyle.getConditionalStyles().getByConditionalStyleType(i3);
                if (byConditionalStyleType.zzZYa()) {
                    C19077zzZ c19077zzZ = new C19077zzZ(byConditionalStyleType);
                    switch (i3) {
                        case 0:
                            if (zzXJ(i2, 32)) {
                                zzZ(c19077zzZ, table.getFirstRow(), i2, new int[0]);
                            }
                            break;
                        case 1:
                            if (zzXJ(i2, 128)) {
                                for (Row row : table.getRows()) {
                                    zzZ(c19077zzZ, row.getFirstCell(), i2, (com.aspose.words.internal.zzAN.zzZP((long) row.getRowIndex()) || !zzDz(i)) ? new int[0] : new int[]{3140});
                                }
                            }
                            break;
                        case 2:
                            if (zzXJ(i2, 64)) {
                                zzZ(c19077zzZ, table.getLastRow(), i2, new int[0]);
                            }
                            break;
                        case 3:
                            if (zzXJ(i2, 256)) {
                                Iterator<T> it = table.getRows().iterator();
                                while (it.hasNext()) {
                                    zzZ(c19077zzZ, ((Row) it.next()).getLastCell(), i2, new int[0]);
                                }
                            }
                            break;
                        case 4:
                            int iZzXXt = tableStyle.zzZYf().zzXXt();
                            int count = table.getRows().getCount();
                            for (int i4 = 0; i4 < count; i4++) {
                                if (zzZ(i4, iZzXXt, true, count, i2, i)) {
                                    zzZ(c19077zzZ, table.getRows().get(i4), i2, new int[0]);
                                }
                            }
                            break;
                        case 5:
                            for (Row row2 : table.getRows()) {
                                for (int i5 = 0; i5 < row2.getCells().getCount(); i5 += 2) {
                                    zzZ(c19077zzZ, row2.getCells().get(i5), i2, new int[0]);
                                }
                            }
                            break;
                        case 6:
                            int iZzXXt2 = tableStyle.zzZYf().zzXXt();
                            int count2 = table.getRows().getCount();
                            for (int i6 = 0; i6 < count2; i6++) {
                                if (zzZ(i6, iZzXXt2, false, count2, i2, i)) {
                                    zzZ(c19077zzZ, table.getRows().get(i6), i2, new int[0]);
                                }
                            }
                            break;
                        case 7:
                            for (Row row3 : table.getRows()) {
                                for (int i7 = 1; i7 < row3.getCells().getCount(); i7 += 2) {
                                    zzZ(c19077zzZ, row3.getCells().get(i7), i2, new int[0]);
                                }
                            }
                            break;
                        case 8:
                            if (zzXJ(i2, zzXK(i, i3))) {
                                zzZ(c19077zzZ, table.getFirstRow().getFirstCell(), i2, new int[0]);
                            }
                            break;
                        case 9:
                            if (zzXJ(i2, zzXK(i, i3))) {
                                zzZ(c19077zzZ, table.getFirstRow().getLastCell(), i2, new int[0]);
                            }
                            break;
                        case 10:
                            if (zzXJ(i2, zzXK(i, i3))) {
                                zzZ(c19077zzZ, table.getLastRow().getFirstCell(), i2, new int[0]);
                            }
                            break;
                        case 11:
                            if (zzXJ(i2, zzXK(i, i3))) {
                                zzZ(c19077zzZ, table.getLastRow().getLastCell(), i2, new int[0]);
                            }
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }

        public static void zzZ(Table table, TableStyle tableStyle, int i, int i2) throws Exception {
            if (i == 0 || zzXJ(i2, 1) || zzXJ(i2, 2)) {
                zzM(table);
            }
            if (zzXJ(i2, 16)) {
                table.setPreferredWidth(PreferredWidth.AUTO);
                table.setAllowAutoFit(true);
            } else {
                table.setPreferredWidth(PreferredWidth.fromPercent(100.0d));
                table.setAllowAutoFit(false);
            }
            if (tableStyle == null) {
                return;
            }
            table.zzZYf().zzQ(4140, Integer.valueOf(i2));
            table.zzZR(4140, Integer.valueOf(i2));
            zzY(table, tableStyle, i, i2);
        }

        private static Object zzZw(Object obj) {
            if (((zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) != null ? zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) : zzV((Shading) com.aspose.words.internal.zzZKW.zzZ(obj, Shading.class))) != null ? zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) != null ? zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) : zzV((Shading) com.aspose.words.internal.zzZKW.zzZ(obj, Shading.class)) : zzD((Border) com.aspose.words.internal.zzZKW.zzZ(obj, Border.class))) != null) {
                return (zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) != null ? zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) : zzV((Shading) com.aspose.words.internal.zzZKW.zzZ(obj, Shading.class))) != null ? zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) != null ? zzc((com.aspose.words.internal.zzPV) com.aspose.words.internal.zzZKW.zzZ(obj, com.aspose.words.internal.zzPV.class)) : zzV((Shading) com.aspose.words.internal.zzZKW.zzZ(obj, Shading.class)) : zzD((Border) com.aspose.words.internal.zzZKW.zzZ(obj, Border.class));
            }
            return obj;
        }

        private static boolean zza(com.aspose.words.internal.zzPV zzpv) {
            return zzpv.zzPC() >= 192 || zzpv.zzPB() >= 192 || zzpv.zzPA() >= 192;
        }

        private static boolean zzb(com.aspose.words.internal.zzPV zzpv) {
            return com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzKa) || com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI5);
        }

        private static com.aspose.words.internal.zzPV zzc(com.aspose.words.internal.zzPV zzpv) {
            if (zzpv == null) {
                return null;
            }
            return zzpv.zzPz() ? zzpv : zza(zzpv) ? new com.aspose.words.internal.zzPV(zzpv.zzPD(), 192, 192, 192) : new com.aspose.words.internal.zzPV(zzpv.zzPD(), 128, 128, 128);
        }

        public static class zzX {
            private Map<int[], ArrayList<Integer>> zzYEE;
            private Map<int[], ArrayList<Integer>> zzYEF;
            private Map<int[], ArrayList<Integer>> zzYEG;
            private int[] zzYEH;

            private zzX() {
                this.zzYEG = new HashMap();
                this.zzYEF = new HashMap();
                this.zzYEE = new HashMap();
            }

            private Map<int[], ArrayList<Integer>> zzDt(int i) {
                if (i == 0) {
                    return this.zzYEG;
                }
                if (i == 1) {
                    return this.zzYEE;
                }
                if (i == 2) {
                    return this.zzYEF;
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: attrPrSource");
            }

            private zzX zzV(int i, int[] iArr) {
                Map<int[], ArrayList<Integer>> mapZzDt = zzDt(i);
                Ref ref = new Ref(null);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<int[], V>) mapZzDt, this.zzYEH, ref);
                ArrayList arrayList = (ArrayList) ref.get();
                if (!zZzZ) {
                    arrayList = new ArrayList();
                    com.aspose.words.internal.zzZQF.zzY(mapZzDt, this.zzYEH, arrayList);
                }
                for (int i2 : iArr) {
                    arrayList.add(Integer.valueOf(i2));
                }
                return this;
            }

            public final Iterable<Integer> zzXI(int i, int i2) {
                ArrayList arrayList = new ArrayList();
                Map<int[], ArrayList<Integer>> mapZzDt = zzDt(i2);
                for (int[] iArr : mapZzDt.keySet()) {
                    if (zzZ.zzX(i, iArr)) {
                        for (Integer num : mapZzDt.get(iArr)) {
                            num.intValue();
                            arrayList.add(num);
                        }
                    }
                }
                return arrayList;
            }

            public final zzX zzm(int... iArr) {
                return zzV(2, iArr);
            }

            public final zzX zzn(int... iArr) {
                return zzV(1, iArr);
            }

            public final zzX zzo(int... iArr) {
                return zzV(0, iArr);
            }

            public final zzX zzp(int... iArr) {
                this.zzYEH = iArr;
                return this;
            }

            public /* synthetic */ zzX(byte b) {
                this();
            }
        }

        private static boolean zzZ(int i, int i2, boolean z, int i3, int i4, int i5) {
            if (i == i3 - 1 && zzXJ(i4, 64)) {
                switch (i5) {
                    case 29:
                    case 31:
                    case 33:
                    case 34:
                    case 35:
                        break;
                    case 30:
                    case 32:
                    default:
                        return false;
                }
            }
            return com.aspose.words.internal.zzAN.zzZP((long) C24611OooO00o.OooO00o(i, i2, 1, i2)) == z;
        }

        private static void zzZ(zzY zzy, Table table, int i, int... iArr) {
            zzZ(i, table.zzZYf(), zzy, 0, iArr);
            for (Row row : table.getRows()) {
                zzZ(i, row.zzZYf(), zzy, 0, iArr);
                zzZ(zzy, row, i, iArr);
            }
        }

        private static void zzZ(zzY zzy, Row row, int i, int... iArr) {
            Iterator<T> it = row.getCells().iterator();
            while (it.hasNext()) {
                zzZ(zzy, (Cell) it.next(), i, iArr);
            }
        }

        private static void zzZ(zzY zzy, Cell cell, int i, int... iArr) {
            zzZ(i, cell.zz6G(), zzy, 1, iArr);
            Iterator<T> it = cell.getParagraphs().iterator();
            while (it.hasNext()) {
                zzZ(zzy, (Paragraph) it.next(), i, iArr);
            }
        }

        private static void zzZ(zzY zzy, Paragraph paragraph, int i, int... iArr) {
            zzZ(i, paragraph.zzYp5(), zzy, 2, iArr);
            Iterator<T> it = paragraph.getRuns().iterator();
            while (it.hasNext()) {
                zzZ(zzy, (Run) it.next(), i, iArr);
            }
        }

        private static void zzZ(zzY zzy, Run run, int i, int... iArr) {
            zzZ(i, run.zzZYh(), zzy, 2, iArr);
        }

        private static void zzZ(int i, zzZS zzzs, zzY zzy, int i2, int... iArr) {
            Object objZzPk;
            zzZS zzzsZzDu = zzy.zzDu(i2);
            if (zzzsZzDu == null) {
                return;
            }
            Iterator<Integer> it = zzYEL.zzXI(i, i2).iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!com.aspose.words.internal.zzZ1.zzZ(iArr, iIntValue) && (objZzPk = zzzsZzDu.zzPk(iIntValue)) != null) {
                    if (!zzXJ(i, 8)) {
                        objZzPk = zzZw(objZzPk);
                    }
                    zzzs.zzQ(iIntValue, objZzPk);
                }
            }
        }
    }

    private static void zzZ(FieldDatabaseDataTable fieldDatabaseDataTable, Table table) {
        zzZ(table, fieldDatabaseDataTable.getColumnNames());
    }

    private static void zzZ(FieldDatabaseDataRow fieldDatabaseDataRow, Table table) {
        zzZ(table, fieldDatabaseDataRow.getValues());
    }

    private static void zzZ(Table table, String[] strArr) {
        Row row = new Row(table.getDocument());
        table.getRows().add(row);
        for (String str : strArr) {
            Cell cell = new Cell(table.getDocument());
            row.getCells().add(cell);
            Paragraph paragraph = new Paragraph(cell.getDocument());
            cell.getParagraphs().add(paragraph);
            RunCollection runs = paragraph.getRuns();
            DocumentBase document = cell.getDocument();
            if (str == null) {
                str = "";
            }
            runs.add(new Run(document, str));
        }
    }
}
