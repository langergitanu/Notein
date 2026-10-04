package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJX {
    private com.aspose.words.internal.zzZQC<zzZJZ> zzU4;
    private boolean zzYt6;
    private zzZK0 zzYt7;
    private zzZAO zzYt8;

    public zzZJX(zzZAO zzzao, zzZK0 zzzk0, boolean z) {
        this.zzYt8 = zzzao;
        this.zzYt7 = zzzk0;
        com.aspose.words.internal.zzZQC<zzZJZ> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzU4 = zzzqc;
        zzzqc.push(new zzZJZ());
        this.zzYt6 = z;
    }

    private void popContext() {
        if (this.zzU4.size() > 1) {
            this.zzU4.pop();
        }
    }

    private void zzA2(int i) {
        zzZ43().getCount();
        for (int i2 = 0; i2 < i; i2++) {
            zzO(zzZ43().zzZ4f());
        }
    }

    private boolean zzA3(int i) {
        return zzZ43().getCount() != 0 && zzZ43().zzZ4e().getId() == i;
    }

    private void zzA4(int i) throws Exception {
        if (zzA3(i)) {
            return;
        }
        zzZK1 zzzk1ZzA8 = this.zzYt7.zzA8(i);
        if (zzzk1ZzA8 == null) {
            zzZ44();
            return;
        }
        zzZJZ zzzjzZzR = zzR(zzzk1ZzA8);
        zzzjzZzR.getCount();
        int iZzZ = zzZ43().zzZ(zzzjzZzR);
        zzZ43().getCount();
        zzA2(zzZ43().getCount() - iZzZ);
        while (iZzZ < zzzjzZzR.getCount()) {
            zzZK1 zzzk1ZzA6 = zzzjzZzR.zzA6(iZzZ);
            if (!zzT(zzzk1ZzA6)) {
                zzS(zzzk1ZzA6);
            }
            iZzZ++;
        }
    }

    private void zzO(zzZK1 zzzk1) {
        if (zzQ(zzzk1)) {
            int iZzZ4j = zzzk1.zzZ4j();
            if (iZzZ4j != 0) {
                if (iZzZ4j == 1) {
                    this.zzYt8.zzZ3E().endElement("blockquote");
                    return;
                } else if (iZzZ4j != 2) {
                    return;
                }
            }
            this.zzYt8.zzZ3E().endElement("div");
        }
    }

    private void zzP(zzZK1 zzzk1) throws Exception {
        int iZzZ4j = zzzk1.zzZ4j();
        if (iZzZ4j == 0) {
            this.zzYt8.zzZ3E().zzZN("div", 0);
        } else if (iZzZ4j != 1) {
            if (iZzZ4j != 2) {
                return;
            }
            this.zzYt8.zzZ3E().zzZN("div", 0);
        } else {
            this.zzYt8.zzZ3E().zzZN("blockquote", 0);
        }
        this.zzYt8.zzZ3C().zzV(zzZ(zzzk1, this.zzYt6));
    }

    private static boolean zzQ(zzZK1 zzzk1) {
        return zzzk1.zzZYj().getCount() > 0;
    }

    private zzZJZ zzR(zzZK1 zzzk1) {
        zzZJZ zzzjz = new zzZJZ();
        zzzjz.zzX(zzzk1);
        while (zzzk1.getParentId() > 0) {
            zzzk1 = this.zzYt7.zzA8(zzzk1.getParentId());
            zzzjz.zzX(zzzk1);
        }
        return zzzjz;
    }

    private void zzS(zzZK1 zzzk1) throws Exception {
        zzZ43().zzY(zzzk1);
        if (zzQ(zzzk1)) {
            zzP(zzzk1);
        }
    }

    private boolean zzT(zzZK1 zzzk1) {
        Iterator<zzZJZ> it = this.zzU4.iterator();
        while (it.hasNext()) {
            if (it.next().zzW(zzzk1)) {
                return true;
            }
        }
        return false;
    }

    private static zzLU zzZ(zzZK1 zzzk1, boolean z) throws Exception {
        ParagraphFormat paragraphFormat = new ParagraphFormat(zzzk1.zzZYj(), null);
        zzLU zzlu = new zzLU();
        zzQS.zzZ(zzlu, paragraphFormat.getBorders(), z);
        zzZ(zzzk1, zzlu);
        return zzlu;
    }

    private zzZJZ zzZ43() {
        return this.zzU4.peek();
    }

    private void zzZ44() {
        zzA2(zzZ43().getCount());
    }

    public final void close() {
        this.zzU4.size();
        zzZ43().getCount();
        for (int i = 0; i < this.zzU4.size(); i++) {
            zzZ44();
            popContext();
        }
    }

    public final void zzZ45() {
        zzZ44();
    }

    public final void zzZ46() {
        zzZ44();
    }

    public final void zzZ47() {
        this.zzU4.size();
        zzZ43().getCount();
        zzZ44();
        popContext();
    }

    public final void zzd(Paragraph paragraph) {
        if (paragraph.isEndOfSection()) {
            zzZ44();
        }
    }

    public final void zze(Paragraph paragraph) throws Exception {
        zzA4(paragraph.zzZYj().zzYps());
    }

    public final void zzz(Table table) throws Exception {
        if (table.getFirstRow() != null) {
            zzA4(table.getFirstRow().zzZYf().zzXXa().zzYps());
        }
        this.zzU4.push(new zzZJZ());
    }

    private static void zzZ(zzZK1 zzzk1, zzLU zzlu) {
        zzlu.zzZ("margin-top", ((double) zzzk1.zzZYj().zzYpm()) / 20.0d, 4);
        zzlu.zzZ("margin-bottom", ((double) zzzk1.zzZYj().zzYpl()) / 20.0d, 4);
        zzlu.zzZ("margin-right", ((double) zzzk1.zzZYj().zzYM3()) / 20.0d, 4);
        zzlu.zzZ("margin-left", ((double) zzzk1.zzZYj().zzYM6()) / 20.0d, 4);
    }
}
