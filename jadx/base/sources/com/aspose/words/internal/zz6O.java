package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz6O {

    public static class zzY extends zz6P {
        private zzZVP zzlO;

        public zzY(Class cls) {
            super(cls);
            this.zzlO = new zzZVP(cls.getComponentType());
        }

        @Override // com.aspose.words.internal.zz6P
        public final boolean isVarArgs() {
            return true;
        }

        @Override // com.aspose.words.internal.zz6P
        public final zzZVP zzwU() {
            return this.zzlO;
        }
    }

    public static class zzZ extends zz6P {
        private Object zzVY;

        public zzZ(Class cls, Object obj) {
            super(cls);
            this.zzVY = obj;
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final Object zzu() {
            return this.zzVY;
        }
    }

    public static zz6P zzZ(Class cls, Object obj, boolean z) {
        return zzZ(cls, obj, z, false, null);
    }

    private static zz6P zzZ(Class cls, Object obj, boolean z, boolean z2, Object obj2) {
        return obj != null ? new zzZ(cls, obj) : z ? new zzY(cls) : new zz6P(cls);
    }
}
