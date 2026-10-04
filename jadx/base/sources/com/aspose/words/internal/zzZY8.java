package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZY8 extends zzZV5 {
    private zzP zzbN;

    public zzZY8(zzZY0 zzzy0) {
        super(zzzy0);
        this.zzbN = zzzy0.zzng();
    }

    private void zzZ(zzJO zzjo, boolean z) throws Exception {
        zzZXH zzzxhZzPl = zzjo.zzPl();
        zzUW zzuw = new zzUW(zzjo);
        zzOV zzov = new zzOV((byte) 0);
        String strZzX = zzn4().zzX(zzzxhZzPl);
        if (!z) {
            this.zzbN.zzY("missing-glyph");
            this.zzbN.zzX("d", zzov.zzQ(zzZ(zzuw, zzzxhZzPl.zzpP().zzoT().zzZD(), true)));
            this.zzbN.zzp();
        }
        for (int i = 0; i < zzjo.zzTt().getCount(); i++) {
            int iZzT3 = zzjo.zzTt().zzT3(i);
            if (z) {
                this.zzbN.zzY("path");
                this.zzbN.zzX("id", zzZKN.format("{0}c{1}", strZzX, Integer.valueOf(iZzT3)));
            } else {
                this.zzbN.zzY("glyph");
                this.zzbN.zzX("unicode", zzZVS.zzS7(iZzT3));
                this.zzbN.zzX("horiz-adv-x", Integer.toString(zzW(zzzxhZzPl.zzpP().zzSx(iZzT3).zzoZ(), zzzxhZzPl)));
            }
            this.zzbN.zzX("d", iZzT3 != 32 ? zzov.zzQ(zzZ(zzuw, iZzT3, !z)) : "M0,0");
            this.zzbN.zzp();
        }
    }

    public final void zzW(zzJO zzjo) throws Exception {
        zzZ(zzjo, true);
    }

    public final void zzX(zzJO zzjo) throws Exception {
        zzZXH zzzxhZzPl = zzjo.zzPl();
        String strZzX = zzn4().zzX(zzzxhZzPl);
        this.zzbN.zzY("font");
        this.zzbN.zzX("id", strZzX);
        this.zzbN.zzX("horiz-adv-x", Integer.toString(zzW(zzzxhZzPl.zzpH(), zzzxhZzPl)));
        this.zzbN.zzY("font-face");
        this.zzbN.zzX("font-family", zzzxhZzPl.zzPh());
        this.zzbN.zzX("font-weight", zzZVC.zzRX(zzzxhZzPl.getStyle()));
        this.zzbN.zzX("font-style", zzZVC.zzRW(zzzxhZzPl.getStyle()));
        this.zzbN.zzX("units-per-em", "20480");
        this.zzbN.zzX("cap-height", Integer.toString(zzW(zzzxhZzPl.zzur(), zzzxhZzPl)));
        this.zzbN.zzX("x-height", Integer.toString(zzW(zzzxhZzPl.zzHS(), zzzxhZzPl)));
        this.zzbN.zzX("ascent", Integer.toString(zzW(zzzxhZzPl.zzHV(), zzzxhZzPl)));
        this.zzbN.zzX("descent", Integer.toString(zzW(zzzxhZzPl.zzHU(), zzzxhZzPl)));
        this.zzbN.zzY("font-face-src");
        this.zzbN.zzY("font-face-name");
        this.zzbN.zzX("name", zzzxhZzPl.getFullFontName());
        this.zzbN.zzp();
        this.zzbN.zzp();
        this.zzbN.zzp();
        zzZ(zzjo, false);
        this.zzbN.zzp();
    }

    public static int zzW(int i, zzZXH zzzxh) {
        return zzSA.zzr((i * 1024.0f) / zzzxh.zzpO());
    }

    private static zzP8 zzZ(zzUW zzuw, int i, boolean z) {
        zzP8 zzp8ZzZ9 = zzuw.zzZ9(i);
        if (z) {
            zzp8ZzZ9.zzY(new zzP9(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f));
        }
        return zzp8ZzZ9;
    }
}
