package com.orion.notein.p607ui.noteeditor;

import OooOoO.C20509OooO0oo;
import Oooo0oO.C21023OooO0Oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C33965Oooo0O0;
import oO0oO00.C33971OoooO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO0OO;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
public final class C23353OooOoO0 {
    public static final OooO0O0 Companion = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f73686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f73687OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f73688OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f73689OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f73690OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f73691OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f73692OooO0oO;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOoO0$OooO00o */
    public /* synthetic */ class OooO00o implements InterfaceC33966Oooo0OO<C23353OooOoO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f73693OooO00o;
        private static final InterfaceC33531OooO0o0 descriptor;

        static {
            OooO00o oooO00o = new OooO00o();
            f73693OooO00o = oooO00o;
            C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.ui.noteeditor.StoredRulerState", oooO00o, 7);
            c34001o0ooOO0.OooOO0("visible", true);
            c34001o0ooOO0.OooOO0("centerX", true);
            c34001o0ooOO0.OooOO0("centerY", true);
            c34001o0ooOO0.OooOO0("length", true);
            c34001o0ooOO0.OooOO0("angleRad", true);
            c34001o0ooOO0.OooOO0("tickSpacingPx", true);
            c34001o0ooOO0.OooOO0("majorTickInterval", true);
            descriptor = c34001o0ooOO0;
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] childSerializers() {
            C33965Oooo0O0 c33965Oooo0O0 = C33965Oooo0O0.f122189OooO00o;
            return new InterfaceC33911OooO0OO[]{C33940OooO0oo.f122144OooO00o, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, c33965Oooo0O0, C33971OoooO.f122193OooO00o};
        }

