package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXF {
    private zz0J zz9V;
    private zzTG zz9W;
    private zzZVG zz9X;
    private zzID zz9Y;
    private zzJZ zz9Z;
    private boolean zzAt;
    private zzZXB zza0;
    private zzAJ zza1;
    private zzZVJ zza2;
    private zzIF zza3;
    private zzK1 zza4;
    private zzZZ0 zza5;
    private int zzam;

    public static zzZXH zzL(ArrayList<zzZXH> arrayList) throws Throwable {
        zzZOP zzzop;
        zzTG zztg;
        ArrayList<zzZXH> arrayList2 = arrayList;
        String str = "OS/2";
        try {
            if (arrayList2.size() == 0) {
                return null;
            }
            if (arrayList2.size() == 1) {
                return arrayList2.get(0);
            }
            zzZZ2 zzzz2 = new zzZZ2();
            String[] strArr = {"head", "OS/2", "hhea", "maxp", "cmap", "hmtx", "glyf", "loca"};
            zzZOP zzzopOpenStream = arrayList2.get(0).zzpB().openStream();
            try {
                zzZZ0 zzzz0 = new zzZZ0(zzzopOpenStream);
                zzzz0.zzLh();
                zzzz2.zzWg(zzzz0.zzrg().getVersion());
                zzzz0.zzXx("maxp");
                zzAJ zzaj = new zzAJ(zzzz0.zzrh());
                zzzz0.zzXx("head");
                zzK1 zzk1ZzU = zzK1.zzU(zzzz0.zzrh());
                zzzz0.zzXx("OS/2");
                zzJZ zzjz = new zzJZ(zzzz0.zzrh());
                zzzz0.zzXx("hhea");
                zzIF zzif = new zzIF(zzzz0.zzrh());
                byte[] bArrZzXw = zzzz0.zzXw("cmap");
                zzzz0.zzXx("cmap");
                zzTG zztgZzY = zzTG.zzY(zzzz0.zzrh());
                zzzz0.zzXx("hmtx");
                byte[] byteArray = bArrZzXw;
                zzzop = zzzopOpenStream;
                try {
                    zzID zzidZzY = zzID.zzY(zzzz0.zzrh(), zzif.zzxI & 65535, zzaj.zzs2 & 65535);
                    ArrayList arrayListZzV = zzZQG.zzV(zzidZzY.zzGp());
                    short[] sArrZzGo = zzidZzY.zzGo();
                    zzD3 zzd3 = new zzD3(zzaj.zzs2 & 65535);
                    zzZ(zzzz0, (zzD3<byte[]>) zzd3);
                    Iterator<zzZYZ> it = zzzz0.zzrf().zzl9().iterator();
                    while (it.hasNext()) {
                        Iterator<zzZYZ> it2 = it;
                        zzZYZ next = it.next();
                        String str2 = str;
                        if (!zzW(strArr, next.zzck)) {
                            String str3 = next.zzck;
                            zzzz2.zzZ(str3, zzzz0.zzXw(str3));
                        }
                        str = str2;
                        it = it2;
                    }
                    String str4 = str;
                    if (zzzop != null) {
                        zzzop.close();
                    }
                    zzTG zztg2 = zztgZzY;
                    short[] sArrZzGo2 = sArrZzGo;
                    int i = 1;
                    boolean z = true;
                    while (i < arrayList2.size()) {
                        zzZOP zzzopOpenStream2 = arrayList2.get(i).zzpB().openStream();
                        try {
                            zzZZ0 zzzz02 = new zzZZ0(zzzopOpenStream2);
                            zzzz02.zzLh();
                            zzZ(zzjz, zzzz02);
                            zzZ(zzaj, zzzz02);
                            zzZ(zzzz02, (zzD3<byte[]>) zzd3);
                            zzzz02.zzXx("cmap");
                            zzJZ zzjz2 = zzjz;
                            zzTG zztgZzY2 = zzTG.zzY(zzzz02.zzrh());
                            int i2 = i;
                            if (zztgZzY2.zzQz.getCount() > zztg2.zzQz.getCount()) {
                                byteArray = zzzz02.zzXw("cmap");
                                zztg = zztgZzY2;
                                z = true;
                            } else {
                                zztg = zztg2;
                                zztg2 = zztgZzY2;
                            }
                            if (zzZ(zztg2, zztg)) {
                                z = false;
                            }
                            zzzz02.zzXx("hhea");
                            zzIF zzif2 = new zzIF(zzzz02.zzrh());
                            zzzz02.zzXx("hmtx");
                            zzTG zztg3 = zztg;
                            zzID zzidZzY2 = zzID.zzY(zzzz02.zzrh(), zzif2.zzxI & 65535, zzaj.zzs2 & 65535);
                            if ((zzif2.zzxI & 65535) > arrayListZzV.size()) {
                                for (int size = arrayListZzV.size(); size < (zzif2.zzxI & 65535); size++) {
                                    zzZQG.zzZ((ArrayList<zzIE>) arrayListZzV, zzidZzY2.zzGp()[size]);
                                }
                                sArrZzGo2 = zzidZzY2.zzGo();
                            }
                            for (int i3 = 0; i3 < zzidZzY2.zzGp().length; i3++) {
                                arrayListZzV.set(i3, zzZ((zzIE) arrayListZzV.get(i3), zzidZzY2.zzGp()[i3]));
                            }
                            if (zzzopOpenStream2 != null) {
                                zzzopOpenStream2.close();
                            }
                            i = i2 + 1;
                            arrayList2 = arrayList;
                            zzjz = zzjz2;
                            zztg2 = zztg3;
                        } finally {
                            if (zzzopOpenStream2 != null) {
                                zzzopOpenStream2.close();
                            }
                        }
                    }
                    zzJZ zzjz3 = zzjz;
                    zzJ3 zzj3 = new zzJ3();
                    for (int i4 = 0; i4 < (zzaj.zzs2 & 65535); i4++) {
                        if (zzd3.zzVE(i4)) {
                            zzj3.zz4((byte[]) zzd3.get(i4));
                        } else {
                            zzj3.zz4(new byte[0]);
                        }
                    }
                    zzj3.zzGW();
                    zzj3.zzGR().zzoJ();
                    zzj3.zzGV();
                    zzk1ZzU.zz7(zzj3.zzGR().zzHW());
                    zzif.zzxI = (short) arrayListZzV.size();
                    zzID zzid = new zzID((zzIE[]) arrayListZzV.toArray(new zzIE[0]), sArrZzGo2);
                    zzzz2.zzZ("head", zzk1ZzU.toByteArray());
                    zzzz2.zzZ(str4, zzjz3.toByteArray());
                    zzzz2.zzZ("maxp", zzaj.toByteArray());
                    zzzz2.zzZ("glyf", zzj3.zzGT().zzWy());
                    zzzz2.zzZ("loca", zzj3.zzGQ().zzWy());
                    zzzz2.zzZ("hhea", zzif.toByteArray());
                    if (!z) {
                        byteArray = zztg2.toByteArray();
                    }
                    zzzz2.zzZ("cmap", byteArray);
                    zzzz2.zzZ("hmtx", zzid.toByteArray());
                    zzj3.zzGU();
                    return new zzZXF().zzW(zzzz2.zzFA(), (String) null);
                } catch (Throwable th) {
                    th = th;
                    if (zzzop != null) {
                        zzzop.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zzzop = zzzopOpenStream;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean zzN(zzZXH zzzxh) {
        zzZX9 zzzx9ZzSy;
        return zzzxh.zzI7() && (zzzx9ZzSy = zzzxh.zzpP().zzSy(12290)) != null && zzzx9ZzSy.zzoZ() < zzzxh.zzpO();
    }

    private zzWX zzO(zzZYV<Integer> zzzyv) throws Exception {
        zzWX zzwxZzpe = zzpe();
        zzwxZzpe.zzZ(zzzyv);
        return zzwxZzpe;
    }

    private void zzP(zzZXH zzzxh) throws Exception {
        if (zzWR("COLR") && zzWR("CPAL")) {
            zzzxh.zzpp();
            zzT1 zzt1Zzpd = zzpd();
            zzS6 zzs6Zzpc = zzpc();
            for (zzT3 zzt3 : zzt1Zzpd.zzTp()) {
                ArrayList arrayList = new ArrayList(zzt3.zzQb);
                for (int i = 0; i < zzt3.zzQb; i++) {
                    zzT2 zzt2 = zzt1Zzpd.zzTo()[zzt3.zzQc + i];
                    zzZQG.zzZ((ArrayList<zzZX7>) arrayList, new zzZX7(zzt2.zzQd, zzs6Zzpc.zzRx()[zzt2.zzQa]));
                }
                zzzxh.zzpP().zzSu(zzt3.zzQd).zzZ(new zzZX8(arrayList));
            }
        }
    }

    private static byte[] zzSA(int i) {
        int i2 = i & 2;
        return (i2 == 0 || (i & 1) == 0) ? i2 != 0 ? zzZO0.zzhU().getBytes("Italic\u0000") : (i & 1) != 0 ? zzZO0.zzhU().getBytes("Bold\u0000") : zzZO0.zzhU().getBytes("Regular\u0000") : zzZO0.zzhU().getBytes("BoldItalic\u0000");
    }

    private static short zzU(short s, short s2) {
        return (short) Math.max(s & 65535, s2 & 65535);
    }

    private zzZVG zzV(short s, short s2) throws Exception {
        if (!this.zza5.zzrf().containsKey("vmtx")) {
            return null;
        }
        this.zza5.zzXx("vmtx");
        return new zzZVG(this.zza5.zzrh(), s & 65535, s2 & 65535);
    }

    private zzZYZ zzWQ(String str) throws Exception {
        zzZYZ zzzyz = this.zza5.zzrf().get(str);
        if (zzzyz != null) {
            return zzzyz;
        }
        throw new IllegalStateException(zzZKN.format("Cannot find table '{0}' in the font file.", str));
    }

    private boolean zzWR(String str) {
        return this.zza5.zzrf().containsKey(str);
    }

    private boolean zzWS(String str) throws Exception {
        this.zza5.zzLh();
        this.zza5.zzXx("name");
        zzZXB zzzxbZzr = zzZXB.zzr(this.zza5.zzrh());
        this.zza0 = zzzxbZzr;
        Iterator<String> it = zzzxbZzr.zzp0().iterator();
        while (it.hasNext()) {
            if (zzZYD.zzh(str, it.next())) {
                return true;
            }
        }
        return false;
    }

    private void zzWT(String str) throws Exception {
        this.zzAt = false;
        this.zzam = 0;
        zzZWD zzzwd = new zzZWD(this.zza5.zzrh());
        if (!zzzwd.zzri()) {
            if (!zzYX(0L)) {
                throw new IllegalStateException("The file is not recognized as a TTF or TTC font.");
            }
        } else {
            this.zzAt = true;
            this.zzam = zzZ(zzzwd, str);
            if (!zzYX(((long) zzzwd.zzo0()[this.zzam]) & 4294967295L)) {
                throw new IllegalStateException("The TTC font is invalid.");
            }
        }
    }

    private int zzY(zzZOW zzzow, zzZXH zzzxh, byte[] bArr) throws Exception {
        zzZ(zzzow, zzzxh, bArr);
        zzzow.zzl(zzZ2(bArr));
        zzzow.zzl(1252);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        return (int) zzzow.zzq().getPosition();
    }

    private boolean zzYX(long j) throws Exception {
        this.zza5.zzq().zzH(j);
        if (this.zza5.zzri()) {
            return (this.zza5.zzrf().containsKey("glyf") && this.zza5.zzrf().containsKey("loca")) || this.zza5.zzrf().containsKey("CFF ");
        }
        return false;
    }

    private static int zzZ2(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i = (int) ((((long) i) & 4294967295L) + ((long) (b & 255)));
        }
        return (int) ((((long) i) & 4294967295L) ^ 1346851650);
    }

    private zzK0 zzZj(boolean z) {
        zzIF zzif = this.zza3;
        short s = zzif.zzxV;
        zzJZ zzjz = this.zz9Z;
        int iMax = z ? 0 : Math.max(0, s - ((zzjz.zzAL + zzjz.zzAK) - (zzif.zzxX - zzif.zzxW)));
        zzJZ zzjz2 = this.zz9Z;
        short s2 = zzjz2.zzAL;
        short s3 = zzjz2.zzAK;
        return new zzK0(s2, s3, s2 + s3 + iMax);
    }

    private int zzp9() {
        zzJZ zzjz = this.zz9Z;
        int style = zzjz.zzAR == 0 ? this.zza4.getStyle() : zzjz.getStyle();
        return (this.zz9Z.zzB8 & 65535) > 600 ? style | 1 : style;
    }

    private boolean zzpa() {
        return this.zz9Z.zzHO() || this.zz9Z.zzHQ() || this.zz9Z.zzHP();
    }

    private zzZXH zzpb() throws Exception {
        zzZXH zzzxh = new zzZXH();
        zzzxh.zzZo(this.zzAt);
        zzzxh.zzSD(this.zzam);
        if (zzWR("CFF ")) {
            zzzxh.zzpD();
            zzWX zzwxZzpe = zzpe();
            zzzxh.zzZu(zzwxZzpe.zzVe());
            if (zzwxZzpe.zzVe()) {
                zzzxh.zzP(zzwxZzpe.zzVd().zzVg());
            }
        }
        zzzxh.zzSS(this.zza4.zzBp & 65535);
        zzzxh.zzSL(this.zza4.zzBm);
        zzzxh.zzSK(this.zza4.zzBl);
        zzzxh.zzSJ(this.zza4.zzBk);
        zzzxh.zzSI(this.zza4.zzBj);
        zzzxh.zzZ(this.zza0);
        zzzxh.zzY(zzpt());
        zzzxh.zzZ(zzZj(zzzxh.zzHG()));
        zzzxh.zzZl(this.zz9Z.zzHR());
        zzzxh.zzX((!this.zz9Z.zzHR() || zzzxh.zzHG()) ? zzzxh.zzpu() : zzzxh.zzpt());
        zzIF zzif = this.zza3;
        zzzxh.zzZR((float) (((-Math.atan2(zzif.zzxP, zzif.zzxQ)) * 180.0d) / 3.141592653589793d));
        zzzxh.zzSR(this.zz9Z.zzAX);
        zzzxh.zzSM(this.zz9Z.zzAW);
        zzzxh.zzSO(this.zz9Z.zzB4);
        zzzxh.zzSN(this.zz9Z.zzB2);
        zzzxh.zzSQ(this.zz9Z.zzB0);
        zzzxh.zzSP(this.zz9Z.zzAY);
        zzzxh.zzWN(zzp9());
        zzzxh.zzSH(this.zz9Z.zzAH);
        zzzxh.zzSG(this.zz9Z.zzB9);
        zzzxh.zzZt(this.zz9W.zzTx() || this.zz9Z.zzAJ.zzI8());
        zzzxh.zzW(this.zz9W.zzZ(this.zz9Y, this.zz9X, 65535 & this.zza1.zzs2));
        zzzxh.zzpP().zzH(zzO(zzzxh));
        zzP(zzzxh);
        boolean z = this.zz9Z.zzHQ() || this.zz9Z.zzHP() || this.zz9Z.zzHO();
        zzzxh.zzZs(z);
        zzzxh.zzZq(this.zz9Z.zzHQ());
        zzzxh.zzZr(this.zz9Z.zzHP());
        if (z) {
            zzV(zzzxh.zzpP());
        }
        zzzxh.zzX(this.zz9Z.zzAT);
        zzzxh.zzX(this.zz9Z.zzAJ);
        zzzxh.zzZn(this.zz9Z.zzAJ.zzI7());
        zzzxh.zzZm(zzN(zzzxh));
        zzzxh.zzZp(zzJF.zzZC(zzzxh.zzPh()));
        short s = this.zz9Z.zzB6;
        zzzxh.zzZv((s & 4) != 0 && (s & 8) == 0);
        zzzxh.zzN(this.zz9V.zzej);
        zzzxh.zzM(this.zz9V.zzei);
        return zzzxh;
    }

    private zzS6 zzpc() throws Exception {
        this.zza5.zzXx("CPAL");
        return new zzS6(this.zza5.zzrh());
    }

    private zzT1 zzpd() throws Exception {
        this.zza5.zzXx("COLR");
        return new zzT1(this.zza5.zzrh());
    }

    private zzWX zzpe() throws Exception {
        this.zza5.zzXx("CFF ");
        return zzWX.zzZ(this.zza5.zzrh());
    }

    private zz0J zzpf() throws Exception {
        zzZYZ zzzyz = this.zza5.zzrf().get("post");
        this.zza5.zzXx("post");
        return new zz0J(this.zza5.zzrh(), ((long) zzzyz.zzci) & 4294967295L);
    }

    private zzTG zzpg() throws Exception {
        this.zza5.zzXx("cmap");
        return zzTG.zzY(this.zza5.zzrh());
    }

    private zzJZ zzph() throws Exception {
        this.zza5.zzXx("OS/2");
        return new zzJZ(this.zza5.zzrh());
    }

    private void zzpi() throws Exception {
        this.zza5.zzXx("name");
        this.zza0 = zzZXB.zzr(this.zza5.zzrh());
    }

    private zzAJ zzpj() throws Exception {
        this.zza5.zzXx("maxp");
        return new zzAJ(this.zza5.zzrh());
    }

    private zzZVJ zzpk() throws Exception {
        if (!this.zza5.zzrf().containsKey("vhea")) {
            return null;
        }
        this.zza5.zzXx("vhea");
        return new zzZVJ(this.zza5.zzrh());
    }

    private zzIF zzpl() throws Exception {
        this.zza5.zzXx("hhea");
        return new zzIF(this.zza5.zzrh());
    }

    private zzK1 zzpm() throws Exception {
        this.zza5.zzXx("head");
        return zzK1.zzU(this.zza5.zzrh());
    }

    private zzK0 zzpt() {
        zzJZ zzjz = this.zz9Z;
        short s = zzjz.zzAO;
        short s2 = zzjz.zzAN;
        return new zzK0(s, -s2, (s - s2) + zzjz.zzAM);
    }

    public final zzZXH zzW(byte[] bArr, String str) throws Exception {
        return zzZ(new zzAB(bArr), str);
    }

    public final zzZXH zzZ(zzGR zzgr, String str) throws Exception {
        zzZOP zzzopOpenStream = zzgr.openStream();
        try {
            zzZXH zzzxhZzW = zzW(zzzopOpenStream, str);
            zzzxhZzW.zzZ(zzgr);
            return zzzxhZzW;
        } finally {
            if (zzzopOpenStream != null) {
                zzzopOpenStream.close();
            }
        }
    }

    private zzZXH zzW(zzZOP zzzop, String str) throws Exception {
        this.zza5 = new zzZZ0(zzzop);
        zzWT(str);
        this.zza4 = zzpm();
        zzpi();
        this.zz9Z = zzph();
        this.zza3 = zzpl();
        this.zza2 = zzpk();
        zzAJ zzajZzpj = zzpj();
        this.zza1 = zzajZzpj;
        this.zz9Y = zzW(this.zza3.zzxI, zzajZzpj.zzs2);
        zzZVJ zzzvj = this.zza2;
        if (zzzvj != null) {
            this.zz9X = zzV(zzzvj.zz7t, this.zza1.zzs2);
        }
        this.zz9W = zzpg();
        this.zz9V = zzpf();
        return zzpb();
    }

    private ArrayList<zzUV> zzO(zzZXH zzzxh) throws Exception {
        ArrayList<zzUV> arrayList = new ArrayList<>();
        if (zzzxh.zzpA() && !zzpa()) {
            zzZQG.zzZ((ArrayList<zzZXV>) arrayList, new zzZXV());
            zzZQG.zzZ((ArrayList<zzZV3>) arrayList, new zzZV3());
        }
        zzZQG.zzZ((ArrayList<zzSD>) arrayList, new zzSD());
        if (!zzJX.zzY(zzzxh) && zz0T.zzsp() && !zz0T.zzsq()) {
            zzZQG.zzZ((ArrayList<zzBR>) arrayList, new zzBR());
        }
        return arrayList;
    }

    private void zzV(zzZX5 zzzx5) {
        if (this.zz9Z.zzHQ()) {
            zzBX.zzZ(zzzx5);
        } else if (this.zz9Z.zzHP()) {
            zzBX.zzY(zzzx5);
        } else if (this.zz9Z.zzHO()) {
            zzBX.zzX(zzzx5);
        }
    }

    public final byte[] zzZ(byte[] bArr, String str, boolean z) throws Exception {
        int i;
        byte[] bArrEncode;
        zzZOR zzzor = new zzZOR();
        try {
            int length = bArr.length;
            if (length < 4194304) {
                bArrEncode = zz7V.encode(bArr);
                i = 4;
            } else {
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                zzKU.zz7(bArr2);
                i = 268435456;
                bArrEncode = bArr2;
            }
            if (bArrEncode == null) {
                zzzor.close();
                return null;
            }
            if (z) {
                i |= 1;
            }
            zzZOW zzzow = new zzZOW(zzzor);
            int iZzY = zzY(zzzow, zzW(bArr, str), new byte[0]);
            long position = zzzow.zzq().getPosition();
            zzzow.zzq().zzH(0L);
            zzzow.zzl((int) ((((long) iZzY) & 4294967295L) + ((long) bArrEncode.length)));
            zzzow.zzl(bArrEncode.length);
            zzzow.zzl(131074);
            zzzow.zzl(i);
            zzzow.zzq().zzH(position);
            zzzow.writeBytes(bArrEncode);
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private zzID zzW(short s, short s2) throws Exception {
        this.zza5.zzXx("hmtx");
        return zzID.zzY(this.zza5.zzrh(), s & 65535, s2 & 65535);
    }

    private static boolean zzW(String[] strArr, String str) {
        for (int i = 0; i < 8; i++) {
            if (zzZKN.zzX(str, strArr[i], zzZOF.ORDINAL$4894b8c8)) {
                return true;
            }
        }
        return false;
    }

    private int zzZ(zzZWD zzzwd, String str) throws Exception {
        for (int i = 0; i < zzzwd.zzo1(); i++) {
            zzzwd.zzSb(i);
            if (zzWS(str)) {
                return i;
            }
        }
        throw new IllegalStateException("The TTC font is invalid.");
    }

    public final void zzZ(ArrayList<zzJU> arrayList, zzGR zzgr, int i) {
        try {
            zzZOP zzzopOpenStream = zzgr.openStream();
            try {
                zzZZ0 zzzz0 = new zzZZ0(zzzopOpenStream);
                this.zza5 = zzzz0;
                zzZWD zzzwd = new zzZWD(zzzz0.zzrh());
                if (zzzwd.zzri()) {
                    zzZ(zzzwd, arrayList, zzgr, i);
                } else if (zzYX(0L)) {
                    arrayList.add(zzZ(zzgr, false, i));
                }
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
            } catch (Throwable th) {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
                throw th;
            }
        } catch (Exception unused) {
        }
    }

    private zzJU zzZ(zzGR zzgr, boolean z, int i) throws Exception {
        this.zza4 = zzpm();
        zzpi();
        this.zz9Z = zzph();
        boolean zContainsKey = this.zza5.zzrf().containsKey("CFF ");
        int iZzp9 = zzp9();
        String fullFontName = this.zza0.getFullFontName();
        String strZzPh = this.zza0.zzPh();
        zzZYT zzzyt = new zzZYT(false);
        for (String str : this.zza0.zzp0()) {
            zzzyt.set(str, str);
        }
        zzZYT zzzyt2 = new zzZYT(false);
        for (String str2 : this.zza0.zzp1()) {
            zzzyt2.set(str2, str2);
        }
        List<String> keys = zzzyt.getKeys();
        List<String> keys2 = zzzyt2.getKeys();
        String strZzp4 = this.zza0.zzp4();
        zzJZ zzjz = this.zz9Z;
        return new zzJU(zzgr, fullFontName, strZzPh, keys, keys2, iZzp9, z, zContainsKey, i, strZzp4, zzjz.zzAU, zzjz.zzAT, zzjz.zzAJ);
    }

    private void zzZ(zzZWD zzzwd, ArrayList<zzJU> arrayList, zzGR zzgr, int i) throws Exception {
        for (int i2 = 0; i2 < zzzwd.zzo1(); i2++) {
            zzzwd.zzSb(i2);
            this.zza5.zzLh();
            arrayList.add(zzZ(zzgr, true, i));
        }
    }

    public final void zzZ(zzZXH zzzxh, zzZOP zzzop) throws Exception {
        if (zzzxh != null) {
            zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
            try {
                this.zza5 = new zzZZ0(zzzopOpenStream);
                zzWT(zzzxh.getFullFontName());
                zzZZ2 zzzz2 = new zzZZ2(this.zza5.zzrg().getVersion());
                for (String str : this.zza5.zzrf().getKeys()) {
                    zzzz2.zzZ(str, this.zza5.zzXw(str));
                }
                zzzz2.zzC(zzzop);
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
                throw th;
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
    }

    public final void zzZ(zzZXH zzzxh, zzZYV<Integer> zzzyv, zzZYV<Integer> zzzyv2, zzZOP zzzop) throws Exception {
        if (zzzxh == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
        }
        if (zzzyv2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: oldToNewGlyphIndexes");
        }
        if (zzzop != null) {
            zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
            try {
                this.zza5 = new zzZZ0(zzzopOpenStream);
                zzWT(zzzxh.getFullFontName());
                zzZWB zzzwb = new zzZWB(zzzxh, zzpf(), zzZZY.zzQ(zzzyv));
                zzzwb.zzWg(this.zza5.zzrg().getVersion());
                zzZ(zzzyv, zzzyv2, zzzwb);
                zzZ((zzGS) zzzwb, false);
                zzZ(zzzwb);
                zzzwb.zzC(zzzop);
                if (zzzopOpenStream != null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstStream");
    }

    public final void zzZ(zzZXH zzzxh, zzZYV<Integer> zzzyv, zzZYV<Integer> zzzyv2, zzZOP zzzop, zzGS zzgs, boolean z) throws Exception {
        if (zzzxh == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
        }
        if (zzzyv2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: oldToNewGlyphIndexes");
        }
        if (zzzop != null) {
            zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
            try {
                this.zza5 = new zzZZ0(zzzopOpenStream);
                zzWT(zzzxh.getFullFontName());
                zzgs.zzWg(this.zza5.zzrg().getVersion());
                zzZ(zzzyv, zzzyv2, zzgs);
                zzZ(zzgs, z);
                zzZ(zzgs);
                zzgs.zzC(zzzop);
                if (zzzopOpenStream != null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstStream");
    }

    private void zzZ(zzZYV<Integer> zzzyv, zzZYV<Integer> zzzyv2, zzGS zzgs) throws Exception {
        zzK1 zzk1Zzpm = zzpm();
        zzIF zzifZzpl = zzpl();
        zzAJ zzajZzpj = zzpj();
        zzID zzidZzW = zzW(zzifZzpl.zzxI, zzajZzpj.zzs2);
        zzTG zztgZzpg = zzpg();
        zz0J zz0jZzpf = zzpf();
        zzJ0 zzj0 = new zzJ0(this.zza5.zzrh(), zzWQ("loca"), zzWQ("glyf"), zzk1Zzpm.zzHW());
        short sZzZ = (short) zzj0.zzZ(zzidZzW, zzzyv2);
        if ((65535 & sZzZ) == zzzyv2.getCount()) {
            zzajZzpj.zzs2 = sZzZ;
            zzifZzpl.zzxI = sZzZ;
            zztgZzpg.zzQz = zzzyv;
            zz0jZzpf.zzZ(zzzyv2);
            zzgs.zzZ("loca", zzj0.zzGO());
            zzgs.zzZ("glyf", zzj0.zzGN());
            zzgs.zzZ("hmtx", zzj0.zzGM().zzWy());
            zzgs.zzZ("maxp", zzajZzpj.toByteArray());
            zzgs.zzZ("hhea", zzifZzpl.toByteArray());
            zzgs.zzZ("cmap", zztgZzpg.toByteArray());
            zzgs.zzZ("post", zz0jZzpf.toByteArray());
            return;
        }
        throw new IllegalStateException("Unexpected used glyphs count!");
    }

    private void zzZ(zzGS zzgs, String str) throws Exception {
        if (this.zza5.zzrf().containsKey(str)) {
            zzgs.zzZ(str, this.zza5.zzXw(str));
        }
    }

    public final void zzZ(zzZXH zzzxh, zzZYV<Integer> zzzyv, zzZOP zzzop, zzGS zzgs, boolean z) throws Exception {
        if (zzzxh == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
        }
        if (zzzop != null) {
            zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
            try {
                this.zza5 = new zzZZ0(zzzopOpenStream);
                zzWT(zzzxh.getFullFontName());
                zzgs.zzWg(this.zza5.zzrg().getVersion());
                zzZ(zzzyv, zzgs);
                zzZ(zzgs, z);
                zzZ(zzgs);
                zzgs.zzC(zzzop);
                if (zzzopOpenStream != null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstStream");
    }

    private void zzZ(zzZYV<Integer> zzzyv, zzGS zzgs) throws Exception {
        zzJ0 zzj0 = new zzJ0(this.zza5.zzrh(), zzWQ("loca"), zzWQ("glyf"), zzpm().zzHW());
        zzj0.zzX(zzzyv);
        zzgs.zzZ("loca", zzj0.zzGO());
        zzgs.zzZ("glyf", zzj0.zzGN());
        zzZ(zzgs, "hmtx");
        zzZ(zzgs, "hhea");
        zzZ(zzgs, "maxp");
        zzZ(zzgs, "cmap");
        zzZ(zzgs, "post");
    }

    private void zzZ(zzGS zzgs, boolean z) throws Exception {
        zzZ(zzgs, "head");
        zzZ(zzgs, "name");
        if (z) {
            zzJZ zzjzZzph = zzph();
            zzjzZzph.zzHN();
            zzgs.zzZ("OS/2", zzjzZzph.toByteArray());
            return;
        }
        zzZ(zzgs, "OS/2");
    }

    private void zzZ(zzGS zzgs) throws Exception {
        zzZ(zzgs, "fpgm");
        zzZ(zzgs, "prep");
        zzZ(zzgs, "cvt ");
    }

    public final void zzZ(zzZXH zzzxh, zzZYV<Integer> zzzyv, zzZOP zzzop, boolean z, zzGS zzgs) throws Exception {
        if (zzzxh == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
        }
        if (zzzop != null) {
            zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
            try {
                this.zza5 = new zzZZ0(zzzopOpenStream);
                zzWT(zzzxh.getFullFontName());
                zzgs.zzWg(this.zza5.zzrg().getVersion());
                zzWX zzwxZzO = zzO(zzzyv);
                if (z) {
                    zzwxZzO.zzY(zzzop);
                    if (zzzopOpenStream != null) {
                        return;
                    } else {
                        return;
                    }
                }
                zzZ(zzwxZzO, zzgs);
                zzZ(zzgs, false);
                zzgs.zzC(zzzop);
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                    return;
                }
                return;
            } finally {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstStream");
    }

    private void zzZ(zzWX zzwx, zzGS zzgs) throws Exception {
        zzgs.zzZ("CFF ", zzwx.zzVf());
        zzZ(zzgs, "hmtx");
        zzZ(zzgs, "hhea");
        zzZ(zzgs, "maxp");
        zzZ(zzgs, "cmap");
        zzZ(zzgs, "post");
    }

    public final zzD3<zzP8> zzZ(zzZXH zzzxh, zzDB zzdb) throws Exception {
        if (zzzxh == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: font");
        }
        if (zzdb != null) {
            zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
            try {
                this.zza5 = new zzZZ0(zzzopOpenStream);
                zzWT(zzzxh.getFullFontName());
                zzK1 zzk1Zzpm = zzpm();
                if (zzWR("CFF ")) {
                    return zzpe().zzZ(zzdb);
                }
                zzD3<zzP8> zzd3ZzY = new zzJ0(this.zza5.zzrh(), zzWQ("loca"), zzWQ("glyf"), zzk1Zzpm.zzHW()).zzY(zzdb);
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
                return zzd3ZzY;
            } finally {
                if (zzzopOpenStream != null) {
                    zzzopOpenStream.close();
                }
            }
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: glyphs");
    }

    private void zzZ(zzZOW zzzow, zzZXH zzzxh) throws Exception {
        byte[] bytes = zzZO0.zzhU().getBytes(zzZKN.format("{0}{1}", zzzxh.zzPh(), (char) 0));
        byte[] bArrZzSA = zzSA(this.zz9Z.getStyle());
        byte[] bytes2 = zzZO0.zzhU().getBytes(this.zza0.zzp4());
        byte[] bytes3 = zzZO0.zzhU().getBytes(zzzxh.getFullFontName());
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(65536);
        zzzow.zzl(0);
        zzzow.writeBytes(this.zz9Z.zzAU.getValues());
        zzzow.writeByte(this.zz9Z.zzAJ.zzI4());
        zzzow.writeByte((byte) ((this.zz9Z.zzAR & 1) == 0 ? 0 : 1));
        zzzow.zzl(this.zz9Z.zzB8 & 65535);
        zzzow.zzK(this.zz9Z.zzB6);
        zzzow.zzK((short) 20556);
        zzzow.zzl(this.zz9Z.zzAT.zzIa());
        zzzow.zzl(this.zz9Z.zzAT.zzI9());
        zzzow.zzl(this.zz9Z.zzAT.zzHl());
        zzzow.zzl(this.zz9Z.zzAT.zzHk());
        zzzow.zzl(this.zz9Z.zzAJ.zzIa());
        zzzow.zzl(this.zz9Z.zzAJ.zzI9());
        zzzow.zzl(this.zza4.zzBs);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) bytes.length);
        zzzow.writeBytes(bytes);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) bArrZzSA.length);
        zzzow.writeBytes(bArrZzSA);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) bytes2.length);
        zzzow.writeBytes(bytes2);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) bytes3.length);
        zzzow.writeBytes(bytes3);
    }

    private void zzZ(zzZOW zzzow, zzZXH zzzxh, byte[] bArr) throws Exception {
        zzZ(zzzow, zzzxh);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) bArr.length);
        zzzow.writeBytes(bArr);
    }

    private static boolean zzZ(zzTG zztg, zzTG zztg2) {
        boolean z = false;
        for (int i = 0; i < zztg.zzQz.getCount(); i++) {
            int iZzT3 = zztg.zzQz.zzT3(i);
            Integer numZzVY = zztg.zzQz.zzVY(i);
            numZzVY.intValue();
            if (!zztg2.zzQz.zzVE(iZzT3)) {
                zztg2.zzQz.set(iZzT3, numZzVY);
                z = true;
            }
        }
        return z;
    }

    private static void zzZ(zzZZ0 zzzz0, zzD3<byte[]> zzd3) throws Exception {
        zzJ2 zzj2ZzZ = zzZ(zzzz0);
        for (int i = 0; i < zzj2ZzZ.zzGP(); i++) {
            if (zzj2ZzZ.zzWq(i) > 0 && !zzd3.zzVE(i)) {
                zzd3.set(i, zzj2ZzZ.zzWp(i));
            }
        }
    }

    private static void zzZ(zzJZ zzjz, zzZZ0 zzzz0) throws Exception {
        zzzz0.zzXx("OS/2");
        zzjz.zzAP = zzU(zzjz.zzAP, new zzJZ(zzzz0.zzrh()).zzAP);
    }

    private static void zzZ(zzAJ zzaj, zzZZ0 zzzz0) throws Exception {
        zzzz0.zzXx("maxp");
        zzAJ zzaj2 = new zzAJ(zzzz0.zzrh());
        zzaj.zzs0 = zzU(zzaj.zzs0, zzaj2.zzs0);
        zzaj.zzs1 = zzU(zzaj.zzs1, zzaj2.zzs1);
        zzaj.zzrV = zzU(zzaj.zzrV, zzaj2.zzrV);
        zzaj.zzrX = zzU(zzaj.zzrX, zzaj2.zzrX);
        zzaj.zzrP = zzU(zzaj.zzrP, zzaj2.zzrP);
        zzaj.zzrQ = zzU(zzaj.zzrQ, zzaj2.zzrQ);
        zzaj.zzrY = zzU(zzaj.zzrY, zzaj2.zzrY);
        zzaj.zzrZ = zzU(zzaj.zzrZ, zzaj2.zzrZ);
        zzaj.zzrU = zzU(zzaj.zzrU, zzaj2.zzrU);
        zzaj.zzrT = zzU(zzaj.zzrT, zzaj2.zzrT);
        zzaj.zzrS = zzU(zzaj.zzrS, zzaj2.zzrS);
        zzaj.zzrW = zzU(zzaj.zzrW, zzaj2.zzrW);
        zzaj.zzrR = zzU(zzaj.zzrR, zzaj2.zzrR);
    }

    private static zzIE zzZ(zzIE zzie, zzIE zzie2) {
        return (zzie2.zzxH == 0 && zzie2.zzxG == 0) ? zzie : zzie2;
    }

    private static zzJ2 zzZ(zzZZ0 zzzz0) throws Exception {
        zzzz0.zzXx("head");
        zzK1 zzk1ZzU = zzK1.zzU(zzzz0.zzrh());
        return new zzJ2(zzzz0.zzrh(), zzzz0.zzrf().get("loca"), zzzz0.zzrf().get("glyf"), zzk1ZzU.zzHW());
    }
}
