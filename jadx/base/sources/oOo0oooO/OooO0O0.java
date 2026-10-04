package oOo0oooO;

/* JADX INFO: loaded from: classes10.dex */
public class OooO0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34588OooO0oO f123899OooOo0o;

    public OooO0O0(InterfaceC34588OooO0oO interfaceC34588OooO0oO) {
        if (interfaceC34588OooO0oO != null) {
            this.f123899OooOo0o = interfaceC34588OooO0oO;
        } else {
            OoooO(0);
            throw null;
        }
    }

    public static /* synthetic */ void OoooO(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // oOo0oooO.OooO00o
    public InterfaceC34588OooO0oO getAnnotations() {
        InterfaceC34588OooO0oO interfaceC34588OooO0oO = this.f123899OooOo0o;
        if (interfaceC34588OooO0oO != null) {
            return interfaceC34588OooO0oO;
        }
        OoooO(1);
        throw null;
    }
}
