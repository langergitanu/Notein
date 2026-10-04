package o0oOo00;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import kotlin.coroutines.Continuation;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo0o00.ViewOnClickListenerC28151OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOo00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$showDeleteStickerCollectionDialogFragment$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30934OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ViewOnClickListenerC26311Ooooooo f110533OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ StickerCollectionEditFragment f110534OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ViewOnClickListenerC28151OooO0Oo f110535OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30934OooO0oO(StickerCollectionEditFragment stickerCollectionEditFragment, ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo, ViewOnClickListenerC28151OooO0Oo viewOnClickListenerC28151OooO0Oo, Continuation continuation) {
        super(2, continuation);
        this.f110534OooOo0o = stickerCollectionEditFragment;
        this.f110533OooOo = viewOnClickListenerC26311Ooooooo;
        this.f110535OooOoO0 = viewOnClickListenerC28151OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30934OooO0oO(this.f110534OooOo0o, this.f110533OooOo, this.f110535OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30934OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        StickerCollectionEditFragment stickerCollectionEditFragment = this.f110534OooOo0o;
        String string = stickerCollectionEditFragment.getString(R.string.sticker_delete);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = stickerCollectionEditFragment.getString(R.string.sticker_delete_description);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        new TipsDialogFragment(string, string2, this.f110533OooOo, this.f110535OooOoO0, null, stickerCollectionEditFragment.getString(R.string.delete), 1, new Integer(R.color.warning_color), 256).show(stickerCollectionEditFragment.getChildFragmentManager(), "TipsDialogFragment");
        return C32460OooOooO.f116667OooO00o;
    }
}
