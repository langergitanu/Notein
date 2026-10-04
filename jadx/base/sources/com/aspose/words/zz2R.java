package com.aspose.words;

import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zz2R extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("backdrop", "camera", "lightRig", "extLst", "z", "extrusionH", "contourW", "prstMaterial", "bevelT", "bevelB", "extrusionClr", "contourClr", "dir", "rig", "rot", "fov", "prst", "zoom", "anchor", "norm", "up");
    private zzYU4 zzZ7n;
    private zzYO3 zzZ88;
    private zzZXT zzZfi;

    private zz2R(zzZXT zzzxt, zzYO3 zzyo3) {
        this.zzZfi = zzzxt;
        this.zzZ7n = zzzxt.zzZsD();
        this.zzZ88 = zzyo3;
    }

    public static zz2N zzW(zzZXT zzzxt, zzYO3 zzyo3) throws Exception {
        return zzY(zzzxt, false, zzyo3);
    }

    public static zz2S zzX(zzZXT zzzxt, zzYO3 zzyo3) throws Exception {
        return zzZ(zzzxt, false, zzyo3);
    }

    public static zz2N zzY(zzZXT zzzxt, boolean z, zzYO3 zzyo3) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz2R zz2r = new zz2R(zzzxt, zzyo3);
        String localName = zzyu4ZzZsD.getLocalName();
        zz2N zz2n = new zz2N(z);
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 4) {
                zz2n.zz9(zzyu4ZzZsD.zzQ(zzyo3));
            } else if (iZzTP == 5) {
                zz2n.zzXs(zzyu4ZzZsD.zz9());
            } else if (iZzTP == 6) {
                zz2n.zzXt(zzyu4ZzZsD.zz9());
            } else if (iZzTP != 7) {
                zz39.zzI(zzyu4ZzZsD);
            } else {
                zz2n.zzH3(zz84.zzOO(zzyu4ZzZsD.getValue()));
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP2 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP2 != 3) {
                switch (iZzTP2) {
                    case 8:
                        zz2n.zzZ(zz2r.zzZvA());
                        break;
                    case 9:
                        zz2n.zzY(zz2r.zzZvA());
                        break;
                    case 10:
                        while (zzyu4ZzZsD.zzQ("extrusionClr")) {
                            zzBW zzbwZzW = zzBR.zzW(zzyu4ZzZsD, zzyo3);
                            if (zz2n.zzZvp() == null && zzbwZzW != null) {
                                zz2n.zzJ(zzbwZzW);
                            }
                        }
                        break;
                    case 11:
                        while (zzyu4ZzZsD.zzQ("contourClr")) {
                            zzBW zzbwZzW2 = zzBR.zzW(zzyu4ZzZsD, zzyo3);
                            if (zz2n.zzZvq() == null && zzbwZzW2 != null) {
                                zz2n.zzK(zzbwZzW2);
                            }
                        }
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zz2n.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return zz2n;
    }

    public static zz2S zzZ(zzZXT zzzxt, boolean z, zzYO3 zzyo3) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz2R zz2r = new zz2R(zzzxt, zzyo3);
        zz2S zz2s = new zz2S(z);
        while (zzyu4ZzZsD.zzQ("scene3d")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zz2s.zzZ(zz2r.zzZvB());
            } else if (iZzTP == 1) {
                zz2r.zzY(zz2s.zzZvF());
            } else if (iZzTP == 2) {
                zz2r.zzY(zz2s.zzZvE());
            } else if (iZzTP != 3) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zz2s.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return zz2s;
    }

    private zzH4 zzZvA() {
        zzH4 zzh4 = new zzH4();
        zzh4.setWidth(this.zzZ7n.zzZ("w", 76200.0d));
        zzh4.setHeight(this.zzZ7n.zzZ(C18773h.f57233c, 76200.0d));
        zzh4.zzLE(zz84.zzON(this.zzZ7n.zzV("prst", "")));
        return zzh4;
    }

    private zzHA zzZvB() throws Exception {
        zzHA zzha = new zzHA();
        while (this.zzZ7n.zzQ("backdrop")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP != 3) {
                switch (iZzTP) {
                    case 18:
                        zzha.zzZ(zzZvy());
                        break;
                    case 19:
                        zzha.zzY(zzZvx());
                        break;
                    case 20:
                        zzha.zzX(zzZvx());
                        break;
                    default:
                        zz39.zzK(this.zzZ7n);
                        break;
                }
            } else {
                zzha.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        return zzha;
    }

    private zz3L zzZvx() {
        zz3L zz3l = new zz3L();
        zz3l.zzW(this.zzZ7n.zzS("dx", this.zzZ88));
        zz3l.zzV(this.zzZ7n.zzS("dy", this.zzZ88));
        zz3l.zz9(this.zzZ7n.zzS("dz", this.zzZ88));
        return zz3l;
    }

    private zz3L zzZvy() {
        zz3L zz3l = new zz3L();
        zz3l.zzW(this.zzZ7n.zzS("x", this.zzZ88));
        zz3l.zzV(this.zzZ7n.zzS("y", this.zzZ88));
        zz3l.zz9(this.zzZ7n.zzS("z", this.zzZ88));
        return zz3l;
    }

    private zz33 zzZvz() {
        zz33 zz33Var = new zz33();
        zz33Var.zzT(new zzHK(this.zzZ7n.zzZ("lat", 0.0d)));
        zz33Var.zzS(new zzHK(this.zzZ7n.zzZ("lon", 0.0d)));
        zz33Var.zzR(new zzHK(this.zzZ7n.zzZ("rev", 0.0d)));
        return zz33Var;
    }

    private void zzY(zz5Z zz5z) {
        while (this.zzZ7n.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 12) {
                zz5z.setDirection(zz84.zzOP(this.zzZ7n.getValue()));
            } else if (iZzTP != 13) {
                zz39.zzI(this.zzZ7n);
            } else {
                zz5z.zzHR(zz84.zzOQ(this.zzZ7n.getValue()));
            }
        }
        this.zzZ7n.zzj();
        while (this.zzZ7n.zzQ("lightRig")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 14) {
                zz39.zzK(this.zzZ7n);
            } else {
                zz5z.zzZ(zzZvz());
            }
        }
    }

    private void zzY(zzGO zzgo) {
        while (this.zzZ7n.zzi()) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 15:
                    zzgo.zzY(new zzHK(this.zzZ7n.zz9()));
                    break;
                case 16:
                    zzgo.zzLA(zz84.zzOR(this.zzZ7n.getValue()));
                    break;
                case 17:
                    zzgo.zzYH(zz3W.zzZ(this.zzZ7n.getValue(), this.zzZ88));
                    break;
                default:
                    zz39.zzI(this.zzZ7n);
                    break;
            }
        }
        this.zzZ7n.zzj();
        while (this.zzZ7n.zzQ("camera")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 14) {
                zz39.zzK(this.zzZ7n);
            } else {
                zzgo.zzZ(zzZvz());
            }
        }
    }
}
