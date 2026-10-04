package com.aspose.words;

import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY66 {
    private com.aspose.words.internal.zzZOW zzW5;
    private Document zzYTQ;
    private zzY8U zzX4h = new zzY8U();
    private ArrayList<String> zzX4e = new ArrayList<>();

    private void zzXWp() throws Exception {
        byte[] bArrZzx = new zzXB().zzx(this.zzYTQ.zzZqE(), (int) this.zzW5.zzq().getPosition());
        if (bArrZzx == null) {
            return;
        }
        this.zzW5.writeBytes(bArrZzx);
    }

    private void zzXWq() throws Exception {
        int size = this.zzX4e.size();
        if (size == 0) {
            return;
        }
        this.zzW5.writeByte((byte) 17);
        this.zzW5.zzJ((short) size);
        int i = 0;
        for (String str : this.zzX4e) {
            this.zzW5.zzJ((short) i);
            zzZZQ.zzZ(str, 255, this.zzW5, true, true);
            i++;
        }
    }

    private void zzXWr() throws Exception {
        if (this.zzX4h.getCount() == 0) {
            return;
        }
        this.zzW5.writeByte((byte) 16);
        this.zzX4h.zzV(this.zzW5);
    }

    private void zzXWs() throws Exception {
        ArrayList<String> arrayListZzXWD;
        if (this.zzYTQ.getVbaProject() == null || (arrayListZzXWD = this.zzYTQ.getVbaProject().zzXWD()) == null || arrayListZzXWD.size() == 0) {
            return;
        }
        this.zzW5.writeByte((byte) 1);
        this.zzW5.zzl(arrayListZzXWD.size());
        for (String str : arrayListZzXWD) {
            zzYZL zzyzl = new zzYZL();
            zzyzl.zzZGD = this.zzX4e.size();
            com.aspose.words.internal.zzZQG.zzZ(this.zzX4e, str.toUpperCase());
            zzyzl.zzY06 = this.zzX4h.getCount();
            this.zzX4h.zzB1(str);
            zzyzl.zzZ(this.zzW5);
        }
    }

    private void zzXWt() throws Exception {
        if (this.zzYTQ.zzZqL()) {
            this.zzW5.writeByte((byte) 2);
            this.zzW5.zzl(this.zzYTQ.zzZqD().size());
            for (zzP zzp : this.zzYTQ.zzZqD()) {
                zzW zzw = new zzW();
                int i = zzp.zzZGx;
                boolean z = i == 0;
                zzw.zzZGB = z;
                if (!z) {
                    zzw.zzZGC = i;
                    zzw.zzZGD = this.zzX4h.getCount();
                    this.zzX4h.zzXJ(zzp.zzZGw);
                }
                zzw.zzZ(this.zzW5);
            }
        }
    }

    private void zzXWu() throws Exception {
        if (this.zzYTQ.zzZqK()) {
            this.zzW5.writeByte((byte) 4);
            this.zzW5.zzl(this.zzYTQ.zzZqC().size());
            Iterator<zzZ7B> it = this.zzYTQ.zzZqC().iterator();
            while (it.hasNext()) {
                new zzZ79(it.next(), this.zzX4e).zzZ(this.zzW5);
            }
        }
    }

    public final int zzZ(Document document, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (!document.hasMacros() && !document.zzZqN()) {
            return 0;
        }
        this.zzYTQ = document;
        this.zzW5 = zzzow;
        int position = (int) zzzow.zzq().getPosition();
        zzzow.writeByte((byte) -1);
        zzXWu();
        zzXWt();
        zzXWs();
        zzXWr();
        zzXWq();
        zzXWp();
        zzzow.writeByte(SignedBytes.MAX_POWER_OF_TWO);
        return ((int) zzzow.zzq().getPosition()) - position;
    }
}
