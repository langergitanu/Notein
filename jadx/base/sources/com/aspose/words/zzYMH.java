package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMH {
    private com.aspose.words.internal.zzIM<Integer> zzXG9 = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Integer> zzXGa = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzD3<zzUT> zzXG8 = new com.aspose.words.internal.zzD3<>();
    private HashMap<Integer, zzUS> zzXG7 = new HashMap<>();
    private com.aspose.words.internal.zzD3<Paragraph> zzXG6 = new com.aspose.words.internal.zzD3<>();

    private int zzYo7() {
        return zzZ(this.zzXG9, "DurableId");
    }

    private int zzYo8() {
        return zzZ(this.zzXGa, "ParaId");
    }

    private static int zzZ(com.aspose.words.internal.zzIM<Integer> zzim, String str) {
        while (true) {
            int iHashCode = com.aspose.words.internal.zzZZS.zzY(str).hashCode() & Integer.MAX_VALUE;
            if (iHashCode != 0 && !zzim.contains(Integer.valueOf(iHashCode))) {
                zzim.add(Integer.valueOf(iHashCode));
                return iHashCode;
            }
        }
    }

    public final zzUS zzFx(int i) {
        for (zzUS zzus : this.zzXG7.values()) {
            if (zzus.zzZZS() == i) {
                return zzus;
            }
        }
        return null;
    }

    public final void zzQ(int i, int i2, boolean z) {
        this.zzXG8.set(i, new zzUT(i2, z));
    }

    public final void zzXS(int i, int i2) {
        if (!this.zzXG9.contains(Integer.valueOf(i2))) {
            this.zzXG9.add(Integer.valueOf(i2));
        } else if (!this.zzXG7.containsKey(Integer.valueOf(i))) {
            i2 = zzYo7();
        }
        this.zzXG7.put(Integer.valueOf(i), new zzUS(i, i2));
    }

    public final void zzY(int i, Paragraph paragraph) {
        if (i != Integer.MIN_VALUE) {
            if (this.zzXG8.zzVE(i) || this.zzXG7.containsKey(Integer.valueOf(i))) {
                this.zzXG6.add(i, paragraph);
            }
        }
    }

    public final void zzYo9() {
        for (Map.Entry<Integer, zzUS> entry : this.zzXG7.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            zzUS value = entry.getValue();
            Paragraph paragraph = this.zzXG6.get(iIntValue);
            if (paragraph != null) {
                Comment comment = (Comment) paragraph.getAncestor(19);
                comment.zzNb(value.zzZZS());
                comment.zzu(value.zzZZT());
                comment.zzYk(value.zzZZR());
            }
        }
    }

    public final void zzYoa() {
        com.aspose.words.internal.zzD3<zzUT>.zzZ zzzZzCK = this.zzXG8.zzCK();
        while (zzzZzCK.moveNext()) {
            int iZzCM = zzzZzCK.zzCM();
            zzUT zzutZzCI = zzzZzCK.zzCI();
            Paragraph paragraph = this.zzXG6.get(iZzCM);
            if (paragraph != null) {
                Comment comment = (Comment) paragraph.getAncestor(19);
                comment.setDone(zzutZzCI.zzZvb);
                Paragraph paragraph2 = this.zzXG6.get(zzutZzCI.zzZvc);
                if (paragraph2 != null) {
                    comment.setParentId(((Comment) paragraph2.getAncestor(19)).getId());
                }
            }
        }
    }

    public final int zzqo(int i) {
        if (!this.zzXGa.contains(Integer.valueOf(i))) {
            this.zzXGa.add(Integer.valueOf(i));
            return i;
        }
        int iZzYo8 = zzYo8();
        if (this.zzXG8.zzVE(i)) {
            this.zzXG8.add(iZzYo8, new zzUT(0, false));
            com.aspose.words.internal.zzZQF.zzY(this.zzXG7, Integer.valueOf(iZzYo8), new zzUS(iZzYo8, zzYo7()));
        }
        return iZzYo8;
    }
}
