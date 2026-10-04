package o0Oo0Ooo;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0Ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$showEmbeddedQr$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {382}, m80625m = "invokeSuspend")
public final class C28144OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f99756OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99757OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f99758OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99759OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28144OooOO0O(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, String str, Continuation continuation) {
        super(2, continuation);
        this.f99759OooOoO0 = str;
        this.f99758OooOoO = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28144OooOO0O c28144OooOO0O = new C28144OooOO0O(this.f99758OooOoO, this.f99759OooOoO0, continuation);
        c28144OooOO0O.f99756OooOo = obj;
        return c28144OooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28144OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        Bitmap bitmap;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99757OooOo0o;
        com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f99758OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f99756OooOo;
            if (this.f99759OooOoO0.length() <= 0) {
                bitmap = null;
                if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (bitmap != null) {
                    ImageView imageView = oooO00o.f71352OooOo0O;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    oooO00o.f71333OooO0OO.OooO0oo();
                } else {
                    ImageView imageView2 = oooO00o.f71352OooOo0O;
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(null);
                    }
                    oooO00o.f71333OooO0OO.OooO0o(false);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            this.f99756OooOo = interfaceC33636Oooo00o;
            this.f99757OooOo0o = 1;
            oooO00o.getClass();
            obj = null;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f99756OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        bitmap = (Bitmap) obj;
        if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
        }
    }
}
