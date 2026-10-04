package o0OOoOo;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.LatestOpenedNote;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0Oo.InterfaceC27305OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.latestopenednote.CreateLatestOpenedNoteUseCase$createLatestOpenedNote$2", m80623f = "CreateLatestOpenedNoteUseCase.kt", m80624l = {17, 24}, m80625m = "invokeSuspend")
public final class C27784OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27786OooO0OO f98148OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98149OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98150OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27784OooO00o(C27786OooO0OO c27786OooO0OO, String str, Continuation<? super C27784OooO00o> continuation) {
        super(2, continuation);
        this.f98148OooOo = c27786OooO0OO;
        this.f98150OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27784OooO00o(this.f98148OooOo, this.f98150OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27784OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        if (r10.OooO0OO(r1, r9) == r0) goto L41;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        String str;
        Object next2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98149OooOo0o;
        C27786OooO0OO c27786OooO0OO = this.f98148OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27305OooOo0 interfaceC27305OooOo0 = c27786OooO0OO.f98154OooO00o;
            this.f98149OooOo0o = 1;
            obj = interfaceC27305OooOo0.OooO0Oo(this);
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
        List list = (List) obj;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            next = null;
            str = this.f98150OooOoO0;
            if (!zHasNext) {
                next2 = null;
                break;
            }
            next2 = it.next();
            if (OooOOO0.OooO0O0(((LatestOpenedNote) next2).getNoteId(), str)) {
                break;
            }
        }
        if (next2 != null) {
            return C32460OooOooO.f116667OooO00o;
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int index = ((LatestOpenedNote) next).getIndex();
                do {
                    Object next3 = it2.next();
                    int index2 = ((LatestOpenedNote) next3).getIndex();
                    if (index < index2) {
                        next = next3;
                        index = index2;
                    }
                } while (it2.hasNext());
            }
        }
        LatestOpenedNote latestOpenedNote = (LatestOpenedNote) next;
        LatestOpenedNote latestOpenedNote2 = new LatestOpenedNote(str, latestOpenedNote != null ? latestOpenedNote.getIndex() + 1 : 0);
        InterfaceC27305OooOo0 interfaceC27305OooOo02 = c27786OooO0OO.f98154OooO00o;
        List listOooO0oO = OooOo.OooO0oO(latestOpenedNote2);
        this.f98149OooOo0o = 2;
    }
}
