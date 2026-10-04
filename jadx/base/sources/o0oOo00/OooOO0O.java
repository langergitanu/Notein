package o0oOo00;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$isConfirmUpdateBtnEnable$1", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32509OooOOo<Boolean, List<? extends Uri>, String, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f110540OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f110541OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f110542OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(Boolean bool, List<? extends Uri> list, String str, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        OooOO0O oooOO0O = new OooOO0O(4, continuation);
        oooOO0O.f110541OooOo0o = zBooleanValue;
        oooOO0O.f110540OooOo = list;
        oooOO0O.f110542OooOoO0 = str;
        return oooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf((this.f110541OooOo0o || this.f110540OooOo.isEmpty() || C33599OooOo0O.Oooooo0(this.f110542OooOoO0).toString().length() <= 0) ? false : true);
    }
}
