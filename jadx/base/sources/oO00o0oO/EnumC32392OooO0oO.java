package oO00o0oO;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO00o0oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32392OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC32392OooO0oO[] f116484OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32392OooO0oO f116485OooOo0o;

    /* JADX INFO: renamed from: oO00o0oO.OooO0oO$OooO00o */
    public static final class OooO00o implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Throwable f116486OooOo0o;

        public OooO00o(Throwable th) {
            this.f116486OooOo0o = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            Object obj2 = ((OooO00o) obj).f116486OooOo0o;
            Throwable th = this.f116486OooOo0o;
            if (th != obj2) {
                return th != null && th.equals(obj2);
            }
            return true;
        }

        public final int hashCode() {
            return this.f116486OooOo0o.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f116486OooOo0o + "]";
        }
    }

    static {
        EnumC32392OooO0oO enumC32392OooO0oO = new EnumC32392OooO0oO("COMPLETE", 0);
        f116485OooOo0o = enumC32392OooO0oO;
        f116484OooOo = new EnumC32392OooO0oO[]{enumC32392OooO0oO};
    }

    public EnumC32392OooO0oO() {
        throw null;
    }

    public static EnumC32392OooO0oO valueOf(String str) {
        return (EnumC32392OooO0oO) Enum.valueOf(EnumC32392OooO0oO.class, str);
    }

    public static EnumC32392OooO0oO[] values() {
        return (EnumC32392OooO0oO[]) f116484OooOo.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
