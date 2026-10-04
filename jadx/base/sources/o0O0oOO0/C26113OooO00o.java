package o0O0oOO0;

import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: o0O0oOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
public final class C26113OooO00o {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f89151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f89152OooO0O0;

    /* JADX INFO: renamed from: o0O0oOO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C19733OooO00o implements InterfaceC33966Oooo0OO<C26113OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19733OooO00o f89153OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            C19733OooO00o c19733OooO00o = new C19733OooO00o();
            f89153OooO00o = c19733OooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.editor.ui.zoom.vo.DisplayedZoomVO", c19733OooO00o, 2);
            c34001o0ooOO0.OooOO0("rawZoom", true);
            c34001o0ooOO0.OooOO0("displayedZoom", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
            return new InterfaceC33911OooO0OO[]{c33965Oooo0O0, c33965Oooo0O0};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            boolean z = true;
            int i = 0;
            float fOooO0Oo = 0.0f;
            float fOooO0Oo2 = 0.0f;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 0);
                    i |= 1;
                } else {
                    if (iOooOo0o != 1) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    fOooO0Oo2 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 1);
                    i |= 2;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            C26113OooO00o c26113OooO00o = new C26113OooO00o();
            if ((i & 1) == 0) {
                c26113OooO00o.f89151OooO00o = 0.0f;
            } else {
                c26113OooO00o.f89151OooO00o = fOooO0Oo;
            }
            if ((i & 2) == 0) {
                c26113OooO00o.f89152OooO0O0 = 0.0f;
                return c26113OooO00o;
            }
            c26113OooO00o.f89152OooO0O0 = fOooO0Oo2;
            return c26113OooO00o;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C26113OooO00o value = (C26113OooO00o) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C26113OooO00o.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f = value.f89151OooO00o;
            if (zOooOoO0 || Float.compare(f, 0.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 0, f);
            }
            boolean zOooOoO02 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f2 = value.f89152OooO0O0;
            if (zOooOoO02 || Float.compare(f2, 0.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 1, f2);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0O0oOO0.OooO00o$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C26113OooO00o> serializer() {
            return C19733OooO00o.f89153OooO00o;
        }
    }

    public C26113OooO00o() {
        this(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26113OooO00o)) {
            return false;
        }
        C26113OooO00o c26113OooO00o = (C26113OooO00o) obj;
        return Float.compare(this.f89151OooO00o, c26113OooO00o.f89151OooO00o) == 0 && Float.compare(this.f89152OooO0O0, c26113OooO00o.f89152OooO0O0) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89152OooO0O0) + (Float.hashCode(this.f89151OooO00o) * 31);
    }

    public final String toString() {
        return "DisplayedZoomVO(rawZoom=" + this.f89151OooO00o + ", displayedZoom=" + this.f89152OooO0O0 + ")";
    }

    public C26113OooO00o(float f, float f2) {
        this.f89151OooO00o = f;
        this.f89152OooO0O0 = f2;
    }
}
