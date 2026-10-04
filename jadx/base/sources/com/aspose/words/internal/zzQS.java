package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzQS {
    private ArrayList<zzQT> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    public final zzZOR zzQH() throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZOW zzzow = new zzZOW(zzzor, zzZO0.zzhU());
        for (int i = 0; (((long) i) & 4294967295L) < this.zzZm.size(); i++) {
            zzYl(i).zzZ(zzzow);
        }
        zzQT zzqt = new zzQT();
        while (zzzor.getLength() % 512 != 0) {
            zzqt.zzZ(zzzow);
        }
        return zzzor;
    }

    public final zzQT zzYl(int i) {
        return this.zzZm.get((int) (((long) i) & 4294967295L));
    }

    public final void zzZ(zzQT zzqt) {
        zzZQG.zzZ(this.zzZm, zzqt);
    }

    public final zzQT zzc(String str) {
        return zzZ(zzZ(zzYl(0), zzYl(0).zzLE), str, new zzZYV<>());
    }

    private zzQT zzZ(zzQT zzqt, String str, zzZYV<Boolean> zzzyv) {
        if (zzZKN.equals(zzqt.zzLJ, str)) {
            return zzqt;
        }
        zzQT zzqtZzZ = zzZ(zzqt, zzqt.zzLG);
        if (zzqtZzZ != null && !zzzyv.zzVE((int) (((long) zzqt.zzLG) & 4294967295L))) {
            zzzyv.add((int) (((long) zzqt.zzLG) & 4294967295L), Boolean.FALSE);
            zzQT zzqtZzZ2 = zzZ(zzqtZzZ, str, zzzyv);
            if (zzqtZzZ2 != null) {
                return zzqtZzZ2;
            }
        }
        zzQT zzqtZzZ3 = zzZ(zzqt, zzqt.zzLF);
        if (zzqtZzZ3 == null || zzzyv.zzVE((int) (((long) zzqt.zzLF) & 4294967295L))) {
            return null;
        }
        zzzyv.add((int) (4294967295L & ((long) zzqt.zzLF)), Boolean.FALSE);
        zzQT zzqtZzZ4 = zzZ(zzqtZzZ3, str, zzzyv);
        if (zzqtZzZ4 != null) {
            return zzqtZzZ4;
        }
        return null;
    }

    public final zzQT zzZ(zzQT zzqt, int i) {
        if (i == -1 || (((long) i) & 4294967295L) >= this.zzZm.size() || zzqt == zzYl(i)) {
            return null;
        }
        return zzYl(i);
    }
}
