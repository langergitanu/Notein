package o0Oo0oOo;

import com.orion.notein.domain.models.material.Material;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import java.util.List;
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
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0Oo0oOo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel$searchLibraryMaterials$localDeferred$1", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {150}, m80625m = "invokeSuspend")
public final class C28356OoooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Material>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f100526OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100527OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100528OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28356OoooOoo(C23040OooOOoo c23040OooOOoo, String str, Continuation<? super C28356OoooOoo> continuation) {
        super(2, continuation);
        this.f100526OooOo = c23040OooOOoo;
        this.f100528OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28356OoooOoo(this.f100526OooOo, this.f100528OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Material>> continuation) {
        return ((C28356OoooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100527OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27304OooOo interfaceC27304OooOo = this.f100526OooOo.f71143OooO0Oo;
                String str = this.f100528OooOoO0;
                this.f100527OooOo0o = 1;
                obj = interfaceC27304OooOo.OooO0O0(str, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return (List) obj;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CreativeLibrarySearchVM");
            c20358OooO00o.OooOO0o(e, "Local search failed", new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
    }
}