        @Override // oO0o0ooO.InterfaceC33910OooO0O0
        public final Object deserialize(OooO0OO oooO0OO) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(interfaceC33531OooO0o0);
            int i = 0;
            boolean zOooOOOo = false;
            int iOooOo0 = 0;
            float fOooO0Oo = 0.0f;
            float fOooO0Oo2 = 0.0f;
            float fOooO0Oo3 = 0.0f;
            float fOooO0Oo4 = 0.0f;
            float fOooO0Oo5 = 0.0f;
            boolean z = true;
            while (z) {
                int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
                switch (iOooOo0o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        zOooOOOo = OooO00o2.OooOOOo(interfaceC33531OooO0o0, 0);
                        i |= 1;
                        break;
                    case 1:
                        fOooO0Oo = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 1);
                        i |= 2;
                        break;
                    case 2:
                        fOooO0Oo2 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 2);
                        i |= 4;
                        break;
                    case 3:
                        fOooO0Oo3 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 3);
                        i |= 8;
                        break;
                    case 4:
                        fOooO0Oo4 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 4);
                        i |= 16;
                        break;
                    case 5:
                        fOooO0Oo5 = OooO00o2.OooO0Oo(interfaceC33531OooO0o0, 5);
                        i |= 32;
                        break;
                    case 6:
                        iOooOo0 = OooO00o2.OooOo0(interfaceC33531OooO0o0, 6);
                        i |= 64;
                        break;
                    default:
                        throw new C33927OooOo00(iOooOo0o);
                }
            }
            OooO00o2.OooO0O0(interfaceC33531OooO0o0);
            return new C23353OooOoO0(i, zOooOOOo, fOooO0Oo, fOooO0Oo2, fOooO0Oo3, fOooO0Oo4, fOooO0Oo5, iOooOo0);
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
        public final InterfaceC33531OooO0o0 getDescriptor() {
            return descriptor;
        }

        @Override // oO0o0ooO.InterfaceC33911OooO0OO
        public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
            C23353OooOoO0 value = (C23353OooOoO0) obj;
            OooOOO0.OooO0oO(encoder, "encoder");
            OooOOO0.OooO0oO(value, "value");
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
            oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
            OooO0O0 oooO0O0 = C23353OooOoO0.Companion;
            boolean zOooOoO0 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            boolean z = value.f73686OooO00o;
            if (zOooOoO0 || z) {
                oooO0O0OooO00o.OooO0oO(interfaceC33531OooO0o0, 0, z);
            }
            boolean zOooOoO02 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f = value.f73687OooO0O0;
            if (zOooOoO02 || Float.compare(f, 0.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 1, f);
            }
            boolean zOooOoO03 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f2 = value.f73688OooO0OO;
            if (zOooOoO03 || Float.compare(f2, 0.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 2, f2);
            }
            boolean zOooOoO04 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f3 = value.f73689OooO0Oo;
            if (zOooOoO04 || Float.compare(f3, 600.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 3, f3);
            }
            boolean zOooOoO05 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f4 = value.f73691OooO0o0;
            if (zOooOoO05 || Float.compare(f4, 0.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 4, f4);
            }
            boolean zOooOoO06 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            float f5 = value.f73690OooO0o;
            if (zOooOoO06 || Float.compare(f5, 40.0f) != 0) {
                oooO0O0OooO00o.OooOOo0(interfaceC33531OooO0o0, 5, f5);
            }
            boolean zOooOoO07 = oooO0O0OooO00o.OooOoO0(interfaceC33531OooO0o0);
            int i = value.f73692OooO0oO;
            if (zOooOoO07 || i != 5) {
                oooO0O0OooO00o.OooOoOO(6, i, interfaceC33531OooO0o0);
            }
            oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
        }

        @Override // oO0oO00.InterfaceC33966Oooo0OO
        public final InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
            return C34002o0ooOoO.f122290OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOoO0$OooO0O0 */
    public static final class OooO0O0 {
        public final InterfaceC33911OooO0OO<C23353OooOoO0> serializer() {
            return OooO00o.f73693OooO00o;
        }
    }

    public /* synthetic */ C23353OooOoO0(int i, boolean z, float f, float f2, float f3, float f4, float f5, int i2) {
        this.f73686OooO00o = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.f73687OooO0O0 = 0.0f;
        } else {
            this.f73687OooO0O0 = f;
        }
        if ((i & 4) == 0) {
            this.f73688OooO0OO = 0.0f;
        } else {
            this.f73688OooO0OO = f2;
        }
        if ((i & 8) == 0) {
            this.f73689OooO0Oo = 600.0f;
        } else {
            this.f73689OooO0Oo = f3;
        }
        if ((i & 16) == 0) {
            this.f73691OooO0o0 = 0.0f;
        } else {
            this.f73691OooO0o0 = f4;
        }
        if ((i & 32) == 0) {
            this.f73690OooO0o = 40.0f;
        } else {
            this.f73690OooO0o = f5;
        }
        if ((i & 64) == 0) {
            this.f73692OooO0oO = 5;
        } else {
            this.f73692OooO0oO = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23353OooOoO0)) {
            return false;
        }
        C23353OooOoO0 c23353OooOoO0 = (C23353OooOoO0) obj;
        return this.f73686OooO00o == c23353OooOoO0.f73686OooO00o && Float.compare(this.f73687OooO0O0, c23353OooOoO0.f73687OooO0O0) == 0 && Float.compare(this.f73688OooO0OO, c23353OooOoO0.f73688OooO0OO) == 0 && Float.compare(this.f73689OooO0Oo, c23353OooOoO0.f73689OooO0Oo) == 0 && Float.compare(this.f73691OooO0o0, c23353OooOoO0.f73691OooO0o0) == 0 && Float.compare(this.f73690OooO0o, c23353OooOoO0.f73690OooO0o) == 0 && this.f73692OooO0oO == c23353OooOoO0.f73692OooO0oO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73692OooO0oO) + C20509OooO0oo.OooO0OO(this.f73690OooO0o, C20509OooO0oo.OooO0OO(this.f73691OooO0o0, C20509OooO0oo.OooO0OO(this.f73689OooO0Oo, C20509OooO0oo.OooO0OO(this.f73688OooO0OO, C20509OooO0oo.OooO0OO(this.f73687OooO0O0, Boolean.hashCode(this.f73686OooO00o) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoredRulerState(visible=");
        sb.append(this.f73686OooO00o);
        sb.append(", centerX=");
        sb.append(this.f73687OooO0O0);
        sb.append(", centerY=");
        sb.append(this.f73688OooO0OO);
        sb.append(", length=");
        sb.append(this.f73689OooO0Oo);
        sb.append(", angleRad=");
        sb.append(this.f73691OooO0o0);
        sb.append(", tickSpacingPx=");
        sb.append(this.f73690OooO0o);
        sb.append(", majorTickInterval=");
        return C21023OooO0Oo.OooO0OO(")", this.f73692OooO0oO, sb);
    }

    public C23353OooOoO0() {
        this(false, 0.0f, 0.0f, 600.0f, 0.0f, 40.0f, 5);
    }

    public C23353OooOoO0(boolean z, float f, float f2, float f3, float f4, float f5, int i) {
        this.f73686OooO00o = z;
        this.f73687OooO0O0 = f;
        this.f73688OooO0OO = f2;
        this.f73689OooO0Oo = f3;
        this.f73691OooO0o0 = f4;
        this.f73690OooO0o = f5;
        this.f73692OooO0oO = i;
    }
}
