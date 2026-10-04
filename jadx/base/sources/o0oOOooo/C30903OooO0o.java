package o0oOOooo;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0oOOooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationViewModel$isBtnConfirmEnable$1", m80623f = "StickerCollectionCreationViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30903OooO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Uri>, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f110454OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f110455OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Uri> list, Boolean bool, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C30903OooO0o c30903OooO0o = new C30903OooO0o(3, continuation);
        c30903OooO0o.f110455OooOo0o = list;
        c30903OooO0o.f110454OooOo = zBooleanValue;
        return c30903OooO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf((this.f110455OooOo0o.isEmpty() || this.f110454OooOo) ? false : true);
    }
}
