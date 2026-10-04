package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZ2 implements zzGS {
    private zzZYT<byte[]> zzcr;
    private int zzcs;

    public zzZZ2(int i) {
        this();
        this.zzcs = i;
    }

    private static void zzU(zzXZ zzxz) throws Exception {
        zzZYQ.zzV(zzxz.zzq(), 4);
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzC(zzZOP zzzop) throws Exception {
        zzXZ zzxz = new zzXZ(zzzop);
        zzZZ1 zzzz1 = new zzZZ1();
        zzzz1.setVersion(this.zzcs);
        zzzz1.zzO((short) this.zzcr.getCount());
        zzzz1.zzX(zzxz);
        int position = (int) (zzzop.getPosition() + ((long) (this.zzcr.getCount() * 16)));
        long position2 = zzzop.getPosition();
        Iterator<Map.Entry<K, V>> it = this.zzcr.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzzop.zzH(position2);
            byte[] bArr = (byte[]) entry.getValue();
            zzZYZ zzzyz = new zzZYZ();
            zzzyz.zzck = (String) entry.getKey();
            zzzyz.zzci = bArr.length;
            zzzyz.zzdZ = position;
            zzzyz.zzcj = zzZYZ.zzF(bArr, bArr.length);
            zzzyz.zzX(zzxz);
            long position3 = zzzop.getPosition();
            zzzop.zzH(((long) position) & 4294967295L);
            zzxz.zzW(bArr, bArr.length);
            zzU(zzxz);
            position = (int) zzzop.getPosition();
            position2 = position3;
        }
    }

    @Override // com.aspose.words.internal.zzGS
    public final byte[] zzFA() throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzC(zzzor);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzWg(int i) {
        this.zzcs = i;
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzZ(String str, byte[] bArr) {
        this.zzcr.zzB(str, bArr);
    }

    public zzZZ2() {
        this.zzcs = 65536;
        this.zzcr = new zzZYT<>(true);
    }
}
