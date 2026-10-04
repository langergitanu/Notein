package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY47 {
    private int zzX0W;
    private float[] zzX0X = new float[2];
    private float zzX0Y;
    private float zzX0Z;
    private int zzX10;

    public zzY47(zzZ6H zzz6h) {
        this.zzX10 = zzz6h.getFont().getUnderline();
    }

    private static float zzY(com.aspose.words.internal.zzZVX zzzvx, int i, boolean z) {
        if (z) {
            return zzzvx.zznJ();
        }
        if (i != 1 && i != 2 && i != 4) {
            if (i != 20 && i != 23) {
                if (i != 39) {
                    if (i != 55 && i != 6) {
                        if (i != 7) {
                            switch (i) {
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (i) {
                                        case 25:
                                        case 26:
                                            break;
                                        case 27:
                                            break;
                                        default:
                                            throw new IllegalStateException("Unexpected underline type.");
                                    }
                                case 11:
                                    return zzzvx.zznH();
                            }
                        }
                    }
                }
            }
            return zzzvx.zznI();
        }
        return zzzvx.zznJ();
    }

    private static float zzZ(com.aspose.words.internal.zzZVX zzzvx, int i, boolean z) {
        if (z) {
            return zzzvx.zznJ();
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                return zzzvx.zznM();
            }
            if (i != 4) {
                if (i != 6) {
                    if (i != 7) {
                        if (i != 20 && i != 23) {
                            if (i != 39) {
                                if (i == 43) {
                                    return zzzvx.zznK();
                                }
                                if (i != 55) {
                                    switch (i) {
                                        case 9:
                                        case 10:
                                            break;
                                        default:
                                            switch (i) {
                                                case 25:
                                                case 26:
                                                    break;
                                                case 27:
                                                    break;
                                                default:
                                                    throw new IllegalStateException("Unexpected underline type.");
                                            }
                                        case 11:
                                            return zzzvx.zznL();
                                    }
                                }
                            }
                        }
                    }
                }
                return zzzvx.zznN();
            }
        }
        return zzzvx.zznO();
    }

    public final void zzA(zzZ6H zzz6h) throws Exception {
        if (!zzz6h.getFont().getHidden() && zzz6h.getFont().getUnderline() != this.zzX10) {
            throw new IllegalArgumentException("Wrong underline type.\r\nParameter name: span");
        }
        int length = zzz6h.getText() == null ? 1 : zzz6h.getText().length();
        com.aspose.words.internal.zzPM zzpmZzZr = zzz6h.zz14().zzY6N().zzZr();
        float fZzZ7i = zzz6h.getFont().zzZ7i();
        if (fZzZ7i != zzpmZzZr.zzPg()) {
            zzpmZzZr = zzpmZzZr.zzP(fZzZ7i);
        }
        com.aspose.words.internal.zzZVX zzzvxZzOX = zzpmZzZr.zzOX();
        int underline = zzz6h.getFont().getUnderline();
        boolean hidden = zzz6h.getFont().getHidden();
        float f = length;
        this.zzX0Z = (zzZ(zzzvxZzOX, underline, hidden) * f) + this.zzX0Z;
        if (zzY4A.zzjr(zzz6h.getFont().getUnderline())) {
            float[] fArrZzZ = zzZ(zzzvxZzOX, underline);
            float[] fArr = this.zzX0X;
            fArr[0] = (fArrZzZ[0] * f) + fArr[0];
            fArr[1] = (fArrZzZ[1] * f) + fArr[1];
        } else {
            this.zzX0Y = (zzY(zzzvxZzOX, underline, hidden) * f) + this.zzX0Y;
        }
        this.zzX0W += length;
    }

    public final float[] zzXUe() {
        float[] fArr = this.zzX0X;
        float[] fArr2 = new float[fArr.length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        float f = fArr2[0];
        int i = this.zzX0W;
        fArr2[0] = f / i;
        fArr2[1] = fArr2[1] / i;
        return fArr2;
    }

    public final float zzXUf() {
        return this.zzX0Y / this.zzX0W;
    }

    public final float zzXUg() {
        return this.zzX0Z / this.zzX0W;
    }

    private static float[] zzZ(com.aspose.words.internal.zzZVX zzzvx, int i) {
        if (i == 3) {
            return zzzvx.zznG();
        }
        if (i == 43) {
            return zzzvx.zznF();
        }
        throw new IllegalStateException("Unexpected underline type.");
    }
}
