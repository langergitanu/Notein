package com.orion.notein.p607ui.notelist;

import com.orion.notein.p607ui.notelist.OooO0OO;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$noteList$1", m80623f = "NoteListViewModel.kt", m80624l = {699}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<OooO0OO.C19405OooO0OO, OooO0OO.C23632OooO0o0, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ OooO0OO.C19405OooO0OO f77271OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f77272OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f77273OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ OooO0OO.C23632OooO0o0 f77274OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO0OO oooO0OO, Continuation<? super OooOO0> continuation) {
        super(3, continuation);
        this.f77273OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(OooO0OO.C19405OooO0OO c19405OooO0OO, OooO0OO.C23632OooO0o0 c23632OooO0o0, Continuation<? super List<? extends NoteVO>> continuation) {
        OooOO0 oooOO02 = new OooOO0(this.f77273OooOoO, continuation);
        oooOO02.f77271OooOo = c19405OooO0OO;
        oooOO02.f77274OooOoO0 = c23632OooO0o0;
        return oooOO02.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f77272OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0(this.f77271OooOo, this.f77274OooOoO0);
        this.f77271OooOo = null;
        this.f77272OooOo0o = 1;
        Object objOooO = this.f77273OooOoO.OooO(oooO0O0, this);
        return objOooO == enumC32485OooO00o ? enumC32485OooO00o : objOooO;
    }
}
