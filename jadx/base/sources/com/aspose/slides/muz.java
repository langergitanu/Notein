package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
final class muz extends DomObject<Table> implements InterfaceC14376r6 {

    /* JADX INFO: renamed from: to */
    private static long f47444to = 1;

    /* JADX INFO: renamed from: k4 */
    private final yin[][] f47445k4;

    /* JADX INFO: renamed from: kk */
    private final long f47446kk;

    /* JADX INFO: renamed from: x1 */
    private IPresentationComponent f47447x1;

    public muz(Table table) {
        super(table);
        this.f47445k4 = m67741k4();
        long j = f47444to;
        f47444to = 1 + j;
        this.f47446kk = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m67739x1(int i, int i2, faf[][] fafVarArr, uc0[][] uc0VarArr, tx4[][][] tx4VarArr, faf fafVar, uc0 uc0Var, tx4 tx4Var, tx4 tx4Var2, tx4 tx4Var3, tx4 tx4Var4, tx4 tx4Var5, tx4 tx4Var6, tx4 tx4Var7, tx4 tx4Var8) {
        int size = ((Table) this.f2127h4).getRows().size();
        int i3 = i & 1;
        int i4 = i;
        Column column = null;
        while (i4 < i2) {
            Column columnM1147k4 = ((Table) this.f2127h4).f3496x1.m1147k4(i4);
            int i5 = 0;
            int rowSpan = 0;
            while (rowSpan < size) {
                Cell cellMo484k4 = columnM1147k4.mo484k4(rowSpan);
                if (cellMo484k4.m463dy() || cellMo484k4.getColSpan() + i4 > i2) {
                    rowSpan += cellMo484k4.m462du().getRowSpan();
                } else {
                    int colSpan = cellMo484k4.getColSpan();
                    int rowSpan2 = cellMo484k4.getRowSpan();
                    for (int i6 = i5; i6 < rowSpan2; i6++) {
                        if (column != null) {
                            int i7 = rowSpan + i6;
                            if ((column.get_Item(i7).getColSpan() & 1) == 1) {
                                if (tx4Var != null) {
                                    tx4VarArr[rowSpan + i6][i4][i5] = tx4Var;
                                }
                            } else if (tx4Var6 != null) {
                                tx4VarArr[i7][i4][i5] = tx4Var6;
                            }
                        }
                        if (tx4Var3 != null && (colSpan & 1) == 1) {
                            tx4VarArr[rowSpan + i6][i4 + colSpan][i5] = tx4Var3;
                        }
                    }
                    Row rowM2491k4 = rowSpan > 0 ? ((Table) this.f2127h4).f3493k4.m2491k4(rowSpan - 1) : null;
                    int i8 = rowSpan2 + rowSpan;
                    Row rowM2491k42 = i8 < size ? ((Table) this.f2127h4).f3493k4.m2491k4(i8) : null;
                    for (int i9 = i5; i9 < colSpan; i9++) {
                        if (rowM2491k4 == null || (rowM2491k4.get_Item(i4 + i9).getFirstColumnIndex() & 1) != i3) {
                            if (tx4Var2 != null) {
                                tx4VarArr[rowSpan][i4 + i9][1] = tx4Var2;
                            }
                        } else if (tx4Var5 != null) {
                            tx4VarArr[rowSpan + i9][i4][1] = tx4Var5;
                        }
                        if (tx4Var4 != null && (rowM2491k42 == null || (rowM2491k42.get_Item(i4 + i9).getFirstColumnIndex() & 1) != i3)) {
                            tx4VarArr[i8][i4 + i9][1] = tx4Var4;
                        }
                    }
                    if (fafVar != null) {
                        fafVarArr[rowSpan][i4] = fafVar;
                    }
                    if (uc0Var != null) {
                        uc0VarArr[rowSpan][i4].m71667x1(uc0Var);
                    }
                    if (tx4Var7 != null) {
                        tx4VarArr[rowSpan][i4][4] = tx4Var7;
                    }
                    if (tx4Var8 != null) {
                        tx4VarArr[rowSpan][i4][5] = tx4Var8;
                    }
                    rowSpan = i8;
                }
                i5 = 0;
            }
            i4 += 2;
            column = columnM1147k4;
        }
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f47447x1;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f2127h4, iPresentationComponentArr);
            this.f47447x1 = iPresentationComponentArr[0];
        }
        return this.f47447x1;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return this.f47446kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final yin m67740k4(int i, int i2) {
        return this.f47445k4[i2][i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m67736k4(int i, int i2, faf[][] fafVarArr, uc0[][] uc0VarArr, tx4[][][] tx4VarArr, faf fafVar, uc0 uc0Var, tx4 tx4Var, tx4 tx4Var2, tx4 tx4Var3, tx4 tx4Var4, tx4 tx4Var5, tx4 tx4Var6, tx4 tx4Var7, tx4 tx4Var8) {
        boolean z;
        boolean z2;
        char c;
        int size = ((Table) this.f2127h4).getColumns().size();
        int i3 = i & 1;
        int i4 = i;
        Row row = null;
        while (i4 < i2) {
            Row rowM2491k4 = ((Table) this.f2127h4).f3493k4.m2491k4(i4);
            int colSpan = 0;
            while (colSpan < size) {
                Cell cellMo484k4 = rowM2491k4.mo484k4(colSpan);
                if (cellMo484k4.m463dy() || cellMo484k4.getRowSpan() + i4 > i2) {
                    colSpan += cellMo484k4.m462du().getColSpan();
                } else {
                    int rowSpan = cellMo484k4.getRowSpan();
                    int colSpan2 = cellMo484k4.getColSpan();
                    int i5 = 0;
                    while (true) {
                        z = true;
                        if (i5 >= colSpan2) {
                            break;
                        }
                        if (row != null) {
                            int i6 = colSpan + i5;
                            if ((row.get_Item(i6).getRowSpan() & 1) == 1) {
                                if (tx4Var2 != null) {
                                    tx4VarArr[i4][colSpan + i5][1] = tx4Var2;
                                }
                            } else if (tx4Var5 != null) {
                                tx4VarArr[i4][i6][1] = tx4Var5;
                            }
                        }
                        if (tx4Var4 != null && (rowSpan & 1) == 1) {
                            tx4VarArr[i4 + rowSpan][colSpan + i5][1] = tx4Var4;
                        }
                        i5++;
                    }
                    Column columnM1147k4 = colSpan > 0 ? ((Table) this.f2127h4).f3496x1.m1147k4(colSpan - 1) : null;
                    int i7 = colSpan2 + colSpan;
                    Column columnM1147k42 = i7 < size ? ((Table) this.f2127h4).f3496x1.m1147k4(i7) : null;
                    int i8 = 0;
                    while (i8 < rowSpan) {
                        if (columnM1147k4 != null) {
                            c = 0;
                            int i9 = i4 + i8;
                            z2 = z;
                            if ((columnM1147k4.get_Item(i9).getFirstRowIndex() & 1) == i3) {
                                if (tx4Var6 != null) {
                                    tx4VarArr[i9][colSpan][0] = tx4Var6;
                                }
                            }
                            if (tx4Var3 == null && (columnM1147k42 == null || (columnM1147k42.get_Item(i4 + i8).getFirstRowIndex() & 1) != i3)) {
                                tx4VarArr[i4 + i8][i7][c] = tx4Var3;
                            }
                            i8++;
                            z = z2;
                        } else {
                            z2 = z;
                            c = 0;
                        }
                        if (tx4Var != null) {
                            tx4VarArr[i4 + i8][colSpan][c] = tx4Var;
                        }
                        if (tx4Var3 == null) {
                        }
                        i8++;
                        z = z2;
                    }
                    if (fafVar != null) {
                        fafVarArr[i4][colSpan] = fafVar;
                    }
                    if (uc0Var != null) {
                        uc0VarArr[i4][colSpan].m71667x1(uc0Var);
                    }
                    if (tx4Var7 != null) {
                        tx4VarArr[i4][colSpan][4] = tx4Var7;
                    }
                    if (tx4Var8 != null) {
                        tx4VarArr[i4][colSpan][5] = tx4Var8;
                    }
                    colSpan = i7;
                }
            }
            i4 += 2;
            row = rowM2491k4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m67737k4(int i, int i2, faf[][] fafVarArr, uc0[][] uc0VarArr, tx4[][][] tx4VarArr, fdb fdbVar, uc0 uc0Var) {
        faf[] fafVarArr2 = {null};
        uc0[] uc0VarArr2 = {null};
        tx4[] tx4VarArr2 = {null};
        tx4[] tx4VarArr3 = {null};
        tx4[] tx4VarArr4 = {null};
        tx4[] tx4VarArr5 = {null};
        tx4[] tx4VarArr6 = {null};
        tx4[] tx4VarArr7 = {null};
        boolean zM67738k4 = m67738k4(fdbVar, uc0Var, fafVarArr2, uc0VarArr2, tx4VarArr2, tx4VarArr3, tx4VarArr4, tx4VarArr5, new tx4[]{null}, new tx4[]{null}, tx4VarArr6, tx4VarArr7);
        faf fafVar = fafVarArr2[0];
        uc0 uc0Var2 = uc0VarArr2[0];
        tx4 tx4Var = tx4VarArr2[0];
        tx4 tx4Var2 = tx4VarArr3[0];
        tx4 tx4Var3 = tx4VarArr4[0];
        tx4 tx4Var4 = tx4VarArr5[0];
        tx4 tx4Var5 = tx4VarArr6[0];
        tx4 tx4Var6 = tx4VarArr7[0];
        if (zM67738k4) {
            ICell iCell = ((Table) this.f2127h4).get_Item(i2, i);
            int firstColumnIndex = iCell.getFirstColumnIndex();
            int firstRowIndex = iCell.getFirstRowIndex();
            for (int i3 = 0; i3 < iCell.getColSpan(); i3++) {
                if (tx4Var2 != null) {
                    tx4VarArr[firstRowIndex][firstColumnIndex + i3][1] = tx4Var2;
                }
                if (tx4Var4 != null) {
                    tx4VarArr[iCell.getRowSpan() + firstRowIndex][firstColumnIndex + i3][1] = tx4Var4;
                }
            }
            for (int i4 = 0; i4 < iCell.getRowSpan(); i4++) {
                if (tx4Var != null) {
                    tx4VarArr[firstRowIndex + i4][firstColumnIndex][0] = tx4Var;
                }
                if (tx4Var3 != null) {
                    tx4VarArr[firstRowIndex + i4][iCell.getColSpan() + firstColumnIndex][0] = tx4Var3;
                }
            }
            if (fafVar != null) {
                fafVarArr[firstRowIndex][firstColumnIndex] = fafVar;
            }
            if (uc0Var2 != null) {
                uc0VarArr[firstRowIndex][firstColumnIndex].m71667x1(uc0Var2);
            }
            if (tx4Var5 != null) {
                tx4VarArr[firstRowIndex][firstColumnIndex][4] = tx4Var5;
            }
            if (tx4Var6 != null) {
                tx4VarArr[firstRowIndex][firstColumnIndex][5] = tx4Var6;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67738k4(fdb fdbVar, uc0 uc0Var, faf[] fafVarArr, uc0[] uc0VarArr, tx4[] tx4VarArr, tx4[] tx4VarArr2, tx4[] tx4VarArr3, tx4[] tx4VarArr4, tx4[] tx4VarArr5, tx4[] tx4VarArr6, tx4[] tx4VarArr7, tx4[] tx4VarArr8) {
        fafVarArr[0] = fdbVar.m6120c5().m6069to() != 0 ? fdbVar.m6120c5() : null;
        if (!uc0Var.m71655dy()) {
            uc0Var = null;
        }
        uc0VarArr[0] = uc0Var;
        tx4VarArr[0] = fdbVar.m6126k4().m71384k4() != 0 ? fdbVar.m6126k4() : null;
        tx4VarArr2[0] = fdbVar.m6127kk().m71384k4() != 0 ? fdbVar.m6127kk() : null;
        tx4VarArr3[0] = fdbVar.m6130x1().m71384k4() != 0 ? fdbVar.m6130x1() : null;
        tx4VarArr4[0] = fdbVar.m6129to().m71384k4() != 0 ? fdbVar.m6129to() : null;
        tx4VarArr5[0] = fdbVar.m6122du().m71384k4() != 0 ? fdbVar.m6122du() : null;
        tx4VarArr6[0] = fdbVar.m6124h4().m71384k4() != 0 ? fdbVar.m6124h4() : null;
        tx4VarArr7[0] = fdbVar.m6128m9().m71384k4() != 0 ? fdbVar.m6128m9() : null;
        tx4 tx4VarM6123dy = fdbVar.m6123dy().m71384k4() != 0 ? fdbVar.m6123dy() : null;
        tx4VarArr8[0] = tx4VarM6123dy;
        return (fafVarArr[0] == null && uc0VarArr[0] == null && tx4VarArr[0] == null && tx4VarArr2[0] == null && tx4VarArr3[0] == null && tx4VarArr4[0] == null && tx4VarArr5[0] == null && tx4VarArr6[0] == null && tx4VarArr7[0] == null && tx4VarM6123dy == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e4  */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95, types: [int] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yin[][] m67741k4() {
        int i;
        faf[][] fafVarArr;
        char c;
        uc0[][] uc0VarArr;
        tx4[][][] tx4VarArr;
        char c2;
        int i2;
        int i3;
        int i4;
        faf[][] fafVarArr2;
        uc0[][] uc0VarArr2;
        tx4[][][] tx4VarArr2;
        x5o x5oVar;
        int i5;
        faf[][] fafVarArr3;
        uc0[][] uc0VarArr3;
        int i6;
        tx4[][][] tx4VarArr3;
        char c3;
        int i7;
        ?? r1;
        int i8;
        muz muzVar = this;
        int size = ((Table) muzVar.f2127h4).f3493k4.size();
        int size2 = ((Table) muzVar.f2127h4).f3496x1.size();
        char c4 = 1;
        faf[][] fafVarArr4 = (faf[][]) Array.newInstance((Class<?>) faf.class, size, size2);
        uc0[][] uc0VarArr4 = (uc0[][]) Array.newInstance((Class<?>) uc0.class, size, size2);
        tx4[][][] tx4VarArr4 = (tx4[][][]) Array.newInstance((Class<?>) tx4.class, size + 1, size2 + 1, 6);
        x5o x5oVarM2875to = ((Table) muzVar.f2127h4).m2875to();
        if (x5oVarM2875to != null) {
            for (int i9 = 0; i9 < size; i9++) {
                for (int i10 = 0; i10 < size2; i10++) {
                    uc0VarArr4[i9][i10] = new uc0(x5oVarM2875to);
                }
            }
            faf[] fafVarArr5 = {null};
            uc0[] uc0VarArr5 = {null};
            tx4[] tx4VarArr5 = {null};
            tx4[] tx4VarArr6 = {null};
            tx4[] tx4VarArr7 = {null};
            char c5 = 0;
            tx4[] tx4VarArr8 = {null};
            tx4[] tx4VarArr9 = {null};
            tx4[] tx4VarArr10 = {null};
            tx4[] tx4VarArr11 = {null};
            tx4[] tx4VarArr12 = {null};
            boolean zM67738k4 = m67738k4(x5oVarM2875to.m73128kk(), x5oVarM2875to.m73134rv(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
            faf fafVar = fafVarArr5[0];
            uc0 uc0Var = uc0VarArr5[0];
            tx4 tx4Var = tx4VarArr5[0];
            tx4 tx4Var2 = tx4VarArr6[0];
            tx4 tx4Var3 = tx4VarArr7[0];
            tx4 tx4Var4 = tx4VarArr8[0];
            tx4 tx4Var5 = tx4VarArr9[0];
            tx4 tx4Var6 = tx4VarArr10[0];
            tx4 tx4Var7 = tx4VarArr11[0];
            tx4 tx4Var8 = tx4VarArr12[0];
            if (zM67738k4) {
                tx4 tx4Var9 = tx4Var2;
                int i11 = 0;
                while (i11 < size) {
                    char c6 = c4;
                    tx4 tx4Var10 = tx4Var;
                    int i12 = 0;
                    while (i12 < size2) {
                        fafVarArr4[i11][i12] = fafVar;
                        uc0VarArr4[i11][i12].m71659k4(uc0Var);
                        tx4VarArr4[i11][i12][4] = tx4Var7;
                        tx4VarArr4[i11][i12][5] = tx4Var8;
                        tx4VarArr4[i11][i12][0] = tx4Var10;
                        tx4VarArr4[i11][i12][c6] = tx4Var9;
                        i12++;
                        tx4Var10 = tx4Var6;
                        size = size;
                    }
                    tx4VarArr4[i11][size2][0] = tx4Var3;
                    i11++;
                    tx4Var9 = tx4Var5;
                    c4 = c6;
                    size = size;
                }
                i3 = size;
                c = c4;
                for (int i13 = 0; i13 < size2; i13++) {
                    tx4VarArr4[i3][i13][c] = tx4Var4;
                }
            } else {
                i3 = size;
                c = 1;
            }
            boolean firstRow = ((Table) muzVar.f2127h4).getFirstRow();
            int i14 = ((Table) muzVar.f2127h4).getLastRow() ? i3 - 1 : i3;
            boolean firstCol = ((Table) muzVar.f2127h4).getFirstCol();
            int i15 = ((Table) muzVar.f2127h4).getLastCol() ? size2 - 1 : size2;
            if (((Table) muzVar.f2127h4).getHorizontalBanding()) {
                fafVarArr5[0] = fafVar;
                uc0VarArr5[0] = uc0Var;
                tx4VarArr5[0] = tx4Var;
                tx4VarArr6[0] = tx4Var2;
                tx4VarArr7[0] = tx4Var3;
                tx4VarArr8[0] = tx4Var4;
                tx4VarArr9[0] = tx4Var5;
                tx4VarArr10[0] = tx4Var6;
                tx4VarArr11[0] = tx4Var7;
                tx4VarArr12[0] = tx4Var8;
                boolean zM67738k42 = m67738k4(x5oVarM2875to.m73135to(), x5oVarM2875to.m73143x6(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                faf fafVar2 = fafVarArr5[0];
                int i16 = i14;
                fafVarArr2 = fafVarArr4;
                uc0VarArr2 = uc0VarArr4;
                uc0 uc0Var2 = uc0VarArr5[0];
                tx4VarArr2 = tx4VarArr4;
                tx4 tx4Var11 = tx4VarArr5[0];
                tx4 tx4Var12 = tx4VarArr6[0];
                tx4 tx4Var13 = tx4VarArr7[0];
                tx4 tx4Var14 = tx4VarArr8[0];
                tx4 tx4Var15 = tx4VarArr9[0];
                tx4 tx4Var16 = tx4VarArr10[0];
                tx4 tx4Var17 = tx4VarArr11[0];
                tx4 tx4Var18 = tx4VarArr12[0];
                i4 = size2;
                x5oVar = x5oVarM2875to;
                i5 = i3;
                c2 = 3;
                if (zM67738k42) {
                    muzVar.m67736k4(firstRow ? 1 : 0, i16, fafVarArr2, uc0VarArr2, tx4VarArr2, fafVar2, uc0Var2, tx4Var11, tx4Var12, tx4Var13, tx4Var14, tx4Var15, tx4Var16, tx4Var17, tx4Var18);
                    c5 = 0;
                }
                fafVarArr5[c5] = fafVar2;
                uc0VarArr5[c5] = uc0Var2;
                tx4VarArr5[c5] = tx4Var11;
                tx4VarArr6[c5] = tx4Var12;
                tx4VarArr7[c5] = tx4Var13;
                tx4VarArr8[c5] = tx4Var14;
                tx4VarArr9[c5] = tx4Var15;
                tx4VarArr10[c5] = tx4Var16;
                tx4VarArr11[c5] = tx4Var17;
                tx4VarArr12[c5] = tx4Var18;
                boolean zM67738k43 = m67738k4(x5oVar.m73121du(), x5oVar.m73132ne(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                fafVar = fafVarArr5[c5];
                uc0 uc0Var3 = uc0VarArr5[c5];
                tx4 tx4Var19 = tx4VarArr5[c5];
                tx4 tx4Var20 = tx4VarArr6[c5];
                tx4 tx4Var21 = tx4VarArr7[c5];
                tx4 tx4Var22 = tx4VarArr8[c5];
                tx4 tx4Var23 = tx4VarArr9[c5];
                tx4 tx4Var24 = tx4VarArr10[c5];
                tx4 tx4Var25 = tx4VarArr11[c5];
                tx4 tx4Var26 = tx4VarArr12[c5];
                if (zM67738k43) {
                    muzVar = this;
                    muzVar.m67736k4((firstRow ? 1 : 0) + 1, i16, fafVarArr2, uc0VarArr2, tx4VarArr2, fafVar, uc0Var3, tx4Var19, tx4Var20, tx4Var21, tx4Var22, tx4Var23, tx4Var24, tx4Var25, tx4Var26);
                } else {
                    muzVar = this;
                }
                tx4Var6 = tx4Var24;
                tx4Var7 = tx4Var25;
                tx4Var8 = tx4Var26;
                tx4Var3 = tx4Var21;
                tx4Var4 = tx4Var22;
                tx4Var5 = tx4Var23;
                uc0Var = uc0Var3;
                tx4Var = tx4Var19;
                tx4Var2 = tx4Var20;
            } else {
                i4 = size2;
                fafVarArr2 = fafVarArr4;
                uc0VarArr2 = uc0VarArr4;
                tx4VarArr2 = tx4VarArr4;
                x5oVar = x5oVarM2875to;
                i5 = i3;
                c2 = 3;
            }
            if (((Table) muzVar.f2127h4).getVerticalBanding()) {
                char c7 = 0;
                fafVarArr5[0] = fafVar;
                uc0VarArr5[0] = uc0Var;
                tx4VarArr5[0] = tx4Var;
                tx4VarArr6[0] = tx4Var2;
                tx4VarArr7[0] = tx4Var3;
                tx4VarArr8[0] = tx4Var4;
                tx4VarArr9[0] = tx4Var5;
                tx4VarArr10[0] = tx4Var6;
                tx4VarArr11[0] = tx4Var7;
                tx4VarArr12[0] = tx4Var8;
                boolean zM67738k44 = m67738k4(x5oVar.m73124h4(), x5oVar.m73125ix(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                faf fafVar3 = fafVarArr5[0];
                uc0 uc0Var4 = uc0VarArr5[0];
                tx4 tx4Var27 = tx4VarArr5[0];
                tx4 tx4Var28 = tx4VarArr6[0];
                tx4 tx4Var29 = tx4VarArr7[0];
                tx4 tx4Var30 = tx4VarArr8[0];
                tx4 tx4Var31 = tx4VarArr9[0];
                tx4 tx4Var32 = tx4VarArr10[0];
                tx4 tx4Var33 = tx4VarArr11[0];
                tx4 tx4Var34 = tx4VarArr12[0];
                if (zM67738k44) {
                    boolean z = firstCol;
                    i8 = i15;
                    muzVar.m67739x1(z ? 1 : 0, i8, fafVarArr2, uc0VarArr2, tx4VarArr2, fafVar3, uc0Var4, tx4Var27, tx4Var28, tx4Var29, tx4Var30, tx4Var31, tx4Var32, tx4Var33, tx4Var34);
                    c7 = 0;
                    r1 = z;
                } else {
                    r1 = firstCol;
                    i8 = i15;
                }
                fafVarArr5[c7] = fafVar3;
                uc0VarArr5[c7] = uc0Var4;
                tx4VarArr5[c7] = tx4Var27;
                tx4VarArr6[c7] = tx4Var28;
                tx4VarArr7[c7] = tx4Var29;
                tx4VarArr8[c7] = tx4Var30;
                tx4VarArr9[c7] = tx4Var31;
                tx4VarArr10[c7] = tx4Var32;
                tx4VarArr11[c7] = tx4Var33;
                tx4VarArr12[c7] = tx4Var34;
                boolean zM67738k45 = m67738k4(x5oVar.m73131m9(), x5oVar.m73136u4(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                fafVar = fafVarArr5[c7];
                uc0 uc0Var5 = uc0VarArr5[c7];
                tx4 tx4Var35 = tx4VarArr5[c7];
                tx4 tx4Var36 = tx4VarArr6[c7];
                tx4 tx4Var37 = tx4VarArr7[c7];
                tx4 tx4Var38 = tx4VarArr8[c7];
                tx4 tx4Var39 = tx4VarArr9[c7];
                tx4 tx4Var40 = tx4VarArr10[c7];
                tx4 tx4Var41 = tx4VarArr11[c7];
                tx4 tx4Var42 = tx4VarArr12[c7];
                if (zM67738k45) {
                    muzVar = this;
                    muzVar.m67739x1(r1 + 1, i8, fafVarArr2, uc0VarArr2, tx4VarArr2, fafVar, uc0Var5, tx4Var35, tx4Var36, tx4Var37, tx4Var38, tx4Var39, tx4Var40, tx4Var41, tx4Var42);
                } else {
                    muzVar = this;
                }
                tx4Var6 = tx4Var40;
                tx4Var7 = tx4Var41;
                tx4Var8 = tx4Var42;
                tx4Var3 = tx4Var37;
                tx4Var4 = tx4Var38;
                tx4Var5 = tx4Var39;
                uc0Var = uc0Var5;
                tx4Var = tx4Var35;
                tx4Var2 = tx4Var36;
            }
            if (((Table) muzVar.f2127h4).getLastCol()) {
                fafVarArr5[0] = fafVar;
                uc0VarArr5[0] = uc0Var;
                tx4VarArr5[0] = tx4Var;
                tx4VarArr6[0] = tx4Var2;
                tx4VarArr7[0] = tx4Var3;
                tx4VarArr8[0] = tx4Var4;
                tx4VarArr9[0] = tx4Var5;
                tx4VarArr10[0] = tx4Var6;
                tx4VarArr11[0] = tx4Var7;
                tx4VarArr12[0] = tx4Var8;
                boolean zM67738k46 = m67738k4(x5oVar.m73122dy(), x5oVar.m73139uz(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                fafVar = fafVarArr5[0];
                uc0Var = uc0VarArr5[0];
                tx4Var = tx4VarArr5[0];
                tx4Var2 = tx4VarArr6[0];
                tx4Var3 = tx4VarArr7[0];
                tx4Var4 = tx4VarArr8[0];
                tx4Var5 = tx4VarArr9[0];
                tx4Var6 = tx4VarArr10[0];
                tx4Var7 = tx4VarArr11[0];
                tx4Var8 = tx4VarArr12[0];
                if (zM67738k46) {
                    i = i4;
                    Column columnM1147k4 = ((Table) muzVar.f2127h4).f3496x1.m1147k4(i - 1);
                    int colSpan = columnM1147k4.get_Item(0).getColSpan();
                    int i17 = 0;
                    i6 = 0;
                    tx4 tx4Var43 = tx4Var2;
                    i2 = i5;
                    while (i17 < i2) {
                        Cell cell = (Cell) columnM1147k4.get_Item(i17);
                        faf[][] fafVarArr6 = fafVarArr2;
                        int colSpan2 = cell.getColSpan();
                        int firstColumnIndex = cell.getFirstColumnIndex();
                        uc0[][] uc0VarArr6 = uc0VarArr2;
                        tx4[][][] tx4VarArr13 = tx4VarArr2;
                        for (int i18 = 0; i18 < cell.getRowSpan(); i18++) {
                            if (tx4Var != null) {
                                tx4VarArr13[i17 + i18][firstColumnIndex][0] = tx4Var;
                            }
                            if (tx4Var4 != null) {
                                tx4VarArr13[i17 + i18][i][0] = tx4Var3;
                            }
                        }
                        if (fafVar != null) {
                            fafVarArr6[i17][firstColumnIndex] = fafVar;
                        }
                        if (uc0Var != null) {
                            uc0VarArr6[i17][firstColumnIndex].m71667x1(uc0Var);
                        }
                        if (tx4Var7 != null) {
                            tx4VarArr13[i17][firstColumnIndex][4] = tx4Var7;
                        }
                        if (tx4Var8 != null) {
                            tx4VarArr13[i17][firstColumnIndex][5] = tx4Var8;
                        }
                        int rowSpan = cell.getRowSpan() + i17;
                        int iM67507x1 = C14116yg.m67507x1(colSpan, colSpan2);
                        int iM67483k4 = C14116yg.m67483k4(colSpan, colSpan2);
                        if (tx4Var != null) {
                            i7 = colSpan2;
                            for (int i19 = i - iM67483k4; i19 < i - iM67507x1; i19++) {
                                tx4VarArr13[i17][i19][c] = tx4Var2;
                            }
                        } else {
                            i7 = colSpan2;
                        }
                        if (tx4Var43 != null) {
                            for (int i20 = i - iM67507x1; i20 < i; i20++) {
                                tx4VarArr13[i17][i20][0] = tx4Var43;
                            }
                        }
                        i17 = rowSpan;
                        tx4Var43 = tx4Var5;
                        colSpan = i7;
                        fafVarArr2 = fafVarArr6;
                        uc0VarArr2 = uc0VarArr6;
                        tx4VarArr2 = tx4VarArr13;
                    }
                    fafVarArr3 = fafVarArr2;
                    uc0VarArr3 = uc0VarArr2;
                    tx4VarArr3 = tx4VarArr2;
                    if (tx4Var4 != null) {
                        for (int colSpan3 = i - ((Cell) columnM1147k4.get_Item(i2 - 1)).getColSpan(); colSpan3 < i; colSpan3++) {
                            tx4VarArr3[i2][colSpan3][c] = tx4Var4;
                        }
                    }
                    if (((Table) muzVar.f2127h4).getFirstCol()) {
                        fafVarArr5[i6] = fafVar;
                        uc0VarArr5[i6] = uc0Var;
                        tx4VarArr5[i6] = tx4Var;
                        tx4VarArr6[i6] = tx4Var2;
                        tx4VarArr7[i6] = tx4Var3;
                        tx4VarArr8[i6] = tx4Var4;
                        tx4VarArr9[i6] = tx4Var5;
                        tx4VarArr10[i6] = tx4Var6;
                        tx4VarArr11[i6] = tx4Var7;
                        tx4VarArr12[i6] = tx4Var8;
                        boolean zM67738k47 = m67738k4(x5oVar.m73119c5(), x5oVar.m73141wl(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                        fafVar = fafVarArr5[i6];
                        uc0Var = uc0VarArr5[i6];
                        tx4Var = tx4VarArr5[i6];
                        tx4Var2 = tx4VarArr6[i6];
                        tx4Var3 = tx4VarArr7[i6];
                        tx4Var4 = tx4VarArr8[i6];
                        tx4Var5 = tx4VarArr9[i6];
                        tx4Var6 = tx4VarArr10[i6];
                        tx4Var7 = tx4VarArr11[i6];
                        tx4Var8 = tx4VarArr12[i6];
                        if (zM67738k47) {
                            int i21 = i6;
                            Column columnM1147k42 = ((Table) muzVar.f2127h4).f3496x1.m1147k4(i21);
                            int colSpan4 = columnM1147k42.mo484k4(i21).getColSpan();
                            tx4 tx4Var44 = tx4Var2;
                            int rowSpan2 = 0;
                            while (rowSpan2 < i2) {
                                Cell cellMo484k4 = columnM1147k42.mo484k4(rowSpan2);
                                int colSpan5 = cellMo484k4.getColSpan();
                                int i22 = rowSpan2;
                                tx4 tx4Var45 = tx4Var44;
                                for (int i23 = 0; i23 < cellMo484k4.getRowSpan(); i23++) {
                                    if (tx4Var != null) {
                                        c3 = 0;
                                        tx4VarArr3[i22 + i23][0][0] = tx4Var;
                                    } else {
                                        c3 = 0;
                                    }
                                    if (tx4Var3 != null) {
                                        tx4VarArr3[i22 + i23][colSpan5][c3] = tx4Var3;
                                    }
                                }
                                if (fafVar != null) {
                                    fafVarArr3[i22][0] = fafVar;
                                }
                                if (uc0Var != null) {
                                    uc0VarArr3[i22][0].m71667x1(uc0Var);
                                }
                                if (tx4Var7 != null) {
                                    tx4VarArr3[i22][0][4] = tx4Var7;
                                }
                                if (tx4Var8 != null) {
                                    tx4VarArr3[i22][0][5] = tx4Var8;
                                }
                                rowSpan2 = cellMo484k4.getRowSpan() + i22;
                                int iM67507x12 = C14116yg.m67507x1(colSpan4, colSpan5);
                                int iM67483k42 = C14116yg.m67483k4(colSpan4, colSpan5);
                                if (tx4Var45 != null) {
                                    for (int i24 = 0; i24 < iM67507x12; i24++) {
                                        tx4VarArr3[i22][i24][c] = tx4Var45;
                                    }
                                }
                                if (tx4Var3 != null) {
                                    while (iM67507x12 < iM67483k42) {
                                        tx4VarArr3[i22][iM67507x12][c] = tx4Var3;
                                        iM67507x12++;
                                    }
                                }
                                colSpan4 = colSpan5;
                                tx4Var44 = tx4Var5;
                            }
                            if (tx4Var4 != null) {
                                Cell cell2 = (Cell) columnM1147k42.get_Item(i2 - 1);
                                for (int i25 = 0; i25 < cell2.getColSpan(); i25++) {
                                    tx4VarArr3[i2][i25][c] = tx4Var4;
                                }
                            }
                        }
                    }
                    if (((Table) muzVar.f2127h4).getLastRow()) {
                        fafVarArr5[0] = fafVar;
                        uc0VarArr5[0] = uc0Var;
                        tx4VarArr5[0] = tx4Var;
                        tx4VarArr6[0] = tx4Var2;
                        tx4VarArr7[0] = tx4Var3;
                        tx4VarArr8[0] = tx4Var4;
                        tx4VarArr9[0] = tx4Var5;
                        tx4VarArr10[0] = tx4Var6;
                        tx4VarArr11[0] = tx4Var7;
                        tx4VarArr12[0] = tx4Var8;
                        boolean zM67738k48 = m67738k4(x5oVar.m73126jd(), x5oVar.m73133qq(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                        fafVar = fafVarArr5[0];
                        uc0Var = uc0VarArr5[0];
                        tx4Var = tx4VarArr5[0];
                        tx4Var2 = tx4VarArr6[0];
                        tx4Var3 = tx4VarArr7[0];
                        tx4Var4 = tx4VarArr8[0];
                        tx4Var5 = tx4VarArr9[0];
                        tx4Var6 = tx4VarArr10[0];
                        tx4Var7 = tx4VarArr11[0];
                        tx4Var8 = tx4VarArr12[0];
                        if (zM67738k48) {
                            Row rowM2491k4 = ((Table) muzVar.f2127h4).f3493k4.m2491k4(i2 - 1);
                            int rowSpan3 = rowM2491k4.get_Item(0).getRowSpan();
                            tx4 tx4Var46 = tx4Var;
                            int colSpan6 = 0;
                            while (colSpan6 < i) {
                                Cell cell3 = (Cell) rowM2491k4.get_Item(colSpan6);
                                int rowSpan4 = cell3.getRowSpan();
                                int firstRowIndex = cell3.getFirstRowIndex();
                                int i26 = colSpan6;
                                tx4 tx4Var47 = tx4Var46;
                                for (int i27 = 0; i27 < cell3.getColSpan(); i27++) {
                                    if (tx4Var2 != null) {
                                        tx4VarArr3[firstRowIndex][i26 + i27][c] = tx4Var2;
                                    }
                                    if (tx4Var4 != null) {
                                        tx4VarArr3[i2][i26 + i27][c] = tx4Var4;
                                    }
                                }
                                if (fafVar != null) {
                                    fafVarArr3[firstRowIndex][i26] = fafVar;
                                }
                                if (uc0Var != null) {
                                    uc0VarArr3[firstRowIndex][i26].m71667x1(uc0Var);
                                }
                                if (tx4Var7 != null) {
                                    tx4VarArr3[firstRowIndex][i26][4] = tx4Var7;
                                }
                                if (tx4Var8 != null) {
                                    tx4VarArr3[firstRowIndex][i26][5] = tx4Var8;
                                }
                                colSpan6 = cell3.getColSpan() + i26;
                                int iM67507x13 = C14116yg.m67507x1(rowSpan3, rowSpan4);
                                int iM67483k43 = C14116yg.m67483k4(rowSpan3, rowSpan4);
                                if (tx4Var2 != null) {
                                    for (int i28 = i2 - iM67483k43; i28 < i2 - iM67507x13; i28++) {
                                        tx4VarArr3[i28][i26][0] = tx4Var2;
                                    }
                                }
                                if (tx4Var47 != null) {
                                    for (int i29 = i2 - iM67507x13; i29 < i2; i29++) {
                                        tx4VarArr3[i29][i26][0] = tx4Var47;
                                    }
                                }
                                rowSpan3 = rowSpan4;
                                tx4Var46 = tx4Var6;
                            }
                            if (tx4Var3 != null) {
                                for (int rowSpan5 = i2 - ((Cell) rowM2491k4.get_Item(i - 1)).getRowSpan(); rowSpan5 < i2; rowSpan5++) {
                                    tx4VarArr3[rowSpan5][i][0] = tx4Var3;
                                }
                            }
                        }
                    }
                    if (((Table) muzVar.f2127h4).getFirstRow()) {
                        int i30 = 0;
                        fafVarArr5[0] = fafVar;
                        uc0VarArr5[0] = uc0Var;
                        tx4VarArr5[0] = tx4Var;
                        tx4VarArr6[0] = tx4Var2;
                        tx4VarArr7[0] = tx4Var3;
                        tx4VarArr8[0] = tx4Var4;
                        tx4VarArr9[0] = tx4Var5;
                        tx4VarArr10[0] = tx4Var6;
                        tx4VarArr11[0] = tx4Var7;
                        tx4VarArr12[0] = tx4Var8;
                        boolean zM67738k49 = m67738k4(x5oVar.m73138up(), x5oVar.m73118bv(), fafVarArr5, uc0VarArr5, tx4VarArr5, tx4VarArr6, tx4VarArr7, tx4VarArr8, tx4VarArr9, tx4VarArr10, tx4VarArr11, tx4VarArr12);
                        faf fafVar4 = fafVarArr5[0];
                        uc0 uc0Var6 = uc0VarArr5[0];
                        tx4 tx4Var48 = tx4VarArr5[0];
                        tx4 tx4Var49 = tx4VarArr6[0];
                        tx4 tx4Var50 = tx4VarArr7[0];
                        tx4 tx4Var51 = tx4VarArr8[0];
                        tx4 tx4Var52 = tx4VarArr10[0];
                        tx4 tx4Var53 = tx4VarArr11[0];
                        tx4 tx4Var54 = tx4VarArr12[0];
                        if (zM67738k49) {
                            Row rowM2491k42 = ((Table) muzVar.f2127h4).f3493k4.m2491k4(0);
                            int rowSpan6 = rowM2491k42.mo484k4(0).getRowSpan();
                            int i31 = 0;
                            while (i31 < i) {
                                Cell cellMo484k42 = rowM2491k42.mo484k4(i31);
                                int i32 = i30;
                                int rowSpan7 = cellMo484k42.getRowSpan();
                                faf fafVar5 = fafVar4;
                                tx4 tx4Var55 = tx4Var48;
                                int i33 = i32;
                                while (i33 < cellMo484k42.getColSpan()) {
                                    if (tx4Var49 != null) {
                                        tx4VarArr3[i32][i31 + i33][c] = tx4Var49;
                                    }
                                    if (tx4Var51 != null) {
                                        tx4VarArr3[rowSpan7][i31 + i33][c] = tx4Var51;
                                    }
                                    i33++;
                                    i32 = 0;
                                }
                                if (fafVar5 != null) {
                                    fafVarArr3[0][i31] = fafVar5;
                                }
                                if (uc0Var6 != null) {
                                    uc0VarArr3[0][i31].m71667x1(uc0Var6);
                                }
                                if (tx4Var53 != null) {
                                    tx4VarArr3[0][i31][4] = tx4Var53;
                                }
                                if (tx4Var54 != null) {
                                    tx4VarArr3[0][i31][5] = tx4Var54;
                                }
                                int colSpan7 = cellMo484k42.getColSpan() + i31;
                                int iM67507x14 = C14116yg.m67507x1(rowSpan6, rowSpan7);
                                int iM67483k44 = C14116yg.m67483k4(rowSpan6, rowSpan7);
                                if (tx4Var55 != null) {
                                    for (int i34 = 0; i34 < iM67507x14; i34++) {
                                        tx4VarArr3[i34][i31][0] = tx4Var55;
                                    }
                                }
                                char c8 = 0;
                                if (tx4Var51 != null) {
                                    while (iM67507x14 < iM67483k44) {
                                        tx4VarArr3[iM67507x14][i31][c8] = tx4Var51;
                                        iM67507x14++;
                                        c8 = 0;
                                    }
                                }
                                i31 = colSpan7;
                                tx4Var48 = tx4Var52;
                                rowSpan6 = rowSpan7;
                                fafVar4 = fafVar5;
                                i30 = 0;
                            }
                            if (tx4Var50 != null) {
                                Cell cell4 = (Cell) rowM2491k42.get_Item(i - 1);
                                for (int i35 = 0; i35 < cell4.getRowSpan(); i35++) {
                                    tx4VarArr3[i35][i][0] = tx4Var50;
                                }
                            }
                        }
                    }
                    if (((Table) muzVar.f2127h4).getFirstRow() || !((Table) muzVar.f2127h4).getFirstCol()) {
                        fafVarArr = fafVarArr3;
                        uc0VarArr = uc0VarArr3;
                        tx4VarArr = tx4VarArr3;
                    } else {
                        fafVarArr = fafVarArr3;
                        uc0VarArr = uc0VarArr3;
                        tx4VarArr = tx4VarArr3;
                        muzVar.m67737k4(0, 0, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73129ks(), x5oVar.m73130lr());
                    }
                    if (((Table) muzVar.f2127h4).getFirstRow() && ((Table) muzVar.f2127h4).getLastCol()) {
                        muzVar.m67737k4(0, i - 1, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73145yj(), x5oVar.m73140v4());
                    }
                    if (((Table) muzVar.f2127h4).getLastRow() && ((Table) muzVar.f2127h4).getFirstCol()) {
                        muzVar.m67737k4(i2 - 1, 0, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73123fa(), x5oVar.m73137um());
                    }
                    if (((Table) muzVar.f2127h4).getLastRow() && ((Table) muzVar.f2127h4).getLastCol()) {
                        muzVar.m67737k4(i2 - 1, i - 1, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73120ck(), x5oVar.m73117ar());
                    }
                } else {
                    fafVarArr3 = fafVarArr2;
                    uc0VarArr3 = uc0VarArr2;
                    i6 = 0;
                    i2 = i5;
                    i = i4;
                }
            } else {
                fafVarArr3 = fafVarArr2;
                uc0VarArr3 = uc0VarArr2;
                i2 = i5;
                i = i4;
                i6 = 0;
            }
            tx4VarArr3 = tx4VarArr2;
            if (((Table) muzVar.f2127h4).getFirstCol()) {
            }
            if (((Table) muzVar.f2127h4).getLastRow()) {
            }
            if (((Table) muzVar.f2127h4).getFirstRow()) {
            }
            if (((Table) muzVar.f2127h4).getFirstRow()) {
                fafVarArr = fafVarArr3;
                uc0VarArr = uc0VarArr3;
                tx4VarArr = tx4VarArr3;
                if (((Table) muzVar.f2127h4).getFirstRow()) {
                    muzVar.m67737k4(0, i - 1, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73145yj(), x5oVar.m73140v4());
                }
                if (((Table) muzVar.f2127h4).getLastRow()) {
                    muzVar.m67737k4(i2 - 1, 0, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73123fa(), x5oVar.m73137um());
                }
                if (((Table) muzVar.f2127h4).getLastRow()) {
                    muzVar.m67737k4(i2 - 1, i - 1, fafVarArr, uc0VarArr, tx4VarArr, x5oVar.m73120ck(), x5oVar.m73117ar());
                }
            }
        } else {
            i = size2;
            fafVarArr = fafVarArr4;
            c = 1;
            uc0VarArr = uc0VarArr4;
            tx4VarArr = tx4VarArr4;
            c2 = 3;
            i2 = size;
        }
        for (int i36 = 0; i36 < i2; i36++) {
            int i37 = 0;
            while (i37 < i) {
                tx4[][] tx4VarArr14 = tx4VarArr[i36];
                int i38 = i37 + 1;
                tx4VarArr14[i37][2] = tx4VarArr14[i38][0];
                tx4VarArr[i36][i37][c2] = tx4VarArr[i36 + 1][i37][c];
                i37 = i38;
            }
        }
        int[] iArr = new int[2];
        iArr[c] = i;
        iArr[0] = i2;
        yin[][] yinVarArr = (yin[][]) Array.newInstance((Class<?>) yin.class, iArr);
        for (int i39 = 0; i39 < i2; i39++) {
            for (int i40 = 0; i40 < i; i40++) {
                yin[] yinVarArr2 = yinVarArr[i39];
                Cell cell5 = (Cell) ((Table) muzVar.f2127h4).get_Item(i40, i39);
                faf fafVar6 = fafVarArr[i39][i40];
                uc0 uc0Var7 = uc0VarArr[i39][i40];
                tx4[] tx4VarArr15 = tx4VarArr[i39][i40];
                yinVarArr2[i40] = new yin(cell5, fafVar6, uc0Var7, tx4VarArr15[0], tx4VarArr15[c], tx4VarArr15[2], tx4VarArr15[c2], tx4VarArr15[4], tx4VarArr15[5]);
            }
        }
        return yinVarArr;
    }
}
