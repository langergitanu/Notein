package com.orion.notein.p607ui.noteeditor.addtext;

import android.content.Context;
import android.net.Uri;
import com.orion.notein.p607ui.noteeditor.addtext.OooO0OO;
import com.orion.notein.richeditor.fonts.FontManager;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OoO0oo.C28692OooO0oo;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontViewModel$importFont$2", m80623f = "ImportFontViewModel.kt", m80624l = {238}, m80625m = "invokeSuspend")
public final class C23379OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super OooO0OO.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74042OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f74043OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f74044OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23379OooO0Oo(OooO0OO oooO0OO, Uri uri, Continuation<? super C23379OooO0Oo> continuation) {
        super(2, continuation);
        this.f74042OooOo = oooO0OO;
        this.f74044OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23379OooO0Oo(this.f74042OooOo, this.f74044OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super OooO0OO.OooO00o> continuation) {
        return ((C23379OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74043OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO0OO oooO0OO = this.f74042OooOo;
        Context context = oooO0OO.f74015OooO0Oo;
        File file = new File(context.getCacheDir(), FontManager.CUSTOM_FONT_DIR);
        C31190OooO0oo.OooO0o(file);
        String strOooO0o0 = C28692OooO0oo.OooO0o0(context, this.f74044OooOoO0, file);
        if (strOooO0o0 == null) {
            return new OooO0OO.OooO00o(1, "");
        }
        this.f74043OooOo0o = 1;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C23380OooO0o0(oooO0OO, strOooO0o0, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
