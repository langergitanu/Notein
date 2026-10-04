package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWX extends zzZMO {
    private zzYO8 zzZxa;

    public zzYWX(String str) {
        super(str);
        zzYO8 zzyo8Zzh = zzYO8.zzh(144.0d, 108.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
    }

    private void zzJ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        int i = (int) (zzzlx.zzX9(31700, 4) ? 2L : 0L);
        Iterator<Forms2OleControl> it = getChildNodes().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Forms2OleControl next = it.next();
            if (next.getType() == 9) {
                zzzlx.write(next.getIdInternal());
                i |= 4;
                break;
            }
        }
        zzzlx.zzX8(position, (int) ((this.zzYvV.zzPg(31705) ? 0L : 8L) | ((long) i)));
        for (Forms2OleControl forms2OleControl : getChildNodes()) {
            if (forms2OleControl.getType() == 13) {
                zzzlx.write(forms2OleControl.getIdInternal());
            }
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZOX zzzox, Forms2OleControl forms2OleControl) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, forms2OleControl.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(2, 4, 31710);
        zzzly.zzf(4, 4, 31715);
    }

    private void zzm(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(2, 4, 31700);
        zzzly.zzXe(4, 4);
        this.zzYvV.zzO(31705, Boolean.valueOf((iZzXb & 8) == 0));
    }

    @Override // com.aspose.words.zzZMO, com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "46e31370-3f7a-11ce-bed6-00aa00611080";
    }

    @Override // com.aspose.words.zzZMO, com.aspose.words.Forms2OleControl
    public final int getType() {
        return 8;
    }

    @Override // com.aspose.words.Forms2OleControl, com.aspose.words.OleControl
    public final String getUserType() {
        return "Microsoft Forms 2.0 Form";
    }

    @Override // com.aspose.words.zzZMO, com.aspose.words.Forms2OleControl
    public final boolean isComposite() {
        return true;
    }

    @Override // com.aspose.words.zzZMO, com.aspose.words.Forms2OleControl, com.aspose.words.OleControl
    public final void zzW(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzU(zzaa);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        zzZ(zzzow, new zzZMO(""));
        int i = 0;
        for (Forms2OleControl forms2OleControl : getChildNodes()) {
            if (forms2OleControl.getType() == 13) {
                zzZ(zzzow, forms2OleControl);
                i++;
            }
        }
        if (i > 0) {
            this.zzYvV.set(31700, Integer.valueOf(i));
        }
        zzJ(zzzow);
        zzaa.set("x", zzzor);
    }

    @Override // com.aspose.words.zzZMO, com.aspose.words.Forms2OleControl, com.aspose.words.OleControl
    public final void zzX(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzV(zzaa);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzaa.zzYu("x"));
        zzZ(zzzox, new zzZMO(""));
        for (Forms2OleControl forms2OleControl : getChildNodes()) {
            if (forms2OleControl.getType() == 13) {
                zzZ(zzzox, forms2OleControl);
            }
        }
        zzm(zzzox);
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, Forms2OleControl forms2OleControl) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, forms2OleControl.zzYvV);
        zzzlx.zzX8(position, (int) (((long) ((int) (zzzlx.zzX9(31710, 4) ? 2L : 0L))) | (zzzlx.zzX9(31715, 4) ? 4L : 0L)));
    }
}
