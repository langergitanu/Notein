package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9J extends zzZDB {
    private boolean zzWyR;
    private zzZ9H[] zzWyS;

    private zzZ9J(zzZD4 zzzd4) {
        this.zzWyR = true;
        this.zzWyS = new zzZ9H[zzzd4.size()];
        int i = 0;
        while (true) {
            zzZ9H[] zzz9hArr = this.zzWyS;
            if (i == zzz9hArr.length) {
                this.zzWyR = zzzd4 instanceof zzZCP;
                return;
            } else {
                zzz9hArr[i] = zzZ9H.zzXS(zzzd4.zzg6(i));
                i++;
            }
        }
    }

    public static zzZ9J zzXU(Object obj) {
        if (obj instanceof zzZ9J) {
            return (zzZ9J) obj;
        }
        if (obj != null) {
            return new zzZ9J(zzZD4.zzYy(obj));
        }
        return null;
    }

    private static zzZ9H[] zzZ(zzZ9H[] zzz9hArr) {
        int length = zzz9hArr.length;
        zzZ9H[] zzz9hArr2 = new zzZ9H[length];
        System.arraycopy(zzz9hArr, 0, zzz9hArr2, 0, length);
        return zzz9hArr2;
    }

    public final zzZ9H[] zzXJp() {
        return zzZ(this.zzWyS);
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        int i = 0;
        while (true) {
            zzZ9H[] zzz9hArr = this.zzWyS;
            if (i == zzz9hArr.length) {
                break;
            }
            zzzdj.zzZ(zzz9hArr[i]);
            i++;
        }
        return this.zzWyR ? new zzZCP(zzzdj) : new zzZBN(zzzdj);
    }

    public zzZ9J(zzZ9H[] zzz9hArr) {
        this.zzWyR = true;
        this.zzWyS = zzZ(zzz9hArr);
    }
}
