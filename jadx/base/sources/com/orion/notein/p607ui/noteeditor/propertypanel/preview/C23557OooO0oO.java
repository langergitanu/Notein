package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.NoteTnNavigatorView$setTnNavigatorInfo$bitmap$1", m80623f = "NoteTnNavigatorView.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23557OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f76122OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23557OooO0oO(OooO0OO.OooO0O0 oooO0O0, Continuation<? super C23557OooO0oO> continuation) {
        super(2, continuation);
        this.f76122OooOo0o = oooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23557OooO0oO(this.f76122OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Bitmap> continuation) {
        return ((C23557OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return BitmapFactory.decodeFile(this.f76122OooOo0o.f76099OooO0O0);
    }
}
