package com.aspose.words.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes5.dex */
public final class zz79 extends zz78 {
    private static final zzZHW zzUR = new zzZHW("Default", "Override", "Extension", "ContentType", "PartName");
    private zzZWT zzmY;
    private zzF4 zzmZ;
    private int zzn0;
    private int zzn1;
    private boolean zzn2;

    public zz79() {
        this.zzn1 = 5;
        this.zzn0 = 1;
    }

    private void zz7(zzZOP zzzop) throws Exception {
        zzZRW zzzrw = new zzZRW(zzzop);
        while (zzzrw.zzm0()) {
            try {
                zz77 zz77Var = new zz77(zzYf(zzzrw.zzlZ()), "");
                zz77Var.zzL(zzzrw.zzlX());
                zzxo().zzY(zz77Var);
                if (!this.zzn2 || zzZ(zz77Var)) {
                    try {
                        zz77Var.zz5(zzZ(zzzrw, zz77Var));
                    } catch (ZipException e) {
                        zzF4 zzf4 = this.zzmZ;
                        if (zzf4 != null) {
                            zzf4.zzZ(0, 0, "Unable to extract {0} part.", zz77Var.getName());
                        } else {
                            e.getMessage();
                        }
                    }
                }
            } catch (Throwable th) {
                zzzrw.dispose();
                throw th;
            }
        }
        zzzrw.dispose();
        zzzop.zzH(zzzop.getLength());
    }

    private void zz8(zzZOP zzzop) throws Exception {
        zz7(zzzop);
        zzZ(zzxq());
        zzxp();
    }

    private static void zzY(zzO zzo, zzZYF zzzyf) {
        String value = null;
        String value2 = null;
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 3) {
                value = zzo.getValue();
            } else if (iZzTP == 4) {
                value2 = zzo.getValue();
            }
        }
        if (zzZYD.zzXk(value) && zzZYD.zzXk(value2)) {
            zzzyf.set(value2, value);
        }
    }

    private static String zzYf(String str) {
        return "/" + str.replace("\\", "/");
    }

    private zzZOP zzZ(zzZRW zzzrw, zz77 zz77Var) throws Exception {
        int iZzZT = zzKE.zzZT(zz77Var.zzxl());
        if (iZzZT == 2 && zzzrw.zzlW() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return new zzZOR(zzzrw.zzlR());
        }
        zzZWT zzzwt = this.zzmY;
        if (zzzwt == null || !zzzwt.zzoq() || iZzZT != 1 || zzzrw.zzlW() <= AiFeatureConfig.DEFAULT_MAX_PDF_FILE_SIZE) {
            return zzzrw.zzlT();
        }
        zzZOP zzzopZzor = this.zzmY.zzor();
        zzzrw.zzZQ(zzzopZzor);
        zzzopZzor.zzH(0L);
        return zzzopZzor;
    }

    private zzZYF zzxq() throws Exception {
        zzZYF zzzyf = new zzZYF((char) 0);
        zzO zzo = new zzO(zzYd("/[Content_Types].xml").zzR1());
        while (zzo.zzQ("Types")) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 0) {
                zzZ(zzo, zzzyf);
            } else if (iZzTP != 1) {
                zzo.zzk();
            } else {
                zzY(zzo, zzzyf);
            }
        }
        return zzzyf;
    }

    @Override // com.aspose.words.internal.zz78
    public final void zzL(zzZOP zzzop) throws Exception {
        zzZRU zzzru = new zzZRU(zzzop, this.zzn1);
        for (zz77 zz77Var : zzxo()) {
            zz77Var.zzR1().zzH(0L);
            zzzru.zzZ(zzZKN.zzU(zz77Var.getName(), IOUtils.DIR_SEPARATOR_UNIX), zzZYD.zzZW(zzSJ.zzQ(zz77Var.zzR1())), zz77Var.zzxj());
        }
        zzzru.finish();
    }

    public final void zzxr() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (zz77 zz77Var : zzxo()) {
            if ("application/vnd.openxmlformats-package.relationships+xml".equals(zz77Var.getContentType()) || "/[Content_Types].xml".equals(zz77Var.getName())) {
                zzZQG.zzZ((ArrayList<zz77>) arrayList, zz77Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzxo().remove(((zz77) it.next()).getName());
        }
        zz73.zzZ(this, false);
        zz7C.zzZ(this, false);
    }

    public zz79(Comparator<String> comparator, int i, int i2) {
        super(comparator);
        this.zzn1 = i;
        this.zzn0 = i2;
    }

    public zz79(zzZOP zzzop) throws Exception {
        this(zzzop, (byte) 0);
    }

    private zz79(zzZOP zzzop, byte b) throws Exception {
        this(zzzop, false, null, null);
    }

    public zz79(zzZOP zzzop, boolean z, zzF4 zzf4, zzZWT zzzwt) throws Exception {
        this.zzn1 = 5;
        this.zzn0 = 1;
        this.zzmZ = zzf4;
        this.zzn2 = z;
        this.zzmY = zzzwt;
        zz8(zzzop);
    }

    private static boolean zzZ(zz77 zz77Var) throws Exception {
        int iZzZT = zzKE.zzZT(zz77Var.zzxl());
        return (iZzZT == 7 || iZzZT == 2 || iZzZT == 9 || iZzZT == 5 || iZzZT == 45 || iZzZT == 4 || iZzZT == 6 || iZzZT == 39 || iZzZT == 8 || iZzZT == 3 || iZzZT == 11 || iZzZT == 47) ? false : true;
    }

    private static void zzZ(zzO zzo, zzZYF zzzyf) {
        String value = null;
        String value2 = null;
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 2) {
                value2 = zzo.getValue();
            } else if (iZzTP == 3) {
                value = zzo.getValue();
            }
        }
        if (zzZYD.zzXk(value) && zzZYD.zzXk(value2)) {
            zzzyf.set(value2, value);
        }
    }

    private void zzZ(zzZYF zzzyf) throws Exception {
        for (zz77 zz77Var : zzxo()) {
            String str = zzzyf.get(zz77Var.getName());
            if (!zzZYD.zzXk(str)) {
                str = zzzyf.get(zz77Var.zzxl());
            }
            zz77Var.setContentType(str);
        }
    }
}
