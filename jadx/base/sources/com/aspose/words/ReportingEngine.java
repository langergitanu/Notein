package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ReportingEngine {
    private static long[] zzXC6 = {com.aspose.words.internal.zzKB.zzh(1, 1), com.aspose.words.internal.zzKB.zzh(2, 2), com.aspose.words.internal.zzKB.zzh(4, 4), com.aspose.words.internal.zzKB.zzh(8, 16)};
    private KnownTypeSet zzXC7;
    private boolean zzXCe;
    private boolean zzXCf;
    private com.aspose.words.internal.zzZZJ zzYh1;

    public ReportingEngine() {
        com.aspose.words.internal.zzZZJ zzzzj = new com.aspose.words.internal.zzZZJ();
        this.zzYh1 = zzzzj;
        this.zzXC7 = new KnownTypeSet(zzzzj);
    }

    public static Class[] getRestrictedTypes() {
        return com.aspose.words.internal.zzZZJ.getRestrictedTypes();
    }

    public static boolean getUseReflectionOptimization() {
        return com.aspose.words.internal.zzZZJ.getUseReflectionOptimization();
    }

    public static void setRestrictedTypes(Class... clsArr) {
        com.aspose.words.internal.zzZZJ.setRestrictedTypes(clsArr);
    }

    public static void setUseReflectionOptimization(boolean z) {
        com.aspose.words.internal.zzZZJ.setUseReflectionOptimization(z);
    }

    private static Object[] zzX(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        Object[] objArr2 = objArr;
        for (int i = 0; i < objArr.length; i++) {
            zzZCV zzzcv = (zzZCV) com.aspose.words.internal.zzZKW.zzZ(objArr[i], zzZCV.class);
            if (zzzcv != null) {
                if (objArr2 == objArr) {
                    objArr2 = (Object[]) objArr.clone();
                }
                objArr2[i] = zzzcv.toCore();
            }
        }
        return objArr2;
    }

    public static boolean zzZ(Document document, Object obj, boolean z, boolean z2, boolean z3, boolean z4) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) document, "document");
        zzZRO zzzro = new zzZRO();
        return com.aspose.words.internal.zzZZJ.zzZ(obj, z, z2, new zzY65(document, zzzro, z3, z4), new zzYJM(document, zzzro, z3, z4));
    }

    public boolean buildReport(Document document, Object obj) throws Exception {
        return buildReport(document, obj, (String) null);
    }

    public final boolean equals(Object obj) {
        this.zzYh1.zzW((Object[]) com.aspose.words.internal.zzZKW.zzZ(obj, Object[].class));
        return super.equals(obj);
    }

    public KnownTypeSet getKnownTypes() {
        return this.zzXC7;
    }

    public int getOptions() {
        int iZzZ = com.aspose.words.internal.zzKB.zzZ(this.zzYh1.getOptions(), zzXC6);
        if (this.zzXCf) {
            iZzZ |= 8;
        }
        return this.zzXCe ? iZzZ | 32 : iZzZ;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void setOptions(int i) {
        this.zzYh1.setOptions(com.aspose.words.internal.zzKB.zzY(i, zzXC6));
        this.zzXCf = (i & 8) != 0;
        this.zzXCe = (i & 32) != 0;
    }

    public boolean buildReport(Document document, Object obj, String str) throws Exception {
        return buildReport(document, new Object[]{obj}, new String[]{str});
    }

    public boolean buildReport(Document document, Object[] objArr, String[] strArr) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) document, "document");
        zzZRO zzzro = new zzZRO();
        document.zzZq9().add(26);
        boolean zZzZ = this.zzYh1.zzZ(strArr, zzX(objArr), new zzY65(document, zzzro, this.zzXCf, this.zzXCe), new zzYJM(document, zzzro, this.zzXCf, this.zzXCe));
        if (zZzZ && this.zzXCe) {
            document.updateFields();
        }
        return zZzZ;
    }
}
