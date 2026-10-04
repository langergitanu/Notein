package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import kotlin.coroutines.Continuation;
import o0OO0ooO.C26965OooOOO0;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel$searchLibraryMaterials$apiDeferred$1", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {159}, m80625m = "invokeSuspend")
public final class C28355OoooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26965OooOOO0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f100523OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100524OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100525OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28355OoooOoO(C23040OooOOoo c23040OooOOoo, String str, Continuation<? super C28355OoooOoO> continuation) {
        super(2, continuation);
        this.f100523OooOo = c23040OooOOoo;
        this.f100525OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28355OoooOoO(this.f100523OooOo, this.f100525OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26965OooOOO0> continuation) {
        return ((C28355OoooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100524OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = this.f100523OooOo.f71145OooO0o0;
                String str = this.f100525OooOoO0;
                this.f100524OooOo0o = 1;
                obj = interfaceC27310OooOoO0.OooO0O0(str, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return (C26965OooOOO0) obj;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CreativeLibrarySearchVM");
            c20358OooO00o.OooOO0o(e, "API search failed", new Object[0]);
            return null;
        }
    }
}
