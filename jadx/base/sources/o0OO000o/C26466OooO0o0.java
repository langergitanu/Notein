package o0OO000o;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO000o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.db.NoteContentDatabaseProvider$handleWithNoteContentDatabase$1", m80623f = "NoteContentDatabaseProvider.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26466OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<Object>, Throwable, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f90931OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26454OooO0Oo f90932OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26466OooO0o0(C26454OooO0Oo c26454OooO0Oo, String str, Continuation<? super C26466OooO0o0> continuation) {
        super(3, continuation);
        this.f90932OooOo0o = c26454OooO0Oo;
        this.f90931OooOo = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Throwable th, Continuation<? super C32460OooOooO> continuation) {
        return new C26466OooO0o0(this.f90932OooOo0o, this.f90931OooOo, continuation).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C26454OooO0Oo.OooO00o(this.f90932OooOo0o, this.f90931OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
