package com.orion.notein.p607ui.noteeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0.C28023OooO00o;
import o0OoO0oo.C28854o00OO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$imageEditorListener$1$insertNewImage$1", m80623f = "NoteEditorFragment.kt", m80624l = {5098}, m80625m = "invokeSuspend")
public final class C23340OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73510OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73511OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f73512OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f73513OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f73514OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Bitmap f73515OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RectF f73516OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C28854o00OO00o f73517OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23340OooO0oo(NoteEditorFragment noteEditorFragment, Uri uri, String str, String str2, RectF rectF, Bitmap bitmap, C28854o00OO00o c28854o00OO00o, Continuation continuation) {
        super(2, continuation);
        this.f73510OooOo = noteEditorFragment;
        this.f73513OooOoO0 = uri;
        this.f73512OooOoO = str;
        this.f73514OooOoOO = str2;
        this.f73516OooOoo0 = rectF;
        this.f73515OooOoo = bitmap;
        this.f73517OooOooO = c28854o00OO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28854o00OO00o c28854o00OO00o = this.f73517OooOooO;
        return new C23340OooO0oo(this.f73510OooOo, this.f73513OooOoO0, this.f73512OooOoO, this.f73514OooOoOO, this.f73516OooOoo0, this.f73515OooOoo, c28854o00OO00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23340OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73511OooOo0o;
        NoteEditorFragment noteEditorFragment = this.f73510OooOo;
        Uri uri = this.f73513OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            this.f73511OooOo0o = 1;
            obj = c23344OooOOoOoooOO0.OooOOo(uri, this.f73512OooOoO, this.f73514OooOoOO, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Context contextRequireContext = noteEditorFragment.requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        RectF rectF = this.f73516OooOoo0;
        Bitmap bitmapOooO00o = C28023OooO00o.OooO00o(contextRequireContext, uri, (int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        if (bitmapOooO00o == null) {
            bitmapOooO00o = this.f73515OooOoo;
        }
        this.f73517OooOooO.invoke((String) obj, bitmapOooO00o);
        return C32460OooOooO.f116667OooO00o;
    }
}
