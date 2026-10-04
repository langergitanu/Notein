package com.orion.notein.p607ui.noteeditor;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$noteContentModificationEvents$2", m80623f = "NoteEditorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C23344OooOOo.OooO0O0, C32443OooOOO<? extends String, ? extends Long>, Continuation<? super C23344OooOOo.OooO0O0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f73666OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C23344OooOOo.OooO0O0 f73667OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C23344OooOOo.OooO0O0 oooO0O0, C32443OooOOO<? extends String, ? extends Long> c32443OooOOO, Continuation<? super C23344OooOOo.OooO0O0> continuation) {
        OooOo00 oooOo00 = new OooOo00(3, continuation);
        oooOo00.f73667OooOo0o = oooO0O0;
        oooOo00.f73666OooOo = c32443OooOOO;
        return oooOo00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C23344OooOOo.OooO0O0 oooO0O0 = this.f73667OooOo0o;
        C32443OooOOO c32443OooOOO = this.f73666OooOo;
        String str = (String) c32443OooOOO.f116638OooOo0o;
        long jLongValue = ((Number) c32443OooOOO.f116637OooOo).longValue();
        if (OooOOO0.OooO0O0(str, oooO0O0.f73621OooO00o)) {
            return new C23344OooOOo.OooO0O0(str, jLongValue, jLongValue != oooO0O0.f73622OooO0O0);
        }
        return new C23344OooOOo.OooO0O0(str, jLongValue, false);
    }
}
