package oO0OOOo0;

import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OOOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC33004OooO0Oo implements InterfaceC33029OooO0oO<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC33004OooO0Oo[] f119390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC33004OooO0Oo f119391OooOo0o;

    static {
        EnumC33004OooO0Oo enumC33004OooO0Oo = new EnumC33004OooO0Oo("INSTANCE", 0);
        f119391OooOo0o = enumC33004OooO0Oo;
        f119390OooOo = new EnumC33004OooO0Oo[]{enumC33004OooO0Oo};
    }

    public EnumC33004OooO0Oo() {
        throw null;
    }

    public static void OooO00o(InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
        interfaceC33493OooO0oo.OooO0Oo(f119391OooOo0o);
        interfaceC33493OooO0oo.onComplete();
    }

    public static void OooO0OO(Throwable th, InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
        interfaceC33493OooO0oo.OooO0Oo(f119391OooOo0o);
        interfaceC33493OooO0oo.onError(th);
    }

    public static EnumC33004OooO0Oo valueOf(String str) {
        return (EnumC33004OooO0Oo) Enum.valueOf(EnumC33004OooO0Oo.class, str);
    }

    public static EnumC33004OooO0Oo[] values() {
        return (EnumC33004OooO0Oo[]) f119390OooOo.clone();
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public final int OooO0O0(int i) {
        return 2;
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
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
    public final Object poll() {
        return null;
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        EnumC33007OooO0oO.OooO0OO(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
