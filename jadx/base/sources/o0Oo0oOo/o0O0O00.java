package o0Oo0oOo;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27304OooOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListViewModel$deleteMaterial$1", m80623f = "DownloadedMaterialListViewModel.kt", m80624l = {161}, m80625m = "invokeSuspend")
public final class o0O0O00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.Oooo0 f100600OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100601OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100602OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(com.orion.notein.p607ui.creative_library.Oooo0 oooo0, String str, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f100600OooOo = oooo0;
        this.f100602OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0O0O00(this.f100600OooOo, this.f100602OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0O0O00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100601OooOo0o;
        String str = this.f100602OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27304OooOo interfaceC27304OooOo = this.f100600OooOo.f71241OooO0Oo;
                this.f100601OooOo0o = 1;
                if (interfaceC27304OooOo.OooO0oo(str, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DownloadedMaterialListVM");
            c20358OooO00o.OooO00o("Material deleted: ".concat(str), new Object[0]);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DownloadedMaterialListVM");
            c20358OooO00o2.OooO0Oo(e, "Failed to delete material: ".concat(str), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
