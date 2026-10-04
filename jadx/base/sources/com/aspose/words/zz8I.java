package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zz8I {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("anchor", "inline", "allowOverlap", "behindDoc", "distB", "distL", "distR", "distT", "hidden", "layoutInCell", "locked", "relativeHeight", "simplePos", "editId", "anchorId", "cNvGraphicFramePr", "docPr", "effectExtent", "extent", "graphic", "positionH", "positionV", "wrapNone", "wrapSquare", "wrapThrough", "wrapTight", "wrapTopAndBottom", "sizeRelH", "sizeRelV", "AlternateContent", "Choice", "Fallback", "b", "l", "r", "t", "start", "lineTo", "graphicFrameLocks", "extLst", "descr", "id", "name", NoteMeta.PROPERTY_TITLE, "hlinkClick", "hlinkHover", "relativeFrom", "align", "posOffset", "pctPosHOffset", "pctPosVOffset", "wrapText", "wrapPolygon", "pctWidth", "pctHeight");
    private com.aspose.words.internal.zzZYG<zz82> zzZ58;
    private zzYC3 zzZ59;
    private zzZXT zzZ5a;
    private ShapeBase zzZ7Z;
    private zzYU4 zzZ7n;

    private void zzIV(int i) {
        if (this.zzZ59.getWrapType() == 0) {
            return;
        }
        this.zzZ59.zzQ(EditingLanguage.ARABIC_LIBYA, Integer.valueOf(i));
        while (this.zzZ7n.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 4) {
                this.zzZ59.zzQ(903, Integer.valueOf(this.zzZ7n.zzb()));
            } else if (iZzTP == 5) {
                this.zzZ59.zzQ(SQLitePersistence.MAX_ARGS, Integer.valueOf(this.zzZ7n.zzb()));
            } else if (iZzTP == 6) {
                this.zzZ59.zzQ(902, Integer.valueOf(this.zzZ7n.zzb()));
            } else if (iZzTP == 7) {
                this.zzZ59.zzQ(901, Integer.valueOf(this.zzZ7n.zzb()));
            } else if (iZzTP != 51) {
                zzYU4 zzyu4 = this.zzZ7n;
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                this.zzZ59.zzQ(InputDeviceCompat.SOURCE_TOUCHSCREEN, Integer.valueOf(zz84.zzPi(this.zzZ7n.getValue())));
            }
        }
        this.zzZ7n.zzj();
        String localName = this.zzZ7n.getLocalName();
        while (this.zzZ7n.zzQ(localName)) {
            int iZzTP2 = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP2 == 17) {
                zzZCk();
            } else if (iZzTP2 != 52) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                zzZCj();
            }
        }
    }

    private void zzIW(int i) throws Exception {
        this.zzZ59.zzQ(EditingLanguage.ARABIC_LIBYA, Integer.valueOf(i));
        boolean zZz8 = false;
        while (this.zzZ7n.zzi()) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 2:
                    this.zzZ59.zzQ(950, Boolean.valueOf(this.zzZ7n.zz8()));
                    break;
                case 3:
                    this.zzZ59.zzQ(954, Boolean.valueOf(this.zzZ7n.zz8()));
                    break;
                case 4:
                    this.zzZ59.zzQ(903, Integer.valueOf(zzPp(this.zzZ7n.getValue())));
                    break;
                case 5:
                    this.zzZ59.zzQ(SQLitePersistence.MAX_ARGS, Integer.valueOf(zzPp(this.zzZ7n.getValue())));
                    break;
                case 6:
                    this.zzZ59.zzQ(902, Integer.valueOf(zzPp(this.zzZ7n.getValue())));
                    break;
                case 7:
                    this.zzZ59.zzQ(901, Integer.valueOf(zzPp(this.zzZ7n.getValue())));
                    break;
                case 8:
                case 13:
                case 14:
                    break;
                case 9:
                    this.zzZ59.zzQ(944, Boolean.valueOf(this.zzZ7n.zz8()));
                    break;
                case 10:
                    this.zzZ59.zzQ(4099, Boolean.valueOf(this.zzZ7n.zz8()));
                    break;
                case 11:
                    this.zzZ59.zzQ(4154, Integer.valueOf(zzXYN.zzYY(this.zzZ7n.zzb(), false)));
                    break;
                case 12:
                    zZz8 = this.zzZ7n.zz8();
                    break;
                default:
                    zzYU4 zzyu4 = this.zzZ7n;
                    zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
                    break;
            }
        }
        this.zzZ7n.zzj();
        String localName = this.zzZ7n.getLocalName();
        while (this.zzZ7n.zzQ(localName)) {
            zzXj(zZz8);
        }
    }

    private int zzPp(String str) {
        long jZzZf = com.aspose.words.internal.zzJB.zzZf(str);
        if (jZzZf <= 2.01168E7d && jZzZf >= 0) {
            return (int) jZzZf;
        }
        this.zzZ7n.zzZ(65536, 2, com.aspose.words.internal.zzZKN.format("The distance value '{0}' is outside of the range and will be interpreted as zero.\r\n                The measurement must be between 0 and 1584pt", Long.valueOf(jZzZf)));
        return 0;
    }

    private void zzXj(boolean z) throws Exception {
        int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
        if (iZzTP == 12) {
            if (z) {
                zzZCd();
                return;
            } else {
                this.zzZ7n.zzYyH();
                return;
            }
        }
        switch (iZzTP) {
            case 15:
                zzZCi();
                break;
            case 16:
                zzZCh();
                break;
            case 17:
                zzZCk();
                break;
            case 18:
                long jZzY = zzH6.zzY(this.zzZ7n, this.zzZ5a.zzZqn());
                this.zzZ59.zzQ(4131, Double.valueOf(((double) ((int) jZzY)) / 12700.0d));
                this.zzZ59.zzQ(4132, Double.valueOf(((double) ((int) (jZzY >>> 32))) / 12700.0d));
                break;
            case 19:
                ShapeBase shapeBaseZz8 = zz77.zz8(this.zzZ5a);
                this.zzZ7Z = shapeBaseZz8;
                if (this.zzZ58 != null) {
                    shapeBaseZz8.zzY9i().zzM(this.zzZ58);
                }
                break;
            case 20:
                zzZCg();
                break;
            case 21:
                zzZCe();
                break;
            case 22:
                zzIV(3);
                break;
            case 23:
                zzIV(2);
                break;
            case 24:
                zzIV(5);
                break;
            case 25:
                zzIV(4);
                break;
            case 26:
                zzIV(1);
                break;
            case 27:
                zzZCc();
                break;
            case 28:
                zzZCb();
                break;
            case 29:
                zzZCm();
                break;
            default:
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
                break;
        }
    }

    private void zzZCb() {
        while (this.zzZ7n.zzi()) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 46) {
                zzYU4 zzyu4 = this.zzZ7n;
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                this.zzZ59.zzQ(1989, Integer.valueOf(zz84.zzPk(this.zzZ7n.getValue())));
            }
        }
        while (this.zzZ7n.zzQ("sizeRelV")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 54) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                this.zzZ59.zzQ(1985, Integer.valueOf(zzZCf()));
            }
        }
    }

    private void zzZCc() {
        while (this.zzZ7n.zzi()) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 46) {
                zzYU4 zzyu4 = this.zzZ7n;
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                this.zzZ59.zzQ(1988, Integer.valueOf(zz84.zzPl(this.zzZ7n.getValue())));
            }
        }
        while (this.zzZ7n.zzQ("sizeRelH")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 53) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                this.zzZ59.zzQ(1984, Integer.valueOf(zzZCf()));
            }
        }
    }

    private void zzZCd() {
        this.zzZ59.zzQ(912, 1);
        this.zzZ59.zzQ(911, 0);
        this.zzZ59.zzQ(914, 1);
        this.zzZ59.zzQ(913, 0);
        long jZzZ = zzH6.zzZ(this.zzZ7n, this.zzZ5a.zzZqn());
        this.zzZ59.zzQ(4129, Double.valueOf(((double) ((int) jZzZ)) / 12700.0d));
        this.zzZ59.zzQ(4130, Double.valueOf(((double) ((int) (jZzZ >> 32))) / 12700.0d));
    }

    private void zzZCe() {
        while (this.zzZ7n.zzi()) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 46) {
                zzYU4 zzyu4 = this.zzZ7n;
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                this.zzZ59.zzQ(914, Integer.valueOf(zz84.zzPm(this.zzZ7n.getValue())));
            }
        }
        while (this.zzZ7n.zzQ("positionV")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 47) {
                this.zzZ59.zzQ(913, Integer.valueOf(zz84.zzPX(this.zzZ7n.readString())));
            } else if (iZzTP == 48) {
                this.zzZ59.zzQ(4130, Double.valueOf(((double) this.zzZ7n.zzh()) / 12700.0d));
            } else if (iZzTP != 50) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                this.zzZ59.zzQ(1987, Integer.valueOf(zzZCf()));
            }
        }
    }

    private int zzZCf() {
        return zz3W.zzXx(zz3W.zzXy(zz3W.zzZ(this.zzZ7n.readString(), this.zzZ5a.zzZqn())));
    }

    private void zzZCg() {
        while (this.zzZ7n.zzi()) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 46) {
                zzYU4 zzyu4 = this.zzZ7n;
                zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                this.zzZ59.zzQ(912, Integer.valueOf(zz84.zzPn(this.zzZ7n.getValue())));
            }
        }
        while (this.zzZ7n.zzQ("positionH")) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 47:
                    this.zzZ59.zzQ(911, Integer.valueOf(zz84.zzPj(this.zzZ7n.readString())));
                    break;
                case 48:
                    this.zzZ59.zzQ(4129, Double.valueOf(((double) this.zzZ7n.zzh()) / 12700.0d));
                    break;
                case 49:
                    this.zzZ59.zzQ(1986, Integer.valueOf(zzZCf()));
                    break;
                default:
                    this.zzZ7n.getLocalName();
                    this.zzZ7n.zzk();
                    break;
            }
        }
    }

    private void zzZCh() throws Exception {
        while (this.zzZ7n.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP != 8) {
                switch (iZzTP) {
                    case 40:
                        this.zzZ59.zzQ(897, this.zzZ7n.getValue());
                        break;
                    case 41:
                        this.zzZ59.zzQ(4124, Integer.valueOf(this.zzZ7n.zzb()));
                        break;
                    case 42:
                        this.zzZ59.zzQ(896, this.zzZ7n.getValue());
                        break;
                    case 43:
                        this.zzZ59.zzQ(4157, this.zzZ7n.getValue());
                        break;
                    default:
                        zzYU4 zzyu4 = this.zzZ7n;
                        zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
                        break;
                }
            } else if (this.zzZ59.getWrapType() != 0) {
                this.zzZ59.zzQ(958, Boolean.valueOf(this.zzZ7n.zz8()));
            }
        }
        while (this.zzZ7n.zzQ("docPr")) {
            int iZzTP2 = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP2 == 39) {
                this.zzZ58 = zz81.zzd(this.zzZ5a);
            } else if (iZzTP2 != 44) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                zz6P zz6pZz7 = zz6O.zz7(this.zzZ5a);
                this.zzZ59.zzP(898, zz6pZz7.getId());
                this.zzZ59.zzP(4120, zz6pZz7.zzZe());
                this.zzZ59.zzP(909, zz6pZz7.zzZzU());
            }
        }
    }

    private void zzZCi() {
        while (this.zzZ7n.zzQ("cNvGraphicFramePr")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 38) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                zzH6.zzZ(this.zzZ7n, this.zzZ59);
            }
        }
    }

    private void zzZCj() {
        com.aspose.words.internal.zz0P zz0p = new com.aspose.words.internal.zz0P();
        while (this.zzZ7n.zzQ("wrapPolygon")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 36 || iZzTP == 37) {
                zz0p.add(zzH6.zzZ(this.zzZ7n, this.zzZ5a.zzZqn()));
            } else {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            }
        }
        if (com.aspose.words.internal.zzZPZ.zzD(zz0p.get(0), zz0p.get(zz0p.getCount() - 1))) {
            zz0p.removeAt(zz0p.getCount() - 1);
        }
        zzYM5[] zzym5Arr = new zzYM5[zz0p.getCount()];
        for (int i = 0; i < zz0p.getCount(); i++) {
            zzym5Arr[i] = new zzYM5(zz0p.get(i));
        }
        this.zzZ59.zzQ(899, zzym5Arr);
    }

    private void zzZCk() {
        zzYO3 zzyo3ZzZqn = this.zzZ5a.zzZqn();
        while (this.zzZ7n.zzi()) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 32:
                    this.zzZ59.zzQ(4146, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(this.zzZ7n.zzQ(zzyo3ZzZqn))));
                    break;
                case 33:
                    this.zzZ59.zzQ(4143, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(this.zzZ7n.zzQ(zzyo3ZzZqn))));
                    break;
                case 34:
                    this.zzZ59.zzQ(4145, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(this.zzZ7n.zzQ(zzyo3ZzZqn))));
                    break;
                case 35:
                    this.zzZ59.zzQ(4144, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(this.zzZ7n.zzQ(zzyo3ZzZqn))));
                    break;
                default:
                    zzYU4 zzyu4 = this.zzZ7n;
                    zzyu4.zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
                    break;
            }
        }
    }

    private void zzZCl() {
        String localName = this.zzZ7n.getLocalName();
        while (this.zzZ7n.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 20) {
                zzZCg();
            } else if (iZzTP != 21) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                zzZCe();
            }
        }
    }

    private void zzZCm() {
        while (this.zzZ7n.zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 30) {
                zzZCl();
            } else if (iZzTP != 31) {
                this.zzZ7n.getLocalName();
                this.zzZ7n.zzk();
            } else {
                this.zzZ7n.zzk();
            }
        }
    }

    public final ShapeBase zzt(zzZXT zzzxt) throws Exception {
        this.zzZ5a = zzzxt;
        this.zzZ7n = zzzxt.zzZsD();
        this.zzZ59 = new zzYC3();
        this.zzZ7Z = null;
        while (this.zzZ7n.zzQ("drawing")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 0) {
                zzIW(3);
            } else if (iZzTP != 1) {
                this.zzZ7n.zzk();
            } else {
                zzIW(0);
            }
        }
        ShapeBase shapeBase = this.zzZ7Z;
        if (shapeBase != null) {
            this.zzZ59.zzZ((zzZS) shapeBase.zzYvW(), false);
            if (this.zzZ59.contains(4154)) {
                this.zzZ5a.zzb(this.zzZ7Z);
            }
        }
        return this.zzZ7Z;
    }
}
