package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8D extends zzZDB {
    private zzZD2 zzWsw;

    private zzZ8D(zzZD2 zzzd2) {
        this.zzWsw = zzzd2;
    }

    public static zzZ8D zzXo(Object obj) {
        if (obj instanceof zzZ8D) {
            return (zzZ8D) obj;
        }
        if (obj != null) {
            return new zzZ8D(zzZD2.zzYx(obj));
        }
        return null;
    }

    public final zzZ8E[] zzXIp() {
        int size = this.zzWsw.size();
        zzZ8E[] zzz8eArr = new zzZ8E[size];
        for (int i = 0; i != size; i++) {
            zzz8eArr[i] = zzZ8E.zzXp(this.zzWsw.zzg6(i));
        }
        return zzz8eArr;
    }

    public final zzZ8E zzXIq() {
        if (this.zzWsw.size() == 0) {
            return null;
        }
        return zzZ8E.zzXp(this.zzWsw.zzg6(0));
    }

    public final boolean zzXIr() {
        return this.zzWsw.size() > 1;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWsw;
    }
}
