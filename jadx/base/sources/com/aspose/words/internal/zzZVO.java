package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVO {

    public static class zzX extends zzZVP {
        private Object zzVZ;

        public zzX(Class cls, Object obj) {
            super(cls);
            this.zzVZ = obj;
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final Object zzv() {
            return this.zzVZ;
        }
    }

    public static class zzY extends zzZVP {
        private Object zzVY;

        public zzY(Class cls, Object obj) {
            super(cls);
            this.zzVY = obj;
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final Object zzu() {
            return this.zzVY;
        }
    }

    public static class zzZ extends zzY {
        private Object zzVZ;

        public zzZ(Class cls, Object obj, Object obj2) {
            super(cls, obj2);
            this.zzVZ = obj;
        }

        @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
        public final Object zzv() {
            return this.zzVZ;
        }
    }

    private static zzZVP zzW(Class cls, Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj != null ? new zzX(cls, obj) : obj2 != null ? new zzY(cls, obj2) : new zzZVP(cls) : new zzZ(cls, obj, obj2);
    }

    public static zzZVP zzX(Class cls, Object obj, Object obj2) {
        return zzW(cls, obj, obj2);
    }
}
