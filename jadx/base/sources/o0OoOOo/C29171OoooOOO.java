package o0OoOOo;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0OoOOo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$toggleAudioFileSelection$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29171OoooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f103438OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103439OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29171OoooOOO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, Continuation<? super C29171OoooOOO> continuation) {
        super(2, continuation);
        this.f103439OooOo0o = oooO0o;
        this.f103438OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29171OoooOOO(this.f103439OooOo0o, this.f103438OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29171OoooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103439OooOo0o;
        Set set = (Set) oooO0o.f74247OooOooO.getValue();
        String str = this.f103438OooOo;
        boolean zContains = set.contains(str);
        C33781o00o0O c33781o00o0O = oooO0o.f74247OooOooO;
        if (zContains) {
            LinkedHashSet linkedHashSetOooO0o = C34449Oooo0oo.OooO0o(set, str);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, linkedHashSetOooO0o);
        } else {
            LinkedHashSet linkedHashSetOooO = C34449Oooo0oo.OooO(set, str);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, linkedHashSetOooO);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
