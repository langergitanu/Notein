package com.orion.notein.p607ui.noteeditor;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.penbar.OooO0O0;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$updateListener$1$onPenLongPressed$1", m80623f = "NoteEditorFragment.kt", m80624l = {522}, m80625m = "invokeSuspend")
public final class C23348OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment.o00oO0O f73638OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73639OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73640OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23348OooOOo0(NoteEditorFragment.o00oO0O o00oo0o, NoteEditorFragment noteEditorFragment, Continuation<? super C23348OooOOo0> continuation) {
        super(2, continuation);
        this.f73638OooOo = o00oo0o;
        this.f73640OooOoO0 = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23348OooOOo0(this.f73638OooOo, this.f73640OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23348OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73639OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorFragment noteEditorFragment = this.f73640OooOoO0;
            Iterator it = ((Iterable) noteEditorFragment.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PenVO) next).getSelected()) {
                    break;
                }
            }
            this.f73638OooOo.f73296OooO00o = (PenVO) next;
            Iterator it2 = ((Iterable) noteEditorFragment.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((PenVO) next2).getType() == 3) {
                    obj2 = next2;
                    break;
                }
            }
            PenVO penVO = (PenVO) obj2;
            if (penVO == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            OooO0O0 oooO0O0OoooOOO = noteEditorFragment.OoooOOO();
            this.f73639OooOo0o = 1;
            if (oooO0O0OoooOOO.OooOOO(penVO, false, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
