package oO00oO0;

import oOo00ooO.InterfaceC34570OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO00oO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32398OooO0OO implements InterfaceC34570OooO0O0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC32398OooO0OO[] f116502OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32398OooO0OO f116503OooOo0o;

    static {
        EnumC32398OooO0OO enumC32398OooO0OO = new EnumC32398OooO0OO("INSTANCE", 0);
        f116503OooOo0o = enumC32398OooO0OO;
        f116502OooOo = new EnumC32398OooO0OO[]{enumC32398OooO0OO, new EnumC32398OooO0OO("NEVER", 1)};
    }

    public EnumC32398OooO0OO() {
        throw null;
    }

    public static EnumC32398OooO0OO valueOf(String str) {
        return (EnumC32398OooO0OO) Enum.valueOf(EnumC32398OooO0OO.class, str);
    }

    public static EnumC32398OooO0OO[] values() {
        return (EnumC32398OooO0OO[]) f116502OooOo.clone();
    }

    @Override // oOo00ooO.InterfaceC34571OooO0OO
    public final int OooO0O0(int i) {
        return 2;
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final void clear() {
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean isEmpty() {
        return true;
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final Object poll() {
        return null;
    }
}
