package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21815Oooo0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f64507OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f64508OooO00o;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0O0$OooO00o */
    public class OooO00o implements InterfaceC21823OoooO00 {
        @Override // androidx.datastore.preferences.protobuf.InterfaceC21823OoooO00
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC21823OoooO00
        public final InterfaceC21812Oooo messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0O0$OooO0O0 */
    public static class OooO0O0 implements InterfaceC21823OoooO00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public InterfaceC21823OoooO00[] f64509OooO00o;

        @Override // androidx.datastore.preferences.protobuf.InterfaceC21823OoooO00
        public final boolean isSupported(Class<?> cls) {
            for (InterfaceC21823OoooO00 interfaceC21823OoooO00 : this.f64509OooO00o) {
                if (interfaceC21823OoooO00.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC21823OoooO00
        public final InterfaceC21812Oooo messageInfoFor(Class<?> cls) {
            for (InterfaceC21823OoooO00 interfaceC21823OoooO00 : this.f64509OooO00o) {
                if (interfaceC21823OoooO00.isSupported(cls)) {
                    return interfaceC21823OoooO00.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public C21815Oooo0O0() {
        C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
        InterfaceC21823OoooO00 interfaceC21823OoooO00 = f64507OooO0O0;
        try {
            interfaceC21823OoooO00 = (InterfaceC21823OoooO00) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        InterfaceC21823OoooO00[] interfaceC21823OoooO00Arr = {C21804OooOo0o.f64481OooO00o, interfaceC21823OoooO00};
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f64509OooO00o = interfaceC21823OoooO00Arr;
        Charset charset = C21805OooOoO.f64482OooO00o;
        this.f64508OooO00o = oooO0O0;
    }
}
