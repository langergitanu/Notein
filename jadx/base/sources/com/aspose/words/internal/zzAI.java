package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAI extends zzAH {
    private String mName;
    private boolean zzrO;

    private zzAI(zzKO zzko, zzAD zzad, String str) {
        super(zzko, zzad, null);
        this.mName = str;
    }

    public static zzAI zzX(zzKO zzko, String str, zzGY zzgy) {
        if (zzko.zzSj()) {
            return new zzAI(str, (byte) 0);
        }
        zzAD zzadZzZ = zzRE.zzZ(zzko, str, zzgy);
        if (zzadZzZ != null) {
            return zzadZzZ.zzAF().getType() == zzG0.class ? new zzAI(str) : new zzAI(zzko, zzadZzZ, str);
        }
        zzH0 zzh0ZzY = zzgy.zzII().zzY(zzko, str);
        if (zzh0ZzY != null) {
            return new zzAI(zzh0ZzY, str);
        }
        if (zzgy.zzIH()) {
            return new zzAI(str, (byte) 0);
        }
        throw zzZ(zzko.getType(), str);
    }

    private static zzCX zzZ(Class cls, String str) {
        return new zzCX(zzZKN.format("Can not get the value of member '{0}' on type '{1}'.", str, cls));
    }

    @Override // com.aspose.words.internal.zzKO
    public final String zzN5() {
        return this.mName;
    }

    @Override // com.aspose.words.internal.zzAH, com.aspose.words.internal.zzZVP
    public final Object zzTT() {
        if (this.zzrO) {
            return null;
        }
        return super.zzTT();
    }

    @Override // com.aspose.words.internal.zzAH, com.aspose.words.internal.zzZVP
    public final boolean zzTU() {
        return this.zzrO || super.zzTU();
    }

    @Override // com.aspose.words.internal.zzAH, com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final boolean zzs() {
        return this.zzrO || super.zzs();
    }

    @Override // com.aspose.words.internal.zzAH, com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        if (this.zzrO) {
            return null;
        }
        return super.zzu();
    }

    @Override // com.aspose.words.internal.zzAH, com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        if (this.zzrO) {
            return null;
        }
        return super.zzv();
    }

    @Override // com.aspose.words.internal.zzAH, com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        if (this.zzrO) {
            return null;
        }
        return super.zzx();
    }

    private zzAI(zzH0 zzh0, String str) {
        super(zzh0);
        this.mName = str;
    }

    private zzAI(String str) {
        super(false);
        this.mName = str;
        this.zzrO = true;
    }

    private zzAI(String str, byte b) {
        this.mName = str;
    }

    public static zzAI zzX(Class cls, String str, zzGY zzgy) {
        zzAD zzadZzY = zzRE.zzY(cls, str, zzgy);
        if (zzadZzY != null) {
            return new zzAI(null, zzadZzY, str);
        }
        throw zzZ(cls, str);
    }
}
