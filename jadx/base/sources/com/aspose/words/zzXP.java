package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXP {
    private static boolean zzK(double d, double d2, double d3) {
        double d4 = d - d3;
        double d5 = d2 - d3;
        if (d4 != 0.0d && d5 != 0.0d) {
            if (d4 > 0.0d && d5 < 0.0d) {
                return true;
            }
            if ((d5 <= 0.0d || d4 >= 0.0d) && d4 < d5) {
                return true;
            }
        }
        return false;
    }

    private static zzXR[] zzU(com.aspose.words.internal.zz0M zz0m) {
        int count = zz0m.getCount();
        zzXR[] zzxrArr = new zzXR[count];
        for (int i = 0; i < count; i++) {
            zzxrArr[i] = zzX(zz0m.get(i));
        }
        return zzxrArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzXR zzX(zzXR zzxr, int i, int i2, int i3, int i4) {
        char c;
        double dZzz;
        boolean zZzK;
        boolean zZzK2;
        boolean zZzK3;
        boolean z;
        zzxr.zz7H();
        long[] jArrZz7E = zzxr.zz7E();
        if (jArrZz7E.length == 0) {
            return zzxr;
        }
        com.aspose.words.internal.zz0P zz0p = new com.aspose.words.internal.zz0P();
        int length = jArrZz7E.length;
        int i5 = 0;
        while (i5 < length) {
            long j = jArrZz7E[i5];
            int i6 = i5 + 1;
            long j2 = jArrZz7E[i6 % length];
            if (length > 1) {
                int i7 = (int) j;
                int i8 = (int) j2;
                int i9 = (int) (j >> 32);
                int i10 = i5;
                int i11 = (int) (j2 >> 32);
                c = ' ';
                dZzz = zzz(i7 - i8, i9 - i11);
                if (length != 2) {
                    long j3 = jArrZz7E[(i10 + 2) % length];
                    double dZzz2 = length > 2 ? zzz(((int) j3) - i8, ((int) (j3 >> 32)) - i11) : zzz(i8 - i7, i11 - i9);
                    zZzK3 = zzK(dZzz, dZzz2, 180.0d);
                    boolean zZzK4 = zzK(dZzz, dZzz2, 90.0d);
                    zZzK = zzK(dZzz, dZzz2, 0.0d);
                    zZzK2 = zzK(dZzz, dZzz2, 270.0d);
                    z = zZzK4;
                } else if (i7 == i8) {
                    boolean z2 = i11 < i9;
                    z = z2;
                    zZzK2 = !z2;
                    zZzK = true;
                    zZzK3 = true;
                } else {
                    if (i9 == i11) {
                        boolean z3 = i8 < i7;
                        zZzK = !z3;
                        zZzK3 = z3;
                        zZzK2 = true;
                    }
                    z = true;
                }
                if (zZzK3) {
                    if (z) {
                        if (zZzK) {
                            if (zZzK2) {
                                int i12 = ((int) j2) + i3;
                                int i13 = (int) (j2 >> c);
                                zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i12, i13 - i2));
                                zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i12, i13 + i4));
                            } else {
                                zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) + i3, ((int) (j2 >> c)) - i2));
                            }
                        } else {
                            if (zZzK2) {
                                throw new IllegalStateException();
                            }
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm((int) j2, ((int) (j2 >> c)) - i2));
                        }
                    } else if (zZzK) {
                        if (zZzK2) {
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) + i3, ((int) (j2 >> c)) + i4));
                        } else {
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) + i3, (int) (j2 >> c)));
                        }
                    } else if (zZzK2) {
                        zz0p.add(com.aspose.words.internal.zzZPZ.zzZm((int) j2, ((int) (j2 >> c)) + i4));
                    } else {
                        zz0p.add(j2);
                    }
                } else if (z) {
                    if (zZzK) {
                        if (!zZzK2) {
                            int i14 = (int) j2;
                            int i15 = ((int) (j2 >> c)) - i2;
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i14 - i, i15));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i14 + i3, i15));
                        } else if (dZzz < 90.0d) {
                            int i16 = (int) j2;
                            int i17 = (int) (j2 >> c);
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i16 + i3, i17));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i16, i17 + i4));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i16 - i, i17));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i16, i17 - i2));
                        } else if (dZzz < 180.0d) {
                            int i18 = (int) j2;
                            int i19 = (int) (j2 >> c);
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i18, i19 - i2));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i18 + i3, i19));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i18, i19 + i4));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i18 - i, i19));
                        } else if (dZzz < 270.0d) {
                            int i20 = (int) j2;
                            int i21 = (int) (j2 >> c);
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i20 - i, i21));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i20, i21 - i2));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i20 + i3, i21));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i20, i21 + i4));
                        } else {
                            int i22 = (int) j2;
                            int i23 = (int) (j2 >> c);
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i22, i23 + i4));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i22 - i, i23));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i22, i23 - i2));
                            zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i22 + i3, i23));
                        }
                    } else if (zZzK2) {
                        int i24 = ((int) j2) - i;
                        int i25 = (int) (j2 >> c);
                        zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i24, i25 + i4));
                        zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i24, i25 - i2));
                    } else {
                        zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) - i, ((int) (j2 >> c)) - i2));
                    }
                } else if (zZzK) {
                    if (!zZzK2) {
                        throw new IllegalStateException();
                    }
                    int i26 = (int) j2;
                    int i27 = ((int) (j2 >> c)) + i4;
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i26 + i3, i27));
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i26 - i, i27));
                } else if (zZzK2) {
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) - i, ((int) (j2 >> c)) + i4));
                } else {
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) - i, (int) (j2 >> c)));
                }
                i5 = i6;
            } else {
                c = ' ';
                dZzz = 0.0d;
            }
            zZzK = true;
            zZzK2 = true;
            zZzK3 = true;
            z = true;
            if (zZzK3) {
            }
            i5 = i6;
        }
        return new zzXR(zz0p);
    }

    private static zzXR zzY(zzXR zzxr, int i, int i2, int i3, int i4) {
        zzxr.zz7E();
        zzXR zzxrZzYB = zzxr.zzYB(0, 0);
        if (i > 0) {
            zzxrZzYB = zzZ(zzxrZzYB, -i, true);
        }
        if (i3 > 0) {
            zzxrZzYB = zzZ(zzxrZzYB, i3, true);
        }
        if (i2 > 0) {
            zzxrZzYB = zzZ(zzxrZzYB, -i2, false);
        }
        return i4 > 0 ? zzZ(zzxrZzYB, i4, false) : zzxrZzYB;
    }

    public static zzXR[] zzZ(zzXR zzxr, zzXR zzxr2) {
        com.aspose.words.internal.zzD9 zzd9ZzX = zzX(zzxr);
        com.aspose.words.internal.zzD9 zzd9ZzX2 = zzX(zzxr2);
        com.aspose.words.internal.zz0M zz0m = new com.aspose.words.internal.zz0M();
        com.aspose.words.internal.zzTK zztk = new com.aspose.words.internal.zzTK();
        zztk.zzZ(zzd9ZzX, 0, true);
        zztk.zzZ(zzd9ZzX2, 1, true);
        zztk.zzZ(0, zz0m, 0);
        if (zz0m.getCount() <= 0) {
            return null;
        }
        return zzU(zz0m);
    }

    private static double zzz(double d, double d2) {
        if (d2 == 0.0d) {
            return d > 0.0d ? 0 : 180;
        }
        if (d == 0.0d) {
            return d2 > 0.0d ? 270 : 90;
        }
        double dSqrt = Math.sqrt(1.0d / (((d * d) / (d2 * d2)) + 1.0d)) * 90.0d;
        return d > 0.0d ? d2 < 0.0d ? dSqrt : 360.0d - dSqrt : d2 < 0.0d ? 180.0d - dSqrt : dSqrt + 180.0d;
    }

    public static boolean zzY(zzXR zzxr, zzXR zzxr2) {
        return zzZ(zzxr, zzxr2) != null;
    }

    public static zzXR zzZ(zzXR zzxr, int i, int i2, int i3, int i4) {
        if (zzxr.zz7H() < 3) {
            return zzX(zzxr, i, i2, i3, i4);
        }
        return zzY(zzxr, i, i2, i3, i4);
    }

    private static zzXR zzZ(zzXR zzxr, int i, boolean z) {
        if (i == 0) {
            return zzxr;
        }
        char c = z ? i >= 0 ? 'r' : 'l' : i >= 0 ? 'b' : 't';
        long[] jArrZz7E = zzxr.zz7E();
        com.aspose.words.internal.zz0P zz0p = new com.aspose.words.internal.zz0P();
        int i2 = 0;
        while (i2 < jArrZz7E.length) {
            long j = jArrZz7E[i2];
            i2++;
            long j2 = jArrZz7E[i2 % jArrZz7E.length];
            if (!zzZ(j, j2, c)) {
                zz0p.add(com.aspose.words.internal.zzZPZ.zzZm((int) j, (int) (j >> 32)));
                zz0p.add(com.aspose.words.internal.zzZPZ.zzZm((int) j2, (int) (j2 >> 32)));
            } else if (z) {
                int i3 = (int) (j >> 32);
                int i4 = (int) (j2 >> 32);
                if (i3 != i4) {
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j) + i, i3));
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(((int) j2) + i, i4));
                }
            } else {
                int i5 = (int) j;
                int i6 = (int) j2;
                if (i5 != i6) {
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i5, ((int) (j >> 32)) + i));
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i6, ((int) (j2 >> 32)) + i));
                }
            }
        }
        return new zzXR(zz0p);
    }

    private static boolean zzZ(long j, long j2, char c) {
        if (c == 'b') {
            return ((int) j2) < ((int) j);
        }
        if (c == 'l') {
            return ((int) (j2 >> 32)) < ((int) (j >> 32));
        }
        if (c == 'r') {
            return ((int) (j2 >> 32)) > ((int) (j >> 32));
        }
        if (c == 't') {
            return ((int) j2) > ((int) j);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: direction");
    }

    public static zzXR zzZ(zzXR zzxr, int i, int i2) {
        long[] jArrZz7E = zzxr.zz7E();
        for (int i3 = 0; i3 < jArrZz7E.length; i3++) {
            long j = jArrZz7E[i3];
            jArrZz7E[i3] = com.aspose.words.internal.zzZPZ.zzZm(((int) j) + i, ((int) (j >> 32)) + i2);
        }
        return new zzXR(jArrZz7E);
    }

    private static com.aspose.words.internal.zzD9 zzX(zzXR zzxr) {
        com.aspose.words.internal.zzD9 zzd9 = new com.aspose.words.internal.zzD9();
        for (long j : zzxr.zz7E()) {
            zzd9.add(new com.aspose.words.internal.zzDA((int) j, (int) (j >> 32)));
        }
        return zzd9;
    }

    private static zzXR zzX(com.aspose.words.internal.zzD9 zzd9) {
        int count = zzd9.getCount();
        long[] jArr = new long[count];
        for (int i = 0; i < count; i++) {
            jArr[i] = com.aspose.words.internal.zzZPZ.zzZm((int) zzd9.get(i).zzuS, (int) zzd9.get(i).zzuR);
        }
        return new zzXR(jArr);
    }
}
