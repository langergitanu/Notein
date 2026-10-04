package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZS9 {

    public static class zzZ {
        public com.aspose.words.internal.zzZQ4 zzYIG;
        public float zzYIH;
        public float zzYII;
        public float zzYIJ;
        public int zzYIK;
        public int zzYIL;
        public float zzYIM;
        public boolean zzYIN;
        public float zzYIO;
        public float zzYIP;
        public float zzYIQ;
        public int zzYIR;
        public boolean zzYIS;
        public float zzYIT;
        public float zzYIU;

        private zzZ() {
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public static com.aspose.words.internal.zzZQ4 zzF(Shape shape) {
        return zzZ(zzZ(shape, false));
    }

    public static com.aspose.words.internal.zzZQ4 zzG(Shape shape) {
        return zzZ(zzZ(shape, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzZ zzV(zz2J zz2j) {
        zzZ zzz = new zzZ(0 == true ? 1 : 0);
        boolean z = (zz2j.zzZTd() == null || zz2j.zzZTc() == null) ? false : true;
        zzz.zzYIS = z;
        if (!z) {
            return zzz;
        }
        zzz.zzYIR = 0;
        zzz.zzYIU = (float) zz2j.zzZTc().zzZvn();
        zzz.zzYIT = 0.0f;
        zzGO zzgoZzZvF = zz2j.zzZTd().zzZvF().zzZPw() != null ? zz2j.zzZTd().zzZvF() : zz3I.zzHd(zz2j.zzZTd().zzZvF().zzZPy());
        zzz.zzYIQ = -((float) zzgoZzZvF.zzZPw().zzZw5().zzZQQ());
        zzz.zzYIP = -((float) zzgoZzZvF.zzZPw().zzZw4().zzZQQ());
        zzz.zzYIO = -((float) zzgoZzZvF.zzZPw().zzZw3().zzZQQ());
        int iZzHe = zz3I.zzHe(zz2j.zzZTd().zzZvF().zzZPy());
        zzz.zzYIN = iZzHe == 0 || iZzHe == 2;
        zzz.zzYIM = zz3I.zzHb(zz2j.zzZTd().zzZvF().zzZPy());
        zzz.zzYIL = com.aspose.words.internal.zzSA.zzl(((float) zz2j.zzZyb().getWidth()) / 2.0f);
        zzz.zzYIK = com.aspose.words.internal.zzSA.zzl(((float) zz2j.zzZyb().getHeight()) / 2.0f);
        zzz.zzYIH = (float) (8000000.0d / (zzgoZzZvF.zzZPz().zzZQR() + 0.01d));
        zzz.zzYIG = new com.aspose.words.internal.zzZQ4();
        return zzz;
    }

    public static com.aspose.words.internal.zzZQ4 zzW(zz2J zz2j) {
        return zzZ(zzV(zz2j));
    }

    private static com.aspose.words.internal.zzQB zzX(zzZ zzz) {
        if (zzz.zzYIN) {
            return com.aspose.words.internal.zzQB.zzd(zzz.zzYIM);
        }
        return com.aspose.words.internal.zzQB.zzZ(new com.aspose.words.internal.zzQ9(zzz.zzYIJ, zzz.zzYII, zzz.zzYIH), com.aspose.words.internal.zzZPY.zzG((zzz.zzYIG.getWidth() * ((float) (((double) zzz.zzYIL) / 65536.0d))) + (zzz.zzYIG.getWidth() / 2.0f), (zzz.zzYIG.getHeight() * ((float) (((double) zzz.zzYIK) / 65536.0d))) + (zzz.zzYIG.getHeight() / 2.0f)));
    }

    private static com.aspose.words.internal.zzQB zzY(zzZ zzz) {
        com.aspose.words.internal.zzQB zzqb = new com.aspose.words.internal.zzQB();
        zzqb.zzY((-zzz.zzYIG.getWidth()) / 2.0f, (-zzz.zzYIG.getHeight()) / 2.0f, 0.0d);
        zzqb.zzX(zzz.zzYIQ, -zzz.zzYIP, zzz.zzYIO);
        zzqb.zzY(zzz.zzYIG.getWidth() / 2.0f, zzz.zzYIG.getHeight() / 2.0f, 0.0d);
        return zzqb;
    }

    private static zzZ zzZ(Shape shape, boolean z) {
        zzZ zzz = new zzZ((byte) 0);
        zzz.zzYIS = shape.getExtrusionEnabled();
        zzz.zzYIR = shape.getRenderMode();
        zzz.zzYIU = (float) (((double) shape.zzYb1()) / 12700.0d);
        zzz.zzYIT = (float) (((double) shape.zzYb2()) / 12700.0d);
        zzz.zzYIQ = (float) (((double) shape.zzYaU()) / 65536.0d);
        zzz.zzYIP = (float) (((double) shape.zzYaT()) / 65536.0d);
        zzz.zzYIN = shape.zzYb4();
        zzz.zzYIM = (float) (((double) shape.zzYb3()) / 65536.0d);
        zzz.zzYIL = shape.zzYaW();
        zzz.zzYIK = shape.zzYaV();
        zzz.zzYIJ = (float) (((double) shape.zzYaZ()) / 12700.0d);
        zzz.zzYII = (float) (((double) shape.zzYaY()) / 12700.0d);
        zzz.zzYIH = (float) (((double) shape.zzYaX()) / 12700.0d);
        zzz.zzYIG = z ? shape.zzYzG() : new com.aspose.words.internal.zzZQ4();
        return zzz;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzZ zzz) {
        if (zzz.zzYIS && zzz.zzYIR != 2) {
            com.aspose.words.internal.zzQB zzqbZzX = zzX(zzz);
            com.aspose.words.internal.zzQB zzqbZzY = zzY(zzz);
            zzqbZzY.zzY(zzqbZzX);
            com.aspose.words.internal.zzQ9[] zzq9Arr = new com.aspose.words.internal.zzQ9[8];
            float width = zzz.zzYIG.getWidth();
            float height = zzz.zzYIG.getHeight();
            zzq9Arr[0] = new com.aspose.words.internal.zzQ9(0.0d, 0.0d, zzz.zzYIT);
            double d = width;
            zzq9Arr[1] = new com.aspose.words.internal.zzQ9(d, 0.0d, zzz.zzYIT);
            double d2 = height;
            zzq9Arr[2] = new com.aspose.words.internal.zzQ9(d, d2, zzz.zzYIT);
            zzq9Arr[3] = new com.aspose.words.internal.zzQ9(0.0d, d2, zzz.zzYIT);
            zzq9Arr[4] = new com.aspose.words.internal.zzQ9(0.0d, 0.0d, -zzz.zzYIU);
            zzq9Arr[5] = new com.aspose.words.internal.zzQ9(d, 0.0d, -zzz.zzYIU);
            zzq9Arr[6] = new com.aspose.words.internal.zzQ9(d, d2, -zzz.zzYIU);
            zzq9Arr[7] = new com.aspose.words.internal.zzQ9(0.0d, d2, -zzz.zzYIU);
            float fZzQb = -3.4028235E38f;
            float fZzQb2 = Float.MAX_VALUE;
            float fZzYm = Float.MAX_VALUE;
            float fZzYm2 = -3.4028235E38f;
            for (int i = 0; i < 8; i++) {
                com.aspose.words.internal.zzQ9 zzq9ZzY = zzqbZzY.zzY(zzq9Arr[i]);
                zzq9Arr[i] = zzq9ZzY;
                if (zzq9ZzY.zzQb() < fZzQb2) {
                    fZzQb2 = (float) zzq9Arr[i].zzQb();
                }
                if (zzq9Arr[i].zzYm() < fZzYm) {
                    fZzYm = (float) zzq9Arr[i].zzYm();
                }
                if (zzq9Arr[i].zzQb() > fZzQb) {
                    fZzQb = (float) zzq9Arr[i].zzQb();
                }
                if (zzq9Arr[i].zzYm() > fZzYm2) {
                    fZzYm2 = (float) zzq9Arr[i].zzYm();
                }
            }
            return com.aspose.words.internal.zzZQ4.zzX(fZzQb2, fZzYm, fZzQb, fZzYm2);
        }
        return com.aspose.words.internal.zzZQ4.zz2T;
    }
}
