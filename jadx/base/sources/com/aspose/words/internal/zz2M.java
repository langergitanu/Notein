package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2M extends zz33 implements zzHV {
    private float zzHi;
    private zz2L zzgs;
    private zz2B zzgt;
    private zz2K zzgu;
    private zz4Z zzjM;
    private zz4Y zzjX;
    private float zzwo;

    public zz2M(zz4W zz4w, float f, float f2) throws Exception {
        super(zz4w);
        this.zzgt = new zz2B();
        this.zzHi = f;
        this.zzwo = f2;
        this.zzjX = new zz4Y(zzuN());
        this.zzgs = new zz2L(zzuN(), this.zzjX);
        this.zzjM = new zz4Z(zzuN(), this.zzgs, this);
        this.zzgs.zzvi().zzz(new zzP9(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.zzwo));
        this.zzgu = zzuN().zzv5().zzXT(zzF0());
    }

    private boolean zzR(zz7 zz7Var) {
        return zzuN().zzv6() && zz7Var.getCount() != 0;
    }

    private static String zzTJ(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if ((i & 1) != 0) {
            zzZNH.zzU(sb, "/Top ");
        }
        if ((i & 2) != 0) {
            zzZNH.zzU(sb, "/Bottom ");
        }
        if ((i & 4) != 0) {
            zzZNH.zzU(sb, "/Left ");
        }
        if ((i & 8) != 0) {
            zzZNH.zzU(sb, "/Right ");
        }
        sb.append(']');
        return sb.toString();
    }

    private static String zzTK(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "/Page" : "/Layout" : "/Pagination";
    }

    private void zzZ(zzZS zzzs, zz5E zz5e) throws Exception {
        this.zzgs.zzvi().zztZ();
        zz4Z zz4z = new zz4Z(zzuN(), zz5e);
        zzzs.zzZ(zz4z);
        zz4z.zzvh();
        this.zzgs.zzvi().zztY();
    }

    private zz4R zzZ3(long j) {
        return zz4R.zzZ(zzF0(), this.zzgs.zzvi().zzZ4(j));
    }

    private void zztp() throws Exception {
        this.zzjM.zzvh();
        this.zzgs.zzvl().zzXV("EMC");
    }

    public final float getHeight() {
        return this.zzwo;
    }

    public final float getWidth() {
        return this.zzHi;
    }

    public final void zzG3() throws Exception {
        this.zzjM.zzvh();
        this.zzgs.zzvi().zzz(new zzP9(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.zzwo).zzOo());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    @Override // com.aspose.words.internal.zzHV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzV(zzL zzl) throws Exception {
        zz5J zz31Var;
        zz5J zz48Var;
        zzZQ4 zzzq4ZzO = this.zzgs.zzvi().zzO(zzl.zzZZ());
        int type = zzl.getType();
        if (type != 0) {
            if (type != 1) {
                if (type == 2) {
                    zz48Var = new zz48(zzuN(), zzzq4ZzO, (zzK) zzZKW.zzZ(zzl, zzK.class));
                }
                if (zz48Var != null) {
                    this.zzgt.add(zz48Var.zzF0());
                    zzuN().zzva().zzZ(zz48Var);
                }
                this.zzgu.zzZ(zz48Var, zzl);
            }
            if (zzuN().zzv7().zzvC()) {
                zz8 zz8Var = (zz8) zzZKW.zzZ(zzl, zz8.class);
                zz31Var = new zz1M(zzuN(), zzzq4ZzO, zzZ(zz8Var.zzZw()), zz8Var.getTitle(), zz8Var.getText(), zz8Var.getParentId(), zz8Var.zzZy(), zz8Var.zzZx());
                zzuN().zzva().zzq(zz8Var.getId(), zz31Var.zzF0());
            } else {
                zzuN().zz2("The annotations are not supported when saving to PDF/A and PDF/UA standards and has been removed.");
            }
            zz48Var = null;
            if (zz48Var != null) {
            }
            this.zzgu.zzZ(zz48Var, zzl);
        }
        zzZR zzzr = (zzZR) zzZKW.zzZ(zzl, zzZR.class);
        zz31Var = new zz31(zzuN(), zzzq4ZzO, zzzr.getTarget(), zzzr.zzZf(), zzzr.getScreenTip());
        zz48Var = zz31Var;
        if (zz48Var != null) {
        }
        this.zzgu.zzZ(zz48Var, zzl);
    }

    public final void zzW(zzZN zzzn) throws Exception {
        if (zzR(zzzn)) {
            zztp();
        }
    }

    public final void zzX(zzI zzi) {
        zz4R zz4rZzZ3 = zzZ3(zzi.zzZT());
        zzuN().zzva().zzZ(zzi.getName(), zz4rZzZ3);
        zzuN().zzvV().zzZ(zzi, zz4rZzZ3);
    }

    public final boolean zzY(zzZS zzzs) throws Exception {
        String str = (zzzs.zzZg() != 268435456 || zzzs.getTag() == null) ? null : (String) zzZKW.zzZ(zzzs.getTag(), String.class);
        if (!zzuN().zzvc().getCacheBackgroundGraphics() || str == null) {
            return true;
        }
        this.zzjM.zzvh();
        zz5E zz5eZzX = zzuN().zzvb().zzX(str, this.zzgs.zzvi().zztV().zzua());
        if (zz5eZzX == null) {
            zz5eZzX = zzuN().zzvb().zzY(str, new zzH().zzZ((zzZL) zzzs), this.zzgs.zzvi().zztV());
            zzZ(zzzs, zz5eZzX);
        }
        this.zzgs.zzvl().zzp("{0} Do", zz5eZzX.zzF1());
        this.zzjX.zzZ(zz5eZzX);
        return false;
    }

    public final zz4Z zzto() {
        return this.zzjM;
    }

    public final void zzW(zzJ zzj) throws Exception {
        if (zzR(zzj)) {
            zztp();
        }
    }

    public final void zzX(zzZN zzzn) throws Exception {
        if (zzR(zzzn)) {
            zzY("/P", this.zzgu.zzV(zzzn), zzzn.getLanguage());
        }
    }

    public final void zzZ(zz26 zz26Var) {
        this.zzgt.add(zz26Var.zzF0());
    }

    public final void zzX(zzJ zzj) throws Exception {
        if (zzR(zzj)) {
            zzZ("/Artifact", zzV(zzj));
        }
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzgs.zzY(zzfx);
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Page");
        zzfy.zzZ("/Parent", zzuN().zzvW());
        zzfy.zzZ("/Contents", this.zzgs);
        zzfy.zzZ("/MediaBox", new zzZQ4(0.0f, 0.0f, this.zzHi, this.zzwo));
        zzfy.zzYY("/Resources");
        this.zzjX.zzL(zzfy);
        if (zzuN().zzv7().zzvH()) {
            zzfy.zzYY("/Group");
            zzfy.zzFd();
            zzfy.zzH("/Type", "/Group");
            zzfy.zzH("/S", "/Transparency");
            zzfy.zzH("/CS", "/DeviceRGB");
            zzfy.zzFc();
        }
        if (this.zzgt.getCount() > 0) {
            zzfy.zzYY("/Annots");
            this.zzgt.zzW(zzfy);
        }
        if (zzuN().zzv6()) {
            zzfy.zzM("/StructParents", this.zzgu.zzw7());
            zzfy.zzH("/Tabs", "/S");
        }
        zzfy.zzFc();
    }

    public final void zzY(zz5S zz5s) {
        this.zzgt.add(zz5s.zzF0());
    }

    public final void zzY(zzZI zzzi) {
        zzuN().zzvV().zzZ(zzzi, zzZ3(zzzi.zzZT()));
    }

    private void zzY(String str, int i, String str2) throws Exception {
        zzZYT<String> zzzyt = new zzZYT<>();
        zzzyt.set("/MCID", zzJB.zzWD(i));
        if (zzZYD.zzXk(str2) && !zzZKN.equals(zzuN().zzvR(), str2)) {
            zzzyt.set("/Lang", zzZKN.format("({0})", str2));
        }
        zzZ(str, zzzyt);
    }

    private static zzZYT<String> zzV(zzJ zzj) {
        zzZYT<String> zzzyt = new zzZYT<>();
        zzzyt.set("/Type", zzTK(zzj.zzZW()));
        if (zzj.zzZV() != null && !zzj.zzZV().isEmpty()) {
            zzZQ4 zzzq4ZzBE = zzj.zzZV().zzBE();
            zzzyt.set("/BBox", zzZKN.format("[{0} {1} {2} {3}]", zz1D.zzT(zzzq4ZzBE.zzZm(), 8), zz1D.zzT(zzzq4ZzBE.zzZo(), 8), zz1D.zzT(zzzq4ZzBE.zzkw(), 8), zz1D.zzT(zzzq4ZzBE.zzZn(), 8)));
        }
        if (zzj.zzZW() == 0 && zzj.zzZU() != 0) {
            zzzyt.set("/Attached", zzTJ(zzj.zzZU()));
        }
        return zzzyt;
    }

    private float[] zzZ(zzZZQ zzzzq) {
        float[] fArr = new float[zzzzq.getCount() * 8];
        for (int i = 0; i < zzzzq.getCount(); i++) {
            zzZQ4 zzzq4ZzO = this.zzgs.zzvi().zzO(zzzzq.zzT7(i));
            int i2 = i * 8;
            float fZzZm = zzzq4ZzO.zzZm();
            fArr[i2 + 4] = fZzZm;
            fArr[i2] = fZzZm;
            float fZzkw = zzzq4ZzO.zzkw();
            fArr[i2 + 6] = fZzkw;
            fArr[i2 + 2] = fZzkw;
            float fZzZn = zzzq4ZzO.zzZn();
            fArr[i2 + 3] = fZzZn;
            fArr[i2 + 1] = fZzZn;
            float fZzZo = zzzq4ZzO.zzZo();
            fArr[i2 + 7] = fZzZo;
            fArr[i2 + 5] = fZzZo;
        }
        return fArr;
    }

    private void zzZ(String str, zzZYT<String> zzzyt) throws Exception {
        this.zzjM.zzvh();
        this.zzgs.zzvl().zzXV(str);
        this.zzgs.zzvl().zzFd();
        Iterator<Map.Entry<K, V>> it = zzzyt.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.zzgs.zzvl().zzXH((String) entry.getKey());
            this.zzgs.zzvl().zzXW((String) entry.getValue());
        }
        this.zzgs.zzvl().zzFc();
        this.zzgs.zzvl().zzFh();
        this.zzgs.zzvl().zzXV("BDC");
    }
}
