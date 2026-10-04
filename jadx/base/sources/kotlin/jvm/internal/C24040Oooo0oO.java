package kotlin.jvm.internal;

import Oooo0oO.o0Oo0oo;
import OoooooO.C21445Oooo;
import java.util.Collections;
import java.util.List;
import o0000OOo.C24217OooO0O0;
import oOoo0.C34607OooOOo;
import oOoo0.EnumC34609OooOOoo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34597OooO0o0;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: kotlin.jvm.internal.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24040Oooo0oO implements InterfaceC34606OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final List<C34607OooOOo> f80948OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo f80949OooOo0o;

    /* JADX INFO: renamed from: kotlin.jvm.internal.Oooo0oO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f80950OooO00o;

        static {
            int[] iArr = new int[EnumC34609OooOOoo.values().length];
            try {
                EnumC34609OooOOoo enumC34609OooOOoo = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo2 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo3 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80950OooO00o = iArr;
        }
    }

    public C24040Oooo0oO() {
        throw null;
    }

    public C24040Oooo0oO(InterfaceC34595OooO0Oo classifier) {
        List<C34607OooOOo> arguments = Collections.EMPTY_LIST;
        OooOOO0.OooO0oO(classifier, "classifier");
        OooOOO0.OooO0oO(arguments, "arguments");
        this.f80949OooOo0o = classifier;
        this.f80948OooOo = arguments;
    }

    public final String OooO(boolean z) {
        String name;
        InterfaceC34595OooO0Oo interfaceC34595OooO0Oo = this.f80949OooOo0o;
        InterfaceC34595OooO0Oo interfaceC34595OooO0Oo2 = interfaceC34595OooO0Oo != null ? interfaceC34595OooO0Oo : null;
        Class clsOooO0Oo = interfaceC34595OooO0Oo2 != null ? C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo2) : null;
        if (clsOooO0Oo == null) {
            name = interfaceC34595OooO0Oo.toString();
        } else if (clsOooO0Oo.isArray()) {
            name = clsOooO0Oo.equals(boolean[].class) ? "kotlin.BooleanArray" : clsOooO0Oo.equals(char[].class) ? "kotlin.CharArray" : clsOooO0Oo.equals(byte[].class) ? "kotlin.ByteArray" : clsOooO0Oo.equals(short[].class) ? "kotlin.ShortArray" : clsOooO0Oo.equals(int[].class) ? "kotlin.IntArray" : clsOooO0Oo.equals(float[].class) ? "kotlin.FloatArray" : clsOooO0Oo.equals(long[].class) ? "kotlin.LongArray" : clsOooO0Oo.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && clsOooO0Oo.isPrimitive()) {
            OooOOO0.OooO0o0(interfaceC34595OooO0Oo, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C24217OooO0O0.OooO0o0(interfaceC34595OooO0Oo).getName();
        } else {
            name = clsOooO0Oo.getName();
        }
        List<C34607OooOOo> list = this.f80948OooOo;
        return o0Oo0oo.OooO0Oo(name, list.isEmpty() ? "" : oOo000Oo.OooOo.o000oOoO(list, ", ", "<", ">", new C24038Oooo0o(this, 0), 24), "");
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final InterfaceC34597OooO0o0 OooO0O0() {
        return this.f80949OooOo0o;
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final boolean OooO0oO() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24040Oooo0oO)) {
            return false;
        }
        C24040Oooo0oO c24040Oooo0oO = (C24040Oooo0oO) obj;
        return OooOOO0.OooO0O0(this.f80949OooOo0o, c24040Oooo0oO.f80949OooOo0o) && OooOOO0.OooO0O0(this.f80948OooOo, c24040Oooo0oO.f80948OooOo);
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final List<C34607OooOOo> getArguments() {
        return this.f80948OooOo;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + C21445Oooo.OooO00o(this.f80948OooOo, this.f80949OooOo0o.hashCode() * 31, 31);
    }

    public final String toString() {
        return OooO(false) + " (Kotlin reflection is not available)";
    }
}
