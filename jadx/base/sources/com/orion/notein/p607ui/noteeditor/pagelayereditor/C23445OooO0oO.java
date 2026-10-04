package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import android.graphics.Bitmap;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import kotlin.coroutines.Continuation;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$updateLayerTn$1", m80623f = "PageLayerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23445OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30837OooO00o f74862OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74863OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bitmap f74864OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23445OooO0oO(OooO0OO oooO0OO, C30837OooO00o c30837OooO00o, Bitmap bitmap, Continuation<? super C23445OooO0oO> continuation) {
        super(2, continuation);
        this.f74863OooOo0o = oooO0OO;
        this.f74862OooOo = c30837OooO00o;
        this.f74864OooOoO0 = bitmap;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23445OooO0oO(this.f74863OooOo0o, this.f74862OooOo, this.f74864OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23445OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        OooO0OO oooO0OO = this.f74863OooOo0o;
        oooO0OO.f74779OooOO0o.put(OooO0OO.OooOO0(this.f74862OooOo), new OooO0OO.OooO0Oo(this.f74864OooOoO0, jCurrentTimeMillis));
        Long l = new Long(jCurrentTimeMillis);
        C33781o00o0O c33781o00o0O = oooO0OO.f74781OooOOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, l);
        return C32460OooOooO.f116667OooO00o;
    }
}
