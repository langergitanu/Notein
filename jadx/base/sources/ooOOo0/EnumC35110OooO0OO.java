package ooOOo0;

import oO0OOOoo.InterfaceC33028OooO0o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ooOOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC35110OooO0OO implements InterfaceC33028OooO0o0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC35110OooO0OO[] f126093OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC35110OooO0OO f126094OooOo0o;

    static {
        EnumC35110OooO0OO enumC35110OooO0OO = new EnumC35110OooO0OO("INSTANCE", 0);
        f126094OooOo0o = enumC35110OooO0OO;
        f126093OooOo = new EnumC35110OooO0OO[]{enumC35110OooO0OO, new EnumC35110OooO0OO("NEVER", 1)};
    }

    public EnumC35110OooO0OO() {
        throw null;
    }

    public static EnumC35110OooO0OO valueOf(String str) {
        return (EnumC35110OooO0OO) Enum.valueOf(EnumC35110OooO0OO.class, str);
    }

    public static EnumC35110OooO0OO[] values() {
        return (EnumC35110OooO0OO[]) f126093OooOo.clone();
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public final int OooO0O0(int i) {
        return 2;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return true;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final Object poll() throws Exception {
        return null;
    }
}
