package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6K {
    private com.aspose.words.internal.zzDB zzX52 = new com.aspose.words.internal.zzDB();
    private int zzX8T;
    private zzZBV zzYUz;

    public zzY6K(zzZBV zzzbv) {
        this.zzYUz = zzzbv;
    }

    private void zzF(zzY6G zzy6g) throws Exception {
        if (zzXXF() == 3) {
            zzXXE();
        }
        if (zzXXF() == 1) {
            zzTG("Unexpected end of row, ignored.");
        } else {
            this.zzYUz.zzQ(zzy6g);
            zzjX(1);
        }
    }

    private void zzTG(String str) throws Exception {
        this.zzYUz.zzT(16777216, str);
    }

    private void zzX(zzYMT zzymt) throws Exception {
        if (zzXXF() == 3) {
            zzTG("Unexpected end of table, ignored.");
            zzymt.zzXGL = this.zzX8T;
            return;
        }
        if (zzXXF() == 2) {
            zzTG("Unexpected end of table, ignored.");
            zzXXD();
            zzymt.zzXGL = this.zzX8T;
            return;
        }
        if (zzymt.zzXGL + 1 != this.zzX8T) {
            zzTG("Table end is at an incorrect nesting level.");
        }
        if (zzXXF() != 1) {
            throw new IllegalStateException("Table seem to be badly formed.");
        }
        this.zzYUz.zzYWG();
        zzZP();
        this.zzX8T--;
    }

    private void zzXXC() {
        this.zzX52.add(1);
    }

    private void zzXXD() {
        if (zzXXF() == 1) {
            this.zzYUz.zzYWF();
            zzjX(2);
        }
        if (zzXXF() == 2) {
            this.zzYUz.zzYWE();
            zzjX(3);
        }
    }

    private void zzXXE() {
        if (zzXXF() == 0) {
            return;
        }
        if (zzXXF() != 3) {
            throw new IllegalStateException("Unexpected table state at the end of the cell.");
        }
        this.zzYUz.zzYWD();
        zzjX(2);
    }

    private void zzY(zzYMT zzymt) {
        if (this.zzX8T > 0) {
            zzXXD();
        }
        while (this.zzX8T < zzymt.zzXGL) {
            this.zzYUz.zzYWH();
            zzXXC();
            zzXXD();
            this.zzX8T++;
        }
    }

    private void zzZP() {
        this.zzX52.removeAt(r0.getCount() - 1);
    }

    private void zzjX(int i) {
        this.zzX52.set(r0.getCount() - 1, i);
    }

    public final int zzXXF() {
        if (this.zzX52.getCount() <= 0) {
            return 0;
        }
        return this.zzX52.get(r0.getCount() - 1);
    }

    public final void zzZ(zzYMT zzymt) throws Exception {
        int i = zzymt.zzXGL;
        int i2 = this.zzX8T;
        if (i > i2) {
            zzY(zzymt);
            return;
        }
        if (i < i2) {
            zzX(zzymt);
        } else {
            if (i <= 0 || zzymt.zzYpb()) {
                return;
            }
            zzXXD();
        }
    }

    public final void zzZ(zzYMT zzymt, zzY6G zzy6g, char c) throws Exception {
        if (zzymt.zzYpb()) {
            zzF(zzy6g);
        } else if (c == 7 || zzymt.zzXGM) {
            zzXXE();
        }
    }
}
