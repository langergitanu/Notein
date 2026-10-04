package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZX extends zz1D {
    private zz01 zzdv;

    public zzZZX(zzZOP zzzop) {
        super(zzzop);
    }

    private void writeChar(int i) throws Exception {
        if (i > 255) {
            zzTA(i);
            return;
        }
        if (i == 40 || i == 41 || i == 92) {
            zzq().writeByte((byte) 92);
        }
        zzq().writeByte((byte) i);
    }

    private void writeStringArray(String[] strArr) throws Exception {
        zzFf();
        for (int i = 0; i < strArr.length; i++) {
            zzXE(strArr[i]);
            if (i < strArr.length - 1) {
                zzFh();
            }
        }
        zzFe();
    }

    private zz01 zzrV() {
        if (this.zzdv == null) {
            this.zzdv = new zz01(this);
        }
        return this.zzdv;
    }

    public static String zzt(zzPV zzpv) {
        return zzZKN.format("{0} {1} {2}", zz1D.zzT(zzpv.zzPC() / 255.0f, 8), zz1D.zzT(zzpv.zzPB() / 255.0f, 8), zz1D.zzT(zzpv.zzPA() / 255.0f, 8));
    }

    public final void zzA(zzP8 zzp8) {
        zzrV().zzB(zzp8);
    }

    public final void zzC(zzP8 zzp8) throws Exception {
        zzrV().zzB(zzp8);
        zzXB("clip");
    }

    public final void zzQ(String str, String str2, String str3) throws Exception {
        zzXB(zzZKN.format(str, str2, str3));
    }

    public final void zzXA(String str) throws Exception {
        zzsY();
        Iterator<Integer> it = new zzZYE(str).iterator();
        while (it.hasNext()) {
            String strZzS7 = zzZVS.zzS7(it.next().intValue());
            writeChar(strZzS7.charAt(0));
            if (strZzS7.length() > 1) {
                writeChar(strZzS7.charAt(1));
            }
        }
        zzsX();
    }

    public final void zzXB(String str) throws Exception {
        zzXE(str);
        zzFg();
    }

    public final void zzXC(String str) throws Exception {
        zzXE(str);
        zzFh();
    }

    public final void zzZ(byte[] bArr, zz45 zz45Var, String str) throws Exception {
        String[] strArr = zz45Var.zzwE() == null ? new String[]{"/ASCII85Decode"} : new String[]{"/ASCII85Decode", zz45Var.zzwE()};
        zzm("/{0}", str);
        zzXB("currentfile");
        zzFd();
        zzZ("/Filter", strArr);
        if (zz45Var.zzuB()) {
            zzYY("/DecodeParms");
            zzFf();
            zzF8();
            zzFh();
            zz45Var.zzH(this);
            zzFe();
        }
        zzFc();
        zzXH("/ReusableStreamDecode");
        zzXB("filter");
        zzXB(zz0A.zzZb(bArr));
        zzXB("def");
    }

    public final void zzZT(float f) throws Exception {
        zzXE(zzJB.zzr(f));
    }

    public final void zzZU(float f) throws Exception {
        zzXE(zzJB.zzt(f));
    }

    public final void zzl(String str, String str2) throws Exception {
        if (zzZYD.zzXk(str2)) {
            zzXH(str);
            zzXE(str2);
        }
    }

    public final void zzm(String str, String str2) throws Exception {
        zzXB(zzZKN.format(str, str2));
    }

    public final void zzw(zzP9 zzp9) throws Exception {
        zzFf();
        zzx(zzp9);
        zzFe();
        zzFh();
        zzXB("concat");
    }

    private void zzZ(String str, String[] strArr) throws Exception {
        zzYY(str);
        zzFh();
        writeStringArray(strArr);
    }
}
