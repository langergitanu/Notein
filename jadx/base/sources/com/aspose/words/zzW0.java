package com.aspose.words;

import com.aspose.words.zzFU;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzW0 {
    private ChartSeries zzZyw;

    public static class zzZ {
        private int zzZF;
        private int zzZyq;

        public zzZ(int i) {
            this(i, i - 1);
        }

        public final int getCount() {
            return this.zzZF;
        }

        public final int zz1L() {
            return this.zzZyq;
        }

        public zzZ(int i, int i2) {
            this.zzZF = i;
            this.zzZyq = i2;
        }
    }

    public zzW0(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
    }

    private int zz1M() {
        zzG4 zzg4ZzZI7 = this.zzZyw.zz2k().zzZI7();
        if (zzg4ZzZI7.zzZO6() > 0) {
            return zzg4ZzZI7.zzZO6();
        }
        if (Double.isNaN(zzg4ZzZI7.zzZO5())) {
            return 11;
        }
        this.zzZyw.zz2z();
        zzFU.zzQ zzqZzZ = this.zzZyw.zz2f().zzZ(this.zzZyw.zz2z().zzZN4());
        int i = 0;
        if (zzqZzZ == null) {
            return 0;
        }
        double dAbs = Math.abs(zzg4ZzZI7.zzZO5());
        double dZzZNJ = zzqZzZ.zzZNJ();
        if (!zzg4ZzZI7.zzZO4().zzZk0()) {
            dZzZNJ = zzg4ZzZI7.zzZO4().getValue();
            i = 1;
        }
        double dZzZNI = zzqZzZ.zzZNI();
        if (!zzg4ZzZI7.zzZO3().zzZk0()) {
            dZzZNI = zzg4ZzZI7.zzZO3().getValue();
            i++;
        }
        if (dZzZNI < dZzZNJ) {
            dZzZNI = dZzZNJ;
        }
        return ((int) Math.ceil((dZzZNI - dZzZNJ) / dAbs)) + i;
    }

    private int zz1N() {
        switch (this.zzZyw.zz6y()) {
            case 0:
                return (this.zzZyw.zz2f().zzZ(this.zzZyw.zz2z().zzZN4(), true) * 4) + this.zzZyw.zz2z().zzZN4().zz2w() + 1;
            case 1:
                if (!this.zzZyw.zz2k().zzZI8()) {
                    return zz1M();
                }
                this.zzZyw.zz2z();
                return this.zzZyw.zz2f().zzZ(this.zzZyw.zz2z().zzZN4(), false);
            case 2:
            case 4:
            case 7:
                return this.zzZyw.getValueCount();
            case 3:
                return 0;
            case 5:
                this.zzZyw.zz2z();
                return this.zzZyw.zz2f().zzY(this.zzZyw.zz2z().zzZN4()).size();
            case 6:
                return this.zzZyw.zz2f().zzY(this.zzZyw.zz2z().zzZN4()).size();
            default:
                return this.zzZyw.getValueCount();
        }
    }

    private zzZ zz1O() {
        int i;
        int iZz1N;
        int iZz6y = this.zzZyw.zz6y();
        if (iZz6y == 0 || iZz6y == 6) {
            com.aspose.words.internal.zzDB zzdbZz1S = zz1S();
            i = zzdbZz1S.get(zzdbZz1S.getCount() - 1);
            int count = zzdbZz1S.getCount();
            for (ChartDataLabel chartDataLabel : this.zzZyw.getDataLabels().zz3i()) {
                if (zzdbZz1S.zzVJ(chartDataLabel.getIndex()) < 0 && chartDataLabel.zz3n()) {
                    count++;
                }
            }
            iZz1N = count;
        } else {
            iZz1N = zz1N();
            i = iZz1N - 1;
        }
        return new zzZ(iZz1N, i);
    }

    private com.aspose.words.internal.zzDB zz1P() {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        ArrayList<zzFU.zzT> arrayListZzY = this.zzZyw.zz2f().zzY(this.zzZyw.zz2z().zzZN4());
        for (int i = 0; i < arrayListZzY.size(); i++) {
            if (arrayListZzY.get(i).zzZNM() != 1) {
                zzdb.add(i);
            }
        }
        return zzdb;
    }

    private static void zzW(zzXO zzxo, int i, com.aspose.words.internal.zzDB zzdb) {
        int length = zzxo.zz7k().length;
        for (int iZz7l = length - zzxo.zz7l(); iZz7l < length; iZz7l++) {
            if (!com.aspose.words.internal.zzAN.zzL(zzxo.zz7k()[iZz7l], zzxo.zz7k()[iZz7l - 1])) {
                zzdb.add(i + iZz7l);
            }
        }
    }

    private static void zzX(zzXO zzxo, int i, com.aspose.words.internal.zzDB zzdb) {
        int iZz7m = zzxo.zz7m();
        while (true) {
            iZz7m++;
            if (iZz7m >= (zzxo.zz7k().length - zzxo.zz7l()) - 1) {
                return;
            }
            if (!com.aspose.words.internal.zzAN.zzL(zzxo.zz7k()[iZz7m], zzxo.zz7k()[iZz7m - 1])) {
                zzdb.add(i + iZz7m);
            }
        }
    }

    private static void zzY(zzXO zzxo, int i, com.aspose.words.internal.zzDB zzdb) {
        for (int i2 = 0; i2 < zzxo.zz7m(); i2++) {
            if (i2 == 0 || !com.aspose.words.internal.zzAN.zzL(zzxo.zz7k()[i2], zzxo.zz7k()[i2 - 1])) {
                zzdb.add(i + i2);
            }
        }
    }

    private void zzZ(zzXO zzxo, int i, com.aspose.words.internal.zzDB zzdb) {
        zzDE zzdeZz2k = this.zzZyw.zz2k();
        if (zzdeZz2k.zzZIa()) {
            zzY(zzxo, i, zzdb);
        }
        if (com.aspose.words.internal.zzAN.zzK(zzxo.zz7q(), zzxo.zz7p())) {
            zzdb.add(zzxo.zz7m() + i);
        }
        if (zzdeZz2k.zzZIb()) {
            zzX(zzxo, i, zzdb);
        }
        int length = zzxo.zz7k().length;
        if (length > 1 && com.aspose.words.internal.zzAN.zzJ(zzxo.zz7n(), zzxo.zz7o())) {
            zzdb.add(((i + length) - zzxo.zz7l()) - 1);
        }
        if (zzdeZz2k.zzZIa()) {
            zzW(zzxo, i, zzdb);
        }
        int i2 = i + length;
        zzdb.add(i2);
        zzdb.add(i2 + 1);
        zzdb.add(i2 + 2);
        if (zzdeZz2k.zzZIc()) {
            zzdb.add(i2 + 3);
        }
    }

    public final int zz1Q() {
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries == null || chartSeries.zz3I() == null) {
            return 0;
        }
        if (this.zzZyw.zz3I().zzZQO() == 16) {
            return zz1N();
        }
        int valueCount = this.zzZyw.getValueCount();
        return (this.zzZyw.zz3I().zzZQO() != 12 || valueCount <= 2) ? valueCount : valueCount + 1;
    }

    public final zzZ zz1R() {
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries == null || chartSeries.zz3I() == null || !this.zzZyw.hasDataLabels()) {
            return new zzZ(0);
        }
        if (this.zzZyw.zz3I().zzZQO() == 16) {
            return zz1O();
        }
        int valueCount = this.zzZyw.getValueCount();
        if (this.zzZyw.zz3I().zzZQO() == 12 && valueCount > 2) {
            valueCount++;
        }
        return new zzZ(valueCount);
    }

    public final com.aspose.words.internal.zzDB zz1S() {
        ChartSeries chartSeries = this.zzZyw;
        if (chartSeries == null || chartSeries.zz3I().zzZQO() != 16) {
            return null;
        }
        int iZz6y = this.zzZyw.zz6y();
        if (iZz6y != 0) {
            if (iZz6y != 6) {
                return null;
            }
            this.zzZyw.zz2z();
            return zz1P();
        }
        this.zzZyw.zz2z();
        this.zzZyw.zz2y();
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        int length = 0;
        for (zzXO zzxo : this.zzZyw.zz2f().zzX(this.zzZyw.zz2z().zzZN4(), this.zzZyw.zz2y().zzZN4(), this.zzZyw.zz2k().zzZI9())) {
            zzZ(zzxo, length, zzdb);
            length += zzxo.zz7k().length + 4;
        }
        return zzdb;
    }
}
