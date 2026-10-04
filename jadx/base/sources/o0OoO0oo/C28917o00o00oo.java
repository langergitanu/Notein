package o0OoO0oo;

import com.orion.notein.App;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26531o0000Ooo;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00o00oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$isAutoAddPageMode$2", m80623f = "NoteEditorViewModel.kt", m80624l = {1461}, m80625m = "invokeSuspend")
public final class C28917o00o00oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102452OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102453OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28917o00o00oo(C23344OooOOo c23344OooOOo, Continuation<? super C28917o00o00oo> continuation) {
        super(2, continuation);
        this.f102452OooOo = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28917o00o00oo(this.f102452OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C28917o00o00oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102453OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26577o000oo0O c26577o000oo0O = this.f102452OooOo.f73556OooOOOo;
            AbstractC24338OooO0o0.OooO00o<Boolean> key = App.f69603oo0o0Oo;
            c26577o000oo0O.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            C26531o0000Ooo c26531o0000Ooo = new C26531o0000Ooo(c26577o000oo0O.f91598OooO00o.getData(), key);
            this.f102453OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(c26531o0000Ooo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }
}
