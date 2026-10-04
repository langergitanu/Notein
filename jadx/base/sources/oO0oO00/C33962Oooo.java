package oO0oO00;

import java.util.Arrays;
import oO0o.InterfaceC33531OooO0o0;

/* JADX INFO: renamed from: oO0oO00.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33962Oooo extends C34001o0ooOO0 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f122180OooOO0o;

    public C33962Oooo(String str, C33973OoooO00 c33973OoooO00) {
        super(str, c33973OoooO00, 1);
        this.f122180OooOO0o = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0oO00.C34001o0ooOO0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33962Oooo) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = (InterfaceC33531OooO0o0) obj;
            if (this.f122280OooO00o.equals(interfaceC33531OooO0o0.OooO0oo())) {
                C33962Oooo c33962Oooo = (C33962Oooo) obj;
                if (c33962Oooo.f122180OooOO0o && Arrays.equals((InterfaceC33531OooO0o0[]) this.f122288OooOO0.getValue(), (InterfaceC33531OooO0o0[]) c33962Oooo.f122288OooOO0.getValue())) {
                    int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
                    int i = this.f122282OooO0OO;
                    if (i == iOooO0o0) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0Oo(i2).OooO0oo(), interfaceC33531OooO0o0.OooO0Oo(i2).OooO0oo()) && kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0Oo(i2).getKind(), interfaceC33531OooO0o0.OooO0Oo(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // oO0oO00.C34001o0ooOO0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // oO0oO00.C34001o0ooOO0, oO0o.InterfaceC33531OooO0o0
    public final boolean isInline() {
        return this.f122180OooOO0o;
    }
}
