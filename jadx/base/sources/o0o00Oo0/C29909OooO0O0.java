package o0o00Oo0;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C33971OoooO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO0OO;

/* JADX INFO: renamed from: o0o00Oo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C29909OooO0O0 {
    public static final C20029OooO0O0 Companion = new C20029OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106118OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106119OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f106120OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f106121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f106122OooO0o0;

    /* JADX INFO: renamed from: o0o00Oo0.OooO0O0$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C29909OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106123OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f106123OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.ui.noteeditor.toolbar.vo.ToolbarSettingsItemVO", oooO00o, 5);
            c34001o0ooOO0.OooOO0(C18437z2.f56754h, false);
            c34001o0ooOO0.OooOO0("iconRes", false);
            c34001o0ooOO0.OooOO0("descriptionRes", false);
            c34001o0ooOO0.OooOO0("isVisible", false);
            c34001o0ooOO0.OooOO0("draggable", false);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            C33971OoooO c33971OoooO = C33971OoooO.f122193OooO00o;
            C33940OooO0oo c33940OooO0oo = C33940OooO0oo.f122144OooO00o;
            return new InterfaceC33911OooO0OO[]{c33971OoooO, c33971OoooO, c33971OoooO, c33940OooO0oo, c33940OooO0oo};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            boolean z = true;
            int i = 0;
            int iOooOo0 = 0;
            int iOooOo02 = 0;
            int iOooOo03 = 0;
            boolean zOooOOOo = false;
            boolean zOooOOOo2 = false;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                if (iOooOo0o == -1) {
                    z = false;
                } else if (iOooOo0o == 0) {
                    iOooOo0 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 0);
                    i |= 1;
                } else if (iOooOo0o == 1) {
                    iOooOo02 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 1);
                    i |= 2;
                } else if (iOooOo0o == 2) {
                    iOooOo03 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 2);
                    i |= 4;
                } else if (iOooOo0o == 3) {
                    zOooOOOo = OooO00o2.OooOOOo(interfaceC33531OooO0o0, 3);
                    i |= 8;
                } else {
                    if (iOooOo0o != 4) {
                        throw new C33927OooOo00(iOooOo0o);
                    }
                    zOooOOOo2 = OooO00o2.OooOOOo(interfaceC33531OooO0o0, 4);
                    i |= 16;
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C29909OooO0O0(i, iOooOo0, iOooOo02, iOooOo03, zOooOOOo, zOooOOOo2);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C29909OooO0O0 value = (C29909OooO0O0) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOoOO(0, value.f106118OooO00o, interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOoOO(1, value.f106119OooO0O0, interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooOoOO(2, value.f106120OooO0OO, interfaceC33531OooO0o0);
            oooO0O0OooO00o.OooO0oO(interfaceC33531OooO0o0, 3, value.f106121OooO0Oo);
            oooO0O0OooO00o.OooO0oO(interfaceC33531OooO0o0, 4, value.f106122OooO0o0);
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o00Oo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20029OooO0O0 {
        public final InterfaceC33911OooO0OO<C29909OooO0O0> serializer() {
            return OooO00o.f106123OooO00o;
        }
    }

    public /* synthetic */ C29909OooO0O0(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (31 != (i & 31)) {
            C24242OooOOo.OooO0O0(i, 31, OooO00o.f106123OooO00o.getDescriptor());
            throw null;
        }
        this.f106118OooO00o = i2;
        this.f106119OooO0O0 = i3;
        this.f106120OooO0OO = i4;
        this.f106121OooO0Oo = z;
        this.f106122OooO0o0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29909OooO0O0)) {
            return false;
        }
        C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) obj;
        return this.f106118OooO00o == c29909OooO0O0.f106118OooO00o && this.f106119OooO0O0 == c29909OooO0O0.f106119OooO0O0 && this.f106120OooO0OO == c29909OooO0O0.f106120OooO0OO && this.f106121OooO0Oo == c29909OooO0O0.f106121OooO0Oo && this.f106122OooO0o0 == c29909OooO0O0.f106122OooO0o0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106122OooO0o0) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f106120OooO0OO, C20785Oooo00o.OooO00o(this.f106119OooO0O0, Integer.hashCode(this.f106118OooO00o) * 31, 31), 31), 31, this.f106121OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarSettingsItemVO(type=");
        sb.append(this.f106118OooO00o);
        sb.append(", iconRes=");
        sb.append(this.f106119OooO0O0);
        sb.append(", descriptionRes=");
        sb.append(this.f106120OooO0OO);
        sb.append(", isVisible=");
        sb.append(this.f106121OooO0Oo);
        sb.append(", draggable=");
        return OooOOO.OooO00o(sb, ")", this.f106122OooO0o0);
    }

    public C29909OooO0O0(int i, int i2, int i3, boolean z, boolean z2) {
        this.f106118OooO00o = i;
        this.f106119OooO0O0 = i2;
        this.f106120OooO0OO = i3;
        this.f106121OooO0Oo = z;
        this.f106122OooO0o0 = z2;
    }
}
