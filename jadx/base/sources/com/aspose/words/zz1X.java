package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zz1X {
    private zzGR zzYYK = zzZuF();
    private zz1K zzYYL;
    private zz53 zzYYM;
    private ShapeBase zzYYN;

    public static class zzZ implements zzZCG {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZCG
        public final zz7X zzZMY() {
            return null;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private zz1X(ShapeBase shapeBase) {
        this.zzYYN = shapeBase;
        this.zzYYM = shapeBase.zzY9i();
        this.zzYYL = ((zzZC0) shapeBase.zzY9i()).zzZTj();
    }

    private static boolean zzGX(int i) {
        if (i == 106) {
            return true;
        }
        switch (i) {
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                return true;
            default:
                switch (i) {
                    case 61:
                    case 62:
                    case 63:
                        return true;
                    default:
                        switch (i) {
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    public static void zzM(ShapeBase shapeBase) throws Exception {
        int iZzZHY = shapeBase.zzY9i().zzZHY();
        if (iZzZHY == 0 || iZzZHY == 2 || iZzZHY == 8) {
            new zz1X(shapeBase).zzZ(shapeBase.zzYvW());
        }
    }

    private void zzY(zzYC3 zzyc3, zz2J zz2j) throws Exception {
        zz1K zz1k = this.zzYYL;
        if (zz1k != null) {
            zz4G zz4gZzR = zz1k.zzR(this.zzYYK);
            if (zz4gZzR.zzZxz() > 0) {
                zzZ(zzyc3, zz4gZzR);
            } else {
                zzyc3.zzP(508, Boolean.FALSE);
            }
        }
        if (zz2j.getOutline().zzZxz() > 0) {
            zzZ(zzyc3, zz2j.getOutline());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzYC3 zzyc3) throws Exception {
        if (zzyc3.getWrapType() == 0) {
            zzyc3.zzQ(4099, Boolean.TRUE);
        }
        zz2J zz2j = (zz2J) this.zzYYM;
        int iZzZHY = this.zzYYN.zzY9i().zzZHY();
        if (iZzZHY == 0) {
            zz2O zz2o = (zz2O) zz2j;
            zz0J zz0jZzZAk = zz2o.zzZAk();
            if (zz0jZzZAk != null) {
                zz10 zz10VarZzZtK = zz0jZzZAk.zzZCZ().zzZtK();
                if (zzyc3.get(138) == null) {
                    zzyc3.zzO(133, Integer.valueOf(zz10VarZzZtK.zzZts()));
                } else {
                    zzyc3.zzQ(133, Integer.valueOf(zz10VarZzZtK.zzZts()));
                }
                zzyc3.zzQ(135, Integer.valueOf(zzZZZ.zzGy(zz10VarZzZtK.zzMg())));
                zzyc3.zzO(136, Integer.valueOf(zzZZZ.zz8(zz10VarZzZtK.zzZtu(), zz2o.zzZyd())));
                zzyc3.zzQ(189, Boolean.valueOf(zz10VarZzZtK.zzZtv()));
                if (zz2j.zzZyd()) {
                    zzyc3.zzQ(136, 4);
                }
                zzyc3.zzO(129, Integer.valueOf(zz10VarZzZtK.zzZtD()));
                zzyc3.zzO(130, Integer.valueOf(zz10VarZzZtK.zzZtF()));
                zzyc3.zzO(131, Integer.valueOf(zz10VarZzZtK.zzZtE()));
                zzyc3.zzO(132, Integer.valueOf(zz10VarZzZtK.zzZtG()));
                if (((zz2K) com.aspose.words.internal.zzZKW.zzZ(zz10VarZzZtK.zzZtH(), zz2K.class)) != null) {
                    zzyc3.zzQ(190, Boolean.TRUE);
                }
            }
            zzZ(zzyc3, zz2j);
        } else if (iZzZHY == 2) {
            zzyc3.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 75);
            zz3V zz3v = (zz3V) this.zzYYM;
            if (zz3v.zzZwy() != null) {
                zzZ(zzyc3, (zz7X) zz3v.zzZwy(), true);
            }
        } else if (iZzZHY == 8) {
        }
        if (zz2j.zzZTg() != 255) {
            zzyc3.zzO(772, Integer.valueOf(zz2j.zzZTg()));
        }
        zzY(zzyc3, zz2j);
        zzZ(zzyc3, zz2j.zzZTh());
        zzZ(zzyc3, zz2j.getFill(), false);
    }

    private zzGR zzZuF() {
        return new zzGR(new zzZ((byte) 0), new zz34(this.zzYYN.getDocument(), null), this.zzYYL);
    }

    private void zzZ(zzYC3 zzyc3, zz2J zz2j) {
        if (zz2j.getShadowEnabled()) {
            for (zz2F zz2f : zz2j.zzZTe()) {
                if (zz2f.zzZvh() == 6) {
                    zzZ(zzyc3, zz2f);
                }
            }
        }
    }

    private void zzZ(zzYC3 zzyc3, zz2F zz2f) {
        zz21 zz21Var = (zz21) zz2f;
        zzyc3.zzO(574, Boolean.TRUE);
        zzyc3.zzO(512, 2);
        com.aspose.words.internal.zzPV zzpvZzZ = zz21Var.zzZQX().zzZ(this.zzYYN.getDocument().zzZqI(), (zzZCM) null);
        zzyc3.zzO(516, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(((double) zzpvZzZ.zzPD()) / 255.0d)));
        zzyc3.zzO(InputDeviceCompat.SOURCE_DPAD, new com.aspose.words.internal.zzPV(255, zzpvZzZ));
        zzyc3.zzO(517, Integer.valueOf((int) (Math.cos(zz21Var.zzZuM().zzZQR()) * zz21Var.zzZuL())));
        zzyc3.zzO(518, Integer.valueOf((int) (Math.sin(zz21Var.zzZuM().zzZQR()) * zz21Var.zzZuL())));
        zzyc3.zzO(521, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zz21Var.zzZuH())));
        zzyc3.zzO(524, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zz21Var.zzZuG())));
        zzyc3.zzO(523, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(Math.tan(zz21Var.zzZuI().zzZQR()))));
        zzyc3.zzO(522, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(Math.tan(zz21Var.zzZuJ().zzZQR()))));
        long jZzGw = zzZZZ.zzGw(zz21Var.getAlignment());
        zzyc3.zzO(528, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(Float.intBitsToFloat((int) jZzGw))));
        zzyc3.zzO(529, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(com.aspose.words.internal.zzZPY.zzYC(jZzGw))));
        zzyc3.zzO(525, 0);
        zzyc3.zzO(526, 0);
    }

    private void zzZ(zzYC3 zzyc3, zz4G zz4g) {
        zzyc3.zzQ(508, Boolean.TRUE);
        if (zz4g.zzZxy()) {
            zzyc3.zzQ(459, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz4g.zzZxH())));
        }
        if (zz4g.zzZxD().zzZEW() == 1) {
            zzyc3.zzO(462, Integer.valueOf(((zz3G) zz4g.zzZxD()).zzZwm()));
        }
        zzyc3.zzO(461, Integer.valueOf(zz4g.zzZxF()));
        zzyc3.zzO(505, Boolean.valueOf(zz4g.zzZxE()));
        zzyc3.zzO(471, Integer.valueOf(zz4g.zzOz()));
        if (zz4g.zzZxx() && (zz4g.zzZxC() != 1 || !com.aspose.words.internal.zzAN.zzL(zz4g.zzZxG(), 8.0d))) {
            zzyc3.zzQ(470, Integer.valueOf(zz4g.zzZxC()));
        }
        zz6T zz6tZzZxB = zz4g.zzZxB();
        zz12 zz12VarZzZxA = zz4g.zzZxA();
        if (zzGX(this.zzYYM.getShapeType())) {
            zzyc3.zzO(464, Integer.valueOf(zz12VarZzZxA.getType()));
            zzyc3.zzO(467, Integer.valueOf(zz12VarZzZxA.getLength()));
            zzyc3.zzO(466, Integer.valueOf(zz12VarZzZxA.getWidth()));
            zzyc3.zzO(465, Integer.valueOf(zz6tZzZxB.getType()));
            zzyc3.zzO(469, Integer.valueOf(zz6tZzZxB.getLength()));
            zzyc3.zzO(468, Integer.valueOf(zz6tZzZxB.getWidth()));
        } else {
            zzyc3.zzO(464, Integer.valueOf(zz6tZzZxB.getType()));
            zzyc3.zzO(467, Integer.valueOf(zz6tZzZxB.getLength()));
            zzyc3.zzO(466, Integer.valueOf(zz6tZzZxB.getWidth()));
            zzyc3.zzO(465, Integer.valueOf(zz12VarZzZxA.getType()));
            zzyc3.zzO(469, Integer.valueOf(zz12VarZzZxA.getLength()));
            zzyc3.zzO(468, Integer.valueOf(zz12VarZzZxA.getWidth()));
        }
        int iZzl = com.aspose.words.internal.zzSA.zzl(zz4g.zzZxG());
        if (iZzl > 0) {
            zzyc3.zzQ(460, Integer.valueOf(iZzl));
        }
        zzZ(zzyc3, (zz7X) zz4g.zzLu(9));
    }

    private void zzZ(zzYC3 zzyc3, zz7X zz7x) {
        zz1C zz1c = (zz1C) com.aspose.words.internal.zzZKW.zzZ(zz7x, zz1C.class);
        if (zz1c != null) {
            zzZ(zzyc3, zz1c, true);
            com.aspose.words.internal.zzPV zzpvZzZ = zz1c.zzZQX().zzZ(this.zzYYN.getDocument().zzZqI(), (zzZCM) null);
            if (this.zzYYM.zzZHY() != 2 || com.aspose.words.internal.zzPV.zzZ(zzpvZzZ, com.aspose.words.internal.zzPV.zzX(255, 255, 255, 255))) {
                return;
            }
            Border border = new Border(1, 6, zzpvZzZ);
            zzyc3.zzQ(4107, border);
            zzyc3.zzQ(4109, border);
            zzyc3.zzQ(EditingLanguage.SPANISH_GUATEMALA, border);
            zzyc3.zzQ(EditingLanguage.FRENCH_SWITZERLAND, border);
            zzyc3.remove(508);
        }
        if (((zz54) com.aspose.words.internal.zzZKW.zzZ(zz7x, zz54.class)) != null) {
            zzyc3.zzP(508, Boolean.FALSE);
        }
    }

    private void zzZ(zzYC3 zzyc3, zz7X zz7x, boolean z) throws Exception {
        zz1K zz1k;
        while (true) {
            int iZzZQ4 = zz7x.zzZQ4();
            if (iZzZQ4 == 0) {
                zzZ(zzyc3, (zzH0) zz7x, z);
                return;
            }
            if (iZzZQ4 == 1) {
                zzZ(zzyc3, (zz7C) zz7x);
                return;
            }
            if (iZzZQ4 == 3) {
                zzyc3.zzO(443, Boolean.FALSE);
                return;
            }
            if (iZzZQ4 == 4) {
                zzZ(zzyc3, (zz41) zz7x);
                return;
            }
            if (iZzZQ4 == 5) {
                zzZ(zzyc3, (zz1C) zz7x, false);
                return;
            } else {
                if (iZzZQ4 != 6 || (zz1k = this.zzYYL) == null) {
                    return;
                }
                zz7x = zz1k.zzW(this.zzYYK);
                if (zz7x.zzZQ4() == 3) {
                    return;
                } else {
                    z = false;
                }
            }
        }
    }

    private void zzZ(zzYC3 zzyc3, zz1C zz1c, boolean z) {
        com.aspose.words.internal.zzPV zzpvZzZ = zz1c.zzZQX().zzZ(this.zzYYN.getDocument().zzZqI(), (zzZCM) null);
        if (z) {
            zzyc3.zzO(452, 0);
            zzyc3.zzO(448, zzpvZzZ);
            zzZ(449, zzpvZzZ.zzPD(), zzyc3);
        } else {
            zzyc3.zzO(384, 0);
            zzyc3.zzO(385, zzpvZzZ);
            zzZ(386, zzpvZzZ.zzPD(), zzyc3);
        }
    }

    private static void zzZ(int i, int i2, zzYC3 zzyc3) {
        if (i2 < 255) {
            zzyc3.zzO(i, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(((double) i2) / 255.0d)));
        }
    }

    private static void zzZ(zzYC3 zzyc3, zzH0 zzh0, boolean z) {
        zzH1 zzh1ZzZQ1 = zzh0.zzZQ1();
        if (zzh1ZzZQ1.zzZQa() != null) {
            zzyc3.zzO(z ? 4102 : 4110, zzh1ZzZQ1.zzZQa());
        }
        if (!z) {
            zzyc3.zzQ(441, Boolean.TRUE);
            zzyc3.zzQ(384, Integer.valueOf(zzh0.zzZPY().getFillType()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzh1ZzZQ1.zzZQ9())) {
            zzyc3.zzO(4104, zzh1ZzZQ1.zzZQ9());
        }
        zzyc3.zzO(442, Boolean.valueOf(!z && zzh0.zzZQ5()));
        zz3Z zz3zZzZPZ = zzh0.zzZPZ();
        zzyc3.zzO(StyleIdentifier.COLORFUL_LIST_ACCENT_6, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zz3zZzZPZ.zzZwF())));
        zzyc3.zzO(256, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zz3zZzZPZ.zzZwG())));
        zzyc3.zzO(StyleIdentifier.COLORFUL_GRID_ACCENT_6, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zz3zZzZPZ.zzZwE())));
        zzyc3.zzO(257, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(zz3zZzZPZ.zzZwH())));
        if (zzh1ZzZQ1.zzZQ7().size() > 0) {
            for (zz8E zz8e : zzh1ZzZQ1.zzZQ7()) {
                int type = zz8e.getType();
                if (type == 7) {
                    zzyc3.zzO(StyleIdentifier.GRID_TABLE_4_ACCENT_6, Boolean.TRUE);
                } else if (type == 13) {
                    zzyc3.zzO(StyleIdentifier.GRID_TABLE_3_ACCENT_6, Boolean.TRUE);
                } else if (type == 15) {
                    zz5E zz5e = (zz5E) zz8e;
                    double brightness = zz5e.getBrightness();
                    double contrast = zz5e.getContrast();
                    double dZzWQ = ImageData.zzWQ(brightness);
                    double dZzWO = ImageData.zzWO(contrast);
                    zzyc3.zzO(StyleIdentifier.BIBLIOGRAPHY, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dZzWQ)));
                    zzyc3.zzO(StyleIdentifier.BOOK_TITLE, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(dZzWO)));
                }
            }
        }
        zzGZ zzgz = (zzGZ) com.aspose.words.internal.zzZKW.zzZ(zzh0.zzZPY(), zzGZ.class);
        if (zzgz != null) {
            zzyc3.zzO(446, Boolean.TRUE);
            zz3Z zz3zZzZPV = zzgz.zzZPV();
            zzyc3.zzO(401, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZPV.zzZwF())));
            zzyc3.zzO(402, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZPV.zzZwG())));
            zzyc3.zzO(403, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZPV.zzZwE())));
            zzyc3.zzO(404, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZPV.zzZwH())));
        }
    }

    private void zzZ(zzYC3 zzyc3, zz7C zz7c) throws Exception {
        zzyc3.zzO(396, 100);
        zzyc3.zzO(407, zzZZZ.zzY(zz7c.zzZAA(), this.zzYYN.getDocument().zzZqI()));
        zzyc3.zzO(442, Boolean.valueOf(zz7c.zzZQ5()));
        com.aspose.words.internal.zzPV zzpvZzY = zz7c.zzY(this.zzYYK);
        zzyc3.zzO(385, zzpvZzY);
        zzZ(386, zzpvZzY.zzPD(), zzyc3);
        zz44 zz44Var = (zz44) com.aspose.words.internal.zzZKW.zzZ(zz7c.zzZAz(), zz44.class);
        if (zz44Var != null) {
            zzyc3.zzO(384, Integer.valueOf(zz44Var.zzZwY()));
            zz3Z zz3zZzZwW = zz44Var.zzZwW();
            zzyc3.zzO(397, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZwW.zzZwF())));
            zzyc3.zzO(398, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZwW.zzZwG())));
            zzyc3.zzO(400, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZwW.zzZwH())));
            zzyc3.zzO(399, Integer.valueOf(com.aspose.words.internal.zzAN.zzZG(zz3zZzZwW.zzZwE())));
        }
        zz5S zz5s = (zz5S) com.aspose.words.internal.zzZKW.zzZ(zz7c.zzZAz(), zz5S.class);
        if (zz5s != null) {
            int iZzZJ = (int) com.aspose.words.internal.zzAN.zzZJ((360.0d - zz5s.zzZyG().zzZQQ()) + 90.0d);
            if (iZzZJ != 360) {
                zzyc3.zzO(395, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(iZzZJ)));
            }
            zzyc3.zzO(384, Integer.valueOf(zz5s.zzZRC() ? 7 : 10));
        }
    }

    private void zzZ(zzYC3 zzyc3, zz41 zz41Var) {
        zzyc3.zzO(384, 1);
        zzyc3.zzO(385, zz41Var.zzZwJ().zzZ(this.zzYYN.getDocument().zzZqI(), (zzZCM) null));
        zzyc3.zzO(387, zz41Var.zzZwK().zzZ(this.zzYYN.getDocument().zzZqI(), (zzZCM) null));
    }

    private static void zzZ(zzYC3 zzyc3, zz07 zz07Var) {
        zzyc3.zzO(4096, Integer.valueOf(zz07Var.getFlipOrientation()));
        int iZzL = zz00.zzL(zz07Var.zzZCC());
        if (zz07Var.getFlipOrientation() == 1) {
            iZzL = com.aspose.words.internal.zzAN.zzZG(((int) com.aspose.words.internal.zzAN.zzZJ(360.0d - zz07Var.zzZCC().zzZQQ())) * 65536);
        }
        zzyc3.zzO(4, Integer.valueOf(iZzL));
        zzyc3.zzO(StyleIdentifier.SUBTLE_EMPHASIS, Double.valueOf(zz07Var.getWidth()));
        zzyc3.zzO(StyleIdentifier.INTENSE_EMPHASIS, Double.valueOf(zz07Var.getHeight()));
    }
}
