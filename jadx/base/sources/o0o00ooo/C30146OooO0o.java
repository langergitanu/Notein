package o0o00ooo;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import kotlin.coroutines.Continuation;
import o0o0O00.C30207OooOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o00ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$initFab$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {487}, m80625m = "invokeSuspend")
public final class C30146OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FavoriteContainerFragment f107294OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107295OooOo0o;

    /* JADX INFO: renamed from: o0o00ooo.OooO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ FavoriteContainerFragment f107296OooOo0o;

        public OooO00o(FavoriteContainerFragment favoriteContainerFragment) {
            this.f107296OooOo0o = favoriteContainerFragment;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            int iIntValue = ((Number) obj).intValue();
            FavoriteContainerFragment favoriteContainerFragment = this.f107296OooOo0o;
            C30207OooOo c30207OooOo = favoriteContainerFragment.f77474Oooo000;
            if (c30207OooOo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
                throw null;
            }
            c30207OooOo.OooO0OO(R.id.fab_add, iIntValue == 0);
            C30207OooOo c30207OooOo2 = favoriteContainerFragment.f77474Oooo000;
            if (c30207OooOo2 != null) {
                c30207OooOo2.OooO0OO(R.id.fab_create_scratch, iIntValue == 0);
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("fabInitializer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30146OooO0o(FavoriteContainerFragment favoriteContainerFragment, Continuation<? super C30146OooO0o> continuation) {
        super(2, continuation);
        this.f107294OooOo = favoriteContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30146OooO0o(this.f107294OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C30146OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107295OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw androidx.transition.OooOOOO.OooO0O0(obj);
        }
        C32446OooOOOo.OooO0O0(obj);
        FavoriteContainerFragment favoriteContainerFragment = this.f107294OooOo;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
        OooO00o oooO00o = new OooO00o(favoriteContainerFragment);
        this.f107295OooOo0o = 1;
        oooO0OOOooOoo0.f77147OooOooo.collect(oooO00o, this);
        return enumC32485OooO00o;
    }
}
