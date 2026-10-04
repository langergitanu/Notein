package ooOOoOO0;

import kotlin.jvm.internal.C24019OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0oO00.C33958OooOoo;

/* JADX INFO: renamed from: ooOOoOO0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35126OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33958OooOoo f126126OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f126127OooO0O0;

    /* JADX INFO: renamed from: ooOOoOO0.OooOOo0$OooO00o */
    public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32508OooOOOo<InterfaceC33531OooO0o0, Integer, Boolean> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Boolean invoke(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, Integer num) {
            InterfaceC33531OooO0o0 p0 = interfaceC33531OooO0o0;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
            C35126OooOOo0 c35126OooOOo0 = (C35126OooOOo0) this.receiver;
            c35126OooOOo0.getClass();
            boolean z = !p0.OooO(iIntValue) && p0.OooO0Oo(iIntValue).OooO0O0();
            c35126OooOOo0.f126127OooO0O0 = z;
            return Boolean.valueOf(z);
        }
    }

    public C35126OooOOo0(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f126126OooO00o = new C33958OooOoo(descriptor, new OooO00o(2, this, C35126OooOOo0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
