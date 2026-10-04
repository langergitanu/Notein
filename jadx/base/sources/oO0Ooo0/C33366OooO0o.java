package oO0Ooo0;

import oO0Ooo.AbstractC33300OooO0oo;
import oO0Ooo0.C33361OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33366OooO0o extends C33361OooO0Oo.OooO<Object> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC33300OooO0oo.OooO0OO f120662OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC33300OooO0oo.C33301OooO0Oo f120663OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33366OooO0o(C33361OooO0Oo c33361OooO0Oo, AbstractC33300OooO0oo.OooO0O0 oooO0O0, AbstractC33300OooO0oo.OooO0OO oooO0OO, AbstractC33300OooO0oo.C33301OooO0Oo c33301OooO0Oo) {
        super(c33361OooO0Oo, oooO0O0);
        this.f120662OooOoOO = oooO0OO;
        this.f120663OooOoo0 = c33301OooO0Oo;
        if (c33361OooO0Oo == null) {
            C33361OooO0Oo.OooO.OooO00o(0);
            throw null;
        }
        this.f120652OooOoO = null;
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // oO0Ooo0.C33361OooO0Oo.OooO0o
    public final C33361OooO0Oo.OooOOO0<Object> OooO0OO(boolean z) {
        AbstractC33300OooO0oo.OooO0OO oooO0OO = this.f120662OooOoOO;
        return oooO0OO == null ? super.OooO0OO(z) : new C33361OooO0Oo.OooOOO0<>(oooO0OO.invoke(Boolean.valueOf(z)), false);
    }
}
