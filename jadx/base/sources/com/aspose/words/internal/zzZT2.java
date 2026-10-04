package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT2 implements zzGS {
    private zzZYT<byte[]> zzcr;
    private int zzcs;

    public zzZT2(int i) {
        this();
        this.zzcs = i;
    }

    private static void zzU(zzXZ zzxz) throws Exception {
        zzZYQ.zzV(zzxz.zzq(), 4);
    }

    private void zzV(zzXZ zzxz) throws Exception {
        zzxz.zzl(2001684038);
        zzxz.zzl(this.zzcs);
        zzxz.zzl((int) zzxz.zzq().getLength());
        zzxz.zzj(this.zzcr.getCount());
        zzxz.zzj(0);
        zzxz.zzl(zzmE());
        zzxz.zzj(1);
        zzxz.zzj(0);
        zzxz.zzl(0);
        zzxz.zzl(0);
        zzxz.zzl(0);
        zzxz.zzl(0);
        zzxz.zzl(0);
    }

    private int zzZ0(byte[] bArr) throws Exception {
        zzZZ2 zzzz2 = new zzZZ2(this.zzcs);
        Iterator<Map.Entry<K, V>> it = this.zzcr.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            byte[] bArr2 = (byte[]) entry.getValue();
            if ("head".equals(str)) {
                bArr2 = bArr;
            }
            zzzz2.zzZ(str, bArr2);
        }
        byte[] bArrZzFA = zzzz2.zzFA();
        return (int) (4294967295L & (2981146554L - ((long) zzZYZ.zzF(bArrZzFA, bArrZzFA.length))));
    }

    private static int zzZ1(byte[] bArr) {
        int length = (int) (((long) (bArr.length + 3)) & 4294967292L);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return zzZYZ.zzF(bArr2, length);
    }

    private int zzmE() {
        int count = (this.zzcr.getCount() * 16) + 12;
        Iterator<Map.Entry<K, V>> it = this.zzcr.iterator();
        while (it.hasNext()) {
            count += (int) (((long) (((byte[]) ((Map.Entry) it.next()).getValue()).length + 3)) & 4294967292L);
        }
        return count;
    }

    @Override // com.aspose.words.internal.zzGS
    public final void zzC(zzZOP zzzop) throws Exception {
        zzXZ zzxz = new zzXZ(zzzop);
        long position = zzzop.getPosition();
        zzzop.zzH(44 + position);
        long position2 = zzzop.getPosition();
        zzzop.zzH(((long) (this.zzcr.getCount() * 20)) + position2);
        long position3 = zzzop.getPosition();
        Iterator<Map.Entry<K, V>> it = this.zzcr.iterator();
        long j = position2;
        long position4 = position3;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if ("head".equals(str)) {
                bArr[8] = 0;
                bArr[9] = 0;
                bArr[10] = 0;
                bArr[11] = 0;
            }
            int iZzZ1 = zzZ1(bArr);
            if ("head".equals(str)) {
                byte[] bytes = zzZQK.getBytes(zzZ0(bArr));
                bArr[8] = bytes[3];
                bArr[9] = bytes[2];
                bArr[10] = bytes[1];
                bArr[11] = bytes[0];
            }
            byte[] bArrZzD = zzZRV.zzD(bArr, 1);
            byte[] bArr2 = bArrZzD.length >= bArr.length ? bArr : bArrZzD;
            zzzop.zzH(j);
            zzZ(zzxz, str, (int) position4, bArr2.length, bArr.length, iZzZ1);
            j += 20;
            zzzop.zzH(position4);
            zzxz.zzW(bArr2, bArr2.length);
            zzU(zzxz);
            position4 = zzzop.getPosition();
        }
        zzzop.zzH(position);
        zzV(zzxz);
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

    private static void zzZ(zzXZ zzxz, String str, int i, int i2, int i3, int i4) throws Exception {
        for (int i5 = 0; i5 < str.length(); i5++) {
            zzxz.writeByte((byte) str.charAt(i5));
        }
        zzxz.zzl(i);
        zzxz.zzl(i2);
        zzxz.zzl(i3);
        zzxz.zzl(i4);
    }

    public zzZT2() {
        this.zzcs = 65536;
        this.zzcr = new zzZYT<>(true);
    }
}
