package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQK {

    public static class zzZ {
        private FieldDatabaseDataTable zzYEA;
        private ArrayList<Integer> zzZEU;

        public zzZ(FieldDatabaseDataTable fieldDatabaseDataTable) {
            fieldDatabaseDataTable.getRows().size();
            this.zzYEA = fieldDatabaseDataTable;
            this.zzZEU = new ArrayList<>(this.zzYEA.getRows().size());
        }

        private boolean zzZel() {
            if (this.zzZEU.size() != this.zzYEA.getRows().size()) {
                return false;
            }
            for (int i = 0; i < this.zzZEU.size(); i++) {
                if (this.zzZEU.get(i).intValue() != i) {
                    return false;
                }
            }
            return true;
        }

        public final void zzDr(int i) {
            if (i <= 0 || i > this.zzYEA.getRows().size()) {
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzZEU, Integer.valueOf(i - 1));
        }

        public final void zzDs(int i) {
            zzXH(i, this.zzYEA.getRows().size());
        }

        public final void zzXH(int i, int i2) {
            while (i <= i2) {
                zzDr(i);
                i++;
            }
        }

        public final FieldDatabaseDataTable zzZem() {
            if (this.zzZEU.size() == 0) {
                return new FieldDatabaseDataTable(new String[0]);
            }
            if (zzZel()) {
                return this.zzYEA;
            }
            FieldDatabaseDataTable fieldDatabaseDataTable = new FieldDatabaseDataTable(this.zzYEA.getColumnNames());
            Iterator<Integer> it = this.zzZEU.iterator();
            while (it.hasNext()) {
                fieldDatabaseDataTable.getRows().add(this.zzYEA.getRows().get(it.next().intValue()));
            }
            return fieldDatabaseDataTable;
        }

        public final void zzZen() {
            zzDr(this.zzYEA.getRows().size());
        }

        public final void zzZeo() {
            zzXH(1, this.zzYEA.getRows().size());
        }

        public final int zzZep() {
            return this.zzYEA.getRows().size();
        }
    }

    private static void zzX(zzZ zzz, int i, int i2) {
        int iZzZep;
        int iZzZep2;
        if (i < i2) {
            iZzZep = zzz.zzZep() - i2;
            iZzZep2 = zzz.zzZep() - i;
        } else {
            iZzZep = zzz.zzZep() - i;
            iZzZep2 = zzz.zzZep() - i2;
        }
        int i3 = (iZzZep2 - iZzZep) + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iZzZep + i4;
            if (i5 <= 0) {
                i5 = 1;
            }
            zzz.zzDr(i5);
        }
    }

    private static void zzY(zzZ zzz, int i, int i2) {
        int i3 = -i;
        int i4 = -i2;
        if (i3 == 1) {
            zzz.zzZeo();
            return;
        }
        if (i3 < 16 && i4 == 1) {
            int i5 = i3 + 1;
            for (int i6 = 0; i6 < i5; i6++) {
                int iZzZep = (zzz.zzZep() - i5) + 1 + i6;
                if (iZzZep <= 0) {
                    iZzZep = 1;
                }
                zzz.zzDr(iZzZep);
            }
            zzz.zzZeo();
            return;
        }
        if (i3 < 16 && i4 < 16) {
            zzX(zzz, i3, i4);
            return;
        }
        if (i3 <= 16 && i4 <= 16) {
            zzz.zzZen();
            return;
        }
        if (i3 > 16 && i4 > 16) {
            zzX(zzz, i3, i4);
        } else if (i3 > 16) {
            zzX(zzz, i3);
        } else {
            zzX(zzz, i4);
        }
    }

    public static FieldDatabaseDataTable zzZ(FieldDatabaseDataTable fieldDatabaseDataTable, int i, int i2) {
        zzZ zzz = new zzZ(fieldDatabaseDataTable);
        if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            zzz.zzZeo();
        } else if (i == Integer.MIN_VALUE) {
            zzY(zzz, i2);
        } else if (i2 == Integer.MIN_VALUE) {
            zzZ(zzz, i);
        } else {
            zzZ(zzz, i, i2);
        }
        return zzz.zzZem();
    }

    private static void zzX(zzZ zzz, int i) {
        int i2 = i - 16;
        for (int i3 = 0; i3 < i2; i3++) {
            int iZzZep = (zzz.zzZep() - i) + i3;
            if (iZzZep <= 0) {
                iZzZep = 1;
            }
            zzz.zzDr(iZzZep);
        }
        zzz.zzZen();
    }

    private static void zzZ(zzZ zzz, int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (i < i2) {
                zzz.zzXH(i, i2);
                return;
            } else {
                zzz.zzXH(i2, i);
                return;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                if (i > 0) {
                    zzz.zzZen();
                    zzz.zzXH(1, i);
                    return;
                } else if (i == -1) {
                    zzz.zzDr(1);
                    return;
                } else {
                    zzz.zzZen();
                    zzz.zzZeo();
                    return;
                }
            }
            if (i > 0) {
                zzz.zzDs(i);
                return;
            }
            if (i2 <= 0) {
                zzY(zzz, i, i2);
            } else if (i == -1) {
                zzz.zzXH(1, i2);
            } else {
                zzz.zzDs(i2);
            }
        }
    }

    private static void zzY(zzZ zzz, int i) {
        if (i < 0) {
            zzz.zzZeo();
        } else if (i == 0) {
            zzz.zzZen();
            zzz.zzDr(1);
        } else {
            zzz.zzXH(1, i);
        }
    }

    private static void zzZ(zzZ zzz, int i) {
        if (i == -1) {
            zzz.zzZeo();
        } else if (i < -1) {
            zzX(zzz, -i);
        } else if (i > 0) {
            zzz.zzDs(i);
        }
    }
}
