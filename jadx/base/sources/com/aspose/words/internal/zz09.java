package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
final class zz09 {
    private zz06 zzdK;
    private zzZWJ zzxD = null;

    public zz09(zz06 zz06Var) {
        this.zzdK = zz06Var;
    }

    private zzZWJ zzG9() {
        if (this.zzxD == null) {
            this.zzxD = new zzZWJ();
        }
        return this.zzxD;
    }

    private void zzU(zzPK zzpk) throws Exception {
        zzZ(zzIK.zzZ(zzpk), zzZQ4.zz2T, null);
    }

    private void zzW(zzP0 zzp0) throws Exception {
        zzG9();
        zzX(zzXH.zzZ(zzp0));
    }

    private void zzX(zzOH zzoh) throws Exception {
        zzZ(zzoh.getImageBytes(), zzoh.zzNd(), zzoh.zzNb());
    }

    private static byte[] zzZ(zzU zzu) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzu.zzY(zzzor);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    public final void zzT(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            zzX((zzOI) zzpy);
            return;
        }
        if (iZzPH == 1) {
            zzU((zzPK) zzpy);
            return;
        }
        if (iZzPH == 2) {
            zzX((zzOH) zzpy);
            return;
        }
        if (iZzPH == 3) {
            zzT((zzPA) zzpy);
        } else if (iZzPH == 4) {
            zzW(zzOO.zzX((zzOP) zzpy, zzzq4));
        } else {
            if (iZzPH != 5) {
                return;
            }
            zzW((zzP0) zzpy);
        }
    }

    private void zzX(zzOI zzoi) throws Exception {
        this.zzdK.zzs2().zzXC(zzZZX.zzt(zzoi.zzZy()));
        this.zzdK.zzs2().zzXB("setrgbcolor");
    }

    private void zzZ(byte[] bArr, zzZQ4 zzzq4, zzP9 zzp9) throws Exception {
        String str = zzZKN.format("Pattern{0}", Integer.valueOf(this.zzdK.zzs4()));
        String strZzT = this.zzdK.zzT(bArr, null);
        zzEG zzegZzZT = zzEF.zzZT(bArr);
        this.zzdK.zzs2().zzFd();
        this.zzdK.zzs2().zzM("/PatternType", 1);
        this.zzdK.zzs2().zzM("/PaintType", 1);
        this.zzdK.zzs2().zzM("/TilingType", 1);
        if (zzzq4.isEmpty()) {
            zzzq4 = new zzZQ4(0.0f, 0.0f, zzegZzZT.getWidth(), zzegZzZT.getHeight());
        }
        this.zzdK.zzs2().zzZ("/BBox", zzzq4);
        this.zzdK.zzs2().zzM("/XStep", zzegZzZT.getWidth());
        this.zzdK.zzs2().zzM("/YStep", zzegZzZT.getHeight());
        this.zzdK.zzs2().zzl("/PaintProc", C20593OooO0Oo.OooO0O0("{ ", strZzT, " execform } bind"));
        this.zzdK.zzs2().zzFc();
        this.zzdK.zzs2().zzFf();
        zzZZX zzzzxZzs2 = this.zzdK.zzs2();
        if (zzp9 == null) {
            zzp9 = new zzP9();
        }
        zzzzxZzs2.zzx(zzp9);
        this.zzdK.zzs2().zzFe();
        this.zzdK.zzs2().zzFh();
        this.zzdK.zzs2().zzXB("makepattern");
        this.zzdK.zzs2().zzXB(zzZKN.format("/{0} exch def", str));
        this.zzdK.zzs2().zzXB("/Pattern setcolorspace");
        this.zzdK.zzs2().zzXB(zzZKN.format("{0} setcolor", str));
    }

    private void zzT(zzPA zzpa) throws Exception {
        int iZzs4 = this.zzdK.zzs4();
        String str = zzZKN.format("Gradient{0}", Integer.valueOf(iZzs4));
        String str2 = zzZKN.format("Pattern{0}", Integer.valueOf(iZzs4));
        zzU zzuZzZ = zzU.zzZ(zzpa);
        this.zzdK.zzs2().zzZ(zzZ(zzuZzZ), new zz3Y(), str);
        this.zzdK.zzs2().zzFd();
        this.zzdK.zzs2().zzM("/PatternType", 2);
        this.zzdK.zzs2().zzFh();
        this.zzdK.zzs2().zzXH("/Shading");
        this.zzdK.zzs2().zzFd();
        this.zzdK.zzs2().zzM("/ShadingType", 2);
        long[] jArrZzX = zzT.zzX(zzpa);
        this.zzdK.zzs2().zzZ("/Coords", new float[]{Float.intBitsToFloat((int) jArrZzX[0]), zzZPY.zzYC(jArrZzX[0]), Float.intBitsToFloat((int) jArrZzX[1]), zzZPY.zzYC(jArrZzX[1])});
        this.zzdK.zzs2().zzZ("/Extend", new boolean[]{true, true});
        this.zzdK.zzs2().zzT("/AntiAlias", false);
        this.zzdK.zzs2().zzH("/ColorSpace", "/DeviceRGB");
        this.zzdK.zzs2().zzXB("/Function");
        this.zzdK.zzs2().zzFd();
        this.zzdK.zzs2().zzM("/FunctionType", 0);
        this.zzdK.zzs2().zzZ("/Domain", zzuZzZ.zzD());
        this.zzdK.zzs2().zzZ("/Range", zzuZzZ.zzC());
        this.zzdK.zzs2().zzZ("/Size", new int[]{zzuZzZ.zzA()});
        this.zzdK.zzs2().zzM("/BitsPerSample", zzuZzZ.zzB());
        this.zzdK.zzs2().zzl("/DataSource", str);
        this.zzdK.zzs2().zzFc();
        this.zzdK.zzs2().zzFc();
        this.zzdK.zzs2().zzFc();
        this.zzdK.zzs2().zzFf();
        this.zzdK.zzs2().zzx(zzpa.zzNb() == null ? new zzP9() : zzpa.zzNb());
        this.zzdK.zzs2().zzFe();
        this.zzdK.zzs2().zzFh();
        this.zzdK.zzs2().zzXB("makepattern");
        this.zzdK.zzs2().zzm("/{0} exch def", str2);
        this.zzdK.zzs2().zzXB("/Pattern setcolorspace");
        this.zzdK.zzs2().zzm("{0} setcolor", str2);
    }
}
