package com.orion.notein.p607ui.notelist.favorite;

import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteContainerFragment$whenFileBePassedToNotein$1", m80623f = "FavoriteContainerFragment.kt", m80624l = {195}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FavoriteContainerFragment f77593OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f77594OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f77595OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(FavoriteContainerFragment favoriteContainerFragment, Uri uri, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f77593OooOo = favoriteContainerFragment;
        this.f77595OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f77593OooOo, this.f77595OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f77594OooOo0o;
        FavoriteContainerFragment favoriteContainerFragment = this.f77593OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f77594OooOo0o = 1;
            obj = FavoriteContainerFragment.OooOoOO(favoriteContainerFragment, 37, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(favoriteContainerFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        Uri uri = this.f77595OooOoO0;
        if (iCheckSelfPermission == 0) {
            favoriteContainerFragment.OooOoo0().OooOOO(uri);
        } else {
            FavoriteContainerFragment.OooO00o oooO00o = favoriteContainerFragment.f77482Oooo0oo;
            oooO00o.getClass();
            oooO00o.f77484OooO00o = uri;
            oooO00o.f77485OooO0O0.OooO00o("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
