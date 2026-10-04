package o0o00oOo;

import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27600o0ooOO0;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$1", m80623f = "NoteListViewModel.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, StyleIdentifier.BOOK_TITLE}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106883OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106884OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f106883OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo000(this.f106883OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106884OooOo0o;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106883OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27600o0ooOO0 c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
            this.f106884OooOo0o = 1;
            c27600o0ooOO0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOo0o.o0ooOOo(c27600o0ooOO0, null), this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C31040OooOO0o(((Number) it.next()).intValue(), false));
        }
        ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO(new C31040OooOO0o(0, true)), arrayList);
        C33781o00o0O c33781o00o0O = oooO0OO.f77139OooOo0O;
        this.f106884OooOo0o = 2;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayListOooooOO);
    }
}
