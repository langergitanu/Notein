package Oooo0O0;

import OooooOO.C21349OooooO0;
import OooooOO.InterfaceC21352Oooooo;
import Oooooo0.C21397OooO00o;
import Oooooo0.InterfaceC21400OooO0Oo;
import Oooooo0.InterfaceC21402OooO0o0;
import o00000o0.EnumC24118OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0O0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20912OooO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21400OooO0Oo, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EnumC24118OooO0oO f60324OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f60325OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21352Oooooo f60326OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f60327OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C21349OooooO0 f60328OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20912OooO0o(boolean z, EnumC24118OooO0oO enumC24118OooO0oO, boolean z2, InterfaceC21352Oooooo interfaceC21352Oooooo, C21349OooooO0 c21349OooooO0) {
        super(1);
        this.f60325OooOo0o = z;
        this.f60324OooOo = enumC24118OooO0oO;
        this.f60327OooOoO0 = z2;
        this.f60326OooOoO = interfaceC21352Oooooo;
        this.f60328OooOoOO = c21349OooooO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO invoke(InterfaceC21400OooO0Oo interfaceC21400OooO0Oo) {
        InterfaceC21400OooO0Oo onDrawWithContent = interfaceC21400OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.Ooooo0o();
        EnumC24118OooO0oO enumC24118OooO0oO = EnumC24118OooO0oO.f81271OooOo;
        EnumC24118OooO0oO enumC24118OooO0oO2 = EnumC24118OooO0oO.f81272OooOo0o;
        InterfaceC21352Oooooo interfaceC21352Oooooo = this.f60326OooOoO;
        C21349OooooO0 c21349OooooO0 = this.f60328OooOoOO;
        EnumC24118OooO0oO direction = this.f60324OooOo;
        boolean z = this.f60327OooOoO0;
        if (this.f60325OooOo0o) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(direction, "direction");
            if ((direction != enumC24118OooO0oO2 || z) && !(direction == enumC24118OooO0oO && z)) {
                InterfaceC21402OooO0o0.o00oO0o(onDrawWithContent, interfaceC21352Oooooo, c21349OooooO0);
            } else {
                long jOoooOoo = onDrawWithContent.OoooOoo();
                C21397OooO00o.OooO0O0 oooO0O0OoooOo0 = onDrawWithContent.OoooOo0();
                long jOooO0O0 = oooO0O0OoooOo0.OooO0O0();
                oooO0O0OoooOo0.OooO00o().OooOOo0();
                oooO0O0OoooOo0.f61919OooO00o.OooO0OO(jOoooOoo);
                InterfaceC21402OooO0o0.o00oO0o(onDrawWithContent, interfaceC21352Oooooo, c21349OooooO0);
                oooO0O0OoooOo0.OooO00o().OooOO0o();
                oooO0O0OoooOo0.OooO0OO(jOooO0O0);
            }
        } else {
            kotlin.jvm.internal.OooOOO0.OooO0oO(direction, "direction");
            if ((direction != enumC24118OooO0oO2 || z) && (direction != enumC24118OooO0oO || !z)) {
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
