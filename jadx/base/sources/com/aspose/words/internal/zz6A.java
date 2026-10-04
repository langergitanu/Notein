package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6A {
    private static zz5Y[] zzlh;
    private zz6C zzll;
    private zzZYT<zz68> zzlk = new zzZYT<>();
    private zzZYT<zz66> zzlj = new zzZYT<>();
    private zzER<zz66> zzli = new zzER<>();

    static {
        zz5Y[] zz5yArr = new zz5Y[3];
        zzlh = zz5yArr;
        zz5yArr[1] = new zz5Y("Font", "F");
        zzlh[2] = new zz5Y("Image", "I");
    }

    public zz6A(zz6C zz6c) {
        this.zzll = zz6c;
    }

    private zz68 zzO(zzPM zzpm) {
        zz68 zz68VarZzY2 = this.zzll.zzwJ().zzY2(zzpm.zzPl().getFullFontName());
        if (zz68VarZzY2 != null) {
            return zz68VarZzY2;
        }
        zz68 zz68VarZzY22 = this.zzll.zzwJ().zzY2(this.zzll.zzwL().getFallbackFontName());
        if (zz68VarZzY22 == null) {
            zz68VarZzY22 = this.zzll.zzwJ().zzY2("Arial");
        }
        if (zz68VarZzY22 == null) {
            throw new IllegalStateException("Arial font is not found");
        }
        this.zzll.zzT(3, zzZKN.format("Font {0} is substituted with {1}", zzpm.zzPh(), zz68VarZzY22.zzwE()));
        return zz68VarZzY22;
    }

    private static String zzUd(int i) {
        return zzlh[2].zzkY;
    }

    public final zz68 zzP(zzPM zzpm) {
        String strZzpw = zzpm.zzPl().zzpw();
        zz68 zz68Var = (zz68) zzQW.zzZ((zzZYT) this.zzlk, strZzpw);
        if (zz68Var != null) {
            return zz68Var;
        }
        zz68 zz68VarZzO = zzO(zzpm);
        this.zzlk.set(strZzpw, zz68VarZzO);
        return zz68VarZzO;
    }

    public final zz66 zzT(zzZP zzzp) throws Exception {
        zz66 zz66VarZzY = this.zzli.zzY(zzzp.getImageBytes(), zzzp.zzZd());
        if (zz66VarZzY != null) {
            return zz66VarZzY;
        }
        zz66 zz66Var = new zz66(this.zzll, zzzp);
        this.zzli.zzZ(zzzp.getImageBytes(), zzzp.zzZd(), zz66Var);
        this.zzlj.set(zz66Var.getName(), zz66Var);
        return zz66Var;
    }

    public final String zzwH() {
        return zzZKN.format("{0}{1}", zzUd(2), Integer.valueOf(this.zzlj.getCount() + 1));
    }
}
