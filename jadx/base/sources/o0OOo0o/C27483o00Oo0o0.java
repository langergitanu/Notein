package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import java.io.Serializable;
import oO00ooO.C32443OooOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00Oo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {136, 137, 141, 143, 151, 152}, m80625m = "updateNoteMetaTnPath")
public final class C27483o00Oo0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Serializable f96305OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27449o00O0OoO f96306OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Page f96307OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f96308OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C32443OooOOO f96309OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f96310OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f96311OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96312OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f96313OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27483o00Oo0o0(C27449o00O0OoO c27449o00O0OoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96312OooOooO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96310OooOoo = obj;
        this.f96313OooOooo |= Integer.MIN_VALUE;
        return this.f96312OooOooO.OoooOoO(null, false, this);
    }
}
