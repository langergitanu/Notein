package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class VbaModule implements Cloneable {
    private String mName;
    private int zzL4;
    private int zzX0A;
    private String zzX0B;
    private String zzX0C;
    private VbaProject zzX0y;
    private com.aspose.words.internal.zzAA zzX0z;

    public VbaModule() {
    }

    private static int[] zzXU6() {
        return new int[]{0, 1, 2, 3};
    }

    public static VbaModule zzZ(zzY3M zzy3m, com.aspose.words.internal.zzAA zzaa) throws Exception {
        short sZzX9;
        VbaModule vbaModule = new VbaModule();
        try {
            vbaModule.setName(zzy3m.zzV4(25, 71));
            String strZzV4 = zzy3m.zzV4(26, 50);
            vbaModule.zzX0B = zzy3m.zzV4(28, 72);
            int iZzXTY = zzy3m.zzXTY();
            vbaModule.zzX0A = zzy3m.zzXTY();
            zzy3m.zzXTX();
            do {
                sZzX9 = zzy3m.zzX9();
                zzy3m.zzXc();
            } while (sZzX9 != 43);
            vbaModule.zzZ(zzaa.zzYq("VBA").zzYs(strZzV4), iZzXTY, zzy3m.zzQZ());
            vbaModule.zzZ(zzaa.zzYs("PROJECT"), zzy3m.zzQZ());
            vbaModule.zzX0z = zzaa.zzYr(vbaModule.getName());
            return vbaModule;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String zzjg(int i) {
        if (i == 0) {
            return "Document";
        }
        if (i == 1) {
            return "Module";
        }
        if (i == 2) {
            return "Class";
        }
        if (i == 3) {
            return "BaseClass";
        }
        throw new IllegalArgumentException("Unknown module type");
    }

    public VbaModule deepClone() {
        VbaModule vbaModule = (VbaModule) memberwiseClone();
        vbaModule.zzX0y = null;
        com.aspose.words.internal.zzAA zzaa = this.zzX0z;
        if (zzaa != null) {
            try {
                com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzaa);
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                zzkd.zzL(zzzor);
                zzzor.zzH(0L);
                vbaModule.zzX0z = new com.aspose.words.internal.zzKD(zzzor).zzIf();
            } catch (Exception unused) {
            }
        }
        return vbaModule;
    }

    public String getName() {
        return this.mName;
    }

    public String getSourceCode() {
        return this.zzX0C;
    }

    public int getType() {
        return this.zzL4;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setName(String str) {
        this.mName = str;
        VbaProject vbaProject = this.zzX0y;
        if (vbaProject != null) {
            vbaProject.zzXU4();
        }
    }

    public void setSourceCode(String str) {
        this.zzX0C = str;
        VbaProject vbaProject = this.zzX0y;
        if (vbaProject != null) {
            vbaProject.zzXU4();
        }
    }

    public void setType(int i) {
        this.zzL4 = i;
    }

    public final com.aspose.words.internal.zzAA zzXU5() {
        return this.zzX0z;
    }

    public VbaModule(String str) {
        this.mName = str;
        this.zzX0B = "";
        this.zzL4 = 1;
    }

    private void zzZ(com.aspose.words.internal.zzZOR zzzor, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        String strZzZn = zzzo0.zzZn(zzzor.zzWy());
        int[] iArrZzXU6 = zzXU6();
        for (int i = 0; i < 4; i++) {
            int i2 = iArrZzXU6[i];
            if (com.aspose.words.internal.zzZKN.zzT(strZzZn, com.aspose.words.internal.zzZKN.zzO(zzjg(i2), "=", this.mName), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) >= 0) {
                this.zzL4 = i2;
            }
        }
    }

    private void zzZ(com.aspose.words.internal.zzZOR zzzor, int i, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        zzzor.zzH(i);
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        zzYIN.zzZ(zzzor, zzzor2);
        this.zzX0C = zzzo0.zzZn(zzzor2.zzWy());
    }

    public final void zzZ(VbaProject vbaProject) {
        this.zzX0y = vbaProject;
    }

    public final void zzZ(zzY3L zzy3l) throws Exception {
        zzy3l.zzY((short) 25, this.mName);
        zzy3l.zzZ((short) 71, com.aspose.words.internal.zzZO0.zzhU(), this.mName);
        zzy3l.zzY((short) 26, this.mName);
        zzy3l.zzZ((short) 50, com.aspose.words.internal.zzZO0.zzhU(), this.mName);
        zzy3l.zzY((short) 28, this.zzX0B);
        zzy3l.zzZ((short) 72, com.aspose.words.internal.zzZO0.zzhU(), this.zzX0B);
        zzy3l.zzV((short) 49, 0);
        zzy3l.zzV((short) 30, this.zzX0A);
        zzy3l.zzJ((short) 44);
        zzy3l.zzl(2);
        zzy3l.zzJ((short) -1);
        zzy3l.zzJ((short) (this.zzL4 == 1 ? 33 : 34));
        zzy3l.zzl(0);
        zzy3l.zzJ((short) 43);
        zzy3l.zzl(0);
    }
}
