package com.aspose.words;

import com.aspose.words.internal.zzD4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIE extends zzJV {
    private com.aspose.words.internal.zzD4 zzXxj;

    public static class zzY implements Comparator<zzZ> {
        private zzY() {
        }

        private static int zzZ(zzZ zzz, zzZ zzz2) {
            int iZzZ7 = com.aspose.words.internal.zzZKR.zzZ7(zzz2.value, zzz.value);
            return iZzZ7 == 0 ? com.aspose.words.internal.zzZKR.zzZ7(zzz2.key, zzz.key) : iZzZ7;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(zzZ zzz, zzZ zzz2) {
            return zzZ(zzz, zzz2);
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static class zzZ {
        public int key;
        public int value;

        public zzZ(int i, int i2) {
            this.key = i;
            this.value = i2;
        }
    }

    private zzYIE(ArrayList<Node> arrayList, ArrayList<Node> arrayList2, zzU8 zzu8) throws Exception {
        super(new zzU5(arrayList, zzu8), new zzU5(arrayList2, zzu8), zzu8);
        this.zzXxj = new com.aspose.words.internal.zzD4();
    }

    public static void zzZ(ArrayList<Row> arrayList, ArrayList<Row> arrayList2, ArrayList<Row> arrayList3, ArrayList<Row> arrayList4, zzU8 zzu8) throws Exception {
        ArrayList arrayList5 = new ArrayList();
        com.aspose.words.internal.zzBP.zzZ(arrayList5, arrayList);
        ArrayList arrayList6 = new ArrayList();
        com.aspose.words.internal.zzBP.zzZ(arrayList6, arrayList2);
        new zzYIE(arrayList5, arrayList6, zzu8).zzZ(arrayList, arrayList2, arrayList3, arrayList4);
    }

    @Override // com.aspose.words.zzJV
    public final void zzLQ(int i) {
        if (i > 0) {
            int rowIndex = (((Row) zzZSL().getAncestor(6)).getRowIndex() * 10000) + ((Row) zzZSM().getAncestor(6)).getRowIndex();
            com.aspose.words.internal.zzD4 zzd4 = this.zzXxj;
            zzd4.set(rowIndex, zzd4.zzVE(rowIndex) ? this.zzXxj.get(rowIndex) + i : i);
        }
        zzLL(zzZSK() + i);
        zzLK(zzZSJ() + i);
    }

    @Override // com.aspose.words.zzJV
    public final void zzLR(int i) {
        zzLL(zzZSK() + i);
    }

    @Override // com.aspose.words.zzJV
    public final int zzLS(int i) {
        zzLK(zzZSJ() + i);
        return 0;
    }

    @Override // com.aspose.words.zzJV
    public final void zzZ7(char c) {
        zzLL(zzZSK() + 1);
        zzLK(zzZSJ() + 1);
    }

    @Override // com.aspose.words.zzJV
    public final void zzZ8(char c) {
        zzLL(zzZSK() + 1);
    }

    @Override // com.aspose.words.zzJV
    public final int zzZ9(char c) {
        zzLK(zzZSJ() + 1);
        return 0;
    }

    @Override // com.aspose.words.zzJV
    public final boolean zzZSO() {
        return false;
    }

    private void zzZ(ArrayList<Row> arrayList, ArrayList<Row> arrayList2, ArrayList<Row> arrayList3, ArrayList<Row> arrayList4) throws Exception {
        if (zzU6.zzZtG) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{RowBlock}} '{0}' -> '{1}'", zzZSI(), zzZSH()));
        }
        int size = arrayList.size();
        int size2 = arrayList2.size();
        zzZSQ();
        boolean z = size < size2;
        if (this.zzXxj.getCount() == 0) {
            if (z) {
                while (size < size2) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList3, arrayList2.get(size));
                    size++;
                }
                return;
            } else {
                while (size2 < size) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList4, arrayList.get(size2));
                    size2++;
                }
                return;
            }
        }
        zzU6.zzSU("\n{Similarity Data}");
        zzU6.zzZZ2();
        zzD4.zzZ zzzZzCP = this.zzXxj.zzCP();
        while (zzzZzCP.moveNext()) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{0} -> {1}: {2}", Integer.valueOf(zzzZzCP.zzCM() % 10000), Integer.valueOf(zzzZzCP.zzCM() / 10000), Integer.valueOf(zzzZzCP.zzCL())));
        }
        zzU6.zzZZ1();
        int count = this.zzXxj.getCount();
        zzZ[] zzzArr = new zzZ[count];
        zzD4.zzZ zzzZzCP2 = this.zzXxj.zzCP();
        int i = 0;
        while (zzzZzCP2.moveNext()) {
            zzzArr[i] = new zzZ(zzzZzCP2.zzCM(), zzzZzCP2.zzCL());
            i++;
        }
        int i2 = 0;
        int i3 = 0;
        Arrays.sort(zzzArr, new zzY(i2 == true ? (byte) 1 : (byte) 0));
        int iMin = Math.min(Math.min(size, size2), count);
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = zzzArr[i4].key;
            int i6 = i5 % 10000;
            int i7 = i5 / 10000;
            if (z) {
                i6 = i7;
            }
            zzim.add(Integer.valueOf(i6));
        }
        if (z) {
            for (int i8 = 0; i8 < size2 && size + i3 < size2; i8++) {
                if (!zzim.contains(Integer.valueOf(arrayList2.get(i8).getRowIndex()))) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList3, arrayList2.get(i8));
                    i3++;
                }
            }
            return;
        }
        for (int i9 = 0; i9 < size && size - i2 > size2; i9++) {
            if (!zzim.contains(Integer.valueOf(arrayList.get(i9).getRowIndex()))) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList4, arrayList.get(i9));
                i2++;
            }
        }
    }
}
