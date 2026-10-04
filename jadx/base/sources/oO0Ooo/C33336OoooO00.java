package oO0Ooo;

import java.util.ArrayList;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;

/* JADX INFO: renamed from: oO0Ooo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33336OoooO00 extends AbstractC33344OoooOoo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f120597OooO0OO;

    public C33336OoooO00(ArrayList arrayList) {
        this.f120597OooO0OO = arrayList;
    }

    @Override // oO0Ooo.AbstractC33344OoooOoo
    public final InterfaceC33348OooooOO OooO0oO(InterfaceC33342OoooOo0 key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        if (!this.f120597OooO0OO.contains(key)) {
            return null;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = key.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC32598OooO0ooOooO0OO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return o00Oo0.OooOO0O((InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO);
    }
}
